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

public class TalkAgentConfigInfo extends AbstractModel {

    /**
    * 会话超时（秒），指连接会话的时间，例如30秒是指会话在30秒后断开
    */
    @SerializedName("SessionTimeout")
    @Expose
    private Long SessionTimeout;

    /**
    * 允许打断
    */
    @SerializedName("InterruptionEnabled")
    @Expose
    private Boolean InterruptionEnabled;

    /**
    * 最大上下文
    */
    @SerializedName("MaxContextTokens")
    @Expose
    private Long MaxContextTokens;

    /**
    * 空闲检测配置
    */
    @SerializedName("IdleDetection")
    @Expose
    private TalkIdleDetectionConfigInfo IdleDetection;

    /**
    * 是否启用情绪识别
    */
    @SerializedName("EmotionEnabled")
    @Expose
    private Boolean EmotionEnabled;

    /**
    * 是否启用语义vad
    */
    @SerializedName("SemanticVADEnabled")
    @Expose
    private Boolean SemanticVADEnabled;

    /**
    * 语义vad灵敏度， 1-慢 2-适中 3-快
    */
    @SerializedName("SemanticVADSensitivity")
    @Expose
    private Long SemanticVADSensitivity;

    /**
    * VAD 静默检测时间， 当开启语义vad此配置失效
    */
    @SerializedName("SilenceTime")
    @Expose
    private Long SilenceTime;

    /**
    * 是否启用噪声过滤
    */
    @SerializedName("NoiseFilterEnabled")
    @Expose
    private Boolean NoiseFilterEnabled;

    /**
    * 是否开启长记忆，默认关闭
    */
    @SerializedName("LongTermMemoryEnabled")
    @Expose
    private Boolean LongTermMemoryEnabled;

    /**
    * 系统提示词，仅当未配置LLMConfig时使用
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * 开机问候语，如果未配置默认不开启
    */
    @SerializedName("GreetingMessage")
    @Expose
    private String GreetingMessage;

    /**
    * 系统默认音色，当配置复刻音色时，默认值为200000000
    */
    @SerializedName("DefaultVoiceType")
    @Expose
    private Long DefaultVoiceType;

    /**
    * 复刻音色
    */
    @SerializedName("FastVoiceType")
    @Expose
    private String FastVoiceType;

    /**
     * Get 会话超时（秒），指连接会话的时间，例如30秒是指会话在30秒后断开 
     * @return SessionTimeout 会话超时（秒），指连接会话的时间，例如30秒是指会话在30秒后断开
     */
    public Long getSessionTimeout() {
        return this.SessionTimeout;
    }

    /**
     * Set 会话超时（秒），指连接会话的时间，例如30秒是指会话在30秒后断开
     * @param SessionTimeout 会话超时（秒），指连接会话的时间，例如30秒是指会话在30秒后断开
     */
    public void setSessionTimeout(Long SessionTimeout) {
        this.SessionTimeout = SessionTimeout;
    }

    /**
     * Get 允许打断 
     * @return InterruptionEnabled 允许打断
     */
    public Boolean getInterruptionEnabled() {
        return this.InterruptionEnabled;
    }

    /**
     * Set 允许打断
     * @param InterruptionEnabled 允许打断
     */
    public void setInterruptionEnabled(Boolean InterruptionEnabled) {
        this.InterruptionEnabled = InterruptionEnabled;
    }

    /**
     * Get 最大上下文 
     * @return MaxContextTokens 最大上下文
     */
    public Long getMaxContextTokens() {
        return this.MaxContextTokens;
    }

    /**
     * Set 最大上下文
     * @param MaxContextTokens 最大上下文
     */
    public void setMaxContextTokens(Long MaxContextTokens) {
        this.MaxContextTokens = MaxContextTokens;
    }

    /**
     * Get 空闲检测配置 
     * @return IdleDetection 空闲检测配置
     */
    public TalkIdleDetectionConfigInfo getIdleDetection() {
        return this.IdleDetection;
    }

    /**
     * Set 空闲检测配置
     * @param IdleDetection 空闲检测配置
     */
    public void setIdleDetection(TalkIdleDetectionConfigInfo IdleDetection) {
        this.IdleDetection = IdleDetection;
    }

    /**
     * Get 是否启用情绪识别 
     * @return EmotionEnabled 是否启用情绪识别
     */
    public Boolean getEmotionEnabled() {
        return this.EmotionEnabled;
    }

    /**
     * Set 是否启用情绪识别
     * @param EmotionEnabled 是否启用情绪识别
     */
    public void setEmotionEnabled(Boolean EmotionEnabled) {
        this.EmotionEnabled = EmotionEnabled;
    }

    /**
     * Get 是否启用语义vad 
     * @return SemanticVADEnabled 是否启用语义vad
     */
    public Boolean getSemanticVADEnabled() {
        return this.SemanticVADEnabled;
    }

    /**
     * Set 是否启用语义vad
     * @param SemanticVADEnabled 是否启用语义vad
     */
    public void setSemanticVADEnabled(Boolean SemanticVADEnabled) {
        this.SemanticVADEnabled = SemanticVADEnabled;
    }

    /**
     * Get 语义vad灵敏度， 1-慢 2-适中 3-快 
     * @return SemanticVADSensitivity 语义vad灵敏度， 1-慢 2-适中 3-快
     */
    public Long getSemanticVADSensitivity() {
        return this.SemanticVADSensitivity;
    }

    /**
     * Set 语义vad灵敏度， 1-慢 2-适中 3-快
     * @param SemanticVADSensitivity 语义vad灵敏度， 1-慢 2-适中 3-快
     */
    public void setSemanticVADSensitivity(Long SemanticVADSensitivity) {
        this.SemanticVADSensitivity = SemanticVADSensitivity;
    }

    /**
     * Get VAD 静默检测时间， 当开启语义vad此配置失效 
     * @return SilenceTime VAD 静默检测时间， 当开启语义vad此配置失效
     */
    public Long getSilenceTime() {
        return this.SilenceTime;
    }

    /**
     * Set VAD 静默检测时间， 当开启语义vad此配置失效
     * @param SilenceTime VAD 静默检测时间， 当开启语义vad此配置失效
     */
    public void setSilenceTime(Long SilenceTime) {
        this.SilenceTime = SilenceTime;
    }

    /**
     * Get 是否启用噪声过滤 
     * @return NoiseFilterEnabled 是否启用噪声过滤
     */
    public Boolean getNoiseFilterEnabled() {
        return this.NoiseFilterEnabled;
    }

    /**
     * Set 是否启用噪声过滤
     * @param NoiseFilterEnabled 是否启用噪声过滤
     */
    public void setNoiseFilterEnabled(Boolean NoiseFilterEnabled) {
        this.NoiseFilterEnabled = NoiseFilterEnabled;
    }

    /**
     * Get 是否开启长记忆，默认关闭 
     * @return LongTermMemoryEnabled 是否开启长记忆，默认关闭
     */
    public Boolean getLongTermMemoryEnabled() {
        return this.LongTermMemoryEnabled;
    }

    /**
     * Set 是否开启长记忆，默认关闭
     * @param LongTermMemoryEnabled 是否开启长记忆，默认关闭
     */
    public void setLongTermMemoryEnabled(Boolean LongTermMemoryEnabled) {
        this.LongTermMemoryEnabled = LongTermMemoryEnabled;
    }

    /**
     * Get 系统提示词，仅当未配置LLMConfig时使用 
     * @return SystemPrompt 系统提示词，仅当未配置LLMConfig时使用
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set 系统提示词，仅当未配置LLMConfig时使用
     * @param SystemPrompt 系统提示词，仅当未配置LLMConfig时使用
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get 开机问候语，如果未配置默认不开启 
     * @return GreetingMessage 开机问候语，如果未配置默认不开启
     */
    public String getGreetingMessage() {
        return this.GreetingMessage;
    }

    /**
     * Set 开机问候语，如果未配置默认不开启
     * @param GreetingMessage 开机问候语，如果未配置默认不开启
     */
    public void setGreetingMessage(String GreetingMessage) {
        this.GreetingMessage = GreetingMessage;
    }

    /**
     * Get 系统默认音色，当配置复刻音色时，默认值为200000000 
     * @return DefaultVoiceType 系统默认音色，当配置复刻音色时，默认值为200000000
     */
    public Long getDefaultVoiceType() {
        return this.DefaultVoiceType;
    }

    /**
     * Set 系统默认音色，当配置复刻音色时，默认值为200000000
     * @param DefaultVoiceType 系统默认音色，当配置复刻音色时，默认值为200000000
     */
    public void setDefaultVoiceType(Long DefaultVoiceType) {
        this.DefaultVoiceType = DefaultVoiceType;
    }

    /**
     * Get 复刻音色 
     * @return FastVoiceType 复刻音色
     */
    public String getFastVoiceType() {
        return this.FastVoiceType;
    }

    /**
     * Set 复刻音色
     * @param FastVoiceType 复刻音色
     */
    public void setFastVoiceType(String FastVoiceType) {
        this.FastVoiceType = FastVoiceType;
    }

    public TalkAgentConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkAgentConfigInfo(TalkAgentConfigInfo source) {
        if (source.SessionTimeout != null) {
            this.SessionTimeout = new Long(source.SessionTimeout);
        }
        if (source.InterruptionEnabled != null) {
            this.InterruptionEnabled = new Boolean(source.InterruptionEnabled);
        }
        if (source.MaxContextTokens != null) {
            this.MaxContextTokens = new Long(source.MaxContextTokens);
        }
        if (source.IdleDetection != null) {
            this.IdleDetection = new TalkIdleDetectionConfigInfo(source.IdleDetection);
        }
        if (source.EmotionEnabled != null) {
            this.EmotionEnabled = new Boolean(source.EmotionEnabled);
        }
        if (source.SemanticVADEnabled != null) {
            this.SemanticVADEnabled = new Boolean(source.SemanticVADEnabled);
        }
        if (source.SemanticVADSensitivity != null) {
            this.SemanticVADSensitivity = new Long(source.SemanticVADSensitivity);
        }
        if (source.SilenceTime != null) {
            this.SilenceTime = new Long(source.SilenceTime);
        }
        if (source.NoiseFilterEnabled != null) {
            this.NoiseFilterEnabled = new Boolean(source.NoiseFilterEnabled);
        }
        if (source.LongTermMemoryEnabled != null) {
            this.LongTermMemoryEnabled = new Boolean(source.LongTermMemoryEnabled);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.GreetingMessage != null) {
            this.GreetingMessage = new String(source.GreetingMessage);
        }
        if (source.DefaultVoiceType != null) {
            this.DefaultVoiceType = new Long(source.DefaultVoiceType);
        }
        if (source.FastVoiceType != null) {
            this.FastVoiceType = new String(source.FastVoiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionTimeout", this.SessionTimeout);
        this.setParamSimple(map, prefix + "InterruptionEnabled", this.InterruptionEnabled);
        this.setParamSimple(map, prefix + "MaxContextTokens", this.MaxContextTokens);
        this.setParamObj(map, prefix + "IdleDetection.", this.IdleDetection);
        this.setParamSimple(map, prefix + "EmotionEnabled", this.EmotionEnabled);
        this.setParamSimple(map, prefix + "SemanticVADEnabled", this.SemanticVADEnabled);
        this.setParamSimple(map, prefix + "SemanticVADSensitivity", this.SemanticVADSensitivity);
        this.setParamSimple(map, prefix + "SilenceTime", this.SilenceTime);
        this.setParamSimple(map, prefix + "NoiseFilterEnabled", this.NoiseFilterEnabled);
        this.setParamSimple(map, prefix + "LongTermMemoryEnabled", this.LongTermMemoryEnabled);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "GreetingMessage", this.GreetingMessage);
        this.setParamSimple(map, prefix + "DefaultVoiceType", this.DefaultVoiceType);
        this.setParamSimple(map, prefix + "FastVoiceType", this.FastVoiceType);

    }
}

