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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricValueMC extends AbstractModel{

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 对应的value值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Val")
    @Expose
    private String Val;

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 对应的value值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Val 对应的value值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVal() {
        return this.Val;
    }

    /**
     * Set 对应的value值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Val 对应的value值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVal(String Val) {
        this.Val = Val;
    }

    public MetricValueMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricValueMC(MetricValueMC source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Val != null) {
            this.Val = new String(source.Val);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Val", this.Val);

    }
}

