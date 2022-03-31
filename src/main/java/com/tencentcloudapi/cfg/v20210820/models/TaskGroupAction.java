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

public class TaskGroupAction extends AbstractModel{

    /**
    * 任务分组动作ID
    */
    @SerializedName("TaskGroupActionId")
    @Expose
    private Long TaskGroupActionId;

    /**
    * 任务分组动作实例列表
    */
    @SerializedName("TaskGroupInstances")
    @Expose
    private TaskGroupInstance [] TaskGroupInstances;

    /**
    * 动作ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * 分组动作顺序
    */
    @SerializedName("TaskGroupActionOrder")
    @Expose
    private Long TaskGroupActionOrder;

    /**
    * 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupActionGeneralConfiguration")
    @Expose
    private String TaskGroupActionGeneralConfiguration;

    /**
    * 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupActionCustomConfiguration")
    @Expose
    private String TaskGroupActionCustomConfiguration;

    /**
    * 分组动作状态
    */
    @SerializedName("TaskGroupActionStatus")
    @Expose
    private Long TaskGroupActionStatus;

    /**
    * 动作分组创建时间
    */
    @SerializedName("TaskGroupActionCreateTime")
    @Expose
    private String TaskGroupActionCreateTime;

    /**
    * 动作分组更新时间
    */
    @SerializedName("TaskGroupActionUpdateTime")
    @Expose
    private String TaskGroupActionUpdateTime;

    /**
    * 动作名称
    */
    @SerializedName("ActionTitle")
    @Expose
    private String ActionTitle;

    /**
    * 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
    */
    @SerializedName("TaskGroupActionStatusType")
    @Expose
    private Long TaskGroupActionStatusType;

    /**
    * RandomId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupActionRandomId")
    @Expose
    private Long TaskGroupActionRandomId;

    /**
    * RecoverId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupActionRecoverId")
    @Expose
    private Long TaskGroupActionRecoverId;

    /**
    * ExecuteId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupActionExecuteId")
    @Expose
    private Long TaskGroupActionExecuteId;

    /**
    * 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionApiType")
    @Expose
    private Long ActionApiType;

    /**
    * 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionAttribute")
    @Expose
    private Long ActionAttribute;

    /**
    * 动作类型：平台、自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get 任务分组动作ID 
     * @return TaskGroupActionId 任务分组动作ID
     */
    public Long getTaskGroupActionId() {
        return this.TaskGroupActionId;
    }

    /**
     * Set 任务分组动作ID
     * @param TaskGroupActionId 任务分组动作ID
     */
    public void setTaskGroupActionId(Long TaskGroupActionId) {
        this.TaskGroupActionId = TaskGroupActionId;
    }

    /**
     * Get 任务分组动作实例列表 
     * @return TaskGroupInstances 任务分组动作实例列表
     */
    public TaskGroupInstance [] getTaskGroupInstances() {
        return this.TaskGroupInstances;
    }

    /**
     * Set 任务分组动作实例列表
     * @param TaskGroupInstances 任务分组动作实例列表
     */
    public void setTaskGroupInstances(TaskGroupInstance [] TaskGroupInstances) {
        this.TaskGroupInstances = TaskGroupInstances;
    }

    /**
     * Get 动作ID 
     * @return ActionId 动作ID
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set 动作ID
     * @param ActionId 动作ID
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 分组动作顺序 
     * @return TaskGroupActionOrder 分组动作顺序
     */
    public Long getTaskGroupActionOrder() {
        return this.TaskGroupActionOrder;
    }

    /**
     * Set 分组动作顺序
     * @param TaskGroupActionOrder 分组动作顺序
     */
    public void setTaskGroupActionOrder(Long TaskGroupActionOrder) {
        this.TaskGroupActionOrder = TaskGroupActionOrder;
    }

    /**
     * Get 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupActionGeneralConfiguration 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupActionGeneralConfiguration() {
        return this.TaskGroupActionGeneralConfiguration;
    }

    /**
     * Set 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupActionGeneralConfiguration 分组动作通用配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupActionGeneralConfiguration(String TaskGroupActionGeneralConfiguration) {
        this.TaskGroupActionGeneralConfiguration = TaskGroupActionGeneralConfiguration;
    }

    /**
     * Get 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupActionCustomConfiguration 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupActionCustomConfiguration() {
        return this.TaskGroupActionCustomConfiguration;
    }

    /**
     * Set 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupActionCustomConfiguration 分组动作自定义配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupActionCustomConfiguration(String TaskGroupActionCustomConfiguration) {
        this.TaskGroupActionCustomConfiguration = TaskGroupActionCustomConfiguration;
    }

    /**
     * Get 分组动作状态 
     * @return TaskGroupActionStatus 分组动作状态
     */
    public Long getTaskGroupActionStatus() {
        return this.TaskGroupActionStatus;
    }

    /**
     * Set 分组动作状态
     * @param TaskGroupActionStatus 分组动作状态
     */
    public void setTaskGroupActionStatus(Long TaskGroupActionStatus) {
        this.TaskGroupActionStatus = TaskGroupActionStatus;
    }

    /**
     * Get 动作分组创建时间 
     * @return TaskGroupActionCreateTime 动作分组创建时间
     */
    public String getTaskGroupActionCreateTime() {
        return this.TaskGroupActionCreateTime;
    }

    /**
     * Set 动作分组创建时间
     * @param TaskGroupActionCreateTime 动作分组创建时间
     */
    public void setTaskGroupActionCreateTime(String TaskGroupActionCreateTime) {
        this.TaskGroupActionCreateTime = TaskGroupActionCreateTime;
    }

    /**
     * Get 动作分组更新时间 
     * @return TaskGroupActionUpdateTime 动作分组更新时间
     */
    public String getTaskGroupActionUpdateTime() {
        return this.TaskGroupActionUpdateTime;
    }

    /**
     * Set 动作分组更新时间
     * @param TaskGroupActionUpdateTime 动作分组更新时间
     */
    public void setTaskGroupActionUpdateTime(String TaskGroupActionUpdateTime) {
        this.TaskGroupActionUpdateTime = TaskGroupActionUpdateTime;
    }

    /**
     * Get 动作名称 
     * @return ActionTitle 动作名称
     */
    public String getActionTitle() {
        return this.ActionTitle;
    }

    /**
     * Set 动作名称
     * @param ActionTitle 动作名称
     */
    public void setActionTitle(String ActionTitle) {
        this.ActionTitle = ActionTitle;
    }

    /**
     * Get 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过 
     * @return TaskGroupActionStatusType 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
     */
    public Long getTaskGroupActionStatusType() {
        return this.TaskGroupActionStatusType;
    }

    /**
     * Set 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
     * @param TaskGroupActionStatusType 状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过
     */
    public void setTaskGroupActionStatusType(Long TaskGroupActionStatusType) {
        this.TaskGroupActionStatusType = TaskGroupActionStatusType;
    }

    /**
     * Get RandomId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupActionRandomId RandomId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskGroupActionRandomId() {
        return this.TaskGroupActionRandomId;
    }

    /**
     * Set RandomId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupActionRandomId RandomId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupActionRandomId(Long TaskGroupActionRandomId) {
        this.TaskGroupActionRandomId = TaskGroupActionRandomId;
    }

    /**
     * Get RecoverId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupActionRecoverId RecoverId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskGroupActionRecoverId() {
        return this.TaskGroupActionRecoverId;
    }

    /**
     * Set RecoverId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupActionRecoverId RecoverId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupActionRecoverId(Long TaskGroupActionRecoverId) {
        this.TaskGroupActionRecoverId = TaskGroupActionRecoverId;
    }

    /**
     * Get ExecuteId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupActionExecuteId ExecuteId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskGroupActionExecuteId() {
        return this.TaskGroupActionExecuteId;
    }

    /**
     * Set ExecuteId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupActionExecuteId ExecuteId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupActionExecuteId(Long TaskGroupActionExecuteId) {
        this.TaskGroupActionExecuteId = TaskGroupActionExecuteId;
    }

    /**
     * Get 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionApiType 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActionApiType() {
        return this.ActionApiType;
    }

    /**
     * Set 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionApiType 调用api类型，0:tat, 1:云api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionApiType(Long ActionApiType) {
        this.ActionApiType = ActionApiType;
    }

    /**
     * Get 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionAttribute 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActionAttribute() {
        return this.ActionAttribute;
    }

    /**
     * Set 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionAttribute 1:故障，2:恢复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionAttribute(Long ActionAttribute) {
        this.ActionAttribute = ActionAttribute;
    }

    /**
     * Get 动作类型：平台、自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 动作类型：平台、自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 动作类型：平台、自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 动作类型：平台、自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public TaskGroupAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupAction(TaskGroupAction source) {
        if (source.TaskGroupActionId != null) {
            this.TaskGroupActionId = new Long(source.TaskGroupActionId);
        }
        if (source.TaskGroupInstances != null) {
            this.TaskGroupInstances = new TaskGroupInstance[source.TaskGroupInstances.length];
            for (int i = 0; i < source.TaskGroupInstances.length; i++) {
                this.TaskGroupInstances[i] = new TaskGroupInstance(source.TaskGroupInstances[i]);
            }
        }
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.TaskGroupActionOrder != null) {
            this.TaskGroupActionOrder = new Long(source.TaskGroupActionOrder);
        }
        if (source.TaskGroupActionGeneralConfiguration != null) {
            this.TaskGroupActionGeneralConfiguration = new String(source.TaskGroupActionGeneralConfiguration);
        }
        if (source.TaskGroupActionCustomConfiguration != null) {
            this.TaskGroupActionCustomConfiguration = new String(source.TaskGroupActionCustomConfiguration);
        }
        if (source.TaskGroupActionStatus != null) {
            this.TaskGroupActionStatus = new Long(source.TaskGroupActionStatus);
        }
        if (source.TaskGroupActionCreateTime != null) {
            this.TaskGroupActionCreateTime = new String(source.TaskGroupActionCreateTime);
        }
        if (source.TaskGroupActionUpdateTime != null) {
            this.TaskGroupActionUpdateTime = new String(source.TaskGroupActionUpdateTime);
        }
        if (source.ActionTitle != null) {
            this.ActionTitle = new String(source.ActionTitle);
        }
        if (source.TaskGroupActionStatusType != null) {
            this.TaskGroupActionStatusType = new Long(source.TaskGroupActionStatusType);
        }
        if (source.TaskGroupActionRandomId != null) {
            this.TaskGroupActionRandomId = new Long(source.TaskGroupActionRandomId);
        }
        if (source.TaskGroupActionRecoverId != null) {
            this.TaskGroupActionRecoverId = new Long(source.TaskGroupActionRecoverId);
        }
        if (source.TaskGroupActionExecuteId != null) {
            this.TaskGroupActionExecuteId = new Long(source.TaskGroupActionExecuteId);
        }
        if (source.ActionApiType != null) {
            this.ActionApiType = new Long(source.ActionApiType);
        }
        if (source.ActionAttribute != null) {
            this.ActionAttribute = new Long(source.ActionAttribute);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupActionId", this.TaskGroupActionId);
        this.setParamArrayObj(map, prefix + "TaskGroupInstances.", this.TaskGroupInstances);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "TaskGroupActionOrder", this.TaskGroupActionOrder);
        this.setParamSimple(map, prefix + "TaskGroupActionGeneralConfiguration", this.TaskGroupActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskGroupActionCustomConfiguration", this.TaskGroupActionCustomConfiguration);
        this.setParamSimple(map, prefix + "TaskGroupActionStatus", this.TaskGroupActionStatus);
        this.setParamSimple(map, prefix + "TaskGroupActionCreateTime", this.TaskGroupActionCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupActionUpdateTime", this.TaskGroupActionUpdateTime);
        this.setParamSimple(map, prefix + "ActionTitle", this.ActionTitle);
        this.setParamSimple(map, prefix + "TaskGroupActionStatusType", this.TaskGroupActionStatusType);
        this.setParamSimple(map, prefix + "TaskGroupActionRandomId", this.TaskGroupActionRandomId);
        this.setParamSimple(map, prefix + "TaskGroupActionRecoverId", this.TaskGroupActionRecoverId);
        this.setParamSimple(map, prefix + "TaskGroupActionExecuteId", this.TaskGroupActionExecuteId);
        this.setParamSimple(map, prefix + "ActionApiType", this.ActionApiType);
        this.setParamSimple(map, prefix + "ActionAttribute", this.ActionAttribute);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

