/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupObject extends AbstractModel {

    /**
    * 备份对象类型，可能的取值为:
"all" - 整实例;
"partial" - 部分对象。
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * 备份对象详情，当 ObjectMode 为 partial, 即选择部分对象备份时，该字段不能为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectItems")
    @Expose
    private BackupObjectItem [] ObjectItems;

    /**
     * Get 备份对象类型，可能的取值为:
"all" - 整实例;
"partial" - 部分对象。 
     * @return ObjectMode 备份对象类型，可能的取值为:
"all" - 整实例;
"partial" - 部分对象。
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set 备份对象类型，可能的取值为:
"all" - 整实例;
"partial" - 部分对象。
     * @param ObjectMode 备份对象类型，可能的取值为:
"all" - 整实例;
"partial" - 部分对象。
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get 备份对象详情，当 ObjectMode 为 partial, 即选择部分对象备份时，该字段不能为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectItems 备份对象详情，当 ObjectMode 为 partial, 即选择部分对象备份时，该字段不能为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupObjectItem [] getObjectItems() {
        return this.ObjectItems;
    }

    /**
     * Set 备份对象详情，当 ObjectMode 为 partial, 即选择部分对象备份时，该字段不能为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectItems 备份对象详情，当 ObjectMode 为 partial, 即选择部分对象备份时，该字段不能为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectItems(BackupObjectItem [] ObjectItems) {
        this.ObjectItems = ObjectItems;
    }

    public BackupObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupObject(BackupObject source) {
        if (source.ObjectMode != null) {
            this.ObjectMode = new String(source.ObjectMode);
        }
        if (source.ObjectItems != null) {
            this.ObjectItems = new BackupObjectItem[source.ObjectItems.length];
            for (int i = 0; i < source.ObjectItems.length; i++) {
                this.ObjectItems[i] = new BackupObjectItem(source.ObjectItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamArrayObj(map, prefix + "ObjectItems.", this.ObjectItems);

    }
}

