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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInfo extends AbstractModel {

    /**
    * 资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源状态，1-正常，2-隔离，3-销毁
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资源IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 资源所属Vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 资源所属子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 资源所属HSM规格
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 云加密机类型id
    */
    @SerializedName("VsmType")
    @Expose
    private Long VsmType;

    /**
    * 地域Id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域Id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 过期时间（Epoch Unix Timestamp）
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 地域名
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 区域名
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 实例的安全组列表
    */
    @SerializedName("SgList")
    @Expose
    private SgUnit [] SgList;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 当前实例是否已经过期
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒
    */
    @SerializedName("RemainSeconds")
    @Expose
    private Long RemainSeconds;

    /**
    * Vpc名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 创建者Uin账号
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 告警状态，0：停用，1：启用
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long AlarmStatus;

    /**
     * Get 资源Id 
     * @return ResourceId 资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
     * @param ResourceId 资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源状态，1-正常，2-隔离，3-销毁 
     * @return Status 资源状态，1-正常，2-隔离，3-销毁
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态，1-正常，2-隔离，3-销毁
     * @param Status 资源状态，1-正常，2-隔离，3-销毁
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资源IP 
     * @return Vip 资源IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 资源IP
     * @param Vip 资源IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 资源所属Vpc 
     * @return VpcId 资源所属Vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 资源所属Vpc
     * @param VpcId 资源所属Vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 资源所属子网 
     * @return SubnetId 资源所属子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 资源所属子网
     * @param SubnetId 资源所属子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 资源所属HSM规格 
     * @return Model 资源所属HSM规格
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 资源所属HSM规格
     * @param Model 资源所属HSM规格
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 云加密机类型id 
     * @return VsmType 云加密机类型id
     */
    public Long getVsmType() {
        return this.VsmType;
    }

    /**
     * Set 云加密机类型id
     * @param VsmType 云加密机类型id
     */
    public void setVsmType(Long VsmType) {
        this.VsmType = VsmType;
    }

    /**
     * Get 地域Id 
     * @return RegionId 地域Id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域Id
     * @param RegionId 地域Id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域Id 
     * @return ZoneId 区域Id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域Id
     * @param ZoneId 区域Id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 过期时间（Epoch Unix Timestamp） 
     * @return ExpireTime 过期时间（Epoch Unix Timestamp）
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间（Epoch Unix Timestamp）
     * @param ExpireTime 过期时间（Epoch Unix Timestamp）
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 地域名 
     * @return RegionName 地域名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名
     * @param RegionName 地域名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 区域名 
     * @return ZoneName 区域名
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 区域名
     * @param ZoneName 区域名
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 实例的安全组列表 
     * @return SgList 实例的安全组列表
     */
    public SgUnit [] getSgList() {
        return this.SgList;
    }

    /**
     * Set 实例的安全组列表
     * @param SgList 实例的安全组列表
     */
    public void setSgList(SgUnit [] SgList) {
        this.SgList = SgList;
    }

    /**
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 当前实例是否已经过期 
     * @return Expired 当前实例是否已经过期
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 当前实例是否已经过期
     * @param Expired 当前实例是否已经过期
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒 
     * @return RemainSeconds 为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒
     */
    public Long getRemainSeconds() {
        return this.RemainSeconds;
    }

    /**
     * Set 为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒
     * @param RemainSeconds 为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒
     */
    public void setRemainSeconds(Long RemainSeconds) {
        this.RemainSeconds = RemainSeconds;
    }

    /**
     * Get Vpc名称 
     * @return VpcName Vpc名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set Vpc名称
     * @param VpcName Vpc名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 创建者Uin账号 
     * @return CreateUin 创建者Uin账号
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建者Uin账号
     * @param CreateUin 创建者Uin账号
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续 
     * @return RenewFlag 自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续
     * @param RenewFlag 自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 厂商 
     * @return Manufacturer 厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 厂商
     * @param Manufacturer 厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 告警状态，0：停用，1：启用 
     * @return AlarmStatus 告警状态，0：停用，1：启用
     */
    public Long getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set 告警状态，0：停用，1：启用
     * @param AlarmStatus 告警状态，0：停用，1：启用
     */
    public void setAlarmStatus(Long AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.VsmType != null) {
            this.VsmType = new Long(source.VsmType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.SgList != null) {
            this.SgList = new SgUnit[source.SgList.length];
            for (int i = 0; i < source.SgList.length; i++) {
                this.SgList[i] = new SgUnit(source.SgList[i]);
            }
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.RemainSeconds != null) {
            this.RemainSeconds = new Long(source.RemainSeconds);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new Long(source.AlarmStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "VsmType", this.VsmType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamArrayObj(map, prefix + "SgList.", this.SgList);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "RemainSeconds", this.RemainSeconds);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);

    }
}

