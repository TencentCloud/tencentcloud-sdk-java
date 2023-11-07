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

public class FlowDetailInfo extends AbstractModel {

    /**
    * 合同流程ID，为32位字符串。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同流程的类别分类（如销售合同/入职合同等）。
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **INIT** :合同创建</li>
<li> **PART** :合同签署中(至少有一个签署方已经签署)</li>
<li> **REJECT** :合同拒签</li>
<li> **ALL** :合同签署完成</li>
<li> **DEADLINE** :合同流签(合同过期)</li>
<li> **CANCEL** :合同撤回</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
 
    */
    @SerializedName("FlowStatus")
    @Expose
    private String FlowStatus;

    /**
    * 当合同流程状态为已拒签（即 FlowStatus=REJECT）或已撤销（即 FlowStatus=CANCEL ）时，此字段 FlowMessage 为拒签或撤销原因。
    */
    @SerializedName("FlowMessage")
    @Expose
    private String FlowMessage;

    /**
    * 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。
    */
    @SerializedName("CreateOn")
    @Expose
    private Long CreateOn;

    /**
    * 签署流程的签署截止时间, 值为unix时间戳, 精确到秒。
    */
    @SerializedName("DeadLine")
    @Expose
    private Long DeadLine;

    /**
    * 调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 1000长度。
在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。
    */
    @SerializedName("CustomData")
    @Expose
    private String CustomData;

    /**
    * 合同流程的签署方数组
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverDetail [] FlowApproverInfos;

    /**
    * 合同流程的关注方信息数组
    */
    @SerializedName("CcInfos")
    @Expose
    private FlowApproverDetail [] CcInfos;

    /**
    * 是否需要发起前审批
<ul><li>当NeedCreateReview为true，表明当前流程是需要发起前审核的合同，可能无法进行查看，签署操作，需要等审核完成后，才可以继续后续流程</li>
<li>当NeedCreateReview为false，不需要发起前审核的合同</li></ul>
    */
    @SerializedName("NeedCreateReview")
    @Expose
    private Boolean NeedCreateReview;

    /**
     * Get 合同流程ID，为32位字符串。 
     * @return FlowId 合同流程ID，为32位字符串。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
     * @param FlowId 合同流程ID，为32位字符串。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。 
     * @return FlowName 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     * @param FlowName 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同流程的类别分类（如销售合同/入职合同等）。 
     * @return FlowType 合同流程的类别分类（如销售合同/入职合同等）。
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同流程的类别分类（如销售合同/入职合同等）。
     * @param FlowType 合同流程的类别分类（如销售合同/入职合同等）。
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **INIT** :合同创建</li>
<li> **PART** :合同签署中(至少有一个签署方已经签署)</li>
<li> **REJECT** :合同拒签</li>
<li> **ALL** :合同签署完成</li>
<li> **DEADLINE** :合同流签(合同过期)</li>
<li> **CANCEL** :合同撤回</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
  
     * @return FlowStatus 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **INIT** :合同创建</li>
<li> **PART** :合同签署中(至少有一个签署方已经签署)</li>
<li> **REJECT** :合同拒签</li>
<li> **ALL** :合同签署完成</li>
<li> **DEADLINE** :合同流签(合同过期)</li>
<li> **CANCEL** :合同撤回</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
 
     */
    public String getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **INIT** :合同创建</li>
<li> **PART** :合同签署中(至少有一个签署方已经签署)</li>
<li> **REJECT** :合同拒签</li>
<li> **ALL** :合同签署完成</li>
<li> **DEADLINE** :合同流签(合同过期)</li>
<li> **CANCEL** :合同撤回</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
 
     * @param FlowStatus 合同流程当前的签署状态, 会存在下列的状态值
<ul><li> **INIT** :合同创建</li>
<li> **PART** :合同签署中(至少有一个签署方已经签署)</li>
<li> **REJECT** :合同拒签</li>
<li> **ALL** :合同签署完成</li>
<li> **DEADLINE** :合同流签(合同过期)</li>
<li> **CANCEL** :合同撤回</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
 
     */
    public void setFlowStatus(String FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 当合同流程状态为已拒签（即 FlowStatus=REJECT）或已撤销（即 FlowStatus=CANCEL ）时，此字段 FlowMessage 为拒签或撤销原因。 
     * @return FlowMessage 当合同流程状态为已拒签（即 FlowStatus=REJECT）或已撤销（即 FlowStatus=CANCEL ）时，此字段 FlowMessage 为拒签或撤销原因。
     */
    public String getFlowMessage() {
        return this.FlowMessage;
    }

    /**
     * Set 当合同流程状态为已拒签（即 FlowStatus=REJECT）或已撤销（即 FlowStatus=CANCEL ）时，此字段 FlowMessage 为拒签或撤销原因。
     * @param FlowMessage 当合同流程状态为已拒签（即 FlowStatus=REJECT）或已撤销（即 FlowStatus=CANCEL ）时，此字段 FlowMessage 为拒签或撤销原因。
     */
    public void setFlowMessage(String FlowMessage) {
        this.FlowMessage = FlowMessage;
    }

    /**
     * Get 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。 
     * @return CreateOn 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。
     */
    public Long getCreateOn() {
        return this.CreateOn;
    }

    /**
     * Set 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。
     * @param CreateOn 合同流程的创建时间戳，格式为Unix标准时间戳（秒）。
     */
    public void setCreateOn(Long CreateOn) {
        this.CreateOn = CreateOn;
    }

    /**
     * Get 签署流程的签署截止时间, 值为unix时间戳, 精确到秒。 
     * @return DeadLine 签署流程的签署截止时间, 值为unix时间戳, 精确到秒。
     */
    public Long getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set 签署流程的签署截止时间, 值为unix时间戳, 精确到秒。
     * @param DeadLine 签署流程的签署截止时间, 值为unix时间戳, 精确到秒。
     */
    public void setDeadLine(Long DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get 调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 1000长度。
在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。 
     * @return CustomData 调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 1000长度。
在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。
     */
    public String getCustomData() {
        return this.CustomData;
    }

    /**
     * Set 调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 1000长度。
在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。
     * @param CustomData 调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 1000长度。
在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。
     */
    public void setCustomData(String CustomData) {
        this.CustomData = CustomData;
    }

    /**
     * Get 合同流程的签署方数组 
     * @return FlowApproverInfos 合同流程的签署方数组
     */
    public FlowApproverDetail [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set 合同流程的签署方数组
     * @param FlowApproverInfos 合同流程的签署方数组
     */
    public void setFlowApproverInfos(FlowApproverDetail [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get 合同流程的关注方信息数组 
     * @return CcInfos 合同流程的关注方信息数组
     */
    public FlowApproverDetail [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 合同流程的关注方信息数组
     * @param CcInfos 合同流程的关注方信息数组
     */
    public void setCcInfos(FlowApproverDetail [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 是否需要发起前审批
<ul><li>当NeedCreateReview为true，表明当前流程是需要发起前审核的合同，可能无法进行查看，签署操作，需要等审核完成后，才可以继续后续流程</li>
<li>当NeedCreateReview为false，不需要发起前审核的合同</li></ul> 
     * @return NeedCreateReview 是否需要发起前审批
<ul><li>当NeedCreateReview为true，表明当前流程是需要发起前审核的合同，可能无法进行查看，签署操作，需要等审核完成后，才可以继续后续流程</li>
<li>当NeedCreateReview为false，不需要发起前审核的合同</li></ul>
     */
    public Boolean getNeedCreateReview() {
        return this.NeedCreateReview;
    }

    /**
     * Set 是否需要发起前审批
<ul><li>当NeedCreateReview为true，表明当前流程是需要发起前审核的合同，可能无法进行查看，签署操作，需要等审核完成后，才可以继续后续流程</li>
<li>当NeedCreateReview为false，不需要发起前审核的合同</li></ul>
     * @param NeedCreateReview 是否需要发起前审批
<ul><li>当NeedCreateReview为true，表明当前流程是需要发起前审核的合同，可能无法进行查看，签署操作，需要等审核完成后，才可以继续后续流程</li>
<li>当NeedCreateReview为false，不需要发起前审核的合同</li></ul>
     */
    public void setNeedCreateReview(Boolean NeedCreateReview) {
        this.NeedCreateReview = NeedCreateReview;
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
            this.FlowStatus = new String(source.FlowStatus);
        }
        if (source.FlowMessage != null) {
            this.FlowMessage = new String(source.FlowMessage);
        }
        if (source.CreateOn != null) {
            this.CreateOn = new Long(source.CreateOn);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new Long(source.DeadLine);
        }
        if (source.CustomData != null) {
            this.CustomData = new String(source.CustomData);
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
        if (source.NeedCreateReview != null) {
            this.NeedCreateReview = new Boolean(source.NeedCreateReview);
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
        this.setParamSimple(map, prefix + "CreateOn", this.CreateOn);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "CustomData", this.CustomData);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "NeedCreateReview", this.NeedCreateReview);

    }
}

