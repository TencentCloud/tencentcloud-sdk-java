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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppStatisticsItem extends AbstractModel{

    /**
    * 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealtimeSpeechStatisticsItem")
    @Expose
    private RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem;

    /**
    * 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceMessageStatisticsItem")
    @Expose
    private VoiceMessageStatisticsItem VoiceMessageStatisticsItem;

    /**
    * 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceFilterStatisticsItem")
    @Expose
    private VoiceFilterStatisticsItem VoiceFilterStatisticsItem;

    /**
    * 统计时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 录音转文本用量统计数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioTextStatisticsItem")
    @Expose
    private AudioTextStatisticsItem AudioTextStatisticsItem;

    /**
    * 流式转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamTextStatisticsItem")
    @Expose
    private StreamTextStatisticsItem StreamTextStatisticsItem;

    /**
    * 海外转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverseaTextStatisticsItem")
    @Expose
    private OverseaTextStatisticsItem OverseaTextStatisticsItem;

    /**
    * 实时语音转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealtimeTextStatisticsItem")
    @Expose
    private RealtimeTextStatisticsItem RealtimeTextStatisticsItem;

    /**
     * Get 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealtimeSpeechStatisticsItem 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RealTimeSpeechStatisticsItem getRealtimeSpeechStatisticsItem() {
        return this.RealtimeSpeechStatisticsItem;
    }

    /**
     * Set 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealtimeSpeechStatisticsItem 实时语音统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealtimeSpeechStatisticsItem(RealTimeSpeechStatisticsItem RealtimeSpeechStatisticsItem) {
        this.RealtimeSpeechStatisticsItem = RealtimeSpeechStatisticsItem;
    }

    /**
     * Get 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceMessageStatisticsItem 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceMessageStatisticsItem getVoiceMessageStatisticsItem() {
        return this.VoiceMessageStatisticsItem;
    }

    /**
     * Set 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceMessageStatisticsItem 语音消息统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceMessageStatisticsItem(VoiceMessageStatisticsItem VoiceMessageStatisticsItem) {
        this.VoiceMessageStatisticsItem = VoiceMessageStatisticsItem;
    }

    /**
     * Get 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceFilterStatisticsItem 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceFilterStatisticsItem getVoiceFilterStatisticsItem() {
        return this.VoiceFilterStatisticsItem;
    }

    /**
     * Set 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceFilterStatisticsItem 语音过滤统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceFilterStatisticsItem(VoiceFilterStatisticsItem VoiceFilterStatisticsItem) {
        this.VoiceFilterStatisticsItem = VoiceFilterStatisticsItem;
    }

    /**
     * Get 统计时间 
     * @return Date 统计时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 统计时间
     * @param Date 统计时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 录音转文本用量统计数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioTextStatisticsItem 录音转文本用量统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTextStatisticsItem getAudioTextStatisticsItem() {
        return this.AudioTextStatisticsItem;
    }

    /**
     * Set 录音转文本用量统计数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioTextStatisticsItem 录音转文本用量统计数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioTextStatisticsItem(AudioTextStatisticsItem AudioTextStatisticsItem) {
        this.AudioTextStatisticsItem = AudioTextStatisticsItem;
    }

    /**
     * Get 流式转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamTextStatisticsItem 流式转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamTextStatisticsItem getStreamTextStatisticsItem() {
        return this.StreamTextStatisticsItem;
    }

    /**
     * Set 流式转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamTextStatisticsItem 流式转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamTextStatisticsItem(StreamTextStatisticsItem StreamTextStatisticsItem) {
        this.StreamTextStatisticsItem = StreamTextStatisticsItem;
    }

    /**
     * Get 海外转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverseaTextStatisticsItem 海外转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OverseaTextStatisticsItem getOverseaTextStatisticsItem() {
        return this.OverseaTextStatisticsItem;
    }

    /**
     * Set 海外转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverseaTextStatisticsItem 海外转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverseaTextStatisticsItem(OverseaTextStatisticsItem OverseaTextStatisticsItem) {
        this.OverseaTextStatisticsItem = OverseaTextStatisticsItem;
    }

    /**
     * Get 实时语音转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealtimeTextStatisticsItem 实时语音转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RealtimeTextStatisticsItem getRealtimeTextStatisticsItem() {
        return this.RealtimeTextStatisticsItem;
    }

    /**
     * Set 实时语音转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealtimeTextStatisticsItem 实时语音转文本用量数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealtimeTextStatisticsItem(RealtimeTextStatisticsItem RealtimeTextStatisticsItem) {
        this.RealtimeTextStatisticsItem = RealtimeTextStatisticsItem;
    }

    public AppStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppStatisticsItem(AppStatisticsItem source) {
        if (source.RealtimeSpeechStatisticsItem != null) {
            this.RealtimeSpeechStatisticsItem = new RealTimeSpeechStatisticsItem(source.RealtimeSpeechStatisticsItem);
        }
        if (source.VoiceMessageStatisticsItem != null) {
            this.VoiceMessageStatisticsItem = new VoiceMessageStatisticsItem(source.VoiceMessageStatisticsItem);
        }
        if (source.VoiceFilterStatisticsItem != null) {
            this.VoiceFilterStatisticsItem = new VoiceFilterStatisticsItem(source.VoiceFilterStatisticsItem);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AudioTextStatisticsItem != null) {
            this.AudioTextStatisticsItem = new AudioTextStatisticsItem(source.AudioTextStatisticsItem);
        }
        if (source.StreamTextStatisticsItem != null) {
            this.StreamTextStatisticsItem = new StreamTextStatisticsItem(source.StreamTextStatisticsItem);
        }
        if (source.OverseaTextStatisticsItem != null) {
            this.OverseaTextStatisticsItem = new OverseaTextStatisticsItem(source.OverseaTextStatisticsItem);
        }
        if (source.RealtimeTextStatisticsItem != null) {
            this.RealtimeTextStatisticsItem = new RealtimeTextStatisticsItem(source.RealtimeTextStatisticsItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RealtimeSpeechStatisticsItem.", this.RealtimeSpeechStatisticsItem);
        this.setParamObj(map, prefix + "VoiceMessageStatisticsItem.", this.VoiceMessageStatisticsItem);
        this.setParamObj(map, prefix + "VoiceFilterStatisticsItem.", this.VoiceFilterStatisticsItem);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamObj(map, prefix + "AudioTextStatisticsItem.", this.AudioTextStatisticsItem);
        this.setParamObj(map, prefix + "StreamTextStatisticsItem.", this.StreamTextStatisticsItem);
        this.setParamObj(map, prefix + "OverseaTextStatisticsItem.", this.OverseaTextStatisticsItem);
        this.setParamObj(map, prefix + "RealtimeTextStatisticsItem.", this.RealtimeTextStatisticsItem);

    }
}

