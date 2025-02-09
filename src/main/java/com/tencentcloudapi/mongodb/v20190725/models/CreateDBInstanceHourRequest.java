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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceHourRequest extends AbstractModel {

    /**
    * 实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * - 创建副本集实例，指副本集数量，该参数只能为1。
- 创建分片集群实例，指分片的数量。请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * - 创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 产品规格类型。
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例数量，最小值1，最大值为10。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 可用区信息，输入格式如：ap-guangzhou-2。
- 具体信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例架构类型。
- REPLSET：副本集。
- SHARD：分片集群。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 私有网络ID。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询确认正确的ID。 示例值：vpc-pxyzim13
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络VPC的子网。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询子网列表确认正确的 ID。 示例值：subnet-7jbabche
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例密码。设置要求如下：
- 字符个数为[8,32]。
- 可输入[A,Z]、[a,z]、[0,9]范围内的字符。
- 可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“\*”、括号“()”、下划线“_”。
- 不能设置单一的字母或者数字。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 项目ID。
- 若不设置该参数，则为默认项目。
- 在 [MongoDB 控制台项目管理](https://console.cloud.tencent.com/project)页面，可获取项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例标签信息。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 实例类型。- 1：正式实例。- 3：只读实例。- 4：灾备实例。-5：克隆实例，注意：克隆实例RestoreTime为必填项。
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * 父实例 ID。当参数**Clone**为3或者4时，即实例为只读或灾备实例时，该参数必须配置。
    */
    @SerializedName("Father")
    @Expose
    private String Father;

    /**
    * 安全组 ID。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 克隆实例回档时间。
- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。
- 回档时间范围：仅能回档7天内时间点的数据。
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * 实例名称。仅支持长度为60个字符的中文、英文、数字、下划线_、分隔符- 。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 若多可用区部署云数据库实例，指定多可用区列表。
- 多可用区部署实例，参数 **Zone** 指定实例主可用区信息；**AvailabilityZoneList** 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。
- 通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。
- 多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。

    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。

    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * Mongos 内存大小。
-  购买分片集群时，必须填写。
- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。


    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * Mongos 数量。购买分片集群时，必须填写。
- 单可用区部署实例，其数量范围为[3,32]。
- 多可用区部署实例，其数量范围为[6,32]。
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * 只读节点数量，取值范围[0,5]。
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * 指只读节点所属可用区数组。跨可用区部署实例，参数**ReadonlyNodeNum**不为**0**时，必须配置该参数。
    */
    @SerializedName("ReadonlyNodeAvailabilityZoneList")
    @Expose
    private String [] ReadonlyNodeAvailabilityZoneList;

    /**
    * Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。
    */
    @SerializedName("HiddenZone")
    @Expose
    private String HiddenZone;

    /**
    * 参数模板 ID。参数模板是一组 MongoDB 的参数并为预设置了参数值的集合，将一组有相同诉求的参数及值 存为模板，在创建实例时，可直接引用参数值到新实例。合理使用参数模板，可以提高MongoDB数据库的效率。模板列表从 DescribeDBInstanceParamTpl 接口获取，注意模板支持的版本。
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
     * Get 实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 
     * @return Memory 实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     * @param Memory 实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 
     * @return Volume 实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     * @param Volume 实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get - 创建副本集实例，指副本集数量，该参数只能为1。
- 创建分片集群实例，指分片的数量。请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。 
     * @return ReplicateSetNum - 创建副本集实例，指副本集数量，该参数只能为1。
- 创建分片集群实例，指分片的数量。请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set - 创建副本集实例，指副本集数量，该参数只能为1。
- 创建分片集群实例，指分片的数量。请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
     * @param ReplicateSetNum - 创建副本集实例，指副本集数量，该参数只能为1。
- 创建分片集群实例，指分片的数量。请通过接口[DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567)查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get - 创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 
     * @return NodeNum - 创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set - 创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     * @param NodeNum - 创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。 
     * @return MongoVersion 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     * @param MongoVersion 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。
- MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。
- MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。
- MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。
- MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。
- MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 产品规格类型。
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。 
     * @return MachineCode 产品规格类型。
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 产品规格类型。
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
     * @param MachineCode 产品规格类型。
- HIO10G：通用高HIO万兆型。
- HCD：云盘版类型。
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 实例数量，最小值1，最大值为10。 
     * @return GoodsNum 实例数量，最小值1，最大值为10。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，最小值1，最大值为10。
     * @param GoodsNum 实例数量，最小值1，最大值为10。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 可用区信息，输入格式如：ap-guangzhou-2。
- 具体信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。 
     * @return Zone 可用区信息，输入格式如：ap-guangzhou-2。
- 具体信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息，输入格式如：ap-guangzhou-2。
- 具体信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。
     * @param Zone 可用区信息，输入格式如：ap-guangzhou-2。
- 具体信息，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。
- 该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例架构类型。
- REPLSET：副本集。
- SHARD：分片集群。 
     * @return ClusterType 实例架构类型。
- REPLSET：副本集。
- SHARD：分片集群。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 实例架构类型。
- REPLSET：副本集。
- SHARD：分片集群。
     * @param ClusterType 实例架构类型。
- REPLSET：副本集。
- SHARD：分片集群。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 私有网络ID。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询确认正确的ID。 示例值：vpc-pxyzim13 
     * @return VpcId 私有网络ID。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询确认正确的ID。 示例值：vpc-pxyzim13
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询确认正确的ID。 示例值：vpc-pxyzim13
     * @param VpcId 私有网络ID。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询确认正确的ID。 示例值：vpc-pxyzim13
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络VPC的子网。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询子网列表确认正确的 ID。 示例值：subnet-7jbabche 
     * @return SubnetId 私有网络VPC的子网。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询子网列表确认正确的 ID。 示例值：subnet-7jbabche
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络VPC的子网。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询子网列表确认正确的 ID。 示例值：subnet-7jbabche
     * @param SubnetId 私有网络VPC的子网。请登录 [私有网络控制台](https://console.cloud.tencent.com/vpc) 查询子网列表确认正确的 ID。 示例值：subnet-7jbabche
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例密码。设置要求如下：
- 字符个数为[8,32]。
- 可输入[A,Z]、[a,z]、[0,9]范围内的字符。
- 可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“\*”、括号“()”、下划线“_”。
- 不能设置单一的字母或者数字。 
     * @return Password 实例密码。设置要求如下：
- 字符个数为[8,32]。
- 可输入[A,Z]、[a,z]、[0,9]范围内的字符。
- 可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“\*”、括号“()”、下划线“_”。
- 不能设置单一的字母或者数字。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例密码。设置要求如下：
- 字符个数为[8,32]。
- 可输入[A,Z]、[a,z]、[0,9]范围内的字符。
- 可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“\*”、括号“()”、下划线“_”。
- 不能设置单一的字母或者数字。
     * @param Password 实例密码。设置要求如下：
- 字符个数为[8,32]。
- 可输入[A,Z]、[a,z]、[0,9]范围内的字符。
- 可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“\*”、括号“()”、下划线“_”。
- 不能设置单一的字母或者数字。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 项目ID。
- 若不设置该参数，则为默认项目。
- 在 [MongoDB 控制台项目管理](https://console.cloud.tencent.com/project)页面，可获取项目ID。 
     * @return ProjectId 项目ID。
- 若不设置该参数，则为默认项目。
- 在 [MongoDB 控制台项目管理](https://console.cloud.tencent.com/project)页面，可获取项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
- 若不设置该参数，则为默认项目。
- 在 [MongoDB 控制台项目管理](https://console.cloud.tencent.com/project)页面，可获取项目ID。
     * @param ProjectId 项目ID。
- 若不设置该参数，则为默认项目。
- 在 [MongoDB 控制台项目管理](https://console.cloud.tencent.com/project)页面，可获取项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例标签信息。 
     * @return Tags 实例标签信息。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例标签信息。
     * @param Tags 实例标签信息。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例类型。- 1：正式实例。- 3：只读实例。- 4：灾备实例。-5：克隆实例，注意：克隆实例RestoreTime为必填项。 
     * @return Clone 实例类型。- 1：正式实例。- 3：只读实例。- 4：灾备实例。-5：克隆实例，注意：克隆实例RestoreTime为必填项。
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set 实例类型。- 1：正式实例。- 3：只读实例。- 4：灾备实例。-5：克隆实例，注意：克隆实例RestoreTime为必填项。
     * @param Clone 实例类型。- 1：正式实例。- 3：只读实例。- 4：灾备实例。-5：克隆实例，注意：克隆实例RestoreTime为必填项。
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get 父实例 ID。当参数**Clone**为3或者4时，即实例为只读或灾备实例时，该参数必须配置。 
     * @return Father 父实例 ID。当参数**Clone**为3或者4时，即实例为只读或灾备实例时，该参数必须配置。
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set 父实例 ID。当参数**Clone**为3或者4时，即实例为只读或灾备实例时，该参数必须配置。
     * @param Father 父实例 ID。当参数**Clone**为3或者4时，即实例为只读或灾备实例时，该参数必须配置。
     */
    public void setFather(String Father) {
        this.Father = Father;
    }

    /**
     * Get 安全组 ID。 
     * @return SecurityGroup 安全组 ID。
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组 ID。
     * @param SecurityGroup 安全组 ID。
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 克隆实例回档时间。
- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。
- 回档时间范围：仅能回档7天内时间点的数据。 
     * @return RestoreTime 克隆实例回档时间。
- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。
- 回档时间范围：仅能回档7天内时间点的数据。
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set 克隆实例回档时间。
- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。
- 回档时间范围：仅能回档7天内时间点的数据。
     * @param RestoreTime 克隆实例回档时间。
- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。
- 回档时间范围：仅能回档7天内时间点的数据。
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get 实例名称。仅支持长度为60个字符的中文、英文、数字、下划线_、分隔符- 。 
     * @return InstanceName 实例名称。仅支持长度为60个字符的中文、英文、数字、下划线_、分隔符- 。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。仅支持长度为60个字符的中文、英文、数字、下划线_、分隔符- 。
     * @param InstanceName 实例名称。仅支持长度为60个字符的中文、英文、数字、下划线_、分隔符- 。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 若多可用区部署云数据库实例，指定多可用区列表。
- 多可用区部署实例，参数 **Zone** 指定实例主可用区信息；**AvailabilityZoneList** 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。
- 通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。
- 多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。
 
     * @return AvailabilityZoneList 若多可用区部署云数据库实例，指定多可用区列表。
- 多可用区部署实例，参数 **Zone** 指定实例主可用区信息；**AvailabilityZoneList** 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。
- 通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。
- 多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。

     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set 若多可用区部署云数据库实例，指定多可用区列表。
- 多可用区部署实例，参数 **Zone** 指定实例主可用区信息；**AvailabilityZoneList** 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。
- 通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。
- 多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。

     * @param AvailabilityZoneList 若多可用区部署云数据库实例，指定多可用区列表。
- 多可用区部署实例，参数 **Zone** 指定实例主可用区信息；**AvailabilityZoneList** 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。
- 通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。
- 多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。

     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。
 
     * @return MongosCpu Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。

     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。

     * @param MongosCpu Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。

     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get Mongos 内存大小。
-  购买分片集群时，必须填写。
- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。

 
     * @return MongosMemory Mongos 内存大小。
-  购买分片集群时，必须填写。
- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。


     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set Mongos 内存大小。
-  购买分片集群时，必须填写。
- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。


     * @param MongosMemory Mongos 内存大小。
-  购买分片集群时，必须填写。
- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。


     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get Mongos 数量。购买分片集群时，必须填写。
- 单可用区部署实例，其数量范围为[3,32]。
- 多可用区部署实例，其数量范围为[6,32]。 
     * @return MongosNodeNum Mongos 数量。购买分片集群时，必须填写。
- 单可用区部署实例，其数量范围为[3,32]。
- 多可用区部署实例，其数量范围为[6,32]。
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set Mongos 数量。购买分片集群时，必须填写。
- 单可用区部署实例，其数量范围为[3,32]。
- 多可用区部署实例，其数量范围为[6,32]。
     * @param MongosNodeNum Mongos 数量。购买分片集群时，必须填写。
- 单可用区部署实例，其数量范围为[3,32]。
- 多可用区部署实例，其数量范围为[6,32]。
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get 只读节点数量，取值范围[0,5]。 
     * @return ReadonlyNodeNum 只读节点数量，取值范围[0,5]。
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set 只读节点数量，取值范围[0,5]。
     * @param ReadonlyNodeNum 只读节点数量，取值范围[0,5]。
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get 指只读节点所属可用区数组。跨可用区部署实例，参数**ReadonlyNodeNum**不为**0**时，必须配置该参数。 
     * @return ReadonlyNodeAvailabilityZoneList 指只读节点所属可用区数组。跨可用区部署实例，参数**ReadonlyNodeNum**不为**0**时，必须配置该参数。
     */
    public String [] getReadonlyNodeAvailabilityZoneList() {
        return this.ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Set 指只读节点所属可用区数组。跨可用区部署实例，参数**ReadonlyNodeNum**不为**0**时，必须配置该参数。
     * @param ReadonlyNodeAvailabilityZoneList 指只读节点所属可用区数组。跨可用区部署实例，参数**ReadonlyNodeNum**不为**0**时，必须配置该参数。
     */
    public void setReadonlyNodeAvailabilityZoneList(String [] ReadonlyNodeAvailabilityZoneList) {
        this.ReadonlyNodeAvailabilityZoneList = ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Get Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。 
     * @return HiddenZone Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。
     */
    public String getHiddenZone() {
        return this.HiddenZone;
    }

    /**
     * Set Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。
     * @param HiddenZone Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。
     */
    public void setHiddenZone(String HiddenZone) {
        this.HiddenZone = HiddenZone;
    }

    /**
     * Get 参数模板 ID。参数模板是一组 MongoDB 的参数并为预设置了参数值的集合，将一组有相同诉求的参数及值 存为模板，在创建实例时，可直接引用参数值到新实例。合理使用参数模板，可以提高MongoDB数据库的效率。模板列表从 DescribeDBInstanceParamTpl 接口获取，注意模板支持的版本。 
     * @return ParamTemplateId 参数模板 ID。参数模板是一组 MongoDB 的参数并为预设置了参数值的集合，将一组有相同诉求的参数及值 存为模板，在创建实例时，可直接引用参数值到新实例。合理使用参数模板，可以提高MongoDB数据库的效率。模板列表从 DescribeDBInstanceParamTpl 接口获取，注意模板支持的版本。
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 参数模板 ID。参数模板是一组 MongoDB 的参数并为预设置了参数值的集合，将一组有相同诉求的参数及值 存为模板，在创建实例时，可直接引用参数值到新实例。合理使用参数模板，可以提高MongoDB数据库的效率。模板列表从 DescribeDBInstanceParamTpl 接口获取，注意模板支持的版本。
     * @param ParamTemplateId 参数模板 ID。参数模板是一组 MongoDB 的参数并为预设置了参数值的集合，将一组有相同诉求的参数及值 存为模板，在创建实例时，可直接引用参数值到新实例。合理使用参数模板，可以提高MongoDB数据库的效率。模板列表从 DescribeDBInstanceParamTpl 接口获取，注意模板支持的版本。
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    public CreateDBInstanceHourRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceHourRequest(CreateDBInstanceHourRequest source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Clone != null) {
            this.Clone = new Long(source.Clone);
        }
        if (source.Father != null) {
            this.Father = new String(source.Father);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AvailabilityZoneList != null) {
            this.AvailabilityZoneList = new String[source.AvailabilityZoneList.length];
            for (int i = 0; i < source.AvailabilityZoneList.length; i++) {
                this.AvailabilityZoneList[i] = new String(source.AvailabilityZoneList[i]);
            }
        }
        if (source.MongosCpu != null) {
            this.MongosCpu = new Long(source.MongosCpu);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosNodeNum != null) {
            this.MongosNodeNum = new Long(source.MongosNodeNum);
        }
        if (source.ReadonlyNodeNum != null) {
            this.ReadonlyNodeNum = new Long(source.ReadonlyNodeNum);
        }
        if (source.ReadonlyNodeAvailabilityZoneList != null) {
            this.ReadonlyNodeAvailabilityZoneList = new String[source.ReadonlyNodeAvailabilityZoneList.length];
            for (int i = 0; i < source.ReadonlyNodeAvailabilityZoneList.length; i++) {
                this.ReadonlyNodeAvailabilityZoneList[i] = new String(source.ReadonlyNodeAvailabilityZoneList[i]);
            }
        }
        if (source.HiddenZone != null) {
            this.HiddenZone = new String(source.HiddenZone);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new String(source.ParamTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Clone", this.Clone);
        this.setParamSimple(map, prefix + "Father", this.Father);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "AvailabilityZoneList.", this.AvailabilityZoneList);
        this.setParamSimple(map, prefix + "MongosCpu", this.MongosCpu);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosNodeNum", this.MongosNodeNum);
        this.setParamSimple(map, prefix + "ReadonlyNodeNum", this.ReadonlyNodeNum);
        this.setParamArraySimple(map, prefix + "ReadonlyNodeAvailabilityZoneList.", this.ReadonlyNodeAvailabilityZoneList);
        this.setParamSimple(map, prefix + "HiddenZone", this.HiddenZone);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);

    }
}

