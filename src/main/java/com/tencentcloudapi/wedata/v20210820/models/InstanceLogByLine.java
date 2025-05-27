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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLogByLine extends AbstractModel {

    /**
    * 返回行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
    * 文件是否读取完
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Over")
    @Expose
    private Boolean Over;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 执行机类型 0:老执行机loader 1:新执行机woker
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkerType")
    @Expose
    private Long WorkerType;

    /**
    * 日志sql错误信息，包含行列信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobLogErrorTip")
    @Expose
    private JobLogErrorTip JobLogErrorTip;

    /**
    * 执行实例的扩展属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionExtendedProps")
    @Expose
    private ExtensionInfoVO [] ExecutionExtendedProps;

    /**
    * 如果queryFileFlag为1，则ext返回当前页数据的结束行信息，下一页把这个extInfo透传过来
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 返回行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 返回行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 返回行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 返回行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    /**
     * Get 文件是否读取完
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Over 文件是否读取完
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOver() {
        return this.Over;
    }

    /**
     * Set 文件是否读取完
注意：此字段可能返回 null，表示取不到有效值。
     * @param Over 文件是否读取完
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOver(Boolean Over) {
        this.Over = Over;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceState 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceState 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 执行机类型 0:老执行机loader 1:新执行机woker
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkerType 执行机类型 0:老执行机loader 1:新执行机woker
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkerType() {
        return this.WorkerType;
    }

    /**
     * Set 执行机类型 0:老执行机loader 1:新执行机woker
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkerType 执行机类型 0:老执行机loader 1:新执行机woker
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkerType(Long WorkerType) {
        this.WorkerType = WorkerType;
    }

    /**
     * Get 日志sql错误信息，包含行列信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobLogErrorTip 日志sql错误信息，包含行列信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobLogErrorTip getJobLogErrorTip() {
        return this.JobLogErrorTip;
    }

    /**
     * Set 日志sql错误信息，包含行列信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobLogErrorTip 日志sql错误信息，包含行列信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobLogErrorTip(JobLogErrorTip JobLogErrorTip) {
        this.JobLogErrorTip = JobLogErrorTip;
    }

    /**
     * Get 执行实例的扩展属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionExtendedProps 执行实例的扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtensionInfoVO [] getExecutionExtendedProps() {
        return this.ExecutionExtendedProps;
    }

    /**
     * Set 执行实例的扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionExtendedProps 执行实例的扩展属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionExtendedProps(ExtensionInfoVO [] ExecutionExtendedProps) {
        this.ExecutionExtendedProps = ExecutionExtendedProps;
    }

    /**
     * Get 如果queryFileFlag为1，则ext返回当前页数据的结束行信息，下一页把这个extInfo透传过来
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo 如果queryFileFlag为1，则ext返回当前页数据的结束行信息，下一页把这个extInfo透传过来
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 如果queryFileFlag为1，则ext返回当前页数据的结束行信息，下一页把这个extInfo透传过来
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo 如果queryFileFlag为1，则ext返回当前页数据的结束行信息，下一页把这个extInfo透传过来
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public InstanceLogByLine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogByLine(InstanceLogByLine source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
        if (source.Over != null) {
            this.Over = new Boolean(source.Over);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.WorkerType != null) {
            this.WorkerType = new Long(source.WorkerType);
        }
        if (source.JobLogErrorTip != null) {
            this.JobLogErrorTip = new JobLogErrorTip(source.JobLogErrorTip);
        }
        if (source.ExecutionExtendedProps != null) {
            this.ExecutionExtendedProps = new ExtensionInfoVO[source.ExecutionExtendedProps.length];
            for (int i = 0; i < source.ExecutionExtendedProps.length; i++) {
                this.ExecutionExtendedProps[i] = new ExtensionInfoVO(source.ExecutionExtendedProps[i]);
            }
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Over", this.Over);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "WorkerType", this.WorkerType);
        this.setParamObj(map, prefix + "JobLogErrorTip.", this.JobLogErrorTip);
        this.setParamArrayObj(map, prefix + "ExecutionExtendedProps.", this.ExecutionExtendedProps);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

