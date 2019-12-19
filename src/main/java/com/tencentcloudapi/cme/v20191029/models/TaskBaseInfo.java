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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskBaseInfo extends AbstractModel{

    /**
    * 任务 Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：项目导出。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务状态，取值有：
<li>PROCESSING：处理中：</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务进度，取值为：0~100。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 错误码。
<li>0：成功；</li>
<li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 创建时间，格式按照 ISO 8601 标准表示。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 任务 Id。 
     * @return TaskId 任务 Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 Id。
     * @param TaskId 任务 Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务类型，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：项目导出。</li> 
     * @return TaskType 任务类型，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：项目导出。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：项目导出。</li>
     * @param TaskType 任务类型，取值有：
<li>VIDEO_EDIT_PROJECT_EXPORT：项目导出。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务状态，取值有：
<li>PROCESSING：处理中：</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li> 
     * @return Status 任务状态，取值有：
<li>PROCESSING：处理中：</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值有：
<li>PROCESSING：处理中：</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     * @param Status 任务状态，取值有：
<li>PROCESSING：处理中：</li>
<li>SUCCESS：成功；</li>
<li>FAIL：失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务进度，取值为：0~100。 
     * @return Progress 任务进度，取值为：0~100。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度，取值为：0~100。
     * @param Progress 任务进度，取值为：0~100。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 错误码。
<li>0：成功；</li>
<li>其他值：失败。</li> 
     * @return ErrCode 错误码。
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码。
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。 
     * @return ErrMsg 错误信息。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息。
     * @param ErrMsg 错误信息。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get 创建时间，格式按照 ISO 8601 标准表示。 
     * @return CreateTime 创建时间，格式按照 ISO 8601 标准表示。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，格式按照 ISO 8601 标准表示。
     * @param CreateTime 创建时间，格式按照 ISO 8601 标准表示。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

