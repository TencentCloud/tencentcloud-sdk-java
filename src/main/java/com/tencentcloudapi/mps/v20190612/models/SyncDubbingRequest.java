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

public class SyncDubbingRequest extends AbstractModel {

    /**
    * <p>合成文本，语音合成时必填，文本长度不超过2000字符</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>文本语言，不填默认中文。<br>当前支持语言：<br>zh    中文 (Chinese)<br>en    英语 (English)<br>ja    日语 (Japanese)<br>de    德语 (German)<br>fr    法语 (French)<br>ko    韩语 (Korean)<br>ru    俄语 (Russian)<br>uk    乌克兰语 (Ukrainian)<br>pt    葡萄牙语 (Portuguese)<br>it    意大利语 (Italian)<br>es    西班牙语 (Spanish)<br>id    印度尼西亚语 (Indonesian)<br>nl    荷兰语 (Dutch)<br>tr    土耳其语 (Turkish)<br>fil    菲律宾语 (Filipino)<br>ms    马来语 (Malay)<br>el    希腊语 (Greek)<br>fi    芬兰语 (Finnish)<br>hr    克罗地亚语 (Croatian)<br>sk    斯洛伐克语 (Slovak)<br>pl    波兰语 (Polish)<br>sv    瑞典语 (Swedish)<br>hi    印地语 (Hindi)<br>bg    保加利亚语 (Bulgarian)<br>ro    罗马尼亚语 (Romanian)<br>ar    阿拉伯语 (Arabic)<br>cs    捷克语 (Czech)<br>da    丹麦语 (Danish)<br>ta    泰米尔语 (Tamil)<br>hun    匈牙利语（Hungarian）<br>vi    越南语（Vietnamese）<br>no    挪威语（Norwegian）<br>yue    粤语（Cantonese）<br>th    泰语（Thai）<br>he    希伯来语（Hebrew）<br>ca    加泰罗尼亚语（Catalan）<br>nn    尼诺斯克语（Nynorsk）<br>af    阿非利卡语（Afrikaans）<br>fa    波斯语（Persian）<br>sl    斯洛文尼亚语（Slovenian）</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>音色Id，指定音色合成时填写，支持系统音色和克隆音色。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>克隆音频base64编码。</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>克隆音频Url，AudioData为空时有效</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>克隆音频语言，默认中文。<br>当前支持语言同TextLang</p>
    */
    @SerializedName("AudioLang")
    @Expose
    private String AudioLang;

    /**
    * <p>扩展参数，json字符串</p><p>synExt    Object    语音合成扩展参数<br>    -duration    Float    合成音频时长，单位秒，示例：5.2<br>    -sampleRate    Integer    合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>    -pitch    Integer    音调，默认0原音色输出，取值[-12, 12]<br>cloneExt    Object    音色克隆扩展参数<br>    -timeRanges    Float[][]    指定克隆音频时间范围，默认[[0, 20]]，示例[[5.2, 10], [45, 59.8]]</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>合成文本，语音合成时必填，文本长度不超过2000字符</p> 
     * @return Text <p>合成文本，语音合成时必填，文本长度不超过2000字符</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>合成文本，语音合成时必填，文本长度不超过2000字符</p>
     * @param Text <p>合成文本，语音合成时必填，文本长度不超过2000字符</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>文本语言，不填默认中文。<br>当前支持语言：<br>zh    中文 (Chinese)<br>en    英语 (English)<br>ja    日语 (Japanese)<br>de    德语 (German)<br>fr    法语 (French)<br>ko    韩语 (Korean)<br>ru    俄语 (Russian)<br>uk    乌克兰语 (Ukrainian)<br>pt    葡萄牙语 (Portuguese)<br>it    意大利语 (Italian)<br>es    西班牙语 (Spanish)<br>id    印度尼西亚语 (Indonesian)<br>nl    荷兰语 (Dutch)<br>tr    土耳其语 (Turkish)<br>fil    菲律宾语 (Filipino)<br>ms    马来语 (Malay)<br>el    希腊语 (Greek)<br>fi    芬兰语 (Finnish)<br>hr    克罗地亚语 (Croatian)<br>sk    斯洛伐克语 (Slovak)<br>pl    波兰语 (Polish)<br>sv    瑞典语 (Swedish)<br>hi    印地语 (Hindi)<br>bg    保加利亚语 (Bulgarian)<br>ro    罗马尼亚语 (Romanian)<br>ar    阿拉伯语 (Arabic)<br>cs    捷克语 (Czech)<br>da    丹麦语 (Danish)<br>ta    泰米尔语 (Tamil)<br>hun    匈牙利语（Hungarian）<br>vi    越南语（Vietnamese）<br>no    挪威语（Norwegian）<br>yue    粤语（Cantonese）<br>th    泰语（Thai）<br>he    希伯来语（Hebrew）<br>ca    加泰罗尼亚语（Catalan）<br>nn    尼诺斯克语（Nynorsk）<br>af    阿非利卡语（Afrikaans）<br>fa    波斯语（Persian）<br>sl    斯洛文尼亚语（Slovenian）</p> 
     * @return TextLang <p>文本语言，不填默认中文。<br>当前支持语言：<br>zh    中文 (Chinese)<br>en    英语 (English)<br>ja    日语 (Japanese)<br>de    德语 (German)<br>fr    法语 (French)<br>ko    韩语 (Korean)<br>ru    俄语 (Russian)<br>uk    乌克兰语 (Ukrainian)<br>pt    葡萄牙语 (Portuguese)<br>it    意大利语 (Italian)<br>es    西班牙语 (Spanish)<br>id    印度尼西亚语 (Indonesian)<br>nl    荷兰语 (Dutch)<br>tr    土耳其语 (Turkish)<br>fil    菲律宾语 (Filipino)<br>ms    马来语 (Malay)<br>el    希腊语 (Greek)<br>fi    芬兰语 (Finnish)<br>hr    克罗地亚语 (Croatian)<br>sk    斯洛伐克语 (Slovak)<br>pl    波兰语 (Polish)<br>sv    瑞典语 (Swedish)<br>hi    印地语 (Hindi)<br>bg    保加利亚语 (Bulgarian)<br>ro    罗马尼亚语 (Romanian)<br>ar    阿拉伯语 (Arabic)<br>cs    捷克语 (Czech)<br>da    丹麦语 (Danish)<br>ta    泰米尔语 (Tamil)<br>hun    匈牙利语（Hungarian）<br>vi    越南语（Vietnamese）<br>no    挪威语（Norwegian）<br>yue    粤语（Cantonese）<br>th    泰语（Thai）<br>he    希伯来语（Hebrew）<br>ca    加泰罗尼亚语（Catalan）<br>nn    尼诺斯克语（Nynorsk）<br>af    阿非利卡语（Afrikaans）<br>fa    波斯语（Persian）<br>sl    斯洛文尼亚语（Slovenian）</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>文本语言，不填默认中文。<br>当前支持语言：<br>zh    中文 (Chinese)<br>en    英语 (English)<br>ja    日语 (Japanese)<br>de    德语 (German)<br>fr    法语 (French)<br>ko    韩语 (Korean)<br>ru    俄语 (Russian)<br>uk    乌克兰语 (Ukrainian)<br>pt    葡萄牙语 (Portuguese)<br>it    意大利语 (Italian)<br>es    西班牙语 (Spanish)<br>id    印度尼西亚语 (Indonesian)<br>nl    荷兰语 (Dutch)<br>tr    土耳其语 (Turkish)<br>fil    菲律宾语 (Filipino)<br>ms    马来语 (Malay)<br>el    希腊语 (Greek)<br>fi    芬兰语 (Finnish)<br>hr    克罗地亚语 (Croatian)<br>sk    斯洛伐克语 (Slovak)<br>pl    波兰语 (Polish)<br>sv    瑞典语 (Swedish)<br>hi    印地语 (Hindi)<br>bg    保加利亚语 (Bulgarian)<br>ro    罗马尼亚语 (Romanian)<br>ar    阿拉伯语 (Arabic)<br>cs    捷克语 (Czech)<br>da    丹麦语 (Danish)<br>ta    泰米尔语 (Tamil)<br>hun    匈牙利语（Hungarian）<br>vi    越南语（Vietnamese）<br>no    挪威语（Norwegian）<br>yue    粤语（Cantonese）<br>th    泰语（Thai）<br>he    希伯来语（Hebrew）<br>ca    加泰罗尼亚语（Catalan）<br>nn    尼诺斯克语（Nynorsk）<br>af    阿非利卡语（Afrikaans）<br>fa    波斯语（Persian）<br>sl    斯洛文尼亚语（Slovenian）</p>
     * @param TextLang <p>文本语言，不填默认中文。<br>当前支持语言：<br>zh    中文 (Chinese)<br>en    英语 (English)<br>ja    日语 (Japanese)<br>de    德语 (German)<br>fr    法语 (French)<br>ko    韩语 (Korean)<br>ru    俄语 (Russian)<br>uk    乌克兰语 (Ukrainian)<br>pt    葡萄牙语 (Portuguese)<br>it    意大利语 (Italian)<br>es    西班牙语 (Spanish)<br>id    印度尼西亚语 (Indonesian)<br>nl    荷兰语 (Dutch)<br>tr    土耳其语 (Turkish)<br>fil    菲律宾语 (Filipino)<br>ms    马来语 (Malay)<br>el    希腊语 (Greek)<br>fi    芬兰语 (Finnish)<br>hr    克罗地亚语 (Croatian)<br>sk    斯洛伐克语 (Slovak)<br>pl    波兰语 (Polish)<br>sv    瑞典语 (Swedish)<br>hi    印地语 (Hindi)<br>bg    保加利亚语 (Bulgarian)<br>ro    罗马尼亚语 (Romanian)<br>ar    阿拉伯语 (Arabic)<br>cs    捷克语 (Czech)<br>da    丹麦语 (Danish)<br>ta    泰米尔语 (Tamil)<br>hun    匈牙利语（Hungarian）<br>vi    越南语（Vietnamese）<br>no    挪威语（Norwegian）<br>yue    粤语（Cantonese）<br>th    泰语（Thai）<br>he    希伯来语（Hebrew）<br>ca    加泰罗尼亚语（Catalan）<br>nn    尼诺斯克语（Nynorsk）<br>af    阿非利卡语（Afrikaans）<br>fa    波斯语（Persian）<br>sl    斯洛文尼亚语（Slovenian）</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get <p>音色Id，指定音色合成时填写，支持系统音色和克隆音色。</p> 
     * @return VoiceId <p>音色Id，指定音色合成时填写，支持系统音色和克隆音色。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色Id，指定音色合成时填写，支持系统音色和克隆音色。</p>
     * @param VoiceId <p>音色Id，指定音色合成时填写，支持系统音色和克隆音色。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>克隆音频base64编码。</p> 
     * @return AudioData <p>克隆音频base64编码。</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>克隆音频base64编码。</p>
     * @param AudioData <p>克隆音频base64编码。</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>克隆音频Url，AudioData为空时有效</p> 
     * @return AudioUrl <p>克隆音频Url，AudioData为空时有效</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>克隆音频Url，AudioData为空时有效</p>
     * @param AudioUrl <p>克隆音频Url，AudioData为空时有效</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>克隆音频语言，默认中文。<br>当前支持语言同TextLang</p> 
     * @return AudioLang <p>克隆音频语言，默认中文。<br>当前支持语言同TextLang</p>
     */
    public String getAudioLang() {
        return this.AudioLang;
    }

    /**
     * Set <p>克隆音频语言，默认中文。<br>当前支持语言同TextLang</p>
     * @param AudioLang <p>克隆音频语言，默认中文。<br>当前支持语言同TextLang</p>
     */
    public void setAudioLang(String AudioLang) {
        this.AudioLang = AudioLang;
    }

    /**
     * Get <p>扩展参数，json字符串</p><p>synExt    Object    语音合成扩展参数<br>    -duration    Float    合成音频时长，单位秒，示例：5.2<br>    -sampleRate    Integer    合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>    -pitch    Integer    音调，默认0原音色输出，取值[-12, 12]<br>cloneExt    Object    音色克隆扩展参数<br>    -timeRanges    Float[][]    指定克隆音频时间范围，默认[[0, 20]]，示例[[5.2, 10], [45, 59.8]]</p> 
     * @return ExtParam <p>扩展参数，json字符串</p><p>synExt    Object    语音合成扩展参数<br>    -duration    Float    合成音频时长，单位秒，示例：5.2<br>    -sampleRate    Integer    合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>    -pitch    Integer    音调，默认0原音色输出，取值[-12, 12]<br>cloneExt    Object    音色克隆扩展参数<br>    -timeRanges    Float[][]    指定克隆音频时间范围，默认[[0, 20]]，示例[[5.2, 10], [45, 59.8]]</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>扩展参数，json字符串</p><p>synExt    Object    语音合成扩展参数<br>    -duration    Float    合成音频时长，单位秒，示例：5.2<br>    -sampleRate    Integer    合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>    -pitch    Integer    音调，默认0原音色输出，取值[-12, 12]<br>cloneExt    Object    音色克隆扩展参数<br>    -timeRanges    Float[][]    指定克隆音频时间范围，默认[[0, 20]]，示例[[5.2, 10], [45, 59.8]]</p>
     * @param ExtParam <p>扩展参数，json字符串</p><p>synExt    Object    语音合成扩展参数<br>    -duration    Float    合成音频时长，单位秒，示例：5.2<br>    -sampleRate    Integer    合成音频采样率，默认16000，支持[8000,16000,22050,32000,44100]<br>    -pitch    Integer    音调，默认0原音色输出，取值[-12, 12]<br>cloneExt    Object    音色克隆扩展参数<br>    -timeRanges    Float[][]    指定克隆音频时间范围，默认[[0, 20]]，示例[[5.2, 10], [45, 59.8]]</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public SyncDubbingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDubbingRequest(SyncDubbingRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioLang != null) {
            this.AudioLang = new String(source.AudioLang);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioLang", this.AudioLang);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

