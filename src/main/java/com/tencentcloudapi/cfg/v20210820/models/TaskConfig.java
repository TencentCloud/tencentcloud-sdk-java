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

public class TaskConfig extends AbstractModel{

    /**
    * 动作组配置，需要保证配置个数和经验中的动作组个数一致
    */
    @SerializedName("TaskGroupsConfig")
    @Expose
    private TaskGroupConfig [] TaskGroupsConfig;

    /**
    * 更改后的演练名称，不填则默认取经验名称
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * 更改后的演练描述，不填则默认取经验描述
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * 演练执行模式：1----手工执行/ 2 ---自动执行，不填则默认取经验执行模式
    */
    @SerializedName("TaskMode")
    @Expose
    private Long TaskMode;

    /**
    * 演练自动暂停时间，单位分钟, 不填则默认取经验自动暂停时间
    */
    @SerializedName("TaskPauseDuration")
    @Expose
    private Long TaskPauseDuration;

    /**
    * 演练标签信息，不填则默认取经验标签
    */
    @SerializedName("Tags")
    @Expose
    private TagWithCreate [] Tags;

    /**
     * Get 动作组配置，需要保证配置个数和经验中的动作组个数一致 
     * @return TaskGroupsConfig 动作组配置，需要保证配置个数和经验中的动作组个数一致
     */
    public TaskGroupConfig [] getTaskGroupsConfig() {
        return this.TaskGroupsConfig;
    }

    /**
     * Set 动作组配置，需要保证配置个数和经验中的动作组个数一致
     * @param TaskGroupsConfig 动作组配置，需要保证配置个数和经验中的动作组个数一致
     */
    public void setTaskGroupsConfig(TaskGroupConfig [] TaskGroupsConfig) {
        this.TaskGroupsConfig = TaskGroupsConfig;
    }

    /**
     * Get 更改后的演练名称，不填则默认取经验名称 
     * @return TaskTitle 更改后的演练名称，不填则默认取经验名称
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set 更改后的演练名称，不填则默认取经验名称
     * @param TaskTitle 更改后的演练名称，不填则默认取经验名称
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get 更改后的演练描述，不填则默认取经验描述 
     * @return TaskDescription 更改后的演练描述，不填则默认取经验描述
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set 更改后的演练描述，不填则默认取经验描述
     * @param TaskDescription 更改后的演练描述，不填则默认取经验描述
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get 演练执行模式：1----手工执行/ 2 ---自动执行，不填则默认取经验执行模式 
     * @return TaskMode 演练执行模式：1----手工执行/ 2 ---自动执行，不填则默认取经验执行模式
     */
    public Long getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set 演练执行模式：1----手工执行/ 2 ---自动执行，不填则默认取经验执行模式
     * @param TaskMode 演练执行模式：1----手工执行/ 2 ---自动执行，不填则默认取经验执行模式
     */
    public void setTaskMode(Long TaskMode) {
        this.TaskMode = TaskMode;
    }

    /**
     * Get 演练自动暂停时间，单位分钟, 不填则默认取经验自动暂停时间 
     * @return TaskPauseDuration 演练自动暂停时间，单位分钟, 不填则默认取经验自动暂停时间
     */
    public Long getTaskPauseDuration() {
        return this.TaskPauseDuration;
    }

    /**
     * Set 演练自动暂停时间，单位分钟, 不填则默认取经验自动暂停时间
     * @param TaskPauseDuration 演练自动暂停时间，单位分钟, 不填则默认取经验自动暂停时间
     */
    public void setTaskPauseDuration(Long TaskPauseDuration) {
        this.TaskPauseDuration = TaskPauseDuration;
    }

    /**
     * Get 演练标签信息，不填则默认取经验标签 
     * @return Tags 演练标签信息，不填则默认取经验标签
     */
    public TagWithCreate [] getTags() {
        return this.Tags;
    }

    /**
     * Set 演练标签信息，不填则默认取经验标签
     * @param Tags 演练标签信息，不填则默认取经验标签
     */
    public void setTags(TagWithCreate [] Tags) {
        this.Tags = Tags;
    }

    public TaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskConfig(TaskConfig source) {
        if (source.TaskGroupsConfig != null) {
            this.TaskGroupsConfig = new TaskGroupConfig[source.TaskGroupsConfig.length];
            for (int i = 0; i < source.TaskGroupsConfig.length; i++) {
                this.TaskGroupsConfig[i] = new TaskGroupConfig(source.TaskGroupsConfig[i]);
            }
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskMode != null) {
            this.TaskMode = new Long(source.TaskMode);
        }
        if (source.TaskPauseDuration != null) {
            this.TaskPauseDuration = new Long(source.TaskPauseDuration);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithCreate[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithCreate(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskGroupsConfig.", this.TaskGroupsConfig);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);
        this.setParamSimple(map, prefix + "TaskPauseDuration", this.TaskPauseDuration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

