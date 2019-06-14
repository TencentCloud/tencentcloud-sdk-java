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

public class SentimentAnalysisResponse  extends AbstractModel{

    /**
    * 负面情感概率
    */
    @SerializedName("Negative")
    @Expose
    private Float Negative;

    /**
    * 正面情感概率
    */
    @SerializedName("Positive")
    @Expose
    private Float Positive;

    /**
    * 情感属性
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
     * 获取负面情感概率
     * @return Negative 负面情感概率
     */
    public Float getNegative() {
        return this.Negative;
    }

    /**
     * 设置负面情感概率
     * @param Negative 负面情感概率
     */
    public void setNegative(Float Negative) {
        this.Negative = Negative;
    }

    /**
     * 获取正面情感概率
     * @return Positive 正面情感概率
     */
    public Float getPositive() {
        return this.Positive;
    }

    /**
     * 设置正面情感概率
     * @param Positive 正面情感概率
     */
    public void setPositive(Float Positive) {
        this.Positive = Positive;
    }

    /**
     * 获取情感属性
     * @return Sentiment 情感属性
     */
    public String getSentiment() {
        return this.Sentiment;
    }

    /**
     * 设置情感属性
     * @param Sentiment 情感属性
     */
    public void setSentiment(String Sentiment) {
        this.Sentiment = Sentiment;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Negative", this.Negative);
        this.setParamSimple(map, prefix + "Positive", this.Positive);
        this.setParamSimple(map, prefix + "Sentiment", this.Sentiment);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

