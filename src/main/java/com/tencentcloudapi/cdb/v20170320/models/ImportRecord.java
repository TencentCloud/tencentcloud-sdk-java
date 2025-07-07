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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportRecord extends AbstractModel {

    /**
    * 状态值。0 - 初始化中，1 - 运行中，2 - 运行成功，3 - 运行失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态值，为负数时任务异常。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 执行时间，单位：秒。
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 后端任务ID
    */
    @SerializedName("WorkId")
    @Expose
    private String WorkId;

    /**
    * 导入文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 执行进度，单位：百分比。
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件大小，单位：byte。
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 任务执行信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 导入库表名
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 异步任务的请求ID
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
     * Get 状态值。0 - 初始化中，1 - 运行中，2 - 运行成功，3 - 运行失败。 
     * @return Status 状态值。0 - 初始化中，1 - 运行中，2 - 运行成功，3 - 运行失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值。0 - 初始化中，1 - 运行中，2 - 运行成功，3 - 运行失败。
     * @param Status 状态值。0 - 初始化中，1 - 运行中，2 - 运行成功，3 - 运行失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态值，为负数时任务异常。 
     * @return Code 状态值，为负数时任务异常。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态值，为负数时任务异常。
     * @param Code 状态值，为负数时任务异常。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 执行时间，单位：秒。 
     * @return CostTime 执行时间，单位：秒。
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 执行时间，单位：秒。
     * @param CostTime 执行时间，单位：秒。
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 后端任务ID 
     * @return WorkId 后端任务ID
     */
    public String getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 后端任务ID
     * @param WorkId 后端任务ID
     */
    public void setWorkId(String WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 导入文件名 
     * @return FileName 导入文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 导入文件名
     * @param FileName 导入文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 执行进度，单位：百分比。 
     * @return Process 执行进度，单位：百分比。
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set 执行进度，单位：百分比。
     * @param Process 执行进度，单位：百分比。
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get 任务创建时间 
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 文件大小，单位：byte。 
     * @return FileSize 文件大小，单位：byte。
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位：byte。
     * @param FileSize 文件大小，单位：byte。
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 任务执行信息 
     * @return Message 任务执行信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 任务执行信息
     * @param Message 任务执行信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务ID 
     * @return JobId 任务ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID
     * @param JobId 任务ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 导入库表名 
     * @return DbName 导入库表名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 导入库表名
     * @param DbName 导入库表名
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 异步任务的请求ID 
     * @return AsyncRequestId 异步任务的请求ID
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务的请求ID
     * @param AsyncRequestId 异步任务的请求ID
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    public ImportRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportRecord(ImportRecord source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.WorkId != null) {
            this.WorkId = new String(source.WorkId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Process != null) {
            this.Process = new Long(source.Process);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new String(source.AsyncRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);

    }
}

