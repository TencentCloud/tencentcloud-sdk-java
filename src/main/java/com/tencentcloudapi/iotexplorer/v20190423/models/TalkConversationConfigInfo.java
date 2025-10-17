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

public class TalkConversationConfigInfo extends AbstractModel {

    /**
    * 会话超时（秒）
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
    * 是否启用噪声过滤
    */
    @SerializedName("NoiseFilterEnabled")
    @Expose
    private Boolean NoiseFilterEnabled;

    /**
     * Get 会话超时（秒） 
     * @return SessionTimeout 会话超时（秒）
     */
    public Long getSessionTimeout() {
        return this.SessionTimeout;
    }

    /**
     * Set 会话超时（秒）
     * @param SessionTimeout 会话超时（秒）
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

    public TalkConversationConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkConversationConfigInfo(TalkConversationConfigInfo source) {
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
        if (source.NoiseFilterEnabled != null) {
            this.NoiseFilterEnabled = new Boolean(source.NoiseFilterEnabled);
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
        this.setParamSimple(map, prefix + "NoiseFilterEnabled", this.NoiseFilterEnabled);

    }
}

