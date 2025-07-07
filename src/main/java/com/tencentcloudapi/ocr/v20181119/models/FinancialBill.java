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

public class FinancialBill extends AbstractModel {

    /**
    * 票据代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 票据号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 缴款人纳税识别号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * 校验码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 缴款人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 开票日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 收款单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SellerCompany")
    @Expose
    private String SellerCompany;

    /**
    * 复核人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * 收款人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * 票据名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 金额合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 金额合计中文大写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * 冲红
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RushRedStateCode")
    @Expose
    private String RushRedStateCode;

    /**
    * 冲红日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RushRedDate")
    @Expose
    private String RushRedDate;

    /**
    * 冲红时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RushRedTime")
    @Expose
    private String RushRedTime;

    /**
    * 冲红原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RushRedReason")
    @Expose
    private String RushRedReason;

    /**
    * 项目明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinancialBillItems")
    @Expose
    private FinancialBillItem [] FinancialBillItems;

    /**
    * 项目清单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinancialBillItemDetails")
    @Expose
    private FinancialBillItemDetails [] FinancialBillItemDetails;

    /**
     * Get 票据代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 票据代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 票据代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 票据代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 票据号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number 票据号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 票据号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number 票据号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 缴款人纳税识别号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerTaxID 缴款人纳税识别号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set 缴款人纳税识别号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerTaxID 缴款人纳税识别号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get 校验码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckCode 校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckCode 校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 缴款人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Buyer 缴款人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set 缴款人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Buyer 缴款人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get 开票日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 收款单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SellerCompany 收款单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSellerCompany() {
        return this.SellerCompany;
    }

    /**
     * Set 收款单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param SellerCompany 收款单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSellerCompany(String SellerCompany) {
        this.SellerCompany = SellerCompany;
    }

    /**
     * Get 复核人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reviewer 复核人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set 复核人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reviewer 复核人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    /**
     * Get 收款人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seller 收款人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set 收款人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seller 收款人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get 票据名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 票据名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 票据名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 票据名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 金额合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 金额合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 金额合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 金额合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 金额合计中文大写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCn 金额合计中文大写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set 金额合计中文大写
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCn 金额合计中文大写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get 冲红
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RushRedStateCode 冲红
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRushRedStateCode() {
        return this.RushRedStateCode;
    }

    /**
     * Set 冲红
注意：此字段可能返回 null，表示取不到有效值。
     * @param RushRedStateCode 冲红
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRushRedStateCode(String RushRedStateCode) {
        this.RushRedStateCode = RushRedStateCode;
    }

    /**
     * Get 冲红日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RushRedDate 冲红日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRushRedDate() {
        return this.RushRedDate;
    }

    /**
     * Set 冲红日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RushRedDate 冲红日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRushRedDate(String RushRedDate) {
        this.RushRedDate = RushRedDate;
    }

    /**
     * Get 冲红时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RushRedTime 冲红时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRushRedTime() {
        return this.RushRedTime;
    }

    /**
     * Set 冲红时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RushRedTime 冲红时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRushRedTime(String RushRedTime) {
        this.RushRedTime = RushRedTime;
    }

    /**
     * Get 冲红原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RushRedReason 冲红原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRushRedReason() {
        return this.RushRedReason;
    }

    /**
     * Set 冲红原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param RushRedReason 冲红原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRushRedReason(String RushRedReason) {
        this.RushRedReason = RushRedReason;
    }

    /**
     * Get 项目明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinancialBillItems 项目明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FinancialBillItem [] getFinancialBillItems() {
        return this.FinancialBillItems;
    }

    /**
     * Set 项目明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinancialBillItems 项目明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinancialBillItems(FinancialBillItem [] FinancialBillItems) {
        this.FinancialBillItems = FinancialBillItems;
    }

    /**
     * Get 项目清单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinancialBillItemDetails 项目清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FinancialBillItemDetails [] getFinancialBillItemDetails() {
        return this.FinancialBillItemDetails;
    }

    /**
     * Set 项目清单
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinancialBillItemDetails 项目清单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinancialBillItemDetails(FinancialBillItemDetails [] FinancialBillItemDetails) {
        this.FinancialBillItemDetails = FinancialBillItemDetails;
    }

    public FinancialBill() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinancialBill(FinancialBill source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.SellerCompany != null) {
            this.SellerCompany = new String(source.SellerCompany);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.RushRedStateCode != null) {
            this.RushRedStateCode = new String(source.RushRedStateCode);
        }
        if (source.RushRedDate != null) {
            this.RushRedDate = new String(source.RushRedDate);
        }
        if (source.RushRedTime != null) {
            this.RushRedTime = new String(source.RushRedTime);
        }
        if (source.RushRedReason != null) {
            this.RushRedReason = new String(source.RushRedReason);
        }
        if (source.FinancialBillItems != null) {
            this.FinancialBillItems = new FinancialBillItem[source.FinancialBillItems.length];
            for (int i = 0; i < source.FinancialBillItems.length; i++) {
                this.FinancialBillItems[i] = new FinancialBillItem(source.FinancialBillItems[i]);
            }
        }
        if (source.FinancialBillItemDetails != null) {
            this.FinancialBillItemDetails = new FinancialBillItemDetails[source.FinancialBillItemDetails.length];
            for (int i = 0; i < source.FinancialBillItemDetails.length; i++) {
                this.FinancialBillItemDetails[i] = new FinancialBillItemDetails(source.FinancialBillItemDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "SellerCompany", this.SellerCompany);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "RushRedStateCode", this.RushRedStateCode);
        this.setParamSimple(map, prefix + "RushRedDate", this.RushRedDate);
        this.setParamSimple(map, prefix + "RushRedTime", this.RushRedTime);
        this.setParamSimple(map, prefix + "RushRedReason", this.RushRedReason);
        this.setParamArrayObj(map, prefix + "FinancialBillItems.", this.FinancialBillItems);
        this.setParamArrayObj(map, prefix + "FinancialBillItemDetails.", this.FinancialBillItemDetails);

    }
}

