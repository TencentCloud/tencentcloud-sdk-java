/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseTableObject extends AbstractModel{

    /**
    * 迁移对象类型 all(全实例)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectMode")
    @Expose
    private String ObjectMode;

    /**
    * 迁移对象，当 ObjectMode 为 partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Databases")
    @Expose
    private DBItem [] Databases;

    /**
    * 高级对象类型，如trigger、function、procedure、event
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedObjects")
    @Expose
    private String [] AdvancedObjects;

    /**
     * Get 迁移对象类型 all(全实例)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectMode 迁移对象类型 all(全实例)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectMode() {
        return this.ObjectMode;
    }

    /**
     * Set 迁移对象类型 all(全实例)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectMode 迁移对象类型 all(全实例)，partial(部分对象)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectMode(String ObjectMode) {
        this.ObjectMode = ObjectMode;
    }

    /**
     * Get 迁移对象，当 ObjectMode 为 partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Databases 迁移对象，当 ObjectMode 为 partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBItem [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set 迁移对象，当 ObjectMode 为 partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Databases 迁移对象，当 ObjectMode 为 partial 时，不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabases(DBItem [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get 高级对象类型，如trigger、function、procedure、event
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedObjects 高级对象类型，如trigger、function、procedure、event
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAdvancedObjects() {
        return this.AdvancedObjects;
    }

    /**
     * Set 高级对象类型，如trigger、function、procedure、event
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedObjects 高级对象类型，如trigger、function、procedure、event
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedObjects(String [] AdvancedObjects) {
        this.AdvancedObjects = AdvancedObjects;
    }

    public DatabaseTableObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseTableObject(DatabaseTableObject source) {
        if (source.ObjectMode != null) {
            this.ObjectMode = new String(source.ObjectMode);
        }
        if (source.Databases != null) {
            this.Databases = new DBItem[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new DBItem(source.Databases[i]);
            }
        }
        if (source.AdvancedObjects != null) {
            this.AdvancedObjects = new String[source.AdvancedObjects.length];
            for (int i = 0; i < source.AdvancedObjects.length; i++) {
                this.AdvancedObjects[i] = new String(source.AdvancedObjects[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectMode", this.ObjectMode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArraySimple(map, prefix + "AdvancedObjects.", this.AdvancedObjects);

    }
}

