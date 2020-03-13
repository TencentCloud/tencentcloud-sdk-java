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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchClsLogRequest extends AbstractModel{

    /**
    * 需要查询的日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 需要查询的日志主题ID组合，以逗号分隔
    */
    @SerializedName("TopicIds")
    @Expose
    private String TopicIds;

    /**
    * 需要查询的日志的起始时间，格式 YYYY-mm-dd HH:MM:SS
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 单次要返回的日志条数，单次返回的最大条数为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 接入渠道，默认值为cdn
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 需要查询的内容，详情请参考https://cloud.tencent.com/document/product/614/16982
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 按日志时间排序， asc（升序）或者 desc（降序），默认为 desc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get 需要查询的日志集ID 
     * @return LogsetId 需要查询的日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 需要查询的日志集ID
     * @param LogsetId 需要查询的日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 需要查询的日志主题ID组合，以逗号分隔 
     * @return TopicIds 需要查询的日志主题ID组合，以逗号分隔
     */
    public String getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set 需要查询的日志主题ID组合，以逗号分隔
     * @param TopicIds 需要查询的日志主题ID组合，以逗号分隔
     */
    public void setTopicIds(String TopicIds) {
        this.TopicIds = TopicIds;
    }

    /**
     * Get 需要查询的日志的起始时间，格式 YYYY-mm-dd HH:MM:SS 
     * @return StartTime 需要查询的日志的起始时间，格式 YYYY-mm-dd HH:MM:SS
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 需要查询的日志的起始时间，格式 YYYY-mm-dd HH:MM:SS
     * @param StartTime 需要查询的日志的起始时间，格式 YYYY-mm-dd HH:MM:SS
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS 
     * @return EndTime 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS
     * @param EndTime 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 接入渠道，默认值为cdn 
     * @return Channel 接入渠道，默认值为cdn
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 接入渠道，默认值为cdn
     * @param Channel 接入渠道，默认值为cdn
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 需要查询的内容，详情请参考https://cloud.tencent.com/document/product/614/16982 
     * @return Query 需要查询的内容，详情请参考https://cloud.tencent.com/document/product/614/16982
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 需要查询的内容，详情请参考https://cloud.tencent.com/document/product/614/16982
     * @param Query 需要查询的内容，详情请参考https://cloud.tencent.com/document/product/614/16982
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围 
     * @return Context 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
     * @param Context 加载更多使用，透传上次返回的 context 值，获取后续的日志内容，通过游标最多可获取10000条，请尽可能缩小时间范围
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 按日志时间排序， asc（升序）或者 desc（降序），默认为 desc 
     * @return Sort 按日志时间排序， asc（升序）或者 desc（降序），默认为 desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 按日志时间排序， asc（升序）或者 desc（降序），默认为 desc
     * @param Sort 按日志时间排序， asc（升序）或者 desc（降序），默认为 desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicIds", this.TopicIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

