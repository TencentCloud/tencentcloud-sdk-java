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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryInvoiceResultData extends AbstractModel{

    /**
    * 订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 业务开票号
    */
    @SerializedName("OrderSn")
    @Expose
    private String OrderSn;

    /**
    * 发票状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 开票描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 开票日期
    */
    @SerializedName("TicketDate")
    @Expose
    private String TicketDate;

    /**
    * 发票号码
    */
    @SerializedName("TicketSn")
    @Expose
    private String TicketSn;

    /**
    * 发票代码
    */
    @SerializedName("TicketCode")
    @Expose
    private String TicketCode;

    /**
    * 检验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 含税金额(元)
    */
    @SerializedName("AmountWithTax")
    @Expose
    private String AmountWithTax;

    /**
    * 不含税金额(元)
    */
    @SerializedName("AmountWithoutTax")
    @Expose
    private String AmountWithoutTax;

    /**
    * 税额(元)
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * 是否被红冲
    */
    @SerializedName("IsRedWashed")
    @Expose
    private Long IsRedWashed;

    /**
    * pdf地址
    */
    @SerializedName("PdfUrl")
    @Expose
    private String PdfUrl;

    /**
     * Get 订单号 
     * @return OrderId 订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
     * @param OrderId 订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 业务开票号 
     * @return OrderSn 业务开票号
     */
    public String getOrderSn() {
        return this.OrderSn;
    }

    /**
     * Set 业务开票号
     * @param OrderSn 业务开票号
     */
    public void setOrderSn(String OrderSn) {
        this.OrderSn = OrderSn;
    }

    /**
     * Get 发票状态 
     * @return Status 发票状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 发票状态
     * @param Status 发票状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 开票描述 
     * @return Message 开票描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 开票描述
     * @param Message 开票描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 开票日期 
     * @return TicketDate 开票日期
     */
    public String getTicketDate() {
        return this.TicketDate;
    }

    /**
     * Set 开票日期
     * @param TicketDate 开票日期
     */
    public void setTicketDate(String TicketDate) {
        this.TicketDate = TicketDate;
    }

    /**
     * Get 发票号码 
     * @return TicketSn 发票号码
     */
    public String getTicketSn() {
        return this.TicketSn;
    }

    /**
     * Set 发票号码
     * @param TicketSn 发票号码
     */
    public void setTicketSn(String TicketSn) {
        this.TicketSn = TicketSn;
    }

    /**
     * Get 发票代码 
     * @return TicketCode 发票代码
     */
    public String getTicketCode() {
        return this.TicketCode;
    }

    /**
     * Set 发票代码
     * @param TicketCode 发票代码
     */
    public void setTicketCode(String TicketCode) {
        this.TicketCode = TicketCode;
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
     * Get 含税金额(元) 
     * @return AmountWithTax 含税金额(元)
     */
    public String getAmountWithTax() {
        return this.AmountWithTax;
    }

    /**
     * Set 含税金额(元)
     * @param AmountWithTax 含税金额(元)
     */
    public void setAmountWithTax(String AmountWithTax) {
        this.AmountWithTax = AmountWithTax;
    }

    /**
     * Get 不含税金额(元) 
     * @return AmountWithoutTax 不含税金额(元)
     */
    public String getAmountWithoutTax() {
        return this.AmountWithoutTax;
    }

    /**
     * Set 不含税金额(元)
     * @param AmountWithoutTax 不含税金额(元)
     */
    public void setAmountWithoutTax(String AmountWithoutTax) {
        this.AmountWithoutTax = AmountWithoutTax;
    }

    /**
     * Get 税额(元) 
     * @return TaxAmount 税额(元)
     */
    public String getTaxAmount() {
        return this.TaxAmount;
    }

    /**
     * Set 税额(元)
     * @param TaxAmount 税额(元)
     */
    public void setTaxAmount(String TaxAmount) {
        this.TaxAmount = TaxAmount;
    }

    /**
     * Get 是否被红冲 
     * @return IsRedWashed 是否被红冲
     */
    public Long getIsRedWashed() {
        return this.IsRedWashed;
    }

    /**
     * Set 是否被红冲
     * @param IsRedWashed 是否被红冲
     */
    public void setIsRedWashed(Long IsRedWashed) {
        this.IsRedWashed = IsRedWashed;
    }

    /**
     * Get pdf地址 
     * @return PdfUrl pdf地址
     */
    public String getPdfUrl() {
        return this.PdfUrl;
    }

    /**
     * Set pdf地址
     * @param PdfUrl pdf地址
     */
    public void setPdfUrl(String PdfUrl) {
        this.PdfUrl = PdfUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "OrderSn", this.OrderSn);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "TicketDate", this.TicketDate);
        this.setParamSimple(map, prefix + "TicketSn", this.TicketSn);
        this.setParamSimple(map, prefix + "TicketCode", this.TicketCode);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "AmountWithTax", this.AmountWithTax);
        this.setParamSimple(map, prefix + "AmountWithoutTax", this.AmountWithoutTax);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "IsRedWashed", this.IsRedWashed);
        this.setParamSimple(map, prefix + "PdfUrl", this.PdfUrl);

    }
}

