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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupAction extends AbstractModel {

    /**
    * <p>任务分组动作ID</p>
    */
    @SerializedName("TaskGroupActionId")
    @Expose
    private Long TaskGroupActionId;

    /**
    * <p>任务分组动作实例列表</p>
    */
    @SerializedName("TaskGroupInstances")
    @Expose
    private TaskGroupInstance [] TaskGroupInstances;

    /**
    * <p>动作ID</p>
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * <p>分组动作顺序</p>
    */
    @SerializedName("TaskGroupActionOrder")
    @Expose
    private Long TaskGroupActionOrder;

    /**
    * <p>分组动作通用配置</p>
    */
    @SerializedName("TaskGroupActionGeneralConfiguration")
    @Expose
    private String TaskGroupActionGeneralConfiguration;

    /**
    * <p>分组动作自定义配置</p>
    */
    @SerializedName("TaskGroupActionCustomConfiguration")
    @Expose
    private String TaskGroupActionCustomConfiguration;

    /**
    * <p>分组动作状态</p><p>枚举值：</p><ul><li>2001： 未开始</li><li>2002： 待执行</li><li>2003： 执行中</li><li>2004： 执行结束</li></ul>
    */
    @SerializedName("TaskGroupActionStatus")
    @Expose
    private Long TaskGroupActionStatus;

    /**
    * <p>动作分组创建时间</p>
    */
    @SerializedName("TaskGroupActionCreateTime")
    @Expose
    private String TaskGroupActionCreateTime;

    /**
    * <p>动作分组更新时间</p>
    */
    @SerializedName("TaskGroupActionUpdateTime")
    @Expose
    private String TaskGroupActionUpdateTime;

    /**
    * <p>动作名称</p>
    */
    @SerializedName("ActionTitle")
    @Expose
    private String ActionTitle;

    /**
    * <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
    */
    @SerializedName("TaskGroupActionStatusType")
    @Expose
    private Long TaskGroupActionStatusType;

    /**
    * <p>RandomId</p>
    */
    @SerializedName("TaskGroupActionRandomId")
    @Expose
    private Long TaskGroupActionRandomId;

    /**
    * <p>RecoverId</p>
    */
    @SerializedName("TaskGroupActionRecoverId")
    @Expose
    private Long TaskGroupActionRecoverId;

    /**
    * <p>ExecuteId</p>
    */
    @SerializedName("TaskGroupActionExecuteId")
    @Expose
    private Long TaskGroupActionExecuteId;

    /**
    * <p>调用api类型，0:tat, 1:云api</p>
    */
    @SerializedName("ActionApiType")
    @Expose
    private Long ActionApiType;

    /**
    * <p>1:故障，2:恢复</p>
    */
    @SerializedName("ActionAttribute")
    @Expose
    private Long ActionAttribute;

    /**
    * <p>动作类型：平台、自定义</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>是否可重试</p>
    */
    @SerializedName("IsExecuteRedo")
    @Expose
    private Boolean IsExecuteRedo;

    /**
    * <p>动作风险级别</p>
    */
    @SerializedName("ActionRisk")
    @Expose
    private String ActionRisk;

    /**
    * <p>动作运行时间</p><p>单位：秒</p>
    */
    @SerializedName("TaskGroupActionExecuteTime")
    @Expose
    private Long TaskGroupActionExecuteTime;

    /**
    * <p>动作开始执行时间</p>
    */
    @SerializedName("TaskGroupActionStartTime")
    @Expose
    private String TaskGroupActionStartTime;

    /**
     * Get <p>任务分组动作ID</p> 
     * @return TaskGroupActionId <p>任务分组动作ID</p>
     */
    public Long getTaskGroupActionId() {
        return this.TaskGroupActionId;
    }

    /**
     * Set <p>任务分组动作ID</p>
     * @param TaskGroupActionId <p>任务分组动作ID</p>
     */
    public void setTaskGroupActionId(Long TaskGroupActionId) {
        this.TaskGroupActionId = TaskGroupActionId;
    }

    /**
     * Get <p>任务分组动作实例列表</p> 
     * @return TaskGroupInstances <p>任务分组动作实例列表</p>
     */
    public TaskGroupInstance [] getTaskGroupInstances() {
        return this.TaskGroupInstances;
    }

    /**
     * Set <p>任务分组动作实例列表</p>
     * @param TaskGroupInstances <p>任务分组动作实例列表</p>
     */
    public void setTaskGroupInstances(TaskGroupInstance [] TaskGroupInstances) {
        this.TaskGroupInstances = TaskGroupInstances;
    }

    /**
     * Get <p>动作ID</p> 
     * @return ActionId <p>动作ID</p>
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set <p>动作ID</p>
     * @param ActionId <p>动作ID</p>
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get <p>分组动作顺序</p> 
     * @return TaskGroupActionOrder <p>分组动作顺序</p>
     */
    public Long getTaskGroupActionOrder() {
        return this.TaskGroupActionOrder;
    }

    /**
     * Set <p>分组动作顺序</p>
     * @param TaskGroupActionOrder <p>分组动作顺序</p>
     */
    public void setTaskGroupActionOrder(Long TaskGroupActionOrder) {
        this.TaskGroupActionOrder = TaskGroupActionOrder;
    }

    /**
     * Get <p>分组动作通用配置</p> 
     * @return TaskGroupActionGeneralConfiguration <p>分组动作通用配置</p>
     */
    public String getTaskGroupActionGeneralConfiguration() {
        return this.TaskGroupActionGeneralConfiguration;
    }

    /**
     * Set <p>分组动作通用配置</p>
     * @param TaskGroupActionGeneralConfiguration <p>分组动作通用配置</p>
     */
    public void setTaskGroupActionGeneralConfiguration(String TaskGroupActionGeneralConfiguration) {
        this.TaskGroupActionGeneralConfiguration = TaskGroupActionGeneralConfiguration;
    }

    /**
     * Get <p>分组动作自定义配置</p> 
     * @return TaskGroupActionCustomConfiguration <p>分组动作自定义配置</p>
     */
    public String getTaskGroupActionCustomConfiguration() {
        return this.TaskGroupActionCustomConfiguration;
    }

    /**
     * Set <p>分组动作自定义配置</p>
     * @param TaskGroupActionCustomConfiguration <p>分组动作自定义配置</p>
     */
    public void setTaskGroupActionCustomConfiguration(String TaskGroupActionCustomConfiguration) {
        this.TaskGroupActionCustomConfiguration = TaskGroupActionCustomConfiguration;
    }

    /**
     * Get <p>分组动作状态</p><p>枚举值：</p><ul><li>2001： 未开始</li><li>2002： 待执行</li><li>2003： 执行中</li><li>2004： 执行结束</li></ul> 
     * @return TaskGroupActionStatus <p>分组动作状态</p><p>枚举值：</p><ul><li>2001： 未开始</li><li>2002： 待执行</li><li>2003： 执行中</li><li>2004： 执行结束</li></ul>
     */
    public Long getTaskGroupActionStatus() {
        return this.TaskGroupActionStatus;
    }

    /**
     * Set <p>分组动作状态</p><p>枚举值：</p><ul><li>2001： 未开始</li><li>2002： 待执行</li><li>2003： 执行中</li><li>2004： 执行结束</li></ul>
     * @param TaskGroupActionStatus <p>分组动作状态</p><p>枚举值：</p><ul><li>2001： 未开始</li><li>2002： 待执行</li><li>2003： 执行中</li><li>2004： 执行结束</li></ul>
     */
    public void setTaskGroupActionStatus(Long TaskGroupActionStatus) {
        this.TaskGroupActionStatus = TaskGroupActionStatus;
    }

    /**
     * Get <p>动作分组创建时间</p> 
     * @return TaskGroupActionCreateTime <p>动作分组创建时间</p>
     */
    public String getTaskGroupActionCreateTime() {
        return this.TaskGroupActionCreateTime;
    }

    /**
     * Set <p>动作分组创建时间</p>
     * @param TaskGroupActionCreateTime <p>动作分组创建时间</p>
     */
    public void setTaskGroupActionCreateTime(String TaskGroupActionCreateTime) {
        this.TaskGroupActionCreateTime = TaskGroupActionCreateTime;
    }

    /**
     * Get <p>动作分组更新时间</p> 
     * @return TaskGroupActionUpdateTime <p>动作分组更新时间</p>
     */
    public String getTaskGroupActionUpdateTime() {
        return this.TaskGroupActionUpdateTime;
    }

    /**
     * Set <p>动作分组更新时间</p>
     * @param TaskGroupActionUpdateTime <p>动作分组更新时间</p>
     */
    public void setTaskGroupActionUpdateTime(String TaskGroupActionUpdateTime) {
        this.TaskGroupActionUpdateTime = TaskGroupActionUpdateTime;
    }

    /**
     * Get <p>动作名称</p> 
     * @return ActionTitle <p>动作名称</p>
     */
    public String getActionTitle() {
        return this.ActionTitle;
    }

    /**
     * Set <p>动作名称</p>
     * @param ActionTitle <p>动作名称</p>
     */
    public void setActionTitle(String ActionTitle) {
        this.ActionTitle = ActionTitle;
    }

    /**
     * Get <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p> 
     * @return TaskGroupActionStatusType <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
     */
    public Long getTaskGroupActionStatusType() {
        return this.TaskGroupActionStatusType;
    }

    /**
     * Set <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
     * @param TaskGroupActionStatusType <p>状态类型: 0 -- 无状态，1 -- 成功，2-- 失败，3--终止，4--跳过</p>
     */
    public void setTaskGroupActionStatusType(Long TaskGroupActionStatusType) {
        this.TaskGroupActionStatusType = TaskGroupActionStatusType;
    }

    /**
     * Get <p>RandomId</p> 
     * @return TaskGroupActionRandomId <p>RandomId</p>
     */
    public Long getTaskGroupActionRandomId() {
        return this.TaskGroupActionRandomId;
    }

    /**
     * Set <p>RandomId</p>
     * @param TaskGroupActionRandomId <p>RandomId</p>
     */
    public void setTaskGroupActionRandomId(Long TaskGroupActionRandomId) {
        this.TaskGroupActionRandomId = TaskGroupActionRandomId;
    }

    /**
     * Get <p>RecoverId</p> 
     * @return TaskGroupActionRecoverId <p>RecoverId</p>
     */
    public Long getTaskGroupActionRecoverId() {
        return this.TaskGroupActionRecoverId;
    }

    /**
     * Set <p>RecoverId</p>
     * @param TaskGroupActionRecoverId <p>RecoverId</p>
     */
    public void setTaskGroupActionRecoverId(Long TaskGroupActionRecoverId) {
        this.TaskGroupActionRecoverId = TaskGroupActionRecoverId;
    }

    /**
     * Get <p>ExecuteId</p> 
     * @return TaskGroupActionExecuteId <p>ExecuteId</p>
     */
    public Long getTaskGroupActionExecuteId() {
        return this.TaskGroupActionExecuteId;
    }

    /**
     * Set <p>ExecuteId</p>
     * @param TaskGroupActionExecuteId <p>ExecuteId</p>
     */
    public void setTaskGroupActionExecuteId(Long TaskGroupActionExecuteId) {
        this.TaskGroupActionExecuteId = TaskGroupActionExecuteId;
    }

    /**
     * Get <p>调用api类型，0:tat, 1:云api</p> 
     * @return ActionApiType <p>调用api类型，0:tat, 1:云api</p>
     */
    public Long getActionApiType() {
        return this.ActionApiType;
    }

    /**
     * Set <p>调用api类型，0:tat, 1:云api</p>
     * @param ActionApiType <p>调用api类型，0:tat, 1:云api</p>
     */
    public void setActionApiType(Long ActionApiType) {
        this.ActionApiType = ActionApiType;
    }

    /**
     * Get <p>1:故障，2:恢复</p> 
     * @return ActionAttribute <p>1:故障，2:恢复</p>
     */
    public Long getActionAttribute() {
        return this.ActionAttribute;
    }

    /**
     * Set <p>1:故障，2:恢复</p>
     * @param ActionAttribute <p>1:故障，2:恢复</p>
     */
    public void setActionAttribute(Long ActionAttribute) {
        this.ActionAttribute = ActionAttribute;
    }

    /**
     * Get <p>动作类型：平台、自定义</p> 
     * @return ActionType <p>动作类型：平台、自定义</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>动作类型：平台、自定义</p>
     * @param ActionType <p>动作类型：平台、自定义</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>是否可重试</p> 
     * @return IsExecuteRedo <p>是否可重试</p>
     */
    public Boolean getIsExecuteRedo() {
        return this.IsExecuteRedo;
    }

    /**
     * Set <p>是否可重试</p>
     * @param IsExecuteRedo <p>是否可重试</p>
     */
    public void setIsExecuteRedo(Boolean IsExecuteRedo) {
        this.IsExecuteRedo = IsExecuteRedo;
    }

    /**
     * Get <p>动作风险级别</p> 
     * @return ActionRisk <p>动作风险级别</p>
     */
    public String getActionRisk() {
        return this.ActionRisk;
    }

    /**
     * Set <p>动作风险级别</p>
     * @param ActionRisk <p>动作风险级别</p>
     */
    public void setActionRisk(String ActionRisk) {
        this.ActionRisk = ActionRisk;
    }

    /**
     * Get <p>动作运行时间</p><p>单位：秒</p> 
     * @return TaskGroupActionExecuteTime <p>动作运行时间</p><p>单位：秒</p>
     */
    public Long getTaskGroupActionExecuteTime() {
        return this.TaskGroupActionExecuteTime;
    }

    /**
     * Set <p>动作运行时间</p><p>单位：秒</p>
     * @param TaskGroupActionExecuteTime <p>动作运行时间</p><p>单位：秒</p>
     */
    public void setTaskGroupActionExecuteTime(Long TaskGroupActionExecuteTime) {
        this.TaskGroupActionExecuteTime = TaskGroupActionExecuteTime;
    }

    /**
     * Get <p>动作开始执行时间</p> 
     * @return TaskGroupActionStartTime <p>动作开始执行时间</p>
     */
    public String getTaskGroupActionStartTime() {
        return this.TaskGroupActionStartTime;
    }

    /**
     * Set <p>动作开始执行时间</p>
     * @param TaskGroupActionStartTime <p>动作开始执行时间</p>
     */
    public void setTaskGroupActionStartTime(String TaskGroupActionStartTime) {
        this.TaskGroupActionStartTime = TaskGroupActionStartTime;
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
        if (source.IsExecuteRedo != null) {
            this.IsExecuteRedo = new Boolean(source.IsExecuteRedo);
        }
        if (source.ActionRisk != null) {
            this.ActionRisk = new String(source.ActionRisk);
        }
        if (source.TaskGroupActionExecuteTime != null) {
            this.TaskGroupActionExecuteTime = new Long(source.TaskGroupActionExecuteTime);
        }
        if (source.TaskGroupActionStartTime != null) {
            this.TaskGroupActionStartTime = new String(source.TaskGroupActionStartTime);
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
        this.setParamSimple(map, prefix + "IsExecuteRedo", this.IsExecuteRedo);
        this.setParamSimple(map, prefix + "ActionRisk", this.ActionRisk);
        this.setParamSimple(map, prefix + "TaskGroupActionExecuteTime", this.TaskGroupActionExecuteTime);
        this.setParamSimple(map, prefix + "TaskGroupActionStartTime", this.TaskGroupActionStartTime);

    }
}

