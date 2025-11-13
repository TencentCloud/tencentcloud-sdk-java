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

public class ChatAIRequest extends AbstractModel {

    /**
    * 会话ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 问题内容
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 上下文
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 模型
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 是否深度思考
    */
    @SerializedName("DeepThinking")
    @Expose
    private Boolean DeepThinking;

    /**
    * 数据源id
    */
    @SerializedName("DataSourceIds")
    @Expose
    private String [] DataSourceIds;

    /**
    * agent类型
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * 需要重新生成答案的记录ID
    */
    @SerializedName("OldRecordId")
    @Expose
    private String OldRecordId;

    /**
    * 知识库id列表
    */
    @SerializedName("KnowledgeBaseIds")
    @Expose
    private String [] KnowledgeBaseIds;

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
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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

    /**
     * Get 模型 
     * @return Model 模型
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型
     * @param Model 模型
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 是否深度思考 
     * @return DeepThinking 是否深度思考
     */
    public Boolean getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set 是否深度思考
     * @param DeepThinking 是否深度思考
     */
    public void setDeepThinking(Boolean DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get 数据源id 
     * @return DataSourceIds 数据源id
     */
    public String [] getDataSourceIds() {
        return this.DataSourceIds;
    }

    /**
     * Set 数据源id
     * @param DataSourceIds 数据源id
     */
    public void setDataSourceIds(String [] DataSourceIds) {
        this.DataSourceIds = DataSourceIds;
    }

    /**
     * Get agent类型 
     * @return AgentType agent类型
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set agent类型
     * @param AgentType agent类型
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 需要重新生成答案的记录ID 
     * @return OldRecordId 需要重新生成答案的记录ID
     */
    public String getOldRecordId() {
        return this.OldRecordId;
    }

    /**
     * Set 需要重新生成答案的记录ID
     * @param OldRecordId 需要重新生成答案的记录ID
     */
    public void setOldRecordId(String OldRecordId) {
        this.OldRecordId = OldRecordId;
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

    public ChatAIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatAIRequest(ChatAIRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.DeepThinking != null) {
            this.DeepThinking = new Boolean(source.DeepThinking);
        }
        if (source.DataSourceIds != null) {
            this.DataSourceIds = new String[source.DataSourceIds.length];
            for (int i = 0; i < source.DataSourceIds.length; i++) {
                this.DataSourceIds[i] = new String(source.DataSourceIds[i]);
            }
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.OldRecordId != null) {
            this.OldRecordId = new String(source.OldRecordId);
        }
        if (source.KnowledgeBaseIds != null) {
            this.KnowledgeBaseIds = new String[source.KnowledgeBaseIds.length];
            for (int i = 0; i < source.KnowledgeBaseIds.length; i++) {
                this.KnowledgeBaseIds[i] = new String(source.KnowledgeBaseIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "DeepThinking", this.DeepThinking);
        this.setParamArraySimple(map, prefix + "DataSourceIds.", this.DataSourceIds);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "OldRecordId", this.OldRecordId);
        this.setParamArraySimple(map, prefix + "KnowledgeBaseIds.", this.KnowledgeBaseIds);

    }
}

