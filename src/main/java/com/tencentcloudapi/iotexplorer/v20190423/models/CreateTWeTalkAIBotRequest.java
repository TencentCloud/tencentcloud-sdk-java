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

public class CreateTWeTalkAIBotRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 名称
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 支持的语言，zh-中文；en-英文；默认zh
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * 自定义语音识别配置
    */
    @SerializedName("STTConfig")
    @Expose
    private TalkSTTConfigInfo STTConfig;

    /**
    * 自定义大模型配置
    */
    @SerializedName("LLMConfig")
    @Expose
    private TalkLLMConfigInfo LLMConfig;

    /**
    * 语音合成配置
    */
    @SerializedName("TTSConfig")
    @Expose
    private TalkTTSConfigInfo TTSConfig;

    /**
    * 智能体配置
    */
    @SerializedName("AgentConfig")
    @Expose
    private TalkAgentConfigInfo AgentConfig;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 自定义工具配置，最多可创建10个
    */
    @SerializedName("CustomTools")
    @Expose
    private String CustomTools;

    /**
     * Get 产品ID 
     * @return Name 产品ID
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 产品ID
     * @param Name 产品ID
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 名称 
     * @return Description 名称
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 名称
     * @param Description 名称
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 支持的语言，zh-中文；en-英文；默认zh 
     * @return TargetLanguage 支持的语言，zh-中文；en-英文；默认zh
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set 支持的语言，zh-中文；en-英文；默认zh
     * @param TargetLanguage 支持的语言，zh-中文；en-英文；默认zh
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get 自定义语音识别配置 
     * @return STTConfig 自定义语音识别配置
     */
    public TalkSTTConfigInfo getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set 自定义语音识别配置
     * @param STTConfig 自定义语音识别配置
     */
    public void setSTTConfig(TalkSTTConfigInfo STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get 自定义大模型配置 
     * @return LLMConfig 自定义大模型配置
     */
    public TalkLLMConfigInfo getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set 自定义大模型配置
     * @param LLMConfig 自定义大模型配置
     */
    public void setLLMConfig(TalkLLMConfigInfo LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get 语音合成配置 
     * @return TTSConfig 语音合成配置
     */
    public TalkTTSConfigInfo getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set 语音合成配置
     * @param TTSConfig 语音合成配置
     */
    public void setTTSConfig(TalkTTSConfigInfo TTSConfig) {
        this.TTSConfig = TTSConfig;
    }

    /**
     * Get 智能体配置 
     * @return AgentConfig 智能体配置
     */
    public TalkAgentConfigInfo getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set 智能体配置
     * @param AgentConfig 智能体配置
     */
    public void setAgentConfig(TalkAgentConfigInfo AgentConfig) {
        this.AgentConfig = AgentConfig;
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
     * Get 自定义工具配置，最多可创建10个 
     * @return CustomTools 自定义工具配置，最多可创建10个
     */
    public String getCustomTools() {
        return this.CustomTools;
    }

    /**
     * Set 自定义工具配置，最多可创建10个
     * @param CustomTools 自定义工具配置，最多可创建10个
     */
    public void setCustomTools(String CustomTools) {
        this.CustomTools = CustomTools;
    }

    public CreateTWeTalkAIBotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeTalkAIBotRequest(CreateTWeTalkAIBotRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TargetLanguage != null) {
            this.TargetLanguage = new String(source.TargetLanguage);
        }
        if (source.STTConfig != null) {
            this.STTConfig = new TalkSTTConfigInfo(source.STTConfig);
        }
        if (source.LLMConfig != null) {
            this.LLMConfig = new TalkLLMConfigInfo(source.LLMConfig);
        }
        if (source.TTSConfig != null) {
            this.TTSConfig = new TalkTTSConfigInfo(source.TTSConfig);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new TalkAgentConfigInfo(source.AgentConfig);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CustomTools != null) {
            this.CustomTools = new String(source.CustomTools);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetLanguage", this.TargetLanguage);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CustomTools", this.CustomTools);

    }
}

