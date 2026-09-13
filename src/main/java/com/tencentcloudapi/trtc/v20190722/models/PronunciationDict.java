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
    * <p>需要纠正发音的词语，同一请求中若有重复词语，以最后一条为准。</p>
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
    * <p>目标发音，支持以下格式：</p><ul><li>带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 (yin2)(hang2)</li><li>英文音标，如  (rɪˈzjuːm)</li><li>裸文本替换，会将原始文本替换为目标文本</li></ul><p>支持任意格式混排，注意拼音和音标需要被括号包裹</p>
    */
    @SerializedName("Pronunciation")
    @Expose
    private String Pronunciation;

    /**
     * Get <p>需要纠正发音的词语，同一请求中若有重复词语，以最后一条为准。</p> 
     * @return Word <p>需要纠正发音的词语，同一请求中若有重复词语，以最后一条为准。</p>
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set <p>需要纠正发音的词语，同一请求中若有重复词语，以最后一条为准。</p>
     * @param Word <p>需要纠正发音的词语，同一请求中若有重复词语，以最后一条为准。</p>
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    /**
     * Get <p>目标发音，支持以下格式：</p><ul><li>带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 (yin2)(hang2)</li><li>英文音标，如  (rɪˈzjuːm)</li><li>裸文本替换，会将原始文本替换为目标文本</li></ul><p>支持任意格式混排，注意拼音和音标需要被括号包裹</p> 
     * @return Pronunciation <p>目标发音，支持以下格式：</p><ul><li>带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 (yin2)(hang2)</li><li>英文音标，如  (rɪˈzjuːm)</li><li>裸文本替换，会将原始文本替换为目标文本</li></ul><p>支持任意格式混排，注意拼音和音标需要被括号包裹</p>
     */
    public String getPronunciation() {
        return this.Pronunciation;
    }

    /**
     * Set <p>目标发音，支持以下格式：</p><ul><li>带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 (yin2)(hang2)</li><li>英文音标，如  (rɪˈzjuːm)</li><li>裸文本替换，会将原始文本替换为目标文本</li></ul><p>支持任意格式混排，注意拼音和音标需要被括号包裹</p>
     * @param Pronunciation <p>目标发音，支持以下格式：</p><ul><li>带声调数字的拼音（1=阴平，2=阳平，3=上声，4=去声，5=轻声），如 (yin2)(hang2)</li><li>英文音标，如  (rɪˈzjuːm)</li><li>裸文本替换，会将原始文本替换为目标文本</li></ul><p>支持任意格式混排，注意拼音和音标需要被括号包裹</p>
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

