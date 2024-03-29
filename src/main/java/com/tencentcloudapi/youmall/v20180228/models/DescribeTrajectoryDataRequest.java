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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrajectoryDataRequest extends AbstractModel {

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 店铺ID
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 开始日期，格式yyyy-MM-dd
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期，格式yyyy-MM-dd
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 限制返回数据的最大条数，最大 400（负数代为 400）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 顾客性别顾虑，0是男，1是女，其它代表不分性别
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
     * Get 集团ID 
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团ID
     * @param CompanyId 集团ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 店铺ID 
     * @return ShopId 店铺ID
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺ID
     * @param ShopId 店铺ID
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 开始日期，格式yyyy-MM-dd 
     * @return StartDate 开始日期，格式yyyy-MM-dd
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期，格式yyyy-MM-dd
     * @param StartDate 开始日期，格式yyyy-MM-dd
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期，格式yyyy-MM-dd 
     * @return EndDate 结束日期，格式yyyy-MM-dd
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期，格式yyyy-MM-dd
     * @param EndDate 结束日期，格式yyyy-MM-dd
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 限制返回数据的最大条数，最大 400（负数代为 400） 
     * @return Limit 限制返回数据的最大条数，最大 400（负数代为 400）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制返回数据的最大条数，最大 400（负数代为 400）
     * @param Limit 限制返回数据的最大条数，最大 400（负数代为 400）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 顾客性别顾虑，0是男，1是女，其它代表不分性别 
     * @return Gender 顾客性别顾虑，0是男，1是女，其它代表不分性别
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 顾客性别顾虑，0是男，1是女，其它代表不分性别
     * @param Gender 顾客性别顾虑，0是男，1是女，其它代表不分性别
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    public DescribeTrajectoryDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrajectoryDataRequest(DescribeTrajectoryDataRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Gender", this.Gender);

    }
}

