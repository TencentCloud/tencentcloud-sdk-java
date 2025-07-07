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
package com.tencentcloudapi.aai.v20180522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceRequest extends AbstractModel {

    /**
    * 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持100个汉字（全角标点符号算一个汉字）；英文最大支持400个字母（半角标点符号算一个字母）。包含空格等字符时需要url encode再传输。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 模型类型，1-默认模型。
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
输入除以上整数之外的其他参数不生效，按默认值处理。
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>输入除以上整数之外的其他参数不生效，按默认值处理。
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 项目id，用户自定义，默认为0。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 音色<li>0-亲和女声(默认)</li><li>1-亲和男声</li><li>2-成熟男声</li><li>3-活力男声</li><li>4-温暖女声</li><li>5-情感女声</li><li>6-情感男声</li>
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Long PrimaryLanguage;

    /**
    * 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 返回音频格式，可取值：wav（默认），mp3
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
     * Get 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持100个汉字（全角标点符号算一个汉字）；英文最大支持400个字母（半角标点符号算一个字母）。包含空格等字符时需要url encode再传输。 
     * @return Text 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持100个汉字（全角标点符号算一个汉字）；英文最大支持400个字母（半角标点符号算一个字母）。包含空格等字符时需要url encode再传输。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持100个汉字（全角标点符号算一个汉字）；英文最大支持400个字母（半角标点符号算一个字母）。包含空格等字符时需要url encode再传输。
     * @param Text 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持100个汉字（全角标点符号算一个汉字）；英文最大支持400个字母（半角标点符号算一个字母）。包含空格等字符时需要url encode再传输。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。 
     * @return SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     * @param SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 模型类型，1-默认模型。 
     * @return ModelType 模型类型，1-默认模型。
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型，1-默认模型。
     * @param ModelType 模型类型，1-默认模型。
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
输入除以上整数之外的其他参数不生效，按默认值处理。 
     * @return Volume 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
输入除以上整数之外的其他参数不生效，按默认值处理。
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
输入除以上整数之外的其他参数不生效，按默认值处理。
     * @param Volume 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
输入除以上整数之外的其他参数不生效，按默认值处理。
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>输入除以上整数之外的其他参数不生效，按默认值处理。 
     * @return Speed 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>输入除以上整数之外的其他参数不生效，按默认值处理。
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>输入除以上整数之外的其他参数不生效，按默认值处理。
     * @param Speed 语速，范围：[-2，2]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li>输入除以上整数之外的其他参数不生效，按默认值处理。
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get 项目id，用户自定义，默认为0。 
     * @return ProjectId 项目id，用户自定义，默认为0。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id，用户自定义，默认为0。
     * @param ProjectId 项目id，用户自定义，默认为0。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 音色<li>0-亲和女声(默认)</li><li>1-亲和男声</li><li>2-成熟男声</li><li>3-活力男声</li><li>4-温暖女声</li><li>5-情感女声</li><li>6-情感男声</li> 
     * @return VoiceType 音色<li>0-亲和女声(默认)</li><li>1-亲和男声</li><li>2-成熟男声</li><li>3-活力男声</li><li>4-温暖女声</li><li>5-情感女声</li><li>6-情感男声</li>
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色<li>0-亲和女声(默认)</li><li>1-亲和男声</li><li>2-成熟男声</li><li>3-活力男声</li><li>4-温暖女声</li><li>5-情感女声</li><li>6-情感男声</li>
     * @param VoiceType 音色<li>0-亲和女声(默认)</li><li>1-亲和男声</li><li>2-成熟男声</li><li>3-活力男声</li><li>4-温暖女声</li><li>5-情感女声</li><li>6-情感男声</li>
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 主语言类型：<li>1-中文（默认）</li><li>2-英文</li> 
     * @return PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     */
    public Long getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * Set 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     * @param PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     */
    public void setPrimaryLanguage(Long PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * Get 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li> 
     * @return SampleRate 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     * @param SampleRate 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 返回音频格式，可取值：wav（默认），mp3 
     * @return Codec 返回音频格式，可取值：wav（默认），mp3
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 返回音频格式，可取值：wav（默认），mp3
     * @param Codec 返回音频格式，可取值：wav（默认），mp3
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    public TextToVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToVoiceRequest(TextToVoiceRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.PrimaryLanguage != null) {
            this.PrimaryLanguage = new Long(source.PrimaryLanguage);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "Codec", this.Codec);

    }
}

