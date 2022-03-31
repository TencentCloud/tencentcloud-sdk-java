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

public class TaskGroup extends AbstractModel{

    /**
    * 任务动作ID
    */
    @SerializedName("TaskGroupId")
    @Expose
    private Long TaskGroupId;

    /**
    * 分组标题
    */
    @SerializedName("TaskGroupTitle")
    @Expose
    private String TaskGroupTitle;

    /**
    * 分组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupDescription")
    @Expose
    private String TaskGroupDescription;

    /**
    * 任务分组顺序
    */
    @SerializedName("TaskGroupOrder")
    @Expose
    private Long TaskGroupOrder;

    /**
    * 对象类型ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * 任务分组创建时间
    */
    @SerializedName("TaskGroupCreateTime")
    @Expose
    private String TaskGroupCreateTime;

    /**
    * 任务分组更新时间
    */
    @SerializedName("TaskGroupUpdateTime")
    @Expose
    private String TaskGroupUpdateTime;

    /**
    * 动作分组动作列表
    */
    @SerializedName("TaskGroupActions")
    @Expose
    private TaskGroupAction [] TaskGroupActions;

    /**
    * 实例列表
    */
    @SerializedName("TaskGroupInstanceList")
    @Expose
    private String [] TaskGroupInstanceList;

    /**
    * 执行模式。1 --- 顺序执行，2 --- 阶段执行
    */
    @SerializedName("TaskGroupMode")
    @Expose
    private Long TaskGroupMode;

    /**
     * Get 任务动作ID 
     * @return TaskGroupId 任务动作ID
     */
    public Long getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set 任务动作ID
     * @param TaskGroupId 任务动作ID
     */
    public void setTaskGroupId(Long TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    /**
     * Get 分组标题 
     * @return TaskGroupTitle 分组标题
     */
    public String getTaskGroupTitle() {
        return this.TaskGroupTitle;
    }

    /**
     * Set 分组标题
     * @param TaskGroupTitle 分组标题
     */
    public void setTaskGroupTitle(String TaskGroupTitle) {
        this.TaskGroupTitle = TaskGroupTitle;
    }

    /**
     * Get 分组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupDescription 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskGroupDescription() {
        return this.TaskGroupDescription;
    }

    /**
     * Set 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupDescription 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupDescription(String TaskGroupDescription) {
        this.TaskGroupDescription = TaskGroupDescription;
    }

    /**
     * Get 任务分组顺序 
     * @return TaskGroupOrder 任务分组顺序
     */
    public Long getTaskGroupOrder() {
        return this.TaskGroupOrder;
    }

    /**
     * Set 任务分组顺序
     * @param TaskGroupOrder 任务分组顺序
     */
    public void setTaskGroupOrder(Long TaskGroupOrder) {
        this.TaskGroupOrder = TaskGroupOrder;
    }

    /**
     * Get 对象类型ID 
     * @return ObjectTypeId 对象类型ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set 对象类型ID
     * @param ObjectTypeId 对象类型ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    /**
     * Get 任务分组创建时间 
     * @return TaskGroupCreateTime 任务分组创建时间
     */
    public String getTaskGroupCreateTime() {
        return this.TaskGroupCreateTime;
    }

    /**
     * Set 任务分组创建时间
     * @param TaskGroupCreateTime 任务分组创建时间
     */
    public void setTaskGroupCreateTime(String TaskGroupCreateTime) {
        this.TaskGroupCreateTime = TaskGroupCreateTime;
    }

    /**
     * Get 任务分组更新时间 
     * @return TaskGroupUpdateTime 任务分组更新时间
     */
    public String getTaskGroupUpdateTime() {
        return this.TaskGroupUpdateTime;
    }

    /**
     * Set 任务分组更新时间
     * @param TaskGroupUpdateTime 任务分组更新时间
     */
    public void setTaskGroupUpdateTime(String TaskGroupUpdateTime) {
        this.TaskGroupUpdateTime = TaskGroupUpdateTime;
    }

    /**
     * Get 动作分组动作列表 
     * @return TaskGroupActions 动作分组动作列表
     */
    public TaskGroupAction [] getTaskGroupActions() {
        return this.TaskGroupActions;
    }

    /**
     * Set 动作分组动作列表
     * @param TaskGroupActions 动作分组动作列表
     */
    public void setTaskGroupActions(TaskGroupAction [] TaskGroupActions) {
        this.TaskGroupActions = TaskGroupActions;
    }

    /**
     * Get 实例列表 
     * @return TaskGroupInstanceList 实例列表
     */
    public String [] getTaskGroupInstanceList() {
        return this.TaskGroupInstanceList;
    }

    /**
     * Set 实例列表
     * @param TaskGroupInstanceList 实例列表
     */
    public void setTaskGroupInstanceList(String [] TaskGroupInstanceList) {
        this.TaskGroupInstanceList = TaskGroupInstanceList;
    }

    /**
     * Get 执行模式。1 --- 顺序执行，2 --- 阶段执行 
     * @return TaskGroupMode 执行模式。1 --- 顺序执行，2 --- 阶段执行
     */
    public Long getTaskGroupMode() {
        return this.TaskGroupMode;
    }

    /**
     * Set 执行模式。1 --- 顺序执行，2 --- 阶段执行
     * @param TaskGroupMode 执行模式。1 --- 顺序执行，2 --- 阶段执行
     */
    public void setTaskGroupMode(Long TaskGroupMode) {
        this.TaskGroupMode = TaskGroupMode;
    }

    public TaskGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroup(TaskGroup source) {
        if (source.TaskGroupId != null) {
            this.TaskGroupId = new Long(source.TaskGroupId);
        }
        if (source.TaskGroupTitle != null) {
            this.TaskGroupTitle = new String(source.TaskGroupTitle);
        }
        if (source.TaskGroupDescription != null) {
            this.TaskGroupDescription = new String(source.TaskGroupDescription);
        }
        if (source.TaskGroupOrder != null) {
            this.TaskGroupOrder = new Long(source.TaskGroupOrder);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.TaskGroupCreateTime != null) {
            this.TaskGroupCreateTime = new String(source.TaskGroupCreateTime);
        }
        if (source.TaskGroupUpdateTime != null) {
            this.TaskGroupUpdateTime = new String(source.TaskGroupUpdateTime);
        }
        if (source.TaskGroupActions != null) {
            this.TaskGroupActions = new TaskGroupAction[source.TaskGroupActions.length];
            for (int i = 0; i < source.TaskGroupActions.length; i++) {
                this.TaskGroupActions[i] = new TaskGroupAction(source.TaskGroupActions[i]);
            }
        }
        if (source.TaskGroupInstanceList != null) {
            this.TaskGroupInstanceList = new String[source.TaskGroupInstanceList.length];
            for (int i = 0; i < source.TaskGroupInstanceList.length; i++) {
                this.TaskGroupInstanceList[i] = new String(source.TaskGroupInstanceList[i]);
            }
        }
        if (source.TaskGroupMode != null) {
            this.TaskGroupMode = new Long(source.TaskGroupMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupId", this.TaskGroupId);
        this.setParamSimple(map, prefix + "TaskGroupTitle", this.TaskGroupTitle);
        this.setParamSimple(map, prefix + "TaskGroupDescription", this.TaskGroupDescription);
        this.setParamSimple(map, prefix + "TaskGroupOrder", this.TaskGroupOrder);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "TaskGroupCreateTime", this.TaskGroupCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupUpdateTime", this.TaskGroupUpdateTime);
        this.setParamArrayObj(map, prefix + "TaskGroupActions.", this.TaskGroupActions);
        this.setParamArraySimple(map, prefix + "TaskGroupInstanceList.", this.TaskGroupInstanceList);
        this.setParamSimple(map, prefix + "TaskGroupMode", this.TaskGroupMode);

    }
}

