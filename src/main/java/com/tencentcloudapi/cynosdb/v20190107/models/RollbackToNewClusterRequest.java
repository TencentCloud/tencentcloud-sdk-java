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

public class RollbackToNewClusterRequest extends AbstractModel {

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>回档时，传入源集群ID，用于查找源poolId</p>
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * <p>所属VPC网络ID</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>所属子网ID</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>集群名称，长度小于64个字符，每个字符取值范围：大/小写字母，数字，特殊符号（&#39;-&#39;,&#39;_&#39;,&#39;.&#39;）</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>快照回档，表示snapshotId；时间点回档，表示queryId，为0，表示需要判断时间点是否有效</p>
    */
    @SerializedName("RollbackId")
    @Expose
    private Long RollbackId;

    /**
    * <p>时间点回档，指定时间；快照回档，快照时间</p>
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * <p>是否自动选择代金券 1是 0否 默认为0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>集群创建需要绑定的tag数组信息</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>Db类型<br>当DbType为MYSQL时可选(默认NORMAL)：</p><li>NORMAL</li><li>SERVERLESS</li>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>当DbMode为SEVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>当DbMode为SEVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>默认值:yes
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

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
    * <p>参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>实例初始化配置信息，主要用于购买集群时选不同规格实例</p>
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private InstanceInitInfo [] InstanceInitInfos;

    /**
    * <p>0-下单并支付 1-下单</p>
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * <p>计算节点付费模式：0-按量计费，1-预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>时间</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>单位</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>回档库信息</p>
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * <p>回档表信息</p>
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * <p>原ro实例信息</p>
    */
    @SerializedName("OriginalROInstanceList")
    @Expose
    private String [] OriginalROInstanceList;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * <p>是否从保存备份中恢复</p>
    */
    @SerializedName("FromSaveBackup")
    @Expose
    private Boolean FromSaveBackup;

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
     * Get <p>所属VPC网络ID</p> 
     * @return UniqVpcId <p>所属VPC网络ID</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>所属VPC网络ID</p>
     * @param UniqVpcId <p>所属VPC网络ID</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>所属子网ID</p> 
     * @return UniqSubnetId <p>所属子网ID</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>所属子网ID</p>
     * @param UniqSubnetId <p>所属子网ID</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
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
     * Get <p>是否自动选择代金券 1是 0否 默认为0</p> 
     * @return AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券 1是 0否 默认为0</p>
     * @param AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
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
     * Get <p>Db类型<br>当DbType为MYSQL时可选(默认NORMAL)：</p><li>NORMAL</li><li>SERVERLESS</li> 
     * @return DbMode <p>Db类型<br>当DbType为MYSQL时可选(默认NORMAL)：</p><li>NORMAL</li><li>SERVERLESS</li>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>Db类型<br>当DbType为MYSQL时可选(默认NORMAL)：</p><li>NORMAL</li><li>SERVERLESS</li>
     * @param DbMode <p>Db类型<br>当DbType为MYSQL时可选(默认NORMAL)：</p><li>NORMAL</li><li>SERVERLESS</li>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>当DbMode为SEVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MinCpu <p>当DbMode为SEVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>当DbMode为SEVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MinCpu <p>当DbMode为SEVERLESS时必填<br>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>当DbMode为SEVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MaxCpu <p>当DbMode为SEVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>当DbMode为SEVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MaxCpu <p>当DbMode为SEVERLESS时必填：<br>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>默认值:yes 
     * @return AutoPause <p>当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>默认值:yes
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>默认值:yes
     * @param AutoPause <p>当DbMode为SEVERLESS时，指定集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>默认值:yes
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p> 
     * @return AutoPauseDelay <p>当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
     * @param AutoPauseDelay <p>当DbMode为SEVERLESS时，指定集群自动暂停的延迟，单位秒，可选范围[600,691200]<br>默认值:600</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
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
     * Get <p>0-下单并支付 1-下单</p> 
     * @return DealMode <p>0-下单并支付 1-下单</p>
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set <p>0-下单并支付 1-下单</p>
     * @param DealMode <p>0-下单并支付 1-下单</p>
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get <p>计算节点付费模式：0-按量计费，1-预付费</p> 
     * @return PayMode <p>计算节点付费模式：0-按量计费，1-预付费</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计算节点付费模式：0-按量计费，1-预付费</p>
     * @param PayMode <p>计算节点付费模式：0-按量计费，1-预付费</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>时间</p> 
     * @return TimeSpan <p>时间</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>时间</p>
     * @param TimeSpan <p>时间</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>单位</p> 
     * @return TimeUnit <p>单位</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>单位</p>
     * @param TimeUnit <p>单位</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>回档库信息</p> 
     * @return RollbackDatabases <p>回档库信息</p>
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set <p>回档库信息</p>
     * @param RollbackDatabases <p>回档库信息</p>
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get <p>回档表信息</p> 
     * @return RollbackTables <p>回档表信息</p>
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set <p>回档表信息</p>
     * @param RollbackTables <p>回档表信息</p>
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get <p>原ro实例信息</p> 
     * @return OriginalROInstanceList <p>原ro实例信息</p>
     */
    public String [] getOriginalROInstanceList() {
        return this.OriginalROInstanceList;
    }

    /**
     * Set <p>原ro实例信息</p>
     * @param OriginalROInstanceList <p>原ro实例信息</p>
     */
    public void setOriginalROInstanceList(String [] OriginalROInstanceList) {
        this.OriginalROInstanceList = OriginalROInstanceList;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectId <p>项目id</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectId <p>项目id</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p> 
     * @return AutoArchive <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
     * @param AutoArchive <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get <p>是否从保存备份中恢复</p> 
     * @return FromSaveBackup <p>是否从保存备份中恢复</p>
     */
    public Boolean getFromSaveBackup() {
        return this.FromSaveBackup;
    }

    /**
     * Set <p>是否从保存备份中恢复</p>
     * @param FromSaveBackup <p>是否从保存备份中恢复</p>
     */
    public void setFromSaveBackup(Boolean FromSaveBackup) {
        this.FromSaveBackup = FromSaveBackup;
    }

    public RollbackToNewClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackToNewClusterRequest(RollbackToNewClusterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.OriginalClusterId != null) {
            this.OriginalClusterId = new String(source.OriginalClusterId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RollbackId != null) {
            this.RollbackId = new Long(source.RollbackId);
        }
        if (source.ExpectTime != null) {
            this.ExpectTime = new String(source.ExpectTime);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
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
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new InstanceInitInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new InstanceInitInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.RollbackDatabases != null) {
            this.RollbackDatabases = new RollbackDatabase[source.RollbackDatabases.length];
            for (int i = 0; i < source.RollbackDatabases.length; i++) {
                this.RollbackDatabases[i] = new RollbackDatabase(source.RollbackDatabases[i]);
            }
        }
        if (source.RollbackTables != null) {
            this.RollbackTables = new RollbackTable[source.RollbackTables.length];
            for (int i = 0; i < source.RollbackTables.length; i++) {
                this.RollbackTables[i] = new RollbackTable(source.RollbackTables[i]);
            }
        }
        if (source.OriginalROInstanceList != null) {
            this.OriginalROInstanceList = new String[source.OriginalROInstanceList.length];
            for (int i = 0; i < source.OriginalROInstanceList.length; i++) {
                this.OriginalROInstanceList[i] = new String(source.OriginalROInstanceList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.FromSaveBackup != null) {
            this.FromSaveBackup = new Boolean(source.FromSaveBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OriginalClusterId", this.OriginalClusterId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RollbackId", this.RollbackId);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);
        this.setParamArrayObj(map, prefix + "ClusterParams.", this.ClusterParams);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamArrayObj(map, prefix + "RollbackDatabases.", this.RollbackDatabases);
        this.setParamArrayObj(map, prefix + "RollbackTables.", this.RollbackTables);
        this.setParamArraySimple(map, prefix + "OriginalROInstanceList.", this.OriginalROInstanceList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "FromSaveBackup", this.FromSaveBackup);

    }
}

