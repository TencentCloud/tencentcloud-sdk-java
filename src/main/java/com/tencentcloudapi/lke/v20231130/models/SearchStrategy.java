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

public class SearchStrategy extends AbstractModel {

    /**
    * 检索策略类型 0:混合检索，1：语义检索
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Excel检索增强开关, false关闭，true打开
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableEnhancement")
    @Expose
    private Boolean TableEnhancement;

    /**
    * 向量模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
    * 结果重排序开关， on打开，off关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerankModelSwitch")
    @Expose
    private String RerankModelSwitch;

    /**
    * 结果重排序模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerankModel")
    @Expose
    private String RerankModel;

    /**
    * NL2SQL模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatureLanguageToSqlModelConfig")
    @Expose
    private NL2SQLModelConfig NatureLanguageToSqlModelConfig;

    /**
     * Get 检索策略类型 0:混合检索，1：语义检索
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyType 检索策略类型 0:混合检索，1：语义检索
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 检索策略类型 0:混合检索，1：语义检索
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyType 检索策略类型 0:混合检索，1：语义检索
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Excel检索增强开关, false关闭，true打开
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableEnhancement Excel检索增强开关, false关闭，true打开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTableEnhancement() {
        return this.TableEnhancement;
    }

    /**
     * Set Excel检索增强开关, false关闭，true打开
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableEnhancement Excel检索增强开关, false关闭，true打开
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableEnhancement(Boolean TableEnhancement) {
        this.TableEnhancement = TableEnhancement;
    }

    /**
     * Get 向量模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmbeddingModel 向量模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set 向量模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmbeddingModel 向量模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    /**
     * Get 结果重排序开关， on打开，off关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RerankModelSwitch 结果重排序开关， on打开，off关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRerankModelSwitch() {
        return this.RerankModelSwitch;
    }

    /**
     * Set 结果重排序开关， on打开，off关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param RerankModelSwitch 结果重排序开关， on打开，off关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRerankModelSwitch(String RerankModelSwitch) {
        this.RerankModelSwitch = RerankModelSwitch;
    }

    /**
     * Get 结果重排序模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RerankModel 结果重排序模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRerankModel() {
        return this.RerankModel;
    }

    /**
     * Set 结果重排序模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RerankModel 结果重排序模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRerankModel(String RerankModel) {
        this.RerankModel = RerankModel;
    }

    /**
     * Get NL2SQL模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatureLanguageToSqlModelConfig NL2SQL模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NL2SQLModelConfig getNatureLanguageToSqlModelConfig() {
        return this.NatureLanguageToSqlModelConfig;
    }

    /**
     * Set NL2SQL模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatureLanguageToSqlModelConfig NL2SQL模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatureLanguageToSqlModelConfig(NL2SQLModelConfig NatureLanguageToSqlModelConfig) {
        this.NatureLanguageToSqlModelConfig = NatureLanguageToSqlModelConfig;
    }

    public SearchStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchStrategy(SearchStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.TableEnhancement != null) {
            this.TableEnhancement = new Boolean(source.TableEnhancement);
        }
        if (source.EmbeddingModel != null) {
            this.EmbeddingModel = new String(source.EmbeddingModel);
        }
        if (source.RerankModelSwitch != null) {
            this.RerankModelSwitch = new String(source.RerankModelSwitch);
        }
        if (source.RerankModel != null) {
            this.RerankModel = new String(source.RerankModel);
        }
        if (source.NatureLanguageToSqlModelConfig != null) {
            this.NatureLanguageToSqlModelConfig = new NL2SQLModelConfig(source.NatureLanguageToSqlModelConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "TableEnhancement", this.TableEnhancement);
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);
        this.setParamSimple(map, prefix + "RerankModelSwitch", this.RerankModelSwitch);
        this.setParamSimple(map, prefix + "RerankModel", this.RerankModel);
        this.setParamObj(map, prefix + "NatureLanguageToSqlModelConfig.", this.NatureLanguageToSqlModelConfig);

    }
}

