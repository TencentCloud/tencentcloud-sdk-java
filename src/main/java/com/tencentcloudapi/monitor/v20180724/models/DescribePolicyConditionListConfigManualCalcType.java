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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManualCalcType extends AbstractModel {

    /**
    * CalcType 取值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private Long [] Keys;

    /**
    * 是否必须
    */
    @SerializedName("Need")
    @Expose
    private Boolean Need;

    /**
     * Get CalcType 取值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys CalcType 取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getKeys() {
        return this.Keys;
    }

    /**
     * Set CalcType 取值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys CalcType 取值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(Long [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 是否必须 
     * @return Need 是否必须
     */
    public Boolean getNeed() {
        return this.Need;
    }

    /**
     * Set 是否必须
     * @param Need 是否必须
     */
    public void setNeed(Boolean Need) {
        this.Need = Need;
    }

    public DescribePolicyConditionListConfigManualCalcType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyConditionListConfigManualCalcType(DescribePolicyConditionListConfigManualCalcType source) {
        if (source.Keys != null) {
            this.Keys = new Long[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new Long(source.Keys[i]);
            }
        }
        if (source.Need != null) {
            this.Need = new Boolean(source.Need);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Need", this.Need);

    }
}

