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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateDBInstancesRequest extends AbstractModel{

    /**
    * 实例所属区域名称，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 实例内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例数量, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
     * Get 实例所属区域名称，格式如：ap-guangzhou-2 
     * @return Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属区域名称，格式如：ap-guangzhou-2
     * @param Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数 
     * @return NodeNum 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     * @param NodeNum 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 实例内存大小，单位：GB 
     * @return Memory 实例内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：GB
     * @param Memory 实例内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB 
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本 
     * @return MongoVersion 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本
     * @param MongoVersion 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本，MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型 
     * @return MachineCode 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
     * @param MachineCode 机器类型，HIO：高IO型；HIO10G：高IO万兆型；STDS5：标准型
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 实例数量, 最小值1，最大值为10 
     * @return GoodsNum 实例数量, 最小值1，最大值为10
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量, 最小值1，最大值为10
     * @param GoodsNum 实例数量, 最小值1，最大值为10
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36] 
     * @return Period 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @param Period 实例时长，单位：月，可选值包括[1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点 
     * @return ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
     * @param ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群，STANDALONE-单节点
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0 
     * @return ReplicateSetNum 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
     * @param ReplicateSetNum 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数；若为单节点实例，该参数设置为0
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
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
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);

    }
}

