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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DryRunDIOfflineTaskResponse extends AbstractModel{

    /**
    * 数据时间
    */
    @SerializedName("CurrentRunDate")
    @Expose
    private String CurrentRunDate;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务实例唯一key
    */
    @SerializedName("TaskInstanceKey")
    @Expose
    private String TaskInstanceKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据时间 
     * @return CurrentRunDate 数据时间
     */
    public String getCurrentRunDate() {
        return this.CurrentRunDate;
    }

    /**
     * Set 数据时间
     * @param CurrentRunDate 数据时间
     */
    public void setCurrentRunDate(String CurrentRunDate) {
        this.CurrentRunDate = CurrentRunDate;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务实例唯一key 
     * @return TaskInstanceKey 任务实例唯一key
     */
    public String getTaskInstanceKey() {
        return this.TaskInstanceKey;
    }

    /**
     * Set 任务实例唯一key
     * @param TaskInstanceKey 任务实例唯一key
     */
    public void setTaskInstanceKey(String TaskInstanceKey) {
        this.TaskInstanceKey = TaskInstanceKey;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DryRunDIOfflineTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DryRunDIOfflineTaskResponse(DryRunDIOfflineTaskResponse source) {
        if (source.CurrentRunDate != null) {
            this.CurrentRunDate = new String(source.CurrentRunDate);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskInstanceKey != null) {
            this.TaskInstanceKey = new String(source.TaskInstanceKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentRunDate", this.CurrentRunDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskInstanceKey", this.TaskInstanceKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

