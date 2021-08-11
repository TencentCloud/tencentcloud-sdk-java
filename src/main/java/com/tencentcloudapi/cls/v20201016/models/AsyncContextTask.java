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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncContextTask extends AbstractModel{

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 创建时间，时间戳，精确到毫秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 状态，0表示待开始，1表示运行中，2表示已完成，-1表示失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 异步上下文任务ID
    */
    @SerializedName("AsyncContextTaskId")
    @Expose
    private String AsyncContextTaskId;

    /**
    * 任务失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 日志包序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 日志包内一条日志的序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * 日志时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 任务完成时间，时间戳，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private Long FinishTime;

    /**
    * 相关联的异步检索ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 创建时间，时间戳，精确到毫秒 
     * @return CreateTime 创建时间，时间戳，精确到毫秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，时间戳，精确到毫秒
     * @param CreateTime 创建时间，时间戳，精确到毫秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 状态，0表示待开始，1表示运行中，2表示已完成，-1表示失败 
     * @return Status 状态，0表示待开始，1表示运行中，2表示已完成，-1表示失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0表示待开始，1表示运行中，2表示已完成，-1表示失败
     * @param Status 状态，0表示待开始，1表示运行中，2表示已完成，-1表示失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 异步上下文任务ID 
     * @return AsyncContextTaskId 异步上下文任务ID
     */
    public String getAsyncContextTaskId() {
        return this.AsyncContextTaskId;
    }

    /**
     * Set 异步上下文任务ID
     * @param AsyncContextTaskId 异步上下文任务ID
     */
    public void setAsyncContextTaskId(String AsyncContextTaskId) {
        this.AsyncContextTaskId = AsyncContextTaskId;
    }

    /**
     * Get 任务失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 任务失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 任务失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 日志包序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgId 日志包序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志包序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgId 日志包序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 日志包内一条日志的序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgLogId 日志包内一条日志的序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志包内一条日志的序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgLogId 日志包内一条日志的序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 日志时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 日志时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 日志时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 任务完成时间，时间戳，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 任务完成时间，时间戳，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务完成时间，时间戳，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 任务完成时间，时间戳，精确到毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(Long FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 相关联的异步检索ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsyncSearchTaskId 相关联的异步检索ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set 相关联的异步检索ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsyncSearchTaskId 相关联的异步检索ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    public AsyncContextTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncContextTask(AsyncContextTask source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AsyncContextTaskId != null) {
            this.AsyncContextTaskId = new String(source.AsyncContextTaskId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Long(source.FinishTime);
        }
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AsyncContextTaskId", this.AsyncContextTaskId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);

    }
}

