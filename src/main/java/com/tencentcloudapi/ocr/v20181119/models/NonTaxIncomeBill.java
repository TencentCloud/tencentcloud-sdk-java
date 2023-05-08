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

public class NonTaxIncomeBill extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 发票代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 校验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

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
    * 交款人名称
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 交款人纳税人识别号
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * 收款人名称
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * 收款单位名称
    */
    @SerializedName("SellerCompany")
    @Expose
    private String SellerCompany;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 币种
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * 复核人
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 其他信息
    */
    @SerializedName("OtherInfo")
    @Expose
    private String OtherInfo;

    /**
    * 缴款码
    */
    @SerializedName("PaymentCode")
    @Expose
    private String PaymentCode;

    /**
    * 执收单位编码
    */
    @SerializedName("ReceiveUnitCode")
    @Expose
    private String ReceiveUnitCode;

    /**
    * 执收单位名称
    */
    @SerializedName("Receiver")
    @Expose
    private String Receiver;

    /**
    * 经办人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 付款人账号
    */
    @SerializedName("PayerAccount")
    @Expose
    private String PayerAccount;

    /**
    * 付款人开户银行
    */
    @SerializedName("PayerBank")
    @Expose
    private String PayerBank;

    /**
    * 收款人账号
    */
    @SerializedName("ReceiverAccount")
    @Expose
    private String ReceiverAccount;

    /**
    * 收款人开户银行
    */
    @SerializedName("ReceiverBank")
    @Expose
    private String ReceiverBank;

    /**
    * 条目
    */
    @SerializedName("NonTaxItems")
    @Expose
    private NonTaxItem [] NonTaxItems;

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
     * Get 交款人名称 
     * @return Buyer 交款人名称
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set 交款人名称
     * @param Buyer 交款人名称
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get 交款人纳税人识别号 
     * @return BuyerTaxID 交款人纳税人识别号
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set 交款人纳税人识别号
     * @param BuyerTaxID 交款人纳税人识别号
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get 收款人名称 
     * @return Seller 收款人名称
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set 收款人名称
     * @param Seller 收款人名称
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get 收款单位名称 
     * @return SellerCompany 收款单位名称
     */
    public String getSellerCompany() {
        return this.SellerCompany;
    }

    /**
     * Set 收款单位名称
     * @param SellerCompany 收款单位名称
     */
    public void setSellerCompany(String SellerCompany) {
        this.SellerCompany = SellerCompany;
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
     * Get 币种 
     * @return CurrencyCode 币种
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set 币种
     * @param CurrencyCode 币种
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
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
     * Get 其他信息 
     * @return OtherInfo 其他信息
     */
    public String getOtherInfo() {
        return this.OtherInfo;
    }

    /**
     * Set 其他信息
     * @param OtherInfo 其他信息
     */
    public void setOtherInfo(String OtherInfo) {
        this.OtherInfo = OtherInfo;
    }

    /**
     * Get 缴款码 
     * @return PaymentCode 缴款码
     */
    public String getPaymentCode() {
        return this.PaymentCode;
    }

    /**
     * Set 缴款码
     * @param PaymentCode 缴款码
     */
    public void setPaymentCode(String PaymentCode) {
        this.PaymentCode = PaymentCode;
    }

    /**
     * Get 执收单位编码 
     * @return ReceiveUnitCode 执收单位编码
     */
    public String getReceiveUnitCode() {
        return this.ReceiveUnitCode;
    }

    /**
     * Set 执收单位编码
     * @param ReceiveUnitCode 执收单位编码
     */
    public void setReceiveUnitCode(String ReceiveUnitCode) {
        this.ReceiveUnitCode = ReceiveUnitCode;
    }

    /**
     * Get 执收单位名称 
     * @return Receiver 执收单位名称
     */
    public String getReceiver() {
        return this.Receiver;
    }

    /**
     * Set 执收单位名称
     * @param Receiver 执收单位名称
     */
    public void setReceiver(String Receiver) {
        this.Receiver = Receiver;
    }

    /**
     * Get 经办人 
     * @return Operator 经办人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 经办人
     * @param Operator 经办人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 付款人账号 
     * @return PayerAccount 付款人账号
     */
    public String getPayerAccount() {
        return this.PayerAccount;
    }

    /**
     * Set 付款人账号
     * @param PayerAccount 付款人账号
     */
    public void setPayerAccount(String PayerAccount) {
        this.PayerAccount = PayerAccount;
    }

    /**
     * Get 付款人开户银行 
     * @return PayerBank 付款人开户银行
     */
    public String getPayerBank() {
        return this.PayerBank;
    }

    /**
     * Set 付款人开户银行
     * @param PayerBank 付款人开户银行
     */
    public void setPayerBank(String PayerBank) {
        this.PayerBank = PayerBank;
    }

    /**
     * Get 收款人账号 
     * @return ReceiverAccount 收款人账号
     */
    public String getReceiverAccount() {
        return this.ReceiverAccount;
    }

    /**
     * Set 收款人账号
     * @param ReceiverAccount 收款人账号
     */
    public void setReceiverAccount(String ReceiverAccount) {
        this.ReceiverAccount = ReceiverAccount;
    }

    /**
     * Get 收款人开户银行 
     * @return ReceiverBank 收款人开户银行
     */
    public String getReceiverBank() {
        return this.ReceiverBank;
    }

    /**
     * Set 收款人开户银行
     * @param ReceiverBank 收款人开户银行
     */
    public void setReceiverBank(String ReceiverBank) {
        this.ReceiverBank = ReceiverBank;
    }

    /**
     * Get 条目 
     * @return NonTaxItems 条目
     */
    public NonTaxItem [] getNonTaxItems() {
        return this.NonTaxItems;
    }

    /**
     * Set 条目
     * @param NonTaxItems 条目
     */
    public void setNonTaxItems(NonTaxItem [] NonTaxItems) {
        this.NonTaxItems = NonTaxItems;
    }

    public NonTaxIncomeBill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NonTaxIncomeBill(NonTaxIncomeBill source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerCompany != null) {
            this.SellerCompany = new String(source.SellerCompany);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CurrencyCode != null) {
            this.CurrencyCode = new String(source.CurrencyCode);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.OtherInfo != null) {
            this.OtherInfo = new String(source.OtherInfo);
        }
        if (source.PaymentCode != null) {
            this.PaymentCode = new String(source.PaymentCode);
        }
        if (source.ReceiveUnitCode != null) {
            this.ReceiveUnitCode = new String(source.ReceiveUnitCode);
        }
        if (source.Receiver != null) {
            this.Receiver = new String(source.Receiver);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.PayerAccount != null) {
            this.PayerAccount = new String(source.PayerAccount);
        }
        if (source.PayerBank != null) {
            this.PayerBank = new String(source.PayerBank);
        }
        if (source.ReceiverAccount != null) {
            this.ReceiverAccount = new String(source.ReceiverAccount);
        }
        if (source.ReceiverBank != null) {
            this.ReceiverBank = new String(source.ReceiverBank);
        }
        if (source.NonTaxItems != null) {
            this.NonTaxItems = new NonTaxItem[source.NonTaxItems.length];
            for (int i = 0; i < source.NonTaxItems.length; i++) {
                this.NonTaxItems[i] = new NonTaxItem(source.NonTaxItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerCompany", this.SellerCompany);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "OtherInfo", this.OtherInfo);
        this.setParamSimple(map, prefix + "PaymentCode", this.PaymentCode);
        this.setParamSimple(map, prefix + "ReceiveUnitCode", this.ReceiveUnitCode);
        this.setParamSimple(map, prefix + "Receiver", this.Receiver);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "PayerAccount", this.PayerAccount);
        this.setParamSimple(map, prefix + "PayerBank", this.PayerBank);
        this.setParamSimple(map, prefix + "ReceiverAccount", this.ReceiverAccount);
        this.setParamSimple(map, prefix + "ReceiverBank", this.ReceiverBank);
        this.setParamArrayObj(map, prefix + "NonTaxItems.", this.NonTaxItems);

    }
}

