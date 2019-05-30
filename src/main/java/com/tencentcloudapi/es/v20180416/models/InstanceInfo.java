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

public class InstanceInfo  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 用户UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 实例所属VPC的UID
    */
    @SerializedName("VpcUid")
    @Expose
    private String VpcUid;

    /**
    * 实例所属子网的UID
    */
    @SerializedName("SubnetUid")
    @Expose
    private String SubnetUid;

    /**
    * 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 包年包月购买时长,单位:月
    */
    @SerializedName("ChargePeriod")
    @Expose
    private Integer ChargePeriod;

    /**
    * 自动续费标识。取值范围：  NOTIFY_AND_AUTO_RENEW：通知过期且自动续费  NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费  DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费  默认取值：NOTIFY_AND_AUTO_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点个数
    */
    @SerializedName("NodeNum")
    @Expose
    private Integer NodeNum;

    /**
    * 节点CPU核数
    */
    @SerializedName("CpuNum")
    @Expose
    private Integer CpuNum;

    /**
    * 节点内存大小，单位GB
    */
    @SerializedName("MemSize")
    @Expose
    private Integer MemSize;

    /**
    * 节点磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 节点磁盘大小，单位GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * ES域名
    */
    @SerializedName("EsDomain")
    @Expose
    private String EsDomain;

    /**
    * ES VIP
    */
    @SerializedName("EsVip")
    @Expose
    private String EsVip;

    /**
    * ES端口
    */
    @SerializedName("EsPort")
    @Expose
    private Integer EsPort;

    /**
    * Kibana访问url
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * ES版本号
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * ES配置项
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;

    /**
    * ES访问控制配置
    */
    @SerializedName("EsAcl")
    @Expose
    private EsAcl EsAcl;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例最后修改操作时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例到期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 实例类型（实例类型标识，当前只有1,2两种）
    */
    @SerializedName("InstanceType")
    @Expose
    private Integer InstanceType;

    /**
    * Ik分词器配置
    */
    @SerializedName("IkConfig")
    @Expose
    private EsDictionaryInfo IkConfig;

    /**
    * 专用主节点配置
    */
    @SerializedName("MasterNodeInfo")
    @Expose
    private MasterNodeInfo MasterNodeInfo;

    /**
    * cos自动备份配置
    */
    @SerializedName("CosBackup")
    @Expose
    private CosBackup CosBackup;

    /**
    * 是否允许cos自动备份
    */
    @SerializedName("AllowCosBackup")
    @Expose
    private Boolean AllowCosBackup;

    /**
    * 实例拥有的标签列表
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例名称
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取地域
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取用户ID
     * @return AppId 用户ID
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置用户ID
     * @param AppId 用户ID
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取用户UIN
     * @return Uin 用户UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置用户UIN
     * @param Uin 用户UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取实例所属VPC的UID
     * @return VpcUid 实例所属VPC的UID
     */
    public String getVpcUid() {
        return this.VpcUid;
    }

    /**
     * 设置实例所属VPC的UID
     * @param VpcUid 实例所属VPC的UID
     */
    public void setVpcUid(String VpcUid) {
        this.VpcUid = VpcUid;
    }

    /**
     * 获取实例所属子网的UID
     * @return SubnetUid 实例所属子网的UID
     */
    public String getSubnetUid() {
        return this.SubnetUid;
    }

    /**
     * 设置实例所属子网的UID
     * @param SubnetUid 实例所属子网的UID
     */
    public void setSubnetUid(String SubnetUid) {
        this.SubnetUid = SubnetUid;
    }

    /**
     * 获取实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     * @return Status 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     * @param Status 实例状态，0:处理中,1:正常,-1停止,-2:销毁中,-3:已销毁
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     * @return ChargeType 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * 设置实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     * @param ChargeType 实例计费模式。取值范围：  PREPAID：表示预付费，即包年包月  POSTPAID_BY_HOUR：表示后付费，即按量计费  CDHPAID：CDH付费，即只对CDH计费，不对CDH上的实例计费。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * 获取包年包月购买时长,单位:月
     * @return ChargePeriod 包年包月购买时长,单位:月
     */
    public Integer getChargePeriod() {
        return this.ChargePeriod;
    }

    /**
     * 设置包年包月购买时长,单位:月
     * @param ChargePeriod 包年包月购买时长,单位:月
     */
    public void setChargePeriod(Integer ChargePeriod) {
        this.ChargePeriod = ChargePeriod;
    }

    /**
     * 获取自动续费标识。取值范围：  NOTIFY_AND_AUTO_RENEW：通知过期且自动续费  NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费  DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费  默认取值：NOTIFY_AND_AUTO_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     * @return RenewFlag 自动续费标识。取值范围：  NOTIFY_AND_AUTO_RENEW：通知过期且自动续费  NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费  DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费  默认取值：NOTIFY_AND_AUTO_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * 设置自动续费标识。取值范围：  NOTIFY_AND_AUTO_RENEW：通知过期且自动续费  NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费  DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费  默认取值：NOTIFY_AND_AUTO_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     * @param RenewFlag 自动续费标识。取值范围：  NOTIFY_AND_AUTO_RENEW：通知过期且自动续费  NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费  DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费  默认取值：NOTIFY_AND_AUTO_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * 获取节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @return NodeType 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * 设置节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     * @param NodeType 节点规格<li>ES.S1.SMALL2：1核2G</li><li>ES.S1.MEDIUM4：2核4G</li><li>ES.S1.MEDIUM8：2核8G</li><li>ES.S1.LARGE16：4核16G</li><li>ES.S1.2XLARGE32：8核32G</li><li>ES.S1.4XLARGE32：16核32G</li><li>ES.S1.4XLARGE64：16核64G</li>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * 获取节点个数
     * @return NodeNum 节点个数
     */
    public Integer getNodeNum() {
        return this.NodeNum;
    }

    /**
     * 设置节点个数
     * @param NodeNum 节点个数
     */
    public void setNodeNum(Integer NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * 获取节点CPU核数
     * @return CpuNum 节点CPU核数
     */
    public Integer getCpuNum() {
        return this.CpuNum;
    }

    /**
     * 设置节点CPU核数
     * @param CpuNum 节点CPU核数
     */
    public void setCpuNum(Integer CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * 获取节点内存大小，单位GB
     * @return MemSize 节点内存大小，单位GB
     */
    public Integer getMemSize() {
        return this.MemSize;
    }

    /**
     * 设置节点内存大小，单位GB
     * @param MemSize 节点内存大小，单位GB
     */
    public void setMemSize(Integer MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * 获取节点磁盘类型
     * @return DiskType 节点磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置节点磁盘类型
     * @param DiskType 节点磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取节点磁盘大小，单位GB
     * @return DiskSize 节点磁盘大小，单位GB
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置节点磁盘大小，单位GB
     * @param DiskSize 节点磁盘大小，单位GB
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取ES域名
     * @return EsDomain ES域名
     */
    public String getEsDomain() {
        return this.EsDomain;
    }

    /**
     * 设置ES域名
     * @param EsDomain ES域名
     */
    public void setEsDomain(String EsDomain) {
        this.EsDomain = EsDomain;
    }

    /**
     * 获取ES VIP
     * @return EsVip ES VIP
     */
    public String getEsVip() {
        return this.EsVip;
    }

    /**
     * 设置ES VIP
     * @param EsVip ES VIP
     */
    public void setEsVip(String EsVip) {
        this.EsVip = EsVip;
    }

    /**
     * 获取ES端口
     * @return EsPort ES端口
     */
    public Integer getEsPort() {
        return this.EsPort;
    }

    /**
     * 设置ES端口
     * @param EsPort ES端口
     */
    public void setEsPort(Integer EsPort) {
        this.EsPort = EsPort;
    }

    /**
     * 获取Kibana访问url
     * @return KibanaUrl Kibana访问url
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * 设置Kibana访问url
     * @param KibanaUrl Kibana访问url
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * 获取ES版本号
     * @return EsVersion ES版本号
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * 设置ES版本号
     * @param EsVersion ES版本号
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * 获取ES配置项
     * @return EsConfig ES配置项
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * 设置ES配置项
     * @param EsConfig ES配置项
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * 获取ES访问控制配置
     * @return EsAcl ES访问控制配置
     */
    public EsAcl getEsAcl() {
        return this.EsAcl;
    }

    /**
     * 设置ES访问控制配置
     * @param EsAcl ES访问控制配置
     */
    public void setEsAcl(EsAcl EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * 获取实例创建时间
     * @return CreateTime 实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置实例创建时间
     * @param CreateTime 实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实例最后修改操作时间
     * @return UpdateTime 实例最后修改操作时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置实例最后修改操作时间
     * @param UpdateTime 实例最后修改操作时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取实例到期时间
     * @return Deadline 实例到期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * 设置实例到期时间
     * @param Deadline 实例到期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * 获取实例类型（实例类型标识，当前只有1,2两种）
     * @return InstanceType 实例类型（实例类型标识，当前只有1,2两种）
     */
    public Integer getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例类型（实例类型标识，当前只有1,2两种）
     * @param InstanceType 实例类型（实例类型标识，当前只有1,2两种）
     */
    public void setInstanceType(Integer InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取Ik分词器配置
     * @return IkConfig Ik分词器配置
     */
    public EsDictionaryInfo getIkConfig() {
        return this.IkConfig;
    }

    /**
     * 设置Ik分词器配置
     * @param IkConfig Ik分词器配置
     */
    public void setIkConfig(EsDictionaryInfo IkConfig) {
        this.IkConfig = IkConfig;
    }

    /**
     * 获取专用主节点配置
     * @return MasterNodeInfo 专用主节点配置
     */
    public MasterNodeInfo getMasterNodeInfo() {
        return this.MasterNodeInfo;
    }

    /**
     * 设置专用主节点配置
     * @param MasterNodeInfo 专用主节点配置
     */
    public void setMasterNodeInfo(MasterNodeInfo MasterNodeInfo) {
        this.MasterNodeInfo = MasterNodeInfo;
    }

    /**
     * 获取cos自动备份配置
     * @return CosBackup cos自动备份配置
     */
    public CosBackup getCosBackup() {
        return this.CosBackup;
    }

    /**
     * 设置cos自动备份配置
     * @param CosBackup cos自动备份配置
     */
    public void setCosBackup(CosBackup CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * 获取是否允许cos自动备份
     * @return AllowCosBackup 是否允许cos自动备份
     */
    public Boolean getAllowCosBackup() {
        return this.AllowCosBackup;
    }

    /**
     * 设置是否允许cos自动备份
     * @param AllowCosBackup 是否允许cos自动备份
     */
    public void setAllowCosBackup(Boolean AllowCosBackup) {
        this.AllowCosBackup = AllowCosBackup;
    }

    /**
     * 获取实例拥有的标签列表
     * @return TagList 实例拥有的标签列表
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * 设置实例拥有的标签列表
     * @param TagList 实例拥有的标签列表
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * 获取License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     * @return LicenseType License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * 设置License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     * @param LicenseType License类型<li>oss：开源版</li><li>basic：基础版</li><li>platinum：白金版</li>默认值platinum
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VpcUid", this.VpcUid);
        this.setParamSimple(map, prefix + "SubnetUid", this.SubnetUid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargePeriod", this.ChargePeriod);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "EsDomain", this.EsDomain);
        this.setParamSimple(map, prefix + "EsVip", this.EsVip);
        this.setParamSimple(map, prefix + "EsPort", this.EsPort);
        this.setParamSimple(map, prefix + "KibanaUrl", this.KibanaUrl);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamObj(map, prefix + "EsAcl.", this.EsAcl);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "IkConfig.", this.IkConfig);
        this.setParamObj(map, prefix + "MasterNodeInfo.", this.MasterNodeInfo);
        this.setParamObj(map, prefix + "CosBackup.", this.CosBackup);
        this.setParamSimple(map, prefix + "AllowCosBackup", this.AllowCosBackup);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

