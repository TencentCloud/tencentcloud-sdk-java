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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskRecordItem extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>消耗配额</p>
    */
    @SerializedName("CostQuota")
    @Expose
    private Long CostQuota;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>任务来源</p>
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
     * Get <p>任务ID</p> 
     * @return TaskID <p>任务ID</p>
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskID <p>任务ID</p>
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务进度</p> 
     * @return Progress <p>任务进度</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>任务进度</p>
     * @param Progress <p>任务进度</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>消耗配额</p> 
     * @return CostQuota <p>消耗配额</p>
     */
    public Long getCostQuota() {
        return this.CostQuota;
    }

    /**
     * Set <p>消耗配额</p>
     * @param CostQuota <p>消耗配额</p>
     */
    public void setCostQuota(Long CostQuota) {
        this.CostQuota = CostQuota;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return EndTime <p>任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param EndTime <p>任务结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务来源</p> 
     * @return TaskSource <p>任务来源</p>
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set <p>任务来源</p>
     * @param TaskSource <p>任务来源</p>
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    public ScanTaskRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskRecordItem(ScanTaskRecordItem source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CostQuota != null) {
            this.CostQuota = new Long(source.CostQuota);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CostQuota", this.CostQuota);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);

    }
}

