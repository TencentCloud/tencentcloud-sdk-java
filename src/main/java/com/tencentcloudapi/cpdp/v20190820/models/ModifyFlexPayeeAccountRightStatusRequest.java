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

public class ModifyFlexPayeeAccountRightStatusRequest extends AbstractModel{

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 账户权益类型
SETTLEMENT:结算权益
PAYMENT:付款权益
    */
    @SerializedName("AccountRightType")
    @Expose
    private String AccountRightType;

    /**
    * 账户权益状态
ENABLE:启用
DISABLE:停用
    */
    @SerializedName("AccountRightStatus")
    @Expose
    private String AccountRightStatus;

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 账户权益类型
SETTLEMENT:结算权益
PAYMENT:付款权益 
     * @return AccountRightType 账户权益类型
SETTLEMENT:结算权益
PAYMENT:付款权益
     */
    public String getAccountRightType() {
        return this.AccountRightType;
    }

    /**
     * Set 账户权益类型
SETTLEMENT:结算权益
PAYMENT:付款权益
     * @param AccountRightType 账户权益类型
SETTLEMENT:结算权益
PAYMENT:付款权益
     */
    public void setAccountRightType(String AccountRightType) {
        this.AccountRightType = AccountRightType;
    }

    /**
     * Get 账户权益状态
ENABLE:启用
DISABLE:停用 
     * @return AccountRightStatus 账户权益状态
ENABLE:启用
DISABLE:停用
     */
    public String getAccountRightStatus() {
        return this.AccountRightStatus;
    }

    /**
     * Set 账户权益状态
ENABLE:启用
DISABLE:停用
     * @param AccountRightStatus 账户权益状态
ENABLE:启用
DISABLE:停用
     */
    public void setAccountRightStatus(String AccountRightStatus) {
        this.AccountRightStatus = AccountRightStatus;
    }

    public ModifyFlexPayeeAccountRightStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFlexPayeeAccountRightStatusRequest(ModifyFlexPayeeAccountRightStatusRequest source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.AccountRightType != null) {
            this.AccountRightType = new String(source.AccountRightType);
        }
        if (source.AccountRightStatus != null) {
            this.AccountRightStatus = new String(source.AccountRightStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "AccountRightType", this.AccountRightType);
        this.setParamSimple(map, prefix + "AccountRightStatus", this.AccountRightStatus);

    }
}

