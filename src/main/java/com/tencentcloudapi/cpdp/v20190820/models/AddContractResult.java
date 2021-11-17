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

public class AddContractResult extends AbstractModel{

    /**
    * 合同主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractId")
    @Expose
    private String ContractId;

    /**
     * Get 合同主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractId 合同主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractId() {
        return this.ContractId;
    }

    /**
     * Set 合同主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractId 合同主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractId(String ContractId) {
        this.ContractId = ContractId;
    }

    public AddContractResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddContractResult(AddContractResult source) {
        if (source.ContractId != null) {
            this.ContractId = new String(source.ContractId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContractId", this.ContractId);

    }
}

