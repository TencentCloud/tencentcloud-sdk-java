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

public class DescribeZoneTrafficInfoRequest extends AbstractModel{

    /**
    * 公司ID
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
    * 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit:每页的数据项，最大100，超过100会被强制指定为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 公司ID 
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID
     * @param CompanyId 公司ID
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
     * Get 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit 
     * @return Offset 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     * @param Offset 偏移量：分页控制参数，第一页传0，第n页Offset=(n-1)*Limit
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit:每页的数据项，最大100，超过100会被强制指定为100 
     * @return Limit Limit:每页的数据项，最大100，超过100会被强制指定为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit:每页的数据项，最大100，超过100会被强制指定为100
     * @param Limit Limit:每页的数据项，最大100，超过100会被强制指定为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

