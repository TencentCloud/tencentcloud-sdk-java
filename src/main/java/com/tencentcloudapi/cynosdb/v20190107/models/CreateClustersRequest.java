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
<li> MYSQL可选值：5.7，8.0 </li>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 所属项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 当DbMode为NORMAL或不填时必选
普通实例Cpu核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 当DbMode为NORMAL或不填时必选
普通实例内存,单位G
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 该参数无实际意义，已废弃。
存储大小，单位G。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（'-','_','.'）
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种)
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
    * 购买集群数，可选值范围[1,50]，默认为1
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
    * 该参数无实际意义，已废弃。
时间点回档，指定时间允许范围
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * 普通实例存储上限，单位GB
当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

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
    * 包年包月购买时长单位，['s','d','m','y']
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
    * 集群创建需要绑定的tag数组信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Db类型
当DbType为MYSQL时可选(默认NORMAL)：
<li>NORMAL</li>
<li>SERVERLESS</li>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 当DbMode为SEVERLESS时必填
cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * 当DbMode为SEVERLESS时必填：
cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * 当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
默认值:yes
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * 当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]
默认值:600
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * 集群存储计费模式，按量计费：0，包年包月：1。默认按量计费
当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费
回档与克隆均不支持包年包月存储
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * 安全组id数组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 告警策略Id数组
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * 参数数组
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * 交易模式，0-下单且支付，1-下单
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * 参数模版ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

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
<li> MYSQL可选值：5.7，8.0 </li> 
     * @return DbVersion 数据库版本，取值范围: 
<li> MYSQL可选值：5.7，8.0 </li>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本，取值范围: 
<li> MYSQL可选值：5.7，8.0 </li>
     * @param DbVersion 数据库版本，取值范围: 
<li> MYSQL可选值：5.7，8.0 </li>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
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
     * Get 当DbMode为NORMAL或不填时必选
普通实例Cpu核数 
     * @return Cpu 当DbMode为NORMAL或不填时必选
普通实例Cpu核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 当DbMode为NORMAL或不填时必选
普通实例Cpu核数
     * @param Cpu 当DbMode为NORMAL或不填时必选
普通实例Cpu核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 当DbMode为NORMAL或不填时必选
普通实例内存,单位G 
     * @return Memory 当DbMode为NORMAL或不填时必选
普通实例内存,单位G
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 当DbMode为NORMAL或不填时必选
普通实例内存,单位G
     * @param Memory 当DbMode为NORMAL或不填时必选
普通实例内存,单位G
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 该参数无实际意义，已废弃。
存储大小，单位G。 
     * @return Storage 该参数无实际意义，已废弃。
存储大小，单位G。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 该参数无实际意义，已废弃。
存储大小，单位G。
     * @param Storage 该参数无实际意义，已废弃。
存储大小，单位G。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（'-','_','.'） 
     * @return ClusterName 集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（'-','_','.'）
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（'-','_','.'）
     * @param ClusterName 集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（'-','_','.'）
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种) 
     * @return AdminPassword 账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种)
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种)
     * @param AdminPassword 账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/中的任意三种)
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
     * Get 购买集群数，可选值范围[1,50]，默认为1 
     * @return Count 购买集群数，可选值范围[1,50]，默认为1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买集群数，可选值范围[1,50]，默认为1
     * @param Count 购买集群数，可选值范围[1,50]，默认为1
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
     * Get 该参数无实际意义，已废弃。
时间点回档，指定时间允许范围 
     * @return ExpectTimeThresh 该参数无实际意义，已废弃。
时间点回档，指定时间允许范围
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set 该参数无实际意义，已废弃。
时间点回档，指定时间允许范围
     * @param ExpectTimeThresh 该参数无实际意义，已废弃。
时间点回档，指定时间允许范围
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get 普通实例存储上限，单位GB
当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限 
     * @return StorageLimit 普通实例存储上限，单位GB
当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 普通实例存储上限，单位GB
当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限
     * @param StorageLimit 普通实例存储上限，单位GB
当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
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
     * Get 包年包月购买时长单位，['s','d','m','y'] 
     * @return TimeUnit 包年包月购买时长单位，['s','d','m','y']
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 包年包月购买时长单位，['s','d','m','y']
     * @param TimeUnit 包年包月购买时长单位，['s','d','m','y']
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
     * Get 集群创建需要绑定的tag数组信息 
     * @return ResourceTags 集群创建需要绑定的tag数组信息
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 集群创建需要绑定的tag数组信息
     * @param ResourceTags 集群创建需要绑定的tag数组信息
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Db类型
当DbType为MYSQL时可选(默认NORMAL)：
<li>NORMAL</li>
<li>SERVERLESS</li> 
     * @return DbMode Db类型
当DbType为MYSQL时可选(默认NORMAL)：
<li>NORMAL</li>
<li>SERVERLESS</li>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Db类型
当DbType为MYSQL时可选(默认NORMAL)：
<li>NORMAL</li>
<li>SERVERLESS</li>
     * @param DbMode Db类型
当DbType为MYSQL时可选(默认NORMAL)：
<li>NORMAL</li>
<li>SERVERLESS</li>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 当DbMode为SEVERLESS时必填
cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回 
     * @return MinCpu 当DbMode为SEVERLESS时必填
cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set 当DbMode为SEVERLESS时必填
cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     * @param MinCpu 当DbMode为SEVERLESS时必填
cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get 当DbMode为SEVERLESS时必填：
cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回 
     * @return MaxCpu 当DbMode为SEVERLESS时必填：
cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set 当DbMode为SEVERLESS时必填：
cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     * @param MaxCpu 当DbMode为SEVERLESS时必填：
cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get 当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
默认值:yes 
     * @return AutoPause 当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
默认值:yes
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set 当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
默认值:yes
     * @param AutoPause 当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围
<li>yes</li>
<li>no</li>
默认值:yes
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get 当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]
默认值:600 
     * @return AutoPauseDelay 当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]
默认值:600
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set 当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]
默认值:600
     * @param AutoPauseDelay 当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]
默认值:600
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get 集群存储计费模式，按量计费：0，包年包月：1。默认按量计费
当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费
回档与克隆均不支持包年包月存储 
     * @return StoragePayMode 集群存储计费模式，按量计费：0，包年包月：1。默认按量计费
当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费
回档与克隆均不支持包年包月存储
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set 集群存储计费模式，按量计费：0，包年包月：1。默认按量计费
当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费
回档与克隆均不支持包年包月存储
     * @param StoragePayMode 集群存储计费模式，按量计费：0，包年包月：1。默认按量计费
当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费
回档与克隆均不支持包年包月存储
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get 安全组id数组 
     * @return SecurityGroupIds 安全组id数组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组id数组
     * @param SecurityGroupIds 安全组id数组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 告警策略Id数组 
     * @return AlarmPolicyIds 告警策略Id数组
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set 告警策略Id数组
     * @param AlarmPolicyIds 告警策略Id数组
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get 参数数组 
     * @return ClusterParams 参数数组
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set 参数数组
     * @param ClusterParams 参数数组
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get 交易模式，0-下单且支付，1-下单 
     * @return DealMode 交易模式，0-下单且支付，1-下单
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 交易模式，0-下单且支付，1-下单
     * @param DealMode 交易模式，0-下单且支付，1-下单
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get 参数模版ID 
     * @return ParamTemplateId 参数模版ID
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 参数模版ID
     * @param ParamTemplateId 参数模版ID
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    public CreateClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClustersRequest(CreateClustersRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.RollbackId != null) {
            this.RollbackId = new Long(source.RollbackId);
        }
        if (source.OriginalClusterId != null) {
            this.OriginalClusterId = new String(source.OriginalClusterId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.ExpectTimeThresh != null) {
            this.ExpectTimeThresh = new Long(source.ExpectTimeThresh);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.HaCount != null) {
            this.HaCount = new Long(source.HaCount);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AlarmPolicyIds != null) {
            this.AlarmPolicyIds = new String[source.AlarmPolicyIds.length];
            for (int i = 0; i < source.AlarmPolicyIds.length; i++) {
                this.AlarmPolicyIds[i] = new String(source.AlarmPolicyIds[i]);
            }
        }
        if (source.ClusterParams != null) {
            this.ClusterParams = new ParamItem[source.ClusterParams.length];
            for (int i = 0; i < source.ClusterParams.length; i++) {
                this.ClusterParams[i] = new ParamItem(source.ClusterParams[i]);
            }
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
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
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "HaCount", this.HaCount);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);
        this.setParamArrayObj(map, prefix + "ClusterParams.", this.ClusterParams);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);

    }
}

