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

public class VatElectronicInfo extends AbstractModel {

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
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 税前金额
    */
    @SerializedName("PretaxAmount")
    @Expose
    private String PretaxAmount;

    /**
    * 合计税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

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
    * 开票人
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 小计金额
    */
    @SerializedName("SubTotal")
    @Expose
    private String SubTotal;

    /**
    * 小计税额
    */
    @SerializedName("SubTax")
    @Expose
    private String SubTax;

    /**
    * 电子发票详细条目信息
    */
    @SerializedName("VatElectronicItems")
    @Expose
    private VatElectronicItemInfo [] VatElectronicItems;

    /**
    * 业务类型标志
    */
    @SerializedName("ServiceTypeLabel")
    @Expose
    private String ServiceTypeLabel;

    /**
    * 价税合计(大写)前符号
    */
    @SerializedName("TotalCnMark")
    @Expose
    private String TotalCnMark;

    /**
    * 价税合计(小写)前字样
    */
    @SerializedName("TotalMark")
    @Expose
    private String TotalMark;

    /**
    * 合计金额前字样
    */
    @SerializedName("PretaxAmountMark")
    @Expose
    private String PretaxAmountMark;

    /**
    * 合计税额前字样
    */
    @SerializedName("TaxMark")
    @Expose
    private String TaxMark;

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * 全电类型的多页pdf票据中，支持输出票面页码：当前第几页，一共第几页。
    */
    @SerializedName("InvoicePageIndex")
    @Expose
    private String InvoicePageIndex;

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
     * Get 小计金额 
     * @return SubTotal 小计金额
     */
    public String getSubTotal() {
        return this.SubTotal;
    }

    /**
     * Set 小计金额
     * @param SubTotal 小计金额
     */
    public void setSubTotal(String SubTotal) {
        this.SubTotal = SubTotal;
    }

    /**
     * Get 小计税额 
     * @return SubTax 小计税额
     */
    public String getSubTax() {
        return this.SubTax;
    }

    /**
     * Set 小计税额
     * @param SubTax 小计税额
     */
    public void setSubTax(String SubTax) {
        this.SubTax = SubTax;
    }

    /**
     * Get 电子发票详细条目信息 
     * @return VatElectronicItems 电子发票详细条目信息
     */
    public VatElectronicItemInfo [] getVatElectronicItems() {
        return this.VatElectronicItems;
    }

    /**
     * Set 电子发票详细条目信息
     * @param VatElectronicItems 电子发票详细条目信息
     */
    public void setVatElectronicItems(VatElectronicItemInfo [] VatElectronicItems) {
        this.VatElectronicItems = VatElectronicItems;
    }

    /**
     * Get 业务类型标志 
     * @return ServiceTypeLabel 业务类型标志
     */
    public String getServiceTypeLabel() {
        return this.ServiceTypeLabel;
    }

    /**
     * Set 业务类型标志
     * @param ServiceTypeLabel 业务类型标志
     */
    public void setServiceTypeLabel(String ServiceTypeLabel) {
        this.ServiceTypeLabel = ServiceTypeLabel;
    }

    /**
     * Get 价税合计(大写)前符号 
     * @return TotalCnMark 价税合计(大写)前符号
     */
    public String getTotalCnMark() {
        return this.TotalCnMark;
    }

    /**
     * Set 价税合计(大写)前符号
     * @param TotalCnMark 价税合计(大写)前符号
     */
    public void setTotalCnMark(String TotalCnMark) {
        this.TotalCnMark = TotalCnMark;
    }

    /**
     * Get 价税合计(小写)前字样 
     * @return TotalMark 价税合计(小写)前字样
     */
    public String getTotalMark() {
        return this.TotalMark;
    }

    /**
     * Set 价税合计(小写)前字样
     * @param TotalMark 价税合计(小写)前字样
     */
    public void setTotalMark(String TotalMark) {
        this.TotalMark = TotalMark;
    }

    /**
     * Get 合计金额前字样 
     * @return PretaxAmountMark 合计金额前字样
     */
    public String getPretaxAmountMark() {
        return this.PretaxAmountMark;
    }

    /**
     * Set 合计金额前字样
     * @param PretaxAmountMark 合计金额前字样
     */
    public void setPretaxAmountMark(String PretaxAmountMark) {
        this.PretaxAmountMark = PretaxAmountMark;
    }

    /**
     * Get 合计税额前字样 
     * @return TaxMark 合计税额前字样
     */
    public String getTaxMark() {
        return this.TaxMark;
    }

    /**
     * Set 合计税额前字样
     * @param TaxMark 合计税额前字样
     */
    public void setTaxMark(String TaxMark) {
        this.TaxMark = TaxMark;
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
     * Get 全电类型的多页pdf票据中，支持输出票面页码：当前第几页，一共第几页。 
     * @return InvoicePageIndex 全电类型的多页pdf票据中，支持输出票面页码：当前第几页，一共第几页。
     */
    public String getInvoicePageIndex() {
        return this.InvoicePageIndex;
    }

    /**
     * Set 全电类型的多页pdf票据中，支持输出票面页码：当前第几页，一共第几页。
     * @param InvoicePageIndex 全电类型的多页pdf票据中，支持输出票面页码：当前第几页，一共第几页。
     */
    public void setInvoicePageIndex(String InvoicePageIndex) {
        this.InvoicePageIndex = InvoicePageIndex;
    }

    public VatElectronicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatElectronicInfo(VatElectronicInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SubTotal != null) {
            this.SubTotal = new String(source.SubTotal);
        }
        if (source.SubTax != null) {
            this.SubTax = new String(source.SubTax);
        }
        if (source.VatElectronicItems != null) {
            this.VatElectronicItems = new VatElectronicItemInfo[source.VatElectronicItems.length];
            for (int i = 0; i < source.VatElectronicItems.length; i++) {
                this.VatElectronicItems[i] = new VatElectronicItemInfo(source.VatElectronicItems[i]);
            }
        }
        if (source.ServiceTypeLabel != null) {
            this.ServiceTypeLabel = new String(source.ServiceTypeLabel);
        }
        if (source.TotalCnMark != null) {
            this.TotalCnMark = new String(source.TotalCnMark);
        }
        if (source.TotalMark != null) {
            this.TotalMark = new String(source.TotalMark);
        }
        if (source.PretaxAmountMark != null) {
            this.PretaxAmountMark = new String(source.PretaxAmountMark);
        }
        if (source.TaxMark != null) {
            this.TaxMark = new String(source.TaxMark);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.InvoicePageIndex != null) {
            this.InvoicePageIndex = new String(source.InvoicePageIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SubTotal", this.SubTotal);
        this.setParamSimple(map, prefix + "SubTax", this.SubTax);
        this.setParamArrayObj(map, prefix + "VatElectronicItems.", this.VatElectronicItems);
        this.setParamSimple(map, prefix + "ServiceTypeLabel", this.ServiceTypeLabel);
        this.setParamSimple(map, prefix + "TotalCnMark", this.TotalCnMark);
        this.setParamSimple(map, prefix + "TotalMark", this.TotalMark);
        this.setParamSimple(map, prefix + "PretaxAmountMark", this.PretaxAmountMark);
        this.setParamSimple(map, prefix + "TaxMark", this.TaxMark);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "InvoicePageIndex", this.InvoicePageIndex);

    }
}

