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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSimpleInfoNew extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 集群Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 内核版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域Id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域详情
    */
    @SerializedName("RegionDesc")
    @Expose
    private String RegionDesc;

    /**
    * 地区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 地区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 地区详情
    */
    @SerializedName("ZoneDesc")
    @Expose
    private String ZoneDesc;

    /**
    * 私有网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 开始时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 访问地址
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
    * 计费方式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
     * Get ID 
     * @return ID ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set ID
     * @param ID ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 集群Id 
     * @return InstanceId 集群Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群Id
     * @param InstanceId 集群Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群名字 
     * @return InstanceName 集群名字
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 集群名字
     * @param InstanceName 集群名字
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 内核版本 
     * @return Version 内核版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 内核版本
     * @param Version 内核版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
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
     * Get 地域详情 
     * @return RegionDesc 地域详情
     */
    public String getRegionDesc() {
        return this.RegionDesc;
    }

    /**
     * Set 地域详情
     * @param RegionDesc 地域详情
     */
    public void setRegionDesc(String RegionDesc) {
        this.RegionDesc = RegionDesc;
    }

    /**
     * Get 地区 
     * @return Zone 地区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地区
     * @param Zone 地区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 地区id 
     * @return ZoneId 地区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 地区id
     * @param ZoneId 地区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 地区详情 
     * @return ZoneDesc 地区详情
     */
    public String getZoneDesc() {
        return this.ZoneDesc;
    }

    /**
     * Set 地区详情
     * @param ZoneDesc 地区详情
     */
    public void setZoneDesc(String ZoneDesc) {
        this.ZoneDesc = ZoneDesc;
    }

    /**
     * Get 私有网络 
     * @return VpcId 私有网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络
     * @param VpcId 私有网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网 
     * @return SubnetId 子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网
     * @param SubnetId 子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 开始时间 
     * @return CreateTime 开始时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 开始时间
     * @param CreateTime 开始时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 访问地址 
     * @return AccessInfo 访问地址
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set 访问地址
     * @param AccessInfo 访问地址
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get 计费方式 
     * @return PayMode 计费方式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费方式
     * @param PayMode 计费方式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动续费 
     * @return RenewFlag 自动续费
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费
     * @param RenewFlag 自动续费
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public InstanceSimpleInfoNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSimpleInfoNew(InstanceSimpleInfoNew source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionDesc != null) {
            this.RegionDesc = new String(source.RegionDesc);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneDesc != null) {
            this.ZoneDesc = new String(source.ZoneDesc);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionDesc", this.RegionDesc);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneDesc", this.ZoneDesc);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

