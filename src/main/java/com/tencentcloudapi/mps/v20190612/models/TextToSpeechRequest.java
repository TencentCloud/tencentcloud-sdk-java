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

public class TextToSpeechRequest extends AbstractModel {

    /**
    * <p>语音合成文本</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音色ID</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>文本语言。不填默认自动识别<br>当前支持语言：<br>zh 中文 (Chinese)<br>en 英语 (English)<br>ja 日语 (Japanese)<br>de 德语 (German)<br>fr 法语 (French)<br>ko 韩语 (Korean)<br>ru 俄语 (Russian)<br>uk 乌克兰语 (Ukrainian)<br>pt 葡萄牙语 (Portuguese)<br>it 意大利语 (Italian)<br>es 西班牙语 (Spanish)<br>id 印度尼西亚语 (Indonesian)<br>nl 荷兰语 (Dutch)<br>tr 土耳其语 (Turkish)<br>fil 菲律宾语 (Filipino)<br>ms 马来语 (Malay)<br>el 希腊语 (Greek)<br>fi 芬兰语 (Finnish)<br>hr 克罗地亚语 (Croatian)<br>sk 斯洛伐克语 (Slovak)<br>pl 波兰语 (Polish)<br>sv 瑞典语 (Swedish)<br>hi 印地语 (Hindi)<br>bg 保加利亚语 (Bulgarian)<br>ro 罗马尼亚语 (Romanian)<br>ar 阿拉伯语 (Arabic)<br>cs 捷克语 (Czech)<br>da 丹麦语 (Danish)<br>ta 泰米尔语 (Tamil)<br>hun 匈牙利语（Hungarian）<br>vi 越南语（Vietnamese）<br>no 挪威语（Norwegian）<br>yue 粤语（Cantonese）<br>th 泰语（Thai）<br>he 希伯来语（Hebrew）<br>ca 加泰罗尼亚语（Catalan）<br>nn 尼诺斯克语（Nynorsk）<br>af 阿非利卡语（Afrikaans）<br>fa 波斯语（Persian）<br>sl 斯洛文尼亚语（Slovenian）</p>
    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * <p>输出相关参数</p>
    */
    @SerializedName("Output")
    @Expose
    private SyncDubbingOutputOption Output;

    /**
    * <p>扩展参数，json字符串</p><p><strong>synExt</strong> Object 语音合成扩展参数<br>   <strong>duration</strong> Float 合成音频时长（单位秒），默认不控制时长。示例：5.2<br>   <strong>format</strong> String 输出音频格式，默认wav，支持wav、mp3<br>   <strong>sampleRate</strong> Integer 合成音频采样率，默认16000，支持[8000,16000,22050,24000,32000,44100]</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>语音合成文本</p> 
     * @return Text <p>语音合成文本</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>语音合成文本</p>
     * @param Text <p>语音合成文本</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音色ID</p> 
     * @return VoiceId <p>音色ID</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色ID</p>
     * @param VoiceId <p>音色ID</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>文本语言。不填默认自动识别<br>当前支持语言：<br>zh 中文 (Chinese)<br>en 英语 (English)<br>ja 日语 (Japanese)<br>de 德语 (German)<br>fr 法语 (French)<br>ko 韩语 (Korean)<br>ru 俄语 (Russian)<br>uk 乌克兰语 (Ukrainian)<br>pt 葡萄牙语 (Portuguese)<br>it 意大利语 (Italian)<br>es 西班牙语 (Spanish)<br>id 印度尼西亚语 (Indonesian)<br>nl 荷兰语 (Dutch)<br>tr 土耳其语 (Turkish)<br>fil 菲律宾语 (Filipino)<br>ms 马来语 (Malay)<br>el 希腊语 (Greek)<br>fi 芬兰语 (Finnish)<br>hr 克罗地亚语 (Croatian)<br>sk 斯洛伐克语 (Slovak)<br>pl 波兰语 (Polish)<br>sv 瑞典语 (Swedish)<br>hi 印地语 (Hindi)<br>bg 保加利亚语 (Bulgarian)<br>ro 罗马尼亚语 (Romanian)<br>ar 阿拉伯语 (Arabic)<br>cs 捷克语 (Czech)<br>da 丹麦语 (Danish)<br>ta 泰米尔语 (Tamil)<br>hun 匈牙利语（Hungarian）<br>vi 越南语（Vietnamese）<br>no 挪威语（Norwegian）<br>yue 粤语（Cantonese）<br>th 泰语（Thai）<br>he 希伯来语（Hebrew）<br>ca 加泰罗尼亚语（Catalan）<br>nn 尼诺斯克语（Nynorsk）<br>af 阿非利卡语（Afrikaans）<br>fa 波斯语（Persian）<br>sl 斯洛文尼亚语（Slovenian）</p> 
     * @return TextLang <p>文本语言。不填默认自动识别<br>当前支持语言：<br>zh 中文 (Chinese)<br>en 英语 (English)<br>ja 日语 (Japanese)<br>de 德语 (German)<br>fr 法语 (French)<br>ko 韩语 (Korean)<br>ru 俄语 (Russian)<br>uk 乌克兰语 (Ukrainian)<br>pt 葡萄牙语 (Portuguese)<br>it 意大利语 (Italian)<br>es 西班牙语 (Spanish)<br>id 印度尼西亚语 (Indonesian)<br>nl 荷兰语 (Dutch)<br>tr 土耳其语 (Turkish)<br>fil 菲律宾语 (Filipino)<br>ms 马来语 (Malay)<br>el 希腊语 (Greek)<br>fi 芬兰语 (Finnish)<br>hr 克罗地亚语 (Croatian)<br>sk 斯洛伐克语 (Slovak)<br>pl 波兰语 (Polish)<br>sv 瑞典语 (Swedish)<br>hi 印地语 (Hindi)<br>bg 保加利亚语 (Bulgarian)<br>ro 罗马尼亚语 (Romanian)<br>ar 阿拉伯语 (Arabic)<br>cs 捷克语 (Czech)<br>da 丹麦语 (Danish)<br>ta 泰米尔语 (Tamil)<br>hun 匈牙利语（Hungarian）<br>vi 越南语（Vietnamese）<br>no 挪威语（Norwegian）<br>yue 粤语（Cantonese）<br>th 泰语（Thai）<br>he 希伯来语（Hebrew）<br>ca 加泰罗尼亚语（Catalan）<br>nn 尼诺斯克语（Nynorsk）<br>af 阿非利卡语（Afrikaans）<br>fa 波斯语（Persian）<br>sl 斯洛文尼亚语（Slovenian）</p>
     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set <p>文本语言。不填默认自动识别<br>当前支持语言：<br>zh 中文 (Chinese)<br>en 英语 (English)<br>ja 日语 (Japanese)<br>de 德语 (German)<br>fr 法语 (French)<br>ko 韩语 (Korean)<br>ru 俄语 (Russian)<br>uk 乌克兰语 (Ukrainian)<br>pt 葡萄牙语 (Portuguese)<br>it 意大利语 (Italian)<br>es 西班牙语 (Spanish)<br>id 印度尼西亚语 (Indonesian)<br>nl 荷兰语 (Dutch)<br>tr 土耳其语 (Turkish)<br>fil 菲律宾语 (Filipino)<br>ms 马来语 (Malay)<br>el 希腊语 (Greek)<br>fi 芬兰语 (Finnish)<br>hr 克罗地亚语 (Croatian)<br>sk 斯洛伐克语 (Slovak)<br>pl 波兰语 (Polish)<br>sv 瑞典语 (Swedish)<br>hi 印地语 (Hindi)<br>bg 保加利亚语 (Bulgarian)<br>ro 罗马尼亚语 (Romanian)<br>ar 阿拉伯语 (Arabic)<br>cs 捷克语 (Czech)<br>da 丹麦语 (Danish)<br>ta 泰米尔语 (Tamil)<br>hun 匈牙利语（Hungarian）<br>vi 越南语（Vietnamese）<br>no 挪威语（Norwegian）<br>yue 粤语（Cantonese）<br>th 泰语（Thai）<br>he 希伯来语（Hebrew）<br>ca 加泰罗尼亚语（Catalan）<br>nn 尼诺斯克语（Nynorsk）<br>af 阿非利卡语（Afrikaans）<br>fa 波斯语（Persian）<br>sl 斯洛文尼亚语（Slovenian）</p>
     * @param TextLang <p>文本语言。不填默认自动识别<br>当前支持语言：<br>zh 中文 (Chinese)<br>en 英语 (English)<br>ja 日语 (Japanese)<br>de 德语 (German)<br>fr 法语 (French)<br>ko 韩语 (Korean)<br>ru 俄语 (Russian)<br>uk 乌克兰语 (Ukrainian)<br>pt 葡萄牙语 (Portuguese)<br>it 意大利语 (Italian)<br>es 西班牙语 (Spanish)<br>id 印度尼西亚语 (Indonesian)<br>nl 荷兰语 (Dutch)<br>tr 土耳其语 (Turkish)<br>fil 菲律宾语 (Filipino)<br>ms 马来语 (Malay)<br>el 希腊语 (Greek)<br>fi 芬兰语 (Finnish)<br>hr 克罗地亚语 (Croatian)<br>sk 斯洛伐克语 (Slovak)<br>pl 波兰语 (Polish)<br>sv 瑞典语 (Swedish)<br>hi 印地语 (Hindi)<br>bg 保加利亚语 (Bulgarian)<br>ro 罗马尼亚语 (Romanian)<br>ar 阿拉伯语 (Arabic)<br>cs 捷克语 (Czech)<br>da 丹麦语 (Danish)<br>ta 泰米尔语 (Tamil)<br>hun 匈牙利语（Hungarian）<br>vi 越南语（Vietnamese）<br>no 挪威语（Norwegian）<br>yue 粤语（Cantonese）<br>th 泰语（Thai）<br>he 希伯来语（Hebrew）<br>ca 加泰罗尼亚语（Catalan）<br>nn 尼诺斯克语（Nynorsk）<br>af 阿非利卡语（Afrikaans）<br>fa 波斯语（Persian）<br>sl 斯洛文尼亚语（Slovenian）</p>
     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get <p>输出相关参数</p> 
     * @return Output <p>输出相关参数</p>
     */
    public SyncDubbingOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set <p>输出相关参数</p>
     * @param Output <p>输出相关参数</p>
     */
    public void setOutput(SyncDubbingOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get <p>扩展参数，json字符串</p><p><strong>synExt</strong> Object 语音合成扩展参数<br>   <strong>duration</strong> Float 合成音频时长（单位秒），默认不控制时长。示例：5.2<br>   <strong>format</strong> String 输出音频格式，默认wav，支持wav、mp3<br>   <strong>sampleRate</strong> Integer 合成音频采样率，默认16000，支持[8000,16000,22050,24000,32000,44100]</p> 
     * @return ExtParam <p>扩展参数，json字符串</p><p><strong>synExt</strong> Object 语音合成扩展参数<br>   <strong>duration</strong> Float 合成音频时长（单位秒），默认不控制时长。示例：5.2<br>   <strong>format</strong> String 输出音频格式，默认wav，支持wav、mp3<br>   <strong>sampleRate</strong> Integer 合成音频采样率，默认16000，支持[8000,16000,22050,24000,32000,44100]</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>扩展参数，json字符串</p><p><strong>synExt</strong> Object 语音合成扩展参数<br>   <strong>duration</strong> Float 合成音频时长（单位秒），默认不控制时长。示例：5.2<br>   <strong>format</strong> String 输出音频格式，默认wav，支持wav、mp3<br>   <strong>sampleRate</strong> Integer 合成音频采样率，默认16000，支持[8000,16000,22050,24000,32000,44100]</p>
     * @param ExtParam <p>扩展参数，json字符串</p><p><strong>synExt</strong> Object 语音合成扩展参数<br>   <strong>duration</strong> Float 合成音频时长（单位秒），默认不控制时长。示例：5.2<br>   <strong>format</strong> String 输出音频格式，默认wav，支持wav、mp3<br>   <strong>sampleRate</strong> Integer 合成音频采样率，默认16000，支持[8000,16000,22050,24000,32000,44100]</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public TextToSpeechRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechRequest(TextToSpeechRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.Output != null) {
            this.Output = new SyncDubbingOutputOption(source.Output);
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
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

