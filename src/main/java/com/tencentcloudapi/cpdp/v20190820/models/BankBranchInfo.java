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

public class BankBranchInfo extends AbstractModel{

    /**
    * 银行名称。
    */
    @SerializedName("BankName")
    @Expose
    private String BankName;

    /**
    * 银行简称。
    */
    @SerializedName("BankAbbreviation")
    @Expose
    private String BankAbbreviation;

    /**
    * 支行名。
    */
    @SerializedName("BankBranchName")
    @Expose
    private String BankBranchName;

    /**
    * 联行号。
    */
    @SerializedName("BankBranchId")
    @Expose
    private String BankBranchId;

    /**
     * Get 银行名称。 
     * @return BankName 银行名称。
     */
    public String getBankName() {
        return this.BankName;
    }

    /**
     * Set 银行名称。
     * @param BankName 银行名称。
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * Get 银行简称。 
     * @return BankAbbreviation 银行简称。
     */
    public String getBankAbbreviation() {
        return this.BankAbbreviation;
    }

    /**
     * Set 银行简称。
     * @param BankAbbreviation 银行简称。
     */
    public void setBankAbbreviation(String BankAbbreviation) {
        this.BankAbbreviation = BankAbbreviation;
    }

    /**
     * Get 支行名。 
     * @return BankBranchName 支行名。
     */
    public String getBankBranchName() {
        return this.BankBranchName;
    }

    /**
     * Set 支行名。
     * @param BankBranchName 支行名。
     */
    public void setBankBranchName(String BankBranchName) {
        this.BankBranchName = BankBranchName;
    }

    /**
     * Get 联行号。 
     * @return BankBranchId 联行号。
     */
    public String getBankBranchId() {
        return this.BankBranchId;
    }

    /**
     * Set 联行号。
     * @param BankBranchId 联行号。
     */
    public void setBankBranchId(String BankBranchId) {
        this.BankBranchId = BankBranchId;
    }

    public BankBranchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankBranchInfo(BankBranchInfo source) {
        if (source.BankName != null) {
            this.BankName = new String(source.BankName);
        }
        if (source.BankAbbreviation != null) {
            this.BankAbbreviation = new String(source.BankAbbreviation);
        }
        if (source.BankBranchName != null) {
            this.BankBranchName = new String(source.BankBranchName);
        }
        if (source.BankBranchId != null) {
            this.BankBranchId = new String(source.BankBranchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BankName", this.BankName);
        this.setParamSimple(map, prefix + "BankAbbreviation", this.BankAbbreviation);
        this.setParamSimple(map, prefix + "BankBranchName", this.BankBranchName);
        this.setParamSimple(map, prefix + "BankBranchId", this.BankBranchId);

    }
}

