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

public class TaskDetail extends AbstractModel {

    /**
    * 任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 任务完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 子任务
    */
    @SerializedName("SubTasks")
    @Expose
    private SubTaskDetail [] SubTasks;

    /**
    * 任务花费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElapsedTime")
    @Expose
    private Long ElapsedTime;

    /**
    * 任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessInfo")
    @Expose
    private ProcessDetail ProcessInfo;

    /**
     * Get 任务名 
     * @return Name 任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名
     * @param Name 任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务进度 
     * @return Progress 任务进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度
     * @param Progress 任务进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务完成时间 
     * @return FinishTime 任务完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务完成时间
     * @param FinishTime 任务完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 子任务 
     * @return SubTasks 子任务
     */
    public SubTaskDetail [] getSubTasks() {
        return this.SubTasks;
    }

    /**
     * Set 子任务
     * @param SubTasks 子任务
     */
    public void setSubTasks(SubTaskDetail [] SubTasks) {
        this.SubTasks = SubTasks;
    }

    /**
     * Get 任务花费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElapsedTime 任务花费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getElapsedTime() {
        return this.ElapsedTime;
    }

    /**
     * Set 任务花费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElapsedTime 任务花费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElapsedTime(Long ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
    }

    /**
     * Get 任务进度详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessInfo 任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcessDetail getProcessInfo() {
        return this.ProcessInfo;
    }

    /**
     * Set 任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessInfo 任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessInfo(ProcessDetail ProcessInfo) {
        this.ProcessInfo = ProcessInfo;
    }

    public TaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDetail(TaskDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.SubTasks != null) {
            this.SubTasks = new SubTaskDetail[source.SubTasks.length];
            for (int i = 0; i < source.SubTasks.length; i++) {
                this.SubTasks[i] = new SubTaskDetail(source.SubTasks[i]);
            }
        }
        if (source.ElapsedTime != null) {
            this.ElapsedTime = new Long(source.ElapsedTime);
        }
        if (source.ProcessInfo != null) {
            this.ProcessInfo = new ProcessDetail(source.ProcessInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamArrayObj(map, prefix + "SubTasks.", this.SubTasks);
        this.setParamSimple(map, prefix + "ElapsedTime", this.ElapsedTime);
        this.setParamObj(map, prefix + "ProcessInfo.", this.ProcessInfo);

    }
}

