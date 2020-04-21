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

public class ApplyPayerInfoRequest extends AbstractModel{

    /**
    * 付款人ID
    */
    @SerializedName("PayerId")
    @Expose
    private String PayerId;

    /**
    * 付款人类型 (个人: INDIVIDUAL, 企业: CORPORATE)
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
    * 付款人证件类型 (身份证: ID_CARD, 统一社会信用代码: UNIFIED_CREDIT_CODE)
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
    * 付款人常驻国家或地区编码 (见常见问题-国家/地区编码)
    */
    @SerializedName("PayerCountryCode")
    @Expose
    private String PayerCountryCode;

    /**
    * 付款人联系人名称
    */
    @SerializedName("PayerContactName")
    @Expose
    private String PayerContactName;

    /**
    * 付款人联系电话 (PayerType=CORPORATE 必填)
    */
    @SerializedName("PayerContactNumber")
    @Expose
    private String PayerContactNumber;

    /**
    * 付款人联系邮箱
    */
    @SerializedName("PayerEmailAddress")
    @Expose
    private String PayerEmailAddress;

    /**
    * 接入环境。沙箱环境填sandbox
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

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
     * Get 付款人类型 (个人: INDIVIDUAL, 企业: CORPORATE) 
     * @return PayerType 付款人类型 (个人: INDIVIDUAL, 企业: CORPORATE)
     */
    public String getPayerType() {
        return this.PayerType;
    }

    /**
     * Set 付款人类型 (个人: INDIVIDUAL, 企业: CORPORATE)
     * @param PayerType 付款人类型 (个人: INDIVIDUAL, 企业: CORPORATE)
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
     * Get 付款人证件类型 (身份证: ID_CARD, 统一社会信用代码: UNIFIED_CREDIT_CODE) 
     * @return PayerIdType 付款人证件类型 (身份证: ID_CARD, 统一社会信用代码: UNIFIED_CREDIT_CODE)
     */
    public String getPayerIdType() {
        return this.PayerIdType;
    }

    /**
     * Set 付款人证件类型 (身份证: ID_CARD, 统一社会信用代码: UNIFIED_CREDIT_CODE)
     * @param PayerIdType 付款人证件类型 (身份证: ID_CARD, 统一社会信用代码: UNIFIED_CREDIT_CODE)
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
     * Get 付款人常驻国家或地区编码 (见常见问题-国家/地区编码) 
     * @return PayerCountryCode 付款人常驻国家或地区编码 (见常见问题-国家/地区编码)
     */
    public String getPayerCountryCode() {
        return this.PayerCountryCode;
    }

    /**
     * Set 付款人常驻国家或地区编码 (见常见问题-国家/地区编码)
     * @param PayerCountryCode 付款人常驻国家或地区编码 (见常见问题-国家/地区编码)
     */
    public void setPayerCountryCode(String PayerCountryCode) {
        this.PayerCountryCode = PayerCountryCode;
    }

    /**
     * Get 付款人联系人名称 
     * @return PayerContactName 付款人联系人名称
     */
    public String getPayerContactName() {
        return this.PayerContactName;
    }

    /**
     * Set 付款人联系人名称
     * @param PayerContactName 付款人联系人名称
     */
    public void setPayerContactName(String PayerContactName) {
        this.PayerContactName = PayerContactName;
    }

    /**
     * Get 付款人联系电话 (PayerType=CORPORATE 必填) 
     * @return PayerContactNumber 付款人联系电话 (PayerType=CORPORATE 必填)
     */
    public String getPayerContactNumber() {
        return this.PayerContactNumber;
    }

    /**
     * Set 付款人联系电话 (PayerType=CORPORATE 必填)
     * @param PayerContactNumber 付款人联系电话 (PayerType=CORPORATE 必填)
     */
    public void setPayerContactNumber(String PayerContactNumber) {
        this.PayerContactNumber = PayerContactNumber;
    }

    /**
     * Get 付款人联系邮箱 
     * @return PayerEmailAddress 付款人联系邮箱
     */
    public String getPayerEmailAddress() {
        return this.PayerEmailAddress;
    }

    /**
     * Set 付款人联系邮箱
     * @param PayerEmailAddress 付款人联系邮箱
     */
    public void setPayerEmailAddress(String PayerEmailAddress) {
        this.PayerEmailAddress = PayerEmailAddress;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox 
     * @return Profile 接入环境。沙箱环境填sandbox
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox
     * @param Profile 接入环境。沙箱环境填sandbox
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerId", this.PayerId);
        this.setParamSimple(map, prefix + "PayerType", this.PayerType);
        this.setParamSimple(map, prefix + "PayerName", this.PayerName);
        this.setParamSimple(map, prefix + "PayerIdType", this.PayerIdType);
        this.setParamSimple(map, prefix + "PayerIdNo", this.PayerIdNo);
        this.setParamSimple(map, prefix + "PayerCountryCode", this.PayerCountryCode);
        this.setParamSimple(map, prefix + "PayerContactName", this.PayerContactName);
        this.setParamSimple(map, prefix + "PayerContactNumber", this.PayerContactNumber);
        this.setParamSimple(map, prefix + "PayerEmailAddress", this.PayerEmailAddress);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

