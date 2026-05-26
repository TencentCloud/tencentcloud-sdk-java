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
    * <p>资源Id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源名称</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>资源状态，1-正常，2-隔离，3-销毁</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>资源IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>资源所属Vpc</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>资源所属子网</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>资源所属HSM规格</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>云加密机类型id</p>
    */
    @SerializedName("VsmType")
    @Expose
    private Long VsmType;

    /**
    * <p>地域Id</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>区域Id</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>过期时间（Epoch Unix Timestamp）</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>地域名</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>区域名</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>实例的安全组列表</p>
    */
    @SerializedName("SgList")
    @Expose
    private SgUnit [] SgList;

    /**
    * <p>子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>当前实例是否已经过期</p>
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * <p>为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒</p>
    */
    @SerializedName("RemainSeconds")
    @Expose
    private Long RemainSeconds;

    /**
    * <p>Vpc名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>创建者Uin账号</p>
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * <p>自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>厂商</p>
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * <p>告警状态，0：停用，1：启用</p>
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long AlarmStatus;

    /**
    * <p>0不支持<br>1关闭<br>2开启</p>
    */
    @SerializedName("PqcStatus")
    @Expose
    private Long PqcStatus;

    /**
    * <p>0关闭，1开启</p>
    */
    @SerializedName("PqcFlag")
    @Expose
    private Long PqcFlag;

    /**
    * <p>环境</p><p>默认值：cloud</p><p>cloud或者cdc</p>
    */
    @SerializedName("DeployEnv")
    @Expose
    private String DeployEnv;

    /**
     * Get <p>资源Id</p> 
     * @return ResourceId <p>资源Id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源Id</p>
     * @param ResourceId <p>资源Id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源名称</p> 
     * @return ResourceName <p>资源名称</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>资源名称</p>
     * @param ResourceName <p>资源名称</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>资源状态，1-正常，2-隔离，3-销毁</p> 
     * @return Status <p>资源状态，1-正常，2-隔离，3-销毁</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>资源状态，1-正常，2-隔离，3-销毁</p>
     * @param Status <p>资源状态，1-正常，2-隔离，3-销毁</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源IP</p> 
     * @return Vip <p>资源IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>资源IP</p>
     * @param Vip <p>资源IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>资源所属Vpc</p> 
     * @return VpcId <p>资源所属Vpc</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>资源所属Vpc</p>
     * @param VpcId <p>资源所属Vpc</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>资源所属子网</p> 
     * @return SubnetId <p>资源所属子网</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>资源所属子网</p>
     * @param SubnetId <p>资源所属子网</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>资源所属HSM规格</p> 
     * @return Model <p>资源所属HSM规格</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>资源所属HSM规格</p>
     * @param Model <p>资源所属HSM规格</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>云加密机类型id</p> 
     * @return VsmType <p>云加密机类型id</p>
     */
    public Long getVsmType() {
        return this.VsmType;
    }

    /**
     * Set <p>云加密机类型id</p>
     * @param VsmType <p>云加密机类型id</p>
     */
    public void setVsmType(Long VsmType) {
        this.VsmType = VsmType;
    }

    /**
     * Get <p>地域Id</p> 
     * @return RegionId <p>地域Id</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域Id</p>
     * @param RegionId <p>地域Id</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>区域Id</p> 
     * @return ZoneId <p>区域Id</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>区域Id</p>
     * @param ZoneId <p>区域Id</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>过期时间（Epoch Unix Timestamp）</p> 
     * @return ExpireTime <p>过期时间（Epoch Unix Timestamp）</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间（Epoch Unix Timestamp）</p>
     * @param ExpireTime <p>过期时间（Epoch Unix Timestamp）</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>地域名</p> 
     * @return RegionName <p>地域名</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名</p>
     * @param RegionName <p>地域名</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>区域名</p> 
     * @return ZoneName <p>区域名</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>区域名</p>
     * @param ZoneName <p>区域名</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>实例的安全组列表</p> 
     * @return SgList <p>实例的安全组列表</p>
     */
    public SgUnit [] getSgList() {
        return this.SgList;
    }

    /**
     * Set <p>实例的安全组列表</p>
     * @param SgList <p>实例的安全组列表</p>
     */
    public void setSgList(SgUnit [] SgList) {
        this.SgList = SgList;
    }

    /**
     * Get <p>子网名称</p> 
     * @return SubnetName <p>子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称</p>
     * @param SubnetName <p>子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>当前实例是否已经过期</p> 
     * @return Expired <p>当前实例是否已经过期</p>
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set <p>当前实例是否已经过期</p>
     * @param Expired <p>当前实例是否已经过期</p>
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get <p>为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒</p> 
     * @return RemainSeconds <p>为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒</p>
     */
    public Long getRemainSeconds() {
        return this.RemainSeconds;
    }

    /**
     * Set <p>为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒</p>
     * @param RemainSeconds <p>为正数表示实例距离过期时间还剩余多少秒，为负数表示已经过期多少秒</p>
     */
    public void setRemainSeconds(Long RemainSeconds) {
        this.RemainSeconds = RemainSeconds;
    }

    /**
     * Get <p>Vpc名称</p> 
     * @return VpcName <p>Vpc名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>Vpc名称</p>
     * @param VpcName <p>Vpc名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>创建者Uin账号</p> 
     * @return CreateUin <p>创建者Uin账号</p>
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建者Uin账号</p>
     * @param CreateUin <p>创建者Uin账号</p>
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续</p> 
     * @return RenewFlag <p>自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续</p>
     * @param RenewFlag <p>自动续费状态标识， 0-手动续费，1-自动续费，2-到期不续</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>厂商</p> 
     * @return Manufacturer <p>厂商</p>
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set <p>厂商</p>
     * @param Manufacturer <p>厂商</p>
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get <p>告警状态，0：停用，1：启用</p> 
     * @return AlarmStatus <p>告警状态，0：停用，1：启用</p>
     */
    public Long getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set <p>告警状态，0：停用，1：启用</p>
     * @param AlarmStatus <p>告警状态，0：停用，1：启用</p>
     */
    public void setAlarmStatus(Long AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get <p>0不支持<br>1关闭<br>2开启</p> 
     * @return PqcStatus <p>0不支持<br>1关闭<br>2开启</p>
     */
    public Long getPqcStatus() {
        return this.PqcStatus;
    }

    /**
     * Set <p>0不支持<br>1关闭<br>2开启</p>
     * @param PqcStatus <p>0不支持<br>1关闭<br>2开启</p>
     */
    public void setPqcStatus(Long PqcStatus) {
        this.PqcStatus = PqcStatus;
    }

    /**
     * Get <p>0关闭，1开启</p> 
     * @return PqcFlag <p>0关闭，1开启</p>
     */
    public Long getPqcFlag() {
        return this.PqcFlag;
    }

    /**
     * Set <p>0关闭，1开启</p>
     * @param PqcFlag <p>0关闭，1开启</p>
     */
    public void setPqcFlag(Long PqcFlag) {
        this.PqcFlag = PqcFlag;
    }

    /**
     * Get <p>环境</p><p>默认值：cloud</p><p>cloud或者cdc</p> 
     * @return DeployEnv <p>环境</p><p>默认值：cloud</p><p>cloud或者cdc</p>
     */
    public String getDeployEnv() {
        return this.DeployEnv;
    }

    /**
     * Set <p>环境</p><p>默认值：cloud</p><p>cloud或者cdc</p>
     * @param DeployEnv <p>环境</p><p>默认值：cloud</p><p>cloud或者cdc</p>
     */
    public void setDeployEnv(String DeployEnv) {
        this.DeployEnv = DeployEnv;
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
        if (source.PqcStatus != null) {
            this.PqcStatus = new Long(source.PqcStatus);
        }
        if (source.PqcFlag != null) {
            this.PqcFlag = new Long(source.PqcFlag);
        }
        if (source.DeployEnv != null) {
            this.DeployEnv = new String(source.DeployEnv);
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
        this.setParamSimple(map, prefix + "PqcStatus", this.PqcStatus);
        this.setParamSimple(map, prefix + "PqcFlag", this.PqcFlag);
        this.setParamSimple(map, prefix + "DeployEnv", this.DeployEnv);

    }
}

