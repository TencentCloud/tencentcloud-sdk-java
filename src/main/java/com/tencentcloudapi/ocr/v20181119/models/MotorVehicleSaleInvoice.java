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

public class MotorVehicleSaleInvoice extends AbstractModel{

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
    * 销售方单位代码
    */
    @SerializedName("SellerTaxID")
    @Expose
    private String SellerTaxID;

    /**
    * 销售方电话
    */
    @SerializedName("SellerTel")
    @Expose
    private String SellerTel;

    /**
    * 销售方地址
    */
    @SerializedName("SellerAddress")
    @Expose
    private String SellerAddress;

    /**
    * 销售方开户行
    */
    @SerializedName("SellerBank")
    @Expose
    private String SellerBank;

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
    * 购买方身份证号码/组织机构代码
    */
    @SerializedName("BuyerID")
    @Expose
    private String BuyerID;

    /**
    * 主管税务机关
    */
    @SerializedName("TaxAuthorities")
    @Expose
    private String TaxAuthorities;

    /**
    * 主管税务机关代码
    */
    @SerializedName("TaxAuthoritiesCode")
    @Expose
    private String TaxAuthoritiesCode;

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
    * 发动机号码
    */
    @SerializedName("VehicleEngineCode")
    @Expose
    private String VehicleEngineCode;

    /**
    * 合格证号
    */
    @SerializedName("CertificateNumber")
    @Expose
    private String CertificateNumber;

    /**
    * 商检单号
    */
    @SerializedName("InspectionNumber")
    @Expose
    private String InspectionNumber;

    /**
    * 机器编号
    */
    @SerializedName("MachineID")
    @Expose
    private String MachineID;

    /**
    * 车辆类型
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

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
    * 合计税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * 吨位
    */
    @SerializedName("Tonnage")
    @Expose
    private String Tonnage;

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
    * 开票人
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 完税凭证号码
    */
    @SerializedName("TaxNum")
    @Expose
    private String TaxNum;

    /**
    * 限乘人数
    */
    @SerializedName("MaxPeopleNum")
    @Expose
    private String MaxPeopleNum;

    /**
    * 产地
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 机打发票代码
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 机打发票号码
    */
    @SerializedName("MachineNumber")
    @Expose
    private String MachineNumber;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

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
     * Get 销售方单位代码 
     * @return SellerTaxID 销售方单位代码
     */
    public String getSellerTaxID() {
        return this.SellerTaxID;
    }

    /**
     * Set 销售方单位代码
     * @param SellerTaxID 销售方单位代码
     */
    public void setSellerTaxID(String SellerTaxID) {
        this.SellerTaxID = SellerTaxID;
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
     * Get 销售方开户行 
     * @return SellerBank 销售方开户行
     */
    public String getSellerBank() {
        return this.SellerBank;
    }

    /**
     * Set 销售方开户行
     * @param SellerBank 销售方开户行
     */
    public void setSellerBank(String SellerBank) {
        this.SellerBank = SellerBank;
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
     * Get 购买方身份证号码/组织机构代码 
     * @return BuyerID 购买方身份证号码/组织机构代码
     */
    public String getBuyerID() {
        return this.BuyerID;
    }

    /**
     * Set 购买方身份证号码/组织机构代码
     * @param BuyerID 购买方身份证号码/组织机构代码
     */
    public void setBuyerID(String BuyerID) {
        this.BuyerID = BuyerID;
    }

    /**
     * Get 主管税务机关 
     * @return TaxAuthorities 主管税务机关
     */
    public String getTaxAuthorities() {
        return this.TaxAuthorities;
    }

    /**
     * Set 主管税务机关
     * @param TaxAuthorities 主管税务机关
     */
    public void setTaxAuthorities(String TaxAuthorities) {
        this.TaxAuthorities = TaxAuthorities;
    }

    /**
     * Get 主管税务机关代码 
     * @return TaxAuthoritiesCode 主管税务机关代码
     */
    public String getTaxAuthoritiesCode() {
        return this.TaxAuthoritiesCode;
    }

    /**
     * Set 主管税务机关代码
     * @param TaxAuthoritiesCode 主管税务机关代码
     */
    public void setTaxAuthoritiesCode(String TaxAuthoritiesCode) {
        this.TaxAuthoritiesCode = TaxAuthoritiesCode;
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
     * Get 发动机号码 
     * @return VehicleEngineCode 发动机号码
     */
    public String getVehicleEngineCode() {
        return this.VehicleEngineCode;
    }

    /**
     * Set 发动机号码
     * @param VehicleEngineCode 发动机号码
     */
    public void setVehicleEngineCode(String VehicleEngineCode) {
        this.VehicleEngineCode = VehicleEngineCode;
    }

    /**
     * Get 合格证号 
     * @return CertificateNumber 合格证号
     */
    public String getCertificateNumber() {
        return this.CertificateNumber;
    }

    /**
     * Set 合格证号
     * @param CertificateNumber 合格证号
     */
    public void setCertificateNumber(String CertificateNumber) {
        this.CertificateNumber = CertificateNumber;
    }

    /**
     * Get 商检单号 
     * @return InspectionNumber 商检单号
     */
    public String getInspectionNumber() {
        return this.InspectionNumber;
    }

    /**
     * Set 商检单号
     * @param InspectionNumber 商检单号
     */
    public void setInspectionNumber(String InspectionNumber) {
        this.InspectionNumber = InspectionNumber;
    }

    /**
     * Get 机器编号 
     * @return MachineID 机器编号
     */
    public String getMachineID() {
        return this.MachineID;
    }

    /**
     * Set 机器编号
     * @param MachineID 机器编号
     */
    public void setMachineID(String MachineID) {
        this.MachineID = MachineID;
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
     * Get 税率 
     * @return TaxRate 税率
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set 税率
     * @param TaxRate 税率
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
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
     * Get 吨位 
     * @return Tonnage 吨位
     */
    public String getTonnage() {
        return this.Tonnage;
    }

    /**
     * Set 吨位
     * @param Tonnage 吨位
     */
    public void setTonnage(String Tonnage) {
        this.Tonnage = Tonnage;
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
     * Get 完税凭证号码 
     * @return TaxNum 完税凭证号码
     */
    public String getTaxNum() {
        return this.TaxNum;
    }

    /**
     * Set 完税凭证号码
     * @param TaxNum 完税凭证号码
     */
    public void setTaxNum(String TaxNum) {
        this.TaxNum = TaxNum;
    }

    /**
     * Get 限乘人数 
     * @return MaxPeopleNum 限乘人数
     */
    public String getMaxPeopleNum() {
        return this.MaxPeopleNum;
    }

    /**
     * Set 限乘人数
     * @param MaxPeopleNum 限乘人数
     */
    public void setMaxPeopleNum(String MaxPeopleNum) {
        this.MaxPeopleNum = MaxPeopleNum;
    }

    /**
     * Get 产地 
     * @return Origin 产地
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 产地
     * @param Origin 产地
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 机打发票代码 
     * @return MachineCode 机打发票代码
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 机打发票代码
     * @param MachineCode 机打发票代码
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 机打发票号码 
     * @return MachineNumber 机打发票号码
     */
    public String getMachineNumber() {
        return this.MachineNumber;
    }

    /**
     * Set 机打发票号码
     * @param MachineNumber 机打发票号码
     */
    public void setMachineNumber(String MachineNumber) {
        this.MachineNumber = MachineNumber;
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

    public MotorVehicleSaleInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MotorVehicleSaleInvoice(MotorVehicleSaleInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
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
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
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
        if (source.SellerTel != null) {
            this.SellerTel = new String(source.SellerTel);
        }
        if (source.SellerAddress != null) {
            this.SellerAddress = new String(source.SellerAddress);
        }
        if (source.SellerBank != null) {
            this.SellerBank = new String(source.SellerBank);
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
        if (source.BuyerID != null) {
            this.BuyerID = new String(source.BuyerID);
        }
        if (source.TaxAuthorities != null) {
            this.TaxAuthorities = new String(source.TaxAuthorities);
        }
        if (source.TaxAuthoritiesCode != null) {
            this.TaxAuthoritiesCode = new String(source.TaxAuthoritiesCode);
        }
        if (source.VIN != null) {
            this.VIN = new String(source.VIN);
        }
        if (source.VehicleModel != null) {
            this.VehicleModel = new String(source.VehicleModel);
        }
        if (source.VehicleEngineCode != null) {
            this.VehicleEngineCode = new String(source.VehicleEngineCode);
        }
        if (source.CertificateNumber != null) {
            this.CertificateNumber = new String(source.CertificateNumber);
        }
        if (source.InspectionNumber != null) {
            this.InspectionNumber = new String(source.InspectionNumber);
        }
        if (source.MachineID != null) {
            this.MachineID = new String(source.MachineID);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
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
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.Tonnage != null) {
            this.Tonnage = new String(source.Tonnage);
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
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.TaxNum != null) {
            this.TaxNum = new String(source.TaxNum);
        }
        if (source.MaxPeopleNum != null) {
            this.MaxPeopleNum = new String(source.MaxPeopleNum);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.MachineNumber != null) {
            this.MachineNumber = new String(source.MachineNumber);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerTel", this.SellerTel);
        this.setParamSimple(map, prefix + "SellerAddress", this.SellerAddress);
        this.setParamSimple(map, prefix + "SellerBank", this.SellerBank);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "BuyerID", this.BuyerID);
        this.setParamSimple(map, prefix + "TaxAuthorities", this.TaxAuthorities);
        this.setParamSimple(map, prefix + "TaxAuthoritiesCode", this.TaxAuthoritiesCode);
        this.setParamSimple(map, prefix + "VIN", this.VIN);
        this.setParamSimple(map, prefix + "VehicleModel", this.VehicleModel);
        this.setParamSimple(map, prefix + "VehicleEngineCode", this.VehicleEngineCode);
        this.setParamSimple(map, prefix + "CertificateNumber", this.CertificateNumber);
        this.setParamSimple(map, prefix + "InspectionNumber", this.InspectionNumber);
        this.setParamSimple(map, prefix + "MachineID", this.MachineID);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "Tonnage", this.Tonnage);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FormType", this.FormType);
        this.setParamSimple(map, prefix + "FormName", this.FormName);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "TaxNum", this.TaxNum);
        this.setParamSimple(map, prefix + "MaxPeopleNum", this.MaxPeopleNum);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "MachineNumber", this.MachineNumber);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);

    }
}

