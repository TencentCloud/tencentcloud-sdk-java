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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelateTask extends AbstractModel {

    /**
    * 任务类型

- OfflineIntegration --- 离线集成任务
- RealtimeIntegration --- 实时集成任务
- DataDevelopment --- 数据开发任务
- DataQuality --- 数据质量任务
- DataService --- 数据服务任务
- MetadataCollection --- 元数据采集任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务数量
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * 任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskList")
    @Expose
    private BriefTask [] TaskList;

    /**
     * Get 任务类型

- OfflineIntegration --- 离线集成任务
- RealtimeIntegration --- 实时集成任务
- DataDevelopment --- 数据开发任务
- DataQuality --- 数据质量任务
- DataService --- 数据服务任务
- MetadataCollection --- 元数据采集任务 
     * @return TaskType 任务类型

- OfflineIntegration --- 离线集成任务
- RealtimeIntegration --- 实时集成任务
- DataDevelopment --- 数据开发任务
- DataQuality --- 数据质量任务
- DataService --- 数据服务任务
- MetadataCollection --- 元数据采集任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型

- OfflineIntegration --- 离线集成任务
- RealtimeIntegration --- 实时集成任务
- DataDevelopment --- 数据开发任务
- DataQuality --- 数据质量任务
- DataService --- 数据服务任务
- MetadataCollection --- 元数据采集任务
     * @param TaskType 任务类型

- OfflineIntegration --- 离线集成任务
- RealtimeIntegration --- 实时集成任务
- DataDevelopment --- 数据开发任务
- DataQuality --- 数据质量任务
- DataService --- 数据服务任务
- MetadataCollection --- 元数据采集任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务数量 
     * @return TaskNum 任务数量
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set 任务数量
     * @param TaskNum 任务数量
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get 任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskList 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BriefTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskList 任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskList(BriefTask [] TaskList) {
        this.TaskList = TaskList;
    }

    public RelateTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelateTask(RelateTask source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskNum != null) {
            this.TaskNum = new Long(source.TaskNum);
        }
        if (source.TaskList != null) {
            this.TaskList = new BriefTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new BriefTask(source.TaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);

    }
}

