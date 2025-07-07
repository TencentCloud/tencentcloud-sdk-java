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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSavingPlanOverviewRequest extends AbstractModel {

    /**
    * 开始时间，格式yyyy-MM-dd 注：查询范围请勿超过6个月
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束时间，格式yyyy-MM-dd
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，最大值为200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 开始时间，格式yyyy-MM-dd 注：查询范围请勿超过6个月 
     * @return StartDate 开始时间，格式yyyy-MM-dd 注：查询范围请勿超过6个月
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始时间，格式yyyy-MM-dd 注：查询范围请勿超过6个月
     * @param StartDate 开始时间，格式yyyy-MM-dd 注：查询范围请勿超过6个月
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束时间，格式yyyy-MM-dd 
     * @return EndDate 结束时间，格式yyyy-MM-dd
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束时间，格式yyyy-MM-dd
     * @param EndDate 结束时间，格式yyyy-MM-dd
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，最大值为200 
     * @return Limit 每页数量，最大值为200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，最大值为200
     * @param Limit 每页数量，最大值为200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSavingPlanOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSavingPlanOverviewRequest(DescribeSavingPlanOverviewRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

