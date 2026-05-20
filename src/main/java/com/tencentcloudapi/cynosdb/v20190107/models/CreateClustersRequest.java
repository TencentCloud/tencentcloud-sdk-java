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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClustersRequest extends AbstractModel {

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>所属VPC网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>所属子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>数据库类型</p><p>枚举值：</p><ul><li>MYSQL： MYSQL</li></ul>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>数据库版本</p><p>枚举值：</p><ul><li>5.7： MySQL5.7版本</li><li>8.0： MySQL8.0版本</li></ul>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>所属项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>当DbMode为NORMAL或不填时必选<br>普通实例Cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>当DbMode为NORMAL或不填时必选<br>普通实例内存,单位GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例数量</p><p>取值范围：[1, 16]</p><p>默认值：2</p><ul><li>取值为2，表示一个 rw 实例 + 一个 ro 实例。</li><li>传递的 n 表示1个 rw 实例 + n-1个 ro 实例（规格相同）。</li><li>如需要更精确的集群组成搭配，请使用 InstanceInitInfos。</li><li>此参数设置的数值适用于预置资源集群，如需设置 Serverless 集群的实例规格及数量，请使用 InstanceInitInfos.N 中的 InstanceInitInfo 结构。</li></ul>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>该参数无实际意义，已废弃。<br>存储大小，单位GB。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（&#39;-&#39;,&#39;_&#39;,&#39;.&#39;）</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&amp;*_-+=`|(){}[]:;&#39;&lt;&gt;,.?/中的任意三种)</p>
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * <p>端口，默认3306，取值范围[0, 65535)</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>计费模式</p><p>枚举值：</p><ul><li>0： 表示按量计费</li><li>1： 表示包年包月</li></ul><p>默认值：0</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>购买集群数，可选值范围[1,50]，默认为1</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>回档类型</p><p>枚举值：</p><ul><li>noneRollback： 不回档</li><li>snapRollback： 快照回档</li><li>timeRollback： 时间点回档</li></ul>
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * <p>快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效</p>
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * <p>回档时，传入源集群ID，用于查找源poolId</p>
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * <p>时间点回档，指定时间；快照回档，快照时间</p>
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * <p>该参数无实际意义，已废弃。<br>时间点回档，指定时间允许范围</p>
    */
    @SerializedName("ExpectTimeThresh")
    @Expose
    private Long ExpectTimeThresh;

    /**
    * <p>普通实例存储上限，单位GB<br>当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限</p>
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * <p>包年包月购买时长</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>包年包月购买时长单位，[&#39;s&#39;,&#39;d&#39;,&#39;m&#39;,&#39;y&#39;]</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>包年包月购买是否自动续费</p><p>枚举值：</p><ul><li>0： 默认续费方式</li><li>1： 自动续费</li><li>2： 不自动续费</li></ul><p>默认值：0</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>是否自动选择代金券 1是 0否 默认为0</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 否</li></ul><p>默认值：0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>实例数量（该参数已不再使用，只做存量兼容处理）</p>
    */
    @SerializedName("HaCount")
    @Expose
    private Long HaCount;

    /**
    * <p>订单来源</p>
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * <p>集群创建需要绑定的tag数组信息</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Db类型</p><p>枚举值：</p><ul><li>NORMAL： 普通实例</li><li>SERVERLESS： serverless实例</li></ul><p>默认值：NORMAL</p><p>当DbType为MYSQL时可选(默认NORMAL)</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>当DbMode为SERVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>当DbMode为SERVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：yes</p><p>DbMode为SERVERLESS生效</p>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>当DbMode为SERVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>集群存储计费模式，按量计费：0，包年包月：1。默认按量计费<br>当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费<br>回档与克隆均不支持包年包月存储</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>安全组id数组</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>告警策略Id数组</p>
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * <p>参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感</p>
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * <p>交易模式</p><p>枚举值：</p><ul><li>0： 下单且支付</li><li>1： 下单</li></ul><p>默认值：0</p>
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * <p>参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>多可用区地址</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>实例初始化配置信息，主要用于购买集群时选不同规格实例</p>
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private InstanceInitInfo [] InstanceInitInfos;

    /**
    * <p>全球数据库唯一标识</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * <p>数据库代理配置</p>
    */
    @SerializedName("ProxyConfig")
    @Expose
    private ProxyConfig ProxyConfig;

    /**
    * <p>是否自动归档</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：no</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * <p>暂停后的归档处理时间</p><p>单位：时</p><p>默认值：12</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
    */
    @SerializedName("AutoArchiveDelayHours")
    @Expose
    private Long AutoArchiveDelayHours;

    /**
    * <p>集群级别，可空。例如 P0, P1。（可忽略该字段）</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * <p>内核小版本号</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>所属VPC网络ID</p> 
     * @return VpcId <p>所属VPC网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>所属VPC网络ID</p>
     * @param VpcId <p>所属VPC网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>所属子网ID</p> 
     * @return SubnetId <p>所属子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>所属子网ID</p>
     * @param SubnetId <p>所属子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>数据库类型</p><p>枚举值：</p><ul><li>MYSQL： MYSQL</li></ul> 
     * @return DbType <p>数据库类型</p><p>枚举值：</p><ul><li>MYSQL： MYSQL</li></ul>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>数据库类型</p><p>枚举值：</p><ul><li>MYSQL： MYSQL</li></ul>
     * @param DbType <p>数据库类型</p><p>枚举值：</p><ul><li>MYSQL： MYSQL</li></ul>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>数据库版本</p><p>枚举值：</p><ul><li>5.7： MySQL5.7版本</li><li>8.0： MySQL8.0版本</li></ul> 
     * @return DbVersion <p>数据库版本</p><p>枚举值：</p><ul><li>5.7： MySQL5.7版本</li><li>8.0： MySQL8.0版本</li></ul>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>数据库版本</p><p>枚举值：</p><ul><li>5.7： MySQL5.7版本</li><li>8.0： MySQL8.0版本</li></ul>
     * @param DbVersion <p>数据库版本</p><p>枚举值：</p><ul><li>5.7： MySQL5.7版本</li><li>8.0： MySQL8.0版本</li></ul>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>所属项目ID</p> 
     * @return ProjectId <p>所属项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>所属项目ID</p>
     * @param ProjectId <p>所属项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>当DbMode为NORMAL或不填时必选<br>普通实例Cpu核数</p> 
     * @return Cpu <p>当DbMode为NORMAL或不填时必选<br>普通实例Cpu核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>当DbMode为NORMAL或不填时必选<br>普通实例Cpu核数</p>
     * @param Cpu <p>当DbMode为NORMAL或不填时必选<br>普通实例Cpu核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>当DbMode为NORMAL或不填时必选<br>普通实例内存,单位GB</p> 
     * @return Memory <p>当DbMode为NORMAL或不填时必选<br>普通实例内存,单位GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>当DbMode为NORMAL或不填时必选<br>普通实例内存,单位GB</p>
     * @param Memory <p>当DbMode为NORMAL或不填时必选<br>普通实例内存,单位GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例数量</p><p>取值范围：[1, 16]</p><p>默认值：2</p><ul><li>取值为2，表示一个 rw 实例 + 一个 ro 实例。</li><li>传递的 n 表示1个 rw 实例 + n-1个 ro 实例（规格相同）。</li><li>如需要更精确的集群组成搭配，请使用 InstanceInitInfos。</li><li>此参数设置的数值适用于预置资源集群，如需设置 Serverless 集群的实例规格及数量，请使用 InstanceInitInfos.N 中的 InstanceInitInfo 结构。</li></ul> 
     * @return InstanceCount <p>实例数量</p><p>取值范围：[1, 16]</p><p>默认值：2</p><ul><li>取值为2，表示一个 rw 实例 + 一个 ro 实例。</li><li>传递的 n 表示1个 rw 实例 + n-1个 ro 实例（规格相同）。</li><li>如需要更精确的集群组成搭配，请使用 InstanceInitInfos。</li><li>此参数设置的数值适用于预置资源集群，如需设置 Serverless 集群的实例规格及数量，请使用 InstanceInitInfos.N 中的 InstanceInitInfo 结构。</li></ul>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>实例数量</p><p>取值范围：[1, 16]</p><p>默认值：2</p><ul><li>取值为2，表示一个 rw 实例 + 一个 ro 实例。</li><li>传递的 n 表示1个 rw 实例 + n-1个 ro 实例（规格相同）。</li><li>如需要更精确的集群组成搭配，请使用 InstanceInitInfos。</li><li>此参数设置的数值适用于预置资源集群，如需设置 Serverless 集群的实例规格及数量，请使用 InstanceInitInfos.N 中的 InstanceInitInfo 结构。</li></ul>
     * @param InstanceCount <p>实例数量</p><p>取值范围：[1, 16]</p><p>默认值：2</p><ul><li>取值为2，表示一个 rw 实例 + 一个 ro 实例。</li><li>传递的 n 表示1个 rw 实例 + n-1个 ro 实例（规格相同）。</li><li>如需要更精确的集群组成搭配，请使用 InstanceInitInfos。</li><li>此参数设置的数值适用于预置资源集群，如需设置 Serverless 集群的实例规格及数量，请使用 InstanceInitInfos.N 中的 InstanceInitInfo 结构。</li></ul>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>该参数无实际意义，已废弃。<br>存储大小，单位GB。</p> 
     * @return Storage <p>该参数无实际意义，已废弃。<br>存储大小，单位GB。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>该参数无实际意义，已废弃。<br>存储大小，单位GB。</p>
     * @param Storage <p>该参数无实际意义，已废弃。<br>存储大小，单位GB。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（&#39;-&#39;,&#39;_&#39;,&#39;.&#39;）</p> 
     * @return ClusterName <p>集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（&#39;-&#39;,&#39;_&#39;,&#39;.&#39;）</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（&#39;-&#39;,&#39;_&#39;,&#39;.&#39;）</p>
     * @param ClusterName <p>集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（&#39;-&#39;,&#39;_&#39;,&#39;.&#39;）</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&amp;*_-+=`|(){}[]:;&#39;&lt;&gt;,.?/中的任意三种)</p> 
     * @return AdminPassword <p>账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&amp;*_-+=`|(){}[]:;&#39;&lt;&gt;,.?/中的任意三种)</p>
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set <p>账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&amp;*_-+=`|(){}[]:;&#39;&lt;&gt;,.?/中的任意三种)</p>
     * @param AdminPassword <p>账号密码(8-64个字符，包含大小写英文字母、数字和符号~!@#$%^&amp;*_-+=`|(){}[]:;&#39;&lt;&gt;,.?/中的任意三种)</p>
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get <p>端口，默认3306，取值范围[0, 65535)</p> 
     * @return Port <p>端口，默认3306，取值范围[0, 65535)</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口，默认3306，取值范围[0, 65535)</p>
     * @param Port <p>端口，默认3306，取值范围[0, 65535)</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>计费模式</p><p>枚举值：</p><ul><li>0： 表示按量计费</li><li>1： 表示包年包月</li></ul><p>默认值：0</p> 
     * @return PayMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 表示按量计费</li><li>1： 表示包年包月</li></ul><p>默认值：0</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式</p><p>枚举值：</p><ul><li>0： 表示按量计费</li><li>1： 表示包年包月</li></ul><p>默认值：0</p>
     * @param PayMode <p>计费模式</p><p>枚举值：</p><ul><li>0： 表示按量计费</li><li>1： 表示包年包月</li></ul><p>默认值：0</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>购买集群数，可选值范围[1,50]，默认为1</p> 
     * @return Count <p>购买集群数，可选值范围[1,50]，默认为1</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>购买集群数，可选值范围[1,50]，默认为1</p>
     * @param Count <p>购买集群数，可选值范围[1,50]，默认为1</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>回档类型</p><p>枚举值：</p><ul><li>noneRollback： 不回档</li><li>snapRollback： 快照回档</li><li>timeRollback： 时间点回档</li></ul> 
     * @return RollbackStrategy <p>回档类型</p><p>枚举值：</p><ul><li>noneRollback： 不回档</li><li>snapRollback： 快照回档</li><li>timeRollback： 时间点回档</li></ul>
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set <p>回档类型</p><p>枚举值：</p><ul><li>noneRollback： 不回档</li><li>snapRollback： 快照回档</li><li>timeRollback： 时间点回档</li></ul>
     * @param RollbackStrategy <p>回档类型</p><p>枚举值：</p><ul><li>noneRollback： 不回档</li><li>snapRollback： 快照回档</li><li>timeRollback： 时间点回档</li></ul>
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get <p>快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效</p> 
     * @return RollbackId <p>快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效</p>
     */
    public Long getRollbackId() {
        return this.RollbackId;
    }

    /**
     * Set <p>快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效</p>
     * @param RollbackId <p>快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效</p>
     */
    public void setRollbackId(Long RollbackId) {
        this.RollbackId = RollbackId;
    }

    /**
     * Get <p>回档时，传入源集群ID，用于查找源poolId</p> 
     * @return OriginalClusterId <p>回档时，传入源集群ID，用于查找源poolId</p>
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set <p>回档时，传入源集群ID，用于查找源poolId</p>
     * @param OriginalClusterId <p>回档时，传入源集群ID，用于查找源poolId</p>
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get <p>时间点回档，指定时间；快照回档，快照时间</p> 
     * @return ExpectTime <p>时间点回档，指定时间；快照回档，快照时间</p>
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set <p>时间点回档，指定时间；快照回档，快照时间</p>
     * @param ExpectTime <p>时间点回档，指定时间；快照回档，快照时间</p>
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get <p>该参数无实际意义，已废弃。<br>时间点回档，指定时间允许范围</p> 
     * @return ExpectTimeThresh <p>该参数无实际意义，已废弃。<br>时间点回档，指定时间允许范围</p>
     */
    public Long getExpectTimeThresh() {
        return this.ExpectTimeThresh;
    }

    /**
     * Set <p>该参数无实际意义，已废弃。<br>时间点回档，指定时间允许范围</p>
     * @param ExpectTimeThresh <p>该参数无实际意义，已废弃。<br>时间点回档，指定时间允许范围</p>
     */
    public void setExpectTimeThresh(Long ExpectTimeThresh) {
        this.ExpectTimeThresh = ExpectTimeThresh;
    }

    /**
     * Get <p>普通实例存储上限，单位GB<br>当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限</p> 
     * @return StorageLimit <p>普通实例存储上限，单位GB<br>当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限</p>
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set <p>普通实例存储上限，单位GB<br>当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限</p>
     * @param StorageLimit <p>普通实例存储上限，单位GB<br>当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限</p>
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get <p>包年包月购买时长</p> 
     * @return TimeSpan <p>包年包月购买时长</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>包年包月购买时长</p>
     * @param TimeSpan <p>包年包月购买时长</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>包年包月购买时长单位，[&#39;s&#39;,&#39;d&#39;,&#39;m&#39;,&#39;y&#39;]</p> 
     * @return TimeUnit <p>包年包月购买时长单位，[&#39;s&#39;,&#39;d&#39;,&#39;m&#39;,&#39;y&#39;]</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>包年包月购买时长单位，[&#39;s&#39;,&#39;d&#39;,&#39;m&#39;,&#39;y&#39;]</p>
     * @param TimeUnit <p>包年包月购买时长单位，[&#39;s&#39;,&#39;d&#39;,&#39;m&#39;,&#39;y&#39;]</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>包年包月购买是否自动续费</p><p>枚举值：</p><ul><li>0： 默认续费方式</li><li>1： 自动续费</li><li>2： 不自动续费</li></ul><p>默认值：0</p> 
     * @return AutoRenewFlag <p>包年包月购买是否自动续费</p><p>枚举值：</p><ul><li>0： 默认续费方式</li><li>1： 自动续费</li><li>2： 不自动续费</li></ul><p>默认值：0</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>包年包月购买是否自动续费</p><p>枚举值：</p><ul><li>0： 默认续费方式</li><li>1： 自动续费</li><li>2： 不自动续费</li></ul><p>默认值：0</p>
     * @param AutoRenewFlag <p>包年包月购买是否自动续费</p><p>枚举值：</p><ul><li>0： 默认续费方式</li><li>1： 自动续费</li><li>2： 不自动续费</li></ul><p>默认值：0</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>是否自动选择代金券 1是 0否 默认为0</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 否</li></ul><p>默认值：0</p> 
     * @return AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 否</li></ul><p>默认值：0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券 1是 0否 默认为0</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 否</li></ul><p>默认值：0</p>
     * @param AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p><p>枚举值：</p><ul><li>1： 是</li><li>0： 否</li></ul><p>默认值：0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>实例数量（该参数已不再使用，只做存量兼容处理）</p> 
     * @return HaCount <p>实例数量（该参数已不再使用，只做存量兼容处理）</p>
     */
    public Long getHaCount() {
        return this.HaCount;
    }

    /**
     * Set <p>实例数量（该参数已不再使用，只做存量兼容处理）</p>
     * @param HaCount <p>实例数量（该参数已不再使用，只做存量兼容处理）</p>
     */
    public void setHaCount(Long HaCount) {
        this.HaCount = HaCount;
    }

    /**
     * Get <p>订单来源</p> 
     * @return OrderSource <p>订单来源</p>
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set <p>订单来源</p>
     * @param OrderSource <p>订单来源</p>
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get <p>集群创建需要绑定的tag数组信息</p> 
     * @return ResourceTags <p>集群创建需要绑定的tag数组信息</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>集群创建需要绑定的tag数组信息</p>
     * @param ResourceTags <p>集群创建需要绑定的tag数组信息</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Db类型</p><p>枚举值：</p><ul><li>NORMAL： 普通实例</li><li>SERVERLESS： serverless实例</li></ul><p>默认值：NORMAL</p><p>当DbType为MYSQL时可选(默认NORMAL)</p> 
     * @return DbMode <p>Db类型</p><p>枚举值：</p><ul><li>NORMAL： 普通实例</li><li>SERVERLESS： serverless实例</li></ul><p>默认值：NORMAL</p><p>当DbType为MYSQL时可选(默认NORMAL)</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db类型</p><p>枚举值：</p><ul><li>NORMAL： 普通实例</li><li>SERVERLESS： serverless实例</li></ul><p>默认值：NORMAL</p><p>当DbType为MYSQL时可选(默认NORMAL)</p>
     * @param DbMode <p>Db类型</p><p>枚举值：</p><ul><li>NORMAL： 普通实例</li><li>SERVERLESS： serverless实例</li></ul><p>默认值：NORMAL</p><p>当DbType为MYSQL时可选(默认NORMAL)</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>当DbMode为SERVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MinCpu <p>当DbMode为SERVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>当DbMode为SERVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MinCpu <p>当DbMode为SERVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>当DbMode为SERVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MaxCpu <p>当DbMode为SERVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>当DbMode为SERVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MaxCpu <p>当DbMode为SERVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：yes</p><p>DbMode为SERVERLESS生效</p> 
     * @return AutoPause <p>否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：yes</p><p>DbMode为SERVERLESS生效</p>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：yes</p><p>DbMode为SERVERLESS生效</p>
     * @param AutoPause <p>否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：yes</p><p>DbMode为SERVERLESS生效</p>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>当DbMode为SERVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p> 
     * @return AutoPauseDelay <p>当DbMode为SERVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>当DbMode为SERVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
     * @param AutoPauseDelay <p>当DbMode为SERVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>集群存储计费模式，按量计费：0，包年包月：1。默认按量计费<br>当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费<br>回档与克隆均不支持包年包月存储</p> 
     * @return StoragePayMode <p>集群存储计费模式，按量计费：0，包年包月：1。默认按量计费<br>当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费<br>回档与克隆均不支持包年包月存储</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>集群存储计费模式，按量计费：0，包年包月：1。默认按量计费<br>当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费<br>回档与克隆均不支持包年包月存储</p>
     * @param StoragePayMode <p>集群存储计费模式，按量计费：0，包年包月：1。默认按量计费<br>当DbType为MYSQL时，在集群计算计费模式为后付费（包括DbMode为SERVERLESS）时，存储计费模式仅可为按量计费<br>回档与克隆均不支持包年包月存储</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>安全组id数组</p> 
     * @return SecurityGroupIds <p>安全组id数组</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组id数组</p>
     * @param SecurityGroupIds <p>安全组id数组</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>告警策略Id数组</p> 
     * @return AlarmPolicyIds <p>告警策略Id数组</p>
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set <p>告警策略Id数组</p>
     * @param AlarmPolicyIds <p>告警策略Id数组</p>
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get <p>参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感</p> 
     * @return ClusterParams <p>参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感</p>
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set <p>参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感</p>
     * @param ClusterParams <p>参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感</p>
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get <p>交易模式</p><p>枚举值：</p><ul><li>0： 下单且支付</li><li>1： 下单</li></ul><p>默认值：0</p> 
     * @return DealMode <p>交易模式</p><p>枚举值：</p><ul><li>0： 下单且支付</li><li>1： 下单</li></ul><p>默认值：0</p>
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set <p>交易模式</p><p>枚举值：</p><ul><li>0： 下单且支付</li><li>1： 下单</li></ul><p>默认值：0</p>
     * @param DealMode <p>交易模式</p><p>枚举值：</p><ul><li>0： 下单且支付</li><li>1： 下单</li></ul><p>默认值：0</p>
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get <p>参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID</p> 
     * @return ParamTemplateId <p>参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID</p>
     * @param ParamTemplateId <p>参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>多可用区地址</p> 
     * @return SlaveZone <p>多可用区地址</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>多可用区地址</p>
     * @param SlaveZone <p>多可用区地址</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>实例初始化配置信息，主要用于购买集群时选不同规格实例</p> 
     * @return InstanceInitInfos <p>实例初始化配置信息，主要用于购买集群时选不同规格实例</p>
     */
    public InstanceInitInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set <p>实例初始化配置信息，主要用于购买集群时选不同规格实例</p>
     * @param InstanceInitInfos <p>实例初始化配置信息，主要用于购买集群时选不同规格实例</p>
     */
    public void setInstanceInitInfos(InstanceInitInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get <p>全球数据库唯一标识</p> 
     * @return GdnId <p>全球数据库唯一标识</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>全球数据库唯一标识</p>
     * @param GdnId <p>全球数据库唯一标识</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get <p>数据库代理配置</p> 
     * @return ProxyConfig <p>数据库代理配置</p>
     */
    public ProxyConfig getProxyConfig() {
        return this.ProxyConfig;
    }

    /**
     * Set <p>数据库代理配置</p>
     * @param ProxyConfig <p>数据库代理配置</p>
     */
    public void setProxyConfig(ProxyConfig ProxyConfig) {
        this.ProxyConfig = ProxyConfig;
    }

    /**
     * Get <p>是否自动归档</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：no</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p> 
     * @return AutoArchive <p>是否自动归档</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：no</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set <p>是否自动归档</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：no</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
     * @param AutoArchive <p>是否自动归档</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul><p>默认值：no</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get <p>暂停后的归档处理时间</p><p>单位：时</p><p>默认值：12</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p> 
     * @return AutoArchiveDelayHours <p>暂停后的归档处理时间</p><p>单位：时</p><p>默认值：12</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
     */
    public Long getAutoArchiveDelayHours() {
        return this.AutoArchiveDelayHours;
    }

    /**
     * Set <p>暂停后的归档处理时间</p><p>单位：时</p><p>默认值：12</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
     * @param AutoArchiveDelayHours <p>暂停后的归档处理时间</p><p>单位：时</p><p>默认值：12</p><p>仅当前集群主实例为SERVERLESS时，该参数生效</p>
     */
    public void setAutoArchiveDelayHours(Long AutoArchiveDelayHours) {
        this.AutoArchiveDelayHours = AutoArchiveDelayHours;
    }

    /**
     * Get <p>集群级别，可空。例如 P0, P1。（可忽略该字段）</p> 
     * @return ClusterLevel <p>集群级别，可空。例如 P0, P1。（可忽略该字段）</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>集群级别，可空。例如 P0, P1。（可忽略该字段）</p>
     * @param ClusterLevel <p>集群级别，可空。例如 P0, P1。（可忽略该字段）</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get <p>内核小版本号</p> 
     * @return CynosVersion <p>内核小版本号</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>内核小版本号</p>
     * @param CynosVersion <p>内核小版本号</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
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
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
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
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new InstanceInitInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new InstanceInitInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.ProxyConfig != null) {
            this.ProxyConfig = new ProxyConfig(source.ProxyConfig);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.AutoArchiveDelayHours != null) {
            this.AutoArchiveDelayHours = new Long(source.AutoArchiveDelayHours);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
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
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
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
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamObj(map, prefix + "ProxyConfig.", this.ProxyConfig);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "AutoArchiveDelayHours", this.AutoArchiveDelayHours);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);

    }
}

