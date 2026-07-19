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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbeddingResultItem extends AbstractModel {

    /**
    * <p>向量</p>
    */
    @SerializedName("Result")
    @Expose
    private Float [] Result;

    /**
     * Get <p>向量</p> 
     * @return Result <p>向量</p>
     */
    public Float [] getResult() {
        return this.Result;
    }

    /**
     * Set <p>向量</p>
     * @param Result <p>向量</p>
     */
    public void setResult(Float [] Result) {
        this.Result = Result;
    }

    public EmbeddingResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingResultItem(EmbeddingResultItem source) {
        if (source.Result != null) {
            this.Result = new Float[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new Float(source.Result[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Result.", this.Result);

    }
}

