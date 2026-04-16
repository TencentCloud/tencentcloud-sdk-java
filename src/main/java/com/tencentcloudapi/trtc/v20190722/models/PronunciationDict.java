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

public class PronunciationDict extends AbstractModel {

    /**
    * 需要纠正发音的词语，前后空格自动去除。同一请求中若有重复词语，以最后一条为准。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * 目标发音，支持以下格式：<br>① 带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 yin2 hang2；<br>② 拼音连写（无空格），如 yin2hang2；<br>③ 文字+拼音混写，如 银hang2；<br>④ 直接文本替换，会将原始文本替换为目标文本
    */
    @SerializedName("Pronunciation")
    @Expose
    private String Pronunciation;

    /**
     * Get 需要纠正发音的词语，前后空格自动去除。同一请求中若有重复词语，以最后一条为准。 
     * @return Word 需要纠正发音的词语，前后空格自动去除。同一请求中若有重复词语，以最后一条为准。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 需要纠正发音的词语，前后空格自动去除。同一请求中若有重复词语，以最后一条为准。
     * @param Word 需要纠正发音的词语，前后空格自动去除。同一请求中若有重复词语，以最后一条为准。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get 目标发音，支持以下格式：<br>① 带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 yin2 hang2；<br>② 拼音连写（无空格），如 yin2hang2；<br>③ 文字+拼音混写，如 银hang2；<br>④ 直接文本替换，会将原始文本替换为目标文本 
     * @return Pronunciation 目标发音，支持以下格式：<br>① 带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 yin2 hang2；<br>② 拼音连写（无空格），如 yin2hang2；<br>③ 文字+拼音混写，如 银hang2；<br>④ 直接文本替换，会将原始文本替换为目标文本
     */
    public String getPronunciation() {
        return this.Pronunciation;
    }

    /**
     * Set 目标发音，支持以下格式：<br>① 带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 yin2 hang2；<br>② 拼音连写（无空格），如 yin2hang2；<br>③ 文字+拼音混写，如 银hang2；<br>④ 直接文本替换，会将原始文本替换为目标文本
     * @param Pronunciation 目标发音，支持以下格式：<br>① 带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 yin2 hang2；<br>② 拼音连写（无空格），如 yin2hang2；<br>③ 文字+拼音混写，如 银hang2；<br>④ 直接文本替换，会将原始文本替换为目标文本
     */
    public void setPronunciation(String Pronunciation) {
        this.Pronunciation = Pronunciation;
    }

    public PronunciationDict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PronunciationDict(PronunciationDict source) {
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
        if (source.Pronunciation != null) {
            this.Pronunciation = new String(source.Pronunciation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Word", this.Word);
        this.setParamSimple(map, prefix + "Pronunciation", this.Pronunciation);

    }
}

