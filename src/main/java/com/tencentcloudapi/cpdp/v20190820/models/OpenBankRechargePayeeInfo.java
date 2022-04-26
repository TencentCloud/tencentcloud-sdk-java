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

public class OpenBankRechargePayeeInfo extends AbstractModel{

    /**
    * 收款方标识
收款方类型为电子记账本时，上送渠道电子记账本ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 收款方标识类型
ACCOUNT_BOOK_ID：电子记账本ID
    */
    @SerializedName("PayeeIdType")
    @Expose
    private String PayeeIdType;

    /**
    * 收款方名称
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
     * Get 收款方标识
收款方类型为电子记账本时，上送渠道电子记账本ID 
     * @return PayeeId 收款方标识
收款方类型为电子记账本时，上送渠道电子记账本ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款方标识
收款方类型为电子记账本时，上送渠道电子记账本ID
     * @param PayeeId 收款方标识
收款方类型为电子记账本时，上送渠道电子记账本ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 收款方标识类型
ACCOUNT_BOOK_ID：电子记账本ID 
     * @return PayeeIdType 收款方标识类型
ACCOUNT_BOOK_ID：电子记账本ID
     */
    public String getPayeeIdType() {
        return this.PayeeIdType;
    }

    /**
     * Set 收款方标识类型
ACCOUNT_BOOK_ID：电子记账本ID
     * @param PayeeIdType 收款方标识类型
ACCOUNT_BOOK_ID：电子记账本ID
     */
    public void setPayeeIdType(String PayeeIdType) {
        this.PayeeIdType = PayeeIdType;
    }

    /**
     * Get 收款方名称 
     * @return PayeeName 收款方名称
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 收款方名称
     * @param PayeeName 收款方名称
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    public OpenBankRechargePayeeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankRechargePayeeInfo(OpenBankRechargePayeeInfo source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.PayeeIdType != null) {
            this.PayeeIdType = new String(source.PayeeIdType);
        }
        if (source.PayeeName != null) {
            this.PayeeName = new String(source.PayeeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "PayeeIdType", this.PayeeIdType);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);

    }
}

