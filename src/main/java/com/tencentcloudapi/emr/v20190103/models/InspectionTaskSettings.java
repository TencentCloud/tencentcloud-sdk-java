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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InspectionTaskSettings extends AbstractModel {

    /**
    * 巡检任务的唯一标记
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 巡检任务组名称
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 巡检任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 巡检任务参数设置
    */
    @SerializedName("TaskSettings")
    @Expose
    private TaskSettings [] TaskSettings;

    /**
    * 是否选中，”true“ ”false“
    */
    @SerializedName("Selected")
    @Expose
    private String Selected;

    /**
    * 是否开启监控
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 事件Json模板
    */
    @SerializedName("SettingsJson")
    @Expose
    private String SettingsJson;

    /**
     * Get 巡检任务的唯一标记 
     * @return TaskType 巡检任务的唯一标记
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 巡检任务的唯一标记
     * @param TaskType 巡检任务的唯一标记
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 巡检任务组名称 
     * @return Group 巡检任务组名称
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 巡检任务组名称
     * @param Group 巡检任务组名称
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 巡检任务名称 
     * @return Name 巡检任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 巡检任务名称
     * @param Name 巡检任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 巡检任务参数设置 
     * @return TaskSettings 巡检任务参数设置
     */
    public TaskSettings [] getTaskSettings() {
        return this.TaskSettings;
    }

    /**
     * Set 巡检任务参数设置
     * @param TaskSettings 巡检任务参数设置
     */
    public void setTaskSettings(TaskSettings [] TaskSettings) {
        this.TaskSettings = TaskSettings;
    }

    /**
     * Get 是否选中，”true“ ”false“ 
     * @return Selected 是否选中，”true“ ”false“
     */
    public String getSelected() {
        return this.Selected;
    }

    /**
     * Set 是否选中，”true“ ”false“
     * @param Selected 是否选中，”true“ ”false“
     */
    public void setSelected(String Selected) {
        this.Selected = Selected;
    }

    /**
     * Get 是否开启监控 
     * @return Enable 是否开启监控
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启监控
     * @param Enable 是否开启监控
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 事件Json模板 
     * @return SettingsJson 事件Json模板
     */
    public String getSettingsJson() {
        return this.SettingsJson;
    }

    /**
     * Set 事件Json模板
     * @param SettingsJson 事件Json模板
     */
    public void setSettingsJson(String SettingsJson) {
        this.SettingsJson = SettingsJson;
    }

    public InspectionTaskSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InspectionTaskSettings(InspectionTaskSettings source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskSettings != null) {
            this.TaskSettings = new TaskSettings[source.TaskSettings.length];
            for (int i = 0; i < source.TaskSettings.length; i++) {
                this.TaskSettings[i] = new TaskSettings(source.TaskSettings[i]);
            }
        }
        if (source.Selected != null) {
            this.Selected = new String(source.Selected);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.SettingsJson != null) {
            this.SettingsJson = new String(source.SettingsJson);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TaskSettings.", this.TaskSettings);
        this.setParamSimple(map, prefix + "Selected", this.Selected);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "SettingsJson", this.SettingsJson);

    }
}

