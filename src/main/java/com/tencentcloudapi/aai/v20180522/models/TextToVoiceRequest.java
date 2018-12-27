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
package com.tencentcloudapi.aai.v20180522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceRequest  extends AbstractModel{

    /**
    * 合成语音的源文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 模型类型，1-默认模型
    */
    @SerializedName("ModelType")
    @Expose
    private Integer ModelType;

    /**
    * 音量大小，范围：[0，10]，分别对应10个等级的音量，默认为0
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，范围：[-2，2]，分别对应不同语速：0.6倍，0.8倍，1.0倍，1.2倍，1.5倍，默认为0
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 项目id，用户自定义，默认为0
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 音色<li>0-女声1，亲和风格(默认)</li><li>1-男声1，成熟风格</li><li>2-男声2，成熟风格</li>
    */
    @SerializedName("VoiceType")
    @Expose
    private Integer VoiceType;

    /**
    * 主语言类型<li>1-中文，最大100个汉字（标点符号算一个汉子）</li><li>2-英文，最大支持400个字母（标点符号算一个字母）</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Integer PrimaryLanguage;

    /**
    * 音频采样率，16000：16k，8000：8k，默认16k
    */
    @SerializedName("SampleRate")
    @Expose
    private Integer SampleRate;

    /**
     * 获取合成语音的源文本
     * @return Text 合成语音的源文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * 设置合成语音的源文本
     * @param Text 合成语音的源文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * 获取一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     * @return SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     * @param SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取模型类型，1-默认模型
     * @return ModelType 模型类型，1-默认模型
     */
    public Integer getModelType() {
        return this.ModelType;
    }

    /**
     * 设置模型类型，1-默认模型
     * @param ModelType 模型类型，1-默认模型
     */
    public void setModelType(Integer ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * 获取音量大小，范围：[0，10]，分别对应10个等级的音量，默认为0
     * @return Volume 音量大小，范围：[0，10]，分别对应10个等级的音量，默认为0
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * 设置音量大小，范围：[0，10]，分别对应10个等级的音量，默认为0
     * @param Volume 音量大小，范围：[0，10]，分别对应10个等级的音量，默认为0
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取语速，范围：[-2，2]，分别对应不同语速：0.6倍，0.8倍，1.0倍，1.2倍，1.5倍，默认为0
     * @return Speed 语速，范围：[-2，2]，分别对应不同语速：0.6倍，0.8倍，1.0倍，1.2倍，1.5倍，默认为0
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * 设置语速，范围：[-2，2]，分别对应不同语速：0.6倍，0.8倍，1.0倍，1.2倍，1.5倍，默认为0
     * @param Speed 语速，范围：[-2，2]，分别对应不同语速：0.6倍，0.8倍，1.0倍，1.2倍，1.5倍，默认为0
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * 获取项目id，用户自定义，默认为0
     * @return ProjectId 项目id，用户自定义，默认为0
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id，用户自定义，默认为0
     * @param ProjectId 项目id，用户自定义，默认为0
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取音色<li>0-女声1，亲和风格(默认)</li><li>1-男声1，成熟风格</li><li>2-男声2，成熟风格</li>
     * @return VoiceType 音色<li>0-女声1，亲和风格(默认)</li><li>1-男声1，成熟风格</li><li>2-男声2，成熟风格</li>
     */
    public Integer getVoiceType() {
        return this.VoiceType;
    }

    /**
     * 设置音色<li>0-女声1，亲和风格(默认)</li><li>1-男声1，成熟风格</li><li>2-男声2，成熟风格</li>
     * @param VoiceType 音色<li>0-女声1，亲和风格(默认)</li><li>1-男声1，成熟风格</li><li>2-男声2，成熟风格</li>
     */
    public void setVoiceType(Integer VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * 获取主语言类型<li>1-中文，最大100个汉字（标点符号算一个汉子）</li><li>2-英文，最大支持400个字母（标点符号算一个字母）</li>
     * @return PrimaryLanguage 主语言类型<li>1-中文，最大100个汉字（标点符号算一个汉子）</li><li>2-英文，最大支持400个字母（标点符号算一个字母）</li>
     */
    public Integer getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * 设置主语言类型<li>1-中文，最大100个汉字（标点符号算一个汉子）</li><li>2-英文，最大支持400个字母（标点符号算一个字母）</li>
     * @param PrimaryLanguage 主语言类型<li>1-中文，最大100个汉字（标点符号算一个汉子）</li><li>2-英文，最大支持400个字母（标点符号算一个字母）</li>
     */
    public void setPrimaryLanguage(Integer PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * 获取音频采样率，16000：16k，8000：8k，默认16k
     * @return SampleRate 音频采样率，16000：16k，8000：8k，默认16k
     */
    public Integer getSampleRate() {
        return this.SampleRate;
    }

    /**
     * 设置音频采样率，16000：16k，8000：8k，默认16k
     * @param SampleRate 音频采样率，16000：16k，8000：8k，默认16k
     */
    public void setSampleRate(Integer SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);

    }
}

