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

public class RefundOpenBankOrderRequest extends AbstractModel{

    /**
    * 外部商户退款单号。
    */
    @SerializedName("OutRefundId")
    @Expose
    private String OutRefundId;

    /**
    * 退款金额。单位分。
    */
    @SerializedName("RefundAmount")
    @Expose
    private Long RefundAmount;

    /**
    * 渠道商户号。外部平台接入云企付平台下发。必填。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部商户订单号，与云企付渠道订单号二者不能同时为空。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 云企付渠道订单号，与外部订单号二者不能同时为空。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 退款通知地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 退款原因。
当EBANK_PAYMENT担保支付订单退款时，此字段必传。
    */
    @SerializedName("RefundReason")
    @Expose
    private String RefundReason;

    /**
    * 第三方渠道退款附加信息。详见附录-复杂类型。
若未作特殊说明，则无需传入。
    */
    @SerializedName("ExternalRefundData")
    @Expose
    private String ExternalRefundData;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 分账信息列表。
    */
    @SerializedName("ProfitShareInfoList")
    @Expose
    private OpenBankProfitShareInfo [] ProfitShareInfoList;

    /**
     * Get 外部商户退款单号。 
     * @return OutRefundId 外部商户退款单号。
     */
    public String getOutRefundId() {
        return this.OutRefundId;
    }

    /**
     * Set 外部商户退款单号。
     * @param OutRefundId 外部商户退款单号。
     */
    public void setOutRefundId(String OutRefundId) {
        this.OutRefundId = OutRefundId;
    }

    /**
     * Get 退款金额。单位分。 
     * @return RefundAmount 退款金额。单位分。
     */
    public Long getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set 退款金额。单位分。
     * @param RefundAmount 退款金额。单位分。
     */
    public void setRefundAmount(Long RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    /**
     * Get 渠道商户号。外部平台接入云企付平台下发。必填。 
     * @return ChannelMerchantId 渠道商户号。外部平台接入云企付平台下发。必填。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号。外部平台接入云企付平台下发。必填。
     * @param ChannelMerchantId 渠道商户号。外部平台接入云企付平台下发。必填。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 外部商户订单号，与云企付渠道订单号二者不能同时为空。 
     * @return OutOrderId 外部商户订单号，与云企付渠道订单号二者不能同时为空。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号，与云企付渠道订单号二者不能同时为空。
     * @param OutOrderId 外部商户订单号，与云企付渠道订单号二者不能同时为空。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 云企付渠道订单号，与外部订单号二者不能同时为空。 
     * @return ChannelOrderId 云企付渠道订单号，与外部订单号二者不能同时为空。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付渠道订单号，与外部订单号二者不能同时为空。
     * @param ChannelOrderId 云企付渠道订单号，与外部订单号二者不能同时为空。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 退款通知地址。 
     * @return NotifyUrl 退款通知地址。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 退款通知地址。
     * @param NotifyUrl 退款通知地址。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 退款原因。
当EBANK_PAYMENT担保支付订单退款时，此字段必传。 
     * @return RefundReason 退款原因。
当EBANK_PAYMENT担保支付订单退款时，此字段必传。
     */
    public String getRefundReason() {
        return this.RefundReason;
    }

    /**
     * Set 退款原因。
当EBANK_PAYMENT担保支付订单退款时，此字段必传。
     * @param RefundReason 退款原因。
当EBANK_PAYMENT担保支付订单退款时，此字段必传。
     */
    public void setRefundReason(String RefundReason) {
        this.RefundReason = RefundReason;
    }

    /**
     * Get 第三方渠道退款附加信息。详见附录-复杂类型。
若未作特殊说明，则无需传入。 
     * @return ExternalRefundData 第三方渠道退款附加信息。详见附录-复杂类型。
若未作特殊说明，则无需传入。
     */
    public String getExternalRefundData() {
        return this.ExternalRefundData;
    }

    /**
     * Set 第三方渠道退款附加信息。详见附录-复杂类型。
若未作特殊说明，则无需传入。
     * @param ExternalRefundData 第三方渠道退款附加信息。详见附录-复杂类型。
若未作特殊说明，则无需传入。
     */
    public void setExternalRefundData(String ExternalRefundData) {
        this.ExternalRefundData = ExternalRefundData;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 分账信息列表。 
     * @return ProfitShareInfoList 分账信息列表。
     */
    public OpenBankProfitShareInfo [] getProfitShareInfoList() {
        return this.ProfitShareInfoList;
    }

    /**
     * Set 分账信息列表。
     * @param ProfitShareInfoList 分账信息列表。
     */
    public void setProfitShareInfoList(OpenBankProfitShareInfo [] ProfitShareInfoList) {
        this.ProfitShareInfoList = ProfitShareInfoList;
    }

    public RefundOpenBankOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundOpenBankOrderRequest(RefundOpenBankOrderRequest source) {
        if (source.OutRefundId != null) {
            this.OutRefundId = new String(source.OutRefundId);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new Long(source.RefundAmount);
        }
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.RefundReason != null) {
            this.RefundReason = new String(source.RefundReason);
        }
        if (source.ExternalRefundData != null) {
            this.ExternalRefundData = new String(source.ExternalRefundData);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ProfitShareInfoList != null) {
            this.ProfitShareInfoList = new OpenBankProfitShareInfo[source.ProfitShareInfoList.length];
            for (int i = 0; i < source.ProfitShareInfoList.length; i++) {
                this.ProfitShareInfoList[i] = new OpenBankProfitShareInfo(source.ProfitShareInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutRefundId", this.OutRefundId);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "RefundReason", this.RefundReason);
        this.setParamSimple(map, prefix + "ExternalRefundData", this.ExternalRefundData);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamArrayObj(map, prefix + "ProfitShareInfoList.", this.ProfitShareInfoList);

    }
}

