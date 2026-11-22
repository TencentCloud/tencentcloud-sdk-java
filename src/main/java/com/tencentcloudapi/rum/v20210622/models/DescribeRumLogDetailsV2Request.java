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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumLogDetailsV2Request extends AbstractModel {

    /**
    * <p>排序方式 desc asc</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Unix纳秒开始时间，包含该时刻；不猜测时间单位。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>CLS路径单次返回1～1000条；旧路径保留原行为。短页不表示结束，以ListOver为准。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：<a href="https://cloud.tencent.com/document/product/248/87223">日志查询相关</a></p>
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * <p>Unix纳秒结束时间，不包含该时刻。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>项目ID（必填）</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
    */
    @SerializedName("LastTime")
    @Expose
    private Long LastTime;

    /**
    * <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
    */
    @SerializedName("LastRowId")
    @Expose
    private Long LastRowId;

    /**
    * <p>从0开始的非负偏移量；保留缺省与显式0的差别。不能与非空Context同时使用，Context续页时删除Offset。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>原样回传上次非空Context，续页时删除Offset，其余有效查询条件保持不变；空串视为缺省。不保证快照或重放同一页。</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get <p>排序方式 desc asc</p> 
     * @return OrderBy <p>排序方式 desc asc</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方式 desc asc</p>
     * @param OrderBy <p>排序方式 desc asc</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Unix纳秒开始时间，包含该时刻；不猜测时间单位。</p> 
     * @return StartTime <p>Unix纳秒开始时间，包含该时刻；不猜测时间单位。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Unix纳秒开始时间，包含该时刻；不猜测时间单位。</p>
     * @param StartTime <p>Unix纳秒开始时间，包含该时刻；不猜测时间单位。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>CLS路径单次返回1～1000条；旧路径保留原行为。短页不表示结束，以ListOver为准。</p> 
     * @return Limit <p>CLS路径单次返回1～1000条；旧路径保留原行为。短页不表示结束，以ListOver为准。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>CLS路径单次返回1～1000条；旧路径保留原行为。短页不表示结束，以ListOver为准。</p>
     * @param Limit <p>CLS路径单次返回1～1000条；旧路径保留原行为。短页不表示结束，以ListOver为准。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：<a href="https://cloud.tencent.com/document/product/248/87223">日志查询相关</a></p> 
     * @return Filter <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：<a href="https://cloud.tencent.com/document/product/248/87223">日志查询相关</a></p>
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：<a href="https://cloud.tencent.com/document/product/248/87223">日志查询相关</a></p>
     * @param Filter <p>过滤条件，其中key与运算符(Operator)对应可选字段枚举值与示例查看文档：<a href="https://cloud.tencent.com/document/product/248/87223">日志查询相关</a></p>
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Unix纳秒结束时间，不包含该时刻。</p> 
     * @return EndTime <p>Unix纳秒结束时间，不包含该时刻。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Unix纳秒结束时间，不包含该时刻。</p>
     * @param EndTime <p>Unix纳秒结束时间，不包含该时刻。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>项目ID（必填）</p> 
     * @return ID <p>项目ID（必填）</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>项目ID（必填）</p>
     * @param ID <p>项目ID（必填）</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p> 
     * @return LastTime <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
     */
    public Long getLastTime() {
        return this.LastTime;
    }

    /**
     * Set <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
     * @param LastTime <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
     */
    public void setLastTime(Long LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p> 
     * @return LastRowId <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
     */
    public Long getLastRowId() {
        return this.LastRowId;
    }

    /**
     * Set <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
     * @param LastRowId <p>旧游标参数已废弃，请迁移至Offset或Context。LastTime和LastRowId均为0或缺省视为未传；非零旧游标在cls下拒绝，off/window且不带新分页参数时保留旧行为。</p>
     */
    public void setLastRowId(Long LastRowId) {
        this.LastRowId = LastRowId;
    }

    /**
     * Get <p>从0开始的非负偏移量；保留缺省与显式0的差别。不能与非空Context同时使用，Context续页时删除Offset。</p> 
     * @return Offset <p>从0开始的非负偏移量；保留缺省与显式0的差别。不能与非空Context同时使用，Context续页时删除Offset。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>从0开始的非负偏移量；保留缺省与显式0的差别。不能与非空Context同时使用，Context续页时删除Offset。</p>
     * @param Offset <p>从0开始的非负偏移量；保留缺省与显式0的差别。不能与非空Context同时使用，Context续页时删除Offset。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>原样回传上次非空Context，续页时删除Offset，其余有效查询条件保持不变；空串视为缺省。不保证快照或重放同一页。</p> 
     * @return Context <p>原样回传上次非空Context，续页时删除Offset，其余有效查询条件保持不变；空串视为缺省。不保证快照或重放同一页。</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>原样回传上次非空Context，续页时删除Offset，其余有效查询条件保持不变；空串视为缺省。不保证快照或重放同一页。</p>
     * @param Context <p>原样回传上次非空Context，续页时删除Offset，其余有效查询条件保持不变；空串视为缺省。不保证快照或重放同一页。</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public DescribeRumLogDetailsV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogDetailsV2Request(DescribeRumLogDetailsV2Request source) {
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.LastTime != null) {
            this.LastTime = new Long(source.LastTime);
        }
        if (source.LastRowId != null) {
            this.LastRowId = new Long(source.LastRowId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "LastRowId", this.LastRowId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

