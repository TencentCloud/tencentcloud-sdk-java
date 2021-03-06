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

public class WordEmbeddingResponse extends AbstractModel{

    /**
    * 词向量数组
    */
    @SerializedName("Vector")
    @Expose
    private Float [] Vector;

    /**
    * 词向量的维度
    */
    @SerializedName("Dimension")
    @Expose
    private Long Dimension;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 词向量数组 
     * @return Vector 词向量数组
     */
    public Float [] getVector() {
        return this.Vector;
    }

    /**
     * Set 词向量数组
     * @param Vector 词向量数组
     */
    public void setVector(Float [] Vector) {
        this.Vector = Vector;
    }

    /**
     * Get 词向量的维度 
     * @return Dimension 词向量的维度
     */
    public Long getDimension() {
        return this.Dimension;
    }

    /**
     * Set 词向量的维度
     * @param Dimension 词向量的维度
     */
    public void setDimension(Long Dimension) {
        this.Dimension = Dimension;
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

    public WordEmbeddingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordEmbeddingResponse(WordEmbeddingResponse source) {
        if (source.Vector != null) {
            this.Vector = new Float[source.Vector.length];
            for (int i = 0; i < source.Vector.length; i++) {
                this.Vector[i] = new Float(source.Vector[i]);
            }
        }
        if (source.Dimension != null) {
            this.Dimension = new Long(source.Dimension);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Vector.", this.Vector);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

