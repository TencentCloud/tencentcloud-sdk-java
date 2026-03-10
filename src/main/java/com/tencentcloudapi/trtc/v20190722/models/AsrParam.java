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

public class AsrParam extends AbstractModel {

    /**
    * 转录服务使用的模型类型。示例值"16k_zh_en"。语音转文本不同套餐版本支持的语言如下：

基础语言引擎：
- "zh": 8k 采样率中文识别模型，主要用于电话音频。

标准语言引擎：
- "8k_zh_large": 8k 中文大模型引擎，针对电话音频支持较好。
- "16k_zh_large": 16k 大模型引擎，同时支持中文、英文、多种中文方言口音等语言的识别。
- "16k_zh_en": 最新 16k 中英大模型引擎，同时支持中文、英语、多种中文方言口音的识别，对中英混说场景识别更优。

高级语言引擎：
- "zh-yue": 中文粤语
- "vi": 越南语
- "ja": 日语
- "ko": 韩语
- "id": 印度尼西亚语
- "th": 泰语
- "pt": 葡萄牙语
- "tr": 土耳其语
- "ar": 阿拉伯语
- "es": 西班牙语
- "hi": 印地语
- "fr": 法语
- "ms": 马来语
- "fil": 菲律宾语
- "de": 德语
- "it": 意大利语
- "ru": 俄语
- "sv": 瑞典语
- "da": 丹麦语
- "no": 挪威语

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * 语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。
示例值：1000
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * 临时热词表：该参数用于提升识别准确率。
- 单个热词限制："热词|权重"，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如："腾讯云|5" 或 "ASR|11"。
- 临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如："腾讯云|10,语音识别|5,ASR|11"。
注意：
热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。
热词权重设置为100时，当前热词开启热词增强同音同调替换功能，举例：热词配置"蜜制|100"时，与"蜜制"同拼音（mizhi）的"秘制"的识别结果会被强制替换成"蜜制"。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。
热词不能包含空格，如：ASR 腾讯云
示例值：语音助理|10
    */
    @SerializedName("HotWordList")
    @Expose
    private String HotWordList;

    /**
    * 发起模糊识别为高级版能力,默认按照高级版收费,仅支持填写除"zh-dialect"和"zh-yue"以外的高级版语言。注意：最多只能填写4种语言。

    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
     * Get 转录服务使用的模型类型。示例值"16k_zh_en"。语音转文本不同套餐版本支持的语言如下：

基础语言引擎：
- "zh": 8k 采样率中文识别模型，主要用于电话音频。

标准语言引擎：
- "8k_zh_large": 8k 中文大模型引擎，针对电话音频支持较好。
- "16k_zh_large": 16k 大模型引擎，同时支持中文、英文、多种中文方言口音等语言的识别。
- "16k_zh_en": 最新 16k 中英大模型引擎，同时支持中文、英语、多种中文方言口音的识别，对中英混说场景识别更优。

高级语言引擎：
- "zh-yue": 中文粤语
- "vi": 越南语
- "ja": 日语
- "ko": 韩语
- "id": 印度尼西亚语
- "th": 泰语
- "pt": 葡萄牙语
- "tr": 土耳其语
- "ar": 阿拉伯语
- "es": 西班牙语
- "hi": 印地语
- "fr": 法语
- "ms": 马来语
- "fil": 菲律宾语
- "de": 德语
- "it": 意大利语
- "ru": 俄语
- "sv": 瑞典语
- "da": 丹麦语
- "no": 挪威语

注意：
如果缺少满足您需求的语言，请联系我们技术人员。 
     * @return Lang 转录服务使用的模型类型。示例值"16k_zh_en"。语音转文本不同套餐版本支持的语言如下：

基础语言引擎：
- "zh": 8k 采样率中文识别模型，主要用于电话音频。

标准语言引擎：
- "8k_zh_large": 8k 中文大模型引擎，针对电话音频支持较好。
- "16k_zh_large": 16k 大模型引擎，同时支持中文、英文、多种中文方言口音等语言的识别。
- "16k_zh_en": 最新 16k 中英大模型引擎，同时支持中文、英语、多种中文方言口音的识别，对中英混说场景识别更优。

高级语言引擎：
- "zh-yue": 中文粤语
- "vi": 越南语
- "ja": 日语
- "ko": 韩语
- "id": 印度尼西亚语
- "th": 泰语
- "pt": 葡萄牙语
- "tr": 土耳其语
- "ar": 阿拉伯语
- "es": 西班牙语
- "hi": 印地语
- "fr": 法语
- "ms": 马来语
- "fil": 菲律宾语
- "de": 德语
- "it": 意大利语
- "ru": 俄语
- "sv": 瑞典语
- "da": 丹麦语
- "no": 挪威语

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set 转录服务使用的模型类型。示例值"16k_zh_en"。语音转文本不同套餐版本支持的语言如下：

基础语言引擎：
- "zh": 8k 采样率中文识别模型，主要用于电话音频。

标准语言引擎：
- "8k_zh_large": 8k 中文大模型引擎，针对电话音频支持较好。
- "16k_zh_large": 16k 大模型引擎，同时支持中文、英文、多种中文方言口音等语言的识别。
- "16k_zh_en": 最新 16k 中英大模型引擎，同时支持中文、英语、多种中文方言口音的识别，对中英混说场景识别更优。

高级语言引擎：
- "zh-yue": 中文粤语
- "vi": 越南语
- "ja": 日语
- "ko": 韩语
- "id": 印度尼西亚语
- "th": 泰语
- "pt": 葡萄牙语
- "tr": 土耳其语
- "ar": 阿拉伯语
- "es": 西班牙语
- "hi": 印地语
- "fr": 法语
- "ms": 马来语
- "fil": 菲律宾语
- "de": 德语
- "it": 意大利语
- "ru": 俄语
- "sv": 瑞典语
- "da": 丹麦语
- "no": 挪威语

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     * @param Lang 转录服务使用的模型类型。示例值"16k_zh_en"。语音转文本不同套餐版本支持的语言如下：

基础语言引擎：
- "zh": 8k 采样率中文识别模型，主要用于电话音频。

标准语言引擎：
- "8k_zh_large": 8k 中文大模型引擎，针对电话音频支持较好。
- "16k_zh_large": 16k 大模型引擎，同时支持中文、英文、多种中文方言口音等语言的识别。
- "16k_zh_en": 最新 16k 中英大模型引擎，同时支持中文、英语、多种中文方言口音的识别，对中英混说场景识别更优。

高级语言引擎：
- "zh-yue": 中文粤语
- "vi": 越南语
- "ja": 日语
- "ko": 韩语
- "id": 印度尼西亚语
- "th": 泰语
- "pt": 葡萄牙语
- "tr": 土耳其语
- "ar": 阿拉伯语
- "es": 西班牙语
- "hi": 印地语
- "fr": 法语
- "ms": 马来语
- "fil": 菲律宾语
- "de": 德语
- "it": 意大利语
- "ru": 俄语
- "sv": 瑞典语
- "da": 丹麦语
- "no": 挪威语

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get 语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。
示例值：1000 
     * @return VadSilenceTime 语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。
示例值：1000
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set 语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。
示例值：1000
     * @param VadSilenceTime 语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。
示例值：1000
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get 临时热词表：该参数用于提升识别准确率。
- 单个热词限制："热词|权重"，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如："腾讯云|5" 或 "ASR|11"。
- 临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如："腾讯云|10,语音识别|5,ASR|11"。
注意：
热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。
热词权重设置为100时，当前热词开启热词增强同音同调替换功能，举例：热词配置"蜜制|100"时，与"蜜制"同拼音（mizhi）的"秘制"的识别结果会被强制替换成"蜜制"。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。
热词不能包含空格，如：ASR 腾讯云
示例值：语音助理|10 
     * @return HotWordList 临时热词表：该参数用于提升识别准确率。
- 单个热词限制："热词|权重"，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如："腾讯云|5" 或 "ASR|11"。
- 临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如："腾讯云|10,语音识别|5,ASR|11"。
注意：
热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。
热词权重设置为100时，当前热词开启热词增强同音同调替换功能，举例：热词配置"蜜制|100"时，与"蜜制"同拼音（mizhi）的"秘制"的识别结果会被强制替换成"蜜制"。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。
热词不能包含空格，如：ASR 腾讯云
示例值：语音助理|10
     */
    public String getHotWordList() {
        return this.HotWordList;
    }

    /**
     * Set 临时热词表：该参数用于提升识别准确率。
- 单个热词限制："热词|权重"，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如："腾讯云|5" 或 "ASR|11"。
- 临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如："腾讯云|10,语音识别|5,ASR|11"。
注意：
热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。
热词权重设置为100时，当前热词开启热词增强同音同调替换功能，举例：热词配置"蜜制|100"时，与"蜜制"同拼音（mizhi）的"秘制"的识别结果会被强制替换成"蜜制"。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。
热词不能包含空格，如：ASR 腾讯云
示例值：语音助理|10
     * @param HotWordList 临时热词表：该参数用于提升识别准确率。
- 单个热词限制："热词|权重"，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如："腾讯云|5" 或 "ASR|11"。
- 临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如："腾讯云|10,语音识别|5,ASR|11"。
注意：
热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。
热词权重设置为100时，当前热词开启热词增强同音同调替换功能，举例：热词配置"蜜制|100"时，与"蜜制"同拼音（mizhi）的"秘制"的识别结果会被强制替换成"蜜制"。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。
热词不能包含空格，如：ASR 腾讯云
示例值：语音助理|10
     */
    public void setHotWordList(String HotWordList) {
        this.HotWordList = HotWordList;
    }

    /**
     * Get 发起模糊识别为高级版能力,默认按照高级版收费,仅支持填写除"zh-dialect"和"zh-yue"以外的高级版语言。注意：最多只能填写4种语言。
 
     * @return AlternativeLanguage 发起模糊识别为高级版能力,默认按照高级版收费,仅支持填写除"zh-dialect"和"zh-yue"以外的高级版语言。注意：最多只能填写4种语言。

     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set 发起模糊识别为高级版能力,默认按照高级版收费,仅支持填写除"zh-dialect"和"zh-yue"以外的高级版语言。注意：最多只能填写4种语言。

     * @param AlternativeLanguage 发起模糊识别为高级版能力,默认按照高级版收费,仅支持填写除"zh-dialect"和"zh-yue"以外的高级版语言。注意：最多只能填写4种语言。

     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。 
     * @return VadLevel vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。
     * @param VadLevel vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    public AsrParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrParam(AsrParam source) {
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
        if (source.HotWordList != null) {
            this.HotWordList = new String(source.HotWordList);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.VadLevel != null) {
            this.VadLevel = new Long(source.VadLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamSimple(map, prefix + "HotWordList", this.HotWordList);
        this.setParamArraySimple(map, prefix + "AlternativeLanguage.", this.AlternativeLanguage);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);

    }
}

