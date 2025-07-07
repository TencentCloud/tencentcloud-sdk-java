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

public class KnowledgeQaSearch extends AbstractModel {

    /**
    * 知识来源 doc：文档，qa：问答  taskflow：业务流程，search：搜索增强，database:数据库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyFlexibility")
    @Expose
    private Long ReplyFlexibility;

    /**
    * 搜索增强-搜索引擎状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseSearchEngine")
    @Expose
    private Boolean UseSearchEngine;

    /**
    * 是否显示搜索引擎检索状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowSearchEngine")
    @Expose
    private Boolean ShowSearchEngine;

    /**
    * 知识来源，是否选择
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnabled")
    @Expose
    private Boolean IsEnabled;

    /**
    * 问答最大召回数量, 默认2，限制5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaTopN")
    @Expose
    private Long QaTopN;

    /**
    * 文档最大召回数量, 默认3，限制5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocTopN")
    @Expose
    private Long DocTopN;

    /**
    * 检索置信度，针对文档和问答有效，最小0.01，最大0.99
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceStatus")
    @Expose
    private Long ResourceStatus;

    /**
     * Get 知识来源 doc：文档，qa：问答  taskflow：业务流程，search：搜索增强，database:数据库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 知识来源 doc：文档，qa：问答  taskflow：业务流程，search：搜索增强，database:数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 知识来源 doc：文档，qa：问答  taskflow：业务流程，search：搜索增强，database:数据库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 知识来源 doc：文档，qa：问答  taskflow：业务流程，search：搜索增强，database:数据库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyFlexibility 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplyFlexibility() {
        return this.ReplyFlexibility;
    }

    /**
     * Set 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyFlexibility 问答-回复灵活度 1：已采纳答案直接回复 2：已采纳润色后回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyFlexibility(Long ReplyFlexibility) {
        this.ReplyFlexibility = ReplyFlexibility;
    }

    /**
     * Get 搜索增强-搜索引擎状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseSearchEngine 搜索增强-搜索引擎状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseSearchEngine() {
        return this.UseSearchEngine;
    }

    /**
     * Set 搜索增强-搜索引擎状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseSearchEngine 搜索增强-搜索引擎状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseSearchEngine(Boolean UseSearchEngine) {
        this.UseSearchEngine = UseSearchEngine;
    }

    /**
     * Get 是否显示搜索引擎检索状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowSearchEngine 是否显示搜索引擎检索状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowSearchEngine() {
        return this.ShowSearchEngine;
    }

    /**
     * Set 是否显示搜索引擎检索状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowSearchEngine 是否显示搜索引擎检索状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowSearchEngine(Boolean ShowSearchEngine) {
        this.ShowSearchEngine = ShowSearchEngine;
    }

    /**
     * Get 知识来源，是否选择
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnabled 知识来源，是否选择
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 知识来源，是否选择
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnabled 知识来源，是否选择
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 问答最大召回数量, 默认2，限制5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaTopN 问答最大召回数量, 默认2，限制5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQaTopN() {
        return this.QaTopN;
    }

    /**
     * Set 问答最大召回数量, 默认2，限制5
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaTopN 问答最大召回数量, 默认2，限制5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaTopN(Long QaTopN) {
        this.QaTopN = QaTopN;
    }

    /**
     * Get 文档最大召回数量, 默认3，限制5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocTopN 文档最大召回数量, 默认3，限制5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDocTopN() {
        return this.DocTopN;
    }

    /**
     * Set 文档最大召回数量, 默认3，限制5
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocTopN 文档最大召回数量, 默认3，限制5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocTopN(Long DocTopN) {
        this.DocTopN = DocTopN;
    }

    /**
     * Get 检索置信度，针对文档和问答有效，最小0.01，最大0.99
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 检索置信度，针对文档和问答有效，最小0.01，最大0.99
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 检索置信度，针对文档和问答有效，最小0.01，最大0.99
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 检索置信度，针对文档和问答有效，最小0.01，最大0.99
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceStatus 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceStatus() {
        return this.ResourceStatus;
    }

    /**
     * Set 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceStatus 资源状态 1：资源可用；2：资源已用尽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceStatus(Long ResourceStatus) {
        this.ResourceStatus = ResourceStatus;
    }

    public KnowledgeQaSearch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaSearch(KnowledgeQaSearch source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ReplyFlexibility != null) {
            this.ReplyFlexibility = new Long(source.ReplyFlexibility);
        }
        if (source.UseSearchEngine != null) {
            this.UseSearchEngine = new Boolean(source.UseSearchEngine);
        }
        if (source.ShowSearchEngine != null) {
            this.ShowSearchEngine = new Boolean(source.ShowSearchEngine);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Boolean(source.IsEnabled);
        }
        if (source.QaTopN != null) {
            this.QaTopN = new Long(source.QaTopN);
        }
        if (source.DocTopN != null) {
            this.DocTopN = new Long(source.DocTopN);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.ResourceStatus != null) {
            this.ResourceStatus = new Long(source.ResourceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ReplyFlexibility", this.ReplyFlexibility);
        this.setParamSimple(map, prefix + "UseSearchEngine", this.UseSearchEngine);
        this.setParamSimple(map, prefix + "ShowSearchEngine", this.ShowSearchEngine);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "QaTopN", this.QaTopN);
        this.setParamSimple(map, prefix + "DocTopN", this.DocTopN);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "ResourceStatus", this.ResourceStatus);

    }
}

