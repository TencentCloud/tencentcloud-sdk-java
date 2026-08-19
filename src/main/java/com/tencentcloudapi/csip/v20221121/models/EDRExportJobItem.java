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

public class EDRExportJobItem extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>任务名</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>数据源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>导出状态</p>
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * <p>导出进度</p>
    */
    @SerializedName("ExportProgress")
    @Expose
    private Long ExportProgress;

    /**
    * <p>失败信息</p>
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * <p>超时时间</p>
    */
    @SerializedName("Timeout")
    @Expose
    private String Timeout;

    /**
    * <p>插入时间</p>
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
     * Get <p>任务ID</p> 
     * @return JobId <p>任务ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务ID</p>
     * @param JobId <p>任务ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>任务名</p> 
     * @return JobName <p>任务名</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>任务名</p>
     * @param JobName <p>任务名</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>数据源</p> 
     * @return Source <p>数据源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>数据源</p>
     * @param Source <p>数据源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>导出状态</p> 
     * @return ExportStatus <p>导出状态</p>
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set <p>导出状态</p>
     * @param ExportStatus <p>导出状态</p>
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
    }

    /**
     * Get <p>导出进度</p> 
     * @return ExportProgress <p>导出进度</p>
     */
    public Long getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set <p>导出进度</p>
     * @param ExportProgress <p>导出进度</p>
     */
    public void setExportProgress(Long ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get <p>失败信息</p> 
     * @return FailureMsg <p>失败信息</p>
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set <p>失败信息</p>
     * @param FailureMsg <p>失败信息</p>
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
    }

    /**
     * Get <p>超时时间</p> 
     * @return Timeout <p>超时时间</p>
     */
    public String getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间</p>
     * @param Timeout <p>超时时间</p>
     */
    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>插入时间</p> 
     * @return InsertTime <p>插入时间</p>
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set <p>插入时间</p>
     * @param InsertTime <p>插入时间</p>
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    public EDRExportJobItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRExportJobItem(EDRExportJobItem source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);

    }
}

