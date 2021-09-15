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

public class PrepareFlowsRequest extends AbstractModel{

    /**
    * 渠道应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 多个合同（流程）信息
    */
    @SerializedName("FlowInfos")
    @Expose
    private FlowInfo [] FlowInfos;

    /**
    * 操作完成后的跳转地址
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 渠道应用相关信息 
     * @return Agent 渠道应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息
     * @param Agent 渠道应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 多个合同（流程）信息 
     * @return FlowInfos 多个合同（流程）信息
     */
    public FlowInfo [] getFlowInfos() {
        return this.FlowInfos;
    }

    /**
     * Set 多个合同（流程）信息
     * @param FlowInfos 多个合同（流程）信息
     */
    public void setFlowInfos(FlowInfo [] FlowInfos) {
        this.FlowInfos = FlowInfos;
    }

    /**
     * Get 操作完成后的跳转地址 
     * @return JumpUrl 操作完成后的跳转地址
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 操作完成后的跳转地址
     * @param JumpUrl 操作完成后的跳转地址
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public PrepareFlowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrepareFlowsRequest(PrepareFlowsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowInfos != null) {
            this.FlowInfos = new FlowInfo[source.FlowInfos.length];
            for (int i = 0; i < source.FlowInfos.length; i++) {
                this.FlowInfos[i] = new FlowInfo(source.FlowInfos[i]);
            }
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "FlowInfos.", this.FlowInfos);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

