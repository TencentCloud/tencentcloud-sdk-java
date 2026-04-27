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

public class InquirePriceCreateDBInstancesRequest extends AbstractModel {

    /**
    * <p>实例所属区域及可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <ul><li>创建副本集实例，指每个副本集内主从节点数量。每个副本集所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li><li>创建分片集群实例，指每个分片的主从节点数量。每个分片所支持的最大节点数与最小节点数，请通过接口 <a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a> 获取。</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>实例内存大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li></ul>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例硬盘大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。</li></ul>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>实例版本信息。具体支持的版本，请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * <p>产品推荐规格类型：</p><ul><li>GE.LD.T1：本地盘（通用I型）。</li><li>GE.CD.T1：云盘（通用I型）。</li></ul><p>产品白名单规格类型：</p><ul><li>HIO10G：本地盘（高IO万兆型）。</li><li>HCD：云盘（云盘版）。</li></ul><p>注意：白名单规格类型为白名单控制，如若需要，请 <a href="https://console.cloud.tencent.com/workorder/category">提交工单</a> 申请</p>
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * <p>实例数量，取值范围为[1,10]。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>实例类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
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
    * <ul><li>选择包年包月计费模式，即 <b>InstanceChargeType </b>设定为<b>PREPAID</b>时，必须设置该参数，指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。<br>-选择按量计费，即 <b>InstanceChargeType</b> 设定为 <strong>POSTPAID_BY_HOUR</strong> 时，该参数仅可配置为 1。</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>实例付费方式。</p><ul><li>PREPAID：包年包月计费。</li><li>POSTPAID_BY_HOUR：按量计费。</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。注意为空时取默认取值为2C。</p>
    */
    @SerializedName("MongosCpu")
    @Expose
    private Long MongosCpu;

    /**
    * <p>Mongos 内存大小。-  购买分片集群时，必须填写。- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。注意为空时取默认取值为4G。</p>
    */
    @SerializedName("MongosMemory")
    @Expose
    private Long MongosMemory;

    /**
    * <p>指 Mongos 个数，取值范围为[3,32]。若为分片集群实例询价，则该参数必须设置。注意为空时取默认取值为3个节点。</p>
    */
    @SerializedName("MongosNum")
    @Expose
    private Long MongosNum;

    /**
    * <p>指 ConfigServer CPU核数，固定取值为 1，单位：GB，可不配置该参数。</p>
    */
    @SerializedName("ConfigServerCpu")
    @Expose
    private Long ConfigServerCpu;

    /**
    * <p>指 ConfigServer 内存大小，固定取值为 2，单位：GB，可不配置该参数。</p>
    */
    @SerializedName("ConfigServerMemory")
    @Expose
    private Long ConfigServerMemory;

    /**
    * <p>指 ConfigServer 磁盘大小，固定取值为 20，单位：GB，可不配置该参数。</p>
    */
    @SerializedName("ConfigServerVolume")
    @Expose
    private Long ConfigServerVolume;

    /**
    * <ul><li>创建副本集实例，指每个副本集内只读节点数量。 </li><li>创建分片集群实例，指每个分片的只读节点数量。<br>取值范围为［1,5］。</li></ul>
    */
    @SerializedName("ReadonlyNodeNum")
    @Expose
    private Long ReadonlyNodeNum;

    /**
    * <p>实例CPU大小。</p><ul><li>单位：C。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li><li>注意：通用 I 型实例询价时必须传入与内存对应的 CPU 核数大小</li></ul>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get <p>实例所属区域及可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p> 
     * @return Zone <p>实例所属区域及可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所属区域及可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
     * @param Zone <p>实例所属区域及可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

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
     * Get <p>实例内存大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li></ul> 
     * @return Memory <p>实例内存大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li></ul>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例内存大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li></ul>
     * @param Memory <p>实例内存大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li></ul>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例硬盘大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。</li></ul> 
     * @return Volume <p>实例硬盘大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。</li></ul>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>实例硬盘大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。</li></ul>
     * @param Volume <p>实例硬盘大小。</p><ul><li>单位：GB。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MinStorage与MaxStorage分别对应其最小磁盘规格与最大磁盘规格。</li></ul>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>实例版本信息。具体支持的版本，请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul> 
     * @return MongoVersion <p>实例版本信息。具体支持的版本，请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set <p>实例版本信息。具体支持的版本，请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
     * @param MongoVersion <p>实例版本信息。具体支持的版本，请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数MongoVersionCode为实例所支持的版本信息。版本信息与版本号对应关系如下：</p><ul><li>MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。</li><li>MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。</li><li>MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。</li><li>MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。</li><li>MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。</li><li>MONGO_70_WT：MongoDB 7.0 WiredTiger存储引擎版本。</li><li>MONGO_80_WT：MongoDB 8.0 WiredTiger存储引擎版本。</li></ul>
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
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
     * Get <p>实例数量，取值范围为[1,10]。</p> 
     * @return GoodsNum <p>实例数量，取值范围为[1,10]。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量，取值范围为[1,10]。</p>
     * @param GoodsNum <p>实例数量，取值范围为[1,10]。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>实例类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul> 
     * @return ClusterType <p>实例类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>实例类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
     * @param ClusterType <p>实例类型。</p><ul><li>REPLSET：副本集。</li><li>SHARD：分片集群。</li></ul>
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
     * Get <ul><li>选择包年包月计费模式，即 <b>InstanceChargeType </b>设定为<b>PREPAID</b>时，必须设置该参数，指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。<br>-选择按量计费，即 <b>InstanceChargeType</b> 设定为 <strong>POSTPAID_BY_HOUR</strong> 时，该参数仅可配置为 1。</li></ul> 
     * @return Period <ul><li>选择包年包月计费模式，即 <b>InstanceChargeType </b>设定为<b>PREPAID</b>时，必须设置该参数，指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。<br>-选择按量计费，即 <b>InstanceChargeType</b> 设定为 <strong>POSTPAID_BY_HOUR</strong> 时，该参数仅可配置为 1。</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <ul><li>选择包年包月计费模式，即 <b>InstanceChargeType </b>设定为<b>PREPAID</b>时，必须设置该参数，指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。<br>-选择按量计费，即 <b>InstanceChargeType</b> 设定为 <strong>POSTPAID_BY_HOUR</strong> 时，该参数仅可配置为 1。</li></ul>
     * @param Period <ul><li>选择包年包月计费模式，即 <b>InstanceChargeType </b>设定为<b>PREPAID</b>时，必须设置该参数，指定购买实例的购买时长。取值可选：[1,2,3,4,5,6,7,8,9,10,11,12,24,36]；单位：月。<br>-选择按量计费，即 <b>InstanceChargeType</b> 设定为 <strong>POSTPAID_BY_HOUR</strong> 时，该参数仅可配置为 1。</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>实例付费方式。</p><ul><li>PREPAID：包年包月计费。</li><li>POSTPAID_BY_HOUR：按量计费。</li></ul> 
     * @return InstanceChargeType <p>实例付费方式。</p><ul><li>PREPAID：包年包月计费。</li><li>POSTPAID_BY_HOUR：按量计费。</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例付费方式。</p><ul><li>PREPAID：包年包月计费。</li><li>POSTPAID_BY_HOUR：按量计费。</li></ul>
     * @param InstanceChargeType <p>实例付费方式。</p><ul><li>PREPAID：包年包月计费。</li><li>POSTPAID_BY_HOUR：按量计费。</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。注意为空时取默认取值为2C。</p> 
     * @return MongosCpu <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。注意为空时取默认取值为2C。</p>
     */
    public Long getMongosCpu() {
        return this.MongosCpu;
    }

    /**
     * Set <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。注意为空时取默认取值为2C。</p>
     * @param MongosCpu <p>Mongos CPU 核数，支持1、2、4、8、16。购买分片集群时，必须填写。注意为空时取默认取值为2C。</p>
     */
    public void setMongosCpu(Long MongosCpu) {
        this.MongosCpu = MongosCpu;
    }

    /**
     * Get <p>Mongos 内存大小。-  购买分片集群时，必须填写。- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。注意为空时取默认取值为4G。</p> 
     * @return MongosMemory <p>Mongos 内存大小。-  购买分片集群时，必须填写。- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。注意为空时取默认取值为4G。</p>
     */
    public Long getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set <p>Mongos 内存大小。-  购买分片集群时，必须填写。- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。注意为空时取默认取值为4G。</p>
     * @param MongosMemory <p>Mongos 内存大小。-  购买分片集群时，必须填写。- 单位：GB，支持1核2GB、2核4GB、4核8GB、8核16GB、16核32GB。注意为空时取默认取值为4G。</p>
     */
    public void setMongosMemory(Long MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get <p>指 Mongos 个数，取值范围为[3,32]。若为分片集群实例询价，则该参数必须设置。注意为空时取默认取值为3个节点。</p> 
     * @return MongosNum <p>指 Mongos 个数，取值范围为[3,32]。若为分片集群实例询价，则该参数必须设置。注意为空时取默认取值为3个节点。</p>
     */
    public Long getMongosNum() {
        return this.MongosNum;
    }

    /**
     * Set <p>指 Mongos 个数，取值范围为[3,32]。若为分片集群实例询价，则该参数必须设置。注意为空时取默认取值为3个节点。</p>
     * @param MongosNum <p>指 Mongos 个数，取值范围为[3,32]。若为分片集群实例询价，则该参数必须设置。注意为空时取默认取值为3个节点。</p>
     */
    public void setMongosNum(Long MongosNum) {
        this.MongosNum = MongosNum;
    }

    /**
     * Get <p>指 ConfigServer CPU核数，固定取值为 1，单位：GB，可不配置该参数。</p> 
     * @return ConfigServerCpu <p>指 ConfigServer CPU核数，固定取值为 1，单位：GB，可不配置该参数。</p>
     */
    public Long getConfigServerCpu() {
        return this.ConfigServerCpu;
    }

    /**
     * Set <p>指 ConfigServer CPU核数，固定取值为 1，单位：GB，可不配置该参数。</p>
     * @param ConfigServerCpu <p>指 ConfigServer CPU核数，固定取值为 1，单位：GB，可不配置该参数。</p>
     */
    public void setConfigServerCpu(Long ConfigServerCpu) {
        this.ConfigServerCpu = ConfigServerCpu;
    }

    /**
     * Get <p>指 ConfigServer 内存大小，固定取值为 2，单位：GB，可不配置该参数。</p> 
     * @return ConfigServerMemory <p>指 ConfigServer 内存大小，固定取值为 2，单位：GB，可不配置该参数。</p>
     */
    public Long getConfigServerMemory() {
        return this.ConfigServerMemory;
    }

    /**
     * Set <p>指 ConfigServer 内存大小，固定取值为 2，单位：GB，可不配置该参数。</p>
     * @param ConfigServerMemory <p>指 ConfigServer 内存大小，固定取值为 2，单位：GB，可不配置该参数。</p>
     */
    public void setConfigServerMemory(Long ConfigServerMemory) {
        this.ConfigServerMemory = ConfigServerMemory;
    }

    /**
     * Get <p>指 ConfigServer 磁盘大小，固定取值为 20，单位：GB，可不配置该参数。</p> 
     * @return ConfigServerVolume <p>指 ConfigServer 磁盘大小，固定取值为 20，单位：GB，可不配置该参数。</p>
     */
    public Long getConfigServerVolume() {
        return this.ConfigServerVolume;
    }

    /**
     * Set <p>指 ConfigServer 磁盘大小，固定取值为 20，单位：GB，可不配置该参数。</p>
     * @param ConfigServerVolume <p>指 ConfigServer 磁盘大小，固定取值为 20，单位：GB，可不配置该参数。</p>
     */
    public void setConfigServerVolume(Long ConfigServerVolume) {
        this.ConfigServerVolume = ConfigServerVolume;
    }

    /**
     * Get <ul><li>创建副本集实例，指每个副本集内只读节点数量。 </li><li>创建分片集群实例，指每个分片的只读节点数量。<br>取值范围为［1,5］。</li></ul> 
     * @return ReadonlyNodeNum <ul><li>创建副本集实例，指每个副本集内只读节点数量。 </li><li>创建分片集群实例，指每个分片的只读节点数量。<br>取值范围为［1,5］。</li></ul>
     */
    public Long getReadonlyNodeNum() {
        return this.ReadonlyNodeNum;
    }

    /**
     * Set <ul><li>创建副本集实例，指每个副本集内只读节点数量。 </li><li>创建分片集群实例，指每个分片的只读节点数量。<br>取值范围为［1,5］。</li></ul>
     * @param ReadonlyNodeNum <ul><li>创建副本集实例，指每个副本集内只读节点数量。 </li><li>创建分片集群实例，指每个分片的只读节点数量。<br>取值范围为［1,5］。</li></ul>
     */
    public void setReadonlyNodeNum(Long ReadonlyNodeNum) {
        this.ReadonlyNodeNum = ReadonlyNodeNum;
    }

    /**
     * Get <p>实例CPU大小。</p><ul><li>单位：C。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li><li>注意：通用 I 型实例询价时必须传入与内存对应的 CPU 核数大小</li></ul> 
     * @return Cpu <p>实例CPU大小。</p><ul><li>单位：C。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li><li>注意：通用 I 型实例询价时必须传入与内存对应的 CPU 核数大小</li></ul>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例CPU大小。</p><ul><li>单位：C。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li><li>注意：通用 I 型实例询价时必须传入与内存对应的 CPU 核数大小</li></ul>
     * @param Cpu <p>实例CPU大小。</p><ul><li>单位：C。</li><li>取值范围：请通过接口<a href="https://cloud.tencent.com/document/product/240/38567">DescribeSpecInfo</a>查询，其返回的数据结构SpecItems中的参数CPU与Memory分别对应CPU核数与内存规格。</li><li>注意：通用 I 型实例询价时必须传入与内存对应的 CPU 核数大小</li></ul>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public InquirePriceCreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateDBInstancesRequest(InquirePriceCreateDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
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
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.MongosCpu != null) {
            this.MongosCpu = new Long(source.MongosCpu);
        }
        if (source.MongosMemory != null) {
            this.MongosMemory = new Long(source.MongosMemory);
        }
        if (source.MongosNum != null) {
            this.MongosNum = new Long(source.MongosNum);
        }
        if (source.ConfigServerCpu != null) {
            this.ConfigServerCpu = new Long(source.ConfigServerCpu);
        }
        if (source.ConfigServerMemory != null) {
            this.ConfigServerMemory = new Long(source.ConfigServerMemory);
        }
        if (source.ConfigServerVolume != null) {
            this.ConfigServerVolume = new Long(source.ConfigServerVolume);
        }
        if (source.ReadonlyNodeNum != null) {
            this.ReadonlyNodeNum = new Long(source.ReadonlyNodeNum);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "MongosCpu", this.MongosCpu);
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamSimple(map, prefix + "MongosNum", this.MongosNum);
        this.setParamSimple(map, prefix + "ConfigServerCpu", this.ConfigServerCpu);
        this.setParamSimple(map, prefix + "ConfigServerMemory", this.ConfigServerMemory);
        this.setParamSimple(map, prefix + "ConfigServerVolume", this.ConfigServerVolume);
        this.setParamSimple(map, prefix + "ReadonlyNodeNum", this.ReadonlyNodeNum);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

