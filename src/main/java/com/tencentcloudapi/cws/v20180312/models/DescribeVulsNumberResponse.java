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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulsNumberResponse extends AbstractModel {

    /**
    * 受影响的网站总数。
    */
    @SerializedName("ImpactSiteNumber")
    @Expose
    private Long ImpactSiteNumber;

    /**
    * 已验证的网站总数。
    */
    @SerializedName("SiteNumber")
    @Expose
    private Long SiteNumber;

    /**
    * 高风险漏洞总数。
    */
    @SerializedName("VulsHighNumber")
    @Expose
    private Long VulsHighNumber;

    /**
    * 中风险漏洞总数。
    */
    @SerializedName("VulsMiddleNumber")
    @Expose
    private Long VulsMiddleNumber;

    /**
    * 低高风险漏洞总数。
    */
    @SerializedName("VulsLowNumber")
    @Expose
    private Long VulsLowNumber;

    /**
    * 风险提示总数。
    */
    @SerializedName("VulsNoticeNumber")
    @Expose
    private Long VulsNoticeNumber;

    /**
    * 扫描页面总数。
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 已验证的网站列表。
    */
    @SerializedName("Sites")
    @Expose
    private MonitorMiniSite [] Sites;

    /**
    * 受影响的网站列表。
    */
    @SerializedName("ImpactSites")
    @Expose
    private MonitorMiniSite [] ImpactSites;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 受影响的网站总数。 
     * @return ImpactSiteNumber 受影响的网站总数。
     */
    public Long getImpactSiteNumber() {
        return this.ImpactSiteNumber;
    }

    /**
     * Set 受影响的网站总数。
     * @param ImpactSiteNumber 受影响的网站总数。
     */
    public void setImpactSiteNumber(Long ImpactSiteNumber) {
        this.ImpactSiteNumber = ImpactSiteNumber;
    }

    /**
     * Get 已验证的网站总数。 
     * @return SiteNumber 已验证的网站总数。
     */
    public Long getSiteNumber() {
        return this.SiteNumber;
    }

    /**
     * Set 已验证的网站总数。
     * @param SiteNumber 已验证的网站总数。
     */
    public void setSiteNumber(Long SiteNumber) {
        this.SiteNumber = SiteNumber;
    }

    /**
     * Get 高风险漏洞总数。 
     * @return VulsHighNumber 高风险漏洞总数。
     */
    public Long getVulsHighNumber() {
        return this.VulsHighNumber;
    }

    /**
     * Set 高风险漏洞总数。
     * @param VulsHighNumber 高风险漏洞总数。
     */
    public void setVulsHighNumber(Long VulsHighNumber) {
        this.VulsHighNumber = VulsHighNumber;
    }

    /**
     * Get 中风险漏洞总数。 
     * @return VulsMiddleNumber 中风险漏洞总数。
     */
    public Long getVulsMiddleNumber() {
        return this.VulsMiddleNumber;
    }

    /**
     * Set 中风险漏洞总数。
     * @param VulsMiddleNumber 中风险漏洞总数。
     */
    public void setVulsMiddleNumber(Long VulsMiddleNumber) {
        this.VulsMiddleNumber = VulsMiddleNumber;
    }

    /**
     * Get 低高风险漏洞总数。 
     * @return VulsLowNumber 低高风险漏洞总数。
     */
    public Long getVulsLowNumber() {
        return this.VulsLowNumber;
    }

    /**
     * Set 低高风险漏洞总数。
     * @param VulsLowNumber 低高风险漏洞总数。
     */
    public void setVulsLowNumber(Long VulsLowNumber) {
        this.VulsLowNumber = VulsLowNumber;
    }

    /**
     * Get 风险提示总数。 
     * @return VulsNoticeNumber 风险提示总数。
     */
    public Long getVulsNoticeNumber() {
        return this.VulsNoticeNumber;
    }

    /**
     * Set 风险提示总数。
     * @param VulsNoticeNumber 风险提示总数。
     */
    public void setVulsNoticeNumber(Long VulsNoticeNumber) {
        this.VulsNoticeNumber = VulsNoticeNumber;
    }

    /**
     * Get 扫描页面总数。 
     * @return PageCount 扫描页面总数。
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 扫描页面总数。
     * @param PageCount 扫描页面总数。
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 已验证的网站列表。 
     * @return Sites 已验证的网站列表。
     */
    public MonitorMiniSite [] getSites() {
        return this.Sites;
    }

    /**
     * Set 已验证的网站列表。
     * @param Sites 已验证的网站列表。
     */
    public void setSites(MonitorMiniSite [] Sites) {
        this.Sites = Sites;
    }

    /**
     * Get 受影响的网站列表。 
     * @return ImpactSites 受影响的网站列表。
     */
    public MonitorMiniSite [] getImpactSites() {
        return this.ImpactSites;
    }

    /**
     * Set 受影响的网站列表。
     * @param ImpactSites 受影响的网站列表。
     */
    public void setImpactSites(MonitorMiniSite [] ImpactSites) {
        this.ImpactSites = ImpactSites;
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

    public DescribeVulsNumberResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulsNumberResponse(DescribeVulsNumberResponse source) {
        if (source.ImpactSiteNumber != null) {
            this.ImpactSiteNumber = new Long(source.ImpactSiteNumber);
        }
        if (source.SiteNumber != null) {
            this.SiteNumber = new Long(source.SiteNumber);
        }
        if (source.VulsHighNumber != null) {
            this.VulsHighNumber = new Long(source.VulsHighNumber);
        }
        if (source.VulsMiddleNumber != null) {
            this.VulsMiddleNumber = new Long(source.VulsMiddleNumber);
        }
        if (source.VulsLowNumber != null) {
            this.VulsLowNumber = new Long(source.VulsLowNumber);
        }
        if (source.VulsNoticeNumber != null) {
            this.VulsNoticeNumber = new Long(source.VulsNoticeNumber);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.Sites != null) {
            this.Sites = new MonitorMiniSite[source.Sites.length];
            for (int i = 0; i < source.Sites.length; i++) {
                this.Sites[i] = new MonitorMiniSite(source.Sites[i]);
            }
        }
        if (source.ImpactSites != null) {
            this.ImpactSites = new MonitorMiniSite[source.ImpactSites.length];
            for (int i = 0; i < source.ImpactSites.length; i++) {
                this.ImpactSites[i] = new MonitorMiniSite(source.ImpactSites[i]);
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
        this.setParamSimple(map, prefix + "ImpactSiteNumber", this.ImpactSiteNumber);
        this.setParamSimple(map, prefix + "SiteNumber", this.SiteNumber);
        this.setParamSimple(map, prefix + "VulsHighNumber", this.VulsHighNumber);
        this.setParamSimple(map, prefix + "VulsMiddleNumber", this.VulsMiddleNumber);
        this.setParamSimple(map, prefix + "VulsLowNumber", this.VulsLowNumber);
        this.setParamSimple(map, prefix + "VulsNoticeNumber", this.VulsNoticeNumber);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamArrayObj(map, prefix + "Sites.", this.Sites);
        this.setParamArrayObj(map, prefix + "ImpactSites.", this.ImpactSites);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

