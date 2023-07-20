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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDto extends AbstractModel{

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 基线、任务实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 产生事件时间
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件状态.取值范围:

- new:表示新建
 
- processing:表示处理中
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * 事件类别/(基线or任务).取值范围:

- baseline: 表示基线

- task: 表示任务
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 是否告警
    */
    @SerializedName("IsAlarm")
    @Expose
    private String IsAlarm;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 所属任务/基线的名称
    */
    @SerializedName("BelongTo")
    @Expose
    private String BelongTo;

    /**
    * 基线、任务id
    */
    @SerializedName("BaselineId")
    @Expose
    private Long BaselineId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 基线、任务实例id 
     * @return InstanceId 基线、任务实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 基线、任务实例id
     * @param InstanceId 基线、任务实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 产生事件时间 
     * @return EventTime 产生事件时间
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set 产生事件时间
     * @param EventTime 产生事件时间
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get 事件名称 
     * @return EventName 事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
     * @param EventName 事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件状态.取值范围:

- new:表示新建
 
- processing:表示处理中 
     * @return EventStatus 事件状态.取值范围:

- new:表示新建
 
- processing:表示处理中
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 事件状态.取值范围:

- new:表示新建
 
- processing:表示处理中
     * @param EventStatus 事件状态.取值范围:

- new:表示新建
 
- processing:表示处理中
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 事件类别/(基线or任务).取值范围:

- baseline: 表示基线

- task: 表示任务 
     * @return EventType 事件类别/(基线or任务).取值范围:

- baseline: 表示基线

- task: 表示任务
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类别/(基线or任务).取值范围:

- baseline: 表示基线

- task: 表示任务
     * @param EventType 事件类别/(基线or任务).取值范围:

- baseline: 表示基线

- task: 表示任务
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 是否告警 
     * @return IsAlarm 是否告警
     */
    public String getIsAlarm() {
        return this.IsAlarm;
    }

    /**
     * Set 是否告警
     * @param IsAlarm 是否告警
     */
    public void setIsAlarm(String IsAlarm) {
        this.IsAlarm = IsAlarm;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 所属任务/基线的名称 
     * @return BelongTo 所属任务/基线的名称
     */
    public String getBelongTo() {
        return this.BelongTo;
    }

    /**
     * Set 所属任务/基线的名称
     * @param BelongTo 所属任务/基线的名称
     */
    public void setBelongTo(String BelongTo) {
        this.BelongTo = BelongTo;
    }

    /**
     * Get 基线、任务id 
     * @return BaselineId 基线、任务id
     */
    public Long getBaselineId() {
        return this.BaselineId;
    }

    /**
     * Set 基线、任务id
     * @param BaselineId 基线、任务id
     */
    public void setBaselineId(Long BaselineId) {
        this.BaselineId = BaselineId;
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
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 当前用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 主账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public EventDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDto(EventDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.IsAlarm != null) {
            this.IsAlarm = new String(source.IsAlarm);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.BelongTo != null) {
            this.BelongTo = new String(source.BelongTo);
        }
        if (source.BaselineId != null) {
            this.BaselineId = new Long(source.BaselineId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "IsAlarm", this.IsAlarm);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "BelongTo", this.BelongTo);
        this.setParamSimple(map, prefix + "BaselineId", this.BaselineId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

