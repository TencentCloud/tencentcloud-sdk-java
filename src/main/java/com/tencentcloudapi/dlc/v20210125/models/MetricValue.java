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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricValue extends AbstractModel {

    /**
    * <p>指标键名，如 cpu_allocation、cpu_quota_total 等</p>
    */
    @SerializedName("MetricKey")
    @Expose
    private String MetricKey;

    /**
    * <p>指标当前值，可能为 null（PromQL 返回空数据集时），前端按 null 视作&quot;无数据&quot;处理</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * <p>指标单位，如 core、card、GB</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>资源类型：cpu / gpu / memory / vram / kueue / consumption</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>维度标签。单 series 指标（CPU / 内存 / Kueue 等）不出现此字段；多 series 指标（GPU 类按卡型拆分）每条 MetricValue 携带不同的 Labels 区分维度。前端按 (MetricKey, Labels) 二元组识别每条记录</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private MetricLabels Labels;

    /**
     * Get <p>指标键名，如 cpu_allocation、cpu_quota_total 等</p> 
     * @return MetricKey <p>指标键名，如 cpu_allocation、cpu_quota_total 等</p>
     */
    public String getMetricKey() {
        return this.MetricKey;
    }

    /**
     * Set <p>指标键名，如 cpu_allocation、cpu_quota_total 等</p>
     * @param MetricKey <p>指标键名，如 cpu_allocation、cpu_quota_total 等</p>
     */
    public void setMetricKey(String MetricKey) {
        this.MetricKey = MetricKey;
    }

    /**
     * Get <p>指标当前值，可能为 null（PromQL 返回空数据集时），前端按 null 视作&quot;无数据&quot;处理</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value <p>指标当前值，可能为 null（PromQL 返回空数据集时），前端按 null 视作&quot;无数据&quot;处理</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set <p>指标当前值，可能为 null（PromQL 返回空数据集时），前端按 null 视作&quot;无数据&quot;处理</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value <p>指标当前值，可能为 null（PromQL 返回空数据集时），前端按 null 视作&quot;无数据&quot;处理</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get <p>指标单位，如 core、card、GB</p> 
     * @return Unit <p>指标单位，如 core、card、GB</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>指标单位，如 core、card、GB</p>
     * @param Unit <p>指标单位，如 core、card、GB</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>资源类型：cpu / gpu / memory / vram / kueue / consumption</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType <p>资源类型：cpu / gpu / memory / vram / kueue / consumption</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型：cpu / gpu / memory / vram / kueue / consumption</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType <p>资源类型：cpu / gpu / memory / vram / kueue / consumption</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>维度标签。单 series 指标（CPU / 内存 / Kueue 等）不出现此字段；多 series 指标（GPU 类按卡型拆分）每条 MetricValue 携带不同的 Labels 区分维度。前端按 (MetricKey, Labels) 二元组识别每条记录</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>维度标签。单 series 指标（CPU / 内存 / Kueue 等）不出现此字段；多 series 指标（GPU 类按卡型拆分）每条 MetricValue 携带不同的 Labels 区分维度。前端按 (MetricKey, Labels) 二元组识别每条记录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricLabels getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>维度标签。单 series 指标（CPU / 内存 / Kueue 等）不出现此字段；多 series 指标（GPU 类按卡型拆分）每条 MetricValue 携带不同的 Labels 区分维度。前端按 (MetricKey, Labels) 二元组识别每条记录</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>维度标签。单 series 指标（CPU / 内存 / Kueue 等）不出现此字段；多 series 指标（GPU 类按卡型拆分）每条 MetricValue 携带不同的 Labels 区分维度。前端按 (MetricKey, Labels) 二元组识别每条记录</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(MetricLabels Labels) {
        this.Labels = Labels;
    }

    public MetricValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricValue(MetricValue source) {
        if (source.MetricKey != null) {
            this.MetricKey = new String(source.MetricKey);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Labels != null) {
            this.Labels = new MetricLabels(source.Labels);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricKey", this.MetricKey);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "Labels.", this.Labels);

    }
}

