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
    * <p>排序方式  desc  asc（必填）</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>开始时间（必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>页数，第几页（注意：该字段已废弃！）</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>结束时间（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>项目ID（必填）</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>聚合字段</p>
    */
    @SerializedName("GroupField")
    @Expose
    private String GroupField;

    /**
     * Get <p>排序方式  desc  asc（必填）</p> 
     * @return OrderBy <p>排序方式  desc  asc（必填）</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方式  desc  asc（必填）</p>
     * @param OrderBy <p>排序方式  desc  asc（必填）</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>开始时间（必填）</p> 
     * @return StartTime <p>开始时间（必填）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（必填）</p>
     * @param StartTime <p>开始时间（必填）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>单次查询返回的原始日志条数，最大值为100（必填）</p> 
     * @return Limit <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
     * @param Limit <p>单次查询返回的原始日志条数，最大值为100（必填）</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>页数，第几页（注意：该字段已废弃！）</p> 
     * @return Page <p>页数，第几页（注意：该字段已废弃！）</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页数，第几页（注意：该字段已废弃！）</p>
     * @param Page <p>页数，第几页（注意：该字段已废弃！）</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p> 
     * @return Query <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
     * @param Query <p>查询语句，参考控制台请求参数，语句长度最大为4096（必填）</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>结束时间（必填）</p> 
     * @return EndTime <p>结束时间（必填）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（必填）</p>
     * @param EndTime <p>结束时间（必填）</p>
     */
    public void setEndTime(String EndTime) {
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
     * Get <p>聚合字段</p> 
     * @return GroupField <p>聚合字段</p>
     */
    public String getGroupField() {
        return this.GroupField;
    }

    /**
     * Set <p>聚合字段</p>
     * @param GroupField <p>聚合字段</p>
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

