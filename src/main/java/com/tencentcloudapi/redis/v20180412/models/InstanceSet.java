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
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户的Appid
    */
    @SerializedName("Appid")
    @Expose
    private Integer Appid;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
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
    * vpc网络id 如：75101
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * vpc网络下子网id 如：46315
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
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
    * 该字段已废弃
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * 实例类型，1：Redis2.8集群版；2：Redis2.8主从版；3：CKV主从版（Redis3.2）；4：CKV集群版（Redis3.2）；5：Redis2.8单机版；6：Redis4.0主从版；7：Redis4.0集群版；
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
    * 引擎：社区版Redis、腾讯云CKV
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 产品类型：Redis2.8集群版、Redis2.8主从版、Redis3.2主从版（CKV主从版）、Redis3.2集群版（CKV集群版）、Redis2.8单机版、Redis4.0集群版
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * vpc网络id 如：vpc-fk33jsf43kgv
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * vpc网络下子网id 如：subnet-fd3j6l35mm0
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 计费模式：0-按量计费，1-包年包月
    */
    @SerializedName("BillingMode")
    @Expose
    private Integer BillingMode;

    /**
    * 实例运行状态描述：如”实例运行中“
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * 计划下线时间
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 流程中的实例，返回子状态
    */
    @SerializedName("SubStatus")
    @Expose
    private Integer SubStatus;

    /**
    * 反亲和性标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 实例节点信息
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * 分片大小
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Integer RedisShardSize;

    /**
    * 分片数量
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Integer RedisShardNum;

    /**
    * 副本数量
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Integer RedisReplicasNum;

    /**
    * 计费Id
    */
    @SerializedName("PriceId")
    @Expose
    private Integer PriceId;

    /**
    * 隔离时间
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * 从节点读取权重
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Integer SlaveReadWeight;

    /**
    * 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

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
     * 获取实例Id
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取用户的Appid
     * @return Appid 用户的Appid
     */
    public Integer getAppid() {
        return this.Appid;
    }

    /**
     * 设置用户的Appid
     * @param Appid 用户的Appid
     */
    public void setAppid(Integer Appid) {
        this.Appid = Appid;
    }

    /**
     * 获取项目Id
     * @return ProjectId 项目Id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     * @return RegionId 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     * @param RegionId 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
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
     * 获取vpc网络id 如：75101
     * @return VpcId vpc网络id 如：75101
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置vpc网络id 如：75101
     * @param VpcId vpc网络id 如：75101
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取vpc网络下子网id 如：46315
     * @return SubnetId vpc网络下子网id 如：46315
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置vpc网络下子网id 如：46315
     * @param SubnetId vpc网络下子网id 如：46315
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
     * @return Status 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
     * @param Status 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
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
     * 获取该字段已废弃
     * @return SizeUsed 该字段已废弃
     */
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * 设置该字段已废弃
     * @param SizeUsed 该字段已废弃
     */
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * 获取实例类型，1：Redis2.8集群版；2：Redis2.8主从版；3：CKV主从版（Redis3.2）；4：CKV集群版（Redis3.2）；5：Redis2.8单机版；6：Redis4.0主从版；7：Redis4.0集群版；
     * @return Type 实例类型，1：Redis2.8集群版；2：Redis2.8主从版；3：CKV主从版（Redis3.2）；4：CKV集群版（Redis3.2）；5：Redis2.8单机版；6：Redis4.0主从版；7：Redis4.0集群版；
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置实例类型，1：Redis2.8集群版；2：Redis2.8主从版；3：CKV主从版（Redis3.2）；4：CKV集群版（Redis3.2）；5：Redis2.8单机版；6：Redis4.0主从版；7：Redis4.0集群版；
     * @param Type 实例类型，1：Redis2.8集群版；2：Redis2.8主从版；3：CKV主从版（Redis3.2）；4：CKV集群版（Redis3.2）；5：Redis2.8单机版；6：Redis4.0主从版；7：Redis4.0集群版；
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
     * 获取引擎：社区版Redis、腾讯云CKV
     * @return Engine 引擎：社区版Redis、腾讯云CKV
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * 设置引擎：社区版Redis、腾讯云CKV
     * @param Engine 引擎：社区版Redis、腾讯云CKV
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * 获取产品类型：Redis2.8集群版、Redis2.8主从版、Redis3.2主从版（CKV主从版）、Redis3.2集群版（CKV集群版）、Redis2.8单机版、Redis4.0集群版
     * @return ProductType 产品类型：Redis2.8集群版、Redis2.8主从版、Redis3.2主从版（CKV主从版）、Redis3.2集群版（CKV集群版）、Redis2.8单机版、Redis4.0集群版
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * 设置产品类型：Redis2.8集群版、Redis2.8主从版、Redis3.2主从版（CKV主从版）、Redis3.2集群版（CKV集群版）、Redis2.8单机版、Redis4.0集群版
     * @param ProductType 产品类型：Redis2.8集群版、Redis2.8主从版、Redis3.2主从版（CKV主从版）、Redis3.2集群版（CKV集群版）、Redis2.8单机版、Redis4.0集群版
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * 获取vpc网络id 如：vpc-fk33jsf43kgv
     * @return UniqVpcId vpc网络id 如：vpc-fk33jsf43kgv
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * 设置vpc网络id 如：vpc-fk33jsf43kgv
     * @param UniqVpcId vpc网络id 如：vpc-fk33jsf43kgv
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * 获取vpc网络下子网id 如：subnet-fd3j6l35mm0
     * @return UniqSubnetId vpc网络下子网id 如：subnet-fd3j6l35mm0
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * 设置vpc网络下子网id 如：subnet-fd3j6l35mm0
     * @param UniqSubnetId vpc网络下子网id 如：subnet-fd3j6l35mm0
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * 获取计费模式：0-按量计费，1-包年包月
     * @return BillingMode 计费模式：0-按量计费，1-包年包月
     */
    public Integer getBillingMode() {
        return this.BillingMode;
    }

    /**
     * 设置计费模式：0-按量计费，1-包年包月
     * @param BillingMode 计费模式：0-按量计费，1-包年包月
     */
    public void setBillingMode(Integer BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * 获取实例运行状态描述：如”实例运行中“
     * @return InstanceTitle 实例运行状态描述：如”实例运行中“
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * 设置实例运行状态描述：如”实例运行中“
     * @param InstanceTitle 实例运行状态描述：如”实例运行中“
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * 获取计划下线时间
     * @return OfflineTime 计划下线时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * 设置计划下线时间
     * @param OfflineTime 计划下线时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * 获取流程中的实例，返回子状态
     * @return SubStatus 流程中的实例，返回子状态
     */
    public Integer getSubStatus() {
        return this.SubStatus;
    }

    /**
     * 设置流程中的实例，返回子状态
     * @param SubStatus 流程中的实例，返回子状态
     */
    public void setSubStatus(Integer SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * 获取反亲和性标签
     * @return Tags 反亲和性标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * 设置反亲和性标签
     * @param Tags 反亲和性标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取实例节点信息
     * @return InstanceNode 实例节点信息
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * 设置实例节点信息
     * @param InstanceNode 实例节点信息
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * 获取分片大小
     * @return RedisShardSize 分片大小
     */
    public Integer getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * 设置分片大小
     * @param RedisShardSize 分片大小
     */
    public void setRedisShardSize(Integer RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * 获取分片数量
     * @return RedisShardNum 分片数量
     */
    public Integer getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * 设置分片数量
     * @param RedisShardNum 分片数量
     */
    public void setRedisShardNum(Integer RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * 获取副本数量
     * @return RedisReplicasNum 副本数量
     */
    public Integer getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * 设置副本数量
     * @param RedisReplicasNum 副本数量
     */
    public void setRedisReplicasNum(Integer RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * 获取计费Id
     * @return PriceId 计费Id
     */
    public Integer getPriceId() {
        return this.PriceId;
    }

    /**
     * 设置计费Id
     * @param PriceId 计费Id
     */
    public void setPriceId(Integer PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * 获取隔离时间
     * @return CloseTime 隔离时间
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * 设置隔离时间
     * @param CloseTime 隔离时间
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * 获取从节点读取权重
     * @return SlaveReadWeight 从节点读取权重
     */
    public Integer getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * 设置从节点读取权重
     * @param SlaveReadWeight 从节点读取权重
     */
    public void setSlaveReadWeight(Integer SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * 获取实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceTags 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * 设置实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTags 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * 获取项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * 设置项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * 获取是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     * @return NoAuth 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * 设置是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoAuth 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
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
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "InstanceTitle", this.InstanceTitle);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "InstanceNode.", this.InstanceNode);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);
        this.setParamSimple(map, prefix + "CloseTime", this.CloseTime);
        this.setParamSimple(map, prefix + "SlaveReadWeight", this.SlaveReadWeight);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

