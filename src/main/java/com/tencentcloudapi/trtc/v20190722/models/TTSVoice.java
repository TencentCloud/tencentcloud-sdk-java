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

public class TTSVoice extends AbstractModel {

    /**
    * <p>音色 ID。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>语速调节，0.5 为半速慢放，2.0 为两倍速快放，1.0 为正常语速，区间：[0.5, 2.0]，默认1.0。</p>
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * <p>音量调节，0 为静音，10 为最大音量，建议保持默认值 1.0，区间：[0, 10]，默认1.0。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * <p>音高调节，负值声音更低沉，正值声音更尖锐，0 为原始音高，区间 [-12, 12]，默认0。</p>
    */
    @SerializedName("Pitch")
    @Expose
    private Long Pitch;

    /**
     * Get <p>音色 ID。</p> 
     * @return VoiceId <p>音色 ID。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色 ID。</p>
     * @param VoiceId <p>音色 ID。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>语速调节，0.5 为半速慢放，2.0 为两倍速快放，1.0 为正常语速，区间：[0.5, 2.0]，默认1.0。</p> 
     * @return Speed <p>语速调节，0.5 为半速慢放，2.0 为两倍速快放，1.0 为正常语速，区间：[0.5, 2.0]，默认1.0。</p>
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set <p>语速调节，0.5 为半速慢放，2.0 为两倍速快放，1.0 为正常语速，区间：[0.5, 2.0]，默认1.0。</p>
     * @param Speed <p>语速调节，0.5 为半速慢放，2.0 为两倍速快放，1.0 为正常语速，区间：[0.5, 2.0]，默认1.0。</p>
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get <p>音量调节，0 为静音，10 为最大音量，建议保持默认值 1.0，区间：[0, 10]，默认1.0。</p> 
     * @return Volume <p>音量调节，0 为静音，10 为最大音量，建议保持默认值 1.0，区间：[0, 10]，默认1.0。</p>
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>音量调节，0 为静音，10 为最大音量，建议保持默认值 1.0，区间：[0, 10]，默认1.0。</p>
     * @param Volume <p>音量调节，0 为静音，10 为最大音量，建议保持默认值 1.0，区间：[0, 10]，默认1.0。</p>
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>音高调节，负值声音更低沉，正值声音更尖锐，0 为原始音高，区间 [-12, 12]，默认0。</p> 
     * @return Pitch <p>音高调节，负值声音更低沉，正值声音更尖锐，0 为原始音高，区间 [-12, 12]，默认0。</p>
     */
    public Long getPitch() {
        return this.Pitch;
    }

    /**
     * Set <p>音高调节，负值声音更低沉，正值声音更尖锐，0 为原始音高，区间 [-12, 12]，默认0。</p>
     * @param Pitch <p>音高调节，负值声音更低沉，正值声音更尖锐，0 为原始音高，区间 [-12, 12]，默认0。</p>
     */
    public void setPitch(Long Pitch) {
        this.Pitch = Pitch;
    }

    public TTSVoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TTSVoice(TTSVoice source) {
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

