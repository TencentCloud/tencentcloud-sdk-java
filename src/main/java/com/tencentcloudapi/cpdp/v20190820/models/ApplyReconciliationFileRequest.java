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

public class ApplyReconciliationFileRequest extends AbstractModel{

    /**
    * 申请的文件类型。
__CZ__：充值文件
__TX__：提现文件
__JY__：交易文件
__YE__：余额文件
    */
    @SerializedName("ApplyFileType")
    @Expose
    private String ApplyFileType;

    /**
    * 申请的对账文件日期，格式：yyyyMMdd。
    */
    @SerializedName("ApplyFileDate")
    @Expose
    private String ApplyFileDate;

    /**
    * 父账户账号。
_平安渠道为资金汇总账号_
    */
    @SerializedName("BankAccountNumber")
    @Expose
    private String BankAccountNumber;

    /**
    * 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
     * Get 申请的文件类型。
__CZ__：充值文件
__TX__：提现文件
__JY__：交易文件
__YE__：余额文件 
     * @return ApplyFileType 申请的文件类型。
__CZ__：充值文件
__TX__：提现文件
__JY__：交易文件
__YE__：余额文件
     */
    public String getApplyFileType() {
        return this.ApplyFileType;
    }

    /**
     * Set 申请的文件类型。
__CZ__：充值文件
__TX__：提现文件
__JY__：交易文件
__YE__：余额文件
     * @param ApplyFileType 申请的文件类型。
__CZ__：充值文件
__TX__：提现文件
__JY__：交易文件
__YE__：余额文件
     */
    public void setApplyFileType(String ApplyFileType) {
        this.ApplyFileType = ApplyFileType;
    }

    /**
     * Get 申请的对账文件日期，格式：yyyyMMdd。 
     * @return ApplyFileDate 申请的对账文件日期，格式：yyyyMMdd。
     */
    public String getApplyFileDate() {
        return this.ApplyFileDate;
    }

    /**
     * Set 申请的对账文件日期，格式：yyyyMMdd。
     * @param ApplyFileDate 申请的对账文件日期，格式：yyyyMMdd。
     */
    public void setApplyFileDate(String ApplyFileDate) {
        this.ApplyFileDate = ApplyFileDate;
    }

    /**
     * Get 父账户账号。
_平安渠道为资金汇总账号_ 
     * @return BankAccountNumber 父账户账号。
_平安渠道为资金汇总账号_
     */
    public String getBankAccountNumber() {
        return this.BankAccountNumber;
    }

    /**
     * Set 父账户账号。
_平安渠道为资金汇总账号_
     * @param BankAccountNumber 父账户账号。
_平安渠道为资金汇总账号_
     */
    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    /**
     * Get 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_ 
     * @return MidasEnvironment 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
     * @param MidasEnvironment 环境名。
__release__: 现网环境
__sandbox__: 沙箱环境
__development__: 开发环境
_缺省: release_
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    public ApplyReconciliationFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyReconciliationFileRequest(ApplyReconciliationFileRequest source) {
        if (source.ApplyFileType != null) {
            this.ApplyFileType = new String(source.ApplyFileType);
        }
        if (source.ApplyFileDate != null) {
            this.ApplyFileDate = new String(source.ApplyFileDate);
        }
        if (source.BankAccountNumber != null) {
            this.BankAccountNumber = new String(source.BankAccountNumber);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyFileType", this.ApplyFileType);
        this.setParamSimple(map, prefix + "ApplyFileDate", this.ApplyFileDate);
        this.setParamSimple(map, prefix + "BankAccountNumber", this.BankAccountNumber);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

