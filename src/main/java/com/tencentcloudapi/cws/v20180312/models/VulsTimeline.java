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

public class VulsTimeline extends AbstractModel{

    /**
    * ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 日期。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 扫描页面总数量。
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * 已验证网站总数量。
    */
    @SerializedName("SiteNum")
    @Expose
    private Long SiteNum;

    /**
    * 受影响的网站总数量。
    */
    @SerializedName("ImpactSiteNum")
    @Expose
    private Long ImpactSiteNum;

    /**
    * 高危漏洞总数量。
    */
    @SerializedName("VulsHighNum")
    @Expose
    private Long VulsHighNum;

    /**
    * 中危漏洞总数量。
    */
    @SerializedName("VulsMiddleNum")
    @Expose
    private Long VulsMiddleNum;

    /**
    * 低危漏洞总数量。
    */
    @SerializedName("VulsLowNum")
    @Expose
    private Long VulsLowNum;

    /**
    * 风险提示总数量
    */
    @SerializedName("VulsNoticeNum")
    @Expose
    private Long VulsNoticeNum;

    /**
    * 记录添加时间。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 记录最近修改时间。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get ID。 
     * @return Id ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID。
     * @param Id ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云用户appid。 
     * @return Appid 云用户appid。
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 日期。 
     * @return Date 日期。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期。
     * @param Date 日期。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 扫描页面总数量。 
     * @return PageCount 扫描页面总数量。
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set 扫描页面总数量。
     * @param PageCount 扫描页面总数量。
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get 已验证网站总数量。 
     * @return SiteNum 已验证网站总数量。
     */
    public Long getSiteNum() {
        return this.SiteNum;
    }

    /**
     * Set 已验证网站总数量。
     * @param SiteNum 已验证网站总数量。
     */
    public void setSiteNum(Long SiteNum) {
        this.SiteNum = SiteNum;
    }

    /**
     * Get 受影响的网站总数量。 
     * @return ImpactSiteNum 受影响的网站总数量。
     */
    public Long getImpactSiteNum() {
        return this.ImpactSiteNum;
    }

    /**
     * Set 受影响的网站总数量。
     * @param ImpactSiteNum 受影响的网站总数量。
     */
    public void setImpactSiteNum(Long ImpactSiteNum) {
        this.ImpactSiteNum = ImpactSiteNum;
    }

    /**
     * Get 高危漏洞总数量。 
     * @return VulsHighNum 高危漏洞总数量。
     */
    public Long getVulsHighNum() {
        return this.VulsHighNum;
    }

    /**
     * Set 高危漏洞总数量。
     * @param VulsHighNum 高危漏洞总数量。
     */
    public void setVulsHighNum(Long VulsHighNum) {
        this.VulsHighNum = VulsHighNum;
    }

    /**
     * Get 中危漏洞总数量。 
     * @return VulsMiddleNum 中危漏洞总数量。
     */
    public Long getVulsMiddleNum() {
        return this.VulsMiddleNum;
    }

    /**
     * Set 中危漏洞总数量。
     * @param VulsMiddleNum 中危漏洞总数量。
     */
    public void setVulsMiddleNum(Long VulsMiddleNum) {
        this.VulsMiddleNum = VulsMiddleNum;
    }

    /**
     * Get 低危漏洞总数量。 
     * @return VulsLowNum 低危漏洞总数量。
     */
    public Long getVulsLowNum() {
        return this.VulsLowNum;
    }

    /**
     * Set 低危漏洞总数量。
     * @param VulsLowNum 低危漏洞总数量。
     */
    public void setVulsLowNum(Long VulsLowNum) {
        this.VulsLowNum = VulsLowNum;
    }

    /**
     * Get 风险提示总数量 
     * @return VulsNoticeNum 风险提示总数量
     */
    public Long getVulsNoticeNum() {
        return this.VulsNoticeNum;
    }

    /**
     * Set 风险提示总数量
     * @param VulsNoticeNum 风险提示总数量
     */
    public void setVulsNoticeNum(Long VulsNoticeNum) {
        this.VulsNoticeNum = VulsNoticeNum;
    }

    /**
     * Get 记录添加时间。 
     * @return CreatedAt 记录添加时间。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 记录添加时间。
     * @param CreatedAt 记录添加时间。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 记录最近修改时间。 
     * @return UpdatedAt 记录最近修改时间。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 记录最近修改时间。
     * @param UpdatedAt 记录最近修改时间。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "SiteNum", this.SiteNum);
        this.setParamSimple(map, prefix + "ImpactSiteNum", this.ImpactSiteNum);
        this.setParamSimple(map, prefix + "VulsHighNum", this.VulsHighNum);
        this.setParamSimple(map, prefix + "VulsMiddleNum", this.VulsMiddleNum);
        this.setParamSimple(map, prefix + "VulsLowNum", this.VulsLowNum);
        this.setParamSimple(map, prefix + "VulsNoticeNum", this.VulsNoticeNum);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

