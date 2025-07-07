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

public class AiOpsEventListenerDTO extends AbstractModel {

    /**
    * 事件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目展示名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 事件周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 事件项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 扩展名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertiesList")
    @Expose
    private ParamInfoDs [] PropertiesList;

    /**
    * 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
     * Get 事件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 事件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 事件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 项目展示名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectDisplayName 项目展示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set 项目展示名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectDisplayName 项目展示名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get 事件周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSubType 事件周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSubType 事件周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 事件项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 事件项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 事件项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 事件项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 扩展名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertiesList 扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfoDs [] getPropertiesList() {
        return this.PropertiesList;
    }

    /**
     * Set 扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertiesList 扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertiesList(ParamInfoDs [] PropertiesList) {
        this.PropertiesList = PropertiesList;
    }

    /**
     * Get 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventBroadcastType 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventBroadcastType 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    public AiOpsEventListenerDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiOpsEventListenerDTO(AiOpsEventListenerDTO source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PropertiesList != null) {
            this.PropertiesList = new ParamInfoDs[source.PropertiesList.length];
            for (int i = 0; i < source.PropertiesList.length; i++) {
                this.PropertiesList[i] = new ParamInfoDs(source.PropertiesList[i]);
            }
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "PropertiesList.", this.PropertiesList);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);

    }
}

