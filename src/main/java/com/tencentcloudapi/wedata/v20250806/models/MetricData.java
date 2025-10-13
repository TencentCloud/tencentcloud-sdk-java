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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricData extends AbstractModel {

    /**
    * 指标名称

- ConcurrencyUsage --- 并发使用率
- CpuCoreUsage --- cpu使用率
- CpuLoad --- cpu负载
- DevelopQueueTask --- 正在队列中的开发任务数量
- DevelopRunningTask --- 正在运行的开发任务数量
- DevelopSchedulingTask --- 正在调度的开发任务数量
- DiskUsage --- 磁盘使用情况
- DiskUsed --- 磁盘已用量
- MaximumConcurrency --- 最大并发
- MemoryLoad --- 内存负载
- MemoryUsage --- 内存使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 当前值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotValue")
    @Expose
    private Long SnapshotValue;

    /**
    * 指标趋势
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrendList")
    @Expose
    private TrendData [] TrendList;

    /**
     * Get 指标名称

- ConcurrencyUsage --- 并发使用率
- CpuCoreUsage --- cpu使用率
- CpuLoad --- cpu负载
- DevelopQueueTask --- 正在队列中的开发任务数量
- DevelopRunningTask --- 正在运行的开发任务数量
- DevelopSchedulingTask --- 正在调度的开发任务数量
- DiskUsage --- 磁盘使用情况
- DiskUsed --- 磁盘已用量
- MaximumConcurrency --- 最大并发
- MemoryLoad --- 内存负载
- MemoryUsage --- 内存使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 指标名称

- ConcurrencyUsage --- 并发使用率
- CpuCoreUsage --- cpu使用率
- CpuLoad --- cpu负载
- DevelopQueueTask --- 正在队列中的开发任务数量
- DevelopRunningTask --- 正在运行的开发任务数量
- DevelopSchedulingTask --- 正在调度的开发任务数量
- DiskUsage --- 磁盘使用情况
- DiskUsed --- 磁盘已用量
- MaximumConcurrency --- 最大并发
- MemoryLoad --- 内存负载
- MemoryUsage --- 内存使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称

- ConcurrencyUsage --- 并发使用率
- CpuCoreUsage --- cpu使用率
- CpuLoad --- cpu负载
- DevelopQueueTask --- 正在队列中的开发任务数量
- DevelopRunningTask --- 正在运行的开发任务数量
- DevelopSchedulingTask --- 正在调度的开发任务数量
- DiskUsage --- 磁盘使用情况
- DiskUsed --- 磁盘已用量
- MaximumConcurrency --- 最大并发
- MemoryLoad --- 内存负载
- MemoryUsage --- 内存使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 指标名称

- ConcurrencyUsage --- 并发使用率
- CpuCoreUsage --- cpu使用率
- CpuLoad --- cpu负载
- DevelopQueueTask --- 正在队列中的开发任务数量
- DevelopRunningTask --- 正在运行的开发任务数量
- DevelopSchedulingTask --- 正在调度的开发任务数量
- DiskUsage --- 磁盘使用情况
- DiskUsed --- 磁盘已用量
- MaximumConcurrency --- 最大并发
- MemoryLoad --- 内存负载
- MemoryUsage --- 内存使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 当前值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotValue 当前值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSnapshotValue() {
        return this.SnapshotValue;
    }

    /**
     * Set 当前值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotValue 当前值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotValue(Long SnapshotValue) {
        this.SnapshotValue = SnapshotValue;
    }

    /**
     * Get 指标趋势
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrendList 指标趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrendData [] getTrendList() {
        return this.TrendList;
    }

    /**
     * Set 指标趋势
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrendList 指标趋势
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrendList(TrendData [] TrendList) {
        this.TrendList = TrendList;
    }

    public MetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricData(MetricData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.SnapshotValue != null) {
            this.SnapshotValue = new Long(source.SnapshotValue);
        }
        if (source.TrendList != null) {
            this.TrendList = new TrendData[source.TrendList.length];
            for (int i = 0; i < source.TrendList.length; i++) {
                this.TrendList[i] = new TrendData(source.TrendList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "SnapshotValue", this.SnapshotValue);
        this.setParamArrayObj(map, prefix + "TrendList.", this.TrendList);

    }
}

