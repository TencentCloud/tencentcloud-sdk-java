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

public class UsedVehicleInvoiceInfo extends AbstractModel {

    /**
    * <p>所属税局</p>
    */
    @SerializedName("TaxBureau")
    @Expose
    private String TaxBureau;

    /**
    * <p>买方单位/个人</p>
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * <p>买方单位代码/身份证号码</p>
    */
    @SerializedName("BuyerNo")
    @Expose
    private String BuyerNo;

    /**
    * <p>买方单位/个人地址</p>
    */
    @SerializedName("BuyerAddress")
    @Expose
    private String BuyerAddress;

    /**
    * <p>买方单位电话</p>
    */
    @SerializedName("BuyerTel")
    @Expose
    private String BuyerTel;

    /**
    * <p>卖方单位/个人</p>
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * <p>卖方单位代码/身份证号码</p>
    */
    @SerializedName("SellerNo")
    @Expose
    private String SellerNo;

    /**
    * <p>卖方单位/个人地址</p>
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * <p>卖方单位电话</p>
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * <p>车牌照号</p>
    */
    @SerializedName("VehicleLicenseNo")
    @Expose
    private String VehicleLicenseNo;

    /**
    * <p>登记证号</p>
    */
    @SerializedName("RegisterNo")
    @Expose
    private String RegisterNo;

    /**
    * <p>车架号/车辆识别代码</p>
    */
    @SerializedName("VehicleIdentifyNo")
    @Expose
    private String VehicleIdentifyNo;

    /**
    * <p>转入地车辆管理所名称</p>
    */
    @SerializedName("ManagementOffice")
    @Expose
    private String ManagementOffice;

    /**
    * <p>车价合计</p>
    */
    @SerializedName("VehicleTotalPrice")
    @Expose
    private String VehicleTotalPrice;

    /**
    * <p>经营、拍卖单位</p>
    */
    @SerializedName("Auctioneer")
    @Expose
    private String Auctioneer;

    /**
    * <p>经营、拍卖单位地址</p>
    */
    @SerializedName("AuctioneerAddress")
    @Expose
    private String AuctioneerAddress;

    /**
    * <p>经营、拍卖单位纳税人识别号</p>
    */
    @SerializedName("AuctioneerTaxpayerNum")
    @Expose
    private String AuctioneerTaxpayerNum;

    /**
    * <p>经营、拍卖单位开户银行、账号</p>
    */
    @SerializedName("AuctioneerBankAccount")
    @Expose
    private String AuctioneerBankAccount;

    /**
    * <p>经营、拍卖单位电话</p>
    */
    @SerializedName("AuctioneerTel")
    @Expose
    private String AuctioneerTel;

    /**
    * <p>二手车市场</p>
    */
    @SerializedName("Market")
    @Expose
    private String Market;

    /**
    * <p>二手车市场纳税人识别号</p>
    */
    @SerializedName("MarketTaxpayerNum")
    @Expose
    private String MarketTaxpayerNum;

    /**
    * <p>二手车市场地址</p>
    */
    @SerializedName("MarketAddress")
    @Expose
    private String MarketAddress;

    /**
    * <p>二手车市场开户银行账号</p>
    */
    @SerializedName("MarketBankAccount")
    @Expose
    private String MarketBankAccount;

    /**
    * <p>二手车市场电话</p>
    */
    @SerializedName("MarketTel")
    @Expose
    private String MarketTel;

    /**
    * <p>车价合计中文大写</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VehicleTotalPriceCN")
    @Expose
    private String VehicleTotalPriceCN;

    /**
    * <p>发票风险等级</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvoiceRiskLevel")
    @Expose
    private String InvoiceRiskLevel;

    /**
    * <p>车辆类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CarType")
    @Expose
    private String CarType;

    /**
    * <p>厂牌型号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateModel")
    @Expose
    private String PlateModel;

    /**
    * <p>作废人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbandonerName")
    @Expose
    private String AbandonerName;

    /**
    * <p>作废日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbandonDate")
    @Expose
    private String AbandonDate;

    /**
    * <p>开票方类型：1 经营单位，2 拍卖单位，03 二手车市场。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuerType")
    @Expose
    private String IssuerType;

    /**
    * <p>开票方纳税人识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuerTaxCode")
    @Expose
    private String IssuerTaxCode;

    /**
    * <p>自行编码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomCode")
    @Expose
    private String CustomCode;

    /**
    * <p>商品编码</p>
    */
    @SerializedName("TaxClassifyCode")
    @Expose
    private String TaxClassifyCode;

    /**
    * <p>零税率标识：空：非零税率，0：出口零税，1：免税，2：不征税，3 普通零税率</p>
    */
    @SerializedName("ZeroTaxRateMark")
    @Expose
    private String ZeroTaxRateMark;

    /**
     * Get <p>所属税局</p> 
     * @return TaxBureau <p>所属税局</p>
     */
    public String getTaxBureau() {
        return this.TaxBureau;
    }

    /**
     * Set <p>所属税局</p>
     * @param TaxBureau <p>所属税局</p>
     */
    public void setTaxBureau(String TaxBureau) {
        this.TaxBureau = TaxBureau;
    }

    /**
     * Get <p>买方单位/个人</p> 
     * @return Buyer <p>买方单位/个人</p>
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set <p>买方单位/个人</p>
     * @param Buyer <p>买方单位/个人</p>
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get <p>买方单位代码/身份证号码</p> 
     * @return BuyerNo <p>买方单位代码/身份证号码</p>
     */
    public String getBuyerNo() {
        return this.BuyerNo;
    }

    /**
     * Set <p>买方单位代码/身份证号码</p>
     * @param BuyerNo <p>买方单位代码/身份证号码</p>
     */
    public void setBuyerNo(String BuyerNo) {
        this.BuyerNo = BuyerNo;
    }

    /**
     * Get <p>买方单位/个人地址</p> 
     * @return BuyerAddress <p>买方单位/个人地址</p>
     */
    public String getBuyerAddress() {
        return this.BuyerAddress;
    }

    /**
     * Set <p>买方单位/个人地址</p>
     * @param BuyerAddress <p>买方单位/个人地址</p>
     */
    public void setBuyerAddress(String BuyerAddress) {
        this.BuyerAddress = BuyerAddress;
    }

    /**
     * Get <p>买方单位电话</p> 
     * @return BuyerTel <p>买方单位电话</p>
     */
    public String getBuyerTel() {
        return this.BuyerTel;
    }

    /**
     * Set <p>买方单位电话</p>
     * @param BuyerTel <p>买方单位电话</p>
     */
    public void setBuyerTel(String BuyerTel) {
        this.BuyerTel = BuyerTel;
    }

    /**
     * Get <p>卖方单位/个人</p> 
     * @return Seller <p>卖方单位/个人</p>
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set <p>卖方单位/个人</p>
     * @param Seller <p>卖方单位/个人</p>
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get <p>卖方单位代码/身份证号码</p> 
     * @return SellerNo <p>卖方单位代码/身份证号码</p>
     */
    public String getSellerNo() {
        return this.SellerNo;
    }

    /**
     * Set <p>卖方单位代码/身份证号码</p>
     * @param SellerNo <p>卖方单位代码/身份证号码</p>
     */
    public void setSellerNo(String SellerNo) {
        this.SellerNo = SellerNo;
    }

    /**
     * Get <p>卖方单位/个人地址</p> 
     * @return SellerAddress <p>卖方单位/个人地址</p>
     */
    public String getSellerAddress() {
        return this.SellerAddress;
    }

    /**
     * Set <p>卖方单位/个人地址</p>
     * @param SellerAddress <p>卖方单位/个人地址</p>
     */
    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
    }

    /**
     * Get <p>卖方单位电话</p> 
     * @return SellerTel <p>卖方单位电话</p>
     */
    public String getSellerTel() {
        return this.SellerTel;
    }

    /**
     * Set <p>卖方单位电话</p>
     * @param SellerTel <p>卖方单位电话</p>
     */
    public void setSellerTel(String SellerTel) {
        this.SellerTel = SellerTel;
    }

    /**
     * Get <p>车牌照号</p> 
     * @return VehicleLicenseNo <p>车牌照号</p>
     */
    public String getVehicleLicenseNo() {
        return this.VehicleLicenseNo;
    }

    /**
     * Set <p>车牌照号</p>
     * @param VehicleLicenseNo <p>车牌照号</p>
     */
    public void setVehicleLicenseNo(String VehicleLicenseNo) {
        this.VehicleLicenseNo = VehicleLicenseNo;
    }

    /**
     * Get <p>登记证号</p> 
     * @return RegisterNo <p>登记证号</p>
     */
    public String getRegisterNo() {
        return this.RegisterNo;
    }

    /**
     * Set <p>登记证号</p>
     * @param RegisterNo <p>登记证号</p>
     */
    public void setRegisterNo(String RegisterNo) {
        this.RegisterNo = RegisterNo;
    }

    /**
     * Get <p>车架号/车辆识别代码</p> 
     * @return VehicleIdentifyNo <p>车架号/车辆识别代码</p>
     */
    public String getVehicleIdentifyNo() {
        return this.VehicleIdentifyNo;
    }

    /**
     * Set <p>车架号/车辆识别代码</p>
     * @param VehicleIdentifyNo <p>车架号/车辆识别代码</p>
     */
    public void setVehicleIdentifyNo(String VehicleIdentifyNo) {
        this.VehicleIdentifyNo = VehicleIdentifyNo;
    }

    /**
     * Get <p>转入地车辆管理所名称</p> 
     * @return ManagementOffice <p>转入地车辆管理所名称</p>
     */
    public String getManagementOffice() {
        return this.ManagementOffice;
    }

    /**
     * Set <p>转入地车辆管理所名称</p>
     * @param ManagementOffice <p>转入地车辆管理所名称</p>
     */
    public void setManagementOffice(String ManagementOffice) {
        this.ManagementOffice = ManagementOffice;
    }

    /**
     * Get <p>车价合计</p> 
     * @return VehicleTotalPrice <p>车价合计</p>
     */
    public String getVehicleTotalPrice() {
        return this.VehicleTotalPrice;
    }

    /**
     * Set <p>车价合计</p>
     * @param VehicleTotalPrice <p>车价合计</p>
     */
    public void setVehicleTotalPrice(String VehicleTotalPrice) {
        this.VehicleTotalPrice = VehicleTotalPrice;
    }

    /**
     * Get <p>经营、拍卖单位</p> 
     * @return Auctioneer <p>经营、拍卖单位</p>
     */
    public String getAuctioneer() {
        return this.Auctioneer;
    }

    /**
     * Set <p>经营、拍卖单位</p>
     * @param Auctioneer <p>经营、拍卖单位</p>
     */
    public void setAuctioneer(String Auctioneer) {
        this.Auctioneer = Auctioneer;
    }

    /**
     * Get <p>经营、拍卖单位地址</p> 
     * @return AuctioneerAddress <p>经营、拍卖单位地址</p>
     */
    public String getAuctioneerAddress() {
        return this.AuctioneerAddress;
    }

    /**
     * Set <p>经营、拍卖单位地址</p>
     * @param AuctioneerAddress <p>经营、拍卖单位地址</p>
     */
    public void setAuctioneerAddress(String AuctioneerAddress) {
        this.AuctioneerAddress = AuctioneerAddress;
    }

    /**
     * Get <p>经营、拍卖单位纳税人识别号</p> 
     * @return AuctioneerTaxpayerNum <p>经营、拍卖单位纳税人识别号</p>
     */
    public String getAuctioneerTaxpayerNum() {
        return this.AuctioneerTaxpayerNum;
    }

    /**
     * Set <p>经营、拍卖单位纳税人识别号</p>
     * @param AuctioneerTaxpayerNum <p>经营、拍卖单位纳税人识别号</p>
     */
    public void setAuctioneerTaxpayerNum(String AuctioneerTaxpayerNum) {
        this.AuctioneerTaxpayerNum = AuctioneerTaxpayerNum;
    }

    /**
     * Get <p>经营、拍卖单位开户银行、账号</p> 
     * @return AuctioneerBankAccount <p>经营、拍卖单位开户银行、账号</p>
     */
    public String getAuctioneerBankAccount() {
        return this.AuctioneerBankAccount;
    }

    /**
     * Set <p>经营、拍卖单位开户银行、账号</p>
     * @param AuctioneerBankAccount <p>经营、拍卖单位开户银行、账号</p>
     */
    public void setAuctioneerBankAccount(String AuctioneerBankAccount) {
        this.AuctioneerBankAccount = AuctioneerBankAccount;
    }

    /**
     * Get <p>经营、拍卖单位电话</p> 
     * @return AuctioneerTel <p>经营、拍卖单位电话</p>
     */
    public String getAuctioneerTel() {
        return this.AuctioneerTel;
    }

    /**
     * Set <p>经营、拍卖单位电话</p>
     * @param AuctioneerTel <p>经营、拍卖单位电话</p>
     */
    public void setAuctioneerTel(String AuctioneerTel) {
        this.AuctioneerTel = AuctioneerTel;
    }

    /**
     * Get <p>二手车市场</p> 
     * @return Market <p>二手车市场</p>
     */
    public String getMarket() {
        return this.Market;
    }

    /**
     * Set <p>二手车市场</p>
     * @param Market <p>二手车市场</p>
     */
    public void setMarket(String Market) {
        this.Market = Market;
    }

    /**
     * Get <p>二手车市场纳税人识别号</p> 
     * @return MarketTaxpayerNum <p>二手车市场纳税人识别号</p>
     */
    public String getMarketTaxpayerNum() {
        return this.MarketTaxpayerNum;
    }

    /**
     * Set <p>二手车市场纳税人识别号</p>
     * @param MarketTaxpayerNum <p>二手车市场纳税人识别号</p>
     */
    public void setMarketTaxpayerNum(String MarketTaxpayerNum) {
        this.MarketTaxpayerNum = MarketTaxpayerNum;
    }

    /**
     * Get <p>二手车市场地址</p> 
     * @return MarketAddress <p>二手车市场地址</p>
     */
    public String getMarketAddress() {
        return this.MarketAddress;
    }

    /**
     * Set <p>二手车市场地址</p>
     * @param MarketAddress <p>二手车市场地址</p>
     */
    public void setMarketAddress(String MarketAddress) {
        this.MarketAddress = MarketAddress;
    }

    /**
     * Get <p>二手车市场开户银行账号</p> 
     * @return MarketBankAccount <p>二手车市场开户银行账号</p>
     */
    public String getMarketBankAccount() {
        return this.MarketBankAccount;
    }

    /**
     * Set <p>二手车市场开户银行账号</p>
     * @param MarketBankAccount <p>二手车市场开户银行账号</p>
     */
    public void setMarketBankAccount(String MarketBankAccount) {
        this.MarketBankAccount = MarketBankAccount;
    }

    /**
     * Get <p>二手车市场电话</p> 
     * @return MarketTel <p>二手车市场电话</p>
     */
    public String getMarketTel() {
        return this.MarketTel;
    }

    /**
     * Set <p>二手车市场电话</p>
     * @param MarketTel <p>二手车市场电话</p>
     */
    public void setMarketTel(String MarketTel) {
        this.MarketTel = MarketTel;
    }

    /**
     * Get <p>车价合计中文大写</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VehicleTotalPriceCN <p>车价合计中文大写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVehicleTotalPriceCN() {
        return this.VehicleTotalPriceCN;
    }

    /**
     * Set <p>车价合计中文大写</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VehicleTotalPriceCN <p>车价合计中文大写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVehicleTotalPriceCN(String VehicleTotalPriceCN) {
        this.VehicleTotalPriceCN = VehicleTotalPriceCN;
    }

    /**
     * Get <p>发票风险等级</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvoiceRiskLevel <p>发票风险等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvoiceRiskLevel() {
        return this.InvoiceRiskLevel;
    }

    /**
     * Set <p>发票风险等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvoiceRiskLevel <p>发票风险等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvoiceRiskLevel(String InvoiceRiskLevel) {
        this.InvoiceRiskLevel = InvoiceRiskLevel;
    }

    /**
     * Get <p>车辆类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CarType <p>车辆类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCarType() {
        return this.CarType;
    }

    /**
     * Set <p>车辆类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CarType <p>车辆类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    /**
     * Get <p>厂牌型号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateModel <p>厂牌型号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlateModel() {
        return this.PlateModel;
    }

    /**
     * Set <p>厂牌型号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateModel <p>厂牌型号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateModel(String PlateModel) {
        this.PlateModel = PlateModel;
    }

    /**
     * Get <p>作废人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbandonerName <p>作废人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAbandonerName() {
        return this.AbandonerName;
    }

    /**
     * Set <p>作废人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbandonerName <p>作废人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbandonerName(String AbandonerName) {
        this.AbandonerName = AbandonerName;
    }

    /**
     * Get <p>作废日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbandonDate <p>作废日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAbandonDate() {
        return this.AbandonDate;
    }

    /**
     * Set <p>作废日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbandonDate <p>作废日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbandonDate(String AbandonDate) {
        this.AbandonDate = AbandonDate;
    }

    /**
     * Get <p>开票方类型：1 经营单位，2 拍卖单位，03 二手车市场。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuerType <p>开票方类型：1 经营单位，2 拍卖单位，03 二手车市场。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuerType() {
        return this.IssuerType;
    }

    /**
     * Set <p>开票方类型：1 经营单位，2 拍卖单位，03 二手车市场。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuerType <p>开票方类型：1 经营单位，2 拍卖单位，03 二手车市场。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuerType(String IssuerType) {
        this.IssuerType = IssuerType;
    }

    /**
     * Get <p>开票方纳税人识别号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuerTaxCode <p>开票方纳税人识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuerTaxCode() {
        return this.IssuerTaxCode;
    }

    /**
     * Set <p>开票方纳税人识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuerTaxCode <p>开票方纳税人识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuerTaxCode(String IssuerTaxCode) {
        this.IssuerTaxCode = IssuerTaxCode;
    }

    /**
     * Get <p>自行编码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomCode <p>自行编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomCode() {
        return this.CustomCode;
    }

    /**
     * Set <p>自行编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomCode <p>自行编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomCode(String CustomCode) {
        this.CustomCode = CustomCode;
    }

    /**
     * Get <p>商品编码</p> 
     * @return TaxClassifyCode <p>商品编码</p>
     */
    public String getTaxClassifyCode() {
        return this.TaxClassifyCode;
    }

    /**
     * Set <p>商品编码</p>
     * @param TaxClassifyCode <p>商品编码</p>
     */
    public void setTaxClassifyCode(String TaxClassifyCode) {
        this.TaxClassifyCode = TaxClassifyCode;
    }

    /**
     * Get <p>零税率标识：空：非零税率，0：出口零税，1：免税，2：不征税，3 普通零税率</p> 
     * @return ZeroTaxRateMark <p>零税率标识：空：非零税率，0：出口零税，1：免税，2：不征税，3 普通零税率</p>
     */
    public String getZeroTaxRateMark() {
        return this.ZeroTaxRateMark;
    }

    /**
     * Set <p>零税率标识：空：非零税率，0：出口零税，1：免税，2：不征税，3 普通零税率</p>
     * @param ZeroTaxRateMark <p>零税率标识：空：非零税率，0：出口零税，1：免税，2：不征税，3 普通零税率</p>
     */
    public void setZeroTaxRateMark(String ZeroTaxRateMark) {
        this.ZeroTaxRateMark = ZeroTaxRateMark;
    }

    public UsedVehicleInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsedVehicleInvoiceInfo(UsedVehicleInvoiceInfo source) {
        if (source.TaxBureau != null) {
            this.TaxBureau = new String(source.TaxBureau);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerNo != null) {
            this.BuyerNo = new String(source.BuyerNo);
        }
        if (source.BuyerAddress != null) {
            this.BuyerAddress = new String(source.BuyerAddress);
        }
        if (source.BuyerTel != null) {
            this.BuyerTel = new String(source.BuyerTel);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerNo != null) {
            this.SellerNo = new String(source.SellerNo);
        }
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.SellerTel != null) {
            this.SellerTel = new String(source.SellerTel);
        }
        if (source.VehicleLicenseNo != null) {
            this.VehicleLicenseNo = new String(source.VehicleLicenseNo);
        }
        if (source.RegisterNo != null) {
            this.RegisterNo = new String(source.RegisterNo);
        }
        if (source.VehicleIdentifyNo != null) {
            this.VehicleIdentifyNo = new String(source.VehicleIdentifyNo);
        }
        if (source.ManagementOffice != null) {
            this.ManagementOffice = new String(source.ManagementOffice);
        }
        if (source.VehicleTotalPrice != null) {
            this.VehicleTotalPrice = new String(source.VehicleTotalPrice);
        }
        if (source.Auctioneer != null) {
            this.Auctioneer = new String(source.Auctioneer);
        }
        if (source.AuctioneerAddress != null) {
            this.AuctioneerAddress = new String(source.AuctioneerAddress);
        }
        if (source.AuctioneerTaxpayerNum != null) {
            this.AuctioneerTaxpayerNum = new String(source.AuctioneerTaxpayerNum);
        }
        if (source.AuctioneerBankAccount != null) {
            this.AuctioneerBankAccount = new String(source.AuctioneerBankAccount);
        }
        if (source.AuctioneerTel != null) {
            this.AuctioneerTel = new String(source.AuctioneerTel);
        }
        if (source.Market != null) {
            this.Market = new String(source.Market);
        }
        if (source.MarketTaxpayerNum != null) {
            this.MarketTaxpayerNum = new String(source.MarketTaxpayerNum);
        }
        if (source.MarketAddress != null) {
            this.MarketAddress = new String(source.MarketAddress);
        }
        if (source.MarketBankAccount != null) {
            this.MarketBankAccount = new String(source.MarketBankAccount);
        }
        if (source.MarketTel != null) {
            this.MarketTel = new String(source.MarketTel);
        }
        if (source.VehicleTotalPriceCN != null) {
            this.VehicleTotalPriceCN = new String(source.VehicleTotalPriceCN);
        }
        if (source.InvoiceRiskLevel != null) {
            this.InvoiceRiskLevel = new String(source.InvoiceRiskLevel);
        }
        if (source.CarType != null) {
            this.CarType = new String(source.CarType);
        }
        if (source.PlateModel != null) {
            this.PlateModel = new String(source.PlateModel);
        }
        if (source.AbandonerName != null) {
            this.AbandonerName = new String(source.AbandonerName);
        }
        if (source.AbandonDate != null) {
            this.AbandonDate = new String(source.AbandonDate);
        }
        if (source.IssuerType != null) {
            this.IssuerType = new String(source.IssuerType);
        }
        if (source.IssuerTaxCode != null) {
            this.IssuerTaxCode = new String(source.IssuerTaxCode);
        }
        if (source.CustomCode != null) {
            this.CustomCode = new String(source.CustomCode);
        }
        if (source.TaxClassifyCode != null) {
            this.TaxClassifyCode = new String(source.TaxClassifyCode);
        }
        if (source.ZeroTaxRateMark != null) {
            this.ZeroTaxRateMark = new String(source.ZeroTaxRateMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaxBureau", this.TaxBureau);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerNo", this.BuyerNo);
        this.setParamSimple(map, prefix + "BuyerAddress", this.BuyerAddress);
        this.setParamSimple(map, prefix + "BuyerTel", this.BuyerTel);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerNo", this.SellerNo);
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "SellerTel", this.SellerTel);
        this.setParamSimple(map, prefix + "VehicleLicenseNo", this.VehicleLicenseNo);
        this.setParamSimple(map, prefix + "RegisterNo", this.RegisterNo);
        this.setParamSimple(map, prefix + "VehicleIdentifyNo", this.VehicleIdentifyNo);
        this.setParamSimple(map, prefix + "ManagementOffice", this.ManagementOffice);
        this.setParamSimple(map, prefix + "VehicleTotalPrice", this.VehicleTotalPrice);
        this.setParamSimple(map, prefix + "Auctioneer", this.Auctioneer);
        this.setParamSimple(map, prefix + "AuctioneerAddress", this.AuctioneerAddress);
        this.setParamSimple(map, prefix + "AuctioneerTaxpayerNum", this.AuctioneerTaxpayerNum);
        this.setParamSimple(map, prefix + "AuctioneerBankAccount", this.AuctioneerBankAccount);
        this.setParamSimple(map, prefix + "AuctioneerTel", this.AuctioneerTel);
        this.setParamSimple(map, prefix + "Market", this.Market);
        this.setParamSimple(map, prefix + "MarketTaxpayerNum", this.MarketTaxpayerNum);
        this.setParamSimple(map, prefix + "MarketAddress", this.MarketAddress);
        this.setParamSimple(map, prefix + "MarketBankAccount", this.MarketBankAccount);
        this.setParamSimple(map, prefix + "MarketTel", this.MarketTel);
        this.setParamSimple(map, prefix + "VehicleTotalPriceCN", this.VehicleTotalPriceCN);
        this.setParamSimple(map, prefix + "InvoiceRiskLevel", this.InvoiceRiskLevel);
        this.setParamSimple(map, prefix + "CarType", this.CarType);
        this.setParamSimple(map, prefix + "PlateModel", this.PlateModel);
        this.setParamSimple(map, prefix + "AbandonerName", this.AbandonerName);
        this.setParamSimple(map, prefix + "AbandonDate", this.AbandonDate);
        this.setParamSimple(map, prefix + "IssuerType", this.IssuerType);
        this.setParamSimple(map, prefix + "IssuerTaxCode", this.IssuerTaxCode);
        this.setParamSimple(map, prefix + "CustomCode", this.CustomCode);
        this.setParamSimple(map, prefix + "TaxClassifyCode", this.TaxClassifyCode);
        this.setParamSimple(map, prefix + "ZeroTaxRateMark", this.ZeroTaxRateMark);

    }
}

