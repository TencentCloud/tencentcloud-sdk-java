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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAttachInfo extends AbstractModel {

    /**
    * <p>敏捷上云实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>敏捷上云名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>合作伙伴的AppId</p>
    */
    @SerializedName("IapId")
    @Expose
    private String IapId;

    /**
    * <p>需要接入敏捷上云的IDC的地址</p>
    */
    @SerializedName("IdcAddress")
    @Expose
    private String IdcAddress;

    /**
    * <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
    */
    @SerializedName("IdcType")
    @Expose
    private String IdcType;

    /**
    * <p>敏捷上云的带宽，单位为MB</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>联系电话</p>
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * <p>敏捷上云的状态<br>available：就绪状态<br>applying：申请，待审核状态<br>pendingpay：代付款状态<br>building：建设中状态<br>confirming：待确认状态<br>isolate: 隔离状态<br>stoped：终止状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>敏捷上云申请的时间</p>
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * <p>敏捷上云建设完成的时间</p>
    */
    @SerializedName("ReadyTime")
    @Expose
    private String ReadyTime;

    /**
    * <p>敏捷上云过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * <p>敏捷上云的地域状态。<br>same-region：同地域<br>cross-region：跨地域</p>
    */
    @SerializedName("RegionStatus")
    @Expose
    private String RegionStatus;

    /**
    * <p>用户的AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>用户的Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>用户注册名称</p>
    */
    @SerializedName("CustomerAuthName")
    @Expose
    private String CustomerAuthName;

    /**
    * <p>物理专线实例ID</p>
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * <p>敏捷上云是否支持创建高速上云专线网关</p>
    */
    @SerializedName("CloudAttachServiceGatewaysSupport")
    @Expose
    private Boolean CloudAttachServiceGatewaysSupport;

    /**
    * <p>敏捷上云服务是否处于升降配中</p>
    */
    @SerializedName("BUpdateBandwidth")
    @Expose
    private Boolean BUpdateBandwidth;

    /**
    * <p>接入地域</p>
    */
    @SerializedName("ArRegion")
    @Expose
    private String ArRegion;

    /**
    * <p>运营商代码</p>
    */
    @SerializedName("IapCode")
    @Expose
    private String IapCode;

    /**
    * <p>IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
    */
    @SerializedName("IdcPointType")
    @Expose
    private String IdcPointType;

    /**
    * <p>运营商链路是否有保护</p>
    */
    @SerializedName("BIapLinkProtected")
    @Expose
    private Boolean BIapLinkProtected;

    /**
    * <p>服务类型：SHARE-共享型，EXCLUSIVE-独占型</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>VLAN范围</p>
    */
    @SerializedName("VlanRange")
    @Expose
    private String VlanRange;

    /**
    * <p>裁撤状态</p><p>枚举值：</p><ul><li>APPLYING： 申请裁撤</li><li>EXECUTING： 裁撤执行中</li><li>FAILED： 裁撤失败</li></ul>
    */
    @SerializedName("RepealStatus")
    @Expose
    private String RepealStatus;

    /**
    * <p>计划裁撤时间</p>
    */
    @SerializedName("PlanRepealTime")
    @Expose
    private String PlanRepealTime;

    /**
    * <p>续费标记</p><p>枚举值：</p><ul><li>MANUAL_RENEW： 手动续费</li><li>AUTO_RENEW： 自动续费</li><li>NO_RENEW： 到期不续</li></ul>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>接入点ID</p>
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * <p>接入点名称</p>
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * <p>计费阶梯带宽(Mbps)</p>
    */
    @SerializedName("BillStairBandwidth")
    @Expose
    private Long BillStairBandwidth;

    /**
     * Get <p>敏捷上云实例id</p> 
     * @return InstanceId <p>敏捷上云实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>敏捷上云实例id</p>
     * @param InstanceId <p>敏捷上云实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>敏捷上云名称</p> 
     * @return Name <p>敏捷上云名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>敏捷上云名称</p>
     * @param Name <p>敏捷上云名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>合作伙伴的AppId</p> 
     * @return IapId <p>合作伙伴的AppId</p>
     */
    public String getIapId() {
        return this.IapId;
    }

    /**
     * Set <p>合作伙伴的AppId</p>
     * @param IapId <p>合作伙伴的AppId</p>
     */
    public void setIapId(String IapId) {
        this.IapId = IapId;
    }

    /**
     * Get <p>需要接入敏捷上云的IDC的地址</p> 
     * @return IdcAddress <p>需要接入敏捷上云的IDC的地址</p>
     */
    public String getIdcAddress() {
        return this.IdcAddress;
    }

    /**
     * Set <p>需要接入敏捷上云的IDC的地址</p>
     * @param IdcAddress <p>需要接入敏捷上云的IDC的地址</p>
     */
    public void setIdcAddress(String IdcAddress) {
        this.IdcAddress = IdcAddress;
    }

    /**
     * Get <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p> 
     * @return IdcType <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
     */
    public String getIdcType() {
        return this.IdcType;
    }

    /**
     * Set <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
     * @param IdcType <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
     */
    public void setIdcType(String IdcType) {
        this.IdcType = IdcType;
    }

    /**
     * Get <p>敏捷上云的带宽，单位为MB</p> 
     * @return Bandwidth <p>敏捷上云的带宽，单位为MB</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>敏捷上云的带宽，单位为MB</p>
     * @param Bandwidth <p>敏捷上云的带宽，单位为MB</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>联系电话</p> 
     * @return Telephone <p>联系电话</p>
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set <p>联系电话</p>
     * @param Telephone <p>联系电话</p>
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get <p>敏捷上云的状态<br>available：就绪状态<br>applying：申请，待审核状态<br>pendingpay：代付款状态<br>building：建设中状态<br>confirming：待确认状态<br>isolate: 隔离状态<br>stoped：终止状态</p> 
     * @return Status <p>敏捷上云的状态<br>available：就绪状态<br>applying：申请，待审核状态<br>pendingpay：代付款状态<br>building：建设中状态<br>confirming：待确认状态<br>isolate: 隔离状态<br>stoped：终止状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>敏捷上云的状态<br>available：就绪状态<br>applying：申请，待审核状态<br>pendingpay：代付款状态<br>building：建设中状态<br>confirming：待确认状态<br>isolate: 隔离状态<br>stoped：终止状态</p>
     * @param Status <p>敏捷上云的状态<br>available：就绪状态<br>applying：申请，待审核状态<br>pendingpay：代付款状态<br>building：建设中状态<br>confirming：待确认状态<br>isolate: 隔离状态<br>stoped：终止状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>敏捷上云申请的时间</p> 
     * @return ApplyTime <p>敏捷上云申请的时间</p>
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set <p>敏捷上云申请的时间</p>
     * @param ApplyTime <p>敏捷上云申请的时间</p>
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get <p>敏捷上云建设完成的时间</p> 
     * @return ReadyTime <p>敏捷上云建设完成的时间</p>
     */
    public String getReadyTime() {
        return this.ReadyTime;
    }

    /**
     * Set <p>敏捷上云建设完成的时间</p>
     * @param ReadyTime <p>敏捷上云建设完成的时间</p>
     */
    public void setReadyTime(String ReadyTime) {
        this.ReadyTime = ReadyTime;
    }

    /**
     * Get <p>敏捷上云过期时间</p> 
     * @return ExpireTime <p>敏捷上云过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>敏捷上云过期时间</p>
     * @param ExpireTime <p>敏捷上云过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remarks <p>备注信息</p>
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remarks <p>备注信息</p>
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get <p>敏捷上云的地域状态。<br>same-region：同地域<br>cross-region：跨地域</p> 
     * @return RegionStatus <p>敏捷上云的地域状态。<br>same-region：同地域<br>cross-region：跨地域</p>
     */
    public String getRegionStatus() {
        return this.RegionStatus;
    }

    /**
     * Set <p>敏捷上云的地域状态。<br>same-region：同地域<br>cross-region：跨地域</p>
     * @param RegionStatus <p>敏捷上云的地域状态。<br>same-region：同地域<br>cross-region：跨地域</p>
     */
    public void setRegionStatus(String RegionStatus) {
        this.RegionStatus = RegionStatus;
    }

    /**
     * Get <p>用户的AppId</p> 
     * @return AppId <p>用户的AppId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户的AppId</p>
     * @param AppId <p>用户的AppId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>用户的Uin</p> 
     * @return Uin <p>用户的Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户的Uin</p>
     * @param Uin <p>用户的Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>用户注册名称</p> 
     * @return CustomerAuthName <p>用户注册名称</p>
     */
    public String getCustomerAuthName() {
        return this.CustomerAuthName;
    }

    /**
     * Set <p>用户注册名称</p>
     * @param CustomerAuthName <p>用户注册名称</p>
     */
    public void setCustomerAuthName(String CustomerAuthName) {
        this.CustomerAuthName = CustomerAuthName;
    }

    /**
     * Get <p>物理专线实例ID</p> 
     * @return DirectConnectId <p>物理专线实例ID</p>
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set <p>物理专线实例ID</p>
     * @param DirectConnectId <p>物理专线实例ID</p>
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get <p>敏捷上云是否支持创建高速上云专线网关</p> 
     * @return CloudAttachServiceGatewaysSupport <p>敏捷上云是否支持创建高速上云专线网关</p>
     */
    public Boolean getCloudAttachServiceGatewaysSupport() {
        return this.CloudAttachServiceGatewaysSupport;
    }

    /**
     * Set <p>敏捷上云是否支持创建高速上云专线网关</p>
     * @param CloudAttachServiceGatewaysSupport <p>敏捷上云是否支持创建高速上云专线网关</p>
     */
    public void setCloudAttachServiceGatewaysSupport(Boolean CloudAttachServiceGatewaysSupport) {
        this.CloudAttachServiceGatewaysSupport = CloudAttachServiceGatewaysSupport;
    }

    /**
     * Get <p>敏捷上云服务是否处于升降配中</p> 
     * @return BUpdateBandwidth <p>敏捷上云服务是否处于升降配中</p>
     */
    public Boolean getBUpdateBandwidth() {
        return this.BUpdateBandwidth;
    }

    /**
     * Set <p>敏捷上云服务是否处于升降配中</p>
     * @param BUpdateBandwidth <p>敏捷上云服务是否处于升降配中</p>
     */
    public void setBUpdateBandwidth(Boolean BUpdateBandwidth) {
        this.BUpdateBandwidth = BUpdateBandwidth;
    }

    /**
     * Get <p>接入地域</p> 
     * @return ArRegion <p>接入地域</p>
     */
    public String getArRegion() {
        return this.ArRegion;
    }

    /**
     * Set <p>接入地域</p>
     * @param ArRegion <p>接入地域</p>
     */
    public void setArRegion(String ArRegion) {
        this.ArRegion = ArRegion;
    }

    /**
     * Get <p>运营商代码</p> 
     * @return IapCode <p>运营商代码</p>
     */
    public String getIapCode() {
        return this.IapCode;
    }

    /**
     * Set <p>运营商代码</p>
     * @param IapCode <p>运营商代码</p>
     */
    public void setIapCode(String IapCode) {
        this.IapCode = IapCode;
    }

    /**
     * Get <p>IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p> 
     * @return IdcPointType <p>IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
     */
    public String getIdcPointType() {
        return this.IdcPointType;
    }

    /**
     * Set <p>IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
     * @param IdcPointType <p>IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
     */
    public void setIdcPointType(String IdcPointType) {
        this.IdcPointType = IdcPointType;
    }

    /**
     * Get <p>运营商链路是否有保护</p> 
     * @return BIapLinkProtected <p>运营商链路是否有保护</p>
     */
    public Boolean getBIapLinkProtected() {
        return this.BIapLinkProtected;
    }

    /**
     * Set <p>运营商链路是否有保护</p>
     * @param BIapLinkProtected <p>运营商链路是否有保护</p>
     */
    public void setBIapLinkProtected(Boolean BIapLinkProtected) {
        this.BIapLinkProtected = BIapLinkProtected;
    }

    /**
     * Get <p>服务类型：SHARE-共享型，EXCLUSIVE-独占型</p> 
     * @return ServiceType <p>服务类型：SHARE-共享型，EXCLUSIVE-独占型</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型：SHARE-共享型，EXCLUSIVE-独占型</p>
     * @param ServiceType <p>服务类型：SHARE-共享型，EXCLUSIVE-独占型</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>VLAN范围</p> 
     * @return VlanRange <p>VLAN范围</p>
     */
    public String getVlanRange() {
        return this.VlanRange;
    }

    /**
     * Set <p>VLAN范围</p>
     * @param VlanRange <p>VLAN范围</p>
     */
    public void setVlanRange(String VlanRange) {
        this.VlanRange = VlanRange;
    }

    /**
     * Get <p>裁撤状态</p><p>枚举值：</p><ul><li>APPLYING： 申请裁撤</li><li>EXECUTING： 裁撤执行中</li><li>FAILED： 裁撤失败</li></ul> 
     * @return RepealStatus <p>裁撤状态</p><p>枚举值：</p><ul><li>APPLYING： 申请裁撤</li><li>EXECUTING： 裁撤执行中</li><li>FAILED： 裁撤失败</li></ul>
     */
    public String getRepealStatus() {
        return this.RepealStatus;
    }

    /**
     * Set <p>裁撤状态</p><p>枚举值：</p><ul><li>APPLYING： 申请裁撤</li><li>EXECUTING： 裁撤执行中</li><li>FAILED： 裁撤失败</li></ul>
     * @param RepealStatus <p>裁撤状态</p><p>枚举值：</p><ul><li>APPLYING： 申请裁撤</li><li>EXECUTING： 裁撤执行中</li><li>FAILED： 裁撤失败</li></ul>
     */
    public void setRepealStatus(String RepealStatus) {
        this.RepealStatus = RepealStatus;
    }

    /**
     * Get <p>计划裁撤时间</p> 
     * @return PlanRepealTime <p>计划裁撤时间</p>
     */
    public String getPlanRepealTime() {
        return this.PlanRepealTime;
    }

    /**
     * Set <p>计划裁撤时间</p>
     * @param PlanRepealTime <p>计划裁撤时间</p>
     */
    public void setPlanRepealTime(String PlanRepealTime) {
        this.PlanRepealTime = PlanRepealTime;
    }

    /**
     * Get <p>续费标记</p><p>枚举值：</p><ul><li>MANUAL_RENEW： 手动续费</li><li>AUTO_RENEW： 自动续费</li><li>NO_RENEW： 到期不续</li></ul> 
     * @return RenewFlag <p>续费标记</p><p>枚举值：</p><ul><li>MANUAL_RENEW： 手动续费</li><li>AUTO_RENEW： 自动续费</li><li>NO_RENEW： 到期不续</li></ul>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标记</p><p>枚举值：</p><ul><li>MANUAL_RENEW： 手动续费</li><li>AUTO_RENEW： 自动续费</li><li>NO_RENEW： 到期不续</li></ul>
     * @param RenewFlag <p>续费标记</p><p>枚举值：</p><ul><li>MANUAL_RENEW： 手动续费</li><li>AUTO_RENEW： 自动续费</li><li>NO_RENEW： 到期不续</li></ul>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>接入点ID</p> 
     * @return AccessPointId <p>接入点ID</p>
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set <p>接入点ID</p>
     * @param AccessPointId <p>接入点ID</p>
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get <p>接入点名称</p> 
     * @return AccessPointName <p>接入点名称</p>
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set <p>接入点名称</p>
     * @param AccessPointName <p>接入点名称</p>
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get <p>计费阶梯带宽(Mbps)</p> 
     * @return BillStairBandwidth <p>计费阶梯带宽(Mbps)</p>
     */
    public Long getBillStairBandwidth() {
        return this.BillStairBandwidth;
    }

    /**
     * Set <p>计费阶梯带宽(Mbps)</p>
     * @param BillStairBandwidth <p>计费阶梯带宽(Mbps)</p>
     */
    public void setBillStairBandwidth(Long BillStairBandwidth) {
        this.BillStairBandwidth = BillStairBandwidth;
    }

    public CloudAttachInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAttachInfo(CloudAttachInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IapId != null) {
            this.IapId = new String(source.IapId);
        }
        if (source.IdcAddress != null) {
            this.IdcAddress = new String(source.IdcAddress);
        }
        if (source.IdcType != null) {
            this.IdcType = new String(source.IdcType);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.ReadyTime != null) {
            this.ReadyTime = new String(source.ReadyTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.RegionStatus != null) {
            this.RegionStatus = new String(source.RegionStatus);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CustomerAuthName != null) {
            this.CustomerAuthName = new String(source.CustomerAuthName);
        }
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.CloudAttachServiceGatewaysSupport != null) {
            this.CloudAttachServiceGatewaysSupport = new Boolean(source.CloudAttachServiceGatewaysSupport);
        }
        if (source.BUpdateBandwidth != null) {
            this.BUpdateBandwidth = new Boolean(source.BUpdateBandwidth);
        }
        if (source.ArRegion != null) {
            this.ArRegion = new String(source.ArRegion);
        }
        if (source.IapCode != null) {
            this.IapCode = new String(source.IapCode);
        }
        if (source.IdcPointType != null) {
            this.IdcPointType = new String(source.IdcPointType);
        }
        if (source.BIapLinkProtected != null) {
            this.BIapLinkProtected = new Boolean(source.BIapLinkProtected);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.VlanRange != null) {
            this.VlanRange = new String(source.VlanRange);
        }
        if (source.RepealStatus != null) {
            this.RepealStatus = new String(source.RepealStatus);
        }
        if (source.PlanRepealTime != null) {
            this.PlanRepealTime = new String(source.PlanRepealTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.AccessPointName != null) {
            this.AccessPointName = new String(source.AccessPointName);
        }
        if (source.BillStairBandwidth != null) {
            this.BillStairBandwidth = new Long(source.BillStairBandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IapId", this.IapId);
        this.setParamSimple(map, prefix + "IdcAddress", this.IdcAddress);
        this.setParamSimple(map, prefix + "IdcType", this.IdcType);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ReadyTime", this.ReadyTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "RegionStatus", this.RegionStatus);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CustomerAuthName", this.CustomerAuthName);
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "CloudAttachServiceGatewaysSupport", this.CloudAttachServiceGatewaysSupport);
        this.setParamSimple(map, prefix + "BUpdateBandwidth", this.BUpdateBandwidth);
        this.setParamSimple(map, prefix + "ArRegion", this.ArRegion);
        this.setParamSimple(map, prefix + "IapCode", this.IapCode);
        this.setParamSimple(map, prefix + "IdcPointType", this.IdcPointType);
        this.setParamSimple(map, prefix + "BIapLinkProtected", this.BIapLinkProtected);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "VlanRange", this.VlanRange);
        this.setParamSimple(map, prefix + "RepealStatus", this.RepealStatus);
        this.setParamSimple(map, prefix + "PlanRepealTime", this.PlanRepealTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "BillStairBandwidth", this.BillStairBandwidth);

    }
}

