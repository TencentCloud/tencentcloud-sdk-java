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

public class CreateOrderRequest extends AbstractModel{

    /**
    * 渠道编号。ZSB2B：招商银行B2B。
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * 进件成功后返给商户方的 AppId。
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 交易金额。单位：元
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 商户流水号。商户唯一订单号由字母或数字组成。
    */
    @SerializedName("TraceNo")
    @Expose
    private String TraceNo;

    /**
    * 通知地址。商户接收交易结果的通知地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 返回地址。支付成功后，页面将跳 转返回到商户的该地址。
    */
    @SerializedName("ReturnUrl")
    @Expose
    private String ReturnUrl;

    /**
     * Get 渠道编号。ZSB2B：招商银行B2B。 
     * @return ChannelCode 渠道编号。ZSB2B：招商银行B2B。
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set 渠道编号。ZSB2B：招商银行B2B。
     * @param ChannelCode 渠道编号。ZSB2B：招商银行B2B。
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get 进件成功后返给商户方的 AppId。 
     * @return MerchantAppId 进件成功后返给商户方的 AppId。
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 进件成功后返给商户方的 AppId。
     * @param MerchantAppId 进件成功后返给商户方的 AppId。
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 交易金额。单位：元 
     * @return Amount 交易金额。单位：元
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 交易金额。单位：元
     * @param Amount 交易金额。单位：元
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 商户流水号。商户唯一订单号由字母或数字组成。 
     * @return TraceNo 商户流水号。商户唯一订单号由字母或数字组成。
     */
    public String getTraceNo() {
        return this.TraceNo;
    }

    /**
     * Set 商户流水号。商户唯一订单号由字母或数字组成。
     * @param TraceNo 商户流水号。商户唯一订单号由字母或数字组成。
     */
    public void setTraceNo(String TraceNo) {
        this.TraceNo = TraceNo;
    }

    /**
     * Get 通知地址。商户接收交易结果的通知地址。 
     * @return NotifyUrl 通知地址。商户接收交易结果的通知地址。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 通知地址。商户接收交易结果的通知地址。
     * @param NotifyUrl 通知地址。商户接收交易结果的通知地址。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 返回地址。支付成功后，页面将跳 转返回到商户的该地址。 
     * @return ReturnUrl 返回地址。支付成功后，页面将跳 转返回到商户的该地址。
     */
    public String getReturnUrl() {
        return this.ReturnUrl;
    }

    /**
     * Set 返回地址。支付成功后，页面将跳 转返回到商户的该地址。
     * @param ReturnUrl 返回地址。支付成功后，页面将跳 转返回到商户的该地址。
     */
    public void setReturnUrl(String ReturnUrl) {
        this.ReturnUrl = ReturnUrl;
    }

    public CreateOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrderRequest(CreateOrderRequest source) {
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.TraceNo != null) {
            this.TraceNo = new String(source.TraceNo);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.ReturnUrl != null) {
            this.ReturnUrl = new String(source.ReturnUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "TraceNo", this.TraceNo);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "ReturnUrl", this.ReturnUrl);

    }
}

