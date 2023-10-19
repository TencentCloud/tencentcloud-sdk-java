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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryDetailResponse extends AbstractModel {

    /**
    * 镜像Digest
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 安全漏洞数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * 木马病毒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * 风险行为数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SentiveInfoCnt")
    @Expose
    private Long SentiveInfoCnt;

    /**
    * 镜像系统
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 木马扫描错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * 漏洞扫描错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * 层文件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LayerInfo")
    @Expose
    private String LayerInfo;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 高危扫描错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * 木马信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * 漏洞扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * 敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

    /**
    * 剩余扫描时间秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRemainTime")
    @Expose
    private Long ScanRemainTime;

    /**
    * cve扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CveStatus")
    @Expose
    private String CveStatus;

    /**
    * 高危扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * 木马扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusStatus")
    @Expose
    private String VirusStatus;

    /**
    * 总进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 授权状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * 镜像创建的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像Digest
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageDigest 镜像Digest
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set 镜像Digest
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageDigest 镜像Digest
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageRepoAddress 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageRepoAddress 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get 镜像类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryType 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryType 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 仓库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTag 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTag 镜像版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTime 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTime 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 安全漏洞数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulCnt 安全漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set 安全漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulCnt 安全漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get 木马病毒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusCnt 木马病毒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set 木马病毒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusCnt 木马病毒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get 风险行为数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCnt 风险行为数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 风险行为数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCnt 风险行为数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SentiveInfoCnt 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getSentiveInfoCnt() {
        return this.SentiveInfoCnt;
    }

    /**
     * Set 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SentiveInfoCnt 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSentiveInfoCnt(Long SentiveInfoCnt) {
        this.SentiveInfoCnt = SentiveInfoCnt;
    }

    /**
     * Get 镜像系统
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsName 镜像系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 镜像系统
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsName 镜像系统
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 木马扫描错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVirusError 木马扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set 木马扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVirusError 木马扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get 漏洞扫描错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVulError 漏洞扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set 漏洞扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVulError 漏洞扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get 层文件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LayerInfo 层文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLayerInfo() {
        return this.LayerInfo;
    }

    /**
     * Set 层文件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LayerInfo 层文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLayerInfo(String LayerInfo) {
        this.LayerInfo = LayerInfo;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 高危扫描错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRiskError 高危扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set 高危扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRiskError 高危扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get 木马信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVirusProgress 木马信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set 木马信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVirusProgress 木马信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get 漏洞扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVulProgress 漏洞扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set 漏洞扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVulProgress 漏洞扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get 敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRiskProgress 敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set 敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRiskProgress 敏感扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
    }

    /**
     * Get 剩余扫描时间秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRemainTime 剩余扫描时间秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanRemainTime() {
        return this.ScanRemainTime;
    }

    /**
     * Set 剩余扫描时间秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRemainTime 剩余扫描时间秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRemainTime(Long ScanRemainTime) {
        this.ScanRemainTime = ScanRemainTime;
    }

    /**
     * Get cve扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CveStatus cve扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCveStatus() {
        return this.CveStatus;
    }

    /**
     * Set cve扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CveStatus cve扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCveStatus(String CveStatus) {
        this.CveStatus = CveStatus;
    }

    /**
     * Get 高危扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskStatus 高危扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set 高危扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskStatus 高危扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get 木马扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusStatus 木马扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusStatus() {
        return this.VirusStatus;
    }

    /**
     * Set 木马扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusStatus 木马扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusStatus(String VirusStatus) {
        this.VirusStatus = VirusStatus;
    }

    /**
     * Get 总进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 总进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 总进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 总进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 授权状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAuthorized 授权状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 授权状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAuthorized 授权状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get 镜像大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSize 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSize 镜像大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 镜像Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryRegion 镜像区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set 镜像区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryRegion 镜像区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get 镜像创建的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCreateTime 镜像创建的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageCreateTime() {
        return this.ImageCreateTime;
    }

    /**
     * Set 镜像创建的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCreateTime 镜像创建的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCreateTime(String ImageCreateTime) {
        this.ImageCreateTime = ImageCreateTime;
    }

    /**
     * Get 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveInfoCnt 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveInfoCnt 敏感信息数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetImageRegistryDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryDetailResponse(DescribeAssetImageRegistryDetailResponse source) {
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
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.ScanVirusError != null) {
            this.ScanVirusError = new String(source.ScanVirusError);
        }
        if (source.ScanVulError != null) {
            this.ScanVulError = new String(source.ScanVulError);
        }
        if (source.LayerInfo != null) {
            this.LayerInfo = new String(source.LayerInfo);
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
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.ImageCreateTime != null) {
            this.ImageCreateTime = new String(source.ImageCreateTime);
        }
        if (source.SensitiveInfoCnt != null) {
            this.SensitiveInfoCnt = new Long(source.SensitiveInfoCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "SentiveInfoCnt", this.SentiveInfoCnt);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "LayerInfo", this.LayerInfo);
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
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "ImageCreateTime", this.ImageCreateTime);
        this.setParamSimple(map, prefix + "SensitiveInfoCnt", this.SensitiveInfoCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

