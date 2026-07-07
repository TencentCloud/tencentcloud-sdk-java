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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * <p>virtual key，用于向代理网关鉴权</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>多模态附件列表</p>
    */
    @SerializedName("Attachments")
    @Expose
    private MultiModalityAttachments [] Attachments;

    /**
    * <p>聊天内容</p>
    */
    @SerializedName("ChatContent")
    @Expose
    private String ChatContent;

    /**
    * <p>模型名称，配置的模型标识</p><p>示例：gpt-4o、deepseek-chat</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>模型路由实例ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>请求路径</p><p>默认值：/v1/chat/completions</p>
    */
    @SerializedName("RequestPath")
    @Expose
    private String RequestPath;

    /**
     * Get <p>virtual key，用于向代理网关鉴权</p> 
     * @return ApiKey <p>virtual key，用于向代理网关鉴权</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>virtual key，用于向代理网关鉴权</p>
     * @param ApiKey <p>virtual key，用于向代理网关鉴权</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>多模态附件列表</p> 
     * @return Attachments <p>多模态附件列表</p>
     */
    public MultiModalityAttachments [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set <p>多模态附件列表</p>
     * @param Attachments <p>多模态附件列表</p>
     */
    public void setAttachments(MultiModalityAttachments [] Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get <p>聊天内容</p> 
     * @return ChatContent <p>聊天内容</p>
     */
    public String getChatContent() {
        return this.ChatContent;
    }

    /**
     * Set <p>聊天内容</p>
     * @param ChatContent <p>聊天内容</p>
     */
    public void setChatContent(String ChatContent) {
        this.ChatContent = ChatContent;
    }

    /**
     * Get <p>模型名称，配置的模型标识</p><p>示例：gpt-4o、deepseek-chat</p> 
     * @return Model <p>模型名称，配置的模型标识</p><p>示例：gpt-4o、deepseek-chat</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称，配置的模型标识</p><p>示例：gpt-4o、deepseek-chat</p>
     * @param Model <p>模型名称，配置的模型标识</p><p>示例：gpt-4o、deepseek-chat</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>模型路由实例ID</p> 
     * @return ModelRouterId <p>模型路由实例ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID</p>
     * @param ModelRouterId <p>模型路由实例ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>请求路径</p><p>默认值：/v1/chat/completions</p> 
     * @return RequestPath <p>请求路径</p><p>默认值：/v1/chat/completions</p>
     */
    public String getRequestPath() {
        return this.RequestPath;
    }

    /**
     * Set <p>请求路径</p><p>默认值：/v1/chat/completions</p>
     * @param RequestPath <p>请求路径</p><p>默认值：/v1/chat/completions</p>
     */
    public void setRequestPath(String RequestPath) {
        this.RequestPath = RequestPath;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Attachments != null) {
            this.Attachments = new MultiModalityAttachments[source.Attachments.length];
            for (int i = 0; i < source.Attachments.length; i++) {
                this.Attachments[i] = new MultiModalityAttachments(source.Attachments[i]);
            }
        }
        if (source.ChatContent != null) {
            this.ChatContent = new String(source.ChatContent);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.RequestPath != null) {
            this.RequestPath = new String(source.RequestPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);
        this.setParamSimple(map, prefix + "ChatContent", this.ChatContent);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "RequestPath", this.RequestPath);

    }
}

