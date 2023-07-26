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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcernInfo extends AbstractModel{

    /**
    * 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConcernType")
    @Expose
    private Long ConcernType;

    /**
    * 实体类型 1: 非云上IP，2: 云上IP，3: 域名，4: IP，5: 文件，6: 进程
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntityType")
    @Expose
    private Long EntityType;

    /**
    * 关注点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Concern")
    @Expose
    private String Concern;

    /**
    * 最近数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticsCount")
    @Expose
    private Long StatisticsCount;

    /**
    * IP国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpCountry")
    @Expose
    private String IpCountry;

    /**
    * IP省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpProvince")
    @Expose
    private String IpProvince;

    /**
    * 结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 置信度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 服务商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpIsp")
    @Expose
    private String IpIsp;

    /**
    * 是否基础设施
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpInfrastructure")
    @Expose
    private String IpInfrastructure;

    /**
    * 威胁类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThreatType")
    @Expose
    private String [] ThreatType;

    /**
    * 威胁团伙
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * 状态威胁情报接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 恶意标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VictimAssetType")
    @Expose
    private String VictimAssetType;

    /**
    * 资产名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VictimAssetName")
    @Expose
    private String VictimAssetName;

    /**
    * 注册者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainRegistrant")
    @Expose
    private String DomainRegistrant;

    /**
    * 注册机构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainRegisteredInstitution")
    @Expose
    private String DomainRegisteredInstitution;

    /**
    * 注册时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainRegistrationTime")
    @Expose
    private String DomainRegistrationTime;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 病毒名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 进程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcName")
    @Expose
    private String ProcName;

    /**
    * 进程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * 进程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcPath")
    @Expose
    private String ProcPath;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcUser")
    @Expose
    private String ProcUser;

    /**
    * 已防御
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefendedCount")
    @Expose
    private Long DefendedCount;

    /**
    * 仅检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectedCount")
    @Expose
    private Long DetectedCount;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchData")
    @Expose
    private String SearchData;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpCountryIso")
    @Expose
    private String IpCountryIso;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpProvinceIso")
    @Expose
    private String IpProvinceIso;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpCity")
    @Expose
    private String IpCity;

    /**
    * 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
     * Get 关注点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConcernType 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConcernType() {
        return this.ConcernType;
    }

    /**
     * Set 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConcernType 关注点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcernType(Long ConcernType) {
        this.ConcernType = ConcernType;
    }

    /**
     * Get 实体类型 1: 非云上IP，2: 云上IP，3: 域名，4: IP，5: 文件，6: 进程
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntityType 实体类型 1: 非云上IP，2: 云上IP，3: 域名，4: IP，5: 文件，6: 进程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 实体类型 1: 非云上IP，2: 云上IP，3: 域名，4: IP，5: 文件，6: 进程
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntityType 实体类型 1: 非云上IP，2: 云上IP，3: 域名，4: IP，5: 文件，6: 进程
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntityType(Long EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 关注点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Concern 关注点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConcern() {
        return this.Concern;
    }

    /**
     * Set 关注点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Concern 关注点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConcern(String Concern) {
        this.Concern = Concern;
    }

    /**
     * Get 最近数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticsCount 最近数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatisticsCount() {
        return this.StatisticsCount;
    }

    /**
     * Set 最近数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticsCount 最近数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticsCount(Long StatisticsCount) {
        this.StatisticsCount = StatisticsCount;
    }

    /**
     * Get IP国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpCountry IP国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpCountry() {
        return this.IpCountry;
    }

    /**
     * Set IP国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpCountry IP国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpCountry(String IpCountry) {
        this.IpCountry = IpCountry;
    }

    /**
     * Get IP省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpProvince IP省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpProvince() {
        return this.IpProvince;
    }

    /**
     * Set IP省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpProvince IP省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpProvince(String IpProvince) {
        this.IpProvince = IpProvince;
    }

    /**
     * Get 结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 置信度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 置信度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 置信度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 服务商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpIsp 服务商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpIsp() {
        return this.IpIsp;
    }

    /**
     * Set 服务商
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpIsp 服务商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpIsp(String IpIsp) {
        this.IpIsp = IpIsp;
    }

    /**
     * Get 是否基础设施
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpInfrastructure 是否基础设施
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpInfrastructure() {
        return this.IpInfrastructure;
    }

    /**
     * Set 是否基础设施
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpInfrastructure 是否基础设施
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpInfrastructure(String IpInfrastructure) {
        this.IpInfrastructure = IpInfrastructure;
    }

    /**
     * Get 威胁类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThreatType 威胁类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getThreatType() {
        return this.ThreatType;
    }

    /**
     * Set 威胁类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThreatType 威胁类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreatType(String [] ThreatType) {
        this.ThreatType = ThreatType;
    }

    /**
     * Get 威胁团伙
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 威胁团伙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 威胁团伙
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 威胁团伙
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 状态威胁情报接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态威胁情报接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态威胁情报接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态威胁情报接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 恶意标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 恶意标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 恶意标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 恶意标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VictimAssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVictimAssetType() {
        return this.VictimAssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VictimAssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVictimAssetType(String VictimAssetType) {
        this.VictimAssetType = VictimAssetType;
    }

    /**
     * Get 资产名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VictimAssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVictimAssetName() {
        return this.VictimAssetName;
    }

    /**
     * Set 资产名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VictimAssetName 资产名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVictimAssetName(String VictimAssetName) {
        this.VictimAssetName = VictimAssetName;
    }

    /**
     * Get 注册者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainRegistrant 注册者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainRegistrant() {
        return this.DomainRegistrant;
    }

    /**
     * Set 注册者
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainRegistrant 注册者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainRegistrant(String DomainRegistrant) {
        this.DomainRegistrant = DomainRegistrant;
    }

    /**
     * Get 注册机构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainRegisteredInstitution 注册机构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainRegisteredInstitution() {
        return this.DomainRegisteredInstitution;
    }

    /**
     * Set 注册机构
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainRegisteredInstitution 注册机构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainRegisteredInstitution(String DomainRegisteredInstitution) {
        this.DomainRegisteredInstitution = DomainRegisteredInstitution;
    }

    /**
     * Get 注册时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainRegistrationTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainRegistrationTime() {
        return this.DomainRegistrationTime;
    }

    /**
     * Set 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainRegistrationTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainRegistrationTime(String DomainRegistrationTime) {
        this.DomainRegistrationTime = DomainRegistrationTime;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMd5 MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMd5 MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 病毒名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusName 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusName 病毒名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath 文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 进程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcName 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcName() {
        return this.ProcName;
    }

    /**
     * Set 进程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcName 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcName(String ProcName) {
        this.ProcName = ProcName;
    }

    /**
     * Get 进程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pid 进程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set 进程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pid 进程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 进程路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcPath 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcPath() {
        return this.ProcPath;
    }

    /**
     * Set 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcPath 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcPath(String ProcPath) {
        this.ProcPath = ProcPath;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcUser 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcUser() {
        return this.ProcUser;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcUser 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcUser(String ProcUser) {
        this.ProcUser = ProcUser;
    }

    /**
     * Get 已防御
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefendedCount 已防御
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefendedCount() {
        return this.DefendedCount;
    }

    /**
     * Set 已防御
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefendedCount 已防御
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefendedCount(Long DefendedCount) {
        this.DefendedCount = DefendedCount;
    }

    /**
     * Get 仅检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectedCount 仅检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDetectedCount() {
        return this.DetectedCount;
    }

    /**
     * Set 仅检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectedCount 仅检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectedCount(Long DetectedCount) {
        this.DetectedCount = DetectedCount;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchData 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSearchData() {
        return this.SearchData;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchData 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchData(String SearchData) {
        this.SearchData = SearchData;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpCountryIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpCountryIso() {
        return this.IpCountryIso;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpCountryIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpCountryIso(String IpCountryIso) {
        this.IpCountryIso = IpCountryIso;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpProvinceIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpProvinceIso() {
        return this.IpProvinceIso;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpProvinceIso 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpProvinceIso(String IpProvinceIso) {
        this.IpProvinceIso = IpProvinceIso;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpCity 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpCity() {
        return this.IpCity;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpCity 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpCity(String IpCity) {
        this.IpCity = IpCity;
    }

    /**
     * Get 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSubType 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSubType 可疑关注点字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    public ConcernInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcernInfo(ConcernInfo source) {
        if (source.ConcernType != null) {
            this.ConcernType = new Long(source.ConcernType);
        }
        if (source.EntityType != null) {
            this.EntityType = new Long(source.EntityType);
        }
        if (source.Concern != null) {
            this.Concern = new String(source.Concern);
        }
        if (source.StatisticsCount != null) {
            this.StatisticsCount = new Long(source.StatisticsCount);
        }
        if (source.IpCountry != null) {
            this.IpCountry = new String(source.IpCountry);
        }
        if (source.IpProvince != null) {
            this.IpProvince = new String(source.IpProvince);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.IpIsp != null) {
            this.IpIsp = new String(source.IpIsp);
        }
        if (source.IpInfrastructure != null) {
            this.IpInfrastructure = new String(source.IpInfrastructure);
        }
        if (source.ThreatType != null) {
            this.ThreatType = new String[source.ThreatType.length];
            for (int i = 0; i < source.ThreatType.length; i++) {
                this.ThreatType[i] = new String(source.ThreatType[i]);
            }
        }
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.VictimAssetType != null) {
            this.VictimAssetType = new String(source.VictimAssetType);
        }
        if (source.VictimAssetName != null) {
            this.VictimAssetName = new String(source.VictimAssetName);
        }
        if (source.DomainRegistrant != null) {
            this.DomainRegistrant = new String(source.DomainRegistrant);
        }
        if (source.DomainRegisteredInstitution != null) {
            this.DomainRegisteredInstitution = new String(source.DomainRegisteredInstitution);
        }
        if (source.DomainRegistrationTime != null) {
            this.DomainRegistrationTime = new String(source.DomainRegistrationTime);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.ProcName != null) {
            this.ProcName = new String(source.ProcName);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.ProcPath != null) {
            this.ProcPath = new String(source.ProcPath);
        }
        if (source.ProcUser != null) {
            this.ProcUser = new String(source.ProcUser);
        }
        if (source.DefendedCount != null) {
            this.DefendedCount = new Long(source.DefendedCount);
        }
        if (source.DetectedCount != null) {
            this.DetectedCount = new Long(source.DetectedCount);
        }
        if (source.SearchData != null) {
            this.SearchData = new String(source.SearchData);
        }
        if (source.IpCountryIso != null) {
            this.IpCountryIso = new String(source.IpCountryIso);
        }
        if (source.IpProvinceIso != null) {
            this.IpProvinceIso = new String(source.IpProvinceIso);
        }
        if (source.IpCity != null) {
            this.IpCity = new String(source.IpCity);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConcernType", this.ConcernType);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "Concern", this.Concern);
        this.setParamSimple(map, prefix + "StatisticsCount", this.StatisticsCount);
        this.setParamSimple(map, prefix + "IpCountry", this.IpCountry);
        this.setParamSimple(map, prefix + "IpProvince", this.IpProvince);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "IpIsp", this.IpIsp);
        this.setParamSimple(map, prefix + "IpInfrastructure", this.IpInfrastructure);
        this.setParamArraySimple(map, prefix + "ThreatType.", this.ThreatType);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VictimAssetType", this.VictimAssetType);
        this.setParamSimple(map, prefix + "VictimAssetName", this.VictimAssetName);
        this.setParamSimple(map, prefix + "DomainRegistrant", this.DomainRegistrant);
        this.setParamSimple(map, prefix + "DomainRegisteredInstitution", this.DomainRegisteredInstitution);
        this.setParamSimple(map, prefix + "DomainRegistrationTime", this.DomainRegistrationTime);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "ProcName", this.ProcName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "ProcPath", this.ProcPath);
        this.setParamSimple(map, prefix + "ProcUser", this.ProcUser);
        this.setParamSimple(map, prefix + "DefendedCount", this.DefendedCount);
        this.setParamSimple(map, prefix + "DetectedCount", this.DetectedCount);
        this.setParamSimple(map, prefix + "SearchData", this.SearchData);
        this.setParamSimple(map, prefix + "IpCountryIso", this.IpCountryIso);
        this.setParamSimple(map, prefix + "IpProvinceIso", this.IpProvinceIso);
        this.setParamSimple(map, prefix + "IpCity", this.IpCity);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);

    }
}

