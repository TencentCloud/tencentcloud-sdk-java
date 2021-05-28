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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableSpaceTimeSeries extends AbstractModel{

    /**
    * 表名。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 库名。
    */
    @SerializedName("TableSchema")
    @Expose
    private String TableSchema;

    /**
    * 库表的存储引擎。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 单位时间间隔内的空间指标数据。
    */
    @SerializedName("SeriesData")
    @Expose
    private MonitorFloatMetricSeriesData SeriesData;

    /**
     * Get 表名。 
     * @return TableName 表名。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名。
     * @param TableName 表名。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 库名。 
     * @return TableSchema 库名。
     */
    public String getTableSchema() {
        return this.TableSchema;
    }

    /**
     * Set 库名。
     * @param TableSchema 库名。
     */
    public void setTableSchema(String TableSchema) {
        this.TableSchema = TableSchema;
    }

    /**
     * Get 库表的存储引擎。 
     * @return Engine 库表的存储引擎。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 库表的存储引擎。
     * @param Engine 库表的存储引擎。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 单位时间间隔内的空间指标数据。 
     * @return SeriesData 单位时间间隔内的空间指标数据。
     */
    public MonitorFloatMetricSeriesData getSeriesData() {
        return this.SeriesData;
    }

    /**
     * Set 单位时间间隔内的空间指标数据。
     * @param SeriesData 单位时间间隔内的空间指标数据。
     */
    public void setSeriesData(MonitorFloatMetricSeriesData SeriesData) {
        this.SeriesData = SeriesData;
    }

    public TableSpaceTimeSeries() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableSpaceTimeSeries(TableSpaceTimeSeries source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableSchema != null) {
            this.TableSchema = new String(source.TableSchema);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.SeriesData != null) {
            this.SeriesData = new MonitorFloatMetricSeriesData(source.SeriesData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableSchema", this.TableSchema);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamObj(map, prefix + "SeriesData.", this.SeriesData);

    }
}

