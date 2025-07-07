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

public class DetailInformationOfAirTicketTupleList extends AbstractModel {

    /**
    * 出发站（自）
    */
    @SerializedName("DepartureStation")
    @Expose
    private String DepartureStation;

    /**
    * 目的地（至）
    */
    @SerializedName("DestinationStation")
    @Expose
    private String DestinationStation;

    /**
    * 航班
    */
    @SerializedName("FlightSegment")
    @Expose
    private String FlightSegment;

    /**
    * 航班
    */
    @SerializedName("Carrier")
    @Expose
    private String Carrier;

    /**
    * 航班号
    */
    @SerializedName("Flight")
    @Expose
    private String Flight;

    /**
    * 座位等级
    */
    @SerializedName("SeatClass")
    @Expose
    private String SeatClass;

    /**
    * 日期
    */
    @SerializedName("CarrierDate")
    @Expose
    private String CarrierDate;

    /**
    * 时间
    */
    @SerializedName("DepartureTime")
    @Expose
    private String DepartureTime;

    /**
    * 客票级别/客票类别
    */
    @SerializedName("FareBasis")
    @Expose
    private String FareBasis;

    /**
    * 客票生效日期
    */
    @SerializedName("EffectiveDate")
    @Expose
    private String EffectiveDate;

    /**
    * 有效截止日期
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 免费行李
    */
    @SerializedName("FreeBaggageAllowance")
    @Expose
    private String FreeBaggageAllowance;

    /**
     * Get 出发站（自） 
     * @return DepartureStation 出发站（自）
     */
    public String getDepartureStation() {
        return this.DepartureStation;
    }

    /**
     * Set 出发站（自）
     * @param DepartureStation 出发站（自）
     */
    public void setDepartureStation(String DepartureStation) {
        this.DepartureStation = DepartureStation;
    }

    /**
     * Get 目的地（至） 
     * @return DestinationStation 目的地（至）
     */
    public String getDestinationStation() {
        return this.DestinationStation;
    }

    /**
     * Set 目的地（至）
     * @param DestinationStation 目的地（至）
     */
    public void setDestinationStation(String DestinationStation) {
        this.DestinationStation = DestinationStation;
    }

    /**
     * Get 航班 
     * @return FlightSegment 航班
     */
    public String getFlightSegment() {
        return this.FlightSegment;
    }

    /**
     * Set 航班
     * @param FlightSegment 航班
     */
    public void setFlightSegment(String FlightSegment) {
        this.FlightSegment = FlightSegment;
    }

    /**
     * Get 航班 
     * @return Carrier 航班
     */
    public String getCarrier() {
        return this.Carrier;
    }

    /**
     * Set 航班
     * @param Carrier 航班
     */
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * Get 航班号 
     * @return Flight 航班号
     */
    public String getFlight() {
        return this.Flight;
    }

    /**
     * Set 航班号
     * @param Flight 航班号
     */
    public void setFlight(String Flight) {
        this.Flight = Flight;
    }

    /**
     * Get 座位等级 
     * @return SeatClass 座位等级
     */
    public String getSeatClass() {
        return this.SeatClass;
    }

    /**
     * Set 座位等级
     * @param SeatClass 座位等级
     */
    public void setSeatClass(String SeatClass) {
        this.SeatClass = SeatClass;
    }

    /**
     * Get 日期 
     * @return CarrierDate 日期
     */
    public String getCarrierDate() {
        return this.CarrierDate;
    }

    /**
     * Set 日期
     * @param CarrierDate 日期
     */
    public void setCarrierDate(String CarrierDate) {
        this.CarrierDate = CarrierDate;
    }

    /**
     * Get 时间 
     * @return DepartureTime 时间
     */
    public String getDepartureTime() {
        return this.DepartureTime;
    }

    /**
     * Set 时间
     * @param DepartureTime 时间
     */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    /**
     * Get 客票级别/客票类别 
     * @return FareBasis 客票级别/客票类别
     */
    public String getFareBasis() {
        return this.FareBasis;
    }

    /**
     * Set 客票级别/客票类别
     * @param FareBasis 客票级别/客票类别
     */
    public void setFareBasis(String FareBasis) {
        this.FareBasis = FareBasis;
    }

    /**
     * Get 客票生效日期 
     * @return EffectiveDate 客票生效日期
     */
    public String getEffectiveDate() {
        return this.EffectiveDate;
    }

    /**
     * Set 客票生效日期
     * @param EffectiveDate 客票生效日期
     */
    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }

    /**
     * Get 有效截止日期 
     * @return ExpirationDate 有效截止日期
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 有效截止日期
     * @param ExpirationDate 有效截止日期
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 免费行李 
     * @return FreeBaggageAllowance 免费行李
     */
    public String getFreeBaggageAllowance() {
        return this.FreeBaggageAllowance;
    }

    /**
     * Set 免费行李
     * @param FreeBaggageAllowance 免费行李
     */
    public void setFreeBaggageAllowance(String FreeBaggageAllowance) {
        this.FreeBaggageAllowance = FreeBaggageAllowance;
    }

    public DetailInformationOfAirTicketTupleList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailInformationOfAirTicketTupleList(DetailInformationOfAirTicketTupleList source) {
        if (source.DepartureStation != null) {
            this.DepartureStation = new String(source.DepartureStation);
        }
        if (source.DestinationStation != null) {
            this.DestinationStation = new String(source.DestinationStation);
        }
        if (source.FlightSegment != null) {
            this.FlightSegment = new String(source.FlightSegment);
        }
        if (source.Carrier != null) {
            this.Carrier = new String(source.Carrier);
        }
        if (source.Flight != null) {
            this.Flight = new String(source.Flight);
        }
        if (source.SeatClass != null) {
            this.SeatClass = new String(source.SeatClass);
        }
        if (source.CarrierDate != null) {
            this.CarrierDate = new String(source.CarrierDate);
        }
        if (source.DepartureTime != null) {
            this.DepartureTime = new String(source.DepartureTime);
        }
        if (source.FareBasis != null) {
            this.FareBasis = new String(source.FareBasis);
        }
        if (source.EffectiveDate != null) {
            this.EffectiveDate = new String(source.EffectiveDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.FreeBaggageAllowance != null) {
            this.FreeBaggageAllowance = new String(source.FreeBaggageAllowance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DepartureStation", this.DepartureStation);
        this.setParamSimple(map, prefix + "DestinationStation", this.DestinationStation);
        this.setParamSimple(map, prefix + "FlightSegment", this.FlightSegment);
        this.setParamSimple(map, prefix + "Carrier", this.Carrier);
        this.setParamSimple(map, prefix + "Flight", this.Flight);
        this.setParamSimple(map, prefix + "SeatClass", this.SeatClass);
        this.setParamSimple(map, prefix + "CarrierDate", this.CarrierDate);
        this.setParamSimple(map, prefix + "DepartureTime", this.DepartureTime);
        this.setParamSimple(map, prefix + "FareBasis", this.FareBasis);
        this.setParamSimple(map, prefix + "EffectiveDate", this.EffectiveDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "FreeBaggageAllowance", this.FreeBaggageAllowance);

    }
}

