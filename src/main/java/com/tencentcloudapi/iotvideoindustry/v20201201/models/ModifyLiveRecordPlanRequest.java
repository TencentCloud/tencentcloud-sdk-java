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

public class ModifyLiveRecordPlanRequest extends AbstractModel{

    /**
    * 录制计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 录制计划名
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 时间模板ID，固定直播时为必填
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

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
     * Get 录制计划名 
     * @return PlanName 录制计划名
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 录制计划名
     * @param PlanName 录制计划名
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 时间模板ID，固定直播时为必填 
     * @return TemplateId 时间模板ID，固定直播时为必填
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 时间模板ID，固定直播时为必填
     * @param TemplateId 时间模板ID，固定直播时为必填
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifyLiveRecordPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveRecordPlanRequest(ModifyLiveRecordPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

