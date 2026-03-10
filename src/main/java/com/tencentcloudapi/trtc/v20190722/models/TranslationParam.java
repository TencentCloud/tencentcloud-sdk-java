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

public class TranslationParam extends AbstractModel {

    /**
    * 翻译的目标语言，示例值["en", "ja"]。目标语种列表[中文 "zh"，英语 "en"，越南语 "vi"，日语 "ja"，韩语 "ko"，印度尼西亚语 "id"，泰语 "th"，葡萄牙语 "pt"，阿拉伯语 "ar"，西班牙语 "es"，法语 "fr"，马来语 "ms"，德语 "de"，意大利语 "it"，俄语 "ru"]。
    */
    @SerializedName("TargetLang")
    @Expose
    private String [] TargetLang;

    /**
     * Get 翻译的目标语言，示例值["en", "ja"]。目标语种列表[中文 "zh"，英语 "en"，越南语 "vi"，日语 "ja"，韩语 "ko"，印度尼西亚语 "id"，泰语 "th"，葡萄牙语 "pt"，阿拉伯语 "ar"，西班牙语 "es"，法语 "fr"，马来语 "ms"，德语 "de"，意大利语 "it"，俄语 "ru"]。 
     * @return TargetLang 翻译的目标语言，示例值["en", "ja"]。目标语种列表[中文 "zh"，英语 "en"，越南语 "vi"，日语 "ja"，韩语 "ko"，印度尼西亚语 "id"，泰语 "th"，葡萄牙语 "pt"，阿拉伯语 "ar"，西班牙语 "es"，法语 "fr"，马来语 "ms"，德语 "de"，意大利语 "it"，俄语 "ru"]。
     */
    public String [] getTargetLang() {
        return this.TargetLang;
    }

    /**
     * Set 翻译的目标语言，示例值["en", "ja"]。目标语种列表[中文 "zh"，英语 "en"，越南语 "vi"，日语 "ja"，韩语 "ko"，印度尼西亚语 "id"，泰语 "th"，葡萄牙语 "pt"，阿拉伯语 "ar"，西班牙语 "es"，法语 "fr"，马来语 "ms"，德语 "de"，意大利语 "it"，俄语 "ru"]。
     * @param TargetLang 翻译的目标语言，示例值["en", "ja"]。目标语种列表[中文 "zh"，英语 "en"，越南语 "vi"，日语 "ja"，韩语 "ko"，印度尼西亚语 "id"，泰语 "th"，葡萄牙语 "pt"，阿拉伯语 "ar"，西班牙语 "es"，法语 "fr"，马来语 "ms"，德语 "de"，意大利语 "it"，俄语 "ru"]。
     */
    public void setTargetLang(String [] TargetLang) {
        this.TargetLang = TargetLang;
    }

    public TranslationParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationParam(TranslationParam source) {
        if (source.TargetLang != null) {
            this.TargetLang = new String[source.TargetLang.length];
            for (int i = 0; i < source.TargetLang.length; i++) {
                this.TargetLang[i] = new String(source.TargetLang[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetLang.", this.TargetLang);

    }
}

