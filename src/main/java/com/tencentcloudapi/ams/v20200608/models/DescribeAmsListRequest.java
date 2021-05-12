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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAmsListRequest extends AbstractModel{

    /**
    * 页码
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * 过滤条件
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询方向
    */
    @SerializedName("PageDirection")
    @Expose
    private String PageDirection;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 页码 
     * @return PageToken 页码
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set 页码
     * @param PageToken 页码
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get 过滤条件 
     * @return Limit 过滤条件
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 过滤条件
     * @param Limit 过滤条件
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询方向 
     * @return PageDirection 查询方向
     */
    public String getPageDirection() {
        return this.PageDirection;
    }

    /**
     * Set 查询方向
     * @param PageDirection 查询方向
     */
    public void setPageDirection(String PageDirection) {
        this.PageDirection = PageDirection;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAmsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAmsListRequest(DescribeAmsListRequest source) {
        if (source.PageToken != null) {
            this.PageToken = new String(source.PageToken);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PageDirection != null) {
            this.PageDirection = new String(source.PageDirection);
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
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PageDirection", this.PageDirection);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

