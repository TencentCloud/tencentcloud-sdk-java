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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSavingPlanResourceInfoRequest extends AbstractModel {

    /**
    * 数量，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 购买开始时间，格式yyyy-MM-dd
    */
    @SerializedName("CreateStartDate")
    @Expose
    private String CreateStartDate;

    /**
    * 购买结束时间，格式yyyy-MM-dd
    */
    @SerializedName("CreateEndDate")
    @Expose
    private String CreateEndDate;

    /**
     * Get 数量，最大值为100 
     * @return Limit 数量，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量，最大值为100
     * @param Limit 数量，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 购买开始时间，格式yyyy-MM-dd 
     * @return CreateStartDate 购买开始时间，格式yyyy-MM-dd
     */
    public String getCreateStartDate() {
        return this.CreateStartDate;
    }

    /**
     * Set 购买开始时间，格式yyyy-MM-dd
     * @param CreateStartDate 购买开始时间，格式yyyy-MM-dd
     */
    public void setCreateStartDate(String CreateStartDate) {
        this.CreateStartDate = CreateStartDate;
    }

    /**
     * Get 购买结束时间，格式yyyy-MM-dd 
     * @return CreateEndDate 购买结束时间，格式yyyy-MM-dd
     */
    public String getCreateEndDate() {
        return this.CreateEndDate;
    }

    /**
     * Set 购买结束时间，格式yyyy-MM-dd
     * @param CreateEndDate 购买结束时间，格式yyyy-MM-dd
     */
    public void setCreateEndDate(String CreateEndDate) {
        this.CreateEndDate = CreateEndDate;
    }

    public DescribeSavingPlanResourceInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSavingPlanResourceInfoRequest(DescribeSavingPlanResourceInfoRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CreateStartDate != null) {
            this.CreateStartDate = new String(source.CreateStartDate);
        }
        if (source.CreateEndDate != null) {
            this.CreateEndDate = new String(source.CreateEndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CreateStartDate", this.CreateStartDate);
        this.setParamSimple(map, prefix + "CreateEndDate", this.CreateEndDate);

    }
}

