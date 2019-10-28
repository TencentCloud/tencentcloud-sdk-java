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

public class SpecItem  extends AbstractModel{

    /**
    * 规格信息标识
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * 规格有效标志，取值：0-停止售卖，1-开放售卖
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 规格有效标志，取值：0-停止售卖，1-开放售卖
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;

    /**
    * 内存规格，单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 默认磁盘规格，单位MB
    */
    @SerializedName("DefaultStorage")
    @Expose
    private Integer DefaultStorage;

    /**
    * 最大磁盘规格，单位MB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Integer MaxStorage;

    /**
    * 最小磁盘规格，单位MB
    */
    @SerializedName("MinStorage")
    @Expose
    private Integer MinStorage;

    /**
    * 可承载qps信息
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * 连接数限制
    */
    @SerializedName("Conns")
    @Expose
    private Integer Conns;

    /**
    * 实例mongodb版本信息
    */
    @SerializedName("MongoVersionCode")
    @Expose
    private String MongoVersionCode;

    /**
    * 实例mongodb版本号
    */
    @SerializedName("MongoVersionValue")
    @Expose
    private Integer MongoVersionValue;

    /**
    * 实例mongodb版本号（短）
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 存储引擎
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 集群类型，取值：1-分片集群，0-副本集集群
    */
    @SerializedName("ClusterType")
    @Expose
    private Integer ClusterType;

    /**
    * 最小副本集从节点数
    */
    @SerializedName("MinNodeNum")
    @Expose
    private Integer MinNodeNum;

    /**
    * 最大副本集从节点数
    */
    @SerializedName("MaxNodeNum")
    @Expose
    private Integer MaxNodeNum;

    /**
    * 最小分片数
    */
    @SerializedName("MinReplicateSetNum")
    @Expose
    private Integer MinReplicateSetNum;

    /**
    * 最大分片数
    */
    @SerializedName("MaxReplicateSetNum")
    @Expose
    private Integer MaxReplicateSetNum;

    /**
    * 最小分片从节点数
    */
    @SerializedName("MinReplicateSetNodeNum")
    @Expose
    private Integer MinReplicateSetNodeNum;

    /**
    * 最大分片从节点数
    */
    @SerializedName("MaxReplicateSetNodeNum")
    @Expose
    private Integer MaxReplicateSetNodeNum;

    /**
    * 机器类型，取值：0-HIO，4-HIO10G
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * 获取规格信息标识
     * @return SpecCode 规格信息标识
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * 设置规格信息标识
     * @param SpecCode 规格信息标识
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * 获取规格有效标志，取值：0-停止售卖，1-开放售卖
     * @return Status 规格有效标志，取值：0-停止售卖，1-开放售卖
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置规格有效标志，取值：0-停止售卖，1-开放售卖
     * @param Status 规格有效标志，取值：0-停止售卖，1-开放售卖
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取规格有效标志，取值：0-停止售卖，1-开放售卖
     * @return Cpu 规格有效标志，取值：0-停止售卖，1-开放售卖
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置规格有效标志，取值：0-停止售卖，1-开放售卖
     * @param Cpu 规格有效标志，取值：0-停止售卖，1-开放售卖
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存规格，单位为MB
     * @return Memory 内存规格，单位为MB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存规格，单位为MB
     * @param Memory 内存规格，单位为MB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取默认磁盘规格，单位MB
     * @return DefaultStorage 默认磁盘规格，单位MB
     */
    public Integer getDefaultStorage() {
        return this.DefaultStorage;
    }

    /**
     * 设置默认磁盘规格，单位MB
     * @param DefaultStorage 默认磁盘规格，单位MB
     */
    public void setDefaultStorage(Integer DefaultStorage) {
        this.DefaultStorage = DefaultStorage;
    }

    /**
     * 获取最大磁盘规格，单位MB
     * @return MaxStorage 最大磁盘规格，单位MB
     */
    public Integer getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * 设置最大磁盘规格，单位MB
     * @param MaxStorage 最大磁盘规格，单位MB
     */
    public void setMaxStorage(Integer MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * 获取最小磁盘规格，单位MB
     * @return MinStorage 最小磁盘规格，单位MB
     */
    public Integer getMinStorage() {
        return this.MinStorage;
    }

    /**
     * 设置最小磁盘规格，单位MB
     * @param MinStorage 最小磁盘规格，单位MB
     */
    public void setMinStorage(Integer MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * 获取可承载qps信息
     * @return Qps 可承载qps信息
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置可承载qps信息
     * @param Qps 可承载qps信息
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取连接数限制
     * @return Conns 连接数限制
     */
    public Integer getConns() {
        return this.Conns;
    }

    /**
     * 设置连接数限制
     * @param Conns 连接数限制
     */
    public void setConns(Integer Conns) {
        this.Conns = Conns;
    }

    /**
     * 获取实例mongodb版本信息
     * @return MongoVersionCode 实例mongodb版本信息
     */
    public String getMongoVersionCode() {
        return this.MongoVersionCode;
    }

    /**
     * 设置实例mongodb版本信息
     * @param MongoVersionCode 实例mongodb版本信息
     */
    public void setMongoVersionCode(String MongoVersionCode) {
        this.MongoVersionCode = MongoVersionCode;
    }

    /**
     * 获取实例mongodb版本号
     * @return MongoVersionValue 实例mongodb版本号
     */
    public Integer getMongoVersionValue() {
        return this.MongoVersionValue;
    }

    /**
     * 设置实例mongodb版本号
     * @param MongoVersionValue 实例mongodb版本号
     */
    public void setMongoVersionValue(Integer MongoVersionValue) {
        this.MongoVersionValue = MongoVersionValue;
    }

    /**
     * 获取实例mongodb版本号（短）
     * @return Version 实例mongodb版本号（短）
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置实例mongodb版本号（短）
     * @param Version 实例mongodb版本号（短）
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 获取存储引擎
     * @return EngineName 存储引擎
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * 设置存储引擎
     * @param EngineName 存储引擎
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * 获取集群类型，取值：1-分片集群，0-副本集集群
     * @return ClusterType 集群类型，取值：1-分片集群，0-副本集集群
     */
    public Integer getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置集群类型，取值：1-分片集群，0-副本集集群
     * @param ClusterType 集群类型，取值：1-分片集群，0-副本集集群
     */
    public void setClusterType(Integer ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取最小副本集从节点数
     * @return MinNodeNum 最小副本集从节点数
     */
    public Integer getMinNodeNum() {
        return this.MinNodeNum;
    }

    /**
     * 设置最小副本集从节点数
     * @param MinNodeNum 最小副本集从节点数
     */
    public void setMinNodeNum(Integer MinNodeNum) {
        this.MinNodeNum = MinNodeNum;
    }

    /**
     * 获取最大副本集从节点数
     * @return MaxNodeNum 最大副本集从节点数
     */
    public Integer getMaxNodeNum() {
        return this.MaxNodeNum;
    }

    /**
     * 设置最大副本集从节点数
     * @param MaxNodeNum 最大副本集从节点数
     */
    public void setMaxNodeNum(Integer MaxNodeNum) {
        this.MaxNodeNum = MaxNodeNum;
    }

    /**
     * 获取最小分片数
     * @return MinReplicateSetNum 最小分片数
     */
    public Integer getMinReplicateSetNum() {
        return this.MinReplicateSetNum;
    }

    /**
     * 设置最小分片数
     * @param MinReplicateSetNum 最小分片数
     */
    public void setMinReplicateSetNum(Integer MinReplicateSetNum) {
        this.MinReplicateSetNum = MinReplicateSetNum;
    }

    /**
     * 获取最大分片数
     * @return MaxReplicateSetNum 最大分片数
     */
    public Integer getMaxReplicateSetNum() {
        return this.MaxReplicateSetNum;
    }

    /**
     * 设置最大分片数
     * @param MaxReplicateSetNum 最大分片数
     */
    public void setMaxReplicateSetNum(Integer MaxReplicateSetNum) {
        this.MaxReplicateSetNum = MaxReplicateSetNum;
    }

    /**
     * 获取最小分片从节点数
     * @return MinReplicateSetNodeNum 最小分片从节点数
     */
    public Integer getMinReplicateSetNodeNum() {
        return this.MinReplicateSetNodeNum;
    }

    /**
     * 设置最小分片从节点数
     * @param MinReplicateSetNodeNum 最小分片从节点数
     */
    public void setMinReplicateSetNodeNum(Integer MinReplicateSetNodeNum) {
        this.MinReplicateSetNodeNum = MinReplicateSetNodeNum;
    }

    /**
     * 获取最大分片从节点数
     * @return MaxReplicateSetNodeNum 最大分片从节点数
     */
    public Integer getMaxReplicateSetNodeNum() {
        return this.MaxReplicateSetNodeNum;
    }

    /**
     * 设置最大分片从节点数
     * @param MaxReplicateSetNodeNum 最大分片从节点数
     */
    public void setMaxReplicateSetNodeNum(Integer MaxReplicateSetNodeNum) {
        this.MaxReplicateSetNodeNum = MaxReplicateSetNodeNum;
    }

    /**
     * 获取机器类型，取值：0-HIO，4-HIO10G
     * @return MachineType 机器类型，取值：0-HIO，4-HIO10G
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * 设置机器类型，取值：0-HIO，4-HIO10G
     * @param MachineType 机器类型，取值：0-HIO，4-HIO10G
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DefaultStorage", this.DefaultStorage);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Conns", this.Conns);
        this.setParamSimple(map, prefix + "MongoVersionCode", this.MongoVersionCode);
        this.setParamSimple(map, prefix + "MongoVersionValue", this.MongoVersionValue);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "MinNodeNum", this.MinNodeNum);
        this.setParamSimple(map, prefix + "MaxNodeNum", this.MaxNodeNum);
        this.setParamSimple(map, prefix + "MinReplicateSetNum", this.MinReplicateSetNum);
        this.setParamSimple(map, prefix + "MaxReplicateSetNum", this.MaxReplicateSetNum);
        this.setParamSimple(map, prefix + "MinReplicateSetNodeNum", this.MinReplicateSetNodeNum);
        this.setParamSimple(map, prefix + "MaxReplicateSetNodeNum", this.MaxReplicateSetNodeNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

