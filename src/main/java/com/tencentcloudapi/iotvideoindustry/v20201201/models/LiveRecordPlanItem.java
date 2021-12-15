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

public class LiveRecordPlanItem extends AbstractModel{

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
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

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
     * @return PlanName 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanName 计划名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    public LiveRecordPlanItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordPlanItem(LiveRecordPlanItem source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);

    }
}

