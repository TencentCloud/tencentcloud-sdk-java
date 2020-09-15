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

public class InstanceSet extends AbstractModel{

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
    private Long Appid;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * vpc网络id 如：75101
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * vpc网络下子网id 如：46315
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    private Long Port;

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
    * 实例类型：1 – Redis2.8内存版（集群架构），2 – Redis2.8内存版（标准架构），3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，5 – Redis2.8内存版（单机），6 – Redis4.0内存版（标准架构），7 – Redis4.0内存版（集群架构），8 – Redis5.0内存版（标准架构），9 – Redis5.0内存版（集群架构）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

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
    * 产品类型：standalone – 标准版，cluster – 集群版
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
    private Long BillingMode;

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
    private Long SubStatus;

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
    private Long RedisShardSize;

    /**
    * 分片数量
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 副本数量
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 计费Id
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

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
    private Long SlaveReadWeight;

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
    * 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * DTS状态（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * 分片带宽上限，单位MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * 免密实例标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * 实例只读标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * Tendis实例的磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 监控版本: 1m-分钟粒度监控，5s-5秒粒度监控
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户的Appid 
     * @return Appid 用户的Appid
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 用户的Appid
     * @param Appid 用户的Appid
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本 
     * @return RegionId 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     * @param RegionId 地域id 1--广州 4--上海 5-- 中国香港 6--多伦多 7--上海金融 8--北京 9-- 新加坡 11--深圳金融 15--美西（硅谷）16--成都 17--德国 18--韩国 19--重庆 21--印度 22--美东（弗吉尼亚）23--泰国 24--俄罗斯 25--日本
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域id 
     * @return ZoneId 区域id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域id
     * @param ZoneId 区域id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get vpc网络id 如：75101 
     * @return VpcId vpc网络id 如：75101
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc网络id 如：75101
     * @param VpcId vpc网络id 如：75101
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc网络下子网id 如：46315 
     * @return SubnetId vpc网络下子网id 如：46315
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc网络下子网id 如：46315
     * @param SubnetId vpc网络下子网id 如：46315
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除 
     * @return Status 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
     * @param Status 实例当前状态，0：待初始化；1：实例在流程中；2：实例运行中；-2：实例已隔离；-3：实例待删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例vip 
     * @return WanIp 实例vip
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 实例vip
     * @param WanIp 实例vip
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 实例端口号 
     * @return Port 实例端口号
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口号
     * @param Port 实例端口号
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例创建时间 
     * @return Createtime 实例创建时间
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 实例创建时间
     * @param Createtime 实例创建时间
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 实例容量大小，单位：MB 
     * @return Size 实例容量大小，单位：MB
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set 实例容量大小，单位：MB
     * @param Size 实例容量大小，单位：MB
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get 该字段已废弃 
     * @return SizeUsed 该字段已废弃
     */
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set 该字段已废弃
     * @param SizeUsed 该字段已废弃
     */
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get 实例类型：1 – Redis2.8内存版（集群架构），2 – Redis2.8内存版（标准架构），3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，5 – Redis2.8内存版（单机），6 – Redis4.0内存版（标准架构），7 – Redis4.0内存版（集群架构），8 – Redis5.0内存版（标准架构），9 – Redis5.0内存版（集群架构） 
     * @return Type 实例类型：1 – Redis2.8内存版（集群架构），2 – Redis2.8内存版（标准架构），3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，5 – Redis2.8内存版（单机），6 – Redis4.0内存版（标准架构），7 – Redis4.0内存版（集群架构），8 – Redis5.0内存版（标准架构），9 – Redis5.0内存版（集群架构）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型：1 – Redis2.8内存版（集群架构），2 – Redis2.8内存版（标准架构），3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，5 – Redis2.8内存版（单机），6 – Redis4.0内存版（标准架构），7 – Redis4.0内存版（集群架构），8 – Redis5.0内存版（标准架构），9 – Redis5.0内存版（集群架构）
     * @param Type 实例类型：1 – Redis2.8内存版（集群架构），2 – Redis2.8内存版（标准架构），3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，5 – Redis2.8内存版（单机），6 – Redis4.0内存版（标准架构），7 – Redis4.0内存版（集群架构），8 – Redis5.0内存版（标准架构），9 – Redis5.0内存版（集群架构）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费 
     * @return AutoRenewFlag 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     * @param AutoRenewFlag 实例是否设置自动续费标识，1：设置自动续费；0：未设置自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 实例到期时间 
     * @return DeadlineTime 实例到期时间
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 实例到期时间
     * @param DeadlineTime 实例到期时间
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 引擎：社区版Redis、腾讯云CKV 
     * @return Engine 引擎：社区版Redis、腾讯云CKV
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 引擎：社区版Redis、腾讯云CKV
     * @param Engine 引擎：社区版Redis、腾讯云CKV
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 产品类型：standalone – 标准版，cluster – 集群版 
     * @return ProductType 产品类型：standalone – 标准版，cluster – 集群版
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型：standalone – 标准版，cluster – 集群版
     * @param ProductType 产品类型：standalone – 标准版，cluster – 集群版
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get vpc网络id 如：vpc-fk33jsf43kgv 
     * @return UniqVpcId vpc网络id 如：vpc-fk33jsf43kgv
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc网络id 如：vpc-fk33jsf43kgv
     * @param UniqVpcId vpc网络id 如：vpc-fk33jsf43kgv
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get vpc网络下子网id 如：subnet-fd3j6l35mm0 
     * @return UniqSubnetId vpc网络下子网id 如：subnet-fd3j6l35mm0
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set vpc网络下子网id 如：subnet-fd3j6l35mm0
     * @param UniqSubnetId vpc网络下子网id 如：subnet-fd3j6l35mm0
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 计费模式：0-按量计费，1-包年包月 
     * @return BillingMode 计费模式：0-按量计费，1-包年包月
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费模式：0-按量计费，1-包年包月
     * @param BillingMode 计费模式：0-按量计费，1-包年包月
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例运行状态描述：如”实例运行中“ 
     * @return InstanceTitle 实例运行状态描述：如”实例运行中“
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set 实例运行状态描述：如”实例运行中“
     * @param InstanceTitle 实例运行状态描述：如”实例运行中“
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get 计划下线时间 
     * @return OfflineTime 计划下线时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 计划下线时间
     * @param OfflineTime 计划下线时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 流程中的实例，返回子状态 
     * @return SubStatus 流程中的实例，返回子状态
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 流程中的实例，返回子状态
     * @param SubStatus 流程中的实例，返回子状态
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 反亲和性标签 
     * @return Tags 反亲和性标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 反亲和性标签
     * @param Tags 反亲和性标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例节点信息 
     * @return InstanceNode 实例节点信息
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set 实例节点信息
     * @param InstanceNode 实例节点信息
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get 分片大小 
     * @return RedisShardSize 分片大小
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set 分片大小
     * @param RedisShardSize 分片大小
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get 分片数量 
     * @return RedisShardNum 分片数量
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 分片数量
     * @param RedisShardNum 分片数量
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 副本数量 
     * @return RedisReplicasNum 副本数量
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 副本数量
     * @param RedisReplicasNum 副本数量
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 计费Id 
     * @return PriceId 计费Id
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set 计费Id
     * @param PriceId 计费Id
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get 隔离时间 
     * @return CloseTime 隔离时间
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set 隔离时间
     * @param CloseTime 隔离时间
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get 从节点读取权重 
     * @return SlaveReadWeight 从节点读取权重
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set 从节点读取权重
     * @param SlaveReadWeight 从节点读取权重
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTags 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTags 实例关联的标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoAuth 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoAuth 是否为免密实例，true-免密实例；false-非免密实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientLimit 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientLimit 客户端连接数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get DTS状态（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DtsStatus DTS状态（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set DTS状态（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DtsStatus DTS状态（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get 分片带宽上限，单位MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetLimit 分片带宽上限，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set 分片带宽上限，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetLimit 分片带宽上限，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get 免密实例标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PasswordFree 免密实例标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set 免密实例标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PasswordFree 免密实例标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get 实例只读标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnly 实例只读标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 实例只读标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnly 实例只读标识（内部参数，用户可忽略）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip6 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip6 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainBandwidthDuration 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainBandwidthDuration 内部参数，用户可忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get Tendis实例的磁盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize Tendis实例的磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Tendis实例的磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize Tendis实例的磁盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 监控版本: 1m-分钟粒度监控，5s-5秒粒度监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorVersion 监控版本: 1m-分钟粒度监控，5s-5秒粒度监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set 监控版本: 1m-分钟粒度监控，5s-5秒粒度监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorVersion 监控版本: 1m-分钟粒度监控，5s-5秒粒度监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "ClientLimit", this.ClientLimit);
        this.setParamSimple(map, prefix + "DtsStatus", this.DtsStatus);
        this.setParamSimple(map, prefix + "NetLimit", this.NetLimit);
        this.setParamSimple(map, prefix + "PasswordFree", this.PasswordFree);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "RemainBandwidthDuration", this.RemainBandwidthDuration);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);

    }
}

