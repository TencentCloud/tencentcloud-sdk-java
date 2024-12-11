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

public class ElectronicTrainTicketFull extends AbstractModel {

    /**
    * 电子发票类型
    */
    @SerializedName("TypeOfVoucher")
    @Expose
    private String TypeOfVoucher;

    /**
    * 电子客票号
    */
    @SerializedName("ElectronicTicketNum")
    @Expose
    private String ElectronicTicketNum;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 始发站
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * 到达站
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * 火车号
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
    * 乘车日期
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * 始发时间
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * 座位类型
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * 座位号
    */
    @SerializedName("SeatNumber")
    @Expose
    private String SeatNumber;

    /**
    * 票价
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 身份证号
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 乘车人姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 金额
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 购买方名称
    */
    @SerializedName("Buyer")
    @Expose
    private String Buyer;

    /**
    * 统一社会信用代码
    */
    @SerializedName("BuyerTaxID")
    @Expose
    private String BuyerTaxID;

    /**
    * 原发票号码
    */
    @SerializedName("OriginalNumber")
    @Expose
    private String OriginalNumber;

    /**
    * 标识信息
    */
    @SerializedName("IDInfo")
    @Expose
    private String IDInfo;

    /**
     * Get 电子发票类型 
     * @return TypeOfVoucher 电子发票类型
     */
    public String getTypeOfVoucher() {
        return this.TypeOfVoucher;
    }

    /**
     * Set 电子发票类型
     * @param TypeOfVoucher 电子发票类型
     */
    public void setTypeOfVoucher(String TypeOfVoucher) {
        this.TypeOfVoucher = TypeOfVoucher;
    }

    /**
     * Get 电子客票号 
     * @return ElectronicTicketNum 电子客票号
     */
    public String getElectronicTicketNum() {
        return this.ElectronicTicketNum;
    }

    /**
     * Set 电子客票号
     * @param ElectronicTicketNum 电子客票号
     */
    public void setElectronicTicketNum(String ElectronicTicketNum) {
        this.ElectronicTicketNum = ElectronicTicketNum;
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
     * Get 始发站 
     * @return StationGetOn 始发站
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set 始发站
     * @param StationGetOn 始发站
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get 到达站 
     * @return StationGetOff 到达站
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set 到达站
     * @param StationGetOff 到达站
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
    }

    /**
     * Get 火车号 
     * @return TrainNumber 火车号
     */
    public String getTrainNumber() {
        return this.TrainNumber;
    }

    /**
     * Set 火车号
     * @param TrainNumber 火车号
     */
    public void setTrainNumber(String TrainNumber) {
        this.TrainNumber = TrainNumber;
    }

    /**
     * Get 乘车日期 
     * @return DateGetOn 乘车日期
     */
    public String getDateGetOn() {
        return this.DateGetOn;
    }

    /**
     * Set 乘车日期
     * @param DateGetOn 乘车日期
     */
    public void setDateGetOn(String DateGetOn) {
        this.DateGetOn = DateGetOn;
    }

    /**
     * Get 始发时间 
     * @return TimeGetOn 始发时间
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set 始发时间
     * @param TimeGetOn 始发时间
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get 座位类型 
     * @return Seat 座位类型
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set 座位类型
     * @param Seat 座位类型
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get 座位号 
     * @return SeatNumber 座位号
     */
    public String getSeatNumber() {
        return this.SeatNumber;
    }

    /**
     * Set 座位号
     * @param SeatNumber 座位号
     */
    public void setSeatNumber(String SeatNumber) {
        this.SeatNumber = SeatNumber;
    }

    /**
     * Get 票价 
     * @return Fare 票价
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * Set 票价
     * @param Fare 票价
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
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
     * Get 身份证号 
     * @return UserID 身份证号
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set 身份证号
     * @param UserID 身份证号
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get 乘车人姓名 
     * @return UserName 乘车人姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 乘车人姓名
     * @param UserName 乘车人姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 金额 
     * @return Total 金额
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 金额
     * @param Total 金额
     */
    public void setTotal(String Total) {
        this.Total = Total;
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
     * Get 税额 
     * @return Tax 税额
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 税额
     * @param Tax 税额
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
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
     * Get 统一社会信用代码 
     * @return BuyerTaxID 统一社会信用代码
     */
    public String getBuyerTaxID() {
        return this.BuyerTaxID;
    }

    /**
     * Set 统一社会信用代码
     * @param BuyerTaxID 统一社会信用代码
     */
    public void setBuyerTaxID(String BuyerTaxID) {
        this.BuyerTaxID = BuyerTaxID;
    }

    /**
     * Get 原发票号码 
     * @return OriginalNumber 原发票号码
     */
    public String getOriginalNumber() {
        return this.OriginalNumber;
    }

    /**
     * Set 原发票号码
     * @param OriginalNumber 原发票号码
     */
    public void setOriginalNumber(String OriginalNumber) {
        this.OriginalNumber = OriginalNumber;
    }

    /**
     * Get 标识信息 
     * @return IDInfo 标识信息
     */
    public String getIDInfo() {
        return this.IDInfo;
    }

    /**
     * Set 标识信息
     * @param IDInfo 标识信息
     */
    public void setIDInfo(String IDInfo) {
        this.IDInfo = IDInfo;
    }

    public ElectronicTrainTicketFull() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicTrainTicketFull(ElectronicTrainTicketFull source) {
        if (source.TypeOfVoucher != null) {
            this.TypeOfVoucher = new String(source.TypeOfVoucher);
        }
        if (source.ElectronicTicketNum != null) {
            this.ElectronicTicketNum = new String(source.ElectronicTicketNum);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.SeatNumber != null) {
            this.SeatNumber = new String(source.SeatNumber);
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.Buyer != null) {
            this.Buyer = new String(source.Buyer);
        }
        if (source.BuyerTaxID != null) {
            this.BuyerTaxID = new String(source.BuyerTaxID);
        }
        if (source.OriginalNumber != null) {
            this.OriginalNumber = new String(source.OriginalNumber);
        }
        if (source.IDInfo != null) {
            this.IDInfo = new String(source.IDInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeOfVoucher", this.TypeOfVoucher);
        this.setParamSimple(map, prefix + "ElectronicTicketNum", this.ElectronicTicketNum);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "SeatNumber", this.SeatNumber);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "Buyer", this.Buyer);
        this.setParamSimple(map, prefix + "BuyerTaxID", this.BuyerTaxID);
        this.setParamSimple(map, prefix + "OriginalNumber", this.OriginalNumber);
        this.setParamSimple(map, prefix + "IDInfo", this.IDInfo);

    }
}

