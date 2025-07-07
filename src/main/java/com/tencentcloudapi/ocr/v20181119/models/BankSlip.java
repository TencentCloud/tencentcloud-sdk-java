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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankSlip extends AbstractModel {

    /**
    * 银行回单信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankSlipInfos")
    @Expose
    private BankSlipInfo [] BankSlipInfos;

    /**
    * 银行回单信息常用字段
    */
    @SerializedName("CommonBankSlipInfos")
    @Expose
    private BankSlipInfo [] CommonBankSlipInfos;

    /**
     * Get 银行回单信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankSlipInfos 银行回单信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BankSlipInfo [] getBankSlipInfos() {
        return this.BankSlipInfos;
    }

    /**
     * Set 银行回单信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankSlipInfos 银行回单信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankSlipInfos(BankSlipInfo [] BankSlipInfos) {
        this.BankSlipInfos = BankSlipInfos;
    }

    /**
     * Get 银行回单信息常用字段 
     * @return CommonBankSlipInfos 银行回单信息常用字段
     */
    public BankSlipInfo [] getCommonBankSlipInfos() {
        return this.CommonBankSlipInfos;
    }

    /**
     * Set 银行回单信息常用字段
     * @param CommonBankSlipInfos 银行回单信息常用字段
     */
    public void setCommonBankSlipInfos(BankSlipInfo [] CommonBankSlipInfos) {
        this.CommonBankSlipInfos = CommonBankSlipInfos;
    }

    public BankSlip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankSlip(BankSlip source) {
        if (source.BankSlipInfos != null) {
            this.BankSlipInfos = new BankSlipInfo[source.BankSlipInfos.length];
            for (int i = 0; i < source.BankSlipInfos.length; i++) {
                this.BankSlipInfos[i] = new BankSlipInfo(source.BankSlipInfos[i]);
            }
        }
        if (source.CommonBankSlipInfos != null) {
            this.CommonBankSlipInfos = new BankSlipInfo[source.CommonBankSlipInfos.length];
            for (int i = 0; i < source.CommonBankSlipInfos.length; i++) {
                this.CommonBankSlipInfos[i] = new BankSlipInfo(source.CommonBankSlipInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BankSlipInfos.", this.BankSlipInfos);
        this.setParamArrayObj(map, prefix + "CommonBankSlipInfos.", this.CommonBankSlipInfos);

    }
}

