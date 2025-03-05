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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Range extends AbstractModel {

    /**
    * 最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
     * Get 最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get 最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max 最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    public Range() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Range(Range source) {
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

