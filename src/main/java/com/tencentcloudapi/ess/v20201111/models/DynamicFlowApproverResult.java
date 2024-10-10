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

public class DynamicFlowApproverResult extends AbstractModel {

    /**
    * 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署方唯一编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 签署方当前状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverStatus")
    @Expose
    private Long ApproverStatus;

    /**
     * Get 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecipientId 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecipientId 签署方角色编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署方唯一编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignId 签署方唯一编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署方唯一编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignId 签署方唯一编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签署方当前状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverStatus 签署方当前状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproverStatus() {
        return this.ApproverStatus;
    }

    /**
     * Set 签署方当前状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverStatus 签署方当前状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverStatus(Long ApproverStatus) {
        this.ApproverStatus = ApproverStatus;
    }

    public DynamicFlowApproverResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicFlowApproverResult(DynamicFlowApproverResult source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ApproverStatus != null) {
            this.ApproverStatus = new Long(source.ApproverStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ApproverStatus", this.ApproverStatus);

    }
}

