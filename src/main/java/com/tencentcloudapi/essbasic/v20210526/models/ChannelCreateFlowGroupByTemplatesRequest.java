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

public class ChannelCreateFlowGroupByTemplatesRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 每个子合同的发起所需的信息，数量限制2-50（合同组暂不支持抄送功能）
    */
    @SerializedName("FlowInfos")
    @Expose
    private FlowInfo [] FlowInfos;

    /**
    * 合同组名称，长度不超过200个字符
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 每个子合同的发起所需的信息，数量限制2-50（合同组暂不支持抄送功能） 
     * @return FlowInfos 每个子合同的发起所需的信息，数量限制2-50（合同组暂不支持抄送功能）
     */
    public FlowInfo [] getFlowInfos() {
        return this.FlowInfos;
    }

    /**
     * Set 每个子合同的发起所需的信息，数量限制2-50（合同组暂不支持抄送功能）
     * @param FlowInfos 每个子合同的发起所需的信息，数量限制2-50（合同组暂不支持抄送功能）
     */
    public void setFlowInfos(FlowInfo [] FlowInfos) {
        this.FlowInfos = FlowInfos;
    }

    /**
     * Get 合同组名称，长度不超过200个字符 
     * @return FlowGroupName 合同组名称，长度不超过200个字符
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set 合同组名称，长度不超过200个字符
     * @param FlowGroupName 合同组名称，长度不超过200个字符
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    public ChannelCreateFlowGroupByTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowGroupByTemplatesRequest(ChannelCreateFlowGroupByTemplatesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowInfos != null) {
            this.FlowInfos = new FlowInfo[source.FlowInfos.length];
            for (int i = 0; i < source.FlowInfos.length; i++) {
                this.FlowInfos[i] = new FlowInfo(source.FlowInfos[i]);
            }
        }
        if (source.FlowGroupName != null) {
            this.FlowGroupName = new String(source.FlowGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "FlowInfos.", this.FlowInfos);
        this.setParamSimple(map, prefix + "FlowGroupName", this.FlowGroupName);

    }
}

