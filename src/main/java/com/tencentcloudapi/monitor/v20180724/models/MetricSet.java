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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricSet extends AbstractModel{

    /**
    * 命名空间，每个云产品会有一个命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标使用的单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标使用的单位
    */
    @SerializedName("UnitCname")
    @Expose
    private String UnitCname;

    /**
    * 指标支持的统计周期，单位是秒，如60、300
    */
    @SerializedName("Period")
    @Expose
    private Long [] Period;

    /**
    * 统计周期内指标方式
    */
    @SerializedName("Periods")
    @Expose
    private PeriodsSt [] Periods;

    /**
    * 统计指标含义解释
    */
    @SerializedName("Meaning")
    @Expose
    private MetricObjectMeaning Meaning;

    /**
    * 维度描述信息
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionsDesc [] Dimensions;

    /**
    * 指标中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricCName")
    @Expose
    private String MetricCName;

    /**
    * 指标英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricEName")
    @Expose
    private String MetricEName;

    /**
     * Get 命名空间，每个云产品会有一个命名空间 
     * @return Namespace 命名空间，每个云产品会有一个命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，每个云产品会有一个命名空间
     * @param Namespace 命名空间，每个云产品会有一个命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标使用的单位 
     * @return Unit 指标使用的单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标使用的单位
     * @param Unit 指标使用的单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标使用的单位 
     * @return UnitCname 指标使用的单位
     */
    public String getUnitCname() {
        return this.UnitCname;
    }

    /**
     * Set 指标使用的单位
     * @param UnitCname 指标使用的单位
     */
    public void setUnitCname(String UnitCname) {
        this.UnitCname = UnitCname;
    }

    /**
     * Get 指标支持的统计周期，单位是秒，如60、300 
     * @return Period 指标支持的统计周期，单位是秒，如60、300
     */
    public Long [] getPeriod() {
        return this.Period;
    }

    /**
     * Set 指标支持的统计周期，单位是秒，如60、300
     * @param Period 指标支持的统计周期，单位是秒，如60、300
     */
    public void setPeriod(Long [] Period) {
        this.Period = Period;
    }

    /**
     * Get 统计周期内指标方式 
     * @return Periods 统计周期内指标方式
     */
    public PeriodsSt [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set 统计周期内指标方式
     * @param Periods 统计周期内指标方式
     */
    public void setPeriods(PeriodsSt [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get 统计指标含义解释 
     * @return Meaning 统计指标含义解释
     */
    public MetricObjectMeaning getMeaning() {
        return this.Meaning;
    }

    /**
     * Set 统计指标含义解释
     * @param Meaning 统计指标含义解释
     */
    public void setMeaning(MetricObjectMeaning Meaning) {
        this.Meaning = Meaning;
    }

    /**
     * Get 维度描述信息 
     * @return Dimensions 维度描述信息
     */
    public DimensionsDesc [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 维度描述信息
     * @param Dimensions 维度描述信息
     */
    public void setDimensions(DimensionsDesc [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 指标中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricCName 指标中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricCName() {
        return this.MetricCName;
    }

    /**
     * Set 指标中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricCName 指标中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricCName(String MetricCName) {
        this.MetricCName = MetricCName;
    }

    /**
     * Get 指标英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricEName 指标英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricEName() {
        return this.MetricEName;
    }

    /**
     * Set 指标英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricEName 指标英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricEName(String MetricEName) {
        this.MetricEName = MetricEName;
    }

    public MetricSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricSet(MetricSet source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.UnitCname != null) {
            this.UnitCname = new String(source.UnitCname);
        }
        if (source.Period != null) {
            this.Period = new Long[source.Period.length];
            for (int i = 0; i < source.Period.length; i++) {
                this.Period[i] = new Long(source.Period[i]);
            }
        }
        if (source.Periods != null) {
            this.Periods = new PeriodsSt[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new PeriodsSt(source.Periods[i]);
            }
        }
        if (source.Meaning != null) {
            this.Meaning = new MetricObjectMeaning(source.Meaning);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DimensionsDesc[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DimensionsDesc(source.Dimensions[i]);
            }
        }
        if (source.MetricCName != null) {
            this.MetricCName = new String(source.MetricCName);
        }
        if (source.MetricEName != null) {
            this.MetricEName = new String(source.MetricEName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "UnitCname", this.UnitCname);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArrayObj(map, prefix + "Periods.", this.Periods);
        this.setParamObj(map, prefix + "Meaning.", this.Meaning);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "MetricCName", this.MetricCName);
        this.setParamSimple(map, prefix + "MetricEName", this.MetricEName);

    }
}

