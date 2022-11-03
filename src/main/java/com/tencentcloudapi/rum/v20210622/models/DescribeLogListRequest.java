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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogListRequest extends AbstractModel{

    /**
    * 排序方式  desc  asc（必填）
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * searchlog  histogram（必填）
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 项目ID（必填）
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

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
    * 上下文，加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容，总计最多可获取1万条原始日志。过期时间1小时
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 查询语句，参考控制台请求参数，语句长度最大为4096（必填）例："id:120001 AND type:\"log\""
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
     * Get 排序方式  desc  asc（必填） 
     * @return Sort 排序方式  desc  asc（必填）
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式  desc  asc（必填）
     * @param Sort 排序方式  desc  asc（必填）
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get searchlog  histogram（必填） 
     * @return ActionType searchlog  histogram（必填）
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set searchlog  histogram（必填）
     * @param ActionType searchlog  histogram（必填）
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
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
     * Get 上下文，加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容，总计最多可获取1万条原始日志。过期时间1小时 
     * @return Context 上下文，加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容，总计最多可获取1万条原始日志。过期时间1小时
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 上下文，加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容，总计最多可获取1万条原始日志。过期时间1小时
     * @param Context 上下文，加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容，总计最多可获取1万条原始日志。过期时间1小时
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 查询语句，参考控制台请求参数，语句长度最大为4096（必填）例："id:120001 AND type:\"log\"" 
     * @return Query 查询语句，参考控制台请求参数，语句长度最大为4096（必填）例："id:120001 AND type:\"log\""
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，参考控制台请求参数，语句长度最大为4096（必填）例："id:120001 AND type:\"log\""
     * @param Query 查询语句，参考控制台请求参数，语句长度最大为4096（必填）例："id:120001 AND type:\"log\""
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

    public DescribeLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogListRequest(DescribeLogListRequest source) {
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

