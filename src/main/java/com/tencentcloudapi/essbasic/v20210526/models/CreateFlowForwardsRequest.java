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

public class CreateFlowForwardsRequest extends AbstractModel {

    /**
    * 合同对应参与方需要修改的目标经办人对应的OpenId。

注意：`需要保证目标经办人已经加入企业且已实名`
    */
    @SerializedName("TargetOpenId")
    @Expose
    private String TargetOpenId;

    /**
    * 企业签署方的合同及对应签署方
    */
    @SerializedName("FlowForwardInfos")
    @Expose
    private FlowForwardInfo [] FlowForwardInfos;

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 合同对应参与方需要修改的目标经办人对应的OpenId。

注意：`需要保证目标经办人已经加入企业且已实名` 
     * @return TargetOpenId 合同对应参与方需要修改的目标经办人对应的OpenId。

注意：`需要保证目标经办人已经加入企业且已实名`
     */
    public String getTargetOpenId() {
        return this.TargetOpenId;
    }

    /**
     * Set 合同对应参与方需要修改的目标经办人对应的OpenId。

注意：`需要保证目标经办人已经加入企业且已实名`
     * @param TargetOpenId 合同对应参与方需要修改的目标经办人对应的OpenId。

注意：`需要保证目标经办人已经加入企业且已实名`
     */
    public void setTargetOpenId(String TargetOpenId) {
        this.TargetOpenId = TargetOpenId;
    }

    /**
     * Get 企业签署方的合同及对应签署方 
     * @return FlowForwardInfos 企业签署方的合同及对应签署方
     */
    public FlowForwardInfo [] getFlowForwardInfos() {
        return this.FlowForwardInfos;
    }

    /**
     * Set 企业签署方的合同及对应签署方
     * @param FlowForwardInfos 企业签署方的合同及对应签署方
     */
    public void setFlowForwardInfos(FlowForwardInfo [] FlowForwardInfos) {
        this.FlowForwardInfos = FlowForwardInfos;
    }

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。此接口下面信息必填。<ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
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

