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

public class EvaluateSentenceSimilarityResponse extends AbstractModel{

    /**
    * 每个句子对的相似度分值。
    */
    @SerializedName("ScoreList")
    @Expose
    private Float [] ScoreList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 每个句子对的相似度分值。 
     * @return ScoreList 每个句子对的相似度分值。
     */
    public Float [] getScoreList() {
        return this.ScoreList;
    }

    /**
     * Set 每个句子对的相似度分值。
     * @param ScoreList 每个句子对的相似度分值。
     */
    public void setScoreList(Float [] ScoreList) {
        this.ScoreList = ScoreList;
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

    public EvaluateSentenceSimilarityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluateSentenceSimilarityResponse(EvaluateSentenceSimilarityResponse source) {
        if (source.ScoreList != null) {
            this.ScoreList = new Float[source.ScoreList.length];
            for (int i = 0; i < source.ScoreList.length; i++) {
                this.ScoreList[i] = new Float(source.ScoreList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScoreList.", this.ScoreList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

