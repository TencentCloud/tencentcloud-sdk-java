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

public class FlowApproverInfo extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 认证方式：
WEIXINAPP - 微信小程序；
FACEID - 慧眼 (默认)；
VERIFYCODE - 验证码；
THIRD - 第三方 (暂不支持)
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String [] VerifyChannel;

    /**
    * 签署状态：
0 - 待签署；
1- 已签署；
2 - 拒绝；
3 - 过期未处理；
4 - 流程已撤回,
12-审核中,
13-审核驳回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private Long ApproveStatus;

    /**
    * 拒签/签署/审核驳回原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveMessage")
    @Expose
    private String ApproveMessage;

    /**
    * 签约时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
    * 签署企业ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubOrganizationId")
    @Expose
    private String SubOrganizationId;

    /**
    * 签署完成后跳转的URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 用户签署区ID到印章ID的映射集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentSeals")
    @Expose
    private ComponentSeal [] ComponentSeals;

    /**
    * 签署前置条件：是否强制用户全文阅读，即阅读到待签署文档的最后一页。默认FALSE
    */
    @SerializedName("IsFullText")
    @Expose
    private Boolean IsFullText;

    /**
    * 签署前置条件：强制阅读时长，页面停留时长不足则不允许签署。默认不限制
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署人手机号，脱敏显示
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署链接截止时间，默认签署流程发起后7天失效
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 是否为最后一个签署人, 若为最后一人，则其签署完成后自动归档
    */
    @SerializedName("IsLastApprover")
    @Expose
    private Boolean IsLastApprover;

    /**
    * 短信模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmsTemplate")
    @Expose
    private SmsTemplate SmsTemplate;

    /**
    * 身份证号，脱敏显示
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 用户姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否支持线下核身
    */
    @SerializedName("CanOffLine")
    @Expose
    private Boolean CanOffLine;

    /**
    * 证件号码类型：ID_CARD - 身份证，PASSPORT - 护照，MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证; 暂不支持用于电子签自有平台实名认证，MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证; 暂不支持用于电子签自有平台实名认证，HOUSEHOLD_REGISTER - 户口本; 暂不支持用于电子签自有平台实名认证，TEMP_ID_CARD - 临时居民身份证; 暂不支持用于电子签自有平台实名认证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 签署回调地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 签署任务ID，标识每一次的流程发送
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 认证方式：
WEIXINAPP - 微信小程序；
FACEID - 慧眼 (默认)；
VERIFYCODE - 验证码；
THIRD - 第三方 (暂不支持) 
     * @return VerifyChannel 认证方式：
WEIXINAPP - 微信小程序；
FACEID - 慧眼 (默认)；
VERIFYCODE - 验证码；
THIRD - 第三方 (暂不支持)
     */
    public String [] getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 认证方式：
WEIXINAPP - 微信小程序；
FACEID - 慧眼 (默认)；
VERIFYCODE - 验证码；
THIRD - 第三方 (暂不支持)
     * @param VerifyChannel 认证方式：
WEIXINAPP - 微信小程序；
FACEID - 慧眼 (默认)；
VERIFYCODE - 验证码；
THIRD - 第三方 (暂不支持)
     */
    public void setVerifyChannel(String [] VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 签署状态：
0 - 待签署；
1- 已签署；
2 - 拒绝；
3 - 过期未处理；
4 - 流程已撤回,
12-审核中,
13-审核驳回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus 签署状态：
0 - 待签署；
1- 已签署；
2 - 拒绝；
3 - 过期未处理；
4 - 流程已撤回,
12-审核中,
13-审核驳回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 签署状态：
0 - 待签署；
1- 已签署；
2 - 拒绝；
3 - 过期未处理；
4 - 流程已撤回,
12-审核中,
13-审核驳回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus 签署状态：
0 - 待签署；
1- 已签署；
2 - 拒绝；
3 - 过期未处理；
4 - 流程已撤回,
12-审核中,
13-审核驳回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(Long ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get 拒签/签署/审核驳回原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveMessage 拒签/签署/审核驳回原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveMessage() {
        return this.ApproveMessage;
    }

    /**
     * Set 拒签/签署/审核驳回原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveMessage 拒签/签署/审核驳回原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveMessage(String ApproveMessage) {
        this.ApproveMessage = ApproveMessage;
    }

    /**
     * Get 签约时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveTime 签约时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 签约时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveTime 签约时间的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 签署企业ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubOrganizationId 签署企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubOrganizationId() {
        return this.SubOrganizationId;
    }

    /**
     * Set 签署企业ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubOrganizationId 签署企业ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubOrganizationId(String SubOrganizationId) {
        this.SubOrganizationId = SubOrganizationId;
    }

    /**
     * Get 签署完成后跳转的URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JumpUrl 签署完成后跳转的URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完成后跳转的URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param JumpUrl 签署完成后跳转的URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 用户签署区ID到印章ID的映射集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentSeals 用户签署区ID到印章ID的映射集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComponentSeal [] getComponentSeals() {
        return this.ComponentSeals;
    }

    /**
     * Set 用户签署区ID到印章ID的映射集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentSeals 用户签署区ID到印章ID的映射集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentSeals(ComponentSeal [] ComponentSeals) {
        this.ComponentSeals = ComponentSeals;
    }

    /**
     * Get 签署前置条件：是否强制用户全文阅读，即阅读到待签署文档的最后一页。默认FALSE 
     * @return IsFullText 签署前置条件：是否强制用户全文阅读，即阅读到待签署文档的最后一页。默认FALSE
     */
    public Boolean getIsFullText() {
        return this.IsFullText;
    }

    /**
     * Set 签署前置条件：是否强制用户全文阅读，即阅读到待签署文档的最后一页。默认FALSE
     * @param IsFullText 签署前置条件：是否强制用户全文阅读，即阅读到待签署文档的最后一页。默认FALSE
     */
    public void setIsFullText(Boolean IsFullText) {
        this.IsFullText = IsFullText;
    }

    /**
     * Get 签署前置条件：强制阅读时长，页面停留时长不足则不允许签署。默认不限制 
     * @return PreReadTime 签署前置条件：强制阅读时长，页面停留时长不足则不允许签署。默认不限制
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 签署前置条件：强制阅读时长，页面停留时长不足则不允许签署。默认不限制
     * @param PreReadTime 签署前置条件：强制阅读时长，页面停留时长不足则不允许签署。默认不限制
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 签署人手机号，脱敏显示 
     * @return Mobile 签署人手机号，脱敏显示
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号，脱敏显示
     * @param Mobile 签署人手机号，脱敏显示
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 签署链接截止时间，默认签署流程发起后7天失效 
     * @return Deadline 签署链接截止时间，默认签署流程发起后7天失效
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署链接截止时间，默认签署流程发起后7天失效
     * @param Deadline 签署链接截止时间，默认签署流程发起后7天失效
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 是否为最后一个签署人, 若为最后一人，则其签署完成后自动归档 
     * @return IsLastApprover 是否为最后一个签署人, 若为最后一人，则其签署完成后自动归档
     */
    public Boolean getIsLastApprover() {
        return this.IsLastApprover;
    }

    /**
     * Set 是否为最后一个签署人, 若为最后一人，则其签署完成后自动归档
     * @param IsLastApprover 是否为最后一个签署人, 若为最后一人，则其签署完成后自动归档
     */
    public void setIsLastApprover(Boolean IsLastApprover) {
        this.IsLastApprover = IsLastApprover;
    }

    /**
     * Get 短信模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmsTemplate 短信模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmsTemplate getSmsTemplate() {
        return this.SmsTemplate;
    }

    /**
     * Set 短信模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmsTemplate 短信模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmsTemplate(SmsTemplate SmsTemplate) {
        this.SmsTemplate = SmsTemplate;
    }

    /**
     * Get 身份证号，脱敏显示 
     * @return IdCardNumber 身份证号，脱敏显示
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 身份证号，脱敏显示
     * @param IdCardNumber 身份证号，脱敏显示
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 用户姓名 
     * @return Name 用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户姓名
     * @param Name 用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否支持线下核身 
     * @return CanOffLine 是否支持线下核身
     */
    public Boolean getCanOffLine() {
        return this.CanOffLine;
    }

    /**
     * Set 是否支持线下核身
     * @param CanOffLine 是否支持线下核身
     */
    public void setCanOffLine(Boolean CanOffLine) {
        this.CanOffLine = CanOffLine;
    }

    /**
     * Get 证件号码类型：ID_CARD - 身份证，PASSPORT - 护照，MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证; 暂不支持用于电子签自有平台实名认证，MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证; 暂不支持用于电子签自有平台实名认证，HOUSEHOLD_REGISTER - 户口本; 暂不支持用于电子签自有平台实名认证，TEMP_ID_CARD - 临时居民身份证; 暂不支持用于电子签自有平台实名认证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardType 证件号码类型：ID_CARD - 身份证，PASSPORT - 护照，MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证; 暂不支持用于电子签自有平台实名认证，MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证; 暂不支持用于电子签自有平台实名认证，HOUSEHOLD_REGISTER - 户口本; 暂不支持用于电子签自有平台实名认证，TEMP_ID_CARD - 临时居民身份证; 暂不支持用于电子签自有平台实名认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 证件号码类型：ID_CARD - 身份证，PASSPORT - 护照，MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证; 暂不支持用于电子签自有平台实名认证，MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证; 暂不支持用于电子签自有平台实名认证，HOUSEHOLD_REGISTER - 户口本; 暂不支持用于电子签自有平台实名认证，TEMP_ID_CARD - 临时居民身份证; 暂不支持用于电子签自有平台实名认证
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardType 证件号码类型：ID_CARD - 身份证，PASSPORT - 护照，MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证; 暂不支持用于电子签自有平台实名认证，MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证; 暂不支持用于电子签自有平台实名认证，HOUSEHOLD_REGISTER - 户口本; 暂不支持用于电子签自有平台实名认证，TEMP_ID_CARD - 临时居民身份证; 暂不支持用于电子签自有平台实名认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 签署回调地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackUrl 签署回调地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署回调地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackUrl 签署回调地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 签署任务ID，标识每一次的流程发送
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignId 签署任务ID，标识每一次的流程发送
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署任务ID，标识每一次的流程发送
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignId 签署任务ID，标识每一次的流程发送
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    public FlowApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverInfo(FlowApproverInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String[source.VerifyChannel.length];
            for (int i = 0; i < source.VerifyChannel.length; i++) {
                this.VerifyChannel[i] = new String(source.VerifyChannel[i]);
            }
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new Long(source.ApproveStatus);
        }
        if (source.ApproveMessage != null) {
            this.ApproveMessage = new String(source.ApproveMessage);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new Long(source.ApproveTime);
        }
        if (source.SubOrganizationId != null) {
            this.SubOrganizationId = new String(source.SubOrganizationId);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.ComponentSeals != null) {
            this.ComponentSeals = new ComponentSeal[source.ComponentSeals.length];
            for (int i = 0; i < source.ComponentSeals.length; i++) {
                this.ComponentSeals[i] = new ComponentSeal(source.ComponentSeals[i]);
            }
        }
        if (source.IsFullText != null) {
            this.IsFullText = new Boolean(source.IsFullText);
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.IsLastApprover != null) {
            this.IsLastApprover = new Boolean(source.IsLastApprover);
        }
        if (source.SmsTemplate != null) {
            this.SmsTemplate = new SmsTemplate(source.SmsTemplate);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CanOffLine != null) {
            this.CanOffLine = new Boolean(source.CanOffLine);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "VerifyChannel.", this.VerifyChannel);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "ApproveMessage", this.ApproveMessage);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "SubOrganizationId", this.SubOrganizationId);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamArrayObj(map, prefix + "ComponentSeals.", this.ComponentSeals);
        this.setParamSimple(map, prefix + "IsFullText", this.IsFullText);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "IsLastApprover", this.IsLastApprover);
        this.setParamObj(map, prefix + "SmsTemplate.", this.SmsTemplate);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CanOffLine", this.CanOffLine);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

