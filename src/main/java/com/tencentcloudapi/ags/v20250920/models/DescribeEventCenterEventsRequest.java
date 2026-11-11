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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventCenterEventsRequest extends AbstractModel {

    /**
    * <p>事件筛选条件，用于按事件来源、对象、类型、级别及工具等信息查询事件。</p><p>入参限制：最多支持 12 个筛选条件，同名筛选条件不可重复；每个条件支持 1～20 个值，每个值非空且不超过 256 字节。</p><p>支持的筛选字段：Source、ObjectType、ObjectId、EventType、EventLevel、Reason、EventId、ToolId、ToolType、Message。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>查询开始时间，包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T13:28:00Z。</p><p>入参限制：必须早于 EndTime，且不能早于当前时间前 7 天。</p><p>默认值：不传时默认为 EndTime 前 1 小时。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，不包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T14:28:00Z。</p><p>入参限制：必须晚于 StartTime，不应晚于当前时间。</p><p>默认值：不传时默认为当前时间。</p><p>查询范围为 [StartTime, EndTime)。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>分页偏移量。</p><p>取值范围：[0, 10000]</p><p>默认值：0</p><p>Raw 模式按去重后的事件分页，Aggregate 模式按聚合结果分页。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次返回的最大结果条数。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>事件结果的时间排序方向。</p><p>枚举值：</p><ul><li>Asc： 按时间升序排列，较早的事件在前。</li><li>Desc： 按时间降序排列，较新的事件在前。默认值。</li></ul><p>默认值：Desc</p><p>Raw 模式按事件发生时间排序；Aggregate 模式按聚合结果最近发生时间排序。</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>事件查询模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式，返回去重后的事件明细。默认值。</li><li>Aggregate： 聚合模式，返回聚合结果及事件数量、首次和最近发生时间；生命周期事件仍逐条展示。</li></ul><p>默认值：Raw</p><p>Raw 返回去重后的事件明细；Aggregate 返回聚合结果。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get <p>事件筛选条件，用于按事件来源、对象、类型、级别及工具等信息查询事件。</p><p>入参限制：最多支持 12 个筛选条件，同名筛选条件不可重复；每个条件支持 1～20 个值，每个值非空且不超过 256 字节。</p><p>支持的筛选字段：Source、ObjectType、ObjectId、EventType、EventLevel、Reason、EventId、ToolId、ToolType、Message。</p> 
     * @return Filters <p>事件筛选条件，用于按事件来源、对象、类型、级别及工具等信息查询事件。</p><p>入参限制：最多支持 12 个筛选条件，同名筛选条件不可重复；每个条件支持 1～20 个值，每个值非空且不超过 256 字节。</p><p>支持的筛选字段：Source、ObjectType、ObjectId、EventType、EventLevel、Reason、EventId、ToolId、ToolType、Message。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>事件筛选条件，用于按事件来源、对象、类型、级别及工具等信息查询事件。</p><p>入参限制：最多支持 12 个筛选条件，同名筛选条件不可重复；每个条件支持 1～20 个值，每个值非空且不超过 256 字节。</p><p>支持的筛选字段：Source、ObjectType、ObjectId、EventType、EventLevel、Reason、EventId、ToolId、ToolType、Message。</p>
     * @param Filters <p>事件筛选条件，用于按事件来源、对象、类型、级别及工具等信息查询事件。</p><p>入参限制：最多支持 12 个筛选条件，同名筛选条件不可重复；每个条件支持 1～20 个值，每个值非空且不超过 256 字节。</p><p>支持的筛选字段：Source、ObjectType、ObjectId、EventType、EventLevel、Reason、EventId、ToolId、ToolType、Message。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>查询开始时间，包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T13:28:00Z。</p><p>入参限制：必须早于 EndTime，且不能早于当前时间前 7 天。</p><p>默认值：不传时默认为 EndTime 前 1 小时。</p> 
     * @return StartTime <p>查询开始时间，包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T13:28:00Z。</p><p>入参限制：必须早于 EndTime，且不能早于当前时间前 7 天。</p><p>默认值：不传时默认为 EndTime 前 1 小时。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间，包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T13:28:00Z。</p><p>入参限制：必须早于 EndTime，且不能早于当前时间前 7 天。</p><p>默认值：不传时默认为 EndTime 前 1 小时。</p>
     * @param StartTime <p>查询开始时间，包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T13:28:00Z。</p><p>入参限制：必须早于 EndTime，且不能早于当前时间前 7 天。</p><p>默认值：不传时默认为 EndTime 前 1 小时。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，不包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T14:28:00Z。</p><p>入参限制：必须晚于 StartTime，不应晚于当前时间。</p><p>默认值：不传时默认为当前时间。</p><p>查询范围为 [StartTime, EndTime)。</p> 
     * @return EndTime <p>查询结束时间，不包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T14:28:00Z。</p><p>入参限制：必须晚于 StartTime，不应晚于当前时间。</p><p>默认值：不传时默认为当前时间。</p><p>查询范围为 [StartTime, EndTime)。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，不包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T14:28:00Z。</p><p>入参限制：必须晚于 StartTime，不应晚于当前时间。</p><p>默认值：不传时默认为当前时间。</p><p>查询范围为 [StartTime, EndTime)。</p>
     * @param EndTime <p>查询结束时间，不包含该时间点。</p><p>参数格式：RFC3339 格式，例如 2026-10-23T14:28:00Z。</p><p>入参限制：必须晚于 StartTime，不应晚于当前时间。</p><p>默认值：不传时默认为当前时间。</p><p>查询范围为 [StartTime, EndTime)。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页偏移量。</p><p>取值范围：[0, 10000]</p><p>默认值：0</p><p>Raw 模式按去重后的事件分页，Aggregate 模式按聚合结果分页。</p> 
     * @return Offset <p>分页偏移量。</p><p>取值范围：[0, 10000]</p><p>默认值：0</p><p>Raw 模式按去重后的事件分页，Aggregate 模式按聚合结果分页。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。</p><p>取值范围：[0, 10000]</p><p>默认值：0</p><p>Raw 模式按去重后的事件分页，Aggregate 模式按聚合结果分页。</p>
     * @param Offset <p>分页偏移量。</p><p>取值范围：[0, 10000]</p><p>默认值：0</p><p>Raw 模式按去重后的事件分页，Aggregate 模式按聚合结果分页。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次返回的最大结果条数。</p><p>取值范围：[1, 100]</p><p>默认值：10</p> 
     * @return Limit <p>单次返回的最大结果条数。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次返回的最大结果条数。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     * @param Limit <p>单次返回的最大结果条数。</p><p>取值范围：[1, 100]</p><p>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>事件结果的时间排序方向。</p><p>枚举值：</p><ul><li>Asc： 按时间升序排列，较早的事件在前。</li><li>Desc： 按时间降序排列，较新的事件在前。默认值。</li></ul><p>默认值：Desc</p><p>Raw 模式按事件发生时间排序；Aggregate 模式按聚合结果最近发生时间排序。</p> 
     * @return Order <p>事件结果的时间排序方向。</p><p>枚举值：</p><ul><li>Asc： 按时间升序排列，较早的事件在前。</li><li>Desc： 按时间降序排列，较新的事件在前。默认值。</li></ul><p>默认值：Desc</p><p>Raw 模式按事件发生时间排序；Aggregate 模式按聚合结果最近发生时间排序。</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>事件结果的时间排序方向。</p><p>枚举值：</p><ul><li>Asc： 按时间升序排列，较早的事件在前。</li><li>Desc： 按时间降序排列，较新的事件在前。默认值。</li></ul><p>默认值：Desc</p><p>Raw 模式按事件发生时间排序；Aggregate 模式按聚合结果最近发生时间排序。</p>
     * @param Order <p>事件结果的时间排序方向。</p><p>枚举值：</p><ul><li>Asc： 按时间升序排列，较早的事件在前。</li><li>Desc： 按时间降序排列，较新的事件在前。默认值。</li></ul><p>默认值：Desc</p><p>Raw 模式按事件发生时间排序；Aggregate 模式按聚合结果最近发生时间排序。</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>事件查询模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式，返回去重后的事件明细。默认值。</li><li>Aggregate： 聚合模式，返回聚合结果及事件数量、首次和最近发生时间；生命周期事件仍逐条展示。</li></ul><p>默认值：Raw</p><p>Raw 返回去重后的事件明细；Aggregate 返回聚合结果。</p> 
     * @return Mode <p>事件查询模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式，返回去重后的事件明细。默认值。</li><li>Aggregate： 聚合模式，返回聚合结果及事件数量、首次和最近发生时间；生命周期事件仍逐条展示。</li></ul><p>默认值：Raw</p><p>Raw 返回去重后的事件明细；Aggregate 返回聚合结果。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>事件查询模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式，返回去重后的事件明细。默认值。</li><li>Aggregate： 聚合模式，返回聚合结果及事件数量、首次和最近发生时间；生命周期事件仍逐条展示。</li></ul><p>默认值：Raw</p><p>Raw 返回去重后的事件明细；Aggregate 返回聚合结果。</p>
     * @param Mode <p>事件查询模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式，返回去重后的事件明细。默认值。</li><li>Aggregate： 聚合模式，返回聚合结果及事件数量、首次和最近发生时间；生命周期事件仍逐条展示。</li></ul><p>默认值：Raw</p><p>Raw 返回去重后的事件明细；Aggregate 返回聚合结果。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public DescribeEventCenterEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventCenterEventsRequest(DescribeEventCenterEventsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

