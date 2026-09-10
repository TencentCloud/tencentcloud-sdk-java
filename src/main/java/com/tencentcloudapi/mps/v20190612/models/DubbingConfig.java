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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DubbingConfig extends AbstractModel {

    /**
    * <p>配音类型，可选值：FullAutoEmotionClone：全自动高情感克隆配音；RoleBasedSmartDubbing：按角色智能配音；SingleVoice：指定单一音色；</p>
    */
    @SerializedName("DubbingMode")
    @Expose
    private String DubbingMode;

    /**
    * <p>背景音音量，范围0-100</p><p>默认值：80</p>
    */
    @SerializedName("BackgroundVolume")
    @Expose
    private Long BackgroundVolume;

    /**
    * <p>二次微调开关，可选值：<br>ON: 开启二次微调；<br>OFF: 不开启二次微调；</p><p>默认值：OFF</p><p>仅 RoleBasedSmartDubbing 时允许设为 ON</p>
    */
    @SerializedName("SecondaryTuning")
    @Expose
    private String SecondaryTuning;

    /**
    * <p>指定音色</p><p>仅 SingleVoice 时有效且 Create 必填</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>配音版本，可选值：v1，v2</p><p>默认值：v2</p><p>只在（FullAutoEmotionClone：全自动高情感克隆配音）模式下生效</p>
    */
    @SerializedName("DubbingVersion")
    @Expose
    private String DubbingVersion;

    /**
     * Get <p>配音类型，可选值：FullAutoEmotionClone：全自动高情感克隆配音；RoleBasedSmartDubbing：按角色智能配音；SingleVoice：指定单一音色；</p> 
     * @return DubbingMode <p>配音类型，可选值：FullAutoEmotionClone：全自动高情感克隆配音；RoleBasedSmartDubbing：按角色智能配音；SingleVoice：指定单一音色；</p>
     */
    public String getDubbingMode() {
        return this.DubbingMode;
    }

    /**
     * Set <p>配音类型，可选值：FullAutoEmotionClone：全自动高情感克隆配音；RoleBasedSmartDubbing：按角色智能配音；SingleVoice：指定单一音色；</p>
     * @param DubbingMode <p>配音类型，可选值：FullAutoEmotionClone：全自动高情感克隆配音；RoleBasedSmartDubbing：按角色智能配音；SingleVoice：指定单一音色；</p>
     */
    public void setDubbingMode(String DubbingMode) {
        this.DubbingMode = DubbingMode;
    }

    /**
     * Get <p>背景音音量，范围0-100</p><p>默认值：80</p> 
     * @return BackgroundVolume <p>背景音音量，范围0-100</p><p>默认值：80</p>
     */
    public Long getBackgroundVolume() {
        return this.BackgroundVolume;
    }

    /**
     * Set <p>背景音音量，范围0-100</p><p>默认值：80</p>
     * @param BackgroundVolume <p>背景音音量，范围0-100</p><p>默认值：80</p>
     */
    public void setBackgroundVolume(Long BackgroundVolume) {
        this.BackgroundVolume = BackgroundVolume;
    }

    /**
     * Get <p>二次微调开关，可选值：<br>ON: 开启二次微调；<br>OFF: 不开启二次微调；</p><p>默认值：OFF</p><p>仅 RoleBasedSmartDubbing 时允许设为 ON</p> 
     * @return SecondaryTuning <p>二次微调开关，可选值：<br>ON: 开启二次微调；<br>OFF: 不开启二次微调；</p><p>默认值：OFF</p><p>仅 RoleBasedSmartDubbing 时允许设为 ON</p>
     */
    public String getSecondaryTuning() {
        return this.SecondaryTuning;
    }

    /**
     * Set <p>二次微调开关，可选值：<br>ON: 开启二次微调；<br>OFF: 不开启二次微调；</p><p>默认值：OFF</p><p>仅 RoleBasedSmartDubbing 时允许设为 ON</p>
     * @param SecondaryTuning <p>二次微调开关，可选值：<br>ON: 开启二次微调；<br>OFF: 不开启二次微调；</p><p>默认值：OFF</p><p>仅 RoleBasedSmartDubbing 时允许设为 ON</p>
     */
    public void setSecondaryTuning(String SecondaryTuning) {
        this.SecondaryTuning = SecondaryTuning;
    }

    /**
     * Get <p>指定音色</p><p>仅 SingleVoice 时有效且 Create 必填</p> 
     * @return VoiceId <p>指定音色</p><p>仅 SingleVoice 时有效且 Create 必填</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>指定音色</p><p>仅 SingleVoice 时有效且 Create 必填</p>
     * @param VoiceId <p>指定音色</p><p>仅 SingleVoice 时有效且 Create 必填</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>配音版本，可选值：v1，v2</p><p>默认值：v2</p><p>只在（FullAutoEmotionClone：全自动高情感克隆配音）模式下生效</p> 
     * @return DubbingVersion <p>配音版本，可选值：v1，v2</p><p>默认值：v2</p><p>只在（FullAutoEmotionClone：全自动高情感克隆配音）模式下生效</p>
     */
    public String getDubbingVersion() {
        return this.DubbingVersion;
    }

    /**
     * Set <p>配音版本，可选值：v1，v2</p><p>默认值：v2</p><p>只在（FullAutoEmotionClone：全自动高情感克隆配音）模式下生效</p>
     * @param DubbingVersion <p>配音版本，可选值：v1，v2</p><p>默认值：v2</p><p>只在（FullAutoEmotionClone：全自动高情感克隆配音）模式下生效</p>
     */
    public void setDubbingVersion(String DubbingVersion) {
        this.DubbingVersion = DubbingVersion;
    }

    public DubbingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingConfig(DubbingConfig source) {
        if (source.DubbingMode != null) {
            this.DubbingMode = new String(source.DubbingMode);
        }
        if (source.BackgroundVolume != null) {
            this.BackgroundVolume = new Long(source.BackgroundVolume);
        }
        if (source.SecondaryTuning != null) {
            this.SecondaryTuning = new String(source.SecondaryTuning);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.DubbingVersion != null) {
            this.DubbingVersion = new String(source.DubbingVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DubbingMode", this.DubbingMode);
        this.setParamSimple(map, prefix + "BackgroundVolume", this.BackgroundVolume);
        this.setParamSimple(map, prefix + "SecondaryTuning", this.SecondaryTuning);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "DubbingVersion", this.DubbingVersion);

    }
}

