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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartTaskInfo extends AbstractModel {

    /**
    * 批量运行任务类型，比如START，TIMESTAMP，RESTORE，RESUME等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 任务Id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 批量运行任务配置，目前仅用与实时集成基于时间位点启动。基于时间位点启动，需要设置一个name=timestamp, value=具体时间戳的RecordField的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * 操作类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 批量运行任务类型，比如START，TIMESTAMP，RESTORE，RESUME等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Event 批量运行任务类型，比如START，TIMESTAMP，RESTORE，RESUME等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 批量运行任务类型，比如START，TIMESTAMP，RESTORE，RESUME等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Event 批量运行任务类型，比如START，TIMESTAMP，RESTORE，RESUME等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 任务Id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskIds 任务Id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务Id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskIds 任务Id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 批量运行任务配置，目前仅用与实时集成基于时间位点启动。基于时间位点启动，需要设置一个name=timestamp, value=具体时间戳的RecordField的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 批量运行任务配置，目前仅用与实时集成基于时间位点启动。基于时间位点启动，需要设置一个name=timestamp, value=具体时间戳的RecordField的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set 批量运行任务配置，目前仅用与实时集成基于时间位点启动。基于时间位点启动，需要设置一个name=timestamp, value=具体时间戳的RecordField的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 批量运行任务配置，目前仅用与实时集成基于时间位点启动。基于时间位点启动，需要设置一个name=timestamp, value=具体时间戳的RecordField的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get 操作类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public StartTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartTaskInfo(StartTaskInfo source) {
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

