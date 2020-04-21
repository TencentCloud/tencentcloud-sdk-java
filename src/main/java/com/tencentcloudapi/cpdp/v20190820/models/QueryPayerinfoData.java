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

public class QueryPayerinfoData extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 审核状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 付款人类型
    */
    @SerializedName("PayerType")
    @Expose
    private String PayerType;

    /**
    * 付款人姓名
    */
    @SerializedName("PayerName")
    @Expose
    private String PayerName;

    /**
    * 付款人证件类型
    */
    @SerializedName("PayerIdType")
    @Expose
    private String PayerIdType;

    /**
    * 付款人证件号
    */
    @SerializedName("PayerIdNo")
    @Expose
    private String PayerIdNo;

    /**
    * 付款人联系电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerContactNumber")
    @Expose
    private String PayerContactNumber;

    /**
    * 付款人联系邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerEmailAddress")
    @Expose
    private String PayerEmailAddress;

    /**
    * 付款人常驻国家或地区编码
    */
    @SerializedName("PayerCountryCode")
    @Expose
    private String PayerCountryCode;

    /**
    * 付款人联系名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerContactName")
    @Expose
    private String PayerContactName;

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
     * Get 审核状态 
     * @return Status 审核状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 审核状态
     * @param Status 审核状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 付款人类型 
     * @return PayerType 付款人类型
     */
    public String getPayerType() {
        return this.PayerType;
    }

    /**
     * Set 付款人类型
     * @param PayerType 付款人类型
     */
    public void setPayerType(String PayerType) {
        this.PayerType = PayerType;
    }

    /**
     * Get 付款人姓名 
     * @return PayerName 付款人姓名
     */
    public String getPayerName() {
        return this.PayerName;
    }

    /**
     * Set 付款人姓名
     * @param PayerName 付款人姓名
     */
    public void setPayerName(String PayerName) {
        this.PayerName = PayerName;
    }

    /**
     * Get 付款人证件类型 
     * @return PayerIdType 付款人证件类型
     */
    public String getPayerIdType() {
        return this.PayerIdType;
    }

    /**
     * Set 付款人证件类型
     * @param PayerIdType 付款人证件类型
     */
    public void setPayerIdType(String PayerIdType) {
        this.PayerIdType = PayerIdType;
    }

    /**
     * Get 付款人证件号 
     * @return PayerIdNo 付款人证件号
     */
    public String getPayerIdNo() {
        return this.PayerIdNo;
    }

    /**
     * Set 付款人证件号
     * @param PayerIdNo 付款人证件号
     */
    public void setPayerIdNo(String PayerIdNo) {
        this.PayerIdNo = PayerIdNo;
    }

    /**
     * Get 付款人联系电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerContactNumber 付款人联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerContactNumber() {
        return this.PayerContactNumber;
    }

    /**
     * Set 付款人联系电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerContactNumber 付款人联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerContactNumber(String PayerContactNumber) {
        this.PayerContactNumber = PayerContactNumber;
    }

    /**
     * Get 付款人联系邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerEmailAddress 付款人联系邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerEmailAddress() {
        return this.PayerEmailAddress;
    }

    /**
     * Set 付款人联系邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerEmailAddress 付款人联系邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerEmailAddress(String PayerEmailAddress) {
        this.PayerEmailAddress = PayerEmailAddress;
    }

    /**
     * Get 付款人常驻国家或地区编码 
     * @return PayerCountryCode 付款人常驻国家或地区编码
     */
    public String getPayerCountryCode() {
        return this.PayerCountryCode;
    }

    /**
     * Set 付款人常驻国家或地区编码
     * @param PayerCountryCode 付款人常驻国家或地区编码
     */
    public void setPayerCountryCode(String PayerCountryCode) {
        this.PayerCountryCode = PayerCountryCode;
    }

    /**
     * Get 付款人联系名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerContactName 付款人联系名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerContactName() {
        return this.PayerContactName;
    }

    /**
     * Set 付款人联系名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerContactName 付款人联系名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerContactName(String PayerContactName) {
        this.PayerContactName = PayerContactName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "PayerType", this.PayerType);
        this.setParamSimple(map, prefix + "PayerName", this.PayerName);
        this.setParamSimple(map, prefix + "PayerIdType", this.PayerIdType);
        this.setParamSimple(map, prefix + "PayerIdNo", this.PayerIdNo);
        this.setParamSimple(map, prefix + "PayerContactNumber", this.PayerContactNumber);
        this.setParamSimple(map, prefix + "PayerEmailAddress", this.PayerEmailAddress);
        this.setParamSimple(map, prefix + "PayerCountryCode", this.PayerCountryCode);
        this.setParamSimple(map, prefix + "PayerContactName", this.PayerContactName);

    }
}

