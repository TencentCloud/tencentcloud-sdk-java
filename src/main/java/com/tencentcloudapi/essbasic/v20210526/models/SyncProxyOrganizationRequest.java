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

public class SyncProxyOrganizationRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li></ul>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * <p>营业执照正面照(PNG或JPG) base64格式, 大小不超过5M</p>
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * <p>第三方平台子客企业统一社会信用代码，最大长度200个字符</p>
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * <p>第三方平台子客企业法定代表人的名字</p>
    */
    @SerializedName("ProxyLegalName")
    @Expose
    private String ProxyLegalName;

    /**
    * <p>暂未开放</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>第三方平台子客企业法定代表人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>注: <code>现在仅支持ID_CARD中国大陆居民身份证类型</code>
    */
    @SerializedName("ProxyLegalIdCardType")
    @Expose
    private String ProxyLegalIdCardType;

    /**
    * <p>第三方平台子客企业法定代表人的证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
    */
    @SerializedName("ProxyLegalIdCardNumber")
    @Expose
    private String ProxyLegalIdCardNumber;

    /**
    * <p>第三方平台子客企业详细住所，最大长度500个字符</p><p>注：<code>需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址</code></p>
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String ProxyAddress;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li></ul> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li></ul>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li></ul>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li></ul>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p> 
     * @return ProxyOrganizationName <p>第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set <p>第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
     * @param ProxyOrganizationName <p>第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。<br>注: <code>如果名称中包含英文括号()，请使用中文括号（）代替。</code></p>
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get <p>营业执照正面照(PNG或JPG) base64格式, 大小不超过5M</p> 
     * @return BusinessLicense <p>营业执照正面照(PNG或JPG) base64格式, 大小不超过5M</p>
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set <p>营业执照正面照(PNG或JPG) base64格式, 大小不超过5M</p>
     * @param BusinessLicense <p>营业执照正面照(PNG或JPG) base64格式, 大小不超过5M</p>
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get <p>第三方平台子客企业统一社会信用代码，最大长度200个字符</p> 
     * @return UniformSocialCreditCode <p>第三方平台子客企业统一社会信用代码，最大长度200个字符</p>
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set <p>第三方平台子客企业统一社会信用代码，最大长度200个字符</p>
     * @param UniformSocialCreditCode <p>第三方平台子客企业统一社会信用代码，最大长度200个字符</p>
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get <p>第三方平台子客企业法定代表人的名字</p> 
     * @return ProxyLegalName <p>第三方平台子客企业法定代表人的名字</p>
     */
    public String getProxyLegalName() {
        return this.ProxyLegalName;
    }

    /**
     * Set <p>第三方平台子客企业法定代表人的名字</p>
     * @param ProxyLegalName <p>第三方平台子客企业法定代表人的名字</p>
     */
    public void setProxyLegalName(String ProxyLegalName) {
        this.ProxyLegalName = ProxyLegalName;
    }

    /**
     * Get <p>暂未开放</p> 
     * @return Operator <p>暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>暂未开放</p>
     * @param Operator <p>暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>第三方平台子客企业法定代表人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>注: <code>现在仅支持ID_CARD中国大陆居民身份证类型</code> 
     * @return ProxyLegalIdCardType <p>第三方平台子客企业法定代表人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>注: <code>现在仅支持ID_CARD中国大陆居民身份证类型</code>
     */
    public String getProxyLegalIdCardType() {
        return this.ProxyLegalIdCardType;
    }

    /**
     * Set <p>第三方平台子客企业法定代表人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>注: <code>现在仅支持ID_CARD中国大陆居民身份证类型</code>
     * @param ProxyLegalIdCardType <p>第三方平台子客企业法定代表人的证件类型，支持以下类型</p><ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>注: <code>现在仅支持ID_CARD中国大陆居民身份证类型</code>
     */
    public void setProxyLegalIdCardType(String ProxyLegalIdCardType) {
        this.ProxyLegalIdCardType = ProxyLegalIdCardType;
    }

    /**
     * Get <p>第三方平台子客企业法定代表人的证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul> 
     * @return ProxyLegalIdCardNumber <p>第三方平台子客企业法定代表人的证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
     */
    public String getProxyLegalIdCardNumber() {
        return this.ProxyLegalIdCardNumber;
    }

    /**
     * Set <p>第三方平台子客企业法定代表人的证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
     * @param ProxyLegalIdCardNumber <p>第三方平台子客企业法定代表人的证件号码, 应符合以下规则</p><ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
     */
    public void setProxyLegalIdCardNumber(String ProxyLegalIdCardNumber) {
        this.ProxyLegalIdCardNumber = ProxyLegalIdCardNumber;
    }

    /**
     * Get <p>第三方平台子客企业详细住所，最大长度500个字符</p><p>注：<code>需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址</code></p> 
     * @return ProxyAddress <p>第三方平台子客企业详细住所，最大长度500个字符</p><p>注：<code>需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址</code></p>
     */
    public String getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set <p>第三方平台子客企业详细住所，最大长度500个字符</p><p>注：<code>需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址</code></p>
     * @param ProxyAddress <p>第三方平台子客企业详细住所，最大长度500个字符</p><p>注：<code>需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址</code></p>
     */
    public void setProxyAddress(String ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    public SyncProxyOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncProxyOrganizationRequest(SyncProxyOrganizationRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ProxyOrganizationName != null) {
            this.ProxyOrganizationName = new String(source.ProxyOrganizationName);
        }
        if (source.BusinessLicense != null) {
            this.BusinessLicense = new String(source.BusinessLicense);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.ProxyLegalName != null) {
            this.ProxyLegalName = new String(source.ProxyLegalName);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ProxyLegalIdCardType != null) {
            this.ProxyLegalIdCardType = new String(source.ProxyLegalIdCardType);
        }
        if (source.ProxyLegalIdCardNumber != null) {
            this.ProxyLegalIdCardNumber = new String(source.ProxyLegalIdCardNumber);
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new String(source.ProxyAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ProxyOrganizationName", this.ProxyOrganizationName);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "ProxyLegalName", this.ProxyLegalName);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ProxyLegalIdCardType", this.ProxyLegalIdCardType);
        this.setParamSimple(map, prefix + "ProxyLegalIdCardNumber", this.ProxyLegalIdCardNumber);
        this.setParamSimple(map, prefix + "ProxyAddress", this.ProxyAddress);

    }
}

