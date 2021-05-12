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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLeakDetectionListRequest extends AbstractModel{

    /**
    * 筛选条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 筛选条件 
     * @return Filters 筛选条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
     * @param Filters 筛选条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeLeakDetectionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLeakDetectionListRequest(DescribeLeakDetectionListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

