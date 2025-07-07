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

public class BatchUpdateIntegrationTasksRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 责任人（多个责任人用小写分号隔开；离线任务传入的是账号名，实时任务传入的是账号id）
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 责任人Id（多个责任人用小写分号隔开）
    */
    @SerializedName("InchargeIds")
    @Expose
    private String InchargeIds;

    /**
    * 本次批量操作涉及任务，用于审计
    */
    @SerializedName("TaskNames")
    @Expose
    private String [] TaskNames;

    /**
     * Get 任务id 
     * @return TaskIds 任务id
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务id
     * @param TaskIds 任务id
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 责任人（多个责任人用小写分号隔开；离线任务传入的是账号名，实时任务传入的是账号id） 
     * @return Incharge 责任人（多个责任人用小写分号隔开；离线任务传入的是账号名，实时任务传入的是账号id）
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set 责任人（多个责任人用小写分号隔开；离线任务传入的是账号名，实时任务传入的是账号id）
     * @param Incharge 责任人（多个责任人用小写分号隔开；离线任务传入的是账号名，实时任务传入的是账号id）
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 责任人Id（多个责任人用小写分号隔开） 
     * @return InchargeIds 责任人Id（多个责任人用小写分号隔开）
     */
    public String getInchargeIds() {
        return this.InchargeIds;
    }

    /**
     * Set 责任人Id（多个责任人用小写分号隔开）
     * @param InchargeIds 责任人Id（多个责任人用小写分号隔开）
     */
    public void setInchargeIds(String InchargeIds) {
        this.InchargeIds = InchargeIds;
    }

    /**
     * Get 本次批量操作涉及任务，用于审计 
     * @return TaskNames 本次批量操作涉及任务，用于审计
     */
    public String [] getTaskNames() {
        return this.TaskNames;
    }

    /**
     * Set 本次批量操作涉及任务，用于审计
     * @param TaskNames 本次批量操作涉及任务，用于审计
     */
    public void setTaskNames(String [] TaskNames) {
        this.TaskNames = TaskNames;
    }

    public BatchUpdateIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchUpdateIntegrationTasksRequest(BatchUpdateIntegrationTasksRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InchargeIds != null) {
            this.InchargeIds = new String(source.InchargeIds);
        }
        if (source.TaskNames != null) {
            this.TaskNames = new String[source.TaskNames.length];
            for (int i = 0; i < source.TaskNames.length; i++) {
                this.TaskNames[i] = new String(source.TaskNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InchargeIds", this.InchargeIds);
        this.setParamArraySimple(map, prefix + "TaskNames.", this.TaskNames);

    }
}

