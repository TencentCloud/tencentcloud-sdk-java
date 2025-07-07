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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceTag extends AbstractModel {

    /**
    * 计价名称（枚举值：tps：TPS基础价；stepTps：TPS步长）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 计费项对应的步长数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get 计价名称（枚举值：tps：TPS基础价；stepTps：TPS步长） 
     * @return Name 计价名称（枚举值：tps：TPS基础价；stepTps：TPS步长）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 计价名称（枚举值：tps：TPS基础价；stepTps：TPS步长）
     * @param Name 计价名称（枚举值：tps：TPS基础价；stepTps：TPS步长）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 计费项对应的步长数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Step 计费项对应的步长数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 计费项对应的步长数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Step 计费项对应的步长数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public PriceTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceTag(PriceTag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

