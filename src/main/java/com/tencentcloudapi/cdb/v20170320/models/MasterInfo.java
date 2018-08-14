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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MasterInfo  extends AbstractModel{

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例长ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private Integer InstanceType;

    /**
    * 任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;

    /**
    * 内存容量
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 硬盘容量
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 实例机型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 每秒查询数
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 独享集群ID
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * 独享集群名称
    */
    @SerializedName("ExClusterName")
    @Expose
    private String ExClusterName;

    /**
     * 获取地域信息
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取地域ID
     * @return RegionId 地域ID
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取可用区ID
     * @return ZoneId 可用区ID
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取可用区信息
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例长ID
     * @return ResourceId 实例长ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置实例长ID
     * @param ResourceId 实例长ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 获取实例状态
     * @return Status 实例状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态
     * @param Status 实例状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取实例类型
     * @return InstanceType 实例类型
     */
    public Integer getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(Integer InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取任务状态
     * @return TaskStatus 任务状态
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置任务状态
     * @param TaskStatus 任务状态
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取内存容量
     * @return Memory 内存容量
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存容量
     * @param Memory 内存容量
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取硬盘容量
     * @return Volume 硬盘容量
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置硬盘容量
     * @param Volume 硬盘容量
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取实例机型
     * @return DeviceType 实例机型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置实例机型
     * @param DeviceType 实例机型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取每秒查询数
     * @return Qps 每秒查询数
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置每秒查询数
     * @param Qps 每秒查询数
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取独享集群ID
     * @return ExClusterId 独享集群ID
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * 设置独享集群ID
     * @param ExClusterId 独享集群ID
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * 获取独享集群名称
     * @return ExClusterName 独享集群名称
     */
    public String getExClusterName() {
        return this.ExClusterName;
    }

    /**
     * 设置独享集群名称
     * @param ExClusterName 独享集群名称
     */
    public void setExClusterName(String ExClusterName) {
        this.ExClusterName = ExClusterName;
    }

    /**
     * 内部实现，用户禁止调用
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

