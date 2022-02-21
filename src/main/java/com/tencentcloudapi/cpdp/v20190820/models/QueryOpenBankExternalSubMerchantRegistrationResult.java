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

public class QueryOpenBankExternalSubMerchantRegistrationResult extends AbstractModel{

    /**
    * 进件状态。
__SUCCESS__: 进件成功
__FAILED__: 进件失败
__PROCESSING__: 进件中
    */
    @SerializedName("RegistrationStatus")
    @Expose
    private String RegistrationStatus;

    /**
    * 进件返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistrationMessage")
    @Expose
    private String RegistrationMessage;

    /**
    * 渠道进件号。
    */
    @SerializedName("ChannelRegistrationNo")
    @Expose
    private String ChannelRegistrationNo;

    /**
    * 渠道子商户ID（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 外部子商户名称（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutSubMerchantName")
    @Expose
    private String OutSubMerchantName;

    /**
    * 渠道名称（进件成功返回）。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 支付方式（进件成功返回）。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 社会信用代码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessLicenseNumber")
    @Expose
    private String BusinessLicenseNumber;

    /**
    * 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 第三方渠道查询进件返回数据。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnData")
    @Expose
    private String ExternalReturnData;

    /**
     * Get 进件状态。
__SUCCESS__: 进件成功
__FAILED__: 进件失败
__PROCESSING__: 进件中 
     * @return RegistrationStatus 进件状态。
__SUCCESS__: 进件成功
__FAILED__: 进件失败
__PROCESSING__: 进件中
     */
    public String getRegistrationStatus() {
        return this.RegistrationStatus;
    }

    /**
     * Set 进件状态。
__SUCCESS__: 进件成功
__FAILED__: 进件失败
__PROCESSING__: 进件中
     * @param RegistrationStatus 进件状态。
__SUCCESS__: 进件成功
__FAILED__: 进件失败
__PROCESSING__: 进件中
     */
    public void setRegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    /**
     * Get 进件返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistrationMessage 进件返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistrationMessage() {
        return this.RegistrationMessage;
    }

    /**
     * Set 进件返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistrationMessage 进件返回描述, 例如失败原因等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistrationMessage(String RegistrationMessage) {
        this.RegistrationMessage = RegistrationMessage;
    }

    /**
     * Get 渠道进件号。 
     * @return ChannelRegistrationNo 渠道进件号。
     */
    public String getChannelRegistrationNo() {
        return this.ChannelRegistrationNo;
    }

    /**
     * Set 渠道进件号。
     * @param ChannelRegistrationNo 渠道进件号。
     */
    public void setChannelRegistrationNo(String ChannelRegistrationNo) {
        this.ChannelRegistrationNo = ChannelRegistrationNo;
    }

    /**
     * Get 渠道子商户ID（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelSubMerchantId 渠道子商户ID（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelSubMerchantId 渠道子商户ID（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 外部子商户名称（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutSubMerchantName 外部子商户名称（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutSubMerchantName() {
        return this.OutSubMerchantName;
    }

    /**
     * Set 外部子商户名称（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutSubMerchantName 外部子商户名称（进件成功返回）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutSubMerchantName(String OutSubMerchantName) {
        this.OutSubMerchantName = OutSubMerchantName;
    }

    /**
     * Get 渠道名称（进件成功返回）。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelName 渠道名称（进件成功返回）。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称（进件成功返回）。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelName 渠道名称（进件成功返回）。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 支付方式（进件成功返回）。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentMethod 支付方式（进件成功返回）。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式（进件成功返回）。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentMethod 支付方式（进件成功返回）。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 社会信用代码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessLicenseNumber 社会信用代码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessLicenseNumber() {
        return this.BusinessLicenseNumber;
    }

    /**
     * Set 社会信用代码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessLicenseNumber 社会信用代码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessLicenseNumber(String BusinessLicenseNumber) {
        this.BusinessLicenseNumber = BusinessLicenseNumber;
    }

    /**
     * Get 法人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalName 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalName 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 第三方渠道查询进件返回数据。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnData 第三方渠道查询进件返回数据。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnData() {
        return this.ExternalReturnData;
    }

    /**
     * Set 第三方渠道查询进件返回数据。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnData 第三方渠道查询进件返回数据。详情见附录-复杂类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnData(String ExternalReturnData) {
        this.ExternalReturnData = ExternalReturnData;
    }

    public QueryOpenBankExternalSubMerchantRegistrationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankExternalSubMerchantRegistrationResult(QueryOpenBankExternalSubMerchantRegistrationResult source) {
        if (source.RegistrationStatus != null) {
            this.RegistrationStatus = new String(source.RegistrationStatus);
        }
        if (source.RegistrationMessage != null) {
            this.RegistrationMessage = new String(source.RegistrationMessage);
        }
        if (source.ChannelRegistrationNo != null) {
            this.ChannelRegistrationNo = new String(source.ChannelRegistrationNo);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.OutSubMerchantName != null) {
            this.OutSubMerchantName = new String(source.OutSubMerchantName);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.BusinessLicenseNumber != null) {
            this.BusinessLicenseNumber = new String(source.BusinessLicenseNumber);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.ExternalReturnData != null) {
            this.ExternalReturnData = new String(source.ExternalReturnData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistrationStatus", this.RegistrationStatus);
        this.setParamSimple(map, prefix + "RegistrationMessage", this.RegistrationMessage);
        this.setParamSimple(map, prefix + "ChannelRegistrationNo", this.ChannelRegistrationNo);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "OutSubMerchantName", this.OutSubMerchantName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "BusinessLicenseNumber", this.BusinessLicenseNumber);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "ExternalReturnData", this.ExternalReturnData);

    }
}

