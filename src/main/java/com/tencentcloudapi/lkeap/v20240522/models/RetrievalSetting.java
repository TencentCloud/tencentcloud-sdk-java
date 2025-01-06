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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrievalSetting extends AbstractModel {

    /**
    * 检索的类型，不填该参数则检索全部。
- `DOC`：文档
- `QA`：QA

仅RetrieveKnowledge接口支持该参数
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 返回个数
    */
    @SerializedName("TopK")
    @Expose
    private Long TopK;

    /**
    * 分数过滤
    */
    @SerializedName("ScoreThreshold")
    @Expose
    private Float ScoreThreshold;

    /**
     * Get 检索的类型，不填该参数则检索全部。
- `DOC`：文档
- `QA`：QA

仅RetrieveKnowledge接口支持该参数 
     * @return Type 检索的类型，不填该参数则检索全部。
- `DOC`：文档
- `QA`：QA

仅RetrieveKnowledge接口支持该参数
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 检索的类型，不填该参数则检索全部。
- `DOC`：文档
- `QA`：QA

仅RetrieveKnowledge接口支持该参数
     * @param Type 检索的类型，不填该参数则检索全部。
- `DOC`：文档
- `QA`：QA

仅RetrieveKnowledge接口支持该参数
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 返回个数 
     * @return TopK 返回个数
     */
    public Long getTopK() {
        return this.TopK;
    }

    /**
     * Set 返回个数
     * @param TopK 返回个数
     */
    public void setTopK(Long TopK) {
        this.TopK = TopK;
    }

    /**
     * Get 分数过滤 
     * @return ScoreThreshold 分数过滤
     */
    public Float getScoreThreshold() {
        return this.ScoreThreshold;
    }

    /**
     * Set 分数过滤
     * @param ScoreThreshold 分数过滤
     */
    public void setScoreThreshold(Float ScoreThreshold) {
        this.ScoreThreshold = ScoreThreshold;
    }

    public RetrievalSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrievalSetting(RetrievalSetting source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TopK != null) {
            this.TopK = new Long(source.TopK);
        }
        if (source.ScoreThreshold != null) {
            this.ScoreThreshold = new Float(source.ScoreThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TopK", this.TopK);
        this.setParamSimple(map, prefix + "ScoreThreshold", this.ScoreThreshold);

    }
}

