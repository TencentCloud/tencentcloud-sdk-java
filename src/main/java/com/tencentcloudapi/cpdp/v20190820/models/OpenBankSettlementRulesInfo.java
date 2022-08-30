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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankSettlementRulesInfo extends AbstractModel{

    /**
    * ONCE：仅单次解冻（默认）
MULTI：多次解冻
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnfreezeRule")
    @Expose
    private String UnfreezeRule;

    /**
    * ONCE：仅单次退款（默认）
MULTI：多次退款
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundRule")
    @Expose
    private String RefundRule;

    /**
     * Get ONCE：仅单次解冻（默认）
MULTI：多次解冻
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnfreezeRule ONCE：仅单次解冻（默认）
MULTI：多次解冻
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnfreezeRule() {
        return this.UnfreezeRule;
    }

    /**
     * Set ONCE：仅单次解冻（默认）
MULTI：多次解冻
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnfreezeRule ONCE：仅单次解冻（默认）
MULTI：多次解冻
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnfreezeRule(String UnfreezeRule) {
        this.UnfreezeRule = UnfreezeRule;
    }

    /**
     * Get ONCE：仅单次退款（默认）
MULTI：多次退款
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundRule ONCE：仅单次退款（默认）
MULTI：多次退款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundRule() {
        return this.RefundRule;
    }

    /**
     * Set ONCE：仅单次退款（默认）
MULTI：多次退款
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundRule ONCE：仅单次退款（默认）
MULTI：多次退款
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundRule(String RefundRule) {
        this.RefundRule = RefundRule;
    }

    public OpenBankSettlementRulesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankSettlementRulesInfo(OpenBankSettlementRulesInfo source) {
        if (source.UnfreezeRule != null) {
            this.UnfreezeRule = new String(source.UnfreezeRule);
        }
        if (source.RefundRule != null) {
            this.RefundRule = new String(source.RefundRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnfreezeRule", this.UnfreezeRule);
        this.setParamSimple(map, prefix + "RefundRule", this.RefundRule);

    }
}

