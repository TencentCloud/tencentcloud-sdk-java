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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchConfig extends AbstractModel {

    /**
    * 检索类型：0:混合搜索 1：向量搜索 2：全文搜索
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 召回数量最大值
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 权重配置
    */
    @SerializedName("EmbeddingWeight")
    @Expose
    private Float EmbeddingWeight;

    /**
    * 0:关闭 1:开启，默认1
    */
    @SerializedName("Rerank")
    @Expose
    private Long Rerank;

    /**
    * 0:关闭 1:开启，默认0
    */
    @SerializedName("AutoRag")
    @Expose
    private Long AutoRag;

    /**
    * AutoRag关联的知识库ID列表
    */
    @SerializedName("KnowledgeBaseIds")
    @Expose
    private String [] KnowledgeBaseIds;

    /**
    * AutoRag搜索状态：0-未完成，1-已完成。仅当AutoRag=1时，该字段有效
    */
    @SerializedName("SearchStatus")
    @Expose
    private Long SearchStatus;

    /**
     * Get 检索类型：0:混合搜索 1：向量搜索 2：全文搜索 
     * @return Type 检索类型：0:混合搜索 1：向量搜索 2：全文搜索
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 检索类型：0:混合搜索 1：向量搜索 2：全文搜索
     * @param Type 检索类型：0:混合搜索 1：向量搜索 2：全文搜索
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 召回数量最大值 
     * @return Num 召回数量最大值
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 召回数量最大值
     * @param Num 召回数量最大值
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 权重配置 
     * @return EmbeddingWeight 权重配置
     */
    public Float getEmbeddingWeight() {
        return this.EmbeddingWeight;
    }

    /**
     * Set 权重配置
     * @param EmbeddingWeight 权重配置
     */
    public void setEmbeddingWeight(Float EmbeddingWeight) {
        this.EmbeddingWeight = EmbeddingWeight;
    }

    /**
     * Get 0:关闭 1:开启，默认1 
     * @return Rerank 0:关闭 1:开启，默认1
     */
    public Long getRerank() {
        return this.Rerank;
    }

    /**
     * Set 0:关闭 1:开启，默认1
     * @param Rerank 0:关闭 1:开启，默认1
     */
    public void setRerank(Long Rerank) {
        this.Rerank = Rerank;
    }

    /**
     * Get 0:关闭 1:开启，默认0 
     * @return AutoRag 0:关闭 1:开启，默认0
     */
    public Long getAutoRag() {
        return this.AutoRag;
    }

    /**
     * Set 0:关闭 1:开启，默认0
     * @param AutoRag 0:关闭 1:开启，默认0
     */
    public void setAutoRag(Long AutoRag) {
        this.AutoRag = AutoRag;
    }

    /**
     * Get AutoRag关联的知识库ID列表 
     * @return KnowledgeBaseIds AutoRag关联的知识库ID列表
     */
    public String [] getKnowledgeBaseIds() {
        return this.KnowledgeBaseIds;
    }

    /**
     * Set AutoRag关联的知识库ID列表
     * @param KnowledgeBaseIds AutoRag关联的知识库ID列表
     */
    public void setKnowledgeBaseIds(String [] KnowledgeBaseIds) {
        this.KnowledgeBaseIds = KnowledgeBaseIds;
    }

    /**
     * Get AutoRag搜索状态：0-未完成，1-已完成。仅当AutoRag=1时，该字段有效 
     * @return SearchStatus AutoRag搜索状态：0-未完成，1-已完成。仅当AutoRag=1时，该字段有效
     */
    public Long getSearchStatus() {
        return this.SearchStatus;
    }

    /**
     * Set AutoRag搜索状态：0-未完成，1-已完成。仅当AutoRag=1时，该字段有效
     * @param SearchStatus AutoRag搜索状态：0-未完成，1-已完成。仅当AutoRag=1时，该字段有效
     */
    public void setSearchStatus(Long SearchStatus) {
        this.SearchStatus = SearchStatus;
    }

    public SearchConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchConfig(SearchConfig source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.EmbeddingWeight != null) {
            this.EmbeddingWeight = new Float(source.EmbeddingWeight);
        }
        if (source.Rerank != null) {
            this.Rerank = new Long(source.Rerank);
        }
        if (source.AutoRag != null) {
            this.AutoRag = new Long(source.AutoRag);
        }
        if (source.KnowledgeBaseIds != null) {
            this.KnowledgeBaseIds = new String[source.KnowledgeBaseIds.length];
            for (int i = 0; i < source.KnowledgeBaseIds.length; i++) {
                this.KnowledgeBaseIds[i] = new String(source.KnowledgeBaseIds[i]);
            }
        }
        if (source.SearchStatus != null) {
            this.SearchStatus = new Long(source.SearchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "EmbeddingWeight", this.EmbeddingWeight);
        this.setParamSimple(map, prefix + "Rerank", this.Rerank);
        this.setParamSimple(map, prefix + "AutoRag", this.AutoRag);
        this.setParamArraySimple(map, prefix + "KnowledgeBaseIds.", this.KnowledgeBaseIds);
        this.setParamSimple(map, prefix + "SearchStatus", this.SearchStatus);

    }
}

