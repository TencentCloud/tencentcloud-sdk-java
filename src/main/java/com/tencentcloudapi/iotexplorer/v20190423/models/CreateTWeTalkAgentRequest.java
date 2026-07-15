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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTWeTalkAgentRequest extends AbstractModel {

    /**
    * <p>语音识别配置</p>
    */
    @SerializedName("STTConfig")
    @Expose
    private TalkSTTConfig STTConfig;

    /**
    * <p>大模型配置</p>
    */
    @SerializedName("LLMConfig")
    @Expose
    private TalkLLMConfig LLMConfig;

    /**
    * <p>语音合成配置</p>
    */
    @SerializedName("TTSConfig")
    @Expose
    private TalkTTSConfig TTSConfig;

    /**
    * <p>智能体名称；为空时使用默认智能体名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>智能体描述，最长1024字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>对话行为配置</p>
    */
    @SerializedName("ConversationConfig")
    @Expose
    private TalkConversationConfig ConversationConfig;

    /**
    * <p>长期记忆配置</p>
    */
    @SerializedName("MemoryConfig")
    @Expose
    private TalkMemoryConfig MemoryConfig;

    /**
    * <p>IoT工具配置列表</p>
    */
    @SerializedName("IOTTools")
    @Expose
    private TalkIOTTool [] IOTTools;

    /**
    * <p>Webhook工具配置列表</p>
    */
    @SerializedName("WebhookTools")
    @Expose
    private TalkWebhookTool [] WebhookTools;

    /**
    * <p>元信息扩展JSON对象字符串</p>
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
     * Get <p>语音识别配置</p> 
     * @return STTConfig <p>语音识别配置</p>
     */
    public TalkSTTConfig getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set <p>语音识别配置</p>
     * @param STTConfig <p>语音识别配置</p>
     */
    public void setSTTConfig(TalkSTTConfig STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get <p>大模型配置</p> 
     * @return LLMConfig <p>大模型配置</p>
     */
    public TalkLLMConfig getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set <p>大模型配置</p>
     * @param LLMConfig <p>大模型配置</p>
     */
    public void setLLMConfig(TalkLLMConfig LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get <p>语音合成配置</p> 
     * @return TTSConfig <p>语音合成配置</p>
     */
    public TalkTTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set <p>语音合成配置</p>
     * @param TTSConfig <p>语音合成配置</p>
     */
    public void setTTSConfig(TalkTTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get <p>智能体名称；为空时使用默认智能体名称</p> 
     * @return Name <p>智能体名称；为空时使用默认智能体名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>智能体名称；为空时使用默认智能体名称</p>
     * @param Name <p>智能体名称；为空时使用默认智能体名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>智能体描述，最长1024字符</p> 
     * @return Description <p>智能体描述，最长1024字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>智能体描述，最长1024字符</p>
     * @param Description <p>智能体描述，最长1024字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>对话行为配置</p> 
     * @return ConversationConfig <p>对话行为配置</p>
     */
    public TalkConversationConfig getConversationConfig() {
        return this.ConversationConfig;
    }

    /**
     * Set <p>对话行为配置</p>
     * @param ConversationConfig <p>对话行为配置</p>
     */
    public void setConversationConfig(TalkConversationConfig ConversationConfig) {
        this.ConversationConfig = ConversationConfig;
    }

    /**
     * Get <p>长期记忆配置</p> 
     * @return MemoryConfig <p>长期记忆配置</p>
     */
    public TalkMemoryConfig getMemoryConfig() {
        return this.MemoryConfig;
    }

    /**
     * Set <p>长期记忆配置</p>
     * @param MemoryConfig <p>长期记忆配置</p>
     */
    public void setMemoryConfig(TalkMemoryConfig MemoryConfig) {
        this.MemoryConfig = MemoryConfig;
    }

    /**
     * Get <p>IoT工具配置列表</p> 
     * @return IOTTools <p>IoT工具配置列表</p>
     */
    public TalkIOTTool [] getIOTTools() {
        return this.IOTTools;
    }

    /**
     * Set <p>IoT工具配置列表</p>
     * @param IOTTools <p>IoT工具配置列表</p>
     */
    public void setIOTTools(TalkIOTTool [] IOTTools) {
        this.IOTTools = IOTTools;
    }

    /**
     * Get <p>Webhook工具配置列表</p> 
     * @return WebhookTools <p>Webhook工具配置列表</p>
     */
    public TalkWebhookTool [] getWebhookTools() {
        return this.WebhookTools;
    }

    /**
     * Set <p>Webhook工具配置列表</p>
     * @param WebhookTools <p>Webhook工具配置列表</p>
     */
    public void setWebhookTools(TalkWebhookTool [] WebhookTools) {
        this.WebhookTools = WebhookTools;
    }

    /**
     * Get <p>元信息扩展JSON对象字符串</p> 
     * @return Metadata <p>元信息扩展JSON对象字符串</p>
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元信息扩展JSON对象字符串</p>
     * @param Metadata <p>元信息扩展JSON对象字符串</p>
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    public CreateTWeTalkAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeTalkAgentRequest(CreateTWeTalkAgentRequest source) {
        if (source.STTConfig != null) {
            this.STTConfig = new TalkSTTConfig(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new TalkLLMConfig(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new TalkTTSConfig(source.TTSConfig);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConversationConfig != null) {
            this.ConversationConfig = new TalkConversationConfig(source.ConversationConfig);
        }
        if (source.MemoryConfig != null) {
            this.MemoryConfig = new TalkMemoryConfig(source.MemoryConfig);
        }
        if (source.IOTTools != null) {
            this.IOTTools = new TalkIOTTool[source.IOTTools.length];
            for (int i = 0; i < source.IOTTools.length; i++) {
                this.IOTTools[i] = new TalkIOTTool(source.IOTTools[i]);
            }
        }
        if (source.WebhookTools != null) {
            this.WebhookTools = new TalkWebhookTool[source.WebhookTools.length];
            for (int i = 0; i < source.WebhookTools.length; i++) {
                this.WebhookTools[i] = new TalkWebhookTool(source.WebhookTools[i]);
            }
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "ConversationConfig.", this.ConversationConfig);
        this.setParamObj(map, prefix + "MemoryConfig.", this.MemoryConfig);
        this.setParamArrayObj(map, prefix + "IOTTools.", this.IOTTools);
        this.setParamArrayObj(map, prefix + "WebhookTools.", this.WebhookTools);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);

    }
}

