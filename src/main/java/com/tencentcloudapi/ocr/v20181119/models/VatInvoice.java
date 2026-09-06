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

public class VatInvoice extends AbstractModel {

    /**
    * <p>发票代码</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>发票号码</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>开票日期</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>购方抬头<br>通用机打发票类型时不返回</p>
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * <p>购方税号<br>通用机打发票类型时不返回</p>
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * <p>购方地址电话<br>通用机打发票类型做不返回</p>
    */
    @SerializedName("BuyerAddressPhone")
    @Expose
    private String BuyerAddressPhone;

    /**
    * <p>购方银行账号<br>通用机打发票类型时不返回</p>
    */
    @SerializedName("BuyerBankAccount")
    @Expose
    private String BuyerBankAccount;

    /**
    * <p>销方名称</p>
    */
    @SerializedName("SellerName")
    @Expose
    private String SellerName;

    /**
    * <p>销方税号</p>
    */
    @SerializedName("SellerTaxCode")
    @Expose
    private String SellerTaxCode;

    /**
    * <p>销方地址电话</p>
    */
    @SerializedName("SellerAddressPhone")
    @Expose
    private String SellerAddressPhone;

    /**
    * <p>销方银行账号</p>
    */
    @SerializedName("SellerBankAccount")
    @Expose
    private String SellerBankAccount;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>机器编码</p>
    */
    @SerializedName("MachineNo")
    @Expose
    private String MachineNo;

    /**
    * <p>票种类型<br>01：增值税专用发票，<br>02：货运运输业增值税专用发票，<br>03：机动车销售统一发票，<br>04：增值税普通发票，<br>08：增值税电子专用发票（含全电，全电仅新版接口支持），<br>09：全电发票，<br>0901：全电纸质发票(增值税专用发票)，<br>0903：全电纸质(机动车销售统一发票)，<br>0904：全电纸质发票(增值税普通发票)，<br>0910：电子发票(普通发票)，<br>0915：全电纸质(二手车销售统一发票)，<br>0920：电子发票(增值税专用发票)，<br>0930：电子发票(机动车销售统一发票)，<br>0940：电子发票(二手车销售统一发票)，<br>10：增值税电子普通发票（含全电，全电仅新版接口支持），<br>11：增值税普通发票（卷式），<br>14：增值税电子（通行费）发票，<br>15：二手车销售统一发票，<br>32：深圳区块链发票，<br>61：电子发票（航空运输电子客票行程单），<br>8208：电子发票(通行费发票)，<br>83：电子发票(铁路电子客票)，<br>100：区块链发票，<br>101：财政票据，<br>102：通用电子发票，<br>103：车辆通行费</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单</p>
    */
    @SerializedName("ElectronicType")
    @Expose
    private String ElectronicType;

    /**
    * <p>检验码</p>
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * <p>是否作废（红冲）是否作废（红冲）<br>Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲</p>
    */
    @SerializedName("IsAbandoned")
    @Expose
    private String IsAbandoned;

    /**
    * <p>是否有销货清单<br>Y: 有清单 N：无清单<br>卷票无</p>
    */
    @SerializedName("HasSellerList")
    @Expose
    private String HasSellerList;

    /**
    * <p>销货清单标题</p>
    */
    @SerializedName("SellerListTitle")
    @Expose
    private String SellerListTitle;

    /**
    * <p>销货清单税额</p>
    */
    @SerializedName("SellerListTax")
    @Expose
    private String SellerListTax;

    /**
    * <p>不含税金额</p>
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private String AmountWithoutTax;

    /**
    * <p>税额</p>
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * <p>含税金额</p>
    */
    @SerializedName("AmountWithTax")
    @Expose
    private String AmountWithTax;

    /**
    * <p>项目明细</p>
    */
    @SerializedName("Items")
    @Expose
    private VatInvoiceItem [] Items;

    /**
    * <p>所属税局</p>
    */
    @SerializedName("TaxBureau")
    @Expose
    private String TaxBureau;

    /**
    * <p>通行费标志:Y、是;N、否</p>
    */
    @SerializedName("TrafficFreeFlag")
    @Expose
    private String TrafficFreeFlag;

    /**
    * <p>是否为红票</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedLetterInvoiceMark")
    @Expose
    private Boolean RedLetterInvoiceMark;

    /**
    * <p>开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuingTypeMark")
    @Expose
    private Long IssuingTypeMark;

    /**
    * <p>代开销售方名称</p>
    */
    @SerializedName("SellerAgentName")
    @Expose
    private String SellerAgentName;

    /**
    * <p>代开销售方税号</p>
    */
    @SerializedName("SellerAgentTaxID")
    @Expose
    private String SellerAgentTaxID;

    /**
    * <p>地区代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * <p>复核人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewerName")
    @Expose
    private String ReviewerName;

    /**
    * <p>开票人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuerName")
    @Expose
    private String IssuerName;

    /**
    * <p>收款人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * <p>开票机号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * <p>税控码/密码区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxControlCode")
    @Expose
    private String TaxControlCode;

    /**
    * <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountWithTaxCN")
    @Expose
    private String AmountWithTaxCN;

    /**
    * <p>税率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * <p>特殊票种代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialTicketCode")
    @Expose
    private String SpecialTicketCode;

    /**
    * <p>红字发票信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedLetterInvoices")
    @Expose
    private RedLetterInvoiceItem [] RedLetterInvoices;

    /**
    * <p>全电类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullElectronicType")
    @Expose
    private String FullElectronicType;

    /**
    * <p>OFD版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfdUrl")
    @Expose
    private String OfdUrl;

    /**
    * <p>PDF版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PdfUrl")
    @Expose
    private String PdfUrl;

    /**
    * <p>原发票代码，对应蓝字发票代码。</p>
    */
    @SerializedName("OriginalCode")
    @Expose
    private String OriginalCode;

    /**
    * <p>原发票号码，对应蓝字发票号码。</p>
    */
    @SerializedName("OriginalNumber")
    @Expose
    private String OriginalNumber;

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
     * Get <p>购方抬头<br>通用机打发票类型时不返回</p> 
     * @return BuyerName <p>购方抬头<br>通用机打发票类型时不返回</p>
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set <p>购方抬头<br>通用机打发票类型时不返回</p>
     * @param BuyerName <p>购方抬头<br>通用机打发票类型时不返回</p>
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get <p>购方税号<br>通用机打发票类型时不返回</p> 
     * @return BuyerTaxCode <p>购方税号<br>通用机打发票类型时不返回</p>
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set <p>购方税号<br>通用机打发票类型时不返回</p>
     * @param BuyerTaxCode <p>购方税号<br>通用机打发票类型时不返回</p>
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get <p>购方地址电话<br>通用机打发票类型做不返回</p> 
     * @return BuyerAddressPhone <p>购方地址电话<br>通用机打发票类型做不返回</p>
     */
    public String getBuyerAddressPhone() {
        return this.BuyerAddressPhone;
    }

    /**
     * Set <p>购方地址电话<br>通用机打发票类型做不返回</p>
     * @param BuyerAddressPhone <p>购方地址电话<br>通用机打发票类型做不返回</p>
     */
    public void setBuyerAddressPhone(String BuyerAddressPhone) {
        this.BuyerAddressPhone = BuyerAddressPhone;
    }

    /**
     * Get <p>购方银行账号<br>通用机打发票类型时不返回</p> 
     * @return BuyerBankAccount <p>购方银行账号<br>通用机打发票类型时不返回</p>
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set <p>购方银行账号<br>通用机打发票类型时不返回</p>
     * @param BuyerBankAccount <p>购方银行账号<br>通用机打发票类型时不返回</p>
     */
    public void setBuyerBankAccount(String BuyerBankAccount) {
        this.BuyerBankAccount = BuyerBankAccount;
    }

    /**
     * Get <p>销方名称</p> 
     * @return SellerName <p>销方名称</p>
     */
    public String getSellerName() {
        return this.SellerName;
    }

    /**
     * Set <p>销方名称</p>
     * @param SellerName <p>销方名称</p>
     */
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    /**
     * Get <p>销方税号</p> 
     * @return SellerTaxCode <p>销方税号</p>
     */
    public String getSellerTaxCode() {
        return this.SellerTaxCode;
    }

    /**
     * Set <p>销方税号</p>
     * @param SellerTaxCode <p>销方税号</p>
     */
    public void setSellerTaxCode(String SellerTaxCode) {
        this.SellerTaxCode = SellerTaxCode;
    }

    /**
     * Get <p>销方地址电话</p> 
     * @return SellerAddressPhone <p>销方地址电话</p>
     */
    public String getSellerAddressPhone() {
        return this.SellerAddressPhone;
    }

    /**
     * Set <p>销方地址电话</p>
     * @param SellerAddressPhone <p>销方地址电话</p>
     */
    public void setSellerAddressPhone(String SellerAddressPhone) {
        this.SellerAddressPhone = SellerAddressPhone;
    }

    /**
     * Get <p>销方银行账号</p> 
     * @return SellerBankAccount <p>销方银行账号</p>
     */
    public String getSellerBankAccount() {
        return this.SellerBankAccount;
    }

    /**
     * Set <p>销方银行账号</p>
     * @param SellerBankAccount <p>销方银行账号</p>
     */
    public void setSellerBankAccount(String SellerBankAccount) {
        this.SellerBankAccount = SellerBankAccount;
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
     * Get <p>机器编码</p> 
     * @return MachineNo <p>机器编码</p>
     */
    public String getMachineNo() {
        return this.MachineNo;
    }

    /**
     * Set <p>机器编码</p>
     * @param MachineNo <p>机器编码</p>
     */
    public void setMachineNo(String MachineNo) {
        this.MachineNo = MachineNo;
    }

    /**
     * Get <p>票种类型<br>01：增值税专用发票，<br>02：货运运输业增值税专用发票，<br>03：机动车销售统一发票，<br>04：增值税普通发票，<br>08：增值税电子专用发票（含全电，全电仅新版接口支持），<br>09：全电发票，<br>0901：全电纸质发票(增值税专用发票)，<br>0903：全电纸质(机动车销售统一发票)，<br>0904：全电纸质发票(增值税普通发票)，<br>0910：电子发票(普通发票)，<br>0915：全电纸质(二手车销售统一发票)，<br>0920：电子发票(增值税专用发票)，<br>0930：电子发票(机动车销售统一发票)，<br>0940：电子发票(二手车销售统一发票)，<br>10：增值税电子普通发票（含全电，全电仅新版接口支持），<br>11：增值税普通发票（卷式），<br>14：增值税电子（通行费）发票，<br>15：二手车销售统一发票，<br>32：深圳区块链发票，<br>61：电子发票（航空运输电子客票行程单），<br>8208：电子发票(通行费发票)，<br>83：电子发票(铁路电子客票)，<br>100：区块链发票，<br>101：财政票据，<br>102：通用电子发票，<br>103：车辆通行费</p> 
     * @return Type <p>票种类型<br>01：增值税专用发票，<br>02：货运运输业增值税专用发票，<br>03：机动车销售统一发票，<br>04：增值税普通发票，<br>08：增值税电子专用发票（含全电，全电仅新版接口支持），<br>09：全电发票，<br>0901：全电纸质发票(增值税专用发票)，<br>0903：全电纸质(机动车销售统一发票)，<br>0904：全电纸质发票(增值税普通发票)，<br>0910：电子发票(普通发票)，<br>0915：全电纸质(二手车销售统一发票)，<br>0920：电子发票(增值税专用发票)，<br>0930：电子发票(机动车销售统一发票)，<br>0940：电子发票(二手车销售统一发票)，<br>10：增值税电子普通发票（含全电，全电仅新版接口支持），<br>11：增值税普通发票（卷式），<br>14：增值税电子（通行费）发票，<br>15：二手车销售统一发票，<br>32：深圳区块链发票，<br>61：电子发票（航空运输电子客票行程单），<br>8208：电子发票(通行费发票)，<br>83：电子发票(铁路电子客票)，<br>100：区块链发票，<br>101：财政票据，<br>102：通用电子发票，<br>103：车辆通行费</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>票种类型<br>01：增值税专用发票，<br>02：货运运输业增值税专用发票，<br>03：机动车销售统一发票，<br>04：增值税普通发票，<br>08：增值税电子专用发票（含全电，全电仅新版接口支持），<br>09：全电发票，<br>0901：全电纸质发票(增值税专用发票)，<br>0903：全电纸质(机动车销售统一发票)，<br>0904：全电纸质发票(增值税普通发票)，<br>0910：电子发票(普通发票)，<br>0915：全电纸质(二手车销售统一发票)，<br>0920：电子发票(增值税专用发票)，<br>0930：电子发票(机动车销售统一发票)，<br>0940：电子发票(二手车销售统一发票)，<br>10：增值税电子普通发票（含全电，全电仅新版接口支持），<br>11：增值税普通发票（卷式），<br>14：增值税电子（通行费）发票，<br>15：二手车销售统一发票，<br>32：深圳区块链发票，<br>61：电子发票（航空运输电子客票行程单），<br>8208：电子发票(通行费发票)，<br>83：电子发票(铁路电子客票)，<br>100：区块链发票，<br>101：财政票据，<br>102：通用电子发票，<br>103：车辆通行费</p>
     * @param Type <p>票种类型<br>01：增值税专用发票，<br>02：货运运输业增值税专用发票，<br>03：机动车销售统一发票，<br>04：增值税普通发票，<br>08：增值税电子专用发票（含全电，全电仅新版接口支持），<br>09：全电发票，<br>0901：全电纸质发票(增值税专用发票)，<br>0903：全电纸质(机动车销售统一发票)，<br>0904：全电纸质发票(增值税普通发票)，<br>0910：电子发票(普通发票)，<br>0915：全电纸质(二手车销售统一发票)，<br>0920：电子发票(增值税专用发票)，<br>0930：电子发票(机动车销售统一发票)，<br>0940：电子发票(二手车销售统一发票)，<br>10：增值税电子普通发票（含全电，全电仅新版接口支持），<br>11：增值税普通发票（卷式），<br>14：增值税电子（通行费）发票，<br>15：二手车销售统一发票，<br>32：深圳区块链发票，<br>61：电子发票（航空运输电子客票行程单），<br>8208：电子发票(通行费发票)，<br>83：电子发票(铁路电子客票)，<br>100：区块链发票，<br>101：财政票据，<br>102：通用电子发票，<br>103：车辆通行费</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单</p> 
     * @return ElectronicType <p>具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单</p>
     */
    public String getElectronicType() {
        return this.ElectronicType;
    }

    /**
     * Set <p>具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单</p>
     * @param ElectronicType <p>具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单</p>
     */
    public void setElectronicType(String ElectronicType) {
        this.ElectronicType = ElectronicType;
    }

    /**
     * Get <p>检验码</p> 
     * @return CheckCode <p>检验码</p>
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set <p>检验码</p>
     * @param CheckCode <p>检验码</p>
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get <p>是否作废（红冲）是否作废（红冲）<br>Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲</p> 
     * @return IsAbandoned <p>是否作废（红冲）是否作废（红冲）<br>Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲</p>
     */
    public String getIsAbandoned() {
        return this.IsAbandoned;
    }

    /**
     * Set <p>是否作废（红冲）是否作废（红冲）<br>Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲</p>
     * @param IsAbandoned <p>是否作废（红冲）是否作废（红冲）<br>Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲</p>
     */
    public void setIsAbandoned(String IsAbandoned) {
        this.IsAbandoned = IsAbandoned;
    }

    /**
     * Get <p>是否有销货清单<br>Y: 有清单 N：无清单<br>卷票无</p> 
     * @return HasSellerList <p>是否有销货清单<br>Y: 有清单 N：无清单<br>卷票无</p>
     */
    public String getHasSellerList() {
        return this.HasSellerList;
    }

    /**
     * Set <p>是否有销货清单<br>Y: 有清单 N：无清单<br>卷票无</p>
     * @param HasSellerList <p>是否有销货清单<br>Y: 有清单 N：无清单<br>卷票无</p>
     */
    public void setHasSellerList(String HasSellerList) {
        this.HasSellerList = HasSellerList;
    }

    /**
     * Get <p>销货清单标题</p> 
     * @return SellerListTitle <p>销货清单标题</p>
     */
    public String getSellerListTitle() {
        return this.SellerListTitle;
    }

    /**
     * Set <p>销货清单标题</p>
     * @param SellerListTitle <p>销货清单标题</p>
     */
    public void setSellerListTitle(String SellerListTitle) {
        this.SellerListTitle = SellerListTitle;
    }

    /**
     * Get <p>销货清单税额</p> 
     * @return SellerListTax <p>销货清单税额</p>
     */
    public String getSellerListTax() {
        return this.SellerListTax;
    }

    /**
     * Set <p>销货清单税额</p>
     * @param SellerListTax <p>销货清单税额</p>
     */
    public void setSellerListTax(String SellerListTax) {
        this.SellerListTax = SellerListTax;
    }

    /**
     * Get <p>不含税金额</p> 
     * @return AmountWithoutTax <p>不含税金额</p>
     */
    public String getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set <p>不含税金额</p>
     * @param AmountWithoutTax <p>不含税金额</p>
     */
    public void setAmountWithoutTax(String AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get <p>税额</p> 
     * @return TaxAmount <p>税额</p>
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set <p>税额</p>
     * @param TaxAmount <p>税额</p>
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get <p>含税金额</p> 
     * @return AmountWithTax <p>含税金额</p>
     */
    public String getAmountWithTax() {
        return this.AmountWithTax;
    }

    /**
     * Set <p>含税金额</p>
     * @param AmountWithTax <p>含税金额</p>
     */
    public void setAmountWithTax(String AmountWithTax) {
        this.AmountWithTax = AmountWithTax;
    }

    /**
     * Get <p>项目明细</p> 
     * @return Items <p>项目明细</p>
     */
    public VatInvoiceItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>项目明细</p>
     * @param Items <p>项目明细</p>
     */
    public void setItems(VatInvoiceItem [] Items) {
        this.Items = Items;
    }

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
     * Get <p>通行费标志:Y、是;N、否</p> 
     * @return TrafficFreeFlag <p>通行费标志:Y、是;N、否</p>
     */
    public String getTrafficFreeFlag() {
        return this.TrafficFreeFlag;
    }

    /**
     * Set <p>通行费标志:Y、是;N、否</p>
     * @param TrafficFreeFlag <p>通行费标志:Y、是;N、否</p>
     */
    public void setTrafficFreeFlag(String TrafficFreeFlag) {
        this.TrafficFreeFlag = TrafficFreeFlag;
    }

    /**
     * Get <p>是否为红票</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedLetterInvoiceMark <p>是否为红票</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRedLetterInvoiceMark() {
        return this.RedLetterInvoiceMark;
    }

    /**
     * Set <p>是否为红票</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedLetterInvoiceMark <p>是否为红票</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedLetterInvoiceMark(Boolean RedLetterInvoiceMark) {
        this.RedLetterInvoiceMark = RedLetterInvoiceMark;
    }

    /**
     * Get <p>开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuingTypeMark <p>开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIssuingTypeMark() {
        return this.IssuingTypeMark;
    }

    /**
     * Set <p>开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuingTypeMark <p>开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuingTypeMark(Long IssuingTypeMark) {
        this.IssuingTypeMark = IssuingTypeMark;
    }

    /**
     * Get <p>代开销售方名称</p> 
     * @return SellerAgentName <p>代开销售方名称</p>
     */
    public String getSellerAgentName() {
        return this.SellerAgentName;
    }

    /**
     * Set <p>代开销售方名称</p>
     * @param SellerAgentName <p>代开销售方名称</p>
     */
    public void setSellerAgentName(String SellerAgentName) {
        this.SellerAgentName = SellerAgentName;
    }

    /**
     * Get <p>代开销售方税号</p> 
     * @return SellerAgentTaxID <p>代开销售方税号</p>
     */
    public String getSellerAgentTaxID() {
        return this.SellerAgentTaxID;
    }

    /**
     * Set <p>代开销售方税号</p>
     * @param SellerAgentTaxID <p>代开销售方税号</p>
     */
    public void setSellerAgentTaxID(String SellerAgentTaxID) {
        this.SellerAgentTaxID = SellerAgentTaxID;
    }

    /**
     * Get <p>地区代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCode <p>地区代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set <p>地区代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCode <p>地区代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get <p>复核人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewerName <p>复核人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReviewerName() {
        return this.ReviewerName;
    }

    /**
     * Set <p>复核人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewerName <p>复核人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewerName(String ReviewerName) {
        this.ReviewerName = ReviewerName;
    }

    /**
     * Get <p>开票人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuerName <p>开票人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssuerName() {
        return this.IssuerName;
    }

    /**
     * Set <p>开票人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuerName <p>开票人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuerName(String IssuerName) {
        this.IssuerName = IssuerName;
    }

    /**
     * Get <p>收款人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayeeName <p>收款人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set <p>收款人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayeeName <p>收款人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get <p>开票机号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineCode <p>开票机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set <p>开票机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineCode <p>开票机号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get <p>税控码/密码区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxControlCode <p>税控码/密码区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxControlCode() {
        return this.TaxControlCode;
    }

    /**
     * Set <p>税控码/密码区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxControlCode <p>税控码/密码区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxControlCode(String TaxControlCode) {
        this.TaxControlCode = TaxControlCode;
    }

    /**
     * Get <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountWithTaxCN <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmountWithTaxCN() {
        return this.AmountWithTaxCN;
    }

    /**
     * Set <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountWithTaxCN <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountWithTaxCN(String AmountWithTaxCN) {
        this.AmountWithTaxCN = AmountWithTaxCN;
    }

    /**
     * Get <p>税率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxRate <p>税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set <p>税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxRate <p>税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get <p>特殊票种代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialTicketCode <p>特殊票种代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecialTicketCode() {
        return this.SpecialTicketCode;
    }

    /**
     * Set <p>特殊票种代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialTicketCode <p>特殊票种代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialTicketCode(String SpecialTicketCode) {
        this.SpecialTicketCode = SpecialTicketCode;
    }

    /**
     * Get <p>红字发票信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedLetterInvoices <p>红字发票信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RedLetterInvoiceItem [] getRedLetterInvoices() {
        return this.RedLetterInvoices;
    }

    /**
     * Set <p>红字发票信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedLetterInvoices <p>红字发票信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedLetterInvoices(RedLetterInvoiceItem [] RedLetterInvoices) {
        this.RedLetterInvoices = RedLetterInvoices;
    }

    /**
     * Get <p>全电类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullElectronicType <p>全电类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullElectronicType() {
        return this.FullElectronicType;
    }

    /**
     * Set <p>全电类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullElectronicType <p>全电类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullElectronicType(String FullElectronicType) {
        this.FullElectronicType = FullElectronicType;
    }

    /**
     * Get <p>OFD版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfdUrl <p>OFD版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfdUrl() {
        return this.OfdUrl;
    }

    /**
     * Set <p>OFD版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfdUrl <p>OFD版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfdUrl(String OfdUrl) {
        this.OfdUrl = OfdUrl;
    }

    /**
     * Get <p>PDF版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PdfUrl <p>PDF版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPdfUrl() {
        return this.PdfUrl;
    }

    /**
     * Set <p>PDF版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PdfUrl <p>PDF版式文件下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPdfUrl(String PdfUrl) {
        this.PdfUrl = PdfUrl;
    }

    /**
     * Get <p>原发票代码，对应蓝字发票代码。</p> 
     * @return OriginalCode <p>原发票代码，对应蓝字发票代码。</p>
     */
    public String getOriginalCode() {
        return this.OriginalCode;
    }

    /**
     * Set <p>原发票代码，对应蓝字发票代码。</p>
     * @param OriginalCode <p>原发票代码，对应蓝字发票代码。</p>
     */
    public void setOriginalCode(String OriginalCode) {
        this.OriginalCode = OriginalCode;
    }

    /**
     * Get <p>原发票号码，对应蓝字发票号码。</p> 
     * @return OriginalNumber <p>原发票号码，对应蓝字发票号码。</p>
     */
    public String getOriginalNumber() {
        return this.OriginalNumber;
    }

    /**
     * Set <p>原发票号码，对应蓝字发票号码。</p>
     * @param OriginalNumber <p>原发票号码，对应蓝字发票号码。</p>
     */
    public void setOriginalNumber(String OriginalNumber) {
        this.OriginalNumber = OriginalNumber;
    }

    public VatInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatInvoice(VatInvoice source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.BuyerName != null) {
            this.BuyerName = new String(source.BuyerName);
        }
        if (source.BuyerTaxCode != null) {
            this.BuyerTaxCode = new String(source.BuyerTaxCode);
        }
        if (source.BuyerAddressPhone != null) {
            this.BuyerAddressPhone = new String(source.BuyerAddressPhone);
        }
        if (source.BuyerBankAccount != null) {
            this.BuyerBankAccount = new String(source.BuyerBankAccount);
        }
        if (source.SellerName != null) {
            this.SellerName = new String(source.SellerName);
        }
        if (source.SellerTaxCode != null) {
            this.SellerTaxCode = new String(source.SellerTaxCode);
        }
        if (source.SellerAddressPhone != null) {
            this.SellerAddressPhone = new String(source.SellerAddressPhone);
        }
        if (source.SellerBankAccount != null) {
            this.SellerBankAccount = new String(source.SellerBankAccount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MachineNo != null) {
            this.MachineNo = new String(source.MachineNo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ElectronicType != null) {
            this.ElectronicType = new String(source.ElectronicType);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.IsAbandoned != null) {
            this.IsAbandoned = new String(source.IsAbandoned);
        }
        if (source.HasSellerList != null) {
            this.HasSellerList = new String(source.HasSellerList);
        }
        if (source.SellerListTitle != null) {
            this.SellerListTitle = new String(source.SellerListTitle);
        }
        if (source.SellerListTax != null) {
            this.SellerListTax = new String(source.SellerListTax);
        }
        if (source.AmountWithoutTax != null) {
            this.AmountWithoutTax = new String(source.AmountWithoutTax);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new String(source.TaxAmount);
        }
        if (source.AmountWithTax != null) {
            this.AmountWithTax = new String(source.AmountWithTax);
        }
        if (source.Items != null) {
            this.Items = new VatInvoiceItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new VatInvoiceItem(source.Items[i]);
            }
        }
        if (source.TaxBureau != null) {
            this.TaxBureau = new String(source.TaxBureau);
        }
        if (source.TrafficFreeFlag != null) {
            this.TrafficFreeFlag = new String(source.TrafficFreeFlag);
        }
        if (source.RedLetterInvoiceMark != null) {
            this.RedLetterInvoiceMark = new Boolean(source.RedLetterInvoiceMark);
        }
        if (source.IssuingTypeMark != null) {
            this.IssuingTypeMark = new Long(source.IssuingTypeMark);
        }
        if (source.SellerAgentName != null) {
            this.SellerAgentName = new String(source.SellerAgentName);
        }
        if (source.SellerAgentTaxID != null) {
            this.SellerAgentTaxID = new String(source.SellerAgentTaxID);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.ReviewerName != null) {
            this.ReviewerName = new String(source.ReviewerName);
        }
        if (source.IssuerName != null) {
            this.IssuerName = new String(source.IssuerName);
        }
        if (source.PayeeName != null) {
            this.PayeeName = new String(source.PayeeName);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.TaxControlCode != null) {
            this.TaxControlCode = new String(source.TaxControlCode);
        }
        if (source.AmountWithTaxCN != null) {
            this.AmountWithTaxCN = new String(source.AmountWithTaxCN);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.SpecialTicketCode != null) {
            this.SpecialTicketCode = new String(source.SpecialTicketCode);
        }
        if (source.RedLetterInvoices != null) {
            this.RedLetterInvoices = new RedLetterInvoiceItem[source.RedLetterInvoices.length];
            for (int i = 0; i < source.RedLetterInvoices.length; i++) {
                this.RedLetterInvoices[i] = new RedLetterInvoiceItem(source.RedLetterInvoices[i]);
            }
        }
        if (source.FullElectronicType != null) {
            this.FullElectronicType = new String(source.FullElectronicType);
        }
        if (source.OfdUrl != null) {
            this.OfdUrl = new String(source.OfdUrl);
        }
        if (source.PdfUrl != null) {
            this.PdfUrl = new String(source.PdfUrl);
        }
        if (source.OriginalCode != null) {
            this.OriginalCode = new String(source.OriginalCode);
        }
        if (source.OriginalNumber != null) {
            this.OriginalNumber = new String(source.OriginalNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "BuyerName", this.BuyerName);
        this.setParamSimple(map, prefix + "BuyerTaxCode", this.BuyerTaxCode);
        this.setParamSimple(map, prefix + "BuyerAddressPhone", this.BuyerAddressPhone);
        this.setParamSimple(map, prefix + "BuyerBankAccount", this.BuyerBankAccount);
        this.setParamSimple(map, prefix + "SellerName", this.SellerName);
        this.setParamSimple(map, prefix + "SellerTaxCode", this.SellerTaxCode);
        this.setParamSimple(map, prefix + "SellerAddressPhone", this.SellerAddressPhone);
        this.setParamSimple(map, prefix + "SellerBankAccount", this.SellerBankAccount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MachineNo", this.MachineNo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ElectronicType", this.ElectronicType);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "IsAbandoned", this.IsAbandoned);
        this.setParamSimple(map, prefix + "HasSellerList", this.HasSellerList);
        this.setParamSimple(map, prefix + "SellerListTitle", this.SellerListTitle);
        this.setParamSimple(map, prefix + "SellerListTax", this.SellerListTax);
        this.setParamSimple(map, prefix + "AmountWithoutTax", this.AmountWithoutTax);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "AmountWithTax", this.AmountWithTax);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TaxBureau", this.TaxBureau);
        this.setParamSimple(map, prefix + "TrafficFreeFlag", this.TrafficFreeFlag);
        this.setParamSimple(map, prefix + "RedLetterInvoiceMark", this.RedLetterInvoiceMark);
        this.setParamSimple(map, prefix + "IssuingTypeMark", this.IssuingTypeMark);
        this.setParamSimple(map, prefix + "SellerAgentName", this.SellerAgentName);
        this.setParamSimple(map, prefix + "SellerAgentTaxID", this.SellerAgentTaxID);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "ReviewerName", this.ReviewerName);
        this.setParamSimple(map, prefix + "IssuerName", this.IssuerName);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "TaxControlCode", this.TaxControlCode);
        this.setParamSimple(map, prefix + "AmountWithTaxCN", this.AmountWithTaxCN);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "SpecialTicketCode", this.SpecialTicketCode);
        this.setParamArrayObj(map, prefix + "RedLetterInvoices.", this.RedLetterInvoices);
        this.setParamSimple(map, prefix + "FullElectronicType", this.FullElectronicType);
        this.setParamSimple(map, prefix + "OfdUrl", this.OfdUrl);
        this.setParamSimple(map, prefix + "PdfUrl", this.PdfUrl);
        this.setParamSimple(map, prefix + "OriginalCode", this.OriginalCode);
        this.setParamSimple(map, prefix + "OriginalNumber", this.OriginalNumber);

    }
}

