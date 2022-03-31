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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteTaskInstanceRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务动作ID
    */
    @SerializedName("TaskActionId")
    @Expose
    private Long TaskActionId;

    /**
    * 任务动作实例ID
    */
    @SerializedName("TaskInstanceIds")
    @Expose
    private Long [] TaskInstanceIds;

    /**
    * 是否操作整个任务
    */
    @SerializedName("IsOperateAll")
    @Expose
    private Boolean IsOperateAll;

    /**
    * 操作类型：（1--启动   2--执行  3--跳过   5--重试）
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 动作组ID
    */
    @SerializedName("TaskGroupId")
    @Expose
    private Long TaskGroupId;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务动作ID 
     * @return TaskActionId 任务动作ID
     */
    public Long getTaskActionId() {
        return this.TaskActionId;
    }

    /**
     * Set 任务动作ID
     * @param TaskActionId 任务动作ID
     */
    public void setTaskActionId(Long TaskActionId) {
        this.TaskActionId = TaskActionId;
    }

    /**
     * Get 任务动作实例ID 
     * @return TaskInstanceIds 任务动作实例ID
     */
    public Long [] getTaskInstanceIds() {
        return this.TaskInstanceIds;
    }

    /**
     * Set 任务动作实例ID
     * @param TaskInstanceIds 任务动作实例ID
     */
    public void setTaskInstanceIds(Long [] TaskInstanceIds) {
        this.TaskInstanceIds = TaskInstanceIds;
    }

    /**
     * Get 是否操作整个任务 
     * @return IsOperateAll 是否操作整个任务
     */
    public Boolean getIsOperateAll() {
        return this.IsOperateAll;
    }

    /**
     * Set 是否操作整个任务
     * @param IsOperateAll 是否操作整个任务
     */
    public void setIsOperateAll(Boolean IsOperateAll) {
        this.IsOperateAll = IsOperateAll;
    }

    /**
     * Get 操作类型：（1--启动   2--执行  3--跳过   5--重试） 
     * @return ActionType 操作类型：（1--启动   2--执行  3--跳过   5--重试）
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 操作类型：（1--启动   2--执行  3--跳过   5--重试）
     * @param ActionType 操作类型：（1--启动   2--执行  3--跳过   5--重试）
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 动作组ID 
     * @return TaskGroupId 动作组ID
     */
    public Long getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set 动作组ID
     * @param TaskGroupId 动作组ID
     */
    public void setTaskGroupId(Long TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    public ExecuteTaskInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteTaskInstanceRequest(ExecuteTaskInstanceRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskActionId != null) {
            this.TaskActionId = new Long(source.TaskActionId);
        }
        if (source.TaskInstanceIds != null) {
            this.TaskInstanceIds = new Long[source.TaskInstanceIds.length];
            for (int i = 0; i < source.TaskInstanceIds.length; i++) {
                this.TaskInstanceIds[i] = new Long(source.TaskInstanceIds[i]);
            }
        }
        if (source.IsOperateAll != null) {
            this.IsOperateAll = new Boolean(source.IsOperateAll);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.TaskGroupId != null) {
            this.TaskGroupId = new Long(source.TaskGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskActionId", this.TaskActionId);
        this.setParamArraySimple(map, prefix + "TaskInstanceIds.", this.TaskInstanceIds);
        this.setParamSimple(map, prefix + "IsOperateAll", this.IsOperateAll);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "TaskGroupId", this.TaskGroupId);

    }
}

