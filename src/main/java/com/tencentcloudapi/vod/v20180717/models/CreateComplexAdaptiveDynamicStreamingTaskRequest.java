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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateComplexAdaptiveDynamicStreamingTaskRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 主媒体文件的媒体 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 自适应码流参数，最大支持8个。
    */
    @SerializedName("StreamParaSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet;

    /**
    * 片头片尾列表，支持多片头片尾，最大可支持 4 个。如果填写了该字段，AudioSet 和 SubtitleSet 中指定的媒体的起始时间将会自动调整，和主媒体保持同步。
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * 多语言音频流参数，最大支持16个。每个数组元素对应自适应码流中的一条音频流。如果要将主媒体文件中的音频流添加到输出的自适应码流中，那么也需要在此处指定。数组中元素的顺序将决定自适应码流中的音频流顺序。如果输入的媒体文件同时带有视频流和音频流，那么视频流将被忽略。
    */
    @SerializedName("AudioSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet;

    /**
    * 多语言字幕参数，最大可支持16个。每个数组元素对应自适应码流中的一条字幕流。数组中元素的顺序将决定自适应码流中的字幕流顺序。
    */
    @SerializedName("SubtitleSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 主媒体文件的媒体 ID。 
     * @return FileId 主媒体文件的媒体 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 主媒体文件的媒体 ID。
     * @param FileId 主媒体文件的媒体 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 自适应码流参数，最大支持8个。 
     * @return StreamParaSet 自适应码流参数，最大支持8个。
     */
    public ComplexAdaptiveDynamicStreamingTaskStreamPara [] getStreamParaSet() {
        return this.StreamParaSet;
    }

    /**
     * Set 自适应码流参数，最大支持8个。
     * @param StreamParaSet 自适应码流参数，最大支持8个。
     */
    public void setStreamParaSet(ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet) {
        this.StreamParaSet = StreamParaSet;
    }

    /**
     * Get 片头片尾列表，支持多片头片尾，最大可支持 4 个。如果填写了该字段，AudioSet 和 SubtitleSet 中指定的媒体的起始时间将会自动调整，和主媒体保持同步。 
     * @return HeadTailSet 片头片尾列表，支持多片头片尾，最大可支持 4 个。如果填写了该字段，AudioSet 和 SubtitleSet 中指定的媒体的起始时间将会自动调整，和主媒体保持同步。
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set 片头片尾列表，支持多片头片尾，最大可支持 4 个。如果填写了该字段，AudioSet 和 SubtitleSet 中指定的媒体的起始时间将会自动调整，和主媒体保持同步。
     * @param HeadTailSet 片头片尾列表，支持多片头片尾，最大可支持 4 个。如果填写了该字段，AudioSet 和 SubtitleSet 中指定的媒体的起始时间将会自动调整，和主媒体保持同步。
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get 多语言音频流参数，最大支持16个。每个数组元素对应自适应码流中的一条音频流。如果要将主媒体文件中的音频流添加到输出的自适应码流中，那么也需要在此处指定。数组中元素的顺序将决定自适应码流中的音频流顺序。如果输入的媒体文件同时带有视频流和音频流，那么视频流将被忽略。 
     * @return AudioSet 多语言音频流参数，最大支持16个。每个数组元素对应自适应码流中的一条音频流。如果要将主媒体文件中的音频流添加到输出的自适应码流中，那么也需要在此处指定。数组中元素的顺序将决定自适应码流中的音频流顺序。如果输入的媒体文件同时带有视频流和音频流，那么视频流将被忽略。
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput [] getAudioSet() {
        return this.AudioSet;
    }

    /**
     * Set 多语言音频流参数，最大支持16个。每个数组元素对应自适应码流中的一条音频流。如果要将主媒体文件中的音频流添加到输出的自适应码流中，那么也需要在此处指定。数组中元素的顺序将决定自适应码流中的音频流顺序。如果输入的媒体文件同时带有视频流和音频流，那么视频流将被忽略。
     * @param AudioSet 多语言音频流参数，最大支持16个。每个数组元素对应自适应码流中的一条音频流。如果要将主媒体文件中的音频流添加到输出的自适应码流中，那么也需要在此处指定。数组中元素的顺序将决定自适应码流中的音频流顺序。如果输入的媒体文件同时带有视频流和音频流，那么视频流将被忽略。
     */
    public void setAudioSet(ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet) {
        this.AudioSet = AudioSet;
    }

    /**
     * Get 多语言字幕参数，最大可支持16个。每个数组元素对应自适应码流中的一条字幕流。数组中元素的顺序将决定自适应码流中的字幕流顺序。 
     * @return SubtitleSet 多语言字幕参数，最大可支持16个。每个数组元素对应自适应码流中的一条字幕流。数组中元素的顺序将决定自适应码流中的字幕流顺序。
     */
    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 多语言字幕参数，最大可支持16个。每个数组元素对应自适应码流中的一条字幕流。数组中元素的顺序将决定自适应码流中的字幕流顺序。
     * @param SubtitleSet 多语言字幕参数，最大可支持16个。每个数组元素对应自适应码流中的一条字幕流。数组中元素的顺序将决定自适应码流中的字幕流顺序。
     */
    public void setSubtitleSet(ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    public CreateComplexAdaptiveDynamicStreamingTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateComplexAdaptiveDynamicStreamingTaskRequest(CreateComplexAdaptiveDynamicStreamingTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StreamParaSet != null) {
            this.StreamParaSet = new ComplexAdaptiveDynamicStreamingTaskStreamPara[source.StreamParaSet.length];
            for (int i = 0; i < source.StreamParaSet.length; i++) {
                this.StreamParaSet[i] = new ComplexAdaptiveDynamicStreamingTaskStreamPara(source.StreamParaSet[i]);
            }
        }
        if (source.HeadTailSet != null) {
            this.HeadTailSet = new HeadTailTaskInput[source.HeadTailSet.length];
            for (int i = 0; i < source.HeadTailSet.length; i++) {
                this.HeadTailSet[i] = new HeadTailTaskInput(source.HeadTailSet[i]);
            }
        }
        if (source.AudioSet != null) {
            this.AudioSet = new ComplexAdaptiveDynamicStreamingTaskAudioInput[source.AudioSet.length];
            for (int i = 0; i < source.AudioSet.length; i++) {
                this.AudioSet[i] = new ComplexAdaptiveDynamicStreamingTaskAudioInput(source.AudioSet[i]);
            }
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new ComplexAdaptiveDynamicStreamingTaskSubtitleInput[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new ComplexAdaptiveDynamicStreamingTaskSubtitleInput(source.SubtitleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamArrayObj(map, prefix + "StreamParaSet.", this.StreamParaSet);
        this.setParamArrayObj(map, prefix + "HeadTailSet.", this.HeadTailSet);
        this.setParamArrayObj(map, prefix + "AudioSet.", this.AudioSet);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);

    }
}

