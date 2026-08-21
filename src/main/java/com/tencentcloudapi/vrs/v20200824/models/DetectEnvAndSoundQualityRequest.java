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
    * <p>标注文本信息 ID</p>
    */
    @SerializedName("TextId")
    @Expose
    private String TextId;

    /**
    * <p>语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open(&quot;input.aac&quot;, mode=&quot;rb&quot;).read()), encoding=&#39;utf-8&#39;) )。</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>1:环境检测 2:音质检测</p>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>音频采样率。<br>16000：16k（默认）；<br>24000：24k（仅一句话声音复刻支持）；<br>48000：48k（仅一句话声音复刻支持）。</p>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * <p>复刻类型。5 - 一句话声音复刻。</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get <p>标注文本信息 ID</p> 
     * @return TextId <p>标注文本信息 ID</p>
     */
    public String getTextId() {
        return this.TextId;
    }

    /**
     * Set <p>标注文本信息 ID</p>
     * @param TextId <p>标注文本信息 ID</p>
     */
    public void setTextId(String TextId) {
        this.TextId = TextId;
    }

    /**
     * Get <p>语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open(&quot;input.aac&quot;, mode=&quot;rb&quot;).read()), encoding=&#39;utf-8&#39;) )。</p> 
     * @return AudioData <p>语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open(&quot;input.aac&quot;, mode=&quot;rb&quot;).read()), encoding=&#39;utf-8&#39;) )。</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open(&quot;input.aac&quot;, mode=&quot;rb&quot;).read()), encoding=&#39;utf-8&#39;) )。</p>
     * @param AudioData <p>语音数据 要使用base64编码(采用python语言时注意读取文件时需要转成base64字符串编码，例如：str(base64.b64encode(open(&quot;input.aac&quot;, mode=&quot;rb&quot;).read()), encoding=&#39;utf-8&#39;) )。</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>1:环境检测 2:音质检测</p> 
     * @return TypeId <p>1:环境检测 2:音质检测</p>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>1:环境检测 2:音质检测</p>
     * @param TypeId <p>1:环境检测 2:音质检测</p>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>音频格式，音频类型(wav,mp3,aac,m4a)</p> 
     * @return Codec <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
     * @param Codec <p>音频格式，音频类型(wav,mp3,aac,m4a)</p>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>音频采样率。<br>16000：16k（默认）；<br>24000：24k（仅一句话声音复刻支持）；<br>48000：48k（仅一句话声音复刻支持）。</p> 
     * @return SampleRate <p>音频采样率。<br>16000：16k（默认）；<br>24000：24k（仅一句话声音复刻支持）；<br>48000：48k（仅一句话声音复刻支持）。</p>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set <p>音频采样率。<br>16000：16k（默认）；<br>24000：24k（仅一句话声音复刻支持）；<br>48000：48k（仅一句话声音复刻支持）。</p>
     * @param SampleRate <p>音频采样率。<br>16000：16k（默认）；<br>24000：24k（仅一句话声音复刻支持）；<br>48000：48k（仅一句话声音复刻支持）。</p>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get <p>复刻类型。5 - 一句话声音复刻。</p> 
     * @return TaskType <p>复刻类型。5 - 一句话声音复刻。</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>复刻类型。5 - 一句话声音复刻。</p>
     * @param TaskType <p>复刻类型。5 - 一句话声音复刻。</p>
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

