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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceData extends AbstractModel {

    /**
    * 云监控指标名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * CLS指标名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLSMetricName")
    @Expose
    private String CLSMetricName;

    /**
    * 云产品命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimensions")
    @Expose
    private Dimension [] Dimensions;

    /**
    * 周期,单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 指标统计值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 云监控指标名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 云监控指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 云监控指标名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 云监控指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get CLS指标名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLSMetricName CLS指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCLSMetricName() {
        return this.CLSMetricName;
    }

    /**
     * Set CLS指标名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLSMetricName CLS指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLSMetricName(String CLSMetricName) {
        this.CLSMetricName = CLSMetricName;
    }

    /**
     * Get 云产品命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 云产品命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 云产品命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 云产品命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimensions 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Dimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimensions 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensions(Dimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 周期,单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 周期,单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 周期,单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 周期,单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 指标统计值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 指标统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set 指标统计值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 指标统计值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public InstanceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceData(InstanceData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.CLSMetricName != null) {
            this.CLSMetricName = new String(source.CLSMetricName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new Dimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new Dimension(source.Dimensions[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "CLSMetricName", this.CLSMetricName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

