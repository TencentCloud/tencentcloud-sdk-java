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

public class CreateFlowRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 流程的名字, 长度不能超过200，中文字母数字下划线
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 参与者信息
    */
    @SerializedName("Approvers")
    @Expose
    private FlowCreateApprover [] Approvers;

    /**
    * 流程的描述, 长度不能超过1000
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 发送类型(true为无序签,false为顺序签)
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 流程的种类(如销售合同/入职合同等)
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 过期时间戳,如果是0则为不过期
    */
    @SerializedName("DeadLine")
    @Expose
    private Long DeadLine;

    /**
    * 执行结果的回调URL(需要以http://或者https://)开头
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 用户自定义字段(需进行base64 encode),回调的时候会进行透传, 长度需要小于20480
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 客户端Token，保持接口幂等性
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 流程的名字, 长度不能超过200，中文字母数字下划线 
     * @return FlowName 流程的名字, 长度不能超过200，中文字母数字下划线
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流程的名字, 长度不能超过200，中文字母数字下划线
     * @param FlowName 流程的名字, 长度不能超过200，中文字母数字下划线
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 参与者信息 
     * @return Approvers 参与者信息
     */
    public FlowCreateApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 参与者信息
     * @param Approvers 参与者信息
     */
    public void setApprovers(FlowCreateApprover [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 流程的描述, 长度不能超过1000 
     * @return FlowDescription 流程的描述, 长度不能超过1000
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 流程的描述, 长度不能超过1000
     * @param FlowDescription 流程的描述, 长度不能超过1000
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 发送类型(true为无序签,false为顺序签) 
     * @return Unordered 发送类型(true为无序签,false为顺序签)
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 发送类型(true为无序签,false为顺序签)
     * @param Unordered 发送类型(true为无序签,false为顺序签)
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 流程的种类(如销售合同/入职合同等) 
     * @return FlowType 流程的种类(如销售合同/入职合同等)
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 流程的种类(如销售合同/入职合同等)
     * @param FlowType 流程的种类(如销售合同/入职合同等)
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 过期时间戳,如果是0则为不过期 
     * @return DeadLine 过期时间戳,如果是0则为不过期
     */
    public Long getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set 过期时间戳,如果是0则为不过期
     * @param DeadLine 过期时间戳,如果是0则为不过期
     */
    public void setDeadLine(Long DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get 执行结果的回调URL(需要以http://或者https://)开头 
     * @return CallbackUrl 执行结果的回调URL(需要以http://或者https://)开头
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 执行结果的回调URL(需要以http://或者https://)开头
     * @param CallbackUrl 执行结果的回调URL(需要以http://或者https://)开头
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 用户自定义字段(需进行base64 encode),回调的时候会进行透传, 长度需要小于20480 
     * @return UserData 用户自定义字段(需进行base64 encode),回调的时候会进行透传, 长度需要小于20480
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户自定义字段(需进行base64 encode),回调的时候会进行透传, 长度需要小于20480
     * @param UserData 用户自定义字段(需进行base64 encode),回调的时候会进行透传, 长度需要小于20480
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
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

    /**
     * Get 客户端Token，保持接口幂等性 
     * @return ClientToken 客户端Token，保持接口幂等性
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token，保持接口幂等性
     * @param ClientToken 客户端Token，保持接口幂等性
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowRequest(CreateFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowCreateApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowCreateApprover(source.Approvers[i]);
            }
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new Long(source.DeadLine);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

