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

public class STTConfig extends AbstractModel {

    /**
    * <p>语音转文字支持识别的语言，默认是&quot;zh&quot; 中文</p><p>可通过购买「AI智能识别时长包」解锁或领取包月套餐体验版解锁不同语言. 详细说明参考：<a href="https://cloud.tencent.com/document/product/647/111976">AI智能识别计费说明</a></p><p>语音转文本不同套餐版本支持的语言如下：</p><p><strong>基础语言引擎</strong>：</p><ul><li> "zh": 中文（简体）</li><li>"zh-TW": 中文（繁体）</li><li>"en": 英语</li><li>"16k_zh_edu"：中文教育</li><li>"16k_zh_medical"：中文医疗</li><li>"16k_zh_court"：中文法庭</li></ul><p><strong>标准语言引擎：</strong></p><ul><li> "8k_zh_large": 普方大模型引擎. 当前模型同时支持中文等语言的识别，模型参数量极大，语言模型性能增强，针对电话音频中各类场景、各类中文方言的识别准确率极大提升.</li><li> "16k_zh_large": 普方英大模型引擎. 当前模型同时支持中文、英文、多种中文方言等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li><li> "16k_multi_lang": 多语种大模型引擎. 当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别).</li><li> "16k_zh_en": 中英大模型引擎. 当前模型同时支持中文、英语识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li></ul><p><strong>高级语言引擎：</strong></p><ul><li>"zh-dialect": 中国方言</li><li>"zh-yue": 中国粤语</li><li>"vi": 越南语</li><li>"ja": 日语</li><li>"ko": 韩语</li><li>"id": 印度尼西亚语</li><li>"th": 泰语</li><li>"pt": 葡萄牙语</li><li>"tr": 土耳其语</li><li>"ar": 阿拉伯语</li><li>"es": 西班牙语</li><li>"hi": 印地语</li><li>"fr": 法语</li><li>"ms": 马来语</li><li>"fil": 菲律宾语</li><li>"de": 德语</li><li>"it": 意大利语</li><li>"ru": 俄语</li><li>"sv": 瑞典语</li><li>"da": 丹麦语</li><li>"no": 挪威语</li><li>"pl": 波兰语</li><li>"uz": 乌兹别克语</li><li>"hu": 匈牙利语</li><li>"he": 希伯来语</li><li>"ur": 乌尔都语</li><li>"af-ZA": 南非荷兰语</li><li>"nl-BE": 比利时荷兰语</li><li>"nl-NL": 荷兰语(本土)</li></ul><p><strong>bigmodel全新大模型语音识别引擎</strong></p><ul><li>"bigmodel_auto": 多语言自动识别</li><li>"bigmodel_zh": 中文</li><li>"bigmodel_en": 英语</li><li>"bigmodel_yue": 粤语</li><li>"bigmodel_ar": 阿拉伯语</li><li>"bigmodel_de": 德语</li><li>"bigmodel_fr": 法语</li><li>"bigmodel_es": 西班牙</li><li>"bigmodel_pt": 葡萄牙语</li><li>"bigmodel_id": 印尼语</li><li>"bigmodel_it": 意大利语</li><li>"bigmodel_ko": 韩语</li><li>"bigmodel_ru": 俄语</li><li>"bigmodel_th": 泰语</li><li>"bigmodel_vi": 越南语</li><li>"bigmodel_tr": 土耳其语</li><li>"bigmodel_hi": 印地语</li><li>"bigmodel_ms": 马来语</li><li>"bigmodel_pl": 波兰语</li><li>"bigmodel_cs": 捷克语</li><li>"bigmodel_fil": 菲律宾语</li><li>"bigmodel_fa": 波斯语</li><li>"bigmodel_el": 希腊语</li><li>"bigmodel_ro": 罗马尼亚语</li><li>"bigmodel_hu": 匈牙利语</li><li>"bigmodel_mk": 马其顿语</li></ul><p><strong>注意：</strong><br>如果缺少满足您需求的语言，请联系我们技术人员。</p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p><strong>发起模糊识别为高级版能力,默认按照高级版收费</strong><br>注意：不支持填写&quot;zh-dialect&quot;, &quot;16k_zh_edu&quot;, &quot;16k_zh_medical&quot;, &quot;16k_zh_court&quot;, &quot;8k_zh_large&quot;, &quot;16k_zh_large&quot;,&quot;16k_multi_lang&quot;, &quot;16k_zh_en&quot;</p>
    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * <p>自定义参数，联系后台使用</p>
    */
    @SerializedName("CustomParam")
    @Expose
    private String CustomParam;

    /**
    * <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * <p>热词表：该参数用于提升识别准确率。 单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或 “ASR|11”； 热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p>
    */
    @SerializedName("HotWordList")
    @Expose
    private String HotWordList;

    /**
    * <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 5]，默认为0，表示不开启远场人声抑制能力。推荐设置为2，有较好的远场人声抑制能力。嘈杂的办公室环境下可以设置为3，更为嘈杂的环境下可以使用4和5。注意较高的VadLevel可能会将单字当作噪声给过滤。</p>
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
     * Get <p>语音转文字支持识别的语言，默认是&quot;zh&quot; 中文</p><p>可通过购买「AI智能识别时长包」解锁或领取包月套餐体验版解锁不同语言. 详细说明参考：<a href="https://cloud.tencent.com/document/product/647/111976">AI智能识别计费说明</a></p><p>语音转文本不同套餐版本支持的语言如下：</p><p><strong>基础语言引擎</strong>：</p><ul><li> "zh": 中文（简体）</li><li>"zh-TW": 中文（繁体）</li><li>"en": 英语</li><li>"16k_zh_edu"：中文教育</li><li>"16k_zh_medical"：中文医疗</li><li>"16k_zh_court"：中文法庭</li></ul><p><strong>标准语言引擎：</strong></p><ul><li> "8k_zh_large": 普方大模型引擎. 当前模型同时支持中文等语言的识别，模型参数量极大，语言模型性能增强，针对电话音频中各类场景、各类中文方言的识别准确率极大提升.</li><li> "16k_zh_large": 普方英大模型引擎. 当前模型同时支持中文、英文、多种中文方言等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li><li> "16k_multi_lang": 多语种大模型引擎. 当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别).</li><li> "16k_zh_en": 中英大模型引擎. 当前模型同时支持中文、英语识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li></ul><p><strong>高级语言引擎：</strong></p><ul><li>"zh-dialect": 中国方言</li><li>"zh-yue": 中国粤语</li><li>"vi": 越南语</li><li>"ja": 日语</li><li>"ko": 韩语</li><li>"id": 印度尼西亚语</li><li>"th": 泰语</li><li>"pt": 葡萄牙语</li><li>"tr": 土耳其语</li><li>"ar": 阿拉伯语</li><li>"es": 西班牙语</li><li>"hi": 印地语</li><li>"fr": 法语</li><li>"ms": 马来语</li><li>"fil": 菲律宾语</li><li>"de": 德语</li><li>"it": 意大利语</li><li>"ru": 俄语</li><li>"sv": 瑞典语</li><li>"da": 丹麦语</li><li>"no": 挪威语</li><li>"pl": 波兰语</li><li>"uz": 乌兹别克语</li><li>"hu": 匈牙利语</li><li>"he": 希伯来语</li><li>"ur": 乌尔都语</li><li>"af-ZA": 南非荷兰语</li><li>"nl-BE": 比利时荷兰语</li><li>"nl-NL": 荷兰语(本土)</li></ul><p><strong>bigmodel全新大模型语音识别引擎</strong></p><ul><li>"bigmodel_auto": 多语言自动识别</li><li>"bigmodel_zh": 中文</li><li>"bigmodel_en": 英语</li><li>"bigmodel_yue": 粤语</li><li>"bigmodel_ar": 阿拉伯语</li><li>"bigmodel_de": 德语</li><li>"bigmodel_fr": 法语</li><li>"bigmodel_es": 西班牙</li><li>"bigmodel_pt": 葡萄牙语</li><li>"bigmodel_id": 印尼语</li><li>"bigmodel_it": 意大利语</li><li>"bigmodel_ko": 韩语</li><li>"bigmodel_ru": 俄语</li><li>"bigmodel_th": 泰语</li><li>"bigmodel_vi": 越南语</li><li>"bigmodel_tr": 土耳其语</li><li>"bigmodel_hi": 印地语</li><li>"bigmodel_ms": 马来语</li><li>"bigmodel_pl": 波兰语</li><li>"bigmodel_cs": 捷克语</li><li>"bigmodel_fil": 菲律宾语</li><li>"bigmodel_fa": 波斯语</li><li>"bigmodel_el": 希腊语</li><li>"bigmodel_ro": 罗马尼亚语</li><li>"bigmodel_hu": 匈牙利语</li><li>"bigmodel_mk": 马其顿语</li></ul><p><strong>注意：</strong><br>如果缺少满足您需求的语言，请联系我们技术人员。</p> 
     * @return Language <p>语音转文字支持识别的语言，默认是&quot;zh&quot; 中文</p><p>可通过购买「AI智能识别时长包」解锁或领取包月套餐体验版解锁不同语言. 详细说明参考：<a href="https://cloud.tencent.com/document/product/647/111976">AI智能识别计费说明</a></p><p>语音转文本不同套餐版本支持的语言如下：</p><p><strong>基础语言引擎</strong>：</p><ul><li> "zh": 中文（简体）</li><li>"zh-TW": 中文（繁体）</li><li>"en": 英语</li><li>"16k_zh_edu"：中文教育</li><li>"16k_zh_medical"：中文医疗</li><li>"16k_zh_court"：中文法庭</li></ul><p><strong>标准语言引擎：</strong></p><ul><li> "8k_zh_large": 普方大模型引擎. 当前模型同时支持中文等语言的识别，模型参数量极大，语言模型性能增强，针对电话音频中各类场景、各类中文方言的识别准确率极大提升.</li><li> "16k_zh_large": 普方英大模型引擎. 当前模型同时支持中文、英文、多种中文方言等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li><li> "16k_multi_lang": 多语种大模型引擎. 当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别).</li><li> "16k_zh_en": 中英大模型引擎. 当前模型同时支持中文、英语识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li></ul><p><strong>高级语言引擎：</strong></p><ul><li>"zh-dialect": 中国方言</li><li>"zh-yue": 中国粤语</li><li>"vi": 越南语</li><li>"ja": 日语</li><li>"ko": 韩语</li><li>"id": 印度尼西亚语</li><li>"th": 泰语</li><li>"pt": 葡萄牙语</li><li>"tr": 土耳其语</li><li>"ar": 阿拉伯语</li><li>"es": 西班牙语</li><li>"hi": 印地语</li><li>"fr": 法语</li><li>"ms": 马来语</li><li>"fil": 菲律宾语</li><li>"de": 德语</li><li>"it": 意大利语</li><li>"ru": 俄语</li><li>"sv": 瑞典语</li><li>"da": 丹麦语</li><li>"no": 挪威语</li><li>"pl": 波兰语</li><li>"uz": 乌兹别克语</li><li>"hu": 匈牙利语</li><li>"he": 希伯来语</li><li>"ur": 乌尔都语</li><li>"af-ZA": 南非荷兰语</li><li>"nl-BE": 比利时荷兰语</li><li>"nl-NL": 荷兰语(本土)</li></ul><p><strong>bigmodel全新大模型语音识别引擎</strong></p><ul><li>"bigmodel_auto": 多语言自动识别</li><li>"bigmodel_zh": 中文</li><li>"bigmodel_en": 英语</li><li>"bigmodel_yue": 粤语</li><li>"bigmodel_ar": 阿拉伯语</li><li>"bigmodel_de": 德语</li><li>"bigmodel_fr": 法语</li><li>"bigmodel_es": 西班牙</li><li>"bigmodel_pt": 葡萄牙语</li><li>"bigmodel_id": 印尼语</li><li>"bigmodel_it": 意大利语</li><li>"bigmodel_ko": 韩语</li><li>"bigmodel_ru": 俄语</li><li>"bigmodel_th": 泰语</li><li>"bigmodel_vi": 越南语</li><li>"bigmodel_tr": 土耳其语</li><li>"bigmodel_hi": 印地语</li><li>"bigmodel_ms": 马来语</li><li>"bigmodel_pl": 波兰语</li><li>"bigmodel_cs": 捷克语</li><li>"bigmodel_fil": 菲律宾语</li><li>"bigmodel_fa": 波斯语</li><li>"bigmodel_el": 希腊语</li><li>"bigmodel_ro": 罗马尼亚语</li><li>"bigmodel_hu": 匈牙利语</li><li>"bigmodel_mk": 马其顿语</li></ul><p><strong>注意：</strong><br>如果缺少满足您需求的语言，请联系我们技术人员。</p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>语音转文字支持识别的语言，默认是&quot;zh&quot; 中文</p><p>可通过购买「AI智能识别时长包」解锁或领取包月套餐体验版解锁不同语言. 详细说明参考：<a href="https://cloud.tencent.com/document/product/647/111976">AI智能识别计费说明</a></p><p>语音转文本不同套餐版本支持的语言如下：</p><p><strong>基础语言引擎</strong>：</p><ul><li> "zh": 中文（简体）</li><li>"zh-TW": 中文（繁体）</li><li>"en": 英语</li><li>"16k_zh_edu"：中文教育</li><li>"16k_zh_medical"：中文医疗</li><li>"16k_zh_court"：中文法庭</li></ul><p><strong>标准语言引擎：</strong></p><ul><li> "8k_zh_large": 普方大模型引擎. 当前模型同时支持中文等语言的识别，模型参数量极大，语言模型性能增强，针对电话音频中各类场景、各类中文方言的识别准确率极大提升.</li><li> "16k_zh_large": 普方英大模型引擎. 当前模型同时支持中文、英文、多种中文方言等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li><li> "16k_multi_lang": 多语种大模型引擎. 当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别).</li><li> "16k_zh_en": 中英大模型引擎. 当前模型同时支持中文、英语识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li></ul><p><strong>高级语言引擎：</strong></p><ul><li>"zh-dialect": 中国方言</li><li>"zh-yue": 中国粤语</li><li>"vi": 越南语</li><li>"ja": 日语</li><li>"ko": 韩语</li><li>"id": 印度尼西亚语</li><li>"th": 泰语</li><li>"pt": 葡萄牙语</li><li>"tr": 土耳其语</li><li>"ar": 阿拉伯语</li><li>"es": 西班牙语</li><li>"hi": 印地语</li><li>"fr": 法语</li><li>"ms": 马来语</li><li>"fil": 菲律宾语</li><li>"de": 德语</li><li>"it": 意大利语</li><li>"ru": 俄语</li><li>"sv": 瑞典语</li><li>"da": 丹麦语</li><li>"no": 挪威语</li><li>"pl": 波兰语</li><li>"uz": 乌兹别克语</li><li>"hu": 匈牙利语</li><li>"he": 希伯来语</li><li>"ur": 乌尔都语</li><li>"af-ZA": 南非荷兰语</li><li>"nl-BE": 比利时荷兰语</li><li>"nl-NL": 荷兰语(本土)</li></ul><p><strong>bigmodel全新大模型语音识别引擎</strong></p><ul><li>"bigmodel_auto": 多语言自动识别</li><li>"bigmodel_zh": 中文</li><li>"bigmodel_en": 英语</li><li>"bigmodel_yue": 粤语</li><li>"bigmodel_ar": 阿拉伯语</li><li>"bigmodel_de": 德语</li><li>"bigmodel_fr": 法语</li><li>"bigmodel_es": 西班牙</li><li>"bigmodel_pt": 葡萄牙语</li><li>"bigmodel_id": 印尼语</li><li>"bigmodel_it": 意大利语</li><li>"bigmodel_ko": 韩语</li><li>"bigmodel_ru": 俄语</li><li>"bigmodel_th": 泰语</li><li>"bigmodel_vi": 越南语</li><li>"bigmodel_tr": 土耳其语</li><li>"bigmodel_hi": 印地语</li><li>"bigmodel_ms": 马来语</li><li>"bigmodel_pl": 波兰语</li><li>"bigmodel_cs": 捷克语</li><li>"bigmodel_fil": 菲律宾语</li><li>"bigmodel_fa": 波斯语</li><li>"bigmodel_el": 希腊语</li><li>"bigmodel_ro": 罗马尼亚语</li><li>"bigmodel_hu": 匈牙利语</li><li>"bigmodel_mk": 马其顿语</li></ul><p><strong>注意：</strong><br>如果缺少满足您需求的语言，请联系我们技术人员。</p>
     * @param Language <p>语音转文字支持识别的语言，默认是&quot;zh&quot; 中文</p><p>可通过购买「AI智能识别时长包」解锁或领取包月套餐体验版解锁不同语言. 详细说明参考：<a href="https://cloud.tencent.com/document/product/647/111976">AI智能识别计费说明</a></p><p>语音转文本不同套餐版本支持的语言如下：</p><p><strong>基础语言引擎</strong>：</p><ul><li> "zh": 中文（简体）</li><li>"zh-TW": 中文（繁体）</li><li>"en": 英语</li><li>"16k_zh_edu"：中文教育</li><li>"16k_zh_medical"：中文医疗</li><li>"16k_zh_court"：中文法庭</li></ul><p><strong>标准语言引擎：</strong></p><ul><li> "8k_zh_large": 普方大模型引擎. 当前模型同时支持中文等语言的识别，模型参数量极大，语言模型性能增强，针对电话音频中各类场景、各类中文方言的识别准确率极大提升.</li><li> "16k_zh_large": 普方英大模型引擎. 当前模型同时支持中文、英文、多种中文方言等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li><li> "16k_multi_lang": 多语种大模型引擎. 当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别).</li><li> "16k_zh_en": 中英大模型引擎. 当前模型同时支持中文、英语识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升.</li></ul><p><strong>高级语言引擎：</strong></p><ul><li>"zh-dialect": 中国方言</li><li>"zh-yue": 中国粤语</li><li>"vi": 越南语</li><li>"ja": 日语</li><li>"ko": 韩语</li><li>"id": 印度尼西亚语</li><li>"th": 泰语</li><li>"pt": 葡萄牙语</li><li>"tr": 土耳其语</li><li>"ar": 阿拉伯语</li><li>"es": 西班牙语</li><li>"hi": 印地语</li><li>"fr": 法语</li><li>"ms": 马来语</li><li>"fil": 菲律宾语</li><li>"de": 德语</li><li>"it": 意大利语</li><li>"ru": 俄语</li><li>"sv": 瑞典语</li><li>"da": 丹麦语</li><li>"no": 挪威语</li><li>"pl": 波兰语</li><li>"uz": 乌兹别克语</li><li>"hu": 匈牙利语</li><li>"he": 希伯来语</li><li>"ur": 乌尔都语</li><li>"af-ZA": 南非荷兰语</li><li>"nl-BE": 比利时荷兰语</li><li>"nl-NL": 荷兰语(本土)</li></ul><p><strong>bigmodel全新大模型语音识别引擎</strong></p><ul><li>"bigmodel_auto": 多语言自动识别</li><li>"bigmodel_zh": 中文</li><li>"bigmodel_en": 英语</li><li>"bigmodel_yue": 粤语</li><li>"bigmodel_ar": 阿拉伯语</li><li>"bigmodel_de": 德语</li><li>"bigmodel_fr": 法语</li><li>"bigmodel_es": 西班牙</li><li>"bigmodel_pt": 葡萄牙语</li><li>"bigmodel_id": 印尼语</li><li>"bigmodel_it": 意大利语</li><li>"bigmodel_ko": 韩语</li><li>"bigmodel_ru": 俄语</li><li>"bigmodel_th": 泰语</li><li>"bigmodel_vi": 越南语</li><li>"bigmodel_tr": 土耳其语</li><li>"bigmodel_hi": 印地语</li><li>"bigmodel_ms": 马来语</li><li>"bigmodel_pl": 波兰语</li><li>"bigmodel_cs": 捷克语</li><li>"bigmodel_fil": 菲律宾语</li><li>"bigmodel_fa": 波斯语</li><li>"bigmodel_el": 希腊语</li><li>"bigmodel_ro": 罗马尼亚语</li><li>"bigmodel_hu": 匈牙利语</li><li>"bigmodel_mk": 马其顿语</li></ul><p><strong>注意：</strong><br>如果缺少满足您需求的语言，请联系我们技术人员。</p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p><strong>发起模糊识别为高级版能力,默认按照高级版收费</strong><br>注意：不支持填写&quot;zh-dialect&quot;, &quot;16k_zh_edu&quot;, &quot;16k_zh_medical&quot;, &quot;16k_zh_court&quot;, &quot;8k_zh_large&quot;, &quot;16k_zh_large&quot;,&quot;16k_multi_lang&quot;, &quot;16k_zh_en&quot;</p> 
     * @return AlternativeLanguage <p><strong>发起模糊识别为高级版能力,默认按照高级版收费</strong><br>注意：不支持填写&quot;zh-dialect&quot;, &quot;16k_zh_edu&quot;, &quot;16k_zh_medical&quot;, &quot;16k_zh_court&quot;, &quot;8k_zh_large&quot;, &quot;16k_zh_large&quot;,&quot;16k_multi_lang&quot;, &quot;16k_zh_en&quot;</p>
     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set <p><strong>发起模糊识别为高级版能力,默认按照高级版收费</strong><br>注意：不支持填写&quot;zh-dialect&quot;, &quot;16k_zh_edu&quot;, &quot;16k_zh_medical&quot;, &quot;16k_zh_court&quot;, &quot;8k_zh_large&quot;, &quot;16k_zh_large&quot;,&quot;16k_multi_lang&quot;, &quot;16k_zh_en&quot;</p>
     * @param AlternativeLanguage <p><strong>发起模糊识别为高级版能力,默认按照高级版收费</strong><br>注意：不支持填写&quot;zh-dialect&quot;, &quot;16k_zh_edu&quot;, &quot;16k_zh_medical&quot;, &quot;16k_zh_court&quot;, &quot;8k_zh_large&quot;, &quot;16k_zh_large&quot;,&quot;16k_multi_lang&quot;, &quot;16k_zh_en&quot;</p>
     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get <p>自定义参数，联系后台使用</p> 
     * @return CustomParam <p>自定义参数，联系后台使用</p>
     */
    public String getCustomParam() {
        return this.CustomParam;
    }

    /**
     * Set <p>自定义参数，联系后台使用</p>
     * @param CustomParam <p>自定义参数，联系后台使用</p>
     */
    public void setCustomParam(String CustomParam) {
        this.CustomParam = CustomParam;
    }

    /**
     * Get <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p> 
     * @return VadSilenceTime <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
     * @param VadSilenceTime <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get <p>热词表：该参数用于提升识别准确率。 单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或 “ASR|11”； 热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p> 
     * @return HotWordList <p>热词表：该参数用于提升识别准确率。 单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或 “ASR|11”； 热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p>
     */
    public String getHotWordList() {
        return this.HotWordList;
    }

    /**
     * Set <p>热词表：该参数用于提升识别准确率。 单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或 “ASR|11”； 热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p>
     * @param HotWordList <p>热词表：该参数用于提升识别准确率。 单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或 “ASR|11”； 热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p>
     */
    public void setHotWordList(String HotWordList) {
        this.HotWordList = HotWordList;
    }

    /**
     * Get <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 5]，默认为0，表示不开启远场人声抑制能力。推荐设置为2，有较好的远场人声抑制能力。嘈杂的办公室环境下可以设置为3，更为嘈杂的环境下可以使用4和5。注意较高的VadLevel可能会将单字当作噪声给过滤。</p> 
     * @return VadLevel <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 5]，默认为0，表示不开启远场人声抑制能力。推荐设置为2，有较好的远场人声抑制能力。嘈杂的办公室环境下可以设置为3，更为嘈杂的环境下可以使用4和5。注意较高的VadLevel可能会将单字当作噪声给过滤。</p>
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 5]，默认为0，表示不开启远场人声抑制能力。推荐设置为2，有较好的远场人声抑制能力。嘈杂的办公室环境下可以设置为3，更为嘈杂的环境下可以使用4和5。注意较高的VadLevel可能会将单字当作噪声给过滤。</p>
     * @param VadLevel <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 5]，默认为0，表示不开启远场人声抑制能力。推荐设置为2，有较好的远场人声抑制能力。嘈杂的办公室环境下可以设置为3，更为嘈杂的环境下可以使用4和5。注意较高的VadLevel可能会将单字当作噪声给过滤。</p>
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    public STTConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public STTConfig(STTConfig source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.CustomParam != null) {
            this.CustomParam = new String(source.CustomParam);
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
        if (source.HotWordList != null) {
            this.HotWordList = new String(source.HotWordList);
        }
        if (source.VadLevel != null) {
            this.VadLevel = new Long(source.VadLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamArraySimple(map, prefix + "AlternativeLanguage.", this.AlternativeLanguage);
        this.setParamSimple(map, prefix + "CustomParam", this.CustomParam);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamSimple(map, prefix + "HotWordList", this.HotWordList);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);

    }
}

