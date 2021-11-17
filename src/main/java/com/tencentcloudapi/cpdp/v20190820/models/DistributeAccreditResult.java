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

public class DistributeAccreditResult extends AbstractModel{

    /**
    * 合同h5地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractUrl")
    @Expose
    private String ContractUrl;

    /**
    * 系统商户号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
     * Get 合同h5地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractUrl 合同h5地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractUrl() {
        return this.ContractUrl;
    }

    /**
     * Set 合同h5地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractUrl 合同h5地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractUrl(String ContractUrl) {
        this.ContractUrl = ContractUrl;
    }

    /**
     * Get 系统商户号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantNo 系统商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 系统商户号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantNo 系统商户号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    public DistributeAccreditResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeAccreditResult(DistributeAccreditResult source) {
        if (source.ContractUrl != null) {
            this.ContractUrl = new String(source.ContractUrl);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContractUrl", this.ContractUrl);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);

    }
}

