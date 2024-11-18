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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBasicDBInstancesRequest extends AbstractModel {

    /**
    * 实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例的CPU核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例磁盘大小，单位GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * VPC子网ID，形如subnet-bdoe83fa
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC网络ID，形如vpc-dsp338hz
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 本次购买几个实例，默认值为1。取值不超过10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 购买实例周期，默认取值为1，表示一个月。取值不超过48
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 安全组列表，填写形如sg-xxx的安全组ID
    */
    @SerializedName("SecurityGroupList")
    @Expose
    private String [] SecurityGroupList;

    /**
    * 自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否自动使用代金券；1 - 是，0 - 否，默认不使用
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 代金券ID数组，目前单个订单只能使用一张
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末
    */
    @SerializedName("Weekly")
    @Expose
    private Long [] Weekly;

    /**
    * 可维护时间窗配置，每天可维护的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 可维护时间窗配置，持续时间，单位：小时
    */
    @SerializedName("Span")
    @Expose
    private Long Span;

    /**
    * 新建实例绑定的标签集合
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 系统字符集排序规则，默认：Chinese_PRC_CI_AS
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * 系统时区，默认：China Standard Time
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get 实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取 
     * @return Zone 实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取
     * @param Zone 实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例的CPU核心数 
     * @return Cpu 实例的CPU核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例的CPU核心数
     * @param Cpu 实例的CPU核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存大小，单位GB 
     * @return Memory 实例内存大小，单位GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位GB
     * @param Memory 实例内存大小，单位GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例磁盘大小，单位GB 
     * @return Storage 实例磁盘大小，单位GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例磁盘大小，单位GB
     * @param Storage 实例磁盘大小，单位GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get VPC子网ID，形如subnet-bdoe83fa 
     * @return SubnetId VPC子网ID，形如subnet-bdoe83fa
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC子网ID，形如subnet-bdoe83fa
     * @param SubnetId VPC子网ID，形如subnet-bdoe83fa
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC网络ID，形如vpc-dsp338hz 
     * @return VpcId VPC网络ID，形如vpc-dsp338hz
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID，形如vpc-dsp338hz
     * @param VpcId VPC网络ID，形如vpc-dsp338hz
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘 
     * @return MachineType 购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘
     * @param MachineType 购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。 
     * @return InstanceChargeType 付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。
     * @param InstanceChargeType 付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 本次购买几个实例，默认值为1。取值不超过10 
     * @return GoodsNum 本次购买几个实例，默认值为1。取值不超过10
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 本次购买几个实例，默认值为1。取值不超过10
     * @param GoodsNum 本次购买几个实例，默认值为1。取值不超过10
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。 
     * @return DBVersion sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。
     * @param DBVersion sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 购买实例周期，默认取值为1，表示一个月。取值不超过48 
     * @return Period 购买实例周期，默认取值为1，表示一个月。取值不超过48
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买实例周期，默认取值为1，表示一个月。取值不超过48
     * @param Period 购买实例周期，默认取值为1，表示一个月。取值不超过48
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 安全组列表，填写形如sg-xxx的安全组ID 
     * @return SecurityGroupList 安全组列表，填写形如sg-xxx的安全组ID
     */
    public String [] getSecurityGroupList() {
        return this.SecurityGroupList;
    }

    /**
     * Set 安全组列表，填写形如sg-xxx的安全组ID
     * @param SecurityGroupList 安全组列表，填写形如sg-xxx的安全组ID
     */
    public void setSecurityGroupList(String [] SecurityGroupList) {
        this.SecurityGroupList = SecurityGroupList;
    }

    /**
     * Get 自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。 
     * @return AutoRenewFlag 自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。
     * @param AutoRenewFlag 自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否自动使用代金券；1 - 是，0 - 否，默认不使用 
     * @return AutoVoucher 是否自动使用代金券；1 - 是，0 - 否，默认不使用
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券；1 - 是，0 - 否，默认不使用
     * @param AutoVoucher 是否自动使用代金券；1 - 是，0 - 否，默认不使用
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID数组，目前单个订单只能使用一张 
     * @return VoucherIds 代金券ID数组，目前单个订单只能使用一张
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID数组，目前单个订单只能使用一张
     * @param VoucherIds 代金券ID数组，目前单个订单只能使用一张
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末 
     * @return Weekly 可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末
     */
    public Long [] getWeekly() {
        return this.Weekly;
    }

    /**
     * Set 可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末
     * @param Weekly 可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末
     */
    public void setWeekly(Long [] Weekly) {
        this.Weekly = Weekly;
    }

    /**
     * Get 可维护时间窗配置，每天可维护的开始时间 
     * @return StartTime 可维护时间窗配置，每天可维护的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 可维护时间窗配置，每天可维护的开始时间
     * @param StartTime 可维护时间窗配置，每天可维护的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 可维护时间窗配置，持续时间，单位：小时 
     * @return Span 可维护时间窗配置，持续时间，单位：小时
     */
    public Long getSpan() {
        return this.Span;
    }

    /**
     * Set 可维护时间窗配置，持续时间，单位：小时
     * @param Span 可维护时间窗配置，持续时间，单位：小时
     */
    public void setSpan(Long Span) {
        this.Span = Span;
    }

    /**
     * Get 新建实例绑定的标签集合 
     * @return ResourceTags 新建实例绑定的标签集合
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 新建实例绑定的标签集合
     * @param ResourceTags 新建实例绑定的标签集合
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 系统字符集排序规则，默认：Chinese_PRC_CI_AS 
     * @return Collation 系统字符集排序规则，默认：Chinese_PRC_CI_AS
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set 系统字符集排序规则，默认：Chinese_PRC_CI_AS
     * @param Collation 系统字符集排序规则，默认：Chinese_PRC_CI_AS
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get 系统时区，默认：China Standard Time 
     * @return TimeZone 系统时区，默认：China Standard Time
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 系统时区，默认：China Standard Time
     * @param TimeZone 系统时区，默认：China Standard Time
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public CreateBasicDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBasicDBInstancesRequest(CreateBasicDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SecurityGroupList != null) {
            this.SecurityGroupList = new String[source.SecurityGroupList.length];
            for (int i = 0; i < source.SecurityGroupList.length; i++) {
                this.SecurityGroupList[i] = new String(source.SecurityGroupList[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.Weekly != null) {
            this.Weekly = new Long[source.Weekly.length];
            for (int i = 0; i < source.Weekly.length; i++) {
                this.Weekly[i] = new Long(source.Weekly[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Span != null) {
            this.Span = new Long(source.Span);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.Collation != null) {
            this.Collation = new String(source.Collation);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupList.", this.SecurityGroupList);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArraySimple(map, prefix + "Weekly.", this.Weekly);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Span", this.Span);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

