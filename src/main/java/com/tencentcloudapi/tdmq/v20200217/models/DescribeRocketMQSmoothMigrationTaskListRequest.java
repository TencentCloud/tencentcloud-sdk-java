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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQSmoothMigrationTaskListRequest extends AbstractModel {

    /**
    * 查询起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询最大数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询过滤器，
支持的字段如下
TaskStatus, 支持多选
ConnectionType，支持多选
ClusterId，精确搜索
TaskName，支持模糊搜索
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 查询起始偏移量 
     * @return Offset 查询起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始偏移量
     * @param Offset 查询起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询最大数量 
     * @return Limit 查询最大数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询最大数量
     * @param Limit 查询最大数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询过滤器，
支持的字段如下
TaskStatus, 支持多选
ConnectionType，支持多选
ClusterId，精确搜索
TaskName，支持模糊搜索 
     * @return Filters 查询过滤器，
支持的字段如下
TaskStatus, 支持多选
ConnectionType，支持多选
ClusterId，精确搜索
TaskName，支持模糊搜索
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询过滤器，
支持的字段如下
TaskStatus, 支持多选
ConnectionType，支持多选
ClusterId，精确搜索
TaskName，支持模糊搜索
     * @param Filters 查询过滤器，
支持的字段如下
TaskStatus, 支持多选
ConnectionType，支持多选
ClusterId，精确搜索
TaskName，支持模糊搜索
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRocketMQSmoothMigrationTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQSmoothMigrationTaskListRequest(DescribeRocketMQSmoothMigrationTaskListRequest source) {
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

