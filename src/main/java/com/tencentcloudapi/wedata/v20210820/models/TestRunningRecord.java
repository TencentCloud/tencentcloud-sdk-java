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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestRunningRecord extends AbstractModel {

    /**
    * <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * <p>执行平台jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionJobId")
    @Expose
    private String ExecutionJobId;

    /**
    * <p>试运行记录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordName")
    @Expose
    private String RecordName;

    /**
    * <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeCost")
    @Expose
    private Long TimeCost;

    /**
    * <p>用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * <p>主账户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>子记录信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubRecordList")
    @Expose
    private TestRunningSubRecord [] SubRecordList;

    /**
    * <p>结果或日志地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>结果或日志桶名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContentTruncated")
    @Expose
    private Boolean ScriptContentTruncated;

    /**
     * Get <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId <p>试运行记录id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId <p>开发侧提交的jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>执行平台jobid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionJobId <p>执行平台jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionJobId() {
        return this.ExecutionJobId;
    }

    /**
     * Set <p>执行平台jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionJobId <p>执行平台jobid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionJobId(String ExecutionJobId) {
        this.ExecutionJobId = ExecutionJobId;
    }

    /**
     * Get <p>试运行记录名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordName <p>试运行记录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordName() {
        return this.RecordName;
    }

    /**
     * Set <p>试运行记录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordName <p>试运行记录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordName(String RecordName) {
        this.RecordName = RecordName;
    }

    /**
     * Get <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent <p>脚本内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeCost <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeCost() {
        return this.TimeCost;
    }

    /**
     * Set <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeCost <p>耗时</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeCost(Long TimeCost) {
        this.TimeCost = TimeCost;
    }

    /**
     * Get <p>用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin <p>用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set <p>用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin <p>用户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get <p>主账户uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin <p>主账户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>主账户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin <p>主账户uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>子记录信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubRecordList <p>子记录信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TestRunningSubRecord [] getSubRecordList() {
        return this.SubRecordList;
    }

    /**
     * Set <p>子记录信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubRecordList <p>子记录信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubRecordList(TestRunningSubRecord [] SubRecordList) {
        this.SubRecordList = SubRecordList;
    }

    /**
     * Get <p>结果或日志地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>结果或日志地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>结果或日志地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>结果或日志地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>结果或日志桶名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketName <p>结果或日志桶名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>结果或日志桶名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketName <p>结果或日志桶名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContentTruncated <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getScriptContentTruncated() {
        return this.ScriptContentTruncated;
    }

    /**
     * Set <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContentTruncated <p>脚本内容是否被截断</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContentTruncated(Boolean ScriptContentTruncated) {
        this.ScriptContentTruncated = ScriptContentTruncated;
    }

    public TestRunningRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestRunningRecord(TestRunningRecord source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.ExecutionJobId != null) {
            this.ExecutionJobId = new String(source.ExecutionJobId);
        }
        if (source.RecordName != null) {
            this.RecordName = new String(source.RecordName);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TimeCost != null) {
            this.TimeCost = new Long(source.TimeCost);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.SubRecordList != null) {
            this.SubRecordList = new TestRunningSubRecord[source.SubRecordList.length];
            for (int i = 0; i < source.SubRecordList.length; i++) {
                this.SubRecordList[i] = new TestRunningSubRecord(source.SubRecordList[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ScriptContentTruncated != null) {
            this.ScriptContentTruncated = new Boolean(source.ScriptContentTruncated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ExecutionJobId", this.ExecutionJobId);
        this.setParamSimple(map, prefix + "RecordName", this.RecordName);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TimeCost", this.TimeCost);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "SubRecordList.", this.SubRecordList);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ScriptContentTruncated", this.ScriptContentTruncated);

    }
}

