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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FillApproverInfo extends AbstractModel {

    /**
    * <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。<br>模板发起合同时，该参数为必填项。<br>文件发起合同时，该参数无需传值。<br>如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。</p>
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * <p>签署人来源<br>WEWORKAPP: 企业微信<br><br>仅【企微或签】时指定WEWORKAPP</p>
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * <p>企业微信UserId<br><br>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId</p>
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * <p>企业签署人的员工姓名。除企业微信应用场景（ApproverSource设置为WEWORKAPP）外，本字段为必填。</p>
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>补充企业签署人员工手机号</p><ul><li>ApproverSource!=WEWORKAPP时，必传</li></ul>
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * <p>补充企业动态签署人时，需要指定对应企业名称</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注: 补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
    */
    @SerializedName("ApproverIdCardType")
    @Expose
    private String ApproverIdCardType;

    /**
    * <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
    */
    @SerializedName("ApproverIdCardNumber")
    @Expose
    private String ApproverIdCardNumber;

    /**
    * <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充普通合同时，请阅读：<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowApprovers/" target="_blank">补充签署人接口</a>的接口使用说明</li></ul>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>通知类型：</p><li>当FillApproverType =0，或签场景补充签署人时，指定是否发送或签领取短信</li><li>SMS：开启或签领取短信通知</li><li>NONE：关闭或签领取短信通知</li><li>当NotifyType=NONE时，可调用<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateSchemeUrl" target="_blank" rel="noopener noreferrer">获取跳转至腾讯电子签小程序的签署链接</a>接口生成签署链接来完成或签领取</li>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
     * Get <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。<br>模板发起合同时，该参数为必填项。<br>文件发起合同时，该参数无需传值。<br>如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。</p> 
     * @return RecipientId <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。<br>模板发起合同时，该参数为必填项。<br>文件发起合同时，该参数无需传值。<br>如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。</p>
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。<br>模板发起合同时，该参数为必填项。<br>文件发起合同时，该参数无需传值。<br>如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。</p>
     * @param RecipientId <p>签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。<br>模板发起合同时，该参数为必填项。<br>文件发起合同时，该参数无需传值。<br>如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。</p>
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get <p>签署人来源<br>WEWORKAPP: 企业微信<br><br>仅【企微或签】时指定WEWORKAPP</p> 
     * @return ApproverSource <p>签署人来源<br>WEWORKAPP: 企业微信<br><br>仅【企微或签】时指定WEWORKAPP</p>
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set <p>签署人来源<br>WEWORKAPP: 企业微信<br><br>仅【企微或签】时指定WEWORKAPP</p>
     * @param ApproverSource <p>签署人来源<br>WEWORKAPP: 企业微信<br><br>仅【企微或签】时指定WEWORKAPP</p>
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get <p>企业微信UserId<br><br>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId</p> 
     * @return CustomUserId <p>企业微信UserId<br><br>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId</p>
     */
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set <p>企业微信UserId<br><br>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId</p>
     * @param CustomUserId <p>企业微信UserId<br><br>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId</p>
     */
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    /**
     * Get <p>企业签署人的员工姓名。除企业微信应用场景（ApproverSource设置为WEWORKAPP）外，本字段为必填。</p> 
     * @return ApproverName <p>企业签署人的员工姓名。除企业微信应用场景（ApproverSource设置为WEWORKAPP）外，本字段为必填。</p>
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>企业签署人的员工姓名。除企业微信应用场景（ApproverSource设置为WEWORKAPP）外，本字段为必填。</p>
     * @param ApproverName <p>企业签署人的员工姓名。除企业微信应用场景（ApproverSource设置为WEWORKAPP）外，本字段为必填。</p>
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>补充企业签署人员工手机号</p><ul><li>ApproverSource!=WEWORKAPP时，必传</li></ul> 
     * @return ApproverMobile <p>补充企业签署人员工手机号</p><ul><li>ApproverSource!=WEWORKAPP时，必传</li></ul>
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set <p>补充企业签署人员工手机号</p><ul><li>ApproverSource!=WEWORKAPP时，必传</li></ul>
     * @param ApproverMobile <p>补充企业签署人员工手机号</p><ul><li>ApproverSource!=WEWORKAPP时，必传</li></ul>
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get <p>补充企业动态签署人时，需要指定对应企业名称</p> 
     * @return OrganizationName <p>补充企业动态签署人时，需要指定对应企业名称</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>补充企业动态签署人时，需要指定对应企业名称</p>
     * @param OrganizationName <p>补充企业动态签署人时，需要指定对应企业名称</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注: 补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p> 
     * @return ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注: 补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注: 补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
     * @param ApproverIdCardType <p>签署方经办人的证件类型，支持以下类型</p><ul><li>ID_CARD 中国大陆居民身份证</li><li>HONGKONG_AND_MACAO 中国港澳居民来往内地通行证</li><li>HONGKONG_MACAO_AND_TAIWAN 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul><p>注: 补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</p>
     */
    public void setApproverIdCardType(String ApproverIdCardType) {
        this.ApproverIdCardType = ApproverIdCardType;
    }

    /**
     * Get <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p> 
     * @return ApproverIdCardNumber <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
     */
    public String getApproverIdCardNumber() {
        return this.ApproverIdCardNumber;
    }

    /**
     * Set <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
     * @param ApproverIdCardNumber <p>签署方经办人的证件号码，应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li><li>中国港澳居民来往内地通行证号码共11位。第1位为字母，“H”字头签发给中国香港居民，“M”字头签发给中国澳门居民；第2位至第11位为数字</li><li>中国港澳台居民居住证号码编码规则与中国大陆身份证相同，应为18位字符串</li></ul><p>注：<code>补充个人签署方时，若该用户已在电子签完成实名则可通过指定姓名和证件类型、证件号码完成补充。</code></p>
     */
    public void setApproverIdCardNumber(String ApproverIdCardNumber) {
        this.ApproverIdCardNumber = ApproverIdCardNumber;
    }

    /**
     * Get <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充普通合同时，请阅读：<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowApprovers/" target="_blank">补充签署人接口</a>的接口使用说明</li></ul> 
     * @return FlowId <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充普通合同时，请阅读：<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowApprovers/" target="_blank">补充签署人接口</a>的接口使用说明</li></ul>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充普通合同时，请阅读：<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowApprovers/" target="_blank">补充签署人接口</a>的接口使用说明</li></ul>
     * @param FlowId <p>合同流程ID</p><ul><li>补充合同组子合同动态签署人时必传。</li><li>补充普通合同时，请阅读：<a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowApprovers/" target="_blank">补充签署人接口</a>的接口使用说明</li></ul>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>通知类型：</p><li>当FillApproverType =0，或签场景补充签署人时，指定是否发送或签领取短信</li><li>SMS：开启或签领取短信通知</li><li>NONE：关闭或签领取短信通知</li><li>当NotifyType=NONE时，可调用<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateSchemeUrl" target="_blank" rel="noopener noreferrer">获取跳转至腾讯电子签小程序的签署链接</a>接口生成签署链接来完成或签领取</li> 
     * @return NotifyType <p>通知类型：</p><li>当FillApproverType =0，或签场景补充签署人时，指定是否发送或签领取短信</li><li>SMS：开启或签领取短信通知</li><li>NONE：关闭或签领取短信通知</li><li>当NotifyType=NONE时，可调用<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateSchemeUrl" target="_blank" rel="noopener noreferrer">获取跳转至腾讯电子签小程序的签署链接</a>接口生成签署链接来完成或签领取</li>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set <p>通知类型：</p><li>当FillApproverType =0，或签场景补充签署人时，指定是否发送或签领取短信</li><li>SMS：开启或签领取短信通知</li><li>NONE：关闭或签领取短信通知</li><li>当NotifyType=NONE时，可调用<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateSchemeUrl" target="_blank" rel="noopener noreferrer">获取跳转至腾讯电子签小程序的签署链接</a>接口生成签署链接来完成或签领取</li>
     * @param NotifyType <p>通知类型：</p><li>当FillApproverType =0，或签场景补充签署人时，指定是否发送或签领取短信</li><li>SMS：开启或签领取短信通知</li><li>NONE：关闭或签领取短信通知</li><li>当NotifyType=NONE时，可调用<a href="https://qian.tencent.com/developers/companyApis/startFlows/CreateSchemeUrl" target="_blank" rel="noopener noreferrer">获取跳转至腾讯电子签小程序的签署链接</a>接口生成签署链接来完成或签领取</li>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
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
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
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
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);

    }
}

