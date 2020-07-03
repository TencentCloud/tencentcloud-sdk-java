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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceExpressionResult extends AbstractModel{

    /**
    * 表情置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 表情识别结果，包括"neutral":中性,"happiness":开心，"angry":"生气"，"disgust":厌恶，"fear":"恐惧"，"sadness":"悲伤"，"surprise":"惊讶"，"contempt":"蔑视"
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
     * Get 表情置信度 
     * @return Confidence 表情置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 表情置信度
     * @param Confidence 表情置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 表情识别结果，包括"neutral":中性,"happiness":开心，"angry":"生气"，"disgust":厌恶，"fear":"恐惧"，"sadness":"悲伤"，"surprise":"惊讶"，"contempt":"蔑视" 
     * @return Expression 表情识别结果，包括"neutral":中性,"happiness":开心，"angry":"生气"，"disgust":厌恶，"fear":"恐惧"，"sadness":"悲伤"，"surprise":"惊讶"，"contempt":"蔑视"
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set 表情识别结果，包括"neutral":中性,"happiness":开心，"angry":"生气"，"disgust":厌恶，"fear":"恐惧"，"sadness":"悲伤"，"surprise":"惊讶"，"contempt":"蔑视"
     * @param Expression 表情识别结果，包括"neutral":中性,"happiness":开心，"angry":"生气"，"disgust":厌恶，"fear":"恐惧"，"sadness":"悲伤"，"surprise":"惊讶"，"contempt":"蔑视"
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Expression", this.Expression);

    }
}

