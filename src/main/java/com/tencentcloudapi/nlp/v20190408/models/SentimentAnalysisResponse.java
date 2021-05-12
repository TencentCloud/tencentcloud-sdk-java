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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentimentAnalysisResponse extends AbstractModel{

    /**
    * 正面情感概率
    */
    @SerializedName("Positive")
    @Expose
    private Float Positive;

    /**
    * 中性情感概率，当输入参数Mode取值为3class时有效，否则值为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Neutral")
    @Expose
    private Float Neutral;

    /**
    * 负面情感概率
    */
    @SerializedName("Negative")
    @Expose
    private Float Negative;

    /**
    * 情感分类结果：
1、positive，表示正面情感
2、negative，表示负面情感
3、neutral，表示中性、无情感
    */
    @SerializedName("Sentiment")
    @Expose
    private String Sentiment;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 正面情感概率 
     * @return Positive 正面情感概率
     */
    public Float getPositive() {
        return this.Positive;
    }

    /**
     * Set 正面情感概率
     * @param Positive 正面情感概率
     */
    public void setPositive(Float Positive) {
        this.Positive = Positive;
    }

    /**
     * Get 中性情感概率，当输入参数Mode取值为3class时有效，否则值为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Neutral 中性情感概率，当输入参数Mode取值为3class时有效，否则值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getNeutral() {
        return this.Neutral;
    }

    /**
     * Set 中性情感概率，当输入参数Mode取值为3class时有效，否则值为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Neutral 中性情感概率，当输入参数Mode取值为3class时有效，否则值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeutral(Float Neutral) {
        this.Neutral = Neutral;
    }

    /**
     * Get 负面情感概率 
     * @return Negative 负面情感概率
     */
    public Float getNegative() {
        return this.Negative;
    }

    /**
     * Set 负面情感概率
     * @param Negative 负面情感概率
     */
    public void setNegative(Float Negative) {
        this.Negative = Negative;
    }

    /**
     * Get 情感分类结果：
1、positive，表示正面情感
2、negative，表示负面情感
3、neutral，表示中性、无情感 
     * @return Sentiment 情感分类结果：
1、positive，表示正面情感
2、negative，表示负面情感
3、neutral，表示中性、无情感
     */
    public String getSentiment() {
        return this.Sentiment;
    }

    /**
     * Set 情感分类结果：
1、positive，表示正面情感
2、negative，表示负面情感
3、neutral，表示中性、无情感
     * @param Sentiment 情感分类结果：
1、positive，表示正面情感
2、negative，表示负面情感
3、neutral，表示中性、无情感
     */
    public void setSentiment(String Sentiment) {
        this.Sentiment = Sentiment;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SentimentAnalysisResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentimentAnalysisResponse(SentimentAnalysisResponse source) {
        if (source.Positive != null) {
            this.Positive = new Float(source.Positive);
        }
        if (source.Neutral != null) {
            this.Neutral = new Float(source.Neutral);
        }
        if (source.Negative != null) {
            this.Negative = new Float(source.Negative);
        }
        if (source.Sentiment != null) {
            this.Sentiment = new String(source.Sentiment);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Positive", this.Positive);
        this.setParamSimple(map, prefix + "Neutral", this.Neutral);
        this.setParamSimple(map, prefix + "Negative", this.Negative);
        this.setParamSimple(map, prefix + "Sentiment", this.Sentiment);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

