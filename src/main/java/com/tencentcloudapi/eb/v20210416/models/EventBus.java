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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventBus extends AbstractModel{

    /**
    * 更新时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 事件集描述，不限字符类型，200字符描述以内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * 事件集类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 连接器基础信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionBriefs")
    @Expose
    private ConnectionBrief [] ConnectionBriefs;

    /**
    * 目标简要信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetBriefs")
    @Expose
    private TargetBrief [] TargetBriefs;

    /**
     * Get 更新时间 
     * @return ModTime 更新时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 更新时间
     * @param ModTime 更新时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 事件集描述，不限字符类型，200字符描述以内 
     * @return Description 事件集描述，不限字符类型，200字符描述以内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件集描述，不限字符类型，200字符描述以内
     * @param Description 事件集描述，不限字符类型，200字符描述以内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符 
     * @return EventBusName 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     * @param EventBusName 事件集名称，只能包含字母、数字、下划线、连字符，以字母开头，以数字或字母结尾，2~60个字符
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get 事件集类型 
     * @return Type 事件集类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件集类型
     * @param Type 事件集类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 连接器基础信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionBriefs 连接器基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConnectionBrief [] getConnectionBriefs() {
        return this.ConnectionBriefs;
    }

    /**
     * Set 连接器基础信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionBriefs 连接器基础信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionBriefs(ConnectionBrief [] ConnectionBriefs) {
        this.ConnectionBriefs = ConnectionBriefs;
    }

    /**
     * Get 目标简要信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetBriefs 目标简要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetBrief [] getTargetBriefs() {
        return this.TargetBriefs;
    }

    /**
     * Set 目标简要信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetBriefs 目标简要信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetBriefs(TargetBrief [] TargetBriefs) {
        this.TargetBriefs = TargetBriefs;
    }

    public EventBus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventBus(EventBus source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ConnectionBriefs != null) {
            this.ConnectionBriefs = new ConnectionBrief[source.ConnectionBriefs.length];
            for (int i = 0; i < source.ConnectionBriefs.length; i++) {
                this.ConnectionBriefs[i] = new ConnectionBrief(source.ConnectionBriefs[i]);
            }
        }
        if (source.TargetBriefs != null) {
            this.TargetBriefs = new TargetBrief[source.TargetBriefs.length];
            for (int i = 0; i < source.TargetBriefs.length; i++) {
                this.TargetBriefs[i] = new TargetBrief(source.TargetBriefs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "ConnectionBriefs.", this.ConnectionBriefs);
        this.setParamArrayObj(map, prefix + "TargetBriefs.", this.TargetBriefs);

    }
}

