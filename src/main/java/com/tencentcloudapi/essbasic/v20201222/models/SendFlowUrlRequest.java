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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendFlowUrlRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 需要推送合同的流程ID
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 签署人ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 签署控件信息 (支持添加多个控件)
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 签署人手机号 (如果选择短信验证码签署，则此字段必填)
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署人对应的子机构ID，个人签署者此字段不填
    */
    @SerializedName("SubOrganizationId")
    @Expose
    private String SubOrganizationId;

    /**
    * 签名后校验方式：
1. WEIXINAPP - 微信小程序；
2. FACEID - 慧眼 (默认) ；
3. VERIFYCODE - 验证码；
4. NONE - 无。此选项为白名单参数，暂不支持公开调用。如需开通权限，请通过客户经理或邮件至e-contract@tencent.com与我们联系；
5. THIRD - 第三方 (暂不支持)
6. OFFLINE - 线下人工审核
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String [] VerifyChannel;

    /**
    * 签署链接失效截止时间，默认为7天
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 是否为最后一个签署人。若为最后一人，本次签署完成以后自动归档
    */
    @SerializedName("IsLastApprover")
    @Expose
    private Boolean IsLastApprover;

    /**
    * 签署完成后，前端跳转的url
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 短信模板
默认使用腾讯电子签官方短信模板，如有自定义需求，请通过客户经理或邮件至e-contract@tencent.com与我们联系。
    */
    @SerializedName("SmsTemplate")
    @Expose
    private SmsTemplate SmsTemplate;

    /**
    * 签署前置条件：是否要全文阅读，默认否
    */
    @SerializedName("IsFullText")
    @Expose
    private Boolean IsFullText;

    /**
    * 签署前置条件：强制用户阅读待签署文件时长，默认不限制
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 当前参与者是否支持线下核身,默认为不支持
    */
    @SerializedName("CanOffLine")
    @Expose
    private Boolean CanOffLine;

    /**
    * 签署任务的回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 需要推送合同的流程ID 
     * @return FlowId 需要推送合同的流程ID
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 需要推送合同的流程ID
     * @param FlowId 需要推送合同的流程ID
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 签署人ID 
     * @return UserId 签署人ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 签署人ID
     * @param UserId 签署人ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 签署控件信息 (支持添加多个控件) 
     * @return SignComponents 签署控件信息 (支持添加多个控件)
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 签署控件信息 (支持添加多个控件)
     * @param SignComponents 签署控件信息 (支持添加多个控件)
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 签署人手机号 (如果选择短信验证码签署，则此字段必填) 
     * @return Mobile 签署人手机号 (如果选择短信验证码签署，则此字段必填)
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号 (如果选择短信验证码签署，则此字段必填)
     * @param Mobile 签署人手机号 (如果选择短信验证码签署，则此字段必填)
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 签署人对应的子机构ID，个人签署者此字段不填 
     * @return SubOrganizationId 签署人对应的子机构ID，个人签署者此字段不填
     */
    public String getSubOrganizationId() {
        return this.SubOrganizationId;
    }

    /**
     * Set 签署人对应的子机构ID，个人签署者此字段不填
     * @param SubOrganizationId 签署人对应的子机构ID，个人签署者此字段不填
     */
    public void setSubOrganizationId(String SubOrganizationId) {
        this.SubOrganizationId = SubOrganizationId;
    }

    /**
     * Get 签名后校验方式：
1. WEIXINAPP - 微信小程序；
2. FACEID - 慧眼 (默认) ；
3. VERIFYCODE - 验证码；
4. NONE - 无。此选项为白名单参数，暂不支持公开调用。如需开通权限，请通过客户经理或邮件至e-contract@tencent.com与我们联系；
5. THIRD - 第三方 (暂不支持)
6. OFFLINE - 线下人工审核 
     * @return VerifyChannel 签名后校验方式：
1. WEIXINAPP - 微信小程序；
2. FACEID - 慧眼 (默认) ；
3. VERIFYCODE - 验证码；
4. NONE - 无。此选项为白名单参数，暂不支持公开调用。如需开通权限，请通过客户经理或邮件至e-contract@tencent.com与我们联系；
5. THIRD - 第三方 (暂不支持)
6. OFFLINE - 线下人工审核
     */
    public String [] getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 签名后校验方式：
1. WEIXINAPP - 微信小程序；
2. FACEID - 慧眼 (默认) ；
3. VERIFYCODE - 验证码；
4. NONE - 无。此选项为白名单参数，暂不支持公开调用。如需开通权限，请通过客户经理或邮件至e-contract@tencent.com与我们联系；
5. THIRD - 第三方 (暂不支持)
6. OFFLINE - 线下人工审核
     * @param VerifyChannel 签名后校验方式：
1. WEIXINAPP - 微信小程序；
2. FACEID - 慧眼 (默认) ；
3. VERIFYCODE - 验证码；
4. NONE - 无。此选项为白名单参数，暂不支持公开调用。如需开通权限，请通过客户经理或邮件至e-contract@tencent.com与我们联系；
5. THIRD - 第三方 (暂不支持)
6. OFFLINE - 线下人工审核
     */
    public void setVerifyChannel(String [] VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 签署链接失效截止时间，默认为7天 
     * @return Deadline 签署链接失效截止时间，默认为7天
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署链接失效截止时间，默认为7天
     * @param Deadline 签署链接失效截止时间，默认为7天
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 是否为最后一个签署人。若为最后一人，本次签署完成以后自动归档 
     * @return IsLastApprover 是否为最后一个签署人。若为最后一人，本次签署完成以后自动归档
     */
    public Boolean getIsLastApprover() {
        return this.IsLastApprover;
    }

    /**
     * Set 是否为最后一个签署人。若为最后一人，本次签署完成以后自动归档
     * @param IsLastApprover 是否为最后一个签署人。若为最后一人，本次签署完成以后自动归档
     */
    public void setIsLastApprover(Boolean IsLastApprover) {
        this.IsLastApprover = IsLastApprover;
    }

    /**
     * Get 签署完成后，前端跳转的url 
     * @return JumpUrl 签署完成后，前端跳转的url
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完成后，前端跳转的url
     * @param JumpUrl 签署完成后，前端跳转的url
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 短信模板
默认使用腾讯电子签官方短信模板，如有自定义需求，请通过客户经理或邮件至e-contract@tencent.com与我们联系。 
     * @return SmsTemplate 短信模板
默认使用腾讯电子签官方短信模板，如有自定义需求，请通过客户经理或邮件至e-contract@tencent.com与我们联系。
     */
    public SmsTemplate getSmsTemplate() {
        return this.SmsTemplate;
    }

    /**
     * Set 短信模板
默认使用腾讯电子签官方短信模板，如有自定义需求，请通过客户经理或邮件至e-contract@tencent.com与我们联系。
     * @param SmsTemplate 短信模板
默认使用腾讯电子签官方短信模板，如有自定义需求，请通过客户经理或邮件至e-contract@tencent.com与我们联系。
     */
    public void setSmsTemplate(SmsTemplate SmsTemplate) {
        this.SmsTemplate = SmsTemplate;
    }

    /**
     * Get 签署前置条件：是否要全文阅读，默认否 
     * @return IsFullText 签署前置条件：是否要全文阅读，默认否
     */
    public Boolean getIsFullText() {
        return this.IsFullText;
    }

    /**
     * Set 签署前置条件：是否要全文阅读，默认否
     * @param IsFullText 签署前置条件：是否要全文阅读，默认否
     */
    public void setIsFullText(Boolean IsFullText) {
        this.IsFullText = IsFullText;
    }

    /**
     * Get 签署前置条件：强制用户阅读待签署文件时长，默认不限制 
     * @return PreReadTime 签署前置条件：强制用户阅读待签署文件时长，默认不限制
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 签署前置条件：强制用户阅读待签署文件时长，默认不限制
     * @param PreReadTime 签署前置条件：强制用户阅读待签署文件时长，默认不限制
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 当前参与者是否支持线下核身,默认为不支持 
     * @return CanOffLine 当前参与者是否支持线下核身,默认为不支持
     */
    public Boolean getCanOffLine() {
        return this.CanOffLine;
    }

    /**
     * Set 当前参与者是否支持线下核身,默认为不支持
     * @param CanOffLine 当前参与者是否支持线下核身,默认为不支持
     */
    public void setCanOffLine(Boolean CanOffLine) {
        this.CanOffLine = CanOffLine;
    }

    /**
     * Get 签署任务的回调地址 
     * @return CallbackUrl 签署任务的回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署任务的回调地址
     * @param CallbackUrl 签署任务的回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public SendFlowUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendFlowUrlRequest(SendFlowUrlRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.SubOrganizationId != null) {
            this.SubOrganizationId = new String(source.SubOrganizationId);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String[source.VerifyChannel.length];
            for (int i = 0; i < source.VerifyChannel.length; i++) {
                this.VerifyChannel[i] = new String(source.VerifyChannel[i]);
            }
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.IsLastApprover != null) {
            this.IsLastApprover = new Boolean(source.IsLastApprover);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.SmsTemplate != null) {
            this.SmsTemplate = new SmsTemplate(source.SmsTemplate);
        }
        if (source.IsFullText != null) {
            this.IsFullText = new Boolean(source.IsFullText);
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.CanOffLine != null) {
            this.CanOffLine = new Boolean(source.CanOffLine);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "SubOrganizationId", this.SubOrganizationId);
        this.setParamArraySimple(map, prefix + "VerifyChannel.", this.VerifyChannel);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "IsLastApprover", this.IsLastApprover);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "SmsTemplate.", this.SmsTemplate);
        this.setParamSimple(map, prefix + "IsFullText", this.IsFullText);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "CanOffLine", this.CanOffLine);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

