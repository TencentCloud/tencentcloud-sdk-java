/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationContent extends AbstractModel {

    /**
    * <p>文本内容</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>内容类型, text：文本,image：图片,file：文件,custom_variables：自定义输入参数信息,widget_action：widget动作信息</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>自定义参数数据</p>
    */
    @SerializedName("CustomParamList")
    @Expose
    private String [] CustomParamList;

    /**
    * <p>自定义参数数据</p>
    */
    @SerializedName("CustomParams")
    @Expose
    private String [] CustomParams;

    /**
    * <p>自定义变量数据</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomVariablesData")
    @Expose
    private String CustomVariablesData;

    /**
    * <p>企业表单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnterpriseCharts")
    @Expose
    private String EnterpriseCharts;

    /**
    * <p>选项卡列表</p>
    */
    @SerializedName("OptionCardList")
    @Expose
    private String [] OptionCardList;

    /**
    * <p>选项卡列表</p>
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>选项卡模式 枚举值: 0-OPTION_MODE_SINGLE(单选), 1-OPTION_MODE_MULTI(多选)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
    * <p>引用角标信息列表</p>
    */
    @SerializedName("QuoteInfoList")
    @Expose
    private ConversationQuoteInfo [] QuoteInfoList;

    /**
    * <p>引用角标信息列表</p>
    */
    @SerializedName("QuoteInfos")
    @Expose
    private ConversationQuoteInfo [] QuoteInfos;

    /**
    * <p>参考来源列表</p>
    */
    @SerializedName("ReferenceList")
    @Expose
    private ConversationReference [] ReferenceList;

    /**
    * <p>参考来源列表</p>
    */
    @SerializedName("References")
    @Expose
    private ConversationReference [] References;

    /**
    * <p>关联记录 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * <p>智能体任务列表</p>
    */
    @SerializedName("TaskList")
    @Expose
    private ConversationAgentTask [] TaskList;

    /**
    * <p>智能体任务列表</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ConversationAgentTask [] Tasks;

    /**
    * <p>工作流输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowInput")
    @Expose
    private String WorkflowInput;

    /**
     * Get <p>文本内容</p> 
     * @return Text <p>文本内容</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>文本内容</p>
     * @param Text <p>文本内容</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>内容类型, text：文本,image：图片,file：文件,custom_variables：自定义输入参数信息,widget_action：widget动作信息</p> 
     * @return Type <p>内容类型, text：文本,image：图片,file：文件,custom_variables：自定义输入参数信息,widget_action：widget动作信息</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>内容类型, text：文本,image：图片,file：文件,custom_variables：自定义输入参数信息,widget_action：widget动作信息</p>
     * @param Type <p>内容类型, text：文本,image：图片,file：文件,custom_variables：自定义输入参数信息,widget_action：widget动作信息</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>自定义参数数据</p> 
     * @return CustomParamList <p>自定义参数数据</p>
     */
    public String [] getCustomParamList() {
        return this.CustomParamList;
    }

    /**
     * Set <p>自定义参数数据</p>
     * @param CustomParamList <p>自定义参数数据</p>
     */
    public void setCustomParamList(String [] CustomParamList) {
        this.CustomParamList = CustomParamList;
    }

    /**
     * Get <p>自定义参数数据</p> 
     * @return CustomParams <p>自定义参数数据</p>
     */
    public String [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set <p>自定义参数数据</p>
     * @param CustomParams <p>自定义参数数据</p>
     */
    public void setCustomParams(String [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get <p>自定义变量数据</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomVariablesData <p>自定义变量数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomVariablesData() {
        return this.CustomVariablesData;
    }

    /**
     * Set <p>自定义变量数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomVariablesData <p>自定义变量数据</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomVariablesData(String CustomVariablesData) {
        this.CustomVariablesData = CustomVariablesData;
    }

    /**
     * Get <p>企业表单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnterpriseCharts <p>企业表单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnterpriseCharts() {
        return this.EnterpriseCharts;
    }

    /**
     * Set <p>企业表单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnterpriseCharts <p>企业表单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnterpriseCharts(String EnterpriseCharts) {
        this.EnterpriseCharts = EnterpriseCharts;
    }

    /**
     * Get <p>选项卡列表</p> 
     * @return OptionCardList <p>选项卡列表</p>
     */
    public String [] getOptionCardList() {
        return this.OptionCardList;
    }

    /**
     * Set <p>选项卡列表</p>
     * @param OptionCardList <p>选项卡列表</p>
     */
    public void setOptionCardList(String [] OptionCardList) {
        this.OptionCardList = OptionCardList;
    }

    /**
     * Get <p>选项卡列表</p> 
     * @return OptionCards <p>选项卡列表</p>
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>选项卡列表</p>
     * @param OptionCards <p>选项卡列表</p>
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>选项卡模式 枚举值: 0-OPTION_MODE_SINGLE(单选), 1-OPTION_MODE_MULTI(多选)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionMode <p>选项卡模式 枚举值: 0-OPTION_MODE_SINGLE(单选), 1-OPTION_MODE_MULTI(多选)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>选项卡模式 枚举值: 0-OPTION_MODE_SINGLE(单选), 1-OPTION_MODE_MULTI(多选)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionMode <p>选项卡模式 枚举值: 0-OPTION_MODE_SINGLE(单选), 1-OPTION_MODE_MULTI(多选)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
    }

    /**
     * Get <p>引用角标信息列表</p> 
     * @return QuoteInfoList <p>引用角标信息列表</p>
     */
    public ConversationQuoteInfo [] getQuoteInfoList() {
        return this.QuoteInfoList;
    }

    /**
     * Set <p>引用角标信息列表</p>
     * @param QuoteInfoList <p>引用角标信息列表</p>
     */
    public void setQuoteInfoList(ConversationQuoteInfo [] QuoteInfoList) {
        this.QuoteInfoList = QuoteInfoList;
    }

    /**
     * Get <p>引用角标信息列表</p> 
     * @return QuoteInfos <p>引用角标信息列表</p>
     */
    public ConversationQuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set <p>引用角标信息列表</p>
     * @param QuoteInfos <p>引用角标信息列表</p>
     */
    public void setQuoteInfos(ConversationQuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get <p>参考来源列表</p> 
     * @return ReferenceList <p>参考来源列表</p>
     */
    public ConversationReference [] getReferenceList() {
        return this.ReferenceList;
    }

    /**
     * Set <p>参考来源列表</p>
     * @param ReferenceList <p>参考来源列表</p>
     */
    public void setReferenceList(ConversationReference [] ReferenceList) {
        this.ReferenceList = ReferenceList;
    }

    /**
     * Get <p>参考来源列表</p> 
     * @return References <p>参考来源列表</p>
     */
    public ConversationReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>参考来源列表</p>
     * @param References <p>参考来源列表</p>
     */
    public void setReferences(ConversationReference [] References) {
        this.References = References;
    }

    /**
     * Get <p>关联记录 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedRecordId <p>关联记录 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set <p>关联记录 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedRecordId <p>关联记录 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get <p>智能体任务列表</p> 
     * @return TaskList <p>智能体任务列表</p>
     */
    public ConversationAgentTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set <p>智能体任务列表</p>
     * @param TaskList <p>智能体任务列表</p>
     */
    public void setTaskList(ConversationAgentTask [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get <p>智能体任务列表</p> 
     * @return Tasks <p>智能体任务列表</p>
     */
    public ConversationAgentTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>智能体任务列表</p>
     * @param Tasks <p>智能体任务列表</p>
     */
    public void setTasks(ConversationAgentTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>工作流输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowInput <p>工作流输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowInput() {
        return this.WorkflowInput;
    }

    /**
     * Set <p>工作流输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowInput <p>工作流输入参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowInput(String WorkflowInput) {
        this.WorkflowInput = WorkflowInput;
    }

    public ConversationContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationContent(ConversationContent source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CustomParamList != null) {
            this.CustomParamList = new String[source.CustomParamList.length];
            for (int i = 0; i < source.CustomParamList.length; i++) {
                this.CustomParamList[i] = new String(source.CustomParamList[i]);
            }
        }
        if (source.CustomParams != null) {
            this.CustomParams = new String[source.CustomParams.length];
            for (int i = 0; i < source.CustomParams.length; i++) {
                this.CustomParams[i] = new String(source.CustomParams[i]);
            }
        }
        if (source.CustomVariablesData != null) {
            this.CustomVariablesData = new String(source.CustomVariablesData);
        }
        if (source.EnterpriseCharts != null) {
            this.EnterpriseCharts = new String(source.EnterpriseCharts);
        }
        if (source.OptionCardList != null) {
            this.OptionCardList = new String[source.OptionCardList.length];
            for (int i = 0; i < source.OptionCardList.length; i++) {
                this.OptionCardList[i] = new String(source.OptionCardList[i]);
            }
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
        }
        if (source.QuoteInfoList != null) {
            this.QuoteInfoList = new ConversationQuoteInfo[source.QuoteInfoList.length];
            for (int i = 0; i < source.QuoteInfoList.length; i++) {
                this.QuoteInfoList[i] = new ConversationQuoteInfo(source.QuoteInfoList[i]);
            }
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new ConversationQuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new ConversationQuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.ReferenceList != null) {
            this.ReferenceList = new ConversationReference[source.ReferenceList.length];
            for (int i = 0; i < source.ReferenceList.length; i++) {
                this.ReferenceList[i] = new ConversationReference(source.ReferenceList[i]);
            }
        }
        if (source.References != null) {
            this.References = new ConversationReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ConversationReference(source.References[i]);
            }
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.TaskList != null) {
            this.TaskList = new ConversationAgentTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new ConversationAgentTask(source.TaskList[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new ConversationAgentTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ConversationAgentTask(source.Tasks[i]);
            }
        }
        if (source.WorkflowInput != null) {
            this.WorkflowInput = new String(source.WorkflowInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "CustomParamList.", this.CustomParamList);
        this.setParamArraySimple(map, prefix + "CustomParams.", this.CustomParams);
        this.setParamSimple(map, prefix + "CustomVariablesData", this.CustomVariablesData);
        this.setParamSimple(map, prefix + "EnterpriseCharts", this.EnterpriseCharts);
        this.setParamArraySimple(map, prefix + "OptionCardList.", this.OptionCardList);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);
        this.setParamArrayObj(map, prefix + "QuoteInfoList.", this.QuoteInfoList);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamArrayObj(map, prefix + "ReferenceList.", this.ReferenceList);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "WorkflowInput", this.WorkflowInput);

    }
}

