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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToSpeechRequest extends AbstractModel {

    /**
    * <p>需要转语音的文字内容，最大支持2000字符</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>文本转语音的声音配置</p>
    */
    @SerializedName("Voice")
    @Expose
    private Voice Voice;

    /**
    * <p>TRTC的SdkAppId</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>文本转语音的输出音频的格式</p>
    */
    @SerializedName("AudioFormat")
    @Expose
    private AudioFormat AudioFormat;

    /**
    * <p>TTS的API密钥</p>
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>需要合成的语言，默认为空，表示自动识别</p><p>flow_02_turbo支持以下语言：</p><ul><li>zh：中文</li><li>en：英文</li><li>ja：日语</li><li>ko：韩语</li><li>yue：粤语</li><li>ms：马来语</li><li>ar：阿拉伯语</li><li>id：印尼语</li><li>th：泰语</li><li>vi：越南语</li></ul><p>flow_01_ex支持以下语言：</p><ul><li>zh：中文（简体） (Chinese Simplified)</li><li>zh-tw：中文（繁体） (Chinese Traditional)</li><li>en：英语 (English)</li><li>ja：日语 (Japanese)</li><li>ko：韩语 (Korean)</li><li>ms：马来语 (Malay)</li><li>yue：粤语 (Cantonese)</li><li>ar：阿拉伯语 (Arabic)</li><li>ru：俄语 (Russian)</li><li>es：西班牙语 (Spanish)</li><li>fr：法语 (French)</li><li>pt：葡萄牙语 (Portuguese)</li><li>de：德语 (German)</li><li>tr：土耳其语 (Turkish)</li><li>nl：荷兰语 (Dutch)</li><li>uk：乌克兰语 (Ukrainian)</li><li>vi：越南语 (Vietnamese)</li><li>id：印尼语 (Indonesian)</li><li>it：意大利语 (Italian)</li><li>th：泰语 (Thai)</li><li>pl：波兰语 (Polish)</li><li>ro：罗马尼亚语 (Romanian)</li><li>el：希腊语 (Greek)</li><li>cs：捷克语 (Czech)</li><li>fi：芬兰语 (Finnish)</li><li>hi：印地语 (Hindi)</li><li>bg：保加利亚语 (Bulgarian)</li><li>da：丹麦语 (Danish)</li><li>he：希伯来语 (Hebrew)</li><li>fa：波斯语（法尔西语） (Persian)</li><li>sk：斯洛伐克语 (Slovak)</li><li>sv：瑞典语 (Swedish)</li><li>hr：克罗地亚语 (Croatian)</li><li>tl：菲律宾语（他加禄语） (Filipino)</li><li>hu：匈牙利语 (Hungarian)</li><li>no：挪威语 (Norwegian)</li><li>sl：斯洛文尼亚语 (Slovenian)</li><li>ca：加泰罗尼亚语 (Catalan)</li><li>nn：新挪威语 (Nynorsk)</li><li>ta：泰米尔语 (Tamil)</li><li>af：南非荷兰语 (Afrikaans)</li></ul>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
    */
    @SerializedName("PronunciationDict")
    @Expose
    private PronunciationDict [] PronunciationDict;

    /**
    * <p>字幕级别</p><p>枚举值：</p><ul><li>0： 无字幕</li><li>1： 句子级别字幕</li><li>2： 词级别字幕，目前只有flow_01_ex支持词级别字幕</li></ul><p>默认值：0</p>
    */
    @SerializedName("AlignmentMode")
    @Expose
    private Long AlignmentMode;

    /**
    * <p>json字符串，用于拓展用法</p>
    */
    @SerializedName("ExtraParams")
    @Expose
    private String ExtraParams;

    /**
     * Get <p>需要转语音的文字内容，最大支持2000字符</p> 
     * @return Text <p>需要转语音的文字内容，最大支持2000字符</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>需要转语音的文字内容，最大支持2000字符</p>
     * @param Text <p>需要转语音的文字内容，最大支持2000字符</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>文本转语音的声音配置</p> 
     * @return Voice <p>文本转语音的声音配置</p>
     */
    public Voice getVoice() {
        return this.Voice;
    }

    /**
     * Set <p>文本转语音的声音配置</p>
     * @param Voice <p>文本转语音的声音配置</p>
     */
    public void setVoice(Voice Voice) {
        this.Voice = Voice;
    }

    /**
     * Get <p>TRTC的SdkAppId</p> 
     * @return SdkAppId <p>TRTC的SdkAppId</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的SdkAppId</p>
     * @param SdkAppId <p>TRTC的SdkAppId</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>文本转语音的输出音频的格式</p> 
     * @return AudioFormat <p>文本转语音的输出音频的格式</p>
     */
    public AudioFormat getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set <p>文本转语音的输出音频的格式</p>
     * @param AudioFormat <p>文本转语音的输出音频的格式</p>
     */
    public void setAudioFormat(AudioFormat AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get <p>TTS的API密钥</p> 
     * @return APIKey <p>TTS的API密钥</p>
     * @deprecated
     */
    @Deprecated
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set <p>TTS的API密钥</p>
     * @param APIKey <p>TTS的API密钥</p>
     * @deprecated
     */
    @Deprecated
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul> 
     * @return Model <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
     * @param Model <p>TTS的模型，支持flow_02_turbo，flow_01_ex，默认为flow_02_turbo</p><p>枚举值：</p><ul><li>flow_02_turbo： 高性价比模型，兼顾效果和成本</li><li>flow_01_ex： 高天花板模型，能力全面，在音色克隆上表现更优</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>需要合成的语言，默认为空，表示自动识别</p><p>flow_02_turbo支持以下语言：</p><ul><li>zh：中文</li><li>en：英文</li><li>ja：日语</li><li>ko：韩语</li><li>yue：粤语</li><li>ms：马来语</li><li>ar：阿拉伯语</li><li>id：印尼语</li><li>th：泰语</li><li>vi：越南语</li></ul><p>flow_01_ex支持以下语言：</p><ul><li>zh：中文（简体） (Chinese Simplified)</li><li>zh-tw：中文（繁体） (Chinese Traditional)</li><li>en：英语 (English)</li><li>ja：日语 (Japanese)</li><li>ko：韩语 (Korean)</li><li>ms：马来语 (Malay)</li><li>yue：粤语 (Cantonese)</li><li>ar：阿拉伯语 (Arabic)</li><li>ru：俄语 (Russian)</li><li>es：西班牙语 (Spanish)</li><li>fr：法语 (French)</li><li>pt：葡萄牙语 (Portuguese)</li><li>de：德语 (German)</li><li>tr：土耳其语 (Turkish)</li><li>nl：荷兰语 (Dutch)</li><li>uk：乌克兰语 (Ukrainian)</li><li>vi：越南语 (Vietnamese)</li><li>id：印尼语 (Indonesian)</li><li>it：意大利语 (Italian)</li><li>th：泰语 (Thai)</li><li>pl：波兰语 (Polish)</li><li>ro：罗马尼亚语 (Romanian)</li><li>el：希腊语 (Greek)</li><li>cs：捷克语 (Czech)</li><li>fi：芬兰语 (Finnish)</li><li>hi：印地语 (Hindi)</li><li>bg：保加利亚语 (Bulgarian)</li><li>da：丹麦语 (Danish)</li><li>he：希伯来语 (Hebrew)</li><li>fa：波斯语（法尔西语） (Persian)</li><li>sk：斯洛伐克语 (Slovak)</li><li>sv：瑞典语 (Swedish)</li><li>hr：克罗地亚语 (Croatian)</li><li>tl：菲律宾语（他加禄语） (Filipino)</li><li>hu：匈牙利语 (Hungarian)</li><li>no：挪威语 (Norwegian)</li><li>sl：斯洛文尼亚语 (Slovenian)</li><li>ca：加泰罗尼亚语 (Catalan)</li><li>nn：新挪威语 (Nynorsk)</li><li>ta：泰米尔语 (Tamil)</li><li>af：南非荷兰语 (Afrikaans)</li></ul> 
     * @return Language <p>需要合成的语言，默认为空，表示自动识别</p><p>flow_02_turbo支持以下语言：</p><ul><li>zh：中文</li><li>en：英文</li><li>ja：日语</li><li>ko：韩语</li><li>yue：粤语</li><li>ms：马来语</li><li>ar：阿拉伯语</li><li>id：印尼语</li><li>th：泰语</li><li>vi：越南语</li></ul><p>flow_01_ex支持以下语言：</p><ul><li>zh：中文（简体） (Chinese Simplified)</li><li>zh-tw：中文（繁体） (Chinese Traditional)</li><li>en：英语 (English)</li><li>ja：日语 (Japanese)</li><li>ko：韩语 (Korean)</li><li>ms：马来语 (Malay)</li><li>yue：粤语 (Cantonese)</li><li>ar：阿拉伯语 (Arabic)</li><li>ru：俄语 (Russian)</li><li>es：西班牙语 (Spanish)</li><li>fr：法语 (French)</li><li>pt：葡萄牙语 (Portuguese)</li><li>de：德语 (German)</li><li>tr：土耳其语 (Turkish)</li><li>nl：荷兰语 (Dutch)</li><li>uk：乌克兰语 (Ukrainian)</li><li>vi：越南语 (Vietnamese)</li><li>id：印尼语 (Indonesian)</li><li>it：意大利语 (Italian)</li><li>th：泰语 (Thai)</li><li>pl：波兰语 (Polish)</li><li>ro：罗马尼亚语 (Romanian)</li><li>el：希腊语 (Greek)</li><li>cs：捷克语 (Czech)</li><li>fi：芬兰语 (Finnish)</li><li>hi：印地语 (Hindi)</li><li>bg：保加利亚语 (Bulgarian)</li><li>da：丹麦语 (Danish)</li><li>he：希伯来语 (Hebrew)</li><li>fa：波斯语（法尔西语） (Persian)</li><li>sk：斯洛伐克语 (Slovak)</li><li>sv：瑞典语 (Swedish)</li><li>hr：克罗地亚语 (Croatian)</li><li>tl：菲律宾语（他加禄语） (Filipino)</li><li>hu：匈牙利语 (Hungarian)</li><li>no：挪威语 (Norwegian)</li><li>sl：斯洛文尼亚语 (Slovenian)</li><li>ca：加泰罗尼亚语 (Catalan)</li><li>nn：新挪威语 (Nynorsk)</li><li>ta：泰米尔语 (Tamil)</li><li>af：南非荷兰语 (Afrikaans)</li></ul>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>需要合成的语言，默认为空，表示自动识别</p><p>flow_02_turbo支持以下语言：</p><ul><li>zh：中文</li><li>en：英文</li><li>ja：日语</li><li>ko：韩语</li><li>yue：粤语</li><li>ms：马来语</li><li>ar：阿拉伯语</li><li>id：印尼语</li><li>th：泰语</li><li>vi：越南语</li></ul><p>flow_01_ex支持以下语言：</p><ul><li>zh：中文（简体） (Chinese Simplified)</li><li>zh-tw：中文（繁体） (Chinese Traditional)</li><li>en：英语 (English)</li><li>ja：日语 (Japanese)</li><li>ko：韩语 (Korean)</li><li>ms：马来语 (Malay)</li><li>yue：粤语 (Cantonese)</li><li>ar：阿拉伯语 (Arabic)</li><li>ru：俄语 (Russian)</li><li>es：西班牙语 (Spanish)</li><li>fr：法语 (French)</li><li>pt：葡萄牙语 (Portuguese)</li><li>de：德语 (German)</li><li>tr：土耳其语 (Turkish)</li><li>nl：荷兰语 (Dutch)</li><li>uk：乌克兰语 (Ukrainian)</li><li>vi：越南语 (Vietnamese)</li><li>id：印尼语 (Indonesian)</li><li>it：意大利语 (Italian)</li><li>th：泰语 (Thai)</li><li>pl：波兰语 (Polish)</li><li>ro：罗马尼亚语 (Romanian)</li><li>el：希腊语 (Greek)</li><li>cs：捷克语 (Czech)</li><li>fi：芬兰语 (Finnish)</li><li>hi：印地语 (Hindi)</li><li>bg：保加利亚语 (Bulgarian)</li><li>da：丹麦语 (Danish)</li><li>he：希伯来语 (Hebrew)</li><li>fa：波斯语（法尔西语） (Persian)</li><li>sk：斯洛伐克语 (Slovak)</li><li>sv：瑞典语 (Swedish)</li><li>hr：克罗地亚语 (Croatian)</li><li>tl：菲律宾语（他加禄语） (Filipino)</li><li>hu：匈牙利语 (Hungarian)</li><li>no：挪威语 (Norwegian)</li><li>sl：斯洛文尼亚语 (Slovenian)</li><li>ca：加泰罗尼亚语 (Catalan)</li><li>nn：新挪威语 (Nynorsk)</li><li>ta：泰米尔语 (Tamil)</li><li>af：南非荷兰语 (Afrikaans)</li></ul>
     * @param Language <p>需要合成的语言，默认为空，表示自动识别</p><p>flow_02_turbo支持以下语言：</p><ul><li>zh：中文</li><li>en：英文</li><li>ja：日语</li><li>ko：韩语</li><li>yue：粤语</li><li>ms：马来语</li><li>ar：阿拉伯语</li><li>id：印尼语</li><li>th：泰语</li><li>vi：越南语</li></ul><p>flow_01_ex支持以下语言：</p><ul><li>zh：中文（简体） (Chinese Simplified)</li><li>zh-tw：中文（繁体） (Chinese Traditional)</li><li>en：英语 (English)</li><li>ja：日语 (Japanese)</li><li>ko：韩语 (Korean)</li><li>ms：马来语 (Malay)</li><li>yue：粤语 (Cantonese)</li><li>ar：阿拉伯语 (Arabic)</li><li>ru：俄语 (Russian)</li><li>es：西班牙语 (Spanish)</li><li>fr：法语 (French)</li><li>pt：葡萄牙语 (Portuguese)</li><li>de：德语 (German)</li><li>tr：土耳其语 (Turkish)</li><li>nl：荷兰语 (Dutch)</li><li>uk：乌克兰语 (Ukrainian)</li><li>vi：越南语 (Vietnamese)</li><li>id：印尼语 (Indonesian)</li><li>it：意大利语 (Italian)</li><li>th：泰语 (Thai)</li><li>pl：波兰语 (Polish)</li><li>ro：罗马尼亚语 (Romanian)</li><li>el：希腊语 (Greek)</li><li>cs：捷克语 (Czech)</li><li>fi：芬兰语 (Finnish)</li><li>hi：印地语 (Hindi)</li><li>bg：保加利亚语 (Bulgarian)</li><li>da：丹麦语 (Danish)</li><li>he：希伯来语 (Hebrew)</li><li>fa：波斯语（法尔西语） (Persian)</li><li>sk：斯洛伐克语 (Slovak)</li><li>sv：瑞典语 (Swedish)</li><li>hr：克罗地亚语 (Croatian)</li><li>tl：菲律宾语（他加禄语） (Filipino)</li><li>hu：匈牙利语 (Hungarian)</li><li>no：挪威语 (Norwegian)</li><li>sl：斯洛文尼亚语 (Slovenian)</li><li>ca：加泰罗尼亚语 (Catalan)</li><li>nn：新挪威语 (Nynorsk)</li><li>ta：泰米尔语 (Tamil)</li><li>af：南非荷兰语 (Afrikaans)</li></ul>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p> 
     * @return PronunciationDict <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
     */
    public PronunciationDict [] getPronunciationDict() {
        return this.PronunciationDict;
    }

    /**
     * Set <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
     * @param PronunciationDict <p>多音字/生僻字发音纠正词典条目。指定特定词语在本次请求中使用的发音。</p>
     */
    public void setPronunciationDict(PronunciationDict [] PronunciationDict) {
        this.PronunciationDict = PronunciationDict;
    }

    /**
     * Get <p>字幕级别</p><p>枚举值：</p><ul><li>0： 无字幕</li><li>1： 句子级别字幕</li><li>2： 词级别字幕，目前只有flow_01_ex支持词级别字幕</li></ul><p>默认值：0</p> 
     * @return AlignmentMode <p>字幕级别</p><p>枚举值：</p><ul><li>0： 无字幕</li><li>1： 句子级别字幕</li><li>2： 词级别字幕，目前只有flow_01_ex支持词级别字幕</li></ul><p>默认值：0</p>
     */
    public Long getAlignmentMode() {
        return this.AlignmentMode;
    }

    /**
     * Set <p>字幕级别</p><p>枚举值：</p><ul><li>0： 无字幕</li><li>1： 句子级别字幕</li><li>2： 词级别字幕，目前只有flow_01_ex支持词级别字幕</li></ul><p>默认值：0</p>
     * @param AlignmentMode <p>字幕级别</p><p>枚举值：</p><ul><li>0： 无字幕</li><li>1： 句子级别字幕</li><li>2： 词级别字幕，目前只有flow_01_ex支持词级别字幕</li></ul><p>默认值：0</p>
     */
    public void setAlignmentMode(Long AlignmentMode) {
        this.AlignmentMode = AlignmentMode;
    }

    /**
     * Get <p>json字符串，用于拓展用法</p> 
     * @return ExtraParams <p>json字符串，用于拓展用法</p>
     */
    public String getExtraParams() {
        return this.ExtraParams;
    }

    /**
     * Set <p>json字符串，用于拓展用法</p>
     * @param ExtraParams <p>json字符串，用于拓展用法</p>
     */
    public void setExtraParams(String ExtraParams) {
        this.ExtraParams = ExtraParams;
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
        if (source.Voice != null) {
            this.Voice = new Voice(source.Voice);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new AudioFormat(source.AudioFormat);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.PronunciationDict != null) {
            this.PronunciationDict = new PronunciationDict[source.PronunciationDict.length];
            for (int i = 0; i < source.PronunciationDict.length; i++) {
                this.PronunciationDict[i] = new PronunciationDict(source.PronunciationDict[i]);
            }
        }
        if (source.AlignmentMode != null) {
            this.AlignmentMode = new Long(source.AlignmentMode);
        }
        if (source.ExtraParams != null) {
            this.ExtraParams = new String(source.ExtraParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamObj(map, prefix + "AudioFormat.", this.AudioFormat);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamArrayObj(map, prefix + "PronunciationDict.", this.PronunciationDict);
        this.setParamSimple(map, prefix + "AlignmentMode", this.AlignmentMode);
        this.setParamSimple(map, prefix + "ExtraParams", this.ExtraParams);

    }
}

