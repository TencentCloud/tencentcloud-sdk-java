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

public class ViewContractResult extends AbstractModel{

    /**
    * 支付标签（唯一性）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentTag")
    @Expose
    private String PaymentTag;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 机构编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentNo")
    @Expose
    private String AgentNo;

    /**
    * 合同选项值4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionFour")
    @Expose
    private String ContractOptionFour;

    /**
    * 合同选项值2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionTwo")
    @Expose
    private String ContractOptionTwo;

    /**
    * 合同状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentId")
    @Expose
    private String PaymentId;

    /**
    * 商户签约扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fee")
    @Expose
    private String Fee;

    /**
    * 合同选项名称5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionFive")
    @Expose
    private String PaymentOptionFive;

    /**
    * 机构合同主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutContractId")
    @Expose
    private String OutContractId;

    /**
    * 不同的支付方式对于进件有不同的个性化需求，支付方式字段都是以双下划写开头的字段名称，请以支付方式规定的格式传值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExtJson")
    @Expose
    private String ChannelExtJson;

    /**
    * 合同选项值5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionFive")
    @Expose
    private String ContractOptionFive;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 生效日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 详细地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 过期日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 合同选项值6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionSix")
    @Expose
    private String ContractOptionSix;

    /**
    * 合同选项名称7
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionSeven")
    @Expose
    private String PaymentOptionSeven;

    /**
    * 合同照片补充【私密区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PictureTwo")
    @Expose
    private String PictureTwo;

    /**
    * 商户编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 合同选项值8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionOther")
    @Expose
    private String ContractOptionOther;

    /**
    * 合同选项值3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionThree")
    @Expose
    private String ContractOptionThree;

    /**
    * 县/区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 合同关联的门店数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopCount")
    @Expose
    private String ShopCount;

    /**
    * 合同选项名称3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionThree")
    @Expose
    private String PaymentOptionThree;

    /**
    * 支付方式行业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentClassificationName")
    @Expose
    private String PaymentClassificationName;

    /**
    * 合同选项值7
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionSeven")
    @Expose
    private String ContractOptionSeven;

    /**
    * 合同选项名称4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionFour")
    @Expose
    private String PaymentOptionFour;

    /**
    * 商户签约扣率封顶值（分为单位）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentClassificationLimit")
    @Expose
    private String PaymentClassificationLimit;

    /**
    * 审核备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 合同选项名称6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionSix")
    @Expose
    private String PaymentOptionSix;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 合同选项值1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionOne")
    @Expose
    private String ContractOptionOne;

    /**
    * 合同选项名称8
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionOther")
    @Expose
    private String PaymentOptionOther;

    /**
    * 合同选项名称2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionTwo")
    @Expose
    private String PaymentOptionTwo;

    /**
    * 合同选项名称1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionOne")
    @Expose
    private String PaymentOptionOne;

    /**
    * 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 联系人电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactTelephone")
    @Expose
    private String ContactTelephone;

    /**
    * 联系人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 签约日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignDate")
    @Expose
    private String SignDate;

    /**
    * 合同选项名称9
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionNine")
    @Expose
    private String PaymentOptionNine;

    /**
    * 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentName")
    @Expose
    private String PaymentName;

    /**
    * 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentInternalName")
    @Expose
    private String PaymentInternalName;

    /**
    * 合同选项值10
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionTen")
    @Expose
    private String ContractOptionTen;

    /**
    * 合同编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 合同照片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PictureOne")
    @Expose
    private String PictureOne;

    /**
    * 签约人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignMan")
    @Expose
    private String SignMan;

    /**
    * 渠道号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelNo")
    @Expose
    private String ChannelNo;

    /**
    * 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 是否自动续签（1是，0否）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSign")
    @Expose
    private String AutoSign;

    /**
    * 合同选项值9
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractOptionNine")
    @Expose
    private String ContractOptionNine;

    /**
    * 城市编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * 支付方式行业编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentClassificationId")
    @Expose
    private String PaymentClassificationId;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 合同选项名称10
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionTen")
    @Expose
    private String PaymentOptionTen;

    /**
    * 合同主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractId")
    @Expose
    private String ContractId;

    /**
     * Get 支付标签（唯一性）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentTag 支付标签（唯一性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentTag() {
        return this.PaymentTag;
    }

    /**
     * Set 支付标签（唯一性）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentTag 支付标签（唯一性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentTag(String PaymentTag) {
        this.PaymentTag = PaymentTag;
    }

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 机构编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentNo 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentNo() {
        return this.AgentNo;
    }

    /**
     * Set 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentNo 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentNo(String AgentNo) {
        this.AgentNo = AgentNo;
    }

    /**
     * Get 合同选项值4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionFour 合同选项值4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionFour() {
        return this.ContractOptionFour;
    }

    /**
     * Set 合同选项值4
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionFour 合同选项值4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionFour(String ContractOptionFour) {
        this.ContractOptionFour = ContractOptionFour;
    }

    /**
     * Get 合同选项值2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionTwo 合同选项值2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionTwo() {
        return this.ContractOptionTwo;
    }

    /**
     * Set 合同选项值2
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionTwo 合同选项值2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionTwo(String ContractOptionTwo) {
        this.ContractOptionTwo = ContractOptionTwo;
    }

    /**
     * Get 合同状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 合同状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 合同状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 合同状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentId 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentId() {
        return this.PaymentId;
    }

    /**
     * Set 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentId 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentId(String PaymentId) {
        this.PaymentId = PaymentId;
    }

    /**
     * Get 商户签约扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fee 商户签约扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFee() {
        return this.Fee;
    }

    /**
     * Set 商户签约扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fee 商户签约扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFee(String Fee) {
        this.Fee = Fee;
    }

    /**
     * Get 合同选项名称5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionFive 合同选项名称5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionFive() {
        return this.PaymentOptionFive;
    }

    /**
     * Set 合同选项名称5
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionFive 合同选项名称5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionFive(String PaymentOptionFive) {
        this.PaymentOptionFive = PaymentOptionFive;
    }

    /**
     * Get 机构合同主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutContractId 机构合同主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutContractId() {
        return this.OutContractId;
    }

    /**
     * Set 机构合同主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutContractId 机构合同主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutContractId(String OutContractId) {
        this.OutContractId = OutContractId;
    }

    /**
     * Get 不同的支付方式对于进件有不同的个性化需求，支付方式字段都是以双下划写开头的字段名称，请以支付方式规定的格式传值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExtJson 不同的支付方式对于进件有不同的个性化需求，支付方式字段都是以双下划写开头的字段名称，请以支付方式规定的格式传值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExtJson() {
        return this.ChannelExtJson;
    }

    /**
     * Set 不同的支付方式对于进件有不同的个性化需求，支付方式字段都是以双下划写开头的字段名称，请以支付方式规定的格式传值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExtJson 不同的支付方式对于进件有不同的个性化需求，支付方式字段都是以双下划写开头的字段名称，请以支付方式规定的格式传值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExtJson(String ChannelExtJson) {
        this.ChannelExtJson = ChannelExtJson;
    }

    /**
     * Get 合同选项值5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionFive 合同选项值5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionFive() {
        return this.ContractOptionFive;
    }

    /**
     * Set 合同选项值5
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionFive 合同选项值5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionFive(String ContractOptionFive) {
        this.ContractOptionFive = ContractOptionFive;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 生效日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartDate 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartDate 生效日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 详细地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 过期日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndDate 过期日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 过期日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndDate 过期日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 合同选项值6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionSix 合同选项值6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionSix() {
        return this.ContractOptionSix;
    }

    /**
     * Set 合同选项值6
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionSix 合同选项值6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionSix(String ContractOptionSix) {
        this.ContractOptionSix = ContractOptionSix;
    }

    /**
     * Get 合同选项名称7
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionSeven 合同选项名称7
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionSeven() {
        return this.PaymentOptionSeven;
    }

    /**
     * Set 合同选项名称7
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionSeven 合同选项名称7
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionSeven(String PaymentOptionSeven) {
        this.PaymentOptionSeven = PaymentOptionSeven;
    }

    /**
     * Get 合同照片补充【私密区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PictureTwo 合同照片补充【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPictureTwo() {
        return this.PictureTwo;
    }

    /**
     * Set 合同照片补充【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PictureTwo 合同照片补充【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPictureTwo(String PictureTwo) {
        this.PictureTwo = PictureTwo;
    }

    /**
     * Get 商户编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 合同选项值8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionOther 合同选项值8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionOther() {
        return this.ContractOptionOther;
    }

    /**
     * Set 合同选项值8
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionOther 合同选项值8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionOther(String ContractOptionOther) {
        this.ContractOptionOther = ContractOptionOther;
    }

    /**
     * Get 合同选项值3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionThree 合同选项值3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionThree() {
        return this.ContractOptionThree;
    }

    /**
     * Set 合同选项值3
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionThree 合同选项值3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionThree(String ContractOptionThree) {
        this.ContractOptionThree = ContractOptionThree;
    }

    /**
     * Get 县/区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 县/区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 合同关联的门店数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopCount 合同关联的门店数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopCount() {
        return this.ShopCount;
    }

    /**
     * Set 合同关联的门店数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopCount 合同关联的门店数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopCount(String ShopCount) {
        this.ShopCount = ShopCount;
    }

    /**
     * Get 合同选项名称3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionThree 合同选项名称3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionThree() {
        return this.PaymentOptionThree;
    }

    /**
     * Set 合同选项名称3
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionThree 合同选项名称3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionThree(String PaymentOptionThree) {
        this.PaymentOptionThree = PaymentOptionThree;
    }

    /**
     * Get 支付方式行业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentClassificationName 支付方式行业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentClassificationName() {
        return this.PaymentClassificationName;
    }

    /**
     * Set 支付方式行业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentClassificationName 支付方式行业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentClassificationName(String PaymentClassificationName) {
        this.PaymentClassificationName = PaymentClassificationName;
    }

    /**
     * Get 合同选项值7
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionSeven 合同选项值7
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionSeven() {
        return this.ContractOptionSeven;
    }

    /**
     * Set 合同选项值7
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionSeven 合同选项值7
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionSeven(String ContractOptionSeven) {
        this.ContractOptionSeven = ContractOptionSeven;
    }

    /**
     * Get 合同选项名称4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionFour 合同选项名称4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionFour() {
        return this.PaymentOptionFour;
    }

    /**
     * Set 合同选项名称4
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionFour 合同选项名称4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionFour(String PaymentOptionFour) {
        this.PaymentOptionFour = PaymentOptionFour;
    }

    /**
     * Get 商户签约扣率封顶值（分为单位）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentClassificationLimit 商户签约扣率封顶值（分为单位）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentClassificationLimit() {
        return this.PaymentClassificationLimit;
    }

    /**
     * Set 商户签约扣率封顶值（分为单位）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentClassificationLimit 商户签约扣率封顶值（分为单位）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentClassificationLimit(String PaymentClassificationLimit) {
        this.PaymentClassificationLimit = PaymentClassificationLimit;
    }

    /**
     * Get 审核备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 合同选项名称6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionSix 合同选项名称6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionSix() {
        return this.PaymentOptionSix;
    }

    /**
     * Set 合同选项名称6
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionSix 合同选项名称6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionSix(String PaymentOptionSix) {
        this.PaymentOptionSix = PaymentOptionSix;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 合同选项值1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionOne 合同选项值1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionOne() {
        return this.ContractOptionOne;
    }

    /**
     * Set 合同选项值1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionOne 合同选项值1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionOne(String ContractOptionOne) {
        this.ContractOptionOne = ContractOptionOne;
    }

    /**
     * Get 合同选项名称8
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionOther 合同选项名称8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionOther() {
        return this.PaymentOptionOther;
    }

    /**
     * Set 合同选项名称8
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionOther 合同选项名称8
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionOther(String PaymentOptionOther) {
        this.PaymentOptionOther = PaymentOptionOther;
    }

    /**
     * Get 合同选项名称2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionTwo 合同选项名称2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionTwo() {
        return this.PaymentOptionTwo;
    }

    /**
     * Set 合同选项名称2
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionTwo 合同选项名称2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionTwo(String PaymentOptionTwo) {
        this.PaymentOptionTwo = PaymentOptionTwo;
    }

    /**
     * Get 合同选项名称1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionOne 合同选项名称1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionOne() {
        return this.PaymentOptionOne;
    }

    /**
     * Set 合同选项名称1
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionOne 合同选项名称1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionOne(String PaymentOptionOne) {
        this.PaymentOptionOne = PaymentOptionOne;
    }

    /**
     * Get 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 联系人电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactTelephone 联系人电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactTelephone() {
        return this.ContactTelephone;
    }

    /**
     * Set 联系人电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactTelephone 联系人电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactTelephone(String ContactTelephone) {
        this.ContactTelephone = ContactTelephone;
    }

    /**
     * Get 联系人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contact 联系人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 联系人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contact 联系人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 签约日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignDate 签约日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignDate() {
        return this.SignDate;
    }

    /**
     * Set 签约日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignDate 签约日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignDate(String SignDate) {
        this.SignDate = SignDate;
    }

    /**
     * Get 合同选项名称9
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionNine 合同选项名称9
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionNine() {
        return this.PaymentOptionNine;
    }

    /**
     * Set 合同选项名称9
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionNine 合同选项名称9
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionNine(String PaymentOptionNine) {
        this.PaymentOptionNine = PaymentOptionNine;
    }

    /**
     * Get 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentName() {
        return this.PaymentName;
    }

    /**
     * Set 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentName(String PaymentName) {
        this.PaymentName = PaymentName;
    }

    /**
     * Get 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentInternalName 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentInternalName() {
        return this.PaymentInternalName;
    }

    /**
     * Set 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentInternalName 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentInternalName(String PaymentInternalName) {
        this.PaymentInternalName = PaymentInternalName;
    }

    /**
     * Get 合同选项值10
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionTen 合同选项值10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionTen() {
        return this.ContractOptionTen;
    }

    /**
     * Set 合同选项值10
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionTen 合同选项值10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionTen(String ContractOptionTen) {
        this.ContractOptionTen = ContractOptionTen;
    }

    /**
     * Get 合同编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 合同编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 合同编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 合同编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 合同照片【私密区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PictureOne 合同照片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPictureOne() {
        return this.PictureOne;
    }

    /**
     * Set 合同照片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PictureOne 合同照片【私密区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPictureOne(String PictureOne) {
        this.PictureOne = PictureOne;
    }

    /**
     * Get 签约人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignMan 签约人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignMan() {
        return this.SignMan;
    }

    /**
     * Set 签约人
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignMan 签约人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignMan(String SignMan) {
        this.SignMan = SignMan;
    }

    /**
     * Get 渠道号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelNo 渠道号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelNo() {
        return this.ChannelNo;
    }

    /**
     * Set 渠道号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelNo 渠道号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelNo(String ChannelNo) {
        this.ChannelNo = ChannelNo;
    }

    /**
     * Get 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 是否自动续签（1是，0否）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSign 是否自动续签（1是，0否）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoSign() {
        return this.AutoSign;
    }

    /**
     * Set 是否自动续签（1是，0否）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSign 是否自动续签（1是，0否）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSign(String AutoSign) {
        this.AutoSign = AutoSign;
    }

    /**
     * Get 合同选项值9
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractOptionNine 合同选项值9
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractOptionNine() {
        return this.ContractOptionNine;
    }

    /**
     * Set 合同选项值9
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractOptionNine 合同选项值9
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractOptionNine(String ContractOptionNine) {
        this.ContractOptionNine = ContractOptionNine;
    }

    /**
     * Get 城市编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentType 交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * Set 交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentType 交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * Get 支付方式行业编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentClassificationId 支付方式行业编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentClassificationId() {
        return this.PaymentClassificationId;
    }

    /**
     * Set 支付方式行业编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentClassificationId 支付方式行业编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentClassificationId(String PaymentClassificationId) {
        this.PaymentClassificationId = PaymentClassificationId;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 合同选项名称10
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionTen 合同选项名称10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionTen() {
        return this.PaymentOptionTen;
    }

    /**
     * Set 合同选项名称10
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionTen 合同选项名称10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionTen(String PaymentOptionTen) {
        this.PaymentOptionTen = PaymentOptionTen;
    }

    /**
     * Get 合同主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractId 合同主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractId() {
        return this.ContractId;
    }

    /**
     * Set 合同主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractId 合同主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractId(String ContractId) {
        this.ContractId = ContractId;
    }

    public ViewContractResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewContractResult(ViewContractResult source) {
        if (source.PaymentTag != null) {
            this.PaymentTag = new String(source.PaymentTag);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.AgentNo != null) {
            this.AgentNo = new String(source.AgentNo);
        }
        if (source.ContractOptionFour != null) {
            this.ContractOptionFour = new String(source.ContractOptionFour);
        }
        if (source.ContractOptionTwo != null) {
            this.ContractOptionTwo = new String(source.ContractOptionTwo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PaymentId != null) {
            this.PaymentId = new String(source.PaymentId);
        }
        if (source.Fee != null) {
            this.Fee = new String(source.Fee);
        }
        if (source.PaymentOptionFive != null) {
            this.PaymentOptionFive = new String(source.PaymentOptionFive);
        }
        if (source.OutContractId != null) {
            this.OutContractId = new String(source.OutContractId);
        }
        if (source.ChannelExtJson != null) {
            this.ChannelExtJson = new String(source.ChannelExtJson);
        }
        if (source.ContractOptionFive != null) {
            this.ContractOptionFive = new String(source.ContractOptionFive);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ContractOptionSix != null) {
            this.ContractOptionSix = new String(source.ContractOptionSix);
        }
        if (source.PaymentOptionSeven != null) {
            this.PaymentOptionSeven = new String(source.PaymentOptionSeven);
        }
        if (source.PictureTwo != null) {
            this.PictureTwo = new String(source.PictureTwo);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.ContractOptionOther != null) {
            this.ContractOptionOther = new String(source.ContractOptionOther);
        }
        if (source.ContractOptionThree != null) {
            this.ContractOptionThree = new String(source.ContractOptionThree);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.ShopCount != null) {
            this.ShopCount = new String(source.ShopCount);
        }
        if (source.PaymentOptionThree != null) {
            this.PaymentOptionThree = new String(source.PaymentOptionThree);
        }
        if (source.PaymentClassificationName != null) {
            this.PaymentClassificationName = new String(source.PaymentClassificationName);
        }
        if (source.ContractOptionSeven != null) {
            this.ContractOptionSeven = new String(source.ContractOptionSeven);
        }
        if (source.PaymentOptionFour != null) {
            this.PaymentOptionFour = new String(source.PaymentOptionFour);
        }
        if (source.PaymentClassificationLimit != null) {
            this.PaymentClassificationLimit = new String(source.PaymentClassificationLimit);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PaymentOptionSix != null) {
            this.PaymentOptionSix = new String(source.PaymentOptionSix);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.ContractOptionOne != null) {
            this.ContractOptionOne = new String(source.ContractOptionOne);
        }
        if (source.PaymentOptionOther != null) {
            this.PaymentOptionOther = new String(source.PaymentOptionOther);
        }
        if (source.PaymentOptionTwo != null) {
            this.PaymentOptionTwo = new String(source.PaymentOptionTwo);
        }
        if (source.PaymentOptionOne != null) {
            this.PaymentOptionOne = new String(source.PaymentOptionOne);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ContactTelephone != null) {
            this.ContactTelephone = new String(source.ContactTelephone);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.SignDate != null) {
            this.SignDate = new String(source.SignDate);
        }
        if (source.PaymentOptionNine != null) {
            this.PaymentOptionNine = new String(source.PaymentOptionNine);
        }
        if (source.PaymentName != null) {
            this.PaymentName = new String(source.PaymentName);
        }
        if (source.PaymentInternalName != null) {
            this.PaymentInternalName = new String(source.PaymentInternalName);
        }
        if (source.ContractOptionTen != null) {
            this.ContractOptionTen = new String(source.ContractOptionTen);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.PictureOne != null) {
            this.PictureOne = new String(source.PictureOne);
        }
        if (source.SignMan != null) {
            this.SignMan = new String(source.SignMan);
        }
        if (source.ChannelNo != null) {
            this.ChannelNo = new String(source.ChannelNo);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.AutoSign != null) {
            this.AutoSign = new String(source.AutoSign);
        }
        if (source.ContractOptionNine != null) {
            this.ContractOptionNine = new String(source.ContractOptionNine);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.PaymentType != null) {
            this.PaymentType = new String(source.PaymentType);
        }
        if (source.PaymentClassificationId != null) {
            this.PaymentClassificationId = new String(source.PaymentClassificationId);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.PaymentOptionTen != null) {
            this.PaymentOptionTen = new String(source.PaymentOptionTen);
        }
        if (source.ContractId != null) {
            this.ContractId = new String(source.ContractId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaymentTag", this.PaymentTag);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AgentNo", this.AgentNo);
        this.setParamSimple(map, prefix + "ContractOptionFour", this.ContractOptionFour);
        this.setParamSimple(map, prefix + "ContractOptionTwo", this.ContractOptionTwo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PaymentId", this.PaymentId);
        this.setParamSimple(map, prefix + "Fee", this.Fee);
        this.setParamSimple(map, prefix + "PaymentOptionFive", this.PaymentOptionFive);
        this.setParamSimple(map, prefix + "OutContractId", this.OutContractId);
        this.setParamSimple(map, prefix + "ChannelExtJson", this.ChannelExtJson);
        this.setParamSimple(map, prefix + "ContractOptionFive", this.ContractOptionFive);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "ContractOptionSix", this.ContractOptionSix);
        this.setParamSimple(map, prefix + "PaymentOptionSeven", this.PaymentOptionSeven);
        this.setParamSimple(map, prefix + "PictureTwo", this.PictureTwo);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "ContractOptionOther", this.ContractOptionOther);
        this.setParamSimple(map, prefix + "ContractOptionThree", this.ContractOptionThree);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "ShopCount", this.ShopCount);
        this.setParamSimple(map, prefix + "PaymentOptionThree", this.PaymentOptionThree);
        this.setParamSimple(map, prefix + "PaymentClassificationName", this.PaymentClassificationName);
        this.setParamSimple(map, prefix + "ContractOptionSeven", this.ContractOptionSeven);
        this.setParamSimple(map, prefix + "PaymentOptionFour", this.PaymentOptionFour);
        this.setParamSimple(map, prefix + "PaymentClassificationLimit", this.PaymentClassificationLimit);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PaymentOptionSix", this.PaymentOptionSix);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "ContractOptionOne", this.ContractOptionOne);
        this.setParamSimple(map, prefix + "PaymentOptionOther", this.PaymentOptionOther);
        this.setParamSimple(map, prefix + "PaymentOptionTwo", this.PaymentOptionTwo);
        this.setParamSimple(map, prefix + "PaymentOptionOne", this.PaymentOptionOne);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ContactTelephone", this.ContactTelephone);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "SignDate", this.SignDate);
        this.setParamSimple(map, prefix + "PaymentOptionNine", this.PaymentOptionNine);
        this.setParamSimple(map, prefix + "PaymentName", this.PaymentName);
        this.setParamSimple(map, prefix + "PaymentInternalName", this.PaymentInternalName);
        this.setParamSimple(map, prefix + "ContractOptionTen", this.ContractOptionTen);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "PictureOne", this.PictureOne);
        this.setParamSimple(map, prefix + "SignMan", this.SignMan);
        this.setParamSimple(map, prefix + "ChannelNo", this.ChannelNo);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "AutoSign", this.AutoSign);
        this.setParamSimple(map, prefix + "ContractOptionNine", this.ContractOptionNine);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "PaymentClassificationId", this.PaymentClassificationId);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "PaymentOptionTen", this.PaymentOptionTen);
        this.setParamSimple(map, prefix + "ContractId", this.ContractId);

    }
}

