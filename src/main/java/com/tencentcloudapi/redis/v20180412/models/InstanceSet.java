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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSet extends AbstractModel {

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。

    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * vpc网络 ID，例如75101。
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * vpc网络下子网ID，如：46315。
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例 VIP。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 实例端口号。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 实例创建时间。格式如：2020-01-15 10:20:00。
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * 实例内存容量大小。单位：MB，1MB=1024KB。
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * 该字段已废弃。请使用腾讯云可观测平台API 接口 [GetMonitorData](https://cloud.tencent.com/document/product/248/31014) 获取实例已使用的内存容量。
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * 实例类型。
- 2：Redis 2.8 内存版（标准架构）。
- 3：CKV 3.2 内存版（标准架构）。
- 4：CKV 3.2 内存版（集群架构）。
- 5：Redis 2.8 内存版（单机）。
- 6：Redis 4.0 内存版（标准架构）。
- 7：Redis 4.0 内存版（集群架构）。
- 8：Redis 5.0 内存版（标准架构）。
- 9：Redis 5.0 内存版（集群架构）。
- 15：Redis 6.2 内存版（标准架构）。
- 16：Redis 6.2 内存版（集群架构）。
- 17：Redis 7.0 内存版（标准架构）。
- 18：Redis 7.0 内存版（集群架构）。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 包年包月计费实例到期的时间。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 引擎：社区版Redis、腾讯云CKV。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * vpc网络id，例如vpc-fk33jsf43kgv。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * vpc网络下子网id，例如：subnet-fd3j6l35mm0。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * 实例运行状态描述：如”实例运行中“。
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * 已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 流程中的实例返回的子状态。
- 0：磁盘读写状态。
- 1：磁盘超限只读状态。
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * 反亲和性标签。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 实例节点信息。
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * 分片大小。
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * 分片数量。
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 副本数量。
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 计费 ID。
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * 实例隔离开始的时间。
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * 从节点读取权重。
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * 实例关联的标签信息。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * 项目名称。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * 客户端连接数。
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * DTS状态（内部参数，用户可忽略）。
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * 分片带宽上限，单位MB。
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * 免密实例标识（内部参数，用户可忽略）。
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * 该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * 内部参数，用户可忽略。
    */
    @SerializedName("IPv6")
    @Expose
    private String IPv6;

    /**
    * 实例只读标识（内部参数，用户可忽略）。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * 内部参数，用户可忽略。
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * Redis实例请忽略该参数。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见[云数据库 Redis 1分钟粒度下线公告](https://cloud.tencent.com/document/product/239/80653)。</li><li>5s：5秒粒度监控。</li></ul>
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * 客户端最大连接数可设置的最小值。
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * 客户端最大连接数可设置的最大值。
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * 实例的节点详细信息。
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * 实例所在的地域信息，比如ap-guangzhou。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 外网地址。
    */
    @SerializedName("WanAddress")
    @Expose
    private String WanAddress;

    /**
    * 北极星服务地址，内部使用。
    */
    @SerializedName("PolarisServer")
    @Expose
    private String PolarisServer;

    /**
    * CDC Redis集群ID。
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * CDC 集群ID。
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 实例当前Proxy版本。
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * 实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。
    */
    @SerializedName("CurrentRedisVersion")
    @Expose
    private String CurrentRedisVersion;

    /**
    * 实例可升级Proxy版本。
    */
    @SerializedName("UpgradeProxyVersion")
    @Expose
    private String UpgradeProxyVersion;

    /**
    * 实例可升级Cache小版本。
    */
    @SerializedName("UpgradeRedisVersion")
    @Expose
    private String UpgradeRedisVersion;

    /**
    * 备份模式：- SecondLevelBackup   秒级备份- NormalLevelBackup    普通备份
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
 
     * @return Appid 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。

     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。

     * @param Appid 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。

     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul> 
     * @return RegionId 地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul>
     * @param RegionId 地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域 ID。 
     * @return ZoneId 区域 ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域 ID。
     * @param ZoneId 区域 ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get vpc网络 ID，例如75101。 
     * @return VpcId vpc网络 ID，例如75101。
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc网络 ID，例如75101。
     * @param VpcId vpc网络 ID，例如75101。
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc网络下子网ID，如：46315。 
     * @return SubnetId vpc网络下子网ID，如：46315。
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc网络下子网ID，如：46315。
     * @param SubnetId vpc网络下子网ID，如：46315。
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul> 
     * @return Status 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
     * @param Status 实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例 VIP。 
     * @return WanIp 实例 VIP。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 实例 VIP。
     * @param WanIp 实例 VIP。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 实例端口号。 
     * @return Port 实例端口号。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 实例端口号。
     * @param Port 实例端口号。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 实例创建时间。格式如：2020-01-15 10:20:00。 
     * @return Createtime 实例创建时间。格式如：2020-01-15 10:20:00。
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set 实例创建时间。格式如：2020-01-15 10:20:00。
     * @param Createtime 实例创建时间。格式如：2020-01-15 10:20:00。
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get 实例内存容量大小。单位：MB，1MB=1024KB。 
     * @return Size 实例内存容量大小。单位：MB，1MB=1024KB。
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set 实例内存容量大小。单位：MB，1MB=1024KB。
     * @param Size 实例内存容量大小。单位：MB，1MB=1024KB。
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get 该字段已废弃。请使用腾讯云可观测平台API 接口 [GetMonitorData](https://cloud.tencent.com/document/product/248/31014) 获取实例已使用的内存容量。 
     * @return SizeUsed 该字段已废弃。请使用腾讯云可观测平台API 接口 [GetMonitorData](https://cloud.tencent.com/document/product/248/31014) 获取实例已使用的内存容量。
     * @deprecated
     */
    @Deprecated
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set 该字段已废弃。请使用腾讯云可观测平台API 接口 [GetMonitorData](https://cloud.tencent.com/document/product/248/31014) 获取实例已使用的内存容量。
     * @param SizeUsed 该字段已废弃。请使用腾讯云可观测平台API 接口 [GetMonitorData](https://cloud.tencent.com/document/product/248/31014) 获取实例已使用的内存容量。
     * @deprecated
     */
    @Deprecated
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get 实例类型。
- 2：Redis 2.8 内存版（标准架构）。
- 3：CKV 3.2 内存版（标准架构）。
- 4：CKV 3.2 内存版（集群架构）。
- 5：Redis 2.8 内存版（单机）。
- 6：Redis 4.0 内存版（标准架构）。
- 7：Redis 4.0 内存版（集群架构）。
- 8：Redis 5.0 内存版（标准架构）。
- 9：Redis 5.0 内存版（集群架构）。
- 15：Redis 6.2 内存版（标准架构）。
- 16：Redis 6.2 内存版（集群架构）。
- 17：Redis 7.0 内存版（标准架构）。
- 18：Redis 7.0 内存版（集群架构）。 
     * @return Type 实例类型。
- 2：Redis 2.8 内存版（标准架构）。
- 3：CKV 3.2 内存版（标准架构）。
- 4：CKV 3.2 内存版（集群架构）。
- 5：Redis 2.8 内存版（单机）。
- 6：Redis 4.0 内存版（标准架构）。
- 7：Redis 4.0 内存版（集群架构）。
- 8：Redis 5.0 内存版（标准架构）。
- 9：Redis 5.0 内存版（集群架构）。
- 15：Redis 6.2 内存版（标准架构）。
- 16：Redis 6.2 内存版（集群架构）。
- 17：Redis 7.0 内存版（标准架构）。
- 18：Redis 7.0 内存版（集群架构）。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型。
- 2：Redis 2.8 内存版（标准架构）。
- 3：CKV 3.2 内存版（标准架构）。
- 4：CKV 3.2 内存版（集群架构）。
- 5：Redis 2.8 内存版（单机）。
- 6：Redis 4.0 内存版（标准架构）。
- 7：Redis 4.0 内存版（集群架构）。
- 8：Redis 5.0 内存版（标准架构）。
- 9：Redis 5.0 内存版（集群架构）。
- 15：Redis 6.2 内存版（标准架构）。
- 16：Redis 6.2 内存版（集群架构）。
- 17：Redis 7.0 内存版（标准架构）。
- 18：Redis 7.0 内存版（集群架构）。
     * @param Type 实例类型。
- 2：Redis 2.8 内存版（标准架构）。
- 3：CKV 3.2 内存版（标准架构）。
- 4：CKV 3.2 内存版（集群架构）。
- 5：Redis 2.8 内存版（单机）。
- 6：Redis 4.0 内存版（标准架构）。
- 7：Redis 4.0 内存版（集群架构）。
- 8：Redis 5.0 内存版（标准架构）。
- 9：Redis 5.0 内存版（集群架构）。
- 15：Redis 6.2 内存版（标准架构）。
- 16：Redis 6.2 内存版（集群架构）。
- 17：Redis 7.0 内存版（标准架构）。
- 18：Redis 7.0 内存版（集群架构）。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul> 
     * @return AutoRenewFlag 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
     * @param AutoRenewFlag 实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 包年包月计费实例到期的时间。 
     * @return DeadlineTime 包年包月计费实例到期的时间。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 包年包月计费实例到期的时间。
     * @param DeadlineTime 包年包月计费实例到期的时间。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 引擎：社区版Redis、腾讯云CKV。 
     * @return Engine 引擎：社区版Redis、腾讯云CKV。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 引擎：社区版Redis、腾讯云CKV。
     * @param Engine 引擎：社区版Redis、腾讯云CKV。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul> 
     * @return ProductType 产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul>
     * @param ProductType 产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get vpc网络id，例如vpc-fk33jsf43kgv。 
     * @return UniqVpcId vpc网络id，例如vpc-fk33jsf43kgv。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc网络id，例如vpc-fk33jsf43kgv。
     * @param UniqVpcId vpc网络id，例如vpc-fk33jsf43kgv。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get vpc网络下子网id，例如：subnet-fd3j6l35mm0。 
     * @return UniqSubnetId vpc网络下子网id，例如：subnet-fd3j6l35mm0。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set vpc网络下子网id，例如：subnet-fd3j6l35mm0。
     * @param UniqSubnetId vpc网络下子网id，例如：subnet-fd3j6l35mm0。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul> 
     * @return BillingMode 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     * @param BillingMode 计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例运行状态描述：如”实例运行中“。 
     * @return InstanceTitle 实例运行状态描述：如”实例运行中“。
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set 实例运行状态描述：如”实例运行中“。
     * @param InstanceTitle 实例运行状态描述：如”实例运行中“。
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get 已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。 
     * @return OfflineTime 已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。
     * @param OfflineTime 已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 流程中的实例返回的子状态。
- 0：磁盘读写状态。
- 1：磁盘超限只读状态。 
     * @return SubStatus 流程中的实例返回的子状态。
- 0：磁盘读写状态。
- 1：磁盘超限只读状态。
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 流程中的实例返回的子状态。
- 0：磁盘读写状态。
- 1：磁盘超限只读状态。
     * @param SubStatus 流程中的实例返回的子状态。
- 0：磁盘读写状态。
- 1：磁盘超限只读状态。
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 反亲和性标签。 
     * @return Tags 反亲和性标签。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 反亲和性标签。
     * @param Tags 反亲和性标签。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例节点信息。 
     * @return InstanceNode 实例节点信息。
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set 实例节点信息。
     * @param InstanceNode 实例节点信息。
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get 分片大小。 
     * @return RedisShardSize 分片大小。
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set 分片大小。
     * @param RedisShardSize 分片大小。
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get 分片数量。 
     * @return RedisShardNum 分片数量。
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 分片数量。
     * @param RedisShardNum 分片数量。
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 副本数量。 
     * @return RedisReplicasNum 副本数量。
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 副本数量。
     * @param RedisReplicasNum 副本数量。
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 计费 ID。 
     * @return PriceId 计费 ID。
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set 计费 ID。
     * @param PriceId 计费 ID。
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get 实例隔离开始的时间。 
     * @return CloseTime 实例隔离开始的时间。
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set 实例隔离开始的时间。
     * @param CloseTime 实例隔离开始的时间。
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get 从节点读取权重。 
     * @return SlaveReadWeight 从节点读取权重。
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set 从节点读取权重。
     * @param SlaveReadWeight 从节点读取权重。
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get 实例关联的标签信息。 
     * @return InstanceTags 实例关联的标签信息。
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 实例关联的标签信息。
     * @param InstanceTags 实例关联的标签信息。
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get 项目名称。 
     * @return ProjectName 项目名称。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称。
     * @param ProjectName 项目名称。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul> 
     * @return NoAuth 是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
     * @param NoAuth 是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get 客户端连接数。 
     * @return ClientLimit 客户端连接数。
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set 客户端连接数。
     * @param ClientLimit 客户端连接数。
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get DTS状态（内部参数，用户可忽略）。 
     * @return DtsStatus DTS状态（内部参数，用户可忽略）。
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set DTS状态（内部参数，用户可忽略）。
     * @param DtsStatus DTS状态（内部参数，用户可忽略）。
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get 分片带宽上限，单位MB。 
     * @return NetLimit 分片带宽上限，单位MB。
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set 分片带宽上限，单位MB。
     * @param NetLimit 分片带宽上限，单位MB。
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get 免密实例标识（内部参数，用户可忽略）。 
     * @return PasswordFree 免密实例标识（内部参数，用户可忽略）。
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set 免密实例标识（内部参数，用户可忽略）。
     * @param PasswordFree 免密实例标识（内部参数，用户可忽略）。
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get 该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。 
     * @return Vip6 该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set 该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。
     * @param Vip6 该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get 内部参数，用户可忽略。 
     * @return IPv6 内部参数，用户可忽略。
     */
    public String getIPv6() {
        return this.IPv6;
    }

    /**
     * Set 内部参数，用户可忽略。
     * @param IPv6 内部参数，用户可忽略。
     */
    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get 实例只读标识（内部参数，用户可忽略）。 
     * @return ReadOnly 实例只读标识（内部参数，用户可忽略）。
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 实例只读标识（内部参数，用户可忽略）。
     * @param ReadOnly 实例只读标识（内部参数，用户可忽略）。
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 内部参数，用户可忽略。 
     * @return RemainBandwidthDuration 内部参数，用户可忽略。
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set 内部参数，用户可忽略。
     * @param RemainBandwidthDuration 内部参数，用户可忽略。
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get Redis实例请忽略该参数。 
     * @return DiskSize Redis实例请忽略该参数。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Redis实例请忽略该参数。
     * @param DiskSize Redis实例请忽略该参数。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见[云数据库 Redis 1分钟粒度下线公告](https://cloud.tencent.com/document/product/239/80653)。</li><li>5s：5秒粒度监控。</li></ul> 
     * @return MonitorVersion 监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见[云数据库 Redis 1分钟粒度下线公告](https://cloud.tencent.com/document/product/239/80653)。</li><li>5s：5秒粒度监控。</li></ul>
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set 监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见[云数据库 Redis 1分钟粒度下线公告](https://cloud.tencent.com/document/product/239/80653)。</li><li>5s：5秒粒度监控。</li></ul>
     * @param MonitorVersion 监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见[云数据库 Redis 1分钟粒度下线公告](https://cloud.tencent.com/document/product/239/80653)。</li><li>5s：5秒粒度监控。</li></ul>
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get 客户端最大连接数可设置的最小值。 
     * @return ClientLimitMin 客户端最大连接数可设置的最小值。
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set 客户端最大连接数可设置的最小值。
     * @param ClientLimitMin 客户端最大连接数可设置的最小值。
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get 客户端最大连接数可设置的最大值。 
     * @return ClientLimitMax 客户端最大连接数可设置的最大值。
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set 客户端最大连接数可设置的最大值。
     * @param ClientLimitMax 客户端最大连接数可设置的最大值。
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get 实例的节点详细信息。 
     * @return NodeSet 实例的节点详细信息。
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 实例的节点详细信息。
     * @param NodeSet 实例的节点详细信息。
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get 实例所在的地域信息，比如ap-guangzhou。 
     * @return Region 实例所在的地域信息，比如ap-guangzhou。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在的地域信息，比如ap-guangzhou。
     * @param Region 实例所在的地域信息，比如ap-guangzhou。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 外网地址。 
     * @return WanAddress 外网地址。
     */
    public String getWanAddress() {
        return this.WanAddress;
    }

    /**
     * Set 外网地址。
     * @param WanAddress 外网地址。
     */
    public void setWanAddress(String WanAddress) {
        this.WanAddress = WanAddress;
    }

    /**
     * Get 北极星服务地址，内部使用。 
     * @return PolarisServer 北极星服务地址，内部使用。
     */
    public String getPolarisServer() {
        return this.PolarisServer;
    }

    /**
     * Set 北极星服务地址，内部使用。
     * @param PolarisServer 北极星服务地址，内部使用。
     */
    public void setPolarisServer(String PolarisServer) {
        this.PolarisServer = PolarisServer;
    }

    /**
     * Get CDC Redis集群ID。 
     * @return RedisClusterId CDC Redis集群ID。
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set CDC Redis集群ID。
     * @param RedisClusterId CDC Redis集群ID。
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get CDC 集群ID。 
     * @return DedicatedClusterId CDC 集群ID。
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC 集群ID。
     * @param DedicatedClusterId CDC 集群ID。
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul> 
     * @return ProductVersion 产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set 产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul>
     * @param ProductVersion 产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 实例当前Proxy版本。 
     * @return CurrentProxyVersion 实例当前Proxy版本。
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set 实例当前Proxy版本。
     * @param CurrentProxyVersion 实例当前Proxy版本。
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get 实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。 
     * @return CurrentRedisVersion 实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。
     */
    public String getCurrentRedisVersion() {
        return this.CurrentRedisVersion;
    }

    /**
     * Set 实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。
     * @param CurrentRedisVersion 实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。
     */
    public void setCurrentRedisVersion(String CurrentRedisVersion) {
        this.CurrentRedisVersion = CurrentRedisVersion;
    }

    /**
     * Get 实例可升级Proxy版本。 
     * @return UpgradeProxyVersion 实例可升级Proxy版本。
     */
    public String getUpgradeProxyVersion() {
        return this.UpgradeProxyVersion;
    }

    /**
     * Set 实例可升级Proxy版本。
     * @param UpgradeProxyVersion 实例可升级Proxy版本。
     */
    public void setUpgradeProxyVersion(String UpgradeProxyVersion) {
        this.UpgradeProxyVersion = UpgradeProxyVersion;
    }

    /**
     * Get 实例可升级Cache小版本。 
     * @return UpgradeRedisVersion 实例可升级Cache小版本。
     */
    public String getUpgradeRedisVersion() {
        return this.UpgradeRedisVersion;
    }

    /**
     * Set 实例可升级Cache小版本。
     * @param UpgradeRedisVersion 实例可升级Cache小版本。
     */
    public void setUpgradeRedisVersion(String UpgradeRedisVersion) {
        this.UpgradeRedisVersion = UpgradeRedisVersion;
    }

    /**
     * Get 备份模式：- SecondLevelBackup   秒级备份- NormalLevelBackup    普通备份 
     * @return BackupMode 备份模式：- SecondLevelBackup   秒级备份- NormalLevelBackup    普通备份
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set 备份模式：- SecondLevelBackup   秒级备份- NormalLevelBackup    普通备份
     * @param BackupMode 备份模式：- SecondLevelBackup   秒级备份- NormalLevelBackup    普通备份
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    public InstanceSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSet(InstanceSet source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Createtime != null) {
            this.Createtime = new String(source.Createtime);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.SizeUsed != null) {
            this.SizeUsed = new Float(source.SizeUsed);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.InstanceTitle != null) {
            this.InstanceTitle = new String(source.InstanceTitle);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.InstanceNode != null) {
            this.InstanceNode = new InstanceNode[source.InstanceNode.length];
            for (int i = 0; i < source.InstanceNode.length; i++) {
                this.InstanceNode[i] = new InstanceNode(source.InstanceNode[i]);
            }
        }
        if (source.RedisShardSize != null) {
            this.RedisShardSize = new Long(source.RedisShardSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.PriceId != null) {
            this.PriceId = new Long(source.PriceId);
        }
        if (source.CloseTime != null) {
            this.CloseTime = new String(source.CloseTime);
        }
        if (source.SlaveReadWeight != null) {
            this.SlaveReadWeight = new Long(source.SlaveReadWeight);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.ClientLimit != null) {
            this.ClientLimit = new Long(source.ClientLimit);
        }
        if (source.DtsStatus != null) {
            this.DtsStatus = new Long(source.DtsStatus);
        }
        if (source.NetLimit != null) {
            this.NetLimit = new Long(source.NetLimit);
        }
        if (source.PasswordFree != null) {
            this.PasswordFree = new Long(source.PasswordFree);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.IPv6 != null) {
            this.IPv6 = new String(source.IPv6);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.RemainBandwidthDuration != null) {
            this.RemainBandwidthDuration = new String(source.RemainBandwidthDuration);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.ClientLimitMin != null) {
            this.ClientLimitMin = new Long(source.ClientLimitMin);
        }
        if (source.ClientLimitMax != null) {
            this.ClientLimitMax = new Long(source.ClientLimitMax);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.WanAddress != null) {
            this.WanAddress = new String(source.WanAddress);
        }
        if (source.PolarisServer != null) {
            this.PolarisServer = new String(source.PolarisServer);
        }
        if (source.RedisClusterId != null) {
            this.RedisClusterId = new String(source.RedisClusterId);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.CurrentRedisVersion != null) {
            this.CurrentRedisVersion = new String(source.CurrentRedisVersion);
        }
        if (source.UpgradeProxyVersion != null) {
            this.UpgradeProxyVersion = new String(source.UpgradeProxyVersion);
        }
        if (source.UpgradeRedisVersion != null) {
            this.UpgradeRedisVersion = new String(source.UpgradeRedisVersion);
        }
        if (source.BackupMode != null) {
            this.BackupMode = new String(source.BackupMode);
        }
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
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "IPv6", this.IPv6);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "RemainBandwidthDuration", this.RemainBandwidthDuration);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamSimple(map, prefix + "ClientLimitMin", this.ClientLimitMin);
        this.setParamSimple(map, prefix + "ClientLimitMax", this.ClientLimitMax);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "WanAddress", this.WanAddress);
        this.setParamSimple(map, prefix + "PolarisServer", this.PolarisServer);
        this.setParamSimple(map, prefix + "RedisClusterId", this.RedisClusterId);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "CurrentRedisVersion", this.CurrentRedisVersion);
        this.setParamSimple(map, prefix + "UpgradeProxyVersion", this.UpgradeProxyVersion);
        this.setParamSimple(map, prefix + "UpgradeRedisVersion", this.UpgradeRedisVersion);
        this.setParamSimple(map, prefix + "BackupMode", this.BackupMode);

    }
}

