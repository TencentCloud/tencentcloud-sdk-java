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

public class MetricLabels extends AbstractModel {

    /**
    * <p>GPU 卡型简称，取值如 T4 / A10 / V100 / L20 / H20。来自 TKE GPU Exporter 暴露的 gpu_info.name，由查询层归一（name=&quot;Tesla T4&quot; → GpuType=&quot;T4&quot;）；未识别的卡型保留原始 name 值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>队列编码 code（多队列时序查询时，每个 series 携带所属队列 code，与 GpuType 组合区分曲线；展示别名见 QueueAlias）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>队列展示别名（多队列时序查询时每个 series 携带，前端图例展示用；队列不存在或 alias 为空时回落为队列 code）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueAlias")
    @Expose
    private String QueueAlias;

    /**
    * <p>计费项资源类型（CPU / HM_CPU）。Overview 路径的 CPU / 内存类指标按计费项资源类型拆分 series 时携带；时序路径当前不输出该字段（预留对齐 MetricLabels 定义）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get <p>GPU 卡型简称，取值如 T4 / A10 / V100 / L20 / H20。来自 TKE GPU Exporter 暴露的 gpu_info.name，由查询层归一（name=&quot;Tesla T4&quot; → GpuType=&quot;T4&quot;）；未识别的卡型保留原始 name 值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType <p>GPU 卡型简称，取值如 T4 / A10 / V100 / L20 / H20。来自 TKE GPU Exporter 暴露的 gpu_info.name，由查询层归一（name=&quot;Tesla T4&quot; → GpuType=&quot;T4&quot;）；未识别的卡型保留原始 name 值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>GPU 卡型简称，取值如 T4 / A10 / V100 / L20 / H20。来自 TKE GPU Exporter 暴露的 gpu_info.name，由查询层归一（name=&quot;Tesla T4&quot; → GpuType=&quot;T4&quot;）；未识别的卡型保留原始 name 值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType <p>GPU 卡型简称，取值如 T4 / A10 / V100 / L20 / H20。来自 TKE GPU Exporter 暴露的 gpu_info.name，由查询层归一（name=&quot;Tesla T4&quot; → GpuType=&quot;T4&quot;）；未识别的卡型保留原始 name 值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>队列编码 code（多队列时序查询时，每个 series 携带所属队列 code，与 GpuType 组合区分曲线；展示别名见 QueueAlias）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueName <p>队列编码 code（多队列时序查询时，每个 series 携带所属队列 code，与 GpuType 组合区分曲线；展示别名见 QueueAlias）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列编码 code（多队列时序查询时，每个 series 携带所属队列 code，与 GpuType 组合区分曲线；展示别名见 QueueAlias）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueName <p>队列编码 code（多队列时序查询时，每个 series 携带所属队列 code，与 GpuType 组合区分曲线；展示别名见 QueueAlias）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>队列展示别名（多队列时序查询时每个 series 携带，前端图例展示用；队列不存在或 alias 为空时回落为队列 code）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueAlias <p>队列展示别名（多队列时序查询时每个 series 携带，前端图例展示用；队列不存在或 alias 为空时回落为队列 code）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueAlias() {
        return this.QueueAlias;
    }

    /**
     * Set <p>队列展示别名（多队列时序查询时每个 series 携带，前端图例展示用；队列不存在或 alias 为空时回落为队列 code）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueAlias <p>队列展示别名（多队列时序查询时每个 series 携带，前端图例展示用；队列不存在或 alias 为空时回落为队列 code）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueAlias(String QueueAlias) {
        this.QueueAlias = QueueAlias;
    }

    /**
     * Get <p>计费项资源类型（CPU / HM_CPU）。Overview 路径的 CPU / 内存类指标按计费项资源类型拆分 series 时携带；时序路径当前不输出该字段（预留对齐 MetricLabels 定义）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType <p>计费项资源类型（CPU / HM_CPU）。Overview 路径的 CPU / 内存类指标按计费项资源类型拆分 series 时携带；时序路径当前不输出该字段（预留对齐 MetricLabels 定义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>计费项资源类型（CPU / HM_CPU）。Overview 路径的 CPU / 内存类指标按计费项资源类型拆分 series 时携带；时序路径当前不输出该字段（预留对齐 MetricLabels 定义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType <p>计费项资源类型（CPU / HM_CPU）。Overview 路径的 CPU / 内存类指标按计费项资源类型拆分 series 时携带；时序路径当前不输出该字段（预留对齐 MetricLabels 定义）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public MetricLabels() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricLabels(MetricLabels source) {
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueueAlias != null) {
            this.QueueAlias = new String(source.QueueAlias);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "QueueAlias", this.QueueAlias);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

