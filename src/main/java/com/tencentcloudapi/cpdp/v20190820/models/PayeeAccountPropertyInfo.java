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

public class PayeeAccountPropertyInfo extends AbstractModel{

    /**
    * 结算权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettleRightStatus")
    @Expose
    private String SettleRightStatus;

    /**
    * 付款权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentRightStatus")
    @Expose
    private String PaymentRightStatus;

    /**
     * Get 结算权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettleRightStatus 结算权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSettleRightStatus() {
        return this.SettleRightStatus;
    }

    /**
     * Set 结算权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettleRightStatus 结算权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettleRightStatus(String SettleRightStatus) {
        this.SettleRightStatus = SettleRightStatus;
    }

    /**
     * Get 付款权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentRightStatus 付款权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentRightStatus() {
        return this.PaymentRightStatus;
    }

    /**
     * Set 付款权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentRightStatus 付款权益状态
ENABLE:启用
DISABLE:停用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentRightStatus(String PaymentRightStatus) {
        this.PaymentRightStatus = PaymentRightStatus;
    }

    public PayeeAccountPropertyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayeeAccountPropertyInfo(PayeeAccountPropertyInfo source) {
        if (source.SettleRightStatus != null) {
            this.SettleRightStatus = new String(source.SettleRightStatus);
        }
        if (source.PaymentRightStatus != null) {
            this.PaymentRightStatus = new String(source.PaymentRightStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SettleRightStatus", this.SettleRightStatus);
        this.setParamSimple(map, prefix + "PaymentRightStatus", this.PaymentRightStatus);

    }
}

