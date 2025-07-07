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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel {

    /**
    * 任务状态。取值：  InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型。取值：
ProvisionRoleConfiguration：部署权限配置。
DeprovisionRoleConfiguration：解除权限配置部署。
CreateRoleAssignment：在成员 账号上授权。
DeleteRoleAssignment：移除 成员 账号上的授权。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务失败原因。
说明
只有Status为Failed，才会显示该参数。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
     * Get 任务状态。取值：  InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。 
     * @return Status 任务状态。取值：  InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。取值：  InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
     * @param Status 任务状态。取值：  InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务类型。取值：
ProvisionRoleConfiguration：部署权限配置。
DeprovisionRoleConfiguration：解除权限配置部署。
CreateRoleAssignment：在成员 账号上授权。
DeleteRoleAssignment：移除 成员 账号上的授权。 
     * @return TaskType 任务类型。取值：
ProvisionRoleConfiguration：部署权限配置。
DeprovisionRoleConfiguration：解除权限配置部署。
CreateRoleAssignment：在成员 账号上授权。
DeleteRoleAssignment：移除 成员 账号上的授权。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。取值：
ProvisionRoleConfiguration：部署权限配置。
DeprovisionRoleConfiguration：解除权限配置部署。
CreateRoleAssignment：在成员 账号上授权。
DeleteRoleAssignment：移除 成员 账号上的授权。
     * @param TaskType 任务类型。取值：
ProvisionRoleConfiguration：部署权限配置。
DeprovisionRoleConfiguration：解除权限配置部署。
CreateRoleAssignment：在成员 账号上授权。
DeleteRoleAssignment：移除 成员 账号上的授权。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务失败原因。
说明
只有Status为Failed，才会显示该参数。 
     * @return FailureReason 任务失败原因。
说明
只有Status为Failed，才会显示该参数。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 任务失败原因。
说明
只有Status为Failed，才会显示该参数。
     * @param FailureReason 任务失败原因。
说明
只有Status为Failed，才会显示该参数。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);

    }
}

