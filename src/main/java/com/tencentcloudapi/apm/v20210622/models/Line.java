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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Line extends AbstractModel{

    /**
    * 指标名
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标中文名
    */
    @SerializedName("MetricNameCN")
    @Expose
    private String MetricNameCN;

    /**
    * 时间序列
    */
    @SerializedName("TimeSerial")
    @Expose
    private Long [] TimeSerial;

    /**
    * 数据序列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSerial")
    @Expose
    private Float [] DataSerial;

    /**
    * 维度列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
     * Get 指标名 
     * @return MetricName 指标名
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
     * @param MetricName 指标名
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标中文名 
     * @return MetricNameCN 指标中文名
     */
    public String getMetricNameCN() {
        return this.MetricNameCN;
    }

    /**
     * Set 指标中文名
     * @param MetricNameCN 指标中文名
     */
    public void setMetricNameCN(String MetricNameCN) {
        this.MetricNameCN = MetricNameCN;
    }

    /**
     * Get 时间序列 
     * @return TimeSerial 时间序列
     */
    public Long [] getTimeSerial() {
        return this.TimeSerial;
    }

    /**
     * Set 时间序列
     * @param TimeSerial 时间序列
     */
    public void setTimeSerial(Long [] TimeSerial) {
        this.TimeSerial = TimeSerial;
    }

    /**
     * Get 数据序列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSerial 数据序列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getDataSerial() {
        return this.DataSerial;
    }

    /**
     * Set 数据序列
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSerial 数据序列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSerial(Float [] DataSerial) {
        this.DataSerial = DataSerial;
    }

    /**
     * Get 维度列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 维度列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 维度列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 维度列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    public Line() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Line(Line source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricNameCN != null) {
            this.MetricNameCN = new String(source.MetricNameCN);
        }
        if (source.TimeSerial != null) {
            this.TimeSerial = new Long[source.TimeSerial.length];
            for (int i = 0; i < source.TimeSerial.length; i++) {
                this.TimeSerial[i] = new Long(source.TimeSerial[i]);
            }
        }
        if (source.DataSerial != null) {
            this.DataSerial = new Float[source.DataSerial.length];
            for (int i = 0; i < source.DataSerial.length; i++) {
                this.DataSerial[i] = new Float(source.DataSerial[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricNameCN", this.MetricNameCN);
        this.setParamArraySimple(map, prefix + "TimeSerial.", this.TimeSerial);
        this.setParamArraySimple(map, prefix + "DataSerial.", this.DataSerial);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

