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

public class AudioTemplateInfo extends AbstractModel {

    /**
    * <p>音频流的编码格式。<br>当不需要对音频进行转码时，可选值为：</p><li>copy。</li>当外层参数 Container 为 mp3 时，可选值为：<li>mp3。</li>当外层参数 Container 为 ogg 或 flac 时，可选值为：<li>flac。</li>当外层参数 Container 为 m4a 时，可选值为：<li>aac；</li><li>ac3。</li>当外层参数 Container 为 mp4 或 flv 时，可选值为：<li>aac：更适合 mp4；</li><li>mp3：更适合 flv；</li><li>mp2。</li>当外层参数 Container 为 hls 时，可选值为：<li>aac；</li><li>mp3;</li><li>eac3：自适应转码音轨合并时使用。</li>当外层参数 Container 为 wav时，可选值为：<li>pcm16, pcm24；</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。<br>当取值为 0，表示音频码率和原始音频保持一致。<br>注意：如果使用自适应转码音轨合并TrackChannelInfo参数，取值范围：<br>1）、不能填0；<br>2）、Codec为：aac时，取值范围：[26, 256];<br>3）、Codec为：ac3时，取值范围：[26, 640];<br>4)、Codec为：eac3时，取值范围：[26, 6144]，备注：当SampleRate为44100HZ，最大值为：5644，当SampleRate为48000HZ，最大值为：6144，</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>音频流的采样率，不同编码标准支持的采样率选项不同。填0代表使用源音频的采样率数值。<br>详细参考<a href="https://cloud.tencent.com/document/product/862/77166#f3b039f1-d817-4a96-b4e4-90132d31cd53">音频采样率支持范围文档</a><br>单位：Hz<br>注意：请确保源音频流的采样率在上述选项范围内，否则可能导致转码失败！</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>音频通道方式，可选值：</p><li>0：声道数随源</li><li>1：单通道</li><li>2：双通道</li><li>6：5.1声道</li>当媒体的封装格式是音频格式（mp3）时，声道数不允许设为5.1声道。<p>默认值：2。<br>注意：设置音频声道随源时，如果转码音频编码格式不支持当前声道，转码任务可能会失败。</p>
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * <p>合并音轨信息。<br>注意：此字段只是自适应转码生效，</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrackChannelInfo")
    @Expose
    private AudioTrackChannelInfo TrackChannelInfo;

    /**
     * Get <p>音频流的编码格式。<br>当不需要对音频进行转码时，可选值为：</p><li>copy。</li>当外层参数 Container 为 mp3 时，可选值为：<li>mp3。</li>当外层参数 Container 为 ogg 或 flac 时，可选值为：<li>flac。</li>当外层参数 Container 为 m4a 时，可选值为：<li>aac；</li><li>ac3。</li>当外层参数 Container 为 mp4 或 flv 时，可选值为：<li>aac：更适合 mp4；</li><li>mp3：更适合 flv；</li><li>mp2。</li>当外层参数 Container 为 hls 时，可选值为：<li>aac；</li><li>mp3;</li><li>eac3：自适应转码音轨合并时使用。</li>当外层参数 Container 为 wav时，可选值为：<li>pcm16, pcm24；</li> 
     * @return Codec <p>音频流的编码格式。<br>当不需要对音频进行转码时，可选值为：</p><li>copy。</li>当外层参数 Container 为 mp3 时，可选值为：<li>mp3。</li>当外层参数 Container 为 ogg 或 flac 时，可选值为：<li>flac。</li>当外层参数 Container 为 m4a 时，可选值为：<li>aac；</li><li>ac3。</li>当外层参数 Container 为 mp4 或 flv 时，可选值为：<li>aac：更适合 mp4；</li><li>mp3：更适合 flv；</li><li>mp2。</li>当外层参数 Container 为 hls 时，可选值为：<li>aac；</li><li>mp3;</li><li>eac3：自适应转码音轨合并时使用。</li>当外层参数 Container 为 wav时，可选值为：<li>pcm16, pcm24；</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>音频流的编码格式。<br>当不需要对音频进行转码时，可选值为：</p><li>copy。</li>当外层参数 Container 为 mp3 时，可选值为：<li>mp3。</li>当外层参数 Container 为 ogg 或 flac 时，可选值为：<li>flac。</li>当外层参数 Container 为 m4a 时，可选值为：<li>aac；</li><li>ac3。</li>当外层参数 Container 为 mp4 或 flv 时，可选值为：<li>aac：更适合 mp4；</li><li>mp3：更适合 flv；</li><li>mp2。</li>当外层参数 Container 为 hls 时，可选值为：<li>aac；</li><li>mp3;</li><li>eac3：自适应转码音轨合并时使用。</li>当外层参数 Container 为 wav时，可选值为：<li>pcm16, pcm24；</li>
     * @param Codec <p>音频流的编码格式。<br>当不需要对音频进行转码时，可选值为：</p><li>copy。</li>当外层参数 Container 为 mp3 时，可选值为：<li>mp3。</li>当外层参数 Container 为 ogg 或 flac 时，可选值为：<li>flac。</li>当外层参数 Container 为 m4a 时，可选值为：<li>aac；</li><li>ac3。</li>当外层参数 Container 为 mp4 或 flv 时，可选值为：<li>aac：更适合 mp4；</li><li>mp3：更适合 flv；</li><li>mp2。</li>当外层参数 Container 为 hls 时，可选值为：<li>aac；</li><li>mp3;</li><li>eac3：自适应转码音轨合并时使用。</li>当外层参数 Container 为 wav时，可选值为：<li>pcm16, pcm24；</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。<br>当取值为 0，表示音频码率和原始音频保持一致。<br>注意：如果使用自适应转码音轨合并TrackChannelInfo参数，取值范围：<br>1）、不能填0；<br>2）、Codec为：aac时，取值范围：[26, 256];<br>3）、Codec为：ac3时，取值范围：[26, 640];<br>4)、Codec为：eac3时，取值范围：[26, 6144]，备注：当SampleRate为44100HZ，最大值为：5644，当SampleRate为48000HZ，最大值为：6144，</p> 
     * @return Bitrate <p>音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。<br>当取值为 0，表示音频码率和原始音频保持一致。<br>注意：如果使用自适应转码音轨合并TrackChannelInfo参数，取值范围：<br>1）、不能填0；<br>2）、Codec为：aac时，取值范围：[26, 256];<br>3）、Codec为：ac3时，取值范围：[26, 640];<br>4)、Codec为：eac3时，取值范围：[26, 6144]，备注：当SampleRate为44100HZ，最大值为：5644，当SampleRate为48000HZ，最大值为：6144，</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。<br>当取值为 0，表示音频码率和原始音频保持一致。<br>注意：如果使用自适应转码音轨合并TrackChannelInfo参数，取值范围：<br>1）、不能填0；<br>2）、Codec为：aac时，取值范围：[26, 256];<br>3）、Codec为：ac3时，取值范围：[26, 640];<br>4)、Codec为：eac3时，取值范围：[26, 6144]，备注：当SampleRate为44100HZ，最大值为：5644，当SampleRate为48000HZ，最大值为：6144，</p>
     * @param Bitrate <p>音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。<br>当取值为 0，表示音频码率和原始音频保持一致。<br>注意：如果使用自适应转码音轨合并TrackChannelInfo参数，取值范围：<br>1）、不能填0；<br>2）、Codec为：aac时，取值范围：[26, 256];<br>3）、Codec为：ac3时，取值范围：[26, 640];<br>4)、Codec为：eac3时，取值范围：[26, 6144]，备注：当SampleRate为44100HZ，最大值为：5644，当SampleRate为48000HZ，最大值为：6144，</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>音频流的采样率，不同编码标准支持的采样率选项不同。填0代表使用源音频的采样率数值。<br>详细参考<a href="https://cloud.tencent.com/document/product/862/77166#f3b039f1-d817-4a96-b4e4-90132d31cd53">音频采样率支持范围文档</a><br>单位：Hz<br>注意：请确保源音频流的采样率在上述选项范围内，否则可能导致转码失败！</p> 
     * @return SampleRate <p>音频流的采样率，不同编码标准支持的采样率选项不同。填0代表使用源音频的采样率数值。<br>详细参考<a href="https://cloud.tencent.com/document/product/862/77166#f3b039f1-d817-4a96-b4e4-90132d31cd53">音频采样率支持范围文档</a><br>单位：Hz<br>注意：请确保源音频流的采样率在上述选项范围内，否则可能导致转码失败！</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>音频流的采样率，不同编码标准支持的采样率选项不同。填0代表使用源音频的采样率数值。<br>详细参考<a href="https://cloud.tencent.com/document/product/862/77166#f3b039f1-d817-4a96-b4e4-90132d31cd53">音频采样率支持范围文档</a><br>单位：Hz<br>注意：请确保源音频流的采样率在上述选项范围内，否则可能导致转码失败！</p>
     * @param SampleRate <p>音频流的采样率，不同编码标准支持的采样率选项不同。填0代表使用源音频的采样率数值。<br>详细参考<a href="https://cloud.tencent.com/document/product/862/77166#f3b039f1-d817-4a96-b4e4-90132d31cd53">音频采样率支持范围文档</a><br>单位：Hz<br>注意：请确保源音频流的采样率在上述选项范围内，否则可能导致转码失败！</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>音频通道方式，可选值：</p><li>0：声道数随源</li><li>1：单通道</li><li>2：双通道</li><li>6：5.1声道</li>当媒体的封装格式是音频格式（mp3）时，声道数不允许设为5.1声道。<p>默认值：2。<br>注意：设置音频声道随源时，如果转码音频编码格式不支持当前声道，转码任务可能会失败。</p> 
     * @return AudioChannel <p>音频通道方式，可选值：</p><li>0：声道数随源</li><li>1：单通道</li><li>2：双通道</li><li>6：5.1声道</li>当媒体的封装格式是音频格式（mp3）时，声道数不允许设为5.1声道。<p>默认值：2。<br>注意：设置音频声道随源时，如果转码音频编码格式不支持当前声道，转码任务可能会失败。</p>
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set <p>音频通道方式，可选值：</p><li>0：声道数随源</li><li>1：单通道</li><li>2：双通道</li><li>6：5.1声道</li>当媒体的封装格式是音频格式（mp3）时，声道数不允许设为5.1声道。<p>默认值：2。<br>注意：设置音频声道随源时，如果转码音频编码格式不支持当前声道，转码任务可能会失败。</p>
     * @param AudioChannel <p>音频通道方式，可选值：</p><li>0：声道数随源</li><li>1：单通道</li><li>2：双通道</li><li>6：5.1声道</li>当媒体的封装格式是音频格式（mp3）时，声道数不允许设为5.1声道。<p>默认值：2。<br>注意：设置音频声道随源时，如果转码音频编码格式不支持当前声道，转码任务可能会失败。</p>
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get <p>合并音轨信息。<br>注意：此字段只是自适应转码生效，</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrackChannelInfo <p>合并音轨信息。<br>注意：此字段只是自适应转码生效，</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTrackChannelInfo getTrackChannelInfo() {
        return this.TrackChannelInfo;
    }

    /**
     * Set <p>合并音轨信息。<br>注意：此字段只是自适应转码生效，</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrackChannelInfo <p>合并音轨信息。<br>注意：此字段只是自适应转码生效，</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrackChannelInfo(AudioTrackChannelInfo TrackChannelInfo) {
        this.TrackChannelInfo = TrackChannelInfo;
    }

    public AudioTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTemplateInfo(AudioTemplateInfo source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
        if (source.TrackChannelInfo != null) {
            this.TrackChannelInfo = new AudioTrackChannelInfo(source.TrackChannelInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);
        this.setParamObj(map, prefix + "TrackChannelInfo.", this.TrackChannelInfo);

    }
}

