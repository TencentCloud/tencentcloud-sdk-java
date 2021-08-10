/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAudioStreamItem extends AbstractModel{

    /**
    * 音频流的码率，单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 音频流的采样率，单位：hz。
    */
    @SerializedName("SamplingRate")
    @Expose
    private Long SamplingRate;

    /**
    * 音频流的编码格式，例如 aac。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音频声道数，例如 2。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
     * Get 音频流的码率，单位：bps。 
     * @return Bitrate 音频流的码率，单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频流的码率，单位：bps。
     * @param Bitrate 音频流的码率，单位：bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频流的采样率，单位：hz。 
     * @return SamplingRate 音频流的采样率，单位：hz。
     */
    public Long getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set 音频流的采样率，单位：hz。
     * @param SamplingRate 音频流的采样率，单位：hz。
     */
    public void setSamplingRate(Long SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get 音频流的编码格式，例如 aac。 
     * @return Codec 音频流的编码格式，例如 aac。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频流的编码格式，例如 aac。
     * @param Codec 音频流的编码格式，例如 aac。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音频声道数，例如 2。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channel 音频声道数，例如 2。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 音频声道数，例如 2。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channel 音频声道数，例如 2。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    public MediaAudioStreamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAudioStreamItem(MediaAudioStreamItem source) {
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Long(source.SamplingRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

