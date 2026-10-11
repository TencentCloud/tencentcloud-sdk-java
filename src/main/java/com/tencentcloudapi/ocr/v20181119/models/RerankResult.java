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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerankResult extends AbstractModel {

    /**
    * 文档在输入 Docs 列表中的索引，从 0 开始，用于回溯原文档。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 文档与查询内容的相关性得分，数值越大越相关。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 文档在输入 Docs 列表中的索引，从 0 开始，用于回溯原文档。 
     * @return Index 文档在输入 Docs 列表中的索引，从 0 开始，用于回溯原文档。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 文档在输入 Docs 列表中的索引，从 0 开始，用于回溯原文档。
     * @param Index 文档在输入 Docs 列表中的索引，从 0 开始，用于回溯原文档。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 文档与查询内容的相关性得分，数值越大越相关。 
     * @return Score 文档与查询内容的相关性得分，数值越大越相关。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 文档与查询内容的相关性得分，数值越大越相关。
     * @param Score 文档与查询内容的相关性得分，数值越大越相关。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public RerankResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerankResult(RerankResult source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

