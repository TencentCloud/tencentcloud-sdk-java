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
    * 实例列表的大小，参数默认值20，传值则以传参为准，如果传参大于具体配置etc/conf/component.properties中的DescribeInstancesPageLimit配置项 （读不到配置默认配置项为1000），则以配置项为准
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
    * 根据标签的Key和Value筛选资源，不传或者传空数组则不进行过滤
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * 根据标签的Key筛选资源，不传或者传空数组则不进行过滤
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
     * Get 实例列表的大小，参数默认值20，传值则以传参为准，如果传参大于具体配置etc/conf/component.properties中的DescribeInstancesPageLimit配置项 （读不到配置默认配置项为1000），则以配置项为准 
     * @return Limit 实例列表的大小，参数默认值20，传值则以传参为准，如果传参大于具体配置etc/conf/component.properties中的DescribeInstancesPageLimit配置项 （读不到配置默认配置项为1000），则以配置项为准
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 实例列表的大小，参数默认值20，传值则以传参为准，如果传参大于具体配置etc/conf/component.properties中的DescribeInstancesPageLimit配置项 （读不到配置默认配置项为1000），则以配置项为准
     * @param Limit 实例列表的大小，参数默认值20，传值则以传参为准，如果传参大于具体配置etc/conf/component.properties中的DescribeInstancesPageLimit配置项 （读不到配置默认配置项为1000），则以配置项为准
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
     * Get 根据标签的Key和Value筛选资源，不传或者传空数组则不进行过滤 
     * @return InstanceTags 根据标签的Key和Value筛选资源，不传或者传空数组则不进行过滤
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 根据标签的Key和Value筛选资源，不传或者传空数组则不进行过滤
     * @param InstanceTags 根据标签的Key和Value筛选资源，不传或者传空数组则不进行过滤
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get 根据标签的Key筛选资源，不传或者传空数组则不进行过滤 
     * @return TagKeys 根据标签的Key筛选资源，不传或者传空数组则不进行过滤
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 根据标签的Key筛选资源，不传或者传空数组则不进行过滤
     * @param TagKeys 根据标签的Key筛选资源，不传或者传空数组则不进行过滤
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UniqVpcIds != null) {
            this.UniqVpcIds = new String[source.UniqVpcIds.length];
            for (int i = 0; i < source.UniqVpcIds.length; i++) {
                this.UniqVpcIds[i] = new String(source.UniqVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.TypeVersion != null) {
            this.TypeVersion = new Long(source.TypeVersion);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long[source.AutoRenew.length];
            for (int i = 0; i < source.AutoRenew.length; i++) {
                this.AutoRenew[i] = new Long(source.AutoRenew[i]);
            }
        }
        if (source.BillingMode != null) {
            this.BillingMode = new String(source.BillingMode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.TypeList != null) {
            this.TypeList = new Long[source.TypeList.length];
            for (int i = 0; i < source.TypeList.length; i++) {
                this.TypeList[i] = new Long(source.TypeList[i]);
            }
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);

    }
}

