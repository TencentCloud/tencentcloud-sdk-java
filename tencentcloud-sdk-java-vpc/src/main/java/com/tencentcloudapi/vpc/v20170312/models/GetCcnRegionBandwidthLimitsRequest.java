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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCcnRegionBandwidthLimitsRequest extends AbstractModel{

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 过滤条件。
<li>sregion - String - （过滤条件）源地域，形如：ap-guangzhou。</li>
<li>dregion - String - （过滤条件）目的地域，形如：ap-shanghai-bm</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序条件，目前支持带宽（BandwidthLimit）和过期时间（ExpireTime）
    */
    @SerializedName("SortedBy")
    @Expose
    private String SortedBy;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序方式，'ASC':升序,'DESC':降序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。 
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 过滤条件。
<li>sregion - String - （过滤条件）源地域，形如：ap-guangzhou。</li>
<li>dregion - String - （过滤条件）目的地域，形如：ap-shanghai-bm</li> 
     * @return Filters 过滤条件。
<li>sregion - String - （过滤条件）源地域，形如：ap-guangzhou。</li>
<li>dregion - String - （过滤条件）目的地域，形如：ap-shanghai-bm</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>sregion - String - （过滤条件）源地域，形如：ap-guangzhou。</li>
<li>dregion - String - （过滤条件）目的地域，形如：ap-shanghai-bm</li>
     * @param Filters 过滤条件。
<li>sregion - String - （过滤条件）源地域，形如：ap-guangzhou。</li>
<li>dregion - String - （过滤条件）目的地域，形如：ap-shanghai-bm</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序条件，目前支持带宽（BandwidthLimit）和过期时间（ExpireTime） 
     * @return SortedBy 排序条件，目前支持带宽（BandwidthLimit）和过期时间（ExpireTime）
     */
    public String getSortedBy() {
        return this.SortedBy;
    }

    /**
     * Set 排序条件，目前支持带宽（BandwidthLimit）和过期时间（ExpireTime）
     * @param SortedBy 排序条件，目前支持带宽（BandwidthLimit）和过期时间（ExpireTime）
     */
    public void setSortedBy(String SortedBy) {
        this.SortedBy = SortedBy;
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
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序方式，'ASC':升序,'DESC':降序。 
     * @return OrderBy 排序方式，'ASC':升序,'DESC':降序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序方式，'ASC':升序,'DESC':降序。
     * @param OrderBy 排序方式，'ASC':升序,'DESC':降序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortedBy", this.SortedBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

