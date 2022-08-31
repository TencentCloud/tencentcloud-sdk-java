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

public class ApplyOpenBankSettleOrderRequest extends AbstractModel{

    /**
    * 渠道商户号
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部结算流水号
    */
    @SerializedName("OutSettleId")
    @Expose
    private String OutSettleId;

    /**
    * 结算金额
    */
    @SerializedName("SettleAmount")
    @Expose
    private Long SettleAmount;

    /**
    * 渠道名称。详见附录-枚举类型-ChannelName。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道子商户号
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 结算备注
    */
    @SerializedName("SettleDetail")
    @Expose
    private String SettleDetail;

    /**
    * 结算成功回调地址
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
     * Get 渠道商户号 
     * @return ChannelMerchantId 渠道商户号
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号
     * @param ChannelMerchantId 渠道商户号
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 外部结算流水号 
     * @return OutSettleId 外部结算流水号
     */
    public String getOutSettleId() {
        return this.OutSettleId;
    }

    /**
     * Set 外部结算流水号
     * @param OutSettleId 外部结算流水号
     */
    public void setOutSettleId(String OutSettleId) {
        this.OutSettleId = OutSettleId;
    }

    /**
     * Get 结算金额 
     * @return SettleAmount 结算金额
     */
    public Long getSettleAmount() {
        return this.SettleAmount;
    }

    /**
     * Set 结算金额
     * @param SettleAmount 结算金额
     */
    public void setSettleAmount(Long SettleAmount) {
        this.SettleAmount = SettleAmount;
    }

    /**
     * Get 渠道名称。详见附录-枚举类型-ChannelName。 
     * @return ChannelName 渠道名称。详见附录-枚举类型-ChannelName。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-枚举类型-ChannelName。
     * @param ChannelName 渠道名称。详见附录-枚举类型-ChannelName。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道子商户号 
     * @return ChannelSubMerchantId 渠道子商户号
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户号
     * @param ChannelSubMerchantId 渠道子商户号
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 结算备注 
     * @return SettleDetail 结算备注
     */
    public String getSettleDetail() {
        return this.SettleDetail;
    }

    /**
     * Set 结算备注
     * @param SettleDetail 结算备注
     */
    public void setSettleDetail(String SettleDetail) {
        this.SettleDetail = SettleDetail;
    }

    /**
     * Get 结算成功回调地址 
     * @return NotifyUrl 结算成功回调地址
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 结算成功回调地址
     * @param NotifyUrl 结算成功回调地址
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    public ApplyOpenBankSettleOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOpenBankSettleOrderRequest(ApplyOpenBankSettleOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutSettleId != null) {
            this.OutSettleId = new String(source.OutSettleId);
        }
        if (source.SettleAmount != null) {
            this.SettleAmount = new Long(source.SettleAmount);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.SettleDetail != null) {
            this.SettleDetail = new String(source.SettleDetail);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "OutSettleId", this.OutSettleId);
        this.setParamSimple(map, prefix + "SettleAmount", this.SettleAmount);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "SettleDetail", this.SettleDetail);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

