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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDCDBInstanceRequest extends AbstractModel{

    /**
    * 分片节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
注意当前可售卖的可用区需要通过DescribeDCDBSaleInfo接口拉取。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 欲购买的时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * 单个分片节点个数，可以通过 DescribeShardSpec
 查询实例规格获得。
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
    * 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * 欲购买实例的数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 项目 ID，可以通过查看项目列表获取，不传则关联到默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 虚拟私有网络 ID，不传或传空表示创建为基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 虚拟私有网络子网 ID，VpcId不为空时必填
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。
8.0.18 - MySQL 8.0.18；
10.1.9 - Mariadb 10.1.9；
5.7.17 - Percona 5.7.17。
如果不填的话，默认为5.7.17，表示Percona 5.7.17。
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * 是否自动使用代金券进行支付，默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 代金券ID列表，目前仅支持指定一张代金券。
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 安全组id
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 实例名称， 可以通过该字段自主的设置实例的名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 是否支持IPv6
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * 标签键值对数组
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * DCN源地域
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * DCN源实例ID
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 安全组ids，安全组可以传数组形式，兼容之前SecurityGroupId参数
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get 分片节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
注意当前可售卖的可用区需要通过DescribeDCDBSaleInfo接口拉取。 
     * @return Zones 分片节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
注意当前可售卖的可用区需要通过DescribeDCDBSaleInfo接口拉取。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 分片节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
注意当前可售卖的可用区需要通过DescribeDCDBSaleInfo接口拉取。
     * @param Zones 分片节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
注意当前可售卖的可用区需要通过DescribeDCDBSaleInfo接口拉取。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 欲购买的时长，单位：月。 
     * @return Period 欲购买的时长，单位：月。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 欲购买的时长，单位：月。
     * @param Period 欲购买的时长，单位：月。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。 
     * @return ShardMemory 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardMemory 分片内存大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。 
     * @return ShardStorage 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardStorage 分片存储空间大小，单位：GB，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get 单个分片节点个数，可以通过 DescribeShardSpec
 查询实例规格获得。 
     * @return ShardNodeCount 单个分片节点个数，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set 单个分片节点个数，可以通过 DescribeShardSpec
 查询实例规格获得。
     * @param ShardNodeCount 单个分片节点个数，可以通过 DescribeShardSpec
 查询实例规格获得。
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    /**
     * Get 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。 
     * @return ShardCount 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     * @param ShardCount 实例分片个数，可选范围2-8，可以通过升级实例进行新增分片到最多64个分片。
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get 欲购买实例的数量 
     * @return Count 欲购买实例的数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 欲购买实例的数量
     * @param Count 欲购买实例的数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 项目 ID，可以通过查看项目列表获取，不传则关联到默认项目 
     * @return ProjectId 项目 ID，可以通过查看项目列表获取，不传则关联到默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，可以通过查看项目列表获取，不传则关联到默认项目
     * @param ProjectId 项目 ID，可以通过查看项目列表获取，不传则关联到默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 虚拟私有网络 ID，不传或传空表示创建为基础网络 
     * @return VpcId 虚拟私有网络 ID，不传或传空表示创建为基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 虚拟私有网络 ID，不传或传空表示创建为基础网络
     * @param VpcId 虚拟私有网络 ID，不传或传空表示创建为基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 虚拟私有网络子网 ID，VpcId不为空时必填 
     * @return SubnetId 虚拟私有网络子网 ID，VpcId不为空时必填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 虚拟私有网络子网 ID，VpcId不为空时必填
     * @param SubnetId 虚拟私有网络子网 ID，VpcId不为空时必填
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。
8.0.18 - MySQL 8.0.18；
10.1.9 - Mariadb 10.1.9；
5.7.17 - Percona 5.7.17。
如果不填的话，默认为5.7.17，表示Percona 5.7.17。 
     * @return DbVersionId 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。
8.0.18 - MySQL 8.0.18；
10.1.9 - Mariadb 10.1.9；
5.7.17 - Percona 5.7.17。
如果不填的话，默认为5.7.17，表示Percona 5.7.17。
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。
8.0.18 - MySQL 8.0.18；
10.1.9 - Mariadb 10.1.9；
5.7.17 - Percona 5.7.17。
如果不填的话，默认为5.7.17，表示Percona 5.7.17。
     * @param DbVersionId 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。
8.0.18 - MySQL 8.0.18；
10.1.9 - Mariadb 10.1.9；
5.7.17 - Percona 5.7.17。
如果不填的话，默认为5.7.17，表示Percona 5.7.17。
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get 是否自动使用代金券进行支付，默认不使用。 
     * @return AutoVoucher 是否自动使用代金券进行支付，默认不使用。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券进行支付，默认不使用。
     * @param AutoVoucher 是否自动使用代金券进行支付，默认不使用。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID列表，目前仅支持指定一张代金券。 
     * @return VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID列表，目前仅支持指定一张代金券。
     * @param VoucherIds 代金券ID列表，目前仅支持指定一张代金券。
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 安全组id 
     * @return SecurityGroupId 安全组id
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组id
     * @param SecurityGroupId 安全组id
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 实例名称， 可以通过该字段自主的设置实例的名字 
     * @return InstanceName 实例名称， 可以通过该字段自主的设置实例的名字
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称， 可以通过该字段自主的设置实例的名字
     * @param InstanceName 实例名称， 可以通过该字段自主的设置实例的名字
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 是否支持IPv6 
     * @return Ipv6Flag 是否支持IPv6
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set 是否支持IPv6
     * @param Ipv6Flag 是否支持IPv6
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get 标签键值对数组 
     * @return ResourceTags 标签键值对数组
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 标签键值对数组
     * @param ResourceTags 标签键值对数组
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。 
     * @return InitParams 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     * @param InitParams 参数列表。本接口的可选值为：character_set_server（字符集，必传），lower_case_table_names（表名大小写敏感，必传，0 - 敏感；1-不敏感），innodb_page_size（innodb数据页，默认16K），sync_mode（同步模式：0 - 异步； 1 - 强同步；2 - 强同步可退化。默认为强同步可退化）。
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get DCN源地域 
     * @return DcnRegion DCN源地域
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set DCN源地域
     * @param DcnRegion DCN源地域
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
    }

    /**
     * Get DCN源实例ID 
     * @return DcnInstanceId DCN源实例ID
     */
    public String getDcnInstanceId() {
        return this.DcnInstanceId;
    }

    /**
     * Set DCN源实例ID
     * @param DcnInstanceId DCN源实例ID
     */
    public void setDcnInstanceId(String DcnInstanceId) {
        this.DcnInstanceId = DcnInstanceId;
    }

    /**
     * Get 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0 
     * @return AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
     * @param AutoRenewFlag 自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 安全组ids，安全组可以传数组形式，兼容之前SecurityGroupId参数 
     * @return SecurityGroupIds 安全组ids，安全组可以传数组形式，兼容之前SecurityGroupId参数
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ids，安全组可以传数组形式，兼容之前SecurityGroupId参数
     * @param SecurityGroupIds 安全组ids，安全组可以传数组形式，兼容之前SecurityGroupId参数
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDCDBInstanceRequest(CreateDCDBInstanceRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new DBParamValue(source.InitParams[i]);
            }
        }
        if (source.DcnRegion != null) {
            this.DcnRegion = new String(source.DcnRegion);
        }
        if (source.DcnInstanceId != null) {
            this.DcnInstanceId = new String(source.DcnInstanceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

