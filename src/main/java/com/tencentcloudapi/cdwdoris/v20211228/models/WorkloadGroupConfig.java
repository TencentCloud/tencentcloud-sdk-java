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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadGroupConfig extends AbstractModel {

    /**
    * <p>资源组名称</p>
    */
    @SerializedName("WorkloadGroupName")
    @Expose
    private String WorkloadGroupName;

    /**
    * <p>CPU权重</p>
    */
    @SerializedName("CpuShare")
    @Expose
    private Long CpuShare;

    /**
    * <p>内存限制，所有资源组的内存限制值之和应该小于等于100</p>
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Long MemoryLimit;

    /**
    * <p>是否允许超配分配</p>
    */
    @SerializedName("EnableMemoryOverCommit")
    @Expose
    private Boolean EnableMemoryOverCommit;

    /**
    * <p>cpu硬限制</p>
    */
    @SerializedName("CpuHardLimit")
    @Expose
    private String CpuHardLimit;

    /**
    * <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
    */
    @SerializedName("MinCpuPercent")
    @Expose
    private Long MinCpuPercent;

    /**
    * <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
    */
    @SerializedName("MinMemoryPercent")
    @Expose
    private Long MinMemoryPercent;

    /**
    * <p>2.1+ 新增；不传走内核默认（Integer.MAX_VALUE=2147483647），建议按业务并发量配置</p>
    */
    @SerializedName("MaxConcurrencyNum")
    @Expose
    private Long MaxConcurrencyNum;

    /**
    * <p>2.1+ 新增；0=不排队，建议为 MaxConcurrencyNum 的 50%</p>
    */
    @SerializedName("MaxQueueSize")
    @Expose
    private Long MaxQueueSize;

    /**
    * <p>2.1+ 新增；单位 ms，建议 5000（5s）</p>
    */
    @SerializedName("QueueTimeout")
    @Expose
    private Long QueueTimeout;

    /**
     * Get <p>资源组名称</p> 
     * @return WorkloadGroupName <p>资源组名称</p>
     */
    public String getWorkloadGroupName() {
        return this.WorkloadGroupName;
    }

    /**
     * Set <p>资源组名称</p>
     * @param WorkloadGroupName <p>资源组名称</p>
     */
    public void setWorkloadGroupName(String WorkloadGroupName) {
        this.WorkloadGroupName = WorkloadGroupName;
    }

    /**
     * Get <p>CPU权重</p> 
     * @return CpuShare <p>CPU权重</p>
     */
    public Long getCpuShare() {
        return this.CpuShare;
    }

    /**
     * Set <p>CPU权重</p>
     * @param CpuShare <p>CPU权重</p>
     */
    public void setCpuShare(Long CpuShare) {
        this.CpuShare = CpuShare;
    }

    /**
     * Get <p>内存限制，所有资源组的内存限制值之和应该小于等于100</p> 
     * @return MemoryLimit <p>内存限制，所有资源组的内存限制值之和应该小于等于100</p>
     */
    public Long getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set <p>内存限制，所有资源组的内存限制值之和应该小于等于100</p>
     * @param MemoryLimit <p>内存限制，所有资源组的内存限制值之和应该小于等于100</p>
     */
    public void setMemoryLimit(Long MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get <p>是否允许超配分配</p> 
     * @return EnableMemoryOverCommit <p>是否允许超配分配</p>
     */
    public Boolean getEnableMemoryOverCommit() {
        return this.EnableMemoryOverCommit;
    }

    /**
     * Set <p>是否允许超配分配</p>
     * @param EnableMemoryOverCommit <p>是否允许超配分配</p>
     */
    public void setEnableMemoryOverCommit(Boolean EnableMemoryOverCommit) {
        this.EnableMemoryOverCommit = EnableMemoryOverCommit;
    }

    /**
     * Get <p>cpu硬限制</p> 
     * @return CpuHardLimit <p>cpu硬限制</p>
     */
    public String getCpuHardLimit() {
        return this.CpuHardLimit;
    }

    /**
     * Set <p>cpu硬限制</p>
     * @param CpuHardLimit <p>cpu硬限制</p>
     */
    public void setCpuHardLimit(String CpuHardLimit) {
        this.CpuHardLimit = CpuHardLimit;
    }

    /**
     * Get <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p> 
     * @return MinCpuPercent <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
     */
    public Long getMinCpuPercent() {
        return this.MinCpuPercent;
    }

    /**
     * Set <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
     * @param MinCpuPercent <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
     */
    public void setMinCpuPercent(Long MinCpuPercent) {
        this.MinCpuPercent = MinCpuPercent;
    }

    /**
     * Get <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p> 
     * @return MinMemoryPercent <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
     */
    public Long getMinMemoryPercent() {
        return this.MinMemoryPercent;
    }

    /**
     * Set <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
     * @param MinMemoryPercent <p>4.1+ 新增；默认值为 0（不预留），根据业务可设为 5/10</p>
     */
    public void setMinMemoryPercent(Long MinMemoryPercent) {
        this.MinMemoryPercent = MinMemoryPercent;
    }

    /**
     * Get <p>2.1+ 新增；不传走内核默认（Integer.MAX_VALUE=2147483647），建议按业务并发量配置</p> 
     * @return MaxConcurrencyNum <p>2.1+ 新增；不传走内核默认（Integer.MAX_VALUE=2147483647），建议按业务并发量配置</p>
     */
    public Long getMaxConcurrencyNum() {
        return this.MaxConcurrencyNum;
    }

    /**
     * Set <p>2.1+ 新增；不传走内核默认（Integer.MAX_VALUE=2147483647），建议按业务并发量配置</p>
     * @param MaxConcurrencyNum <p>2.1+ 新增；不传走内核默认（Integer.MAX_VALUE=2147483647），建议按业务并发量配置</p>
     */
    public void setMaxConcurrencyNum(Long MaxConcurrencyNum) {
        this.MaxConcurrencyNum = MaxConcurrencyNum;
    }

    /**
     * Get <p>2.1+ 新增；0=不排队，建议为 MaxConcurrencyNum 的 50%</p> 
     * @return MaxQueueSize <p>2.1+ 新增；0=不排队，建议为 MaxConcurrencyNum 的 50%</p>
     */
    public Long getMaxQueueSize() {
        return this.MaxQueueSize;
    }

    /**
     * Set <p>2.1+ 新增；0=不排队，建议为 MaxConcurrencyNum 的 50%</p>
     * @param MaxQueueSize <p>2.1+ 新增；0=不排队，建议为 MaxConcurrencyNum 的 50%</p>
     */
    public void setMaxQueueSize(Long MaxQueueSize) {
        this.MaxQueueSize = MaxQueueSize;
    }

    /**
     * Get <p>2.1+ 新增；单位 ms，建议 5000（5s）</p> 
     * @return QueueTimeout <p>2.1+ 新增；单位 ms，建议 5000（5s）</p>
     */
    public Long getQueueTimeout() {
        return this.QueueTimeout;
    }

    /**
     * Set <p>2.1+ 新增；单位 ms，建议 5000（5s）</p>
     * @param QueueTimeout <p>2.1+ 新增；单位 ms，建议 5000（5s）</p>
     */
    public void setQueueTimeout(Long QueueTimeout) {
        this.QueueTimeout = QueueTimeout;
    }

    public WorkloadGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadGroupConfig(WorkloadGroupConfig source) {
        if (source.WorkloadGroupName != null) {
            this.WorkloadGroupName = new String(source.WorkloadGroupName);
        }
        if (source.CpuShare != null) {
            this.CpuShare = new Long(source.CpuShare);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Long(source.MemoryLimit);
        }
        if (source.EnableMemoryOverCommit != null) {
            this.EnableMemoryOverCommit = new Boolean(source.EnableMemoryOverCommit);
        }
        if (source.CpuHardLimit != null) {
            this.CpuHardLimit = new String(source.CpuHardLimit);
        }
        if (source.MinCpuPercent != null) {
            this.MinCpuPercent = new Long(source.MinCpuPercent);
        }
        if (source.MinMemoryPercent != null) {
            this.MinMemoryPercent = new Long(source.MinMemoryPercent);
        }
        if (source.MaxConcurrencyNum != null) {
            this.MaxConcurrencyNum = new Long(source.MaxConcurrencyNum);
        }
        if (source.MaxQueueSize != null) {
            this.MaxQueueSize = new Long(source.MaxQueueSize);
        }
        if (source.QueueTimeout != null) {
            this.QueueTimeout = new Long(source.QueueTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkloadGroupName", this.WorkloadGroupName);
        this.setParamSimple(map, prefix + "CpuShare", this.CpuShare);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "EnableMemoryOverCommit", this.EnableMemoryOverCommit);
        this.setParamSimple(map, prefix + "CpuHardLimit", this.CpuHardLimit);
        this.setParamSimple(map, prefix + "MinCpuPercent", this.MinCpuPercent);
        this.setParamSimple(map, prefix + "MinMemoryPercent", this.MinMemoryPercent);
        this.setParamSimple(map, prefix + "MaxConcurrencyNum", this.MaxConcurrencyNum);
        this.setParamSimple(map, prefix + "MaxQueueSize", this.MaxQueueSize);
        this.setParamSimple(map, prefix + "QueueTimeout", this.QueueTimeout);

    }
}

