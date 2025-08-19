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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareKnowledgeBase extends AbstractModel {

    /**
    * 共享知识库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * 检索范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchRange")
    @Expose
    private SearchRange SearchRange;

    /**
    * 知识库模型设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeModelConfig")
    @Expose
    private KnowledgeModelConfig KnowledgeModelConfig;

    /**
    * 检索策略配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchStrategy")
    @Expose
    private SearchStrategy SearchStrategy;

    /**
    * 检索配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Search")
    @Expose
    private KnowledgeQaSearch [] Search;

    /**
    * // 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyFlexibility")
    @Expose
    private Long ReplyFlexibility;

    /**
    * 共享知识库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
     * Get 共享知识库ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeBizId 共享知识库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 共享知识库ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeBizId 共享知识库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 检索范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchRange 检索范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchRange getSearchRange() {
        return this.SearchRange;
    }

    /**
     * Set 检索范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchRange 检索范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchRange(SearchRange SearchRange) {
        this.SearchRange = SearchRange;
    }

    /**
     * Get 知识库模型设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeModelConfig 知识库模型设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeModelConfig getKnowledgeModelConfig() {
        return this.KnowledgeModelConfig;
    }

    /**
     * Set 知识库模型设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeModelConfig 知识库模型设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeModelConfig(KnowledgeModelConfig KnowledgeModelConfig) {
        this.KnowledgeModelConfig = KnowledgeModelConfig;
    }

    /**
     * Get 检索策略配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchStrategy 检索策略配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchStrategy getSearchStrategy() {
        return this.SearchStrategy;
    }

    /**
     * Set 检索策略配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchStrategy 检索策略配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchStrategy(SearchStrategy SearchStrategy) {
        this.SearchStrategy = SearchStrategy;
    }

    /**
     * Get 检索配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Search 检索配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaSearch [] getSearch() {
        return this.Search;
    }

    /**
     * Set 检索配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Search 检索配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearch(KnowledgeQaSearch [] Search) {
        this.Search = Search;
    }

    /**
     * Get // 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyFlexibility // 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplyFlexibility() {
        return this.ReplyFlexibility;
    }

    /**
     * Set // 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyFlexibility // 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyFlexibility(Long ReplyFlexibility) {
        this.ReplyFlexibility = ReplyFlexibility;
    }

    /**
     * Get 共享知识库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeName 共享知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 共享知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeName 共享知识库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    public ShareKnowledgeBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareKnowledgeBase(ShareKnowledgeBase source) {
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.SearchRange != null) {
            this.SearchRange = new SearchRange(source.SearchRange);
        }
        if (source.KnowledgeModelConfig != null) {
            this.KnowledgeModelConfig = new KnowledgeModelConfig(source.KnowledgeModelConfig);
        }
        if (source.SearchStrategy != null) {
            this.SearchStrategy = new SearchStrategy(source.SearchStrategy);
        }
        if (source.Search != null) {
            this.Search = new KnowledgeQaSearch[source.Search.length];
            for (int i = 0; i < source.Search.length; i++) {
                this.Search[i] = new KnowledgeQaSearch(source.Search[i]);
            }
        }
        if (source.ReplyFlexibility != null) {
            this.ReplyFlexibility = new Long(source.ReplyFlexibility);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamObj(map, prefix + "SearchRange.", this.SearchRange);
        this.setParamObj(map, prefix + "KnowledgeModelConfig.", this.KnowledgeModelConfig);
        this.setParamObj(map, prefix + "SearchStrategy.", this.SearchStrategy);
        this.setParamArrayObj(map, prefix + "Search.", this.Search);
        this.setParamSimple(map, prefix + "ReplyFlexibility", this.ReplyFlexibility);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);

    }
}

