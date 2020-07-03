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

public class WithdrawBill extends AbstractModel{

    /**
    * 业务提现订单号
    */
    @SerializedName("WithdrawOrderId")
    @Expose
    private String WithdrawOrderId;

    /**
    * 提现日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 提现金额，单位： 分
    */
    @SerializedName("PayAmt")
    @Expose
    private String PayAmt;

    /**
    * 聚鑫分配转入账户appid
    */
    @SerializedName("InSubAppId")
    @Expose
    private String InSubAppId;

    /**
    * 聚鑫分配转出账户appid
    */
    @SerializedName("OutSubAppId")
    @Expose
    private String OutSubAppId;

    /**
    * ISO货币代码
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 透传字段
    */
    @SerializedName("MetaData")
    @Expose
    private String MetaData;

    /**
    * 扩展字段
    */
    @SerializedName("ExtendFieldData")
    @Expose
    private String ExtendFieldData;

    /**
     * Get 业务提现订单号 
     * @return WithdrawOrderId 业务提现订单号
     */
    public String getWithdrawOrderId() {
        return this.WithdrawOrderId;
    }

    /**
     * Set 业务提现订单号
     * @param WithdrawOrderId 业务提现订单号
     */
    public void setWithdrawOrderId(String WithdrawOrderId) {
        this.WithdrawOrderId = WithdrawOrderId;
    }

    /**
     * Get 提现日期 
     * @return Date 提现日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 提现日期
     * @param Date 提现日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 提现金额，单位： 分 
     * @return PayAmt 提现金额，单位： 分
     */
    public String getPayAmt() {
        return this.PayAmt;
    }

    /**
     * Set 提现金额，单位： 分
     * @param PayAmt 提现金额，单位： 分
     */
    public void setPayAmt(String PayAmt) {
        this.PayAmt = PayAmt;
    }

    /**
     * Get 聚鑫分配转入账户appid 
     * @return InSubAppId 聚鑫分配转入账户appid
     */
    public String getInSubAppId() {
        return this.InSubAppId;
    }

    /**
     * Set 聚鑫分配转入账户appid
     * @param InSubAppId 聚鑫分配转入账户appid
     */
    public void setInSubAppId(String InSubAppId) {
        this.InSubAppId = InSubAppId;
    }

    /**
     * Get 聚鑫分配转出账户appid 
     * @return OutSubAppId 聚鑫分配转出账户appid
     */
    public String getOutSubAppId() {
        return this.OutSubAppId;
    }

    /**
     * Set 聚鑫分配转出账户appid
     * @param OutSubAppId 聚鑫分配转出账户appid
     */
    public void setOutSubAppId(String OutSubAppId) {
        this.OutSubAppId = OutSubAppId;
    }

    /**
     * Get ISO货币代码 
     * @return CurrencyType ISO货币代码
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set ISO货币代码
     * @param CurrencyType ISO货币代码
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 透传字段 
     * @return MetaData 透传字段
     */
    public String getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 透传字段
     * @param MetaData 透传字段
     */
    public void setMetaData(String MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 扩展字段 
     * @return ExtendFieldData 扩展字段
     */
    public String getExtendFieldData() {
        return this.ExtendFieldData;
    }

    /**
     * Set 扩展字段
     * @param ExtendFieldData 扩展字段
     */
    public void setExtendFieldData(String ExtendFieldData) {
        this.ExtendFieldData = ExtendFieldData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WithdrawOrderId", this.WithdrawOrderId);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PayAmt", this.PayAmt);
        this.setParamSimple(map, prefix + "InSubAppId", this.InSubAppId);
        this.setParamSimple(map, prefix + "OutSubAppId", this.OutSubAppId);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "MetaData", this.MetaData);
        this.setParamSimple(map, prefix + "ExtendFieldData", this.ExtendFieldData);

    }
}

