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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSimpleInfo  extends AbstractModel{

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型，包含：
<li> WorkflowTask：工作流处理任务；</li>
<li> LiveProcessTask：直播处理任务。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未开始，该字段为：0000-00-00T00:00:00Z。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未完成，该字段为：0000-00-00T00:00:00Z。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * 获取任务 ID。
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取任务类型，包含：
<li> WorkflowTask：工作流处理任务；</li>
<li> LiveProcessTask：直播处理任务。</li>
     * @return TaskType 任务类型，包含：
<li> WorkflowTask：工作流处理任务；</li>
<li> LiveProcessTask：直播处理任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * 设置任务类型，包含：
<li> WorkflowTask：工作流处理任务；</li>
<li> LiveProcessTask：直播处理任务。</li>
     * @param TaskType 任务类型，包含：
<li> WorkflowTask：工作流处理任务；</li>
<li> LiveProcessTask：直播处理任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * 获取任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未开始，该字段为：0000-00-00T00:00:00Z。
     * @return BeginProcessTime 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未开始，该字段为：0000-00-00T00:00:00Z。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * 设置任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未开始，该字段为：0000-00-00T00:00:00Z。
     * @param BeginProcessTime 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未开始，该字段为：0000-00-00T00:00:00Z。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * 获取任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未完成，该字段为：0000-00-00T00:00:00Z。
     * @return FinishTime 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未完成，该字段为：0000-00-00T00:00:00Z。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * 设置任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未完成，该字段为：0000-00-00T00:00:00Z。
     * @param FinishTime 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。若任务尚未完成，该字段为：0000-00-00T00:00:00Z。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

