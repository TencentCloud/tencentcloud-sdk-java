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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElectronicTrainTicket extends AbstractModel {

    /**
    * 购方名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerName")
    @Expose
    private String BuyerName;

    /**
    * 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyerTaxCode")
    @Expose
    private String BuyerTaxCode;

    /**
    * 发票号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 开票日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 价税合计（中文大写）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCN")
    @Expose
    private String TotalCN;

    /**
    * 税额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 业务类型，0：退票，1:售票
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 出发时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * 车次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
    * 发票代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 席别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeatType")
    @Expose
    private String SeatType;

    /**
    * 乘车日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * 车厢
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainCabin")
    @Expose
    private String TrainCabin;

    /**
    * 出发站
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * 电子客票号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElectronicNumber")
    @Expose
    private String ElectronicNumber;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerName")
    @Expose
    private String PassengerName;

    /**
    * 证件号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PassengerNo")
    @Expose
    private String PassengerNo;

    /**
    * 金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 到达站
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * 税率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 席位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * 价税合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 校验码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    /**
     * Get 购方名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerName 购方名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerName() {
        return this.BuyerName;
    }

    /**
     * Set 购方名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerName 购方名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerName(String BuyerName) {
        this.BuyerName = BuyerName;
    }

    /**
     * Get 购方识别号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyerTaxCode 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuyerTaxCode() {
        return this.BuyerTaxCode;
    }

    /**
     * Set 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyerTaxCode 购方识别号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyerTaxCode(String BuyerTaxCode) {
        this.BuyerTaxCode = BuyerTaxCode;
    }

    /**
     * Get 发票号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Number 发票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 发票号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Number 发票号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 开票日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 开票日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 价税合计（中文大写）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCN 价税合计（中文大写）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCN() {
        return this.TotalCN;
    }

    /**
     * Set 价税合计（中文大写）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCN 价税合计（中文大写）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCN(String TotalCN) {
        this.TotalCN = TotalCN;
    }

    /**
     * Get 税额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tax 税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 税额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tax 税额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 业务类型，0：退票，1:售票
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 业务类型，0：退票，1:售票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务类型，0：退票，1:售票
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 业务类型，0：退票，1:售票
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 出发时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeGetOn 出发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set 出发时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeGetOn 出发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get 车次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainNumber 车次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainNumber() {
        return this.TrainNumber;
    }

    /**
     * Set 车次
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainNumber 车次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainNumber(String TrainNumber) {
        this.TrainNumber = TrainNumber;
    }

    /**
     * Get 发票代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 发票代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 发票代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 发票代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 席别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeatType 席别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeatType() {
        return this.SeatType;
    }

    /**
     * Set 席别
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeatType 席别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    /**
     * Get 乘车日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateGetOn 乘车日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDateGetOn() {
        return this.DateGetOn;
    }

    /**
     * Set 乘车日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateGetOn 乘车日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateGetOn(String DateGetOn) {
        this.DateGetOn = DateGetOn;
    }

    /**
     * Get 车厢
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainCabin 车厢
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainCabin() {
        return this.TrainCabin;
    }

    /**
     * Set 车厢
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainCabin 车厢
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainCabin(String TrainCabin) {
        this.TrainCabin = TrainCabin;
    }

    /**
     * Get 出发站
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOn 出发站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set 出发站
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOn 出发站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get 电子客票号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElectronicNumber 电子客票号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElectronicNumber() {
        return this.ElectronicNumber;
    }

    /**
     * Set 电子客票号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElectronicNumber 电子客票号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectronicNumber(String ElectronicNumber) {
        this.ElectronicNumber = ElectronicNumber;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerName 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerName() {
        return this.PassengerName;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerName 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerName(String PassengerName) {
        this.PassengerName = PassengerName;
    }

    /**
     * Get 证件号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PassengerNo 证件号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassengerNo() {
        return this.PassengerNo;
    }

    /**
     * Set 证件号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PassengerNo 证件号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassengerNo(String PassengerNo) {
        this.PassengerNo = PassengerNo;
    }

    /**
     * Get 金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 到达站
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOff 到达站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set 到达站
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOff 到达站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
    }

    /**
     * Get 税率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaxRate 税率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set 税率
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaxRate 税率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get 席位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seat 席位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set 席位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seat 席位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get 价税合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 价税合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 价税合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 价税合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 校验码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckCode 校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckCode 校验码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateCode 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateCode() {
        return this.StateCode;
    }

    /**
     * Set 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateCode 发票状态代码，0正常 1 未更新  2作废 3已红冲
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
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

    }
}

