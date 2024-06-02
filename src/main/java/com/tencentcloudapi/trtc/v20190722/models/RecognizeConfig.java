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
tencent asr不支持"it"和"ru"，google asr全都支持。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

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
google支持上述语言两两之间翻译，tencent只支持部分语言之间翻译。

tencnet目标语言，各源语言的目标语言支持列表如下，冒号左侧是目标语言，右侧是源语言：
- zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）
- ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）
- ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）
- fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）
- ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）
- pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）
- vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ar（阿拉伯语）：en（英语）
- hi（印地语）：en（英语）
    */
    @SerializedName("TranslationLanguage")
    @Expose
    private String TranslationLanguage;

    /**
     * Get 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
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
tencent asr不支持"it"和"ru"，google asr全都支持。 
     * @return Language 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
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
tencent asr不支持"it"和"ru"，google asr全都支持。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
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
tencent asr不支持"it"和"ru"，google asr全都支持。
     * @param Language 语音识别支持的语言，默认是"zh"。目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循[ISO639](https://en.wikipedia.org/wiki/List_of_ISO_639_language_codes)：
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
tencent asr不支持"it"和"ru"，google asr全都支持。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 使用的模型，目前支持tencent和google，默认是tencent。 
     * @return Model 使用的模型，目前支持tencent和google，默认是tencent。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 使用的模型，目前支持tencent和google，默认是tencent。
     * @param Model 使用的模型，目前支持tencent和google，默认是tencent。
     */
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
google支持上述语言两两之间翻译，tencent只支持部分语言之间翻译。

tencnet目标语言，各源语言的目标语言支持列表如下，冒号左侧是目标语言，右侧是源语言：
- zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）
- ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）
- ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）
- fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）
- ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）
- pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）
- vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ar（阿拉伯语）：en（英语）
- hi（印地语）：en（英语） 
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
google支持上述语言两两之间翻译，tencent只支持部分语言之间翻译。

tencnet目标语言，各源语言的目标语言支持列表如下，冒号左侧是目标语言，右侧是源语言：
- zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）
- ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）
- ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）
- fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）
- ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）
- pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）
- vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ar（阿拉伯语）：en（英语）
- hi（印地语）：en（英语）
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
google支持上述语言两两之间翻译，tencent只支持部分语言之间翻译。

tencnet目标语言，各源语言的目标语言支持列表如下，冒号左侧是目标语言，右侧是源语言：
- zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）
- ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）
- ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）
- fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）
- ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）
- pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）
- vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ar（阿拉伯语）：en（英语）
- hi（印地语）：en（英语）
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
google支持上述语言两两之间翻译，tencent只支持部分语言之间翻译。

tencnet目标语言，各源语言的目标语言支持列表如下，冒号左侧是目标语言，右侧是源语言：
- zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）
- en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）
- ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）
- ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）
- fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）
- tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）
- ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）
- pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）
- vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）
- ar（阿拉伯语）：en（英语）
- hi（印地语）：en（英语）
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
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "TranslationLanguage", this.TranslationLanguage);

    }
}

