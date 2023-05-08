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

public class AirTransport extends AbstractModel{

    /**
    * 发票名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 电子客票号码
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 校验码
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 印刷序号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 开票日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 销售单位代号
    */
    @SerializedName("AgentCode")
    @Expose
    private String AgentCode;

    /**
    * 销售单位代号第一行
    */
    @SerializedName("AgentCodeFirst")
    @Expose
    private String AgentCodeFirst;

    /**
    * 销售单位代号第二行
    */
    @SerializedName("AgentCodeSecond")
    @Expose
    private String AgentCodeSecond;

    /**
    * 姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 身份证号
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 填开单位
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 票价
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * 合计税额
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 燃油附加费
    */
    @SerializedName("FuelSurcharge")
    @Expose
    private String FuelSurcharge;

    /**
    * 民航发展基金
    */
    @SerializedName("AirDevelopmentFund")
    @Expose
    private String AirDevelopmentFund;

    /**
    * 保险费
    */
    @SerializedName("Insurance")
    @Expose
    private String Insurance;

    /**
    * 合计金额（小写）
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
    * 国内国际标签
    */
    @SerializedName("DomesticInternationalTag")
    @Expose
    private String DomesticInternationalTag;

    /**
    * 客票生效日期
    */
    @SerializedName("DateStart")
    @Expose
    private String DateStart;

    /**
    * 有效截至日期
    */
    @SerializedName("DateEnd")
    @Expose
    private String DateEnd;

    /**
    * 签注
    */
    @SerializedName("Endorsement")
    @Expose
    private String Endorsement;

    /**
    * 是否存在二维码（1：有，0：无）
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * 条目
    */
    @SerializedName("FlightItems")
    @Expose
    private FlightItem [] FlightItems;

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
     * Get 电子客票号码 
     * @return Number 电子客票号码
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 电子客票号码
     * @param Number 电子客票号码
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get 校验码 
     * @return CheckCode 校验码
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 校验码
     * @param CheckCode 校验码
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 印刷序号 
     * @return SerialNumber 印刷序号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 印刷序号
     * @param SerialNumber 印刷序号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
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
     * Get 销售单位代号 
     * @return AgentCode 销售单位代号
     */
    public String getAgentCode() {
        return this.AgentCode;
    }

    /**
     * Set 销售单位代号
     * @param AgentCode 销售单位代号
     */
    public void setAgentCode(String AgentCode) {
        this.AgentCode = AgentCode;
    }

    /**
     * Get 销售单位代号第一行 
     * @return AgentCodeFirst 销售单位代号第一行
     */
    public String getAgentCodeFirst() {
        return this.AgentCodeFirst;
    }

    /**
     * Set 销售单位代号第一行
     * @param AgentCodeFirst 销售单位代号第一行
     */
    public void setAgentCodeFirst(String AgentCodeFirst) {
        this.AgentCodeFirst = AgentCodeFirst;
    }

    /**
     * Get 销售单位代号第二行 
     * @return AgentCodeSecond 销售单位代号第二行
     */
    public String getAgentCodeSecond() {
        return this.AgentCodeSecond;
    }

    /**
     * Set 销售单位代号第二行
     * @param AgentCodeSecond 销售单位代号第二行
     */
    public void setAgentCodeSecond(String AgentCodeSecond) {
        this.AgentCodeSecond = AgentCodeSecond;
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
     * Get 填开单位 
     * @return Issuer 填开单位
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 填开单位
     * @param Issuer 填开单位
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
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
     * Get 合计税额 
     * @return Tax 合计税额
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 合计税额
     * @param Tax 合计税额
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 燃油附加费 
     * @return FuelSurcharge 燃油附加费
     */
    public String getFuelSurcharge() {
        return this.FuelSurcharge;
    }

    /**
     * Set 燃油附加费
     * @param FuelSurcharge 燃油附加费
     */
    public void setFuelSurcharge(String FuelSurcharge) {
        this.FuelSurcharge = FuelSurcharge;
    }

    /**
     * Get 民航发展基金 
     * @return AirDevelopmentFund 民航发展基金
     */
    public String getAirDevelopmentFund() {
        return this.AirDevelopmentFund;
    }

    /**
     * Set 民航发展基金
     * @param AirDevelopmentFund 民航发展基金
     */
    public void setAirDevelopmentFund(String AirDevelopmentFund) {
        this.AirDevelopmentFund = AirDevelopmentFund;
    }

    /**
     * Get 保险费 
     * @return Insurance 保险费
     */
    public String getInsurance() {
        return this.Insurance;
    }

    /**
     * Set 保险费
     * @param Insurance 保险费
     */
    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    /**
     * Get 合计金额（小写） 
     * @return Total 合计金额（小写）
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 合计金额（小写）
     * @param Total 合计金额（小写）
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
     * Get 国内国际标签 
     * @return DomesticInternationalTag 国内国际标签
     */
    public String getDomesticInternationalTag() {
        return this.DomesticInternationalTag;
    }

    /**
     * Set 国内国际标签
     * @param DomesticInternationalTag 国内国际标签
     */
    public void setDomesticInternationalTag(String DomesticInternationalTag) {
        this.DomesticInternationalTag = DomesticInternationalTag;
    }

    /**
     * Get 客票生效日期 
     * @return DateStart 客票生效日期
     */
    public String getDateStart() {
        return this.DateStart;
    }

    /**
     * Set 客票生效日期
     * @param DateStart 客票生效日期
     */
    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    /**
     * Get 有效截至日期 
     * @return DateEnd 有效截至日期
     */
    public String getDateEnd() {
        return this.DateEnd;
    }

    /**
     * Set 有效截至日期
     * @param DateEnd 有效截至日期
     */
    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
    }

    /**
     * Get 签注 
     * @return Endorsement 签注
     */
    public String getEndorsement() {
        return this.Endorsement;
    }

    /**
     * Set 签注
     * @param Endorsement 签注
     */
    public void setEndorsement(String Endorsement) {
        this.Endorsement = Endorsement;
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
     * Get 条目 
     * @return FlightItems 条目
     */
    public FlightItem [] getFlightItems() {
        return this.FlightItems;
    }

    /**
     * Set 条目
     * @param FlightItems 条目
     */
    public void setFlightItems(FlightItem [] FlightItems) {
        this.FlightItems = FlightItems;
    }

    public AirTransport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AirTransport(AirTransport source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AgentCode != null) {
            this.AgentCode = new String(source.AgentCode);
        }
        if (source.AgentCodeFirst != null) {
            this.AgentCodeFirst = new String(source.AgentCodeFirst);
        }
        if (source.AgentCodeSecond != null) {
            this.AgentCodeSecond = new String(source.AgentCodeSecond);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.FuelSurcharge != null) {
            this.FuelSurcharge = new String(source.FuelSurcharge);
        }
        if (source.AirDevelopmentFund != null) {
            this.AirDevelopmentFund = new String(source.AirDevelopmentFund);
        }
        if (source.Insurance != null) {
            this.Insurance = new String(source.Insurance);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.DomesticInternationalTag != null) {
            this.DomesticInternationalTag = new String(source.DomesticInternationalTag);
        }
        if (source.DateStart != null) {
            this.DateStart = new String(source.DateStart);
        }
        if (source.DateEnd != null) {
            this.DateEnd = new String(source.DateEnd);
        }
        if (source.Endorsement != null) {
            this.Endorsement = new String(source.Endorsement);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.FlightItems != null) {
            this.FlightItems = new FlightItem[source.FlightItems.length];
            for (int i = 0; i < source.FlightItems.length; i++) {
                this.FlightItems[i] = new FlightItem(source.FlightItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AgentCode", this.AgentCode);
        this.setParamSimple(map, prefix + "AgentCodeFirst", this.AgentCodeFirst);
        this.setParamSimple(map, prefix + "AgentCodeSecond", this.AgentCodeSecond);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "FuelSurcharge", this.FuelSurcharge);
        this.setParamSimple(map, prefix + "AirDevelopmentFund", this.AirDevelopmentFund);
        this.setParamSimple(map, prefix + "Insurance", this.Insurance);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "DomesticInternationalTag", this.DomesticInternationalTag);
        this.setParamSimple(map, prefix + "DateStart", this.DateStart);
        this.setParamSimple(map, prefix + "DateEnd", this.DateEnd);
        this.setParamSimple(map, prefix + "Endorsement", this.Endorsement);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamArrayObj(map, prefix + "FlightItems.", this.FlightItems);

    }
}

