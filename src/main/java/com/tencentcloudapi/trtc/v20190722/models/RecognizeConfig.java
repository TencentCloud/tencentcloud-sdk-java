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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeConfig extends AbstractModel {

    /**
    * 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
中文 Chinese = "zh"
中文繁体 Chinese_TW = "zh-TW" 
中文方言 Chinese_DIALECT = "zh-dialect"
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 额外的可能替代语言，最多3个，仅高级版支持。Language指定中文方言时，不能设置该字段。
    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * 使用的模型，目前支持tencent和google，默认是tencent。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 翻译功能支持的语言，如果填写，则会启用翻译，不填则只会使用语音识别。
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
Chinese = "zh"
Chinese_TW = "zh-TW" 
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
    */
    @SerializedName("TranslationLanguage")
    @Expose
    private String TranslationLanguage;

    /**
     * Get 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
中文 Chinese = "zh"
中文繁体 Chinese_TW = "zh-TW" 
中文方言 Chinese_DIALECT = "zh-dialect"
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。 
     * @return Language 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
中文 Chinese = "zh"
中文繁体 Chinese_TW = "zh-TW" 
中文方言 Chinese_DIALECT = "zh-dialect"
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
中文 Chinese = "zh"
中文繁体 Chinese_TW = "zh-TW" 
中文方言 Chinese_DIALECT = "zh-dialect"
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     * @param Language 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
中文 Chinese = "zh"
中文繁体 Chinese_TW = "zh-TW" 
中文方言 Chinese_DIALECT = "zh-dialect"
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 额外的可能替代语言，最多3个，仅高级版支持。Language指定中文方言时，不能设置该字段。 
     * @return AlternativeLanguage 额外的可能替代语言，最多3个，仅高级版支持。Language指定中文方言时，不能设置该字段。
     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set 额外的可能替代语言，最多3个，仅高级版支持。Language指定中文方言时，不能设置该字段。
     * @param AlternativeLanguage 额外的可能替代语言，最多3个，仅高级版支持。Language指定中文方言时，不能设置该字段。
     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get 使用的模型，目前支持tencent和google，默认是tencent。 
     * @return Model 使用的模型，目前支持tencent和google，默认是tencent。
     * @deprecated
     */
    @Deprecated
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 使用的模型，目前支持tencent和google，默认是tencent。
     * @param Model 使用的模型，目前支持tencent和google，默认是tencent。
     * @deprecated
     */
    @Deprecated
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 翻译功能支持的语言，如果填写，则会启用翻译，不填则只会使用语音识别。
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
Chinese = "zh"
Chinese_TW = "zh-TW" 
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。 
     * @return TranslationLanguage 翻译功能支持的语言，如果填写，则会启用翻译，不填则只会使用语音识别。
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
Chinese = "zh"
Chinese_TW = "zh-TW" 
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     */
    public String getTranslationLanguage() {
        return this.TranslationLanguage;
    }

    /**
     * Set 翻译功能支持的语言，如果填写，则会启用翻译，不填则只会使用语音识别。
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
Chinese = "zh"
Chinese_TW = "zh-TW" 
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     * @param TranslationLanguage 翻译功能支持的语言，如果填写，则会启用翻译，不填则只会使用语音识别。
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
Chinese = "zh"
Chinese_TW = "zh-TW" 
English = "en"
Vietnamese = "vi"
Japanese = "ja"
Korean = "ko"
Indonesia = "id"
Thai = "th"
Portuguese = "pt"
Turkish = "tr"
Arabic = "ar"
Spanish = "es"
Hindi = "hi"
French = "fr"
Malay = "ms"
Filipino = "fil"
German = "de"
Italian = "it"
Russian = "ru"

注意：
如果缺少满足您需求的语言，请联系我们技术人员。
     */
    public void setTranslationLanguage(String TranslationLanguage) {
        this.TranslationLanguage = TranslationLanguage;
    }

    public RecognizeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeConfig(RecognizeConfig source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.TranslationLanguage != null) {
            this.TranslationLanguage = new String(source.TranslationLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamArraySimple(map, prefix + "AlternativeLanguage.", this.AlternativeLanguage);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "TranslationLanguage", this.TranslationLanguage);

    }
}

