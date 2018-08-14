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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportRecord  extends AbstractModel{

    /**
    * 状态值
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 状态值
    */
    @SerializedName("Code")
    @Expose
    private Integer Code;

    /**
    * 执行时间
    */
    @SerializedName("CostTime")
    @Expose
    private Integer CostTime;

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
    * 执行进度
    */
    @SerializedName("Process")
    @Expose
    private Integer Process;

    /**
    * 任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 文件大小
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
    private Integer JobId;

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
     * 获取状态值
     * @return Status 状态值
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态值
     * @param Status 状态值
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取状态值
     * @return Code 状态值
     */
    public Integer getCode() {
        return this.Code;
    }

    /**
     * 设置状态值
     * @param Code 状态值
     */
    public void setCode(Integer Code) {
        this.Code = Code;
    }

    /**
     * 获取执行时间
     * @return CostTime 执行时间
     */
    public Integer getCostTime() {
        return this.CostTime;
    }

    /**
     * 设置执行时间
     * @param CostTime 执行时间
     */
    public void setCostTime(Integer CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取后端任务ID
     * @return WorkId 后端任务ID
     */
    public String getWorkId() {
        return this.WorkId;
    }

    /**
     * 设置后端任务ID
     * @param WorkId 后端任务ID
     */
    public void setWorkId(String WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * 获取导入文件名
     * @return FileName 导入文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置导入文件名
     * @param FileName 导入文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取执行进度
     * @return Process 执行进度
     */
    public Integer getProcess() {
        return this.Process;
    }

    /**
     * 设置执行进度
     * @param Process 执行进度
     */
    public void setProcess(Integer Process) {
        this.Process = Process;
    }

    /**
     * 获取任务创建时间
     * @return CreateTime 任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置任务创建时间
     * @param CreateTime 任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取文件大小
     * @return FileSize 文件大小
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * 设置文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * 获取任务执行信息
     * @return Message 任务执行信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置任务执行信息
     * @param Message 任务执行信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取任务ID
     * @return JobId 任务ID
     */
    public Integer getJobId() {
        return this.JobId;
    }

    /**
     * 设置任务ID
     * @param JobId 任务ID
     */
    public void setJobId(Integer JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取导入库表名
     * @return DbName 导入库表名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * 设置导入库表名
     * @param DbName 导入库表名
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * 获取异步任务的请求ID
     * @return AsyncRequestId 异步任务的请求ID
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * 设置异步任务的请求ID
     * @param AsyncRequestId 异步任务的请求ID
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * 内部实现，用户禁止调用
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

