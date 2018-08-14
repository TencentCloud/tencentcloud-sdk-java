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

public class VulsTimeline  extends AbstractModel{

    /**
    * ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Integer Appid;

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
    private Integer PageCount;

    /**
    * 已验证网站总数量。
    */
    @SerializedName("SiteNum")
    @Expose
    private Integer SiteNum;

    /**
    * 受影响的网站总数量。
    */
    @SerializedName("ImpactSiteNum")
    @Expose
    private Integer ImpactSiteNum;

    /**
    * 高危漏洞总数量。
    */
    @SerializedName("VulsHighNum")
    @Expose
    private Integer VulsHighNum;

    /**
    * 中危漏洞总数量。
    */
    @SerializedName("VulsMiddleNum")
    @Expose
    private Integer VulsMiddleNum;

    /**
    * 低危漏洞总数量。
    */
    @SerializedName("VulsLowNum")
    @Expose
    private Integer VulsLowNum;

    /**
    * 风险提示总数量
    */
    @SerializedName("VulsNoticeNum")
    @Expose
    private Integer VulsNoticeNum;

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
     * 获取ID。
     * @return Id ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置ID。
     * @param Id ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取云用户appid。
     * @return Appid 云用户appid。
     */
    public Integer getAppid() {
        return this.Appid;
    }

    /**
     * 设置云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Integer Appid) {
        this.Appid = Appid;
    }

    /**
     * 获取日期。
     * @return Date 日期。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置日期。
     * @param Date 日期。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取扫描页面总数量。
     * @return PageCount 扫描页面总数量。
     */
    public Integer getPageCount() {
        return this.PageCount;
    }

    /**
     * 设置扫描页面总数量。
     * @param PageCount 扫描页面总数量。
     */
    public void setPageCount(Integer PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * 获取已验证网站总数量。
     * @return SiteNum 已验证网站总数量。
     */
    public Integer getSiteNum() {
        return this.SiteNum;
    }

    /**
     * 设置已验证网站总数量。
     * @param SiteNum 已验证网站总数量。
     */
    public void setSiteNum(Integer SiteNum) {
        this.SiteNum = SiteNum;
    }

    /**
     * 获取受影响的网站总数量。
     * @return ImpactSiteNum 受影响的网站总数量。
     */
    public Integer getImpactSiteNum() {
        return this.ImpactSiteNum;
    }

    /**
     * 设置受影响的网站总数量。
     * @param ImpactSiteNum 受影响的网站总数量。
     */
    public void setImpactSiteNum(Integer ImpactSiteNum) {
        this.ImpactSiteNum = ImpactSiteNum;
    }

    /**
     * 获取高危漏洞总数量。
     * @return VulsHighNum 高危漏洞总数量。
     */
    public Integer getVulsHighNum() {
        return this.VulsHighNum;
    }

    /**
     * 设置高危漏洞总数量。
     * @param VulsHighNum 高危漏洞总数量。
     */
    public void setVulsHighNum(Integer VulsHighNum) {
        this.VulsHighNum = VulsHighNum;
    }

    /**
     * 获取中危漏洞总数量。
     * @return VulsMiddleNum 中危漏洞总数量。
     */
    public Integer getVulsMiddleNum() {
        return this.VulsMiddleNum;
    }

    /**
     * 设置中危漏洞总数量。
     * @param VulsMiddleNum 中危漏洞总数量。
     */
    public void setVulsMiddleNum(Integer VulsMiddleNum) {
        this.VulsMiddleNum = VulsMiddleNum;
    }

    /**
     * 获取低危漏洞总数量。
     * @return VulsLowNum 低危漏洞总数量。
     */
    public Integer getVulsLowNum() {
        return this.VulsLowNum;
    }

    /**
     * 设置低危漏洞总数量。
     * @param VulsLowNum 低危漏洞总数量。
     */
    public void setVulsLowNum(Integer VulsLowNum) {
        this.VulsLowNum = VulsLowNum;
    }

    /**
     * 获取风险提示总数量
     * @return VulsNoticeNum 风险提示总数量
     */
    public Integer getVulsNoticeNum() {
        return this.VulsNoticeNum;
    }

    /**
     * 设置风险提示总数量
     * @param VulsNoticeNum 风险提示总数量
     */
    public void setVulsNoticeNum(Integer VulsNoticeNum) {
        this.VulsNoticeNum = VulsNoticeNum;
    }

    /**
     * 获取记录添加时间。
     * @return CreatedAt 记录添加时间。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * 设置记录添加时间。
     * @param CreatedAt 记录添加时间。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * 获取记录最近修改时间。
     * @return UpdatedAt 记录最近修改时间。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * 设置记录最近修改时间。
     * @param UpdatedAt 记录最近修改时间。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * 内部实现，用户禁止调用
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

