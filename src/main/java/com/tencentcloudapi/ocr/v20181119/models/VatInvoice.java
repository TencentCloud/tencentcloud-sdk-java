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

public class VatInvoice extends AbstractModel{

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
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * 购方税号
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * 购方地址电话
    */
    @SerializedName("BuyerAddressPhone")
    @Expose
    private String BuyerAddressPhone;

    /**
    * 购方银行账号
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
    * 发票类型
01：专用发票 
02：货运发票
03：机动车发票 
04：普通发票 
10：电子发票 
11：卷式发票 
14：通行费发票 
15：二手车发票
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 检验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 是否作废（红冲）是否作废（红冲）
Y: 已作废 N：未作废 H：红冲
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
     * @return BuyerName 购方抬头
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set 购方抬头
     * @param BuyerName 购方抬头
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get 购方税号 
     * @return BuyerTaxCode 购方税号
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set 购方税号
     * @param BuyerTaxCode 购方税号
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get 购方地址电话 
     * @return BuyerAddressPhone 购方地址电话
     */
    public String getBuyerAddressPhone() {
        return this.BuyerAddressPhone;
    }

    /**
     * Set 购方地址电话
     * @param BuyerAddressPhone 购方地址电话
     */
    public void setBuyerAddressPhone(String BuyerAddressPhone) {
        this.BuyerAddressPhone = BuyerAddressPhone;
    }

    /**
     * Get 购方银行账号 
     * @return BuyerBankAccount 购方银行账号
     */
    public String getBuyerBankAccount() {
        return this.BuyerBankAccount;
    }

    /**
     * Set 购方银行账号
     * @param BuyerBankAccount 购方银行账号
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
     * Get 发票类型
01：专用发票 
02：货运发票
03：机动车发票 
04：普通发票 
10：电子发票 
11：卷式发票 
14：通行费发票 
15：二手车发票 
     * @return Type 发票类型
01：专用发票 
02：货运发票
03：机动车发票 
04：普通发票 
10：电子发票 
11：卷式发票 
14：通行费发票 
15：二手车发票
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 发票类型
01：专用发票 
02：货运发票
03：机动车发票 
04：普通发票 
10：电子发票 
11：卷式发票 
14：通行费发票 
15：二手车发票
     * @param Type 发票类型
01：专用发票 
02：货运发票
03：机动车发票 
04：普通发票 
10：电子发票 
11：卷式发票 
14：通行费发票 
15：二手车发票
     */
    public void setType(String Type) {
        this.Type = Type;
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
Y: 已作废 N：未作废 H：红冲 
     * @return IsAbandoned 是否作废（红冲）是否作废（红冲）
Y: 已作废 N：未作废 H：红冲
     */
    public String getIsAbandoned() {
        return this.IsAbandoned;
    }

    /**
     * Set 是否作废（红冲）是否作废（红冲）
Y: 已作废 N：未作废 H：红冲
     * @param IsAbandoned 是否作废（红冲）是否作废（红冲）
Y: 已作废 N：未作废 H：红冲
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
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "IsAbandoned", this.IsAbandoned);
        this.setParamSimple(map, prefix + "HasSellerList", this.HasSellerList);
        this.setParamSimple(map, prefix + "SellerListTitle", this.SellerListTitle);
        this.setParamSimple(map, prefix + "SellerListTax", this.SellerListTax);
        this.setParamSimple(map, prefix + "AmountWithoutTax", this.AmountWithoutTax);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "AmountWithTax", this.AmountWithTax);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

