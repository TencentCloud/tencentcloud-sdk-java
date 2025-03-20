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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordPlanItem extends AbstractModel {

    /**
    * 计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 计划名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 时间模板ID
    */
    @SerializedName("TimeTemplateId")
    @Expose
    private String TimeTemplateId;

    /**
    * 时间模板名称
    */
    @SerializedName("TimeTemplateName")
    @Expose
    private String TimeTemplateName;

    /**
    * 录制类型
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 绑定的设备列表
    */
    @SerializedName("Devices")
    @Expose
    private DeviceItem [] Devices;

    /**
    * 录像存储天数
    */
    @SerializedName("RecordStorageTime")
    @Expose
    private Long RecordStorageTime;

    /**
     * Get 计划ID 
     * @return PlanId 计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 计划ID
     * @param PlanId 计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 计划名称 
     * @return Name 计划名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 计划名称
     * @param Name 计划名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 时间模板ID 
     * @return TimeTemplateId 时间模板ID
     */
    public String getTimeTemplateId() {
        return this.TimeTemplateId;
    }

    /**
     * Set 时间模板ID
     * @param TimeTemplateId 时间模板ID
     */
    public void setTimeTemplateId(String TimeTemplateId) {
        this.TimeTemplateId = TimeTemplateId;
    }

    /**
     * Get 时间模板名称 
     * @return TimeTemplateName 时间模板名称
     */
    public String getTimeTemplateName() {
        return this.TimeTemplateName;
    }

    /**
     * Set 时间模板名称
     * @param TimeTemplateName 时间模板名称
     */
    public void setTimeTemplateName(String TimeTemplateName) {
        this.TimeTemplateName = TimeTemplateName;
    }

    /**
     * Get 录制类型 
     * @return EventId 录制类型
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 录制类型
     * @param EventId 录制类型
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 绑定的设备列表 
     * @return Devices 绑定的设备列表
     */
    public DeviceItem [] getDevices() {
        return this.Devices;
    }

    /**
     * Set 绑定的设备列表
     * @param Devices 绑定的设备列表
     */
    public void setDevices(DeviceItem [] Devices) {
        this.Devices = Devices;
    }

    /**
     * Get 录像存储天数 
     * @return RecordStorageTime 录像存储天数
     */
    public Long getRecordStorageTime() {
        return this.RecordStorageTime;
    }

    /**
     * Set 录像存储天数
     * @param RecordStorageTime 录像存储天数
     */
    public void setRecordStorageTime(Long RecordStorageTime) {
        this.RecordStorageTime = RecordStorageTime;
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
        if (source.RecordStorageTime != null) {
            this.RecordStorageTime = new Long(source.RecordStorageTime);
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
        this.setParamSimple(map, prefix + "RecordStorageTime", this.RecordStorageTime);

    }
}

