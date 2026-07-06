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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OfflineExportTask extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 日志总数
    */
    @SerializedName("DataLength")
    @Expose
    private Long DataLength;

    /**
    * 任务状态，0等待下载，1下载中，2下载完成，3下载失败，4文件过期
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 文件过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 下载进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 导出失败信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 是否使用Cos
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseUserCos")
    @Expose
    private Long UseUserCos;

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
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 日志总数 
     * @return DataLength 日志总数
     */
    public Long getDataLength() {
        return this.DataLength;
    }

    /**
     * Set 日志总数
     * @param DataLength 日志总数
     */
    public void setDataLength(Long DataLength) {
        this.DataLength = DataLength;
    }

    /**
     * Get 任务状态，0等待下载，1下载中，2下载完成，3下载失败，4文件过期 
     * @return Status 任务状态，0等待下载，1下载中，2下载完成，3下载失败，4文件过期
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，0等待下载，1下载中，2下载完成，3下载失败，4文件过期
     * @param Status 任务状态，0等待下载，1下载中，2下载完成，3下载失败，4文件过期
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 文件过期时间 
     * @return ExpireTime 文件过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 文件过期时间
     * @param ExpireTime 文件过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 下载进度 
     * @return Progress 下载进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 下载进度
     * @param Progress 下载进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 导出失败信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorInfo 导出失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 导出失败信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorInfo 导出失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 是否使用Cos
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseUserCos 是否使用Cos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseUserCos() {
        return this.UseUserCos;
    }

    /**
     * Set 是否使用Cos
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseUserCos 是否使用Cos
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseUserCos(Long UseUserCos) {
        this.UseUserCos = UseUserCos;
    }

    public OfflineExportTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineExportTask(OfflineExportTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DataLength != null) {
            this.DataLength = new Long(source.DataLength);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.UseUserCos != null) {
            this.UseUserCos = new Long(source.UseUserCos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DataLength", this.DataLength);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "UseUserCos", this.UseUserCos);

    }
}

