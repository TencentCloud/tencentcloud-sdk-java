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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckBankCard2EVerificationRequest extends AbstractModel{

    /**
    * 调用方信息; 必选
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 银行卡号
    */
    @SerializedName("BankCard")
    @Expose
    private String BankCard;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 调用方信息; 必选 
     * @return Caller 调用方信息; 必选
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息; 必选
     * @param Caller 调用方信息; 必选
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 银行卡号 
     * @return BankCard 银行卡号
     */
    public String getBankCard() {
        return this.BankCard;
    }

    /**
     * Set 银行卡号
     * @param BankCard 银行卡号
     */
    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CheckBankCard2EVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckBankCard2EVerificationRequest(CheckBankCard2EVerificationRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.BankCard != null) {
            this.BankCard = new String(source.BankCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "BankCard", this.BankCard);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

