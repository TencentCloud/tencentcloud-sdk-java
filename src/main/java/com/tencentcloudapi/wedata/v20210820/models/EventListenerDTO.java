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

public class EventListenerDTO extends AbstractModel {

    /**
    * 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * 配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertiesList")
    @Expose
    private ParamInfoDs [] PropertiesList;

    /**
    * 事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 监听者任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private EventListenerTaskInfo TaskInfo;

    /**
    * 事件所属项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventProjectId")
    @Expose
    private String EventProjectId;

    /**
     * Get 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 关键字，一般为任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type REST_API、KAFKA
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTs 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTs 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get 配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertiesList 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfoDs [] getPropertiesList() {
        return this.PropertiesList;
    }

    /**
     * Set 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertiesList 配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertiesList(ParamInfoDs [] PropertiesList) {
        this.PropertiesList = PropertiesList;
    }

    /**
     * Get 事件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 监听者任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo 监听者任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventListenerTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 监听者任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo 监听者任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(EventListenerTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get 事件所属项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventProjectId 事件所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventProjectId() {
        return this.EventProjectId;
    }

    /**
     * Set 事件所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventProjectId 事件所属项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventProjectId(String EventProjectId) {
        this.EventProjectId = EventProjectId;
    }

    public EventListenerDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListenerDTO(EventListenerDTO source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
        }
        if (source.PropertiesList != null) {
            this.PropertiesList = new ParamInfoDs[source.PropertiesList.length];
            for (int i = 0; i < source.PropertiesList.length; i++) {
                this.PropertiesList[i] = new ParamInfoDs(source.PropertiesList[i]);
            }
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.TaskInfo != null) {
            this.TaskInfo = new EventListenerTaskInfo(source.TaskInfo);
        }
        if (source.EventProjectId != null) {
            this.EventProjectId = new String(source.EventProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamArrayObj(map, prefix + "PropertiesList.", this.PropertiesList);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamSimple(map, prefix + "EventProjectId", this.EventProjectId);

    }
}

