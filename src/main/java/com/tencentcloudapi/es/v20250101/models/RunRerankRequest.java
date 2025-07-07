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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunRerankRequest extends AbstractModel {

    /**
    * 模型名称，可选模型列表：bge-reranker-large，bge-reranker-v2-m3。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 查询文本。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 待排序的候选doc列表。
    */
    @SerializedName("Documents")
    @Expose
    private String [] Documents;

    /**
    * 排序返回的top文档数量, 如果没有指定则返回全部候选doc，如果指定的top_n值大于输入的候选doc数量，返回全部doc。
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
    * 返回的排序结果列表里面是否返回每一条document原文，默认值False。
    */
    @SerializedName("ReturnDocuments")
    @Expose
    private Boolean ReturnDocuments;

    /**
     * Get 模型名称，可选模型列表：bge-reranker-large，bge-reranker-v2-m3。 
     * @return ModelName 模型名称，可选模型列表：bge-reranker-large，bge-reranker-v2-m3。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称，可选模型列表：bge-reranker-large，bge-reranker-v2-m3。
     * @param ModelName 模型名称，可选模型列表：bge-reranker-large，bge-reranker-v2-m3。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 查询文本。 
     * @return Query 查询文本。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询文本。
     * @param Query 查询文本。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 待排序的候选doc列表。 
     * @return Documents 待排序的候选doc列表。
     */
    public String [] getDocuments() {
        return this.Documents;
    }

    /**
     * Set 待排序的候选doc列表。
     * @param Documents 待排序的候选doc列表。
     */
    public void setDocuments(String [] Documents) {
        this.Documents = Documents;
    }

    /**
     * Get 排序返回的top文档数量, 如果没有指定则返回全部候选doc，如果指定的top_n值大于输入的候选doc数量，返回全部doc。 
     * @return TopN 排序返回的top文档数量, 如果没有指定则返回全部候选doc，如果指定的top_n值大于输入的候选doc数量，返回全部doc。
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set 排序返回的top文档数量, 如果没有指定则返回全部候选doc，如果指定的top_n值大于输入的候选doc数量，返回全部doc。
     * @param TopN 排序返回的top文档数量, 如果没有指定则返回全部候选doc，如果指定的top_n值大于输入的候选doc数量，返回全部doc。
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    /**
     * Get 返回的排序结果列表里面是否返回每一条document原文，默认值False。 
     * @return ReturnDocuments 返回的排序结果列表里面是否返回每一条document原文，默认值False。
     */
    public Boolean getReturnDocuments() {
        return this.ReturnDocuments;
    }

    /**
     * Set 返回的排序结果列表里面是否返回每一条document原文，默认值False。
     * @param ReturnDocuments 返回的排序结果列表里面是否返回每一条document原文，默认值False。
     */
    public void setReturnDocuments(Boolean ReturnDocuments) {
        this.ReturnDocuments = ReturnDocuments;
    }

    public RunRerankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerankRequest(RunRerankRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Documents != null) {
            this.Documents = new String[source.Documents.length];
            for (int i = 0; i < source.Documents.length; i++) {
                this.Documents[i] = new String(source.Documents[i]);
            }
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
        if (source.ReturnDocuments != null) {
            this.ReturnDocuments = new Boolean(source.ReturnDocuments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Documents.", this.Documents);
        this.setParamSimple(map, prefix + "TopN", this.TopN);
        this.setParamSimple(map, prefix + "ReturnDocuments", this.ReturnDocuments);

    }
}

