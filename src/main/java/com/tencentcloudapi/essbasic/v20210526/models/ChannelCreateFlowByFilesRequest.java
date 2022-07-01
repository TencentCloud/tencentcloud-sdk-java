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

public class ChannelCreateFlowByFilesRequest extends AbstractModel{

    /**
    * 渠道应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 签署流程名称，长度不超过200个字符
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署流程签约方列表，最多不超过5个参与方
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverInfo [] FlowApprovers;

    /**
    * 签署文件资源Id列表，目前仅支持单个文件
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 签署文件中的控件，如：填写控件等
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署流程回调地址，长度不超过255个字符
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 签署流程的类型，长度不超过255个字符
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 签署流程的描述，长度不超过1000个字符
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
    */
    @SerializedName("CustomShowMap")
    @Expose
    private String CustomShowMap;

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
     * Get 签署流程名称，长度不超过200个字符 
     * @return FlowName 签署流程名称，长度不超过200个字符
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 签署流程名称，长度不超过200个字符
     * @param FlowName 签署流程名称，长度不超过200个字符
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署流程签约方列表，最多不超过5个参与方 
     * @return FlowApprovers 签署流程签约方列表，最多不超过5个参与方
     */
    public FlowApproverInfo [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set 签署流程签约方列表，最多不超过5个参与方
     * @param FlowApprovers 签署流程签约方列表，最多不超过5个参与方
     */
    public void setFlowApprovers(FlowApproverInfo [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
    }

    /**
     * Get 签署文件资源Id列表，目前仅支持单个文件 
     * @return FileIds 签署文件资源Id列表，目前仅支持单个文件
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 签署文件资源Id列表，目前仅支持单个文件
     * @param FileIds 签署文件资源Id列表，目前仅支持单个文件
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 签署文件中的控件，如：填写控件等 
     * @return Components 签署文件中的控件，如：填写控件等
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 签署文件中的控件，如：填写控件等
     * @param Components 签署文件中的控件，如：填写控件等
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年 
     * @return Deadline 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
     * @param Deadline 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 签署流程回调地址，长度不超过255个字符 
     * @return CallbackUrl 签署流程回调地址，长度不超过255个字符
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署流程回调地址，长度不超过255个字符
     * @param CallbackUrl 签署流程回调地址，长度不超过255个字符
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署 
     * @return Unordered 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
     * @param Unordered 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 签署流程的类型，长度不超过255个字符 
     * @return FlowType 签署流程的类型，长度不超过255个字符
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 签署流程的类型，长度不超过255个字符
     * @param FlowType 签署流程的类型，长度不超过255个字符
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 签署流程的描述，长度不超过1000个字符 
     * @return FlowDescription 签署流程的描述，长度不超过1000个字符
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 签署流程的描述，长度不超过1000个字符
     * @param FlowDescription 签署流程的描述，长度不超过1000个字符
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
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

    public ChannelCreateFlowByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowByFilesRequest(ChannelCreateFlowByFilesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowApprovers != null) {
            this.FlowApprovers = new FlowApproverInfo[source.FlowApprovers.length];
            for (int i = 0; i < source.FlowApprovers.length; i++) {
                this.FlowApprovers[i] = new FlowApproverInfo(source.FlowApprovers[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.CustomShowMap != null) {
            this.CustomShowMap = new String(source.CustomShowMap);
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
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "FlowApprovers.", this.FlowApprovers);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "CustomShowMap", this.CustomShowMap);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

