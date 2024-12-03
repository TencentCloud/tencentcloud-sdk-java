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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableZoneScatterScheduleRule extends AbstractModel {

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScatterDimension")
    @Expose
    private String ScatterDimension;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxUnbalanceQuantity")
    @Expose
    private Long MaxUnbalanceQuantity;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsForceSchedule")
    @Expose
    private Boolean IsForceSchedule;

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScatterDimension -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScatterDimension() {
        return this.ScatterDimension;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScatterDimension -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScatterDimension(String ScatterDimension) {
        this.ScatterDimension = ScatterDimension;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxUnbalanceQuantity -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxUnbalanceQuantity() {
        return this.MaxUnbalanceQuantity;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxUnbalanceQuantity -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxUnbalanceQuantity(Long MaxUnbalanceQuantity) {
        this.MaxUnbalanceQuantity = MaxUnbalanceQuantity;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsForceSchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsForceSchedule() {
        return this.IsForceSchedule;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsForceSchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsForceSchedule(Boolean IsForceSchedule) {
        this.IsForceSchedule = IsForceSchedule;
    }

    public AvailableZoneScatterScheduleRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableZoneScatterScheduleRule(AvailableZoneScatterScheduleRule source) {
        if (source.ScatterDimension != null) {
            this.ScatterDimension = new String(source.ScatterDimension);
        }
        if (source.MaxUnbalanceQuantity != null) {
            this.MaxUnbalanceQuantity = new Long(source.MaxUnbalanceQuantity);
        }
        if (source.IsForceSchedule != null) {
            this.IsForceSchedule = new Boolean(source.IsForceSchedule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScatterDimension", this.ScatterDimension);
        this.setParamSimple(map, prefix + "MaxUnbalanceQuantity", this.MaxUnbalanceQuantity);
        this.setParamSimple(map, prefix + "IsForceSchedule", this.IsForceSchedule);

    }
}

