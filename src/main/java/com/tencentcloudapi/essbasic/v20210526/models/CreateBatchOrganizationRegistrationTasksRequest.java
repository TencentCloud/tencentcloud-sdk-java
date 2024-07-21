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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchOrganizationRegistrationTasksRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 当前应用下子企业的组织机构注册信息。最多支持查询10子企业。
    */
    @SerializedName("RegistrationOrganizations")
    @Expose
    private RegistrationOrganizationInfo [] RegistrationOrganizations;

    /**
    * 生成链接的类型：
<ul><li>**PC**：(默认)web控制台链接, 需要在PC浏览器中打开</li>
<li>**CHANNEL**：H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**SHORT_URL**：H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**APP**：第三方APP或小程序跳转电子签小程序链接, 一般用于贵方小程序或者APP跳转过来,  打开后进入腾讯电子签小程序</li>
<li>**H5**：第三方H5跳转到电子签H5长链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li>
<li>**SHORT_H5**：第三方H5跳转到电子签H5短链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li></ul>


    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 当前应用下子企业的组织机构注册信息。最多支持查询10子企业。 
     * @return RegistrationOrganizations 当前应用下子企业的组织机构注册信息。最多支持查询10子企业。
     */
    public RegistrationOrganizationInfo [] getRegistrationOrganizations() {
        return this.RegistrationOrganizations;
    }

    /**
     * Set 当前应用下子企业的组织机构注册信息。最多支持查询10子企业。
     * @param RegistrationOrganizations 当前应用下子企业的组织机构注册信息。最多支持查询10子企业。
     */
    public void setRegistrationOrganizations(RegistrationOrganizationInfo [] RegistrationOrganizations) {
        this.RegistrationOrganizations = RegistrationOrganizations;
    }

    /**
     * Get 生成链接的类型：
<ul><li>**PC**：(默认)web控制台链接, 需要在PC浏览器中打开</li>
<li>**CHANNEL**：H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**SHORT_URL**：H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**APP**：第三方APP或小程序跳转电子签小程序链接, 一般用于贵方小程序或者APP跳转过来,  打开后进入腾讯电子签小程序</li>
<li>**H5**：第三方H5跳转到电子签H5长链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li>
<li>**SHORT_H5**：第三方H5跳转到电子签H5短链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li></ul>

 
     * @return Endpoint 生成链接的类型：
<ul><li>**PC**：(默认)web控制台链接, 需要在PC浏览器中打开</li>
<li>**CHANNEL**：H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**SHORT_URL**：H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**APP**：第三方APP或小程序跳转电子签小程序链接, 一般用于贵方小程序或者APP跳转过来,  打开后进入腾讯电子签小程序</li>
<li>**H5**：第三方H5跳转到电子签H5长链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li>
<li>**SHORT_H5**：第三方H5跳转到电子签H5短链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li></ul>


     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 生成链接的类型：
<ul><li>**PC**：(默认)web控制台链接, 需要在PC浏览器中打开</li>
<li>**CHANNEL**：H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**SHORT_URL**：H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**APP**：第三方APP或小程序跳转电子签小程序链接, 一般用于贵方小程序或者APP跳转过来,  打开后进入腾讯电子签小程序</li>
<li>**H5**：第三方H5跳转到电子签H5长链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li>
<li>**SHORT_H5**：第三方H5跳转到电子签H5短链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li></ul>


     * @param Endpoint 生成链接的类型：
<ul><li>**PC**：(默认)web控制台链接, 需要在PC浏览器中打开</li>
<li>**CHANNEL**：H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**SHORT_URL**：H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序</li>
<li>**APP**：第三方APP或小程序跳转电子签小程序链接, 一般用于贵方小程序或者APP跳转过来,  打开后进入腾讯电子签小程序</li>
<li>**H5**：第三方H5跳转到电子签H5长链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li>
<li>**SHORT_H5**：第三方H5跳转到电子签H5短链接, 一般用于贵方H5跳转过来,  打开后进入腾讯电子签H5页面</li></ul>


     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public CreateBatchOrganizationRegistrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchOrganizationRegistrationTasksRequest(CreateBatchOrganizationRegistrationTasksRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.RegistrationOrganizations != null) {
            this.RegistrationOrganizations = new RegistrationOrganizationInfo[source.RegistrationOrganizations.length];
            for (int i = 0; i < source.RegistrationOrganizations.length; i++) {
                this.RegistrationOrganizations[i] = new RegistrationOrganizationInfo(source.RegistrationOrganizations[i]);
            }
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "RegistrationOrganizations.", this.RegistrationOrganizations);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

