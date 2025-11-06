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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Voice extends AbstractModel {

    /**
    * TTS的声音的ID
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 语速，范围 0.5-2.0，默认 1.0
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * (0, 10]   默认值1.0 
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 取值[-12,12],默认0
    */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
     * Get TTS的声音的ID 
     * @return VoiceId TTS的声音的ID
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set TTS的声音的ID
     * @param VoiceId TTS的声音的ID
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get 语速，范围 0.5-2.0，默认 1.0 
     * @return Speed 语速，范围 0.5-2.0，默认 1.0
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 语速，范围 0.5-2.0，默认 1.0
     * @param Speed 语速，范围 0.5-2.0，默认 1.0
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get (0, 10]   默认值1.0  
     * @return Volume (0, 10]   默认值1.0 
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set (0, 10]   默认值1.0 
     * @param Volume (0, 10]   默认值1.0 
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 取值[-12,12],默认0 
     * @return Pitch 取值[-12,12],默认0
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set 取值[-12,12],默认0
     * @param Pitch 取值[-12,12],默认0
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    public Voice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Voice(Voice source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Pitch != null) {
            this.Pitch = new Long(source.Pitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);

    }
}

