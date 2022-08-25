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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GCJobInfo extends AbstractModel{

    /**
    * 作业 ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 作业状态
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 调度信息
    */
    @SerializedName("Schedule")
    @Expose
    private Schedule Schedule;

    /**
     * Get 作业 ID 
     * @return ID 作业 ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 作业 ID
     * @param ID 作业 ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 作业状态 
     * @return JobStatus 作业状态
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 作业状态
     * @param JobStatus 作业状态
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 调度信息 
     * @return Schedule 调度信息
     */
    public Schedule getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 调度信息
     * @param Schedule 调度信息
     */
    public void setSchedule(Schedule Schedule) {
        this.Schedule = Schedule;
    }

    public GCJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GCJobInfo(GCJobInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Schedule != null) {
            this.Schedule = new Schedule(source.Schedule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);

    }
}

