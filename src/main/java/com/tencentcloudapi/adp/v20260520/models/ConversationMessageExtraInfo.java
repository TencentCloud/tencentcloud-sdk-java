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

public class ConversationMessageExtraInfo extends AbstractModel {

    /**
    * <p>智能体图标</p>
    */
    @SerializedName("AgentIcon")
    @Expose
    private String AgentIcon;

    /**
    * <p>智能体名称</p>
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * <p>消息处理耗时</p>
    */
    @SerializedName("Elapsed")
    @Expose
    private String Elapsed;

    /**
    * <p>父消息 ID</p>
    */
    @SerializedName("ParentMessageId")
    @Expose
    private String ParentMessageId;

    /**
    * <p>关联记录 ID</p>
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * <p>消息处理开始时间戳（毫秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>工具图标</p>
    */
    @SerializedName("ToolIcon")
    @Expose
    private String ToolIcon;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>Trace ID</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>是否可以反馈</p>
    */
    @SerializedName("CanFeedback")
    @Expose
    private Boolean CanFeedback;

    /**
    * <p>是否可以点赞点踩</p>
    */
    @SerializedName("CanRate")
    @Expose
    private Boolean CanRate;

    /**
    * <p>消息处理开始时间戳（毫秒）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>是否已读</p>
    */
    @SerializedName("HasRead")
    @Expose
    private Boolean HasRead;

    /**
    * <p>是否大模型生成</p>
    */
    @SerializedName("IsModelGenerated")
    @Expose
    private Boolean IsModelGenerated;

    /**
    * <p>用户反馈标签列表</p>
    */
    @SerializedName("ReasonList")
    @Expose
    private String [] ReasonList;

    /**
    * <p>回复方式</p>
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
    * <p>用户打分</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>子 Agent 运行 Id</p>
    */
    @SerializedName("SubAgentRunId")
    @Expose
    private String SubAgentRunId;

    /**
    * <p>是否是子 Agent 的消息</p>
    */
    @SerializedName("IsSubAgent")
    @Expose
    private Boolean IsSubAgent;

    /**
    * <p>子 Agent 线程 ID</p>
    */
    @SerializedName("SubAgentThreadId")
    @Expose
    private String SubAgentThreadId;

    /**
    * <p>是否是 Agent Team 模式下的 teammate 成员</p>
    */
    @SerializedName("IsTeammate")
    @Expose
    private Boolean IsTeammate;

    /**
    * <p>Agent Team 模式下的 teammate 名称</p>
    */
    @SerializedName("TeammateName")
    @Expose
    private String TeammateName;

    /**
    * <p>工作流节点名称</p>
    */
    @SerializedName("WorkflowNodeName")
    @Expose
    private String WorkflowNodeName;

    /**
     * Get <p>智能体图标</p> 
     * @return AgentIcon <p>智能体图标</p>
     */
    public String getAgentIcon() {
        return this.AgentIcon;
    }

    /**
     * Set <p>智能体图标</p>
     * @param AgentIcon <p>智能体图标</p>
     */
    public void setAgentIcon(String AgentIcon) {
        this.AgentIcon = AgentIcon;
    }

    /**
     * Get <p>智能体名称</p> 
     * @return AgentName <p>智能体名称</p>
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set <p>智能体名称</p>
     * @param AgentName <p>智能体名称</p>
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get <p>消息处理耗时</p> 
     * @return Elapsed <p>消息处理耗时</p>
     */
    public String getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set <p>消息处理耗时</p>
     * @param Elapsed <p>消息处理耗时</p>
     */
    public void setElapsed(String Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get <p>父消息 ID</p> 
     * @return ParentMessageId <p>父消息 ID</p>
     */
    public String getParentMessageId() {
        return this.ParentMessageId;
    }

    /**
     * Set <p>父消息 ID</p>
     * @param ParentMessageId <p>父消息 ID</p>
     */
    public void setParentMessageId(String ParentMessageId) {
        this.ParentMessageId = ParentMessageId;
    }

    /**
     * Get <p>关联记录 ID</p> 
     * @return RelatedRecordId <p>关联记录 ID</p>
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set <p>关联记录 ID</p>
     * @param RelatedRecordId <p>关联记录 ID</p>
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get <p>消息处理开始时间戳（毫秒）</p> 
     * @return StartTime <p>消息处理开始时间戳（毫秒）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>消息处理开始时间戳（毫秒）</p>
     * @param StartTime <p>消息处理开始时间戳（毫秒）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>工具图标</p> 
     * @return ToolIcon <p>工具图标</p>
     */
    public String getToolIcon() {
        return this.ToolIcon;
    }

    /**
     * Set <p>工具图标</p>
     * @param ToolIcon <p>工具图标</p>
     */
    public void setToolIcon(String ToolIcon) {
        this.ToolIcon = ToolIcon;
    }

    /**
     * Get <p>工具名称</p> 
     * @return ToolName <p>工具名称</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>工具名称</p>
     * @param ToolName <p>工具名称</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>Trace ID</p> 
     * @return TraceId <p>Trace ID</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>Trace ID</p>
     * @param TraceId <p>Trace ID</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>是否可以反馈</p> 
     * @return CanFeedback <p>是否可以反馈</p>
     */
    public Boolean getCanFeedback() {
        return this.CanFeedback;
    }

    /**
     * Set <p>是否可以反馈</p>
     * @param CanFeedback <p>是否可以反馈</p>
     */
    public void setCanFeedback(Boolean CanFeedback) {
        this.CanFeedback = CanFeedback;
    }

    /**
     * Get <p>是否可以点赞点踩</p> 
     * @return CanRate <p>是否可以点赞点踩</p>
     */
    public Boolean getCanRate() {
        return this.CanRate;
    }

    /**
     * Set <p>是否可以点赞点踩</p>
     * @param CanRate <p>是否可以点赞点踩</p>
     */
    public void setCanRate(Boolean CanRate) {
        this.CanRate = CanRate;
    }

    /**
     * Get <p>消息处理开始时间戳（毫秒）</p> 
     * @return EndTime <p>消息处理开始时间戳（毫秒）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>消息处理开始时间戳（毫秒）</p>
     * @param EndTime <p>消息处理开始时间戳（毫秒）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get <p>是否大模型生成</p> 
     * @return IsModelGenerated <p>是否大模型生成</p>
     */
    public Boolean getIsModelGenerated() {
        return this.IsModelGenerated;
    }

    /**
     * Set <p>是否大模型生成</p>
     * @param IsModelGenerated <p>是否大模型生成</p>
     */
    public void setIsModelGenerated(Boolean IsModelGenerated) {
        this.IsModelGenerated = IsModelGenerated;
    }

    /**
     * Get <p>用户反馈标签列表</p> 
     * @return ReasonList <p>用户反馈标签列表</p>
     */
    public String [] getReasonList() {
        return this.ReasonList;
    }

    /**
     * Set <p>用户反馈标签列表</p>
     * @param ReasonList <p>用户反馈标签列表</p>
     */
    public void setReasonList(String [] ReasonList) {
        this.ReasonList = ReasonList;
    }

    /**
     * Get <p>回复方式</p> 
     * @return ReplyMethod <p>回复方式</p>
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set <p>回复方式</p>
     * @param ReplyMethod <p>回复方式</p>
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    /**
     * Get <p>用户打分</p> 
     * @return Score <p>用户打分</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>用户打分</p>
     * @param Score <p>用户打分</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>子 Agent 运行 Id</p> 
     * @return SubAgentRunId <p>子 Agent 运行 Id</p>
     */
    public String getSubAgentRunId() {
        return this.SubAgentRunId;
    }

    /**
     * Set <p>子 Agent 运行 Id</p>
     * @param SubAgentRunId <p>子 Agent 运行 Id</p>
     */
    public void setSubAgentRunId(String SubAgentRunId) {
        this.SubAgentRunId = SubAgentRunId;
    }

    /**
     * Get <p>是否是子 Agent 的消息</p> 
     * @return IsSubAgent <p>是否是子 Agent 的消息</p>
     */
    public Boolean getIsSubAgent() {
        return this.IsSubAgent;
    }

    /**
     * Set <p>是否是子 Agent 的消息</p>
     * @param IsSubAgent <p>是否是子 Agent 的消息</p>
     */
    public void setIsSubAgent(Boolean IsSubAgent) {
        this.IsSubAgent = IsSubAgent;
    }

    /**
     * Get <p>子 Agent 线程 ID</p> 
     * @return SubAgentThreadId <p>子 Agent 线程 ID</p>
     */
    public String getSubAgentThreadId() {
        return this.SubAgentThreadId;
    }

    /**
     * Set <p>子 Agent 线程 ID</p>
     * @param SubAgentThreadId <p>子 Agent 线程 ID</p>
     */
    public void setSubAgentThreadId(String SubAgentThreadId) {
        this.SubAgentThreadId = SubAgentThreadId;
    }

    /**
     * Get <p>是否是 Agent Team 模式下的 teammate 成员</p> 
     * @return IsTeammate <p>是否是 Agent Team 模式下的 teammate 成员</p>
     */
    public Boolean getIsTeammate() {
        return this.IsTeammate;
    }

    /**
     * Set <p>是否是 Agent Team 模式下的 teammate 成员</p>
     * @param IsTeammate <p>是否是 Agent Team 模式下的 teammate 成员</p>
     */
    public void setIsTeammate(Boolean IsTeammate) {
        this.IsTeammate = IsTeammate;
    }

    /**
     * Get <p>Agent Team 模式下的 teammate 名称</p> 
     * @return TeammateName <p>Agent Team 模式下的 teammate 名称</p>
     */
    public String getTeammateName() {
        return this.TeammateName;
    }

    /**
     * Set <p>Agent Team 模式下的 teammate 名称</p>
     * @param TeammateName <p>Agent Team 模式下的 teammate 名称</p>
     */
    public void setTeammateName(String TeammateName) {
        this.TeammateName = TeammateName;
    }

    /**
     * Get <p>工作流节点名称</p> 
     * @return WorkflowNodeName <p>工作流节点名称</p>
     */
    public String getWorkflowNodeName() {
        return this.WorkflowNodeName;
    }

    /**
     * Set <p>工作流节点名称</p>
     * @param WorkflowNodeName <p>工作流节点名称</p>
     */
    public void setWorkflowNodeName(String WorkflowNodeName) {
        this.WorkflowNodeName = WorkflowNodeName;
    }

    public ConversationMessageExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationMessageExtraInfo(ConversationMessageExtraInfo source) {
        if (source.AgentIcon != null) {
            this.AgentIcon = new String(source.AgentIcon);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.Elapsed != null) {
            this.Elapsed = new String(source.Elapsed);
        }
        if (source.ParentMessageId != null) {
            this.ParentMessageId = new String(source.ParentMessageId);
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ToolIcon != null) {
            this.ToolIcon = new String(source.ToolIcon);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.CanFeedback != null) {
            this.CanFeedback = new Boolean(source.CanFeedback);
        }
        if (source.CanRate != null) {
            this.CanRate = new Boolean(source.CanRate);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.HasRead != null) {
            this.HasRead = new Boolean(source.HasRead);
        }
        if (source.IsModelGenerated != null) {
            this.IsModelGenerated = new Boolean(source.IsModelGenerated);
        }
        if (source.ReasonList != null) {
            this.ReasonList = new String[source.ReasonList.length];
            for (int i = 0; i < source.ReasonList.length; i++) {
                this.ReasonList[i] = new String(source.ReasonList[i]);
            }
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.SubAgentRunId != null) {
            this.SubAgentRunId = new String(source.SubAgentRunId);
        }
        if (source.IsSubAgent != null) {
            this.IsSubAgent = new Boolean(source.IsSubAgent);
        }
        if (source.SubAgentThreadId != null) {
            this.SubAgentThreadId = new String(source.SubAgentThreadId);
        }
        if (source.IsTeammate != null) {
            this.IsTeammate = new Boolean(source.IsTeammate);
        }
        if (source.TeammateName != null) {
            this.TeammateName = new String(source.TeammateName);
        }
        if (source.WorkflowNodeName != null) {
            this.WorkflowNodeName = new String(source.WorkflowNodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentIcon", this.AgentIcon);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "ParentMessageId", this.ParentMessageId);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ToolIcon", this.ToolIcon);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "CanFeedback", this.CanFeedback);
        this.setParamSimple(map, prefix + "CanRate", this.CanRate);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "HasRead", this.HasRead);
        this.setParamSimple(map, prefix + "IsModelGenerated", this.IsModelGenerated);
        this.setParamArraySimple(map, prefix + "ReasonList.", this.ReasonList);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "SubAgentRunId", this.SubAgentRunId);
        this.setParamSimple(map, prefix + "IsSubAgent", this.IsSubAgent);
        this.setParamSimple(map, prefix + "SubAgentThreadId", this.SubAgentThreadId);
        this.setParamSimple(map, prefix + "IsTeammate", this.IsTeammate);
        this.setParamSimple(map, prefix + "TeammateName", this.TeammateName);
        this.setParamSimple(map, prefix + "WorkflowNodeName", this.WorkflowNodeName);

    }
}

