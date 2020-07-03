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

public class ApplyTradeData extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 贸易材料流水号
    */
    @SerializedName("TradeFileId")
    @Expose
    private String TradeFileId;

    /**
    * 交易币种
    */
    @SerializedName("TradeCurrency")
    @Expose
    private String TradeCurrency;

    /**
    * 交易金额
    */
    @SerializedName("TradeAmount")
    @Expose
    private String TradeAmount;

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 商户号 
     * @return MerchantId 商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号
     * @param MerchantId 商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 贸易材料流水号 
     * @return TradeFileId 贸易材料流水号
     */
    public String getTradeFileId() {
        return this.TradeFileId;
    }

    /**
     * Set 贸易材料流水号
     * @param TradeFileId 贸易材料流水号
     */
    public void setTradeFileId(String TradeFileId) {
        this.TradeFileId = TradeFileId;
    }

    /**
     * Get 交易币种 
     * @return TradeCurrency 交易币种
     */
    public String getTradeCurrency() {
        return this.TradeCurrency;
    }

    /**
     * Set 交易币种
     * @param TradeCurrency 交易币种
     */
    public void setTradeCurrency(String TradeCurrency) {
        this.TradeCurrency = TradeCurrency;
    }

    /**
     * Get 交易金额 
     * @return TradeAmount 交易金额
     */
    public String getTradeAmount() {
        return this.TradeAmount;
    }

    /**
     * Set 交易金额
     * @param TradeAmount 交易金额
     */
    public void setTradeAmount(String TradeAmount) {
        this.TradeAmount = TradeAmount;
    }

    /**
     * Get 付款人ID 
     * @return PayerId 付款人ID
     */
    public String getPayerId() {
        return this.PayerId;
    }

    /**
     * Set 付款人ID
     * @param PayerId 付款人ID
     */
    public void setPayerId(String PayerId) {
        this.PayerId = PayerId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "TradeFileId", this.TradeFileId);
        this.setParamSimple(map, prefix + "TradeCurrency", this.TradeCurrency);
        this.setParamSimple(map, prefix + "TradeAmount", this.TradeAmount);
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

