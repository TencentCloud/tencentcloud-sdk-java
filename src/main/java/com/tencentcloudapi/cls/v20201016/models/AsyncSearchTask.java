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

public class AsyncSearchTask extends AbstractModel{

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
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 状态，0表示待开始，1表示运行中，2表示已完成，-1表示失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 异步检索任务ID
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

    /**
    * 查询语句
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 要查询的日志的起始时间，Unix时间戳，单位ms
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 要查询的日志的结束时间，Unix时间戳，单位ms
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 日志扫描顺序，可选值：asc(升序)、desc(降序)
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 任务失败的错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 异步检索任务匹配的总日志条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

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
     * Get 异步检索任务ID 
     * @return AsyncSearchTaskId 异步检索任务ID
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set 异步检索任务ID
     * @param AsyncSearchTaskId 异步检索任务ID
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    /**
     * Get 查询语句 
     * @return Query 查询语句
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句
     * @param Query 查询语句
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 要查询的日志的起始时间，Unix时间戳，单位ms 
     * @return From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 要查询的日志的起始时间，Unix时间戳，单位ms
     * @param From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 要查询的日志的结束时间，Unix时间戳，单位ms 
     * @return To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 要查询的日志的结束时间，Unix时间戳，单位ms
     * @param To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get 日志扫描顺序，可选值：asc(升序)、desc(降序) 
     * @return Sort 日志扫描顺序，可选值：asc(升序)、desc(降序)
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 日志扫描顺序，可选值：asc(升序)、desc(降序)
     * @param Sort 日志扫描顺序，可选值：asc(升序)、desc(降序)
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
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
     * Get 异步检索任务匹配的总日志条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogCount 异步检索任务匹配的总日志条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set 异步检索任务匹配的总日志条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogCount 异步检索任务匹配的总日志条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AsyncSearchTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncSearchTask(AsyncSearchTask source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.LogCount != null) {
            this.LogCount = new Long(source.LogCount);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
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
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "LogCount", this.LogCount);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

