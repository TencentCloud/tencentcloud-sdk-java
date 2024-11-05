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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchInfo extends AbstractModel {

    /**
    * 搜索引文信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchResults")
    @Expose
    private SearchResult [] SearchResults;

    /**
    * 脑图（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mindmap")
    @Expose
    private Mindmap Mindmap;

    /**
    * 相关事件（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevantEvents")
    @Expose
    private RelevantEvent [] RelevantEvents;

    /**
    * 相关组织及人物（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevantEntities")
    @Expose
    private RelevantEntity [] RelevantEntities;

    /**
    * 时间线（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeline")
    @Expose
    private Timeline [] Timeline;

    /**
    * 是否命中搜索深度模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDeepSearch")
    @Expose
    private Boolean SupportDeepSearch;

    /**
    * 搜索回复大纲（深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Outline")
    @Expose
    private String [] Outline;

    /**
     * Get 搜索引文信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchResults 搜索引文信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchResult [] getSearchResults() {
        return this.SearchResults;
    }

    /**
     * Set 搜索引文信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchResults 搜索引文信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchResults(SearchResult [] SearchResults) {
        this.SearchResults = SearchResults;
    }

    /**
     * Get 脑图（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mindmap 脑图（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Mindmap getMindmap() {
        return this.Mindmap;
    }

    /**
     * Set 脑图（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mindmap 脑图（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMindmap(Mindmap Mindmap) {
        this.Mindmap = Mindmap;
    }

    /**
     * Get 相关事件（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevantEvents 相关事件（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelevantEvent [] getRelevantEvents() {
        return this.RelevantEvents;
    }

    /**
     * Set 相关事件（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevantEvents 相关事件（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevantEvents(RelevantEvent [] RelevantEvents) {
        this.RelevantEvents = RelevantEvents;
    }

    /**
     * Get 相关组织及人物（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevantEntities 相关组织及人物（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelevantEntity [] getRelevantEntities() {
        return this.RelevantEntities;
    }

    /**
     * Set 相关组织及人物（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevantEntities 相关组织及人物（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevantEntities(RelevantEntity [] RelevantEntities) {
        this.RelevantEntities = RelevantEntities;
    }

    /**
     * Get 时间线（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeline 时间线（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Timeline [] getTimeline() {
        return this.Timeline;
    }

    /**
     * Set 时间线（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeline 时间线（回复中不一定存在，流式协议中，仅在最后一条流式数据中返回，深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeline(Timeline [] Timeline) {
        this.Timeline = Timeline;
    }

    /**
     * Get 是否命中搜索深度模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDeepSearch 是否命中搜索深度模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportDeepSearch() {
        return this.SupportDeepSearch;
    }

    /**
     * Set 是否命中搜索深度模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDeepSearch 是否命中搜索深度模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDeepSearch(Boolean SupportDeepSearch) {
        this.SupportDeepSearch = SupportDeepSearch;
    }

    /**
     * Get 搜索回复大纲（深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Outline 搜索回复大纲（深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOutline() {
        return this.Outline;
    }

    /**
     * Set 搜索回复大纲（深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Outline 搜索回复大纲（深度模式下返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutline(String [] Outline) {
        this.Outline = Outline;
    }

    public SearchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchInfo(SearchInfo source) {
        if (source.SearchResults != null) {
            this.SearchResults = new SearchResult[source.SearchResults.length];
            for (int i = 0; i < source.SearchResults.length; i++) {
                this.SearchResults[i] = new SearchResult(source.SearchResults[i]);
            }
        }
        if (source.Mindmap != null) {
            this.Mindmap = new Mindmap(source.Mindmap);
        }
        if (source.RelevantEvents != null) {
            this.RelevantEvents = new RelevantEvent[source.RelevantEvents.length];
            for (int i = 0; i < source.RelevantEvents.length; i++) {
                this.RelevantEvents[i] = new RelevantEvent(source.RelevantEvents[i]);
            }
        }
        if (source.RelevantEntities != null) {
            this.RelevantEntities = new RelevantEntity[source.RelevantEntities.length];
            for (int i = 0; i < source.RelevantEntities.length; i++) {
                this.RelevantEntities[i] = new RelevantEntity(source.RelevantEntities[i]);
            }
        }
        if (source.Timeline != null) {
            this.Timeline = new Timeline[source.Timeline.length];
            for (int i = 0; i < source.Timeline.length; i++) {
                this.Timeline[i] = new Timeline(source.Timeline[i]);
            }
        }
        if (source.SupportDeepSearch != null) {
            this.SupportDeepSearch = new Boolean(source.SupportDeepSearch);
        }
        if (source.Outline != null) {
            this.Outline = new String[source.Outline.length];
            for (int i = 0; i < source.Outline.length; i++) {
                this.Outline[i] = new String(source.Outline[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SearchResults.", this.SearchResults);
        this.setParamObj(map, prefix + "Mindmap.", this.Mindmap);
        this.setParamArrayObj(map, prefix + "RelevantEvents.", this.RelevantEvents);
        this.setParamArrayObj(map, prefix + "RelevantEntities.", this.RelevantEntities);
        this.setParamArrayObj(map, prefix + "Timeline.", this.Timeline);
        this.setParamSimple(map, prefix + "SupportDeepSearch", this.SupportDeepSearch);
        this.setParamArraySimple(map, prefix + "Outline.", this.Outline);

    }
}

