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

public class ShippingInvoice extends AbstractModel{

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
    * 姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

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
    * 发票消费类型
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

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
    * 币种
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

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
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 时间 
     * @return Time 时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(String Time) {
        this.Time = Time;
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
     * Get 币种 
     * @return CurrencyCode 币种
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set 币种
     * @param CurrencyCode 币种
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    public ShippingInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShippingInvoice(ShippingInvoice source) {
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
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
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
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.CurrencyCode != null) {
            this.CurrencyCode = new String(source.CurrencyCode);
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
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);

    }
}

