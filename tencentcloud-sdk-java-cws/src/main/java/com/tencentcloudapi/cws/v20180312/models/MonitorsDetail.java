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

public class MonitorsDetail extends AbstractModel{

    /**
    * 监控任务基础信息。
    */
    @SerializedName("Basic")
    @Expose
    private Monitor Basic;

    /**
    * 监控任务包含的站点列表。
    */
    @SerializedName("Sites")
    @Expose
    private MonitorMiniSite [] Sites;

    /**
    * 监控任务包含的站点列表数量。
    */
    @SerializedName("SiteNumber")
    @Expose
    private Long SiteNumber;

    /**
    * 监控任务包含的受漏洞威胁的站点列表。
    */
    @SerializedName("ImpactSites")
    @Expose
    private MonitorMiniSite [] ImpactSites;

    /**
    * 监控任务包含的受漏洞威胁的站点列表数量。
    */
    @SerializedName("ImpactSiteNumber")
    @Expose
    private Long ImpactSiteNumber;

    /**
    * 高风险漏洞数量。
    */
    @SerializedName("VulsHighNumber")
    @Expose
    private Long VulsHighNumber;

    /**
    * 中风险漏洞数量。
    */
    @SerializedName("VulsMiddleNumber")
    @Expose
    private Long VulsMiddleNumber;

    /**
    * 低风险漏洞数量。
    */
    @SerializedName("VulsLowNumber")
    @Expose
    private Long VulsLowNumber;

    /**
    * 提示数量。
    */
    @SerializedName("VulsNoticeNumber")
    @Expose
    private Long VulsNoticeNumber;

    /**
    * 监控任务包含的站点列表的平均扫描进度。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 扫描页面总数。
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 内容检测数量。
    */
    @SerializedName("ContentNumber")
    @Expose
    private Long ContentNumber;

    /**
     * Get 监控任务基础信息。 
     * @return Basic 监控任务基础信息。
     */
    public Monitor getBasic() {
        return this.Basic;
    }

    /**
     * Set 监控任务基础信息。
     * @param Basic 监控任务基础信息。
     */
    public void setBasic(Monitor Basic) {
        this.Basic = Basic;
    }

    /**
     * Get 监控任务包含的站点列表。 
     * @return Sites 监控任务包含的站点列表。
     */
    public MonitorMiniSite [] getSites() {
        return this.Sites;
    }

    /**
     * Set 监控任务包含的站点列表。
     * @param Sites 监控任务包含的站点列表。
     */
    public void setSites(MonitorMiniSite [] Sites) {
        this.Sites = Sites;
    }

    /**
     * Get 监控任务包含的站点列表数量。 
     * @return SiteNumber 监控任务包含的站点列表数量。
     */
    public Long getSiteNumber() {
        return this.SiteNumber;
    }

    /**
     * Set 监控任务包含的站点列表数量。
     * @param SiteNumber 监控任务包含的站点列表数量。
     */
    public void setSiteNumber(Long SiteNumber) {
        this.SiteNumber = SiteNumber;
    }

    /**
     * Get 监控任务包含的受漏洞威胁的站点列表。 
     * @return ImpactSites 监控任务包含的受漏洞威胁的站点列表。
     */
    public MonitorMiniSite [] getImpactSites() {
        return this.ImpactSites;
    }

    /**
     * Set 监控任务包含的受漏洞威胁的站点列表。
     * @param ImpactSites 监控任务包含的受漏洞威胁的站点列表。
     */
    public void setImpactSites(MonitorMiniSite [] ImpactSites) {
        this.ImpactSites = ImpactSites;
    }

    /**
     * Get 监控任务包含的受漏洞威胁的站点列表数量。 
     * @return ImpactSiteNumber 监控任务包含的受漏洞威胁的站点列表数量。
     */
    public Long getImpactSiteNumber() {
        return this.ImpactSiteNumber;
    }

    /**
     * Set 监控任务包含的受漏洞威胁的站点列表数量。
     * @param ImpactSiteNumber 监控任务包含的受漏洞威胁的站点列表数量。
     */
    public void setImpactSiteNumber(Long ImpactSiteNumber) {
        this.ImpactSiteNumber = ImpactSiteNumber;
    }

    /**
     * Get 高风险漏洞数量。 
     * @return VulsHighNumber 高风险漏洞数量。
     */
    public Long getVulsHighNumber() {
        return this.VulsHighNumber;
    }

    /**
     * Set 高风险漏洞数量。
     * @param VulsHighNumber 高风险漏洞数量。
     */
    public void setVulsHighNumber(Long VulsHighNumber) {
        this.VulsHighNumber = VulsHighNumber;
    }

    /**
     * Get 中风险漏洞数量。 
     * @return VulsMiddleNumber 中风险漏洞数量。
     */
    public Long getVulsMiddleNumber() {
        return this.VulsMiddleNumber;
    }

    /**
     * Set 中风险漏洞数量。
     * @param VulsMiddleNumber 中风险漏洞数量。
     */
    public void setVulsMiddleNumber(Long VulsMiddleNumber) {
        this.VulsMiddleNumber = VulsMiddleNumber;
    }

    /**
     * Get 低风险漏洞数量。 
     * @return VulsLowNumber 低风险漏洞数量。
     */
    public Long getVulsLowNumber() {
        return this.VulsLowNumber;
    }

    /**
     * Set 低风险漏洞数量。
     * @param VulsLowNumber 低风险漏洞数量。
     */
    public void setVulsLowNumber(Long VulsLowNumber) {
        this.VulsLowNumber = VulsLowNumber;
    }

    /**
     * Get 提示数量。 
     * @return VulsNoticeNumber 提示数量。
     */
    public Long getVulsNoticeNumber() {
        return this.VulsNoticeNumber;
    }

    /**
     * Set 提示数量。
     * @param VulsNoticeNumber 提示数量。
     */
    public void setVulsNoticeNumber(Long VulsNoticeNumber) {
        this.VulsNoticeNumber = VulsNoticeNumber;
    }

    /**
     * Get 监控任务包含的站点列表的平均扫描进度。 
     * @return Progress 监控任务包含的站点列表的平均扫描进度。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 监控任务包含的站点列表的平均扫描进度。
     * @param Progress 监控任务包含的站点列表的平均扫描进度。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
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
     * Get 内容检测数量。 
     * @return ContentNumber 内容检测数量。
     */
    public Long getContentNumber() {
        return this.ContentNumber;
    }

    /**
     * Set 内容检测数量。
     * @param ContentNumber 内容检测数量。
     */
    public void setContentNumber(Long ContentNumber) {
        this.ContentNumber = ContentNumber;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Basic.", this.Basic);
        this.setParamArrayObj(map, prefix + "Sites.", this.Sites);
        this.setParamSimple(map, prefix + "SiteNumber", this.SiteNumber);
        this.setParamArrayObj(map, prefix + "ImpactSites.", this.ImpactSites);
        this.setParamSimple(map, prefix + "ImpactSiteNumber", this.ImpactSiteNumber);
        this.setParamSimple(map, prefix + "VulsHighNumber", this.VulsHighNumber);
        this.setParamSimple(map, prefix + "VulsMiddleNumber", this.VulsMiddleNumber);
        this.setParamSimple(map, prefix + "VulsLowNumber", this.VulsLowNumber);
        this.setParamSimple(map, prefix + "VulsNoticeNumber", this.VulsNoticeNumber);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "ContentNumber", this.ContentNumber);

    }
}

