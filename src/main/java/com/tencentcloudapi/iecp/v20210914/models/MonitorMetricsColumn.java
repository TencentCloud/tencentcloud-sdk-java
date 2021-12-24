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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorMetricsColumn extends AbstractModel{

    /**
    * 数据名称
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 数据内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnData")
    @Expose
    private String [] ColumnData;

    /**
    * 数据所属，查询Workload类型时有值
    */
    @SerializedName("ColumnBelong")
    @Expose
    private String ColumnBelong;

    /**
    * 最大值
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * 最小值
    */
    @SerializedName("MinValue")
    @Expose
    private Float MinValue;

    /**
    * 平均值
    */
    @SerializedName("AvgValue")
    @Expose
    private Float AvgValue;

    /**
    * 时间戳数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnTime")
    @Expose
    private Long ColumnTime;

    /**
     * Get 数据名称 
     * @return ColumnName 数据名称
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 数据名称
     * @param ColumnName 数据名称
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 数据内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnData 数据内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumnData() {
        return this.ColumnData;
    }

    /**
     * Set 数据内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnData 数据内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnData(String [] ColumnData) {
        this.ColumnData = ColumnData;
    }

    /**
     * Get 数据所属，查询Workload类型时有值 
     * @return ColumnBelong 数据所属，查询Workload类型时有值
     */
    public String getColumnBelong() {
        return this.ColumnBelong;
    }

    /**
     * Set 数据所属，查询Workload类型时有值
     * @param ColumnBelong 数据所属，查询Workload类型时有值
     */
    public void setColumnBelong(String ColumnBelong) {
        this.ColumnBelong = ColumnBelong;
    }

    /**
     * Get 最大值 
     * @return MaxValue 最大值
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set 最大值
     * @param MaxValue 最大值
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get 最小值 
     * @return MinValue 最小值
     */
    public Float getMinValue() {
        return this.MinValue;
    }

    /**
     * Set 最小值
     * @param MinValue 最小值
     */
    public void setMinValue(Float MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get 平均值 
     * @return AvgValue 平均值
     */
    public Float getAvgValue() {
        return this.AvgValue;
    }

    /**
     * Set 平均值
     * @param AvgValue 平均值
     */
    public void setAvgValue(Float AvgValue) {
        this.AvgValue = AvgValue;
    }

    /**
     * Get 时间戳数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnTime 时间戳数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColumnTime() {
        return this.ColumnTime;
    }

    /**
     * Set 时间戳数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnTime 时间戳数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnTime(Long ColumnTime) {
        this.ColumnTime = ColumnTime;
    }

    public MonitorMetricsColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorMetricsColumn(MonitorMetricsColumn source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.ColumnData != null) {
            this.ColumnData = new String[source.ColumnData.length];
            for (int i = 0; i < source.ColumnData.length; i++) {
                this.ColumnData[i] = new String(source.ColumnData[i]);
            }
        }
        if (source.ColumnBelong != null) {
            this.ColumnBelong = new String(source.ColumnBelong);
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.MinValue != null) {
            this.MinValue = new Float(source.MinValue);
        }
        if (source.AvgValue != null) {
            this.AvgValue = new Float(source.AvgValue);
        }
        if (source.ColumnTime != null) {
            this.ColumnTime = new Long(source.ColumnTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamArraySimple(map, prefix + "ColumnData.", this.ColumnData);
        this.setParamSimple(map, prefix + "ColumnBelong", this.ColumnBelong);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "AvgValue", this.AvgValue);
        this.setParamSimple(map, prefix + "ColumnTime", this.ColumnTime);

    }
}

