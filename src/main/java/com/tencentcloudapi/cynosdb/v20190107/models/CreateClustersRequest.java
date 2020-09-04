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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClustersRequest extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 所属VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所属子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据库类型，取值范围: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库版本，取值范围: 
<li> MYSQL可选值：5.7 </li>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储上限，单位GB
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 所属项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 存储
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 账号密码(8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()~）中的两种)
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * 端口，默认5432
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 计费模式，按量计费：0，包年包月：1。默认按量计费。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 购买个数，目前只支持传1（不传默认为1）
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 回档类型：
noneRollback：不回档；
snapRollback，快照回档；
timeRollback，时间点回档
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * 快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * 回档时，传入源集群ID，用于查找源poolId
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * 时间点回档，指定时间；快照回档，快照时间
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * 时间点回档，指定时间允许范围
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * 实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 包年包月购买时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 包年包月购买时长单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 包年包月购买是否自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否自动选择代金券 1是 0否 默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 实例数量（该参数已不再使用，只做存量兼容处理）
    */
    @SerializedName("HaCount")
    @Expose
    private Long HaCount;

    /**
    * 订单来源
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 所属VPC网络ID 
     * @return VpcId 所属VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属VPC网络ID
     * @param VpcId 所属VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所属子网ID 
     * @return SubnetId 所属子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所属子网ID
     * @param SubnetId 所属子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li> 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 数据库版本，取值范围: 
<li> MYSQL可选值：5.7 </li> 
     * @return DbVersion 数据库版本，取值范围: 
<li> MYSQL可选值：5.7 </li>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本，取值范围: 
<li> MYSQL可选值：5.7 </li>
     * @param DbVersion 数据库版本，取值范围: 
<li> MYSQL可选值：5.7 </li>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Cpu核数 
     * @return Cpu Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu核数
     * @param Cpu Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储上限，单位GB 
     * @return StorageLimit 存储上限，单位GB
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储上限，单位GB
     * @param StorageLimit 存储上限，单位GB
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 所属项目ID 
     * @return ProjectId 所属项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目ID
     * @param ProjectId 所属项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 存储 
     * @return Storage 存储
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储
     * @param Storage 存储
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 账号密码(8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()~）中的两种) 
     * @return AdminPassword 账号密码(8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()~）中的两种)
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 账号密码(8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()~）中的两种)
     * @param AdminPassword 账号密码(8-64个字符，至少包含字母、数字、字符（支持的字符：_+-&=!@#$%^*()~）中的两种)
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get 端口，默认5432 
     * @return Port 端口，默认5432
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口，默认5432
     * @param Port 端口，默认5432
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 计费模式，按量计费：0，包年包月：1。默认按量计费。 
     * @return PayMode 计费模式，按量计费：0，包年包月：1。默认按量计费。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式，按量计费：0，包年包月：1。默认按量计费。
     * @param PayMode 计费模式，按量计费：0，包年包月：1。默认按量计费。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 购买个数，目前只支持传1（不传默认为1） 
     * @return Count 购买个数，目前只支持传1（不传默认为1）
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买个数，目前只支持传1（不传默认为1）
     * @param Count 购买个数，目前只支持传1（不传默认为1）
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 回档类型：
noneRollback：不回档；
snapRollback，快照回档；
timeRollback，时间点回档 
     * @return RollbackStrategy 回档类型：
noneRollback：不回档；
snapRollback，快照回档；
timeRollback，时间点回档
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set 回档类型：
noneRollback：不回档；
snapRollback，快照回档；
timeRollback，时间点回档
     * @param RollbackStrategy 回档类型：
noneRollback：不回档；
snapRollback，快照回档；
timeRollback，时间点回档
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get 快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效 
     * @return RollbackId 快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set 快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效
     * @param RollbackId 快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get 回档时，传入源集群ID，用于查找源poolId 
     * @return OriginalClusterId 回档时，传入源集群ID，用于查找源poolId
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set 回档时，传入源集群ID，用于查找源poolId
     * @param OriginalClusterId 回档时，传入源集群ID，用于查找源poolId
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get 时间点回档，指定时间；快照回档，快照时间 
     * @return ExpectTime 时间点回档，指定时间；快照回档，快照时间
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set 时间点回档，指定时间；快照回档，快照时间
     * @param ExpectTime 时间点回档，指定时间；快照回档，快照时间
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get 时间点回档，指定时间允许范围 
     * @return ExpectTimeThresh 时间点回档，指定时间允许范围
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set 时间点回档，指定时间允许范围
     * @param ExpectTimeThresh 时间点回档，指定时间允许范围
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get 实例数量 
     * @return InstanceCount 实例数量
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例数量
     * @param InstanceCount 实例数量
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 包年包月购买时长 
     * @return TimeSpan 包年包月购买时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 包年包月购买时长
     * @param TimeSpan 包年包月购买时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 包年包月购买时长单位 
     * @return TimeUnit 包年包月购买时长单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 包年包月购买时长单位
     * @param TimeUnit 包年包月购买时长单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 包年包月购买是否自动续费 
     * @return AutoRenewFlag 包年包月购买是否自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 包年包月购买是否自动续费
     * @param AutoRenewFlag 包年包月购买是否自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否自动选择代金券 1是 0否 默认为0 
     * @return AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券 1是 0否 默认为0
     * @param AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 实例数量（该参数已不再使用，只做存量兼容处理） 
     * @return HaCount 实例数量（该参数已不再使用，只做存量兼容处理）
     */
    public Long getHaCount() {
        return this.HaCount;
    }

    /**
     * Set 实例数量（该参数已不再使用，只做存量兼容处理）
     * @param HaCount 实例数量（该参数已不再使用，只做存量兼容处理）
     */
    public void setHaCount(Long HaCount) {
        this.HaCount = HaCount;
    }

    /**
     * Get 订单来源 
     * @return OrderSource 订单来源
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set 订单来源
     * @param OrderSource 订单来源
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "RollbackId", this.RollbackId);
        this.setParamSimple(map, prefix + "OriginalClusterId", this.OriginalClusterId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "ExpectTimeThresh", this.ExpectTimeThresh);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "HaCount", this.HaCount);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);

    }
}

