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

public class RailwayTicketInfo extends AbstractModel {

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
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
    * 售票或退票类型
    */
    @SerializedName("TypeOfBusiness")
    @Expose
    private String TypeOfBusiness;

    /**
    * 始发站
    */
    @SerializedName("DepartureStation")
    @Expose
    private String DepartureStation;

    /**
    * 始发站英文
    */
    @SerializedName("PhonicsOfDepartureStation")
    @Expose
    private String PhonicsOfDepartureStation;

    /**
    * 到达站
    */
    @SerializedName("DestinationStation")
    @Expose
    private String DestinationStation;

    /**
    * 到达站英文
    */
    @SerializedName("PhonicsOfDestinationStation")
    @Expose
    private String PhonicsOfDestinationStation;

    /**
    * 火车号
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
    * 火车出发日期
    */
    @SerializedName("TravelDate")
    @Expose
    private String TravelDate;

    /**
    * 始发时间
    */
    @SerializedName("DepartureTime")
    @Expose
    private String DepartureTime;

    /**
    * 空调特点
    */
    @SerializedName("AirConditioningCharacteristics")
    @Expose
    private String AirConditioningCharacteristics;

    /**
    * 座位类型
    */
    @SerializedName("SeatLevel")
    @Expose
    private String SeatLevel;

    /**
    * 火车第几车
    */
    @SerializedName("Carriage")
    @Expose
    private String Carriage;

    /**
    * 座位号
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * 票价
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * 发票号码
    */
    @SerializedName("ElectronicInvoiceRailwayETicketNumber")
    @Expose
    private String ElectronicInvoiceRailwayETicketNumber;

    /**
    * 身份证号
    */
    @SerializedName("IdNumber")
    @Expose
    private String IdNumber;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 金额
    */
    @SerializedName("TotalAmountExcludingTax")
    @Expose
    private String TotalAmountExcludingTax;

    /**
    * 税率
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * 税额
    */
    @SerializedName("TaxAmount")
    @Expose
    private String TaxAmount;

    /**
    * 购买方名称
    */
    @SerializedName("NameOfPurchaser")
    @Expose
    private String NameOfPurchaser;

    /**
    * 统一社会信用代码
    */
    @SerializedName("UnifiedSocialCreditCodeOfPurchaser")
    @Expose
    private String UnifiedSocialCreditCodeOfPurchaser;

    /**
    * 原发票号码
    */
    @SerializedName("NumberOfOriginalInvoice")
    @Expose
    private String NumberOfOriginalInvoice;

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
     * @return DateOfIssue 开票日期
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set 开票日期
     * @param DateOfIssue 开票日期
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    /**
     * Get 售票或退票类型 
     * @return TypeOfBusiness 售票或退票类型
     */
    public String getTypeOfBusiness() {
        return this.TypeOfBusiness;
    }

    /**
     * Set 售票或退票类型
     * @param TypeOfBusiness 售票或退票类型
     */
    public void setTypeOfBusiness(String TypeOfBusiness) {
        this.TypeOfBusiness = TypeOfBusiness;
    }

    /**
     * Get 始发站 
     * @return DepartureStation 始发站
     */
    public String getDepartureStation() {
        return this.DepartureStation;
    }

    /**
     * Set 始发站
     * @param DepartureStation 始发站
     */
    public void setDepartureStation(String DepartureStation) {
        this.DepartureStation = DepartureStation;
    }

    /**
     * Get 始发站英文 
     * @return PhonicsOfDepartureStation 始发站英文
     */
    public String getPhonicsOfDepartureStation() {
        return this.PhonicsOfDepartureStation;
    }

    /**
     * Set 始发站英文
     * @param PhonicsOfDepartureStation 始发站英文
     */
    public void setPhonicsOfDepartureStation(String PhonicsOfDepartureStation) {
        this.PhonicsOfDepartureStation = PhonicsOfDepartureStation;
    }

    /**
     * Get 到达站 
     * @return DestinationStation 到达站
     */
    public String getDestinationStation() {
        return this.DestinationStation;
    }

    /**
     * Set 到达站
     * @param DestinationStation 到达站
     */
    public void setDestinationStation(String DestinationStation) {
        this.DestinationStation = DestinationStation;
    }

    /**
     * Get 到达站英文 
     * @return PhonicsOfDestinationStation 到达站英文
     */
    public String getPhonicsOfDestinationStation() {
        return this.PhonicsOfDestinationStation;
    }

    /**
     * Set 到达站英文
     * @param PhonicsOfDestinationStation 到达站英文
     */
    public void setPhonicsOfDestinationStation(String PhonicsOfDestinationStation) {
        this.PhonicsOfDestinationStation = PhonicsOfDestinationStation;
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
     * Get 火车出发日期 
     * @return TravelDate 火车出发日期
     */
    public String getTravelDate() {
        return this.TravelDate;
    }

    /**
     * Set 火车出发日期
     * @param TravelDate 火车出发日期
     */
    public void setTravelDate(String TravelDate) {
        this.TravelDate = TravelDate;
    }

    /**
     * Get 始发时间 
     * @return DepartureTime 始发时间
     */
    public String getDepartureTime() {
        return this.DepartureTime;
    }

    /**
     * Set 始发时间
     * @param DepartureTime 始发时间
     */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    /**
     * Get 空调特点 
     * @return AirConditioningCharacteristics 空调特点
     */
    public String getAirConditioningCharacteristics() {
        return this.AirConditioningCharacteristics;
    }

    /**
     * Set 空调特点
     * @param AirConditioningCharacteristics 空调特点
     */
    public void setAirConditioningCharacteristics(String AirConditioningCharacteristics) {
        this.AirConditioningCharacteristics = AirConditioningCharacteristics;
    }

    /**
     * Get 座位类型 
     * @return SeatLevel 座位类型
     */
    public String getSeatLevel() {
        return this.SeatLevel;
    }

    /**
     * Set 座位类型
     * @param SeatLevel 座位类型
     */
    public void setSeatLevel(String SeatLevel) {
        this.SeatLevel = SeatLevel;
    }

    /**
     * Get 火车第几车 
     * @return Carriage 火车第几车
     */
    public String getCarriage() {
        return this.Carriage;
    }

    /**
     * Set 火车第几车
     * @param Carriage 火车第几车
     */
    public void setCarriage(String Carriage) {
        this.Carriage = Carriage;
    }

    /**
     * Get 座位号 
     * @return Seat 座位号
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set 座位号
     * @param Seat 座位号
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
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
     * @return ElectronicInvoiceRailwayETicketNumber 发票号码
     */
    public String getElectronicInvoiceRailwayETicketNumber() {
        return this.ElectronicInvoiceRailwayETicketNumber;
    }

    /**
     * Set 发票号码
     * @param ElectronicInvoiceRailwayETicketNumber 发票号码
     */
    public void setElectronicInvoiceRailwayETicketNumber(String ElectronicInvoiceRailwayETicketNumber) {
        this.ElectronicInvoiceRailwayETicketNumber = ElectronicInvoiceRailwayETicketNumber;
    }

    /**
     * Get 身份证号 
     * @return IdNumber 身份证号
     */
    public String getIdNumber() {
        return this.IdNumber;
    }

    /**
     * Set 身份证号
     * @param IdNumber 身份证号
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 金额 
     * @return TotalAmountExcludingTax 金额
     */
    public String getTotalAmountExcludingTax() {
        return this.TotalAmountExcludingTax;
    }

    /**
     * Set 金额
     * @param TotalAmountExcludingTax 金额
     */
    public void setTotalAmountExcludingTax(String TotalAmountExcludingTax) {
        this.TotalAmountExcludingTax = TotalAmountExcludingTax;
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
     * Get 购买方名称 
     * @return NameOfPurchaser 购买方名称
     */
    public String getNameOfPurchaser() {
        return this.NameOfPurchaser;
    }

    /**
     * Set 购买方名称
     * @param NameOfPurchaser 购买方名称
     */
    public void setNameOfPurchaser(String NameOfPurchaser) {
        this.NameOfPurchaser = NameOfPurchaser;
    }

    /**
     * Get 统一社会信用代码 
     * @return UnifiedSocialCreditCodeOfPurchaser 统一社会信用代码
     */
    public String getUnifiedSocialCreditCodeOfPurchaser() {
        return this.UnifiedSocialCreditCodeOfPurchaser;
    }

    /**
     * Set 统一社会信用代码
     * @param UnifiedSocialCreditCodeOfPurchaser 统一社会信用代码
     */
    public void setUnifiedSocialCreditCodeOfPurchaser(String UnifiedSocialCreditCodeOfPurchaser) {
        this.UnifiedSocialCreditCodeOfPurchaser = UnifiedSocialCreditCodeOfPurchaser;
    }

    /**
     * Get 原发票号码 
     * @return NumberOfOriginalInvoice 原发票号码
     */
    public String getNumberOfOriginalInvoice() {
        return this.NumberOfOriginalInvoice;
    }

    /**
     * Set 原发票号码
     * @param NumberOfOriginalInvoice 原发票号码
     */
    public void setNumberOfOriginalInvoice(String NumberOfOriginalInvoice) {
        this.NumberOfOriginalInvoice = NumberOfOriginalInvoice;
    }

    public RailwayTicketInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RailwayTicketInfo(RailwayTicketInfo source) {
        if (source.TypeOfVoucher != null) {
            this.TypeOfVoucher = new String(source.TypeOfVoucher);
        }
        if (source.ElectronicTicketNum != null) {
            this.ElectronicTicketNum = new String(source.ElectronicTicketNum);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
        }
        if (source.TypeOfBusiness != null) {
            this.TypeOfBusiness = new String(source.TypeOfBusiness);
        }
        if (source.DepartureStation != null) {
            this.DepartureStation = new String(source.DepartureStation);
        }
        if (source.PhonicsOfDepartureStation != null) {
            this.PhonicsOfDepartureStation = new String(source.PhonicsOfDepartureStation);
        }
        if (source.DestinationStation != null) {
            this.DestinationStation = new String(source.DestinationStation);
        }
        if (source.PhonicsOfDestinationStation != null) {
            this.PhonicsOfDestinationStation = new String(source.PhonicsOfDestinationStation);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
        if (source.TravelDate != null) {
            this.TravelDate = new String(source.TravelDate);
        }
        if (source.DepartureTime != null) {
            this.DepartureTime = new String(source.DepartureTime);
        }
        if (source.AirConditioningCharacteristics != null) {
            this.AirConditioningCharacteristics = new String(source.AirConditioningCharacteristics);
        }
        if (source.SeatLevel != null) {
            this.SeatLevel = new String(source.SeatLevel);
        }
        if (source.Carriage != null) {
            this.Carriage = new String(source.Carriage);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.ElectronicInvoiceRailwayETicketNumber != null) {
            this.ElectronicInvoiceRailwayETicketNumber = new String(source.ElectronicInvoiceRailwayETicketNumber);
        }
        if (source.IdNumber != null) {
            this.IdNumber = new String(source.IdNumber);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TotalAmountExcludingTax != null) {
            this.TotalAmountExcludingTax = new String(source.TotalAmountExcludingTax);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.TaxAmount != null) {
            this.TaxAmount = new String(source.TaxAmount);
        }
        if (source.NameOfPurchaser != null) {
            this.NameOfPurchaser = new String(source.NameOfPurchaser);
        }
        if (source.UnifiedSocialCreditCodeOfPurchaser != null) {
            this.UnifiedSocialCreditCodeOfPurchaser = new String(source.UnifiedSocialCreditCodeOfPurchaser);
        }
        if (source.NumberOfOriginalInvoice != null) {
            this.NumberOfOriginalInvoice = new String(source.NumberOfOriginalInvoice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeOfVoucher", this.TypeOfVoucher);
        this.setParamSimple(map, prefix + "ElectronicTicketNum", this.ElectronicTicketNum);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);
        this.setParamSimple(map, prefix + "TypeOfBusiness", this.TypeOfBusiness);
        this.setParamSimple(map, prefix + "DepartureStation", this.DepartureStation);
        this.setParamSimple(map, prefix + "PhonicsOfDepartureStation", this.PhonicsOfDepartureStation);
        this.setParamSimple(map, prefix + "DestinationStation", this.DestinationStation);
        this.setParamSimple(map, prefix + "PhonicsOfDestinationStation", this.PhonicsOfDestinationStation);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);
        this.setParamSimple(map, prefix + "TravelDate", this.TravelDate);
        this.setParamSimple(map, prefix + "DepartureTime", this.DepartureTime);
        this.setParamSimple(map, prefix + "AirConditioningCharacteristics", this.AirConditioningCharacteristics);
        this.setParamSimple(map, prefix + "SeatLevel", this.SeatLevel);
        this.setParamSimple(map, prefix + "Carriage", this.Carriage);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "ElectronicInvoiceRailwayETicketNumber", this.ElectronicInvoiceRailwayETicketNumber);
        this.setParamSimple(map, prefix + "IdNumber", this.IdNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TotalAmountExcludingTax", this.TotalAmountExcludingTax);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "TaxAmount", this.TaxAmount);
        this.setParamSimple(map, prefix + "NameOfPurchaser", this.NameOfPurchaser);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCodeOfPurchaser", this.UnifiedSocialCreditCodeOfPurchaser);
        this.setParamSimple(map, prefix + "NumberOfOriginalInvoice", this.NumberOfOriginalInvoice);

    }
}

