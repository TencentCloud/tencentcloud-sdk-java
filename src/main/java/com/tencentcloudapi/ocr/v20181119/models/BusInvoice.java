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

public class BusInvoice extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 发票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 发票代码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 乘车时间
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * 乘车日期
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

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
    * 票价
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 身份证号
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

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
    * 乘车地点
    */
    @SerializedName("PlaceGetOn")
    @Expose
    private String PlaceGetOn;

    /**
    * 检票口
    */
    @SerializedName("GateNumber")
    @Expose
    private String GateNumber;

    /**
    * 客票类型
    */
    @SerializedName("TicketType")
    @Expose
    private String TicketType;

    /**
    * 车型
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * 座位号
    */
    @SerializedName("SeatNumber")
    @Expose
    private String SeatNumber;

    /**
    * 车次
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

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
     * Get 票价 
     * @return Total 票价
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 票价
     * @param Total 票价
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 姓名 
     * @return UserName 姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 姓名
     * @param UserName 姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 消费类型 
     * @return Kind 消费类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 消费类型
     * @param Kind 消费类型
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
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
     * Get 乘车地点 
     * @return PlaceGetOn 乘车地点
     */
    public String getPlaceGetOn() {
        return this.PlaceGetOn;
    }

    /**
     * Set 乘车地点
     * @param PlaceGetOn 乘车地点
     */
    public void setPlaceGetOn(String PlaceGetOn) {
        this.PlaceGetOn = PlaceGetOn;
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
     * Get 客票类型 
     * @return TicketType 客票类型
     */
    public String getTicketType() {
        return this.TicketType;
    }

    /**
     * Set 客票类型
     * @param TicketType 客票类型
     */
    public void setTicketType(String TicketType) {
        this.TicketType = TicketType;
    }

    /**
     * Get 车型 
     * @return VehicleType 车型
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set 车型
     * @param VehicleType 车型
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
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

    public BusInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusInvoice(BusInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.PlaceGetOn != null) {
            this.PlaceGetOn = new String(source.PlaceGetOn);
        }
        if (source.GateNumber != null) {
            this.GateNumber = new String(source.GateNumber);
        }
        if (source.TicketType != null) {
            this.TicketType = new String(source.TicketType);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.SeatNumber != null) {
            this.SeatNumber = new String(source.SeatNumber);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "PlaceGetOn", this.PlaceGetOn);
        this.setParamSimple(map, prefix + "GateNumber", this.GateNumber);
        this.setParamSimple(map, prefix + "TicketType", this.TicketType);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "SeatNumber", this.SeatNumber);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);

    }
}

