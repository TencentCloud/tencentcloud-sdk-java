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

public class DescribeFlowDetailInfoRequest extends AbstractModel{

    /**
    * 应用信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同(流程)编号数组
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用信息 
     * @return Agent 应用信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用信息
     * @param Agent 应用信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同(流程)编号数组 
     * @return FlowIds 合同(流程)编号数组
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 合同(流程)编号数组
     * @param FlowIds 合同(流程)编号数组
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
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

    public DescribeFlowDetailInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowDetailInfoRequest(DescribeFlowDetailInfoRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

