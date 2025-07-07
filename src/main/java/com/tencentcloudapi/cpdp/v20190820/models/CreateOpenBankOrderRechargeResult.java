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

public class CreateOpenBankOrderRechargeResult extends AbstractModel {

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
    * 跳转参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectInfo")
    @Expose
    private OpenBankRechargeRedirectInfo RedirectInfo;

    /**
    * 外部商户订单号，只能是数字、大小写字母，且在同一个接入平台下唯一。
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 充值状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealStatus")
    @Expose
    private String DealStatus;

    /**
    * 充值返回描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealMessage")
    @Expose
    private String DealMessage;

    /**
    * PC web端跳转链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PcWebUrl")
    @Expose
    private String PcWebUrl;

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
     * Get 跳转参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectInfo 跳转参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OpenBankRechargeRedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 跳转参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectInfo 跳转参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectInfo(OpenBankRechargeRedirectInfo RedirectInfo) {
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
     * Get 充值状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealStatus 充值状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealStatus() {
        return this.DealStatus;
    }

    /**
     * Set 充值状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealStatus 充值状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealStatus(String DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * Get 充值返回描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealMessage 充值返回描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealMessage() {
        return this.DealMessage;
    }

    /**
     * Set 充值返回描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealMessage 充值返回描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealMessage(String DealMessage) {
        this.DealMessage = DealMessage;
    }

    /**
     * Get PC web端跳转链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PcWebUrl PC web端跳转链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPcWebUrl() {
        return this.PcWebUrl;
    }

    /**
     * Set PC web端跳转链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param PcWebUrl PC web端跳转链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPcWebUrl(String PcWebUrl) {
        this.PcWebUrl = PcWebUrl;
    }

    public CreateOpenBankOrderRechargeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankOrderRechargeResult(CreateOpenBankOrderRechargeResult source) {
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
        if (source.ThirdPayOrderId != null) {
            this.ThirdPayOrderId = new String(source.ThirdPayOrderId);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new OpenBankRechargeRedirectInfo(source.RedirectInfo);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.DealStatus != null) {
            this.DealStatus = new String(source.DealStatus);
        }
        if (source.DealMessage != null) {
            this.DealMessage = new String(source.DealMessage);
        }
        if (source.PcWebUrl != null) {
            this.PcWebUrl = new String(source.PcWebUrl);
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
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "DealMessage", this.DealMessage);
        this.setParamSimple(map, prefix + "PcWebUrl", this.PcWebUrl);

    }
}

