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

public class CreateFlowRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 签署流程名称,最大长度200个字符
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署流程参与者信息，最大限制50方
注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。
    */
    @SerializedName("Approvers")
    @Expose
    private FlowCreateApprover [] Approvers;

    /**
    * 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 客户端Token，保持接口幂等性,最大长度64个字符
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
    */
    @SerializedName("DeadLine")
    @Expose
    private Long DeadLine;

    /**
    * 合同到期提醒时间戳，单位秒。设定该值后，可以提前进行到期通知，方便客户处理合同到期事务，如合同续签等。该值支持的范围是从发起时间起到往后的10年内。仅合同发起方企业的发起人可以编辑修改。
    */
    @SerializedName("RemindedOn")
    @Expose
    private Long RemindedOn;

    /**
    * 用户自定义字段，回调的时候会进行透传，长度需要小于20480
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 签署流程描述,最大长度1000个字符
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 发送类型：
true：无序签
false：有序签
注：默认为false（有序签），请和模板中的配置保持一致
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
    */
    @SerializedName("CustomShowMap")
    @Expose
    private String CustomShowMap;

    /**
    * 发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。
若设置为true，审核结果需通过接口 CreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。

注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 被抄送人的信息列表。
注: 此功能为白名单功能，若有需要，请联系电子签客服开白使用。
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
    */
    @SerializedName("AutoSignScene")
    @Expose
    private String AutoSignScene;

    /**
    * 暂未开放
    */
    @SerializedName("RelatedFlowId")
    @Expose
    private String RelatedFlowId;

    /**
    * 暂未开放
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。 
     * @return Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     * @param Operator 调用方用户信息，userId 必填。支持填入集团子公司经办人 userId代发合同。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 签署流程名称,最大长度200个字符 
     * @return FlowName 签署流程名称,最大长度200个字符
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 签署流程名称,最大长度200个字符
     * @param FlowName 签署流程名称,最大长度200个字符
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署流程参与者信息，最大限制50方
注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。 
     * @return Approvers 签署流程参与者信息，最大限制50方
注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。
     */
    public FlowCreateApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署流程参与者信息，最大限制50方
注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。
     * @param Approvers 签署流程参与者信息，最大限制50方
注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。
     */
    public void setApprovers(FlowCreateApprover [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符 
     * @return FlowType 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
     * @param FlowType 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 客户端Token，保持接口幂等性,最大长度64个字符 
     * @return ClientToken 客户端Token，保持接口幂等性,最大长度64个字符
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token，保持接口幂等性,最大长度64个字符
     * @param ClientToken 客户端Token，保持接口幂等性,最大长度64个字符
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后 
     * @return DeadLine 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     */
    public Long getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     * @param DeadLine 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     */
    public void setDeadLine(Long DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get 合同到期提醒时间戳，单位秒。设定该值后，可以提前进行到期通知，方便客户处理合同到期事务，如合同续签等。该值支持的范围是从发起时间起到往后的10年内。仅合同发起方企业的发起人可以编辑修改。 
     * @return RemindedOn 合同到期提醒时间戳，单位秒。设定该值后，可以提前进行到期通知，方便客户处理合同到期事务，如合同续签等。该值支持的范围是从发起时间起到往后的10年内。仅合同发起方企业的发起人可以编辑修改。
     */
    public Long getRemindedOn() {
        return this.RemindedOn;
    }

    /**
     * Set 合同到期提醒时间戳，单位秒。设定该值后，可以提前进行到期通知，方便客户处理合同到期事务，如合同续签等。该值支持的范围是从发起时间起到往后的10年内。仅合同发起方企业的发起人可以编辑修改。
     * @param RemindedOn 合同到期提醒时间戳，单位秒。设定该值后，可以提前进行到期通知，方便客户处理合同到期事务，如合同续签等。该值支持的范围是从发起时间起到往后的10年内。仅合同发起方企业的发起人可以编辑修改。
     */
    public void setRemindedOn(Long RemindedOn) {
        this.RemindedOn = RemindedOn;
    }

    /**
     * Get 用户自定义字段，回调的时候会进行透传，长度需要小于20480 
     * @return UserData 用户自定义字段，回调的时候会进行透传，长度需要小于20480
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户自定义字段，回调的时候会进行透传，长度需要小于20480
     * @param UserData 用户自定义字段，回调的时候会进行透传，长度需要小于20480
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 签署流程描述,最大长度1000个字符 
     * @return FlowDescription 签署流程描述,最大长度1000个字符
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 签署流程描述,最大长度1000个字符
     * @param FlowDescription 签署流程描述,最大长度1000个字符
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 发送类型：
true：无序签
false：有序签
注：默认为false（有序签），请和模板中的配置保持一致 
     * @return Unordered 发送类型：
true：无序签
false：有序签
注：默认为false（有序签），请和模板中的配置保持一致
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 发送类型：
true：无序签
false：有序签
注：默认为false（有序签），请和模板中的配置保持一致
     * @param Unordered 发送类型：
true：无序签
false：有序签
注：默认为false（有序签），请和模板中的配置保持一致
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始 
     * @return CustomShowMap 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     */
    public String getCustomShowMap() {
        return this.CustomShowMap;
    }

    /**
     * Set 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     * @param CustomShowMap 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     */
    public void setCustomShowMap(String CustomShowMap) {
        this.CustomShowMap = CustomShowMap;
    }

    /**
     * Get 发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。
若设置为true，审核结果需通过接口 CreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。

注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。 
     * @return NeedSignReview 发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。
若设置为true，审核结果需通过接口 CreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。

注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。
若设置为true，审核结果需通过接口 CreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。

注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
     * @param NeedSignReview 发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。
若设置为true，审核结果需通过接口 CreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。

注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
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
     * Get 被抄送人的信息列表。
注: 此功能为白名单功能，若有需要，请联系电子签客服开白使用。 
     * @return CcInfos 被抄送人的信息列表。
注: 此功能为白名单功能，若有需要，请联系电子签客服开白使用。
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 被抄送人的信息列表。
注: 此功能为白名单功能，若有需要，请联系电子签客服开白使用。
     * @param CcInfos 被抄送人的信息列表。
注: 此功能为白名单功能，若有需要，请联系电子签客服开白使用。
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN 
     * @return AutoSignScene 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     */
    public String getAutoSignScene() {
        return this.AutoSignScene;
    }

    /**
     * Set 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     * @param AutoSignScene 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     */
    public void setAutoSignScene(String AutoSignScene) {
        this.AutoSignScene = AutoSignScene;
    }

    /**
     * Get 暂未开放 
     * @return RelatedFlowId 暂未开放
     * @deprecated
     */
    @Deprecated
    public String getRelatedFlowId() {
        return this.RelatedFlowId;
    }

    /**
     * Set 暂未开放
     * @param RelatedFlowId 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setRelatedFlowId(String RelatedFlowId) {
        this.RelatedFlowId = RelatedFlowId;
    }

    /**
     * Get 暂未开放 
     * @return CallbackUrl 暂未开放
     * @deprecated
     */
    @Deprecated
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 暂未开放
     * @param CallbackUrl 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public CreateFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowRequest(CreateFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowCreateApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowCreateApprover(source.Approvers[i]);
            }
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new Long(source.DeadLine);
        }
        if (source.RemindedOn != null) {
            this.RemindedOn = new Long(source.RemindedOn);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.CustomShowMap != null) {
            this.CustomShowMap = new String(source.CustomShowMap);
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
        if (source.AutoSignScene != null) {
            this.AutoSignScene = new String(source.AutoSignScene);
        }
        if (source.RelatedFlowId != null) {
            this.RelatedFlowId = new String(source.RelatedFlowId);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "RemindedOn", this.RemindedOn);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "CustomShowMap", this.CustomShowMap);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "AutoSignScene", this.AutoSignScene);
        this.setParamSimple(map, prefix + "RelatedFlowId", this.RelatedFlowId);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

