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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElectronicFlightTicketFull extends AbstractModel {

    /**
    * 旅客姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 有效身份证件号码
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 签注
    */
    @SerializedName("Endorsement")
    @Expose
    private String Endorsement;

    /**
    * GP单号
    */
    @SerializedName("GPOrder")
    @Expose
    private String GPOrder;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 票价
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * 燃油附加费
    */
    @SerializedName("FuelSurcharge")
    @Expose
    private String FuelSurcharge;

    /**
    * 增值税税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 增值税税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 民航发展基金
    */
    @SerializedName("DevelopmentFund")
    @Expose
    private String DevelopmentFund;

    /**
    * 其他税费
    */
    @SerializedName("OtherTax")
    @Expose
    private String OtherTax;

    /**
    * 合计
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 电子客票号码
    */
    @SerializedName("ElectronicTicketNum")
    @Expose
    private String ElectronicTicketNum;

    /**
    * 验证码
    */
    @SerializedName("VerificationCode")
    @Expose
    private String VerificationCode;

    /**
    * 提示信息
    */
    @SerializedName("PromptInformation")
    @Expose
    private String PromptInformation;

    /**
    * 保险费
    */
    @SerializedName("Insurance")
    @Expose
    private String Insurance;

    /**
    * 填开单位
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 填开时间
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 国内国际标识
    */
    @SerializedName("DomesticInternationalTag")
    @Expose
    private String DomesticInternationalTag;

    /**
    * 购买方名称
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 销售方名称
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * 统一社会信用代码
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * 机票详细信息元组
    */
    @SerializedName("FlightItems")
    @Expose
    private FlightItemInfo [] FlightItems;

    /**
    * 机票开具状态
    */
    @SerializedName("InvoiceStatus")
    @Expose
    private String InvoiceStatus;

    /**
     * Get 旅客姓名 
     * @return UserName 旅客姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 旅客姓名
     * @param UserName 旅客姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 有效身份证件号码 
     * @return UserID 有效身份证件号码
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set 有效身份证件号码
     * @param UserID 有效身份证件号码
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get 签注 
     * @return Endorsement 签注
     */
    public String getEndorsement() {
        return this.Endorsement;
    }

    /**
     * Set 签注
     * @param Endorsement 签注
     */
    public void setEndorsement(String Endorsement) {
        this.Endorsement = Endorsement;
    }

    /**
     * Get GP单号 
     * @return GPOrder GP单号
     */
    public String getGPOrder() {
        return this.GPOrder;
    }

    /**
     * Set GP单号
     * @param GPOrder GP单号
     */
    public void setGPOrder(String GPOrder) {
        this.GPOrder = GPOrder;
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
     * Get 票价 
     * @return Fare 票价
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * Set 票价
     * @param Fare 票价
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
    }

    /**
     * Get 燃油附加费 
     * @return FuelSurcharge 燃油附加费
     */
    public String getFuelSurcharge() {
        return this.FuelSurcharge;
    }

    /**
     * Set 燃油附加费
     * @param FuelSurcharge 燃油附加费
     */
    public void setFuelSurcharge(String FuelSurcharge) {
        this.FuelSurcharge = FuelSurcharge;
    }

    /**
     * Get 增值税税率 
     * @return TaxRate 增值税税率
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set 增值税税率
     * @param TaxRate 增值税税率
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get 增值税税额 
     * @return Tax 增值税税额
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 增值税税额
     * @param Tax 增值税税额
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 民航发展基金 
     * @return DevelopmentFund 民航发展基金
     */
    public String getDevelopmentFund() {
        return this.DevelopmentFund;
    }

    /**
     * Set 民航发展基金
     * @param DevelopmentFund 民航发展基金
     */
    public void setDevelopmentFund(String DevelopmentFund) {
        this.DevelopmentFund = DevelopmentFund;
    }

    /**
     * Get 其他税费 
     * @return OtherTax 其他税费
     */
    public String getOtherTax() {
        return this.OtherTax;
    }

    /**
     * Set 其他税费
     * @param OtherTax 其他税费
     */
    public void setOtherTax(String OtherTax) {
        this.OtherTax = OtherTax;
    }

    /**
     * Get 合计 
     * @return Total 合计
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 合计
     * @param Total 合计
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 电子客票号码 
     * @return ElectronicTicketNum 电子客票号码
     */
    public String getElectronicTicketNum() {
        return this.ElectronicTicketNum;
    }

    /**
     * Set 电子客票号码
     * @param ElectronicTicketNum 电子客票号码
     */
    public void setElectronicTicketNum(String ElectronicTicketNum) {
        this.ElectronicTicketNum = ElectronicTicketNum;
    }

    /**
     * Get 验证码 
     * @return VerificationCode 验证码
     */
    public String getVerificationCode() {
        return this.VerificationCode;
    }

    /**
     * Set 验证码
     * @param VerificationCode 验证码
     */
    public void setVerificationCode(String VerificationCode) {
        this.VerificationCode = VerificationCode;
    }

    /**
     * Get 提示信息 
     * @return PromptInformation 提示信息
     */
    public String getPromptInformation() {
        return this.PromptInformation;
    }

    /**
     * Set 提示信息
     * @param PromptInformation 提示信息
     */
    public void setPromptInformation(String PromptInformation) {
        this.PromptInformation = PromptInformation;
    }

    /**
     * Get 保险费 
     * @return Insurance 保险费
     */
    public String getInsurance() {
        return this.Insurance;
    }

    /**
     * Set 保险费
     * @param Insurance 保险费
     */
    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    /**
     * Get 填开单位 
     * @return Issuer 填开单位
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 填开单位
     * @param Issuer 填开单位
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 填开时间 
     * @return Date 填开时间
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 填开时间
     * @param Date 填开时间
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 国内国际标识 
     * @return DomesticInternationalTag 国内国际标识
     */
    public String getDomesticInternationalTag() {
        return this.DomesticInternationalTag;
    }

    /**
     * Set 国内国际标识
     * @param DomesticInternationalTag 国内国际标识
     */
    public void setDomesticInternationalTag(String DomesticInternationalTag) {
        this.DomesticInternationalTag = DomesticInternationalTag;
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
     * Get 统一社会信用代码 
     * @return BuyerTaxID 统一社会信用代码
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set 统一社会信用代码
     * @param BuyerTaxID 统一社会信用代码
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get 机票详细信息元组 
     * @return FlightItems 机票详细信息元组
     */
    public FlightItemInfo [] getFlightItems() {
        return this.FlightItems;
    }

    /**
     * Set 机票详细信息元组
     * @param FlightItems 机票详细信息元组
     */
    public void setFlightItems(FlightItemInfo [] FlightItems) {
        this.FlightItems = FlightItems;
    }

    /**
     * Get 机票开具状态 
     * @return InvoiceStatus 机票开具状态
     */
    public String getInvoiceStatus() {
        return this.InvoiceStatus;
    }

    /**
     * Set 机票开具状态
     * @param InvoiceStatus 机票开具状态
     */
    public void setInvoiceStatus(String InvoiceStatus) {
        this.InvoiceStatus = InvoiceStatus;
    }

    public ElectronicFlightTicketFull() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicFlightTicketFull(ElectronicFlightTicketFull source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Endorsement != null) {
            this.Endorsement = new String(source.Endorsement);
        }
        if (source.GPOrder != null) {
            this.GPOrder = new String(source.GPOrder);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.FuelSurcharge != null) {
            this.FuelSurcharge = new String(source.FuelSurcharge);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.DevelopmentFund != null) {
            this.DevelopmentFund = new String(source.DevelopmentFund);
        }
        if (source.OtherTax != null) {
            this.OtherTax = new String(source.OtherTax);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.ElectronicTicketNum != null) {
            this.ElectronicTicketNum = new String(source.ElectronicTicketNum);
        }
        if (source.VerificationCode != null) {
            this.VerificationCode = new String(source.VerificationCode);
        }
        if (source.PromptInformation != null) {
            this.PromptInformation = new String(source.PromptInformation);
        }
        if (source.Insurance != null) {
            this.Insurance = new String(source.Insurance);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.DomesticInternationalTag != null) {
            this.DomesticInternationalTag = new String(source.DomesticInternationalTag);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.FlightItems != null) {
            this.FlightItems = new FlightItemInfo[source.FlightItems.length];
            for (int i = 0; i < source.FlightItems.length; i++) {
                this.FlightItems[i] = new FlightItemInfo(source.FlightItems[i]);
            }
        }
        if (source.InvoiceStatus != null) {
            this.InvoiceStatus = new String(source.InvoiceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Endorsement", this.Endorsement);
        this.setParamSimple(map, prefix + "GPOrder", this.GPOrder);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "FuelSurcharge", this.FuelSurcharge);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "DevelopmentFund", this.DevelopmentFund);
        this.setParamSimple(map, prefix + "OtherTax", this.OtherTax);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ElectronicTicketNum", this.ElectronicTicketNum);
        this.setParamSimple(map, prefix + "VerificationCode", this.VerificationCode);
        this.setParamSimple(map, prefix + "PromptInformation", this.PromptInformation);
        this.setParamSimple(map, prefix + "Insurance", this.Insurance);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "DomesticInternationalTag", this.DomesticInternationalTag);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamArrayObj(map, prefix + "FlightItems.", this.FlightItems);
        this.setParamSimple(map, prefix + "InvoiceStatus", this.InvoiceStatus);

    }
}

