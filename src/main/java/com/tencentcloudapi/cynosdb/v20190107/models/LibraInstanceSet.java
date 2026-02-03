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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraInstanceSet extends AbstractModel {

    /**
    * 数据库模式
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * cpu核数
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * 实例类型
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * 组id
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 内存
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 付费模式
    */
    @SerializedName("InstancePayMode")
    @Expose
    private Long InstancePayMode;

    /**
    * 付费结束时间
    */
    @SerializedName("InstancePeriodEndTime")
    @Expose
    private String InstancePeriodEndTime;

    /**
    * 实例角色
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例状态描述
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * 网络类型
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 子网id
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vpcid
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 虚拟ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 虚拟端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 外网区域
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 外网ip
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 外网port
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 外网状态
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 硬盘
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * 硬盘类型
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
     * Get 数据库模式 
     * @return DbMode 数据库模式
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set 数据库模式
     * @param DbMode 数据库模式
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get cpu核数 
     * @return InstanceCpu cpu核数
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set cpu核数
     * @param InstanceCpu cpu核数
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get 实例类型 
     * @return InstanceDeviceType 实例类型
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set 实例类型
     * @param InstanceDeviceType 实例类型
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get 组id 
     * @return InstanceGroupId 组id
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 组id
     * @param InstanceGroupId 组id
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 内存 
     * @return InstanceMemory 内存
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set 内存
     * @param InstanceMemory 内存
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 付费模式 
     * @return InstancePayMode 付费模式
     */
    public Long getInstancePayMode() {
        return this.InstancePayMode;
    }

    /**
     * Set 付费模式
     * @param InstancePayMode 付费模式
     */
    public void setInstancePayMode(Long InstancePayMode) {
        this.InstancePayMode = InstancePayMode;
    }

    /**
     * Get 付费结束时间 
     * @return InstancePeriodEndTime 付费结束时间
     */
    public String getInstancePeriodEndTime() {
        return this.InstancePeriodEndTime;
    }

    /**
     * Set 付费结束时间
     * @param InstancePeriodEndTime 付费结束时间
     */
    public void setInstancePeriodEndTime(String InstancePeriodEndTime) {
        this.InstancePeriodEndTime = InstancePeriodEndTime;
    }

    /**
     * Get 实例角色 
     * @return InstanceRole 实例角色
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例角色
     * @param InstanceRole 实例角色
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例状态描述 
     * @return InstanceStatusDesc 实例状态描述
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set 实例状态描述
     * @param InstanceStatusDesc 实例状态描述
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get 网络类型 
     * @return NetType 网络类型
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型
     * @param NetType 网络类型
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 子网id 
     * @return UniqSubnetId 子网id
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网id
     * @param UniqSubnetId 子网id
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vpcid 
     * @return UniqVpcId vpcid
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpcid
     * @param UniqVpcId vpcid
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 虚拟ip 
     * @return Vip 虚拟ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟ip
     * @param Vip 虚拟ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 虚拟端口 
     * @return Vport 虚拟端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 虚拟端口
     * @param Vport 虚拟端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 外网区域 
     * @return WanDomain 外网区域
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 外网区域
     * @param WanDomain 外网区域
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 外网ip 
     * @return WanIP 外网ip
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 外网ip
     * @param WanIP 外网ip
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get 外网port 
     * @return WanPort 外网port
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 外网port
     * @param WanPort 外网port
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get 外网状态 
     * @return WanStatus 外网状态
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 外网状态
     * @param WanStatus 外网状态
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get 硬盘 
     * @return InstanceStorage 硬盘
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set 硬盘
     * @param InstanceStorage 硬盘
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get 硬盘类型 
     * @return InstanceStorageType 硬盘类型
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set 硬盘类型
     * @param InstanceStorageType 硬盘类型
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    public LibraInstanceSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraInstanceSet(LibraInstanceSet source) {
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstancePayMode != null) {
            this.InstancePayMode = new Long(source.InstancePayMode);
        }
        if (source.InstancePeriodEndTime != null) {
            this.InstancePeriodEndTime = new String(source.InstancePeriodEndTime);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstancePayMode", this.InstancePayMode);
        this.setParamSimple(map, prefix + "InstancePeriodEndTime", this.InstancePeriodEndTime);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);

    }
}

