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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportJobInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
    * 任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 导出状态
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * 导出进度
    */
    @SerializedName("ExportProgress")
    @Expose
    private Long ExportProgress;

    /**
    * 失败原因
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * 超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * 插入时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get 任务ID 
     * @return JobID 任务ID
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set 任务ID
     * @param JobID 任务ID
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    /**
     * Get 任务名称 
     * @return JobName 任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 任务名称
     * @param JobName 任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 导出状态 
     * @return ExportStatus 导出状态
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set 导出状态
     * @param ExportStatus 导出状态
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
    }

    /**
     * Get 导出进度 
     * @return ExportProgress 导出进度
     */
    public Long getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set 导出进度
     * @param ExportProgress 导出进度
     */
    public void setExportProgress(Long ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get 失败原因 
     * @return FailureMsg 失败原因
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set 失败原因
     * @param FailureMsg 失败原因
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
    }

    /**
     * Get 超时时间 
     * @return Timeout 超时时间
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间
     * @param Timeout 超时时间
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 插入时间 
     * @return InsertTime 插入时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
     * @param InsertTime 插入时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public ExportJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportJobInfo(ExportJobInfo source) {
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ExportStatus != null) {
            this.ExportStatus = new String(source.ExportStatus);
        }
        if (source.ExportProgress != null) {
            this.ExportProgress = new Long(source.ExportProgress);
        }
        if (source.FailureMsg != null) {
            this.FailureMsg = new String(source.FailureMsg);
        }
        if (source.Timeout != null) {
            this.Timeout = new String(source.Timeout);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobID", this.JobID);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

