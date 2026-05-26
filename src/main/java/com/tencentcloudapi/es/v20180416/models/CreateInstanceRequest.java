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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例版本（支持&quot;5.6.4&quot;、&quot;6.4.3&quot;、&quot;6.8.2&quot;、&quot;7.5.1&quot;、&quot;7.10.1&quot;）</p>
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>已废弃请使用NodeInfoList<br>节点数量（2-50个）</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>包年包月购买时长（单位由参数TimeUnit决定）</p>
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * <p>自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>已废弃请使用NodeInfoList<br>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>已废弃请使用NodeInfoList<br>节点磁盘容量（单位GB）</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID列表（目前仅支持指定一张代金券）</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>已废弃请使用NodeInfoList<br>是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false</p>
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）</p>
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * <p>已废弃请使用NodeInfoList<br>专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）</p>
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * <p>集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）</p>
    */
    @SerializedName("ClusterNameInConf")
    @Expose
    private String ClusterNameInConf;

    /**
    * <p>集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>多可用区部署时可用区的详细信息(DeployMode为1时必传)</p>
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等</p>
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * <p>节点标签信息列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * <p>场景化模板类型 0：不启用 1：通用 2：日志 3：搜索</p>
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * <p>可视化节点配置</p>
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * <p>创建https集群，默认是http</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>可维护时间段</p>
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDuration OperationDuration;

    /**
    * <p>是否开启存算分离</p>
    */
    @SerializedName("EnableHybridStorage")
    @Expose
    private Boolean EnableHybridStorage;

    /**
    * <p>硬盘额外性能</p>
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * <p>是否开启智能巡检</p>
    */
    @SerializedName("EnableDiagnose")
    @Expose
    private Boolean EnableDiagnose;

    /**
    * <p>cdcId，使用cdc子网时传递</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>置放群组亲和度，范围[0,10]，0表示不开启</p>
    */
    @SerializedName("DisasterRecoverGroupAffinity")
    @Expose
    private Long DisasterRecoverGroupAffinity;

    /**
    * <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * <p>置放群组是否开启异步任务</p>
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * <p>置放群组开启异步任务的可维护时间段</p>
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
    * <p>自动扩盘参数列表</p>
    */
    @SerializedName("AutoScaleDiskInfoList")
    @Expose
    private AutoScaleDiskInfo [] AutoScaleDiskInfoList;

    /**
    * <p>是否开启kibana公网访问，不传默认开启</p>
    */
    @SerializedName("EnableKibanaPublicAccess")
    @Expose
    private String EnableKibanaPublicAccess;

    /**
    * <p>已有的云监控告警策略 ID</p>
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

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
     * Get <p>实例版本（支持&quot;5.6.4&quot;、&quot;6.4.3&quot;、&quot;6.8.2&quot;、&quot;7.5.1&quot;、&quot;7.10.1&quot;）</p> 
     * @return EsVersion <p>实例版本（支持&quot;5.6.4&quot;、&quot;6.4.3&quot;、&quot;6.8.2&quot;、&quot;7.5.1&quot;、&quot;7.10.1&quot;）</p>
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set <p>实例版本（支持&quot;5.6.4&quot;、&quot;6.4.3&quot;、&quot;6.8.2&quot;、&quot;7.5.1&quot;、&quot;7.10.1&quot;）</p>
     * @param EsVersion <p>实例版本（支持&quot;5.6.4&quot;、&quot;6.4.3&quot;、&quot;6.8.2&quot;、&quot;7.5.1&quot;、&quot;7.10.1&quot;）</p>
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return VpcId <p>私有网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param VpcId <p>私有网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p> 
     * @return Password <p>访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
     * @param Password <p>访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&amp;^*+=_:;,.?]的特殊符号）</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p> 
     * @return InstanceName <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
     * @param InstanceName <p>实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>节点数量（2-50个）</p> 
     * @return NodeNum <p>已废弃请使用NodeInfoList<br>节点数量（2-50个）</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>节点数量（2-50个）</p>
     * @param NodeNum <p>已废弃请使用NodeInfoList<br>节点数量（2-50个）</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR</p> 
     * @return ChargeType <p>计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR</p>
     * @param ChargeType <p>计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>包年包月购买时长（单位由参数TimeUnit决定）</p> 
     * @return ChargePeriod <p>包年包月购买时长（单位由参数TimeUnit决定）</p>
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set <p>包年包月购买时长（单位由参数TimeUnit决定）</p>
     * @param ChargePeriod <p>包年包月购买时长（单位由参数TimeUnit决定）</p>
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get <p>自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费</p> 
     * @return RenewFlag <p>自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费</p>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费</p>
     * @param RenewFlag <p>自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费</p>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p> 
     * @return NodeType <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     * @param NodeType <p>已废弃请使用NodeInfoList<br>节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD</p> 
     * @return DiskType <p>已废弃请使用NodeInfoList<br>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD</p>
     * @param DiskType <p>已废弃请使用NodeInfoList<br>节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>节点磁盘容量（单位GB）</p> 
     * @return DiskSize <p>已废弃请使用NodeInfoList<br>节点磁盘容量（单位GB）</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>节点磁盘容量（单位GB）</p>
     * @param DiskSize <p>已废弃请使用NodeInfoList<br>节点磁盘容量（单位GB）</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）</p> 
     * @return TimeUnit <p>计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）</p>
     * @param TimeUnit <p>计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0</p> 
     * @return AutoVoucher <p>是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0</p>
     * @param AutoVoucher <p>是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID列表（目前仅支持指定一张代金券）</p> 
     * @return VoucherIds <p>代金券ID列表（目前仅支持指定一张代金券）</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID列表（目前仅支持指定一张代金券）</p>
     * @param VoucherIds <p>代金券ID列表（目前仅支持指定一张代金券）</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false</p> 
     * @return EnableDedicatedMaster <p>已废弃请使用NodeInfoList<br>是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false</p>
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false</p>
     * @param EnableDedicatedMaster <p>已废弃请使用NodeInfoList<br>是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false</p>
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）</p> 
     * @return MasterNodeNum <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）</p>
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）</p>
     * @param MasterNodeNum <p>已废弃请使用NodeInfoList<br>专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）</p>
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p> 
     * @return MasterNodeType <p>已废弃请使用NodeInfoList<br>专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     * @param MasterNodeType <p>已废弃请使用NodeInfoList<br>专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li></p>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）</p> 
     * @return MasterNodeDiskSize <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）</p>
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）</p>
     * @param MasterNodeDiskSize <p>已废弃请使用NodeInfoList<br>专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）</p>
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get <p>集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）</p> 
     * @return ClusterNameInConf <p>集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）</p>
     */
    public String getClusterNameInConf() {
        return this.ClusterNameInConf;
    }

    /**
     * Set <p>集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）</p>
     * @param ClusterNameInConf <p>集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）</p>
     */
    public void setClusterNameInConf(String ClusterNameInConf) {
        this.ClusterNameInConf = ClusterNameInConf;
    }

    /**
     * Get <p>集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0</p> 
     * @return DeployMode <p>集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0</p>
     * @param DeployMode <p>集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>多可用区部署时可用区的详细信息(DeployMode为1时必传)</p> 
     * @return MultiZoneInfo <p>多可用区部署时可用区的详细信息(DeployMode为1时必传)</p>
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set <p>多可用区部署时可用区的详细信息(DeployMode为1时必传)</p>
     * @param MultiZoneInfo <p>多可用区部署时可用区的详细信息(DeployMode为1时必传)</p>
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p> 
     * @return LicenseType <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
     * @param LicenseType <p>License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等</p> 
     * @return NodeInfoList <p>节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等</p>
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set <p>节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等</p>
     * @param NodeInfoList <p>节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等</p>
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get <p>节点标签信息列表</p> 
     * @return TagList <p>节点标签信息列表</p>
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>节点标签信息列表</p>
     * @param TagList <p>节点标签信息列表</p>
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p> 
     * @return BasicSecurityType <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
     * @param BasicSecurityType <p>6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li></p>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get <p>场景化模板类型 0：不启用 1：通用 2：日志 3：搜索</p> 
     * @return SceneType <p>场景化模板类型 0：不启用 1：通用 2：日志 3：搜索</p>
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>场景化模板类型 0：不启用 1：通用 2：日志 3：搜索</p>
     * @param SceneType <p>场景化模板类型 0：不启用 1：通用 2：日志 3：搜索</p>
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>可视化节点配置</p> 
     * @return WebNodeTypeInfo <p>可视化节点配置</p>
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set <p>可视化节点配置</p>
     * @param WebNodeTypeInfo <p>可视化节点配置</p>
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get <p>创建https集群，默认是http</p> 
     * @return Protocol <p>创建https集群，默认是http</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>创建https集群，默认是http</p>
     * @param Protocol <p>创建https集群，默认是http</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>可维护时间段</p> 
     * @return OperationDuration <p>可维护时间段</p>
     */
    public OperationDuration getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set <p>可维护时间段</p>
     * @param OperationDuration <p>可维护时间段</p>
     */
    public void setOperationDuration(OperationDuration OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get <p>是否开启存算分离</p> 
     * @return EnableHybridStorage <p>是否开启存算分离</p>
     */
    public Boolean getEnableHybridStorage() {
        return this.EnableHybridStorage;
    }

    /**
     * Set <p>是否开启存算分离</p>
     * @param EnableHybridStorage <p>是否开启存算分离</p>
     */
    public void setEnableHybridStorage(Boolean EnableHybridStorage) {
        this.EnableHybridStorage = EnableHybridStorage;
    }

    /**
     * Get <p>硬盘额外性能</p> 
     * @return DiskEnhance <p>硬盘额外性能</p>
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set <p>硬盘额外性能</p>
     * @param DiskEnhance <p>硬盘额外性能</p>
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get <p>是否开启智能巡检</p> 
     * @return EnableDiagnose <p>是否开启智能巡检</p>
     */
    public Boolean getEnableDiagnose() {
        return this.EnableDiagnose;
    }

    /**
     * Set <p>是否开启智能巡检</p>
     * @param EnableDiagnose <p>是否开启智能巡检</p>
     */
    public void setEnableDiagnose(Boolean EnableDiagnose) {
        this.EnableDiagnose = EnableDiagnose;
    }

    /**
     * Get <p>cdcId，使用cdc子网时传递</p> 
     * @return CdcId <p>cdcId，使用cdc子网时传递</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>cdcId，使用cdc子网时传递</p>
     * @param CdcId <p>cdcId，使用cdc子网时传递</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>置放群组亲和度，范围[0,10]，0表示不开启</p> 
     * @return DisasterRecoverGroupAffinity <p>置放群组亲和度，范围[0,10]，0表示不开启</p>
     */
    public Long getDisasterRecoverGroupAffinity() {
        return this.DisasterRecoverGroupAffinity;
    }

    /**
     * Set <p>置放群组亲和度，范围[0,10]，0表示不开启</p>
     * @param DisasterRecoverGroupAffinity <p>置放群组亲和度，范围[0,10]，0表示不开启</p>
     */
    public void setDisasterRecoverGroupAffinity(Long DisasterRecoverGroupAffinity) {
        this.DisasterRecoverGroupAffinity = DisasterRecoverGroupAffinity;
    }

    /**
     * Get <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p> 
     * @return SubProductCode <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
     * @param SubProductCode <p>子产品ID枚举值： 开源版：&quot;sp_es_io2&quot;， 基础版：&quot;sp_es_basic&quot;，白金版：&quot;sp_es_platinum&quot;，企业版：&quot;sp_es_enterprise&quot;，CDC白金版：&quot;sp_es_cdc_platinum&quot;，日志增强版：&quot;sp_es_enlogging&quot;，tsearch：&quot;sp_tsearch_io2&quot;，logstash：&quot;sp_es_logstash&quot; ，可以为空，为空的时候后台取LicenseType映射该字段</p>
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p> 
     * @return ReadWriteMode <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
     * @param ReadWriteMode <p>读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离</p>
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get <p>置放群组是否开启异步任务</p> 
     * @return EnableScheduleRecoverGroup <p>置放群组是否开启异步任务</p>
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set <p>置放群组是否开启异步任务</p>
     * @param EnableScheduleRecoverGroup <p>置放群组是否开启异步任务</p>
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get <p>置放群组开启异步任务的可维护时间段</p> 
     * @return EnableScheduleOperationDuration <p>置放群组开启异步任务的可维护时间段</p>
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set <p>置放群组开启异步任务的可维护时间段</p>
     * @param EnableScheduleOperationDuration <p>置放群组开启异步任务的可维护时间段</p>
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    /**
     * Get <p>自动扩盘参数列表</p> 
     * @return AutoScaleDiskInfoList <p>自动扩盘参数列表</p>
     */
    public AutoScaleDiskInfo [] getAutoScaleDiskInfoList() {
        return this.AutoScaleDiskInfoList;
    }

    /**
     * Set <p>自动扩盘参数列表</p>
     * @param AutoScaleDiskInfoList <p>自动扩盘参数列表</p>
     */
    public void setAutoScaleDiskInfoList(AutoScaleDiskInfo [] AutoScaleDiskInfoList) {
        this.AutoScaleDiskInfoList = AutoScaleDiskInfoList;
    }

    /**
     * Get <p>是否开启kibana公网访问，不传默认开启</p> 
     * @return EnableKibanaPublicAccess <p>是否开启kibana公网访问，不传默认开启</p>
     */
    public String getEnableKibanaPublicAccess() {
        return this.EnableKibanaPublicAccess;
    }

    /**
     * Set <p>是否开启kibana公网访问，不传默认开启</p>
     * @param EnableKibanaPublicAccess <p>是否开启kibana公网访问，不传默认开启</p>
     */
    public void setEnableKibanaPublicAccess(String EnableKibanaPublicAccess) {
        this.EnableKibanaPublicAccess = EnableKibanaPublicAccess;
    }

    /**
     * Get <p>已有的云监控告警策略 ID</p> 
     * @return AlarmPolicyIds <p>已有的云监控告警策略 ID</p>
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set <p>已有的云监控告警策略 ID</p>
     * @param AlarmPolicyIds <p>已有的云监控告警策略 ID</p>
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ChargePeriod != null) {
            this.ChargePeriod = new Long(source.ChargePeriod);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.EnableDedicatedMaster != null) {
            this.EnableDedicatedMaster = new Boolean(source.EnableDedicatedMaster);
        }
        if (source.MasterNodeNum != null) {
            this.MasterNodeNum = new Long(source.MasterNodeNum);
        }
        if (source.MasterNodeType != null) {
            this.MasterNodeType = new String(source.MasterNodeType);
        }
        if (source.MasterNodeDiskSize != null) {
            this.MasterNodeDiskSize = new Long(source.MasterNodeDiskSize);
        }
        if (source.ClusterNameInConf != null) {
            this.ClusterNameInConf = new String(source.ClusterNameInConf);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.MultiZoneInfo != null) {
            this.MultiZoneInfo = new ZoneDetail[source.MultiZoneInfo.length];
            for (int i = 0; i < source.MultiZoneInfo.length; i++) {
                this.MultiZoneInfo[i] = new ZoneDetail(source.MultiZoneInfo[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.NodeInfoList != null) {
            this.NodeInfoList = new NodeInfo[source.NodeInfoList.length];
            for (int i = 0; i < source.NodeInfoList.length; i++) {
                this.NodeInfoList[i] = new NodeInfo(source.NodeInfoList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.SceneType != null) {
            this.SceneType = new Long(source.SceneType);
        }
        if (source.WebNodeTypeInfo != null) {
            this.WebNodeTypeInfo = new WebNodeTypeInfo(source.WebNodeTypeInfo);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.OperationDuration != null) {
            this.OperationDuration = new OperationDuration(source.OperationDuration);
        }
        if (source.EnableHybridStorage != null) {
            this.EnableHybridStorage = new Boolean(source.EnableHybridStorage);
        }
        if (source.DiskEnhance != null) {
            this.DiskEnhance = new Long(source.DiskEnhance);
        }
        if (source.EnableDiagnose != null) {
            this.EnableDiagnose = new Boolean(source.EnableDiagnose);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DisasterRecoverGroupAffinity != null) {
            this.DisasterRecoverGroupAffinity = new Long(source.DisasterRecoverGroupAffinity);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.ReadWriteMode != null) {
            this.ReadWriteMode = new Long(source.ReadWriteMode);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
        if (source.AutoScaleDiskInfoList != null) {
            this.AutoScaleDiskInfoList = new AutoScaleDiskInfo[source.AutoScaleDiskInfoList.length];
            for (int i = 0; i < source.AutoScaleDiskInfoList.length; i++) {
                this.AutoScaleDiskInfoList[i] = new AutoScaleDiskInfo(source.AutoScaleDiskInfoList[i]);
            }
        }
        if (source.EnableKibanaPublicAccess != null) {
            this.EnableKibanaPublicAccess = new String(source.EnableKibanaPublicAccess);
        }
        if (source.AlarmPolicyIds != null) {
            this.AlarmPolicyIds = new String[source.AlarmPolicyIds.length];
            for (int i = 0; i < source.AlarmPolicyIds.length; i++) {
                this.AlarmPolicyIds[i] = new String(source.AlarmPolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "EnableDedicatedMaster", this.EnableDedicatedMaster);
        this.setParamSimple(map, prefix + "MasterNodeNum", this.MasterNodeNum);
        this.setParamSimple(map, prefix + "MasterNodeType", this.MasterNodeType);
        this.setParamSimple(map, prefix + "MasterNodeDiskSize", this.MasterNodeDiskSize);
        this.setParamSimple(map, prefix + "ClusterNameInConf", this.ClusterNameInConf);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamArrayObj(map, prefix + "MultiZoneInfo.", this.MultiZoneInfo);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamArrayObj(map, prefix + "NodeInfoList.", this.NodeInfoList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamObj(map, prefix + "WebNodeTypeInfo.", this.WebNodeTypeInfo);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "OperationDuration.", this.OperationDuration);
        this.setParamSimple(map, prefix + "EnableHybridStorage", this.EnableHybridStorage);
        this.setParamSimple(map, prefix + "DiskEnhance", this.DiskEnhance);
        this.setParamSimple(map, prefix + "EnableDiagnose", this.EnableDiagnose);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupAffinity", this.DisasterRecoverGroupAffinity);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "ReadWriteMode", this.ReadWriteMode);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);
        this.setParamArrayObj(map, prefix + "AutoScaleDiskInfoList.", this.AutoScaleDiskInfoList);
        this.setParamSimple(map, prefix + "EnableKibanaPublicAccess", this.EnableKibanaPublicAccess);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);

    }
}

