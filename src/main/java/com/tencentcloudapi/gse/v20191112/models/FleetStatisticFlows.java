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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetStatisticFlows extends AbstractModel{

    /**
    * 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedFlowMegaBytes")
    @Expose
    private Float TotalUsedFlowMegaBytes;

    /**
    * 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
     * Get 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedFlowMegaBytes 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalUsedFlowMegaBytes() {
        return this.TotalUsedFlowMegaBytes;
    }

    /**
     * Set 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedFlowMegaBytes 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedFlowMegaBytes(Float TotalUsedFlowMegaBytes) {
        this.TotalUsedFlowMegaBytes = TotalUsedFlowMegaBytes;
    }

    /**
     * Get 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 统计开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    public FleetStatisticFlows() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FleetStatisticFlows(FleetStatisticFlows source) {
        if (source.TotalUsedFlowMegaBytes != null) {
            this.TotalUsedFlowMegaBytes = new Float(source.TotalUsedFlowMegaBytes);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalUsedFlowMegaBytes", this.TotalUsedFlowMegaBytes);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);

    }
}

