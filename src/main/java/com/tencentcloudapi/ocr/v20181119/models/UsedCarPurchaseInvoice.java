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

public class UsedCarPurchaseInvoice extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 是否存在二维码（0：没有，1：有）
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
    * 销货单位名称
    */
    @SerializedName("Seller")
    @Expose
    private String Seller;

    /**
    * 销售方电话
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * 销售方单位代码/个人身份证号
    */
    @SerializedName("SellerTaxID")
    @Expose
    private String SellerTaxID;

    /**
    * 销售方地址
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * 购买方名称
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 购买方单位代码/个人身份证号
    */
    @SerializedName("BuyerID")
    @Expose
    private String BuyerID;

    /**
    * 购买方地址
    */
    @SerializedName("BuyerAddress")
    @Expose
    private String BuyerAddress;

    /**
    * 购买方电话
    */
    @SerializedName("BuyerTel")
    @Expose
    private String BuyerTel;

    /**
    * 二手车市场
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 二手车市场纳税人识别号
    */
    @SerializedName("CompanyTaxID")
    @Expose
    private String CompanyTaxID;

    /**
    * 二手车市场开户银行和账号
    */
    @SerializedName("CompanyBankAccount")
    @Expose
    private String CompanyBankAccount;

    /**
    * 二手车市场电话
    */
    @SerializedName("CompanyTel")
    @Expose
    private String CompanyTel;

    /**
    * 二手车市场地址
    */
    @SerializedName("CompanyAddress")
    @Expose
    private String CompanyAddress;

    /**
    * 转入地车辆管理所名称
    */
    @SerializedName("TransferAdministrationName")
    @Expose
    private String TransferAdministrationName;

    /**
    * 车牌号
    */
    @SerializedName("LicensePlate")
    @Expose
    private String LicensePlate;

    /**
    * 登记证号
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * 车辆识别代码
    */
    @SerializedName("VIN")
    @Expose
    private String VIN;

    /**
    * 厂牌型号
    */
    @SerializedName("VehicleModel")
    @Expose
    private String VehicleModel;

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
    * 车辆类型
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 发票联次
    */
    @SerializedName("FormType")
    @Expose
    private String FormType;

    /**
    * 发票联名
    */
    @SerializedName("FormName")
    @Expose
    private String FormName;

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

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
     * Get 是否存在二维码（0：没有，1：有） 
     * @return QRCodeMark 是否存在二维码（0：没有，1：有）
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set 是否存在二维码（0：没有，1：有）
     * @param QRCodeMark 是否存在二维码（0：没有，1：有）
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
     * Get 销货单位名称 
     * @return Seller 销货单位名称
     */
    public String getSeller() {
        return this.Seller;
    }

    /**
     * Set 销货单位名称
     * @param Seller 销货单位名称
     */
    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    /**
     * Get 销售方电话 
     * @return SellerTel 销售方电话
     */
    public String getSellerTel() {
        return this.SellerTel;
    }

    /**
     * Set 销售方电话
     * @param SellerTel 销售方电话
     */
    public void setSellerTel(String SellerTel) {
        this.SellerTel = SellerTel;
    }

    /**
     * Get 销售方单位代码/个人身份证号 
     * @return SellerTaxID 销售方单位代码/个人身份证号
     */
    public String getSellerTaxID() {
        return this.SellerTaxID;
    }

    /**
     * Set 销售方单位代码/个人身份证号
     * @param SellerTaxID 销售方单位代码/个人身份证号
     */
    public void setSellerTaxID(String SellerTaxID) {
        this.SellerTaxID = SellerTaxID;
    }

    /**
     * Get 销售方地址 
     * @return SellerAddress 销售方地址
     */
    public String getSellerAddress() {
        return this.SellerAddress;
    }

    /**
     * Set 销售方地址
     * @param SellerAddress 销售方地址
     */
    public void setSellerAddress(String SellerAddress) {
        this.SellerAddress = SellerAddress;
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
     * Get 购买方单位代码/个人身份证号 
     * @return BuyerID 购买方单位代码/个人身份证号
     */
    public String getBuyerID() {
        return this.BuyerID;
    }

    /**
     * Set 购买方单位代码/个人身份证号
     * @param BuyerID 购买方单位代码/个人身份证号
     */
    public void setBuyerID(String BuyerID) {
        this.BuyerID = BuyerID;
    }

    /**
     * Get 购买方地址 
     * @return BuyerAddress 购买方地址
     */
    public String getBuyerAddress() {
        return this.BuyerAddress;
    }

    /**
     * Set 购买方地址
     * @param BuyerAddress 购买方地址
     */
    public void setBuyerAddress(String BuyerAddress) {
        this.BuyerAddress = BuyerAddress;
    }

    /**
     * Get 购买方电话 
     * @return BuyerTel 购买方电话
     */
    public String getBuyerTel() {
        return this.BuyerTel;
    }

    /**
     * Set 购买方电话
     * @param BuyerTel 购买方电话
     */
    public void setBuyerTel(String BuyerTel) {
        this.BuyerTel = BuyerTel;
    }

    /**
     * Get 二手车市场 
     * @return CompanyName 二手车市场
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 二手车市场
     * @param CompanyName 二手车市场
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 二手车市场纳税人识别号 
     * @return CompanyTaxID 二手车市场纳税人识别号
     */
    public String getCompanyTaxID() {
        return this.CompanyTaxID;
    }

    /**
     * Set 二手车市场纳税人识别号
     * @param CompanyTaxID 二手车市场纳税人识别号
     */
    public void setCompanyTaxID(String CompanyTaxID) {
        this.CompanyTaxID = CompanyTaxID;
    }

    /**
     * Get 二手车市场开户银行和账号 
     * @return CompanyBankAccount 二手车市场开户银行和账号
     */
    public String getCompanyBankAccount() {
        return this.CompanyBankAccount;
    }

    /**
     * Set 二手车市场开户银行和账号
     * @param CompanyBankAccount 二手车市场开户银行和账号
     */
    public void setCompanyBankAccount(String CompanyBankAccount) {
        this.CompanyBankAccount = CompanyBankAccount;
    }

    /**
     * Get 二手车市场电话 
     * @return CompanyTel 二手车市场电话
     */
    public String getCompanyTel() {
        return this.CompanyTel;
    }

    /**
     * Set 二手车市场电话
     * @param CompanyTel 二手车市场电话
     */
    public void setCompanyTel(String CompanyTel) {
        this.CompanyTel = CompanyTel;
    }

    /**
     * Get 二手车市场地址 
     * @return CompanyAddress 二手车市场地址
     */
    public String getCompanyAddress() {
        return this.CompanyAddress;
    }

    /**
     * Set 二手车市场地址
     * @param CompanyAddress 二手车市场地址
     */
    public void setCompanyAddress(String CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    /**
     * Get 转入地车辆管理所名称 
     * @return TransferAdministrationName 转入地车辆管理所名称
     */
    public String getTransferAdministrationName() {
        return this.TransferAdministrationName;
    }

    /**
     * Set 转入地车辆管理所名称
     * @param TransferAdministrationName 转入地车辆管理所名称
     */
    public void setTransferAdministrationName(String TransferAdministrationName) {
        this.TransferAdministrationName = TransferAdministrationName;
    }

    /**
     * Get 车牌号 
     * @return LicensePlate 车牌号
     */
    public String getLicensePlate() {
        return this.LicensePlate;
    }

    /**
     * Set 车牌号
     * @param LicensePlate 车牌号
     */
    public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    /**
     * Get 登记证号 
     * @return RegistrationNumber 登记证号
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set 登记证号
     * @param RegistrationNumber 登记证号
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get 车辆识别代码 
     * @return VIN 车辆识别代码
     */
    public String getVIN() {
        return this.VIN;
    }

    /**
     * Set 车辆识别代码
     * @param VIN 车辆识别代码
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * Get 厂牌型号 
     * @return VehicleModel 厂牌型号
     */
    public String getVehicleModel() {
        return this.VehicleModel;
    }

    /**
     * Set 厂牌型号
     * @param VehicleModel 厂牌型号
     */
    public void setVehicleModel(String VehicleModel) {
        this.VehicleModel = VehicleModel;
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
     * Get 车辆类型 
     * @return VehicleType 车辆类型
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set 车辆类型
     * @param VehicleType 车辆类型
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
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
     * Get 发票联次 
     * @return FormType 发票联次
     */
    public String getFormType() {
        return this.FormType;
    }

    /**
     * Set 发票联次
     * @param FormType 发票联次
     */
    public void setFormType(String FormType) {
        this.FormType = FormType;
    }

    /**
     * Get 发票联名 
     * @return FormName 发票联名
     */
    public String getFormName() {
        return this.FormName;
    }

    /**
     * Set 发票联名
     * @param FormName 发票联名
     */
    public void setFormName(String FormName) {
        this.FormName = FormName;
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

    public UsedCarPurchaseInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsedCarPurchaseInvoice(UsedCarPurchaseInvoice source) {
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
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTel != null) {
            this.SellerTel = new String(source.SellerTel);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerID != null) {
            this.BuyerID = new String(source.BuyerID);
        }
        if (source.BuyerAddress != null) {
            this.BuyerAddress = new String(source.BuyerAddress);
        }
        if (source.BuyerTel != null) {
            this.BuyerTel = new String(source.BuyerTel);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyTaxID != null) {
            this.CompanyTaxID = new String(source.CompanyTaxID);
        }
        if (source.CompanyBankAccount != null) {
            this.CompanyBankAccount = new String(source.CompanyBankAccount);
        }
        if (source.CompanyTel != null) {
            this.CompanyTel = new String(source.CompanyTel);
        }
        if (source.CompanyAddress != null) {
            this.CompanyAddress = new String(source.CompanyAddress);
        }
        if (source.TransferAdministrationName != null) {
            this.TransferAdministrationName = new String(source.TransferAdministrationName);
        }
        if (source.LicensePlate != null) {
            this.LicensePlate = new String(source.LicensePlate);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
        if (source.VIN != null) {
            this.VIN = new String(source.VIN);
        }
        if (source.VehicleModel != null) {
            this.VehicleModel = new String(source.VehicleModel);
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
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FormType != null) {
            this.FormType = new String(source.FormType);
        }
        if (source.FormName != null) {
            this.FormName = new String(source.FormName);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTel", this.SellerTel);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerID", this.BuyerID);
        this.setParamSimple(map, prefix + "BuyerAddress", this.BuyerAddress);
        this.setParamSimple(map, prefix + "BuyerTel", this.BuyerTel);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyTaxID", this.CompanyTaxID);
        this.setParamSimple(map, prefix + "CompanyBankAccount", this.CompanyBankAccount);
        this.setParamSimple(map, prefix + "CompanyTel", this.CompanyTel);
        this.setParamSimple(map, prefix + "CompanyAddress", this.CompanyAddress);
        this.setParamSimple(map, prefix + "TransferAdministrationName", this.TransferAdministrationName);
        this.setParamSimple(map, prefix + "LicensePlate", this.LicensePlate);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);
        this.setParamSimple(map, prefix + "VIN", this.VIN);
        this.setParamSimple(map, prefix + "VehicleModel", this.VehicleModel);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FormType", this.FormType);
        this.setParamSimple(map, prefix + "FormName", this.FormName);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);

    }
}

