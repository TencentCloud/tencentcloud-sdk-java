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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"）
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
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
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
    * 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署</li>默认为0
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
     * Get 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"） 
     * @return EsVersion 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"）
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"）
     * @param EsVersion 实例版本（支持"5.6.4"、"6.4.3"、"6.8.2"、"7.5.1"）
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
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD 
     * @return DiskType 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
     * @param DiskType 已废弃请使用NodeInfoList
节点磁盘类型<li>CLOUD_SSD：SSD云硬盘</li><li>CLOUD_PREMIUM：高硬能云硬盘</li>默认值CLOUD_SSD
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
     * Get 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署</li>默认为0 
     * @return DeployMode 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署</li>默认为0
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署</li>默认为0
     * @param DeployMode 集群部署方式<li>0：单可用区部署</li><li>1：多可用区部署</li>默认为0
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

    }
}

