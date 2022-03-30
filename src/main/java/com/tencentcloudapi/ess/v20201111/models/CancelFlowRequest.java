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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelFlowRequest extends AbstractModel{

    /**
    * 操作用户id
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 流程id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 撤销原因
    */
    @SerializedName("CancelMessage")
    @Expose
    private String CancelMessage;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 操作用户id 
     * @return Operator 操作用户id
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作用户id
     * @param Operator 操作用户id
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 流程id 
     * @return FlowId 流程id
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程id
     * @param FlowId 流程id
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 撤销原因 
     * @return CancelMessage 撤销原因
     */
    public String getCancelMessage() {
        return this.CancelMessage;
    }

    /**
     * Set 撤销原因
     * @param CancelMessage 撤销原因
     */
    public void setCancelMessage(String CancelMessage) {
        this.CancelMessage = CancelMessage;
    }

    /**
     * Get 应用相关信息 
     * @return Agent 应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息
     * @param Agent 应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public CancelFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelFlowRequest(CancelFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.CancelMessage != null) {
            this.CancelMessage = new String(source.CancelMessage);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "CancelMessage", this.CancelMessage);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

