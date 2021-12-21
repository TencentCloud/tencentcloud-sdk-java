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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMiniProgramReviewElem extends AbstractModel{

    /**
    * 智能识别类型。 
<li>Porn：画面涉及令人反感的信息，</li>
<li>Porn.Ocr：文字涉及令人反感的信息，</li>
<li>Porn.Asr：声音涉及令人反感的信息，</li>
<li>Terrorism：画面涉及令人不安全的信息，</li>
<li>Political：画面涉及令人不适宜的信息，</li>
<li>Political.Ocr：文字涉及令人不适宜的信息，</li>
<li>Political.Asr：声音涉及令人不适宜的信息。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 智能识别意见。
<li>pass：确认正常，</li>
<li>block：确认违规，</li>
<li>review：疑似违规。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 智能识别结果置信度。取值 0~100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 智能识别类型。 
<li>Porn：画面涉及令人反感的信息，</li>
<li>Porn.Ocr：文字涉及令人反感的信息，</li>
<li>Porn.Asr：声音涉及令人反感的信息，</li>
<li>Terrorism：画面涉及令人不安全的信息，</li>
<li>Political：画面涉及令人不适宜的信息，</li>
<li>Political.Ocr：文字涉及令人不适宜的信息，</li>
<li>Political.Asr：声音涉及令人不适宜的信息。</li> 
     * @return Type 智能识别类型。 
<li>Porn：画面涉及令人反感的信息，</li>
<li>Porn.Ocr：文字涉及令人反感的信息，</li>
<li>Porn.Asr：声音涉及令人反感的信息，</li>
<li>Terrorism：画面涉及令人不安全的信息，</li>
<li>Political：画面涉及令人不适宜的信息，</li>
<li>Political.Ocr：文字涉及令人不适宜的信息，</li>
<li>Political.Asr：声音涉及令人不适宜的信息。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 智能识别类型。 
<li>Porn：画面涉及令人反感的信息，</li>
<li>Porn.Ocr：文字涉及令人反感的信息，</li>
<li>Porn.Asr：声音涉及令人反感的信息，</li>
<li>Terrorism：画面涉及令人不安全的信息，</li>
<li>Political：画面涉及令人不适宜的信息，</li>
<li>Political.Ocr：文字涉及令人不适宜的信息，</li>
<li>Political.Asr：声音涉及令人不适宜的信息。</li>
     * @param Type 智能识别类型。 
<li>Porn：画面涉及令人反感的信息，</li>
<li>Porn.Ocr：文字涉及令人反感的信息，</li>
<li>Porn.Asr：声音涉及令人反感的信息，</li>
<li>Terrorism：画面涉及令人不安全的信息，</li>
<li>Political：画面涉及令人不适宜的信息，</li>
<li>Political.Ocr：文字涉及令人不适宜的信息，</li>
<li>Political.Asr：声音涉及令人不适宜的信息。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 智能识别意见。
<li>pass：确认正常，</li>
<li>block：确认违规，</li>
<li>review：疑似违规。</li> 
     * @return Suggestion 智能识别意见。
<li>pass：确认正常，</li>
<li>block：确认违规，</li>
<li>review：疑似违规。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 智能识别意见。
<li>pass：确认正常，</li>
<li>block：确认违规，</li>
<li>review：疑似违规。</li>
     * @param Suggestion 智能识别意见。
<li>pass：确认正常，</li>
<li>block：确认违规，</li>
<li>review：疑似违规。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 智能识别结果置信度。取值 0~100。 
     * @return Confidence 智能识别结果置信度。取值 0~100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 智能识别结果置信度。取值 0~100。
     * @param Confidence 智能识别结果置信度。取值 0~100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public MediaMiniProgramReviewElem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMiniProgramReviewElem(MediaMiniProgramReviewElem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

