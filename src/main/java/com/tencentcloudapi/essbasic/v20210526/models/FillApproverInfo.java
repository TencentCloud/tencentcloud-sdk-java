/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class FillApproverInfo extends AbstractModel {

    /**
    * <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。</p>
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * <p>指定企业经办签署人OpenId</p><p>注: <code>签署人OpenId未实名时，需要传入签署人姓名以及手机号码。</code></p>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>签署人姓名</p>
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>签署人手机号码</p>
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * <p>企业名称</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>企业OpenId</p>
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * <p>签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，OrganizationOpenId 必传</p>
    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private Boolean NotChannelOrganization;

    /**
    * <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注:补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
    */
    @SerializedName("ApproverIdCardType")
    @Expose
    private String ApproverIdCardType;

    /**
    * <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
    */
    @SerializedName("ApproverIdCardNumber")
    @Expose
    private String ApproverIdCardNumber;

    /**
    * <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充正常合同，请阅读：<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelCreateFlowApprovers/" target="_blank">补充签署人接口</a>接口使用说明</li></ul>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
     * Get <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。</p> 
     * @return RecipientId <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。</p>
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。</p>
     * @param RecipientId <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。</p>
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get <p>指定企业经办签署人OpenId</p><p>注: <code>签署人OpenId未实名时，需要传入签署人姓名以及手机号码。</code></p> 
     * @return OpenId <p>指定企业经办签署人OpenId</p><p>注: <code>签署人OpenId未实名时，需要传入签署人姓名以及手机号码。</code></p>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>指定企业经办签署人OpenId</p><p>注: <code>签署人OpenId未实名时，需要传入签署人姓名以及手机号码。</code></p>
     * @param OpenId <p>指定企业经办签署人OpenId</p><p>注: <code>签署人OpenId未实名时，需要传入签署人姓名以及手机号码。</code></p>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get <p>签署人姓名</p> 
     * @return ApproverName <p>签署人姓名</p>
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>签署人姓名</p>
     * @param ApproverName <p>签署人姓名</p>
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>签署人手机号码</p> 
     * @return ApproverMobile <p>签署人手机号码</p>
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set <p>签署人手机号码</p>
     * @param ApproverMobile <p>签署人手机号码</p>
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get <p>企业名称</p> 
     * @return OrganizationName <p>企业名称</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>企业名称</p>
     * @param OrganizationName <p>企业名称</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>企业OpenId</p> 
     * @return OrganizationOpenId <p>企业OpenId</p>
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set <p>企业OpenId</p>
     * @param OrganizationOpenId <p>企业OpenId</p>
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get <p>签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，OrganizationOpenId 必传</p> 
     * @return NotChannelOrganization <p>签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，OrganizationOpenId 必传</p>
     */
    public Boolean getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set <p>签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，OrganizationOpenId 必传</p>
     * @param NotChannelOrganization <p>签署企业非渠道子客，默认为false，即表示同一渠道下的企业；如果为true，则目前表示接收方企业为SaaS企业, 为渠道子客时，OrganizationOpenId 必传</p>
     */
    public void setNotChannelOrganization(Boolean NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    /**
     * Get <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注:补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p> 
     * @return ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注:补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注:补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
     * @param ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注:补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
     */
    public void setApproverIdCardType(String ApproverIdCardType) {
        this.ApproverIdCardType = ApproverIdCardType;
    }

    /**
     * Get <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p> 
     * @return ApproverIdCardNumber <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
     */
    public String getApproverIdCardNumber() {
        return this.ApproverIdCardNumber;
    }

    /**
     * Set <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
     * @param ApproverIdCardNumber <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字。</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串。</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
     */
    public void setApproverIdCardNumber(String ApproverIdCardNumber) {
        this.ApproverIdCardNumber = ApproverIdCardNumber;
    }

    /**
     * Get <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充正常合同，请阅读：<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelCreateFlowApprovers/" target="_blank">补充签署人接口</a>接口使用说明</li></ul> 
     * @return FlowId <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充正常合同，请阅读：<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelCreateFlowApprovers/" target="_blank">补充签署人接口</a>接口使用说明</li></ul>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充正常合同，请阅读：<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelCreateFlowApprovers/" target="_blank">补充签署人接口</a>接口使用说明</li></ul>
     * @param FlowId <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充正常合同，请阅读：<a href="https://qian.tencent.com/developers/partnerApis/flows/ChannelCreateFlowApprovers/" target="_blank">补充签署人接口</a>接口使用说明</li></ul>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    public FillApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FillApproverInfo(FillApproverInfo source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
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
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "NotChannelOrganization", this.NotChannelOrganization);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

