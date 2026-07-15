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
    * 主账号UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 账号AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 智能体ID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 智能体名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能体描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 语音识别配置
    */
    @SerializedName("STTConfig")
    @Expose
    private TalkSTTConfig STTConfig;

    /**
    * 大模型配置
    */
    @SerializedName("LLMConfig")
    @Expose
    private TalkLLMConfig LLMConfig;

    /**
    * 语音合成配置
    */
    @SerializedName("TTSConfig")
    @Expose
    private TalkTTSConfig TTSConfig;

    /**
    * 对话行为配置
    */
    @SerializedName("ConversationConfig")
    @Expose
    private TalkConversationConfig ConversationConfig;

    /**
    * 长期记忆配置
    */
    @SerializedName("MemoryConfig")
    @Expose
    private TalkMemoryConfig MemoryConfig;

    /**
    * IoT 工具列表
    */
    @SerializedName("IOTTools")
    @Expose
    private TalkIOTTool [] IOTTools;

    /**
    * Webhook 工具列表
    */
    @SerializedName("WebhookTools")
    @Expose
    private TalkWebhookTool [] WebhookTools;

    /**
    * 元信息JSON object 字符串
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * 绑定关系列表
    */
    @SerializedName("Bindings")
    @Expose
    private TalkAgentBinding [] Bindings;

    /**
    * 创建时间，Unix 秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间，Unix 秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 主账号UIN 
     * @return Uin 主账号UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号UIN
     * @param Uin 主账号UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 账号AppId 
     * @return AppId 账号AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 账号AppId
     * @param AppId 账号AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 智能体ID 
     * @return AgentId 智能体ID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 智能体ID
     * @param AgentId 智能体ID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 智能体名称 
     * @return Name 智能体名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能体名称
     * @param Name 智能体名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 智能体描述 
     * @return Description 智能体描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 智能体描述
     * @param Description 智能体描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 语音识别配置 
     * @return STTConfig 语音识别配置
     */
    public TalkSTTConfig getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set 语音识别配置
     * @param STTConfig 语音识别配置
     */
    public void setSTTConfig(TalkSTTConfig STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get 大模型配置 
     * @return LLMConfig 大模型配置
     */
    public TalkLLMConfig getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set 大模型配置
     * @param LLMConfig 大模型配置
     */
    public void setLLMConfig(TalkLLMConfig LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get 语音合成配置 
     * @return TTSConfig 语音合成配置
     */
    public TalkTTSConfig getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set 语音合成配置
     * @param TTSConfig 语音合成配置
     */
    public void setTTSConfig(TalkTTSConfig TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get 对话行为配置 
     * @return ConversationConfig 对话行为配置
     */
    public TalkConversationConfig getConversationConfig() {
        return this.ConversationConfig;
    }

    /**
     * Set 对话行为配置
     * @param ConversationConfig 对话行为配置
     */
    public void setConversationConfig(TalkConversationConfig ConversationConfig) {
        this.ConversationConfig = ConversationConfig;
    }

    /**
     * Get 长期记忆配置 
     * @return MemoryConfig 长期记忆配置
     */
    public TalkMemoryConfig getMemoryConfig() {
        return this.MemoryConfig;
    }

    /**
     * Set 长期记忆配置
     * @param MemoryConfig 长期记忆配置
     */
    public void setMemoryConfig(TalkMemoryConfig MemoryConfig) {
        this.MemoryConfig = MemoryConfig;
    }

    /**
     * Get IoT 工具列表 
     * @return IOTTools IoT 工具列表
     */
    public TalkIOTTool [] getIOTTools() {
        return this.IOTTools;
    }

    /**
     * Set IoT 工具列表
     * @param IOTTools IoT 工具列表
     */
    public void setIOTTools(TalkIOTTool [] IOTTools) {
        this.IOTTools = IOTTools;
    }

    /**
     * Get Webhook 工具列表 
     * @return WebhookTools Webhook 工具列表
     */
    public TalkWebhookTool [] getWebhookTools() {
        return this.WebhookTools;
    }

    /**
     * Set Webhook 工具列表
     * @param WebhookTools Webhook 工具列表
     */
    public void setWebhookTools(TalkWebhookTool [] WebhookTools) {
        this.WebhookTools = WebhookTools;
    }

    /**
     * Get 元信息JSON object 字符串 
     * @return Metadata 元信息JSON object 字符串
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 元信息JSON object 字符串
     * @param Metadata 元信息JSON object 字符串
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 绑定关系列表 
     * @return Bindings 绑定关系列表
     */
    public TalkAgentBinding [] getBindings() {
        return this.Bindings;
    }

    /**
     * Set 绑定关系列表
     * @param Bindings 绑定关系列表
     */
    public void setBindings(TalkAgentBinding [] Bindings) {
        this.Bindings = Bindings;
    }

    /**
     * Get 创建时间，Unix 秒 
     * @return CreateTime 创建时间，Unix 秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，Unix 秒
     * @param CreateTime 创建时间，Unix 秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，Unix 秒 
     * @return UpdateTime 更新时间，Unix 秒
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，Unix 秒
     * @param UpdateTime 更新时间，Unix 秒
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    }
}

