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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginWhiteHostListRequest extends AbstractModel {

    /**
    * <p>白名单ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>需要返回的数量，最大值为1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件 <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
     * Get <p>白名单ID</p> 
     * @return Id <p>白名单ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>白名单ID</p>
     * @param Id <p>白名单ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>需要返回的数量，最大值为1000</p> 
     * @return Limit <p>需要返回的数量，最大值为1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>需要返回的数量，最大值为1000</p>
     * @param Limit <p>需要返回的数量，最大值为1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件 <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li></p> 
     * @return Filters <p>过滤条件 <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li></p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件 <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li></p>
     * @param Filters <p>过滤条件 <li>IpOrAlias - String - 是否必填：否 - 主机ip或别名筛选</li></p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoginWhiteHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginWhiteHostListRequest(DescribeLoginWhiteHostListRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

