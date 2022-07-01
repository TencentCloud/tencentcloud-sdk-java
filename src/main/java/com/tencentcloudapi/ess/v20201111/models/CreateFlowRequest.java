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
    * 签署流程名称,最大长度200个字符
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署流程参与者信息
    */
    @SerializedName("Approvers")
    @Expose
    private FlowCreateApprover [] Approvers;

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 发送类型(true为无序签,false为顺序签)
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
    */
    @SerializedName("DeadLine")
    @Expose
    private Long DeadLine;

    /**
    * 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 用户自定义字段(需进行base64 encode),回调的时候会进行透传, 长度需要小于20480
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 签署流程描述,最大长度1000个字符
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 客户端Token，保持接口幂等性,最大长度64个字符
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
    */
    @SerializedName("CustomShowMap")
    @Expose
    private String CustomShowMap;

    /**
    * 暂未开放
    */
    @SerializedName("RelatedFlowId")
    @Expose
    private String RelatedFlowId;

    /**
    * 暂未开放
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 签署流程名称,最大长度200个字符 
     * @return FlowName 签署流程名称,最大长度200个字符
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 签署流程名称,最大长度200个字符
     * @param FlowName 签署流程名称,最大长度200个字符
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署流程参与者信息 
     * @return Approvers 签署流程参与者信息
     */
    public FlowCreateApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署流程参与者信息
     * @param Approvers 签署流程参与者信息
     */
    public void setApprovers(FlowCreateApprover [] Approvers) {
        this.Approvers = Approvers;
    }

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
     * Get 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后 
     * @return DeadLine 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     */
    public Long getDeadLine() {
        return this.DeadLine;
    }

    /**
     * Set 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     * @param DeadLine 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
     */
    public void setDeadLine(Long DeadLine) {
        this.DeadLine = DeadLine;
    }

    /**
     * Get 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符 
     * @return FlowType 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
     * @param FlowType 签署流程的类型(如销售合同/入职合同等)，最大长度200个字符
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
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
     * Get 签署流程描述,最大长度1000个字符 
     * @return FlowDescription 签署流程描述,最大长度1000个字符
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 签署流程描述,最大长度1000个字符
     * @param FlowDescription 签署流程描述,最大长度1000个字符
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 客户端Token，保持接口幂等性,最大长度64个字符 
     * @return ClientToken 客户端Token，保持接口幂等性,最大长度64个字符
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token，保持接口幂等性,最大长度64个字符
     * @param ClientToken 客户端Token，保持接口幂等性,最大长度64个字符
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始 
     * @return CustomShowMap 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     */
    public String getCustomShowMap() {
        return this.CustomShowMap;
    }

    /**
     * Set 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     * @param CustomShowMap 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     */
    public void setCustomShowMap(String CustomShowMap) {
        this.CustomShowMap = CustomShowMap;
    }

    /**
     * Get 暂未开放 
     * @return RelatedFlowId 暂未开放
     */
    public String getRelatedFlowId() {
        return this.RelatedFlowId;
    }

    /**
     * Set 暂未开放
     * @param RelatedFlowId 暂未开放
     */
    public void setRelatedFlowId(String RelatedFlowId) {
        this.RelatedFlowId = RelatedFlowId;
    }

    /**
     * Get 暂未开放 
     * @return CallbackUrl 暂未开放
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 暂未开放
     * @param CallbackUrl 暂未开放
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public CreateFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowRequest(CreateFlowRequest source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowCreateApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowCreateApprover(source.Approvers[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.DeadLine != null) {
            this.DeadLine = new Long(source.DeadLine);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.CustomShowMap != null) {
            this.CustomShowMap = new String(source.CustomShowMap);
        }
        if (source.RelatedFlowId != null) {
            this.RelatedFlowId = new String(source.RelatedFlowId);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "DeadLine", this.DeadLine);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "CustomShowMap", this.CustomShowMap);
        this.setParamSimple(map, prefix + "RelatedFlowId", this.RelatedFlowId);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

