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

public class CreateCloudReadOnlyDBInstancesRequest extends AbstractModel {

    /**
    * <p>主实例ID，格式如：mssql-3l3fgqn7</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面</p>
    */
    @SerializedName("ReadOnlyGroupType")
    @Expose
    private Long ReadOnlyGroupType;

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
    * <p>实例核心数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>购买实例的宿主机磁盘类型,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。</p>
    */
    @SerializedName("ReadOnlyGroupForcedUpgrade")
    @Expose
    private Long ReadOnlyGroupForcedUpgrade;

    /**
    * <p>ReadOnlyGroupType=3时必填,已存在的只读组ID</p>
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * <p>ReadOnlyGroupType=2时必填，新建的只读组名称</p>
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * <p>ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。</p>
    */
    @SerializedName("ReadOnlyGroupIsOfflineDelay")
    @Expose
    private Long ReadOnlyGroupIsOfflineDelay;

    /**
    * <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。</p>
    */
    @SerializedName("ReadOnlyGroupMaxDelayTime")
    @Expose
    private Long ReadOnlyGroupMaxDelayTime;

    /**
    * <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。</p>
    */
    @SerializedName("ReadOnlyGroupMinInGroup")
    @Expose
    private Long ReadOnlyGroupMinInGroup;

    /**
    * <p>付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>本次即将购买的实例数量，默认取值2。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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
     * Get <p>主实例ID，格式如：mssql-3l3fgqn7</p> 
     * @return InstanceId <p>主实例ID，格式如：mssql-3l3fgqn7</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>主实例ID，格式如：mssql-3l3fgqn7</p>
     * @param InstanceId <p>主实例ID，格式如：mssql-3l3fgqn7</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get <p>只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面</p> 
     * @return ReadOnlyGroupType <p>只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面</p>
     */
    public Long getReadOnlyGroupType() {
        return this.ReadOnlyGroupType;
    }

    /**
     * Set <p>只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面</p>
     * @param ReadOnlyGroupType <p>只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面</p>
     */
    public void setReadOnlyGroupType(Long ReadOnlyGroupType) {
        this.ReadOnlyGroupType = ReadOnlyGroupType;
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
     * Get <p>实例核心数</p> 
     * @return Cpu <p>实例核心数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例核心数</p>
     * @param Cpu <p>实例核心数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>购买实例的宿主机磁盘类型,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p> 
     * @return MachineType <p>购买实例的宿主机磁盘类型,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>购买实例的宿主机磁盘类型,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
     * @param MachineType <p>购买实例的宿主机磁盘类型,CLOUD_HSSD-虚拟机加强型SSD云盘，CLOUD_TSSD-虚拟机极速型SSD云盘，CLOUD_BSSD-虚拟机通用型SSD云盘</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。</p> 
     * @return ReadOnlyGroupForcedUpgrade <p>0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。</p>
     */
    public Long getReadOnlyGroupForcedUpgrade() {
        return this.ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Set <p>0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。</p>
     * @param ReadOnlyGroupForcedUpgrade <p>0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。</p>
     */
    public void setReadOnlyGroupForcedUpgrade(Long ReadOnlyGroupForcedUpgrade) {
        this.ReadOnlyGroupForcedUpgrade = ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Get <p>ReadOnlyGroupType=3时必填,已存在的只读组ID</p> 
     * @return ReadOnlyGroupId <p>ReadOnlyGroupType=3时必填,已存在的只读组ID</p>
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set <p>ReadOnlyGroupType=3时必填,已存在的只读组ID</p>
     * @param ReadOnlyGroupId <p>ReadOnlyGroupType=3时必填,已存在的只读组ID</p>
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get <p>ReadOnlyGroupType=2时必填，新建的只读组名称</p> 
     * @return ReadOnlyGroupName <p>ReadOnlyGroupType=2时必填，新建的只读组名称</p>
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set <p>ReadOnlyGroupType=2时必填，新建的只读组名称</p>
     * @param ReadOnlyGroupName <p>ReadOnlyGroupType=2时必填，新建的只读组名称</p>
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get <p>ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。</p> 
     * @return ReadOnlyGroupIsOfflineDelay <p>ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。</p>
     */
    public Long getReadOnlyGroupIsOfflineDelay() {
        return this.ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Set <p>ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。</p>
     * @param ReadOnlyGroupIsOfflineDelay <p>ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。</p>
     */
    public void setReadOnlyGroupIsOfflineDelay(Long ReadOnlyGroupIsOfflineDelay) {
        this.ReadOnlyGroupIsOfflineDelay = ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Get <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。</p> 
     * @return ReadOnlyGroupMaxDelayTime <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。</p>
     */
    public Long getReadOnlyGroupMaxDelayTime() {
        return this.ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Set <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。</p>
     * @param ReadOnlyGroupMaxDelayTime <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。</p>
     */
    public void setReadOnlyGroupMaxDelayTime(Long ReadOnlyGroupMaxDelayTime) {
        this.ReadOnlyGroupMaxDelayTime = ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Get <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。</p> 
     * @return ReadOnlyGroupMinInGroup <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。</p>
     */
    public Long getReadOnlyGroupMinInGroup() {
        return this.ReadOnlyGroupMinInGroup;
    }

    /**
     * Set <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。</p>
     * @param ReadOnlyGroupMinInGroup <p>ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。</p>
     */
    public void setReadOnlyGroupMinInGroup(Long ReadOnlyGroupMinInGroup) {
        this.ReadOnlyGroupMinInGroup = ReadOnlyGroupMinInGroup;
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
     * Get <p>本次即将购买的实例数量，默认取值2。</p> 
     * @return GoodsNum <p>本次即将购买的实例数量，默认取值2。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>本次即将购买的实例数量，默认取值2。</p>
     * @param GoodsNum <p>本次即将购买的实例数量，默认取值2。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置</p> 
     * @return SubnetId <p>VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置</p>
     * @param SubnetId <p>VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置</p> 
     * @return VpcId <p>VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置</p>
     * @param VpcId <p>VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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

    public CreateCloudReadOnlyDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudReadOnlyDBInstancesRequest(CreateCloudReadOnlyDBInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ReadOnlyGroupType != null) {
            this.ReadOnlyGroupType = new Long(source.ReadOnlyGroupType);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.ReadOnlyGroupForcedUpgrade != null) {
            this.ReadOnlyGroupForcedUpgrade = new Long(source.ReadOnlyGroupForcedUpgrade);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.ReadOnlyGroupIsOfflineDelay != null) {
            this.ReadOnlyGroupIsOfflineDelay = new Long(source.ReadOnlyGroupIsOfflineDelay);
        }
        if (source.ReadOnlyGroupMaxDelayTime != null) {
            this.ReadOnlyGroupMaxDelayTime = new Long(source.ReadOnlyGroupMaxDelayTime);
        }
        if (source.ReadOnlyGroupMinInGroup != null) {
            this.ReadOnlyGroupMinInGroup = new Long(source.ReadOnlyGroupMinInGroup);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ReadOnlyGroupType", this.ReadOnlyGroupType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "ReadOnlyGroupForcedUpgrade", this.ReadOnlyGroupForcedUpgrade);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ReadOnlyGroupIsOfflineDelay", this.ReadOnlyGroupIsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyGroupMaxDelayTime", this.ReadOnlyGroupMaxDelayTime);
        this.setParamSimple(map, prefix + "ReadOnlyGroupMinInGroup", this.ReadOnlyGroupMinInGroup);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupList.", this.SecurityGroupList);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "DiskEncryptFlag", this.DiskEncryptFlag);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

