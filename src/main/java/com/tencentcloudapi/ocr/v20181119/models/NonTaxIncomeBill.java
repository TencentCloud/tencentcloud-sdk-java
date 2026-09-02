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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NonTaxIncomeBill extends AbstractModel {

    /**
    * <p>发票名称</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>发票号码</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>发票代码</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>校验码</p>
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * <p>开票日期</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>价税合计（小写）</p>
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * <p>价税合计（大写）</p>
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * <p>交款人名称</p>
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * <p>交款人纳税人识别号</p>
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * <p>收款人名称</p>
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * <p>收款单位名称</p>
    */
    @SerializedName("SellerCompany")
    @Expose
    private String SellerCompany;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>币种</p>
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * <p>复核人</p>
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * <p>是否存在二维码（1：有，0：无）</p>
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * <p>其他信息</p>
    */
    @SerializedName("OtherInfo")
    @Expose
    private String OtherInfo;

    /**
    * <p>缴款码</p>
    */
    @SerializedName("PaymentCode")
    @Expose
    private String PaymentCode;

    /**
    * <p>执收单位编码</p>
    */
    @SerializedName("ReceiveUnitCode")
    @Expose
    private String ReceiveUnitCode;

    /**
    * <p>执收单位名称</p>
    */
    @SerializedName("Receiver")
    @Expose
    private String Receiver;

    /**
    * <p>经办人</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>付款人账号</p>
    */
    @SerializedName("PayerAccount")
    @Expose
    private String PayerAccount;

    /**
    * <p>付款人开户银行</p>
    */
    @SerializedName("PayerBank")
    @Expose
    private String PayerBank;

    /**
    * <p>收款人账号</p>
    */
    @SerializedName("ReceiverAccount")
    @Expose
    private String ReceiverAccount;

    /**
    * <p>收款人开户银行</p>
    */
    @SerializedName("ReceiverBank")
    @Expose
    private String ReceiverBank;

    /**
    * <p>条目</p>
    */
    @SerializedName("NonTaxItems")
    @Expose
    private NonTaxItem [] NonTaxItems;

    /**
    * <p>票据名称</p>
    */
    @SerializedName("BillName")
    @Expose
    private String BillName;

    /**
     * Get <p>发票名称</p> 
     * @return Title <p>发票名称</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>发票名称</p>
     * @param Title <p>发票名称</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>发票号码</p> 
     * @return Number <p>发票号码</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>发票号码</p>
     * @param Number <p>发票号码</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>发票代码</p> 
     * @return Code <p>发票代码</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>发票代码</p>
     * @param Code <p>发票代码</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>校验码</p> 
     * @return CheckCode <p>校验码</p>
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set <p>校验码</p>
     * @param CheckCode <p>校验码</p>
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get <p>开票日期</p> 
     * @return Date <p>开票日期</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>开票日期</p>
     * @param Date <p>开票日期</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>价税合计（小写）</p> 
     * @return Total <p>价税合计（小写）</p>
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set <p>价税合计（小写）</p>
     * @param Total <p>价税合计（小写）</p>
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get <p>价税合计（大写）</p> 
     * @return TotalCn <p>价税合计（大写）</p>
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set <p>价税合计（大写）</p>
     * @param TotalCn <p>价税合计（大写）</p>
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get <p>交款人名称</p> 
     * @return Buyer <p>交款人名称</p>
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set <p>交款人名称</p>
     * @param Buyer <p>交款人名称</p>
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get <p>交款人纳税人识别号</p> 
     * @return BuyerTaxID <p>交款人纳税人识别号</p>
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set <p>交款人纳税人识别号</p>
     * @param BuyerTaxID <p>交款人纳税人识别号</p>
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get <p>收款人名称</p> 
     * @return Seller <p>收款人名称</p>
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set <p>收款人名称</p>
     * @param Seller <p>收款人名称</p>
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get <p>收款单位名称</p> 
     * @return SellerCompany <p>收款单位名称</p>
     */
    public String getSellerCompany() {
        return this.SellerCompany;
    }

    /**
     * Set <p>收款单位名称</p>
     * @param SellerCompany <p>收款单位名称</p>
     */
    public void setSellerCompany(String SellerCompany) {
        this.SellerCompany = SellerCompany;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>币种</p> 
     * @return CurrencyCode <p>币种</p>
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set <p>币种</p>
     * @param CurrencyCode <p>币种</p>
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    /**
     * Get <p>复核人</p> 
     * @return Reviewer <p>复核人</p>
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set <p>复核人</p>
     * @param Reviewer <p>复核人</p>
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    /**
     * Get <p>是否存在二维码（1：有，0：无）</p> 
     * @return QRCodeMark <p>是否存在二维码（1：有，0：无）</p>
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set <p>是否存在二维码（1：有，0：无）</p>
     * @param QRCodeMark <p>是否存在二维码（1：有，0：无）</p>
     */
    public void setQRCodeMark(Long QRCodeMark) {
        this.QRCodeMark = QRCodeMark;
    }

    /**
     * Get <p>其他信息</p> 
     * @return OtherInfo <p>其他信息</p>
     */
    public String getOtherInfo() {
        return this.OtherInfo;
    }

    /**
     * Set <p>其他信息</p>
     * @param OtherInfo <p>其他信息</p>
     */
    public void setOtherInfo(String OtherInfo) {
        this.OtherInfo = OtherInfo;
    }

    /**
     * Get <p>缴款码</p> 
     * @return PaymentCode <p>缴款码</p>
     */
    public String getPaymentCode() {
        return this.PaymentCode;
    }

    /**
     * Set <p>缴款码</p>
     * @param PaymentCode <p>缴款码</p>
     */
    public void setPaymentCode(String PaymentCode) {
        this.PaymentCode = PaymentCode;
    }

    /**
     * Get <p>执收单位编码</p> 
     * @return ReceiveUnitCode <p>执收单位编码</p>
     */
    public String getReceiveUnitCode() {
        return this.ReceiveUnitCode;
    }

    /**
     * Set <p>执收单位编码</p>
     * @param ReceiveUnitCode <p>执收单位编码</p>
     */
    public void setReceiveUnitCode(String ReceiveUnitCode) {
        this.ReceiveUnitCode = ReceiveUnitCode;
    }

    /**
     * Get <p>执收单位名称</p> 
     * @return Receiver <p>执收单位名称</p>
     */
    public String getReceiver() {
        return this.Receiver;
    }

    /**
     * Set <p>执收单位名称</p>
     * @param Receiver <p>执收单位名称</p>
     */
    public void setReceiver(String Receiver) {
        this.Receiver = Receiver;
    }

    /**
     * Get <p>经办人</p> 
     * @return Operator <p>经办人</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>经办人</p>
     * @param Operator <p>经办人</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>付款人账号</p> 
     * @return PayerAccount <p>付款人账号</p>
     */
    public String getPayerAccount() {
        return this.PayerAccount;
    }

    /**
     * Set <p>付款人账号</p>
     * @param PayerAccount <p>付款人账号</p>
     */
    public void setPayerAccount(String PayerAccount) {
        this.PayerAccount = PayerAccount;
    }

    /**
     * Get <p>付款人开户银行</p> 
     * @return PayerBank <p>付款人开户银行</p>
     */
    public String getPayerBank() {
        return this.PayerBank;
    }

    /**
     * Set <p>付款人开户银行</p>
     * @param PayerBank <p>付款人开户银行</p>
     */
    public void setPayerBank(String PayerBank) {
        this.PayerBank = PayerBank;
    }

    /**
     * Get <p>收款人账号</p> 
     * @return ReceiverAccount <p>收款人账号</p>
     */
    public String getReceiverAccount() {
        return this.ReceiverAccount;
    }

    /**
     * Set <p>收款人账号</p>
     * @param ReceiverAccount <p>收款人账号</p>
     */
    public void setReceiverAccount(String ReceiverAccount) {
        this.ReceiverAccount = ReceiverAccount;
    }

    /**
     * Get <p>收款人开户银行</p> 
     * @return ReceiverBank <p>收款人开户银行</p>
     */
    public String getReceiverBank() {
        return this.ReceiverBank;
    }

    /**
     * Set <p>收款人开户银行</p>
     * @param ReceiverBank <p>收款人开户银行</p>
     */
    public void setReceiverBank(String ReceiverBank) {
        this.ReceiverBank = ReceiverBank;
    }

    /**
     * Get <p>条目</p> 
     * @return NonTaxItems <p>条目</p>
     */
    public NonTaxItem [] getNonTaxItems() {
        return this.NonTaxItems;
    }

    /**
     * Set <p>条目</p>
     * @param NonTaxItems <p>条目</p>
     */
    public void setNonTaxItems(NonTaxItem [] NonTaxItems) {
        this.NonTaxItems = NonTaxItems;
    }

    /**
     * Get <p>票据名称</p> 
     * @return BillName <p>票据名称</p>
     */
    public String getBillName() {
        return this.BillName;
    }

    /**
     * Set <p>票据名称</p>
     * @param BillName <p>票据名称</p>
     */
    public void setBillName(String BillName) {
        this.BillName = BillName;
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
        if (source.BillName != null) {
            this.BillName = new String(source.BillName);
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
        this.setParamSimple(map, prefix + "BillName", this.BillName);

    }
}

