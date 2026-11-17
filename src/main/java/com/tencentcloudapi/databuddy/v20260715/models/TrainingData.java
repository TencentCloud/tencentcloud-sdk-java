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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainingData extends AbstractModel {

    /**
    * Catalog名称
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Schema名称
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * Table名称
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 目标标签列
    */
    @SerializedName("TargetLabel")
    @Expose
    private Label TargetLabel;

    /**
    * 忽略的列
    */
    @SerializedName("DiscardedLabels")
    @Expose
    private Label [] DiscardedLabels;

    /**
    * 预测列
    */
    @SerializedName("PredictionLabel")
    @Expose
    private Label PredictionLabel;

    /**
    * 时间间隔单位
    */
    @SerializedName("EvaluationInterval")
    @Expose
    private String EvaluationInterval;

    /**
    * 时序步长
    */
    @SerializedName("ForecastHorizon")
    @Expose
    private Long ForecastHorizon;

    /**
    * 结果集Catalog名称
    */
    @SerializedName("StorageCatalog")
    @Expose
    private String StorageCatalog;

    /**
    * 结果集Schema名称
    */
    @SerializedName("StorageSchema")
    @Expose
    private String StorageSchema;

    /**
    * 结果集Table名称
    */
    @SerializedName("StorageTable")
    @Expose
    private String StorageTable;

    /**
    * 选中的列
    */
    @SerializedName("SelectedLabels")
    @Expose
    private Label [] SelectedLabels;

    /**
    * 特征查找配置
    */
    @SerializedName("FeatureLookup")
    @Expose
    private FeatureLookup [] FeatureLookup;

    /**
     * Get Catalog名称 
     * @return Catalog Catalog名称
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog名称
     * @param Catalog Catalog名称
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Schema名称 
     * @return Schema Schema名称
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set Schema名称
     * @param Schema Schema名称
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get Table名称 
     * @return Table Table名称
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table名称
     * @param Table Table名称
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 目标标签列 
     * @return TargetLabel 目标标签列
     */
    public Label getTargetLabel() {
        return this.TargetLabel;
    }

    /**
     * Set 目标标签列
     * @param TargetLabel 目标标签列
     */
    public void setTargetLabel(Label TargetLabel) {
        this.TargetLabel = TargetLabel;
    }

    /**
     * Get 忽略的列 
     * @return DiscardedLabels 忽略的列
     */
    public Label [] getDiscardedLabels() {
        return this.DiscardedLabels;
    }

    /**
     * Set 忽略的列
     * @param DiscardedLabels 忽略的列
     */
    public void setDiscardedLabels(Label [] DiscardedLabels) {
        this.DiscardedLabels = DiscardedLabels;
    }

    /**
     * Get 预测列 
     * @return PredictionLabel 预测列
     */
    public Label getPredictionLabel() {
        return this.PredictionLabel;
    }

    /**
     * Set 预测列
     * @param PredictionLabel 预测列
     */
    public void setPredictionLabel(Label PredictionLabel) {
        this.PredictionLabel = PredictionLabel;
    }

    /**
     * Get 时间间隔单位 
     * @return EvaluationInterval 时间间隔单位
     */
    public String getEvaluationInterval() {
        return this.EvaluationInterval;
    }

    /**
     * Set 时间间隔单位
     * @param EvaluationInterval 时间间隔单位
     */
    public void setEvaluationInterval(String EvaluationInterval) {
        this.EvaluationInterval = EvaluationInterval;
    }

    /**
     * Get 时序步长 
     * @return ForecastHorizon 时序步长
     */
    public Long getForecastHorizon() {
        return this.ForecastHorizon;
    }

    /**
     * Set 时序步长
     * @param ForecastHorizon 时序步长
     */
    public void setForecastHorizon(Long ForecastHorizon) {
        this.ForecastHorizon = ForecastHorizon;
    }

    /**
     * Get 结果集Catalog名称 
     * @return StorageCatalog 结果集Catalog名称
     */
    public String getStorageCatalog() {
        return this.StorageCatalog;
    }

    /**
     * Set 结果集Catalog名称
     * @param StorageCatalog 结果集Catalog名称
     */
    public void setStorageCatalog(String StorageCatalog) {
        this.StorageCatalog = StorageCatalog;
    }

    /**
     * Get 结果集Schema名称 
     * @return StorageSchema 结果集Schema名称
     */
    public String getStorageSchema() {
        return this.StorageSchema;
    }

    /**
     * Set 结果集Schema名称
     * @param StorageSchema 结果集Schema名称
     */
    public void setStorageSchema(String StorageSchema) {
        this.StorageSchema = StorageSchema;
    }

    /**
     * Get 结果集Table名称 
     * @return StorageTable 结果集Table名称
     */
    public String getStorageTable() {
        return this.StorageTable;
    }

    /**
     * Set 结果集Table名称
     * @param StorageTable 结果集Table名称
     */
    public void setStorageTable(String StorageTable) {
        this.StorageTable = StorageTable;
    }

    /**
     * Get 选中的列 
     * @return SelectedLabels 选中的列
     */
    public Label [] getSelectedLabels() {
        return this.SelectedLabels;
    }

    /**
     * Set 选中的列
     * @param SelectedLabels 选中的列
     */
    public void setSelectedLabels(Label [] SelectedLabels) {
        this.SelectedLabels = SelectedLabels;
    }

    /**
     * Get 特征查找配置 
     * @return FeatureLookup 特征查找配置
     */
    public FeatureLookup [] getFeatureLookup() {
        return this.FeatureLookup;
    }

    /**
     * Set 特征查找配置
     * @param FeatureLookup 特征查找配置
     */
    public void setFeatureLookup(FeatureLookup [] FeatureLookup) {
        this.FeatureLookup = FeatureLookup;
    }

    public TrainingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingData(TrainingData source) {
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.TargetLabel != null) {
            this.TargetLabel = new Label(source.TargetLabel);
        }
        if (source.DiscardedLabels != null) {
            this.DiscardedLabels = new Label[source.DiscardedLabels.length];
            for (int i = 0; i < source.DiscardedLabels.length; i++) {
                this.DiscardedLabels[i] = new Label(source.DiscardedLabels[i]);
            }
        }
        if (source.PredictionLabel != null) {
            this.PredictionLabel = new Label(source.PredictionLabel);
        }
        if (source.EvaluationInterval != null) {
            this.EvaluationInterval = new String(source.EvaluationInterval);
        }
        if (source.ForecastHorizon != null) {
            this.ForecastHorizon = new Long(source.ForecastHorizon);
        }
        if (source.StorageCatalog != null) {
            this.StorageCatalog = new String(source.StorageCatalog);
        }
        if (source.StorageSchema != null) {
            this.StorageSchema = new String(source.StorageSchema);
        }
        if (source.StorageTable != null) {
            this.StorageTable = new String(source.StorageTable);
        }
        if (source.SelectedLabels != null) {
            this.SelectedLabels = new Label[source.SelectedLabels.length];
            for (int i = 0; i < source.SelectedLabels.length; i++) {
                this.SelectedLabels[i] = new Label(source.SelectedLabels[i]);
            }
        }
        if (source.FeatureLookup != null) {
            this.FeatureLookup = new FeatureLookup[source.FeatureLookup.length];
            for (int i = 0; i < source.FeatureLookup.length; i++) {
                this.FeatureLookup[i] = new FeatureLookup(source.FeatureLookup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamObj(map, prefix + "TargetLabel.", this.TargetLabel);
        this.setParamArrayObj(map, prefix + "DiscardedLabels.", this.DiscardedLabels);
        this.setParamObj(map, prefix + "PredictionLabel.", this.PredictionLabel);
        this.setParamSimple(map, prefix + "EvaluationInterval", this.EvaluationInterval);
        this.setParamSimple(map, prefix + "ForecastHorizon", this.ForecastHorizon);
        this.setParamSimple(map, prefix + "StorageCatalog", this.StorageCatalog);
        this.setParamSimple(map, prefix + "StorageSchema", this.StorageSchema);
        this.setParamSimple(map, prefix + "StorageTable", this.StorageTable);
        this.setParamArrayObj(map, prefix + "SelectedLabels.", this.SelectedLabels);
        this.setParamArrayObj(map, prefix + "FeatureLookup.", this.FeatureLookup);

    }
}

