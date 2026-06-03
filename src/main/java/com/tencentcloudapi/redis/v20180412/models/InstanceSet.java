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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSet extends AbstractModel {

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户AppId。AppId是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 AppId。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>项目 ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul></p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>区域 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>vpc网络 ID，例如75101。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>vpc网络下子网ID，如：46315。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例 VIP。</p>
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>实例端口号。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>实例创建时间。格式如：2020-01-15 10:20:00。</p>
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * <p>实例内存容量大小。单位：MB，1MB=1024KB。</p>
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * <p>该字段已废弃。请使用腾讯云可观测平台API 接口 <a href="https://cloud.tencent.com/document/product/248/31014">GetMonitorData</a> 获取实例已使用的内存容量。</p>
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * <p>实例类型。</p><p>枚举值：</p><ul><li>2： Redis 2.8 内存版（标准架构）。</li><li>3： CKV 3.2 内存版（标准架构）。</li><li>4： CKV 3.2 内存版（集群架构）。</li><li>5： Redis 2.8 内存版（单机）。</li><li>6： Redis 4.0 内存版（标准架构）。</li><li>7： Redis 4.0 内存版（集群架构）。</li><li>8： Redis 5.0 内存版（标准架构）。</li><li>9： Redis 5.0 内存版（集群架构）。</li><li>15： Redis 6.2 内存版（标准架构）。</li><li>16： Redis 6.2 内存版（集群架构）。</li><li>17： Redis 7.0 内存版（标准架构）。</li><li>18： Redis 7.0 内存版（集群架构）。</li><li>19： Valkey 8.0 内存版（标准架构）。</li><li>20： Valkey 8.0 内存版（集群架构）。</li><li>200： Memcached 1.6 内存版（集群架构）。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>包年包月计费实例到期的时间。</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>引擎：社区版Redis、腾讯云CKV。</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul></p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>vpc网络id，例如vpc-fk33jsf43kgv。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>vpc网络下子网id，例如：subnet-fd3j6l35mm0。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>实例运行状态描述：如”实例运行中“。</p>
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * <p>已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>流程中的实例返回的子状态。</p><ul><li>0：磁盘读写状态。</li><li>1：磁盘超限只读状态。</li></ul>
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * <p>反亲和性标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>实例节点信息。</p>
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * <p>分片大小。</p>
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * <p>分片数量。</p>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>副本数量。</p>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>计费 ID。</p>
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * <p>实例隔离开始的时间。</p>
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * <p>从节点读取权重。</p><ul><li>0：表示关闭副本只读。</li><li>100：表示开启副本只读。</li></ul>
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * <p>实例关联的标签信息。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>项目名称。</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>客户端连接数。</p>
    */
    @SerializedName("ClientLimit")
    @Expose
    private Long ClientLimit;

    /**
    * <p>DTS状态（内部参数，用户可忽略）。</p>
    */
    @SerializedName("DtsStatus")
    @Expose
    private Long DtsStatus;

    /**
    * <p>分片带宽上限，单位MB。</p>
    */
    @SerializedName("NetLimit")
    @Expose
    private Long NetLimit;

    /**
    * <p>免密实例标识（内部参数，用户可忽略）。</p>
    */
    @SerializedName("PasswordFree")
    @Expose
    private Long PasswordFree;

    /**
    * <p>该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。</p>
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * <p>内部参数，用户可忽略。</p>
    */
    @SerializedName("IPv6")
    @Expose
    private String IPv6;

    /**
    * <p>实例只读标识（内部参数，用户可忽略）。</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * <p>内部参数，用户可忽略。</p>
    */
    @SerializedName("RemainBandwidthDuration")
    @Expose
    private String RemainBandwidthDuration;

    /**
    * <p>Redis实例请忽略该参数。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/80653">云数据库 Redis 1分钟粒度下线公告</a>。</li><li>5s：5秒粒度监控。</li></ul></p>
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * <p>客户端最大连接数可设置的最小值。</p>
    */
    @SerializedName("ClientLimitMin")
    @Expose
    private Long ClientLimitMin;

    /**
    * <p>客户端最大连接数可设置的最大值。</p>
    */
    @SerializedName("ClientLimitMax")
    @Expose
    private Long ClientLimitMax;

    /**
    * <p>实例的节点详细信息。<br>只有多可用区实例会返回。</p>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * <p>实例所在的地域信息，比如ap-guangzhou。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>外网地址。</p>
    */
    @SerializedName("WanAddress")
    @Expose
    private String WanAddress;

    /**
    * <p>北极星服务地址，内部使用。</p>
    */
    @SerializedName("PolarisServer")
    @Expose
    private String PolarisServer;

    /**
    * <p>CDC Redis集群ID。</p>
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * <p>CDC 集群ID。</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul></p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>实例当前Proxy版本。</p>
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * <p>实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。</p>
    */
    @SerializedName("CurrentRedisVersion")
    @Expose
    private String CurrentRedisVersion;

    /**
    * <p>实例可升级Proxy版本。</p>
    */
    @SerializedName("UpgradeProxyVersion")
    @Expose
    private String UpgradeProxyVersion;

    /**
    * <p>实例可升级Cache小版本。</p>
    */
    @SerializedName("UpgradeRedisVersion")
    @Expose
    private String UpgradeRedisVersion;

    /**
    * <p>备份模式。</p><ul><li>SecondLevelBackup：秒级备份。</li><li>NormalLevelBackup：普通备份。</li></ul>
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
    * <p>实例销毁保护开关。</p><ul><li>0：关闭。</li><li>1：开启。</li></ul>
    */
    @SerializedName("DeleteProtectionSwitch")
    @Expose
    private Long DeleteProtectionSwitch;

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户AppId。AppId是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 AppId。</p> 
     * @return Appid <p>用户AppId。AppId是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 AppId。</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>用户AppId。AppId是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 AppId。</p>
     * @param Appid <p>用户AppId。AppId是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 AppId。</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>项目 ID。</p> 
     * @return ProjectId <p>项目 ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。</p>
     * @param ProjectId <p>项目 ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul></p> 
     * @return RegionId <p>地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul></p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul></p>
     * @param RegionId <p>地域 ID。<ul><li>1：广州。</li><li>4：上海。</li><li>5：中国香港。</li><li>7：上海金融。</li> <li>8：北京。</li> <li>9：新加坡。</li> <li>11：深圳金融。</li> <li>15：美西（硅谷）。</li><li>16：成都。</li><li>17：法兰克福。</li><li>18：首尔。</li><li>19：重庆。</li><li>22：美东（弗吉尼亚）。</li><li>23：曼谷。</li><li>25：东京。</li></ul></p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>区域 ID。</p> 
     * @return ZoneId <p>区域 ID。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>区域 ID。</p>
     * @param ZoneId <p>区域 ID。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>vpc网络 ID，例如75101。</p> 
     * @return VpcId <p>vpc网络 ID，例如75101。</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc网络 ID，例如75101。</p>
     * @param VpcId <p>vpc网络 ID，例如75101。</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>vpc网络下子网ID，如：46315。</p> 
     * @return SubnetId <p>vpc网络下子网ID，如：46315。</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>vpc网络下子网ID，如：46315。</p>
     * @param SubnetId <p>vpc网络下子网ID，如：46315。</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p> 
     * @return Status <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
     * @param Status <p>实例当前状态。<ul><li>0：待初始化。</li><li>1：实例在流程中。</li><li>2：实例运行中。</li><li>-2：实例已隔离。</li><li>-3：实例待删除。</li></ul></p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例 VIP。</p> 
     * @return WanIp <p>实例 VIP。</p>
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>实例 VIP。</p>
     * @param WanIp <p>实例 VIP。</p>
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>实例端口号。</p> 
     * @return Port <p>实例端口号。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>实例端口号。</p>
     * @param Port <p>实例端口号。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>实例创建时间。格式如：2020-01-15 10:20:00。</p> 
     * @return Createtime <p>实例创建时间。格式如：2020-01-15 10:20:00。</p>
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set <p>实例创建时间。格式如：2020-01-15 10:20:00。</p>
     * @param Createtime <p>实例创建时间。格式如：2020-01-15 10:20:00。</p>
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get <p>实例内存容量大小。单位：MB，1MB=1024KB。</p> 
     * @return Size <p>实例内存容量大小。单位：MB，1MB=1024KB。</p>
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set <p>实例内存容量大小。单位：MB，1MB=1024KB。</p>
     * @param Size <p>实例内存容量大小。单位：MB，1MB=1024KB。</p>
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get <p>该字段已废弃。请使用腾讯云可观测平台API 接口 <a href="https://cloud.tencent.com/document/product/248/31014">GetMonitorData</a> 获取实例已使用的内存容量。</p> 
     * @return SizeUsed <p>该字段已废弃。请使用腾讯云可观测平台API 接口 <a href="https://cloud.tencent.com/document/product/248/31014">GetMonitorData</a> 获取实例已使用的内存容量。</p>
     * @deprecated
     */
    @Deprecated
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set <p>该字段已废弃。请使用腾讯云可观测平台API 接口 <a href="https://cloud.tencent.com/document/product/248/31014">GetMonitorData</a> 获取实例已使用的内存容量。</p>
     * @param SizeUsed <p>该字段已废弃。请使用腾讯云可观测平台API 接口 <a href="https://cloud.tencent.com/document/product/248/31014">GetMonitorData</a> 获取实例已使用的内存容量。</p>
     * @deprecated
     */
    @Deprecated
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get <p>实例类型。</p><p>枚举值：</p><ul><li>2： Redis 2.8 内存版（标准架构）。</li><li>3： CKV 3.2 内存版（标准架构）。</li><li>4： CKV 3.2 内存版（集群架构）。</li><li>5： Redis 2.8 内存版（单机）。</li><li>6： Redis 4.0 内存版（标准架构）。</li><li>7： Redis 4.0 内存版（集群架构）。</li><li>8： Redis 5.0 内存版（标准架构）。</li><li>9： Redis 5.0 内存版（集群架构）。</li><li>15： Redis 6.2 内存版（标准架构）。</li><li>16： Redis 6.2 内存版（集群架构）。</li><li>17： Redis 7.0 内存版（标准架构）。</li><li>18： Redis 7.0 内存版（集群架构）。</li><li>19： Valkey 8.0 内存版（标准架构）。</li><li>20： Valkey 8.0 内存版（集群架构）。</li><li>200： Memcached 1.6 内存版（集群架构）。</li></ul> 
     * @return Type <p>实例类型。</p><p>枚举值：</p><ul><li>2： Redis 2.8 内存版（标准架构）。</li><li>3： CKV 3.2 内存版（标准架构）。</li><li>4： CKV 3.2 内存版（集群架构）。</li><li>5： Redis 2.8 内存版（单机）。</li><li>6： Redis 4.0 内存版（标准架构）。</li><li>7： Redis 4.0 内存版（集群架构）。</li><li>8： Redis 5.0 内存版（标准架构）。</li><li>9： Redis 5.0 内存版（集群架构）。</li><li>15： Redis 6.2 内存版（标准架构）。</li><li>16： Redis 6.2 内存版（集群架构）。</li><li>17： Redis 7.0 内存版（标准架构）。</li><li>18： Redis 7.0 内存版（集群架构）。</li><li>19： Valkey 8.0 内存版（标准架构）。</li><li>20： Valkey 8.0 内存版（集群架构）。</li><li>200： Memcached 1.6 内存版（集群架构）。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型。</p><p>枚举值：</p><ul><li>2： Redis 2.8 内存版（标准架构）。</li><li>3： CKV 3.2 内存版（标准架构）。</li><li>4： CKV 3.2 内存版（集群架构）。</li><li>5： Redis 2.8 内存版（单机）。</li><li>6： Redis 4.0 内存版（标准架构）。</li><li>7： Redis 4.0 内存版（集群架构）。</li><li>8： Redis 5.0 内存版（标准架构）。</li><li>9： Redis 5.0 内存版（集群架构）。</li><li>15： Redis 6.2 内存版（标准架构）。</li><li>16： Redis 6.2 内存版（集群架构）。</li><li>17： Redis 7.0 内存版（标准架构）。</li><li>18： Redis 7.0 内存版（集群架构）。</li><li>19： Valkey 8.0 内存版（标准架构）。</li><li>20： Valkey 8.0 内存版（集群架构）。</li><li>200： Memcached 1.6 内存版（集群架构）。</li></ul>
     * @param Type <p>实例类型。</p><p>枚举值：</p><ul><li>2： Redis 2.8 内存版（标准架构）。</li><li>3： CKV 3.2 内存版（标准架构）。</li><li>4： CKV 3.2 内存版（集群架构）。</li><li>5： Redis 2.8 内存版（单机）。</li><li>6： Redis 4.0 内存版（标准架构）。</li><li>7： Redis 4.0 内存版（集群架构）。</li><li>8： Redis 5.0 内存版（标准架构）。</li><li>9： Redis 5.0 内存版（集群架构）。</li><li>15： Redis 6.2 内存版（标准架构）。</li><li>16： Redis 6.2 内存版（集群架构）。</li><li>17： Redis 7.0 内存版（标准架构）。</li><li>18： Redis 7.0 内存版（集群架构）。</li><li>19： Valkey 8.0 内存版（标准架构）。</li><li>20： Valkey 8.0 内存版（集群架构）。</li><li>200： Memcached 1.6 内存版（集群架构）。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p> 
     * @return AutoRenewFlag <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
     * @param AutoRenewFlag <p>实例是否设置自动续费标识。<ul><li>1：设置自动续费。</li><li>0：未设置自动续费。</li></ul></p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>包年包月计费实例到期的时间。</p> 
     * @return DeadlineTime <p>包年包月计费实例到期的时间。</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>包年包月计费实例到期的时间。</p>
     * @param DeadlineTime <p>包年包月计费实例到期的时间。</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>引擎：社区版Redis、腾讯云CKV。</p> 
     * @return Engine <p>引擎：社区版Redis、腾讯云CKV。</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>引擎：社区版Redis、腾讯云CKV。</p>
     * @param Engine <p>引擎：社区版Redis、腾讯云CKV。</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul></p> 
     * @return ProductType <p>产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul></p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul></p>
     * @param ProductType <p>产品类型。<ul><li>standalone：标准版。</li><li>cluster ：集群版。</li></ul></p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>vpc网络id，例如vpc-fk33jsf43kgv。</p> 
     * @return UniqVpcId <p>vpc网络id，例如vpc-fk33jsf43kgv。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>vpc网络id，例如vpc-fk33jsf43kgv。</p>
     * @param UniqVpcId <p>vpc网络id，例如vpc-fk33jsf43kgv。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>vpc网络下子网id，例如：subnet-fd3j6l35mm0。</p> 
     * @return UniqSubnetId <p>vpc网络下子网id，例如：subnet-fd3j6l35mm0。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>vpc网络下子网id，例如：subnet-fd3j6l35mm0。</p>
     * @param UniqSubnetId <p>vpc网络下子网id，例如：subnet-fd3j6l35mm0。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p> 
     * @return BillingMode <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     * @param BillingMode <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例运行状态描述：如”实例运行中“。</p> 
     * @return InstanceTitle <p>实例运行状态描述：如”实例运行中“。</p>
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set <p>实例运行状态描述：如”实例运行中“。</p>
     * @param InstanceTitle <p>实例运行状态描述：如”实例运行中“。</p>
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get <p>已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。</p> 
     * @return OfflineTime <p>已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。</p>
     * @param OfflineTime <p>已隔离实例默认下线时间。按量计费实例隔离后默认两小时后下线，包年包月默认7天后下线。格式如：2020-02-15 10:20:00。</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>流程中的实例返回的子状态。</p><ul><li>0：磁盘读写状态。</li><li>1：磁盘超限只读状态。</li></ul> 
     * @return SubStatus <p>流程中的实例返回的子状态。</p><ul><li>0：磁盘读写状态。</li><li>1：磁盘超限只读状态。</li></ul>
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>流程中的实例返回的子状态。</p><ul><li>0：磁盘读写状态。</li><li>1：磁盘超限只读状态。</li></ul>
     * @param SubStatus <p>流程中的实例返回的子状态。</p><ul><li>0：磁盘读写状态。</li><li>1：磁盘超限只读状态。</li></ul>
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>反亲和性标签。</p> 
     * @return Tags <p>反亲和性标签。</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>反亲和性标签。</p>
     * @param Tags <p>反亲和性标签。</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>实例节点信息。</p> 
     * @return InstanceNode <p>实例节点信息。</p>
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set <p>实例节点信息。</p>
     * @param InstanceNode <p>实例节点信息。</p>
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get <p>分片大小。</p> 
     * @return RedisShardSize <p>分片大小。</p>
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set <p>分片大小。</p>
     * @param RedisShardSize <p>分片大小。</p>
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get <p>分片数量。</p> 
     * @return RedisShardNum <p>分片数量。</p>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>分片数量。</p>
     * @param RedisShardNum <p>分片数量。</p>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>副本数量。</p> 
     * @return RedisReplicasNum <p>副本数量。</p>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>副本数量。</p>
     * @param RedisReplicasNum <p>副本数量。</p>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>计费 ID。</p> 
     * @return PriceId <p>计费 ID。</p>
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set <p>计费 ID。</p>
     * @param PriceId <p>计费 ID。</p>
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get <p>实例隔离开始的时间。</p> 
     * @return CloseTime <p>实例隔离开始的时间。</p>
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set <p>实例隔离开始的时间。</p>
     * @param CloseTime <p>实例隔离开始的时间。</p>
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get <p>从节点读取权重。</p><ul><li>0：表示关闭副本只读。</li><li>100：表示开启副本只读。</li></ul> 
     * @return SlaveReadWeight <p>从节点读取权重。</p><ul><li>0：表示关闭副本只读。</li><li>100：表示开启副本只读。</li></ul>
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set <p>从节点读取权重。</p><ul><li>0：表示关闭副本只读。</li><li>100：表示开启副本只读。</li></ul>
     * @param SlaveReadWeight <p>从节点读取权重。</p><ul><li>0：表示关闭副本只读。</li><li>100：表示开启副本只读。</li></ul>
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get <p>实例关联的标签信息。</p> 
     * @return InstanceTags <p>实例关联的标签信息。</p>
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>实例关联的标签信息。</p>
     * @param InstanceTags <p>实例关联的标签信息。</p>
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>项目名称。</p> 
     * @return ProjectName <p>项目名称。</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称。</p>
     * @param ProjectName <p>项目名称。</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p> 
     * @return NoAuth <p>是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
     * @param NoAuth <p>是否为免密实例。<ul><li>true：免密实例。</li><li>false：非免密实例。</li></ul></p>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>客户端连接数。</p> 
     * @return ClientLimit <p>客户端连接数。</p>
     */
    public Long getClientLimit() {
        return this.ClientLimit;
    }

    /**
     * Set <p>客户端连接数。</p>
     * @param ClientLimit <p>客户端连接数。</p>
     */
    public void setClientLimit(Long ClientLimit) {
        this.ClientLimit = ClientLimit;
    }

    /**
     * Get <p>DTS状态（内部参数，用户可忽略）。</p> 
     * @return DtsStatus <p>DTS状态（内部参数，用户可忽略）。</p>
     */
    public Long getDtsStatus() {
        return this.DtsStatus;
    }

    /**
     * Set <p>DTS状态（内部参数，用户可忽略）。</p>
     * @param DtsStatus <p>DTS状态（内部参数，用户可忽略）。</p>
     */
    public void setDtsStatus(Long DtsStatus) {
        this.DtsStatus = DtsStatus;
    }

    /**
     * Get <p>分片带宽上限，单位MB。</p> 
     * @return NetLimit <p>分片带宽上限，单位MB。</p>
     */
    public Long getNetLimit() {
        return this.NetLimit;
    }

    /**
     * Set <p>分片带宽上限，单位MB。</p>
     * @param NetLimit <p>分片带宽上限，单位MB。</p>
     */
    public void setNetLimit(Long NetLimit) {
        this.NetLimit = NetLimit;
    }

    /**
     * Get <p>免密实例标识（内部参数，用户可忽略）。</p> 
     * @return PasswordFree <p>免密实例标识（内部参数，用户可忽略）。</p>
     */
    public Long getPasswordFree() {
        return this.PasswordFree;
    }

    /**
     * Set <p>免密实例标识（内部参数，用户可忽略）。</p>
     * @param PasswordFree <p>免密实例标识（内部参数，用户可忽略）。</p>
     */
    public void setPasswordFree(Long PasswordFree) {
        this.PasswordFree = PasswordFree;
    }

    /**
     * Get <p>该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。</p> 
     * @return Vip6 <p>该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。</p>
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set <p>该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。</p>
     * @param Vip6 <p>该参数存在命名不规范问题，建议用参数IPv6取代。内部参数，用户可忽略。</p>
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get <p>内部参数，用户可忽略。</p> 
     * @return IPv6 <p>内部参数，用户可忽略。</p>
     */
    public String getIPv6() {
        return this.IPv6;
    }

    /**
     * Set <p>内部参数，用户可忽略。</p>
     * @param IPv6 <p>内部参数，用户可忽略。</p>
     */
    public void setIPv6(String IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get <p>实例只读标识（内部参数，用户可忽略）。</p> 
     * @return ReadOnly <p>实例只读标识（内部参数，用户可忽略）。</p>
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>实例只读标识（内部参数，用户可忽略）。</p>
     * @param ReadOnly <p>实例只读标识（内部参数，用户可忽略）。</p>
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>内部参数，用户可忽略。</p> 
     * @return RemainBandwidthDuration <p>内部参数，用户可忽略。</p>
     */
    public String getRemainBandwidthDuration() {
        return this.RemainBandwidthDuration;
    }

    /**
     * Set <p>内部参数，用户可忽略。</p>
     * @param RemainBandwidthDuration <p>内部参数，用户可忽略。</p>
     */
    public void setRemainBandwidthDuration(String RemainBandwidthDuration) {
        this.RemainBandwidthDuration = RemainBandwidthDuration;
    }

    /**
     * Get <p>Redis实例请忽略该参数。</p> 
     * @return DiskSize <p>Redis实例请忽略该参数。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>Redis实例请忽略该参数。</p>
     * @param DiskSize <p>Redis实例请忽略该参数。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/80653">云数据库 Redis 1分钟粒度下线公告</a>。</li><li>5s：5秒粒度监控。</li></ul></p> 
     * @return MonitorVersion <p>监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/80653">云数据库 Redis 1分钟粒度下线公告</a>。</li><li>5s：5秒粒度监控。</li></ul></p>
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set <p>监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/80653">云数据库 Redis 1分钟粒度下线公告</a>。</li><li>5s：5秒粒度监控。</li></ul></p>
     * @param MonitorVersion <p>监控版本。<ul><li>1m：1分钟粒度监控。目前该监控粒度已下线，具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/80653">云数据库 Redis 1分钟粒度下线公告</a>。</li><li>5s：5秒粒度监控。</li></ul></p>
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get <p>客户端最大连接数可设置的最小值。</p> 
     * @return ClientLimitMin <p>客户端最大连接数可设置的最小值。</p>
     */
    public Long getClientLimitMin() {
        return this.ClientLimitMin;
    }

    /**
     * Set <p>客户端最大连接数可设置的最小值。</p>
     * @param ClientLimitMin <p>客户端最大连接数可设置的最小值。</p>
     */
    public void setClientLimitMin(Long ClientLimitMin) {
        this.ClientLimitMin = ClientLimitMin;
    }

    /**
     * Get <p>客户端最大连接数可设置的最大值。</p> 
     * @return ClientLimitMax <p>客户端最大连接数可设置的最大值。</p>
     */
    public Long getClientLimitMax() {
        return this.ClientLimitMax;
    }

    /**
     * Set <p>客户端最大连接数可设置的最大值。</p>
     * @param ClientLimitMax <p>客户端最大连接数可设置的最大值。</p>
     */
    public void setClientLimitMax(Long ClientLimitMax) {
        this.ClientLimitMax = ClientLimitMax;
    }

    /**
     * Get <p>实例的节点详细信息。<br>只有多可用区实例会返回。</p> 
     * @return NodeSet <p>实例的节点详细信息。<br>只有多可用区实例会返回。</p>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>实例的节点详细信息。<br>只有多可用区实例会返回。</p>
     * @param NodeSet <p>实例的节点详细信息。<br>只有多可用区实例会返回。</p>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>实例所在的地域信息，比如ap-guangzhou。</p> 
     * @return Region <p>实例所在的地域信息，比如ap-guangzhou。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所在的地域信息，比如ap-guangzhou。</p>
     * @param Region <p>实例所在的地域信息，比如ap-guangzhou。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>外网地址。</p> 
     * @return WanAddress <p>外网地址。</p>
     */
    public String getWanAddress() {
        return this.WanAddress;
    }

    /**
     * Set <p>外网地址。</p>
     * @param WanAddress <p>外网地址。</p>
     */
    public void setWanAddress(String WanAddress) {
        this.WanAddress = WanAddress;
    }

    /**
     * Get <p>北极星服务地址，内部使用。</p> 
     * @return PolarisServer <p>北极星服务地址，内部使用。</p>
     */
    public String getPolarisServer() {
        return this.PolarisServer;
    }

    /**
     * Set <p>北极星服务地址，内部使用。</p>
     * @param PolarisServer <p>北极星服务地址，内部使用。</p>
     */
    public void setPolarisServer(String PolarisServer) {
        this.PolarisServer = PolarisServer;
    }

    /**
     * Get <p>CDC Redis集群ID。</p> 
     * @return RedisClusterId <p>CDC Redis集群ID。</p>
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set <p>CDC Redis集群ID。</p>
     * @param RedisClusterId <p>CDC Redis集群ID。</p>
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get <p>CDC 集群ID。</p> 
     * @return DedicatedClusterId <p>CDC 集群ID。</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>CDC 集群ID。</p>
     * @param DedicatedClusterId <p>CDC 集群ID。</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul></p> 
     * @return ProductVersion <p>产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul></p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul></p>
     * @param ProductVersion <p>产品版本。<ul><li>local：本地盘。</li><li>cloud：云盘版。</li><li>cdc：CDC 集群版本。</li></ul></p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>实例当前Proxy版本。</p> 
     * @return CurrentProxyVersion <p>实例当前Proxy版本。</p>
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set <p>实例当前Proxy版本。</p>
     * @param CurrentProxyVersion <p>实例当前Proxy版本。</p>
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
    }

    /**
     * Get <p>实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。</p> 
     * @return CurrentRedisVersion <p>实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。</p>
     */
    public String getCurrentRedisVersion() {
        return this.CurrentRedisVersion;
    }

    /**
     * Set <p>实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。</p>
     * @param CurrentRedisVersion <p>实例当前Cache小版本。如果实例加入全球复制组，显示全球复制的内核版本。</p>
     */
    public void setCurrentRedisVersion(String CurrentRedisVersion) {
        this.CurrentRedisVersion = CurrentRedisVersion;
    }

    /**
     * Get <p>实例可升级Proxy版本。</p> 
     * @return UpgradeProxyVersion <p>实例可升级Proxy版本。</p>
     */
    public String getUpgradeProxyVersion() {
        return this.UpgradeProxyVersion;
    }

    /**
     * Set <p>实例可升级Proxy版本。</p>
     * @param UpgradeProxyVersion <p>实例可升级Proxy版本。</p>
     */
    public void setUpgradeProxyVersion(String UpgradeProxyVersion) {
        this.UpgradeProxyVersion = UpgradeProxyVersion;
    }

    /**
     * Get <p>实例可升级Cache小版本。</p> 
     * @return UpgradeRedisVersion <p>实例可升级Cache小版本。</p>
     */
    public String getUpgradeRedisVersion() {
        return this.UpgradeRedisVersion;
    }

    /**
     * Set <p>实例可升级Cache小版本。</p>
     * @param UpgradeRedisVersion <p>实例可升级Cache小版本。</p>
     */
    public void setUpgradeRedisVersion(String UpgradeRedisVersion) {
        this.UpgradeRedisVersion = UpgradeRedisVersion;
    }

    /**
     * Get <p>备份模式。</p><ul><li>SecondLevelBackup：秒级备份。</li><li>NormalLevelBackup：普通备份。</li></ul> 
     * @return BackupMode <p>备份模式。</p><ul><li>SecondLevelBackup：秒级备份。</li><li>NormalLevelBackup：普通备份。</li></ul>
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set <p>备份模式。</p><ul><li>SecondLevelBackup：秒级备份。</li><li>NormalLevelBackup：普通备份。</li></ul>
     * @param BackupMode <p>备份模式。</p><ul><li>SecondLevelBackup：秒级备份。</li><li>NormalLevelBackup：普通备份。</li></ul>
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    /**
     * Get <p>实例销毁保护开关。</p><ul><li>0：关闭。</li><li>1：开启。</li></ul> 
     * @return DeleteProtectionSwitch <p>实例销毁保护开关。</p><ul><li>0：关闭。</li><li>1：开启。</li></ul>
     */
    public Long getDeleteProtectionSwitch() {
        return this.DeleteProtectionSwitch;
    }

    /**
     * Set <p>实例销毁保护开关。</p><ul><li>0：关闭。</li><li>1：开启。</li></ul>
     * @param DeleteProtectionSwitch <p>实例销毁保护开关。</p><ul><li>0：关闭。</li><li>1：开启。</li></ul>
     */
    public void setDeleteProtectionSwitch(Long DeleteProtectionSwitch) {
        this.DeleteProtectionSwitch = DeleteProtectionSwitch;
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
        if (source.DeleteProtectionSwitch != null) {
            this.DeleteProtectionSwitch = new Long(source.DeleteProtectionSwitch);
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
        this.setParamSimple(map, prefix + "DeleteProtectionSwitch", this.DeleteProtectionSwitch);

    }
}

