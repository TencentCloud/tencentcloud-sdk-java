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

public class CreateFlowSignReviewRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 签署流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 企业内部审核结果
PASS: 通过 
REJECT: 拒绝
    */
    @SerializedName("ReviewType")
    @Expose
    private String ReviewType;

    /**
    * 审核原因 
当ReviewType 是REJECT 时此字段必填,字符串长度不超过200
    */
    @SerializedName("ReviewMessage")
    @Expose
    private String ReviewMessage;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 审核签署节点使用 非必填 如果填写则审核该签署节点。给个人审核时必填。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 操作类型：（接口通过该字段区分操作类型）

SignReview:签署审核
CreateReview:发起审核

默认：SignReview；SignReview:签署审核

该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程
若发起个人审核，则指定该字段为：SignReview
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 签署流程编号 
     * @return FlowId 签署流程编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署流程编号
     * @param FlowId 签署流程编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 企业内部审核结果
PASS: 通过 
REJECT: 拒绝 
     * @return ReviewType 企业内部审核结果
PASS: 通过 
REJECT: 拒绝
     */
    public String getReviewType() {
        return this.ReviewType;
    }

    /**
     * Set 企业内部审核结果
PASS: 通过 
REJECT: 拒绝
     * @param ReviewType 企业内部审核结果
PASS: 通过 
REJECT: 拒绝
     */
    public void setReviewType(String ReviewType) {
        this.ReviewType = ReviewType;
    }

    /**
     * Get 审核原因 
当ReviewType 是REJECT 时此字段必填,字符串长度不超过200 
     * @return ReviewMessage 审核原因 
当ReviewType 是REJECT 时此字段必填,字符串长度不超过200
     */
    public String getReviewMessage() {
        return this.ReviewMessage;
    }

    /**
     * Set 审核原因 
当ReviewType 是REJECT 时此字段必填,字符串长度不超过200
     * @param ReviewMessage 审核原因 
当ReviewType 是REJECT 时此字段必填,字符串长度不超过200
     */
    public void setReviewMessage(String ReviewMessage) {
        this.ReviewMessage = ReviewMessage;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 审核签署节点使用 非必填 如果填写则审核该签署节点。给个人审核时必填。 
     * @return RecipientId 审核签署节点使用 非必填 如果填写则审核该签署节点。给个人审核时必填。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 审核签署节点使用 非必填 如果填写则审核该签署节点。给个人审核时必填。
     * @param RecipientId 审核签署节点使用 非必填 如果填写则审核该签署节点。给个人审核时必填。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 操作类型：（接口通过该字段区分操作类型）

SignReview:签署审核
CreateReview:发起审核

默认：SignReview；SignReview:签署审核

该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程
若发起个人审核，则指定该字段为：SignReview 
     * @return OperateType 操作类型：（接口通过该字段区分操作类型）

SignReview:签署审核
CreateReview:发起审核

默认：SignReview；SignReview:签署审核

该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程
若发起个人审核，则指定该字段为：SignReview
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型：（接口通过该字段区分操作类型）

SignReview:签署审核
CreateReview:发起审核

默认：SignReview；SignReview:签署审核

该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程
若发起个人审核，则指定该字段为：SignReview
     * @param OperateType 操作类型：（接口通过该字段区分操作类型）

SignReview:签署审核
CreateReview:发起审核

默认：SignReview；SignReview:签署审核

该字段不传或者为空，则默认为SignReview签署审核，走签署审核流程
若发起个人审核，则指定该字段为：SignReview
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    public CreateFlowSignReviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowSignReviewRequest(CreateFlowSignReviewRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ReviewType != null) {
            this.ReviewType = new String(source.ReviewType);
        }
        if (source.ReviewMessage != null) {
            this.ReviewMessage = new String(source.ReviewMessage);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ReviewType", this.ReviewType);
        this.setParamSimple(map, prefix + "ReviewMessage", this.ReviewMessage);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);

    }
}

