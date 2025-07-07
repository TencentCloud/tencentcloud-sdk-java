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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostAttackDownloadTaskRequest extends AbstractModel {

    /**
    * 查询的域名，所有域名使用all
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 查询起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Lucene语法
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 默认为desc，可以取值desc和asc
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 下载的日志条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 查询的域名，所有域名使用all 
     * @return Domain 查询的域名，所有域名使用all
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 查询的域名，所有域名使用all
     * @param Domain 查询的域名，所有域名使用all
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 查询起始时间 
     * @return StartTime 查询起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间
     * @param StartTime 查询起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Lucene语法 
     * @return QueryString Lucene语法
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Lucene语法
     * @param QueryString Lucene语法
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 默认为desc，可以取值desc和asc 
     * @return Sort 默认为desc，可以取值desc和asc
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 默认为desc，可以取值desc和asc
     * @param Sort 默认为desc，可以取值desc和asc
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 下载的日志条数 
     * @return Count 下载的日志条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 下载的日志条数
     * @param Count 下载的日志条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public PostAttackDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostAttackDownloadTaskRequest(PostAttackDownloadTaskRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

