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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSeedsRequest extends AbstractModel {

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 创建时间-开始
    */
    @SerializedName("CreateAtStart")
    @Expose
    private String CreateAtStart;

    /**
    * 创建时间-结束
    */
    @SerializedName("CreateAtEnd")
    @Expose
    private String CreateAtEnd;

    /**
    * 分页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询数组
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 创建时间-开始 
     * @return CreateAtStart 创建时间-开始
     */
    public String getCreateAtStart() {
        return this.CreateAtStart;
    }

    /**
     * Set 创建时间-开始
     * @param CreateAtStart 创建时间-开始
     */
    public void setCreateAtStart(String CreateAtStart) {
        this.CreateAtStart = CreateAtStart;
    }

    /**
     * Get 创建时间-结束 
     * @return CreateAtEnd 创建时间-结束
     */
    public String getCreateAtEnd() {
        return this.CreateAtEnd;
    }

    /**
     * Set 创建时间-结束
     * @param CreateAtEnd 创建时间-结束
     */
    public void setCreateAtEnd(String CreateAtEnd) {
        this.CreateAtEnd = CreateAtEnd;
    }

    /**
     * Get 分页偏移 
     * @return Offset 分页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移
     * @param Offset 分页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询数组 
     * @return Filters 查询数组
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询数组
     * @param Filters 查询数组
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSeedsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSeedsRequest(DescribeSeedsRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.CreateAtStart != null) {
            this.CreateAtStart = new String(source.CreateAtStart);
        }
        if (source.CreateAtEnd != null) {
            this.CreateAtEnd = new String(source.CreateAtEnd);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CreateAtStart", this.CreateAtStart);
        this.setParamSimple(map, prefix + "CreateAtEnd", this.CreateAtEnd);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

