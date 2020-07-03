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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceResponse extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 订单号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 客户端Token。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 扩容流程ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * 大订单号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 订单号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealNames 订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealNames 订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get 客户端Token。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientToken 客户端Token。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientToken 客户端Token。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 扩容流程ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 扩容流程ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 扩容流程ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 扩容流程ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 大订单号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillId 大订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set 大订单号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillId 大订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

