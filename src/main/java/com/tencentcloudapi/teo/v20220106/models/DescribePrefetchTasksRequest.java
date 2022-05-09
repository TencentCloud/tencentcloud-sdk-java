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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrefetchTasksRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

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
    * 查询起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询最大返回的结果条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询的状态
允许的值为：processing、success、failed、timeout、invalid
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * zone id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 查询的域名列表
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 查询的资源
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
     * Get 任务ID 
     * @return JobId 任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID
     * @param JobId 任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
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
     * Get 查询起始偏移量 
     * @return Offset 查询起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始偏移量
     * @param Offset 查询起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询最大返回的结果条数 
     * @return Limit 查询最大返回的结果条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询最大返回的结果条数
     * @param Limit 查询最大返回的结果条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询的状态
允许的值为：processing、success、failed、timeout、invalid 
     * @return Statuses 查询的状态
允许的值为：processing、success、failed、timeout、invalid
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 查询的状态
允许的值为：processing、success、failed、timeout、invalid
     * @param Statuses 查询的状态
允许的值为：processing、success、failed、timeout、invalid
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get zone id 
     * @return ZoneId zone id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set zone id
     * @param ZoneId zone id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 查询的域名列表 
     * @return Domains 查询的域名列表
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 查询的域名列表
     * @param Domains 查询的域名列表
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 查询的资源 
     * @return Target 查询的资源
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 查询的资源
     * @param Target 查询的资源
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    public DescribePrefetchTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrefetchTasksRequest(DescribePrefetchTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Target", this.Target);

    }
}

