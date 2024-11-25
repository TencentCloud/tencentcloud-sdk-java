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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskFromMultiActionRequest extends AbstractModel {

    /**
    * 参与演练的实例ID
    */
    @SerializedName("TaskInstances")
    @Expose
    private String [] TaskInstances;

    /**
    * 演练名称，不填则默认取动作名称
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * 演练描述，不填则默认取动作描述
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * 演练自动暂停时间，单位分钟, 不填则默认为60
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
    * 演练动作组配置
    */
    @SerializedName("TaskAction")
    @Expose
    private TaskGroupForAction [] TaskAction;

    /**
     * Get 参与演练的实例ID 
     * @return TaskInstances 参与演练的实例ID
     */
    public String [] getTaskInstances() {
        return this.TaskInstances;
    }

    /**
     * Set 参与演练的实例ID
     * @param TaskInstances 参与演练的实例ID
     */
    public void setTaskInstances(String [] TaskInstances) {
        this.TaskInstances = TaskInstances;
    }

    /**
     * Get 演练名称，不填则默认取动作名称 
     * @return TaskTitle 演练名称，不填则默认取动作名称
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set 演练名称，不填则默认取动作名称
     * @param TaskTitle 演练名称，不填则默认取动作名称
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get 演练描述，不填则默认取动作描述 
     * @return TaskDescription 演练描述，不填则默认取动作描述
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set 演练描述，不填则默认取动作描述
     * @param TaskDescription 演练描述，不填则默认取动作描述
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get 演练自动暂停时间，单位分钟, 不填则默认为60 
     * @return TaskPauseDuration 演练自动暂停时间，单位分钟, 不填则默认为60
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set 演练自动暂停时间，单位分钟, 不填则默认为60
     * @param TaskPauseDuration 演练自动暂停时间，单位分钟, 不填则默认为60
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    /**
     * Get 演练动作组配置 
     * @return TaskAction 演练动作组配置
     */
    public TaskGroupForAction [] getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 演练动作组配置
     * @param TaskAction 演练动作组配置
     */
    public void setTaskAction(TaskGroupForAction [] TaskAction) {
        this.TaskAction = TaskAction;
    }

    public CreateTaskFromMultiActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFromMultiActionRequest(CreateTaskFromMultiActionRequest source) {
        if (source.TaskInstances != null) {
            this.TaskInstances = new String[source.TaskInstances.length];
            for (int i = 0; i < source.TaskInstances.length; i++) {
                this.TaskInstances[i] = new String(source.TaskInstances[i]);
            }
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new TaskGroupForAction[source.TaskAction.length];
            for (int i = 0; i < source.TaskAction.length; i++) {
                this.TaskAction[i] = new TaskGroupForAction(source.TaskAction[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskInstances.", this.TaskInstances);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);
        this.setParamArrayObj(map, prefix + "TaskAction.", this.TaskAction);

    }
}

