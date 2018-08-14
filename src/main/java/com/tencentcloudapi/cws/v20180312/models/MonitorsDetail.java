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

public class MonitorsDetail  extends AbstractModel{

    /**
    * 监控任务包含的站点列表的平均扫描进度。
    */
    @SerializedName("Progress")
    @Expose
    private Integer Progress;

    /**
    * 扫描页面总数。
    */
    @SerializedName("PageCount")
    @Expose
    private Integer PageCount;

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
    private Integer SiteNumber;

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
    private Integer ImpactSiteNumber;

    /**
    * 高风险漏洞数量。
    */
    @SerializedName("VulsHighNumber")
    @Expose
    private Integer VulsHighNumber;

    /**
    * 中风险漏洞数量。
    */
    @SerializedName("VulsMiddleNumber")
    @Expose
    private Integer VulsMiddleNumber;

    /**
    * 低风险漏洞数量。
    */
    @SerializedName("VulsLowNumber")
    @Expose
    private Integer VulsLowNumber;

    /**
    * 提示数量。
    */
    @SerializedName("VulsNoticeNumber")
    @Expose
    private Integer VulsNoticeNumber;

    /**
     * 获取监控任务包含的站点列表的平均扫描进度。
     * @return Progress 监控任务包含的站点列表的平均扫描进度。
     */
    public Integer getProgress() {
        return this.Progress;
    }

    /**
     * 设置监控任务包含的站点列表的平均扫描进度。
     * @param Progress 监控任务包含的站点列表的平均扫描进度。
     */
    public void setProgress(Integer Progress) {
        this.Progress = Progress;
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
     * 获取监控任务基础信息。
     * @return Basic 监控任务基础信息。
     */
    public Monitor getBasic() {
        return this.Basic;
    }

    /**
     * 设置监控任务基础信息。
     * @param Basic 监控任务基础信息。
     */
    public void setBasic(Monitor Basic) {
        this.Basic = Basic;
    }

    /**
     * 获取监控任务包含的站点列表。
     * @return Sites 监控任务包含的站点列表。
     */
    public MonitorMiniSite [] getSites() {
        return this.Sites;
    }

    /**
     * 设置监控任务包含的站点列表。
     * @param Sites 监控任务包含的站点列表。
     */
    public void setSites(MonitorMiniSite [] Sites) {
        this.Sites = Sites;
    }

    /**
     * 获取监控任务包含的站点列表数量。
     * @return SiteNumber 监控任务包含的站点列表数量。
     */
    public Integer getSiteNumber() {
        return this.SiteNumber;
    }

    /**
     * 设置监控任务包含的站点列表数量。
     * @param SiteNumber 监控任务包含的站点列表数量。
     */
    public void setSiteNumber(Integer SiteNumber) {
        this.SiteNumber = SiteNumber;
    }

    /**
     * 获取监控任务包含的受漏洞威胁的站点列表。
     * @return ImpactSites 监控任务包含的受漏洞威胁的站点列表。
     */
    public MonitorMiniSite [] getImpactSites() {
        return this.ImpactSites;
    }

    /**
     * 设置监控任务包含的受漏洞威胁的站点列表。
     * @param ImpactSites 监控任务包含的受漏洞威胁的站点列表。
     */
    public void setImpactSites(MonitorMiniSite [] ImpactSites) {
        this.ImpactSites = ImpactSites;
    }

    /**
     * 获取监控任务包含的受漏洞威胁的站点列表数量。
     * @return ImpactSiteNumber 监控任务包含的受漏洞威胁的站点列表数量。
     */
    public Integer getImpactSiteNumber() {
        return this.ImpactSiteNumber;
    }

    /**
     * 设置监控任务包含的受漏洞威胁的站点列表数量。
     * @param ImpactSiteNumber 监控任务包含的受漏洞威胁的站点列表数量。
     */
    public void setImpactSiteNumber(Integer ImpactSiteNumber) {
        this.ImpactSiteNumber = ImpactSiteNumber;
    }

    /**
     * 获取高风险漏洞数量。
     * @return VulsHighNumber 高风险漏洞数量。
     */
    public Integer getVulsHighNumber() {
        return this.VulsHighNumber;
    }

    /**
     * 设置高风险漏洞数量。
     * @param VulsHighNumber 高风险漏洞数量。
     */
    public void setVulsHighNumber(Integer VulsHighNumber) {
        this.VulsHighNumber = VulsHighNumber;
    }

    /**
     * 获取中风险漏洞数量。
     * @return VulsMiddleNumber 中风险漏洞数量。
     */
    public Integer getVulsMiddleNumber() {
        return this.VulsMiddleNumber;
    }

    /**
     * 设置中风险漏洞数量。
     * @param VulsMiddleNumber 中风险漏洞数量。
     */
    public void setVulsMiddleNumber(Integer VulsMiddleNumber) {
        this.VulsMiddleNumber = VulsMiddleNumber;
    }

    /**
     * 获取低风险漏洞数量。
     * @return VulsLowNumber 低风险漏洞数量。
     */
    public Integer getVulsLowNumber() {
        return this.VulsLowNumber;
    }

    /**
     * 设置低风险漏洞数量。
     * @param VulsLowNumber 低风险漏洞数量。
     */
    public void setVulsLowNumber(Integer VulsLowNumber) {
        this.VulsLowNumber = VulsLowNumber;
    }

    /**
     * 获取提示数量。
     * @return VulsNoticeNumber 提示数量。
     */
    public Integer getVulsNoticeNumber() {
        return this.VulsNoticeNumber;
    }

    /**
     * 设置提示数量。
     * @param VulsNoticeNumber 提示数量。
     */
    public void setVulsNoticeNumber(Integer VulsNoticeNumber) {
        this.VulsNoticeNumber = VulsNoticeNumber;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamObj(map, prefix + "Basic.", this.Basic);
        this.setParamArrayObj(map, prefix + "Sites.", this.Sites);
        this.setParamSimple(map, prefix + "SiteNumber", this.SiteNumber);
        this.setParamArrayObj(map, prefix + "ImpactSites.", this.ImpactSites);
        this.setParamSimple(map, prefix + "ImpactSiteNumber", this.ImpactSiteNumber);
        this.setParamSimple(map, prefix + "VulsHighNumber", this.VulsHighNumber);
        this.setParamSimple(map, prefix + "VulsMiddleNumber", this.VulsMiddleNumber);
        this.setParamSimple(map, prefix + "VulsLowNumber", this.VulsLowNumber);
        this.setParamSimple(map, prefix + "VulsNoticeNumber", this.VulsNoticeNumber);

    }
}

