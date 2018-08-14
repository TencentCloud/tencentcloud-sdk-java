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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulsNumberResponse  extends AbstractModel{

    /**
    * 受影响的网站总数。
    */
    @SerializedName("ImpactSiteNumber")
    @Expose
    private Integer ImpactSiteNumber;

    /**
    * 已验证的网站总数。
    */
    @SerializedName("SiteNumber")
    @Expose
    private Integer SiteNumber;

    /**
    * 高风险漏洞总数。
    */
    @SerializedName("VulsHighNumber")
    @Expose
    private Integer VulsHighNumber;

    /**
    * 中风险漏洞总数。
    */
    @SerializedName("VulsMiddleNumber")
    @Expose
    private Integer VulsMiddleNumber;

    /**
    * 低高风险漏洞总数。
    */
    @SerializedName("VulsLowNumber")
    @Expose
    private Integer VulsLowNumber;

    /**
    * 风险提示总数。
    */
    @SerializedName("VulsNoticeNumber")
    @Expose
    private Integer VulsNoticeNumber;

    /**
    * 扫描页面总数。
    */
    @SerializedName("PageCount")
    @Expose
    private Integer PageCount;

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
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取受影响的网站总数。
     * @return ImpactSiteNumber 受影响的网站总数。
     */
    public Integer getImpactSiteNumber() {
        return this.ImpactSiteNumber;
    }

    /**
     * 设置受影响的网站总数。
     * @param ImpactSiteNumber 受影响的网站总数。
     */
    public void setImpactSiteNumber(Integer ImpactSiteNumber) {
        this.ImpactSiteNumber = ImpactSiteNumber;
    }

    /**
     * 获取已验证的网站总数。
     * @return SiteNumber 已验证的网站总数。
     */
    public Integer getSiteNumber() {
        return this.SiteNumber;
    }

    /**
     * 设置已验证的网站总数。
     * @param SiteNumber 已验证的网站总数。
     */
    public void setSiteNumber(Integer SiteNumber) {
        this.SiteNumber = SiteNumber;
    }

    /**
     * 获取高风险漏洞总数。
     * @return VulsHighNumber 高风险漏洞总数。
     */
    public Integer getVulsHighNumber() {
        return this.VulsHighNumber;
    }

    /**
     * 设置高风险漏洞总数。
     * @param VulsHighNumber 高风险漏洞总数。
     */
    public void setVulsHighNumber(Integer VulsHighNumber) {
        this.VulsHighNumber = VulsHighNumber;
    }

    /**
     * 获取中风险漏洞总数。
     * @return VulsMiddleNumber 中风险漏洞总数。
     */
    public Integer getVulsMiddleNumber() {
        return this.VulsMiddleNumber;
    }

    /**
     * 设置中风险漏洞总数。
     * @param VulsMiddleNumber 中风险漏洞总数。
     */
    public void setVulsMiddleNumber(Integer VulsMiddleNumber) {
        this.VulsMiddleNumber = VulsMiddleNumber;
    }

    /**
     * 获取低高风险漏洞总数。
     * @return VulsLowNumber 低高风险漏洞总数。
     */
    public Integer getVulsLowNumber() {
        return this.VulsLowNumber;
    }

    /**
     * 设置低高风险漏洞总数。
     * @param VulsLowNumber 低高风险漏洞总数。
     */
    public void setVulsLowNumber(Integer VulsLowNumber) {
        this.VulsLowNumber = VulsLowNumber;
    }

    /**
     * 获取风险提示总数。
     * @return VulsNoticeNumber 风险提示总数。
     */
    public Integer getVulsNoticeNumber() {
        return this.VulsNoticeNumber;
    }

    /**
     * 设置风险提示总数。
     * @param VulsNoticeNumber 风险提示总数。
     */
    public void setVulsNoticeNumber(Integer VulsNoticeNumber) {
        this.VulsNoticeNumber = VulsNoticeNumber;
    }

    /**
     * 获取扫描页面总数。
     * @return PageCount 扫描页面总数。
     */
    public Integer getPageCount() {
        return this.PageCount;
    }

    /**
     * 设置扫描页面总数。
     * @param PageCount 扫描页面总数。
     */
    public void setPageCount(Integer PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * 获取已验证的网站列表。
     * @return Sites 已验证的网站列表。
     */
    public MonitorMiniSite [] getSites() {
        return this.Sites;
    }

    /**
     * 设置已验证的网站列表。
     * @param Sites 已验证的网站列表。
     */
    public void setSites(MonitorMiniSite [] Sites) {
        this.Sites = Sites;
    }

    /**
     * 获取受影响的网站列表。
     * @return ImpactSites 受影响的网站列表。
     */
    public MonitorMiniSite [] getImpactSites() {
        return this.ImpactSites;
    }

    /**
     * 设置受影响的网站列表。
     * @param ImpactSites 受影响的网站列表。
     */
    public void setImpactSites(MonitorMiniSite [] ImpactSites) {
        this.ImpactSites = ImpactSites;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
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

