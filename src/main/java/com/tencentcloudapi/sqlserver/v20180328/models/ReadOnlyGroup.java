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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadOnlyGroup extends AbstractModel {

    /**
    * 只读组ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 只读组名称
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 只读组的地域ID，与主实例相同
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 只读组的可用区ID，与主实例相同
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 是否启动超时剔除功能，0-不开启剔除功能，1-开启剔除功能
    */
    @SerializedName("IsOfflineDelay")
    @Expose
    private Long IsOfflineDelay;

    /**
    * 启动超时剔除功能后，使用的超时阈值
    */
    @SerializedName("ReadOnlyMaxDelayTime")
    @Expose
    private Long ReadOnlyMaxDelayTime;

    /**
    * 启动超时剔除功能后，只读组至少保留的只读副本数
    */
    @SerializedName("MinReadOnlyInGroup")
    @Expose
    private Long MinReadOnlyInGroup;

    /**
    * 只读组vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 只读组vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 只读组私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 只读组私有网络子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 只读组状态: 1-申请成功运行中，5-申请中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 主实例ID，形如mssql-sgeshe3th
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * 只读实例副本集合
    */
    @SerializedName("ReadOnlyInstanceSet")
    @Expose
    private ReadOnlyInstance [] ReadOnlyInstanceSet;

    /**
    * RO组外网地址域名
    */
    @SerializedName("DnsPodDomain")
    @Expose
    private String DnsPodDomain;

    /**
    * RO组外网地址端口
    */
    @SerializedName("TgwWanVPort")
    @Expose
    private Long TgwWanVPort;

    /**
    * RO只读组类型，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货的所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
    */
    @SerializedName("ReadOnlyGroupType")
    @Expose
    private Long ReadOnlyGroupType;

    /**
    * 部署RO副本模式，0-默认不升级主实例，1-强制升级主实例完成RO部署
    */
    @SerializedName("ReadOnlyGroupForcedUpgrade")
    @Expose
    private Long ReadOnlyGroupForcedUpgrade;

    /**
     * Get 只读组ID 
     * @return ReadOnlyGroupId 只读组ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 只读组ID
     * @param ReadOnlyGroupId 只读组ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get 只读组名称 
     * @return ReadOnlyGroupName 只读组名称
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 只读组名称
     * @param ReadOnlyGroupName 只读组名称
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get 只读组的地域ID，与主实例相同 
     * @return RegionId 只读组的地域ID，与主实例相同
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 只读组的地域ID，与主实例相同
     * @param RegionId 只读组的地域ID，与主实例相同
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 只读组的可用区ID，与主实例相同 
     * @return ZoneId 只读组的可用区ID，与主实例相同
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 只读组的可用区ID，与主实例相同
     * @param ZoneId 只读组的可用区ID，与主实例相同
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 是否启动超时剔除功能，0-不开启剔除功能，1-开启剔除功能 
     * @return IsOfflineDelay 是否启动超时剔除功能，0-不开启剔除功能，1-开启剔除功能
     */
    public Long getIsOfflineDelay() {
        return this.IsOfflineDelay;
    }

    /**
     * Set 是否启动超时剔除功能，0-不开启剔除功能，1-开启剔除功能
     * @param IsOfflineDelay 是否启动超时剔除功能，0-不开启剔除功能，1-开启剔除功能
     */
    public void setIsOfflineDelay(Long IsOfflineDelay) {
        this.IsOfflineDelay = IsOfflineDelay;
    }

    /**
     * Get 启动超时剔除功能后，使用的超时阈值 
     * @return ReadOnlyMaxDelayTime 启动超时剔除功能后，使用的超时阈值
     */
    public Long getReadOnlyMaxDelayTime() {
        return this.ReadOnlyMaxDelayTime;
    }

    /**
     * Set 启动超时剔除功能后，使用的超时阈值
     * @param ReadOnlyMaxDelayTime 启动超时剔除功能后，使用的超时阈值
     */
    public void setReadOnlyMaxDelayTime(Long ReadOnlyMaxDelayTime) {
        this.ReadOnlyMaxDelayTime = ReadOnlyMaxDelayTime;
    }

    /**
     * Get 启动超时剔除功能后，只读组至少保留的只读副本数 
     * @return MinReadOnlyInGroup 启动超时剔除功能后，只读组至少保留的只读副本数
     */
    public Long getMinReadOnlyInGroup() {
        return this.MinReadOnlyInGroup;
    }

    /**
     * Set 启动超时剔除功能后，只读组至少保留的只读副本数
     * @param MinReadOnlyInGroup 启动超时剔除功能后，只读组至少保留的只读副本数
     */
    public void setMinReadOnlyInGroup(Long MinReadOnlyInGroup) {
        this.MinReadOnlyInGroup = MinReadOnlyInGroup;
    }

    /**
     * Get 只读组vip 
     * @return Vip 只读组vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 只读组vip
     * @param Vip 只读组vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 只读组vport 
     * @return Vport 只读组vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 只读组vport
     * @param Vport 只读组vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 只读组私有网络ID 
     * @return VpcId 只读组私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 只读组私有网络ID
     * @param VpcId 只读组私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 只读组私有网络子网ID 
     * @return SubnetId 只读组私有网络子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 只读组私有网络子网ID
     * @param SubnetId 只读组私有网络子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 只读组状态: 1-申请成功运行中，5-申请中 
     * @return Status 只读组状态: 1-申请成功运行中，5-申请中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 只读组状态: 1-申请成功运行中，5-申请中
     * @param Status 只读组状态: 1-申请成功运行中，5-申请中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 主实例ID，形如mssql-sgeshe3th 
     * @return MasterInstanceId 主实例ID，形如mssql-sgeshe3th
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * Set 主实例ID，形如mssql-sgeshe3th
     * @param MasterInstanceId 主实例ID，形如mssql-sgeshe3th
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * Get 只读实例副本集合 
     * @return ReadOnlyInstanceSet 只读实例副本集合
     */
    public ReadOnlyInstance [] getReadOnlyInstanceSet() {
        return this.ReadOnlyInstanceSet;
    }

    /**
     * Set 只读实例副本集合
     * @param ReadOnlyInstanceSet 只读实例副本集合
     */
    public void setReadOnlyInstanceSet(ReadOnlyInstance [] ReadOnlyInstanceSet) {
        this.ReadOnlyInstanceSet = ReadOnlyInstanceSet;
    }

    /**
     * Get RO组外网地址域名 
     * @return DnsPodDomain RO组外网地址域名
     */
    public String getDnsPodDomain() {
        return this.DnsPodDomain;
    }

    /**
     * Set RO组外网地址域名
     * @param DnsPodDomain RO组外网地址域名
     */
    public void setDnsPodDomain(String DnsPodDomain) {
        this.DnsPodDomain = DnsPodDomain;
    }

    /**
     * Get RO组外网地址端口 
     * @return TgwWanVPort RO组外网地址端口
     */
    public Long getTgwWanVPort() {
        return this.TgwWanVPort;
    }

    /**
     * Set RO组外网地址端口
     * @param TgwWanVPort RO组外网地址端口
     */
    public void setTgwWanVPort(Long TgwWanVPort) {
        this.TgwWanVPort = TgwWanVPort;
    }

    /**
     * Get RO只读组类型，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货的所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面 
     * @return ReadOnlyGroupType RO只读组类型，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货的所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
     */
    public Long getReadOnlyGroupType() {
        return this.ReadOnlyGroupType;
    }

    /**
     * Set RO只读组类型，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货的所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
     * @param ReadOnlyGroupType RO只读组类型，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货的所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
     */
    public void setReadOnlyGroupType(Long ReadOnlyGroupType) {
        this.ReadOnlyGroupType = ReadOnlyGroupType;
    }

    /**
     * Get 部署RO副本模式，0-默认不升级主实例，1-强制升级主实例完成RO部署 
     * @return ReadOnlyGroupForcedUpgrade 部署RO副本模式，0-默认不升级主实例，1-强制升级主实例完成RO部署
     */
    public Long getReadOnlyGroupForcedUpgrade() {
        return this.ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Set 部署RO副本模式，0-默认不升级主实例，1-强制升级主实例完成RO部署
     * @param ReadOnlyGroupForcedUpgrade 部署RO副本模式，0-默认不升级主实例，1-强制升级主实例完成RO部署
     */
    public void setReadOnlyGroupForcedUpgrade(Long ReadOnlyGroupForcedUpgrade) {
        this.ReadOnlyGroupForcedUpgrade = ReadOnlyGroupForcedUpgrade;
    }

    public ReadOnlyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyGroup(ReadOnlyGroup source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.IsOfflineDelay != null) {
            this.IsOfflineDelay = new Long(source.IsOfflineDelay);
        }
        if (source.ReadOnlyMaxDelayTime != null) {
            this.ReadOnlyMaxDelayTime = new Long(source.ReadOnlyMaxDelayTime);
        }
        if (source.MinReadOnlyInGroup != null) {
            this.MinReadOnlyInGroup = new Long(source.MinReadOnlyInGroup);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MasterInstanceId != null) {
            this.MasterInstanceId = new String(source.MasterInstanceId);
        }
        if (source.ReadOnlyInstanceSet != null) {
            this.ReadOnlyInstanceSet = new ReadOnlyInstance[source.ReadOnlyInstanceSet.length];
            for (int i = 0; i < source.ReadOnlyInstanceSet.length; i++) {
                this.ReadOnlyInstanceSet[i] = new ReadOnlyInstance(source.ReadOnlyInstanceSet[i]);
            }
        }
        if (source.DnsPodDomain != null) {
            this.DnsPodDomain = new String(source.DnsPodDomain);
        }
        if (source.TgwWanVPort != null) {
            this.TgwWanVPort = new Long(source.TgwWanVPort);
        }
        if (source.ReadOnlyGroupType != null) {
            this.ReadOnlyGroupType = new Long(source.ReadOnlyGroupType);
        }
        if (source.ReadOnlyGroupForcedUpgrade != null) {
            this.ReadOnlyGroupForcedUpgrade = new Long(source.ReadOnlyGroupForcedUpgrade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "IsOfflineDelay", this.IsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyMaxDelayTime", this.ReadOnlyMaxDelayTime);
        this.setParamSimple(map, prefix + "MinReadOnlyInGroup", this.MinReadOnlyInGroup);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamArrayObj(map, prefix + "ReadOnlyInstanceSet.", this.ReadOnlyInstanceSet);
        this.setParamSimple(map, prefix + "DnsPodDomain", this.DnsPodDomain);
        this.setParamSimple(map, prefix + "TgwWanVPort", this.TgwWanVPort);
        this.setParamSimple(map, prefix + "ReadOnlyGroupType", this.ReadOnlyGroupType);
        this.setParamSimple(map, prefix + "ReadOnlyGroupForcedUpgrade", this.ReadOnlyGroupForcedUpgrade);

    }
}

