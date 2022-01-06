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

public class ModifyRecordingPlanRequest extends AbstractModel{

    /**
    * 录制计划ID
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
     * Get 录制计划ID 
     * @return PlanId 录制计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 录制计划ID
     * @param PlanId 录制计划ID
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

    public ModifyRecordingPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordingPlanRequest(ModifyRecordingPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TimeTemplateId != null) {
            this.TimeTemplateId = new String(source.TimeTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TimeTemplateId", this.TimeTemplateId);

    }
}

