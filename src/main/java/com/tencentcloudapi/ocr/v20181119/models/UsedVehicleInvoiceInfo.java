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

public class UsedVehicleInvoiceInfo extends AbstractModel{

    /**
    * 所属税局
    */
    @SerializedName("TaxBureau")
    @Expose
    private String TaxBureau;

    /**
    * 买方单位/个人
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 买方单位代码/身份证号码
    */
    @SerializedName("BuyerNo")
    @Expose
    private String BuyerNo;

    /**
    * 买方单位/个人地址
    */
    @SerializedName("BuyerAddress")
    @Expose
    private String BuyerAddress;

    /**
    * 买方单位电话
    */
    @SerializedName("BuyerTel")
    @Expose
    private String BuyerTel;

    /**
    * 卖方单位/个人
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * 卖方单位代码/身份证号码
    */
    @SerializedName("SellerNo")
    @Expose
    private String SellerNo;

    /**
    * 卖方单位/个人地址
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * 卖方单位电话
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * 车牌照号
    */
    @SerializedName("VehicleLicenseNo")
    @Expose
    private String VehicleLicenseNo;

    /**
    * 登记证号
    */
    @SerializedName("RegisterNo")
    @Expose
    private String RegisterNo;

    /**
    * 车架号/车辆识别代码
    */
    @SerializedName("VehicleIdentifyNo")
    @Expose
    private String VehicleIdentifyNo;

    /**
    * 转入地车辆管理所名称
    */
    @SerializedName("ManagementOffice")
    @Expose
    private String ManagementOffice;

    /**
    * 车价合计
    */
    @SerializedName("VehicleTotalPrice")
    @Expose
    private String VehicleTotalPrice;

    /**
    * 经营、拍卖单位
    */
    @SerializedName("Auctioneer")
    @Expose
    private String Auctioneer;

    /**
    * 经营、拍卖单位地址
    */
    @SerializedName("AuctioneerAddress")
    @Expose
    private String AuctioneerAddress;

    /**
    * 经营、拍卖单位纳税人识别号
    */
    @SerializedName("AuctioneerTaxpayerNum")
    @Expose
    private String AuctioneerTaxpayerNum;

    /**
    * 经营、拍卖单位开户银行、账号
    */
    @SerializedName("AuctioneerBankAccount")
    @Expose
    private String AuctioneerBankAccount;

    /**
    * 经营、拍卖单位电话
    */
    @SerializedName("AuctioneerTel")
    @Expose
    private String AuctioneerTel;

    /**
    * 二手车市场
    */
    @SerializedName("Market")
    @Expose
    private String Market;

    /**
    * 二手车市场纳税人识别号
    */
    @SerializedName("MarketTaxpayerNum")
    @Expose
    private String MarketTaxpayerNum;

    /**
    * 二手车市场地址
    */
    @SerializedName("MarketAddress")
    @Expose
    private String MarketAddress;

    /**
    * 二手车市场开户银行账号
    */
    @SerializedName("MarketBankAccount")
    @Expose
    private String MarketBankAccount;

    /**
    * 二手车市场电话
    */
    @SerializedName("MarketTel")
    @Expose
    private String MarketTel;

    /**
     * Get 所属税局 
     * @return TaxBureau 所属税局
     */
    public String getTaxBureau() {
        return this.TaxBureau;
    }

    /**
     * Set 所属税局
     * @param TaxBureau 所属税局
     */
    public void setTaxBureau(String TaxBureau) {
        this.TaxBureau = TaxBureau;
    }

    /**
     * Get 买方单位/个人 
     * @return Buyer 买方单位/个人
     */
    public String getBuyer() {
        return this.Buyer;
    }

    /**
     * Set 买方单位/个人
     * @param Buyer 买方单位/个人
     */
    public void setBuyer(String Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Get 买方单位代码/身份证号码 
     * @return BuyerNo 买方单位代码/身份证号码
     */
    public String getBuyerNo() {
        return this.BuyerNo;
    }

    /**
     * Set 买方单位代码/身份证号码
     * @param BuyerNo 买方单位代码/身份证号码
     */
    public void setBuyerNo(String BuyerNo) {
        this.BuyerNo = BuyerNo;
    }

    /**
     * Get 买方单位/个人地址 
     * @return BuyerAddress 买方单位/个人地址
     */
    public String getBuyerAddress() {
        return this.BuyerAddress;
    }

    /**
     * Set 买方单位/个人地址
     * @param BuyerAddress 买方单位/个人地址
     */
    public void setBuyerAddress(String BuyerAddress) {
        this.BuyerAddress = BuyerAddress;
    }

    /**
     * Get 买方单位电话 
     * @return BuyerTel 买方单位电话
     */
    public String getBuyerTel() {
        return this.BuyerTel;
    }

    /**
     * Set 买方单位电话
     * @param BuyerTel 买方单位电话
     */
    public void setBuyerTel(String BuyerTel) {
        this.BuyerTel = BuyerTel;
    }

    /**
     * Get 卖方单位/个人 
     * @return Seller 卖方单位/个人
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set 卖方单位/个人
     * @param Seller 卖方单位/个人
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get 卖方单位代码/身份证号码 
     * @return SellerNo 卖方单位代码/身份证号码
     */
    public String getSellerNo() {
        return this.SellerNo;
    }

    /**
     * Set 卖方单位代码/身份证号码
     * @param SellerNo 卖方单位代码/身份证号码
     */
    public void setSellerNo(String SellerNo) {
        this.SellerNo = SellerNo;
    }

    /**
     * Get 卖方单位/个人地址 
     * @return SellerAddress 卖方单位/个人地址
     */
    public String getSellerAddress() {
        return this.SellerAddress;
    }

    /**
     * Set 卖方单位/个人地址
     * @param SellerAddress 卖方单位/个人地址
     */
    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
    }

    /**
     * Get 卖方单位电话 
     * @return SellerTel 卖方单位电话
     */
    public String getSellerTel() {
        return this.SellerTel;
    }

    /**
     * Set 卖方单位电话
     * @param SellerTel 卖方单位电话
     */
    public void setSellerTel(String SellerTel) {
        this.SellerTel = SellerTel;
    }

    /**
     * Get 车牌照号 
     * @return VehicleLicenseNo 车牌照号
     */
    public String getVehicleLicenseNo() {
        return this.VehicleLicenseNo;
    }

    /**
     * Set 车牌照号
     * @param VehicleLicenseNo 车牌照号
     */
    public void setVehicleLicenseNo(String VehicleLicenseNo) {
        this.VehicleLicenseNo = VehicleLicenseNo;
    }

    /**
     * Get 登记证号 
     * @return RegisterNo 登记证号
     */
    public String getRegisterNo() {
        return this.RegisterNo;
    }

    /**
     * Set 登记证号
     * @param RegisterNo 登记证号
     */
    public void setRegisterNo(String RegisterNo) {
        this.RegisterNo = RegisterNo;
    }

    /**
     * Get 车架号/车辆识别代码 
     * @return VehicleIdentifyNo 车架号/车辆识别代码
     */
    public String getVehicleIdentifyNo() {
        return this.VehicleIdentifyNo;
    }

    /**
     * Set 车架号/车辆识别代码
     * @param VehicleIdentifyNo 车架号/车辆识别代码
     */
    public void setVehicleIdentifyNo(String VehicleIdentifyNo) {
        this.VehicleIdentifyNo = VehicleIdentifyNo;
    }

    /**
     * Get 转入地车辆管理所名称 
     * @return ManagementOffice 转入地车辆管理所名称
     */
    public String getManagementOffice() {
        return this.ManagementOffice;
    }

    /**
     * Set 转入地车辆管理所名称
     * @param ManagementOffice 转入地车辆管理所名称
     */
    public void setManagementOffice(String ManagementOffice) {
        this.ManagementOffice = ManagementOffice;
    }

    /**
     * Get 车价合计 
     * @return VehicleTotalPrice 车价合计
     */
    public String getVehicleTotalPrice() {
        return this.VehicleTotalPrice;
    }

    /**
     * Set 车价合计
     * @param VehicleTotalPrice 车价合计
     */
    public void setVehicleTotalPrice(String VehicleTotalPrice) {
        this.VehicleTotalPrice = VehicleTotalPrice;
    }

    /**
     * Get 经营、拍卖单位 
     * @return Auctioneer 经营、拍卖单位
     */
    public String getAuctioneer() {
        return this.Auctioneer;
    }

    /**
     * Set 经营、拍卖单位
     * @param Auctioneer 经营、拍卖单位
     */
    public void setAuctioneer(String Auctioneer) {
        this.Auctioneer = Auctioneer;
    }

    /**
     * Get 经营、拍卖单位地址 
     * @return AuctioneerAddress 经营、拍卖单位地址
     */
    public String getAuctioneerAddress() {
        return this.AuctioneerAddress;
    }

    /**
     * Set 经营、拍卖单位地址
     * @param AuctioneerAddress 经营、拍卖单位地址
     */
    public void setAuctioneerAddress(String AuctioneerAddress) {
        this.AuctioneerAddress = AuctioneerAddress;
    }

    /**
     * Get 经营、拍卖单位纳税人识别号 
     * @return AuctioneerTaxpayerNum 经营、拍卖单位纳税人识别号
     */
    public String getAuctioneerTaxpayerNum() {
        return this.AuctioneerTaxpayerNum;
    }

    /**
     * Set 经营、拍卖单位纳税人识别号
     * @param AuctioneerTaxpayerNum 经营、拍卖单位纳税人识别号
     */
    public void setAuctioneerTaxpayerNum(String AuctioneerTaxpayerNum) {
        this.AuctioneerTaxpayerNum = AuctioneerTaxpayerNum;
    }

    /**
     * Get 经营、拍卖单位开户银行、账号 
     * @return AuctioneerBankAccount 经营、拍卖单位开户银行、账号
     */
    public String getAuctioneerBankAccount() {
        return this.AuctioneerBankAccount;
    }

    /**
     * Set 经营、拍卖单位开户银行、账号
     * @param AuctioneerBankAccount 经营、拍卖单位开户银行、账号
     */
    public void setAuctioneerBankAccount(String AuctioneerBankAccount) {
        this.AuctioneerBankAccount = AuctioneerBankAccount;
    }

    /**
     * Get 经营、拍卖单位电话 
     * @return AuctioneerTel 经营、拍卖单位电话
     */
    public String getAuctioneerTel() {
        return this.AuctioneerTel;
    }

    /**
     * Set 经营、拍卖单位电话
     * @param AuctioneerTel 经营、拍卖单位电话
     */
    public void setAuctioneerTel(String AuctioneerTel) {
        this.AuctioneerTel = AuctioneerTel;
    }

    /**
     * Get 二手车市场 
     * @return Market 二手车市场
     */
    public String getMarket() {
        return this.Market;
    }

    /**
     * Set 二手车市场
     * @param Market 二手车市场
     */
    public void setMarket(String Market) {
        this.Market = Market;
    }

    /**
     * Get 二手车市场纳税人识别号 
     * @return MarketTaxpayerNum 二手车市场纳税人识别号
     */
    public String getMarketTaxpayerNum() {
        return this.MarketTaxpayerNum;
    }

    /**
     * Set 二手车市场纳税人识别号
     * @param MarketTaxpayerNum 二手车市场纳税人识别号
     */
    public void setMarketTaxpayerNum(String MarketTaxpayerNum) {
        this.MarketTaxpayerNum = MarketTaxpayerNum;
    }

    /**
     * Get 二手车市场地址 
     * @return MarketAddress 二手车市场地址
     */
    public String getMarketAddress() {
        return this.MarketAddress;
    }

    /**
     * Set 二手车市场地址
     * @param MarketAddress 二手车市场地址
     */
    public void setMarketAddress(String MarketAddress) {
        this.MarketAddress = MarketAddress;
    }

    /**
     * Get 二手车市场开户银行账号 
     * @return MarketBankAccount 二手车市场开户银行账号
     */
    public String getMarketBankAccount() {
        return this.MarketBankAccount;
    }

    /**
     * Set 二手车市场开户银行账号
     * @param MarketBankAccount 二手车市场开户银行账号
     */
    public void setMarketBankAccount(String MarketBankAccount) {
        this.MarketBankAccount = MarketBankAccount;
    }

    /**
     * Get 二手车市场电话 
     * @return MarketTel 二手车市场电话
     */
    public String getMarketTel() {
        return this.MarketTel;
    }

    /**
     * Set 二手车市场电话
     * @param MarketTel 二手车市场电话
     */
    public void setMarketTel(String MarketTel) {
        this.MarketTel = MarketTel;
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

    }
}

