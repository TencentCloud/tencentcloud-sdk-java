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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRecordPlanRequest extends AbstractModel{

    /**
    * 计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 修改计划的内容
    */
    @SerializedName("Mod")
    @Expose
    private UpdateRecordPlanData Mod;

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
     * Get 修改计划的内容 
     * @return Mod 修改计划的内容
     */
    public UpdateRecordPlanData getMod() {
        return this.Mod;
    }

    /**
     * Set 修改计划的内容
     * @param Mod 修改计划的内容
     */
    public void setMod(UpdateRecordPlanData Mod) {
        this.Mod = Mod;
    }

    public UpdateRecordPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRecordPlanRequest(UpdateRecordPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Mod != null) {
            this.Mod = new UpdateRecordPlanData(source.Mod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamObj(map, prefix + "Mod.", this.Mod);

    }
}

