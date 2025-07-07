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
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
</ul>

    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。
注: `如果名称中包含英文括号()，请使用中文括号（）代替。`
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * 第三方平台子客企业统一社会信用代码，最大长度200个字符
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 第三方平台子客企业法定代表人的名字
    */
    @SerializedName("ProxyLegalName")
    @Expose
    private String ProxyLegalName;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 第三方平台子客企业法定代表人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>
注: `现在仅支持ID_CARD中国大陆居民身份证类型`
    */
    @SerializedName("ProxyLegalIdCardType")
    @Expose
    private String ProxyLegalIdCardType;

    /**
    * 第三方平台子客企业法定代表人的证件号码, 应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
    */
    @SerializedName("ProxyLegalIdCardNumber")
    @Expose
    private String ProxyLegalIdCardNumber;

    /**
    * 第三方平台子客企业详细住所，最大长度500个字符

注：`需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址`
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String ProxyAddress;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
</ul>
 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
</ul>

     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
</ul>

     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
</ul>

     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。
注: `如果名称中包含英文括号()，请使用中文括号（）代替。` 
     * @return ProxyOrganizationName 第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。
注: `如果名称中包含英文括号()，请使用中文括号（）代替。`
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。
注: `如果名称中包含英文括号()，请使用中文括号（）代替。`
     * @param ProxyOrganizationName 第三方平台子客企业名称，请确认该名称与企业营业执照中注册的名称一致。
注: `如果名称中包含英文括号()，请使用中文括号（）代替。`
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M 
     * @return BusinessLicense 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
     * @param BusinessLicense 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get 第三方平台子客企业统一社会信用代码，最大长度200个字符 
     * @return UniformSocialCreditCode 第三方平台子客企业统一社会信用代码，最大长度200个字符
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 第三方平台子客企业统一社会信用代码，最大长度200个字符
     * @param UniformSocialCreditCode 第三方平台子客企业统一社会信用代码，最大长度200个字符
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 第三方平台子客企业法定代表人的名字 
     * @return ProxyLegalName 第三方平台子客企业法定代表人的名字
     */
    public String getProxyLegalName() {
        return this.ProxyLegalName;
    }

    /**
     * Set 第三方平台子客企业法定代表人的名字
     * @param ProxyLegalName 第三方平台子客企业法定代表人的名字
     */
    public void setProxyLegalName(String ProxyLegalName) {
        this.ProxyLegalName = ProxyLegalName;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 第三方平台子客企业法定代表人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>
注: `现在仅支持ID_CARD中国大陆居民身份证类型` 
     * @return ProxyLegalIdCardType 第三方平台子客企业法定代表人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>
注: `现在仅支持ID_CARD中国大陆居民身份证类型`
     */
    public String getProxyLegalIdCardType() {
        return this.ProxyLegalIdCardType;
    }

    /**
     * Set 第三方平台子客企业法定代表人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>
注: `现在仅支持ID_CARD中国大陆居民身份证类型`
     * @param ProxyLegalIdCardType 第三方平台子客企业法定代表人的证件类型，支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证 (默认值)</li></ul>
注: `现在仅支持ID_CARD中国大陆居民身份证类型`
     */
    public void setProxyLegalIdCardType(String ProxyLegalIdCardType) {
        this.ProxyLegalIdCardType = ProxyLegalIdCardType;
    }

    /**
     * Get 第三方平台子客企业法定代表人的证件号码, 应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul> 
     * @return ProxyLegalIdCardNumber 第三方平台子客企业法定代表人的证件号码, 应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
     */
    public String getProxyLegalIdCardNumber() {
        return this.ProxyLegalIdCardNumber;
    }

    /**
     * Set 第三方平台子客企业法定代表人的证件号码, 应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
     * @param ProxyLegalIdCardNumber 第三方平台子客企业法定代表人的证件号码, 应符合以下规则
<ul><li>中国大陆居民身份证号码应为18位字符串，由数字和大写字母X组成（如存在X，请大写）。</li></ul>
     */
    public void setProxyLegalIdCardNumber(String ProxyLegalIdCardNumber) {
        this.ProxyLegalIdCardNumber = ProxyLegalIdCardNumber;
    }

    /**
     * Get 第三方平台子客企业详细住所，最大长度500个字符

注：`需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址` 
     * @return ProxyAddress 第三方平台子客企业详细住所，最大长度500个字符

注：`需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址`
     */
    public String getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set 第三方平台子客企业详细住所，最大长度500个字符

注：`需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址`
     * @param ProxyAddress 第三方平台子客企业详细住所，最大长度500个字符

注：`需要符合省市区详情的格式例如： XX省XX市XX区街道具体地址`
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

