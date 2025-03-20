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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedCluster extends AbstractModel {

    /**
    * 专属集群ID
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 专属集群名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 专属集群所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 灾备集群
    */
    @SerializedName("StandbyDedicatedClusterSet")
    @Expose
    private String [] StandbyDedicatedClusterSet;

    /**
    * 实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Cpu总量
    */
    @SerializedName("CpuTotal")
    @Expose
    private Long CpuTotal;

    /**
    * Cpu可用数量
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Long CpuAvailable;

    /**
    * 内存总量
    */
    @SerializedName("MemTotal")
    @Expose
    private Long MemTotal;

    /**
    * 内存可用量
    */
    @SerializedName("MemAvailable")
    @Expose
    private Long MemAvailable;

    /**
    * 磁盘总量
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
    * 磁盘可用量
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Long DiskAvailable;

    /**
     * Get 专属集群ID 
     * @return DedicatedClusterId 专属集群ID
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 专属集群ID
     * @param DedicatedClusterId 专属集群ID
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 专属集群名称 
     * @return Name 专属集群名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 专属集群名称
     * @param Name 专属集群名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 专属集群所在可用区 
     * @return Zone 专属集群所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 专属集群所在可用区
     * @param Zone 专属集群所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 灾备集群 
     * @return StandbyDedicatedClusterSet 灾备集群
     */
    public String [] getStandbyDedicatedClusterSet() {
        return this.StandbyDedicatedClusterSet;
    }

    /**
     * Set 灾备集群
     * @param StandbyDedicatedClusterSet 灾备集群
     */
    public void setStandbyDedicatedClusterSet(String [] StandbyDedicatedClusterSet) {
        this.StandbyDedicatedClusterSet = StandbyDedicatedClusterSet;
    }

    /**
     * Get 实例数量 
     * @return InstanceCount 实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例数量
     * @param InstanceCount 实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Cpu总量 
     * @return CpuTotal Cpu总量
     */
    public Long getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set Cpu总量
     * @param CpuTotal Cpu总量
     */
    public void setCpuTotal(Long CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get Cpu可用数量 
     * @return CpuAvailable Cpu可用数量
     */
    public Long getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set Cpu可用数量
     * @param CpuAvailable Cpu可用数量
     */
    public void setCpuAvailable(Long CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get 内存总量 
     * @return MemTotal 内存总量
     */
    public Long getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set 内存总量
     * @param MemTotal 内存总量
     */
    public void setMemTotal(Long MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get 内存可用量 
     * @return MemAvailable 内存可用量
     */
    public Long getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set 内存可用量
     * @param MemAvailable 内存可用量
     */
    public void setMemAvailable(Long MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get 磁盘总量 
     * @return DiskTotal 磁盘总量
     */
    public Long getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set 磁盘总量
     * @param DiskTotal 磁盘总量
     */
    public void setDiskTotal(Long DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get 磁盘可用量 
     * @return DiskAvailable 磁盘可用量
     */
    public Long getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set 磁盘可用量
     * @param DiskAvailable 磁盘可用量
     */
    public void setDiskAvailable(Long DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    public DedicatedCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedCluster(DedicatedCluster source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StandbyDedicatedClusterSet != null) {
            this.StandbyDedicatedClusterSet = new String[source.StandbyDedicatedClusterSet.length];
            for (int i = 0; i < source.StandbyDedicatedClusterSet.length; i++) {
                this.StandbyDedicatedClusterSet[i] = new String(source.StandbyDedicatedClusterSet[i]);
            }
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.CpuTotal != null) {
            this.CpuTotal = new Long(source.CpuTotal);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Long(source.CpuAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Long(source.MemTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Long(source.MemAvailable);
        }
        if (source.DiskTotal != null) {
            this.DiskTotal = new Long(source.DiskTotal);
        }
        if (source.DiskAvailable != null) {
            this.DiskAvailable = new Long(source.DiskAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "StandbyDedicatedClusterSet.", this.StandbyDedicatedClusterSet);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);

    }
}

