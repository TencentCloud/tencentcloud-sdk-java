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

public class InstanceSet  extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例串号
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * appid
    */
    @SerializedName("Appid")
    @Expose
    private Integer Appid;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 区域id
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * vpc网络id
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * vpc网络下子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 实例vip
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 实例端口号
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 实例创建时间
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * 实例容量大小，单位：MB
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * 实例当前已使用容量，单位：MB
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * 实例类型，1：集群版；2：主从版
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 实例到期时间
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取实例串号
     * @return InstanceId 实例串号
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例串号
     * @param InstanceId 实例串号
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取appid
     * @return Appid appid
     */
    public Integer getAppid() {
        return this.Appid;
    }

    /**
     * 设置appid
     * @param Appid appid
     */
    public void setAppid(Integer Appid) {
        this.Appid = Appid;
    }

    /**
     * 获取项目id
     * @return ProjectId 项目id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）
     * @return RegionId 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）
     * @param RegionId 地域id 1--广州 4--上海 5-- 香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取区域id
     * @return ZoneId 区域id
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置区域id
     * @param ZoneId 区域id
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取vpc网络id
     * @return VpcId vpc网络id
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置vpc网络id
     * @param VpcId vpc网络id
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取vpc网络下子网id
     * @return SubnetId vpc网络下子网id
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置vpc网络下子网id
     * @param SubnetId vpc网络下子网id
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离
     * @return Status 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离
     * @param Status 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例vip
     * @return WanIp 实例vip
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * 设置实例vip
     * @param WanIp 实例vip
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * 获取实例端口号
     * @return Port 实例端口号
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置实例端口号
     * @param Port 实例端口号
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取实例创建时间
     * @return Createtime 实例创建时间
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * 设置实例创建时间
     * @param Createtime 实例创建时间
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * 获取实例容量大小，单位：MB
     * @return Size 实例容量大小，单位：MB
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * 设置实例容量大小，单位：MB
     * @param Size 实例容量大小，单位：MB
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * 获取实例当前已使用容量，单位：MB
     * @return SizeUsed 实例当前已使用容量，单位：MB
     */
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * 设置实例当前已使用容量，单位：MB
     * @param SizeUsed 实例当前已使用容量，单位：MB
     */
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * 获取实例类型，1：集群版；2：主从版
     * @return Type 实例类型，1：集群版；2：主从版
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置实例类型，1：集群版；2：主从版
     * @param Type 实例类型，1：集群版；2：主从版
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     * @return AutoRenewFlag 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     * @param AutoRenewFlag 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取实例到期时间
     * @return DeadlineTime 实例到期时间
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * 设置实例到期时间
     * @param DeadlineTime 实例到期时间
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeUsed", this.SizeUsed);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);

    }
}

