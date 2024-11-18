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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"、"7.10.1"）
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 已废弃请使用NodeInfoList
节点数量（2-50个）
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 包年包月购买时长（单位由参数TimeUnit决定）
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Long ChargePeriod;

    /**
    * 自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 已废弃请使用NodeInfoList
节点磁盘容量（单位GB）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 代金券ID列表（目前仅支持指定一张代金券）
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 已废弃请使用NodeInfoList
是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false
    */
    @SerializedName("EnableDedicatedMaster")
    @Expose
    private Boolean EnableDedicatedMaster;

    /**
    * 已废弃请使用NodeInfoList
专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）
    */
    @SerializedName("MasterNodeNum")
    @Expose
    private Long MasterNodeNum;

    /**
    * 已废弃请使用NodeInfoList
专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("MasterNodeType")
    @Expose
    private String MasterNodeType;

    /**
    * 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）
    */
    @SerializedName("MasterNodeDiskSize")
    @Expose
    private Long MasterNodeDiskSize;

    /**
    * 集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）
    */
    @SerializedName("ClusterNameInConf")
    @Expose
    private String ClusterNameInConf;

    /**
    * 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 多可用区部署时可用区的详细信息(DeployMode为1时必传)
    */
    @SerializedName("MultiZoneInfo")
    @Expose
    private ZoneDetail [] MultiZoneInfo;

    /**
    * License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * 节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等
    */
    @SerializedName("NodeInfoList")
    @Expose
    private NodeInfo [] NodeInfoList;

    /**
    * 节点标签信息列表
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * 场景化模板类型 0：不启用 1：通用 2：日志 3：搜索
    */
    @SerializedName("SceneType")
    @Expose
    private Long SceneType;

    /**
    * 可视化节点配置
    */
    @SerializedName("WebNodeTypeInfo")
    @Expose
    private WebNodeTypeInfo WebNodeTypeInfo;

    /**
    * 创建https集群，默认是http
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 可维护时间段
    */
    @SerializedName("OperationDuration")
    @Expose
    private OperationDuration OperationDuration;

    /**
    * 是否开启存算分离
    */
    @SerializedName("EnableHybridStorage")
    @Expose
    private Boolean EnableHybridStorage;

    /**
    * 是否开启essd 增强型云盘
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * 是否开启智能巡检
    */
    @SerializedName("EnableDiagnose")
    @Expose
    private Boolean EnableDiagnose;

    /**
    * cdcId，使用cdc子网时传递
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * 置放群组亲和度，范围[0,10]，0表示不开启
    */
    @SerializedName("DisasterRecoverGroupAffinity")
    @Expose
    private Long DisasterRecoverGroupAffinity;

    /**
    * 子产品ID枚举值： 开源版："sp_es_io2"， 基础版："sp_es_basic"，白金版："sp_es_platinum"，企业版："sp_es_enterprise"，CDC白金版："sp_es_cdc_platinum"，日志增强版："sp_es_enlogging"，tsearch："sp_tsearch_io2"，logstash："sp_es_logstash" ，可以为空，为空的时候后台取LicenseType映射该字段
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离
    */
    @SerializedName("ReadWriteMode")
    @Expose
    private Long ReadWriteMode;

    /**
    * 置放群组是否开启异步任务
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * 置放群组开启异步任务的可维护时间段
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

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
     * Get 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"、"7.10.1"） 
     * @return EsVersion 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"、"7.10.1"）
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"、"7.10.1"）
     * @param EsVersion 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"、"7.10.1"）
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号） 
     * @return Password 访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
     * @param Password 访问密码（密码需8到16位，至少包括两项（[a-z,A-Z],[0-9]和[-!@#$%&^*+=_:;,.?]的特殊符号）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_） 
     * @return InstanceName 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     * @param InstanceName 实例名称（1-50 个英文、汉字、数字、连接线-或下划线_）
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 已废弃请使用NodeInfoList
节点数量（2-50个） 
     * @return NodeNum 已废弃请使用NodeInfoList
节点数量（2-50个）
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点数量（2-50个）
     * @param NodeNum 已废弃请使用NodeInfoList
节点数量（2-50个）
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR 
     * @return ChargeType 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR
     * @param ChargeType 计费类型<li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li>默认值POSTPAID_BY_HOUR
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 包年包月购买时长（单位由参数TimeUnit决定） 
     * @return ChargePeriod 包年包月购买时长（单位由参数TimeUnit决定）
     */
    public Long getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * Set 包年包月购买时长（单位由参数TimeUnit决定）
     * @param ChargePeriod 包年包月购买时长（单位由参数TimeUnit决定）
     */
    public void setChargePeriod(Long ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * Get 自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费 
     * @return RenewFlag 自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费
     * @param RenewFlag 自动续费标识<li>RENEW_FLAG_AUTO：自动续费</li><li>RENEW_FLAG_MANUAL：不自动续费，用户手动续费</li>ChargeType为PREPAID时需要设置，如不传递该参数，普通用户默认不自动续费，SVIP用户自动续费
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li> 
     * @return NodeType 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param NodeType 已废弃请使用NodeInfoList
节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD 
     * @return DiskType 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD
     * @param DiskType 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高性能云硬盘</li><li> CLOUD_HSSD：增强型SSD云硬盘</li><li> CLOUD_BSSD：通用型SSD云硬盘</li>默认值CLOUD_SSD
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 已废弃请使用NodeInfoList
节点磁盘容量（单位GB） 
     * @return DiskSize 已废弃请使用NodeInfoList
节点磁盘容量（单位GB）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点磁盘容量（单位GB）
     * @param DiskSize 已废弃请使用NodeInfoList
节点磁盘容量（单位GB）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”） 
     * @return TimeUnit 计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）
     * @param TimeUnit 计费时长单位（ChargeType为PREPAID时需要设置，默认值为“m”，表示月，当前只支持“m”）
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0 
     * @return AutoVoucher 是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0
     * @param AutoVoucher 是否自动使用代金券<li>0：不自动使用</li><li>1：自动使用</li>默认值0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID列表（目前仅支持指定一张代金券） 
     * @return VoucherIds 代金券ID列表（目前仅支持指定一张代金券）
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID列表（目前仅支持指定一张代金券）
     * @param VoucherIds 代金券ID列表（目前仅支持指定一张代金券）
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 已废弃请使用NodeInfoList
是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false 
     * @return EnableDedicatedMaster 已废弃请使用NodeInfoList
是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false
     */
    public Boolean getEnableDedicatedMaster() {
        return this.EnableDedicatedMaster;
    }

    /**
     * Set 已废弃请使用NodeInfoList
是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false
     * @param EnableDedicatedMaster 已废弃请使用NodeInfoList
是否创建专用主节点<li>true：开启专用主节点</li><li>false：不开启专用主节点</li>默认值false
     */
    public void setEnableDedicatedMaster(Boolean EnableDedicatedMaster) {
        this.EnableDedicatedMaster = EnableDedicatedMaster;
    }

    /**
     * Get 已废弃请使用NodeInfoList
专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传） 
     * @return MasterNodeNum 已废弃请使用NodeInfoList
专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）
     */
    public Long getMasterNodeNum() {
        return this.MasterNodeNum;
    }

    /**
     * Set 已废弃请使用NodeInfoList
专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）
     * @param MasterNodeNum 已废弃请使用NodeInfoList
专用主节点个数（只支持3个和5个，EnableDedicatedMaster为true时该值必传）
     */
    public void setMasterNodeNum(Long MasterNodeNum) {
        this.MasterNodeNum = MasterNodeNum;
    }

    /**
     * Get 已废弃请使用NodeInfoList
专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li> 
     * @return MasterNodeType 已废弃请使用NodeInfoList
专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getMasterNodeType() {
        return this.MasterNodeType;
    }

    /**
     * Set 已废弃请使用NodeInfoList
专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param MasterNodeType 已废弃请使用NodeInfoList
专用主节点类型（EnableDedicatedMaster为true时必传）<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setMasterNodeType(String MasterNodeType) {
        this.MasterNodeType = MasterNodeType;
    }

    /**
     * Get 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义） 
     * @return MasterNodeDiskSize 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）
     */
    public Long getMasterNodeDiskSize() {
        return this.MasterNodeDiskSize;
    }

    /**
     * Set 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）
     * @param MasterNodeDiskSize 已废弃请使用NodeInfoList
专用主节点磁盘大小（单位GB，非必传，若传递则必须为50，暂不支持自定义）
     */
    public void setMasterNodeDiskSize(Long MasterNodeDiskSize) {
        this.MasterNodeDiskSize = MasterNodeDiskSize;
    }

    /**
     * Get 集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义） 
     * @return ClusterNameInConf 集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）
     */
    public String getClusterNameInConf() {
        return this.ClusterNameInConf;
    }

    /**
     * Set 集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）
     * @param ClusterNameInConf 集群配置文件中的ClusterName（系统默认配置为实例ID，暂不支持自定义）
     */
    public void setClusterNameInConf(String ClusterNameInConf) {
        this.ClusterNameInConf = ClusterNameInConf;
    }

    /**
     * Get 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0 
     * @return DeployMode 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0
     * @param DeployMode 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署，北京、上海、上海金融、广州、南京、香港、新加坡、法兰克福（白名单控制）</li>默认为0
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 多可用区部署时可用区的详细信息(DeployMode为1时必传) 
     * @return MultiZoneInfo 多可用区部署时可用区的详细信息(DeployMode为1时必传)
     */
    public ZoneDetail [] getMultiZoneInfo() {
        return this.MultiZoneInfo;
    }

    /**
     * Set 多可用区部署时可用区的详细信息(DeployMode为1时必传)
     * @param MultiZoneInfo 多可用区部署时可用区的详细信息(DeployMode为1时必传)
     */
    public void setMultiZoneInfo(ZoneDetail [] MultiZoneInfo) {
        this.MultiZoneInfo = MultiZoneInfo;
    }

    /**
     * Get License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum 
     * @return LicenseType License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     * @param LicenseType License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等 
     * @return NodeInfoList 节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等
     */
    public NodeInfo [] getNodeInfoList() {
        return this.NodeInfoList;
    }

    /**
     * Set 节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等
     * @param NodeInfoList 节点信息列表， 用于描述集群各类节点的规格信息如节点类型，节点个数，节点规格，磁盘类型，磁盘大小等
     */
    public void setNodeInfoList(NodeInfo [] NodeInfoList) {
        this.NodeInfoList = NodeInfoList;
    }

    /**
     * Get 节点标签信息列表 
     * @return TagList 节点标签信息列表
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 节点标签信息列表
     * @param TagList 节点标签信息列表
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li> 
     * @return BasicSecurityType 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
     * @param BasicSecurityType 6.8（及以上版本）基础版是否开启xpack security认证<li>1：不开启</li><li>2：开启</li>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get 场景化模板类型 0：不启用 1：通用 2：日志 3：搜索 
     * @return SceneType 场景化模板类型 0：不启用 1：通用 2：日志 3：搜索
     */
    public Long getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 场景化模板类型 0：不启用 1：通用 2：日志 3：搜索
     * @param SceneType 场景化模板类型 0：不启用 1：通用 2：日志 3：搜索
     */
    public void setSceneType(Long SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get 可视化节点配置 
     * @return WebNodeTypeInfo 可视化节点配置
     */
    public WebNodeTypeInfo getWebNodeTypeInfo() {
        return this.WebNodeTypeInfo;
    }

    /**
     * Set 可视化节点配置
     * @param WebNodeTypeInfo 可视化节点配置
     */
    public void setWebNodeTypeInfo(WebNodeTypeInfo WebNodeTypeInfo) {
        this.WebNodeTypeInfo = WebNodeTypeInfo;
    }

    /**
     * Get 创建https集群，默认是http 
     * @return Protocol 创建https集群，默认是http
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 创建https集群，默认是http
     * @param Protocol 创建https集群，默认是http
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 可维护时间段 
     * @return OperationDuration 可维护时间段
     */
    public OperationDuration getOperationDuration() {
        return this.OperationDuration;
    }

    /**
     * Set 可维护时间段
     * @param OperationDuration 可维护时间段
     */
    public void setOperationDuration(OperationDuration OperationDuration) {
        this.OperationDuration = OperationDuration;
    }

    /**
     * Get 是否开启存算分离 
     * @return EnableHybridStorage 是否开启存算分离
     */
    public Boolean getEnableHybridStorage() {
        return this.EnableHybridStorage;
    }

    /**
     * Set 是否开启存算分离
     * @param EnableHybridStorage 是否开启存算分离
     */
    public void setEnableHybridStorage(Boolean EnableHybridStorage) {
        this.EnableHybridStorage = EnableHybridStorage;
    }

    /**
     * Get 是否开启essd 增强型云盘 
     * @return DiskEnhance 是否开启essd 增强型云盘
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set 是否开启essd 增强型云盘
     * @param DiskEnhance 是否开启essd 增强型云盘
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get 是否开启智能巡检 
     * @return EnableDiagnose 是否开启智能巡检
     */
    public Boolean getEnableDiagnose() {
        return this.EnableDiagnose;
    }

    /**
     * Set 是否开启智能巡检
     * @param EnableDiagnose 是否开启智能巡检
     */
    public void setEnableDiagnose(Boolean EnableDiagnose) {
        this.EnableDiagnose = EnableDiagnose;
    }

    /**
     * Get cdcId，使用cdc子网时传递 
     * @return CdcId cdcId，使用cdc子网时传递
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set cdcId，使用cdc子网时传递
     * @param CdcId cdcId，使用cdc子网时传递
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get 置放群组亲和度，范围[0,10]，0表示不开启 
     * @return DisasterRecoverGroupAffinity 置放群组亲和度，范围[0,10]，0表示不开启
     */
    public Long getDisasterRecoverGroupAffinity() {
        return this.DisasterRecoverGroupAffinity;
    }

    /**
     * Set 置放群组亲和度，范围[0,10]，0表示不开启
     * @param DisasterRecoverGroupAffinity 置放群组亲和度，范围[0,10]，0表示不开启
     */
    public void setDisasterRecoverGroupAffinity(Long DisasterRecoverGroupAffinity) {
        this.DisasterRecoverGroupAffinity = DisasterRecoverGroupAffinity;
    }

    /**
     * Get 子产品ID枚举值： 开源版："sp_es_io2"， 基础版："sp_es_basic"，白金版："sp_es_platinum"，企业版："sp_es_enterprise"，CDC白金版："sp_es_cdc_platinum"，日志增强版："sp_es_enlogging"，tsearch："sp_tsearch_io2"，logstash："sp_es_logstash" ，可以为空，为空的时候后台取LicenseType映射该字段 
     * @return SubProductCode 子产品ID枚举值： 开源版："sp_es_io2"， 基础版："sp_es_basic"，白金版："sp_es_platinum"，企业版："sp_es_enterprise"，CDC白金版："sp_es_cdc_platinum"，日志增强版："sp_es_enlogging"，tsearch："sp_tsearch_io2"，logstash："sp_es_logstash" ，可以为空，为空的时候后台取LicenseType映射该字段
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 子产品ID枚举值： 开源版："sp_es_io2"， 基础版："sp_es_basic"，白金版："sp_es_platinum"，企业版："sp_es_enterprise"，CDC白金版："sp_es_cdc_platinum"，日志增强版："sp_es_enlogging"，tsearch："sp_tsearch_io2"，logstash："sp_es_logstash" ，可以为空，为空的时候后台取LicenseType映射该字段
     * @param SubProductCode 子产品ID枚举值： 开源版："sp_es_io2"， 基础版："sp_es_basic"，白金版："sp_es_platinum"，企业版："sp_es_enterprise"，CDC白金版："sp_es_cdc_platinum"，日志增强版："sp_es_enlogging"，tsearch："sp_tsearch_io2"，logstash："sp_es_logstash" ，可以为空，为空的时候后台取LicenseType映射该字段
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离 
     * @return ReadWriteMode 读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离
     */
    public Long getReadWriteMode() {
        return this.ReadWriteMode;
    }

    /**
     * Set 读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离
     * @param ReadWriteMode 读写分离模式：0-不开启，1-本地读写分离，2-远端读写分离
     */
    public void setReadWriteMode(Long ReadWriteMode) {
        this.ReadWriteMode = ReadWriteMode;
    }

    /**
     * Get 置放群组是否开启异步任务 
     * @return EnableScheduleRecoverGroup 置放群组是否开启异步任务
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set 置放群组是否开启异步任务
     * @param EnableScheduleRecoverGroup 置放群组是否开启异步任务
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get 置放群组开启异步任务的可维护时间段 
     * @return EnableScheduleOperationDuration 置放群组开启异步任务的可维护时间段
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set 置放群组开启异步任务的可维护时间段
     * @param EnableScheduleOperationDuration 置放群组开启异步任务的可维护时间段
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
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

    }
}

