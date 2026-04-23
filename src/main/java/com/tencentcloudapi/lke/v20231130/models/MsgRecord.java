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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsgRecord extends AbstractModel {

    /**
    * <p>内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>当前记录所对应的 Session ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>记录ID</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>关联记录ID</p>
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * <p>是否来自自己</p>
    */
    @SerializedName("IsFromSelf")
    @Expose
    private Boolean IsFromSelf;

    /**
    * <p>发送者名称</p>
    */
    @SerializedName("FromName")
    @Expose
    private String FromName;

    /**
    * <p>发送者头像</p>
    */
    @SerializedName("FromAvatar")
    @Expose
    private String FromAvatar;

    /**
    * <p>时间戳</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>是否已读</p>
    */
    @SerializedName("HasRead")
    @Expose
    private Boolean HasRead;

    /**
    * <p>评价</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>是否评分</p>
    */
    @SerializedName("CanRating")
    @Expose
    private Boolean CanRating;

    /**
    * <p>是否展示反馈按钮</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanFeedback")
    @Expose
    private Boolean CanFeedback;

    /**
    * <p>记录类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>引用来源</p>
    */
    @SerializedName("References")
    @Expose
    private MsgRecordReference [] References;

    /**
    * <p>评价原因</p>
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
    * <p>是否大模型</p>
    */
    @SerializedName("IsLlmGenerated")
    @Expose
    private Boolean IsLlmGenerated;

    /**
    * <p>图片链接，可公有读</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * <p>当次 token 统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenStat")
    @Expose
    private TokenStat TokenStat;

    /**
    * <p>回复方式<br>1:大模型直接回复;<br>2:保守回复, 未知问题回复;<br>3:拒答问题回复;<br>4:敏感回复;<br>5:问答对直接回复, 已采纳问答对优先回复;<br>6:欢迎语回复;<br>7:并发超限回复;<br>8:全局干预知识;<br>9:任务流程过程回复, 当历史记录中 task_flow.type = 0 时, 为大模型回复;<br>10:任务流程答案回复;<br>11:搜索引擎回复;<br>12:知识润色后回复;<br>13:图片理解回复;<br>14:实时文档回复;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
    * <p>选项卡, 用于多轮对话</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFlow")
    @Expose
    private TaskFlowInfo TaskFlow;

    /**
    * <p>用户传入的文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * <p>参考来源引用位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuoteInfos")
    @Expose
    private QuoteInfo [] QuoteInfos;

    /**
    * <p>Agent的思考过程信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentThought")
    @Expose
    private AgentThought AgentThought;

    /**
    * <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * <p>工作流信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkFlow")
    @Expose
    private WorkflowInfo WorkFlow;

    /**
    * <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Widgets")
    @Expose
    private Widget [] Widgets;

    /**
    * <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetAction")
    @Expose
    private WidgetAction WidgetAction;

    /**
    * <p>音频信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Audios")
    @Expose
    private Audio [] Audios;

    /**
    * <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 双选</li></ul>
    */
    @SerializedName("OptionMode")
    @Expose
    private Long OptionMode;

    /**
     * Get <p>内容</p> 
     * @return Content <p>内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>内容</p>
     * @param Content <p>内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>当前记录所对应的 Session ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>当前记录所对应的 Session ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>当前记录所对应的 Session ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>当前记录所对应的 Session ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>记录ID</p> 
     * @return RecordId <p>记录ID</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>记录ID</p>
     * @param RecordId <p>记录ID</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>关联记录ID</p> 
     * @return RelatedRecordId <p>关联记录ID</p>
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set <p>关联记录ID</p>
     * @param RelatedRecordId <p>关联记录ID</p>
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get <p>是否来自自己</p> 
     * @return IsFromSelf <p>是否来自自己</p>
     */
    public Boolean getIsFromSelf() {
        return this.IsFromSelf;
    }

    /**
     * Set <p>是否来自自己</p>
     * @param IsFromSelf <p>是否来自自己</p>
     */
    public void setIsFromSelf(Boolean IsFromSelf) {
        this.IsFromSelf = IsFromSelf;
    }

    /**
     * Get <p>发送者名称</p> 
     * @return FromName <p>发送者名称</p>
     */
    public String getFromName() {
        return this.FromName;
    }

    /**
     * Set <p>发送者名称</p>
     * @param FromName <p>发送者名称</p>
     */
    public void setFromName(String FromName) {
        this.FromName = FromName;
    }

    /**
     * Get <p>发送者头像</p> 
     * @return FromAvatar <p>发送者头像</p>
     */
    public String getFromAvatar() {
        return this.FromAvatar;
    }

    /**
     * Set <p>发送者头像</p>
     * @param FromAvatar <p>发送者头像</p>
     */
    public void setFromAvatar(String FromAvatar) {
        this.FromAvatar = FromAvatar;
    }

    /**
     * Get <p>时间戳</p> 
     * @return Timestamp <p>时间戳</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>时间戳</p>
     * @param Timestamp <p>时间戳</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>是否已读</p> 
     * @return HasRead <p>是否已读</p>
     */
    public Boolean getHasRead() {
        return this.HasRead;
    }

    /**
     * Set <p>是否已读</p>
     * @param HasRead <p>是否已读</p>
     */
    public void setHasRead(Boolean HasRead) {
        this.HasRead = HasRead;
    }

    /**
     * Get <p>评价</p> 
     * @return Score <p>评价</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>评价</p>
     * @param Score <p>评价</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>是否评分</p> 
     * @return CanRating <p>是否评分</p>
     */
    public Boolean getCanRating() {
        return this.CanRating;
    }

    /**
     * Set <p>是否评分</p>
     * @param CanRating <p>是否评分</p>
     */
    public void setCanRating(Boolean CanRating) {
        this.CanRating = CanRating;
    }

    /**
     * Get <p>是否展示反馈按钮</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanFeedback <p>是否展示反馈按钮</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanFeedback() {
        return this.CanFeedback;
    }

    /**
     * Set <p>是否展示反馈按钮</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanFeedback <p>是否展示反馈按钮</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanFeedback(Boolean CanFeedback) {
        this.CanFeedback = CanFeedback;
    }

    /**
     * Get <p>记录类型</p> 
     * @return Type <p>记录类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>记录类型</p>
     * @param Type <p>记录类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>引用来源</p> 
     * @return References <p>引用来源</p>
     */
    public MsgRecordReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>引用来源</p>
     * @param References <p>引用来源</p>
     */
    public void setReferences(MsgRecordReference [] References) {
        this.References = References;
    }

    /**
     * Get <p>评价原因</p> 
     * @return Reasons <p>评价原因</p>
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set <p>评价原因</p>
     * @param Reasons <p>评价原因</p>
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    /**
     * Get <p>是否大模型</p> 
     * @return IsLlmGenerated <p>是否大模型</p>
     */
    public Boolean getIsLlmGenerated() {
        return this.IsLlmGenerated;
    }

    /**
     * Set <p>是否大模型</p>
     * @param IsLlmGenerated <p>是否大模型</p>
     */
    public void setIsLlmGenerated(Boolean IsLlmGenerated) {
        this.IsLlmGenerated = IsLlmGenerated;
    }

    /**
     * Get <p>图片链接，可公有读</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrls <p>图片链接，可公有读</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set <p>图片链接，可公有读</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrls <p>图片链接，可公有读</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get <p>当次 token 统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenStat <p>当次 token 统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TokenStat getTokenStat() {
        return this.TokenStat;
    }

    /**
     * Set <p>当次 token 统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenStat <p>当次 token 统计信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenStat(TokenStat TokenStat) {
        this.TokenStat = TokenStat;
    }

    /**
     * Get <p>回复方式<br>1:大模型直接回复;<br>2:保守回复, 未知问题回复;<br>3:拒答问题回复;<br>4:敏感回复;<br>5:问答对直接回复, 已采纳问答对优先回复;<br>6:欢迎语回复;<br>7:并发超限回复;<br>8:全局干预知识;<br>9:任务流程过程回复, 当历史记录中 task_flow.type = 0 时, 为大模型回复;<br>10:任务流程答案回复;<br>11:搜索引擎回复;<br>12:知识润色后回复;<br>13:图片理解回复;<br>14:实时文档回复;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyMethod <p>回复方式<br>1:大模型直接回复;<br>2:保守回复, 未知问题回复;<br>3:拒答问题回复;<br>4:敏感回复;<br>5:问答对直接回复, 已采纳问答对优先回复;<br>6:欢迎语回复;<br>7:并发超限回复;<br>8:全局干预知识;<br>9:任务流程过程回复, 当历史记录中 task_flow.type = 0 时, 为大模型回复;<br>10:任务流程答案回复;<br>11:搜索引擎回复;<br>12:知识润色后回复;<br>13:图片理解回复;<br>14:实时文档回复;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set <p>回复方式<br>1:大模型直接回复;<br>2:保守回复, 未知问题回复;<br>3:拒答问题回复;<br>4:敏感回复;<br>5:问答对直接回复, 已采纳问答对优先回复;<br>6:欢迎语回复;<br>7:并发超限回复;<br>8:全局干预知识;<br>9:任务流程过程回复, 当历史记录中 task_flow.type = 0 时, 为大模型回复;<br>10:任务流程答案回复;<br>11:搜索引擎回复;<br>12:知识润色后回复;<br>13:图片理解回复;<br>14:实时文档回复;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyMethod <p>回复方式<br>1:大模型直接回复;<br>2:保守回复, 未知问题回复;<br>3:拒答问题回复;<br>4:敏感回复;<br>5:问答对直接回复, 已采纳问答对优先回复;<br>6:欢迎语回复;<br>7:并发超限回复;<br>8:全局干预知识;<br>9:任务流程过程回复, 当历史记录中 task_flow.type = 0 时, 为大模型回复;<br>10:任务流程答案回复;<br>11:搜索引擎回复;<br>12:知识润色后回复;<br>13:图片理解回复;<br>14:实时文档回复;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    /**
     * Get <p>选项卡, 用于多轮对话</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionCards <p>选项卡, 用于多轮对话</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set <p>选项卡, 用于多轮对话</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionCards <p>选项卡, 用于多轮对话</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFlow <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskFlowInfo getTaskFlow() {
        return this.TaskFlow;
    }

    /**
     * Set <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFlow <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFlow(TaskFlowInfo TaskFlow) {
        this.TaskFlow = TaskFlow;
    }

    /**
     * Get <p>用户传入的文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileInfos <p>用户传入的文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set <p>用户传入的文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileInfos <p>用户传入的文件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get <p>参考来源引用位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuoteInfos <p>参考来源引用位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QuoteInfo [] getQuoteInfos() {
        return this.QuoteInfos;
    }

    /**
     * Set <p>参考来源引用位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuoteInfos <p>参考来源引用位置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuoteInfos(QuoteInfo [] QuoteInfos) {
        this.QuoteInfos = QuoteInfos;
    }

    /**
     * Get <p>Agent的思考过程信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentThought <p>Agent的思考过程信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentThought getAgentThought() {
        return this.AgentThought;
    }

    /**
     * Set <p>Agent的思考过程信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentThought <p>Agent的思考过程信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentThought(AgentThought AgentThought) {
        this.AgentThought = AgentThought;
    }

    /**
     * Get <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>工作流信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkFlow <p>工作流信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowInfo getWorkFlow() {
        return this.WorkFlow;
    }

    /**
     * Set <p>工作流信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkFlow <p>工作流信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkFlow(WorkflowInfo WorkFlow) {
        this.WorkFlow = WorkFlow;
    }

    /**
     * Get <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Widgets <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Widget [] getWidgets() {
        return this.Widgets;
    }

    /**
     * Set <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Widgets <p>Widget信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgets(Widget [] Widgets) {
        this.Widgets = Widgets;
    }

    /**
     * Get <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetAction <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WidgetAction getWidgetAction() {
        return this.WidgetAction;
    }

    /**
     * Set <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetAction <p>Widget动作信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetAction(WidgetAction WidgetAction) {
        this.WidgetAction = WidgetAction;
    }

    /**
     * Get <p>音频信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Audios <p>音频信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Audio [] getAudios() {
        return this.Audios;
    }

    /**
     * Set <p>音频信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Audios <p>音频信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudios(Audio [] Audios) {
        this.Audios = Audios;
    }

    /**
     * Get <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 双选</li></ul> 
     * @return OptionMode <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 双选</li></ul>
     */
    public Long getOptionMode() {
        return this.OptionMode;
    }

    /**
     * Set <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 双选</li></ul>
     * @param OptionMode <p>标识选项卡为单选还是双选</p><p>枚举值：</p><ul><li>0： 单选</li><li>1： 双选</li></ul>
     */
    public void setOptionMode(Long OptionMode) {
        this.OptionMode = OptionMode;
    }

    public MsgRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecord(MsgRecord source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.IsFromSelf != null) {
            this.IsFromSelf = new Boolean(source.IsFromSelf);
        }
        if (source.FromName != null) {
            this.FromName = new String(source.FromName);
        }
        if (source.FromAvatar != null) {
            this.FromAvatar = new String(source.FromAvatar);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.HasRead != null) {
            this.HasRead = new Boolean(source.HasRead);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.CanRating != null) {
            this.CanRating = new Boolean(source.CanRating);
        }
        if (source.CanFeedback != null) {
            this.CanFeedback = new Boolean(source.CanFeedback);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.References != null) {
            this.References = new MsgRecordReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new MsgRecordReference(source.References[i]);
            }
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
        if (source.IsLlmGenerated != null) {
            this.IsLlmGenerated = new Boolean(source.IsLlmGenerated);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.TokenStat != null) {
            this.TokenStat = new TokenStat(source.TokenStat);
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.TaskFlow != null) {
            this.TaskFlow = new TaskFlowInfo(source.TaskFlow);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
        if (source.QuoteInfos != null) {
            this.QuoteInfos = new QuoteInfo[source.QuoteInfos.length];
            for (int i = 0; i < source.QuoteInfos.length; i++) {
                this.QuoteInfos[i] = new QuoteInfo(source.QuoteInfos[i]);
            }
        }
        if (source.AgentThought != null) {
            this.AgentThought = new AgentThought(source.AgentThought);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.WorkFlow != null) {
            this.WorkFlow = new WorkflowInfo(source.WorkFlow);
        }
        if (source.Widgets != null) {
            this.Widgets = new Widget[source.Widgets.length];
            for (int i = 0; i < source.Widgets.length; i++) {
                this.Widgets[i] = new Widget(source.Widgets[i]);
            }
        }
        if (source.WidgetAction != null) {
            this.WidgetAction = new WidgetAction(source.WidgetAction);
        }
        if (source.Audios != null) {
            this.Audios = new Audio[source.Audios.length];
            for (int i = 0; i < source.Audios.length; i++) {
                this.Audios[i] = new Audio(source.Audios[i]);
            }
        }
        if (source.OptionMode != null) {
            this.OptionMode = new Long(source.OptionMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamSimple(map, prefix + "IsFromSelf", this.IsFromSelf);
        this.setParamSimple(map, prefix + "FromName", this.FromName);
        this.setParamSimple(map, prefix + "FromAvatar", this.FromAvatar);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "HasRead", this.HasRead);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "CanRating", this.CanRating);
        this.setParamSimple(map, prefix + "CanFeedback", this.CanFeedback);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);
        this.setParamSimple(map, prefix + "IsLlmGenerated", this.IsLlmGenerated);
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamObj(map, prefix + "TokenStat.", this.TokenStat);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamObj(map, prefix + "TaskFlow.", this.TaskFlow);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "QuoteInfos.", this.QuoteInfos);
        this.setParamObj(map, prefix + "AgentThought.", this.AgentThought);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamObj(map, prefix + "WorkFlow.", this.WorkFlow);
        this.setParamArrayObj(map, prefix + "Widgets.", this.Widgets);
        this.setParamObj(map, prefix + "WidgetAction.", this.WidgetAction);
        this.setParamArrayObj(map, prefix + "Audios.", this.Audios);
        this.setParamSimple(map, prefix + "OptionMode", this.OptionMode);

    }
}

