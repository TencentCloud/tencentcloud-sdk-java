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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReadOnlyDBInstancesRequest extends AbstractModel{

    /**
    * 主实例ID，格式如：mssql-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例可用区，类似ap-guangzhou-1（广州一区）；实例可售卖区域可以通过接口DescribeZones获取
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
    */
    @SerializedName("ReadOnlyGroupType")
    @Expose
    private Long ReadOnlyGroupType;

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
    * 0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。
    */
    @SerializedName("ReadOnlyGroupForcedUpgrade")
    @Expose
    private Long ReadOnlyGroupForcedUpgrade;

    /**
    * ReadOnlyGroupType=3时必填,已存在的只读组ID
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * ReadOnlyGroupType=2时必填，新建的只读组名称
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。
    */
    @SerializedName("ReadOnlyGroupIsOfflineDelay")
    @Expose
    private Long ReadOnlyGroupIsOfflineDelay;

    /**
    * ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。
    */
    @SerializedName("ReadOnlyGroupMaxDelayTime")
    @Expose
    private Long ReadOnlyGroupMaxDelayTime;

    /**
    * ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。
    */
    @SerializedName("ReadOnlyGroupMinInGroup")
    @Expose
    private Long ReadOnlyGroupMinInGroup;

    /**
    * 付费模式，取值支持 PREPAID（预付费），POSTPAID（后付费）。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 本次购买几个只读实例，默认值为1。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

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
     * Get 主实例ID，格式如：mssql-3l3fgqn7 
     * @return InstanceId 主实例ID，格式如：mssql-3l3fgqn7
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主实例ID，格式如：mssql-3l3fgqn7
     * @param InstanceId 主实例ID，格式如：mssql-3l3fgqn7
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get 只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面 
     * @return ReadOnlyGroupType 只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
     */
    public Long getReadOnlyGroupType() {
        return this.ReadOnlyGroupType;
    }

    /**
     * Set 只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
     * @param ReadOnlyGroupType 只读组类型选项，1-按照一个实例一个只读组的方式发货，2-新建只读组后发货，所有实例都在这个只读组下面， 3-发货的所有实例都在已有的只读组下面
     */
    public void setReadOnlyGroupType(Long ReadOnlyGroupType) {
        this.ReadOnlyGroupType = ReadOnlyGroupType;
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
     * Get 0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。 
     * @return ReadOnlyGroupForcedUpgrade 0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。
     */
    public Long getReadOnlyGroupForcedUpgrade() {
        return this.ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Set 0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。
     * @param ReadOnlyGroupForcedUpgrade 0-默认不升级主实例，1-强制升级主实例完成ro部署；主实例为非集群版时需要填1，强制升级为集群版。填1 说明您已同意将主实例升级到集群版实例。
     */
    public void setReadOnlyGroupForcedUpgrade(Long ReadOnlyGroupForcedUpgrade) {
        this.ReadOnlyGroupForcedUpgrade = ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Get ReadOnlyGroupType=3时必填,已存在的只读组ID 
     * @return ReadOnlyGroupId ReadOnlyGroupType=3时必填,已存在的只读组ID
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set ReadOnlyGroupType=3时必填,已存在的只读组ID
     * @param ReadOnlyGroupId ReadOnlyGroupType=3时必填,已存在的只读组ID
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get ReadOnlyGroupType=2时必填，新建的只读组名称 
     * @return ReadOnlyGroupName ReadOnlyGroupType=2时必填，新建的只读组名称
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set ReadOnlyGroupType=2时必填，新建的只读组名称
     * @param ReadOnlyGroupName ReadOnlyGroupType=2时必填，新建的只读组名称
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。 
     * @return ReadOnlyGroupIsOfflineDelay ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。
     */
    public Long getReadOnlyGroupIsOfflineDelay() {
        return this.ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Set ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。
     * @param ReadOnlyGroupIsOfflineDelay ReadOnlyGroupType=2时必填，新建的只读组是否开启延迟剔除功能，1-开启，0-关闭。当只读副本与主实例延迟大于阈值后，自动剔除。
     */
    public void setReadOnlyGroupIsOfflineDelay(Long ReadOnlyGroupIsOfflineDelay) {
        this.ReadOnlyGroupIsOfflineDelay = ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Get ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。 
     * @return ReadOnlyGroupMaxDelayTime ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。
     */
    public Long getReadOnlyGroupMaxDelayTime() {
        return this.ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Set ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。
     * @param ReadOnlyGroupMaxDelayTime ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除的阈值。
     */
    public void setReadOnlyGroupMaxDelayTime(Long ReadOnlyGroupMaxDelayTime) {
        this.ReadOnlyGroupMaxDelayTime = ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Get ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。 
     * @return ReadOnlyGroupMinInGroup ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。
     */
    public Long getReadOnlyGroupMinInGroup() {
        return this.ReadOnlyGroupMinInGroup;
    }

    /**
     * Set ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。
     * @param ReadOnlyGroupMinInGroup ReadOnlyGroupType=2 且 ReadOnlyGroupIsOfflineDelay=1时必填，新建的只读组延迟剔除后至少保留只读副本的个数。
     */
    public void setReadOnlyGroupMinInGroup(Long ReadOnlyGroupMinInGroup) {
        this.ReadOnlyGroupMinInGroup = ReadOnlyGroupMinInGroup;
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
     * Get 本次购买几个只读实例，默认值为1。 
     * @return GoodsNum 本次购买几个只读实例，默认值为1。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 本次购买几个只读实例，默认值为1。
     * @param GoodsNum 本次购买几个只读实例，默认值为1。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置 
     * @return SubnetId VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置
     * @param SubnetId VPC子网ID，形如subnet-bdoe83fa；SubnetId和VpcId需同时设置或者同时不设置
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置 
     * @return VpcId VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置
     * @param VpcId VPC网络ID，形如vpc-dsp338hz；SubnetId和VpcId需同时设置或者同时不设置
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ReadOnlyGroupType", this.ReadOnlyGroupType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
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

    }
}

