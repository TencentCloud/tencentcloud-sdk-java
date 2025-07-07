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
    * 购方抬头
通用机打发票类型时不返回
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * 购方税号
通用机打发票类型时不返回
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * 购方地址电话
通用机打发票类型做不返回
    */
    @SerializedName("BuyerAddressPhone")
    @Expose
    private String BuyerAddressPhone;

    /**
    * 购方银行账号
通用机打发票类型时不返回
    */
    @SerializedName("BuyerBankAccount")
    @Expose
    private String BuyerBankAccount;

    /**
    * 销方名称
    */
    @SerializedName("SellerName")
    @Expose
    private String SellerName;

    /**
    * 销方税号
    */
    @SerializedName("SellerTaxCode")
    @Expose
    private String SellerTaxCode;

    /**
    * 销方地址电话
    */
    @SerializedName("SellerAddressPhone")
    @Expose
    private String SellerAddressPhone;

    /**
    * 销方银行账号
    */
    @SerializedName("SellerBankAccount")
    @Expose
    private String SellerBankAccount;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 机器编码
    */
    @SerializedName("MachineNo")
    @Expose
    private String MachineNo;

    /**
    * 票种类型
01：增值税专用发票，
02：货运运输业增值税专用发票，
03：机动车销售统一发票，
04：增值税普通发票，
08：增值税电子专用发票（含全电，全电仅新版接口支持），
10：增值税电子普通发票（含全电，全电仅新版接口支持），
11：增值税普通发票（卷式），
14：增值税电子（通行费）发票，
15：二手车销售统一发票，
32：深圳区块链发票，
102：通用机打电子发票
61：电子发票（航空运输电子客票行程单）
83：电子发票（铁路电子发票）
0915：全电纸质（二手车统一销售发票）
0903：全电纸质（机动车统一发票）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单
    */
    @SerializedName("ElectronicType")
    @Expose
    private String ElectronicType;

    /**
    * 检验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 是否作废（红冲）是否作废（红冲）
Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲
    */
    @SerializedName("IsAbandoned")
    @Expose
    private String IsAbandoned;

    /**
    * 是否有销货清单 
Y: 有清单 N：无清单 
卷票无
    */
    @SerializedName("HasSellerList")
    @Expose
    private String HasSellerList;

    /**
    * 销货清单标题
    */
    @SerializedName("SellerListTitle")
    @Expose
    private String SellerListTitle;

    /**
    * 销货清单税额
    */
    @SerializedName("SellerListTax")
    @Expose
    private String SellerListTax;

    /**
    * 不含税金额
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private String AmountWithoutTax;

    /**
    * 税额
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * 含税金额
    */
    @SerializedName("AmountWithTax")
    @Expose
    private String AmountWithTax;

    /**
    * 项目明细
    */
    @SerializedName("Items")
    @Expose
    private VatInvoiceItem [] Items;

    /**
    * 所属税局
    */
    @SerializedName("TaxBureau")
    @Expose
    private String TaxBureau;

    /**
    * 通行费标志:Y、是;N、否
    */
    @SerializedName("TrafficFreeFlag")
    @Expose
    private String TrafficFreeFlag;

    /**
    * 是否为红票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedLetterInvoiceMark")
    @Expose
    private Boolean RedLetterInvoiceMark;

    /**
    * 开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssuingTypeMark")
    @Expose
    private Long IssuingTypeMark;

    /**
    * 代开销售方名称
    */
    @SerializedName("SellerAgentName")
    @Expose
    private String SellerAgentName;

    /**
    * 代开销售方税号
    */
    @SerializedName("SellerAgentTaxID")
    @Expose
    private String SellerAgentTaxID;

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
     * Get 购方抬头
通用机打发票类型时不返回 
     * @return BuyerName 购方抬头
通用机打发票类型时不返回
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set 购方抬头
通用机打发票类型时不返回
     * @param BuyerName 购方抬头
通用机打发票类型时不返回
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get 购方税号
通用机打发票类型时不返回 
     * @return BuyerTaxCode 购方税号
通用机打发票类型时不返回
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set 购方税号
通用机打发票类型时不返回
     * @param BuyerTaxCode 购方税号
通用机打发票类型时不返回
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get 购方地址电话
通用机打发票类型做不返回 
     * @return BuyerAddressPhone 购方地址电话
通用机打发票类型做不返回
     */
    public String getBuyerAddressPhone() {
        return this.BuyerAddressPhone;
    }

    /**
     * Set 购方地址电话
通用机打发票类型做不返回
     * @param BuyerAddressPhone 购方地址电话
通用机打发票类型做不返回
     */
    public void setBuyerAddressPhone(String BuyerAddressPhone) {
        this.BuyerAddressPhone = BuyerAddressPhone;
    }

    /**
     * Get 购方银行账号
通用机打发票类型时不返回 
     * @return BuyerBankAccount 购方银行账号
通用机打发票类型时不返回
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set 购方银行账号
通用机打发票类型时不返回
     * @param BuyerBankAccount 购方银行账号
通用机打发票类型时不返回
     */
    public void setBuyerBankAccount(String BuyerBankAccount) {
        this.BuyerBankAccount = BuyerBankAccount;
    }

    /**
     * Get 销方名称 
     * @return SellerName 销方名称
     */
    public String getSellerName() {
        return this.SellerName;
    }

    /**
     * Set 销方名称
     * @param SellerName 销方名称
     */
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    /**
     * Get 销方税号 
     * @return SellerTaxCode 销方税号
     */
    public String getSellerTaxCode() {
        return this.SellerTaxCode;
    }

    /**
     * Set 销方税号
     * @param SellerTaxCode 销方税号
     */
    public void setSellerTaxCode(String SellerTaxCode) {
        this.SellerTaxCode = SellerTaxCode;
    }

    /**
     * Get 销方地址电话 
     * @return SellerAddressPhone 销方地址电话
     */
    public String getSellerAddressPhone() {
        return this.SellerAddressPhone;
    }

    /**
     * Set 销方地址电话
     * @param SellerAddressPhone 销方地址电话
     */
    public void setSellerAddressPhone(String SellerAddressPhone) {
        this.SellerAddressPhone = SellerAddressPhone;
    }

    /**
     * Get 销方银行账号 
     * @return SellerBankAccount 销方银行账号
     */
    public String getSellerBankAccount() {
        return this.SellerBankAccount;
    }

    /**
     * Set 销方银行账号
     * @param SellerBankAccount 销方银行账号
     */
    public void setSellerBankAccount(String SellerBankAccount) {
        this.SellerBankAccount = SellerBankAccount;
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
     * Get 机器编码 
     * @return MachineNo 机器编码
     */
    public String getMachineNo() {
        return this.MachineNo;
    }

    /**
     * Set 机器编码
     * @param MachineNo 机器编码
     */
    public void setMachineNo(String MachineNo) {
        this.MachineNo = MachineNo;
    }

    /**
     * Get 票种类型
01：增值税专用发票，
02：货运运输业增值税专用发票，
03：机动车销售统一发票，
04：增值税普通发票，
08：增值税电子专用发票（含全电，全电仅新版接口支持），
10：增值税电子普通发票（含全电，全电仅新版接口支持），
11：增值税普通发票（卷式），
14：增值税电子（通行费）发票，
15：二手车销售统一发票，
32：深圳区块链发票，
102：通用机打电子发票
61：电子发票（航空运输电子客票行程单）
83：电子发票（铁路电子发票）
0915：全电纸质（二手车统一销售发票）
0903：全电纸质（机动车统一发票） 
     * @return Type 票种类型
01：增值税专用发票，
02：货运运输业增值税专用发票，
03：机动车销售统一发票，
04：增值税普通发票，
08：增值税电子专用发票（含全电，全电仅新版接口支持），
10：增值税电子普通发票（含全电，全电仅新版接口支持），
11：增值税普通发票（卷式），
14：增值税电子（通行费）发票，
15：二手车销售统一发票，
32：深圳区块链发票，
102：通用机打电子发票
61：电子发票（航空运输电子客票行程单）
83：电子发票（铁路电子发票）
0915：全电纸质（二手车统一销售发票）
0903：全电纸质（机动车统一发票）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 票种类型
01：增值税专用发票，
02：货运运输业增值税专用发票，
03：机动车销售统一发票，
04：增值税普通发票，
08：增值税电子专用发票（含全电，全电仅新版接口支持），
10：增值税电子普通发票（含全电，全电仅新版接口支持），
11：增值税普通发票（卷式），
14：增值税电子（通行费）发票，
15：二手车销售统一发票，
32：深圳区块链发票，
102：通用机打电子发票
61：电子发票（航空运输电子客票行程单）
83：电子发票（铁路电子发票）
0915：全电纸质（二手车统一销售发票）
0903：全电纸质（机动车统一发票）
     * @param Type 票种类型
01：增值税专用发票，
02：货运运输业增值税专用发票，
03：机动车销售统一发票，
04：增值税普通发票，
08：增值税电子专用发票（含全电，全电仅新版接口支持），
10：增值税电子普通发票（含全电，全电仅新版接口支持），
11：增值税普通发票（卷式），
14：增值税电子（通行费）发票，
15：二手车销售统一发票，
32：深圳区块链发票，
102：通用机打电子发票
61：电子发票（航空运输电子客票行程单）
83：电子发票（铁路电子发票）
0915：全电纸质（二手车统一销售发票）
0903：全电纸质（机动车统一发票）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单 
     * @return ElectronicType 具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单
     */
    public String getElectronicType() {
        return this.ElectronicType;
    }

    /**
     * Set 具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单
     * @param ElectronicType 具体的全电发票类型：01: 全电专用发票；02：全电普通发票；03：全电火车票；04：全电机票行程单
     */
    public void setElectronicType(String ElectronicType) {
        this.ElectronicType = ElectronicType;
    }

    /**
     * Get 检验码 
     * @return CheckCode 检验码
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 检验码
     * @param CheckCode 检验码
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 是否作废（红冲）是否作废（红冲）
Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲 
     * @return IsAbandoned 是否作废（红冲）是否作废（红冲）
Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲
     */
    public String getIsAbandoned() {
        return this.IsAbandoned;
    }

    /**
     * Set 是否作废（红冲）是否作废（红冲）
Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲
     * @param IsAbandoned 是否作废（红冲）是否作废（红冲）
Y：已作废，N：未作废，H：红冲，HP：部分红冲，HF：全额红冲
     */
    public void setIsAbandoned(String IsAbandoned) {
        this.IsAbandoned = IsAbandoned;
    }

    /**
     * Get 是否有销货清单 
Y: 有清单 N：无清单 
卷票无 
     * @return HasSellerList 是否有销货清单 
Y: 有清单 N：无清单 
卷票无
     */
    public String getHasSellerList() {
        return this.HasSellerList;
    }

    /**
     * Set 是否有销货清单 
Y: 有清单 N：无清单 
卷票无
     * @param HasSellerList 是否有销货清单 
Y: 有清单 N：无清单 
卷票无
     */
    public void setHasSellerList(String HasSellerList) {
        this.HasSellerList = HasSellerList;
    }

    /**
     * Get 销货清单标题 
     * @return SellerListTitle 销货清单标题
     */
    public String getSellerListTitle() {
        return this.SellerListTitle;
    }

    /**
     * Set 销货清单标题
     * @param SellerListTitle 销货清单标题
     */
    public void setSellerListTitle(String SellerListTitle) {
        this.SellerListTitle = SellerListTitle;
    }

    /**
     * Get 销货清单税额 
     * @return SellerListTax 销货清单税额
     */
    public String getSellerListTax() {
        return this.SellerListTax;
    }

    /**
     * Set 销货清单税额
     * @param SellerListTax 销货清单税额
     */
    public void setSellerListTax(String SellerListTax) {
        this.SellerListTax = SellerListTax;
    }

    /**
     * Get 不含税金额 
     * @return AmountWithoutTax 不含税金额
     */
    public String getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set 不含税金额
     * @param AmountWithoutTax 不含税金额
     */
    public void setAmountWithoutTax(String AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get 税额 
     * @return TaxAmount 税额
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set 税额
     * @param TaxAmount 税额
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get 含税金额 
     * @return AmountWithTax 含税金额
     */
    public String getAmountWithTax() {
        return this.AmountWithTax;
    }

    /**
     * Set 含税金额
     * @param AmountWithTax 含税金额
     */
    public void setAmountWithTax(String AmountWithTax) {
        this.AmountWithTax = AmountWithTax;
    }

    /**
     * Get 项目明细 
     * @return Items 项目明细
     */
    public VatInvoiceItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 项目明细
     * @param Items 项目明细
     */
    public void setItems(VatInvoiceItem [] Items) {
        this.Items = Items;
    }

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
     * Get 通行费标志:Y、是;N、否 
     * @return TrafficFreeFlag 通行费标志:Y、是;N、否
     */
    public String getTrafficFreeFlag() {
        return this.TrafficFreeFlag;
    }

    /**
     * Set 通行费标志:Y、是;N、否
     * @param TrafficFreeFlag 通行费标志:Y、是;N、否
     */
    public void setTrafficFreeFlag(String TrafficFreeFlag) {
        this.TrafficFreeFlag = TrafficFreeFlag;
    }

    /**
     * Get 是否为红票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedLetterInvoiceMark 是否为红票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRedLetterInvoiceMark() {
        return this.RedLetterInvoiceMark;
    }

    /**
     * Set 是否为红票
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedLetterInvoiceMark 是否为红票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedLetterInvoiceMark(Boolean RedLetterInvoiceMark) {
        this.RedLetterInvoiceMark = RedLetterInvoiceMark;
    }

    /**
     * Get 开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssuingTypeMark 开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIssuingTypeMark() {
        return this.IssuingTypeMark;
    }

    /**
     * Set 开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssuingTypeMark 开具类型标识（0: 委托代开，1：自开，2：代开，3：代办退税
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssuingTypeMark(Long IssuingTypeMark) {
        this.IssuingTypeMark = IssuingTypeMark;
    }

    /**
     * Get 代开销售方名称 
     * @return SellerAgentName 代开销售方名称
     */
    public String getSellerAgentName() {
        return this.SellerAgentName;
    }

    /**
     * Set 代开销售方名称
     * @param SellerAgentName 代开销售方名称
     */
    public void setSellerAgentName(String SellerAgentName) {
        this.SellerAgentName = SellerAgentName;
    }

    /**
     * Get 代开销售方税号 
     * @return SellerAgentTaxID 代开销售方税号
     */
    public String getSellerAgentTaxID() {
        return this.SellerAgentTaxID;
    }

    /**
     * Set 代开销售方税号
     * @param SellerAgentTaxID 代开销售方税号
     */
    public void setSellerAgentTaxID(String SellerAgentTaxID) {
        this.SellerAgentTaxID = SellerAgentTaxID;
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

    }
}

