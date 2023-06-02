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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowDetailInfo extends AbstractModel{

    /**
    * 合同(流程)的ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同(流程)的名字
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同(流程)的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 流程状态
- 0 还没有发起
- 1 待签署
- 2 部分签署
- 3 已拒签
- 4 已签署
- 5 已过期
- 6 已撤销
- 7 还没有预发起
- 8 等待填写
- 9 部分填写
- 10 拒填
- 21 已解除
    */
    @SerializedName("FlowStatus")
    @Expose
    private Long FlowStatus;

    /**
    * 合同(流程)的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    * 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同(流程)的创建时间戳，单位秒
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 合同(流程)的签署方数组
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverDetail [] FlowApproverInfos;

    /**
    * 合同(流程)的关注方信息列表
    */
    @SerializedName("CcInfos")
    @Expose
    private FlowApproverDetail [] CcInfos;

    /**
    * 合同发起人UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get 合同(流程)的ID 
     * @return FlowId 合同(流程)的ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同(流程)的ID
     * @param FlowId 合同(流程)的ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同(流程)的名字 
     * @return FlowName 合同(流程)的名字
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同(流程)的名字
     * @param FlowName 合同(流程)的名字
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同(流程)的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowType 合同(流程)的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同(流程)的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowType 合同(流程)的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 流程状态
- 0 还没有发起
- 1 待签署
- 2 部分签署
- 3 已拒签
- 4 已签署
- 5 已过期
- 6 已撤销
- 7 还没有预发起
- 8 等待填写
- 9 部分填写
- 10 拒填
- 21 已解除 
     * @return FlowStatus 流程状态
- 0 还没有发起
- 1 待签署
- 2 部分签署
- 3 已拒签
- 4 已签署
- 5 已过期
- 6 已撤销
- 7 还没有预发起
- 8 等待填写
- 9 部分填写
- 10 拒填
- 21 已解除
     */
    public Long getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 流程状态
- 0 还没有发起
- 1 待签署
- 2 部分签署
- 3 已拒签
- 4 已签署
- 5 已过期
- 6 已撤销
- 7 还没有预发起
- 8 等待填写
- 9 部分填写
- 10 拒填
- 21 已解除
     * @param FlowStatus 流程状态
- 0 还没有发起
- 1 待签署
- 2 部分签署
- 3 已拒签
- 4 已签署
- 5 已过期
- 6 已撤销
- 7 还没有预发起
- 8 等待填写
- 9 部分填写
- 10 拒填
- 21 已解除
     */
    public void setFlowStatus(Long FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 合同(流程)的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowMessage 合同(流程)的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 合同(流程)的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowMessage 合同(流程)的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get 流程的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowDescription 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowDescription 流程的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同(流程)的创建时间戳，单位秒 
     * @return CreatedOn 合同(流程)的创建时间戳，单位秒
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 合同(流程)的创建时间戳，单位秒
     * @param CreatedOn 合同(流程)的创建时间戳，单位秒
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 合同(流程)的签署方数组 
     * @return FlowApproverInfos 合同(流程)的签署方数组
     */
    public FlowApproverDetail [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set 合同(流程)的签署方数组
     * @param FlowApproverInfos 合同(流程)的签署方数组
     */
    public void setFlowApproverInfos(FlowApproverDetail [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get 合同(流程)的关注方信息列表 
     * @return CcInfos 合同(流程)的关注方信息列表
     */
    public FlowApproverDetail [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 合同(流程)的关注方信息列表
     * @param CcInfos 合同(流程)的关注方信息列表
     */
    public void setCcInfos(FlowApproverDetail [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 合同发起人UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 合同发起人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 合同发起人UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 合同发起人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public FlowDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowDetailInfo(FlowDetailInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new Long(source.FlowStatus);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.FlowApproverInfos != null) {
            this.FlowApproverInfos = new FlowApproverDetail[source.FlowApproverInfos.length];
            for (int i = 0; i < source.FlowApproverInfos.length; i++) {
                this.FlowApproverInfos[i] = new FlowApproverDetail(source.FlowApproverInfos[i]);
            }
        }
        if (source.CcInfos != null) {
            this.CcInfos = new FlowApproverDetail[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new FlowApproverDetail(source.CcInfos[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "FlowMessage", this.FlowMessage);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

