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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatInvoiceUserInfo extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 纳税人识别号
    */
    @SerializedName("TaxId")
    @Expose
    private String TaxId;

    /**
    * 地 址、电 话
    */
    @SerializedName("AddrTel")
    @Expose
    private String AddrTel;

    /**
    * 开户行及账号
    */
    @SerializedName("FinancialAccount")
    @Expose
    private String FinancialAccount;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 纳税人识别号 
     * @return TaxId 纳税人识别号
     */
    public String getTaxId() {
        return this.TaxId;
    }

    /**
     * Set 纳税人识别号
     * @param TaxId 纳税人识别号
     */
    public void setTaxId(String TaxId) {
        this.TaxId = TaxId;
    }

    /**
     * Get 地 址、电 话 
     * @return AddrTel 地 址、电 话
     */
    public String getAddrTel() {
        return this.AddrTel;
    }

    /**
     * Set 地 址、电 话
     * @param AddrTel 地 址、电 话
     */
    public void setAddrTel(String AddrTel) {
        this.AddrTel = AddrTel;
    }

    /**
     * Get 开户行及账号 
     * @return FinancialAccount 开户行及账号
     */
    public String getFinancialAccount() {
        return this.FinancialAccount;
    }

    /**
     * Set 开户行及账号
     * @param FinancialAccount 开户行及账号
     */
    public void setFinancialAccount(String FinancialAccount) {
        this.FinancialAccount = FinancialAccount;
    }

    public VatInvoiceUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceUserInfo(VatInvoiceUserInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaxId != null) {
            this.TaxId = new String(source.TaxId);
        }
        if (source.AddrTel != null) {
            this.AddrTel = new String(source.AddrTel);
        }
        if (source.FinancialAccount != null) {
            this.FinancialAccount = new String(source.FinancialAccount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaxId", this.TaxId);
        this.setParamSimple(map, prefix + "AddrTel", this.AddrTel);
        this.setParamSimple(map, prefix + "FinancialAccount", this.FinancialAccount);

    }
}

