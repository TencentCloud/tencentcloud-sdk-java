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

public class TrainTicket extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 乘车日期
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * 乘车时间
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * 乘车人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 出发车站
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * 到达车站
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * 座位类型
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * 总金额
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 发票消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 序列号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 身份证号
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 检票口
    */
    @SerializedName("GateNumber")
    @Expose
    private String GateNumber;

    /**
    * 车次
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
    * 手续费
    */
    @SerializedName("HandlingFee")
    @Expose
    private String HandlingFee;

    /**
    * 原票价
    */
    @SerializedName("OriginalFare")
    @Expose
    private String OriginalFare;

    /**
    * 大写金额
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * 座位号
    */
    @SerializedName("SeatNumber")
    @Expose
    private String SeatNumber;

    /**
    * 取票地址
    */
    @SerializedName("PickUpAddress")
    @Expose
    private String PickUpAddress;

    /**
    * 是否始发改签
    */
    @SerializedName("TicketChange")
    @Expose
    private String TicketChange;

    /**
    * 加收票价
    */
    @SerializedName("AdditionalFare")
    @Expose
    private String AdditionalFare;

    /**
    * 收据号码
    */
    @SerializedName("ReceiptNumber")
    @Expose
    private String ReceiptNumber;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 是否仅供报销使用（0：没有，1：有）
    */
    @SerializedName("ReimburseOnlyMark")
    @Expose
    private Long ReimburseOnlyMark;

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
     * Get 乘车时间 
     * @return TimeGetOn 乘车时间
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set 乘车时间
     * @param TimeGetOn 乘车时间
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get 乘车人姓名 
     * @return Name 乘车人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 乘车人姓名
     * @param Name 乘车人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 出发车站 
     * @return StationGetOn 出发车站
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set 出发车站
     * @param StationGetOn 出发车站
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get 到达车站 
     * @return StationGetOff 到达车站
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set 到达车站
     * @param StationGetOff 到达车站
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
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
     * Get 总金额 
     * @return Total 总金额
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 总金额
     * @param Total 总金额
     */
    public void setTotal(String Total) {
        this.Total = Total;
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
     * Get 序列号 
     * @return SerialNumber 序列号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 序列号
     * @param SerialNumber 序列号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
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
     * Get 检票口 
     * @return GateNumber 检票口
     */
    public String getGateNumber() {
        return this.GateNumber;
    }

    /**
     * Set 检票口
     * @param GateNumber 检票口
     */
    public void setGateNumber(String GateNumber) {
        this.GateNumber = GateNumber;
    }

    /**
     * Get 车次 
     * @return TrainNumber 车次
     */
    public String getTrainNumber() {
        return this.TrainNumber;
    }

    /**
     * Set 车次
     * @param TrainNumber 车次
     */
    public void setTrainNumber(String TrainNumber) {
        this.TrainNumber = TrainNumber;
    }

    /**
     * Get 手续费 
     * @return HandlingFee 手续费
     */
    public String getHandlingFee() {
        return this.HandlingFee;
    }

    /**
     * Set 手续费
     * @param HandlingFee 手续费
     */
    public void setHandlingFee(String HandlingFee) {
        this.HandlingFee = HandlingFee;
    }

    /**
     * Get 原票价 
     * @return OriginalFare 原票价
     */
    public String getOriginalFare() {
        return this.OriginalFare;
    }

    /**
     * Set 原票价
     * @param OriginalFare 原票价
     */
    public void setOriginalFare(String OriginalFare) {
        this.OriginalFare = OriginalFare;
    }

    /**
     * Get 大写金额 
     * @return TotalCn 大写金额
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set 大写金额
     * @param TotalCn 大写金额
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
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
     * Get 取票地址 
     * @return PickUpAddress 取票地址
     */
    public String getPickUpAddress() {
        return this.PickUpAddress;
    }

    /**
     * Set 取票地址
     * @param PickUpAddress 取票地址
     */
    public void setPickUpAddress(String PickUpAddress) {
        this.PickUpAddress = PickUpAddress;
    }

    /**
     * Get 是否始发改签 
     * @return TicketChange 是否始发改签
     */
    public String getTicketChange() {
        return this.TicketChange;
    }

    /**
     * Set 是否始发改签
     * @param TicketChange 是否始发改签
     */
    public void setTicketChange(String TicketChange) {
        this.TicketChange = TicketChange;
    }

    /**
     * Get 加收票价 
     * @return AdditionalFare 加收票价
     */
    public String getAdditionalFare() {
        return this.AdditionalFare;
    }

    /**
     * Set 加收票价
     * @param AdditionalFare 加收票价
     */
    public void setAdditionalFare(String AdditionalFare) {
        this.AdditionalFare = AdditionalFare;
    }

    /**
     * Get 收据号码 
     * @return ReceiptNumber 收据号码
     */
    public String getReceiptNumber() {
        return this.ReceiptNumber;
    }

    /**
     * Set 收据号码
     * @param ReceiptNumber 收据号码
     */
    public void setReceiptNumber(String ReceiptNumber) {
        this.ReceiptNumber = ReceiptNumber;
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

    /**
     * Get 是否仅供报销使用（0：没有，1：有） 
     * @return ReimburseOnlyMark 是否仅供报销使用（0：没有，1：有）
     */
    public Long getReimburseOnlyMark() {
        return this.ReimburseOnlyMark;
    }

    /**
     * Set 是否仅供报销使用（0：没有，1：有）
     * @param ReimburseOnlyMark 是否仅供报销使用（0：没有，1：有）
     */
    public void setReimburseOnlyMark(Long ReimburseOnlyMark) {
        this.ReimburseOnlyMark = ReimburseOnlyMark;
    }

    public TrainTicket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainTicket(TrainTicket source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.GateNumber != null) {
            this.GateNumber = new String(source.GateNumber);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
        if (source.HandlingFee != null) {
            this.HandlingFee = new String(source.HandlingFee);
        }
        if (source.OriginalFare != null) {
            this.OriginalFare = new String(source.OriginalFare);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.SeatNumber != null) {
            this.SeatNumber = new String(source.SeatNumber);
        }
        if (source.PickUpAddress != null) {
            this.PickUpAddress = new String(source.PickUpAddress);
        }
        if (source.TicketChange != null) {
            this.TicketChange = new String(source.TicketChange);
        }
        if (source.AdditionalFare != null) {
            this.AdditionalFare = new String(source.AdditionalFare);
        }
        if (source.ReceiptNumber != null) {
            this.ReceiptNumber = new String(source.ReceiptNumber);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.ReimburseOnlyMark != null) {
            this.ReimburseOnlyMark = new Long(source.ReimburseOnlyMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "GateNumber", this.GateNumber);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);
        this.setParamSimple(map, prefix + "HandlingFee", this.HandlingFee);
        this.setParamSimple(map, prefix + "OriginalFare", this.OriginalFare);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "SeatNumber", this.SeatNumber);
        this.setParamSimple(map, prefix + "PickUpAddress", this.PickUpAddress);
        this.setParamSimple(map, prefix + "TicketChange", this.TicketChange);
        this.setParamSimple(map, prefix + "AdditionalFare", this.AdditionalFare);
        this.setParamSimple(map, prefix + "ReceiptNumber", this.ReceiptNumber);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "ReimburseOnlyMark", this.ReimburseOnlyMark);

    }
}

