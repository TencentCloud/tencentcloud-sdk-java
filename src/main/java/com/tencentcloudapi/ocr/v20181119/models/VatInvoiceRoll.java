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

public class VatInvoiceRoll extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

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
    * 机打发票号码
    */
    @SerializedName("NumberConfirm")
    @Expose
    private String NumberConfirm;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 校验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

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
    * 种类
    */
    @SerializedName("Category")
    @Expose
    private String Category;

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
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 服务类型
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 公司印章内容
    */
    @SerializedName("CompanySealContent")
    @Expose
    private String CompanySealContent;

    /**
    * 税务局章内容
    */
    @SerializedName("TaxSealContent")
    @Expose
    private String TaxSealContent;

    /**
    * 条目
    */
    @SerializedName("VatRollItems")
    @Expose
    private VatRollItem [] VatRollItems;

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
     * Get 机打发票号码 
     * @return NumberConfirm 机打发票号码
     */
    public String getNumberConfirm() {
        return this.NumberConfirm;
    }

    /**
     * Set 机打发票号码
     * @param NumberConfirm 机打发票号码
     */
    public void setNumberConfirm(String NumberConfirm) {
        this.NumberConfirm = NumberConfirm;
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
     * Get 服务类型 
     * @return ServiceName 服务类型
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务类型
     * @param ServiceName 服务类型
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 公司印章内容 
     * @return CompanySealContent 公司印章内容
     */
    public String getCompanySealContent() {
        return this.CompanySealContent;
    }

    /**
     * Set 公司印章内容
     * @param CompanySealContent 公司印章内容
     */
    public void setCompanySealContent(String CompanySealContent) {
        this.CompanySealContent = CompanySealContent;
    }

    /**
     * Get 税务局章内容 
     * @return TaxSealContent 税务局章内容
     */
    public String getTaxSealContent() {
        return this.TaxSealContent;
    }

    /**
     * Set 税务局章内容
     * @param TaxSealContent 税务局章内容
     */
    public void setTaxSealContent(String TaxSealContent) {
        this.TaxSealContent = TaxSealContent;
    }

    /**
     * Get 条目 
     * @return VatRollItems 条目
     */
    public VatRollItem [] getVatRollItems() {
        return this.VatRollItems;
    }

    /**
     * Set 条目
     * @param VatRollItems 条目
     */
    public void setVatRollItems(VatRollItem [] VatRollItems) {
        this.VatRollItems = VatRollItems;
    }

    public VatInvoiceRoll() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceRoll(VatInvoiceRoll source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.NumberConfirm != null) {
            this.NumberConfirm = new String(source.NumberConfirm);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
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
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
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
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.CompanySealContent != null) {
            this.CompanySealContent = new String(source.CompanySealContent);
        }
        if (source.TaxSealContent != null) {
            this.TaxSealContent = new String(source.TaxSealContent);
        }
        if (source.VatRollItems != null) {
            this.VatRollItems = new VatRollItem[source.VatRollItems.length];
            for (int i = 0; i < source.VatRollItems.length; i++) {
                this.VatRollItems[i] = new VatRollItem(source.VatRollItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "NumberConfirm", this.NumberConfirm);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "CompanySealContent", this.CompanySealContent);
        this.setParamSimple(map, prefix + "TaxSealContent", this.TaxSealContent);
        this.setParamArrayObj(map, prefix + "VatRollItems.", this.VatRollItems);

    }
}

