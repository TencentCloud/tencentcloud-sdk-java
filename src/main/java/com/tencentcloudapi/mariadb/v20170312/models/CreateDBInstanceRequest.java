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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceRequest extends AbstractModel{

    /**
    * 实例节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 节点个数大小，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 欲购买的时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 欲购买的数量，默认查询购买1个实例的价格。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

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
    * 虚拟私有网络 ID，不传表示创建为基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 虚拟私有网络子网 ID，VpcId 不为空时必填
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目 ID，可以通过查看项目列表获取，不传则关联到默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。如果不传的话，默认为 Percona 5.7.17。
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * 实例名称， 可以通过该字段自主的设置实例的名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 安全组ID列表
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 自动续费标志，1:自动续费，2:不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

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
     * Get 实例节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。 
     * @return Zones 实例节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 实例节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
     * @param Zones 实例节点可用区分布，最多可填两个可用区。当分片规格为一主两从时，其中两个节点在第一个可用区。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 节点个数大小，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。 
     * @return NodeCount 节点个数大小，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点个数大小，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @param NodeCount 节点个数大小，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。 
     * @return Memory 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     * @param Memory 内存大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。 
     * @return Storage 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     * @param Storage 存储空间大小，单位：GB，可以通过 DescribeDBInstanceSpecs
 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get 欲购买的数量，默认查询购买1个实例的价格。 
     * @return Count 欲购买的数量，默认查询购买1个实例的价格。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 欲购买的数量，默认查询购买1个实例的价格。
     * @param Count 欲购买的数量，默认查询购买1个实例的价格。
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get 虚拟私有网络 ID，不传表示创建为基础网络 
     * @return VpcId 虚拟私有网络 ID，不传表示创建为基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 虚拟私有网络 ID，不传表示创建为基础网络
     * @param VpcId 虚拟私有网络 ID，不传表示创建为基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 虚拟私有网络子网 ID，VpcId 不为空时必填 
     * @return SubnetId 虚拟私有网络子网 ID，VpcId 不为空时必填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 虚拟私有网络子网 ID，VpcId 不为空时必填
     * @param SubnetId 虚拟私有网络子网 ID，VpcId 不为空时必填
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。如果不传的话，默认为 Percona 5.7.17。 
     * @return DbVersionId 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。如果不传的话，默认为 Percona 5.7.17。
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。如果不传的话，默认为 Percona 5.7.17。
     * @param DbVersionId 数据库引擎版本，当前可选：8.0.18，10.1.9，5.7.17。如果不传的话，默认为 Percona 5.7.17。
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
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
     * Get 安全组ID列表 
     * @return SecurityGroupIds 安全组ID列表
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID列表
     * @param SecurityGroupIds 安全组ID列表
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 自动续费标志，1:自动续费，2:不自动续费 
     * @return AutoRenewFlag 自动续费标志，1:自动续费，2:不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志，1:自动续费，2:不自动续费
     * @param AutoRenewFlag 自动续费标志，1:自动续费，2:不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
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

    public CreateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceRequest(CreateDBInstanceRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
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
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);

    }
}

