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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operation extends AbstractModel {

    /**
    * <p>操作唯一id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>操作开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>操作详情</p>
    */
    @SerializedName("Detail")
    @Expose
    private OperationDetail Detail;

    /**
    * <p>操作结果</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>流程任务信息</p>
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDetail [] Tasks;

    /**
    * <p>操作进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>回滚标记， 0未回滚 ，1回滚中，2已回滚</p>
    */
    @SerializedName("RollbackTag")
    @Expose
    private Long RollbackTag;

    /**
    * <p>操作者Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>自动扩容标识：0-非自动，1-自动</p>
    */
    @SerializedName("AutoScaleTag")
    @Expose
    private Long AutoScaleTag;

    /**
    * <p>流程异常原因</p>
    */
    @SerializedName("SuspendedReason")
    @Expose
    private String SuspendedReason;

    /**
     * Get <p>操作唯一id</p> 
     * @return Id <p>操作唯一id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>操作唯一id</p>
     * @param Id <p>操作唯一id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>操作开始时间</p> 
     * @return StartTime <p>操作开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>操作开始时间</p>
     * @param StartTime <p>操作开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>操作类型</p> 
     * @return Type <p>操作类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>操作类型</p>
     * @param Type <p>操作类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>操作详情</p> 
     * @return Detail <p>操作详情</p>
     */
    public OperationDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>操作详情</p>
     * @param Detail <p>操作详情</p>
     */
    public void setDetail(OperationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>操作结果</p> 
     * @return Result <p>操作结果</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>操作结果</p>
     * @param Result <p>操作结果</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>流程任务信息</p> 
     * @return Tasks <p>流程任务信息</p>
     */
    public TaskDetail [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>流程任务信息</p>
     * @param Tasks <p>流程任务信息</p>
     */
    public void setTasks(TaskDetail [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>操作进度</p> 
     * @return Progress <p>操作进度</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>操作进度</p>
     * @param Progress <p>操作进度</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>回滚标记， 0未回滚 ，1回滚中，2已回滚</p> 
     * @return RollbackTag <p>回滚标记， 0未回滚 ，1回滚中，2已回滚</p>
     */
    public Long getRollbackTag() {
        return this.RollbackTag;
    }

    /**
     * Set <p>回滚标记， 0未回滚 ，1回滚中，2已回滚</p>
     * @param RollbackTag <p>回滚标记， 0未回滚 ，1回滚中，2已回滚</p>
     */
    public void setRollbackTag(Long RollbackTag) {
        this.RollbackTag = RollbackTag;
    }

    /**
     * Get <p>操作者Uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin <p>操作者Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>操作者Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin <p>操作者Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>自动扩容标识：0-非自动，1-自动</p> 
     * @return AutoScaleTag <p>自动扩容标识：0-非自动，1-自动</p>
     */
    public Long getAutoScaleTag() {
        return this.AutoScaleTag;
    }

    /**
     * Set <p>自动扩容标识：0-非自动，1-自动</p>
     * @param AutoScaleTag <p>自动扩容标识：0-非自动，1-自动</p>
     */
    public void setAutoScaleTag(Long AutoScaleTag) {
        this.AutoScaleTag = AutoScaleTag;
    }

    /**
     * Get <p>流程异常原因</p> 
     * @return SuspendedReason <p>流程异常原因</p>
     */
    public String getSuspendedReason() {
        return this.SuspendedReason;
    }

    /**
     * Set <p>流程异常原因</p>
     * @param SuspendedReason <p>流程异常原因</p>
     */
    public void setSuspendedReason(String SuspendedReason) {
        this.SuspendedReason = SuspendedReason;
    }

    public Operation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Operation(Operation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Detail != null) {
            this.Detail = new OperationDetail(source.Detail);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskDetail[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskDetail(source.Tasks[i]);
            }
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.RollbackTag != null) {
            this.RollbackTag = new Long(source.RollbackTag);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.AutoScaleTag != null) {
            this.AutoScaleTag = new Long(source.AutoScaleTag);
        }
        if (source.SuspendedReason != null) {
            this.SuspendedReason = new String(source.SuspendedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RollbackTag", this.RollbackTag);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "AutoScaleTag", this.AutoScaleTag);
        this.setParamSimple(map, prefix + "SuspendedReason", this.SuspendedReason);

    }
}

