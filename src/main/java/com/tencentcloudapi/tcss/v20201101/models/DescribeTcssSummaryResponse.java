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

public class DescribeTcssSummaryResponse extends AbstractModel{

    /**
    * 镜像总数
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 已扫描镜像数
    */
    @SerializedName("ScannedImageCnt")
    @Expose
    private Long ScannedImageCnt;

    /**
    * 待扫描镜像个数
    */
    @SerializedName("UnScannedImageCnt")
    @Expose
    private Long UnScannedImageCnt;

    /**
    * 本地镜像个数
    */
    @SerializedName("LocalImageCnt")
    @Expose
    private Long LocalImageCnt;

    /**
    * 仓库镜像个数
    */
    @SerializedName("RepositoryImageCnt")
    @Expose
    private Long RepositoryImageCnt;

    /**
    * 风险本地镜像个数
    */
    @SerializedName("RiskLocalImageCnt")
    @Expose
    private Long RiskLocalImageCnt;

    /**
    * 风险仓库镜像个数
    */
    @SerializedName("RiskRepositoryImageCnt")
    @Expose
    private Long RiskRepositoryImageCnt;

    /**
    * 容器个数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 风险容器个数
    */
    @SerializedName("RiskContainerCnt")
    @Expose
    private Long RiskContainerCnt;

    /**
    * 集群个数
    */
    @SerializedName("ClusterCnt")
    @Expose
    private Long ClusterCnt;

    /**
    * 风险集群个数
    */
    @SerializedName("RiskClusterCnt")
    @Expose
    private Long RiskClusterCnt;

    /**
    * 待扫描漏洞个数
    */
    @SerializedName("UnScannedVulCnt")
    @Expose
    private Long UnScannedVulCnt;

    /**
    * 风险漏洞个数
    */
    @SerializedName("RiskVulCnt")
    @Expose
    private Long RiskVulCnt;

    /**
    * 安全基线待扫描项个数
    */
    @SerializedName("UnScannedBaseLineCnt")
    @Expose
    private Long UnScannedBaseLineCnt;

    /**
    * 安全基线风险个数
    */
    @SerializedName("RiskBaseLineCnt")
    @Expose
    private Long RiskBaseLineCnt;

    /**
    * 运行时(高危)待处理事件个数
    */
    @SerializedName("RuntimeUnhandleEventCnt")
    @Expose
    private Long RuntimeUnhandleEventCnt;

    /**
    * 待扫描集群个数
    */
    @SerializedName("UnScannedClusterCnt")
    @Expose
    private Long UnScannedClusterCnt;

    /**
    * 是否已扫描镜像
    */
    @SerializedName("ScanImageStatus")
    @Expose
    private Boolean ScanImageStatus;

    /**
    * 是否已扫描集群
    */
    @SerializedName("ScanClusterStatus")
    @Expose
    private Boolean ScanClusterStatus;

    /**
    * 是否已扫描基线
    */
    @SerializedName("ScanBaseLineStatus")
    @Expose
    private Boolean ScanBaseLineStatus;

    /**
    * 是否已扫描漏洞
    */
    @SerializedName("ScanVulStatus")
    @Expose
    private Boolean ScanVulStatus;

    /**
    * 漏洞影响镜像数
    */
    @SerializedName("VulRiskImageCnt")
    @Expose
    private Long VulRiskImageCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像总数 
     * @return ImageCnt 镜像总数
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 镜像总数
     * @param ImageCnt 镜像总数
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 已扫描镜像数 
     * @return ScannedImageCnt 已扫描镜像数
     */
    public Long getScannedImageCnt() {
        return this.ScannedImageCnt;
    }

    /**
     * Set 已扫描镜像数
     * @param ScannedImageCnt 已扫描镜像数
     */
    public void setScannedImageCnt(Long ScannedImageCnt) {
        this.ScannedImageCnt = ScannedImageCnt;
    }

    /**
     * Get 待扫描镜像个数 
     * @return UnScannedImageCnt 待扫描镜像个数
     */
    public Long getUnScannedImageCnt() {
        return this.UnScannedImageCnt;
    }

    /**
     * Set 待扫描镜像个数
     * @param UnScannedImageCnt 待扫描镜像个数
     */
    public void setUnScannedImageCnt(Long UnScannedImageCnt) {
        this.UnScannedImageCnt = UnScannedImageCnt;
    }

    /**
     * Get 本地镜像个数 
     * @return LocalImageCnt 本地镜像个数
     */
    public Long getLocalImageCnt() {
        return this.LocalImageCnt;
    }

    /**
     * Set 本地镜像个数
     * @param LocalImageCnt 本地镜像个数
     */
    public void setLocalImageCnt(Long LocalImageCnt) {
        this.LocalImageCnt = LocalImageCnt;
    }

    /**
     * Get 仓库镜像个数 
     * @return RepositoryImageCnt 仓库镜像个数
     */
    public Long getRepositoryImageCnt() {
        return this.RepositoryImageCnt;
    }

    /**
     * Set 仓库镜像个数
     * @param RepositoryImageCnt 仓库镜像个数
     */
    public void setRepositoryImageCnt(Long RepositoryImageCnt) {
        this.RepositoryImageCnt = RepositoryImageCnt;
    }

    /**
     * Get 风险本地镜像个数 
     * @return RiskLocalImageCnt 风险本地镜像个数
     */
    public Long getRiskLocalImageCnt() {
        return this.RiskLocalImageCnt;
    }

    /**
     * Set 风险本地镜像个数
     * @param RiskLocalImageCnt 风险本地镜像个数
     */
    public void setRiskLocalImageCnt(Long RiskLocalImageCnt) {
        this.RiskLocalImageCnt = RiskLocalImageCnt;
    }

    /**
     * Get 风险仓库镜像个数 
     * @return RiskRepositoryImageCnt 风险仓库镜像个数
     */
    public Long getRiskRepositoryImageCnt() {
        return this.RiskRepositoryImageCnt;
    }

    /**
     * Set 风险仓库镜像个数
     * @param RiskRepositoryImageCnt 风险仓库镜像个数
     */
    public void setRiskRepositoryImageCnt(Long RiskRepositoryImageCnt) {
        this.RiskRepositoryImageCnt = RiskRepositoryImageCnt;
    }

    /**
     * Get 容器个数 
     * @return ContainerCnt 容器个数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 容器个数
     * @param ContainerCnt 容器个数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 风险容器个数 
     * @return RiskContainerCnt 风险容器个数
     */
    public Long getRiskContainerCnt() {
        return this.RiskContainerCnt;
    }

    /**
     * Set 风险容器个数
     * @param RiskContainerCnt 风险容器个数
     */
    public void setRiskContainerCnt(Long RiskContainerCnt) {
        this.RiskContainerCnt = RiskContainerCnt;
    }

    /**
     * Get 集群个数 
     * @return ClusterCnt 集群个数
     */
    public Long getClusterCnt() {
        return this.ClusterCnt;
    }

    /**
     * Set 集群个数
     * @param ClusterCnt 集群个数
     */
    public void setClusterCnt(Long ClusterCnt) {
        this.ClusterCnt = ClusterCnt;
    }

    /**
     * Get 风险集群个数 
     * @return RiskClusterCnt 风险集群个数
     */
    public Long getRiskClusterCnt() {
        return this.RiskClusterCnt;
    }

    /**
     * Set 风险集群个数
     * @param RiskClusterCnt 风险集群个数
     */
    public void setRiskClusterCnt(Long RiskClusterCnt) {
        this.RiskClusterCnt = RiskClusterCnt;
    }

    /**
     * Get 待扫描漏洞个数 
     * @return UnScannedVulCnt 待扫描漏洞个数
     */
    public Long getUnScannedVulCnt() {
        return this.UnScannedVulCnt;
    }

    /**
     * Set 待扫描漏洞个数
     * @param UnScannedVulCnt 待扫描漏洞个数
     */
    public void setUnScannedVulCnt(Long UnScannedVulCnt) {
        this.UnScannedVulCnt = UnScannedVulCnt;
    }

    /**
     * Get 风险漏洞个数 
     * @return RiskVulCnt 风险漏洞个数
     */
    public Long getRiskVulCnt() {
        return this.RiskVulCnt;
    }

    /**
     * Set 风险漏洞个数
     * @param RiskVulCnt 风险漏洞个数
     */
    public void setRiskVulCnt(Long RiskVulCnt) {
        this.RiskVulCnt = RiskVulCnt;
    }

    /**
     * Get 安全基线待扫描项个数 
     * @return UnScannedBaseLineCnt 安全基线待扫描项个数
     */
    public Long getUnScannedBaseLineCnt() {
        return this.UnScannedBaseLineCnt;
    }

    /**
     * Set 安全基线待扫描项个数
     * @param UnScannedBaseLineCnt 安全基线待扫描项个数
     */
    public void setUnScannedBaseLineCnt(Long UnScannedBaseLineCnt) {
        this.UnScannedBaseLineCnt = UnScannedBaseLineCnt;
    }

    /**
     * Get 安全基线风险个数 
     * @return RiskBaseLineCnt 安全基线风险个数
     */
    public Long getRiskBaseLineCnt() {
        return this.RiskBaseLineCnt;
    }

    /**
     * Set 安全基线风险个数
     * @param RiskBaseLineCnt 安全基线风险个数
     */
    public void setRiskBaseLineCnt(Long RiskBaseLineCnt) {
        this.RiskBaseLineCnt = RiskBaseLineCnt;
    }

    /**
     * Get 运行时(高危)待处理事件个数 
     * @return RuntimeUnhandleEventCnt 运行时(高危)待处理事件个数
     */
    public Long getRuntimeUnhandleEventCnt() {
        return this.RuntimeUnhandleEventCnt;
    }

    /**
     * Set 运行时(高危)待处理事件个数
     * @param RuntimeUnhandleEventCnt 运行时(高危)待处理事件个数
     */
    public void setRuntimeUnhandleEventCnt(Long RuntimeUnhandleEventCnt) {
        this.RuntimeUnhandleEventCnt = RuntimeUnhandleEventCnt;
    }

    /**
     * Get 待扫描集群个数 
     * @return UnScannedClusterCnt 待扫描集群个数
     */
    public Long getUnScannedClusterCnt() {
        return this.UnScannedClusterCnt;
    }

    /**
     * Set 待扫描集群个数
     * @param UnScannedClusterCnt 待扫描集群个数
     */
    public void setUnScannedClusterCnt(Long UnScannedClusterCnt) {
        this.UnScannedClusterCnt = UnScannedClusterCnt;
    }

    /**
     * Get 是否已扫描镜像 
     * @return ScanImageStatus 是否已扫描镜像
     */
    public Boolean getScanImageStatus() {
        return this.ScanImageStatus;
    }

    /**
     * Set 是否已扫描镜像
     * @param ScanImageStatus 是否已扫描镜像
     */
    public void setScanImageStatus(Boolean ScanImageStatus) {
        this.ScanImageStatus = ScanImageStatus;
    }

    /**
     * Get 是否已扫描集群 
     * @return ScanClusterStatus 是否已扫描集群
     */
    public Boolean getScanClusterStatus() {
        return this.ScanClusterStatus;
    }

    /**
     * Set 是否已扫描集群
     * @param ScanClusterStatus 是否已扫描集群
     */
    public void setScanClusterStatus(Boolean ScanClusterStatus) {
        this.ScanClusterStatus = ScanClusterStatus;
    }

    /**
     * Get 是否已扫描基线 
     * @return ScanBaseLineStatus 是否已扫描基线
     */
    public Boolean getScanBaseLineStatus() {
        return this.ScanBaseLineStatus;
    }

    /**
     * Set 是否已扫描基线
     * @param ScanBaseLineStatus 是否已扫描基线
     */
    public void setScanBaseLineStatus(Boolean ScanBaseLineStatus) {
        this.ScanBaseLineStatus = ScanBaseLineStatus;
    }

    /**
     * Get 是否已扫描漏洞 
     * @return ScanVulStatus 是否已扫描漏洞
     */
    public Boolean getScanVulStatus() {
        return this.ScanVulStatus;
    }

    /**
     * Set 是否已扫描漏洞
     * @param ScanVulStatus 是否已扫描漏洞
     */
    public void setScanVulStatus(Boolean ScanVulStatus) {
        this.ScanVulStatus = ScanVulStatus;
    }

    /**
     * Get 漏洞影响镜像数 
     * @return VulRiskImageCnt 漏洞影响镜像数
     */
    public Long getVulRiskImageCnt() {
        return this.VulRiskImageCnt;
    }

    /**
     * Set 漏洞影响镜像数
     * @param VulRiskImageCnt 漏洞影响镜像数
     */
    public void setVulRiskImageCnt(Long VulRiskImageCnt) {
        this.VulRiskImageCnt = VulRiskImageCnt;
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

    public DescribeTcssSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTcssSummaryResponse(DescribeTcssSummaryResponse source) {
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.ScannedImageCnt != null) {
            this.ScannedImageCnt = new Long(source.ScannedImageCnt);
        }
        if (source.UnScannedImageCnt != null) {
            this.UnScannedImageCnt = new Long(source.UnScannedImageCnt);
        }
        if (source.LocalImageCnt != null) {
            this.LocalImageCnt = new Long(source.LocalImageCnt);
        }
        if (source.RepositoryImageCnt != null) {
            this.RepositoryImageCnt = new Long(source.RepositoryImageCnt);
        }
        if (source.RiskLocalImageCnt != null) {
            this.RiskLocalImageCnt = new Long(source.RiskLocalImageCnt);
        }
        if (source.RiskRepositoryImageCnt != null) {
            this.RiskRepositoryImageCnt = new Long(source.RiskRepositoryImageCnt);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.RiskContainerCnt != null) {
            this.RiskContainerCnt = new Long(source.RiskContainerCnt);
        }
        if (source.ClusterCnt != null) {
            this.ClusterCnt = new Long(source.ClusterCnt);
        }
        if (source.RiskClusterCnt != null) {
            this.RiskClusterCnt = new Long(source.RiskClusterCnt);
        }
        if (source.UnScannedVulCnt != null) {
            this.UnScannedVulCnt = new Long(source.UnScannedVulCnt);
        }
        if (source.RiskVulCnt != null) {
            this.RiskVulCnt = new Long(source.RiskVulCnt);
        }
        if (source.UnScannedBaseLineCnt != null) {
            this.UnScannedBaseLineCnt = new Long(source.UnScannedBaseLineCnt);
        }
        if (source.RiskBaseLineCnt != null) {
            this.RiskBaseLineCnt = new Long(source.RiskBaseLineCnt);
        }
        if (source.RuntimeUnhandleEventCnt != null) {
            this.RuntimeUnhandleEventCnt = new Long(source.RuntimeUnhandleEventCnt);
        }
        if (source.UnScannedClusterCnt != null) {
            this.UnScannedClusterCnt = new Long(source.UnScannedClusterCnt);
        }
        if (source.ScanImageStatus != null) {
            this.ScanImageStatus = new Boolean(source.ScanImageStatus);
        }
        if (source.ScanClusterStatus != null) {
            this.ScanClusterStatus = new Boolean(source.ScanClusterStatus);
        }
        if (source.ScanBaseLineStatus != null) {
            this.ScanBaseLineStatus = new Boolean(source.ScanBaseLineStatus);
        }
        if (source.ScanVulStatus != null) {
            this.ScanVulStatus = new Boolean(source.ScanVulStatus);
        }
        if (source.VulRiskImageCnt != null) {
            this.VulRiskImageCnt = new Long(source.VulRiskImageCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "ScannedImageCnt", this.ScannedImageCnt);
        this.setParamSimple(map, prefix + "UnScannedImageCnt", this.UnScannedImageCnt);
        this.setParamSimple(map, prefix + "LocalImageCnt", this.LocalImageCnt);
        this.setParamSimple(map, prefix + "RepositoryImageCnt", this.RepositoryImageCnt);
        this.setParamSimple(map, prefix + "RiskLocalImageCnt", this.RiskLocalImageCnt);
        this.setParamSimple(map, prefix + "RiskRepositoryImageCnt", this.RiskRepositoryImageCnt);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "RiskContainerCnt", this.RiskContainerCnt);
        this.setParamSimple(map, prefix + "ClusterCnt", this.ClusterCnt);
        this.setParamSimple(map, prefix + "RiskClusterCnt", this.RiskClusterCnt);
        this.setParamSimple(map, prefix + "UnScannedVulCnt", this.UnScannedVulCnt);
        this.setParamSimple(map, prefix + "RiskVulCnt", this.RiskVulCnt);
        this.setParamSimple(map, prefix + "UnScannedBaseLineCnt", this.UnScannedBaseLineCnt);
        this.setParamSimple(map, prefix + "RiskBaseLineCnt", this.RiskBaseLineCnt);
        this.setParamSimple(map, prefix + "RuntimeUnhandleEventCnt", this.RuntimeUnhandleEventCnt);
        this.setParamSimple(map, prefix + "UnScannedClusterCnt", this.UnScannedClusterCnt);
        this.setParamSimple(map, prefix + "ScanImageStatus", this.ScanImageStatus);
        this.setParamSimple(map, prefix + "ScanClusterStatus", this.ScanClusterStatus);
        this.setParamSimple(map, prefix + "ScanBaseLineStatus", this.ScanBaseLineStatus);
        this.setParamSimple(map, prefix + "ScanVulStatus", this.ScanVulStatus);
        this.setParamSimple(map, prefix + "VulRiskImageCnt", this.VulRiskImageCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

