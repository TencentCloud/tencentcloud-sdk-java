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

public class TalkProductConfigV2Info extends AbstractModel {

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
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 配置名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 语言，默认zh；zh-中文；en-英文
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * 基础配置
    */
    @SerializedName("BasicConfig")
    @Expose
    private TalkBasicConfigInfo BasicConfig;

    /**
    * 语音识别配置
    */
    @SerializedName("STTConfig")
    @Expose
    private TalkSTTConfigInfo STTConfig;

    /**
    * 大模型配置
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
    * 会话配置
    */
    @SerializedName("ConversationConfig")
    @Expose
    private TalkConversationConfigInfo ConversationConfig;

    /**
    * 版本号
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 创建时间，秒级时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间，秒级时间戳
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
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 配置名称 
     * @return ConfigName 配置名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置名称
     * @param ConfigName 配置名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 语言，默认zh；zh-中文；en-英文 
     * @return TargetLanguage 语言，默认zh；zh-中文；en-英文
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set 语言，默认zh；zh-中文；en-英文
     * @param TargetLanguage 语言，默认zh；zh-中文；en-英文
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get 基础配置 
     * @return BasicConfig 基础配置
     */
    public TalkBasicConfigInfo getBasicConfig() {
        return this.BasicConfig;
    }

    /**
     * Set 基础配置
     * @param BasicConfig 基础配置
     */
    public void setBasicConfig(TalkBasicConfigInfo BasicConfig) {
        this.BasicConfig = BasicConfig;
    }

    /**
     * Get 语音识别配置 
     * @return STTConfig 语音识别配置
     */
    public TalkSTTConfigInfo getSTTConfig() {
        return this.STTConfig;
    }

    /**
     * Set 语音识别配置
     * @param STTConfig 语音识别配置
     */
    public void setSTTConfig(TalkSTTConfigInfo STTConfig) {
        this.STTConfig = STTConfig;
    }

    /**
     * Get 大模型配置 
     * @return LLMConfig 大模型配置
     */
    public TalkLLMConfigInfo getLLMConfig() {
        return this.LLMConfig;
    }

    /**
     * Set 大模型配置
     * @param LLMConfig 大模型配置
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
     * Get 会话配置 
     * @return ConversationConfig 会话配置
     */
    public TalkConversationConfigInfo getConversationConfig() {
        return this.ConversationConfig;
    }

    /**
     * Set 会话配置
     * @param ConversationConfig 会话配置
     */
    public void setConversationConfig(TalkConversationConfigInfo ConversationConfig) {
        this.ConversationConfig = ConversationConfig;
    }

    /**
     * Get 版本号 
     * @return Version 版本号
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
     * @param Version 版本号
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 创建时间，秒级时间戳 
     * @return CreateTime 创建时间，秒级时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，秒级时间戳
     * @param CreateTime 创建时间，秒级时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，秒级时间戳 
     * @return UpdateTime 更新时间，秒级时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，秒级时间戳
     * @param UpdateTime 更新时间，秒级时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TalkProductConfigV2Info() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkProductConfigV2Info(TalkProductConfigV2Info source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.TargetLanguage != null) {
            this.TargetLanguage = new String(source.TargetLanguage);
        }
        if (source.BasicConfig != null) {
            this.BasicConfig = new TalkBasicConfigInfo(source.BasicConfig);
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
        if (source.ConversationConfig != null) {
            this.ConversationConfig = new TalkConversationConfigInfo(source.ConversationConfig);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
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
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "TargetLanguage", this.TargetLanguage);
        this.setParamObj(map, prefix + "BasicConfig.", this.BasicConfig);
        this.setParamObj(map, prefix + "STTConfig.", this.STTConfig);
        this.setParamObj(map, prefix + "LLMConfig.", this.LLMConfig);
        this.setParamObj(map, prefix + "TTSConfig.", this.TTSConfig);
        this.setParamObj(map, prefix + "ConversationConfig.", this.ConversationConfig);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

