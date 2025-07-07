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

public class DescribeRumGroupLogRequest extends AbstractModel {

    /**
    * 排序方式  desc  asc（必填）
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 开始时间（必填）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 单次查询返回的原始日志条数，最大值为100（必填）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页数，第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 结束时间（必填）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 项目ID（必填）
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 聚合字段
    */
    @SerializedName("GroupField")
    @Expose
    private String GroupField;

    /**
     * Get 排序方式  desc  asc（必填） 
     * @return OrderBy 排序方式  desc  asc（必填）
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序方式  desc  asc（必填）
     * @param OrderBy 排序方式  desc  asc（必填）
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 开始时间（必填） 
     * @return StartTime 开始时间（必填）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（必填）
     * @param StartTime 开始时间（必填）
     */
    public void setStartTime(String StartTime) {
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
     * Get 页数，第几页 
     * @return Page 页数，第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页数，第几页
     * @param Page 页数，第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 查询语句，参考控制台请求参数，语句长度最大为4096（必填） 
     * @return Query 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
     * @param Query 查询语句，参考控制台请求参数，语句长度最大为4096（必填）
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 结束时间（必填） 
     * @return EndTime 结束时间（必填）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（必填）
     * @param EndTime 结束时间（必填）
     */
    public void setEndTime(String EndTime) {
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
     * Get 聚合字段 
     * @return GroupField 聚合字段
     */
    public String getGroupField() {
        return this.GroupField;
    }

    /**
     * Set 聚合字段
     * @param GroupField 聚合字段
     */
    public void setGroupField(String GroupField) {
        this.GroupField = GroupField;
    }

    public DescribeRumGroupLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumGroupLogRequest(DescribeRumGroupLogRequest source) {
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.GroupField != null) {
            this.GroupField = new String(source.GroupField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "GroupField", this.GroupField);

    }
}

