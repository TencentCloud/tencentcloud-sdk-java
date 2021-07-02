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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MarryHistory extends AbstractModel{

    /**
    * 结婚史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Marriage")
    @Expose
    private String Marriage;

    /**
    * 生育史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fertility")
    @Expose
    private String Fertility;

    /**
     * Get 结婚史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Marriage 结婚史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarriage() {
        return this.Marriage;
    }

    /**
     * Set 结婚史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Marriage 结婚史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarriage(String Marriage) {
        this.Marriage = Marriage;
    }

    /**
     * Get 生育史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fertility 生育史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFertility() {
        return this.Fertility;
    }

    /**
     * Set 生育史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fertility 生育史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFertility(String Fertility) {
        this.Fertility = Fertility;
    }

    public MarryHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarryHistory(MarryHistory source) {
        if (source.Marriage != null) {
            this.Marriage = new String(source.Marriage);
        }
        if (source.Fertility != null) {
            this.Fertility = new String(source.Fertility);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Marriage", this.Marriage);
        this.setParamSimple(map, prefix + "Fertility", this.Fertility);

    }
}

