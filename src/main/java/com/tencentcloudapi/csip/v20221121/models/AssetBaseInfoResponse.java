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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetBaseInfoResponse extends AbstractModel{

    /**
    * vpc-id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc-name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 资产名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 操作系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 账号数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountNum")
    @Expose
    private Long AccountNum;

    /**
    * 端口数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortNum")
    @Expose
    private Long PortNum;

    /**
    * 进程数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessNum")
    @Expose
    private Long ProcessNum;

    /**
    * 软件应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftApplicationNum")
    @Expose
    private Long SoftApplicationNum;

    /**
    * 数据库数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseNum")
    @Expose
    private Long DatabaseNum;

    /**
    * Web应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebApplicationNum")
    @Expose
    private Long WebApplicationNum;

    /**
    * 服务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceNum")
    @Expose
    private Long ServiceNum;

    /**
    * web框架数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebFrameworkNum")
    @Expose
    private Long WebFrameworkNum;

    /**
    * Web站点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSiteNum")
    @Expose
    private Long WebSiteNum;

    /**
    * Jar包数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JarPackageNum")
    @Expose
    private Long JarPackageNum;

    /**
    * 启动服务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartServiceNum")
    @Expose
    private Long StartServiceNum;

    /**
    * 计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduledTaskNum")
    @Expose
    private Long ScheduledTaskNum;

    /**
    * 环境变量数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentVariableNum")
    @Expose
    private Long EnvironmentVariableNum;

    /**
    * 内核模块数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KernelModuleNum")
    @Expose
    private Long KernelModuleNum;

    /**
    * 系统安装包数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemInstallationPackageNum")
    @Expose
    private Long SystemInstallationPackageNum;

    /**
    * 剩余防护时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurplusProtectDay")
    @Expose
    private Long SurplusProtectDay;

    /**
    * 客户端是否安装  1 已安装 0 未安装
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPStatus")
    @Expose
    private Long CWPStatus;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * 防护等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectLevel")
    @Expose
    private String ProtectLevel;

    /**
    * 防护时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectedDay")
    @Expose
    private Long ProtectedDay;

    /**
     * Get vpc-id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc-id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc-id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc-id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc-name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName vpc-name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc-name
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName vpc-name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 资产名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 操作系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Os 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param Os 操作系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 资产id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 账号数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountNum 账号数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountNum() {
        return this.AccountNum;
    }

    /**
     * Set 账号数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountNum 账号数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountNum(Long AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * Get 端口数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortNum 端口数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPortNum() {
        return this.PortNum;
    }

    /**
     * Set 端口数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortNum 端口数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortNum(Long PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get 进程数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessNum 进程数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessNum() {
        return this.ProcessNum;
    }

    /**
     * Set 进程数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessNum 进程数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessNum(Long ProcessNum) {
        this.ProcessNum = ProcessNum;
    }

    /**
     * Get 软件应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftApplicationNum 软件应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSoftApplicationNum() {
        return this.SoftApplicationNum;
    }

    /**
     * Set 软件应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftApplicationNum 软件应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftApplicationNum(Long SoftApplicationNum) {
        this.SoftApplicationNum = SoftApplicationNum;
    }

    /**
     * Get 数据库数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseNum 数据库数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatabaseNum() {
        return this.DatabaseNum;
    }

    /**
     * Set 数据库数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseNum 数据库数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseNum(Long DatabaseNum) {
        this.DatabaseNum = DatabaseNum;
    }

    /**
     * Get Web应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebApplicationNum Web应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebApplicationNum() {
        return this.WebApplicationNum;
    }

    /**
     * Set Web应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebApplicationNum Web应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebApplicationNum(Long WebApplicationNum) {
        this.WebApplicationNum = WebApplicationNum;
    }

    /**
     * Get 服务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceNum 服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceNum() {
        return this.ServiceNum;
    }

    /**
     * Set 服务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceNum 服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceNum(Long ServiceNum) {
        this.ServiceNum = ServiceNum;
    }

    /**
     * Get web框架数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebFrameworkNum web框架数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebFrameworkNum() {
        return this.WebFrameworkNum;
    }

    /**
     * Set web框架数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebFrameworkNum web框架数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebFrameworkNum(Long WebFrameworkNum) {
        this.WebFrameworkNum = WebFrameworkNum;
    }

    /**
     * Get Web站点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSiteNum Web站点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWebSiteNum() {
        return this.WebSiteNum;
    }

    /**
     * Set Web站点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSiteNum Web站点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSiteNum(Long WebSiteNum) {
        this.WebSiteNum = WebSiteNum;
    }

    /**
     * Get Jar包数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JarPackageNum Jar包数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJarPackageNum() {
        return this.JarPackageNum;
    }

    /**
     * Set Jar包数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param JarPackageNum Jar包数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJarPackageNum(Long JarPackageNum) {
        this.JarPackageNum = JarPackageNum;
    }

    /**
     * Get 启动服务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartServiceNum 启动服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartServiceNum() {
        return this.StartServiceNum;
    }

    /**
     * Set 启动服务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartServiceNum 启动服务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartServiceNum(Long StartServiceNum) {
        this.StartServiceNum = StartServiceNum;
    }

    /**
     * Get 计划任务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduledTaskNum 计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduledTaskNum() {
        return this.ScheduledTaskNum;
    }

    /**
     * Set 计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledTaskNum 计划任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledTaskNum(Long ScheduledTaskNum) {
        this.ScheduledTaskNum = ScheduledTaskNum;
    }

    /**
     * Get 环境变量数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentVariableNum 环境变量数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnvironmentVariableNum() {
        return this.EnvironmentVariableNum;
    }

    /**
     * Set 环境变量数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentVariableNum 环境变量数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentVariableNum(Long EnvironmentVariableNum) {
        this.EnvironmentVariableNum = EnvironmentVariableNum;
    }

    /**
     * Get 内核模块数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KernelModuleNum 内核模块数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKernelModuleNum() {
        return this.KernelModuleNum;
    }

    /**
     * Set 内核模块数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param KernelModuleNum 内核模块数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKernelModuleNum(Long KernelModuleNum) {
        this.KernelModuleNum = KernelModuleNum;
    }

    /**
     * Get 系统安装包数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemInstallationPackageNum 系统安装包数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSystemInstallationPackageNum() {
        return this.SystemInstallationPackageNum;
    }

    /**
     * Set 系统安装包数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemInstallationPackageNum 系统安装包数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemInstallationPackageNum(Long SystemInstallationPackageNum) {
        this.SystemInstallationPackageNum = SystemInstallationPackageNum;
    }

    /**
     * Get 剩余防护时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurplusProtectDay 剩余防护时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSurplusProtectDay() {
        return this.SurplusProtectDay;
    }

    /**
     * Set 剩余防护时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurplusProtectDay 剩余防护时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurplusProtectDay(Long SurplusProtectDay) {
        this.SurplusProtectDay = SurplusProtectDay;
    }

    /**
     * Get 客户端是否安装  1 已安装 0 未安装
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPStatus 客户端是否安装  1 已安装 0 未安装
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCWPStatus() {
        return this.CWPStatus;
    }

    /**
     * Set 客户端是否安装  1 已安装 0 未安装
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPStatus 客户端是否安装  1 已安装 0 未安装
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPStatus(Long CWPStatus) {
        this.CWPStatus = CWPStatus;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 防护等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectLevel 防护等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set 防护等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectLevel 防护等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectLevel(String ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get 防护时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectedDay 防护时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtectedDay() {
        return this.ProtectedDay;
    }

    /**
     * Set 防护时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectedDay 防护时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectedDay(Long ProtectedDay) {
        this.ProtectedDay = ProtectedDay;
    }

    public AssetBaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetBaseInfoResponse(AssetBaseInfoResponse source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AccountNum != null) {
            this.AccountNum = new Long(source.AccountNum);
        }
        if (source.PortNum != null) {
            this.PortNum = new Long(source.PortNum);
        }
        if (source.ProcessNum != null) {
            this.ProcessNum = new Long(source.ProcessNum);
        }
        if (source.SoftApplicationNum != null) {
            this.SoftApplicationNum = new Long(source.SoftApplicationNum);
        }
        if (source.DatabaseNum != null) {
            this.DatabaseNum = new Long(source.DatabaseNum);
        }
        if (source.WebApplicationNum != null) {
            this.WebApplicationNum = new Long(source.WebApplicationNum);
        }
        if (source.ServiceNum != null) {
            this.ServiceNum = new Long(source.ServiceNum);
        }
        if (source.WebFrameworkNum != null) {
            this.WebFrameworkNum = new Long(source.WebFrameworkNum);
        }
        if (source.WebSiteNum != null) {
            this.WebSiteNum = new Long(source.WebSiteNum);
        }
        if (source.JarPackageNum != null) {
            this.JarPackageNum = new Long(source.JarPackageNum);
        }
        if (source.StartServiceNum != null) {
            this.StartServiceNum = new Long(source.StartServiceNum);
        }
        if (source.ScheduledTaskNum != null) {
            this.ScheduledTaskNum = new Long(source.ScheduledTaskNum);
        }
        if (source.EnvironmentVariableNum != null) {
            this.EnvironmentVariableNum = new Long(source.EnvironmentVariableNum);
        }
        if (source.KernelModuleNum != null) {
            this.KernelModuleNum = new Long(source.KernelModuleNum);
        }
        if (source.SystemInstallationPackageNum != null) {
            this.SystemInstallationPackageNum = new Long(source.SystemInstallationPackageNum);
        }
        if (source.SurplusProtectDay != null) {
            this.SurplusProtectDay = new Long(source.SurplusProtectDay);
        }
        if (source.CWPStatus != null) {
            this.CWPStatus = new Long(source.CWPStatus);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new String(source.ProtectLevel);
        }
        if (source.ProtectedDay != null) {
            this.ProtectedDay = new Long(source.ProtectedDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AccountNum", this.AccountNum);
        this.setParamSimple(map, prefix + "PortNum", this.PortNum);
        this.setParamSimple(map, prefix + "ProcessNum", this.ProcessNum);
        this.setParamSimple(map, prefix + "SoftApplicationNum", this.SoftApplicationNum);
        this.setParamSimple(map, prefix + "DatabaseNum", this.DatabaseNum);
        this.setParamSimple(map, prefix + "WebApplicationNum", this.WebApplicationNum);
        this.setParamSimple(map, prefix + "ServiceNum", this.ServiceNum);
        this.setParamSimple(map, prefix + "WebFrameworkNum", this.WebFrameworkNum);
        this.setParamSimple(map, prefix + "WebSiteNum", this.WebSiteNum);
        this.setParamSimple(map, prefix + "JarPackageNum", this.JarPackageNum);
        this.setParamSimple(map, prefix + "StartServiceNum", this.StartServiceNum);
        this.setParamSimple(map, prefix + "ScheduledTaskNum", this.ScheduledTaskNum);
        this.setParamSimple(map, prefix + "EnvironmentVariableNum", this.EnvironmentVariableNum);
        this.setParamSimple(map, prefix + "KernelModuleNum", this.KernelModuleNum);
        this.setParamSimple(map, prefix + "SystemInstallationPackageNum", this.SystemInstallationPackageNum);
        this.setParamSimple(map, prefix + "SurplusProtectDay", this.SurplusProtectDay);
        this.setParamSimple(map, prefix + "CWPStatus", this.CWPStatus);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "ProtectedDay", this.ProtectedDay);

    }
}

