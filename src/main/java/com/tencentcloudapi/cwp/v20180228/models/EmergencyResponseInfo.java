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

public class EmergencyResponseInfo extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主机个数
    */
    @SerializedName("HostNum")
    @Expose
    private Long HostNum;

    /**
    * 服务状态 0未启动，·响应中，2响应完成
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 服务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 服务结束时间
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
     * Get 主机个数 
     * @return HostNum 主机个数
     */
    public Long getHostNum() {
        return this.HostNum;
    }

    /**
     * Set 主机个数
     * @param HostNum 主机个数
     */
    public void setHostNum(Long HostNum) {
        this.HostNum = HostNum;
    }

    /**
     * Get 服务状态 0未启动，·响应中，2响应完成 
     * @return Status 服务状态 0未启动，·响应中，2响应完成
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态 0未启动，·响应中，2响应完成
     * @param Status 服务状态 0未启动，·响应中，2响应完成
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 服务开始时间 
     * @return StartTime 服务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 服务开始时间
     * @param StartTime 服务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 服务结束时间 
     * @return EndTime 服务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 服务结束时间
     * @param EndTime 服务结束时间
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

    public EmergencyResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmergencyResponseInfo(EmergencyResponseInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.HostNum != null) {
            this.HostNum = new Long(source.HostNum);
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
        this.setParamSimple(map, prefix + "HostNum", this.HostNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ReportPath", this.ReportPath);

    }
}

