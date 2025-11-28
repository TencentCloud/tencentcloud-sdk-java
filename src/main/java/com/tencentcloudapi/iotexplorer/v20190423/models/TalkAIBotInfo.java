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

public class TalkAIBotInfo extends AbstractModel {

    /**
    * UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 智能体ID
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 语言
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * 语音识别
    */
    @SerializedName("STTConfig")
    @Expose
    private TalkSTTConfigInfo STTConfig;

    /**
    * 大模型
    */
    @SerializedName("LLMConfig")
    @Expose
    private TalkLLMConfigInfo LLMConfig;

    /**
    * 语音合成
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
    * 产品信息列表
    */
    @SerializedName("ProductList")
    @Expose
    private TalkProductInfo ProductList;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get UIN 
     * @return Uin UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set UIN
     * @param Uin UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get APPID 
     * @return AppId APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APPID
     * @param AppId APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get 智能体ID 
     * @return BotId 智能体ID
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 智能体ID
     * @param BotId 智能体ID
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 语言 
     * @return TargetLanguage 语言
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set 语言
     * @param TargetLanguage 语言
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get 语音识别 
     * @return STTConfig 语音识别
     */
    public TalkSTTConfigInfo getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set 语音识别
     * @param STTConfig 语音识别
     */
    public void setSTTConfig(TalkSTTConfigInfo STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get 大模型 
     * @return LLMConfig 大模型
     */
    public TalkLLMConfigInfo getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set 大模型
     * @param LLMConfig 大模型
     */
    public void setLLMConfig(TalkLLMConfigInfo LLMConfig) {
        this.LLMConfig = LLMConfig;
    }

    /**
     * Get 语音合成 
     * @return TTSConfig 语音合成
     */
    public TalkTTSConfigInfo getTTSConfig() {
        return this.TTSConfig;
    }

    /**
     * Set 语音合成
     * @param TTSConfig 语音合成
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
     * Get 产品信息列表 
     * @return ProductList 产品信息列表
     */
    public TalkProductInfo getProductList() {
        return this.ProductList;
    }

    /**
     * Set 产品信息列表
     * @param ProductList 产品信息列表
     */
    public void setProductList(TalkProductInfo ProductList) {
        this.ProductList = ProductList;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TalkAIBotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkAIBotInfo(TalkAIBotInfo source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
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
        if (source.ProductList != null) {
            this.ProductList = new TalkProductInfo(source.ProductList);
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
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetLanguage", this.TargetLanguage);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamObj(map, prefix + "ProductList.", this.ProductList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

