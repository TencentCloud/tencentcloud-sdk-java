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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachinePrintedInvoice extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 发票代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 校验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 密码区
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

    /**
    * 种类
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 税前金额
    */
    @SerializedName("PretaxAmount")
    @Expose
    private String PretaxAmount;

    /**
    * 价税合计（小写）
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 价税合计（大写）
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * 合计税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 行业分类
    */
    @SerializedName("IndustryClass")
    @Expose
    private String IndustryClass;

    /**
    * 销售方名称
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * 销售方纳税人识别号
    */
    @SerializedName("SellerTaxID")
    @Expose
    private String SellerTaxID;

    /**
    * 销售方地址电话
    */
    @SerializedName("SellerAddrTel")
    @Expose
    private String SellerAddrTel;

    /**
    * 销售方银行账号
    */
    @SerializedName("SellerBankAccount")
    @Expose
    private String SellerBankAccount;

    /**
    * 购买方名称
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 购买方纳税人识别号
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * 购买方地址电话
    */
    @SerializedName("BuyerAddrTel")
    @Expose
    private String BuyerAddrTel;

    /**
    * 购买方银行账号
    */
    @SerializedName("BuyerBankAccount")
    @Expose
    private String BuyerBankAccount;

    /**
    * 发票消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * 是否为浙江/广东通用机打发票（0：没有，1：有）
    */
    @SerializedName("ElectronicMark")
    @Expose
    private Long ElectronicMark;

    /**
    * 开票人
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 收款人
    */
    @SerializedName("Receiptor")
    @Expose
    private String Receiptor;

    /**
    * 复核人
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 经办人支付信息
    */
    @SerializedName("PaymentInfo")
    @Expose
    private String PaymentInfo;

    /**
    * 经办人取票用户
    */
    @SerializedName("TicketPickupUser")
    @Expose
    private String TicketPickupUser;

    /**
    * 经办人商户号
    */
    @SerializedName("MerchantNumber")
    @Expose
    private String MerchantNumber;

    /**
    * 经办人订单号
    */
    @SerializedName("OrderNumber")
    @Expose
    private String OrderNumber;

    /**
    * 条目
    */
    @SerializedName("GeneralMachineItems")
    @Expose
    private GeneralMachineItem [] GeneralMachineItems;

    /**
     * Get 发票名称 
     * @return Title 发票名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 发票名称
     * @param Title 发票名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 是否存在二维码（1：有，0：无） 
     * @return QRCodeMark 是否存在二维码（1：有，0：无）
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set 是否存在二维码（1：有，0：无）
     * @param QRCodeMark 是否存在二维码（1：有，0：无）
     */
    public void setQRCodeMark(Long QRCodeMark) {
        this.QRCodeMark = QRCodeMark;
    }

    /**
     * Get 发票代码 
     * @return Code 发票代码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 发票代码
     * @param Code 发票代码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 发票号码 
     * @return Number 发票号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 发票号码
     * @param Number 发票号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 开票日期 
     * @return Date 开票日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 开票日期
     * @param Date 开票日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 时间 
     * @return Time 时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 校验码 
     * @return CheckCode 校验码
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码
     * @param CheckCode 校验码
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 密码区 
     * @return Ciphertext 密码区
     */
    public String getCiphertext() {
        return this.Ciphertext;
    }

    /**
     * Set 密码区
     * @param Ciphertext 密码区
     */
    public void setCiphertext(String Ciphertext) {
        this.Ciphertext = Ciphertext;
    }

    /**
     * Get 种类 
     * @return Category 种类
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 种类
     * @param Category 种类
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 税前金额 
     * @return PretaxAmount 税前金额
     */
    public String getPretaxAmount() {
        return this.PretaxAmount;
    }

    /**
     * Set 税前金额
     * @param PretaxAmount 税前金额
     */
    public void setPretaxAmount(String PretaxAmount) {
        this.PretaxAmount = PretaxAmount;
    }

    /**
     * Get 价税合计（小写） 
     * @return Total 价税合计（小写）
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 价税合计（小写）
     * @param Total 价税合计（小写）
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 价税合计（大写） 
     * @return TotalCn 价税合计（大写）
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set 价税合计（大写）
     * @param TotalCn 价税合计（大写）
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get 合计税额 
     * @return Tax 合计税额
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 合计税额
     * @param Tax 合计税额
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 行业分类 
     * @return IndustryClass 行业分类
     */
    public String getIndustryClass() {
        return this.IndustryClass;
    }

    /**
     * Set 行业分类
     * @param IndustryClass 行业分类
     */
    public void setIndustryClass(String IndustryClass) {
        this.IndustryClass = IndustryClass;
    }

    /**
     * Get 销售方名称 
     * @return Seller 销售方名称
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set 销售方名称
     * @param Seller 销售方名称
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get 销售方纳税人识别号 
     * @return SellerTaxID 销售方纳税人识别号
     */
    public String getSellerTaxID() {
        return this.SellerTaxID;
    }

    /**
     * Set 销售方纳税人识别号
     * @param SellerTaxID 销售方纳税人识别号
     */
    public void setSellerTaxID(String SellerTaxID) {
        this.SellerTaxID = SellerTaxID;
    }

    /**
     * Get 销售方地址电话 
     * @return SellerAddrTel 销售方地址电话
     */
    public String getSellerAddrTel() {
        return this.SellerAddrTel;
    }

    /**
     * Set 销售方地址电话
     * @param SellerAddrTel 销售方地址电话
     */
    public void setSellerAddrTel(String SellerAddrTel) {
        this.SellerAddrTel = SellerAddrTel;
    }

    /**
     * Get 销售方银行账号 
     * @return SellerBankAccount 销售方银行账号
     */
    public String getSellerBankAccount() {
        return this.SellerBankAccount;
    }

    /**
     * Set 销售方银行账号
     * @param SellerBankAccount 销售方银行账号
     */
    public void setSellerBankAccount(String SellerBankAccount) {
        this.SellerBankAccount = SellerBankAccount;
    }

    /**
     * Get 购买方名称 
     * @return Buyer 购买方名称
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set 购买方名称
     * @param Buyer 购买方名称
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get 购买方纳税人识别号 
     * @return BuyerTaxID 购买方纳税人识别号
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set 购买方纳税人识别号
     * @param BuyerTaxID 购买方纳税人识别号
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get 购买方地址电话 
     * @return BuyerAddrTel 购买方地址电话
     */
    public String getBuyerAddrTel() {
        return this.BuyerAddrTel;
    }

    /**
     * Set 购买方地址电话
     * @param BuyerAddrTel 购买方地址电话
     */
    public void setBuyerAddrTel(String BuyerAddrTel) {
        this.BuyerAddrTel = BuyerAddrTel;
    }

    /**
     * Get 购买方银行账号 
     * @return BuyerBankAccount 购买方银行账号
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set 购买方银行账号
     * @param BuyerBankAccount 购买方银行账号
     */
    public void setBuyerBankAccount(String BuyerBankAccount) {
        this.BuyerBankAccount = BuyerBankAccount;
    }

    /**
     * Get 发票消费类型 
     * @return Kind 发票消费类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 发票消费类型
     * @param Kind 发票消费类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 省 
     * @return Province 省
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省
     * @param Province 省
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 市 
     * @return City 市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 市
     * @param City 市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 是否有公司印章（0：没有，1：有） 
     * @return CompanySealMark 是否有公司印章（0：没有，1：有）
     */
    public Long getCompanySealMark() {
        return this.CompanySealMark;
    }

    /**
     * Set 是否有公司印章（0：没有，1：有）
     * @param CompanySealMark 是否有公司印章（0：没有，1：有）
     */
    public void setCompanySealMark(Long CompanySealMark) {
        this.CompanySealMark = CompanySealMark;
    }

    /**
     * Get 是否为浙江/广东通用机打发票（0：没有，1：有） 
     * @return ElectronicMark 是否为浙江/广东通用机打发票（0：没有，1：有）
     */
    public Long getElectronicMark() {
        return this.ElectronicMark;
    }

    /**
     * Set 是否为浙江/广东通用机打发票（0：没有，1：有）
     * @param ElectronicMark 是否为浙江/广东通用机打发票（0：没有，1：有）
     */
    public void setElectronicMark(Long ElectronicMark) {
        this.ElectronicMark = ElectronicMark;
    }

    /**
     * Get 开票人 
     * @return Issuer 开票人
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 开票人
     * @param Issuer 开票人
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 收款人 
     * @return Receiptor 收款人
     */
    public String getReceiptor() {
        return this.Receiptor;
    }

    /**
     * Set 收款人
     * @param Receiptor 收款人
     */
    public void setReceiptor(String Receiptor) {
        this.Receiptor = Receiptor;
    }

    /**
     * Get 复核人 
     * @return Reviewer 复核人
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set 复核人
     * @param Reviewer 复核人
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 经办人支付信息 
     * @return PaymentInfo 经办人支付信息
     */
    public String getPaymentInfo() {
        return this.PaymentInfo;
    }

    /**
     * Set 经办人支付信息
     * @param PaymentInfo 经办人支付信息
     */
    public void setPaymentInfo(String PaymentInfo) {
        this.PaymentInfo = PaymentInfo;
    }

    /**
     * Get 经办人取票用户 
     * @return TicketPickupUser 经办人取票用户
     */
    public String getTicketPickupUser() {
        return this.TicketPickupUser;
    }

    /**
     * Set 经办人取票用户
     * @param TicketPickupUser 经办人取票用户
     */
    public void setTicketPickupUser(String TicketPickupUser) {
        this.TicketPickupUser = TicketPickupUser;
    }

    /**
     * Get 经办人商户号 
     * @return MerchantNumber 经办人商户号
     */
    public String getMerchantNumber() {
        return this.MerchantNumber;
    }

    /**
     * Set 经办人商户号
     * @param MerchantNumber 经办人商户号
     */
    public void setMerchantNumber(String MerchantNumber) {
        this.MerchantNumber = MerchantNumber;
    }

    /**
     * Get 经办人订单号 
     * @return OrderNumber 经办人订单号
     */
    public String getOrderNumber() {
        return this.OrderNumber;
    }

    /**
     * Set 经办人订单号
     * @param OrderNumber 经办人订单号
     */
    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    /**
     * Get 条目 
     * @return GeneralMachineItems 条目
     */
    public GeneralMachineItem [] getGeneralMachineItems() {
        return this.GeneralMachineItems;
    }

    /**
     * Set 条目
     * @param GeneralMachineItems 条目
     */
    public void setGeneralMachineItems(GeneralMachineItem [] GeneralMachineItems) {
        this.GeneralMachineItems = GeneralMachineItems;
    }

    public MachinePrintedInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachinePrintedInvoice(MachinePrintedInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Ciphertext != null) {
            this.Ciphertext = new String(source.Ciphertext);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.IndustryClass != null) {
            this.IndustryClass = new String(source.IndustryClass);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.SellerAddrTel != null) {
            this.SellerAddrTel = new String(source.SellerAddrTel);
        }
        if (source.SellerBankAccount != null) {
            this.SellerBankAccount = new String(source.SellerBankAccount);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.BuyerAddrTel != null) {
            this.BuyerAddrTel = new String(source.BuyerAddrTel);
        }
        if (source.BuyerBankAccount != null) {
            this.BuyerBankAccount = new String(source.BuyerBankAccount);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.ElectronicMark != null) {
            this.ElectronicMark = new Long(source.ElectronicMark);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Receiptor != null) {
            this.Receiptor = new String(source.Receiptor);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PaymentInfo != null) {
            this.PaymentInfo = new String(source.PaymentInfo);
        }
        if (source.TicketPickupUser != null) {
            this.TicketPickupUser = new String(source.TicketPickupUser);
        }
        if (source.MerchantNumber != null) {
            this.MerchantNumber = new String(source.MerchantNumber);
        }
        if (source.OrderNumber != null) {
            this.OrderNumber = new String(source.OrderNumber);
        }
        if (source.GeneralMachineItems != null) {
            this.GeneralMachineItems = new GeneralMachineItem[source.GeneralMachineItems.length];
            for (int i = 0; i < source.GeneralMachineItems.length; i++) {
                this.GeneralMachineItems[i] = new GeneralMachineItem(source.GeneralMachineItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "IndustryClass", this.IndustryClass);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerAddrTel", this.SellerAddrTel);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "BuyerAddrTel", this.BuyerAddrTel);
        this.setParamSimple(map, prefix + "BuyerBankAccount", this.BuyerBankAccount);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "ElectronicMark", this.ElectronicMark);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Receiptor", this.Receiptor);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PaymentInfo", this.PaymentInfo);
        this.setParamSimple(map, prefix + "TicketPickupUser", this.TicketPickupUser);
        this.setParamSimple(map, prefix + "MerchantNumber", this.MerchantNumber);
        this.setParamSimple(map, prefix + "OrderNumber", this.OrderNumber);
        this.setParamArrayObj(map, prefix + "GeneralMachineItems.", this.GeneralMachineItems);

    }
}

