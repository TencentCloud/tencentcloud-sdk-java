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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeNodeInfo extends AbstractModel {

    /**
    * <p>节点名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Machine 状态</p>
    */
    @SerializedName("MachineState")
    @Expose
    private String MachineState;

    /**
    * <p>Machine 所在可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Machine 登录状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginStatus")
    @Expose
    private String LoginStatus;

    /**
    * <p>是否开启缩容保护</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsProtectedFromScaleIn")
    @Expose
    private Boolean IsProtectedFromScaleIn;

    /**
    * <p>Machine 名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>CPU核数，单位：核</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>GPU核数，单位：核</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPU")
    @Expose
    private Long GPU;

    /**
    * <p>自动续费标识</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>节点计费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>节点内存容量，单位：<code>GB</code></p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>节点系统盘配置信息</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private Disk SystemDisk;

    /**
    * <p>公网带宽相关信息设置</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>机型所属机型族</p>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * <p>节点内网 IP</p>
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * <p>机型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>包年包月节点计费过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>节点外网 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>节点密钥 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * <p>节点GPU相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUParams")
    @Expose
    private GPUParams GPUParams;

    /**
    * <p>数据盘列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>安全组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * <p>VPC 唯一 ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网唯一 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>OS的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsImage")
    @Expose
    private String OsImage;

    /**
    * <p><strong>原生节点的 Machine 类型</strong></p><ul><li>Native 表示 CXM 类型的原生节点</li><li>NativeCVM 表示 CVM 类型的原生节点</li></ul>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p><strong>原生节点对应的实例 ID</strong></p><ul><li>ins-q47ofw6 表示这个实例是一个 CVM 的实例</li><li>eks-f8mvyaep 表示这个实例是一个 CXM 的实例</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>原生节点云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>节点名称</p> 
     * @return MachineName <p>节点名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>节点名称</p>
     * @param MachineName <p>节点名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Machine 状态</p> 
     * @return MachineState <p>Machine 状态</p>
     */
    public String getMachineState() {
        return this.MachineState;
    }

    /**
     * Set <p>Machine 状态</p>
     * @param MachineState <p>Machine 状态</p>
     */
    public void setMachineState(String MachineState) {
        this.MachineState = MachineState;
    }

    /**
     * Get <p>Machine 所在可用区</p> 
     * @return Zone <p>Machine 所在可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Machine 所在可用区</p>
     * @param Zone <p>Machine 所在可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；</p> 
     * @return InstanceChargeType <p>节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；</p>
     * @param InstanceChargeType <p>节点计费类型。PREPAID：包年包月；POSTPAID_BY_HOUR：按量计费（默认）；</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Machine 登录状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginStatus <p>Machine 登录状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoginStatus() {
        return this.LoginStatus;
    }

    /**
     * Set <p>Machine 登录状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginStatus <p>Machine 登录状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginStatus(String LoginStatus) {
        this.LoginStatus = LoginStatus;
    }

    /**
     * Get <p>是否开启缩容保护</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsProtectedFromScaleIn <p>是否开启缩容保护</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsProtectedFromScaleIn() {
        return this.IsProtectedFromScaleIn;
    }

    /**
     * Set <p>是否开启缩容保护</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsProtectedFromScaleIn <p>是否开启缩容保护</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsProtectedFromScaleIn(Boolean IsProtectedFromScaleIn) {
        this.IsProtectedFromScaleIn = IsProtectedFromScaleIn;
    }

    /**
     * Get <p>Machine 名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName <p>Machine 名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>Machine 名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName <p>Machine 名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>CPU核数，单位：核</p> 
     * @return CPU <p>CPU核数，单位：核</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU核数，单位：核</p>
     * @param CPU <p>CPU核数，单位：核</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>GPU核数，单位：核</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPU <p>GPU核数，单位：核</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGPU() {
        return this.GPU;
    }

    /**
     * Set <p>GPU核数，单位：核</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPU <p>GPU核数，单位：核</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPU(Long GPU) {
        this.GPU = GPU;
    }

    /**
     * Get <p>自动续费标识</p> 
     * @return RenewFlag <p>自动续费标识</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识</p>
     * @param RenewFlag <p>自动续费标识</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>节点计费模式</p> 
     * @return PayMode <p>节点计费模式</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>节点计费模式</p>
     * @param PayMode <p>节点计费模式</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>节点内存容量，单位：<code>GB</code></p> 
     * @return Memory <p>节点内存容量，单位：<code>GB</code></p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>节点内存容量，单位：<code>GB</code></p>
     * @param Memory <p>节点内存容量，单位：<code>GB</code></p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>节点系统盘配置信息</p> 
     * @return SystemDisk <p>节点系统盘配置信息</p>
     */
    public Disk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>节点系统盘配置信息</p>
     * @param SystemDisk <p>节点系统盘配置信息</p>
     */
    public void setSystemDisk(Disk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>公网带宽相关信息设置</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置</p>
     * @param InternetAccessible <p>公网带宽相关信息设置</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>机型所属机型族</p> 
     * @return InstanceFamily <p>机型所属机型族</p>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set <p>机型所属机型族</p>
     * @param InstanceFamily <p>机型所属机型族</p>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get <p>节点内网 IP</p> 
     * @return LanIp <p>节点内网 IP</p>
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set <p>节点内网 IP</p>
     * @param LanIp <p>节点内网 IP</p>
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get <p>机型</p> 
     * @return InstanceType <p>机型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>机型</p>
     * @param InstanceType <p>机型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>包年包月节点计费过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime <p>包年包月节点计费过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>包年包月节点计费过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime <p>包年包月节点计费过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>节点外网 IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp <p>节点外网 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>节点外网 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp <p>节点外网 IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>节点密钥 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyIds <p>节点密钥 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set <p>节点密钥 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyIds <p>节点密钥 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get <p>节点GPU相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUParams <p>节点GPU相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GPUParams getGPUParams() {
        return this.GPUParams;
    }

    /**
     * Set <p>节点GPU相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUParams <p>节点GPU相关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUParams(GPUParams GPUParams) {
        this.GPUParams = GPUParams;
    }

    /**
     * Get <p>数据盘列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisks <p>数据盘列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>数据盘列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisks <p>数据盘列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>安全组列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIDs <p>安全组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set <p>安全组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIDs <p>安全组列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get <p>VPC 唯一 ID</p> 
     * @return VpcId <p>VPC 唯一 ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC 唯一 ID</p>
     * @param VpcId <p>VPC 唯一 ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网唯一 ID</p> 
     * @return SubnetId <p>子网唯一 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网唯一 ID</p>
     * @param SubnetId <p>子网唯一 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>OS的名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsImage <p>OS的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsImage() {
        return this.OsImage;
    }

    /**
     * Set <p>OS的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsImage <p>OS的名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsImage(String OsImage) {
        this.OsImage = OsImage;
    }

    /**
     * Get <p><strong>原生节点的 Machine 类型</strong></p><ul><li>Native 表示 CXM 类型的原生节点</li><li>NativeCVM 表示 CVM 类型的原生节点</li></ul> 
     * @return MachineType <p><strong>原生节点的 Machine 类型</strong></p><ul><li>Native 表示 CXM 类型的原生节点</li><li>NativeCVM 表示 CVM 类型的原生节点</li></ul>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p><strong>原生节点的 Machine 类型</strong></p><ul><li>Native 表示 CXM 类型的原生节点</li><li>NativeCVM 表示 CVM 类型的原生节点</li></ul>
     * @param MachineType <p><strong>原生节点的 Machine 类型</strong></p><ul><li>Native 表示 CXM 类型的原生节点</li><li>NativeCVM 表示 CVM 类型的原生节点</li></ul>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p><strong>原生节点对应的实例 ID</strong></p><ul><li>ins-q47ofw6 表示这个实例是一个 CVM 的实例</li><li>eks-f8mvyaep 表示这个实例是一个 CXM 的实例</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p><strong>原生节点对应的实例 ID</strong></p><ul><li>ins-q47ofw6 表示这个实例是一个 CVM 的实例</li><li>eks-f8mvyaep 表示这个实例是一个 CXM 的实例</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p><strong>原生节点对应的实例 ID</strong></p><ul><li>ins-q47ofw6 表示这个实例是一个 CVM 的实例</li><li>eks-f8mvyaep 表示这个实例是一个 CXM 的实例</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p><strong>原生节点对应的实例 ID</strong></p><ul><li>ins-q47ofw6 表示这个实例是一个 CVM 的实例</li><li>eks-f8mvyaep 表示这个实例是一个 CXM 的实例</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>原生节点云标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>原生节点云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>原生节点云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>原生节点云标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public NativeNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeNodeInfo(NativeNodeInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineState != null) {
            this.MachineState = new String(source.MachineState);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.LoginStatus != null) {
            this.LoginStatus = new String(source.LoginStatus);
        }
        if (source.IsProtectedFromScaleIn != null) {
            this.IsProtectedFromScaleIn = new Boolean(source.IsProtectedFromScaleIn);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.GPU != null) {
            this.GPU = new Long(source.GPU);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new Disk(source.SystemDisk);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.GPUParams != null) {
            this.GPUParams = new GPUParams(source.GPUParams);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.OsImage != null) {
            this.OsImage = new String(source.OsImage);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineState", this.MachineState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LoginStatus", this.LoginStatus);
        this.setParamSimple(map, prefix + "IsProtectedFromScaleIn", this.IsProtectedFromScaleIn);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamObj(map, prefix + "GPUParams.", this.GPUParams);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "OsImage", this.OsImage);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

