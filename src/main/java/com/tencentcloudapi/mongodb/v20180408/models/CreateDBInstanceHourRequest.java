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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceHourRequest  extends AbstractModel{

    /**
    * 实例内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Integer ReplicateSetNum;

    /**
    * 每个副本集内从节点个数，目前只支持从节点数为2
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Integer SecondaryNum;

    /**
    * MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 实例类型，GIO：高IO版；TGIO：高IO万兆
    */
    @SerializedName("Machine")
    @Expose
    private String Machine;

    /**
    * 实例数量，默认值为1, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Integer GoodsNum;

    /**
    * 可用区信息，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例角色，支持值包括：MASTER-表示主实例，DR-表示灾备实例，RO-表示只读实例
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
    */
    @SerializedName("Encrypt")
    @Expose
    private Integer Encrypt;

    /**
    * 私有网络ID，如果不传则默认选择基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目ID，不填为默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 安全组参数
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
     * 获取实例内存大小，单位：GB
     * @return Memory 实例内存大小，单位：GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存大小，单位：GB
     * @param Memory 实例内存大小，单位：GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例硬盘大小，单位：GB
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     * @return ReplicateSetNum 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     */
    public Integer getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * 设置副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     * @param ReplicateSetNum 副本集个数，1为单副本集实例，大于1为分片集群实例，最大不超过10
     */
    public void setReplicateSetNum(Integer ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * 获取每个副本集内从节点个数，目前只支持从节点数为2
     * @return SecondaryNum 每个副本集内从节点个数，目前只支持从节点数为2
     */
    public Integer getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * 设置每个副本集内从节点个数，目前只支持从节点数为2
     * @param SecondaryNum 每个副本集内从节点个数，目前只支持从节点数为2
     */
    public void setSecondaryNum(Integer SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * 获取MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     * @return EngineVersion MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * 设置MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     * @param EngineVersion MongoDB引擎版本，值包括MONGO_3_WT 、MONGO_3_ROCKS和MONGO_36_WT
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * 获取实例类型，GIO：高IO版；TGIO：高IO万兆
     * @return Machine 实例类型，GIO：高IO版；TGIO：高IO万兆
     */
    public String getMachine() {
        return this.Machine;
    }

    /**
     * 设置实例类型，GIO：高IO版；TGIO：高IO万兆
     * @param Machine 实例类型，GIO：高IO版；TGIO：高IO万兆
     */
    public void setMachine(String Machine) {
        this.Machine = Machine;
    }

    /**
     * 获取实例数量，默认值为1, 最小值1，最大值为10
     * @return GoodsNum 实例数量，默认值为1, 最小值1，最大值为10
     */
    public Integer getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * 设置实例数量，默认值为1, 最小值1，最大值为10
     * @param GoodsNum 实例数量，默认值为1, 最小值1，最大值为10
     */
    public void setGoodsNum(Integer GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * 获取可用区信息，格式如：ap-guangzhou-2
     * @return Zone 可用区信息，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区信息，格式如：ap-guangzhou-2
     * @param Zone 可用区信息，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例角色，支持值包括：MASTER-表示主实例，DR-表示灾备实例，RO-表示只读实例
     * @return InstanceRole 实例角色，支持值包括：MASTER-表示主实例，DR-表示灾备实例，RO-表示只读实例
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * 设置实例角色，支持值包括：MASTER-表示主实例，DR-表示灾备实例，RO-表示只读实例
     * @param InstanceRole 实例角色，支持值包括：MASTER-表示主实例，DR-表示灾备实例，RO-表示只读实例
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * 获取实例类型，REPLSET-副本集，SHARD-分片集群
     * @return InstanceType 实例类型，REPLSET-副本集，SHARD-分片集群
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型，REPLSET-副本集，SHARD-分片集群
     * @param InstanceType 实例类型，REPLSET-副本集，SHARD-分片集群
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     * @return Encrypt 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     */
    public Integer getEncrypt() {
        return this.Encrypt;
    }

    /**
     * 设置数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     * @param Encrypt 数据是否加密，当且仅当引擎版本为MONGO_3_ROCKS，可以选择加密
     */
    public void setEncrypt(Integer Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * 获取私有网络ID，如果不传则默认选择基础网络
     * @return VpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID，如果不传则默认选择基础网络
     * @param VpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @return SubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @param SubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取项目ID，不填为默认项目
     * @return ProjectId 项目ID，不填为默认项目
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID，不填为默认项目
     * @param ProjectId 项目ID，不填为默认项目
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取安全组参数
     * @return SecurityGroup 安全组参数
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * 设置安全组参数
     * @param SecurityGroup 安全组参数
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Machine", this.Machine);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);

    }
}

