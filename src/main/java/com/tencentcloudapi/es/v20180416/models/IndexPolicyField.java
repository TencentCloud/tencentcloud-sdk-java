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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexPolicyField extends AbstractModel{

    /**
    * 是否开启warm阶段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmEnable")
    @Expose
    private String WarmEnable;

    /**
    * warm阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarmMinAge")
    @Expose
    private String WarmMinAge;

    /**
    * 是否开启cold阶段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdEnable")
    @Expose
    private String ColdEnable;

    /**
    * cold阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColdMinAge")
    @Expose
    private String ColdMinAge;

    /**
    * 是否开启frozen阶段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenEnable")
    @Expose
    private String FrozenEnable;

    /**
    * frozen阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrozenMinAge")
    @Expose
    private String FrozenMinAge;

    /**
     * Get 是否开启warm阶段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmEnable 是否开启warm阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarmEnable() {
        return this.WarmEnable;
    }

    /**
     * Set 是否开启warm阶段
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmEnable 是否开启warm阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmEnable(String WarmEnable) {
        this.WarmEnable = WarmEnable;
    }

    /**
     * Get warm阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarmMinAge warm阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarmMinAge() {
        return this.WarmMinAge;
    }

    /**
     * Set warm阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarmMinAge warm阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarmMinAge(String WarmMinAge) {
        this.WarmMinAge = WarmMinAge;
    }

    /**
     * Get 是否开启cold阶段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdEnable 是否开启cold阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColdEnable() {
        return this.ColdEnable;
    }

    /**
     * Set 是否开启cold阶段
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdEnable 是否开启cold阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdEnable(String ColdEnable) {
        this.ColdEnable = ColdEnable;
    }

    /**
     * Get cold阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColdMinAge cold阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColdMinAge() {
        return this.ColdMinAge;
    }

    /**
     * Set cold阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColdMinAge cold阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColdMinAge(String ColdMinAge) {
        this.ColdMinAge = ColdMinAge;
    }

    /**
     * Get 是否开启frozen阶段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenEnable 是否开启frozen阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrozenEnable() {
        return this.FrozenEnable;
    }

    /**
     * Set 是否开启frozen阶段
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenEnable 是否开启frozen阶段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenEnable(String FrozenEnable) {
        this.FrozenEnable = FrozenEnable;
    }

    /**
     * Get frozen阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrozenMinAge frozen阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrozenMinAge() {
        return this.FrozenMinAge;
    }

    /**
     * Set frozen阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrozenMinAge frozen阶段转入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrozenMinAge(String FrozenMinAge) {
        this.FrozenMinAge = FrozenMinAge;
    }

    public IndexPolicyField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexPolicyField(IndexPolicyField source) {
        if (source.WarmEnable != null) {
            this.WarmEnable = new String(source.WarmEnable);
        }
        if (source.WarmMinAge != null) {
            this.WarmMinAge = new String(source.WarmMinAge);
        }
        if (source.ColdEnable != null) {
            this.ColdEnable = new String(source.ColdEnable);
        }
        if (source.ColdMinAge != null) {
            this.ColdMinAge = new String(source.ColdMinAge);
        }
        if (source.FrozenEnable != null) {
            this.FrozenEnable = new String(source.FrozenEnable);
        }
        if (source.FrozenMinAge != null) {
            this.FrozenMinAge = new String(source.FrozenMinAge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarmEnable", this.WarmEnable);
        this.setParamSimple(map, prefix + "WarmMinAge", this.WarmMinAge);
        this.setParamSimple(map, prefix + "ColdEnable", this.ColdEnable);
        this.setParamSimple(map, prefix + "ColdMinAge", this.ColdMinAge);
        this.setParamSimple(map, prefix + "FrozenEnable", this.FrozenEnable);
        this.setParamSimple(map, prefix + "FrozenMinAge", this.FrozenMinAge);

    }
}

