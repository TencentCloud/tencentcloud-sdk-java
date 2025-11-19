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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Record extends AbstractModel {

    /**
    * 问题内容
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 回答内容
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 思考内容
    */
    @SerializedName("Think")
    @Expose
    private String Think;

    /**
    * 任务列表
    */
    @SerializedName("TaskList")
    @Expose
    private Task [] TaskList;

    /**
    * 记录创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 记录更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 记录id
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 总结内容
    */
    @SerializedName("FinalSummary")
    @Expose
    private String FinalSummary;

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 1=赞，2=踩，0=无反馈
    */
    @SerializedName("Feedback")
    @Expose
    private Long Feedback;

    /**
    * 数据库信息
    */
    @SerializedName("DbInfo")
    @Expose
    private String DbInfo;

    /**
    * 错误信息
    */
    @SerializedName("ErrorContext")
    @Expose
    private String ErrorContext;

    /**
    * TaskList的string字符串
    */
    @SerializedName("TaskListStr")
    @Expose
    private String TaskListStr;

    /**
    * 知识库id列表
    */
    @SerializedName("KnowledgeBaseIds")
    @Expose
    private String [] KnowledgeBaseIds;

    /**
    * 上下文
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get 问题内容 
     * @return Question 问题内容
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题内容
     * @param Question 问题内容
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 回答内容 
     * @return Answer 回答内容
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 回答内容
     * @param Answer 回答内容
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 思考内容 
     * @return Think 思考内容
     */
    public String getThink() {
        return this.Think;
    }

    /**
     * Set 思考内容
     * @param Think 思考内容
     */
    public void setThink(String Think) {
        this.Think = Think;
    }

    /**
     * Get 任务列表 
     * @return TaskList 任务列表
     */
    public Task [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 任务列表
     * @param TaskList 任务列表
     */
    public void setTaskList(Task [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get 记录创建时间 
     * @return CreateTime 记录创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 记录创建时间
     * @param CreateTime 记录创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 记录更新时间 
     * @return UpdateTime 记录更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 记录更新时间
     * @param UpdateTime 记录更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 记录id 
     * @return RecordId 记录id
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录id
     * @param RecordId 记录id
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 总结内容 
     * @return FinalSummary 总结内容
     */
    public String getFinalSummary() {
        return this.FinalSummary;
    }

    /**
     * Set 总结内容
     * @param FinalSummary 总结内容
     */
    public void setFinalSummary(String FinalSummary) {
        this.FinalSummary = FinalSummary;
    }

    /**
     * Get 会话ID 
     * @return SessionId 会话ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话ID
     * @param SessionId 会话ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 1=赞，2=踩，0=无反馈 
     * @return Feedback 1=赞，2=踩，0=无反馈
     */
    public Long getFeedback() {
        return this.Feedback;
    }

    /**
     * Set 1=赞，2=踩，0=无反馈
     * @param Feedback 1=赞，2=踩，0=无反馈
     */
    public void setFeedback(Long Feedback) {
        this.Feedback = Feedback;
    }

    /**
     * Get 数据库信息 
     * @return DbInfo 数据库信息
     */
    public String getDbInfo() {
        return this.DbInfo;
    }

    /**
     * Set 数据库信息
     * @param DbInfo 数据库信息
     */
    public void setDbInfo(String DbInfo) {
        this.DbInfo = DbInfo;
    }

    /**
     * Get 错误信息 
     * @return ErrorContext 错误信息
     */
    public String getErrorContext() {
        return this.ErrorContext;
    }

    /**
     * Set 错误信息
     * @param ErrorContext 错误信息
     */
    public void setErrorContext(String ErrorContext) {
        this.ErrorContext = ErrorContext;
    }

    /**
     * Get TaskList的string字符串 
     * @return TaskListStr TaskList的string字符串
     */
    public String getTaskListStr() {
        return this.TaskListStr;
    }

    /**
     * Set TaskList的string字符串
     * @param TaskListStr TaskList的string字符串
     */
    public void setTaskListStr(String TaskListStr) {
        this.TaskListStr = TaskListStr;
    }

    /**
     * Get 知识库id列表 
     * @return KnowledgeBaseIds 知识库id列表
     */
    public String [] getKnowledgeBaseIds() {
        return this.KnowledgeBaseIds;
    }

    /**
     * Set 知识库id列表
     * @param KnowledgeBaseIds 知识库id列表
     */
    public void setKnowledgeBaseIds(String [] KnowledgeBaseIds) {
        this.KnowledgeBaseIds = KnowledgeBaseIds;
    }

    /**
     * Get 上下文 
     * @return Context 上下文
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 上下文
     * @param Context 上下文
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public Record() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Record(Record source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Think != null) {
            this.Think = new String(source.Think);
        }
        if (source.TaskList != null) {
            this.TaskList = new Task[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new Task(source.TaskList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.FinalSummary != null) {
            this.FinalSummary = new String(source.FinalSummary);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Feedback != null) {
            this.Feedback = new Long(source.Feedback);
        }
        if (source.DbInfo != null) {
            this.DbInfo = new String(source.DbInfo);
        }
        if (source.ErrorContext != null) {
            this.ErrorContext = new String(source.ErrorContext);
        }
        if (source.TaskListStr != null) {
            this.TaskListStr = new String(source.TaskListStr);
        }
        if (source.KnowledgeBaseIds != null) {
            this.KnowledgeBaseIds = new String[source.KnowledgeBaseIds.length];
            for (int i = 0; i < source.KnowledgeBaseIds.length; i++) {
                this.KnowledgeBaseIds[i] = new String(source.KnowledgeBaseIds[i]);
            }
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Think", this.Think);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "FinalSummary", this.FinalSummary);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Feedback", this.Feedback);
        this.setParamSimple(map, prefix + "DbInfo", this.DbInfo);
        this.setParamSimple(map, prefix + "ErrorContext", this.ErrorContext);
        this.setParamSimple(map, prefix + "TaskListStr", this.TaskListStr);
        this.setParamArraySimple(map, prefix + "KnowledgeBaseIds.", this.KnowledgeBaseIds);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

