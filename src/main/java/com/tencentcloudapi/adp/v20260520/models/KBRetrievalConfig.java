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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBRetrievalConfig extends AbstractModel {

    /**
    * <p>数据库检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbRetrievalConfig")
    @Expose
    private DBRetrievalConfig DbRetrievalConfig;

    /**
    * <p>文档检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocRetrievalConfig")
    @Expose
    private DocRetrievalConfig DocRetrievalConfig;

    /**
    * <p>知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>检索可选配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionConfig")
    @Expose
    private RetrievalOption OptionConfig;

    /**
    * <p>QA 检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaRetrievalConfig")
    @Expose
    private QARetrievalConfig QaRetrievalConfig;

    /**
    * <p>rerank 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerankConfig")
    @Expose
    private RerankConfig RerankConfig;

    /**
    * <p>检索过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchFilterConfig")
    @Expose
    private SearchFilterConfig SearchFilterConfig;

    /**
    * <p>检索策略：1=混合，2=语义，3=关键词，4=无<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>混合检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>语义检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>关键词检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>无语义/向量检索</td></tr></tbody></table></p>
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * <p>text2sql 模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextToSqlModel")
    @Expose
    private ModelDetailInfo TextToSqlModel;

    /**
     * Get <p>数据库检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbRetrievalConfig <p>数据库检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBRetrievalConfig getDbRetrievalConfig() {
        return this.DbRetrievalConfig;
    }

    /**
     * Set <p>数据库检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbRetrievalConfig <p>数据库检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbRetrievalConfig(DBRetrievalConfig DbRetrievalConfig) {
        this.DbRetrievalConfig = DbRetrievalConfig;
    }

    /**
     * Get <p>文档检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocRetrievalConfig <p>文档检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocRetrievalConfig getDocRetrievalConfig() {
        return this.DocRetrievalConfig;
    }

    /**
     * Set <p>文档检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocRetrievalConfig <p>文档检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocRetrievalConfig(DocRetrievalConfig DocRetrievalConfig) {
        this.DocRetrievalConfig = DocRetrievalConfig;
    }

    /**
     * Get <p>知识库 ID</p> 
     * @return KbId <p>知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>知识库 ID</p>
     * @param KbId <p>知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>检索可选配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionConfig <p>检索可选配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RetrievalOption getOptionConfig() {
        return this.OptionConfig;
    }

    /**
     * Set <p>检索可选配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionConfig <p>检索可选配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionConfig(RetrievalOption OptionConfig) {
        this.OptionConfig = OptionConfig;
    }

    /**
     * Get <p>QA 检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaRetrievalConfig <p>QA 检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QARetrievalConfig getQaRetrievalConfig() {
        return this.QaRetrievalConfig;
    }

    /**
     * Set <p>QA 检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaRetrievalConfig <p>QA 检索配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaRetrievalConfig(QARetrievalConfig QaRetrievalConfig) {
        this.QaRetrievalConfig = QaRetrievalConfig;
    }

    /**
     * Get <p>rerank 配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RerankConfig <p>rerank 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RerankConfig getRerankConfig() {
        return this.RerankConfig;
    }

    /**
     * Set <p>rerank 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RerankConfig <p>rerank 配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRerankConfig(RerankConfig RerankConfig) {
        this.RerankConfig = RerankConfig;
    }

    /**
     * Get <p>检索过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchFilterConfig <p>检索过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchFilterConfig getSearchFilterConfig() {
        return this.SearchFilterConfig;
    }

    /**
     * Set <p>检索过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchFilterConfig <p>检索过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchFilterConfig(SearchFilterConfig SearchFilterConfig) {
        this.SearchFilterConfig = SearchFilterConfig;
    }

    /**
     * Get <p>检索策略：1=混合，2=语义，3=关键词，4=无<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>混合检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>语义检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>关键词检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>无语义/向量检索</td></tr></tbody></table></p> 
     * @return StrategyType <p>检索策略：1=混合，2=语义，3=关键词，4=无<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>混合检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>语义检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>关键词检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>无语义/向量检索</td></tr></tbody></table></p>
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>检索策略：1=混合，2=语义，3=关键词，4=无<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>混合检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>语义检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>关键词检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>无语义/向量检索</td></tr></tbody></table></p>
     * @param StrategyType <p>检索策略：1=混合，2=语义，3=关键词，4=无<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_STRATEGY_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_STRATEGY_TYPE_MIXING</td><td>1</td><td>混合检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_SEMANTIC</td><td>2</td><td>语义检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_KEYWORD</td><td>3</td><td>关键词检索</td></tr><tr><td>SEARCH_STRATEGY_TYPE_NONE</td><td>4</td><td>无语义/向量检索</td></tr></tbody></table></p>
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>text2sql 模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextToSqlModel <p>text2sql 模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelDetailInfo getTextToSqlModel() {
        return this.TextToSqlModel;
    }

    /**
     * Set <p>text2sql 模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextToSqlModel <p>text2sql 模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextToSqlModel(ModelDetailInfo TextToSqlModel) {
        this.TextToSqlModel = TextToSqlModel;
    }

    public KBRetrievalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBRetrievalConfig(KBRetrievalConfig source) {
        if (source.DbRetrievalConfig != null) {
            this.DbRetrievalConfig = new DBRetrievalConfig(source.DbRetrievalConfig);
        }
        if (source.DocRetrievalConfig != null) {
            this.DocRetrievalConfig = new DocRetrievalConfig(source.DocRetrievalConfig);
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.OptionConfig != null) {
            this.OptionConfig = new RetrievalOption(source.OptionConfig);
        }
        if (source.QaRetrievalConfig != null) {
            this.QaRetrievalConfig = new QARetrievalConfig(source.QaRetrievalConfig);
        }
        if (source.RerankConfig != null) {
            this.RerankConfig = new RerankConfig(source.RerankConfig);
        }
        if (source.SearchFilterConfig != null) {
            this.SearchFilterConfig = new SearchFilterConfig(source.SearchFilterConfig);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.TextToSqlModel != null) {
            this.TextToSqlModel = new ModelDetailInfo(source.TextToSqlModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DbRetrievalConfig.", this.DbRetrievalConfig);
        this.setParamObj(map, prefix + "DocRetrievalConfig.", this.DocRetrievalConfig);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "OptionConfig.", this.OptionConfig);
        this.setParamObj(map, prefix + "QaRetrievalConfig.", this.QaRetrievalConfig);
        this.setParamObj(map, prefix + "RerankConfig.", this.RerankConfig);
        this.setParamObj(map, prefix + "SearchFilterConfig.", this.SearchFilterConfig);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamObj(map, prefix + "TextToSqlModel.", this.TextToSqlModel);

    }
}

