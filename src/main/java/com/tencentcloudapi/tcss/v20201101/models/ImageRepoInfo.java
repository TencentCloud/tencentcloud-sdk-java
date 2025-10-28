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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRepoInfo extends AbstractModel {

    /**
    * 镜像Digest
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * 镜像仓库地址
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * 仓库类型
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像版本
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 镜像大小
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 最近扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 扫描状态
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 安全漏洞数
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * 木马病毒数
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * 风险行为数
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * 敏感信息数
    */
    @SerializedName("SentiveInfoCnt")
    @Expose
    private Long SentiveInfoCnt;

    /**
    * 是否可信镜像
    */
    @SerializedName("IsTrustImage")
    @Expose
    private Boolean IsTrustImage;

    /**
    * 镜像系统
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 木马扫描错误
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * 漏洞扫描错误
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * 实例id
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
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 高危扫描错误
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * 敏感信息扫描进度
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * 木马扫描进度
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * 漏洞扫描进度
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

    /**
    * 剩余扫描时间秒
    */
    @SerializedName("ScanRemainTime")
    @Expose
    private Long ScanRemainTime;

    /**
    * cve扫描状态
    */
    @SerializedName("CveStatus")
    @Expose
    private String CveStatus;

    /**
    * 高危扫描状态
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * 木马扫描状态
    */
    @SerializedName("VirusStatus")
    @Expose
    private String VirusStatus;

    /**
    * 总进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 授权状态
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * 仓库区域
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * 列表id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 镜像Id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像创建的时间
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * 是否为镜像的最新版本
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * low级别漏洞个数
    */
    @SerializedName("LowLevelVulCnt")
    @Expose
    private Long LowLevelVulCnt;

    /**
    * medium级别漏洞个数
    */
    @SerializedName("MediumLevelVulCnt")
    @Expose
    private Long MediumLevelVulCnt;

    /**
    * high级别漏洞个数
    */
    @SerializedName("HighLevelVulCnt")
    @Expose
    private Long HighLevelVulCnt;

    /**
    * critical级别漏洞个数
    */
    @SerializedName("CriticalLevelVulCnt")
    @Expose
    private Long CriticalLevelVulCnt;

    /**
    * 关联容器数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 组件数
    */
    @SerializedName("ComponentCnt")
    @Expose
    private Long ComponentCnt;

    /**
    * 是否运行中
    */
    @SerializedName("IsRunning")
    @Expose
    private Boolean IsRunning;

    /**
    * 是否存在必修漏洞
    */
    @SerializedName("HasNeedFixVul")
    @Expose
    private Boolean HasNeedFixVul;

    /**
    * 敏感信息
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * 是否推荐处置
    */
    @SerializedName("RecommendedFix")
    @Expose
    private Boolean RecommendedFix;

    /**
    * 解决方案
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 镜像Digest 
     * @return ImageDigest 镜像Digest
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set 镜像Digest
     * @param ImageDigest 镜像Digest
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get 镜像仓库地址 
     * @return ImageRepoAddress 镜像仓库地址
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set 镜像仓库地址
     * @param ImageRepoAddress 镜像仓库地址
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get 仓库类型 
     * @return RegistryType 仓库类型
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 仓库类型
     * @param RegistryType 仓库类型
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像版本 
     * @return ImageTag 镜像版本
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像版本
     * @param ImageTag 镜像版本
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 镜像大小 
     * @return ImageSize 镜像大小
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小
     * @param ImageSize 镜像大小
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 最近扫描时间 
     * @return ScanTime 最近扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 最近扫描时间
     * @param ScanTime 最近扫描时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 扫描状态 
     * @return ScanStatus 扫描状态
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态
     * @param ScanStatus 扫描状态
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 安全漏洞数 
     * @return VulCnt 安全漏洞数
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set 安全漏洞数
     * @param VulCnt 安全漏洞数
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get 木马病毒数 
     * @return VirusCnt 木马病毒数
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set 木马病毒数
     * @param VirusCnt 木马病毒数
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get 风险行为数 
     * @return RiskCnt 风险行为数
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 风险行为数
     * @param RiskCnt 风险行为数
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get 敏感信息数 
     * @return SentiveInfoCnt 敏感信息数
     * @deprecated
     */
    @Deprecated
    public Long getSentiveInfoCnt() {
        return this.SentiveInfoCnt;
    }

    /**
     * Set 敏感信息数
     * @param SentiveInfoCnt 敏感信息数
     * @deprecated
     */
    @Deprecated
    public void setSentiveInfoCnt(Long SentiveInfoCnt) {
        this.SentiveInfoCnt = SentiveInfoCnt;
    }

    /**
     * Get 是否可信镜像 
     * @return IsTrustImage 是否可信镜像
     */
    public Boolean getIsTrustImage() {
        return this.IsTrustImage;
    }

    /**
     * Set 是否可信镜像
     * @param IsTrustImage 是否可信镜像
     */
    public void setIsTrustImage(Boolean IsTrustImage) {
        this.IsTrustImage = IsTrustImage;
    }

    /**
     * Get 镜像系统 
     * @return OsName 镜像系统
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 镜像系统
     * @param OsName 镜像系统
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 木马扫描错误 
     * @return ScanVirusError 木马扫描错误
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set 木马扫描错误
     * @param ScanVirusError 木马扫描错误
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get 漏洞扫描错误 
     * @return ScanVulError 漏洞扫描错误
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set 漏洞扫描错误
     * @param ScanVulError 漏洞扫描错误
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 高危扫描错误 
     * @return ScanRiskError 高危扫描错误
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set 高危扫描错误
     * @param ScanRiskError 高危扫描错误
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get 敏感信息扫描进度 
     * @return ScanVirusProgress 敏感信息扫描进度
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set 敏感信息扫描进度
     * @param ScanVirusProgress 敏感信息扫描进度
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get 木马扫描进度 
     * @return ScanVulProgress 木马扫描进度
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set 木马扫描进度
     * @param ScanVulProgress 木马扫描进度
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get 漏洞扫描进度 
     * @return ScanRiskProgress 漏洞扫描进度
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set 漏洞扫描进度
     * @param ScanRiskProgress 漏洞扫描进度
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
    }

    /**
     * Get 剩余扫描时间秒 
     * @return ScanRemainTime 剩余扫描时间秒
     */
    public Long getScanRemainTime() {
        return this.ScanRemainTime;
    }

    /**
     * Set 剩余扫描时间秒
     * @param ScanRemainTime 剩余扫描时间秒
     */
    public void setScanRemainTime(Long ScanRemainTime) {
        this.ScanRemainTime = ScanRemainTime;
    }

    /**
     * Get cve扫描状态 
     * @return CveStatus cve扫描状态
     */
    public String getCveStatus() {
        return this.CveStatus;
    }

    /**
     * Set cve扫描状态
     * @param CveStatus cve扫描状态
     */
    public void setCveStatus(String CveStatus) {
        this.CveStatus = CveStatus;
    }

    /**
     * Get 高危扫描状态 
     * @return RiskStatus 高危扫描状态
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set 高危扫描状态
     * @param RiskStatus 高危扫描状态
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get 木马扫描状态 
     * @return VirusStatus 木马扫描状态
     */
    public String getVirusStatus() {
        return this.VirusStatus;
    }

    /**
     * Set 木马扫描状态
     * @param VirusStatus 木马扫描状态
     */
    public void setVirusStatus(String VirusStatus) {
        this.VirusStatus = VirusStatus;
    }

    /**
     * Get 总进度 
     * @return Progress 总进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 总进度
     * @param Progress 总进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 授权状态 
     * @return IsAuthorized 授权状态
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 授权状态
     * @param IsAuthorized 授权状态
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get 仓库区域 
     * @return RegistryRegion 仓库区域
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set 仓库区域
     * @param RegistryRegion 仓库区域
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get 列表id 
     * @return Id 列表id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 列表id
     * @param Id 列表id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 镜像Id 
     * @return ImageId 镜像Id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像Id
     * @param ImageId 镜像Id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像创建的时间 
     * @return ImageCreateTime 镜像创建的时间
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set 镜像创建的时间
     * @param ImageCreateTime 镜像创建的时间
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get 是否为镜像的最新版本 
     * @return IsLatestImage 是否为镜像的最新版本
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set 是否为镜像的最新版本
     * @param IsLatestImage 是否为镜像的最新版本
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get low级别漏洞个数 
     * @return LowLevelVulCnt low级别漏洞个数
     */
    public Long getLowLevelVulCnt() {
        return this.LowLevelVulCnt;
    }

    /**
     * Set low级别漏洞个数
     * @param LowLevelVulCnt low级别漏洞个数
     */
    public void setLowLevelVulCnt(Long LowLevelVulCnt) {
        this.LowLevelVulCnt = LowLevelVulCnt;
    }

    /**
     * Get medium级别漏洞个数 
     * @return MediumLevelVulCnt medium级别漏洞个数
     */
    public Long getMediumLevelVulCnt() {
        return this.MediumLevelVulCnt;
    }

    /**
     * Set medium级别漏洞个数
     * @param MediumLevelVulCnt medium级别漏洞个数
     */
    public void setMediumLevelVulCnt(Long MediumLevelVulCnt) {
        this.MediumLevelVulCnt = MediumLevelVulCnt;
    }

    /**
     * Get high级别漏洞个数 
     * @return HighLevelVulCnt high级别漏洞个数
     */
    public Long getHighLevelVulCnt() {
        return this.HighLevelVulCnt;
    }

    /**
     * Set high级别漏洞个数
     * @param HighLevelVulCnt high级别漏洞个数
     */
    public void setHighLevelVulCnt(Long HighLevelVulCnt) {
        this.HighLevelVulCnt = HighLevelVulCnt;
    }

    /**
     * Get critical级别漏洞个数 
     * @return CriticalLevelVulCnt critical级别漏洞个数
     */
    public Long getCriticalLevelVulCnt() {
        return this.CriticalLevelVulCnt;
    }

    /**
     * Set critical级别漏洞个数
     * @param CriticalLevelVulCnt critical级别漏洞个数
     */
    public void setCriticalLevelVulCnt(Long CriticalLevelVulCnt) {
        this.CriticalLevelVulCnt = CriticalLevelVulCnt;
    }

    /**
     * Get 关联容器数 
     * @return ContainerCnt 关联容器数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 关联容器数
     * @param ContainerCnt 关联容器数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 组件数 
     * @return ComponentCnt 组件数
     */
    public Long getComponentCnt() {
        return this.ComponentCnt;
    }

    /**
     * Set 组件数
     * @param ComponentCnt 组件数
     */
    public void setComponentCnt(Long ComponentCnt) {
        this.ComponentCnt = ComponentCnt;
    }

    /**
     * Get 是否运行中 
     * @return IsRunning 是否运行中
     */
    public Boolean getIsRunning() {
        return this.IsRunning;
    }

    /**
     * Set 是否运行中
     * @param IsRunning 是否运行中
     */
    public void setIsRunning(Boolean IsRunning) {
        this.IsRunning = IsRunning;
    }

    /**
     * Get 是否存在必修漏洞 
     * @return HasNeedFixVul 是否存在必修漏洞
     */
    public Boolean getHasNeedFixVul() {
        return this.HasNeedFixVul;
    }

    /**
     * Set 是否存在必修漏洞
     * @param HasNeedFixVul 是否存在必修漏洞
     */
    public void setHasNeedFixVul(Boolean HasNeedFixVul) {
        this.HasNeedFixVul = HasNeedFixVul;
    }

    /**
     * Get 敏感信息 
     * @return SensitiveInfoCnt 敏感信息
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set 敏感信息
     * @param SensitiveInfoCnt 敏感信息
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get 是否推荐处置 
     * @return RecommendedFix 是否推荐处置
     */
    public Boolean getRecommendedFix() {
        return this.RecommendedFix;
    }

    /**
     * Set 是否推荐处置
     * @param RecommendedFix 是否推荐处置
     */
    public void setRecommendedFix(Boolean RecommendedFix) {
        this.RecommendedFix = RecommendedFix;
    }

    /**
     * Get 解决方案 
     * @return Solution 解决方案
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方案
     * @param Solution 解决方案
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 原因 
     * @return Reason 原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 原因
     * @param Reason 原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ImageRepoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRepoInfo(ImageRepoInfo source) {
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.SentiveInfoCnt != null) {
            this.SentiveInfoCnt = new Long(source.SentiveInfoCnt);
        }
        if (source.IsTrustImage != null) {
            this.IsTrustImage = new Boolean(source.IsTrustImage);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.ScanVirusError != null) {
            this.ScanVirusError = new String(source.ScanVirusError);
        }
        if (source.ScanVulError != null) {
            this.ScanVulError = new String(source.ScanVulError);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ScanRiskError != null) {
            this.ScanRiskError = new String(source.ScanRiskError);
        }
        if (source.ScanVirusProgress != null) {
            this.ScanVirusProgress = new Long(source.ScanVirusProgress);
        }
        if (source.ScanVulProgress != null) {
            this.ScanVulProgress = new Long(source.ScanVulProgress);
        }
        if (source.ScanRiskProgress != null) {
            this.ScanRiskProgress = new Long(source.ScanRiskProgress);
        }
        if (source.ScanRemainTime != null) {
            this.ScanRemainTime = new Long(source.ScanRemainTime);
        }
        if (source.CveStatus != null) {
            this.CveStatus = new String(source.CveStatus);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.VirusStatus != null) {
            this.VirusStatus = new String(source.VirusStatus);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.LowLevelVulCnt != null) {
            this.LowLevelVulCnt = new Long(source.LowLevelVulCnt);
        }
        if (source.MediumLevelVulCnt != null) {
            this.MediumLevelVulCnt = new Long(source.MediumLevelVulCnt);
        }
        if (source.HighLevelVulCnt != null) {
            this.HighLevelVulCnt = new Long(source.HighLevelVulCnt);
        }
        if (source.CriticalLevelVulCnt != null) {
            this.CriticalLevelVulCnt = new Long(source.CriticalLevelVulCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ComponentCnt != null) {
            this.ComponentCnt = new Long(source.ComponentCnt);
        }
        if (source.IsRunning != null) {
            this.IsRunning = new Boolean(source.IsRunning);
        }
        if (source.HasNeedFixVul != null) {
            this.HasNeedFixVul = new Boolean(source.HasNeedFixVul);
        }
        if (source.SensitiveInfoCnt != null) {
            this.SensitiveInfoCnt = new Long(source.SensitiveInfoCnt);
        }
        if (source.RecommendedFix != null) {
            this.RecommendedFix = new Boolean(source.RecommendedFix);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "SentiveInfoCnt", this.SentiveInfoCnt);
        this.setParamSimple(map, prefix + "IsTrustImage", this.IsTrustImage);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ScanRiskError", this.ScanRiskError);
        this.setParamSimple(map, prefix + "ScanVirusProgress", this.ScanVirusProgress);
        this.setParamSimple(map, prefix + "ScanVulProgress", this.ScanVulProgress);
        this.setParamSimple(map, prefix + "ScanRiskProgress", this.ScanRiskProgress);
        this.setParamSimple(map, prefix + "ScanRemainTime", this.ScanRemainTime);
        this.setParamSimple(map, prefix + "CveStatus", this.CveStatus);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "VirusStatus", this.VirusStatus);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "LowLevelVulCnt", this.LowLevelVulCnt);
        this.setParamSimple(map, prefix + "MediumLevelVulCnt", this.MediumLevelVulCnt);
        this.setParamSimple(map, prefix + "HighLevelVulCnt", this.HighLevelVulCnt);
        this.setParamSimple(map, prefix + "CriticalLevelVulCnt", this.CriticalLevelVulCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ComponentCnt", this.ComponentCnt);
        this.setParamSimple(map, prefix + "IsRunning", this.IsRunning);
        this.setParamSimple(map, prefix + "HasNeedFixVul", this.HasNeedFixVul);
        this.setParamSimple(map, prefix + "SensitiveInfoCnt", this.SensitiveInfoCnt);
        this.setParamSimple(map, prefix + "RecommendedFix", this.RecommendedFix);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

