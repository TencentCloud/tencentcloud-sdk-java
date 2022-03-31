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

public class TaskGroupConfig extends AbstractModel{

    /**
    * 动作组所关联的实例对象
    */
    @SerializedName("TaskGroupInstances")
    @Expose
    private String [] TaskGroupInstances;

    /**
    * 动作组标题，不填默认取经验中的动作组名称
    */
    @SerializedName("TaskGroupTitle")
    @Expose
    private String TaskGroupTitle;

    /**
    * 动作组描述，不填默认取经验中的动作组描述
    */
    @SerializedName("TaskGroupDescription")
    @Expose
    private String TaskGroupDescription;

    /**
    * 动作执行模式。1 --- 顺序执行，2 --- 阶段执行, 不填默认取经验中的动作组执行模式
    */
    @SerializedName("TaskGroupMode")
    @Expose
    private Long TaskGroupMode;

    /**
    * 动作组中的动作参数，不填默认使用经验中的动作参数，配置时可以只指定想要修改参数的动作
    */
    @SerializedName("TaskGroupActionsConfig")
    @Expose
    private TaskGroupActionConfig [] TaskGroupActionsConfig;

    /**
     * Get 动作组所关联的实例对象 
     * @return TaskGroupInstances 动作组所关联的实例对象
     */
    public String [] getTaskGroupInstances() {
        return this.TaskGroupInstances;
    }

    /**
     * Set 动作组所关联的实例对象
     * @param TaskGroupInstances 动作组所关联的实例对象
     */
    public void setTaskGroupInstances(String [] TaskGroupInstances) {
        this.TaskGroupInstances = TaskGroupInstances;
    }

    /**
     * Get 动作组标题，不填默认取经验中的动作组名称 
     * @return TaskGroupTitle 动作组标题，不填默认取经验中的动作组名称
     */
    public String getTaskGroupTitle() {
        return this.TaskGroupTitle;
    }

    /**
     * Set 动作组标题，不填默认取经验中的动作组名称
     * @param TaskGroupTitle 动作组标题，不填默认取经验中的动作组名称
     */
    public void setTaskGroupTitle(String TaskGroupTitle) {
        this.TaskGroupTitle = TaskGroupTitle;
    }

    /**
     * Get 动作组描述，不填默认取经验中的动作组描述 
     * @return TaskGroupDescription 动作组描述，不填默认取经验中的动作组描述
     */
    public String getTaskGroupDescription() {
        return this.TaskGroupDescription;
    }

    /**
     * Set 动作组描述，不填默认取经验中的动作组描述
     * @param TaskGroupDescription 动作组描述，不填默认取经验中的动作组描述
     */
    public void setTaskGroupDescription(String TaskGroupDescription) {
        this.TaskGroupDescription = TaskGroupDescription;
    }

    /**
     * Get 动作执行模式。1 --- 顺序执行，2 --- 阶段执行, 不填默认取经验中的动作组执行模式 
     * @return TaskGroupMode 动作执行模式。1 --- 顺序执行，2 --- 阶段执行, 不填默认取经验中的动作组执行模式
     */
    public Long getTaskGroupMode() {
        return this.TaskGroupMode;
    }

    /**
     * Set 动作执行模式。1 --- 顺序执行，2 --- 阶段执行, 不填默认取经验中的动作组执行模式
     * @param TaskGroupMode 动作执行模式。1 --- 顺序执行，2 --- 阶段执行, 不填默认取经验中的动作组执行模式
     */
    public void setTaskGroupMode(Long TaskGroupMode) {
        this.TaskGroupMode = TaskGroupMode;
    }

    /**
     * Get 动作组中的动作参数，不填默认使用经验中的动作参数，配置时可以只指定想要修改参数的动作 
     * @return TaskGroupActionsConfig 动作组中的动作参数，不填默认使用经验中的动作参数，配置时可以只指定想要修改参数的动作
     */
    public TaskGroupActionConfig [] getTaskGroupActionsConfig() {
        return this.TaskGroupActionsConfig;
    }

    /**
     * Set 动作组中的动作参数，不填默认使用经验中的动作参数，配置时可以只指定想要修改参数的动作
     * @param TaskGroupActionsConfig 动作组中的动作参数，不填默认使用经验中的动作参数，配置时可以只指定想要修改参数的动作
     */
    public void setTaskGroupActionsConfig(TaskGroupActionConfig [] TaskGroupActionsConfig) {
        this.TaskGroupActionsConfig = TaskGroupActionsConfig;
    }

    public TaskGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupConfig(TaskGroupConfig source) {
        if (source.TaskGroupInstances != null) {
            this.TaskGroupInstances = new String[source.TaskGroupInstances.length];
            for (int i = 0; i < source.TaskGroupInstances.length; i++) {
                this.TaskGroupInstances[i] = new String(source.TaskGroupInstances[i]);
            }
        }
        if (source.TaskGroupTitle != null) {
            this.TaskGroupTitle = new String(source.TaskGroupTitle);
        }
        if (source.TaskGroupDescription != null) {
            this.TaskGroupDescription = new String(source.TaskGroupDescription);
        }
        if (source.TaskGroupMode != null) {
            this.TaskGroupMode = new Long(source.TaskGroupMode);
        }
        if (source.TaskGroupActionsConfig != null) {
            this.TaskGroupActionsConfig = new TaskGroupActionConfig[source.TaskGroupActionsConfig.length];
            for (int i = 0; i < source.TaskGroupActionsConfig.length; i++) {
                this.TaskGroupActionsConfig[i] = new TaskGroupActionConfig(source.TaskGroupActionsConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskGroupInstances.", this.TaskGroupInstances);
        this.setParamSimple(map, prefix + "TaskGroupTitle", this.TaskGroupTitle);
        this.setParamSimple(map, prefix + "TaskGroupDescription", this.TaskGroupDescription);
        this.setParamSimple(map, prefix + "TaskGroupMode", this.TaskGroupMode);
        this.setParamArrayObj(map, prefix + "TaskGroupActionsConfig.", this.TaskGroupActionsConfig);

    }
}

