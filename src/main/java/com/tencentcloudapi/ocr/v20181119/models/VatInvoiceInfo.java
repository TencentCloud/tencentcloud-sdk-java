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

public class VatInvoiceInfo extends AbstractModel{

    /**
    * 校验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 发票联次
    */
    @SerializedName("FormType")
    @Expose
    private String FormType;

    /**
    * 车船税
    */
    @SerializedName("TravelTax")
    @Expose
    private String TravelTax;

    /**
    * 购买方地址电话
    */
    @SerializedName("BuyerAddrTel")
    @Expose
    private String BuyerAddrTel;

    /**
    * 购买方银行账号
    */
    @SerializedName("BuyerBankAccount")
    @Expose
    private String BuyerBankAccount;

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
    * 服务类型
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 是否存在二维码（0：没有，1：有）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 是否有代开标记（0：没有，1：有）
    */
    @SerializedName("AgentMark")
    @Expose
    private Long AgentMark;

    /**
    * 是否有通行费标记（0：没有，1：有）
    */
    @SerializedName("TransitMark")
    @Expose
    private Long TransitMark;

    /**
    * 是否有成品油标记（0：没有，1：有）
    */
    @SerializedName("OilMark")
    @Expose
    private Long OilMark;

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 发票消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

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
    * 机器编号
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 密码区
    */
    @SerializedName("Ciphertext")
    @Expose
    private String Ciphertext;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
    * 销售方地址电话
    */
    @SerializedName("SellerAddrTel")
    @Expose
    private String SellerAddrTel;

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
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

    /**
    * 开票人
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 复核人
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 增值税发票项目信息
    */
    @SerializedName("VatInvoiceItemInfos")
    @Expose
    private VatInvoiceItemInfo [] VatInvoiceItemInfos;

    /**
    * 机打发票代码
    */
    @SerializedName("CodeConfirm")
    @Expose
    private String CodeConfirm;

    /**
    * 收款人
    */
    @SerializedName("Receiptor")
    @Expose
    private String Receiptor;

    /**
    * 是否有全电纸质票（0：没有，1：有）
    */
    @SerializedName("ElectronicFullMark")
    @Expose
    private Long ElectronicFullMark;

    /**
    * 全电号码
    */
    @SerializedName("ElectronicFullNumber")
    @Expose
    private String ElectronicFullNumber;

    /**
    * 发票联名
    */
    @SerializedName("FormName")
    @Expose
    private String FormName;

    /**
    * 是否有区块链标记（0：没有，1：有）	
    */
    @SerializedName("BlockChainMark")
    @Expose
    private Long BlockChainMark;

    /**
    * 是否有收购标记（0：没有，1：有）	
    */
    @SerializedName("AcquisitionMark")
    @Expose
    private Long AcquisitionMark;

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
     * Get 车船税 
     * @return TravelTax 车船税
     */
    public String getTravelTax() {
        return this.TravelTax;
    }

    /**
     * Set 车船税
     * @param TravelTax 车船税
     */
    public void setTravelTax(String TravelTax) {
        this.TravelTax = TravelTax;
    }

    /**
     * Get 购买方地址电话 
     * @return BuyerAddrTel 购买方地址电话
     */
    public String getBuyerAddrTel() {
        return this.BuyerAddrTel;
    }

    /**
     * Set 购买方地址电话
     * @param BuyerAddrTel 购买方地址电话
     */
    public void setBuyerAddrTel(String BuyerAddrTel) {
        this.BuyerAddrTel = BuyerAddrTel;
    }

    /**
     * Get 购买方银行账号 
     * @return BuyerBankAccount 购买方银行账号
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set 购买方银行账号
     * @param BuyerBankAccount 购买方银行账号
     */
    public void setBuyerBankAccount(String BuyerBankAccount) {
        this.BuyerBankAccount = BuyerBankAccount;
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
     * Get 是否有代开标记（0：没有，1：有） 
     * @return AgentMark 是否有代开标记（0：没有，1：有）
     */
    public Long getAgentMark() {
        return this.AgentMark;
    }

    /**
     * Set 是否有代开标记（0：没有，1：有）
     * @param AgentMark 是否有代开标记（0：没有，1：有）
     */
    public void setAgentMark(Long AgentMark) {
        this.AgentMark = AgentMark;
    }

    /**
     * Get 是否有通行费标记（0：没有，1：有） 
     * @return TransitMark 是否有通行费标记（0：没有，1：有）
     */
    public Long getTransitMark() {
        return this.TransitMark;
    }

    /**
     * Set 是否有通行费标记（0：没有，1：有）
     * @param TransitMark 是否有通行费标记（0：没有，1：有）
     */
    public void setTransitMark(Long TransitMark) {
        this.TransitMark = TransitMark;
    }

    /**
     * Get 是否有成品油标记（0：没有，1：有） 
     * @return OilMark 是否有成品油标记（0：没有，1：有）
     */
    public Long getOilMark() {
        return this.OilMark;
    }

    /**
     * Set 是否有成品油标记（0：没有，1：有）
     * @param OilMark 是否有成品油标记（0：没有，1：有）
     */
    public void setOilMark(Long OilMark) {
        this.OilMark = OilMark;
    }

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
     * Get 机器编号 
     * @return MachineCode 机器编号
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 机器编号
     * @param MachineCode 机器编号
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 密码区 
     * @return Ciphertext 密码区
     */
    public String getCiphertext() {
        return this.Ciphertext;
    }

    /**
     * Set 密码区
     * @param Ciphertext 密码区
     */
    public void setCiphertext(String Ciphertext) {
        this.Ciphertext = Ciphertext;
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
     * Get 销售方地址电话 
     * @return SellerAddrTel 销售方地址电话
     */
    public String getSellerAddrTel() {
        return this.SellerAddrTel;
    }

    /**
     * Set 销售方地址电话
     * @param SellerAddrTel 销售方地址电话
     */
    public void setSellerAddrTel(String SellerAddrTel) {
        this.SellerAddrTel = SellerAddrTel;
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
     * Get 增值税发票项目信息 
     * @return VatInvoiceItemInfos 增值税发票项目信息
     */
    public VatInvoiceItemInfo [] getVatInvoiceItemInfos() {
        return this.VatInvoiceItemInfos;
    }

    /**
     * Set 增值税发票项目信息
     * @param VatInvoiceItemInfos 增值税发票项目信息
     */
    public void setVatInvoiceItemInfos(VatInvoiceItemInfo [] VatInvoiceItemInfos) {
        this.VatInvoiceItemInfos = VatInvoiceItemInfos;
    }

    /**
     * Get 机打发票代码 
     * @return CodeConfirm 机打发票代码
     */
    public String getCodeConfirm() {
        return this.CodeConfirm;
    }

    /**
     * Set 机打发票代码
     * @param CodeConfirm 机打发票代码
     */
    public void setCodeConfirm(String CodeConfirm) {
        this.CodeConfirm = CodeConfirm;
    }

    /**
     * Get 收款人 
     * @return Receiptor 收款人
     */
    public String getReceiptor() {
        return this.Receiptor;
    }

    /**
     * Set 收款人
     * @param Receiptor 收款人
     */
    public void setReceiptor(String Receiptor) {
        this.Receiptor = Receiptor;
    }

    /**
     * Get 是否有全电纸质票（0：没有，1：有） 
     * @return ElectronicFullMark 是否有全电纸质票（0：没有，1：有）
     */
    public Long getElectronicFullMark() {
        return this.ElectronicFullMark;
    }

    /**
     * Set 是否有全电纸质票（0：没有，1：有）
     * @param ElectronicFullMark 是否有全电纸质票（0：没有，1：有）
     */
    public void setElectronicFullMark(Long ElectronicFullMark) {
        this.ElectronicFullMark = ElectronicFullMark;
    }

    /**
     * Get 全电号码 
     * @return ElectronicFullNumber 全电号码
     */
    public String getElectronicFullNumber() {
        return this.ElectronicFullNumber;
    }

    /**
     * Set 全电号码
     * @param ElectronicFullNumber 全电号码
     */
    public void setElectronicFullNumber(String ElectronicFullNumber) {
        this.ElectronicFullNumber = ElectronicFullNumber;
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
     * Get 是否有区块链标记（0：没有，1：有）	 
     * @return BlockChainMark 是否有区块链标记（0：没有，1：有）	
     */
    public Long getBlockChainMark() {
        return this.BlockChainMark;
    }

    /**
     * Set 是否有区块链标记（0：没有，1：有）	
     * @param BlockChainMark 是否有区块链标记（0：没有，1：有）	
     */
    public void setBlockChainMark(Long BlockChainMark) {
        this.BlockChainMark = BlockChainMark;
    }

    /**
     * Get 是否有收购标记（0：没有，1：有）	 
     * @return AcquisitionMark 是否有收购标记（0：没有，1：有）	
     */
    public Long getAcquisitionMark() {
        return this.AcquisitionMark;
    }

    /**
     * Set 是否有收购标记（0：没有，1：有）	
     * @param AcquisitionMark 是否有收购标记（0：没有，1：有）	
     */
    public void setAcquisitionMark(Long AcquisitionMark) {
        this.AcquisitionMark = AcquisitionMark;
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

    public VatInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoiceInfo(VatInvoiceInfo source) {
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.FormType != null) {
            this.FormType = new String(source.FormType);
        }
        if (source.TravelTax != null) {
            this.TravelTax = new String(source.TravelTax);
        }
        if (source.BuyerAddrTel != null) {
            this.BuyerAddrTel = new String(source.BuyerAddrTel);
        }
        if (source.BuyerBankAccount != null) {
            this.BuyerBankAccount = new String(source.BuyerBankAccount);
        }
        if (source.CompanySealContent != null) {
            this.CompanySealContent = new String(source.CompanySealContent);
        }
        if (source.TaxSealContent != null) {
            this.TaxSealContent = new String(source.TaxSealContent);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.AgentMark != null) {
            this.AgentMark = new Long(source.AgentMark);
        }
        if (source.TransitMark != null) {
            this.TransitMark = new Long(source.TransitMark);
        }
        if (source.OilMark != null) {
            this.OilMark = new Long(source.OilMark);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
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
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.PretaxAmount != null) {
            this.PretaxAmount = new String(source.PretaxAmount);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.Ciphertext != null) {
            this.Ciphertext = new String(source.Ciphertext);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Seller != null) {
            this.Seller = new String(source.Seller);
        }
        if (source.SellerTaxID != null) {
            this.SellerTaxID = new String(source.SellerTaxID);
        }
        if (source.SellerAddrTel != null) {
            this.SellerAddrTel = new String(source.SellerAddrTel);
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
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.VatInvoiceItemInfos != null) {
            this.VatInvoiceItemInfos = new VatInvoiceItemInfo[source.VatInvoiceItemInfos.length];
            for (int i = 0; i < source.VatInvoiceItemInfos.length; i++) {
                this.VatInvoiceItemInfos[i] = new VatInvoiceItemInfo(source.VatInvoiceItemInfos[i]);
            }
        }
        if (source.CodeConfirm != null) {
            this.CodeConfirm = new String(source.CodeConfirm);
        }
        if (source.Receiptor != null) {
            this.Receiptor = new String(source.Receiptor);
        }
        if (source.ElectronicFullMark != null) {
            this.ElectronicFullMark = new Long(source.ElectronicFullMark);
        }
        if (source.ElectronicFullNumber != null) {
            this.ElectronicFullNumber = new String(source.ElectronicFullNumber);
        }
        if (source.FormName != null) {
            this.FormName = new String(source.FormName);
        }
        if (source.BlockChainMark != null) {
            this.BlockChainMark = new Long(source.BlockChainMark);
        }
        if (source.AcquisitionMark != null) {
            this.AcquisitionMark = new Long(source.AcquisitionMark);
        }
        if (source.SubTotal != null) {
            this.SubTotal = new String(source.SubTotal);
        }
        if (source.SubTax != null) {
            this.SubTax = new String(source.SubTax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "FormType", this.FormType);
        this.setParamSimple(map, prefix + "TravelTax", this.TravelTax);
        this.setParamSimple(map, prefix + "BuyerAddrTel", this.BuyerAddrTel);
        this.setParamSimple(map, prefix + "BuyerBankAccount", this.BuyerBankAccount);
        this.setParamSimple(map, prefix + "CompanySealContent", this.CompanySealContent);
        this.setParamSimple(map, prefix + "TaxSealContent", this.TaxSealContent);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "AgentMark", this.AgentMark);
        this.setParamSimple(map, prefix + "TransitMark", this.TransitMark);
        this.setParamSimple(map, prefix + "OilMark", this.OilMark);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "NumberConfirm", this.NumberConfirm);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "PretaxAmount", this.PretaxAmount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "Ciphertext", this.Ciphertext);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Seller", this.Seller);
        this.setParamSimple(map, prefix + "SellerTaxID", this.SellerTaxID);
        this.setParamSimple(map, prefix + "SellerAddrTel", this.SellerAddrTel);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamArrayObj(map, prefix + "VatInvoiceItemInfos.", this.VatInvoiceItemInfos);
        this.setParamSimple(map, prefix + "CodeConfirm", this.CodeConfirm);
        this.setParamSimple(map, prefix + "Receiptor", this.Receiptor);
        this.setParamSimple(map, prefix + "ElectronicFullMark", this.ElectronicFullMark);
        this.setParamSimple(map, prefix + "ElectronicFullNumber", this.ElectronicFullNumber);
        this.setParamSimple(map, prefix + "FormName", this.FormName);
        this.setParamSimple(map, prefix + "BlockChainMark", this.BlockChainMark);
        this.setParamSimple(map, prefix + "AcquisitionMark", this.AcquisitionMark);
        this.setParamSimple(map, prefix + "SubTotal", this.SubTotal);
        this.setParamSimple(map, prefix + "SubTax", this.SubTax);

    }
}

