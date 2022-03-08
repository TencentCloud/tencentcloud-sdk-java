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

public class ListTopClsLogDataRequest extends AbstractModel{

    /**
    * 需要查询的日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 需要查询的日志主题ID组合，多个以逗号分隔
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
    * 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS，时间跨度应小于10分钟
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指定域名查询
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 指定访问的URL查询，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 接入渠道，cdn或者ecdn，默认值为cdn
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 要查询的Top条数，最大值为100，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按请求量排序， asc（升序）或者 desc（降序），默认为 desc
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
     * Get 需要查询的日志主题ID组合，多个以逗号分隔 
     * @return TopicIds 需要查询的日志主题ID组合，多个以逗号分隔
     */
    public String getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set 需要查询的日志主题ID组合，多个以逗号分隔
     * @param TopicIds 需要查询的日志主题ID组合，多个以逗号分隔
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
     * Get 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS，时间跨度应小于10分钟 
     * @return EndTime 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS，时间跨度应小于10分钟
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS，时间跨度应小于10分钟
     * @param EndTime 需要查询的日志的结束时间，格式 YYYY-mm-dd HH:MM:SS，时间跨度应小于10分钟
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指定域名查询 
     * @return Domain 指定域名查询
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定域名查询
     * @param Domain 指定域名查询
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 指定访问的URL查询，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求 
     * @return Url 指定访问的URL查询，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 指定访问的URL查询，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
     * @param Url 指定访问的URL查询，支持URL开头和结尾使用\*表示通配
如：
/files/* 表示所有以/files/开头的请求
*.jpg 表示所有以.jpg结尾的请求
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 接入渠道，cdn或者ecdn，默认值为cdn 
     * @return Channel 接入渠道，cdn或者ecdn，默认值为cdn
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 接入渠道，cdn或者ecdn，默认值为cdn
     * @param Channel 接入渠道，cdn或者ecdn，默认值为cdn
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 要查询的Top条数，最大值为100，默认为10 
     * @return Limit 要查询的Top条数，最大值为100，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 要查询的Top条数，最大值为100，默认为10
     * @param Limit 要查询的Top条数，最大值为100，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按请求量排序， asc（升序）或者 desc（降序），默认为 desc 
     * @return Sort 按请求量排序， asc（升序）或者 desc（降序），默认为 desc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 按请求量排序， asc（升序）或者 desc（降序），默认为 desc
     * @param Sort 按请求量排序， asc（升序）或者 desc（降序），默认为 desc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public ListTopClsLogDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopClsLogDataRequest(ListTopClsLogDataRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicIds != null) {
            this.TopicIds = new String(source.TopicIds);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicIds", this.TopicIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

