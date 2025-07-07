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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBrandPosCommentsRequest extends AbstractModel {

    /**
    * 品牌ID
    */
    @SerializedName("BrandId")
    @Expose
    private String BrandId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 查询条数上限，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询偏移，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 品牌ID 
     * @return BrandId 品牌ID
     */
    public String getBrandId() {
        return this.BrandId;
    }

    /**
     * Set 品牌ID
     * @param BrandId 品牌ID
     */
    public void setBrandId(String BrandId) {
        this.BrandId = BrandId;
    }

    /**
     * Get 查询开始时间 
     * @return StartDate 查询开始时间
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询开始时间
     * @param StartDate 查询开始时间
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询结束时间 
     * @return EndDate 查询结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询结束时间
     * @param EndDate 查询结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 查询条数上限，默认20 
     * @return Limit 查询条数上限，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询条数上限，默认20
     * @param Limit 查询条数上限，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询偏移，从0开始 
     * @return Offset 查询偏移，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移，从0开始
     * @param Offset 查询偏移，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeBrandPosCommentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBrandPosCommentsRequest(DescribeBrandPosCommentsRequest source) {
        if (source.BrandId != null) {
            this.BrandId = new String(source.BrandId);
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
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandId", this.BrandId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

