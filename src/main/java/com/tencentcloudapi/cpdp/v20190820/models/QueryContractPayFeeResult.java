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

public class QueryContractPayFeeResult extends AbstractModel{

    /**
    * pay支付方式json数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pay")
    @Expose
    private PayDataResult Pay;

    /**
    * 合同扩展自定义字段
    */
    @SerializedName("ExtraInput")
    @Expose
    private String [] ExtraInput;

    /**
    * pay_fee支付方式行业分类费率json数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayFee")
    @Expose
    private PayFeeDataResult [] PayFee;

    /**
     * Get pay支付方式json数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pay pay支付方式json数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PayDataResult getPay() {
        return this.Pay;
    }

    /**
     * Set pay支付方式json数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pay pay支付方式json数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPay(PayDataResult Pay) {
        this.Pay = Pay;
    }

    /**
     * Get 合同扩展自定义字段 
     * @return ExtraInput 合同扩展自定义字段
     */
    public String [] getExtraInput() {
        return this.ExtraInput;
    }

    /**
     * Set 合同扩展自定义字段
     * @param ExtraInput 合同扩展自定义字段
     */
    public void setExtraInput(String [] ExtraInput) {
        this.ExtraInput = ExtraInput;
    }

    /**
     * Get pay_fee支付方式行业分类费率json数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayFee pay_fee支付方式行业分类费率json数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PayFeeDataResult [] getPayFee() {
        return this.PayFee;
    }

    /**
     * Set pay_fee支付方式行业分类费率json数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayFee pay_fee支付方式行业分类费率json数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayFee(PayFeeDataResult [] PayFee) {
        this.PayFee = PayFee;
    }

    public QueryContractPayFeeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryContractPayFeeResult(QueryContractPayFeeResult source) {
        if (source.Pay != null) {
            this.Pay = new PayDataResult(source.Pay);
        }
        if (source.ExtraInput != null) {
            this.ExtraInput = new String[source.ExtraInput.length];
            for (int i = 0; i < source.ExtraInput.length; i++) {
                this.ExtraInput[i] = new String(source.ExtraInput[i]);
            }
        }
        if (source.PayFee != null) {
            this.PayFee = new PayFeeDataResult[source.PayFee.length];
            for (int i = 0; i < source.PayFee.length; i++) {
                this.PayFee[i] = new PayFeeDataResult(source.PayFee[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Pay.", this.Pay);
        this.setParamArraySimple(map, prefix + "ExtraInput.", this.ExtraInput);
        this.setParamArrayObj(map, prefix + "PayFee.", this.PayFee);

    }
}

