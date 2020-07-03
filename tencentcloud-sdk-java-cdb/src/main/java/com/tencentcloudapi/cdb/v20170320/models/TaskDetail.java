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

public class TaskDetail extends AbstractModel{

    /**
    * 错误码。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 实例任务 ID。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 实例任务进度。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 实例任务状态，可能的值包括：
"UNDEFINED" - 未定义；
"INITIAL" - 初始化；
"RUNNING" - 运行中；
"SUCCEED" - 执行成功；
"FAILED" - 执行失败；
"KILLED" - 已终止；
"REMOVED" - 已删除；
"PAUSED" - 已暂停。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 实例任务类型，可能的值包括：
"ROLLBACK" - 数据库回档；
"SQL OPERATION" - SQL操作；
"IMPORT DATA" - 数据导入；
"MODIFY PARAM" - 参数设置；
"INITIAL" - 初始化云数据库实例；
"REBOOT" - 重启云数据库实例；
"OPEN GTID" - 开启云数据库实例GTID；
"UPGRADE RO" - 只读实例升级；
"BATCH ROLLBACK" - 数据库批量回档；
"UPGRADE MASTER" - 主实例升级；
"DROP TABLES" - 删除云数据库库表；
"SWITCH DR TO MASTER" - 灾备实例提升为主。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 实例任务开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例任务结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务关联的实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 异步任务的请求 ID。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;

    /**
     * Get 错误码。 
     * @return Code 错误码。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码。
     * @param Code 错误码。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 错误信息。 
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 实例任务 ID。 
     * @return JobId 实例任务 ID。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 实例任务 ID。
     * @param JobId 实例任务 ID。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 实例任务进度。 
     * @return Progress 实例任务进度。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 实例任务进度。
     * @param Progress 实例任务进度。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 实例任务状态，可能的值包括：
"UNDEFINED" - 未定义；
"INITIAL" - 初始化；
"RUNNING" - 运行中；
"SUCCEED" - 执行成功；
"FAILED" - 执行失败；
"KILLED" - 已终止；
"REMOVED" - 已删除；
"PAUSED" - 已暂停。 
     * @return TaskStatus 实例任务状态，可能的值包括：
"UNDEFINED" - 未定义；
"INITIAL" - 初始化；
"RUNNING" - 运行中；
"SUCCEED" - 执行成功；
"FAILED" - 执行失败；
"KILLED" - 已终止；
"REMOVED" - 已删除；
"PAUSED" - 已暂停。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 实例任务状态，可能的值包括：
"UNDEFINED" - 未定义；
"INITIAL" - 初始化；
"RUNNING" - 运行中；
"SUCCEED" - 执行成功；
"FAILED" - 执行失败；
"KILLED" - 已终止；
"REMOVED" - 已删除；
"PAUSED" - 已暂停。
     * @param TaskStatus 实例任务状态，可能的值包括：
"UNDEFINED" - 未定义；
"INITIAL" - 初始化；
"RUNNING" - 运行中；
"SUCCEED" - 执行成功；
"FAILED" - 执行失败；
"KILLED" - 已终止；
"REMOVED" - 已删除；
"PAUSED" - 已暂停。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 实例任务类型，可能的值包括：
"ROLLBACK" - 数据库回档；
"SQL OPERATION" - SQL操作；
"IMPORT DATA" - 数据导入；
"MODIFY PARAM" - 参数设置；
"INITIAL" - 初始化云数据库实例；
"REBOOT" - 重启云数据库实例；
"OPEN GTID" - 开启云数据库实例GTID；
"UPGRADE RO" - 只读实例升级；
"BATCH ROLLBACK" - 数据库批量回档；
"UPGRADE MASTER" - 主实例升级；
"DROP TABLES" - 删除云数据库库表；
"SWITCH DR TO MASTER" - 灾备实例提升为主。 
     * @return TaskType 实例任务类型，可能的值包括：
"ROLLBACK" - 数据库回档；
"SQL OPERATION" - SQL操作；
"IMPORT DATA" - 数据导入；
"MODIFY PARAM" - 参数设置；
"INITIAL" - 初始化云数据库实例；
"REBOOT" - 重启云数据库实例；
"OPEN GTID" - 开启云数据库实例GTID；
"UPGRADE RO" - 只读实例升级；
"BATCH ROLLBACK" - 数据库批量回档；
"UPGRADE MASTER" - 主实例升级；
"DROP TABLES" - 删除云数据库库表；
"SWITCH DR TO MASTER" - 灾备实例提升为主。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 实例任务类型，可能的值包括：
"ROLLBACK" - 数据库回档；
"SQL OPERATION" - SQL操作；
"IMPORT DATA" - 数据导入；
"MODIFY PARAM" - 参数设置；
"INITIAL" - 初始化云数据库实例；
"REBOOT" - 重启云数据库实例；
"OPEN GTID" - 开启云数据库实例GTID；
"UPGRADE RO" - 只读实例升级；
"BATCH ROLLBACK" - 数据库批量回档；
"UPGRADE MASTER" - 主实例升级；
"DROP TABLES" - 删除云数据库库表；
"SWITCH DR TO MASTER" - 灾备实例提升为主。
     * @param TaskType 实例任务类型，可能的值包括：
"ROLLBACK" - 数据库回档；
"SQL OPERATION" - SQL操作；
"IMPORT DATA" - 数据导入；
"MODIFY PARAM" - 参数设置；
"INITIAL" - 初始化云数据库实例；
"REBOOT" - 重启云数据库实例；
"OPEN GTID" - 开启云数据库实例GTID；
"UPGRADE RO" - 只读实例升级；
"BATCH ROLLBACK" - 数据库批量回档；
"UPGRADE MASTER" - 主实例升级；
"DROP TABLES" - 删除云数据库库表；
"SWITCH DR TO MASTER" - 灾备实例提升为主。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 实例任务开始时间。 
     * @return StartTime 实例任务开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 实例任务开始时间。
     * @param StartTime 实例任务开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例任务结束时间。 
     * @return EndTime 实例任务结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 实例任务结束时间。
     * @param EndTime 实例任务结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务关联的实例 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIds 任务关联的实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 任务关联的实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIds 任务关联的实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 异步任务的请求 ID。 
     * @return AsyncRequestId 异步任务的请求 ID。
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务的请求 ID。
     * @param AsyncRequestId 异步任务的请求 ID。
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);

    }
}

