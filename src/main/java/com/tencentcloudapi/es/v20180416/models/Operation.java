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
    * 操作唯一id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 操作开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 操作类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 操作详情
    */
    @SerializedName("Detail")
    @Expose
    private OperationDetail Detail;

    /**
    * 操作结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 流程任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDetail [] Tasks;

    /**
    * 操作进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 回滚标记， 0未回滚 ，1回滚中，2已回滚
    */
    @SerializedName("RollbackTag")
    @Expose
    private Long RollbackTag;

    /**
    * 操作者Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 自动扩容标识：0-非自动，1-自动
    */
    @SerializedName("AutoScaleTag")
    @Expose
    private Long AutoScaleTag;

    /**
     * Get 操作唯一id 
     * @return Id 操作唯一id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 操作唯一id
     * @param Id 操作唯一id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 操作开始时间 
     * @return StartTime 操作开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 操作开始时间
     * @param StartTime 操作开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 操作类型 
     * @return Type 操作类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型
     * @param Type 操作类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 操作详情 
     * @return Detail 操作详情
     */
    public OperationDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set 操作详情
     * @param Detail 操作详情
     */
    public void setDetail(OperationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 操作结果 
     * @return Result 操作结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果
     * @param Result 操作结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 流程任务信息 
     * @return Tasks 流程任务信息
     */
    public TaskDetail [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 流程任务信息
     * @param Tasks 流程任务信息
     */
    public void setTasks(TaskDetail [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 操作进度 
     * @return Progress 操作进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 操作进度
     * @param Progress 操作进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 回滚标记， 0未回滚 ，1回滚中，2已回滚 
     * @return RollbackTag 回滚标记， 0未回滚 ，1回滚中，2已回滚
     */
    public Long getRollbackTag() {
        return this.RollbackTag;
    }

    /**
     * Set 回滚标记， 0未回滚 ，1回滚中，2已回滚
     * @param RollbackTag 回滚标记， 0未回滚 ，1回滚中，2已回滚
     */
    public void setRollbackTag(Long RollbackTag) {
        this.RollbackTag = RollbackTag;
    }

    /**
     * Get 操作者Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 操作者Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 操作者Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 操作者Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 自动扩容标识：0-非自动，1-自动 
     * @return AutoScaleTag 自动扩容标识：0-非自动，1-自动
     */
    public Long getAutoScaleTag() {
        return this.AutoScaleTag;
    }

    /**
     * Set 自动扩容标识：0-非自动，1-自动
     * @param AutoScaleTag 自动扩容标识：0-非自动，1-自动
     */
    public void setAutoScaleTag(Long AutoScaleTag) {
        this.AutoScaleTag = AutoScaleTag;
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

    }
}

