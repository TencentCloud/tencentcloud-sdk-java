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

public class ChannelCreateFlowRemindsRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业标识: Agent. ProxyOperator.OpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.AppId</li>
</ul>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 需执行催办的签署流程ID数组，最多包含100个。
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业标识: Agent. ProxyOperator.OpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.AppId</li>
</ul> 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业标识: Agent. ProxyOperator.OpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.AppId</li>
</ul>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业标识: Agent. ProxyOperator.OpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.AppId</li>
</ul>
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业标识: Agent. ProxyOperator.OpenId</li>
<li>第三方平台子客企业中的员工标识: Agent.AppId</li>
</ul>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 需执行催办的签署流程ID数组，最多包含100个。 
     * @return FlowIds 需执行催办的签署流程ID数组，最多包含100个。
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 需执行催办的签署流程ID数组，最多包含100个。
     * @param FlowIds 需执行催办的签署流程ID数组，最多包含100个。
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    public ChannelCreateFlowRemindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowRemindsRequest(ChannelCreateFlowRemindsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);

    }
}

