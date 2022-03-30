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

public class CreateFlowByFilesRequest extends AbstractModel{

    /**
    * 调用方用户信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 流程名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署pdf文件的资源编号列表
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 签署参与者信息
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverInfo [] Approvers;

    /**
    * 流程描述
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 发送类型：
true：无序签
false：有序签
注：默认为false（有序签）
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 流程的类型
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 流程的签署截止时间
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 应用号信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 经办人内容控件配置。可选类型为：
TEXT - 内容文本控件
MULTI_LINE_TEXT - 多行文本控件
注：默认字体大小为 字号12
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 被抄送人的信息列表
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * 是否需要预览，true：预览模式，false：非预览（默认）
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
     * Get 调用方用户信息 
     * @return Operator 调用方用户信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息
     * @param Operator 调用方用户信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 流程名称 
     * @return FlowName 流程名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流程名称
     * @param FlowName 流程名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署pdf文件的资源编号列表 
     * @return FileIds 签署pdf文件的资源编号列表
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 签署pdf文件的资源编号列表
     * @param FileIds 签署pdf文件的资源编号列表
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 签署参与者信息 
     * @return Approvers 签署参与者信息
     */
    public ApproverInfo [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 签署参与者信息
     * @param Approvers 签署参与者信息
     */
    public void setApprovers(ApproverInfo [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 流程描述 
     * @return FlowDescription 流程描述
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 流程描述
     * @param FlowDescription 流程描述
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 发送类型：
true：无序签
false：有序签
注：默认为false（有序签） 
     * @return Unordered 发送类型：
true：无序签
false：有序签
注：默认为false（有序签）
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 发送类型：
true：无序签
false：有序签
注：默认为false（有序签）
     * @param Unordered 发送类型：
true：无序签
false：有序签
注：默认为false（有序签）
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 流程的类型 
     * @return FlowType 流程的类型
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 流程的类型
     * @param FlowType 流程的类型
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 流程的签署截止时间 
     * @return Deadline 流程的签署截止时间
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 流程的签署截止时间
     * @param Deadline 流程的签署截止时间
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 应用号信息 
     * @return Agent 应用号信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用号信息
     * @param Agent 应用号信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 经办人内容控件配置。可选类型为：
TEXT - 内容文本控件
MULTI_LINE_TEXT - 多行文本控件
注：默认字体大小为 字号12 
     * @return Components 经办人内容控件配置。可选类型为：
TEXT - 内容文本控件
MULTI_LINE_TEXT - 多行文本控件
注：默认字体大小为 字号12
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 经办人内容控件配置。可选类型为：
TEXT - 内容文本控件
MULTI_LINE_TEXT - 多行文本控件
注：默认字体大小为 字号12
     * @param Components 经办人内容控件配置。可选类型为：
TEXT - 内容文本控件
MULTI_LINE_TEXT - 多行文本控件
注：默认字体大小为 字号12
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 被抄送人的信息列表 
     * @return CcInfos 被抄送人的信息列表
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 被抄送人的信息列表
     * @param CcInfos 被抄送人的信息列表
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 是否需要预览，true：预览模式，false：非预览（默认） 
     * @return NeedPreview 是否需要预览，true：预览模式，false：非预览（默认）
     */
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set 是否需要预览，true：预览模式，false：非预览（默认）
     * @param NeedPreview 是否需要预览，true：预览模式，false：非预览（默认）
     */
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    public CreateFlowByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowByFilesRequest(CreateFlowByFilesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverInfo[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverInfo(source.Approvers[i]);
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
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
        if (source.NeedPreview != null) {
            this.NeedPreview = new Boolean(source.NeedPreview);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);

    }
}

