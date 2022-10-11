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

public class CompanyTitleResult extends AbstractModel{

    /**
    * 公司银行账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyBankAccount")
    @Expose
    private String CompanyBankAccount;

    /**
    * 公司地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyAddress")
    @Expose
    private String CompanyAddress;

    /**
    * 公司税号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyTaxpayerNum")
    @Expose
    private String CompanyTaxpayerNum;

    /**
    * 公司名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 公司银行名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyBankName")
    @Expose
    private String CompanyBankName;

    /**
    * 公司电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyPhone")
    @Expose
    private String CompanyPhone;

    /**
     * Get 公司银行账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyBankAccount 公司银行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyBankAccount() {
        return this.CompanyBankAccount;
    }

    /**
     * Set 公司银行账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyBankAccount 公司银行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyBankAccount(String CompanyBankAccount) {
        this.CompanyBankAccount = CompanyBankAccount;
    }

    /**
     * Get 公司地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyAddress 公司地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyAddress() {
        return this.CompanyAddress;
    }

    /**
     * Set 公司地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyAddress 公司地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyAddress(String CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    /**
     * Get 公司税号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyTaxpayerNum 公司税号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyTaxpayerNum() {
        return this.CompanyTaxpayerNum;
    }

    /**
     * Set 公司税号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyTaxpayerNum 公司税号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyTaxpayerNum(String CompanyTaxpayerNum) {
        this.CompanyTaxpayerNum = CompanyTaxpayerNum;
    }

    /**
     * Get 公司名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyName 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyName 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 公司银行名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyBankName 公司银行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyBankName() {
        return this.CompanyBankName;
    }

    /**
     * Set 公司银行名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyBankName 公司银行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyBankName(String CompanyBankName) {
        this.CompanyBankName = CompanyBankName;
    }

    /**
     * Get 公司电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyPhone 公司电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompanyPhone() {
        return this.CompanyPhone;
    }

    /**
     * Set 公司电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyPhone 公司电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyPhone(String CompanyPhone) {
        this.CompanyPhone = CompanyPhone;
    }

    public CompanyTitleResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompanyTitleResult(CompanyTitleResult source) {
        if (source.CompanyBankAccount != null) {
            this.CompanyBankAccount = new String(source.CompanyBankAccount);
        }
        if (source.CompanyAddress != null) {
            this.CompanyAddress = new String(source.CompanyAddress);
        }
        if (source.CompanyTaxpayerNum != null) {
            this.CompanyTaxpayerNum = new String(source.CompanyTaxpayerNum);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyBankName != null) {
            this.CompanyBankName = new String(source.CompanyBankName);
        }
        if (source.CompanyPhone != null) {
            this.CompanyPhone = new String(source.CompanyPhone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyBankAccount", this.CompanyBankAccount);
        this.setParamSimple(map, prefix + "CompanyAddress", this.CompanyAddress);
        this.setParamSimple(map, prefix + "CompanyTaxpayerNum", this.CompanyTaxpayerNum);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyBankName", this.CompanyBankName);
        this.setParamSimple(map, prefix + "CompanyPhone", this.CompanyPhone);

    }
}

