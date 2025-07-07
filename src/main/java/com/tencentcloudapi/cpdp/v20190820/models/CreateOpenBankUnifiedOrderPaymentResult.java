/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOpenBankUnifiedOrderPaymentResult extends AbstractModel {

    /**
    * 云企付平台订单号。
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
    * 第三方支付平台返回支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdPayOrderId")
    @Expose
    private String ThirdPayOrderId;

    /**
    * 跳转参数渠道为TENPAY，付款方式为EBANK_PAYMENT时必选。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectInfo")
    @Expose
    private OpenBankOrderRedirectInfo RedirectInfo;

    /**
    * 外部商户订单号，只能是数字、大小写字母，且在同一个接入平台下唯一。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 渠道扩展支付信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayInfo")
    @Expose
    private String PayInfo;

    /**
    * 渠道扩展支付信息类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayInfoType")
    @Expose
    private String PayInfoType;

    /**
     * Get 云企付平台订单号。 
     * @return ChannelOrderId 云企付平台订单号。
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付平台订单号。
     * @param ChannelOrderId 云企付平台订单号。
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    /**
     * Get 第三方支付平台返回支付订单号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdPayOrderId 第三方支付平台返回支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdPayOrderId() {
        return this.ThirdPayOrderId;
    }

    /**
     * Set 第三方支付平台返回支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdPayOrderId 第三方支付平台返回支付订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdPayOrderId(String ThirdPayOrderId) {
        this.ThirdPayOrderId = ThirdPayOrderId;
    }

    /**
     * Get 跳转参数渠道为TENPAY，付款方式为EBANK_PAYMENT时必选。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectInfo 跳转参数渠道为TENPAY，付款方式为EBANK_PAYMENT时必选。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpenBankOrderRedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 跳转参数渠道为TENPAY，付款方式为EBANK_PAYMENT时必选。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectInfo 跳转参数渠道为TENPAY，付款方式为EBANK_PAYMENT时必选。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectInfo(OpenBankOrderRedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get 外部商户订单号，只能是数字、大小写字母，且在同一个接入平台下唯一。 
     * @return OutOrderId 外部商户订单号，只能是数字、大小写字母，且在同一个接入平台下唯一。
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部商户订单号，只能是数字、大小写字母，且在同一个接入平台下唯一。
     * @param OutOrderId 外部商户订单号，只能是数字、大小写字母，且在同一个接入平台下唯一。
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 渠道扩展支付信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayInfo 渠道扩展支付信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayInfo() {
        return this.PayInfo;
    }

    /**
     * Set 渠道扩展支付信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayInfo 渠道扩展支付信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayInfo(String PayInfo) {
        this.PayInfo = PayInfo;
    }

    /**
     * Get 渠道扩展支付信息类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayInfoType 渠道扩展支付信息类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayInfoType() {
        return this.PayInfoType;
    }

    /**
     * Set 渠道扩展支付信息类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayInfoType 渠道扩展支付信息类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayInfoType(String PayInfoType) {
        this.PayInfoType = PayInfoType;
    }

    public CreateOpenBankUnifiedOrderPaymentResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankUnifiedOrderPaymentResult(CreateOpenBankUnifiedOrderPaymentResult source) {
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.ThirdPayOrderId != null) {
            this.ThirdPayOrderId = new String(source.ThirdPayOrderId);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new OpenBankOrderRedirectInfo(source.RedirectInfo);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.PayInfo != null) {
            this.PayInfo = new String(source.PayInfo);
        }
        if (source.PayInfoType != null) {
            this.PayInfoType = new String(source.PayInfoType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);
        this.setParamSimple(map, prefix + "ThirdPayOrderId", this.ThirdPayOrderId);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "PayInfo", this.PayInfo);
        this.setParamSimple(map, prefix + "PayInfoType", this.PayInfoType);

    }
}

