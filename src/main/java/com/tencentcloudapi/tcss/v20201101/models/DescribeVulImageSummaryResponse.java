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

public class DescribeVulImageSummaryResponse extends AbstractModel{

    /**
    * 受严重或高危漏洞影响的镜像数
    */
    @SerializedName("SeriousVulImageCount")
    @Expose
    private Long SeriousVulImageCount;

    /**
    * 已扫描的镜像数
    */
    @SerializedName("ScannedImageCount")
    @Expose
    private Long ScannedImageCount;

    /**
    * 漏洞总数量
    */
    @SerializedName("VulTotalCount")
    @Expose
    private Long VulTotalCount;

    /**
    * 系统漏洞数
    */
    @SerializedName("SysTemVulCount")
    @Expose
    private Long SysTemVulCount;

    /**
    * web应用漏洞数
    */
    @SerializedName("WebVulCount")
    @Expose
    private Long WebVulCount;

    /**
    * 已授权镜像数
    */
    @SerializedName("AllAuthorizedImageCount")
    @Expose
    private Long AllAuthorizedImageCount;

    /**
    * 应急漏洞数
    */
    @SerializedName("EmergencyVulCount")
    @Expose
    private Long EmergencyVulCount;

    /**
    * 支持扫描的漏洞总数量
    */
    @SerializedName("SupportVulTotalCount")
    @Expose
    private Long SupportVulTotalCount;

    /**
    * 漏洞库更新时间
    */
    @SerializedName("VulLibraryUpdateTime")
    @Expose
    private String VulLibraryUpdateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 受严重或高危漏洞影响的镜像数 
     * @return SeriousVulImageCount 受严重或高危漏洞影响的镜像数
     */
    public Long getSeriousVulImageCount() {
        return this.SeriousVulImageCount;
    }

    /**
     * Set 受严重或高危漏洞影响的镜像数
     * @param SeriousVulImageCount 受严重或高危漏洞影响的镜像数
     */
    public void setSeriousVulImageCount(Long SeriousVulImageCount) {
        this.SeriousVulImageCount = SeriousVulImageCount;
    }

    /**
     * Get 已扫描的镜像数 
     * @return ScannedImageCount 已扫描的镜像数
     */
    public Long getScannedImageCount() {
        return this.ScannedImageCount;
    }

    /**
     * Set 已扫描的镜像数
     * @param ScannedImageCount 已扫描的镜像数
     */
    public void setScannedImageCount(Long ScannedImageCount) {
        this.ScannedImageCount = ScannedImageCount;
    }

    /**
     * Get 漏洞总数量 
     * @return VulTotalCount 漏洞总数量
     */
    public Long getVulTotalCount() {
        return this.VulTotalCount;
    }

    /**
     * Set 漏洞总数量
     * @param VulTotalCount 漏洞总数量
     */
    public void setVulTotalCount(Long VulTotalCount) {
        this.VulTotalCount = VulTotalCount;
    }

    /**
     * Get 系统漏洞数 
     * @return SysTemVulCount 系统漏洞数
     */
    public Long getSysTemVulCount() {
        return this.SysTemVulCount;
    }

    /**
     * Set 系统漏洞数
     * @param SysTemVulCount 系统漏洞数
     */
    public void setSysTemVulCount(Long SysTemVulCount) {
        this.SysTemVulCount = SysTemVulCount;
    }

    /**
     * Get web应用漏洞数 
     * @return WebVulCount web应用漏洞数
     */
    public Long getWebVulCount() {
        return this.WebVulCount;
    }

    /**
     * Set web应用漏洞数
     * @param WebVulCount web应用漏洞数
     */
    public void setWebVulCount(Long WebVulCount) {
        this.WebVulCount = WebVulCount;
    }

    /**
     * Get 已授权镜像数 
     * @return AllAuthorizedImageCount 已授权镜像数
     */
    public Long getAllAuthorizedImageCount() {
        return this.AllAuthorizedImageCount;
    }

    /**
     * Set 已授权镜像数
     * @param AllAuthorizedImageCount 已授权镜像数
     */
    public void setAllAuthorizedImageCount(Long AllAuthorizedImageCount) {
        this.AllAuthorizedImageCount = AllAuthorizedImageCount;
    }

    /**
     * Get 应急漏洞数 
     * @return EmergencyVulCount 应急漏洞数
     */
    public Long getEmergencyVulCount() {
        return this.EmergencyVulCount;
    }

    /**
     * Set 应急漏洞数
     * @param EmergencyVulCount 应急漏洞数
     */
    public void setEmergencyVulCount(Long EmergencyVulCount) {
        this.EmergencyVulCount = EmergencyVulCount;
    }

    /**
     * Get 支持扫描的漏洞总数量 
     * @return SupportVulTotalCount 支持扫描的漏洞总数量
     */
    public Long getSupportVulTotalCount() {
        return this.SupportVulTotalCount;
    }

    /**
     * Set 支持扫描的漏洞总数量
     * @param SupportVulTotalCount 支持扫描的漏洞总数量
     */
    public void setSupportVulTotalCount(Long SupportVulTotalCount) {
        this.SupportVulTotalCount = SupportVulTotalCount;
    }

    /**
     * Get 漏洞库更新时间 
     * @return VulLibraryUpdateTime 漏洞库更新时间
     */
    public String getVulLibraryUpdateTime() {
        return this.VulLibraryUpdateTime;
    }

    /**
     * Set 漏洞库更新时间
     * @param VulLibraryUpdateTime 漏洞库更新时间
     */
    public void setVulLibraryUpdateTime(String VulLibraryUpdateTime) {
        this.VulLibraryUpdateTime = VulLibraryUpdateTime;
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

    public DescribeVulImageSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulImageSummaryResponse(DescribeVulImageSummaryResponse source) {
        if (source.SeriousVulImageCount != null) {
            this.SeriousVulImageCount = new Long(source.SeriousVulImageCount);
        }
        if (source.ScannedImageCount != null) {
            this.ScannedImageCount = new Long(source.ScannedImageCount);
        }
        if (source.VulTotalCount != null) {
            this.VulTotalCount = new Long(source.VulTotalCount);
        }
        if (source.SysTemVulCount != null) {
            this.SysTemVulCount = new Long(source.SysTemVulCount);
        }
        if (source.WebVulCount != null) {
            this.WebVulCount = new Long(source.WebVulCount);
        }
        if (source.AllAuthorizedImageCount != null) {
            this.AllAuthorizedImageCount = new Long(source.AllAuthorizedImageCount);
        }
        if (source.EmergencyVulCount != null) {
            this.EmergencyVulCount = new Long(source.EmergencyVulCount);
        }
        if (source.SupportVulTotalCount != null) {
            this.SupportVulTotalCount = new Long(source.SupportVulTotalCount);
        }
        if (source.VulLibraryUpdateTime != null) {
            this.VulLibraryUpdateTime = new String(source.VulLibraryUpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeriousVulImageCount", this.SeriousVulImageCount);
        this.setParamSimple(map, prefix + "ScannedImageCount", this.ScannedImageCount);
        this.setParamSimple(map, prefix + "VulTotalCount", this.VulTotalCount);
        this.setParamSimple(map, prefix + "SysTemVulCount", this.SysTemVulCount);
        this.setParamSimple(map, prefix + "WebVulCount", this.WebVulCount);
        this.setParamSimple(map, prefix + "AllAuthorizedImageCount", this.AllAuthorizedImageCount);
        this.setParamSimple(map, prefix + "EmergencyVulCount", this.EmergencyVulCount);
        this.setParamSimple(map, prefix + "SupportVulTotalCount", this.SupportVulTotalCount);
        this.setParamSimple(map, prefix + "VulLibraryUpdateTime", this.VulLibraryUpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

