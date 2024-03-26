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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowGroupApprovers extends AbstractModel {

    /**
    * 合同流程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署方信息，包含合同ID和角色ID用于定位RecipientId。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverItem [] Approvers;

    /**
     * Get 合同流程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 合同流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 合同流程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署方信息，包含合同ID和角色ID用于定位RecipientId。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Approvers 签署方信息，包含合同ID和角色ID用于定位RecipientId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApproverItem [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署方信息，包含合同ID和角色ID用于定位RecipientId。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Approvers 签署方信息，包含合同ID和角色ID用于定位RecipientId。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovers(ApproverItem [] Approvers) {
        this.Approvers = Approvers;
    }

    public FlowGroupApprovers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupApprovers(FlowGroupApprovers source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverItem[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverItem(source.Approvers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);

    }
}

