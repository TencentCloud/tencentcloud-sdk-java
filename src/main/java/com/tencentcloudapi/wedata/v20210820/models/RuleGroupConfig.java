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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupConfig extends AbstractModel {

    /**
    * 分析类型，可选值：
INFERENCE-推理表
TIME_SERIES-时序表
SNAPSHOT-快照表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisType")
    @Expose
    private String AnalysisType;

    /**
    * 模型检测类型，分析类型为推理表（INFERENCE）时必填，可选值：
CLAASSIFICATION-分类
REGRESSION-回归
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelMonitorType")
    @Expose
    private String ModelMonitorType;

    /**
    * 预测列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PredictColumn")
    @Expose
    private String PredictColumn;

    /**
    * 预测列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PredictColumnType")
    @Expose
    private String PredictColumnType;

    /**
    * 标签列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelColumn")
    @Expose
    private String LabelColumn;

    /**
    * 标签列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelColumnType")
    @Expose
    private String LabelColumnType;

    /**
    * 模型id列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelIdColumn")
    @Expose
    private String ModelIdColumn;

    /**
    * 模型id列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelIdColumnType")
    @Expose
    private String ModelIdColumnType;

    /**
    * 时间戳列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimestampColumn")
    @Expose
    private String TimestampColumn;

    /**
    * 时间戳列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimestampColumnType")
    @Expose
    private String TimestampColumnType;

    /**
    * 指标粒度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * 指标粒度单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GranularityType")
    @Expose
    private String GranularityType;

    /**
    * 基准表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseTable")
    @Expose
    private String BaseTable;

    /**
    * 基准库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseDb")
    @Expose
    private String BaseDb;

    /**
    * 对比列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComparisonColumn")
    @Expose
    private String ComparisonColumn;

    /**
    * 对比列类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComparisonColumnType")
    @Expose
    private String ComparisonColumnType;

    /**
    * 保护组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectionValue")
    @Expose
    private String ProtectionValue;

    /**
    * 正类值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PositiveValue")
    @Expose
    private String PositiveValue;

    /**
    * 数值型特征列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeatureColumn")
    @Expose
    private String FeatureColumn;

    /**
    * 分类型特征列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoricalFeatureColumn")
    @Expose
    private String CategoricalFeatureColumn;

    /**
    * 目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseCatalog")
    @Expose
    private String BaseCatalog;

    /**
     * Get 分析类型，可选值：
INFERENCE-推理表
TIME_SERIES-时序表
SNAPSHOT-快照表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisType 分析类型，可选值：
INFERENCE-推理表
TIME_SERIES-时序表
SNAPSHOT-快照表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnalysisType() {
        return this.AnalysisType;
    }

    /**
     * Set 分析类型，可选值：
INFERENCE-推理表
TIME_SERIES-时序表
SNAPSHOT-快照表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisType 分析类型，可选值：
INFERENCE-推理表
TIME_SERIES-时序表
SNAPSHOT-快照表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisType(String AnalysisType) {
        this.AnalysisType = AnalysisType;
    }

    /**
     * Get 模型检测类型，分析类型为推理表（INFERENCE）时必填，可选值：
CLAASSIFICATION-分类
REGRESSION-回归
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelMonitorType 模型检测类型，分析类型为推理表（INFERENCE）时必填，可选值：
CLAASSIFICATION-分类
REGRESSION-回归
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelMonitorType() {
        return this.ModelMonitorType;
    }

    /**
     * Set 模型检测类型，分析类型为推理表（INFERENCE）时必填，可选值：
CLAASSIFICATION-分类
REGRESSION-回归
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelMonitorType 模型检测类型，分析类型为推理表（INFERENCE）时必填，可选值：
CLAASSIFICATION-分类
REGRESSION-回归
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelMonitorType(String ModelMonitorType) {
        this.ModelMonitorType = ModelMonitorType;
    }

    /**
     * Get 预测列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PredictColumn 预测列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPredictColumn() {
        return this.PredictColumn;
    }

    /**
     * Set 预测列
注意：此字段可能返回 null，表示取不到有效值。
     * @param PredictColumn 预测列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPredictColumn(String PredictColumn) {
        this.PredictColumn = PredictColumn;
    }

    /**
     * Get 预测列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PredictColumnType 预测列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPredictColumnType() {
        return this.PredictColumnType;
    }

    /**
     * Set 预测列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PredictColumnType 预测列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPredictColumnType(String PredictColumnType) {
        this.PredictColumnType = PredictColumnType;
    }

    /**
     * Get 标签列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelColumn 标签列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelColumn() {
        return this.LabelColumn;
    }

    /**
     * Set 标签列
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelColumn 标签列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelColumn(String LabelColumn) {
        this.LabelColumn = LabelColumn;
    }

    /**
     * Get 标签列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelColumnType 标签列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelColumnType() {
        return this.LabelColumnType;
    }

    /**
     * Set 标签列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelColumnType 标签列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelColumnType(String LabelColumnType) {
        this.LabelColumnType = LabelColumnType;
    }

    /**
     * Get 模型id列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelIdColumn 模型id列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelIdColumn() {
        return this.ModelIdColumn;
    }

    /**
     * Set 模型id列
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelIdColumn 模型id列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelIdColumn(String ModelIdColumn) {
        this.ModelIdColumn = ModelIdColumn;
    }

    /**
     * Get 模型id列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelIdColumnType 模型id列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelIdColumnType() {
        return this.ModelIdColumnType;
    }

    /**
     * Set 模型id列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelIdColumnType 模型id列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelIdColumnType(String ModelIdColumnType) {
        this.ModelIdColumnType = ModelIdColumnType;
    }

    /**
     * Get 时间戳列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimestampColumn 时间戳列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestampColumn() {
        return this.TimestampColumn;
    }

    /**
     * Set 时间戳列
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimestampColumn 时间戳列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestampColumn(String TimestampColumn) {
        this.TimestampColumn = TimestampColumn;
    }

    /**
     * Get 时间戳列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimestampColumnType 时间戳列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimestampColumnType() {
        return this.TimestampColumnType;
    }

    /**
     * Set 时间戳列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimestampColumnType 时间戳列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestampColumnType(String TimestampColumnType) {
        this.TimestampColumnType = TimestampColumnType;
    }

    /**
     * Get 指标粒度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Granularity 指标粒度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 指标粒度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Granularity 指标粒度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 指标粒度单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GranularityType 指标粒度单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGranularityType() {
        return this.GranularityType;
    }

    /**
     * Set 指标粒度单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param GranularityType 指标粒度单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGranularityType(String GranularityType) {
        this.GranularityType = GranularityType;
    }

    /**
     * Get 基准表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseTable 基准表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaseTable() {
        return this.BaseTable;
    }

    /**
     * Set 基准表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseTable 基准表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseTable(String BaseTable) {
        this.BaseTable = BaseTable;
    }

    /**
     * Get 基准库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseDb 基准库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaseDb() {
        return this.BaseDb;
    }

    /**
     * Set 基准库
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseDb 基准库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseDb(String BaseDb) {
        this.BaseDb = BaseDb;
    }

    /**
     * Get 对比列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComparisonColumn 对比列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparisonColumn() {
        return this.ComparisonColumn;
    }

    /**
     * Set 对比列
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComparisonColumn 对比列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparisonColumn(String ComparisonColumn) {
        this.ComparisonColumn = ComparisonColumn;
    }

    /**
     * Get 对比列类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComparisonColumnType 对比列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComparisonColumnType() {
        return this.ComparisonColumnType;
    }

    /**
     * Set 对比列类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComparisonColumnType 对比列类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComparisonColumnType(String ComparisonColumnType) {
        this.ComparisonColumnType = ComparisonColumnType;
    }

    /**
     * Get 保护组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectionValue 保护组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectionValue() {
        return this.ProtectionValue;
    }

    /**
     * Set 保护组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectionValue 保护组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectionValue(String ProtectionValue) {
        this.ProtectionValue = ProtectionValue;
    }

    /**
     * Get 正类值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PositiveValue 正类值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPositiveValue() {
        return this.PositiveValue;
    }

    /**
     * Set 正类值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PositiveValue 正类值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositiveValue(String PositiveValue) {
        this.PositiveValue = PositiveValue;
    }

    /**
     * Get 数值型特征列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeatureColumn 数值型特征列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeatureColumn() {
        return this.FeatureColumn;
    }

    /**
     * Set 数值型特征列
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeatureColumn 数值型特征列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeatureColumn(String FeatureColumn) {
        this.FeatureColumn = FeatureColumn;
    }

    /**
     * Get 分类型特征列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoricalFeatureColumn 分类型特征列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoricalFeatureColumn() {
        return this.CategoricalFeatureColumn;
    }

    /**
     * Set 分类型特征列
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoricalFeatureColumn 分类型特征列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoricalFeatureColumn(String CategoricalFeatureColumn) {
        this.CategoricalFeatureColumn = CategoricalFeatureColumn;
    }

    /**
     * Get 目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseCatalog 目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaseCatalog() {
        return this.BaseCatalog;
    }

    /**
     * Set 目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseCatalog 目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseCatalog(String BaseCatalog) {
        this.BaseCatalog = BaseCatalog;
    }

    public RuleGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupConfig(RuleGroupConfig source) {
        if (source.AnalysisType != null) {
            this.AnalysisType = new String(source.AnalysisType);
        }
        if (source.ModelMonitorType != null) {
            this.ModelMonitorType = new String(source.ModelMonitorType);
        }
        if (source.PredictColumn != null) {
            this.PredictColumn = new String(source.PredictColumn);
        }
        if (source.PredictColumnType != null) {
            this.PredictColumnType = new String(source.PredictColumnType);
        }
        if (source.LabelColumn != null) {
            this.LabelColumn = new String(source.LabelColumn);
        }
        if (source.LabelColumnType != null) {
            this.LabelColumnType = new String(source.LabelColumnType);
        }
        if (source.ModelIdColumn != null) {
            this.ModelIdColumn = new String(source.ModelIdColumn);
        }
        if (source.ModelIdColumnType != null) {
            this.ModelIdColumnType = new String(source.ModelIdColumnType);
        }
        if (source.TimestampColumn != null) {
            this.TimestampColumn = new String(source.TimestampColumn);
        }
        if (source.TimestampColumnType != null) {
            this.TimestampColumnType = new String(source.TimestampColumnType);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
        if (source.GranularityType != null) {
            this.GranularityType = new String(source.GranularityType);
        }
        if (source.BaseTable != null) {
            this.BaseTable = new String(source.BaseTable);
        }
        if (source.BaseDb != null) {
            this.BaseDb = new String(source.BaseDb);
        }
        if (source.ComparisonColumn != null) {
            this.ComparisonColumn = new String(source.ComparisonColumn);
        }
        if (source.ComparisonColumnType != null) {
            this.ComparisonColumnType = new String(source.ComparisonColumnType);
        }
        if (source.ProtectionValue != null) {
            this.ProtectionValue = new String(source.ProtectionValue);
        }
        if (source.PositiveValue != null) {
            this.PositiveValue = new String(source.PositiveValue);
        }
        if (source.FeatureColumn != null) {
            this.FeatureColumn = new String(source.FeatureColumn);
        }
        if (source.CategoricalFeatureColumn != null) {
            this.CategoricalFeatureColumn = new String(source.CategoricalFeatureColumn);
        }
        if (source.BaseCatalog != null) {
            this.BaseCatalog = new String(source.BaseCatalog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnalysisType", this.AnalysisType);
        this.setParamSimple(map, prefix + "ModelMonitorType", this.ModelMonitorType);
        this.setParamSimple(map, prefix + "PredictColumn", this.PredictColumn);
        this.setParamSimple(map, prefix + "PredictColumnType", this.PredictColumnType);
        this.setParamSimple(map, prefix + "LabelColumn", this.LabelColumn);
        this.setParamSimple(map, prefix + "LabelColumnType", this.LabelColumnType);
        this.setParamSimple(map, prefix + "ModelIdColumn", this.ModelIdColumn);
        this.setParamSimple(map, prefix + "ModelIdColumnType", this.ModelIdColumnType);
        this.setParamSimple(map, prefix + "TimestampColumn", this.TimestampColumn);
        this.setParamSimple(map, prefix + "TimestampColumnType", this.TimestampColumnType);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "GranularityType", this.GranularityType);
        this.setParamSimple(map, prefix + "BaseTable", this.BaseTable);
        this.setParamSimple(map, prefix + "BaseDb", this.BaseDb);
        this.setParamSimple(map, prefix + "ComparisonColumn", this.ComparisonColumn);
        this.setParamSimple(map, prefix + "ComparisonColumnType", this.ComparisonColumnType);
        this.setParamSimple(map, prefix + "ProtectionValue", this.ProtectionValue);
        this.setParamSimple(map, prefix + "PositiveValue", this.PositiveValue);
        this.setParamSimple(map, prefix + "FeatureColumn", this.FeatureColumn);
        this.setParamSimple(map, prefix + "CategoricalFeatureColumn", this.CategoricalFeatureColumn);
        this.setParamSimple(map, prefix + "BaseCatalog", this.BaseCatalog);

    }
}

