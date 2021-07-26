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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePreData extends AbstractModel{

    /**
    * CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 订单号列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 实例Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 订单号列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealNames 订单号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单号列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealNames 订单号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get 实例Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public CreateInstancePreData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreData(CreateInstancePreData source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

