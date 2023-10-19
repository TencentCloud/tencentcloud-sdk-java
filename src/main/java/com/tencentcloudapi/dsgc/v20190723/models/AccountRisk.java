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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountRisk extends AbstractModel {

    /**
    * id（可不参考）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 风险账户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskAccount")
    @Expose
    private String RiskAccount;

    /**
     * Get id（可不参考）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id id（可不参考）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id（可不参考）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id id（可不参考）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 风险账户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskAccount 风险账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskAccount() {
        return this.RiskAccount;
    }

    /**
     * Set 风险账户
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskAccount 风险账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskAccount(String RiskAccount) {
        this.RiskAccount = RiskAccount;
    }

    public AccountRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountRisk(AccountRisk source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RiskAccount != null) {
            this.RiskAccount = new String(source.RiskAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RiskAccount", this.RiskAccount);

    }
}

