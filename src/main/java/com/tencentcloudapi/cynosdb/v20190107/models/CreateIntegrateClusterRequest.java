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

public class CreateIntegrateClusterRequest extends AbstractModel {

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
    * 端口，默认3306，取值范围[0, 65535)
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
    * 购买集群数，可选值范围[1,3]，默认为1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 普通实例存储上限，单位GB
当DbType为MYSQL，且存储计费模式为预付费时，该参数需不大于cpu与memory对应存储规格上限
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

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
    * 包年包月购买是否自动续费，默认为0。
0标识默认续费方式，1表示自动续费，2表示不自动续费。
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
    * 集群创建需要绑定的tag数组信息
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

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
    * 参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感
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
    * 参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * 多可用区地址
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * 实例初始化配置信息，主要用于购买集群时选不同规格实例
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private IntegrateInstanceInfo [] InstanceInitInfos;

    /**
    * 全球数据库唯一标识
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * 数据库代理配置
    */
    @SerializedName("ProxyConfig")
    @Expose
    private ProxyConfigInfo ProxyConfig;

    /**
    * 是否自动归档
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * 暂停后的归档处理时间
    */
    @SerializedName("AutoArchiveDelayHours")
    @Expose
    private Long AutoArchiveDelayHours;

    /**
    * 加密方法（由加密算法和密钥对版本组成）
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
    * 集成集群配置信息
    */
    @SerializedName("IntegrateCreateClusterConfig")
    @Expose
    private IntegrateCreateClusterConfig IntegrateCreateClusterConfig;

    /**
    * 存储架构类型。 枚举值：1.0/2.0 默认值：1.0
    */
    @SerializedName("StorageVersion")
    @Expose
    private String StorageVersion;

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
     * Get 端口，默认3306，取值范围[0, 65535) 
     * @return Port 端口，默认3306，取值范围[0, 65535)
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口，默认3306，取值范围[0, 65535)
     * @param Port 端口，默认3306，取值范围[0, 65535)
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
     * Get 购买集群数，可选值范围[1,3]，默认为1 
     * @return Count 购买集群数，可选值范围[1,3]，默认为1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买集群数，可选值范围[1,3]，默认为1
     * @param Count 购买集群数，可选值范围[1,3]，默认为1
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get 包年包月购买是否自动续费，默认为0。
0标识默认续费方式，1表示自动续费，2表示不自动续费。 
     * @return AutoRenewFlag 包年包月购买是否自动续费，默认为0。
0标识默认续费方式，1表示自动续费，2表示不自动续费。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 包年包月购买是否自动续费，默认为0。
0标识默认续费方式，1表示自动续费，2表示不自动续费。
     * @param AutoRenewFlag 包年包月购买是否自动续费，默认为0。
0标识默认续费方式，1表示自动续费，2表示不自动续费。
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
     * Get 参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感 
     * @return ClusterParams 参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set 参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感
     * @param ClusterParams 参数数组，暂时支持character_set_server （utf8｜latin1｜gbk｜utf8mb4） ，lower_case_table_names，1-大小写不敏感，0-大小写敏感
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
     * Get 参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID 
     * @return ParamTemplateId 参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set 参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID
     * @param ParamTemplateId 参数模板ID，可以通过查询参数模板信息DescribeParamTemplates获得参数模板ID
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get 多可用区地址 
     * @return SlaveZone 多可用区地址
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 多可用区地址
     * @param SlaveZone 多可用区地址
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get 实例初始化配置信息，主要用于购买集群时选不同规格实例 
     * @return InstanceInitInfos 实例初始化配置信息，主要用于购买集群时选不同规格实例
     */
    public IntegrateInstanceInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set 实例初始化配置信息，主要用于购买集群时选不同规格实例
     * @param InstanceInitInfos 实例初始化配置信息，主要用于购买集群时选不同规格实例
     */
    public void setInstanceInitInfos(IntegrateInstanceInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get 全球数据库唯一标识 
     * @return GdnId 全球数据库唯一标识
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set 全球数据库唯一标识
     * @param GdnId 全球数据库唯一标识
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get 数据库代理配置 
     * @return ProxyConfig 数据库代理配置
     */
    public ProxyConfigInfo getProxyConfig() {
        return this.ProxyConfig;
    }

    /**
     * Set 数据库代理配置
     * @param ProxyConfig 数据库代理配置
     */
    public void setProxyConfig(ProxyConfigInfo ProxyConfig) {
        this.ProxyConfig = ProxyConfig;
    }

    /**
     * Get 是否自动归档 
     * @return AutoArchive 是否自动归档
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set 是否自动归档
     * @param AutoArchive 是否自动归档
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get 暂停后的归档处理时间 
     * @return AutoArchiveDelayHours 暂停后的归档处理时间
     */
    public Long getAutoArchiveDelayHours() {
        return this.AutoArchiveDelayHours;
    }

    /**
     * Set 暂停后的归档处理时间
     * @param AutoArchiveDelayHours 暂停后的归档处理时间
     */
    public void setAutoArchiveDelayHours(Long AutoArchiveDelayHours) {
        this.AutoArchiveDelayHours = AutoArchiveDelayHours;
    }

    /**
     * Get 加密方法（由加密算法和密钥对版本组成） 
     * @return EncryptMethod 加密方法（由加密算法和密钥对版本组成）
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set 加密方法（由加密算法和密钥对版本组成）
     * @param EncryptMethod 加密方法（由加密算法和密钥对版本组成）
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get 集成集群配置信息 
     * @return IntegrateCreateClusterConfig 集成集群配置信息
     */
    public IntegrateCreateClusterConfig getIntegrateCreateClusterConfig() {
        return this.IntegrateCreateClusterConfig;
    }

    /**
     * Set 集成集群配置信息
     * @param IntegrateCreateClusterConfig 集成集群配置信息
     */
    public void setIntegrateCreateClusterConfig(IntegrateCreateClusterConfig IntegrateCreateClusterConfig) {
        this.IntegrateCreateClusterConfig = IntegrateCreateClusterConfig;
    }

    /**
     * Get 存储架构类型。 枚举值：1.0/2.0 默认值：1.0 
     * @return StorageVersion 存储架构类型。 枚举值：1.0/2.0 默认值：1.0
     */
    public String getStorageVersion() {
        return this.StorageVersion;
    }

    /**
     * Set 存储架构类型。 枚举值：1.0/2.0 默认值：1.0
     * @param StorageVersion 存储架构类型。 枚举值：1.0/2.0 默认值：1.0
     */
    public void setStorageVersion(String StorageVersion) {
        this.StorageVersion = StorageVersion;
    }

    public CreateIntegrateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrateClusterRequest(CreateIntegrateClusterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
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
            this.InstanceInitInfos = new IntegrateInstanceInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new IntegrateInstanceInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.ProxyConfig != null) {
            this.ProxyConfig = new ProxyConfigInfo(source.ProxyConfig);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.AutoArchiveDelayHours != null) {
            this.AutoArchiveDelayHours = new Long(source.AutoArchiveDelayHours);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
        if (source.IntegrateCreateClusterConfig != null) {
            this.IntegrateCreateClusterConfig = new IntegrateCreateClusterConfig(source.IntegrateCreateClusterConfig);
        }
        if (source.StorageVersion != null) {
            this.StorageVersion = new String(source.StorageVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
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
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamObj(map, prefix + "IntegrateCreateClusterConfig.", this.IntegrateCreateClusterConfig);
        this.setParamSimple(map, prefix + "StorageVersion", this.StorageVersion);

    }
}

