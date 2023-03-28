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

public class DescribeVulSummaryResponse extends AbstractModel{

    /**
    * 漏洞总数量
    */
    @SerializedName("VulTotalCount")
    @Expose
    private Long VulTotalCount;

    /**
    * 严重及高危漏洞数量
    */
    @SerializedName("SeriousVulCount")
    @Expose
    private Long SeriousVulCount;

    /**
    * 重点关注漏洞数量
    */
    @SerializedName("SuggestVulCount")
    @Expose
    private Long SuggestVulCount;

    /**
    * 有Poc或者Exp的漏洞数量
    */
    @SerializedName("PocExpLevelVulCount")
    @Expose
    private Long PocExpLevelVulCount;

    /**
    * 有远程Exp的漏洞数量
    */
    @SerializedName("RemoteExpLevelVulCount")
    @Expose
    private Long RemoteExpLevelVulCount;

    /**
    * 受严重或高危漏洞影响的最新版本镜像数
    */
    @SerializedName("SeriousVulNewestImageCount")
    @Expose
    private Long SeriousVulNewestImageCount;

    /**
    * 系统漏洞重点关注数
    */
    @SerializedName("SystemVulnerabilityFocusCount")
    @Expose
    private Long SystemVulnerabilityFocusCount;

    /**
    * web漏洞重点关注数
    */
    @SerializedName("WebVulnerabilityFocusCount")
    @Expose
    private Long WebVulnerabilityFocusCount;

    /**
    * 受影响本地镜像数
    */
    @SerializedName("SeriousVulnerabilityLocalImageCount")
    @Expose
    private Long SeriousVulnerabilityLocalImageCount;

    /**
    * 受影响仓库镜像数
    */
    @SerializedName("SeriousVulnerabilityRegistryImageCount")
    @Expose
    private Long SeriousVulnerabilityRegistryImageCount;

    /**
    * 应急漏洞数量
    */
    @SerializedName("EmergencyVulnerabilityCount")
    @Expose
    private Long EmergencyVulnerabilityCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 严重及高危漏洞数量 
     * @return SeriousVulCount 严重及高危漏洞数量
     */
    public Long getSeriousVulCount() {
        return this.SeriousVulCount;
    }

    /**
     * Set 严重及高危漏洞数量
     * @param SeriousVulCount 严重及高危漏洞数量
     */
    public void setSeriousVulCount(Long SeriousVulCount) {
        this.SeriousVulCount = SeriousVulCount;
    }

    /**
     * Get 重点关注漏洞数量 
     * @return SuggestVulCount 重点关注漏洞数量
     */
    public Long getSuggestVulCount() {
        return this.SuggestVulCount;
    }

    /**
     * Set 重点关注漏洞数量
     * @param SuggestVulCount 重点关注漏洞数量
     */
    public void setSuggestVulCount(Long SuggestVulCount) {
        this.SuggestVulCount = SuggestVulCount;
    }

    /**
     * Get 有Poc或者Exp的漏洞数量 
     * @return PocExpLevelVulCount 有Poc或者Exp的漏洞数量
     */
    public Long getPocExpLevelVulCount() {
        return this.PocExpLevelVulCount;
    }

    /**
     * Set 有Poc或者Exp的漏洞数量
     * @param PocExpLevelVulCount 有Poc或者Exp的漏洞数量
     */
    public void setPocExpLevelVulCount(Long PocExpLevelVulCount) {
        this.PocExpLevelVulCount = PocExpLevelVulCount;
    }

    /**
     * Get 有远程Exp的漏洞数量 
     * @return RemoteExpLevelVulCount 有远程Exp的漏洞数量
     */
    public Long getRemoteExpLevelVulCount() {
        return this.RemoteExpLevelVulCount;
    }

    /**
     * Set 有远程Exp的漏洞数量
     * @param RemoteExpLevelVulCount 有远程Exp的漏洞数量
     */
    public void setRemoteExpLevelVulCount(Long RemoteExpLevelVulCount) {
        this.RemoteExpLevelVulCount = RemoteExpLevelVulCount;
    }

    /**
     * Get 受严重或高危漏洞影响的最新版本镜像数 
     * @return SeriousVulNewestImageCount 受严重或高危漏洞影响的最新版本镜像数
     */
    public Long getSeriousVulNewestImageCount() {
        return this.SeriousVulNewestImageCount;
    }

    /**
     * Set 受严重或高危漏洞影响的最新版本镜像数
     * @param SeriousVulNewestImageCount 受严重或高危漏洞影响的最新版本镜像数
     */
    public void setSeriousVulNewestImageCount(Long SeriousVulNewestImageCount) {
        this.SeriousVulNewestImageCount = SeriousVulNewestImageCount;
    }

    /**
     * Get 系统漏洞重点关注数 
     * @return SystemVulnerabilityFocusCount 系统漏洞重点关注数
     */
    public Long getSystemVulnerabilityFocusCount() {
        return this.SystemVulnerabilityFocusCount;
    }

    /**
     * Set 系统漏洞重点关注数
     * @param SystemVulnerabilityFocusCount 系统漏洞重点关注数
     */
    public void setSystemVulnerabilityFocusCount(Long SystemVulnerabilityFocusCount) {
        this.SystemVulnerabilityFocusCount = SystemVulnerabilityFocusCount;
    }

    /**
     * Get web漏洞重点关注数 
     * @return WebVulnerabilityFocusCount web漏洞重点关注数
     */
    public Long getWebVulnerabilityFocusCount() {
        return this.WebVulnerabilityFocusCount;
    }

    /**
     * Set web漏洞重点关注数
     * @param WebVulnerabilityFocusCount web漏洞重点关注数
     */
    public void setWebVulnerabilityFocusCount(Long WebVulnerabilityFocusCount) {
        this.WebVulnerabilityFocusCount = WebVulnerabilityFocusCount;
    }

    /**
     * Get 受影响本地镜像数 
     * @return SeriousVulnerabilityLocalImageCount 受影响本地镜像数
     */
    public Long getSeriousVulnerabilityLocalImageCount() {
        return this.SeriousVulnerabilityLocalImageCount;
    }

    /**
     * Set 受影响本地镜像数
     * @param SeriousVulnerabilityLocalImageCount 受影响本地镜像数
     */
    public void setSeriousVulnerabilityLocalImageCount(Long SeriousVulnerabilityLocalImageCount) {
        this.SeriousVulnerabilityLocalImageCount = SeriousVulnerabilityLocalImageCount;
    }

    /**
     * Get 受影响仓库镜像数 
     * @return SeriousVulnerabilityRegistryImageCount 受影响仓库镜像数
     */
    public Long getSeriousVulnerabilityRegistryImageCount() {
        return this.SeriousVulnerabilityRegistryImageCount;
    }

    /**
     * Set 受影响仓库镜像数
     * @param SeriousVulnerabilityRegistryImageCount 受影响仓库镜像数
     */
    public void setSeriousVulnerabilityRegistryImageCount(Long SeriousVulnerabilityRegistryImageCount) {
        this.SeriousVulnerabilityRegistryImageCount = SeriousVulnerabilityRegistryImageCount;
    }

    /**
     * Get 应急漏洞数量 
     * @return EmergencyVulnerabilityCount 应急漏洞数量
     */
    public Long getEmergencyVulnerabilityCount() {
        return this.EmergencyVulnerabilityCount;
    }

    /**
     * Set 应急漏洞数量
     * @param EmergencyVulnerabilityCount 应急漏洞数量
     */
    public void setEmergencyVulnerabilityCount(Long EmergencyVulnerabilityCount) {
        this.EmergencyVulnerabilityCount = EmergencyVulnerabilityCount;
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

    public DescribeVulSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulSummaryResponse(DescribeVulSummaryResponse source) {
        if (source.VulTotalCount != null) {
            this.VulTotalCount = new Long(source.VulTotalCount);
        }
        if (source.SeriousVulCount != null) {
            this.SeriousVulCount = new Long(source.SeriousVulCount);
        }
        if (source.SuggestVulCount != null) {
            this.SuggestVulCount = new Long(source.SuggestVulCount);
        }
        if (source.PocExpLevelVulCount != null) {
            this.PocExpLevelVulCount = new Long(source.PocExpLevelVulCount);
        }
        if (source.RemoteExpLevelVulCount != null) {
            this.RemoteExpLevelVulCount = new Long(source.RemoteExpLevelVulCount);
        }
        if (source.SeriousVulNewestImageCount != null) {
            this.SeriousVulNewestImageCount = new Long(source.SeriousVulNewestImageCount);
        }
        if (source.SystemVulnerabilityFocusCount != null) {
            this.SystemVulnerabilityFocusCount = new Long(source.SystemVulnerabilityFocusCount);
        }
        if (source.WebVulnerabilityFocusCount != null) {
            this.WebVulnerabilityFocusCount = new Long(source.WebVulnerabilityFocusCount);
        }
        if (source.SeriousVulnerabilityLocalImageCount != null) {
            this.SeriousVulnerabilityLocalImageCount = new Long(source.SeriousVulnerabilityLocalImageCount);
        }
        if (source.SeriousVulnerabilityRegistryImageCount != null) {
            this.SeriousVulnerabilityRegistryImageCount = new Long(source.SeriousVulnerabilityRegistryImageCount);
        }
        if (source.EmergencyVulnerabilityCount != null) {
            this.EmergencyVulnerabilityCount = new Long(source.EmergencyVulnerabilityCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulTotalCount", this.VulTotalCount);
        this.setParamSimple(map, prefix + "SeriousVulCount", this.SeriousVulCount);
        this.setParamSimple(map, prefix + "SuggestVulCount", this.SuggestVulCount);
        this.setParamSimple(map, prefix + "PocExpLevelVulCount", this.PocExpLevelVulCount);
        this.setParamSimple(map, prefix + "RemoteExpLevelVulCount", this.RemoteExpLevelVulCount);
        this.setParamSimple(map, prefix + "SeriousVulNewestImageCount", this.SeriousVulNewestImageCount);
        this.setParamSimple(map, prefix + "SystemVulnerabilityFocusCount", this.SystemVulnerabilityFocusCount);
        this.setParamSimple(map, prefix + "WebVulnerabilityFocusCount", this.WebVulnerabilityFocusCount);
        this.setParamSimple(map, prefix + "SeriousVulnerabilityLocalImageCount", this.SeriousVulnerabilityLocalImageCount);
        this.setParamSimple(map, prefix + "SeriousVulnerabilityRegistryImageCount", this.SeriousVulnerabilityRegistryImageCount);
        this.setParamSimple(map, prefix + "EmergencyVulnerabilityCount", this.EmergencyVulnerabilityCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

