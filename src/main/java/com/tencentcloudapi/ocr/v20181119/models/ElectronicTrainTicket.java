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

public class ElectronicTrainTicket extends AbstractModel {

    /**
    * <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCN")
    @Expose
    private String TotalCN;

    /**
    * <p>税额</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * <p>业务类型，0：退票，1:售票</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>出发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * <p>车次</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
    * <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>席别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeatType")
    @Expose
    private String SeatType;

    /**
    * <p>乘车日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * <p>车厢</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainCabin")
    @Expose
    private String TrainCabin;

    /**
    * <p>出发站</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * <p>电子客票号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicNumber")
    @Expose
    private String ElectronicNumber;

    /**
    * <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerName")
    @Expose
    private String PassengerName;

    /**
    * <p>证件号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerNo")
    @Expose
    private String PassengerNo;

    /**
    * <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * <p>到达站</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * <p>税率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * <p>席位</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    /**
    * <p>发票类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>空调特征</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AirConditionerFeature")
    @Expose
    private String AirConditionerFeature;

    /**
    * <p>票种，不替代 VatInvoice.Type。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TicketType")
    @Expose
    private String TicketType;

    /**
    * <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalTaxRate")
    @Expose
    private String OriginalTaxRate;

    /**
    * <p>全电发票号码，映射源字段 qdfphm。</p>
    */
    @SerializedName("FullElectronicNumber")
    @Expose
    private String FullElectronicNumber;

    /**
     * Get <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerName <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerName <p>购方名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerTaxCode <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerTaxCode <p>购方识别号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number <p>发票号码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date <p>开票日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCN <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCN() {
        return this.TotalCN;
    }

    /**
     * Set <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCN <p>价税合计（中文大写）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCN(String TotalCN) {
        this.TotalCN = TotalCN;
    }

    /**
     * Get <p>税额</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tax <p>税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set <p>税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tax <p>税额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get <p>业务类型，0：退票，1:售票</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType <p>业务类型，0：退票，1:售票</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>业务类型，0：退票，1:售票</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType <p>业务类型，0：退票，1:售票</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>出发时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeGetOn <p>出发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set <p>出发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeGetOn <p>出发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get <p>车次</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainNumber <p>车次</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainNumber() {
        return this.TrainNumber;
    }

    /**
     * Set <p>车次</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainNumber <p>车次</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainNumber(String TrainNumber) {
        this.TrainNumber = TrainNumber;
    }

    /**
     * Get <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code <p>发票代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>席别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeatType <p>席别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeatType() {
        return this.SeatType;
    }

    /**
     * Set <p>席别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeatType <p>席别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    /**
     * Get <p>乘车日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateGetOn <p>乘车日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDateGetOn() {
        return this.DateGetOn;
    }

    /**
     * Set <p>乘车日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateGetOn <p>乘车日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateGetOn(String DateGetOn) {
        this.DateGetOn = DateGetOn;
    }

    /**
     * Get <p>车厢</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainCabin <p>车厢</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainCabin() {
        return this.TrainCabin;
    }

    /**
     * Set <p>车厢</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainCabin <p>车厢</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainCabin(String TrainCabin) {
        this.TrainCabin = TrainCabin;
    }

    /**
     * Get <p>出发站</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOn <p>出发站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set <p>出发站</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOn <p>出发站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get <p>电子客票号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicNumber <p>电子客票号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElectronicNumber() {
        return this.ElectronicNumber;
    }

    /**
     * Set <p>电子客票号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicNumber <p>电子客票号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicNumber(String ElectronicNumber) {
        this.ElectronicNumber = ElectronicNumber;
    }

    /**
     * Get <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerName <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerName() {
        return this.PassengerName;
    }

    /**
     * Set <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerName <p>姓名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    /**
     * Get <p>证件号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerNo <p>证件号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerNo() {
        return this.PassengerNo;
    }

    /**
     * Set <p>证件号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerNo <p>证件号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerNo(String PassengerNo) {
        this.PassengerNo = PassengerNo;
    }

    /**
     * Get <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount <p>金额</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>到达站</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOff <p>到达站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set <p>到达站</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOff <p>到达站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
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
     * Get <p>席位</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seat <p>席位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set <p>席位</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seat <p>席位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total <p>价税合计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckCode <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckCode <p>校验码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateCode <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateCode() {
        return this.StateCode;
    }

    /**
     * Set <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateCode <p>发票状态代码，0正常 1 未更新  2作废 3已红冲</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    /**
     * Get <p>发票类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>发票类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>发票类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>发票类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>空调特征</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AirConditionerFeature <p>空调特征</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAirConditionerFeature() {
        return this.AirConditionerFeature;
    }

    /**
     * Set <p>空调特征</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AirConditionerFeature <p>空调特征</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAirConditionerFeature(String AirConditionerFeature) {
        this.AirConditionerFeature = AirConditionerFeature;
    }

    /**
     * Get <p>票种，不替代 VatInvoice.Type。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TicketType <p>票种，不替代 VatInvoice.Type。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTicketType() {
        return this.TicketType;
    }

    /**
     * Set <p>票种，不替代 VatInvoice.Type。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TicketType <p>票种，不替代 VatInvoice.Type。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTicketType(String TicketType) {
        this.TicketType = TicketType;
    }

    /**
     * Get <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalTaxRate <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalTaxRate() {
        return this.OriginalTaxRate;
    }

    /**
     * Set <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalTaxRate <p>原始税率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalTaxRate(String OriginalTaxRate) {
        this.OriginalTaxRate = OriginalTaxRate;
    }

    /**
     * Get <p>全电发票号码，映射源字段 qdfphm。</p> 
     * @return FullElectronicNumber <p>全电发票号码，映射源字段 qdfphm。</p>
     */
    public String getFullElectronicNumber() {
        return this.FullElectronicNumber;
    }

    /**
     * Set <p>全电发票号码，映射源字段 qdfphm。</p>
     * @param FullElectronicNumber <p>全电发票号码，映射源字段 qdfphm。</p>
     */
    public void setFullElectronicNumber(String FullElectronicNumber) {
        this.FullElectronicNumber = FullElectronicNumber;
    }

    public ElectronicTrainTicket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicTrainTicket(ElectronicTrainTicket source) {
        if (source.BuyerName != null) {
            this.BuyerName = new String(source.BuyerName);
        }
        if (source.BuyerTaxCode != null) {
            this.BuyerTaxCode = new String(source.BuyerTaxCode);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.TotalCN != null) {
            this.TotalCN = new String(source.TotalCN);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.SeatType != null) {
            this.SeatType = new String(source.SeatType);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.TrainCabin != null) {
            this.TrainCabin = new String(source.TrainCabin);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.ElectronicNumber != null) {
            this.ElectronicNumber = new String(source.ElectronicNumber);
        }
        if (source.PassengerName != null) {
            this.PassengerName = new String(source.PassengerName);
        }
        if (source.PassengerNo != null) {
            this.PassengerNo = new String(source.PassengerNo);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.StateCode != null) {
            this.StateCode = new String(source.StateCode);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AirConditionerFeature != null) {
            this.AirConditionerFeature = new String(source.AirConditionerFeature);
        }
        if (source.TicketType != null) {
            this.TicketType = new String(source.TicketType);
        }
        if (source.OriginalTaxRate != null) {
            this.OriginalTaxRate = new String(source.OriginalTaxRate);
        }
        if (source.FullElectronicNumber != null) {
            this.FullElectronicNumber = new String(source.FullElectronicNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuyerName", this.BuyerName);
        this.setParamSimple(map, prefix + "BuyerTaxCode", this.BuyerTaxCode);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TotalCN", this.TotalCN);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "SeatType", this.SeatType);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "TrainCabin", this.TrainCabin);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "ElectronicNumber", this.ElectronicNumber);
        this.setParamSimple(map, prefix + "PassengerName", this.PassengerName);
        this.setParamSimple(map, prefix + "PassengerNo", this.PassengerNo);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "StateCode", this.StateCode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AirConditionerFeature", this.AirConditionerFeature);
        this.setParamSimple(map, prefix + "TicketType", this.TicketType);
        this.setParamSimple(map, prefix + "OriginalTaxRate", this.OriginalTaxRate);
        this.setParamSimple(map, prefix + "FullElectronicNumber", this.FullElectronicNumber);

    }
}

