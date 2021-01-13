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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel{

    /**
    * 每页展示多少条。（默认展示10条）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤参数
    */
    @SerializedName("Filter")
    @Expose
    private TaskFilter Filter;

    /**
    * 翻页token，在向前或向后翻页时需要
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * 开始时间。默认是最近3天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。默认为空
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 每页展示多少条。（默认展示10条） 
     * @return Limit 每页展示多少条。（默认展示10条）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页展示多少条。（默认展示10条）
     * @param Limit 每页展示多少条。（默认展示10条）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤参数 
     * @return Filter 过滤参数
     */
    public TaskFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤参数
     * @param Filter 过滤参数
     */
    public void setFilter(TaskFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 翻页token，在向前或向后翻页时需要 
     * @return PageToken 翻页token，在向前或向后翻页时需要
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set 翻页token，在向前或向后翻页时需要
     * @param PageToken 翻页token，在向前或向后翻页时需要
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get 开始时间。默认是最近3天。 
     * @return StartTime 开始时间。默认是最近3天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。默认是最近3天。
     * @param StartTime 开始时间。默认是最近3天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。默认为空 
     * @return EndTime 结束时间。默认为空
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。默认为空
     * @param EndTime 结束时间。默认为空
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

