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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstanceInfo extends AbstractModel {

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 数据源绑定的db信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbInfos")
    @Expose
    private DbInfo [] DbInfos;

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 数据源绑定的db信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbInfos 数据源绑定的db信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DbInfo [] getDbInfos() {
        return this.DbInfos;
    }

    /**
     * Set 数据源绑定的db信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbInfos 数据源绑定的db信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbInfos(DbInfo [] DbInfos) {
        this.DbInfos = DbInfos;
    }

    public DBInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstanceInfo(DBInstanceInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.DbInfos != null) {
            this.DbInfos = new DbInfo[source.DbInfos.length];
            for (int i = 0; i < source.DbInfos.length; i++) {
                this.DbInfos[i] = new DbInfo(source.DbInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "DbInfos.", this.DbInfos);

    }
}

