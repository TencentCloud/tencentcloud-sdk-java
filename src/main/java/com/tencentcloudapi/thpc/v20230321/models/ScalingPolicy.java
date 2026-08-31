/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScalingPolicy extends AbstractModel {

    /**
    * <p>期望节点数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * <p>伸缩单位。可选值：NODE（按节点）、GPU_CARD（按 GPU 卡）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingUnit")
    @Expose
    private String ScalingUnit;

    /**
     * Get <p>期望节点数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DesiredCapacity <p>期望节点数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set <p>期望节点数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DesiredCapacity <p>期望节点数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get <p>伸缩单位。可选值：NODE（按节点）、GPU_CARD（按 GPU 卡）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingUnit <p>伸缩单位。可选值：NODE（按节点）、GPU_CARD（按 GPU 卡）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScalingUnit() {
        return this.ScalingUnit;
    }

    /**
     * Set <p>伸缩单位。可选值：NODE（按节点）、GPU_CARD（按 GPU 卡）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingUnit <p>伸缩单位。可选值：NODE（按节点）、GPU_CARD（按 GPU 卡）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingUnit(String ScalingUnit) {
        this.ScalingUnit = ScalingUnit;
    }

    public ScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScalingPolicy(ScalingPolicy source) {
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.ScalingUnit != null) {
            this.ScalingUnit = new String(source.ScalingUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "ScalingUnit", this.ScalingUnit);

    }
}

