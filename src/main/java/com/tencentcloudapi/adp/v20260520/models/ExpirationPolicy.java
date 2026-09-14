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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpirationPolicy extends AbstractModel {

    /**
    * <p>有效时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectivePeriod")
    @Expose
    private EffectivePeriod EffectivePeriod;

    /**
    * <p>超过有效时间后的行为：1=NOT_RETRIEVABLE 不可被检索，2=RETRIEVABLE 仍可被检索；永久有效时无意义<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>未指定（服务端按默认处理）</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>不可被检索（到期下架）</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>仍可被检索（到期不下架，仅标记时效范围）</td></tr></tbody></table></p>
    */
    @SerializedName("ExpireBehavior")
    @Expose
    private Long ExpireBehavior;

    /**
     * Get <p>有效时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectivePeriod <p>有效时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EffectivePeriod getEffectivePeriod() {
        return this.EffectivePeriod;
    }

    /**
     * Set <p>有效时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectivePeriod <p>有效时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectivePeriod(EffectivePeriod EffectivePeriod) {
        this.EffectivePeriod = EffectivePeriod;
    }

    /**
     * Get <p>超过有效时间后的行为：1=NOT_RETRIEVABLE 不可被检索，2=RETRIEVABLE 仍可被检索；永久有效时无意义<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>未指定（服务端按默认处理）</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>不可被检索（到期下架）</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>仍可被检索（到期不下架，仅标记时效范围）</td></tr></tbody></table></p> 
     * @return ExpireBehavior <p>超过有效时间后的行为：1=NOT_RETRIEVABLE 不可被检索，2=RETRIEVABLE 仍可被检索；永久有效时无意义<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>未指定（服务端按默认处理）</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>不可被检索（到期下架）</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>仍可被检索（到期不下架，仅标记时效范围）</td></tr></tbody></table></p>
     */
    public Long getExpireBehavior() {
        return this.ExpireBehavior;
    }

    /**
     * Set <p>超过有效时间后的行为：1=NOT_RETRIEVABLE 不可被检索，2=RETRIEVABLE 仍可被检索；永久有效时无意义<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>未指定（服务端按默认处理）</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>不可被检索（到期下架）</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>仍可被检索（到期不下架，仅标记时效范围）</td></tr></tbody></table></p>
     * @param ExpireBehavior <p>超过有效时间后的行为：1=NOT_RETRIEVABLE 不可被检索，2=RETRIEVABLE 仍可被检索；永久有效时无意义<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>EXPIRE_BEHAVIOR_UNKNOWN</td><td>0</td><td>未指定（服务端按默认处理）</td></tr><tr><td>EXPIRE_BEHAVIOR_NOT_RETRIEVABLE</td><td>1</td><td>不可被检索（到期下架）</td></tr><tr><td>EXPIRE_BEHAVIOR_RETRIEVABLE</td><td>2</td><td>仍可被检索（到期不下架，仅标记时效范围）</td></tr></tbody></table></p>
     */
    public void setExpireBehavior(Long ExpireBehavior) {
        this.ExpireBehavior = ExpireBehavior;
    }

    public ExpirationPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpirationPolicy(ExpirationPolicy source) {
        if (source.EffectivePeriod != null) {
            this.EffectivePeriod = new EffectivePeriod(source.EffectivePeriod);
        }
        if (source.ExpireBehavior != null) {
            this.ExpireBehavior = new Long(source.ExpireBehavior);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EffectivePeriod.", this.EffectivePeriod);
        this.setParamSimple(map, prefix + "ExpireBehavior", this.ExpireBehavior);

    }
}

