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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoInstanceInfo  extends AbstractModel{

    /**
    * RO组对应的主实例的ID
    */
    @SerializedName("MasterInstanceId")
    @Expose
    private String MasterInstanceId;

    /**
    * RO实例在RO组内的状态，可能的值：online-在线，offline-下线
    */
    @SerializedName("RoStatus")
    @Expose
    private String RoStatus;

    /**
    * RO实例在RO组内上一次下线的时间
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * RO实例在RO组内的权重
    */
    @SerializedName("Weight")
    @Expose
    private Integer Weight;

    /**
    * RO实例所在区域名称，如ap-shanghai
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * RO可用区的正式名称，如ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * RO实例ID，格式如：cdbro-c1nl9rpv
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * RO实例状态，可能返回值：0-创建中，1-运行中，4-删除中
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 实例类型，可能返回值：1-主实例，2-灾备实例，3-只读实例
    */
    @SerializedName("InstanceType")
    @Expose
    private Integer InstanceType;

    /**
    * RO实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 按量计费状态，可能的取值：1-正常，2-欠费
    */
    @SerializedName("HourFeeStatus")
    @Expose
    private Integer HourFeeStatus;

    /**
    * RO实例任务状态，可能返回值：<br>0-没有任务<br>1-升级中<br>2-数据导入中<br>3-开放Slave中<br>4-外网访问开通中<br>5-批量操作执行中<br>6-回档中<br>7-外网访问关闭中<br>8-密码修改中<br>9-实例名修改中<br>10-重启中<br>12-自建迁移中<br>13-删除库表中<br>14-灾备实例创建同步中
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;

    /**
    * RO实例内存大小，单位：MB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * RO实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 每次查询数量
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * RO实例的内网IP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * RO实例访问端口
    */
    @SerializedName("Vport")
    @Expose
    private Integer Vport;

    /**
    * RO实例所在私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private Integer VpcId;

    /**
    * RO实例所在私有网络子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Integer SubnetId;

    /**
    * RO实例规格描述，目前可取值 CUSTOM
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * RO实例数据库引擎版本，可能返回值：5.1、5.5、5.6和5.7
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * RO实例到期时间，时间格式：yyyy-mm-dd hh:mm:ss，如实例为按量计费模式，则此字段值为0000-00-00 00:00:00
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * RO实例计费类型，可能返回值：0-包年包月，1-按量计费，2-后付费月结
    */
    @SerializedName("PayType")
    @Expose
    private Integer PayType;

    /**
     * 获取RO组对应的主实例的ID
     * @return MasterInstanceId RO组对应的主实例的ID
     */
    public String getMasterInstanceId() {
        return this.MasterInstanceId;
    }

    /**
     * 设置RO组对应的主实例的ID
     * @param MasterInstanceId RO组对应的主实例的ID
     */
    public void setMasterInstanceId(String MasterInstanceId) {
        this.MasterInstanceId = MasterInstanceId;
    }

    /**
     * 获取RO实例在RO组内的状态，可能的值：online-在线，offline-下线
     * @return RoStatus RO实例在RO组内的状态，可能的值：online-在线，offline-下线
     */
    public String getRoStatus() {
        return this.RoStatus;
    }

    /**
     * 设置RO实例在RO组内的状态，可能的值：online-在线，offline-下线
     * @param RoStatus RO实例在RO组内的状态，可能的值：online-在线，offline-下线
     */
    public void setRoStatus(String RoStatus) {
        this.RoStatus = RoStatus;
    }

    /**
     * 获取RO实例在RO组内上一次下线的时间
     * @return OfflineTime RO实例在RO组内上一次下线的时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * 设置RO实例在RO组内上一次下线的时间
     * @param OfflineTime RO实例在RO组内上一次下线的时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * 获取RO实例在RO组内的权重
     * @return Weight RO实例在RO组内的权重
     */
    public Integer getWeight() {
        return this.Weight;
    }

    /**
     * 设置RO实例在RO组内的权重
     * @param Weight RO实例在RO组内的权重
     */
    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    /**
     * 获取RO实例所在区域名称，如ap-shanghai
     * @return Region RO实例所在区域名称，如ap-shanghai
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置RO实例所在区域名称，如ap-shanghai
     * @param Region RO实例所在区域名称，如ap-shanghai
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取RO可用区的正式名称，如ap-shanghai-1
     * @return Zone RO可用区的正式名称，如ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置RO可用区的正式名称，如ap-shanghai-1
     * @param Zone RO可用区的正式名称，如ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取RO实例ID，格式如：cdbro-c1nl9rpv
     * @return InstanceId RO实例ID，格式如：cdbro-c1nl9rpv
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置RO实例ID，格式如：cdbro-c1nl9rpv
     * @param InstanceId RO实例ID，格式如：cdbro-c1nl9rpv
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取RO实例状态，可能返回值：0-创建中，1-运行中，4-删除中
     * @return Status RO实例状态，可能返回值：0-创建中，1-运行中，4-删除中
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置RO实例状态，可能返回值：0-创建中，1-运行中，4-删除中
     * @param Status RO实例状态，可能返回值：0-创建中，1-运行中，4-删除中
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例类型，可能返回值：1-主实例，2-灾备实例，3-只读实例
     * @return InstanceType 实例类型，可能返回值：1-主实例，2-灾备实例，3-只读实例
     */
    public Integer getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型，可能返回值：1-主实例，2-灾备实例，3-只读实例
     * @param InstanceType 实例类型，可能返回值：1-主实例，2-灾备实例，3-只读实例
     */
    public void setInstanceType(Integer InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取RO实例名称
     * @return InstanceName RO实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置RO实例名称
     * @param InstanceName RO实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取按量计费状态，可能的取值：1-正常，2-欠费
     * @return HourFeeStatus 按量计费状态，可能的取值：1-正常，2-欠费
     */
    public Integer getHourFeeStatus() {
        return this.HourFeeStatus;
    }

    /**
     * 设置按量计费状态，可能的取值：1-正常，2-欠费
     * @param HourFeeStatus 按量计费状态，可能的取值：1-正常，2-欠费
     */
    public void setHourFeeStatus(Integer HourFeeStatus) {
        this.HourFeeStatus = HourFeeStatus;
    }

    /**
     * 获取RO实例任务状态，可能返回值：<br>0-没有任务<br>1-升级中<br>2-数据导入中<br>3-开放Slave中<br>4-外网访问开通中<br>5-批量操作执行中<br>6-回档中<br>7-外网访问关闭中<br>8-密码修改中<br>9-实例名修改中<br>10-重启中<br>12-自建迁移中<br>13-删除库表中<br>14-灾备实例创建同步中
     * @return TaskStatus RO实例任务状态，可能返回值：<br>0-没有任务<br>1-升级中<br>2-数据导入中<br>3-开放Slave中<br>4-外网访问开通中<br>5-批量操作执行中<br>6-回档中<br>7-外网访问关闭中<br>8-密码修改中<br>9-实例名修改中<br>10-重启中<br>12-自建迁移中<br>13-删除库表中<br>14-灾备实例创建同步中
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置RO实例任务状态，可能返回值：<br>0-没有任务<br>1-升级中<br>2-数据导入中<br>3-开放Slave中<br>4-外网访问开通中<br>5-批量操作执行中<br>6-回档中<br>7-外网访问关闭中<br>8-密码修改中<br>9-实例名修改中<br>10-重启中<br>12-自建迁移中<br>13-删除库表中<br>14-灾备实例创建同步中
     * @param TaskStatus RO实例任务状态，可能返回值：<br>0-没有任务<br>1-升级中<br>2-数据导入中<br>3-开放Slave中<br>4-外网访问开通中<br>5-批量操作执行中<br>6-回档中<br>7-外网访问关闭中<br>8-密码修改中<br>9-实例名修改中<br>10-重启中<br>12-自建迁移中<br>13-删除库表中<br>14-灾备实例创建同步中
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取RO实例内存大小，单位：MB
     * @return Memory RO实例内存大小，单位：MB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置RO实例内存大小，单位：MB
     * @param Memory RO实例内存大小，单位：MB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取RO实例硬盘大小，单位：GB
     * @return Volume RO实例硬盘大小，单位：GB
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置RO实例硬盘大小，单位：GB
     * @param Volume RO实例硬盘大小，单位：GB
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取每次查询数量
     * @return Qps 每次查询数量
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置每次查询数量
     * @param Qps 每次查询数量
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取RO实例的内网IP地址
     * @return Vip RO实例的内网IP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * 设置RO实例的内网IP地址
     * @param Vip RO实例的内网IP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * 获取RO实例访问端口
     * @return Vport RO实例访问端口
     */
    public Integer getVport() {
        return this.Vport;
    }

    /**
     * 设置RO实例访问端口
     * @param Vport RO实例访问端口
     */
    public void setVport(Integer Vport) {
        this.Vport = Vport;
    }

    /**
     * 获取RO实例所在私有网络ID
     * @return VpcId RO实例所在私有网络ID
     */
    public Integer getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置RO实例所在私有网络ID
     * @param VpcId RO实例所在私有网络ID
     */
    public void setVpcId(Integer VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取RO实例所在私有网络子网ID
     * @return SubnetId RO实例所在私有网络子网ID
     */
    public Integer getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置RO实例所在私有网络子网ID
     * @param SubnetId RO实例所在私有网络子网ID
     */
    public void setSubnetId(Integer SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取RO实例规格描述，目前可取值 CUSTOM
     * @return DeviceType RO实例规格描述，目前可取值 CUSTOM
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置RO实例规格描述，目前可取值 CUSTOM
     * @param DeviceType RO实例规格描述，目前可取值 CUSTOM
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取RO实例数据库引擎版本，可能返回值：5.1、5.5、5.6和5.7
     * @return EngineVersion RO实例数据库引擎版本，可能返回值：5.1、5.5、5.6和5.7
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * 设置RO实例数据库引擎版本，可能返回值：5.1、5.5、5.6和5.7
     * @param EngineVersion RO实例数据库引擎版本，可能返回值：5.1、5.5、5.6和5.7
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * 获取RO实例到期时间，时间格式：yyyy-mm-dd hh:mm:ss，如实例为按量计费模式，则此字段值为0000-00-00 00:00:00
     * @return DeadlineTime RO实例到期时间，时间格式：yyyy-mm-dd hh:mm:ss，如实例为按量计费模式，则此字段值为0000-00-00 00:00:00
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * 设置RO实例到期时间，时间格式：yyyy-mm-dd hh:mm:ss，如实例为按量计费模式，则此字段值为0000-00-00 00:00:00
     * @param DeadlineTime RO实例到期时间，时间格式：yyyy-mm-dd hh:mm:ss，如实例为按量计费模式，则此字段值为0000-00-00 00:00:00
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * 获取RO实例计费类型，可能返回值：0-包年包月，1-按量计费，2-后付费月结
     * @return PayType RO实例计费类型，可能返回值：0-包年包月，1-按量计费，2-后付费月结
     */
    public Integer getPayType() {
        return this.PayType;
    }

    /**
     * 设置RO实例计费类型，可能返回值：0-包年包月，1-按量计费，2-后付费月结
     * @param PayType RO实例计费类型，可能返回值：0-包年包月，1-按量计费，2-后付费月结
     */
    public void setPayType(Integer PayType) {
        this.PayType = PayType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterInstanceId", this.MasterInstanceId);
        this.setParamSimple(map, prefix + "RoStatus", this.RoStatus);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "HourFeeStatus", this.HourFeeStatus);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);

    }
}

