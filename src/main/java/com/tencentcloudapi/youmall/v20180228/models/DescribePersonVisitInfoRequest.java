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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePersonVisitInfoRequest  extends AbstractModel{

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
    * 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Limit:每页的数据项，最大100，超过100会被强制指定为100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 开始日期，格式yyyy-MM-dd，已废弃，请使用StartDateTime
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期，格式yyyy-MM-dd，已废弃，请使用EndDateTime
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
    */
    @SerializedName("PictureExpires")
    @Expose
    private Integer PictureExpires;

    /**
    * 开始时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartDateTime")
    @Expose
    private String StartDateTime;

    /**
    * 结束时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndDateTime")
    @Expose
    private String EndDateTime;

    /**
     * 获取公司ID
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取门店ID
     * @return ShopId 门店ID
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置门店ID
     * @param ShopId 门店ID
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 获取偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     * @return Offset 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     * @param Offset 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取Limit:每页的数据项，最大100，超过100会被强制指定为100
     * @return Limit Limit:每页的数据项，最大100，超过100会被强制指定为100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置Limit:每页的数据项，最大100，超过100会被强制指定为100
     * @param Limit Limit:每页的数据项，最大100，超过100会被强制指定为100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取开始日期，格式yyyy-MM-dd，已废弃，请使用StartDateTime
     * @return StartDate 开始日期，格式yyyy-MM-dd，已废弃，请使用StartDateTime
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * 设置开始日期，格式yyyy-MM-dd，已废弃，请使用StartDateTime
     * @param StartDate 开始日期，格式yyyy-MM-dd，已废弃，请使用StartDateTime
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * 获取结束日期，格式yyyy-MM-dd，已废弃，请使用EndDateTime
     * @return EndDate 结束日期，格式yyyy-MM-dd，已废弃，请使用EndDateTime
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * 设置结束日期，格式yyyy-MM-dd，已废弃，请使用EndDateTime
     * @param EndDate 结束日期，格式yyyy-MM-dd，已废弃，请使用EndDateTime
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * 获取图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     * @return PictureExpires 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     */
    public Integer getPictureExpires() {
        return this.PictureExpires;
    }

    /**
     * 设置图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     * @param PictureExpires 图片url过期时间：在当前时间+PictureExpires秒后，图片url无法继续正常访问；单位s；默认值1*24*60*60（1天）
     */
    public void setPictureExpires(Integer PictureExpires) {
        this.PictureExpires = PictureExpires;
    }

    /**
     * 获取开始时间，格式yyyy-MM-dd HH:mm:ss
     * @return StartDateTime 开始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getStartDateTime() {
        return this.StartDateTime;
    }

    /**
     * 设置开始时间，格式yyyy-MM-dd HH:mm:ss
     * @param StartDateTime 开始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setStartDateTime(String StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    /**
     * 获取结束时间，格式yyyy-MM-dd HH:mm:ss
     * @return EndDateTime 结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getEndDateTime() {
        return this.EndDateTime;
    }

    /**
     * 设置结束时间，格式yyyy-MM-dd HH:mm:ss
     * @param EndDateTime 结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setEndDateTime(String EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "PictureExpires", this.PictureExpires);
        this.setParamSimple(map, prefix + "StartDateTime", this.StartDateTime);
        this.setParamSimple(map, prefix + "EndDateTime", this.EndDateTime);

    }
}

