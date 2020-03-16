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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VodAudioStreamItem extends AbstractModel{

    /**
    * 音频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 音频流的采样率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SamplingRate")
    @Expose
    private Long SamplingRate;

    /**
    * 音频流的编码格式，例如 aac。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
     * Get 音频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 音频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 音频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频流的采样率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SamplingRate 音频流的采样率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set 音频流的采样率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SamplingRate 音频流的采样率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSamplingRate(Long SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get 音频流的编码格式，例如 aac。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codec 音频流的编码格式，例如 aac。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频流的编码格式，例如 aac。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codec 音频流的编码格式，例如 aac。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);

    }
}

