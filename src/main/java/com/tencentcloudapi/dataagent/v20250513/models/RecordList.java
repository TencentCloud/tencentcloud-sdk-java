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

public class RecordList extends AbstractModel {

    /**
    * <p>会话上下文</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>记录id</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>追踪id</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>会话id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>问题</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>回答</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>0-否定反馈, 1-肯定反馈</p>
    */
    @SerializedName("Feedback")
    @Expose
    private Long Feedback;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorContext")
    @Expose
    private String ErrorContext;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>模型信息</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get <p>会话上下文</p> 
     * @return Context <p>会话上下文</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>会话上下文</p>
     * @param Context <p>会话上下文</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>记录id</p> 
     * @return RecordId <p>记录id</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>记录id</p>
     * @param RecordId <p>记录id</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>追踪id</p> 
     * @return TraceId <p>追踪id</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>追踪id</p>
     * @param TraceId <p>追踪id</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>会话id</p> 
     * @return SessionId <p>会话id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话id</p>
     * @param SessionId <p>会话id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>问题</p> 
     * @return Question <p>问题</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>问题</p>
     * @param Question <p>问题</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>回答</p> 
     * @return Answer <p>回答</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>回答</p>
     * @param Answer <p>回答</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>0-否定反馈, 1-肯定反馈</p> 
     * @return Feedback <p>0-否定反馈, 1-肯定反馈</p>
     */
    public Long getFeedback() {
        return this.Feedback;
    }

    /**
     * Set <p>0-否定反馈, 1-肯定反馈</p>
     * @param Feedback <p>0-否定反馈, 1-肯定反馈</p>
     */
    public void setFeedback(Long Feedback) {
        this.Feedback = Feedback;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorContext <p>错误信息</p>
     */
    public String getErrorContext() {
        return this.ErrorContext;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorContext <p>错误信息</p>
     */
    public void setErrorContext(String ErrorContext) {
        this.ErrorContext = ErrorContext;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>模型信息</p> 
     * @return Model <p>模型信息</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型信息</p>
     * @param Model <p>模型信息</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public RecordList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordList(RecordList source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Feedback != null) {
            this.Feedback = new Long(source.Feedback);
        }
        if (source.ErrorContext != null) {
            this.ErrorContext = new String(source.ErrorContext);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Feedback", this.Feedback);
        this.setParamSimple(map, prefix + "ErrorContext", this.ErrorContext);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

