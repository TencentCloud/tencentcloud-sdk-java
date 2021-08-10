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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchAccessLogRequest extends AbstractModel{

    /**
    * 客户要查询的日志主题ID，每个客户都有对应的一个主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 要查询的日志的起始时间，Unix时间戳，单位ms
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 要查询的日志的结束时间，Unix时间戳，单位ms
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 查询语句，语句长度最大为4096
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 单次查询返回的日志条数，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 日志接口是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get 客户要查询的日志主题ID，每个客户都有对应的一个主题 
     * @return TopicId 客户要查询的日志主题ID，每个客户都有对应的一个主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 客户要查询的日志主题ID，每个客户都有对应的一个主题
     * @param TopicId 客户要查询的日志主题ID，每个客户都有对应的一个主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 要查询的日志的起始时间，Unix时间戳，单位ms 
     * @return From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 要查询的日志的起始时间，Unix时间戳，单位ms
     * @param From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 要查询的日志的结束时间，Unix时间戳，单位ms 
     * @return To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 要查询的日志的结束时间，Unix时间戳，单位ms
     * @param To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get 查询语句，语句长度最大为4096 
     * @return Query 查询语句，语句长度最大为4096
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，语句长度最大为4096
     * @param Query 查询语句，语句长度最大为4096
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 单次查询返回的日志条数，最大值为100 
     * @return Limit 单次查询返回的日志条数，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询返回的日志条数，最大值为100
     * @param Limit 单次查询返回的日志条数，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容 
     * @return Context 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
     * @param Context 加载更多日志时使用，透传上次返回的Context值，获取后续的日志内容
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 日志接口是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc 
     * @return Sort 日志接口是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 日志接口是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc
     * @param Sort 日志接口是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public SearchAccessLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchAccessLogRequest(SearchAccessLogRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

