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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateObject extends AbstractModel {

    /**
    * 数据库迁移模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateDBMode")
    @Expose
    private String MigrateDBMode;

    /**
    * 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Databases")
    @Expose
    private MigrateDBItem [] Databases;

    /**
     * Get 数据库迁移模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateDBMode 数据库迁移模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMigrateDBMode() {
        return this.MigrateDBMode;
    }

    /**
     * Set 数据库迁移模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateDBMode 数据库迁移模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateDBMode(String MigrateDBMode) {
        this.MigrateDBMode = MigrateDBMode;
    }

    /**
     * Get 数据库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Databases 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MigrateDBItem [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Databases 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabases(MigrateDBItem [] Databases) {
        this.Databases = Databases;
    }

    public MigrateObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateObject(MigrateObject source) {
        if (source.MigrateDBMode != null) {
            this.MigrateDBMode = new String(source.MigrateDBMode);
        }
        if (source.Databases != null) {
            this.Databases = new MigrateDBItem[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new MigrateDBItem(source.Databases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateDBMode", this.MigrateDBMode);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);

    }
}

