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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 实例列表的大小，参数默认值20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例Id，如：crs-6ubhgouj
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 枚举范围： projectId,createtime,instancename,type,curDeadline
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1倒序，0顺序，默认倒序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 子网ID数组，数组下标从0开始，如：56854
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 项目ID 组成的数组，数组下标从0开始
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 查找实例的ID。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 地域ID，已经弃用，可通过公共参数Region查询对应地域
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * 实例状态：0-待初始化，1-流程中，2-运行中，-2-已隔离，-3-待删除
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 类型版本：1-单机版,2-主从版,3-集群版
    */
    @SerializedName("TypeVersion")
    @Expose
    private Long TypeVersion;

    /**
    * 引擎信息：Redis-2.8，Redis-4.0，CKV
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 续费模式：0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * 计费模式：postpaid-按量计费；prepaid-包年包月
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * 实例类型：1-Redis老集群版；2-Redis 2.8主从版；3-CKV主从版；4-CKV集群版；5-Redis 2.8单机版；6-Redis 4.0主从版；7-Redis 4.0集群版；8 – Redis5.0主从版，9 – Redis5.0集群版，
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 搜索关键词：支持实例Id、实例名称、完整IP
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * 内部参数，用户可忽略
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * 内部参数，用户可忽略
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
     * Get 实例列表的大小，参数默认值20 
     * @return Limit 实例列表的大小，参数默认值20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 实例列表的大小，参数默认值20
     * @param Limit 实例列表的大小，参数默认值20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍 
     * @return Offset 偏移量，取Limit整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍
     * @param Offset 偏移量，取Limit整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例Id，如：crs-6ubhgouj 
     * @return InstanceId 实例Id，如：crs-6ubhgouj
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id，如：crs-6ubhgouj
     * @param InstanceId 实例Id，如：crs-6ubhgouj
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 枚举范围： projectId,createtime,instancename,type,curDeadline 
     * @return OrderBy 枚举范围： projectId,createtime,instancename,type,curDeadline
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 枚举范围： projectId,createtime,instancename,type,curDeadline
     * @param OrderBy 枚举范围： projectId,createtime,instancename,type,curDeadline
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 1倒序，0顺序，默认倒序 
     * @return OrderType 1倒序，0顺序，默认倒序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1倒序，0顺序，默认倒序
     * @param OrderType 1倒序，0顺序，默认倒序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525 
     * @return VpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     * @param VpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：47525
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 子网ID数组，数组下标从0开始，如：56854 
     * @return SubnetIds 子网ID数组，数组下标从0开始，如：56854
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID数组，数组下标从0开始，如：56854
     * @param SubnetIds 子网ID数组，数组下标从0开始，如：56854
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 项目ID 组成的数组，数组下标从0开始 
     * @return ProjectIds 项目ID 组成的数组，数组下标从0开始
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID 组成的数组，数组下标从0开始
     * @param ProjectIds 项目ID 组成的数组，数组下标从0开始
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 查找实例的ID。 
     * @return SearchKey 查找实例的ID。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 查找实例的ID。
     * @param SearchKey 查找实例的ID。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
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
     * Get 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk 
     * @return UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     * @param UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2 
     * @return UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     * @param UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get 地域ID，已经弃用，可通过公共参数Region查询对应地域 
     * @return RegionIds 地域ID，已经弃用，可通过公共参数Region查询对应地域
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 地域ID，已经弃用，可通过公共参数Region查询对应地域
     * @param RegionIds 地域ID，已经弃用，可通过公共参数Region查询对应地域
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get 实例状态：0-待初始化，1-流程中，2-运行中，-2-已隔离，-3-待删除 
     * @return Status 实例状态：0-待初始化，1-流程中，2-运行中，-2-已隔离，-3-待删除
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：0-待初始化，1-流程中，2-运行中，-2-已隔离，-3-待删除
     * @param Status 实例状态：0-待初始化，1-流程中，2-运行中，-2-已隔离，-3-待删除
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 类型版本：1-单机版,2-主从版,3-集群版 
     * @return TypeVersion 类型版本：1-单机版,2-主从版,3-集群版
     */
    public Long getTypeVersion() {
        return this.TypeVersion;
    }

    /**
     * Set 类型版本：1-单机版,2-主从版,3-集群版
     * @param TypeVersion 类型版本：1-单机版,2-主从版,3-集群版
     */
    public void setTypeVersion(Long TypeVersion) {
        this.TypeVersion = TypeVersion;
    }

    /**
     * Get 引擎信息：Redis-2.8，Redis-4.0，CKV 
     * @return EngineName 引擎信息：Redis-2.8，Redis-4.0，CKV
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 引擎信息：Redis-2.8，Redis-4.0，CKV
     * @param EngineName 引擎信息：Redis-2.8，Redis-4.0，CKV
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 续费模式：0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费 
     * @return AutoRenew 续费模式：0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 续费模式：0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     * @param AutoRenew 续费模式：0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 计费模式：postpaid-按量计费；prepaid-包年包月 
     * @return BillingMode 计费模式：postpaid-按量计费；prepaid-包年包月
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费模式：postpaid-按量计费；prepaid-包年包月
     * @param BillingMode 计费模式：postpaid-按量计费；prepaid-包年包月
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例类型：1-Redis老集群版；2-Redis 2.8主从版；3-CKV主从版；4-CKV集群版；5-Redis 2.8单机版；6-Redis 4.0主从版；7-Redis 4.0集群版；8 – Redis5.0主从版，9 – Redis5.0集群版， 
     * @return Type 实例类型：1-Redis老集群版；2-Redis 2.8主从版；3-CKV主从版；4-CKV集群版；5-Redis 2.8单机版；6-Redis 4.0主从版；7-Redis 4.0集群版；8 – Redis5.0主从版，9 – Redis5.0集群版，
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型：1-Redis老集群版；2-Redis 2.8主从版；3-CKV主从版；4-CKV集群版；5-Redis 2.8单机版；6-Redis 4.0主从版；7-Redis 4.0集群版；8 – Redis5.0主从版，9 – Redis5.0集群版，
     * @param Type 实例类型：1-Redis老集群版；2-Redis 2.8主从版；3-CKV主从版；4-CKV集群版；5-Redis 2.8单机版；6-Redis 4.0主从版；7-Redis 4.0集群版；8 – Redis5.0主从版，9 – Redis5.0集群版，
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 搜索关键词：支持实例Id、实例名称、完整IP 
     * @return SearchKeys 搜索关键词：支持实例Id、实例名称、完整IP
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set 搜索关键词：支持实例Id、实例名称、完整IP
     * @param SearchKeys 搜索关键词：支持实例Id、实例名称、完整IP
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get 内部参数，用户可忽略 
     * @return TypeList 内部参数，用户可忽略
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set 内部参数，用户可忽略
     * @param TypeList 内部参数，用户可忽略
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get 内部参数，用户可忽略 
     * @return MonitorVersion 内部参数，用户可忽略
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set 内部参数，用户可忽略
     * @param MonitorVersion 内部参数，用户可忽略
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TypeVersion", this.TypeVersion);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArraySimple(map, prefix + "AutoRenew.", this.AutoRenew);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);

    }
}

