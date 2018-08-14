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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo  extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主机id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主机别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 故障类型id
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Integer TaskTypeId;

    /**
    * 任务状态id
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 授权时间
    */
    @SerializedName("AuthTime")
    @Expose
    private String AuthTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务详情
    */
    @SerializedName("TaskDetail")
    @Expose
    private String TaskDetail;

    /**
    * 设备状态
    */
    @SerializedName("DeviceStatus")
    @Expose
    private Integer DeviceStatus;

    /**
    * 设备操作状态
    */
    @SerializedName("OperateStatus")
    @Expose
    private Integer OperateStatus;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 所属网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所在子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * VPC名
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VpcCidrBlock
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * SubnetCidrBlock
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * 公网ip
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 内网IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 管理IP
    */
    @SerializedName("MgtIp")
    @Expose
    private String MgtIp;

    /**
     * 获取任务id
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取主机id
     * @return InstanceId 主机id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置主机id
     * @param InstanceId 主机id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取主机别名
     * @return Alias 主机别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置主机别名
     * @param Alias 主机别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取故障类型id
     * @return TaskTypeId 故障类型id
     */
    public Integer getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * 设置故障类型id
     * @param TaskTypeId 故障类型id
     */
    public void setTaskTypeId(Integer TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * 获取任务状态id
     * @return TaskStatus 任务状态id
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置任务状态id
     * @param TaskStatus 任务状态id
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取授权时间
     * @return AuthTime 授权时间
     */
    public String getAuthTime() {
        return this.AuthTime;
    }

    /**
     * 设置授权时间
     * @param AuthTime 授权时间
     */
    public void setAuthTime(String AuthTime) {
        this.AuthTime = AuthTime;
    }

    /**
     * 获取结束时间
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取任务详情
     * @return TaskDetail 任务详情
     */
    public String getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * 设置任务详情
     * @param TaskDetail 任务详情
     */
    public void setTaskDetail(String TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    /**
     * 获取设备状态
     * @return DeviceStatus 设备状态
     */
    public Integer getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * 设置设备状态
     * @param DeviceStatus 设备状态
     */
    public void setDeviceStatus(Integer DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * 获取设备操作状态
     * @return OperateStatus 设备操作状态
     */
    public Integer getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * 设置设备操作状态
     * @param OperateStatus 设备操作状态
     */
    public void setOperateStatus(Integer OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取地域
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取所属网络
     * @return VpcId 所属网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置所属网络
     * @param VpcId 所属网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取所在子网
     * @return SubnetId 所在子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置所在子网
     * @param SubnetId 所在子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取子网名
     * @return SubnetName 子网名
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置子网名
     * @param SubnetName 子网名
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取VPC名
     * @return VpcName VPC名
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置VPC名
     * @param VpcName VPC名
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取VpcCidrBlock
     * @return VpcCidrBlock VpcCidrBlock
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置VpcCidrBlock
     * @param VpcCidrBlock VpcCidrBlock
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取SubnetCidrBlock
     * @return SubnetCidrBlock SubnetCidrBlock
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * 设置SubnetCidrBlock
     * @param SubnetCidrBlock SubnetCidrBlock
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * 获取公网ip
     * @return WanIp 公网ip
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * 设置公网ip
     * @param WanIp 公网ip
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * 获取内网IP
     * @return LanIp 内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置内网IP
     * @param LanIp 内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取管理IP
     * @return MgtIp 管理IP
     */
    public String getMgtIp() {
        return this.MgtIp;
    }

    /**
     * 设置管理IP
     * @param MgtIp 管理IP
     */
    public void setMgtIp(String MgtIp) {
        this.MgtIp = MgtIp;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AuthTime", this.AuthTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskDetail", this.TaskDetail);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "OperateStatus", this.OperateStatus);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "MgtIp", this.MgtIp);

    }
}

