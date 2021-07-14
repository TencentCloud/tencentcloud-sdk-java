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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioInfoResultItem extends AbstractModel{

    /**
    * 音频流的流id。
    */
    @SerializedName("Stream")
    @Expose
    private Long Stream;

    /**
    * 音频采样率 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * 音频声道数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Channel")
    @Expose
    private Long Channel;

    /**
    * 编码格式，如aac, mp3等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 音频时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 音频流的流id。 
     * @return Stream 音频流的流id。
     */
    public Long getStream() {
        return this.Stream;
    }

    /**
     * Set 音频流的流id。
     * @param Stream 音频流的流id。
     */
    public void setStream(Long Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 音频采样率 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sample 音频采样率 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set 音频采样率 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sample 音频采样率 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get 音频声道数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Channel 音频声道数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannel() {
        return this.Channel;
    }

    /**
     * Set 音频声道数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Channel 音频声道数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannel(Long Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 编码格式，如aac, mp3等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codec 编码格式，如aac, mp3等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 编码格式，如aac, mp3等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codec 编码格式，如aac, mp3等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 音频时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 音频时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 音频时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 音频时长，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public AudioInfoResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioInfoResultItem(AudioInfoResultItem source) {
        if (source.Stream != null) {
            this.Stream = new Long(source.Stream);
        }
        if (source.Sample != null) {
            this.Sample = new Long(source.Sample);
        }
        if (source.Channel != null) {
            this.Channel = new Long(source.Channel);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

