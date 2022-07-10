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

public class CreateOpenBankVerificationOrderRequest extends AbstractModel{

    /**
    * 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部核销申请订单号
    */
    @SerializedName("OutVerificationId")
    @Expose
    private String OutVerificationId;

    /**
    * 核销金额，单位分
    */
    @SerializedName("VerificationAmount")
    @Expose
    private Long VerificationAmount;

    /**
    * 外部支付订单号。调用创建支付订单时，下单支付时的外部订单号。与ChannelOrderId不能同时为空。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 云企付渠道订单号。调用创建支付订单时，下单支付时的云企付渠道订单号。与OutOrderId不能同时为空。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 核销成功回调地址。若不上送，则不回调通知。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 备注。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 第三方支付渠道需要额外上送字段。详情见附录描述。
    */
    @SerializedName("ExternalVerificationData")
    @Expose
    private String ExternalVerificationData;

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
     * Get 云企付渠道商户号。外部接入平台入驻云企付平台后下发。 
     * @return ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     * @param ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 外部核销申请订单号 
     * @return OutVerificationId 外部核销申请订单号
     */
    public String getOutVerificationId() {
        return this.OutVerificationId;
    }

    /**
     * Set 外部核销申请订单号
     * @param OutVerificationId 外部核销申请订单号
     */
    public void setOutVerificationId(String OutVerificationId) {
        this.OutVerificationId = OutVerificationId;
    }

    /**
     * Get 核销金额，单位分 
     * @return VerificationAmount 核销金额，单位分
     */
    public Long getVerificationAmount() {
        return this.VerificationAmount;
    }

    /**
     * Set 核销金额，单位分
     * @param VerificationAmount 核销金额，单位分
     */
    public void setVerificationAmount(Long VerificationAmount) {
        this.VerificationAmount = VerificationAmount;
    }

    /**
     * Get 外部支付订单号。调用创建支付订单时，下单支付时的外部订单号。与ChannelOrderId不能同时为空。 
     * @return OutOrderId 外部支付订单号。调用创建支付订单时，下单支付时的外部订单号。与ChannelOrderId不能同时为空。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部支付订单号。调用创建支付订单时，下单支付时的外部订单号。与ChannelOrderId不能同时为空。
     * @param OutOrderId 外部支付订单号。调用创建支付订单时，下单支付时的外部订单号。与ChannelOrderId不能同时为空。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 云企付渠道订单号。调用创建支付订单时，下单支付时的云企付渠道订单号。与OutOrderId不能同时为空。 
     * @return ChannelOrderId 云企付渠道订单号。调用创建支付订单时，下单支付时的云企付渠道订单号。与OutOrderId不能同时为空。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付渠道订单号。调用创建支付订单时，下单支付时的云企付渠道订单号。与OutOrderId不能同时为空。
     * @param ChannelOrderId 云企付渠道订单号。调用创建支付订单时，下单支付时的云企付渠道订单号。与OutOrderId不能同时为空。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 核销成功回调地址。若不上送，则不回调通知。 
     * @return NotifyUrl 核销成功回调地址。若不上送，则不回调通知。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 核销成功回调地址。若不上送，则不回调通知。
     * @param NotifyUrl 核销成功回调地址。若不上送，则不回调通知。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 备注。 
     * @return Remark 备注。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注。
     * @param Remark 备注。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 第三方支付渠道需要额外上送字段。详情见附录描述。 
     * @return ExternalVerificationData 第三方支付渠道需要额外上送字段。详情见附录描述。
     */
    public String getExternalVerificationData() {
        return this.ExternalVerificationData;
    }

    /**
     * Set 第三方支付渠道需要额外上送字段。详情见附录描述。
     * @param ExternalVerificationData 第三方支付渠道需要额外上送字段。详情见附录描述。
     */
    public void setExternalVerificationData(String ExternalVerificationData) {
        this.ExternalVerificationData = ExternalVerificationData;
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

    public CreateOpenBankVerificationOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankVerificationOrderRequest(CreateOpenBankVerificationOrderRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutVerificationId != null) {
            this.OutVerificationId = new String(source.OutVerificationId);
        }
        if (source.VerificationAmount != null) {
            this.VerificationAmount = new Long(source.VerificationAmount);
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
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ExternalVerificationData != null) {
            this.ExternalVerificationData = new String(source.ExternalVerificationData);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "OutVerificationId", this.OutVerificationId);
        this.setParamSimple(map, prefix + "VerificationAmount", this.VerificationAmount);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ExternalVerificationData", this.ExternalVerificationData);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

