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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneFlowAgeInfoByZoneIdRequest extends AbstractModel {

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
    * 区域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

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
     * Get 区域ID 
     * @return ZoneId 区域ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域ID
     * @param ZoneId 区域ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
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

    public DescribeZoneFlowAgeInfoByZoneIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneFlowAgeInfoByZoneIdRequest(DescribeZoneFlowAgeInfoByZoneIdRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

