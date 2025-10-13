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
    * 敏捷上云实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 敏捷上云名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 合作伙伴的AppId
    */
    @SerializedName("IapId")
    @Expose
    private String IapId;

    /**
    * 需要接入敏捷上云的IDC的地址
    */
    @SerializedName("IdcAddress")
    @Expose
    private String IdcAddress;

    /**
    * 需要接入敏捷上云的IDC的互联网服务提供商类型
    */
    @SerializedName("IdcType")
    @Expose
    private String IdcType;

    /**
    * 敏捷上云的带宽，单位为MB
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 联系电话
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 敏捷上云的状态
available：就绪状态
applying：申请，待审核状态
pendingpay：代付款状态
building：建设中状态
confirming：待确认状态
isolate: 隔离状态
stoped：终止状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 敏捷上云申请的时间
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 敏捷上云建设完成的时间
    */
    @SerializedName("ReadyTime")
    @Expose
    private String ReadyTime;

    /**
    * 敏捷上云过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 备注信息
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * 敏捷上云的地域状态。
same-region：同地域
cross-region：跨地域
    */
    @SerializedName("RegionStatus")
    @Expose
    private String RegionStatus;

    /**
    * 用户的AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户的Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户注册名称
    */
    @SerializedName("CustomerAuthName")
    @Expose
    private String CustomerAuthName;

    /**
    * 物理专线实例ID
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * 敏捷上云是否支持创建高速上云专线网关
    */
    @SerializedName("CloudAttachServiceGatewaysSupport")
    @Expose
    private Boolean CloudAttachServiceGatewaysSupport;

    /**
    * 敏捷上云服务是否处于升降配中
    */
    @SerializedName("BUpdateBandwidth")
    @Expose
    private Boolean BUpdateBandwidth;

    /**
    * 接入地域
    */
    @SerializedName("ArRegion")
    @Expose
    private String ArRegion;

    /**
    * 运营商代码
    */
    @SerializedName("IapCode")
    @Expose
    private String IapCode;

    /**
    * IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
    */
    @SerializedName("IdcPointType")
    @Expose
    private String IdcPointType;

    /**
    * 运营商链路是否有保护
    */
    @SerializedName("BIapLinkProtected")
    @Expose
    private Boolean BIapLinkProtected;

    /**
     * Get 敏捷上云实例id 
     * @return InstanceId 敏捷上云实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 敏捷上云实例id
     * @param InstanceId 敏捷上云实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 敏捷上云名称 
     * @return Name 敏捷上云名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 敏捷上云名称
     * @param Name 敏捷上云名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 合作伙伴的AppId 
     * @return IapId 合作伙伴的AppId
     */
    public String getIapId() {
        return this.IapId;
    }

    /**
     * Set 合作伙伴的AppId
     * @param IapId 合作伙伴的AppId
     */
    public void setIapId(String IapId) {
        this.IapId = IapId;
    }

    /**
     * Get 需要接入敏捷上云的IDC的地址 
     * @return IdcAddress 需要接入敏捷上云的IDC的地址
     */
    public String getIdcAddress() {
        return this.IdcAddress;
    }

    /**
     * Set 需要接入敏捷上云的IDC的地址
     * @param IdcAddress 需要接入敏捷上云的IDC的地址
     */
    public void setIdcAddress(String IdcAddress) {
        this.IdcAddress = IdcAddress;
    }

    /**
     * Get 需要接入敏捷上云的IDC的互联网服务提供商类型 
     * @return IdcType 需要接入敏捷上云的IDC的互联网服务提供商类型
     */
    public String getIdcType() {
        return this.IdcType;
    }

    /**
     * Set 需要接入敏捷上云的IDC的互联网服务提供商类型
     * @param IdcType 需要接入敏捷上云的IDC的互联网服务提供商类型
     */
    public void setIdcType(String IdcType) {
        this.IdcType = IdcType;
    }

    /**
     * Get 敏捷上云的带宽，单位为MB 
     * @return Bandwidth 敏捷上云的带宽，单位为MB
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 敏捷上云的带宽，单位为MB
     * @param Bandwidth 敏捷上云的带宽，单位为MB
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 联系电话 
     * @return Telephone 联系电话
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 联系电话
     * @param Telephone 联系电话
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 敏捷上云的状态
available：就绪状态
applying：申请，待审核状态
pendingpay：代付款状态
building：建设中状态
confirming：待确认状态
isolate: 隔离状态
stoped：终止状态 
     * @return Status 敏捷上云的状态
available：就绪状态
applying：申请，待审核状态
pendingpay：代付款状态
building：建设中状态
confirming：待确认状态
isolate: 隔离状态
stoped：终止状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 敏捷上云的状态
available：就绪状态
applying：申请，待审核状态
pendingpay：代付款状态
building：建设中状态
confirming：待确认状态
isolate: 隔离状态
stoped：终止状态
     * @param Status 敏捷上云的状态
available：就绪状态
applying：申请，待审核状态
pendingpay：代付款状态
building：建设中状态
confirming：待确认状态
isolate: 隔离状态
stoped：终止状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 敏捷上云申请的时间 
     * @return ApplyTime 敏捷上云申请的时间
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 敏捷上云申请的时间
     * @param ApplyTime 敏捷上云申请的时间
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 敏捷上云建设完成的时间 
     * @return ReadyTime 敏捷上云建设完成的时间
     */
    public String getReadyTime() {
        return this.ReadyTime;
    }

    /**
     * Set 敏捷上云建设完成的时间
     * @param ReadyTime 敏捷上云建设完成的时间
     */
    public void setReadyTime(String ReadyTime) {
        this.ReadyTime = ReadyTime;
    }

    /**
     * Get 敏捷上云过期时间 
     * @return ExpireTime 敏捷上云过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 敏捷上云过期时间
     * @param ExpireTime 敏捷上云过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 备注信息 
     * @return Remarks 备注信息
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 备注信息
     * @param Remarks 备注信息
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get 敏捷上云的地域状态。
same-region：同地域
cross-region：跨地域 
     * @return RegionStatus 敏捷上云的地域状态。
same-region：同地域
cross-region：跨地域
     */
    public String getRegionStatus() {
        return this.RegionStatus;
    }

    /**
     * Set 敏捷上云的地域状态。
same-region：同地域
cross-region：跨地域
     * @param RegionStatus 敏捷上云的地域状态。
same-region：同地域
cross-region：跨地域
     */
    public void setRegionStatus(String RegionStatus) {
        this.RegionStatus = RegionStatus;
    }

    /**
     * Get 用户的AppId 
     * @return AppId 用户的AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户的AppId
     * @param AppId 用户的AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户的Uin 
     * @return Uin 用户的Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户的Uin
     * @param Uin 用户的Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户注册名称 
     * @return CustomerAuthName 用户注册名称
     */
    public String getCustomerAuthName() {
        return this.CustomerAuthName;
    }

    /**
     * Set 用户注册名称
     * @param CustomerAuthName 用户注册名称
     */
    public void setCustomerAuthName(String CustomerAuthName) {
        this.CustomerAuthName = CustomerAuthName;
    }

    /**
     * Get 物理专线实例ID 
     * @return DirectConnectId 物理专线实例ID
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set 物理专线实例ID
     * @param DirectConnectId 物理专线实例ID
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get 敏捷上云是否支持创建高速上云专线网关 
     * @return CloudAttachServiceGatewaysSupport 敏捷上云是否支持创建高速上云专线网关
     */
    public Boolean getCloudAttachServiceGatewaysSupport() {
        return this.CloudAttachServiceGatewaysSupport;
    }

    /**
     * Set 敏捷上云是否支持创建高速上云专线网关
     * @param CloudAttachServiceGatewaysSupport 敏捷上云是否支持创建高速上云专线网关
     */
    public void setCloudAttachServiceGatewaysSupport(Boolean CloudAttachServiceGatewaysSupport) {
        this.CloudAttachServiceGatewaysSupport = CloudAttachServiceGatewaysSupport;
    }

    /**
     * Get 敏捷上云服务是否处于升降配中 
     * @return BUpdateBandwidth 敏捷上云服务是否处于升降配中
     */
    public Boolean getBUpdateBandwidth() {
        return this.BUpdateBandwidth;
    }

    /**
     * Set 敏捷上云服务是否处于升降配中
     * @param BUpdateBandwidth 敏捷上云服务是否处于升降配中
     */
    public void setBUpdateBandwidth(Boolean BUpdateBandwidth) {
        this.BUpdateBandwidth = BUpdateBandwidth;
    }

    /**
     * Get 接入地域 
     * @return ArRegion 接入地域
     */
    public String getArRegion() {
        return this.ArRegion;
    }

    /**
     * Set 接入地域
     * @param ArRegion 接入地域
     */
    public void setArRegion(String ArRegion) {
        this.ArRegion = ArRegion;
    }

    /**
     * Get 运营商代码 
     * @return IapCode 运营商代码
     */
    public String getIapCode() {
        return this.IapCode;
    }

    /**
     * Set 运营商代码
     * @param IapCode 运营商代码
     */
    public void setIapCode(String IapCode) {
        this.IapCode = IapCode;
    }

    /**
     * Get IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方 
     * @return IdcPointType IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
     */
    public String getIdcPointType() {
        return this.IdcPointType;
    }

    /**
     * Set IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
     * @param IdcPointType IDC侧类型。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
     */
    public void setIdcPointType(String IdcPointType) {
        this.IdcPointType = IdcPointType;
    }

    /**
     * Get 运营商链路是否有保护 
     * @return BIapLinkProtected 运营商链路是否有保护
     */
    public Boolean getBIapLinkProtected() {
        return this.BIapLinkProtected;
    }

    /**
     * Set 运营商链路是否有保护
     * @param BIapLinkProtected 运营商链路是否有保护
     */
    public void setBIapLinkProtected(Boolean BIapLinkProtected) {
        this.BIapLinkProtected = BIapLinkProtected;
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

    }
}

