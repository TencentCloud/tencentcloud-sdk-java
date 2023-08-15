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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendChatMessageRequest extends AbstractModel{

    /**
    * 会话id，标识一组对话的唯一id，id变更则重置会话
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 问题描述
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 会话模型版本，不同的会话模型调用到不同的模型后台。
注: 多行业多场景大模型填写 tj_llm_clm-v1
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 使用模式(仅部分模型支持)。General 通用问答；WithSearchPlugin 搜索增强问答
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 搜索来源。仅当Mode未WithSearchPlugin时生效。Preset 预置文稿库；Custom 自定义。
    */
    @SerializedName("SearchSource")
    @Expose
    private String SearchSource;

    /**
     * Get 会话id，标识一组对话的唯一id，id变更则重置会话 
     * @return SessionId 会话id，标识一组对话的唯一id，id变更则重置会话
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话id，标识一组对话的唯一id，id变更则重置会话
     * @param SessionId 会话id，标识一组对话的唯一id，id变更则重置会话
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 问题描述 
     * @return Question 问题描述
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题描述
     * @param Question 问题描述
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 会话模型版本，不同的会话模型调用到不同的模型后台。
注: 多行业多场景大模型填写 tj_llm_clm-v1 
     * @return ModelVersion 会话模型版本，不同的会话模型调用到不同的模型后台。
注: 多行业多场景大模型填写 tj_llm_clm-v1
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 会话模型版本，不同的会话模型调用到不同的模型后台。
注: 多行业多场景大模型填写 tj_llm_clm-v1
     * @param ModelVersion 会话模型版本，不同的会话模型调用到不同的模型后台。
注: 多行业多场景大模型填写 tj_llm_clm-v1
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 使用模式(仅部分模型支持)。General 通用问答；WithSearchPlugin 搜索增强问答 
     * @return Mode 使用模式(仅部分模型支持)。General 通用问答；WithSearchPlugin 搜索增强问答
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 使用模式(仅部分模型支持)。General 通用问答；WithSearchPlugin 搜索增强问答
     * @param Mode 使用模式(仅部分模型支持)。General 通用问答；WithSearchPlugin 搜索增强问答
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 搜索来源。仅当Mode未WithSearchPlugin时生效。Preset 预置文稿库；Custom 自定义。 
     * @return SearchSource 搜索来源。仅当Mode未WithSearchPlugin时生效。Preset 预置文稿库；Custom 自定义。
     */
    public String getSearchSource() {
        return this.SearchSource;
    }

    /**
     * Set 搜索来源。仅当Mode未WithSearchPlugin时生效。Preset 预置文稿库；Custom 自定义。
     * @param SearchSource 搜索来源。仅当Mode未WithSearchPlugin时生效。Preset 预置文稿库；Custom 自定义。
     */
    public void setSearchSource(String SearchSource) {
        this.SearchSource = SearchSource;
    }

    public SendChatMessageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendChatMessageRequest(SendChatMessageRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.SearchSource != null) {
            this.SearchSource = new String(source.SearchSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "SearchSource", this.SearchSource);

    }
}

