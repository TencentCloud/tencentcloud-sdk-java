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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例状态<br>PENDING：表示创建中<br>LAUNCH_FAILED：表示创建失败<br>RUNNING：表示运行中<br>STOPPED：表示关机<br>STARTING：表示开机中<br>STOPPING：表示关机中<br>REBOOTING：表示重启中<br>SHUTDOWN：表示停止待销毁<br>TERMINATING：表示销毁中<br>DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm侧资源已经不存在了<br>FAILED：表示资源创建失败.这个是业务层面的状态<br>ROLLBACKING：表示回滚中<br>USING：表示使用中<br>RESETTING：表示重置中.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例拥有者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>实例规格<br>S1.LARGE8：4VCPU 2.5GHZ主频 8G内存 无显卡<br>S1.LARGE16：4VCPU 2.5GHZ主频 16G内存 无显卡<br>S2.2XLARGE16：8VCPU 3.2GHZ主频 16G内存 无显卡<br>G1.LARGE16：4VCPU 2.5GHZ主频 16G内存 1/4 NVIDIA T4<br>G1.2XLARGE32：8VCPU 2.5GHZ主频 32G内存 1/2 NVIDIA T4<br>G1.4XLARGE64：16VCPU 2.5GHZ主频 64G内存 1 NVIDIA T4</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>系统盘信息</p>
    */
    @SerializedName("SysDisk")
    @Expose
    private Disk SysDisk;

    /**
    * <p>挂载的数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDiskList")
    @Expose
    private Disk [] DataDiskList;

    /**
    * <p>桌面实例所在的区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>桌面计费类型</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>自动续费标识。取值范围：<br>NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费<br>NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：表示不通知即将过期，也不自动续费。</p><p>注意：后付费模式本项为null</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private String AutoRenewFlag;

    /**
    * <p>桌面创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>桌面过期时间</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>桌面描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>桌面hostname</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>桌面拥有者显示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>桌面绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * <p>创建桌面的镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>用户桌面vpc id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVpcId")
    @Expose
    private String UserVpcId;

    /**
    * <p>用户桌面子网 id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * <p>用户桌面ip</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserPrivateIp")
    @Expose
    private String UserPrivateIp;

    /**
    * <p>机器回收站到期时间，只有机器状态为SHUTDOWN该值才有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>最近一次状态变更原因, AUTO:被动变更,如欠费,如包月实例到期, MANUAL:主动变更,如主动退还实例，当前只有机器处于ISOLATING、SHUTDOWN、TERMINATING、DELETED该字段有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastStatusChangeReason")
    @Expose
    private String LastStatusChangeReason;

    /**
    * <p>机器最近一次操作</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * <p>机器最近一次操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * <p>机器最近一次操作请求ReqId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationRequestID")
    @Expose
    private String LatestOperationRequestID;

    /**
    * <p>机器操作系统名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>实例逻辑set</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
    * <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>关联的安全组ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * <p>预付费实例降配次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownGradeTimes")
    @Expose
    private Long DownGradeTimes;

    /**
    * <p>桌面绑定的域名策略ID列表，最多五个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainControlPolicies")
    @Expose
    private String [] DomainControlPolicies;

    /**
    * <p>桌面绑定的水印策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaterMarkPolicy")
    @Expose
    private String WaterMarkPolicy;

    /**
    * <p>桌面绑定的录屏策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScreenRecordingPolicy")
    @Expose
    private String ScreenRecordingPolicy;

    /**
    * <p>WHITE --- 白名单策略<br>BLACK --- 黑名单策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainControlPolicyType")
    @Expose
    private String DomainControlPolicyType;

    /**
    * <p>桌面绑定的运行管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunControlPolicy")
    @Expose
    private String RunControlPolicy;

    /**
    * <p>桌面绑定的安装管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstallControlPolicy")
    @Expose
    private String InstallControlPolicy;

    /**
    * <p>桌面是否绑定匿名用户</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnonymousAccess")
    @Expose
    private Boolean AnonymousAccess;

    /**
    * <p>实例绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return Name <p>实例名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名称</p>
     * @param Name <p>实例名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例状态<br>PENDING：表示创建中<br>LAUNCH_FAILED：表示创建失败<br>RUNNING：表示运行中<br>STOPPED：表示关机<br>STARTING：表示开机中<br>STOPPING：表示关机中<br>REBOOTING：表示重启中<br>SHUTDOWN：表示停止待销毁<br>TERMINATING：表示销毁中<br>DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm侧资源已经不存在了<br>FAILED：表示资源创建失败.这个是业务层面的状态<br>ROLLBACKING：表示回滚中<br>USING：表示使用中<br>RESETTING：表示重置中.</p> 
     * @return Status <p>实例状态<br>PENDING：表示创建中<br>LAUNCH_FAILED：表示创建失败<br>RUNNING：表示运行中<br>STOPPED：表示关机<br>STARTING：表示开机中<br>STOPPING：表示关机中<br>REBOOTING：表示重启中<br>SHUTDOWN：表示停止待销毁<br>TERMINATING：表示销毁中<br>DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm侧资源已经不存在了<br>FAILED：表示资源创建失败.这个是业务层面的状态<br>ROLLBACKING：表示回滚中<br>USING：表示使用中<br>RESETTING：表示重置中.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态<br>PENDING：表示创建中<br>LAUNCH_FAILED：表示创建失败<br>RUNNING：表示运行中<br>STOPPED：表示关机<br>STARTING：表示开机中<br>STOPPING：表示关机中<br>REBOOTING：表示重启中<br>SHUTDOWN：表示停止待销毁<br>TERMINATING：表示销毁中<br>DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm侧资源已经不存在了<br>FAILED：表示资源创建失败.这个是业务层面的状态<br>ROLLBACKING：表示回滚中<br>USING：表示使用中<br>RESETTING：表示重置中.</p>
     * @param Status <p>实例状态<br>PENDING：表示创建中<br>LAUNCH_FAILED：表示创建失败<br>RUNNING：表示运行中<br>STOPPED：表示关机<br>STARTING：表示开机中<br>STOPPING：表示关机中<br>REBOOTING：表示重启中<br>SHUTDOWN：表示停止待销毁<br>TERMINATING：表示销毁中<br>DELETED：表示资源已经销毁，这个状态是业务层面的状态，cvm如果销毁了，在cvm侧资源已经不存在了<br>FAILED：表示资源创建失败.这个是业务层面的状态<br>ROLLBACKING：表示回滚中<br>USING：表示使用中<br>RESETTING：表示重置中.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例拥有者名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>实例拥有者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>实例拥有者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>实例拥有者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId <p>实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>实例规格<br>S1.LARGE8：4VCPU 2.5GHZ主频 8G内存 无显卡<br>S1.LARGE16：4VCPU 2.5GHZ主频 16G内存 无显卡<br>S2.2XLARGE16：8VCPU 3.2GHZ主频 16G内存 无显卡<br>G1.LARGE16：4VCPU 2.5GHZ主频 16G内存 1/4 NVIDIA T4<br>G1.2XLARGE32：8VCPU 2.5GHZ主频 32G内存 1/2 NVIDIA T4<br>G1.4XLARGE64：16VCPU 2.5GHZ主频 64G内存 1 NVIDIA T4</p> 
     * @return InstanceType <p>实例规格<br>S1.LARGE8：4VCPU 2.5GHZ主频 8G内存 无显卡<br>S1.LARGE16：4VCPU 2.5GHZ主频 16G内存 无显卡<br>S2.2XLARGE16：8VCPU 3.2GHZ主频 16G内存 无显卡<br>G1.LARGE16：4VCPU 2.5GHZ主频 16G内存 1/4 NVIDIA T4<br>G1.2XLARGE32：8VCPU 2.5GHZ主频 32G内存 1/2 NVIDIA T4<br>G1.4XLARGE64：16VCPU 2.5GHZ主频 64G内存 1 NVIDIA T4</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例规格<br>S1.LARGE8：4VCPU 2.5GHZ主频 8G内存 无显卡<br>S1.LARGE16：4VCPU 2.5GHZ主频 16G内存 无显卡<br>S2.2XLARGE16：8VCPU 3.2GHZ主频 16G内存 无显卡<br>G1.LARGE16：4VCPU 2.5GHZ主频 16G内存 1/4 NVIDIA T4<br>G1.2XLARGE32：8VCPU 2.5GHZ主频 32G内存 1/2 NVIDIA T4<br>G1.4XLARGE64：16VCPU 2.5GHZ主频 64G内存 1 NVIDIA T4</p>
     * @param InstanceType <p>实例规格<br>S1.LARGE8：4VCPU 2.5GHZ主频 8G内存 无显卡<br>S1.LARGE16：4VCPU 2.5GHZ主频 16G内存 无显卡<br>S2.2XLARGE16：8VCPU 3.2GHZ主频 16G内存 无显卡<br>G1.LARGE16：4VCPU 2.5GHZ主频 16G内存 1/4 NVIDIA T4<br>G1.2XLARGE32：8VCPU 2.5GHZ主频 32G内存 1/2 NVIDIA T4<br>G1.4XLARGE64：16VCPU 2.5GHZ主频 64G内存 1 NVIDIA T4</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>系统盘信息</p> 
     * @return SysDisk <p>系统盘信息</p>
     */
    public Disk getSysDisk() {
        return this.SysDisk;
    }

    /**
     * Set <p>系统盘信息</p>
     * @param SysDisk <p>系统盘信息</p>
     */
    public void setSysDisk(Disk SysDisk) {
        this.SysDisk = SysDisk;
    }

    /**
     * Get <p>挂载的数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDiskList <p>挂载的数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Disk [] getDataDiskList() {
        return this.DataDiskList;
    }

    /**
     * Set <p>挂载的数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDiskList <p>挂载的数据盘信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDiskList(Disk [] DataDiskList) {
        this.DataDiskList = DataDiskList;
    }

    /**
     * Get <p>桌面实例所在的区域</p> 
     * @return Region <p>桌面实例所在的区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>桌面实例所在的区域</p>
     * @param Region <p>桌面实例所在的区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>桌面计费类型</p> 
     * @return ChargeType <p>桌面计费类型</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>桌面计费类型</p>
     * @param ChargeType <p>桌面计费类型</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>自动续费标识。取值范围：<br>NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费<br>NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：表示不通知即将过期，也不自动续费。</p><p>注意：后付费模式本项为null</p> 
     * @return AutoRenewFlag <p>自动续费标识。取值范围：<br>NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费<br>NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：表示不通知即将过期，也不自动续费。</p><p>注意：后付费模式本项为null</p>
     */
    public String getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标识。取值范围：<br>NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费<br>NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：表示不通知即将过期，也不自动续费。</p><p>注意：后付费模式本项为null</p>
     * @param AutoRenewFlag <p>自动续费标识。取值范围：<br>NOTIFY_AND_MANUAL_RENEW：表示通知即将过期，但不自动续费<br>NOTIFY_AND_AUTO_RENEW：表示通知即将过期，而且自动续费<br>DISABLE_NOTIFY_AND_MANUAL_RENEW：表示不通知即将过期，也不自动续费。</p><p>注意：后付费模式本项为null</p>
     */
    public void setAutoRenewFlag(String AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>桌面创建时间</p> 
     * @return CreateTime <p>桌面创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>桌面创建时间</p>
     * @param CreateTime <p>桌面创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>桌面过期时间</p> 
     * @return ExpiredTime <p>桌面过期时间</p>
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>桌面过期时间</p>
     * @param ExpiredTime <p>桌面过期时间</p>
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>桌面描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>桌面描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>桌面描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>桌面描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>桌面hostname</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName <p>桌面hostname</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>桌面hostname</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName <p>桌面hostname</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>桌面拥有者显示名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName <p>桌面拥有者显示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>桌面拥有者显示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName <p>桌面拥有者显示名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>桌面绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindStatus <p>桌面绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set <p>桌面绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindStatus <p>桌面绑定状态。取值：<br>UNBOUND - 未绑定<br>BINDING - 绑定中<br>BOUND - 绑定</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get <p>创建桌面的镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId <p>创建桌面的镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>创建桌面的镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId <p>创建桌面的镜像id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>用户桌面vpc id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVpcId <p>用户桌面vpc id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVpcId() {
        return this.UserVpcId;
    }

    /**
     * Set <p>用户桌面vpc id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVpcId <p>用户桌面vpc id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVpcId(String UserVpcId) {
        this.UserVpcId = UserVpcId;
    }

    /**
     * Get <p>用户桌面子网 id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserSubnetId <p>用户桌面子网 id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set <p>用户桌面子网 id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserSubnetId <p>用户桌面子网 id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get <p>用户桌面ip</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserPrivateIp <p>用户桌面ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserPrivateIp() {
        return this.UserPrivateIp;
    }

    /**
     * Set <p>用户桌面ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserPrivateIp <p>用户桌面ip</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserPrivateIp(String UserPrivateIp) {
        this.UserPrivateIp = UserPrivateIp;
    }

    /**
     * Get <p>机器回收站到期时间，只有机器状态为SHUTDOWN该值才有意义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime <p>机器回收站到期时间，只有机器状态为SHUTDOWN该值才有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>机器回收站到期时间，只有机器状态为SHUTDOWN该值才有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime <p>机器回收站到期时间，只有机器状态为SHUTDOWN该值才有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>最近一次状态变更原因, AUTO:被动变更,如欠费,如包月实例到期, MANUAL:主动变更,如主动退还实例，当前只有机器处于ISOLATING、SHUTDOWN、TERMINATING、DELETED该字段有意义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastStatusChangeReason <p>最近一次状态变更原因, AUTO:被动变更,如欠费,如包月实例到期, MANUAL:主动变更,如主动退还实例，当前只有机器处于ISOLATING、SHUTDOWN、TERMINATING、DELETED该字段有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastStatusChangeReason() {
        return this.LastStatusChangeReason;
    }

    /**
     * Set <p>最近一次状态变更原因, AUTO:被动变更,如欠费,如包月实例到期, MANUAL:主动变更,如主动退还实例，当前只有机器处于ISOLATING、SHUTDOWN、TERMINATING、DELETED该字段有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastStatusChangeReason <p>最近一次状态变更原因, AUTO:被动变更,如欠费,如包月实例到期, MANUAL:主动变更,如主动退还实例，当前只有机器处于ISOLATING、SHUTDOWN、TERMINATING、DELETED该字段有意义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastStatusChangeReason(String LastStatusChangeReason) {
        this.LastStatusChangeReason = LastStatusChangeReason;
    }

    /**
     * Get <p>机器最近一次操作</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation <p>机器最近一次操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set <p>机器最近一次操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation <p>机器最近一次操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get <p>机器最近一次操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState <p>机器最近一次操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set <p>机器最近一次操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState <p>机器最近一次操作状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get <p>机器最近一次操作请求ReqId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationRequestID <p>机器最近一次操作请求ReqId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationRequestID() {
        return this.LatestOperationRequestID;
    }

    /**
     * Set <p>机器最近一次操作请求ReqId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationRequestID <p>机器最近一次操作请求ReqId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationRequestID(String LatestOperationRequestID) {
        this.LatestOperationRequestID = LatestOperationRequestID;
    }

    /**
     * Get <p>机器操作系统名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsName <p>机器操作系统名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>机器操作系统名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsName <p>机器操作系统名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>实例逻辑set</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetId <p>实例逻辑set</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set <p>实例逻辑set</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetId <p>实例逻辑set</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    /**
     * Get <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>应用id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>关联的安全组ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroups <p>关联的安全组ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set <p>关联的安全组ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroups <p>关联的安全组ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get <p>预付费实例降配次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownGradeTimes <p>预付费实例降配次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDownGradeTimes() {
        return this.DownGradeTimes;
    }

    /**
     * Set <p>预付费实例降配次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownGradeTimes <p>预付费实例降配次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownGradeTimes(Long DownGradeTimes) {
        this.DownGradeTimes = DownGradeTimes;
    }

    /**
     * Get <p>桌面绑定的域名策略ID列表，最多五个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainControlPolicies <p>桌面绑定的域名策略ID列表，最多五个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomainControlPolicies() {
        return this.DomainControlPolicies;
    }

    /**
     * Set <p>桌面绑定的域名策略ID列表，最多五个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainControlPolicies <p>桌面绑定的域名策略ID列表，最多五个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainControlPolicies(String [] DomainControlPolicies) {
        this.DomainControlPolicies = DomainControlPolicies;
    }

    /**
     * Get <p>桌面绑定的水印策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaterMarkPolicy <p>桌面绑定的水印策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaterMarkPolicy() {
        return this.WaterMarkPolicy;
    }

    /**
     * Set <p>桌面绑定的水印策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaterMarkPolicy <p>桌面绑定的水印策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaterMarkPolicy(String WaterMarkPolicy) {
        this.WaterMarkPolicy = WaterMarkPolicy;
    }

    /**
     * Get <p>桌面绑定的录屏策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScreenRecordingPolicy <p>桌面绑定的录屏策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScreenRecordingPolicy() {
        return this.ScreenRecordingPolicy;
    }

    /**
     * Set <p>桌面绑定的录屏策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScreenRecordingPolicy <p>桌面绑定的录屏策略ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScreenRecordingPolicy(String ScreenRecordingPolicy) {
        this.ScreenRecordingPolicy = ScreenRecordingPolicy;
    }

    /**
     * Get <p>WHITE --- 白名单策略<br>BLACK --- 黑名单策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainControlPolicyType <p>WHITE --- 白名单策略<br>BLACK --- 黑名单策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainControlPolicyType() {
        return this.DomainControlPolicyType;
    }

    /**
     * Set <p>WHITE --- 白名单策略<br>BLACK --- 黑名单策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainControlPolicyType <p>WHITE --- 白名单策略<br>BLACK --- 黑名单策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainControlPolicyType(String DomainControlPolicyType) {
        this.DomainControlPolicyType = DomainControlPolicyType;
    }

    /**
     * Get <p>桌面绑定的运行管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunControlPolicy <p>桌面绑定的运行管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunControlPolicy() {
        return this.RunControlPolicy;
    }

    /**
     * Set <p>桌面绑定的运行管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunControlPolicy <p>桌面绑定的运行管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunControlPolicy(String RunControlPolicy) {
        this.RunControlPolicy = RunControlPolicy;
    }

    /**
     * Get <p>桌面绑定的安装管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstallControlPolicy <p>桌面绑定的安装管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstallControlPolicy() {
        return this.InstallControlPolicy;
    }

    /**
     * Set <p>桌面绑定的安装管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstallControlPolicy <p>桌面绑定的安装管控策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstallControlPolicy(String InstallControlPolicy) {
        this.InstallControlPolicy = InstallControlPolicy;
    }

    /**
     * Get <p>桌面是否绑定匿名用户</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnonymousAccess <p>桌面是否绑定匿名用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAnonymousAccess() {
        return this.AnonymousAccess;
    }

    /**
     * Set <p>桌面是否绑定匿名用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnonymousAccess <p>桌面是否绑定匿名用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnonymousAccess(Boolean AnonymousAccess) {
        this.AnonymousAccess = AnonymousAccess;
    }

    /**
     * Get <p>实例绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>实例绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>实例绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SysDisk != null) {
            this.SysDisk = new Disk(source.SysDisk);
        }
        if (source.DataDiskList != null) {
            this.DataDiskList = new Disk[source.DataDiskList.length];
            for (int i = 0; i < source.DataDiskList.length; i++) {
                this.DataDiskList[i] = new Disk(source.DataDiskList[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new String(source.AutoRenewFlag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.UserVpcId != null) {
            this.UserVpcId = new String(source.UserVpcId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.UserPrivateIp != null) {
            this.UserPrivateIp = new String(source.UserPrivateIp);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.LastStatusChangeReason != null) {
            this.LastStatusChangeReason = new String(source.LastStatusChangeReason);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.LatestOperationRequestID != null) {
            this.LatestOperationRequestID = new String(source.LatestOperationRequestID);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.DownGradeTimes != null) {
            this.DownGradeTimes = new Long(source.DownGradeTimes);
        }
        if (source.DomainControlPolicies != null) {
            this.DomainControlPolicies = new String[source.DomainControlPolicies.length];
            for (int i = 0; i < source.DomainControlPolicies.length; i++) {
                this.DomainControlPolicies[i] = new String(source.DomainControlPolicies[i]);
            }
        }
        if (source.WaterMarkPolicy != null) {
            this.WaterMarkPolicy = new String(source.WaterMarkPolicy);
        }
        if (source.ScreenRecordingPolicy != null) {
            this.ScreenRecordingPolicy = new String(source.ScreenRecordingPolicy);
        }
        if (source.DomainControlPolicyType != null) {
            this.DomainControlPolicyType = new String(source.DomainControlPolicyType);
        }
        if (source.RunControlPolicy != null) {
            this.RunControlPolicy = new String(source.RunControlPolicy);
        }
        if (source.InstallControlPolicy != null) {
            this.InstallControlPolicy = new String(source.InstallControlPolicy);
        }
        if (source.AnonymousAccess != null) {
            this.AnonymousAccess = new Boolean(source.AnonymousAccess);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SysDisk.", this.SysDisk);
        this.setParamArrayObj(map, prefix + "DataDiskList.", this.DataDiskList);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "UserVpcId", this.UserVpcId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "UserPrivateIp", this.UserPrivateIp);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "LastStatusChangeReason", this.LastStatusChangeReason);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestID", this.LatestOperationRequestID);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "DownGradeTimes", this.DownGradeTimes);
        this.setParamArraySimple(map, prefix + "DomainControlPolicies.", this.DomainControlPolicies);
        this.setParamSimple(map, prefix + "WaterMarkPolicy", this.WaterMarkPolicy);
        this.setParamSimple(map, prefix + "ScreenRecordingPolicy", this.ScreenRecordingPolicy);
        this.setParamSimple(map, prefix + "DomainControlPolicyType", this.DomainControlPolicyType);
        this.setParamSimple(map, prefix + "RunControlPolicy", this.RunControlPolicy);
        this.setParamSimple(map, prefix + "InstallControlPolicy", this.InstallControlPolicy);
        this.setParamSimple(map, prefix + "AnonymousAccess", this.AnonymousAccess);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

