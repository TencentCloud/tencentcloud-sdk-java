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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceRequest extends AbstractModel {

    /**
    * <ul><li>创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>指版本信息。具体支持的版本信息 ，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * <p>实例数量, 最小值1，最大值为30。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>可用区信息，输入格式如：ap-guangzhou-2。</p><ul><li>具体信息，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。</li></ul>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</p>
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * <p>实例架构类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <ul><li>创建副本集实例，指副本集数量，该参数只能为1。</li><li>创建分片集群实例，指分片的数量。请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。</li></ul>
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * <p>项目ID。</p><ul><li>若不设置该参数，则为默认项目。</li><li>在 <a href="https://console.cloud.tencent.com/project">MongoDB 控制台项目管理</a>页面，可获取项目ID。</li></ul>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>私有网络 ID。</p><ul><li>仅支持配置私有网络，必须选择一个与实例同一地域的私有网络。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的私有网络 ID。</li><li>实例创建成功之后，支持更换私有网络。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络 VPC 的子网 ID。</p><ul><li>必须在已选的私有网络内指定一个子网。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的子网 ID。</li><li>实例创建成功之后，支持更换私有网络及子网。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例密码。设置要求如下：</p><ul><li>字符个数为[8,32]。</li><li>可输入[A,Z]、[a,z]、[0,9]范围内的字符。</li><li>可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“*”、括号“()”、下划线“_”。</li><li>不能设置单一的字母或者数字。</li></ul>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>实例标签信息。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>自动续费标记。</p><ul><li>0：不自动续费。</li><li>1：自动续费。</li></ul>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>是否自动选择代金券。</p><ul><li>1：是。</li><li>0：否。默认为0。</li></ul>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>实例类型。</p><ul><li>1：正式实例。</li><li>3：只读实例。</li><li>4：灾备实例。</li><li>5：克隆实例。注意：克隆实例 RestoreTime 为必填项。</li></ul>
    */
    @SerializedName("Clone")
    @Expose
    private Long Clone;

    /**
    * <p>父实例 ID。</p><ul><li>当参数<strong>Clone</strong>为3或者4时，即实例为只读或灾备实例时，该参数必须配置。</li><li>请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制父实例 ID。</li></ul>
    */
    @SerializedName("Father")
    @Expose
    private String Father;

    /**
    * <p>安全组 ID。 请登录<a href="https://console.cloud.tencent.com/vpc/security-group">安全组控制台</a>页面获取与数据库实例同地域的安全组 ID。</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>克隆实例回档时间，当Clone取值为5或6时为必填。- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。- 回档时间范围：仅能回档7天内时间点的数据。</p>
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * <p>实例名称。仅支持长度为128个字符的中文、英文、数字、下划线_、分隔符-。批量购买数据库实例时，支持通过自定义命名模式串与数字后缀自动升序功能，高效设置实例名称。</p><ul><li>基础模式：前缀＋自动升序编号（默认从1开始），<strong>lnstanceName</strong>仅需自定义实例名称前缀，例如设置为：cmgo，设置购买数量为5，则购买后，实例名称依次分别为cmgo1、cmgo2、cmgo3、cmgo4、cmgo5。</li><li>自定义起始序号模式：前缀+｛R:x｝（x为自定义起始序号）。<strong>InstanceName</strong>需填写“前缀｛R:x｝”，例如：cmgo｛R:3｝，设置购买数量为5，则实例名称为cmgo3、cmgo4、cmgo5、cmgo6、cmgo7。</li><li>复合模式串：前缀1{R:x}+前缀2{R:y}+ ⋯+固定后缀，x与y分别为每一段前缀的起始序号。<strong>instanceName</strong>需填写复合模式串，例如：cmgo{R:10}_node{R:12}_db，设置批量购买数量为5，则实例名称为 cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, cluster14_node16_db.</li></ul>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>若多可用区部署云数据库实例，指定多可用区列表。</p><ul><li>多可用区部署实例，参数 <strong>Zone</strong> 指定实例主可用区信息；<strong>AvailabilityZoneList</strong> 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。</li><li>通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。</li><li>多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。</li></ul>
    */
    @SerializedName("AvailabilityZoneList")
    @Expose
    private String [] AvailabilityZoneList;

    /**
    * <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。</p>
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * <p>Mongos 内存大小。</p><ul><li>购买分片集群时，必须填写。</li><li>单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。</li></ul>
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * <p>Mongos 数量。购买分片集群时，必须填写。</p><ul><li>单可用区部署实例，其数量范围为[3,32]。</li><li>多可用区部署实例，其数量范围为[6,32]。</li></ul>
    */
    @SerializedName("MongosNodeNum")
    @Expose
    private Long MongosNodeNum;

    /**
    * <p>只读节点数量，取值范围[0,5]。</p>
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * <p>指只读节点所属可用区数组。跨可用区部署实例，参数<strong>ReadonlyNodeNum</strong>不为<strong>0</strong>时，必须配置该参数。</p>
    */
    @SerializedName("ReadonlyNodeAvailabilityZoneList")
    @Expose
    private String [] ReadonlyNodeAvailabilityZoneList;

    /**
    * <p>Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。</p>
    */
    @SerializedName("HiddenZone")
    @Expose
    private String HiddenZone;

    /**
    * <p>参数模板 ID。</p><ul><li>参数模板是预置了特定参数值的集合，可用于快速配置新的 MongoDB 实例。合理使用参数模板，能有效提升数据库的部署效率与运行性能。</li><li>参数模板 ID 可通过 <a href="https://cloud.tencent.com/document/product/240/109155">DescribeDBInstanceParamTpl </a>接口获取。请选择与实例版本与架构所对应的参数模板 ID。</li></ul>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private String ParamTemplateId;

    /**
    * <p>实例CPU核大小，单位：C。具体售卖的CPU规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取<br>注意：通用 I 型实例必须设置 CPU 大小。</p>
    */
    @SerializedName("CpuCore")
    @Expose
    private Long CpuCore;

    /**
     * Get <ul><li>创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li></ul> 
     * @return NodeNum <ul><li>创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li></ul>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <ul><li>创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li></ul>
     * @param NodeNum <ul><li>创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li></ul>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p> 
     * @return Memory <p>实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
     * @param Memory <p>实例内存大小，单位：GB。具体售卖的内存规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p> 
     * @return Volume <p>实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
     * @param Volume <p>实例硬盘大小，单位：GB。每一个 CPU 规格对应的最大磁盘与最小磁盘范围，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>指版本信息。具体支持的版本信息 ，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul> 
     * @return MongoVersion <p>指版本信息。具体支持的版本信息 ，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set <p>指版本信息。具体支持的版本信息 ，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
     * @param MongoVersion <p>指版本信息。具体支持的版本信息 ，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get <p>实例数量, 最小值1，最大值为30。</p> 
     * @return GoodsNum <p>实例数量, 最小值1，最大值为30。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量, 最小值1，最大值为30。</p>
     * @param GoodsNum <p>实例数量, 最小值1，最大值为30。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>可用区信息，输入格式如：ap-guangzhou-2。</p><ul><li>具体信息，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。</li></ul> 
     * @return Zone <p>可用区信息，输入格式如：ap-guangzhou-2。</p><ul><li>具体信息，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。</li></ul>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息，输入格式如：ap-guangzhou-2。</p><ul><li>具体信息，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。</li></ul>
     * @param Zone <p>可用区信息，输入格式如：ap-guangzhou-2。</p><ul><li>具体信息，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>该参数为主可用区，如果多可用区部署，Zone必须是AvailabilityZoneList中的一个。</li></ul>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。</p> 
     * @return Period <p>指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。</p>
     * @param Period <p>指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</p> 
     * @return MachineCode <p>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</p>
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set <p>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</p>
     * @param MachineCode <p>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</p>
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get <p>实例架构类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul> 
     * @return ClusterType <p>实例架构类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>实例架构类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
     * @param ClusterType <p>实例架构类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <ul><li>创建副本集实例，指副本集数量，该参数只能为1。</li><li>创建分片集群实例，指分片的数量。请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。</li></ul> 
     * @return ReplicateSetNum <ul><li>创建副本集实例，指副本集数量，该参数只能为1。</li><li>创建分片集群实例，指分片的数量。请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。</li></ul>
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set <ul><li>创建副本集实例，指副本集数量，该参数只能为1。</li><li>创建分片集群实例，指分片的数量。请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。</li></ul>
     * @param ReplicateSetNum <ul><li>创建副本集实例，指副本集数量，该参数只能为1。</li><li>创建分片集群实例，指分片的数量。请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询分片数量的取值范围，其返回的数据结构SpecItems中的参数MinReplicateSetNum与MaxReplicateSetNum分别对应其最小值与最大值。</li></ul>
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get <p>项目ID。</p><ul><li>若不设置该参数，则为默认项目。</li><li>在 <a href="https://console.cloud.tencent.com/project">MongoDB 控制台项目管理</a>页面，可获取项目ID。</li></ul> 
     * @return ProjectId <p>项目ID。</p><ul><li>若不设置该参数，则为默认项目。</li><li>在 <a href="https://console.cloud.tencent.com/project">MongoDB 控制台项目管理</a>页面，可获取项目ID。</li></ul>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID。</p><ul><li>若不设置该参数，则为默认项目。</li><li>在 <a href="https://console.cloud.tencent.com/project">MongoDB 控制台项目管理</a>页面，可获取项目ID。</li></ul>
     * @param ProjectId <p>项目ID。</p><ul><li>若不设置该参数，则为默认项目。</li><li>在 <a href="https://console.cloud.tencent.com/project">MongoDB 控制台项目管理</a>页面，可获取项目ID。</li></ul>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>私有网络 ID。</p><ul><li>仅支持配置私有网络，必须选择一个与实例同一地域的私有网络。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的私有网络 ID。</li><li>实例创建成功之后，支持更换私有网络。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul> 
     * @return VpcId <p>私有网络 ID。</p><ul><li>仅支持配置私有网络，必须选择一个与实例同一地域的私有网络。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的私有网络 ID。</li><li>实例创建成功之后，支持更换私有网络。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络 ID。</p><ul><li>仅支持配置私有网络，必须选择一个与实例同一地域的私有网络。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的私有网络 ID。</li><li>实例创建成功之后，支持更换私有网络。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
     * @param VpcId <p>私有网络 ID。</p><ul><li>仅支持配置私有网络，必须选择一个与实例同一地域的私有网络。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的私有网络 ID。</li><li>实例创建成功之后，支持更换私有网络。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络 VPC 的子网 ID。</p><ul><li>必须在已选的私有网络内指定一个子网。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的子网 ID。</li><li>实例创建成功之后，支持更换私有网络及子网。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul> 
     * @return SubnetId <p>私有网络 VPC 的子网 ID。</p><ul><li>必须在已选的私有网络内指定一个子网。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的子网 ID。</li><li>实例创建成功之后，支持更换私有网络及子网。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络 VPC 的子网 ID。</p><ul><li>必须在已选的私有网络内指定一个子网。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的子网 ID。</li><li>实例创建成功之后，支持更换私有网络及子网。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
     * @param SubnetId <p>私有网络 VPC 的子网 ID。</p><ul><li>必须在已选的私有网络内指定一个子网。请登录<a href="https://console.cloud.tencent.com/vpc">私有网络控制台</a>获取可使用的子网 ID。</li><li>实例创建成功之后，支持更换私有网络及子网。具体操作，请参见<a href="https://cloud.tencent.com/document/product/239/30910">更换网络</a>。</li></ul>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例密码。设置要求如下：</p><ul><li>字符个数为[8,32]。</li><li>可输入[A,Z]、[a,z]、[0,9]范围内的字符。</li><li>可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“*”、括号“()”、下划线“_”。</li><li>不能设置单一的字母或者数字。</li></ul> 
     * @return Password <p>实例密码。设置要求如下：</p><ul><li>字符个数为[8,32]。</li><li>可输入[A,Z]、[a,z]、[0,9]范围内的字符。</li><li>可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“*”、括号“()”、下划线“_”。</li><li>不能设置单一的字母或者数字。</li></ul>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>实例密码。设置要求如下：</p><ul><li>字符个数为[8,32]。</li><li>可输入[A,Z]、[a,z]、[0,9]范围内的字符。</li><li>可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“*”、括号“()”、下划线“_”。</li><li>不能设置单一的字母或者数字。</li></ul>
     * @param Password <p>实例密码。设置要求如下：</p><ul><li>字符个数为[8,32]。</li><li>可输入[A,Z]、[a,z]、[0,9]范围内的字符。</li><li>可输入的特殊字符包括：感叹号“!”，at“@”，警号“#”、百分号“%”、插入号“^”、星号“*”、括号“()”、下划线“_”。</li><li>不能设置单一的字母或者数字。</li></ul>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>实例标签信息。</p> 
     * @return Tags <p>实例标签信息。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>实例标签信息。</p>
     * @param Tags <p>实例标签信息。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>自动续费标记。</p><ul><li>0：不自动续费。</li><li>1：自动续费。</li></ul> 
     * @return AutoRenewFlag <p>自动续费标记。</p><ul><li>0：不自动续费。</li><li>1：自动续费。</li></ul>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标记。</p><ul><li>0：不自动续费。</li><li>1：自动续费。</li></ul>
     * @param AutoRenewFlag <p>自动续费标记。</p><ul><li>0：不自动续费。</li><li>1：自动续费。</li></ul>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>是否自动选择代金券。</p><ul><li>1：是。</li><li>0：否。默认为0。</li></ul> 
     * @return AutoVoucher <p>是否自动选择代金券。</p><ul><li>1：是。</li><li>0：否。默认为0。</li></ul>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券。</p><ul><li>1：是。</li><li>0：否。默认为0。</li></ul>
     * @param AutoVoucher <p>是否自动选择代金券。</p><ul><li>1：是。</li><li>0：否。默认为0。</li></ul>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>实例类型。</p><ul><li>1：正式实例。</li><li>3：只读实例。</li><li>4：灾备实例。</li><li>5：克隆实例。注意：克隆实例 RestoreTime 为必填项。</li></ul> 
     * @return Clone <p>实例类型。</p><ul><li>1：正式实例。</li><li>3：只读实例。</li><li>4：灾备实例。</li><li>5：克隆实例。注意：克隆实例 RestoreTime 为必填项。</li></ul>
     */
    public Long getClone() {
        return this.Clone;
    }

    /**
     * Set <p>实例类型。</p><ul><li>1：正式实例。</li><li>3：只读实例。</li><li>4：灾备实例。</li><li>5：克隆实例。注意：克隆实例 RestoreTime 为必填项。</li></ul>
     * @param Clone <p>实例类型。</p><ul><li>1：正式实例。</li><li>3：只读实例。</li><li>4：灾备实例。</li><li>5：克隆实例。注意：克隆实例 RestoreTime 为必填项。</li></ul>
     */
    public void setClone(Long Clone) {
        this.Clone = Clone;
    }

    /**
     * Get <p>父实例 ID。</p><ul><li>当参数<strong>Clone</strong>为3或者4时，即实例为只读或灾备实例时，该参数必须配置。</li><li>请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制父实例 ID。</li></ul> 
     * @return Father <p>父实例 ID。</p><ul><li>当参数<strong>Clone</strong>为3或者4时，即实例为只读或灾备实例时，该参数必须配置。</li><li>请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制父实例 ID。</li></ul>
     */
    public String getFather() {
        return this.Father;
    }

    /**
     * Set <p>父实例 ID。</p><ul><li>当参数<strong>Clone</strong>为3或者4时，即实例为只读或灾备实例时，该参数必须配置。</li><li>请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制父实例 ID。</li></ul>
     * @param Father <p>父实例 ID。</p><ul><li>当参数<strong>Clone</strong>为3或者4时，即实例为只读或灾备实例时，该参数必须配置。</li><li>请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制父实例 ID。</li></ul>
     */
    public void setFather(String Father) {
        this.Father = Father;
    }

    /**
     * Get <p>安全组 ID。 请登录<a href="https://console.cloud.tencent.com/vpc/security-group">安全组控制台</a>页面获取与数据库实例同地域的安全组 ID。</p> 
     * @return SecurityGroup <p>安全组 ID。 请登录<a href="https://console.cloud.tencent.com/vpc/security-group">安全组控制台</a>页面获取与数据库实例同地域的安全组 ID。</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>安全组 ID。 请登录<a href="https://console.cloud.tencent.com/vpc/security-group">安全组控制台</a>页面获取与数据库实例同地域的安全组 ID。</p>
     * @param SecurityGroup <p>安全组 ID。 请登录<a href="https://console.cloud.tencent.com/vpc/security-group">安全组控制台</a>页面获取与数据库实例同地域的安全组 ID。</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>克隆实例回档时间，当Clone取值为5或6时为必填。- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。- 回档时间范围：仅能回档7天内时间点的数据。</p> 
     * @return RestoreTime <p>克隆实例回档时间，当Clone取值为5或6时为必填。- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。- 回档时间范围：仅能回档7天内时间点的数据。</p>
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set <p>克隆实例回档时间，当Clone取值为5或6时为必填。- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。- 回档时间范围：仅能回档7天内时间点的数据。</p>
     * @param RestoreTime <p>克隆实例回档时间，当Clone取值为5或6时为必填。- 若为克隆实例，则必须配置该参数。输入格式示例：2021-08-13 16:30:00。- 回档时间范围：仅能回档7天内时间点的数据。</p>
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get <p>实例名称。仅支持长度为128个字符的中文、英文、数字、下划线_、分隔符-。批量购买数据库实例时，支持通过自定义命名模式串与数字后缀自动升序功能，高效设置实例名称。</p><ul><li>基础模式：前缀＋自动升序编号（默认从1开始），<strong>lnstanceName</strong>仅需自定义实例名称前缀，例如设置为：cmgo，设置购买数量为5，则购买后，实例名称依次分别为cmgo1、cmgo2、cmgo3、cmgo4、cmgo5。</li><li>自定义起始序号模式：前缀+｛R:x｝（x为自定义起始序号）。<strong>InstanceName</strong>需填写“前缀｛R:x｝”，例如：cmgo｛R:3｝，设置购买数量为5，则实例名称为cmgo3、cmgo4、cmgo5、cmgo6、cmgo7。</li><li>复合模式串：前缀1{R:x}+前缀2{R:y}+ ⋯+固定后缀，x与y分别为每一段前缀的起始序号。<strong>instanceName</strong>需填写复合模式串，例如：cmgo{R:10}_node{R:12}_db，设置批量购买数量为5，则实例名称为 cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, cluster14_node16_db.</li></ul> 
     * @return InstanceName <p>实例名称。仅支持长度为128个字符的中文、英文、数字、下划线_、分隔符-。批量购买数据库实例时，支持通过自定义命名模式串与数字后缀自动升序功能，高效设置实例名称。</p><ul><li>基础模式：前缀＋自动升序编号（默认从1开始），<strong>lnstanceName</strong>仅需自定义实例名称前缀，例如设置为：cmgo，设置购买数量为5，则购买后，实例名称依次分别为cmgo1、cmgo2、cmgo3、cmgo4、cmgo5。</li><li>自定义起始序号模式：前缀+｛R:x｝（x为自定义起始序号）。<strong>InstanceName</strong>需填写“前缀｛R:x｝”，例如：cmgo｛R:3｝，设置购买数量为5，则实例名称为cmgo3、cmgo4、cmgo5、cmgo6、cmgo7。</li><li>复合模式串：前缀1{R:x}+前缀2{R:y}+ ⋯+固定后缀，x与y分别为每一段前缀的起始序号。<strong>instanceName</strong>需填写复合模式串，例如：cmgo{R:10}_node{R:12}_db，设置批量购买数量为5，则实例名称为 cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, cluster14_node16_db.</li></ul>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。仅支持长度为128个字符的中文、英文、数字、下划线_、分隔符-。批量购买数据库实例时，支持通过自定义命名模式串与数字后缀自动升序功能，高效设置实例名称。</p><ul><li>基础模式：前缀＋自动升序编号（默认从1开始），<strong>lnstanceName</strong>仅需自定义实例名称前缀，例如设置为：cmgo，设置购买数量为5，则购买后，实例名称依次分别为cmgo1、cmgo2、cmgo3、cmgo4、cmgo5。</li><li>自定义起始序号模式：前缀+｛R:x｝（x为自定义起始序号）。<strong>InstanceName</strong>需填写“前缀｛R:x｝”，例如：cmgo｛R:3｝，设置购买数量为5，则实例名称为cmgo3、cmgo4、cmgo5、cmgo6、cmgo7。</li><li>复合模式串：前缀1{R:x}+前缀2{R:y}+ ⋯+固定后缀，x与y分别为每一段前缀的起始序号。<strong>instanceName</strong>需填写复合模式串，例如：cmgo{R:10}_node{R:12}_db，设置批量购买数量为5，则实例名称为 cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, cluster14_node16_db.</li></ul>
     * @param InstanceName <p>实例名称。仅支持长度为128个字符的中文、英文、数字、下划线_、分隔符-。批量购买数据库实例时，支持通过自定义命名模式串与数字后缀自动升序功能，高效设置实例名称。</p><ul><li>基础模式：前缀＋自动升序编号（默认从1开始），<strong>lnstanceName</strong>仅需自定义实例名称前缀，例如设置为：cmgo，设置购买数量为5，则购买后，实例名称依次分别为cmgo1、cmgo2、cmgo3、cmgo4、cmgo5。</li><li>自定义起始序号模式：前缀+｛R:x｝（x为自定义起始序号）。<strong>InstanceName</strong>需填写“前缀｛R:x｝”，例如：cmgo｛R:3｝，设置购买数量为5，则实例名称为cmgo3、cmgo4、cmgo5、cmgo6、cmgo7。</li><li>复合模式串：前缀1{R:x}+前缀2{R:y}+ ⋯+固定后缀，x与y分别为每一段前缀的起始序号。<strong>instanceName</strong>需填写复合模式串，例如：cmgo{R:10}_node{R:12}_db，设置批量购买数量为5，则实例名称为 cmgo10_node12_db, cmgo11_node13_db, cmgo12_node14_db, cmgo13_node15_db, cluster14_node16_db.</li></ul>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>若多可用区部署云数据库实例，指定多可用区列表。</p><ul><li>多可用区部署实例，参数 <strong>Zone</strong> 指定实例主可用区信息；<strong>AvailabilityZoneList</strong> 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。</li><li>通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。</li><li>多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。</li></ul> 
     * @return AvailabilityZoneList <p>若多可用区部署云数据库实例，指定多可用区列表。</p><ul><li>多可用区部署实例，参数 <strong>Zone</strong> 指定实例主可用区信息；<strong>AvailabilityZoneList</strong> 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。</li><li>通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。</li><li>多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。</li></ul>
     */
    public String [] getAvailabilityZoneList() {
        return this.AvailabilityZoneList;
    }

    /**
     * Set <p>若多可用区部署云数据库实例，指定多可用区列表。</p><ul><li>多可用区部署实例，参数 <strong>Zone</strong> 指定实例主可用区信息；<strong>AvailabilityZoneList</strong> 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。</li><li>通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。</li><li>多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。</li></ul>
     * @param AvailabilityZoneList <p>若多可用区部署云数据库实例，指定多可用区列表。</p><ul><li>多可用区部署实例，参数 <strong>Zone</strong> 指定实例主可用区信息；<strong>AvailabilityZoneList</strong> 指定所有可用区信息，包含主可用区。输入格式如：[ap-guangzhou-2,ap-guangzhou-3,ap-guangzhou-4]。</li><li>通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 可获取云数据库不同地域规划的可用区信息，以便指定有效的可用区。</li><li>多可用区部署节点只能部署在3个不同可用区。不支持将集群的大多数节点部署在同一个可用区。例如：3节点集群不支持2个节点部署在同一个区。</li></ul>
     */
    public void setAvailabilityZoneList(String [] AvailabilityZoneList) {
        this.AvailabilityZoneList = AvailabilityZoneList;
    }

    /**
     * Get <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。</p> 
     * @return MongosCpu <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。</p>
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。</p>
     * @param MongosCpu <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。</p>
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get <p>Mongos 内存大小。</p><ul><li>购买分片集群时，必须填写。</li><li>单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。</li></ul> 
     * @return MongosMemory <p>Mongos 内存大小。</p><ul><li>购买分片集群时，必须填写。</li><li>单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。</li></ul>
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set <p>Mongos 内存大小。</p><ul><li>购买分片集群时，必须填写。</li><li>单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。</li></ul>
     * @param MongosMemory <p>Mongos 内存大小。</p><ul><li>购买分片集群时，必须填写。</li><li>单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。</li></ul>
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get <p>Mongos 数量。购买分片集群时，必须填写。</p><ul><li>单可用区部署实例，其数量范围为[3,32]。</li><li>多可用区部署实例，其数量范围为[6,32]。</li></ul> 
     * @return MongosNodeNum <p>Mongos 数量。购买分片集群时，必须填写。</p><ul><li>单可用区部署实例，其数量范围为[3,32]。</li><li>多可用区部署实例，其数量范围为[6,32]。</li></ul>
     */
    public Long getMongosNodeNum() {
        return this.MongosNodeNum;
    }

    /**
     * Set <p>Mongos 数量。购买分片集群时，必须填写。</p><ul><li>单可用区部署实例，其数量范围为[3,32]。</li><li>多可用区部署实例，其数量范围为[6,32]。</li></ul>
     * @param MongosNodeNum <p>Mongos 数量。购买分片集群时，必须填写。</p><ul><li>单可用区部署实例，其数量范围为[3,32]。</li><li>多可用区部署实例，其数量范围为[6,32]。</li></ul>
     */
    public void setMongosNodeNum(Long MongosNodeNum) {
        this.MongosNodeNum = MongosNodeNum;
    }

    /**
     * Get <p>只读节点数量，取值范围[0,5]。</p> 
     * @return ReadonlyNodeNum <p>只读节点数量，取值范围[0,5]。</p>
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set <p>只读节点数量，取值范围[0,5]。</p>
     * @param ReadonlyNodeNum <p>只读节点数量，取值范围[0,5]。</p>
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get <p>指只读节点所属可用区数组。跨可用区部署实例，参数<strong>ReadonlyNodeNum</strong>不为<strong>0</strong>时，必须配置该参数。</p> 
     * @return ReadonlyNodeAvailabilityZoneList <p>指只读节点所属可用区数组。跨可用区部署实例，参数<strong>ReadonlyNodeNum</strong>不为<strong>0</strong>时，必须配置该参数。</p>
     */
    public String [] getReadonlyNodeAvailabilityZoneList() {
        return this.ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Set <p>指只读节点所属可用区数组。跨可用区部署实例，参数<strong>ReadonlyNodeNum</strong>不为<strong>0</strong>时，必须配置该参数。</p>
     * @param ReadonlyNodeAvailabilityZoneList <p>指只读节点所属可用区数组。跨可用区部署实例，参数<strong>ReadonlyNodeNum</strong>不为<strong>0</strong>时，必须配置该参数。</p>
     */
    public void setReadonlyNodeAvailabilityZoneList(String [] ReadonlyNodeAvailabilityZoneList) {
        this.ReadonlyNodeAvailabilityZoneList = ReadonlyNodeAvailabilityZoneList;
    }

    /**
     * Get <p>Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。</p> 
     * @return HiddenZone <p>Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。</p>
     */
    public String getHiddenZone() {
        return this.HiddenZone;
    }

    /**
     * Set <p>Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。</p>
     * @param HiddenZone <p>Hidden节点所属可用区。跨可用区部署实例，必须配置该参数。</p>
     */
    public void setHiddenZone(String HiddenZone) {
        this.HiddenZone = HiddenZone;
    }

    /**
     * Get <p>参数模板 ID。</p><ul><li>参数模板是预置了特定参数值的集合，可用于快速配置新的 MongoDB 实例。合理使用参数模板，能有效提升数据库的部署效率与运行性能。</li><li>参数模板 ID 可通过 <a href="https://cloud.tencent.com/document/product/240/109155">DescribeDBInstanceParamTpl </a>接口获取。请选择与实例版本与架构所对应的参数模板 ID。</li></ul> 
     * @return ParamTemplateId <p>参数模板 ID。</p><ul><li>参数模板是预置了特定参数值的集合，可用于快速配置新的 MongoDB 实例。合理使用参数模板，能有效提升数据库的部署效率与运行性能。</li><li>参数模板 ID 可通过 <a href="https://cloud.tencent.com/document/product/240/109155">DescribeDBInstanceParamTpl </a>接口获取。请选择与实例版本与架构所对应的参数模板 ID。</li></ul>
     */
    public String getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>参数模板 ID。</p><ul><li>参数模板是预置了特定参数值的集合，可用于快速配置新的 MongoDB 实例。合理使用参数模板，能有效提升数据库的部署效率与运行性能。</li><li>参数模板 ID 可通过 <a href="https://cloud.tencent.com/document/product/240/109155">DescribeDBInstanceParamTpl </a>接口获取。请选择与实例版本与架构所对应的参数模板 ID。</li></ul>
     * @param ParamTemplateId <p>参数模板 ID。</p><ul><li>参数模板是预置了特定参数值的集合，可用于快速配置新的 MongoDB 实例。合理使用参数模板，能有效提升数据库的部署效率与运行性能。</li><li>参数模板 ID 可通过 <a href="https://cloud.tencent.com/document/product/240/109155">DescribeDBInstanceParamTpl </a>接口获取。请选择与实例版本与架构所对应的参数模板 ID。</li></ul>
     */
    public void setParamTemplateId(String ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>实例CPU核大小，单位：C。具体售卖的CPU规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取<br>注意：通用 I 型实例必须设置 CPU 大小。</p> 
     * @return CpuCore <p>实例CPU核大小，单位：C。具体售卖的CPU规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取<br>注意：通用 I 型实例必须设置 CPU 大小。</p>
     */
    public Long getCpuCore() {
        return this.CpuCore;
    }

    /**
     * Set <p>实例CPU核大小，单位：C。具体售卖的CPU规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取<br>注意：通用 I 型实例必须设置 CPU 大小。</p>
     * @param CpuCore <p>实例CPU核大小，单位：C。具体售卖的CPU规格，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取<br>注意：通用 I 型实例必须设置 CPU 大小。</p>
     */
    public void setCpuCore(Long CpuCore) {
        this.CpuCore = CpuCore;
    }

    public CreateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceRequest(CreateDBInstanceRequest source) {
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
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
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
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
        if (source.CpuCore != null) {
            this.CpuCore = new Long(source.CpuCore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
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
        this.setParamSimple(map, prefix + "CpuCore", this.CpuCore);

    }
}

