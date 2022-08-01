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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobsRequest extends AbstractModel{

    /**
    * 场景ID数组
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
    * 项目ID数组
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 分页起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页最大数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 任务ID数组
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * 按字段排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 升序/降序
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * 任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 调试任务标记
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
    * 任务的状态
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get 场景ID数组 
     * @return ScenarioIds 场景ID数组
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set 场景ID数组
     * @param ScenarioIds 场景ID数组
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    /**
     * Get 项目ID数组 
     * @return ProjectIds 项目ID数组
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID数组
     * @param ProjectIds 项目ID数组
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 分页起始位置 
     * @return Offset 分页起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始位置
     * @param Offset 分页起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页最大数目 
     * @return Limit 每页最大数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页最大数目
     * @param Limit 每页最大数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 任务ID数组 
     * @return JobIds 任务ID数组
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set 任务ID数组
     * @param JobIds 任务ID数组
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get 按字段排序 
     * @return OrderBy 按字段排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 按字段排序
     * @param OrderBy 按字段排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 升序/降序 
     * @return Ascend 升序/降序
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set 升序/降序
     * @param Ascend 升序/降序
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get 任务开始时间 
     * @return StartTime 任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
     * @param StartTime 任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 调试任务标记 
     * @return Debug 调试任务标记
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * Set 调试任务标记
     * @param Debug 调试任务标记
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * Get 任务的状态 
     * @return Status 任务的状态
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的状态
     * @param Status 任务的状态
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public DescribeJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobsRequest(DescribeJobsRequest source) {
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Debug != null) {
            this.Debug = new Boolean(source.Debug);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Debug", this.Debug);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

