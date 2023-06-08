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

public class TaskGroupInstancesExecuteRules extends AbstractModel{

    /**
    * 实例选取模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstancesExecuteMode")
    @Expose
    private Long TaskGroupInstancesExecuteMode;

    /**
    * 按比例选取模式下选取比例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstancesExecutePercent")
    @Expose
    private Long TaskGroupInstancesExecutePercent;

    /**
    * 按数量选取模式下选取数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskGroupInstancesExecuteNum")
    @Expose
    private Long TaskGroupInstancesExecuteNum;

    /**
     * Get 实例选取模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstancesExecuteMode 实例选取模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskGroupInstancesExecuteMode() {
        return this.TaskGroupInstancesExecuteMode;
    }

    /**
     * Set 实例选取模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstancesExecuteMode 实例选取模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstancesExecuteMode(Long TaskGroupInstancesExecuteMode) {
        this.TaskGroupInstancesExecuteMode = TaskGroupInstancesExecuteMode;
    }

    /**
     * Get 按比例选取模式下选取比例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstancesExecutePercent 按比例选取模式下选取比例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskGroupInstancesExecutePercent() {
        return this.TaskGroupInstancesExecutePercent;
    }

    /**
     * Set 按比例选取模式下选取比例
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstancesExecutePercent 按比例选取模式下选取比例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstancesExecutePercent(Long TaskGroupInstancesExecutePercent) {
        this.TaskGroupInstancesExecutePercent = TaskGroupInstancesExecutePercent;
    }

    /**
     * Get 按数量选取模式下选取数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskGroupInstancesExecuteNum 按数量选取模式下选取数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskGroupInstancesExecuteNum() {
        return this.TaskGroupInstancesExecuteNum;
    }

    /**
     * Set 按数量选取模式下选取数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskGroupInstancesExecuteNum 按数量选取模式下选取数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskGroupInstancesExecuteNum(Long TaskGroupInstancesExecuteNum) {
        this.TaskGroupInstancesExecuteNum = TaskGroupInstancesExecuteNum;
    }

    public TaskGroupInstancesExecuteRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupInstancesExecuteRules(TaskGroupInstancesExecuteRules source) {
        if (source.TaskGroupInstancesExecuteMode != null) {
            this.TaskGroupInstancesExecuteMode = new Long(source.TaskGroupInstancesExecuteMode);
        }
        if (source.TaskGroupInstancesExecutePercent != null) {
            this.TaskGroupInstancesExecutePercent = new Long(source.TaskGroupInstancesExecutePercent);
        }
        if (source.TaskGroupInstancesExecuteNum != null) {
            this.TaskGroupInstancesExecuteNum = new Long(source.TaskGroupInstancesExecuteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecuteMode", this.TaskGroupInstancesExecuteMode);
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecutePercent", this.TaskGroupInstancesExecutePercent);
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecuteNum", this.TaskGroupInstancesExecuteNum);

    }
}

