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

public class ImagesInfo extends AbstractModel{

    /**
    * 镜像id
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
    * 主机个数
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
    * 容器个数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 漏洞个数
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * 病毒个数
    */
    @SerializedName("VirusCnt")
    @Expose
    private Long VirusCnt;

    /**
    * 敏感信息个数
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

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
    */
    @SerializedName("AgentError")
    @Expose
    private String AgentError;

    /**
    * 后端镜像扫描错误
    */
    @SerializedName("ScanError")
    @Expose
    private String ScanError;

    /**
    * 扫描状态
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * 木马扫描错误信息
    */
    @SerializedName("ScanVirusError")
    @Expose
    private String ScanVirusError;

    /**
    * 漏洞扫描错误信息
    */
    @SerializedName("ScanVulError")
    @Expose
    private String ScanVulError;

    /**
    * 风险扫描错误信息
    */
    @SerializedName("ScanRiskError")
    @Expose
    private String ScanRiskError;

    /**
    * 是否是重点关注镜像，为0不是，非0是
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * 是否授权，1是0否
    */
    @SerializedName("IsAuthorized")
    @Expose
    private Long IsAuthorized;

    /**
    * 组件个数
    */
    @SerializedName("ComponentCnt")
    @Expose
    private Long ComponentCnt;

    /**
     * Get 镜像id 
     * @return ImageID 镜像id
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像id
     * @param ImageID 镜像id
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
     * Get 主机个数 
     * @return HostCnt 主机个数
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set 主机个数
     * @param HostCnt 主机个数
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
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
     * Get 漏洞个数 
     * @return VulCnt 漏洞个数
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set 漏洞个数
     * @param VulCnt 漏洞个数
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get 病毒个数 
     * @return VirusCnt 病毒个数
     */
    public Long getVirusCnt() {
        return this.VirusCnt;
    }

    /**
     * Set 病毒个数
     * @param VirusCnt 病毒个数
     */
    public void setVirusCnt(Long VirusCnt) {
        this.VirusCnt = VirusCnt;
    }

    /**
     * Get 敏感信息个数 
     * @return RiskCnt 敏感信息个数
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 敏感信息个数
     * @param RiskCnt 敏感信息个数
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
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
     * @return AgentError agent镜像扫描错误
     */
    public String getAgentError() {
        return this.AgentError;
    }

    /**
     * Set agent镜像扫描错误
     * @param AgentError agent镜像扫描错误
     */
    public void setAgentError(String AgentError) {
        this.AgentError = AgentError;
    }

    /**
     * Get 后端镜像扫描错误 
     * @return ScanError 后端镜像扫描错误
     */
    public String getScanError() {
        return this.ScanError;
    }

    /**
     * Set 后端镜像扫描错误
     * @param ScanError 后端镜像扫描错误
     */
    public void setScanError(String ScanError) {
        this.ScanError = ScanError;
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
     * Get 木马扫描错误信息 
     * @return ScanVirusError 木马扫描错误信息
     */
    public String getScanVirusError() {
        return this.ScanVirusError;
    }

    /**
     * Set 木马扫描错误信息
     * @param ScanVirusError 木马扫描错误信息
     */
    public void setScanVirusError(String ScanVirusError) {
        this.ScanVirusError = ScanVirusError;
    }

    /**
     * Get 漏洞扫描错误信息 
     * @return ScanVulError 漏洞扫描错误信息
     */
    public String getScanVulError() {
        return this.ScanVulError;
    }

    /**
     * Set 漏洞扫描错误信息
     * @param ScanVulError 漏洞扫描错误信息
     */
    public void setScanVulError(String ScanVulError) {
        this.ScanVulError = ScanVulError;
    }

    /**
     * Get 风险扫描错误信息 
     * @return ScanRiskError 风险扫描错误信息
     */
    public String getScanRiskError() {
        return this.ScanRiskError;
    }

    /**
     * Set 风险扫描错误信息
     * @param ScanRiskError 风险扫描错误信息
     */
    public void setScanRiskError(String ScanRiskError) {
        this.ScanRiskError = ScanRiskError;
    }

    /**
     * Get 是否是重点关注镜像，为0不是，非0是 
     * @return IsSuggest 是否是重点关注镜像，为0不是，非0是
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set 是否是重点关注镜像，为0不是，非0是
     * @param IsSuggest 是否是重点关注镜像，为0不是，非0是
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get 是否授权，1是0否 
     * @return IsAuthorized 是否授权，1是0否
     */
    public Long getIsAuthorized() {
        return this.IsAuthorized;
    }

    /**
     * Set 是否授权，1是0否
     * @param IsAuthorized 是否授权，1是0否
     */
    public void setIsAuthorized(Long IsAuthorized) {
        this.IsAuthorized = IsAuthorized;
    }

    /**
     * Get 组件个数 
     * @return ComponentCnt 组件个数
     */
    public Long getComponentCnt() {
        return this.ComponentCnt;
    }

    /**
     * Set 组件个数
     * @param ComponentCnt 组件个数
     */
    public void setComponentCnt(Long ComponentCnt) {
        this.ComponentCnt = ComponentCnt;
    }

    public ImagesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImagesInfo(ImagesInfo source) {
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
        if (source.VirusCnt != null) {
            this.VirusCnt = new Long(source.VirusCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
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
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
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
        if (source.IsSuggest != null) {
            this.IsSuggest = new Long(source.IsSuggest);
        }
        if (source.IsAuthorized != null) {
            this.IsAuthorized = new Long(source.IsAuthorized);
        }
        if (source.ComponentCnt != null) {
            this.ComponentCnt = new Long(source.ComponentCnt);
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
        this.setParamSimple(map, prefix + "VirusCnt", this.VirusCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "IsTrustImage", this.IsTrustImage);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "AgentError", this.AgentError);
        this.setParamSimple(map, prefix + "ScanError", this.ScanError);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanVirusError", this.ScanVirusError);
        this.setParamSimple(map, prefix + "ScanVulError", this.ScanVulError);
        this.setParamSimple(map, prefix + "ScanRiskError", this.ScanRiskError);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamSimple(map, prefix + "IsAuthorized", this.IsAuthorized);
        this.setParamSimple(map, prefix + "ComponentCnt", this.ComponentCnt);

    }
}

