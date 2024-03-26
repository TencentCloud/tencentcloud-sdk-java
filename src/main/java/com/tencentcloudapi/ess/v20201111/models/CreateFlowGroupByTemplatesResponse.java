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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowGroupByTemplatesResponse extends AbstractModel {

    /**
    * 合同(流程)组的合同组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 合同(流程)组中子合同列表.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 合同组签署人信息。
    */
    @SerializedName("Approvers")
    @Expose
    private FlowGroupApprovers [] Approvers;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合同(流程)组的合同组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowGroupId 合同(流程)组的合同组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同(流程)组的合同组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowGroupId 合同(流程)组的合同组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 合同(流程)组中子合同列表.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowIds 合同(流程)组中子合同列表.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 合同(流程)组中子合同列表.
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowIds 合同(流程)组中子合同列表.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 合同组签署人信息。 
     * @return Approvers 合同组签署人信息。
     */
    public FlowGroupApprovers [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 合同组签署人信息。
     * @param Approvers 合同组签署人信息。
     */
    public void setApprovers(FlowGroupApprovers [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateFlowGroupByTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowGroupByTemplatesResponse(CreateFlowGroupByTemplatesResponse source) {
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowGroupApprovers[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowGroupApprovers(source.Approvers[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

