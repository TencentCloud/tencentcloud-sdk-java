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
    */
    @SerializedName("ImageDigest")
    @Expose
    private String ImageDigest;

    /**
    * 镜像地址
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * 镜像类型
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * 仓库名称
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
    * 扫描时间
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
    * 层文件信息
    */
    @SerializedName("LayerInfo")
    @Expose
    private String LayerInfo;

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
    * 木马信息扫描进度
    */
    @SerializedName("ScanVirusProgress")
    @Expose
    private Long ScanVirusProgress;

    /**
    * 漏洞扫描进度
    */
    @SerializedName("ScanVulProgress")
    @Expose
    private Long ScanVulProgress;

    /**
    * 敏感扫描进度
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
    * 镜像大小
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 镜像Id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像区域
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * 镜像创建的时间
    */
    @SerializedName("ImageCreateTime")
    @Expose
    private String ImageCreateTime;

    /**
    * 敏感信息数
    */
    @SerializedName("SensitiveInfoCnt")
    @Expose
    private Long SensitiveInfoCnt;

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 镜像地址 
     * @return ImageRepoAddress 镜像地址
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set 镜像地址
     * @param ImageRepoAddress 镜像地址
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get 镜像类型 
     * @return RegistryType 镜像类型
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set 镜像类型
     * @param RegistryType 镜像类型
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get 仓库名称 
     * @return ImageName 仓库名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 仓库名称
     * @param ImageName 仓库名称
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
     * Get 扫描时间 
     * @return ScanTime 扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫描时间
     * @param ScanTime 扫描时间
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
     * Get 层文件信息 
     * @return LayerInfo 层文件信息
     */
    public String getLayerInfo() {
        return this.LayerInfo;
    }

    /**
     * Set 层文件信息
     * @param LayerInfo 层文件信息
     */
    public void setLayerInfo(String LayerInfo) {
        this.LayerInfo = LayerInfo;
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
     * Get 木马信息扫描进度 
     * @return ScanVirusProgress 木马信息扫描进度
     */
    public Long getScanVirusProgress() {
        return this.ScanVirusProgress;
    }

    /**
     * Set 木马信息扫描进度
     * @param ScanVirusProgress 木马信息扫描进度
     */
    public void setScanVirusProgress(Long ScanVirusProgress) {
        this.ScanVirusProgress = ScanVirusProgress;
    }

    /**
     * Get 漏洞扫描进度 
     * @return ScanVulProgress 漏洞扫描进度
     */
    public Long getScanVulProgress() {
        return this.ScanVulProgress;
    }

    /**
     * Set 漏洞扫描进度
     * @param ScanVulProgress 漏洞扫描进度
     */
    public void setScanVulProgress(Long ScanVulProgress) {
        this.ScanVulProgress = ScanVulProgress;
    }

    /**
     * Get 敏感扫描进度 
     * @return ScanRiskProgress 敏感扫描进度
     */
    public Long getScanRiskProgress() {
        return this.ScanRiskProgress;
    }

    /**
     * Set 敏感扫描进度
     * @param ScanRiskProgress 敏感扫描进度
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
     * Get 镜像区域 
     * @return RegistryRegion 镜像区域
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set 镜像区域
     * @param RegistryRegion 镜像区域
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
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
     * Get 敏感信息数 
     * @return SensitiveInfoCnt 敏感信息数
     */
    public Long getSensitiveInfoCnt() {
        return this.SensitiveInfoCnt;
    }

    /**
     * Set 敏感信息数
     * @param SensitiveInfoCnt 敏感信息数
     */
    public void setSensitiveInfoCnt(Long SensitiveInfoCnt) {
        this.SensitiveInfoCnt = SensitiveInfoCnt;
    }

    /**
     * Get Id 
     * @return Id Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(Long Id) {
        this.Id = Id;
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
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

