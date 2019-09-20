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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstancesInfo  extends AbstractModel{

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ftitle")
    @Expose
    private String Ftitle;

    /**
    * 集群名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 地区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 项目Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 添加时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private EmrProductConfigOutter Config;

    /**
    * 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * EMR版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * 收费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private Integer ChargeType;

    /**
    * 交易版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeVersion")
    @Expose
    private Integer TradeVersion;

    /**
    * 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceOrderId")
    @Expose
    private Integer ResourceOrderId;

    /**
    * 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsTradeCluster")
    @Expose
    private Integer IsTradeCluster;

    /**
    * 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmInfo")
    @Expose
    private String AlarmInfo;

    /**
     * 获取ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取标题
注意：此字段可能返回 null，表示取不到有效值。
     * @return Ftitle 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFtitle() {
        return this.Ftitle;
    }

    /**
     * 设置标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ftitle 标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFtitle(String Ftitle) {
        this.Ftitle = Ftitle;
    }

    /**
     * 获取集群名
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterName 集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * 设置集群名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * 获取地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取地区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ZoneId 地区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置地区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 地区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     * @return AppId 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @return Uin 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取项目Id
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     * @return VpcId 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 集群VPCID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取添加时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return AddTime 添加时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置添加时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 添加时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 获取已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return RunTime 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * 设置已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunTime 已经运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * 获取集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Config 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmrProductConfigOutter getConfig() {
        return this.Config;
    }

    /**
     * 设置集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 集群产品配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(EmrProductConfigOutter Config) {
        this.Config = Config;
    }

    /**
     * 获取主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @return MasterIp 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * 设置主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterIp 主节点外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * 获取EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     * @return EmrVersion EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * 设置EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmrVersion EMR版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * 获取收费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return ChargeType 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getChargeType() {
        return this.ChargeType;
    }

    /**
     * 设置收费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 收费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(Integer ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * 获取交易版本
注意：此字段可能返回 null，表示取不到有效值。
     * @return TradeVersion 交易版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * 设置交易版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeVersion 交易版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeVersion(Integer TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * 获取资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ResourceOrderId 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getResourceOrderId() {
        return this.ResourceOrderId;
    }

    /**
     * 设置资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceOrderId 资源订单ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceOrderId(Integer ResourceOrderId) {
        this.ResourceOrderId = ResourceOrderId;
    }

    /**
     * 获取是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     * @return IsTradeCluster 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getIsTradeCluster() {
        return this.IsTradeCluster;
    }

    /**
     * 设置是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsTradeCluster 是否计费集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsTradeCluster(Integer IsTradeCluster) {
        this.IsTradeCluster = IsTradeCluster;
    }

    /**
     * 获取集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return AlarmInfo 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * 设置集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmInfo 集群错误状态告警信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmInfo(String AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Ftitle", this.Ftitle);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "MasterIp", this.MasterIp);
        this.setParamSimple(map, prefix + "EmrVersion", this.EmrVersion);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "TradeVersion", this.TradeVersion);
        this.setParamSimple(map, prefix + "ResourceOrderId", this.ResourceOrderId);
        this.setParamSimple(map, prefix + "IsTradeCluster", this.IsTradeCluster);
        this.setParamSimple(map, prefix + "AlarmInfo", this.AlarmInfo);

    }
}

