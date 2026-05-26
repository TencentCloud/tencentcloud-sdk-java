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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMemoryPlusRecordRequest extends AbstractModel {

    /**
    * <p>查询的 Memory 实例 ID。</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次查询返回的记录数量上限（分页大小）。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询的记忆类型。</p><ul><li>conversation：L0 原始对话。</li><li>memory：L1 原子记忆。</li><li>scene：L2 场景记忆。</li><li>persona：L3 个性化画像。</li><li>memory/persona：L1 原子记忆-画像型。</li><li>memory/episodic：L1 原子记忆-事件型。</li><li>memory/instruction：L1 原子记忆-指令型。</li></ul>
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * <p>指定返回记录中的特定字段。</p>
    */
    @SerializedName("Output")
    @Expose
    private String [] Output;

    /**
    * <p>过滤条件，当前仅支持 <strong>RecordType</strong> 为 <strong>conversation</strong> 的 <strong>session_id</strong> 过滤。</p>
    */
    @SerializedName("Filters")
    @Expose
    private VDBFieldMap [] Filters;

    /**
    * <p>查询结果列表的排序规则。</p><ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * <p>查询时间范围的起始时间点。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询时间范围的结束时间点。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>查询的 Memory 实例 ID。</p> 
     * @return SpaceId <p>查询的 Memory 实例 ID。</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>查询的 Memory 实例 ID。</p>
     * @param SpaceId <p>查询的 Memory 实例 ID。</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p> 
     * @return Offset <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
     * @param Offset <p>查询列表的起始位置（偏移量）。用于分页查询，指明从符合条件的第几条数据开始返回。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次查询返回的记录数量上限（分页大小）。</p> 
     * @return Limit <p>单次查询返回的记录数量上限（分页大小）。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询返回的记录数量上限（分页大小）。</p>
     * @param Limit <p>单次查询返回的记录数量上限（分页大小）。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询的记忆类型。</p><ul><li>conversation：L0 原始对话。</li><li>memory：L1 原子记忆。</li><li>scene：L2 场景记忆。</li><li>persona：L3 个性化画像。</li><li>memory/persona：L1 原子记忆-画像型。</li><li>memory/episodic：L1 原子记忆-事件型。</li><li>memory/instruction：L1 原子记忆-指令型。</li></ul> 
     * @return RecordType <p>查询的记忆类型。</p><ul><li>conversation：L0 原始对话。</li><li>memory：L1 原子记忆。</li><li>scene：L2 场景记忆。</li><li>persona：L3 个性化画像。</li><li>memory/persona：L1 原子记忆-画像型。</li><li>memory/episodic：L1 原子记忆-事件型。</li><li>memory/instruction：L1 原子记忆-指令型。</li></ul>
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set <p>查询的记忆类型。</p><ul><li>conversation：L0 原始对话。</li><li>memory：L1 原子记忆。</li><li>scene：L2 场景记忆。</li><li>persona：L3 个性化画像。</li><li>memory/persona：L1 原子记忆-画像型。</li><li>memory/episodic：L1 原子记忆-事件型。</li><li>memory/instruction：L1 原子记忆-指令型。</li></ul>
     * @param RecordType <p>查询的记忆类型。</p><ul><li>conversation：L0 原始对话。</li><li>memory：L1 原子记忆。</li><li>scene：L2 场景记忆。</li><li>persona：L3 个性化画像。</li><li>memory/persona：L1 原子记忆-画像型。</li><li>memory/episodic：L1 原子记忆-事件型。</li><li>memory/instruction：L1 原子记忆-指令型。</li></ul>
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get <p>指定返回记录中的特定字段。</p> 
     * @return Output <p>指定返回记录中的特定字段。</p>
     */
    public String [] getOutput() {
        return this.Output;
    }

    /**
     * Set <p>指定返回记录中的特定字段。</p>
     * @param Output <p>指定返回记录中的特定字段。</p>
     */
    public void setOutput(String [] Output) {
        this.Output = Output;
    }

    /**
     * Get <p>过滤条件，当前仅支持 <strong>RecordType</strong> 为 <strong>conversation</strong> 的 <strong>session_id</strong> 过滤。</p> 
     * @return Filters <p>过滤条件，当前仅支持 <strong>RecordType</strong> 为 <strong>conversation</strong> 的 <strong>session_id</strong> 过滤。</p>
     */
    public VDBFieldMap [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，当前仅支持 <strong>RecordType</strong> 为 <strong>conversation</strong> 的 <strong>session_id</strong> 过滤。</p>
     * @param Filters <p>过滤条件，当前仅支持 <strong>RecordType</strong> 为 <strong>conversation</strong> 的 <strong>session_id</strong> 过滤。</p>
     */
    public void setFilters(VDBFieldMap [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>查询结果列表的排序规则。</p><ul><li>ASC：升序。</li><li>DESC：降序。</li></ul> 
     * @return OrderDirection <p>查询结果列表的排序规则。</p><ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>查询结果列表的排序规则。</p><ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
     * @param OrderDirection <p>查询结果列表的排序规则。</p><ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get <p>查询时间范围的起始时间点。</p> 
     * @return StartTime <p>查询时间范围的起始时间点。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询时间范围的起始时间点。</p>
     * @param StartTime <p>查询时间范围的起始时间点。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询时间范围的结束时间点。</p> 
     * @return EndTime <p>查询时间范围的结束时间点。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询时间范围的结束时间点。</p>
     * @param EndTime <p>查询时间范围的结束时间点。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeMemoryPlusRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMemoryPlusRecordRequest(DescribeMemoryPlusRecordRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.Output != null) {
            this.Output = new String[source.Output.length];
            for (int i = 0; i < source.Output.length; i++) {
                this.Output[i] = new String(source.Output[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new VDBFieldMap[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new VDBFieldMap(source.Filters[i]);
            }
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
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
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamArraySimple(map, prefix + "Output.", this.Output);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

