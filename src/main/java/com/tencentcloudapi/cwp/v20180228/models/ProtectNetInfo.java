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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectNetInfo extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 护网天数
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * 护网状态 0未启动，1护网中，2已完成
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 护网启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 护网完成时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 报告下载地址
    */
    @SerializedName("ReportPath")
    @Expose
    private String ReportPath;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 护网天数 
     * @return ProtectDays 护网天数
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set 护网天数
     * @param ProtectDays 护网天数
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get 护网状态 0未启动，1护网中，2已完成 
     * @return Status 护网状态 0未启动，1护网中，2已完成
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 护网状态 0未启动，1护网中，2已完成
     * @param Status 护网状态 0未启动，1护网中，2已完成
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 护网启动时间 
     * @return StartTime 护网启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 护网启动时间
     * @param StartTime 护网启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 护网完成时间 
     * @return EndTime 护网完成时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 护网完成时间
     * @param EndTime 护网完成时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 报告下载地址 
     * @return ReportPath 报告下载地址
     */
    public String getReportPath() {
        return this.ReportPath;
    }

    /**
     * Set 报告下载地址
     * @param ReportPath 报告下载地址
     */
    public void setReportPath(String ReportPath) {
        this.ReportPath = ReportPath;
    }

    public ProtectNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectNetInfo(ProtectNetInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ReportPath != null) {
            this.ReportPath = new String(source.ReportPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);

    }
}

