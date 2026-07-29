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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel {

    /**
    * <p>要检索分析的日志的起始时间，Unix时间戳（毫秒）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>要检索分析的日志的结束时间，Unix时间戳（毫秒）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>检索分析语句，最大长度为12KB，查询语法可参考文档 https://cloud.tencent.com/document/product/296/50508</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * <p>表示单次查询返回的原始日志条数，最大值为1000，获取后续日志需使用Context参数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get <p>要检索分析的日志的起始时间，Unix时间戳（毫秒）</p> 
     * @return StartTime <p>要检索分析的日志的起始时间，Unix时间戳（毫秒）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>要检索分析的日志的起始时间，Unix时间戳（毫秒）</p>
     * @param StartTime <p>要检索分析的日志的起始时间，Unix时间戳（毫秒）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>要检索分析的日志的结束时间，Unix时间戳（毫秒）</p> 
     * @return EndTime <p>要检索分析的日志的结束时间，Unix时间戳（毫秒）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>要检索分析的日志的结束时间，Unix时间戳（毫秒）</p>
     * @param EndTime <p>要检索分析的日志的结束时间，Unix时间戳（毫秒）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>检索分析语句，最大长度为12KB，查询语法可参考文档 https://cloud.tencent.com/document/product/296/50508</p> 
     * @return QueryString <p>检索分析语句，最大长度为12KB，查询语法可参考文档 https://cloud.tencent.com/document/product/296/50508</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>检索分析语句，最大长度为12KB，查询语法可参考文档 https://cloud.tencent.com/document/product/296/50508</p>
     * @param QueryString <p>检索分析语句，最大长度为12KB，查询语法可参考文档 https://cloud.tencent.com/document/product/296/50508</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get <p>表示单次查询返回的原始日志条数，最大值为1000，获取后续日志需使用Context参数</p> 
     * @return Count <p>表示单次查询返回的原始日志条数，最大值为1000，获取后续日志需使用Context参数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>表示单次查询返回的原始日志条数，最大值为1000，获取后续日志需使用Context参数</p>
     * @param Count <p>表示单次查询返回的原始日志条数，最大值为1000，获取后续日志需使用Context参数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc</p> 
     * @return Sort <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc</p>
     * @param Sort <p>原始日志是否按时间排序返回；可选值：asc(升序)、desc(降序)，默认为 desc</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时</p> 
     * @return Context <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时</p>
     * @param Context <p>透传上次接口返回的Context值，可获取后续更多日志，总计最多可获取1万条原始日志，过期时间1小时</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

