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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageDetailResponse extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 镜像大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 关联主机个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * 关联容器个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

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
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * 是否信任镜像
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
    * agent镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentError")
    @Expose
    private String AgentError;

    /**
    * 后端镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanError")
    @Expose
    private String ScanError;

    /**
    * 系统架构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 作者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 构建历史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildHistory")
    @Expose
    private String BuildHistory;

    /**
    * 木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * 漏洞扫进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * 敏感信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

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
    * 敏感信息错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 木马病毒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 剩余扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainScanTime")
    @Expose
    private Long RemainScanTime;

    /**
    * 授权为：1，未授权为：0
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
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
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 镜像大小 
     * @return Size 镜像大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 镜像大小
     * @param Size 镜像大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 关联主机个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostCnt 关联主机个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set 关联主机个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostCnt 关联主机个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get 关联容器个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerCnt 关联容器个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 关联容器个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerCnt 关联容器个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 漏洞个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulCnt 漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set 漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulCnt 漏洞个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
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
     * Get 是否信任镜像 
     * @return IsTrustImage 是否信任镜像
     */
    public Boolean getIsTrustImage() {
        return this.IsTrustImage;
    }

    /**
     * Set 是否信任镜像
     * @param IsTrustImage 是否信任镜像
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
     * Get agent镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentError agent镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentError() {
        return this.AgentError;
    }

    /**
     * Set agent镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentError agent镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentError(String AgentError) {
        this.AgentError = AgentError;
    }

    /**
     * Get 后端镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanError 后端镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanError() {
        return this.ScanError;
    }

    /**
     * Set 后端镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanError 后端镜像扫描错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanError(String ScanError) {
        this.ScanError = ScanError;
    }

    /**
     * Get 系统架构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Architecture 系统架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 系统架构
注意：此字段可能返回 null，表示取不到有效值。
     * @param Architecture 系统架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 作者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Author 作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 作者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Author 作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 构建历史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildHistory 构建历史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildHistory() {
        return this.BuildHistory;
    }

    /**
     * Set 构建历史
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildHistory 构建历史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildHistory(String BuildHistory) {
        this.BuildHistory = BuildHistory;
    }

    /**
     * Get 木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVirusProgress 木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set 木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVirusProgress 木马扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get 漏洞扫进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanVulProgress 漏洞扫进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set 漏洞扫进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanVulProgress 漏洞扫进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get 敏感信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRiskProgress 敏感信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set 敏感信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRiskProgress 敏感信息扫描进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
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
     * Get 敏感信息错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanRiskError 敏感信息错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set 敏感信息错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanRiskError 敏感信息错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
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
     * Get 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 镜像扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 剩余扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainScanTime 剩余扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainScanTime() {
        return this.RemainScanTime;
    }

    /**
     * Set 剩余扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainScanTime 剩余扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainScanTime(Long RemainScanTime) {
        this.RemainScanTime = RemainScanTime;
    }

    /**
     * Get 授权为：1，未授权为：0 
     * @return IsAuthorized 授权为：1，未授权为：0
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 授权为：1，未授权为：0
     * @param IsAuthorized 授权为：1，未授权为：0
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
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

    public DescribeAssetImageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageDetailResponse(DescribeAssetImageDetailResponse source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.SensitiveInfoCnt != null) {
            this.SensitiveInfoCnt = new Long(source.SensitiveInfoCnt);
        }
        if (source.IsTrustImage != null) {
            this.IsTrustImage = new Boolean(source.IsTrustImage);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.AgentError != null) {
            this.AgentError = new String(source.AgentError);
        }
        if (source.ScanError != null) {
            this.ScanError = new String(source.ScanError);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.BuildHistory != null) {
            this.BuildHistory = new String(source.BuildHistory);
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
        if (source.ScanVirusError != null) {
            this.ScanVirusError = new String(source.ScanVirusError);
        }
        if (source.ScanVulError != null) {
            this.ScanVulError = new String(source.ScanVulError);
        }
        if (source.ScanRiskError != null) {
            this.ScanRiskError = new String(source.ScanRiskError);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RemainScanTime != null) {
            this.RemainScanTime = new Long(source.RemainScanTime);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "SensitiveInfoCnt", this.SensitiveInfoCnt);
        this.setParamSimple(map, prefix + "IsTrustImage", this.IsTrustImage);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "AgentError", this.AgentError);
        this.setParamSimple(map, prefix + "ScanError", this.ScanError);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "BuildHistory", this.BuildHistory);
        this.setParamSimple(map, prefix + "ScanVirusProgress", this.ScanVirusProgress);
        this.setParamSimple(map, prefix + "ScanVulProgress", this.ScanVulProgress);
        this.setParamSimple(map, prefix + "ScanRiskProgress", this.ScanRiskProgress);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "ScanRiskError", this.ScanRiskError);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RemainScanTime", this.RemainScanTime);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

