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

public class TalkAgentInfo extends AbstractModel {

    /**
    * <p>主账号UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>账号AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>智能体ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>智能体名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>智能体描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * <p>IoT 工具列表</p>
    */
    @SerializedName("IOTTools")
    @Expose
    private TalkIOTTool [] IOTTools;

    /**
    * <p>Webhook 工具列表</p>
    */
    @SerializedName("WebhookTools")
    @Expose
    private TalkWebhookTool [] WebhookTools;

    /**
    * <p>元信息JSON object 字符串</p>
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * <p>绑定关系列表</p>
    */
    @SerializedName("Bindings")
    @Expose
    private TalkAgentBinding [] Bindings;

    /**
    * <p>创建时间，Unix 秒</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间，Unix 秒</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>事件回调配置</p>
    */
    @SerializedName("EventCallbackConfig")
    @Expose
    private TalkEventCallbackConfig EventCallbackConfig;

    /**
     * Get <p>主账号UIN</p> 
     * @return Uin <p>主账号UIN</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号UIN</p>
     * @param Uin <p>主账号UIN</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>账号AppId</p> 
     * @return AppId <p>账号AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号AppId</p>
     * @param AppId <p>账号AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>智能体ID</p> 
     * @return AgentId <p>智能体ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>智能体ID</p>
     * @param AgentId <p>智能体ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>智能体名称</p> 
     * @return Name <p>智能体名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>智能体名称</p>
     * @param Name <p>智能体名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>智能体描述</p> 
     * @return Description <p>智能体描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>智能体描述</p>
     * @param Description <p>智能体描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

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
     * Get <p>IoT 工具列表</p> 
     * @return IOTTools <p>IoT 工具列表</p>
     */
    public TalkIOTTool [] getIOTTools() {
        return this.IOTTools;
    }

    /**
     * Set <p>IoT 工具列表</p>
     * @param IOTTools <p>IoT 工具列表</p>
     */
    public void setIOTTools(TalkIOTTool [] IOTTools) {
        this.IOTTools = IOTTools;
    }

    /**
     * Get <p>Webhook 工具列表</p> 
     * @return WebhookTools <p>Webhook 工具列表</p>
     */
    public TalkWebhookTool [] getWebhookTools() {
        return this.WebhookTools;
    }

    /**
     * Set <p>Webhook 工具列表</p>
     * @param WebhookTools <p>Webhook 工具列表</p>
     */
    public void setWebhookTools(TalkWebhookTool [] WebhookTools) {
        this.WebhookTools = WebhookTools;
    }

    /**
     * Get <p>元信息JSON object 字符串</p> 
     * @return Metadata <p>元信息JSON object 字符串</p>
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元信息JSON object 字符串</p>
     * @param Metadata <p>元信息JSON object 字符串</p>
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>绑定关系列表</p> 
     * @return Bindings <p>绑定关系列表</p>
     */
    public TalkAgentBinding [] getBindings() {
        return this.Bindings;
    }

    /**
     * Set <p>绑定关系列表</p>
     * @param Bindings <p>绑定关系列表</p>
     */
    public void setBindings(TalkAgentBinding [] Bindings) {
        this.Bindings = Bindings;
    }

    /**
     * Get <p>创建时间，Unix 秒</p> 
     * @return CreateTime <p>创建时间，Unix 秒</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，Unix 秒</p>
     * @param CreateTime <p>创建时间，Unix 秒</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，Unix 秒</p> 
     * @return UpdateTime <p>更新时间，Unix 秒</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，Unix 秒</p>
     * @param UpdateTime <p>更新时间，Unix 秒</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>事件回调配置</p> 
     * @return EventCallbackConfig <p>事件回调配置</p>
     */
    public TalkEventCallbackConfig getEventCallbackConfig() {
        return this.EventCallbackConfig;
    }

    /**
     * Set <p>事件回调配置</p>
     * @param EventCallbackConfig <p>事件回调配置</p>
     */
    public void setEventCallbackConfig(TalkEventCallbackConfig EventCallbackConfig) {
        this.EventCallbackConfig = EventCallbackConfig;
    }

    public TalkAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkAgentInfo(TalkAgentInfo source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.STTConfig != null) {
            this.STTConfig = new TalkSTTConfig(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new TalkLLMConfig(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new TalkTTSConfig(source.TTSConfig);
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
        if (source.Bindings != null) {
            this.Bindings = new TalkAgentBinding[source.Bindings.length];
            for (int i = 0; i < source.Bindings.length; i++) {
                this.Bindings[i] = new TalkAgentBinding(source.Bindings[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.EventCallbackConfig != null) {
            this.EventCallbackConfig = new TalkEventCallbackConfig(source.EventCallbackConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamObj(map, prefix + "ConversationConfig.", this.ConversationConfig);
        this.setParamObj(map, prefix + "MemoryConfig.", this.MemoryConfig);
        this.setParamArrayObj(map, prefix + "IOTTools.", this.IOTTools);
        this.setParamArrayObj(map, prefix + "WebhookTools.", this.WebhookTools);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamArrayObj(map, prefix + "Bindings.", this.Bindings);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "EventCallbackConfig.", this.EventCallbackConfig);

    }
}

