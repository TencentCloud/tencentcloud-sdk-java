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

public class CustomPodSchedule extends AbstractModel {

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceSchedule")
    @Expose
    private ForceSchedule ForceSchedule;

    /**
    * -
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrySchedule")
    @Expose
    private TrySchedule TrySchedule;

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceSchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceSchedule getForceSchedule() {
        return this.ForceSchedule;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceSchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceSchedule(ForceSchedule ForceSchedule) {
        this.ForceSchedule = ForceSchedule;
    }

    /**
     * Get -
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrySchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrySchedule getTrySchedule() {
        return this.TrySchedule;
    }

    /**
     * Set -
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrySchedule -
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrySchedule(TrySchedule TrySchedule) {
        this.TrySchedule = TrySchedule;
    }

    public CustomPodSchedule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomPodSchedule(CustomPodSchedule source) {
        if (source.ForceSchedule != null) {
            this.ForceSchedule = new ForceSchedule(source.ForceSchedule);
        }
        if (source.TrySchedule != null) {
            this.TrySchedule = new TrySchedule(source.TrySchedule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ForceSchedule.", this.ForceSchedule);
        this.setParamObj(map, prefix + "TrySchedule.", this.TrySchedule);

    }
}

