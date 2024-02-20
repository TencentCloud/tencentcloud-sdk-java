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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * 任务开始时间起始值
    */
    @SerializedName("StartTimeBegin")
    @Expose
    private String StartTimeBegin;

    /**
    * 任务开始时间结束值
    */
    @SerializedName("StartTimeEnd")
    @Expose
    private String StartTimeEnd;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
    * 查询列表长度
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询列表偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 任务开始时间起始值 
     * @return StartTimeBegin 任务开始时间起始值
     */
    public String getStartTimeBegin() {
        return this.StartTimeBegin;
    }

    /**
     * Set 任务开始时间起始值
     * @param StartTimeBegin 任务开始时间起始值
     */
    public void setStartTimeBegin(String StartTimeBegin) {
        this.StartTimeBegin = StartTimeBegin;
    }

    /**
     * Get 任务开始时间结束值 
     * @return StartTimeEnd 任务开始时间结束值
     */
    public String getStartTimeEnd() {
        return this.StartTimeEnd;
    }

    /**
     * Set 任务开始时间结束值
     * @param StartTimeEnd 任务开始时间结束值
     */
    public void setStartTimeEnd(String StartTimeEnd) {
        this.StartTimeEnd = StartTimeEnd;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询列表长度 
     * @return Limit 查询列表长度
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询列表长度
     * @param Limit 查询列表长度
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询列表偏移量 
     * @return Offset 查询列表偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询列表偏移量
     * @param Offset 查询列表偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.StartTimeBegin != null) {
            this.StartTimeBegin = new String(source.StartTimeBegin);
        }
        if (source.StartTimeEnd != null) {
            this.StartTimeEnd = new String(source.StartTimeEnd);
        }
        if (source.Filters != null) {
            this.Filters = new QueryFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeBegin", this.StartTimeBegin);
        this.setParamSimple(map, prefix + "StartTimeEnd", this.StartTimeEnd);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

