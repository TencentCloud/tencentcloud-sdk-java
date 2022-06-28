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

public class SettleInfo extends AbstractModel{

    /**
    * 结算账户类型 
PRIVATE：对私 
BUSINESS：对公
HELIPAY渠道必传
    */
    @SerializedName("SettleAccountType")
    @Expose
    private String SettleAccountType;

    /**
    * 结算账号
HELIPAY渠道必传
    */
    @SerializedName("SettleAccountNumber")
    @Expose
    private String SettleAccountNumber;

    /**
    * 结算账户名称
HELIPAY渠道必传
    */
    @SerializedName("SettleAccountName")
    @Expose
    private String SettleAccountName;

    /**
    * 支行号
HELIPAY渠道必传
    */
    @SerializedName("BankBranchId")
    @Expose
    private String BankBranchId;

    /**
    * 支行名称
    */
    @SerializedName("BankBranchName")
    @Expose
    private String BankBranchName;

    /**
    * 结算方式 
AUTO：自动结算 
SELF：自主结算
HELIPAY渠道必传
    */
    @SerializedName("SettleMode")
    @Expose
    private String SettleMode;

    /**
    * 结算周期 
T1：工作日隔天结算 
D1：自然日隔天结算 
D0：当日结算
HELIPAY渠道必传
    */
    @SerializedName("SettlePeriod")
    @Expose
    private String SettlePeriod;

    /**
     * Get 结算账户类型 
PRIVATE：对私 
BUSINESS：对公
HELIPAY渠道必传 
     * @return SettleAccountType 结算账户类型 
PRIVATE：对私 
BUSINESS：对公
HELIPAY渠道必传
     */
    public String getSettleAccountType() {
        return this.SettleAccountType;
    }

    /**
     * Set 结算账户类型 
PRIVATE：对私 
BUSINESS：对公
HELIPAY渠道必传
     * @param SettleAccountType 结算账户类型 
PRIVATE：对私 
BUSINESS：对公
HELIPAY渠道必传
     */
    public void setSettleAccountType(String SettleAccountType) {
        this.SettleAccountType = SettleAccountType;
    }

    /**
     * Get 结算账号
HELIPAY渠道必传 
     * @return SettleAccountNumber 结算账号
HELIPAY渠道必传
     */
    public String getSettleAccountNumber() {
        return this.SettleAccountNumber;
    }

    /**
     * Set 结算账号
HELIPAY渠道必传
     * @param SettleAccountNumber 结算账号
HELIPAY渠道必传
     */
    public void setSettleAccountNumber(String SettleAccountNumber) {
        this.SettleAccountNumber = SettleAccountNumber;
    }

    /**
     * Get 结算账户名称
HELIPAY渠道必传 
     * @return SettleAccountName 结算账户名称
HELIPAY渠道必传
     */
    public String getSettleAccountName() {
        return this.SettleAccountName;
    }

    /**
     * Set 结算账户名称
HELIPAY渠道必传
     * @param SettleAccountName 结算账户名称
HELIPAY渠道必传
     */
    public void setSettleAccountName(String SettleAccountName) {
        this.SettleAccountName = SettleAccountName;
    }

    /**
     * Get 支行号
HELIPAY渠道必传 
     * @return BankBranchId 支行号
HELIPAY渠道必传
     */
    public String getBankBranchId() {
        return this.BankBranchId;
    }

    /**
     * Set 支行号
HELIPAY渠道必传
     * @param BankBranchId 支行号
HELIPAY渠道必传
     */
    public void setBankBranchId(String BankBranchId) {
        this.BankBranchId = BankBranchId;
    }

    /**
     * Get 支行名称 
     * @return BankBranchName 支行名称
     */
    public String getBankBranchName() {
        return this.BankBranchName;
    }

    /**
     * Set 支行名称
     * @param BankBranchName 支行名称
     */
    public void setBankBranchName(String BankBranchName) {
        this.BankBranchName = BankBranchName;
    }

    /**
     * Get 结算方式 
AUTO：自动结算 
SELF：自主结算
HELIPAY渠道必传 
     * @return SettleMode 结算方式 
AUTO：自动结算 
SELF：自主结算
HELIPAY渠道必传
     */
    public String getSettleMode() {
        return this.SettleMode;
    }

    /**
     * Set 结算方式 
AUTO：自动结算 
SELF：自主结算
HELIPAY渠道必传
     * @param SettleMode 结算方式 
AUTO：自动结算 
SELF：自主结算
HELIPAY渠道必传
     */
    public void setSettleMode(String SettleMode) {
        this.SettleMode = SettleMode;
    }

    /**
     * Get 结算周期 
T1：工作日隔天结算 
D1：自然日隔天结算 
D0：当日结算
HELIPAY渠道必传 
     * @return SettlePeriod 结算周期 
T1：工作日隔天结算 
D1：自然日隔天结算 
D0：当日结算
HELIPAY渠道必传
     */
    public String getSettlePeriod() {
        return this.SettlePeriod;
    }

    /**
     * Set 结算周期 
T1：工作日隔天结算 
D1：自然日隔天结算 
D0：当日结算
HELIPAY渠道必传
     * @param SettlePeriod 结算周期 
T1：工作日隔天结算 
D1：自然日隔天结算 
D0：当日结算
HELIPAY渠道必传
     */
    public void setSettlePeriod(String SettlePeriod) {
        this.SettlePeriod = SettlePeriod;
    }

    public SettleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SettleInfo(SettleInfo source) {
        if (source.SettleAccountType != null) {
            this.SettleAccountType = new String(source.SettleAccountType);
        }
        if (source.SettleAccountNumber != null) {
            this.SettleAccountNumber = new String(source.SettleAccountNumber);
        }
        if (source.SettleAccountName != null) {
            this.SettleAccountName = new String(source.SettleAccountName);
        }
        if (source.BankBranchId != null) {
            this.BankBranchId = new String(source.BankBranchId);
        }
        if (source.BankBranchName != null) {
            this.BankBranchName = new String(source.BankBranchName);
        }
        if (source.SettleMode != null) {
            this.SettleMode = new String(source.SettleMode);
        }
        if (source.SettlePeriod != null) {
            this.SettlePeriod = new String(source.SettlePeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SettleAccountType", this.SettleAccountType);
        this.setParamSimple(map, prefix + "SettleAccountNumber", this.SettleAccountNumber);
        this.setParamSimple(map, prefix + "SettleAccountName", this.SettleAccountName);
        this.setParamSimple(map, prefix + "BankBranchId", this.BankBranchId);
        this.setParamSimple(map, prefix + "BankBranchName", this.BankBranchName);
        this.setParamSimple(map, prefix + "SettleMode", this.SettleMode);
        this.setParamSimple(map, prefix + "SettlePeriod", this.SettlePeriod);

    }
}

