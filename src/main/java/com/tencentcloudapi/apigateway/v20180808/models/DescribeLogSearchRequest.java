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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogSearchRequest extends AbstractModel{

    /**
    * 日志开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 精确查询，支持apiid/reqid搜索
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 单次要返回的日志条数，单次返回的最大条数为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据上次返回的ConText，获取后续的内容，最多可获取10000条
    */
    @SerializedName("ConText")
    @Expose
    private String ConText;

    /**
    * 按时间排序 asc（升序）或者 desc（降序），默认为 desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 模糊查询，根据关键字检索日志
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 日志开始时间 
     * @return StartTime 日志开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志开始时间
     * @param StartTime 日志开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志结束时间 
     * @return EndTime 日志结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志结束时间
     * @param EndTime 日志结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务id 
     * @return ServiceId 服务id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务id
     * @param ServiceId 服务id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 精确查询，支持apiid/reqid搜索 
     * @return Filters 精确查询，支持apiid/reqid搜索
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 精确查询，支持apiid/reqid搜索
     * @param Filters 精确查询，支持apiid/reqid搜索
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 单次要返回的日志条数，单次返回的最大条数为100 
     * @return Limit 单次要返回的日志条数，单次返回的最大条数为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次要返回的日志条数，单次返回的最大条数为100
     * @param Limit 单次要返回的日志条数，单次返回的最大条数为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据上次返回的ConText，获取后续的内容，最多可获取10000条 
     * @return ConText 根据上次返回的ConText，获取后续的内容，最多可获取10000条
     */
    public String getConText() {
        return this.ConText;
    }

    /**
     * Set 根据上次返回的ConText，获取后续的内容，最多可获取10000条
     * @param ConText 根据上次返回的ConText，获取后续的内容，最多可获取10000条
     */
    public void setConText(String ConText) {
        this.ConText = ConText;
    }

    /**
     * Get 按时间排序 asc（升序）或者 desc（降序），默认为 desc 
     * @return Sort 按时间排序 asc（升序）或者 desc（降序），默认为 desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 按时间排序 asc（升序）或者 desc（降序），默认为 desc
     * @param Sort 按时间排序 asc（升序）或者 desc（降序），默认为 desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 模糊查询，根据关键字检索日志 
     * @return Query 模糊查询，根据关键字检索日志
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 模糊查询，根据关键字检索日志
     * @param Query 模糊查询，根据关键字检索日志
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConText", this.ConText);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

