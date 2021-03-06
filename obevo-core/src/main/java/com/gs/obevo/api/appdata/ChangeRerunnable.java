/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.gs.obevo.api.appdata;

import com.gs.obevo.api.platform.ChangeType;

public class ChangeRerunnable extends Change {
    public ChangeRerunnable() {
    }

    public ChangeRerunnable(ChangeType changeType, String schema, String objectName, String hash, String content) {
        this(new ChangeKey(new ObjectKey(schema, objectName, changeType), "n/a"), hash, content);
    }

    public ChangeRerunnable(ChangeType changeType, String schema, String objectName, String changeName, String hash, String content) {
        this(new ChangeKey(new ObjectKey(schema, objectName, changeType), changeName), hash, content);
    }

    public ChangeRerunnable(ChangeKey changeKey, String hash, String content) {
        this.setChangeKey(changeKey);
        this.setContentHash(hash);
        this.setContent(content);
    }
}
