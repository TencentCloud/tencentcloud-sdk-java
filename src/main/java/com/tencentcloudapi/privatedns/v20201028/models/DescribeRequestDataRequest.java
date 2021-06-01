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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRequestDataRequest extends AbstractModel{

    /**
    * 请求量统计起始时间，格式：2020-11-22 00:00:00
    */
    @SerializedName("TimeRangeBegin")
    @Expose
    private String TimeRangeBegin;

    /**
    * 筛选参数：
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 请求量统计结束时间，格式：2020-11-22 23:59:59
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
     * Get 请求量统计起始时间，格式：2020-11-22 00:00:00 
     * @return TimeRangeBegin 请求量统计起始时间，格式：2020-11-22 00:00:00
     */
    public String getTimeRangeBegin() {
        return this.TimeRangeBegin;
    }

    /**
     * Set 请求量统计起始时间，格式：2020-11-22 00:00:00
     * @param TimeRangeBegin 请求量统计起始时间，格式：2020-11-22 00:00:00
     */
    public void setTimeRangeBegin(String TimeRangeBegin) {
        this.TimeRangeBegin = TimeRangeBegin;
    }

    /**
     * Get 筛选参数： 
     * @return Filters 筛选参数：
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选参数：
     * @param Filters 筛选参数：
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 请求量统计结束时间，格式：2020-11-22 23:59:59 
     * @return TimeRangeEnd 请求量统计结束时间，格式：2020-11-22 23:59:59
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set 请求量统计结束时间，格式：2020-11-22 23:59:59
     * @param TimeRangeEnd 请求量统计结束时间，格式：2020-11-22 23:59:59
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    public DescribeRequestDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRequestDataRequest(DescribeRequestDataRequest source) {
        if (source.TimeRangeBegin != null) {
            this.TimeRangeBegin = new String(source.TimeRangeBegin);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRangeBegin", this.TimeRangeBegin);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);

    }
}

