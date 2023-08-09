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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulerRunTimeInstanceCntByStatusRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 周期类型
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 时间单元 eg: 12h
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 开始日期：2023-03-02
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日前：2023-03-20
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 1
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 1
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 周期类型 
     * @return CycleUnit 周期类型
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期类型
     * @param CycleUnit 周期类型
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 时间单元 eg: 12h 
     * @return TimeUnit 时间单元 eg: 12h
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单元 eg: 12h
     * @param TimeUnit 时间单元 eg: 12h
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 开始日期：2023-03-02 
     * @return StartTime 开始日期：2023-03-02
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始日期：2023-03-02
     * @param StartTime 开始日期：2023-03-02
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日前：2023-03-20 
     * @return EndTime 结束日前：2023-03-20
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日前：2023-03-20
     * @param EndTime 结束日前：2023-03-20
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 1 
     * @return TaskType 1
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 1
     * @param TaskType 1
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 1 
     * @return InCharge 1
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 1
     * @param InCharge 1
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    public DescribeSchedulerRunTimeInstanceCntByStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulerRunTimeInstanceCntByStatusRequest(DescribeSchedulerRunTimeInstanceCntByStatusRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);

    }
}

