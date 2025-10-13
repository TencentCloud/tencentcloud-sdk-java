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

public class ResourceGroupMetrics extends AbstractModel {

    /**
    * 资源组规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 资源组规格相关：磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskVolume")
    @Expose
    private Long DiskVolume;

    /**
    * 资源组规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 资源组生命周期, 单位：天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeCycle")
    @Expose
    private Long LifeCycle;

    /**
    * 资源组规格相关：最高并发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaximumConcurrency")
    @Expose
    private Long MaximumConcurrency;

    /**
    * 资源组状态

- 0 --- 初始化中
- 1 --- 运行中
- 2 --- 运行异常
- 3 --- 释放中
- 4 --- 已释放
- 5 --- 创建中
- 6 --- 创建失败
- 7 --- 更新中
- 8 --- 更新失败
- 9 --- 已到期
- 10 --- 释放失败
- 11 --- 使用中
- 12 --- 未使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 指标详情
    */
    @SerializedName("MetricSnapshots")
    @Expose
    private MetricData [] MetricSnapshots;

    /**
     * Get 资源组规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuNum 资源组规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 资源组规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuNum 资源组规格相关：cpu个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 资源组规格相关：磁盘规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskVolume 资源组规格相关：磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskVolume() {
        return this.DiskVolume;
    }

    /**
     * Set 资源组规格相关：磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskVolume 资源组规格相关：磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskVolume(Long DiskVolume) {
        this.DiskVolume = DiskVolume;
    }

    /**
     * Get 资源组规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 资源组规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 资源组规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 资源组规格相关：内存大小，单位:G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 资源组生命周期, 单位：天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeCycle 资源组生命周期, 单位：天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set 资源组生命周期, 单位：天
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeCycle 资源组生命周期, 单位：天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeCycle(Long LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get 资源组规格相关：最高并发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaximumConcurrency 资源组规格相关：最高并发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaximumConcurrency() {
        return this.MaximumConcurrency;
    }

    /**
     * Set 资源组规格相关：最高并发
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaximumConcurrency 资源组规格相关：最高并发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaximumConcurrency(Long MaximumConcurrency) {
        this.MaximumConcurrency = MaximumConcurrency;
    }

    /**
     * Get 资源组状态

- 0 --- 初始化中
- 1 --- 运行中
- 2 --- 运行异常
- 3 --- 释放中
- 4 --- 已释放
- 5 --- 创建中
- 6 --- 创建失败
- 7 --- 更新中
- 8 --- 更新失败
- 9 --- 已到期
- 10 --- 释放失败
- 11 --- 使用中
- 12 --- 未使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源组状态

- 0 --- 初始化中
- 1 --- 运行中
- 2 --- 运行异常
- 3 --- 释放中
- 4 --- 已释放
- 5 --- 创建中
- 6 --- 创建失败
- 7 --- 更新中
- 8 --- 更新失败
- 9 --- 已到期
- 10 --- 释放失败
- 11 --- 使用中
- 12 --- 未使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源组状态

- 0 --- 初始化中
- 1 --- 运行中
- 2 --- 运行异常
- 3 --- 释放中
- 4 --- 已释放
- 5 --- 创建中
- 6 --- 创建失败
- 7 --- 更新中
- 8 --- 更新失败
- 9 --- 已到期
- 10 --- 释放失败
- 11 --- 使用中
- 12 --- 未使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源组状态

- 0 --- 初始化中
- 1 --- 运行中
- 2 --- 运行异常
- 3 --- 释放中
- 4 --- 已释放
- 5 --- 创建中
- 6 --- 创建失败
- 7 --- 更新中
- 8 --- 更新失败
- 9 --- 已到期
- 10 --- 释放失败
- 11 --- 使用中
- 12 --- 未使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 指标详情 
     * @return MetricSnapshots 指标详情
     */
    public MetricData [] getMetricSnapshots() {
        return this.MetricSnapshots;
    }

    /**
     * Set 指标详情
     * @param MetricSnapshots 指标详情
     */
    public void setMetricSnapshots(MetricData [] MetricSnapshots) {
        this.MetricSnapshots = MetricSnapshots;
    }

    public ResourceGroupMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGroupMetrics(ResourceGroupMetrics source) {
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.DiskVolume != null) {
            this.DiskVolume = new Long(source.DiskVolume);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new Long(source.LifeCycle);
        }
        if (source.MaximumConcurrency != null) {
            this.MaximumConcurrency = new Long(source.MaximumConcurrency);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MetricSnapshots != null) {
            this.MetricSnapshots = new MetricData[source.MetricSnapshots.length];
            for (int i = 0; i < source.MetricSnapshots.length; i++) {
                this.MetricSnapshots[i] = new MetricData(source.MetricSnapshots[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "DiskVolume", this.DiskVolume);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "LifeCycle", this.LifeCycle);
        this.setParamSimple(map, prefix + "MaximumConcurrency", this.MaximumConcurrency);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "MetricSnapshots.", this.MetricSnapshots);

    }
}

