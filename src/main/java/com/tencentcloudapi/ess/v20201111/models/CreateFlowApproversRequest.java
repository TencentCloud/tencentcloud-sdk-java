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

public class CreateFlowApproversRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 签署流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 补充签署人信息
    */
    @SerializedName("Approvers")
    @Expose
    private FillApproverInfo [] Approvers;

    /**
    * 企微消息中的发起人
    */
    @SerializedName("Initiator")
    @Expose
    private String Initiator;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作


    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 签署流程编号 
     * @return FlowId 签署流程编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署流程编号
     * @param FlowId 签署流程编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 补充签署人信息 
     * @return Approvers 补充签署人信息
     */
    public FillApproverInfo [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 补充签署人信息
     * @param Approvers 补充签署人信息
     */
    public void setApprovers(FillApproverInfo [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 企微消息中的发起人 
     * @return Initiator 企微消息中的发起人
     */
    public String getInitiator() {
        return this.Initiator;
    }

    /**
     * Set 企微消息中的发起人
     * @param Initiator 企微消息中的发起人
     */
    public void setInitiator(String Initiator) {
        this.Initiator = Initiator;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作

 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作


     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作


     * @param Agent 代理相关应用信息，如集团主企业代子企业操作


     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public CreateFlowApproversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowApproversRequest(CreateFlowApproversRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Approvers != null) {
            this.Approvers = new FillApproverInfo[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FillApproverInfo(source.Approvers[i]);
            }
        }
        if (source.Initiator != null) {
            this.Initiator = new String(source.Initiator);
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
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "Initiator", this.Initiator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

