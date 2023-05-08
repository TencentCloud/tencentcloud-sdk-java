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

public class TaxiTicket extends AbstractModel{

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
    * 上车时间
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * 下车时间
    */
    @SerializedName("TimeGetOff")
    @Expose
    private String TimeGetOff;

    /**
    * 单价
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * 里程
    */
    @SerializedName("Mileage")
    @Expose
    private String Mileage;

    /**
    * 总金额
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 发票所在地
    */
    @SerializedName("Place")
    @Expose
    private String Place;

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
    * 发票消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 车牌号
    */
    @SerializedName("LicensePlate")
    @Expose
    private String LicensePlate;

    /**
    * 燃油附加费
    */
    @SerializedName("FuelFee")
    @Expose
    private String FuelFee;

    /**
    * 预约叫车服务费
    */
    @SerializedName("BookingCallFee")
    @Expose
    private String BookingCallFee;

    /**
    * 是否有公司印章（0：没有，1：有）
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

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
     * Get 上车时间 
     * @return TimeGetOn 上车时间
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set 上车时间
     * @param TimeGetOn 上车时间
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get 下车时间 
     * @return TimeGetOff 下车时间
     */
    public String getTimeGetOff() {
        return this.TimeGetOff;
    }

    /**
     * Set 下车时间
     * @param TimeGetOff 下车时间
     */
    public void setTimeGetOff(String TimeGetOff) {
        this.TimeGetOff = TimeGetOff;
    }

    /**
     * Get 单价 
     * @return Price 单价
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set 单价
     * @param Price 单价
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get 里程 
     * @return Mileage 里程
     */
    public String getMileage() {
        return this.Mileage;
    }

    /**
     * Set 里程
     * @param Mileage 里程
     */
    public void setMileage(String Mileage) {
        this.Mileage = Mileage;
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
     * Get 发票所在地 
     * @return Place 发票所在地
     */
    public String getPlace() {
        return this.Place;
    }

    /**
     * Set 发票所在地
     * @param Place 发票所在地
     */
    public void setPlace(String Place) {
        this.Place = Place;
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
     * Get 车牌号 
     * @return LicensePlate 车牌号
     */
    public String getLicensePlate() {
        return this.LicensePlate;
    }

    /**
     * Set 车牌号
     * @param LicensePlate 车牌号
     */
    public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    /**
     * Get 燃油附加费 
     * @return FuelFee 燃油附加费
     */
    public String getFuelFee() {
        return this.FuelFee;
    }

    /**
     * Set 燃油附加费
     * @param FuelFee 燃油附加费
     */
    public void setFuelFee(String FuelFee) {
        this.FuelFee = FuelFee;
    }

    /**
     * Get 预约叫车服务费 
     * @return BookingCallFee 预约叫车服务费
     */
    public String getBookingCallFee() {
        return this.BookingCallFee;
    }

    /**
     * Set 预约叫车服务费
     * @param BookingCallFee 预约叫车服务费
     */
    public void setBookingCallFee(String BookingCallFee) {
        this.BookingCallFee = BookingCallFee;
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

    public TaxiTicket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaxiTicket(TaxiTicket source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.TimeGetOff != null) {
            this.TimeGetOff = new String(source.TimeGetOff);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Mileage != null) {
            this.Mileage = new String(source.Mileage);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Place != null) {
            this.Place = new String(source.Place);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.LicensePlate != null) {
            this.LicensePlate = new String(source.LicensePlate);
        }
        if (source.FuelFee != null) {
            this.FuelFee = new String(source.FuelFee);
        }
        if (source.BookingCallFee != null) {
            this.BookingCallFee = new String(source.BookingCallFee);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "TimeGetOff", this.TimeGetOff);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Mileage", this.Mileage);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Place", this.Place);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "LicensePlate", this.LicensePlate);
        this.setParamSimple(map, prefix + "FuelFee", this.FuelFee);
        this.setParamSimple(map, prefix + "BookingCallFee", this.BookingCallFee);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);

    }
}

