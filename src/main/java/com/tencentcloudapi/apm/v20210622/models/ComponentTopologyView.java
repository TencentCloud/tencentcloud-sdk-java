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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentTopologyView extends AbstractModel {

    /**
    * 服务纬度的节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private Long Service;

    /**
    * 数据库节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Database")
    @Expose
    private Long Database;

    /**
    * 消息队列节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MQ")
    @Expose
    private Long MQ;

    /**
     * Get 服务纬度的节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 服务纬度的节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getService() {
        return this.Service;
    }

    /**
     * Set 服务纬度的节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 服务纬度的节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(Long Service) {
        this.Service = Service;
    }

    /**
     * Get 数据库节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Database 数据库节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Database 数据库节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabase(Long Database) {
        this.Database = Database;
    }

    /**
     * Get 消息队列节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MQ 消息队列节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMQ() {
        return this.MQ;
    }

    /**
     * Set 消息队列节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MQ 消息队列节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMQ(Long MQ) {
        this.MQ = MQ;
    }

    public ComponentTopologyView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentTopologyView(ComponentTopologyView source) {
        if (source.Service != null) {
            this.Service = new Long(source.Service);
        }
        if (source.Database != null) {
            this.Database = new Long(source.Database);
        }
        if (source.MQ != null) {
            this.MQ = new Long(source.MQ);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "MQ", this.MQ);

    }
}

