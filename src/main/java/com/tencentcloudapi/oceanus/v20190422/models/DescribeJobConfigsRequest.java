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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobConfigsRequest extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业配置版本
    */
    @SerializedName("JobConfigVersions")
    @Expose
    private Long [] JobConfigVersions;

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * true 表示只展示草稿
    */
    @SerializedName("OnlyDraft")
    @Expose
    private Boolean OnlyDraft;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业配置版本 
     * @return JobConfigVersions 作业配置版本
     */
    public Long [] getJobConfigVersions() {
        return this.JobConfigVersions;
    }

    /**
     * Set 作业配置版本
     * @param JobConfigVersions 作业配置版本
     */
    public void setJobConfigVersions(Long [] JobConfigVersions) {
        this.JobConfigVersions = JobConfigVersions;
    }

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认20，最大100 
     * @return Limit 分页大小，默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认20，最大100
     * @param Limit 分页大小，默认20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get true 表示只展示草稿 
     * @return OnlyDraft true 表示只展示草稿
     */
    public Boolean getOnlyDraft() {
        return this.OnlyDraft;
    }

    /**
     * Set true 表示只展示草稿
     * @param OnlyDraft true 表示只展示草稿
     */
    public void setOnlyDraft(Boolean OnlyDraft) {
        this.OnlyDraft = OnlyDraft;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "JobConfigVersions.", this.JobConfigVersions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OnlyDraft", this.OnlyDraft);

    }
}

