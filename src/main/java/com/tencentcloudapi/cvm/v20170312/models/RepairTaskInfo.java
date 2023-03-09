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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RepairTaskInfo extends AbstractModel{

    /**
    * 维修任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 任务类型ID，与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 任务类型中文名
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * 任务状态ID，与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 设备状态ID，与设备状态中文名的对应关系如下：

- `1`：故障中
- `2`：处理中
- `3`：正常
- `4`：已预约
- `5`：已取消
- `6`：已避免
    */
    @SerializedName("DeviceStatus")
    @Expose
    private Long DeviceStatus;

    /**
    * 操作状态ID，与操作状态中文名的对应关系如下：

- `1`：未授权
- `2`：已授权
- `3`：已处理
- `4`：已预约
- `5`：已取消
- `6`：已避免
    */
    @SerializedName("OperateStatus")
    @Expose
    private Long OperateStatus;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务授权时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthTime")
    @Expose
    private String AuthTime;

    /**
    * 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskDetail")
    @Expose
    private String TaskDetail;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所在私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 所在子网名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSubType")
    @Expose
    private String TaskSubType;

    /**
    * 任务授权类型
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 授权渠道，支持取值：

- `Waiting_auth`：待授权
- `Customer_auth`：客户操作授权
- `System_mandatory_auth`：系统默认授权
- `Pre_policy_auth`：预置策略授权
    */
    @SerializedName("AuthSource")
    @Expose
    private String AuthSource;

    /**
     * Get 维修任务ID 
     * @return TaskId 维修任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 维修任务ID
     * @param TaskId 维修任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 任务类型ID，与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。 
     * @return TaskTypeId 任务类型ID，与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型ID，与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
     * @param TaskTypeId 任务类型ID，与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 任务类型中文名 
     * @return TaskTypeName 任务类型中文名
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set 任务类型中文名
     * @param TaskTypeName 任务类型中文名
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get 任务状态ID，与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。 
     * @return TaskStatus 任务状态ID，与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态ID，与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
     * @param TaskStatus 任务状态ID，与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 设备状态ID，与设备状态中文名的对应关系如下：

- `1`：故障中
- `2`：处理中
- `3`：正常
- `4`：已预约
- `5`：已取消
- `6`：已避免 
     * @return DeviceStatus 设备状态ID，与设备状态中文名的对应关系如下：

- `1`：故障中
- `2`：处理中
- `3`：正常
- `4`：已预约
- `5`：已取消
- `6`：已避免
     */
    public Long getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 设备状态ID，与设备状态中文名的对应关系如下：

- `1`：故障中
- `2`：处理中
- `3`：正常
- `4`：已预约
- `5`：已取消
- `6`：已避免
     * @param DeviceStatus 设备状态ID，与设备状态中文名的对应关系如下：

- `1`：故障中
- `2`：处理中
- `3`：正常
- `4`：已预约
- `5`：已取消
- `6`：已避免
     */
    public void setDeviceStatus(Long DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get 操作状态ID，与操作状态中文名的对应关系如下：

- `1`：未授权
- `2`：已授权
- `3`：已处理
- `4`：已预约
- `5`：已取消
- `6`：已避免 
     * @return OperateStatus 操作状态ID，与操作状态中文名的对应关系如下：

- `1`：未授权
- `2`：已授权
- `3`：已处理
- `4`：已预约
- `5`：已取消
- `6`：已避免
     */
    public Long getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * Set 操作状态ID，与操作状态中文名的对应关系如下：

- `1`：未授权
- `2`：已授权
- `3`：已处理
- `4`：已预约
- `5`：已取消
- `6`：已避免
     * @param OperateStatus 操作状态ID，与操作状态中文名的对应关系如下：

- `1`：未授权
- `2`：已授权
- `3`：已处理
- `4`：已预约
- `5`：已取消
- `6`：已避免
     */
    public void setOperateStatus(Long OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务授权时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthTime 任务授权时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthTime() {
        return this.AuthTime;
    }

    /**
     * Set 任务授权时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthTime 任务授权时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthTime(String AuthTime) {
        this.AuthTime = AuthTime;
    }

    /**
     * Get 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskDetail 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * Set 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskDetail 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskDetail(String TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 所在私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所在私有网络名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName 所在私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 所在私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName 所在私有网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 所在子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 所在子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 所在子网名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetName 所在子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 所在子网名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetName 所在子网名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp 实例公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 实例内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanIp 实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanIp 实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 产品类型，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 任务子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSubType 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskSubType() {
        return this.TaskSubType;
    }

    /**
     * Set 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSubType 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSubType(String TaskSubType) {
        this.TaskSubType = TaskSubType;
    }

    /**
     * Get 任务授权类型 
     * @return AuthType 任务授权类型
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 任务授权类型
     * @param AuthType 任务授权类型
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 授权渠道，支持取值：

- `Waiting_auth`：待授权
- `Customer_auth`：客户操作授权
- `System_mandatory_auth`：系统默认授权
- `Pre_policy_auth`：预置策略授权 
     * @return AuthSource 授权渠道，支持取值：

- `Waiting_auth`：待授权
- `Customer_auth`：客户操作授权
- `System_mandatory_auth`：系统默认授权
- `Pre_policy_auth`：预置策略授权
     */
    public String getAuthSource() {
        return this.AuthSource;
    }

    /**
     * Set 授权渠道，支持取值：

- `Waiting_auth`：待授权
- `Customer_auth`：客户操作授权
- `System_mandatory_auth`：系统默认授权
- `Pre_policy_auth`：预置策略授权
     * @param AuthSource 授权渠道，支持取值：

- `Waiting_auth`：待授权
- `Customer_auth`：客户操作授权
- `System_mandatory_auth`：系统默认授权
- `Pre_policy_auth`：预置策略授权
     */
    public void setAuthSource(String AuthSource) {
        this.AuthSource = AuthSource;
    }

    public RepairTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RepairTaskInfo(RepairTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new Long(source.DeviceStatus);
        }
        if (source.OperateStatus != null) {
            this.OperateStatus = new Long(source.OperateStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AuthTime != null) {
            this.AuthTime = new String(source.AuthTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskDetail != null) {
            this.TaskDetail = new String(source.TaskDetail);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.TaskSubType != null) {
            this.TaskSubType = new String(source.TaskSubType);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.AuthSource != null) {
            this.AuthSource = new String(source.AuthSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "OperateStatus", this.OperateStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AuthTime", this.AuthTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskDetail", this.TaskDetail);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "TaskSubType", this.TaskSubType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "AuthSource", this.AuthSource);

    }
}

