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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HiveQuery extends AbstractModel{

    /**
    * 查询语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * 执行时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 开始时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * appId列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * 执行引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEngine")
    @Expose
    private String ExecutionEngine;

    /**
    * 查询ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 查询语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Statement 查询语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set 查询语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param Statement 查询语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get 执行时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 执行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 开始时间毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get appId列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobIds appId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set appId列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobIds appId列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get 执行引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEngine 执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEngine() {
        return this.ExecutionEngine;
    }

    /**
     * Set 执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEngine 执行引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEngine(String ExecutionEngine) {
        this.ExecutionEngine = ExecutionEngine;
    }

    /**
     * Get 查询ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public HiveQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiveQuery(HiveQuery source) {
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.ExecutionEngine != null) {
            this.ExecutionEngine = new String(source.ExecutionEngine);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "ExecutionEngine", this.ExecutionEngine);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

