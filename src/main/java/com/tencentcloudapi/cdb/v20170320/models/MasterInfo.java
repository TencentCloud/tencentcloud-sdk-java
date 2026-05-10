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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MasterInfo extends AbstractModel {

    /**
    * <p>地域信息</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>可用区ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>可用区信息</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例长ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>内存容量</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>硬盘容量</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>实例机型</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>每秒查询数</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>独享集群ID</p>
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * <p>独享集群名称</p>
    */
    @SerializedName("ExClusterName")
    @Expose
    private String ExClusterName;

    /**
     * Get <p>地域信息</p> 
     * @return Region <p>地域信息</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域信息</p>
     * @param Region <p>地域信息</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionId <p>地域ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionId <p>地域ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>可用区ID</p> 
     * @return ZoneId <p>可用区ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区ID</p>
     * @param ZoneId <p>可用区ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>可用区信息</p> 
     * @return Zone <p>可用区信息</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息</p>
     * @param Zone <p>可用区信息</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例长ID</p> 
     * @return ResourceId <p>实例长ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>实例长ID</p>
     * @param ResourceId <p>实例长ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>实例状态</p> 
     * @return Status <p>实例状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
     * @param Status <p>实例状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceType <p>实例类型</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceType <p>实例类型</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>任务状态</p> 
     * @return TaskStatus <p>任务状态</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态</p>
     * @param TaskStatus <p>任务状态</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>内存容量</p> 
     * @return Memory <p>内存容量</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存容量</p>
     * @param Memory <p>内存容量</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>硬盘容量</p> 
     * @return Volume <p>硬盘容量</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>硬盘容量</p>
     * @param Volume <p>硬盘容量</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>实例机型</p> 
     * @return DeviceType <p>实例机型</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例机型</p>
     * @param DeviceType <p>实例机型</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>每秒查询数</p> 
     * @return Qps <p>每秒查询数</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>每秒查询数</p>
     * @param Qps <p>每秒查询数</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return VpcId <p>私有网络ID</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param VpcId <p>私有网络ID</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>独享集群ID</p> 
     * @return ExClusterId <p>独享集群ID</p>
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set <p>独享集群ID</p>
     * @param ExClusterId <p>独享集群ID</p>
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get <p>独享集群名称</p> 
     * @return ExClusterName <p>独享集群名称</p>
     */
    public String getExClusterName() {
        return this.ExClusterName;
    }

    /**
     * Set <p>独享集群名称</p>
     * @param ExClusterName <p>独享集群名称</p>
     */
    public void setExClusterName(String ExClusterName) {
        this.ExClusterName = ExClusterName;
    }

    public MasterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MasterInfo(MasterInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.ExClusterId != null) {
            this.ExClusterId = new String(source.ExClusterId);
        }
        if (source.ExClusterName != null) {
            this.ExClusterName = new String(source.ExClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ExClusterId", this.ExClusterId);
        this.setParamSimple(map, prefix + "ExClusterName", this.ExClusterName);

    }
}

