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

public class DescribeAssetImageDetailResponse extends AbstractModel {

    /**
    * <p>镜像ID</p>
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像摘要</p>
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>镜像大小</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>关联主机个数(包含普通节点数和超级节点数)</p>
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * <p>关联容器个数</p>
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * <p>超级节点数</p>
    */
    @SerializedName("SuperNodeCnt")
    @Expose
    private Long SuperNodeCnt;

    /**
    * <p>最近扫描时间</p>
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * <p>漏洞个数</p>
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * <p>风险行为数</p>
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * <p>敏感信息数</p>
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * <p>是否信任镜像</p>
    */
    @SerializedName("IsTrustImage")
    @Expose
    private Boolean IsTrustImage;

    /**
    * <p>镜像系统</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>agent镜像扫描错误</p>
    */
    @SerializedName("AgentError")
    @Expose
    private String AgentError;

    /**
    * <p>后端镜像扫描错误</p>
    */
    @SerializedName("ScanError")
    @Expose
    private String ScanError;

    /**
    * <p>系统架构</p>
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * <p>作者</p>
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * <p>构建历史</p>
    */
    @SerializedName("BuildHistory")
    @Expose
    private String BuildHistory;

    /**
    * <p>木马扫描进度</p>
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * <p>漏洞扫进度</p>
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * <p>敏感信息扫描进度</p>
    */
    @SerializedName("ScanRiskProgress")
    @Expose
    private Long ScanRiskProgress;

    /**
    * <p>木马扫描错误</p>
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * <p>漏洞扫描错误</p>
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * <p>敏感信息错误</p>
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * <p>镜像扫描状态</p>
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * <p>木马病毒数</p>
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * <p>镜像扫描状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>剩余扫描时间</p>
    */
    @SerializedName("RemainScanTime")
    @Expose
    private Long RemainScanTime;

    /**
    * <p>授权为：1，未授权为：0</p>
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * <p>解决方案</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>原因</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>仓库Digests</p>
    */
    @SerializedName("RepoDigests")
    @Expose
    private String [] RepoDigests;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>镜像ID</p> 
     * @return ImageID <p>镜像ID</p>
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set <p>镜像ID</p>
     * @param ImageID <p>镜像ID</p>
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return ImageName <p>镜像名称</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名称</p>
     * @param ImageName <p>镜像名称</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像摘要</p> 
     * @return ImageDigest <p>镜像摘要</p>
     */
    public String getImageDigest() {
        return this.ImageDigest;
    }

    /**
     * Set <p>镜像摘要</p>
     * @param ImageDigest <p>镜像摘要</p>
     */
    public void setImageDigest(String ImageDigest) {
        this.ImageDigest = ImageDigest;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>镜像大小</p> 
     * @return Size <p>镜像大小</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>镜像大小</p>
     * @param Size <p>镜像大小</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>关联主机个数(包含普通节点数和超级节点数)</p> 
     * @return HostCnt <p>关联主机个数(包含普通节点数和超级节点数)</p>
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set <p>关联主机个数(包含普通节点数和超级节点数)</p>
     * @param HostCnt <p>关联主机个数(包含普通节点数和超级节点数)</p>
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    /**
     * Get <p>关联容器个数</p> 
     * @return ContainerCnt <p>关联容器个数</p>
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set <p>关联容器个数</p>
     * @param ContainerCnt <p>关联容器个数</p>
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get <p>超级节点数</p> 
     * @return SuperNodeCnt <p>超级节点数</p>
     */
    public Long getSuperNodeCnt() {
        return this.SuperNodeCnt;
    }

    /**
     * Set <p>超级节点数</p>
     * @param SuperNodeCnt <p>超级节点数</p>
     */
    public void setSuperNodeCnt(Long SuperNodeCnt) {
        this.SuperNodeCnt = SuperNodeCnt;
    }

    /**
     * Get <p>最近扫描时间</p> 
     * @return ScanTime <p>最近扫描时间</p>
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set <p>最近扫描时间</p>
     * @param ScanTime <p>最近扫描时间</p>
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get <p>漏洞个数</p> 
     * @return VulCnt <p>漏洞个数</p>
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set <p>漏洞个数</p>
     * @param VulCnt <p>漏洞个数</p>
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get <p>风险行为数</p> 
     * @return RiskCnt <p>风险行为数</p>
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set <p>风险行为数</p>
     * @param RiskCnt <p>风险行为数</p>
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get <p>敏感信息数</p> 
     * @return SensitiveInfoCnt <p>敏感信息数</p>
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set <p>敏感信息数</p>
     * @param SensitiveInfoCnt <p>敏感信息数</p>
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get <p>是否信任镜像</p> 
     * @return IsTrustImage <p>是否信任镜像</p>
     */
    public Boolean getIsTrustImage() {
        return this.IsTrustImage;
    }

    /**
     * Set <p>是否信任镜像</p>
     * @param IsTrustImage <p>是否信任镜像</p>
     */
    public void setIsTrustImage(Boolean IsTrustImage) {
        this.IsTrustImage = IsTrustImage;
    }

    /**
     * Get <p>镜像系统</p> 
     * @return OsName <p>镜像系统</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>镜像系统</p>
     * @param OsName <p>镜像系统</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>agent镜像扫描错误</p> 
     * @return AgentError <p>agent镜像扫描错误</p>
     */
    public String getAgentError() {
        return this.AgentError;
    }

    /**
     * Set <p>agent镜像扫描错误</p>
     * @param AgentError <p>agent镜像扫描错误</p>
     */
    public void setAgentError(String AgentError) {
        this.AgentError = AgentError;
    }

    /**
     * Get <p>后端镜像扫描错误</p> 
     * @return ScanError <p>后端镜像扫描错误</p>
     */
    public String getScanError() {
        return this.ScanError;
    }

    /**
     * Set <p>后端镜像扫描错误</p>
     * @param ScanError <p>后端镜像扫描错误</p>
     */
    public void setScanError(String ScanError) {
        this.ScanError = ScanError;
    }

    /**
     * Get <p>系统架构</p> 
     * @return Architecture <p>系统架构</p>
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set <p>系统架构</p>
     * @param Architecture <p>系统架构</p>
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get <p>作者</p> 
     * @return Author <p>作者</p>
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set <p>作者</p>
     * @param Author <p>作者</p>
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get <p>构建历史</p> 
     * @return BuildHistory <p>构建历史</p>
     */
    public String getBuildHistory() {
        return this.BuildHistory;
    }

    /**
     * Set <p>构建历史</p>
     * @param BuildHistory <p>构建历史</p>
     */
    public void setBuildHistory(String BuildHistory) {
        this.BuildHistory = BuildHistory;
    }

    /**
     * Get <p>木马扫描进度</p> 
     * @return ScanVirusProgress <p>木马扫描进度</p>
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set <p>木马扫描进度</p>
     * @param ScanVirusProgress <p>木马扫描进度</p>
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get <p>漏洞扫进度</p> 
     * @return ScanVulProgress <p>漏洞扫进度</p>
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set <p>漏洞扫进度</p>
     * @param ScanVulProgress <p>漏洞扫进度</p>
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get <p>敏感信息扫描进度</p> 
     * @return ScanRiskProgress <p>敏感信息扫描进度</p>
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set <p>敏感信息扫描进度</p>
     * @param ScanRiskProgress <p>敏感信息扫描进度</p>
     */
    public void setScanRiskProgress(Long ScanRiskProgress) {
        this.ScanRiskProgress = ScanRiskProgress;
    }

    /**
     * Get <p>木马扫描错误</p> 
     * @return ScanVirusError <p>木马扫描错误</p>
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set <p>木马扫描错误</p>
     * @param ScanVirusError <p>木马扫描错误</p>
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get <p>漏洞扫描错误</p> 
     * @return ScanVulError <p>漏洞扫描错误</p>
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set <p>漏洞扫描错误</p>
     * @param ScanVulError <p>漏洞扫描错误</p>
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get <p>敏感信息错误</p> 
     * @return ScanRiskError <p>敏感信息错误</p>
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set <p>敏感信息错误</p>
     * @param ScanRiskError <p>敏感信息错误</p>
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get <p>镜像扫描状态</p> 
     * @return ScanStatus <p>镜像扫描状态</p>
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set <p>镜像扫描状态</p>
     * @param ScanStatus <p>镜像扫描状态</p>
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get <p>木马病毒数</p> 
     * @return VirusCnt <p>木马病毒数</p>
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set <p>木马病毒数</p>
     * @param VirusCnt <p>木马病毒数</p>
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get <p>镜像扫描状态</p> 
     * @return Status <p>镜像扫描状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>镜像扫描状态</p>
     * @param Status <p>镜像扫描状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>剩余扫描时间</p> 
     * @return RemainScanTime <p>剩余扫描时间</p>
     */
    public Long getRemainScanTime() {
        return this.RemainScanTime;
    }

    /**
     * Set <p>剩余扫描时间</p>
     * @param RemainScanTime <p>剩余扫描时间</p>
     */
    public void setRemainScanTime(Long RemainScanTime) {
        this.RemainScanTime = RemainScanTime;
    }

    /**
     * Get <p>授权为：1，未授权为：0</p> 
     * @return IsAuthorized <p>授权为：1，未授权为：0</p>
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set <p>授权为：1，未授权为：0</p>
     * @param IsAuthorized <p>授权为：1，未授权为：0</p>
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get <p>解决方案</p> 
     * @return Solution <p>解决方案</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>解决方案</p>
     * @param Solution <p>解决方案</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>原因</p> 
     * @return Reason <p>原因</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>原因</p>
     * @param Reason <p>原因</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>仓库Digests</p> 
     * @return RepoDigests <p>仓库Digests</p>
     */
    public String [] getRepoDigests() {
        return this.RepoDigests;
    }

    /**
     * Set <p>仓库Digests</p>
     * @param RepoDigests <p>仓库Digests</p>
     */
    public void setRepoDigests(String [] RepoDigests) {
        this.RepoDigests = RepoDigests;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.ImageDigest != null) {
            this.ImageDigest = new String(source.ImageDigest);
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
        if (source.SuperNodeCnt != null) {
            this.SuperNodeCnt = new Long(source.SuperNodeCnt);
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
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.RepoDigests != null) {
            this.RepoDigests = new String[source.RepoDigests.length];
            for (int i = 0; i < source.RepoDigests.length; i++) {
                this.RepoDigests[i] = new String(source.RepoDigests[i]);
            }
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
        this.setParamSimple(map, prefix + "ImageDigest", this.ImageDigest);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "SuperNodeCnt", this.SuperNodeCnt);
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
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArraySimple(map, prefix + "RepoDigests.", this.RepoDigests);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

