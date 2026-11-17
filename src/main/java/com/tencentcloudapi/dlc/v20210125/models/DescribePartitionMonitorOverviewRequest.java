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

public class DescribePartitionMonitorOverviewRequest extends AbstractModel {

    /**
    * <p>资源分区编码</p>
    */
    @SerializedName("PartitionCode")
    @Expose
    private String PartitionCode;

    /**
    * <p>资源组（队列）名称，可选。不传时返回 partition 维度指标（含 pending_workloads / admission_wait_seconds / top_queue_by_cpu 排队卡片、<em>_limit_business 计费口径已使用量、</em><em>quota_total 配额、postpay_month_consumed_total 当月已消耗）；传入时切换为 queue 维度：仅返回 queue</em> 前缀指标（queue_<em><em>limit_business 计费口径已使用量 / queue</em></em>_admitted Kueue 对照口径 / queue_pending_workloads / queue_admission_wait_seconds）+ 该队列的配额指标（cpu_quota_total / memory_quota_total / gpu_quota_total / vram_quota_total，数值来自队列的 resource_usage 而非分区 resource_config）+ postpay_month_consumed_total</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>指标 key 过滤列表，为空则返回全部指标</p>
    */
    @SerializedName("MetricKeys")
    @Expose
    private String [] MetricKeys;

    /**
     * Get <p>资源分区编码</p> 
     * @return PartitionCode <p>资源分区编码</p>
     */
    public String getPartitionCode() {
        return this.PartitionCode;
    }

    /**
     * Set <p>资源分区编码</p>
     * @param PartitionCode <p>资源分区编码</p>
     */
    public void setPartitionCode(String PartitionCode) {
        this.PartitionCode = PartitionCode;
    }

    /**
     * Get <p>资源组（队列）名称，可选。不传时返回 partition 维度指标（含 pending_workloads / admission_wait_seconds / top_queue_by_cpu 排队卡片、<em>_limit_business 计费口径已使用量、</em><em>quota_total 配额、postpay_month_consumed_total 当月已消耗）；传入时切换为 queue 维度：仅返回 queue</em> 前缀指标（queue_<em><em>limit_business 计费口径已使用量 / queue</em></em>_admitted Kueue 对照口径 / queue_pending_workloads / queue_admission_wait_seconds）+ 该队列的配额指标（cpu_quota_total / memory_quota_total / gpu_quota_total / vram_quota_total，数值来自队列的 resource_usage 而非分区 resource_config）+ postpay_month_consumed_total</p> 
     * @return QueueName <p>资源组（队列）名称，可选。不传时返回 partition 维度指标（含 pending_workloads / admission_wait_seconds / top_queue_by_cpu 排队卡片、<em>_limit_business 计费口径已使用量、</em><em>quota_total 配额、postpay_month_consumed_total 当月已消耗）；传入时切换为 queue 维度：仅返回 queue</em> 前缀指标（queue_<em><em>limit_business 计费口径已使用量 / queue</em></em>_admitted Kueue 对照口径 / queue_pending_workloads / queue_admission_wait_seconds）+ 该队列的配额指标（cpu_quota_total / memory_quota_total / gpu_quota_total / vram_quota_total，数值来自队列的 resource_usage 而非分区 resource_config）+ postpay_month_consumed_total</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>资源组（队列）名称，可选。不传时返回 partition 维度指标（含 pending_workloads / admission_wait_seconds / top_queue_by_cpu 排队卡片、<em>_limit_business 计费口径已使用量、</em><em>quota_total 配额、postpay_month_consumed_total 当月已消耗）；传入时切换为 queue 维度：仅返回 queue</em> 前缀指标（queue_<em><em>limit_business 计费口径已使用量 / queue</em></em>_admitted Kueue 对照口径 / queue_pending_workloads / queue_admission_wait_seconds）+ 该队列的配额指标（cpu_quota_total / memory_quota_total / gpu_quota_total / vram_quota_total，数值来自队列的 resource_usage 而非分区 resource_config）+ postpay_month_consumed_total</p>
     * @param QueueName <p>资源组（队列）名称，可选。不传时返回 partition 维度指标（含 pending_workloads / admission_wait_seconds / top_queue_by_cpu 排队卡片、<em>_limit_business 计费口径已使用量、</em><em>quota_total 配额、postpay_month_consumed_total 当月已消耗）；传入时切换为 queue 维度：仅返回 queue</em> 前缀指标（queue_<em><em>limit_business 计费口径已使用量 / queue</em></em>_admitted Kueue 对照口径 / queue_pending_workloads / queue_admission_wait_seconds）+ 该队列的配额指标（cpu_quota_total / memory_quota_total / gpu_quota_total / vram_quota_total，数值来自队列的 resource_usage 而非分区 resource_config）+ postpay_month_consumed_total</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>指标 key 过滤列表，为空则返回全部指标</p> 
     * @return MetricKeys <p>指标 key 过滤列表，为空则返回全部指标</p>
     */
    public String [] getMetricKeys() {
        return this.MetricKeys;
    }

    /**
     * Set <p>指标 key 过滤列表，为空则返回全部指标</p>
     * @param MetricKeys <p>指标 key 过滤列表，为空则返回全部指标</p>
     */
    public void setMetricKeys(String [] MetricKeys) {
        this.MetricKeys = MetricKeys;
    }

    public DescribePartitionMonitorOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePartitionMonitorOverviewRequest(DescribePartitionMonitorOverviewRequest source) {
        if (source.PartitionCode != null) {
            this.PartitionCode = new String(source.PartitionCode);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MetricKeys != null) {
            this.MetricKeys = new String[source.MetricKeys.length];
            for (int i = 0; i < source.MetricKeys.length; i++) {
                this.MetricKeys[i] = new String(source.MetricKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionCode", this.PartitionCode);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArraySimple(map, prefix + "MetricKeys.", this.MetricKeys);

    }
}

