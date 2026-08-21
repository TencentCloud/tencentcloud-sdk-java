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

public class MsgRecord extends AbstractModel {

    /**
    * 答案
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 意图
    */
    @SerializedName("Intent")
    @Expose
    private String Intent;

    /**
    * 意图分类
    */
    @SerializedName("IntentCategory")
    @Expose
    private String IntentCategory;

    /**
    * 是否是智能分类
    */
    @SerializedName("IsSmart")
    @Expose
    private Boolean IsSmart;

    /**
    * 问题
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 记录ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 表示消息的回复方式，枚举 ReplyMethod：0=未指定, 1=大模型直接回复, 2=保守回复, 3=拒答, 4=敏感回复, 5=问答对优先回复, 6=欢迎语, 7=并发超限, 8=全局干预知识, 9=任务流程过程回复, 10=任务流程答案, 11=搜索引擎, 12=知识润色, 13=图片理解, 14=实时文档, 15=澄清确认, 16=工作流回复, 17=工作流结束, 18=智能体回复, 19=多意图, 20=中断, 21=智能体计划预览, 22=智能体计划结果, 23=智能体结构化输出。
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
    * 返回结果
    */
    @SerializedName("Result")
    @Expose
    private MsgRecordResult Result;

    /**
    * 分数
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private MsgRecordSource Source;

    /**
    * trace_id
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
     * Get 答案 
     * @return Answer 答案
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案
     * @param Answer 答案
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 分类ID 
     * @return CategoryId 分类ID
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类ID
     * @param CategoryId 分类ID
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 意图 
     * @return Intent 意图
     */
    public String getIntent() {
        return this.Intent;
    }

    /**
     * Set 意图
     * @param Intent 意图
     */
    public void setIntent(String Intent) {
        this.Intent = Intent;
    }

    /**
     * Get 意图分类 
     * @return IntentCategory 意图分类
     */
    public String getIntentCategory() {
        return this.IntentCategory;
    }

    /**
     * Set 意图分类
     * @param IntentCategory 意图分类
     */
    public void setIntentCategory(String IntentCategory) {
        this.IntentCategory = IntentCategory;
    }

    /**
     * Get 是否是智能分类 
     * @return IsSmart 是否是智能分类
     */
    public Boolean getIsSmart() {
        return this.IsSmart;
    }

    /**
     * Set 是否是智能分类
     * @param IsSmart 是否是智能分类
     */
    public void setIsSmart(Boolean IsSmart) {
        this.IsSmart = IsSmart;
    }

    /**
     * Get 问题 
     * @return Question 问题
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题
     * @param Question 问题
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 记录ID 
     * @return RecordId 记录ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录ID
     * @param RecordId 记录ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 表示消息的回复方式，枚举 ReplyMethod：0=未指定, 1=大模型直接回复, 2=保守回复, 3=拒答, 4=敏感回复, 5=问答对优先回复, 6=欢迎语, 7=并发超限, 8=全局干预知识, 9=任务流程过程回复, 10=任务流程答案, 11=搜索引擎, 12=知识润色, 13=图片理解, 14=实时文档, 15=澄清确认, 16=工作流回复, 17=工作流结束, 18=智能体回复, 19=多意图, 20=中断, 21=智能体计划预览, 22=智能体计划结果, 23=智能体结构化输出。 
     * @return ReplyMethod 表示消息的回复方式，枚举 ReplyMethod：0=未指定, 1=大模型直接回复, 2=保守回复, 3=拒答, 4=敏感回复, 5=问答对优先回复, 6=欢迎语, 7=并发超限, 8=全局干预知识, 9=任务流程过程回复, 10=任务流程答案, 11=搜索引擎, 12=知识润色, 13=图片理解, 14=实时文档, 15=澄清确认, 16=工作流回复, 17=工作流结束, 18=智能体回复, 19=多意图, 20=中断, 21=智能体计划预览, 22=智能体计划结果, 23=智能体结构化输出。
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set 表示消息的回复方式，枚举 ReplyMethod：0=未指定, 1=大模型直接回复, 2=保守回复, 3=拒答, 4=敏感回复, 5=问答对优先回复, 6=欢迎语, 7=并发超限, 8=全局干预知识, 9=任务流程过程回复, 10=任务流程答案, 11=搜索引擎, 12=知识润色, 13=图片理解, 14=实时文档, 15=澄清确认, 16=工作流回复, 17=工作流结束, 18=智能体回复, 19=多意图, 20=中断, 21=智能体计划预览, 22=智能体计划结果, 23=智能体结构化输出。
     * @param ReplyMethod 表示消息的回复方式，枚举 ReplyMethod：0=未指定, 1=大模型直接回复, 2=保守回复, 3=拒答, 4=敏感回复, 5=问答对优先回复, 6=欢迎语, 7=并发超限, 8=全局干预知识, 9=任务流程过程回复, 10=任务流程答案, 11=搜索引擎, 12=知识润色, 13=图片理解, 14=实时文档, 15=澄清确认, 16=工作流回复, 17=工作流结束, 18=智能体回复, 19=多意图, 20=中断, 21=智能体计划预览, 22=智能体计划结果, 23=智能体结构化输出。
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    /**
     * Get 返回结果 
     * @return Result 返回结果
     */
    public MsgRecordResult getResult() {
        return this.Result;
    }

    /**
     * Set 返回结果
     * @param Result 返回结果
     */
    public void setResult(MsgRecordResult Result) {
        this.Result = Result;
    }

    /**
     * Get 分数 
     * @return Score 分数
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 分数
     * @param Score 分数
     */
    public void setScore(Long Score) {
        this.Score = Score;
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
     * Get 来源 
     * @return Source 来源
     */
    public MsgRecordSource getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(MsgRecordSource Source) {
        this.Source = Source;
    }

    /**
     * Get trace_id 
     * @return TraceId trace_id
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set trace_id
     * @param TraceId trace_id
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    public MsgRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecord(MsgRecord source) {
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Intent != null) {
            this.Intent = new String(source.Intent);
        }
        if (source.IntentCategory != null) {
            this.IntentCategory = new String(source.IntentCategory);
        }
        if (source.IsSmart != null) {
            this.IsSmart = new Boolean(source.IsSmart);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
        if (source.Result != null) {
            this.Result = new MsgRecordResult(source.Result);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Source != null) {
            this.Source = new MsgRecordSource(source.Source);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Intent", this.Intent);
        this.setParamSimple(map, prefix + "IntentCategory", this.IntentCategory);
        this.setParamSimple(map, prefix + "IsSmart", this.IsSmart);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);

    }
}

