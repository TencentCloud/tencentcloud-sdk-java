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

public class FlowCreateApprover extends AbstractModel{

    /**
    * 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，会默认完成该签署方的签署。静默签署仅进行盖章操作，不能是手写签名。
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * 如果签署方为企业，需要填入企业全称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 签署方经办人姓名
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 签署方经办人手机号码
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 签署方经办人证件类型ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
    */
    @SerializedName("ApproverIdCardType")
    @Expose
    private String ApproverIdCardType;

    /**
    * 签署方经办人证件号码
    */
    @SerializedName("ApproverIdCardNumber")
    @Expose
    private String ApproverIdCardNumber;

    /**
    * 签署方经办人在模板中的参与方ID
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署意愿确认渠道,WEIXINAPP:人脸识别
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String [] VerifyChannel;

    /**
    * 是否发送短信，sms--短信通知，none--不通知，默认为sms；发起方=签署方时不发送短信
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 合同强制需要阅读全文，无需传此参数
    */
    @SerializedName("IsFullText")
    @Expose
    private Boolean IsFullText;

    /**
    * 合同的强制预览时间：3~300s，未指定则按合同页数计算
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署方经办人的用户ID,和签署方经办人姓名+手机号+证件必须有一个。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 当前只支持true，默认为true
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * 签署人用户来源,企微侧用户请传入：WEWORKAPP
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * 企业签署方或签标识，客户自定义，64位长度。用于发起含有或签签署人的合同。或签参与人必须有此字段。合同内不同或签参与人CustomApproverTag需要保证唯一。如果或签签署人为本方企微参与人，ApproverSource参数需要指定WEWORKAPP
    */
    @SerializedName("CustomApproverTag")
    @Expose
    private String CustomApproverTag;

    /**
    * 快速注册相关信息，目前暂未开放！
    */
    @SerializedName("RegisterInfo")
    @Expose
    private RegisterInfo RegisterInfo;

    /**
    * 签署人个性化能力值
    */
    @SerializedName("ApproverOption")
    @Expose
    private ApproverOption ApproverOption;

    /**
    * 签署完前端跳转的url，暂未使用
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 当前签署方进行签署操作是否需要企业内部审批，true 则为需要。为个人签署方时则由发起方企业审核。
    */
    @SerializedName("ApproverNeedSignReview")
    @Expose
    private Boolean ApproverNeedSignReview;

    /**
    * 签署人签署控件
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 签署人填写控件
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
    */
    @SerializedName("ComponentLimitType")
    @Expose
    private String [] ComponentLimitType;

    /**
    * 合同查看方式<br/>默认1 -实名查看 <br/>2-短信验证码查看(企业签署方暂不支持该方式)
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * 合同签署方式(默认1,2) <br/>1-人脸认证 <br/>2-签署密码 <br/>3-运营商三要素
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
     * Get 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，会默认完成该签署方的签署。静默签署仅进行盖章操作，不能是手写签名。 
     * @return ApproverType 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，会默认完成该签署方的签署。静默签署仅进行盖章操作，不能是手写签名。
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，会默认完成该签署方的签署。静默签署仅进行盖章操作，不能是手写签名。
     * @param ApproverType 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，会默认完成该签署方的签署。静默签署仅进行盖章操作，不能是手写签名。
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 如果签署方为企业，需要填入企业全称 
     * @return OrganizationName 如果签署方为企业，需要填入企业全称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 如果签署方为企业，需要填入企业全称
     * @param OrganizationName 如果签署方为企业，需要填入企业全称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 签署方经办人姓名 
     * @return ApproverName 签署方经办人姓名
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 签署方经办人姓名
     * @param ApproverName 签署方经办人姓名
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 签署方经办人手机号码 
     * @return ApproverMobile 签署方经办人手机号码
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 签署方经办人手机号码
     * @param ApproverMobile 签署方经办人手机号码
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 签署方经办人证件类型ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证) 
     * @return ApproverIdCardType 签署方经办人证件类型ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set 签署方经办人证件类型ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     * @param ApproverIdCardType 签署方经办人证件类型ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     */
    public void setApproverIdCardType(String ApproverIdCardType) {
        this.ApproverIdCardType = ApproverIdCardType;
    }

    /**
     * Get 签署方经办人证件号码 
     * @return ApproverIdCardNumber 签署方经办人证件号码
     */
    public String getApproverIdCardNumber() {
        return this.ApproverIdCardNumber;
    }

    /**
     * Set 签署方经办人证件号码
     * @param ApproverIdCardNumber 签署方经办人证件号码
     */
    public void setApproverIdCardNumber(String ApproverIdCardNumber) {
        this.ApproverIdCardNumber = ApproverIdCardNumber;
    }

    /**
     * Get 签署方经办人在模板中的参与方ID 
     * @return RecipientId 签署方经办人在模板中的参与方ID
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方经办人在模板中的参与方ID
     * @param RecipientId 签署方经办人在模板中的参与方ID
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署意愿确认渠道,WEIXINAPP:人脸识别 
     * @return VerifyChannel 签署意愿确认渠道,WEIXINAPP:人脸识别
     */
    public String [] getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 签署意愿确认渠道,WEIXINAPP:人脸识别
     * @param VerifyChannel 签署意愿确认渠道,WEIXINAPP:人脸识别
     */
    public void setVerifyChannel(String [] VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 是否发送短信，sms--短信通知，none--不通知，默认为sms；发起方=签署方时不发送短信 
     * @return NotifyType 是否发送短信，sms--短信通知，none--不通知，默认为sms；发起方=签署方时不发送短信
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 是否发送短信，sms--短信通知，none--不通知，默认为sms；发起方=签署方时不发送短信
     * @param NotifyType 是否发送短信，sms--短信通知，none--不通知，默认为sms；发起方=签署方时不发送短信
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 合同强制需要阅读全文，无需传此参数 
     * @return IsFullText 合同强制需要阅读全文，无需传此参数
     */
    public Boolean getIsFullText() {
        return this.IsFullText;
    }

    /**
     * Set 合同强制需要阅读全文，无需传此参数
     * @param IsFullText 合同强制需要阅读全文，无需传此参数
     */
    public void setIsFullText(Boolean IsFullText) {
        this.IsFullText = IsFullText;
    }

    /**
     * Get 合同的强制预览时间：3~300s，未指定则按合同页数计算 
     * @return PreReadTime 合同的强制预览时间：3~300s，未指定则按合同页数计算
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 合同的强制预览时间：3~300s，未指定则按合同页数计算
     * @param PreReadTime 合同的强制预览时间：3~300s，未指定则按合同页数计算
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 签署方经办人的用户ID,和签署方经办人姓名+手机号+证件必须有一个。 
     * @return UserId 签署方经办人的用户ID,和签署方经办人姓名+手机号+证件必须有一个。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 签署方经办人的用户ID,和签署方经办人姓名+手机号+证件必须有一个。
     * @param UserId 签署方经办人的用户ID,和签署方经办人姓名+手机号+证件必须有一个。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 当前只支持true，默认为true 
     * @return Required 当前只支持true，默认为true
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set 当前只支持true，默认为true
     * @param Required 当前只支持true，默认为true
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get 签署人用户来源,企微侧用户请传入：WEWORKAPP 
     * @return ApproverSource 签署人用户来源,企微侧用户请传入：WEWORKAPP
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set 签署人用户来源,企微侧用户请传入：WEWORKAPP
     * @param ApproverSource 签署人用户来源,企微侧用户请传入：WEWORKAPP
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get 企业签署方或签标识，客户自定义，64位长度。用于发起含有或签签署人的合同。或签参与人必须有此字段。合同内不同或签参与人CustomApproverTag需要保证唯一。如果或签签署人为本方企微参与人，ApproverSource参数需要指定WEWORKAPP 
     * @return CustomApproverTag 企业签署方或签标识，客户自定义，64位长度。用于发起含有或签签署人的合同。或签参与人必须有此字段。合同内不同或签参与人CustomApproverTag需要保证唯一。如果或签签署人为本方企微参与人，ApproverSource参数需要指定WEWORKAPP
     */
    public String getCustomApproverTag() {
        return this.CustomApproverTag;
    }

    /**
     * Set 企业签署方或签标识，客户自定义，64位长度。用于发起含有或签签署人的合同。或签参与人必须有此字段。合同内不同或签参与人CustomApproverTag需要保证唯一。如果或签签署人为本方企微参与人，ApproverSource参数需要指定WEWORKAPP
     * @param CustomApproverTag 企业签署方或签标识，客户自定义，64位长度。用于发起含有或签签署人的合同。或签参与人必须有此字段。合同内不同或签参与人CustomApproverTag需要保证唯一。如果或签签署人为本方企微参与人，ApproverSource参数需要指定WEWORKAPP
     */
    public void setCustomApproverTag(String CustomApproverTag) {
        this.CustomApproverTag = CustomApproverTag;
    }

    /**
     * Get 快速注册相关信息，目前暂未开放！ 
     * @return RegisterInfo 快速注册相关信息，目前暂未开放！
     */
    public RegisterInfo getRegisterInfo() {
        return this.RegisterInfo;
    }

    /**
     * Set 快速注册相关信息，目前暂未开放！
     * @param RegisterInfo 快速注册相关信息，目前暂未开放！
     */
    public void setRegisterInfo(RegisterInfo RegisterInfo) {
        this.RegisterInfo = RegisterInfo;
    }

    /**
     * Get 签署人个性化能力值 
     * @return ApproverOption 签署人个性化能力值
     */
    public ApproverOption getApproverOption() {
        return this.ApproverOption;
    }

    /**
     * Set 签署人个性化能力值
     * @param ApproverOption 签署人个性化能力值
     */
    public void setApproverOption(ApproverOption ApproverOption) {
        this.ApproverOption = ApproverOption;
    }

    /**
     * Get 签署完前端跳转的url，暂未使用 
     * @return JumpUrl 签署完前端跳转的url，暂未使用
     * @deprecated
     */
    @Deprecated
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完前端跳转的url，暂未使用
     * @param JumpUrl 签署完前端跳转的url，暂未使用
     * @deprecated
     */
    @Deprecated
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息 
     * @return SignId 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
     * @param SignId 签署ID
- 发起流程时系统自动补充
- 创建签署链接时，可以通过查询详情接口获得签署人的SignId，然后可传入此值为该签署人创建签署链接，无需再传姓名、手机号、证件号等其他信息
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 当前签署方进行签署操作是否需要企业内部审批，true 则为需要。为个人签署方时则由发起方企业审核。 
     * @return ApproverNeedSignReview 当前签署方进行签署操作是否需要企业内部审批，true 则为需要。为个人签署方时则由发起方企业审核。
     */
    public Boolean getApproverNeedSignReview() {
        return this.ApproverNeedSignReview;
    }

    /**
     * Set 当前签署方进行签署操作是否需要企业内部审批，true 则为需要。为个人签署方时则由发起方企业审核。
     * @param ApproverNeedSignReview 当前签署方进行签署操作是否需要企业内部审批，true 则为需要。为个人签署方时则由发起方企业审核。
     */
    public void setApproverNeedSignReview(Boolean ApproverNeedSignReview) {
        this.ApproverNeedSignReview = ApproverNeedSignReview;
    }

    /**
     * Get 签署人签署控件 
     * @return SignComponents 签署人签署控件
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 签署人签署控件
     * @param SignComponents 签署人签署控件
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 签署人填写控件 
     * @return Components 签署人填写控件
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 签署人填写控件
     * @param Components 签署人填写控件
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署） 
     * @return ComponentLimitType 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
     */
    public String [] getComponentLimitType() {
        return this.ComponentLimitType;
    }

    /**
     * Set 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
     * @param ComponentLimitType 签署方控件类型为 SIGN_SIGNATURE时，可以指定签署方签名方式
	HANDWRITE – 手写签名
	OCR_ESIGN -- AI智能识别手写签名
	ESIGN -- 个人印章类型
	SYSTEM_ESIGN -- 系统签名（该类型可以在用户签署时根据用户姓名一键生成一个签名来进行签署）
     */
    public void setComponentLimitType(String [] ComponentLimitType) {
        this.ComponentLimitType = ComponentLimitType;
    }

    /**
     * Get 合同查看方式<br/>默认1 -实名查看 <br/>2-短信验证码查看(企业签署方暂不支持该方式) 
     * @return ApproverVerifyTypes 合同查看方式<br/>默认1 -实名查看 <br/>2-短信验证码查看(企业签署方暂不支持该方式)
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set 合同查看方式<br/>默认1 -实名查看 <br/>2-短信验证码查看(企业签署方暂不支持该方式)
     * @param ApproverVerifyTypes 合同查看方式<br/>默认1 -实名查看 <br/>2-短信验证码查看(企业签署方暂不支持该方式)
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get 合同签署方式(默认1,2) <br/>1-人脸认证 <br/>2-签署密码 <br/>3-运营商三要素 
     * @return ApproverSignTypes 合同签署方式(默认1,2) <br/>1-人脸认证 <br/>2-签署密码 <br/>3-运营商三要素
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set 合同签署方式(默认1,2) <br/>1-人脸认证 <br/>2-签署密码 <br/>3-运营商三要素
     * @param ApproverSignTypes 合同签署方式(默认1,2) <br/>1-人脸认证 <br/>2-签署密码 <br/>3-运营商三要素
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    public FlowCreateApprover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowCreateApprover(FlowCreateApprover source) {
        if (source.ApproverType != null) {
            this.ApproverType = new Long(source.ApproverType);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String[source.VerifyChannel.length];
            for (int i = 0; i < source.VerifyChannel.length; i++) {
                this.VerifyChannel[i] = new String(source.VerifyChannel[i]);
            }
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.IsFullText != null) {
            this.IsFullText = new Boolean(source.IsFullText);
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomApproverTag != null) {
            this.CustomApproverTag = new String(source.CustomApproverTag);
        }
        if (source.RegisterInfo != null) {
            this.RegisterInfo = new RegisterInfo(source.RegisterInfo);
        }
        if (source.ApproverOption != null) {
            this.ApproverOption = new ApproverOption(source.ApproverOption);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ApproverNeedSignReview != null) {
            this.ApproverNeedSignReview = new Boolean(source.ApproverNeedSignReview);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.ComponentLimitType != null) {
            this.ComponentLimitType = new String[source.ComponentLimitType.length];
            for (int i = 0; i < source.ComponentLimitType.length; i++) {
                this.ComponentLimitType[i] = new String(source.ComponentLimitType[i]);
            }
        }
        if (source.ApproverVerifyTypes != null) {
            this.ApproverVerifyTypes = new Long[source.ApproverVerifyTypes.length];
            for (int i = 0; i < source.ApproverVerifyTypes.length; i++) {
                this.ApproverVerifyTypes[i] = new Long(source.ApproverVerifyTypes[i]);
            }
        }
        if (source.ApproverSignTypes != null) {
            this.ApproverSignTypes = new Long[source.ApproverSignTypes.length];
            for (int i = 0; i < source.ApproverSignTypes.length; i++) {
                this.ApproverSignTypes[i] = new Long(source.ApproverSignTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamArraySimple(map, prefix + "VerifyChannel.", this.VerifyChannel);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "IsFullText", this.IsFullText);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomApproverTag", this.CustomApproverTag);
        this.setParamObj(map, prefix + "RegisterInfo.", this.RegisterInfo);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ApproverNeedSignReview", this.ApproverNeedSignReview);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamArraySimple(map, prefix + "ComponentLimitType.", this.ComponentLimitType);
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);

    }
}

