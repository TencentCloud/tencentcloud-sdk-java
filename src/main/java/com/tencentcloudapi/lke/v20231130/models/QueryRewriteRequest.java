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

public class QueryRewriteRequest extends AbstractModel {

    /**
    * 需要改写的问题
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 需要改写的多轮历史会话，每轮历史对话需要包含user（问）和assistant（答）成对输入，由于模型字符限制，最多提供4轮对话。
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 模型名称
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get 需要改写的问题 
     * @return Question 需要改写的问题
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 需要改写的问题
     * @param Question 需要改写的问题
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 需要改写的多轮历史会话，每轮历史对话需要包含user（问）和assistant（答）成对输入，由于模型字符限制，最多提供4轮对话。 
     * @return Messages 需要改写的多轮历史会话，每轮历史对话需要包含user（问）和assistant（答）成对输入，由于模型字符限制，最多提供4轮对话。
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 需要改写的多轮历史会话，每轮历史对话需要包含user（问）和assistant（答）成对输入，由于模型字符限制，最多提供4轮对话。
     * @param Messages 需要改写的多轮历史会话，每轮历史对话需要包含user（问）和assistant（答）成对输入，由于模型字符限制，最多提供4轮对话。
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 模型名称 
     * @return Model 模型名称
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称
     * @param Model 模型名称
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public QueryRewriteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRewriteRequest(QueryRewriteRequest source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

