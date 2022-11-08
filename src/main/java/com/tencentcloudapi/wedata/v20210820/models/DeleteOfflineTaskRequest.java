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

public class DeleteOfflineTaskRequest extends AbstractModel{

    /**
    * 操作者name
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 项目/工作空间id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 虚拟任务标记(跟之前调度接口保持一致默认false)
    */
    @SerializedName("VirtualFlag")
    @Expose
    private Boolean VirtualFlag;

    /**
     * Get 操作者name 
     * @return OperatorName 操作者name
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作者name
     * @param OperatorName 操作者name
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 项目/工作空间id 
     * @return ProjectId 项目/工作空间id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目/工作空间id
     * @param ProjectId 项目/工作空间id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 虚拟任务标记(跟之前调度接口保持一致默认false) 
     * @return VirtualFlag 虚拟任务标记(跟之前调度接口保持一致默认false)
     */
    public Boolean getVirtualFlag() {
        return this.VirtualFlag;
    }

    /**
     * Set 虚拟任务标记(跟之前调度接口保持一致默认false)
     * @param VirtualFlag 虚拟任务标记(跟之前调度接口保持一致默认false)
     */
    public void setVirtualFlag(Boolean VirtualFlag) {
        this.VirtualFlag = VirtualFlag;
    }

    public DeleteOfflineTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOfflineTaskRequest(DeleteOfflineTaskRequest source) {
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VirtualFlag != null) {
            this.VirtualFlag = new Boolean(source.VirtualFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VirtualFlag", this.VirtualFlag);

    }
}

