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

public class CreateChannelSubOrganizationActiveRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>要进行激活或者续期的子客企业OrganizationOpenId列表，请确保所有列出的子客企业均已完成认证。</p>
    */
    @SerializedName("SubOrganizationOpenIds")
    @Expose
    private String [] SubOrganizationOpenIds;

    /**
    * <p>操作类型，可以选择如下：</p><p><strong>false</strong>：（默认）激活子客企业<br><strong>true</strong>：续期子客企业</p>
    */
    @SerializedName("Renew")
    @Expose
    private Boolean Renew;

    /**
    * <p>是否解绑子企业</p><p>枚举值：</p><ul><li>false： 否</li><li>true： 是：解绑后，份额将会返还，但是该子企业无法再次被激活</li></ul><p>默认值：false</p>
    */
    @SerializedName("Unbind")
    @Expose
    private Boolean Unbind;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>要进行激活或者续期的子客企业OrganizationOpenId列表，请确保所有列出的子客企业均已完成认证。</p> 
     * @return SubOrganizationOpenIds <p>要进行激活或者续期的子客企业OrganizationOpenId列表，请确保所有列出的子客企业均已完成认证。</p>
     */
    public String [] getSubOrganizationOpenIds() {
        return this.SubOrganizationOpenIds;
    }

    /**
     * Set <p>要进行激活或者续期的子客企业OrganizationOpenId列表，请确保所有列出的子客企业均已完成认证。</p>
     * @param SubOrganizationOpenIds <p>要进行激活或者续期的子客企业OrganizationOpenId列表，请确保所有列出的子客企业均已完成认证。</p>
     */
    public void setSubOrganizationOpenIds(String [] SubOrganizationOpenIds) {
        this.SubOrganizationOpenIds = SubOrganizationOpenIds;
    }

    /**
     * Get <p>操作类型，可以选择如下：</p><p><strong>false</strong>：（默认）激活子客企业<br><strong>true</strong>：续期子客企业</p> 
     * @return Renew <p>操作类型，可以选择如下：</p><p><strong>false</strong>：（默认）激活子客企业<br><strong>true</strong>：续期子客企业</p>
     */
    public Boolean getRenew() {
        return this.Renew;
    }

    /**
     * Set <p>操作类型，可以选择如下：</p><p><strong>false</strong>：（默认）激活子客企业<br><strong>true</strong>：续期子客企业</p>
     * @param Renew <p>操作类型，可以选择如下：</p><p><strong>false</strong>：（默认）激活子客企业<br><strong>true</strong>：续期子客企业</p>
     */
    public void setRenew(Boolean Renew) {
        this.Renew = Renew;
    }

    /**
     * Get <p>是否解绑子企业</p><p>枚举值：</p><ul><li>false： 否</li><li>true： 是：解绑后，份额将会返还，但是该子企业无法再次被激活</li></ul><p>默认值：false</p> 
     * @return Unbind <p>是否解绑子企业</p><p>枚举值：</p><ul><li>false： 否</li><li>true： 是：解绑后，份额将会返还，但是该子企业无法再次被激活</li></ul><p>默认值：false</p>
     */
    public Boolean getUnbind() {
        return this.Unbind;
    }

    /**
     * Set <p>是否解绑子企业</p><p>枚举值：</p><ul><li>false： 否</li><li>true： 是：解绑后，份额将会返还，但是该子企业无法再次被激活</li></ul><p>默认值：false</p>
     * @param Unbind <p>是否解绑子企业</p><p>枚举值：</p><ul><li>false： 否</li><li>true： 是：解绑后，份额将会返还，但是该子企业无法再次被激活</li></ul><p>默认值：false</p>
     */
    public void setUnbind(Boolean Unbind) {
        this.Unbind = Unbind;
    }

    public CreateChannelSubOrganizationActiveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChannelSubOrganizationActiveRequest(CreateChannelSubOrganizationActiveRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SubOrganizationOpenIds != null) {
            this.SubOrganizationOpenIds = new String[source.SubOrganizationOpenIds.length];
            for (int i = 0; i < source.SubOrganizationOpenIds.length; i++) {
                this.SubOrganizationOpenIds[i] = new String(source.SubOrganizationOpenIds[i]);
            }
        }
        if (source.Renew != null) {
            this.Renew = new Boolean(source.Renew);
        }
        if (source.Unbind != null) {
            this.Unbind = new Boolean(source.Unbind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "SubOrganizationOpenIds.", this.SubOrganizationOpenIds);
        this.setParamSimple(map, prefix + "Renew", this.Renew);
        this.setParamSimple(map, prefix + "Unbind", this.Unbind);

    }
}

