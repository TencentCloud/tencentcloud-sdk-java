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

public class TaskReportDetail extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例数据运行时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 实例实际下发时间
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 任务状态码。1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行。
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * 总读取条数
    */
    @SerializedName("TotalReadRecords")
    @Expose
    private Long TotalReadRecords;

    /**
    * 总读取字节数
    */
    @SerializedName("TotalReadBytes")
    @Expose
    private Long TotalReadBytes;

    /**
    * 总写入条数
    */
    @SerializedName("TotalWriteRecords")
    @Expose
    private Long TotalWriteRecords;

    /**
    * 总写入字节数
    */
    @SerializedName("TotalWriteBytes")
    @Expose
    private Long TotalWriteBytes;

    /**
    * 写入速度（条/秒）
    */
    @SerializedName("RecordSpeed")
    @Expose
    private Long RecordSpeed;

    /**
    * 吞吐（Byte/秒）
    */
    @SerializedName("ByteSpeed")
    @Expose
    private Float ByteSpeed;

    /**
    * 脏数据条数
    */
    @SerializedName("TotalErrorRecords")
    @Expose
    private Long TotalErrorRecords;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务实例ID 
     * @return InstanceId 任务实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 任务实例ID
     * @param InstanceId 任务实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例数据运行时间 
     * @return CurRunDate 实例数据运行时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 实例数据运行时间
     * @param CurRunDate 实例数据运行时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 实例实际下发时间 
     * @return IssueDate 实例实际下发时间
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 实例实际下发时间
     * @param IssueDate 实例实际下发时间
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 任务状态码。1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行。 
     * @return TaskState 任务状态码。1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行。
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set 任务状态码。1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行。
     * @param TaskState 任务状态码。1 正在执行,2 成功,3 失败,4 等待终止,5 正在终止,6 已终止,7 终止失败,9 等待执行。
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get 总读取条数 
     * @return TotalReadRecords 总读取条数
     */
    public Long getTotalReadRecords() {
        return this.TotalReadRecords;
    }

    /**
     * Set 总读取条数
     * @param TotalReadRecords 总读取条数
     */
    public void setTotalReadRecords(Long TotalReadRecords) {
        this.TotalReadRecords = TotalReadRecords;
    }

    /**
     * Get 总读取字节数 
     * @return TotalReadBytes 总读取字节数
     */
    public Long getTotalReadBytes() {
        return this.TotalReadBytes;
    }

    /**
     * Set 总读取字节数
     * @param TotalReadBytes 总读取字节数
     */
    public void setTotalReadBytes(Long TotalReadBytes) {
        this.TotalReadBytes = TotalReadBytes;
    }

    /**
     * Get 总写入条数 
     * @return TotalWriteRecords 总写入条数
     */
    public Long getTotalWriteRecords() {
        return this.TotalWriteRecords;
    }

    /**
     * Set 总写入条数
     * @param TotalWriteRecords 总写入条数
     */
    public void setTotalWriteRecords(Long TotalWriteRecords) {
        this.TotalWriteRecords = TotalWriteRecords;
    }

    /**
     * Get 总写入字节数 
     * @return TotalWriteBytes 总写入字节数
     */
    public Long getTotalWriteBytes() {
        return this.TotalWriteBytes;
    }

    /**
     * Set 总写入字节数
     * @param TotalWriteBytes 总写入字节数
     */
    public void setTotalWriteBytes(Long TotalWriteBytes) {
        this.TotalWriteBytes = TotalWriteBytes;
    }

    /**
     * Get 写入速度（条/秒） 
     * @return RecordSpeed 写入速度（条/秒）
     */
    public Long getRecordSpeed() {
        return this.RecordSpeed;
    }

    /**
     * Set 写入速度（条/秒）
     * @param RecordSpeed 写入速度（条/秒）
     */
    public void setRecordSpeed(Long RecordSpeed) {
        this.RecordSpeed = RecordSpeed;
    }

    /**
     * Get 吞吐（Byte/秒） 
     * @return ByteSpeed 吞吐（Byte/秒）
     */
    public Float getByteSpeed() {
        return this.ByteSpeed;
    }

    /**
     * Set 吞吐（Byte/秒）
     * @param ByteSpeed 吞吐（Byte/秒）
     */
    public void setByteSpeed(Float ByteSpeed) {
        this.ByteSpeed = ByteSpeed;
    }

    /**
     * Get 脏数据条数 
     * @return TotalErrorRecords 脏数据条数
     */
    public Long getTotalErrorRecords() {
        return this.TotalErrorRecords;
    }

    /**
     * Set 脏数据条数
     * @param TotalErrorRecords 脏数据条数
     */
    public void setTotalErrorRecords(Long TotalErrorRecords) {
        this.TotalErrorRecords = TotalErrorRecords;
    }

    public TaskReportDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskReportDetail(TaskReportDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.TaskState != null) {
            this.TaskState = new String(source.TaskState);
        }
        if (source.TotalReadRecords != null) {
            this.TotalReadRecords = new Long(source.TotalReadRecords);
        }
        if (source.TotalReadBytes != null) {
            this.TotalReadBytes = new Long(source.TotalReadBytes);
        }
        if (source.TotalWriteRecords != null) {
            this.TotalWriteRecords = new Long(source.TotalWriteRecords);
        }
        if (source.TotalWriteBytes != null) {
            this.TotalWriteBytes = new Long(source.TotalWriteBytes);
        }
        if (source.RecordSpeed != null) {
            this.RecordSpeed = new Long(source.RecordSpeed);
        }
        if (source.ByteSpeed != null) {
            this.ByteSpeed = new Float(source.ByteSpeed);
        }
        if (source.TotalErrorRecords != null) {
            this.TotalErrorRecords = new Long(source.TotalErrorRecords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "TotalReadRecords", this.TotalReadRecords);
        this.setParamSimple(map, prefix + "TotalReadBytes", this.TotalReadBytes);
        this.setParamSimple(map, prefix + "TotalWriteRecords", this.TotalWriteRecords);
        this.setParamSimple(map, prefix + "TotalWriteBytes", this.TotalWriteBytes);
        this.setParamSimple(map, prefix + "RecordSpeed", this.RecordSpeed);
        this.setParamSimple(map, prefix + "ByteSpeed", this.ByteSpeed);
        this.setParamSimple(map, prefix + "TotalErrorRecords", this.TotalErrorRecords);

    }
}

