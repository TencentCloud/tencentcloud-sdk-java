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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverInfo extends AbstractModel{

    /**
    * 签署人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 经办人身份证号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署人手机号，脱敏显示
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署完前端跳转的url，暂未使用
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 签署截止时间
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署完回调url
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 签署人类型，PERSON-个人；ORGANIZATION-企业；
ENTERPRISESERVER-企业静默签;
注：ENTERPRISESERVER 类型仅用于使用文件创建流程（ChannelCreateFlowByFiles）接口；并且仅能指定发起方企业签署方为静默签署；
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 用户侧第三方id
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 合同的强制预览时间：3~300s，未指定则按合同页数计算
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 个人签署方指定签署控件类型，目前仅支持：OCR_ESIGN(AI智慧手写签名)
    */
    @SerializedName("ComponentLimitType")
    @Expose
    private String [] ComponentLimitType;

    /**
    * 流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在流程中的位置；
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传；
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传；
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 指定签署人非渠道企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个渠道应用号下；
    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private Boolean NotChannelOrganization;

    /**
    * 使用PDF文件直接发起合同时，签署人指定的签署控件
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
     * Get 签署人姓名 
     * @return Name 签署人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名
     * @param Name 签署人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 经办人身份证号 
     * @return IdCardNumber 经办人身份证号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 经办人身份证号
     * @param IdCardNumber 经办人身份证号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
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
     * Get 签署完前端跳转的url，暂未使用 
     * @return JumpUrl 签署完前端跳转的url，暂未使用
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完前端跳转的url，暂未使用
     * @param JumpUrl 签署完前端跳转的url，暂未使用
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 签署截止时间 
     * @return Deadline 签署截止时间
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署截止时间
     * @param Deadline 签署截止时间
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 签署完回调url 
     * @return CallbackUrl 签署完回调url
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署完回调url
     * @param CallbackUrl 签署完回调url
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 签署人类型，PERSON-个人；ORGANIZATION-企业；
ENTERPRISESERVER-企业静默签;
注：ENTERPRISESERVER 类型仅用于使用文件创建流程（ChannelCreateFlowByFiles）接口；并且仅能指定发起方企业签署方为静默签署； 
     * @return ApproverType 签署人类型，PERSON-个人；ORGANIZATION-企业；
ENTERPRISESERVER-企业静默签;
注：ENTERPRISESERVER 类型仅用于使用文件创建流程（ChannelCreateFlowByFiles）接口；并且仅能指定发起方企业签署方为静默签署；
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型，PERSON-个人；ORGANIZATION-企业；
ENTERPRISESERVER-企业静默签;
注：ENTERPRISESERVER 类型仅用于使用文件创建流程（ChannelCreateFlowByFiles）接口；并且仅能指定发起方企业签署方为静默签署；
     * @param ApproverType 签署人类型，PERSON-个人；ORGANIZATION-企业；
ENTERPRISESERVER-企业静默签;
注：ENTERPRISESERVER 类型仅用于使用文件创建流程（ChannelCreateFlowByFiles）接口；并且仅能指定发起方企业签署方为静默签署；
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 用户侧第三方id 
     * @return OpenId 用户侧第三方id
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户侧第三方id
     * @param OpenId 用户侧第三方id
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
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
     * Get 个人签署方指定签署控件类型，目前仅支持：OCR_ESIGN(AI智慧手写签名) 
     * @return ComponentLimitType 个人签署方指定签署控件类型，目前仅支持：OCR_ESIGN(AI智慧手写签名)
     */
    public String [] getComponentLimitType() {
        return this.ComponentLimitType;
    }

    /**
     * Set 个人签署方指定签署控件类型，目前仅支持：OCR_ESIGN(AI智慧手写签名)
     * @param ComponentLimitType 个人签署方指定签署控件类型，目前仅支持：OCR_ESIGN(AI智慧手写签名)
     */
    public void setComponentLimitType(String [] ComponentLimitType) {
        this.ComponentLimitType = ComponentLimitType;
    }

    /**
     * Get 流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在流程中的位置； 
     * @return RecipientId 流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在流程中的位置；
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在流程中的位置；
     * @param RecipientId 流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在流程中的位置；
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传； 
     * @return OrganizationName 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传；
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传；
     * @param OrganizationName 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传；
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传； 
     * @return OrganizationOpenId 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传；
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传；
     * @param OrganizationOpenId 企业签署方在同一渠道下的其他合作企业OpenId，签署方为非发起方企业场景下必传；
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 指定签署人非渠道企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个渠道应用号下； 
     * @return NotChannelOrganization 指定签署人非渠道企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个渠道应用号下；
     */
    public Boolean getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set 指定签署人非渠道企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个渠道应用号下；
     * @param NotChannelOrganization 指定签署人非渠道企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个渠道应用号下；
     */
    public void setNotChannelOrganization(Boolean NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    /**
     * Get 使用PDF文件直接发起合同时，签署人指定的签署控件 
     * @return SignComponents 使用PDF文件直接发起合同时，签署人指定的签署控件
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 使用PDF文件直接发起合同时，签署人指定的签署控件
     * @param SignComponents 使用PDF文件直接发起合同时，签署人指定的签署控件
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    public FlowApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverInfo(FlowApproverInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.ComponentLimitType != null) {
            this.ComponentLimitType = new String[source.ComponentLimitType.length];
            for (int i = 0; i < source.ComponentLimitType.length; i++) {
                this.ComponentLimitType[i] = new String(source.ComponentLimitType[i]);
            }
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.NotChannelOrganization != null) {
            this.NotChannelOrganization = new Boolean(source.NotChannelOrganization);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamArraySimple(map, prefix + "ComponentLimitType.", this.ComponentLimitType);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "NotChannelOrganization", this.NotChannelOrganization);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);

    }
}

