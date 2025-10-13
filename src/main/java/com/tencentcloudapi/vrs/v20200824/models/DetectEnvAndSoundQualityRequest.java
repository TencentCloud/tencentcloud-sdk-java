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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectEnvAndSoundQualityRequest extends AbstractModel {

    /**
    * 标注文本信息 ID
    */
    @SerializedName("TextId")
    @Expose
    private String TextId;

    /**
    * 语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open("input.aac", mode="rb").read()), encoding='utf-8') )。
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 1:环境检测 2:音质检测
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 音频格式，音频类型(wav,mp3,aac,m4a)
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音频采样率。
16000：16k（默认）；
24000：24k（仅一句话声音复刻支持）；
48000：48k（仅一句话声音复刻支持）。
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 复刻类型。5 - 一句话声音复刻。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 标注文本信息 ID 
     * @return TextId 标注文本信息 ID
     */
    public String getTextId() {
        return this.TextId;
    }

    /**
     * Set 标注文本信息 ID
     * @param TextId 标注文本信息 ID
     */
    public void setTextId(String TextId) {
        this.TextId = TextId;
    }

    /**
     * Get 语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open("input.aac", mode="rb").read()), encoding='utf-8') )。 
     * @return AudioData 语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open("input.aac", mode="rb").read()), encoding='utf-8') )。
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set 语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open("input.aac", mode="rb").read()), encoding='utf-8') )。
     * @param AudioData 语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open("input.aac", mode="rb").read()), encoding='utf-8') )。
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get 1:环境检测 2:音质检测 
     * @return TypeId 1:环境检测 2:音质检测
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 1:环境检测 2:音质检测
     * @param TypeId 1:环境检测 2:音质检测
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 音频格式，音频类型(wav,mp3,aac,m4a) 
     * @return Codec 音频格式，音频类型(wav,mp3,aac,m4a)
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频格式，音频类型(wav,mp3,aac,m4a)
     * @param Codec 音频格式，音频类型(wav,mp3,aac,m4a)
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音频采样率。
16000：16k（默认）；
24000：24k（仅一句话声音复刻支持）；
48000：48k（仅一句话声音复刻支持）。 
     * @return SampleRate 音频采样率。
16000：16k（默认）；
24000：24k（仅一句话声音复刻支持）；
48000：48k（仅一句话声音复刻支持）。
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率。
16000：16k（默认）；
24000：24k（仅一句话声音复刻支持）；
48000：48k（仅一句话声音复刻支持）。
     * @param SampleRate 音频采样率。
16000：16k（默认）；
24000：24k（仅一句话声音复刻支持）；
48000：48k（仅一句话声音复刻支持）。
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 复刻类型。5 - 一句话声音复刻。 
     * @return TaskType 复刻类型。5 - 一句话声音复刻。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 复刻类型。5 - 一句话声音复刻。
     * @param TaskType 复刻类型。5 - 一句话声音复刻。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public DetectEnvAndSoundQualityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectEnvAndSoundQualityRequest(DetectEnvAndSoundQualityRequest source) {
        if (source.TextId != null) {
            this.TextId = new String(source.TextId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TextId", this.TextId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

