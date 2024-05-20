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
    * 支持的语言，目前支持语言如下：
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
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 选填，如果填写，则会启用翻译，不填则忽略。支持语言同Language字段。
    */
    @SerializedName("TranslationLanguage")
    @Expose
    private String TranslationLanguage;

    /**
     * Get 支持的语言，目前支持语言如下：
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
     * @return Language 支持的语言，目前支持语言如下：
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
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 支持的语言，目前支持语言如下：
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
     * @param Language 支持的语言，目前支持语言如下：
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
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 选填，如果填写，则会启用翻译，不填则忽略。支持语言同Language字段。 
     * @return TranslationLanguage 选填，如果填写，则会启用翻译，不填则忽略。支持语言同Language字段。
     */
    public String getTranslationLanguage() {
        return this.TranslationLanguage;
    }

    /**
     * Set 选填，如果填写，则会启用翻译，不填则忽略。支持语言同Language字段。
     * @param TranslationLanguage 选填，如果填写，则会启用翻译，不填则忽略。支持语言同Language字段。
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
        if (source.TranslationLanguage != null) {
            this.TranslationLanguage = new String(source.TranslationLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "TranslationLanguage", this.TranslationLanguage);

    }
}

