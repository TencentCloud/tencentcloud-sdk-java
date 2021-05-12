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
package com.tencentcloudapi.ims.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImsListRequest extends AbstractModel{

    /**
    * 分页 页索引
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 分页条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 分页 页索引 
     * @return PageIndex 分页 页索引
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 分页 页索引
     * @param PageIndex 分页 页索引
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 分页条数 
     * @return PageSize 分页条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页条数
     * @param PageSize 分页条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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

    public DescribeImsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImsListRequest(DescribeImsListRequest source) {
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

