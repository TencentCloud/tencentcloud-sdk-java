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

public class CreateDBInstanceRequest  extends AbstractModel{

    /**
    * 每个副本集内从节点个数
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Integer SecondaryNum;

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
    * 版本号，当前支持 MONGO_3_WT、MONGO_3_ROCKS、MONGO_36_WT
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 机器类型，GIO：高IO版；TGIO：高IO万兆
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例数量，默认值为1, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Integer GoodsNum;

    /**
    * 实例所属区域名称，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 时长，购买月数
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 实例密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
    * 私有网络ID，如果不传则默认选择基础网络
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
     * 获取每个副本集内从节点个数
     * @return SecondaryNum 每个副本集内从节点个数
     */
    public Integer getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * 设置每个副本集内从节点个数
     * @param SecondaryNum 每个副本集内从节点个数
     */
    public void setSecondaryNum(Integer SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

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
     * 获取版本号，当前支持 MONGO_3_WT、MONGO_3_ROCKS、MONGO_36_WT
     * @return MongoVersion 版本号，当前支持 MONGO_3_WT、MONGO_3_ROCKS、MONGO_36_WT
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * 设置版本号，当前支持 MONGO_3_WT、MONGO_3_ROCKS、MONGO_36_WT
     * @param MongoVersion 版本号，当前支持 MONGO_3_WT、MONGO_3_ROCKS、MONGO_36_WT
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * 获取机器类型，GIO：高IO版；TGIO：高IO万兆
     * @return MachineCode 机器类型，GIO：高IO版；TGIO：高IO万兆
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * 设置机器类型，GIO：高IO版；TGIO：高IO万兆
     * @param MachineCode 机器类型，GIO：高IO版；TGIO：高IO万兆
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
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
     * 获取实例所属区域名称，格式如：ap-guangzhou-2
     * @return Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置实例所属区域名称，格式如：ap-guangzhou-2
     * @param Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取时长，购买月数
     * @return TimeSpan 时长，购买月数
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置时长，购买月数
     * @param TimeSpan 时长，购买月数
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取实例密码
     * @return Password 实例密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置实例密码
     * @param Password 实例密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
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
     * 获取私有网络ID，如果不传则默认选择基础网络
     * @return UniqVpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * 设置私有网络ID，如果不传则默认选择基础网络
     * @param UniqVpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * 获取私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @return UniqSubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * 设置私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @param UniqSubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);

    }
}

