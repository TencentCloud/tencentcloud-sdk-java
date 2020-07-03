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

public class TaskInfo extends AbstractModel{

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
    private Long TaskTypeId;

    /**
    * 任务状态id
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

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
    private Long DeviceStatus;

    /**
    * 设备操作状态
    */
    @SerializedName("OperateStatus")
    @Expose
    private Long OperateStatus;

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
    * 故障类中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * 故障类型，取值：unconfirmed (不明确故障)；redundancy (有冗余故障)；nonredundancy (无冗余故障)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSubType")
    @Expose
    private String TaskSubType;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 主机id 
     * @return InstanceId 主机id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主机id
     * @param InstanceId 主机id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主机别名 
     * @return Alias 主机别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 主机别名
     * @param Alias 主机别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 故障类型id 
     * @return TaskTypeId 故障类型id
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 故障类型id
     * @param TaskTypeId 故障类型id
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 任务状态id 
     * @return TaskStatus 任务状态id
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态id
     * @param TaskStatus 任务状态id
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 授权时间 
     * @return AuthTime 授权时间
     */
    public String getAuthTime() {
        return this.AuthTime;
    }

    /**
     * Set 授权时间
     * @param AuthTime 授权时间
     */
    public void setAuthTime(String AuthTime) {
        this.AuthTime = AuthTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务详情 
     * @return TaskDetail 任务详情
     */
    public String getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * Set 任务详情
     * @param TaskDetail 任务详情
     */
    public void setTaskDetail(String TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    /**
     * Get 设备状态 
     * @return DeviceStatus 设备状态
     */
    public Long getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 设备状态
     * @param DeviceStatus 设备状态
     */
    public void setDeviceStatus(Long DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get 设备操作状态 
     * @return OperateStatus 设备操作状态
     */
    public Long getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * Set 设备操作状态
     * @param OperateStatus 设备操作状态
     */
    public void setOperateStatus(Long OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 所属网络 
     * @return VpcId 所属网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属网络
     * @param VpcId 所属网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所在子网 
     * @return SubnetId 所在子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所在子网
     * @param SubnetId 所在子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名 
     * @return SubnetName 子网名
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名
     * @param SubnetName 子网名
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get VPC名 
     * @return VpcName VPC名
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名
     * @param VpcName VPC名
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VpcCidrBlock 
     * @return VpcCidrBlock VpcCidrBlock
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set VpcCidrBlock
     * @param VpcCidrBlock VpcCidrBlock
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get SubnetCidrBlock 
     * @return SubnetCidrBlock SubnetCidrBlock
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * Set SubnetCidrBlock
     * @param SubnetCidrBlock SubnetCidrBlock
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * Get 公网ip 
     * @return WanIp 公网ip
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 公网ip
     * @param WanIp 公网ip
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 内网IP 
     * @return LanIp 内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 内网IP
     * @param LanIp 内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 管理IP 
     * @return MgtIp 管理IP
     */
    public String getMgtIp() {
        return this.MgtIp;
    }

    /**
     * Set 管理IP
     * @param MgtIp 管理IP
     */
    public void setMgtIp(String MgtIp) {
        this.MgtIp = MgtIp;
    }

    /**
     * Get 故障类中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeName 故障类中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set 故障类中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeName 故障类中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get 故障类型，取值：unconfirmed (不明确故障)；redundancy (有冗余故障)；nonredundancy (无冗余故障)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSubType 故障类型，取值：unconfirmed (不明确故障)；redundancy (有冗余故障)；nonredundancy (无冗余故障)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskSubType() {
        return this.TaskSubType;
    }

    /**
     * Set 故障类型，取值：unconfirmed (不明确故障)；redundancy (有冗余故障)；nonredundancy (无冗余故障)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSubType 故障类型，取值：unconfirmed (不明确故障)；redundancy (有冗余故障)；nonredundancy (无冗余故障)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSubType(String TaskSubType) {
        this.TaskSubType = TaskSubType;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamSimple(map, prefix + "TaskSubType", this.TaskSubType);

    }
}

