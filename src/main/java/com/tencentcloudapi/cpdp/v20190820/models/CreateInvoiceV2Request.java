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

public class CreateInvoiceV2Request extends AbstractModel{

    /**
    * 开票平台ID。0：高灯，1：票易通
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 抬头类型：1：个人/政府事业单位；2：企业
    */
    @SerializedName("TitleType")
    @Expose
    private Long TitleType;

    /**
    * 购方名称
    */
    @SerializedName("BuyerTitle")
    @Expose
    private String BuyerTitle;

    /**
    * 业务开票号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 含税总金额（单位为分）
    */
    @SerializedName("AmountHasTax")
    @Expose
    private Long AmountHasTax;

    /**
    * 总税额（单位为分）
    */
    @SerializedName("TaxAmount")
    @Expose
    private Long TaxAmount;

    /**
    * 不含税总金额（单位为分）。InvoicePlatformId 为1时，传默认值-1
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private Long AmountWithoutTax;

    /**
    * 销方纳税人识别号
    */
    @SerializedName("SellerTaxpayerNum")
    @Expose
    private String SellerTaxpayerNum;

    /**
    * 销方名称。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("SellerName")
    @Expose
    private String SellerName;

    /**
    * 销方地址。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * 销方电话。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("SellerPhone")
    @Expose
    private String SellerPhone;

    /**
    * 销方银行名称。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("SellerBankName")
    @Expose
    private String SellerBankName;

    /**
    * 销方银行账号。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("SellerBankAccount")
    @Expose
    private String SellerBankAccount;

    /**
    * 购方纳税人识别号（购方票面信息）,若抬头类型为2时，必传
    */
    @SerializedName("BuyerTaxpayerNum")
    @Expose
    private String BuyerTaxpayerNum;

    /**
    * 购方地址。开具专用发票时必填
    */
    @SerializedName("BuyerAddress")
    @Expose
    private String BuyerAddress;

    /**
    * 购方银行名称。开具专用发票时必填
    */
    @SerializedName("BuyerBankName")
    @Expose
    private String BuyerBankName;

    /**
    * 购方银行账号。开具专用发票时必填
    */
    @SerializedName("BuyerBankAccount")
    @Expose
    private String BuyerBankAccount;

    /**
    * 购方电话。开具专用发票时必填
    */
    @SerializedName("BuyerPhone")
    @Expose
    private String BuyerPhone;

    /**
    * 收票人邮箱。若填入，会收到发票推送邮件
    */
    @SerializedName("BuyerEmail")
    @Expose
    private String BuyerEmail;

    /**
    * 收票人手机号。若填入，会收到发票推送短信
    */
    @SerializedName("TakerPhone")
    @Expose
    private String TakerPhone;

    /**
    * 开票类型：
1：增值税专用发票；
2：增值税普通发票；
3：增值税电子发票；
4：增值税卷式发票；
5：区块链电子发票。
若该字段不填，或值不为1-5，则认为开具”增值税电子发票”
    */
    @SerializedName("InvoiceType")
    @Expose
    private Long InvoiceType;

    /**
    * 发票结果回传地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 开票人姓名。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("Drawer")
    @Expose
    private String Drawer;

    /**
    * 收款人姓名。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("Payee")
    @Expose
    private String Payee;

    /**
    * 复核人姓名。（不填默认读取商户注册时输入的信息）
    */
    @SerializedName("Checker")
    @Expose
    private String Checker;

    /**
    * 税盘号
    */
    @SerializedName("TerminalCode")
    @Expose
    private String TerminalCode;

    /**
    * 征收方式。开具差额征税发票时必填2。开具普通征税发票时为空
    */
    @SerializedName("LevyMethod")
    @Expose
    private String LevyMethod;

    /**
    * 差额征税扣除额（单位为分）
    */
    @SerializedName("Deduction")
    @Expose
    private Long Deduction;

    /**
    * 备注（票面信息）
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 项目商品明细
    */
    @SerializedName("Items")
    @Expose
    private CreateInvoiceItem [] Items;

    /**
    * 接入环境。沙箱环境填sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 撤销部分商品。0-不撤销，1-撤销
    */
    @SerializedName("UndoPart")
    @Expose
    private Long UndoPart;

    /**
    * 订单下单时间（格式 YYYYMMDD）
    */
    @SerializedName("OrderDate")
    @Expose
    private String OrderDate;

    /**
    * 订单级别折扣（单位为分）
    */
    @SerializedName("Discount")
    @Expose
    private Long Discount;

    /**
    * 门店编码
    */
    @SerializedName("StoreNo")
    @Expose
    private String StoreNo;

    /**
    * 开票渠道。0：APP渠道，1：线下渠道，2：小程序渠道。不填默认为APP渠道
    */
    @SerializedName("InvoiceChannel")
    @Expose
    private Long InvoiceChannel;

    /**
     * Get 开票平台ID。0：高灯，1：票易通 
     * @return InvoicePlatformId 开票平台ID。0：高灯，1：票易通
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID。0：高灯，1：票易通
     * @param InvoicePlatformId 开票平台ID。0：高灯，1：票易通
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 抬头类型：1：个人/政府事业单位；2：企业 
     * @return TitleType 抬头类型：1：个人/政府事业单位；2：企业
     */
    public Long getTitleType() {
        return this.TitleType;
    }

    /**
     * Set 抬头类型：1：个人/政府事业单位；2：企业
     * @param TitleType 抬头类型：1：个人/政府事业单位；2：企业
     */
    public void setTitleType(Long TitleType) {
        this.TitleType = TitleType;
    }

    /**
     * Get 购方名称 
     * @return BuyerTitle 购方名称
     */
    public String getBuyerTitle() {
        return this.BuyerTitle;
    }

    /**
     * Set 购方名称
     * @param BuyerTitle 购方名称
     */
    public void setBuyerTitle(String BuyerTitle) {
        this.BuyerTitle = BuyerTitle;
    }

    /**
     * Get 业务开票号 
     * @return OrderId 业务开票号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 业务开票号
     * @param OrderId 业务开票号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 含税总金额（单位为分） 
     * @return AmountHasTax 含税总金额（单位为分）
     */
    public Long getAmountHasTax() {
        return this.AmountHasTax;
    }

    /**
     * Set 含税总金额（单位为分）
     * @param AmountHasTax 含税总金额（单位为分）
     */
    public void setAmountHasTax(Long AmountHasTax) {
        this.AmountHasTax = AmountHasTax;
    }

    /**
     * Get 总税额（单位为分） 
     * @return TaxAmount 总税额（单位为分）
     */
    public Long getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set 总税额（单位为分）
     * @param TaxAmount 总税额（单位为分）
     */
    public void setTaxAmount(Long TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get 不含税总金额（单位为分）。InvoicePlatformId 为1时，传默认值-1 
     * @return AmountWithoutTax 不含税总金额（单位为分）。InvoicePlatformId 为1时，传默认值-1
     */
    public Long getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set 不含税总金额（单位为分）。InvoicePlatformId 为1时，传默认值-1
     * @param AmountWithoutTax 不含税总金额（单位为分）。InvoicePlatformId 为1时，传默认值-1
     */
    public void setAmountWithoutTax(Long AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get 销方纳税人识别号 
     * @return SellerTaxpayerNum 销方纳税人识别号
     */
    public String getSellerTaxpayerNum() {
        return this.SellerTaxpayerNum;
    }

    /**
     * Set 销方纳税人识别号
     * @param SellerTaxpayerNum 销方纳税人识别号
     */
    public void setSellerTaxpayerNum(String SellerTaxpayerNum) {
        this.SellerTaxpayerNum = SellerTaxpayerNum;
    }

    /**
     * Get 销方名称。（不填默认读取商户注册时输入的信息） 
     * @return SellerName 销方名称。（不填默认读取商户注册时输入的信息）
     */
    public String getSellerName() {
        return this.SellerName;
    }

    /**
     * Set 销方名称。（不填默认读取商户注册时输入的信息）
     * @param SellerName 销方名称。（不填默认读取商户注册时输入的信息）
     */
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    /**
     * Get 销方地址。（不填默认读取商户注册时输入的信息） 
     * @return SellerAddress 销方地址。（不填默认读取商户注册时输入的信息）
     */
    public String getSellerAddress() {
        return this.SellerAddress;
    }

    /**
     * Set 销方地址。（不填默认读取商户注册时输入的信息）
     * @param SellerAddress 销方地址。（不填默认读取商户注册时输入的信息）
     */
    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
    }

    /**
     * Get 销方电话。（不填默认读取商户注册时输入的信息） 
     * @return SellerPhone 销方电话。（不填默认读取商户注册时输入的信息）
     */
    public String getSellerPhone() {
        return this.SellerPhone;
    }

    /**
     * Set 销方电话。（不填默认读取商户注册时输入的信息）
     * @param SellerPhone 销方电话。（不填默认读取商户注册时输入的信息）
     */
    public void setSellerPhone(String SellerPhone) {
        this.SellerPhone = SellerPhone;
    }

    /**
     * Get 销方银行名称。（不填默认读取商户注册时输入的信息） 
     * @return SellerBankName 销方银行名称。（不填默认读取商户注册时输入的信息）
     */
    public String getSellerBankName() {
        return this.SellerBankName;
    }

    /**
     * Set 销方银行名称。（不填默认读取商户注册时输入的信息）
     * @param SellerBankName 销方银行名称。（不填默认读取商户注册时输入的信息）
     */
    public void setSellerBankName(String SellerBankName) {
        this.SellerBankName = SellerBankName;
    }

    /**
     * Get 销方银行账号。（不填默认读取商户注册时输入的信息） 
     * @return SellerBankAccount 销方银行账号。（不填默认读取商户注册时输入的信息）
     */
    public String getSellerBankAccount() {
        return this.SellerBankAccount;
    }

    /**
     * Set 销方银行账号。（不填默认读取商户注册时输入的信息）
     * @param SellerBankAccount 销方银行账号。（不填默认读取商户注册时输入的信息）
     */
    public void setSellerBankAccount(String SellerBankAccount) {
        this.SellerBankAccount = SellerBankAccount;
    }

    /**
     * Get 购方纳税人识别号（购方票面信息）,若抬头类型为2时，必传 
     * @return BuyerTaxpayerNum 购方纳税人识别号（购方票面信息）,若抬头类型为2时，必传
     */
    public String getBuyerTaxpayerNum() {
        return this.BuyerTaxpayerNum;
    }

    /**
     * Set 购方纳税人识别号（购方票面信息）,若抬头类型为2时，必传
     * @param BuyerTaxpayerNum 购方纳税人识别号（购方票面信息）,若抬头类型为2时，必传
     */
    public void setBuyerTaxpayerNum(String BuyerTaxpayerNum) {
        this.BuyerTaxpayerNum = BuyerTaxpayerNum;
    }

    /**
     * Get 购方地址。开具专用发票时必填 
     * @return BuyerAddress 购方地址。开具专用发票时必填
     */
    public String getBuyerAddress() {
        return this.BuyerAddress;
    }

    /**
     * Set 购方地址。开具专用发票时必填
     * @param BuyerAddress 购方地址。开具专用发票时必填
     */
    public void setBuyerAddress(String BuyerAddress) {
        this.BuyerAddress = BuyerAddress;
    }

    /**
     * Get 购方银行名称。开具专用发票时必填 
     * @return BuyerBankName 购方银行名称。开具专用发票时必填
     */
    public String getBuyerBankName() {
        return this.BuyerBankName;
    }

    /**
     * Set 购方银行名称。开具专用发票时必填
     * @param BuyerBankName 购方银行名称。开具专用发票时必填
     */
    public void setBuyerBankName(String BuyerBankName) {
        this.BuyerBankName = BuyerBankName;
    }

    /**
     * Get 购方银行账号。开具专用发票时必填 
     * @return BuyerBankAccount 购方银行账号。开具专用发票时必填
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set 购方银行账号。开具专用发票时必填
     * @param BuyerBankAccount 购方银行账号。开具专用发票时必填
     */
    public void setBuyerBankAccount(String BuyerBankAccount) {
        this.BuyerBankAccount = BuyerBankAccount;
    }

    /**
     * Get 购方电话。开具专用发票时必填 
     * @return BuyerPhone 购方电话。开具专用发票时必填
     */
    public String getBuyerPhone() {
        return this.BuyerPhone;
    }

    /**
     * Set 购方电话。开具专用发票时必填
     * @param BuyerPhone 购方电话。开具专用发票时必填
     */
    public void setBuyerPhone(String BuyerPhone) {
        this.BuyerPhone = BuyerPhone;
    }

    /**
     * Get 收票人邮箱。若填入，会收到发票推送邮件 
     * @return BuyerEmail 收票人邮箱。若填入，会收到发票推送邮件
     */
    public String getBuyerEmail() {
        return this.BuyerEmail;
    }

    /**
     * Set 收票人邮箱。若填入，会收到发票推送邮件
     * @param BuyerEmail 收票人邮箱。若填入，会收到发票推送邮件
     */
    public void setBuyerEmail(String BuyerEmail) {
        this.BuyerEmail = BuyerEmail;
    }

    /**
     * Get 收票人手机号。若填入，会收到发票推送短信 
     * @return TakerPhone 收票人手机号。若填入，会收到发票推送短信
     */
    public String getTakerPhone() {
        return this.TakerPhone;
    }

    /**
     * Set 收票人手机号。若填入，会收到发票推送短信
     * @param TakerPhone 收票人手机号。若填入，会收到发票推送短信
     */
    public void setTakerPhone(String TakerPhone) {
        this.TakerPhone = TakerPhone;
    }

    /**
     * Get 开票类型：
1：增值税专用发票；
2：增值税普通发票；
3：增值税电子发票；
4：增值税卷式发票；
5：区块链电子发票。
若该字段不填，或值不为1-5，则认为开具”增值税电子发票” 
     * @return InvoiceType 开票类型：
1：增值税专用发票；
2：增值税普通发票；
3：增值税电子发票；
4：增值税卷式发票；
5：区块链电子发票。
若该字段不填，或值不为1-5，则认为开具”增值税电子发票”
     */
    public Long getInvoiceType() {
        return this.InvoiceType;
    }

    /**
     * Set 开票类型：
1：增值税专用发票；
2：增值税普通发票；
3：增值税电子发票；
4：增值税卷式发票；
5：区块链电子发票。
若该字段不填，或值不为1-5，则认为开具”增值税电子发票”
     * @param InvoiceType 开票类型：
1：增值税专用发票；
2：增值税普通发票；
3：增值税电子发票；
4：增值税卷式发票；
5：区块链电子发票。
若该字段不填，或值不为1-5，则认为开具”增值税电子发票”
     */
    public void setInvoiceType(Long InvoiceType) {
        this.InvoiceType = InvoiceType;
    }

    /**
     * Get 发票结果回传地址 
     * @return CallbackUrl 发票结果回传地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 发票结果回传地址
     * @param CallbackUrl 发票结果回传地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 开票人姓名。（不填默认读取商户注册时输入的信息） 
     * @return Drawer 开票人姓名。（不填默认读取商户注册时输入的信息）
     */
    public String getDrawer() {
        return this.Drawer;
    }

    /**
     * Set 开票人姓名。（不填默认读取商户注册时输入的信息）
     * @param Drawer 开票人姓名。（不填默认读取商户注册时输入的信息）
     */
    public void setDrawer(String Drawer) {
        this.Drawer = Drawer;
    }

    /**
     * Get 收款人姓名。（不填默认读取商户注册时输入的信息） 
     * @return Payee 收款人姓名。（不填默认读取商户注册时输入的信息）
     */
    public String getPayee() {
        return this.Payee;
    }

    /**
     * Set 收款人姓名。（不填默认读取商户注册时输入的信息）
     * @param Payee 收款人姓名。（不填默认读取商户注册时输入的信息）
     */
    public void setPayee(String Payee) {
        this.Payee = Payee;
    }

    /**
     * Get 复核人姓名。（不填默认读取商户注册时输入的信息） 
     * @return Checker 复核人姓名。（不填默认读取商户注册时输入的信息）
     */
    public String getChecker() {
        return this.Checker;
    }

    /**
     * Set 复核人姓名。（不填默认读取商户注册时输入的信息）
     * @param Checker 复核人姓名。（不填默认读取商户注册时输入的信息）
     */
    public void setChecker(String Checker) {
        this.Checker = Checker;
    }

    /**
     * Get 税盘号 
     * @return TerminalCode 税盘号
     */
    public String getTerminalCode() {
        return this.TerminalCode;
    }

    /**
     * Set 税盘号
     * @param TerminalCode 税盘号
     */
    public void setTerminalCode(String TerminalCode) {
        this.TerminalCode = TerminalCode;
    }

    /**
     * Get 征收方式。开具差额征税发票时必填2。开具普通征税发票时为空 
     * @return LevyMethod 征收方式。开具差额征税发票时必填2。开具普通征税发票时为空
     */
    public String getLevyMethod() {
        return this.LevyMethod;
    }

    /**
     * Set 征收方式。开具差额征税发票时必填2。开具普通征税发票时为空
     * @param LevyMethod 征收方式。开具差额征税发票时必填2。开具普通征税发票时为空
     */
    public void setLevyMethod(String LevyMethod) {
        this.LevyMethod = LevyMethod;
    }

    /**
     * Get 差额征税扣除额（单位为分） 
     * @return Deduction 差额征税扣除额（单位为分）
     */
    public Long getDeduction() {
        return this.Deduction;
    }

    /**
     * Set 差额征税扣除额（单位为分）
     * @param Deduction 差额征税扣除额（单位为分）
     */
    public void setDeduction(Long Deduction) {
        this.Deduction = Deduction;
    }

    /**
     * Get 备注（票面信息） 
     * @return Remark 备注（票面信息）
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注（票面信息）
     * @param Remark 备注（票面信息）
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 项目商品明细 
     * @return Items 项目商品明细
     */
    public CreateInvoiceItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 项目商品明细
     * @param Items 项目商品明细
     */
    public void setItems(CreateInvoiceItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox。 
     * @return Profile 接入环境。沙箱环境填sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox。
     * @param Profile 接入环境。沙箱环境填sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 撤销部分商品。0-不撤销，1-撤销 
     * @return UndoPart 撤销部分商品。0-不撤销，1-撤销
     */
    public Long getUndoPart() {
        return this.UndoPart;
    }

    /**
     * Set 撤销部分商品。0-不撤销，1-撤销
     * @param UndoPart 撤销部分商品。0-不撤销，1-撤销
     */
    public void setUndoPart(Long UndoPart) {
        this.UndoPart = UndoPart;
    }

    /**
     * Get 订单下单时间（格式 YYYYMMDD） 
     * @return OrderDate 订单下单时间（格式 YYYYMMDD）
     */
    public String getOrderDate() {
        return this.OrderDate;
    }

    /**
     * Set 订单下单时间（格式 YYYYMMDD）
     * @param OrderDate 订单下单时间（格式 YYYYMMDD）
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * Get 订单级别折扣（单位为分） 
     * @return Discount 订单级别折扣（单位为分）
     */
    public Long getDiscount() {
        return this.Discount;
    }

    /**
     * Set 订单级别折扣（单位为分）
     * @param Discount 订单级别折扣（单位为分）
     */
    public void setDiscount(Long Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 门店编码 
     * @return StoreNo 门店编码
     */
    public String getStoreNo() {
        return this.StoreNo;
    }

    /**
     * Set 门店编码
     * @param StoreNo 门店编码
     */
    public void setStoreNo(String StoreNo) {
        this.StoreNo = StoreNo;
    }

    /**
     * Get 开票渠道。0：APP渠道，1：线下渠道，2：小程序渠道。不填默认为APP渠道 
     * @return InvoiceChannel 开票渠道。0：APP渠道，1：线下渠道，2：小程序渠道。不填默认为APP渠道
     */
    public Long getInvoiceChannel() {
        return this.InvoiceChannel;
    }

    /**
     * Set 开票渠道。0：APP渠道，1：线下渠道，2：小程序渠道。不填默认为APP渠道
     * @param InvoiceChannel 开票渠道。0：APP渠道，1：线下渠道，2：小程序渠道。不填默认为APP渠道
     */
    public void setInvoiceChannel(Long InvoiceChannel) {
        this.InvoiceChannel = InvoiceChannel;
    }

    public CreateInvoiceV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInvoiceV2Request(CreateInvoiceV2Request source) {
        if (source.InvoicePlatformId != null) {
            this.InvoicePlatformId = new Long(source.InvoicePlatformId);
        }
        if (source.TitleType != null) {
            this.TitleType = new Long(source.TitleType);
        }
        if (source.BuyerTitle != null) {
            this.BuyerTitle = new String(source.BuyerTitle);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.AmountHasTax != null) {
            this.AmountHasTax = new Long(source.AmountHasTax);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new Long(source.TaxAmount);
        }
        if (source.AmountWithoutTax != null) {
            this.AmountWithoutTax = new Long(source.AmountWithoutTax);
        }
        if (source.SellerTaxpayerNum != null) {
            this.SellerTaxpayerNum = new String(source.SellerTaxpayerNum);
        }
        if (source.SellerName != null) {
            this.SellerName = new String(source.SellerName);
        }
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.SellerPhone != null) {
            this.SellerPhone = new String(source.SellerPhone);
        }
        if (source.SellerBankName != null) {
            this.SellerBankName = new String(source.SellerBankName);
        }
        if (source.SellerBankAccount != null) {
            this.SellerBankAccount = new String(source.SellerBankAccount);
        }
        if (source.BuyerTaxpayerNum != null) {
            this.BuyerTaxpayerNum = new String(source.BuyerTaxpayerNum);
        }
        if (source.BuyerAddress != null) {
            this.BuyerAddress = new String(source.BuyerAddress);
        }
        if (source.BuyerBankName != null) {
            this.BuyerBankName = new String(source.BuyerBankName);
        }
        if (source.BuyerBankAccount != null) {
            this.BuyerBankAccount = new String(source.BuyerBankAccount);
        }
        if (source.BuyerPhone != null) {
            this.BuyerPhone = new String(source.BuyerPhone);
        }
        if (source.BuyerEmail != null) {
            this.BuyerEmail = new String(source.BuyerEmail);
        }
        if (source.TakerPhone != null) {
            this.TakerPhone = new String(source.TakerPhone);
        }
        if (source.InvoiceType != null) {
            this.InvoiceType = new Long(source.InvoiceType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Drawer != null) {
            this.Drawer = new String(source.Drawer);
        }
        if (source.Payee != null) {
            this.Payee = new String(source.Payee);
        }
        if (source.Checker != null) {
            this.Checker = new String(source.Checker);
        }
        if (source.TerminalCode != null) {
            this.TerminalCode = new String(source.TerminalCode);
        }
        if (source.LevyMethod != null) {
            this.LevyMethod = new String(source.LevyMethod);
        }
        if (source.Deduction != null) {
            this.Deduction = new Long(source.Deduction);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Items != null) {
            this.Items = new CreateInvoiceItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CreateInvoiceItem(source.Items[i]);
            }
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.UndoPart != null) {
            this.UndoPart = new Long(source.UndoPart);
        }
        if (source.OrderDate != null) {
            this.OrderDate = new String(source.OrderDate);
        }
        if (source.Discount != null) {
            this.Discount = new Long(source.Discount);
        }
        if (source.StoreNo != null) {
            this.StoreNo = new String(source.StoreNo);
        }
        if (source.InvoiceChannel != null) {
            this.InvoiceChannel = new Long(source.InvoiceChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "TitleType", this.TitleType);
        this.setParamSimple(map, prefix + "BuyerTitle", this.BuyerTitle);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "AmountHasTax", this.AmountHasTax);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "AmountWithoutTax", this.AmountWithoutTax);
        this.setParamSimple(map, prefix + "SellerTaxpayerNum", this.SellerTaxpayerNum);
        this.setParamSimple(map, prefix + "SellerName", this.SellerName);
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "SellerPhone", this.SellerPhone);
        this.setParamSimple(map, prefix + "SellerBankName", this.SellerBankName);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "BuyerTaxpayerNum", this.BuyerTaxpayerNum);
        this.setParamSimple(map, prefix + "BuyerAddress", this.BuyerAddress);
        this.setParamSimple(map, prefix + "BuyerBankName", this.BuyerBankName);
        this.setParamSimple(map, prefix + "BuyerBankAccount", this.BuyerBankAccount);
        this.setParamSimple(map, prefix + "BuyerPhone", this.BuyerPhone);
        this.setParamSimple(map, prefix + "BuyerEmail", this.BuyerEmail);
        this.setParamSimple(map, prefix + "TakerPhone", this.TakerPhone);
        this.setParamSimple(map, prefix + "InvoiceType", this.InvoiceType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Drawer", this.Drawer);
        this.setParamSimple(map, prefix + "Payee", this.Payee);
        this.setParamSimple(map, prefix + "Checker", this.Checker);
        this.setParamSimple(map, prefix + "TerminalCode", this.TerminalCode);
        this.setParamSimple(map, prefix + "LevyMethod", this.LevyMethod);
        this.setParamSimple(map, prefix + "Deduction", this.Deduction);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "UndoPart", this.UndoPart);
        this.setParamSimple(map, prefix + "OrderDate", this.OrderDate);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "StoreNo", this.StoreNo);
        this.setParamSimple(map, prefix + "InvoiceChannel", this.InvoiceChannel);

    }
}

