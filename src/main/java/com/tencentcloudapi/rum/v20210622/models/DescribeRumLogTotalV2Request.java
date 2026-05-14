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

public class DescribeRumLogTotalV2Request extends AbstractModel {

    /**
    * 排序方式 desc asc
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 开始时间（必填）格式为时间戳 毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 单次查询返回的原始日志条数，最大值为100（必填）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询的相关参数
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 结束时间（必填）格式为时间戳 毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 项目ID（必填）
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 上次查询的最后一个日志的时间戳
    */
    @SerializedName("LastTime")
    @Expose
    private Long LastTime;

    /**
    * 上次查询的最后一个日志的rowId
    */
    @SerializedName("LastRowId")
    @Expose
    private Long LastRowId;

    /**
     * Get 排序方式 desc asc 
     * @return OrderBy 排序方式 desc asc
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序方式 desc asc
     * @param OrderBy 排序方式 desc asc
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 开始时间（必填）格式为时间戳 毫秒 
     * @return StartTime 开始时间（必填）格式为时间戳 毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（必填）格式为时间戳 毫秒
     * @param StartTime 开始时间（必填）格式为时间戳 毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 单次查询返回的原始日志条数，最大值为100（必填） 
     * @return Limit 单次查询返回的原始日志条数，最大值为100（必填）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询返回的原始日志条数，最大值为100（必填）
     * @param Limit 单次查询返回的原始日志条数，最大值为100（必填）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询的相关参数 
     * @return Filter 查询的相关参数
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询的相关参数
     * @param Filter 查询的相关参数
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 结束时间（必填）格式为时间戳 毫秒 
     * @return EndTime 结束时间（必填）格式为时间戳 毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（必填）格式为时间戳 毫秒
     * @param EndTime 结束时间（必填）格式为时间戳 毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 项目ID（必填） 
     * @return ID 项目ID（必填）
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目ID（必填）
     * @param ID 项目ID（必填）
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 上次查询的最后一个日志的时间戳 
     * @return LastTime 上次查询的最后一个日志的时间戳
     */
    public Long getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 上次查询的最后一个日志的时间戳
     * @param LastTime 上次查询的最后一个日志的时间戳
     */
    public void setLastTime(Long LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 上次查询的最后一个日志的rowId 
     * @return LastRowId 上次查询的最后一个日志的rowId
     */
    public Long getLastRowId() {
        return this.LastRowId;
    }

    /**
     * Set 上次查询的最后一个日志的rowId
     * @param LastRowId 上次查询的最后一个日志的rowId
     */
    public void setLastRowId(Long LastRowId) {
        this.LastRowId = LastRowId;
    }

    public DescribeRumLogTotalV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumLogTotalV2Request(DescribeRumLogTotalV2Request source) {
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

    }
}

