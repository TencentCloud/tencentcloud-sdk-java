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

public class ModifyFlexFundingAccountRequest extends AbstractModel{

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 收款用户资金账户ID
    */
    @SerializedName("FundingAccountBindSerialNo")
    @Expose
    private String FundingAccountBindSerialNo;

    /**
    * 资金账户类型
PINGAN_BANK:平安银行
    */
    @SerializedName("FundingAccountType")
    @Expose
    private String FundingAccountType;

    /**
    * 收款资金账户手机号
    */
    @SerializedName("PhoneNo")
    @Expose
    private String PhoneNo;

    /**
    * 收款资金账户姓名
    */
    @SerializedName("FundingAccountName")
    @Expose
    private String FundingAccountName;

    /**
    * 收款资金账户号
    */
    @SerializedName("FundingAccountNo")
    @Expose
    private String FundingAccountNo;

    /**
    * 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 开户支行名
    */
    @SerializedName("BankBranchName")
    @Expose
    private String BankBranchName;

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
     * Get 收款用户资金账户ID 
     * @return FundingAccountBindSerialNo 收款用户资金账户ID
     */
    public String getFundingAccountBindSerialNo() {
        return this.FundingAccountBindSerialNo;
    }

    /**
     * Set 收款用户资金账户ID
     * @param FundingAccountBindSerialNo 收款用户资金账户ID
     */
    public void setFundingAccountBindSerialNo(String FundingAccountBindSerialNo) {
        this.FundingAccountBindSerialNo = FundingAccountBindSerialNo;
    }

    /**
     * Get 资金账户类型
PINGAN_BANK:平安银行 
     * @return FundingAccountType 资金账户类型
PINGAN_BANK:平安银行
     */
    public String getFundingAccountType() {
        return this.FundingAccountType;
    }

    /**
     * Set 资金账户类型
PINGAN_BANK:平安银行
     * @param FundingAccountType 资金账户类型
PINGAN_BANK:平安银行
     */
    public void setFundingAccountType(String FundingAccountType) {
        this.FundingAccountType = FundingAccountType;
    }

    /**
     * Get 收款资金账户手机号 
     * @return PhoneNo 收款资金账户手机号
     */
    public String getPhoneNo() {
        return this.PhoneNo;
    }

    /**
     * Set 收款资金账户手机号
     * @param PhoneNo 收款资金账户手机号
     */
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    /**
     * Get 收款资金账户姓名 
     * @return FundingAccountName 收款资金账户姓名
     */
    public String getFundingAccountName() {
        return this.FundingAccountName;
    }

    /**
     * Set 收款资金账户姓名
     * @param FundingAccountName 收款资金账户姓名
     */
    public void setFundingAccountName(String FundingAccountName) {
        this.FundingAccountName = FundingAccountName;
    }

    /**
     * Get 收款资金账户号 
     * @return FundingAccountNo 收款资金账户号
     */
    public String getFundingAccountNo() {
        return this.FundingAccountNo;
    }

    /**
     * Set 收款资金账户号
     * @param FundingAccountNo 收款资金账户号
     */
    public void setFundingAccountNo(String FundingAccountNo) {
        this.FundingAccountNo = FundingAccountNo;
    }

    /**
     * Get 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境 
     * @return Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     * @param Environment 环境类型
__release__:生产环境
__sandbox__:沙箱环境
__test__:测试环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 开户支行名 
     * @return BankBranchName 开户支行名
     */
    public String getBankBranchName() {
        return this.BankBranchName;
    }

    /**
     * Set 开户支行名
     * @param BankBranchName 开户支行名
     */
    public void setBankBranchName(String BankBranchName) {
        this.BankBranchName = BankBranchName;
    }

    public ModifyFlexFundingAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFlexFundingAccountRequest(ModifyFlexFundingAccountRequest source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.FundingAccountBindSerialNo != null) {
            this.FundingAccountBindSerialNo = new String(source.FundingAccountBindSerialNo);
        }
        if (source.FundingAccountType != null) {
            this.FundingAccountType = new String(source.FundingAccountType);
        }
        if (source.PhoneNo != null) {
            this.PhoneNo = new String(source.PhoneNo);
        }
        if (source.FundingAccountName != null) {
            this.FundingAccountName = new String(source.FundingAccountName);
        }
        if (source.FundingAccountNo != null) {
            this.FundingAccountNo = new String(source.FundingAccountNo);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.BankBranchName != null) {
            this.BankBranchName = new String(source.BankBranchName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "FundingAccountBindSerialNo", this.FundingAccountBindSerialNo);
        this.setParamSimple(map, prefix + "FundingAccountType", this.FundingAccountType);
        this.setParamSimple(map, prefix + "PhoneNo", this.PhoneNo);
        this.setParamSimple(map, prefix + "FundingAccountName", this.FundingAccountName);
        this.setParamSimple(map, prefix + "FundingAccountNo", this.FundingAccountNo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "BankBranchName", this.BankBranchName);

    }
}

