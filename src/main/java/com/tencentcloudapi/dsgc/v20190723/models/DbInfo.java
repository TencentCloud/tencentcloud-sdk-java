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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbInfo extends AbstractModel{

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 绑定的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidStatus")
    @Expose
    private String ValidStatus;

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 绑定的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidStatus 绑定的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidStatus() {
        return this.ValidStatus;
    }

    /**
     * Set 绑定的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidStatus 绑定的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidStatus(String ValidStatus) {
        this.ValidStatus = ValidStatus;
    }

    public DbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbInfo(DbInfo source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.ValidStatus != null) {
            this.ValidStatus = new String(source.ValidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "ValidStatus", this.ValidStatus);

    }
}

