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

public class CreateSinglePayRequest extends AbstractModel{

    /**
    * 业务流水号，历史唯一
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 付方账户号
    */
    @SerializedName("PayAccountNumber")
    @Expose
    private String PayAccountNumber;

    /**
    * 付方账户名称
    */
    @SerializedName("PayAccountName")
    @Expose
    private String PayAccountName;

    /**
    * 金额
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 收方账户号
    */
    @SerializedName("RecvAccountNumber")
    @Expose
    private String RecvAccountNumber;

    /**
    * 收方账户名称
    */
    @SerializedName("RecvAccountName")
    @Expose
    private String RecvAccountName;

    /**
    * 付方账户CNAPS号
    */
    @SerializedName("PayBankCnaps")
    @Expose
    private String PayBankCnaps;

    /**
    * 付方账户银行大类，PayBankCnaps为空时必传（见常见问题-银企直连银行类型）
    */
    @SerializedName("PayBankType")
    @Expose
    private String PayBankType;

    /**
    * 付方账户银行所在省，PayBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
    */
    @SerializedName("PayBankProvince")
    @Expose
    private String PayBankProvince;

    /**
    * 付方账户银行所在地区，PayBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
    */
    @SerializedName("PayBankCity")
    @Expose
    private String PayBankCity;

    /**
    * 收方账户CNAPS号
    */
    @SerializedName("RecvBankCnaps")
    @Expose
    private String RecvBankCnaps;

    /**
    * 收方账户银行大类，RecvBankCnaps为空时必传（见常见问题-银企直连银行类型）
    */
    @SerializedName("RecvBankType")
    @Expose
    private String RecvBankType;

    /**
    * 收方账户银行所在省，RecvBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
    */
    @SerializedName("RecvBankProvince")
    @Expose
    private String RecvBankProvince;

    /**
    * 收方账户银行所在地区，RecvBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
    */
    @SerializedName("RecvBankCity")
    @Expose
    private String RecvBankCity;

    /**
    * 收款方证件类型（见常见问题-银企直连证件类型枚举信息）
    */
    @SerializedName("RecvCertType")
    @Expose
    private String RecvCertType;

    /**
    * 收款方证件号码
    */
    @SerializedName("RecvCertNo")
    @Expose
    private String RecvCertNo;

    /**
    * 摘要信息
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 接入环境。沙箱环境填sandbox
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 业务流水号，历史唯一 
     * @return SerialNumber 业务流水号，历史唯一
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 业务流水号，历史唯一
     * @param SerialNumber 业务流水号，历史唯一
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 付方账户号 
     * @return PayAccountNumber 付方账户号
     */
    public String getPayAccountNumber() {
        return this.PayAccountNumber;
    }

    /**
     * Set 付方账户号
     * @param PayAccountNumber 付方账户号
     */
    public void setPayAccountNumber(String PayAccountNumber) {
        this.PayAccountNumber = PayAccountNumber;
    }

    /**
     * Get 付方账户名称 
     * @return PayAccountName 付方账户名称
     */
    public String getPayAccountName() {
        return this.PayAccountName;
    }

    /**
     * Set 付方账户名称
     * @param PayAccountName 付方账户名称
     */
    public void setPayAccountName(String PayAccountName) {
        this.PayAccountName = PayAccountName;
    }

    /**
     * Get 金额 
     * @return Amount 金额
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 金额
     * @param Amount 金额
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 收方账户号 
     * @return RecvAccountNumber 收方账户号
     */
    public String getRecvAccountNumber() {
        return this.RecvAccountNumber;
    }

    /**
     * Set 收方账户号
     * @param RecvAccountNumber 收方账户号
     */
    public void setRecvAccountNumber(String RecvAccountNumber) {
        this.RecvAccountNumber = RecvAccountNumber;
    }

    /**
     * Get 收方账户名称 
     * @return RecvAccountName 收方账户名称
     */
    public String getRecvAccountName() {
        return this.RecvAccountName;
    }

    /**
     * Set 收方账户名称
     * @param RecvAccountName 收方账户名称
     */
    public void setRecvAccountName(String RecvAccountName) {
        this.RecvAccountName = RecvAccountName;
    }

    /**
     * Get 付方账户CNAPS号 
     * @return PayBankCnaps 付方账户CNAPS号
     */
    public String getPayBankCnaps() {
        return this.PayBankCnaps;
    }

    /**
     * Set 付方账户CNAPS号
     * @param PayBankCnaps 付方账户CNAPS号
     */
    public void setPayBankCnaps(String PayBankCnaps) {
        this.PayBankCnaps = PayBankCnaps;
    }

    /**
     * Get 付方账户银行大类，PayBankCnaps为空时必传（见常见问题-银企直连银行类型） 
     * @return PayBankType 付方账户银行大类，PayBankCnaps为空时必传（见常见问题-银企直连银行类型）
     */
    public String getPayBankType() {
        return this.PayBankType;
    }

    /**
     * Set 付方账户银行大类，PayBankCnaps为空时必传（见常见问题-银企直连银行类型）
     * @param PayBankType 付方账户银行大类，PayBankCnaps为空时必传（见常见问题-银企直连银行类型）
     */
    public void setPayBankType(String PayBankType) {
        this.PayBankType = PayBankType;
    }

    /**
     * Get 付方账户银行所在省，PayBankCnaps为空时必传（见常见问题-银企直连省份枚举信息） 
     * @return PayBankProvince 付方账户银行所在省，PayBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
     */
    public String getPayBankProvince() {
        return this.PayBankProvince;
    }

    /**
     * Set 付方账户银行所在省，PayBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
     * @param PayBankProvince 付方账户银行所在省，PayBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
     */
    public void setPayBankProvince(String PayBankProvince) {
        this.PayBankProvince = PayBankProvince;
    }

    /**
     * Get 付方账户银行所在地区，PayBankCnaps为空时必传（见常见问题-银企直连城市枚举信息） 
     * @return PayBankCity 付方账户银行所在地区，PayBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
     */
    public String getPayBankCity() {
        return this.PayBankCity;
    }

    /**
     * Set 付方账户银行所在地区，PayBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
     * @param PayBankCity 付方账户银行所在地区，PayBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
     */
    public void setPayBankCity(String PayBankCity) {
        this.PayBankCity = PayBankCity;
    }

    /**
     * Get 收方账户CNAPS号 
     * @return RecvBankCnaps 收方账户CNAPS号
     */
    public String getRecvBankCnaps() {
        return this.RecvBankCnaps;
    }

    /**
     * Set 收方账户CNAPS号
     * @param RecvBankCnaps 收方账户CNAPS号
     */
    public void setRecvBankCnaps(String RecvBankCnaps) {
        this.RecvBankCnaps = RecvBankCnaps;
    }

    /**
     * Get 收方账户银行大类，RecvBankCnaps为空时必传（见常见问题-银企直连银行类型） 
     * @return RecvBankType 收方账户银行大类，RecvBankCnaps为空时必传（见常见问题-银企直连银行类型）
     */
    public String getRecvBankType() {
        return this.RecvBankType;
    }

    /**
     * Set 收方账户银行大类，RecvBankCnaps为空时必传（见常见问题-银企直连银行类型）
     * @param RecvBankType 收方账户银行大类，RecvBankCnaps为空时必传（见常见问题-银企直连银行类型）
     */
    public void setRecvBankType(String RecvBankType) {
        this.RecvBankType = RecvBankType;
    }

    /**
     * Get 收方账户银行所在省，RecvBankCnaps为空时必传（见常见问题-银企直连省份枚举信息） 
     * @return RecvBankProvince 收方账户银行所在省，RecvBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
     */
    public String getRecvBankProvince() {
        return this.RecvBankProvince;
    }

    /**
     * Set 收方账户银行所在省，RecvBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
     * @param RecvBankProvince 收方账户银行所在省，RecvBankCnaps为空时必传（见常见问题-银企直连省份枚举信息）
     */
    public void setRecvBankProvince(String RecvBankProvince) {
        this.RecvBankProvince = RecvBankProvince;
    }

    /**
     * Get 收方账户银行所在地区，RecvBankCnaps为空时必传（见常见问题-银企直连城市枚举信息） 
     * @return RecvBankCity 收方账户银行所在地区，RecvBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
     */
    public String getRecvBankCity() {
        return this.RecvBankCity;
    }

    /**
     * Set 收方账户银行所在地区，RecvBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
     * @param RecvBankCity 收方账户银行所在地区，RecvBankCnaps为空时必传（见常见问题-银企直连城市枚举信息）
     */
    public void setRecvBankCity(String RecvBankCity) {
        this.RecvBankCity = RecvBankCity;
    }

    /**
     * Get 收款方证件类型（见常见问题-银企直连证件类型枚举信息） 
     * @return RecvCertType 收款方证件类型（见常见问题-银企直连证件类型枚举信息）
     */
    public String getRecvCertType() {
        return this.RecvCertType;
    }

    /**
     * Set 收款方证件类型（见常见问题-银企直连证件类型枚举信息）
     * @param RecvCertType 收款方证件类型（见常见问题-银企直连证件类型枚举信息）
     */
    public void setRecvCertType(String RecvCertType) {
        this.RecvCertType = RecvCertType;
    }

    /**
     * Get 收款方证件号码 
     * @return RecvCertNo 收款方证件号码
     */
    public String getRecvCertNo() {
        return this.RecvCertNo;
    }

    /**
     * Set 收款方证件号码
     * @param RecvCertNo 收款方证件号码
     */
    public void setRecvCertNo(String RecvCertNo) {
        this.RecvCertNo = RecvCertNo;
    }

    /**
     * Get 摘要信息 
     * @return Summary 摘要信息
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 摘要信息
     * @param Summary 摘要信息
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox 
     * @return Profile 接入环境。沙箱环境填sandbox
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox
     * @param Profile 接入环境。沙箱环境填sandbox
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public CreateSinglePayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSinglePayRequest(CreateSinglePayRequest source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.PayAccountNumber != null) {
            this.PayAccountNumber = new String(source.PayAccountNumber);
        }
        if (source.PayAccountName != null) {
            this.PayAccountName = new String(source.PayAccountName);
        }
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.RecvAccountNumber != null) {
            this.RecvAccountNumber = new String(source.RecvAccountNumber);
        }
        if (source.RecvAccountName != null) {
            this.RecvAccountName = new String(source.RecvAccountName);
        }
        if (source.PayBankCnaps != null) {
            this.PayBankCnaps = new String(source.PayBankCnaps);
        }
        if (source.PayBankType != null) {
            this.PayBankType = new String(source.PayBankType);
        }
        if (source.PayBankProvince != null) {
            this.PayBankProvince = new String(source.PayBankProvince);
        }
        if (source.PayBankCity != null) {
            this.PayBankCity = new String(source.PayBankCity);
        }
        if (source.RecvBankCnaps != null) {
            this.RecvBankCnaps = new String(source.RecvBankCnaps);
        }
        if (source.RecvBankType != null) {
            this.RecvBankType = new String(source.RecvBankType);
        }
        if (source.RecvBankProvince != null) {
            this.RecvBankProvince = new String(source.RecvBankProvince);
        }
        if (source.RecvBankCity != null) {
            this.RecvBankCity = new String(source.RecvBankCity);
        }
        if (source.RecvCertType != null) {
            this.RecvCertType = new String(source.RecvCertType);
        }
        if (source.RecvCertNo != null) {
            this.RecvCertNo = new String(source.RecvCertNo);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "PayAccountNumber", this.PayAccountNumber);
        this.setParamSimple(map, prefix + "PayAccountName", this.PayAccountName);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "RecvAccountNumber", this.RecvAccountNumber);
        this.setParamSimple(map, prefix + "RecvAccountName", this.RecvAccountName);
        this.setParamSimple(map, prefix + "PayBankCnaps", this.PayBankCnaps);
        this.setParamSimple(map, prefix + "PayBankType", this.PayBankType);
        this.setParamSimple(map, prefix + "PayBankProvince", this.PayBankProvince);
        this.setParamSimple(map, prefix + "PayBankCity", this.PayBankCity);
        this.setParamSimple(map, prefix + "RecvBankCnaps", this.RecvBankCnaps);
        this.setParamSimple(map, prefix + "RecvBankType", this.RecvBankType);
        this.setParamSimple(map, prefix + "RecvBankProvince", this.RecvBankProvince);
        this.setParamSimple(map, prefix + "RecvBankCity", this.RecvBankCity);
        this.setParamSimple(map, prefix + "RecvCertType", this.RecvCertType);
        this.setParamSimple(map, prefix + "RecvCertNo", this.RecvCertNo);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

