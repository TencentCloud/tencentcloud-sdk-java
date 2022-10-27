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
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
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
    * 签署方经办人在模板中的角色ID
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
    * 签署前置条件：是否需要阅读全文，默认为不需要
    */
    @SerializedName("IsFullText")
    @Expose
    private Boolean IsFullText;

    /**
    * 签署前置条件：阅读时长限制，单位秒，默认为不需要
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
    * 客户自定义签署人标识，64位长度，保证唯一。非企微场景不使用此字段
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
     * Get 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。 
     * @return ApproverType 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
     * @param ApproverType 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
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
     * Get 签署方经办人在模板中的角色ID 
     * @return RecipientId 签署方经办人在模板中的角色ID
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方经办人在模板中的角色ID
     * @param RecipientId 签署方经办人在模板中的角色ID
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
     * Get 签署前置条件：是否需要阅读全文，默认为不需要 
     * @return IsFullText 签署前置条件：是否需要阅读全文，默认为不需要
     */
    public Boolean getIsFullText() {
        return this.IsFullText;
    }

    /**
     * Set 签署前置条件：是否需要阅读全文，默认为不需要
     * @param IsFullText 签署前置条件：是否需要阅读全文，默认为不需要
     */
    public void setIsFullText(Boolean IsFullText) {
        this.IsFullText = IsFullText;
    }

    /**
     * Get 签署前置条件：阅读时长限制，单位秒，默认为不需要 
     * @return PreReadTime 签署前置条件：阅读时长限制，单位秒，默认为不需要
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 签署前置条件：阅读时长限制，单位秒，默认为不需要
     * @param PreReadTime 签署前置条件：阅读时长限制，单位秒，默认为不需要
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
     * Get 客户自定义签署人标识，64位长度，保证唯一。非企微场景不使用此字段 
     * @return CustomApproverTag 客户自定义签署人标识，64位长度，保证唯一。非企微场景不使用此字段
     */
    public String getCustomApproverTag() {
        return this.CustomApproverTag;
    }

    /**
     * Set 客户自定义签署人标识，64位长度，保证唯一。非企微场景不使用此字段
     * @param CustomApproverTag 客户自定义签署人标识，64位长度，保证唯一。非企微场景不使用此字段
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

    }
}

