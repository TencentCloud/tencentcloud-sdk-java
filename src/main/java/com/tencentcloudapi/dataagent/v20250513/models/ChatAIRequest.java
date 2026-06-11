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
    * <p>会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>问题内容</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>上下文</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>模型</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>是否深度思考</p>
    */
    @SerializedName("DeepThinking")
    @Expose
    private Boolean DeepThinking;

    /**
    * <p>数据源id</p>
    */
    @SerializedName("DataSourceIds")
    @Expose
    private String [] DataSourceIds;

    /**
    * <p>agent类型</p>
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * <p>需要重新生成答案的记录ID</p>
    */
    @SerializedName("OldRecordId")
    @Expose
    private String OldRecordId;

    /**
    * <p>知识库id列表</p>
    */
    @SerializedName("KnowledgeBaseIds")
    @Expose
    private String [] KnowledgeBaseIds;

    /**
     * Get <p>会话ID</p> 
     * @return SessionId <p>会话ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话ID</p>
     * @param SessionId <p>会话ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>问题内容</p> 
     * @return Question <p>问题内容</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>问题内容</p>
     * @param Question <p>问题内容</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>上下文</p> 
     * @return Context <p>上下文</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>上下文</p>
     * @param Context <p>上下文</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>模型</p> 
     * @return Model <p>模型</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型</p>
     * @param Model <p>模型</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>是否深度思考</p> 
     * @return DeepThinking <p>是否深度思考</p>
     */
    public Boolean getDeepThinking() {
        return this.DeepThinking;
    }

    /**
     * Set <p>是否深度思考</p>
     * @param DeepThinking <p>是否深度思考</p>
     */
    public void setDeepThinking(Boolean DeepThinking) {
        this.DeepThinking = DeepThinking;
    }

    /**
     * Get <p>数据源id</p> 
     * @return DataSourceIds <p>数据源id</p>
     */
    public String [] getDataSourceIds() {
        return this.DataSourceIds;
    }

    /**
     * Set <p>数据源id</p>
     * @param DataSourceIds <p>数据源id</p>
     */
    public void setDataSourceIds(String [] DataSourceIds) {
        this.DataSourceIds = DataSourceIds;
    }

    /**
     * Get <p>agent类型</p> 
     * @return AgentType <p>agent类型</p>
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set <p>agent类型</p>
     * @param AgentType <p>agent类型</p>
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get <p>需要重新生成答案的记录ID</p> 
     * @return OldRecordId <p>需要重新生成答案的记录ID</p>
     */
    public String getOldRecordId() {
        return this.OldRecordId;
    }

    /**
     * Set <p>需要重新生成答案的记录ID</p>
     * @param OldRecordId <p>需要重新生成答案的记录ID</p>
     */
    public void setOldRecordId(String OldRecordId) {
        this.OldRecordId = OldRecordId;
    }

    /**
     * Get <p>知识库id列表</p> 
     * @return KnowledgeBaseIds <p>知识库id列表</p>
     */
    public String [] getKnowledgeBaseIds() {
        return this.KnowledgeBaseIds;
    }

    /**
     * Set <p>知识库id列表</p>
     * @param KnowledgeBaseIds <p>知识库id列表</p>
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

