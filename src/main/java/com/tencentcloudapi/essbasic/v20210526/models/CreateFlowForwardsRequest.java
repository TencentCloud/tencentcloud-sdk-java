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

public class CreateFlowForwardsRequest extends AbstractModel {

    /**
    * <p>合同对应参与方需要修改的目标经办人对应的OpenId。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
    */
    @SerializedName("TargetOpenId")
    @Expose
    private String TargetOpenId;

    /**
    * <p>企业签署方的合同及对应签署方</p>
    */
    @SerializedName("FlowForwardInfos")
    @Expose
    private FlowForwardInfo [] FlowForwardInfos;

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>合同对应参与方需要修改的目标经办人对应的OpenId。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p> 
     * @return TargetOpenId <p>合同对应参与方需要修改的目标经办人对应的OpenId。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
     */
    public String getTargetOpenId() {
        return this.TargetOpenId;
    }

    /**
     * Set <p>合同对应参与方需要修改的目标经办人对应的OpenId。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
     * @param TargetOpenId <p>合同对应参与方需要修改的目标经办人对应的OpenId。</p><p>注意：<code>需要保证目标经办人已经加入企业且已实名</code></p>
     */
    public void setTargetOpenId(String TargetOpenId) {
        this.TargetOpenId = TargetOpenId;
    }

    /**
     * Get <p>企业签署方的合同及对应签署方</p> 
     * @return FlowForwardInfos <p>企业签署方的合同及对应签署方</p>
     */
    public FlowForwardInfo [] getFlowForwardInfos() {
        return this.FlowForwardInfos;
    }

    /**
     * Set <p>企业签署方的合同及对应签署方</p>
     * @param FlowForwardInfos <p>企业签署方的合同及对应签署方</p>
     */
    public void setFlowForwardInfos(FlowForwardInfo [] FlowForwardInfos) {
        this.FlowForwardInfos = FlowForwardInfos;
    }

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public CreateFlowForwardsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowForwardsRequest(CreateFlowForwardsRequest source) {
        if (source.TargetOpenId != null) {
            this.TargetOpenId = new String(source.TargetOpenId);
        }
        if (source.FlowForwardInfos != null) {
            this.FlowForwardInfos = new FlowForwardInfo[source.FlowForwardInfos.length];
            for (int i = 0; i < source.FlowForwardInfos.length; i++) {
                this.FlowForwardInfos[i] = new FlowForwardInfo(source.FlowForwardInfos[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetOpenId", this.TargetOpenId);
        this.setParamArrayObj(map, prefix + "FlowForwardInfos.", this.FlowForwardInfos);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

