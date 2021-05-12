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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordPlanItem extends AbstractModel{

    /**
    * 计划ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 计划名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeTemplateId")
    @Expose
    private String TimeTemplateId;

    /**
    * 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeTemplateName")
    @Expose
    private String TimeTemplateName;

    /**
    * 录制类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 绑定的设备列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Devices")
    @Expose
    private DeviceItem [] Devices;

    /**
     * Get 计划ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanId 计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 计划ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanId 计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 计划名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeTemplateId 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeTemplateId() {
        return this.TimeTemplateId;
    }

    /**
     * Set 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeTemplateId 时间模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeTemplateId(String TimeTemplateId) {
        this.TimeTemplateId = TimeTemplateId;
    }

    /**
     * Get 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeTemplateName 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeTemplateName() {
        return this.TimeTemplateName;
    }

    /**
     * Set 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeTemplateName 时间模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeTemplateName(String TimeTemplateName) {
        this.TimeTemplateName = TimeTemplateName;
    }

    /**
     * Get 录制类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 录制类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 录制类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 录制类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 绑定的设备列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Devices 绑定的设备列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceItem [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 绑定的设备列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Devices 绑定的设备列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevices(DeviceItem [] Devices) {
        this.Devices = Devices;
    }

    public RecordPlanItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordPlanItem(RecordPlanItem source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TimeTemplateId != null) {
            this.TimeTemplateId = new String(source.TimeTemplateId);
        }
        if (source.TimeTemplateName != null) {
            this.TimeTemplateName = new String(source.TimeTemplateName);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Devices != null) {
            this.Devices = new DeviceItem[source.Devices.length];
            for (int i = 0; i < source.Devices.length; i++) {
                this.Devices[i] = new DeviceItem(source.Devices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TimeTemplateId", this.TimeTemplateId);
        this.setParamSimple(map, prefix + "TimeTemplateName", this.TimeTemplateName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);

    }
}

