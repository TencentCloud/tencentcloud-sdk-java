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
    * 保留字段
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
    * 保留字段
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 检索条件,支持的检索条件如下：
req_id：“=”
api_id：“=”
cip：“=”
uip：“:”
err_msg：“:”
rsp_st：“=” 、“!=” 、 “:” 、 “>” 、 “<”
req_t：”>=“ 、 ”<=“

说明：
“:”表示包含，“!=”表示不等于，字段含义见输出参数的LogSet说明
    */
    @SerializedName("LogQuerys")
    @Expose
    private LogQuery [] LogQuerys;

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
     * Get 保留字段 
     * @return Filters 保留字段
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 保留字段
     * @param Filters 保留字段
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
     * Get 保留字段 
     * @return Query 保留字段
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 保留字段
     * @param Query 保留字段
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 检索条件,支持的检索条件如下：
req_id：“=”
api_id：“=”
cip：“=”
uip：“:”
err_msg：“:”
rsp_st：“=” 、“!=” 、 “:” 、 “>” 、 “<”
req_t：”>=“ 、 ”<=“

说明：
“:”表示包含，“!=”表示不等于，字段含义见输出参数的LogSet说明 
     * @return LogQuerys 检索条件,支持的检索条件如下：
req_id：“=”
api_id：“=”
cip：“=”
uip：“:”
err_msg：“:”
rsp_st：“=” 、“!=” 、 “:” 、 “>” 、 “<”
req_t：”>=“ 、 ”<=“

说明：
“:”表示包含，“!=”表示不等于，字段含义见输出参数的LogSet说明
     */
    public LogQuery [] getLogQuerys() {
        return this.LogQuerys;
    }

    /**
     * Set 检索条件,支持的检索条件如下：
req_id：“=”
api_id：“=”
cip：“=”
uip：“:”
err_msg：“:”
rsp_st：“=” 、“!=” 、 “:” 、 “>” 、 “<”
req_t：”>=“ 、 ”<=“

说明：
“:”表示包含，“!=”表示不等于，字段含义见输出参数的LogSet说明
     * @param LogQuerys 检索条件,支持的检索条件如下：
req_id：“=”
api_id：“=”
cip：“=”
uip：“:”
err_msg：“:”
rsp_st：“=” 、“!=” 、 “:” 、 “>” 、 “<”
req_t：”>=“ 、 ”<=“

说明：
“:”表示包含，“!=”表示不等于，字段含义见输出参数的LogSet说明
     */
    public void setLogQuerys(LogQuery [] LogQuerys) {
        this.LogQuerys = LogQuerys;
    }

    public DescribeLogSearchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogSearchRequest(DescribeLogSearchRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConText != null) {
            this.ConText = new String(source.ConText);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.LogQuerys != null) {
            this.LogQuerys = new LogQuery[source.LogQuerys.length];
            for (int i = 0; i < source.LogQuerys.length; i++) {
                this.LogQuerys[i] = new LogQuery(source.LogQuerys[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "LogQuerys.", this.LogQuerys);

    }
}

