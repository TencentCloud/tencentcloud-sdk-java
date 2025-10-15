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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * 任务状态过滤条件，可选值：
- WAITING（等待中）
- PROCESSING（处理中）
- FINISH（已完成）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务结束时子任务是否有失败。如果不传则忽略。
<li>false: 过滤子任务没有失败的任务；</li>
<li>true: 过滤子任务有失败的任务。</li>
    */
    @SerializedName("SubTaskHasFailed")
    @Expose
    private Boolean SubTaskHasFailed;

    /**
    * 返回记录条数，默认值：10，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 查询任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询任务结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 任务状态过滤条件，可选值：
- WAITING（等待中）
- PROCESSING（处理中）
- FINISH（已完成）。 
     * @return Status 任务状态过滤条件，可选值：
- WAITING（等待中）
- PROCESSING（处理中）
- FINISH（已完成）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态过滤条件，可选值：
- WAITING（等待中）
- PROCESSING（处理中）
- FINISH（已完成）。
     * @param Status 任务状态过滤条件，可选值：
- WAITING（等待中）
- PROCESSING（处理中）
- FINISH（已完成）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务结束时子任务是否有失败。如果不传则忽略。
<li>false: 过滤子任务没有失败的任务；</li>
<li>true: 过滤子任务有失败的任务。</li> 
     * @return SubTaskHasFailed 任务结束时子任务是否有失败。如果不传则忽略。
<li>false: 过滤子任务没有失败的任务；</li>
<li>true: 过滤子任务有失败的任务。</li>
     */
    public Boolean getSubTaskHasFailed() {
        return this.SubTaskHasFailed;
    }

    /**
     * Set 任务结束时子任务是否有失败。如果不传则忽略。
<li>false: 过滤子任务没有失败的任务；</li>
<li>true: 过滤子任务有失败的任务。</li>
     * @param SubTaskHasFailed 任务结束时子任务是否有失败。如果不传则忽略。
<li>false: 过滤子任务没有失败的任务；</li>
<li>true: 过滤子任务有失败的任务。</li>
     */
    public void setSubTaskHasFailed(Boolean SubTaskHasFailed) {
        this.SubTaskHasFailed = SubTaskHasFailed;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：100。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。 
     * @return ScrollToken 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     * @param ScrollToken 翻页标识，分批拉取时使用：当单次请求无法拉取所有数据，接口将会返回 ScrollToken，下一次请求携带该 Token，将会从下一条记录开始获取。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get 查询任务开始时间 
     * @return StartTime 查询任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询任务开始时间
     * @param StartTime 查询任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询任务结束时间。 
     * @return EndTime 查询任务结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询任务结束时间。
     * @param EndTime 查询任务结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubTaskHasFailed != null) {
            this.SubTaskHasFailed = new Boolean(source.SubTaskHasFailed);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubTaskHasFailed", this.SubTaskHasFailed);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

