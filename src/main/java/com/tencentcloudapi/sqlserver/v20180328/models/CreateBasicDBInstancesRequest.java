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

public class CreateBasicDBInstancesRequest extends AbstractModel {

    /**
    * <p>实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例的CPU核心数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>实例内存大小，单位GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例磁盘大小，单位GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>VPC子网ID，形如subnet-bdoe83fa</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>VPC网络ID，形如vpc-dsp338hz</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>本次购买几个实例，默认值为1。取值不超过10</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>购买实例周期，默认取值为1，表示一个月。取值不超过48</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>安全组列表，填写形如sg-xxx的安全组ID</p>
    */
    @SerializedName("SecurityGroupList")
    @Expose
    private String [] SecurityGroupList;

    /**
    * <p>自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>是否自动使用代金券；1 - 是，0 - 否，默认不使用</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID数组，目前单个订单只能使用一张</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末</p>
    */
    @SerializedName("Weekly")
    @Expose
    private Long [] Weekly;

    /**
    * <p>可维护时间窗配置，每天可维护的开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>可维护时间窗配置，持续时间，单位：小时</p>
    */
    @SerializedName("Span")
    @Expose
    private Long Span;

    /**
    * <p>新建实例绑定的标签集合</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * <p>系统时区，默认：China Standard Time</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>磁盘加密标识，0-不加密，1-加密</p>
    */
    @SerializedName("DiskEncryptFlag")
    @Expose
    private Long DiskEncryptFlag;

    /**
    * <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get <p>实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取</p> 
     * @return Zone <p>实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取</p>
     * @param Zone <p>实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例的CPU核心数</p> 
     * @return Cpu <p>实例的CPU核心数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例的CPU核心数</p>
     * @param Cpu <p>实例的CPU核心数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>实例内存大小，单位GB</p> 
     * @return Memory <p>实例内存大小，单位GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位GB</p>
     * @param Memory <p>实例内存大小，单位GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例磁盘大小，单位GB</p> 
     * @return Storage <p>实例磁盘大小，单位GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例磁盘大小，单位GB</p>
     * @param Storage <p>实例磁盘大小，单位GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>VPC子网ID，形如subnet-bdoe83fa</p> 
     * @return SubnetId <p>VPC子网ID，形如subnet-bdoe83fa</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>VPC子网ID，形如subnet-bdoe83fa</p>
     * @param SubnetId <p>VPC子网ID，形如subnet-bdoe83fa</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>VPC网络ID，形如vpc-dsp338hz</p> 
     * @return VpcId <p>VPC网络ID，形如vpc-dsp338hz</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC网络ID，形如vpc-dsp338hz</p>
     * @param VpcId <p>VPC网络ID，形如vpc-dsp338hz</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p> 
     * @return MachineType <p>购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
     * @param MachineType <p>购买实例的宿主机类型，CLOUD_PREMIUM-虚拟机高性能云硬盘，CLOUD_SSD-虚拟机SSD云硬盘,CLOUD_HSSD-虚拟机增强型SSD云硬盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。</p> 
     * @return InstanceChargeType <p>付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。</p>
     * @param InstanceChargeType <p>付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>本次购买几个实例，默认值为1。取值不超过10</p> 
     * @return GoodsNum <p>本次购买几个实例，默认值为1。取值不超过10</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>本次购买几个实例，默认值为1。取值不超过10</p>
     * @param GoodsNum <p>本次购买几个实例，默认值为1。取值不超过10</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。</p> 
     * @return DBVersion <p>sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。</p>
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。</p>
     * @param DBVersion <p>sqlserver版本，目前所有支持的版本有：2008R2 (SQL Server 2008 R2 Enterprise)，2012SP3 (SQL Server 2012 Enterprise)，201202 (SQL Server 2012 Standard)，2014SP2 (SQL Server 2014 Enterprise)，201402 (SQL Server 2014 Standard)，2016SP1 (SQL Server 2016 Enterprise)，201602 (SQL Server 2016 Standard)，2017 (SQL Server 2017 Enterprise)，201702 (SQL Server 2017 Standard)，2019 (SQL Server 2019 Enterprise)，201902 (SQL Server 2019 Standard)。每个地域支持售卖的版本不同，可通过DescribeProductConfig接口来拉取每个地域可售卖的版本信息。不填，默认为版本2008R2。</p>
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>购买实例周期，默认取值为1，表示一个月。取值不超过48</p> 
     * @return Period <p>购买实例周期，默认取值为1，表示一个月。取值不超过48</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买实例周期，默认取值为1，表示一个月。取值不超过48</p>
     * @param Period <p>购买实例周期，默认取值为1，表示一个月。取值不超过48</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>安全组列表，填写形如sg-xxx的安全组ID</p> 
     * @return SecurityGroupList <p>安全组列表，填写形如sg-xxx的安全组ID</p>
     */
    public String [] getSecurityGroupList() {
        return this.SecurityGroupList;
    }

    /**
     * Set <p>安全组列表，填写形如sg-xxx的安全组ID</p>
     * @param SecurityGroupList <p>安全组列表，填写形如sg-xxx的安全组ID</p>
     */
    public void setSecurityGroupList(String [] SecurityGroupList) {
        this.SecurityGroupList = SecurityGroupList;
    }

    /**
     * Get <p>自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。</p> 
     * @return AutoRenewFlag <p>自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。</p>
     * @param AutoRenewFlag <p>自动续费标志：0-正常续费  1-自动续费，默认为1自动续费。只在购买预付费实例时有效。</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>是否自动使用代金券；1 - 是，0 - 否，默认不使用</p> 
     * @return AutoVoucher <p>是否自动使用代金券；1 - 是，0 - 否，默认不使用</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券；1 - 是，0 - 否，默认不使用</p>
     * @param AutoVoucher <p>是否自动使用代金券；1 - 是，0 - 否，默认不使用</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID数组，目前单个订单只能使用一张</p> 
     * @return VoucherIds <p>代金券ID数组，目前单个订单只能使用一张</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID数组，目前单个订单只能使用一张</p>
     * @param VoucherIds <p>代金券ID数组，目前单个订单只能使用一张</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末</p> 
     * @return Weekly <p>可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末</p>
     */
    public Long [] getWeekly() {
        return this.Weekly;
    }

    /**
     * Set <p>可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末</p>
     * @param Weekly <p>可维护时间窗配置，以周为单位，表示周几允许维护，1-7分别代表周一到周末</p>
     */
    public void setWeekly(Long [] Weekly) {
        this.Weekly = Weekly;
    }

    /**
     * Get <p>可维护时间窗配置，每天可维护的开始时间</p> 
     * @return StartTime <p>可维护时间窗配置，每天可维护的开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>可维护时间窗配置，每天可维护的开始时间</p>
     * @param StartTime <p>可维护时间窗配置，每天可维护的开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>可维护时间窗配置，持续时间，单位：小时</p> 
     * @return Span <p>可维护时间窗配置，持续时间，单位：小时</p>
     */
    public Long getSpan() {
        return this.Span;
    }

    /**
     * Set <p>可维护时间窗配置，持续时间，单位：小时</p>
     * @param Span <p>可维护时间窗配置，持续时间，单位：小时</p>
     */
    public void setSpan(Long Span) {
        this.Span = Span;
    }

    /**
     * Get <p>新建实例绑定的标签集合</p> 
     * @return ResourceTags <p>新建实例绑定的标签集合</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>新建实例绑定的标签集合</p>
     * @param ResourceTags <p>新建实例绑定的标签集合</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p> 
     * @return Collation <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
     * @param Collation <p>系统字符集排序规则，默认：Chinese_PRC_CI_AS</p>
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get <p>系统时区，默认：China Standard Time</p> 
     * @return TimeZone <p>系统时区，默认：China Standard Time</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>系统时区，默认：China Standard Time</p>
     * @param TimeZone <p>系统时区，默认：China Standard Time</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>磁盘加密标识，0-不加密，1-加密</p> 
     * @return DiskEncryptFlag <p>磁盘加密标识，0-不加密，1-加密</p>
     */
    public Long getDiskEncryptFlag() {
        return this.DiskEncryptFlag;
    }

    /**
     * Set <p>磁盘加密标识，0-不加密，1-加密</p>
     * @param DiskEncryptFlag <p>磁盘加密标识，0-不加密，1-加密</p>
     */
    public void setDiskEncryptFlag(Long DiskEncryptFlag) {
        this.DiskEncryptFlag = DiskEncryptFlag;
    }

    /**
     * Get <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p> 
     * @return ThroughputPerformance <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     * @param ThroughputPerformance <p>额外磁盘 IO 吞吐量，仅 CLOUD_HSSD 支持</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
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
        if (source.DiskEncryptFlag != null) {
            this.DiskEncryptFlag = new Long(source.DiskEncryptFlag);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
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
        this.setParamSimple(map, prefix + "DiskEncryptFlag", this.DiskEncryptFlag);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

