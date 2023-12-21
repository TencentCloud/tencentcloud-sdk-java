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

public class ElectronicAirTransportDetail extends AbstractModel {

    /**
    * 航段序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlightSegment")
    @Expose
    private String FlightSegment;

    /**
    * 始发站
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * 目的站
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * 承运人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Carrier")
    @Expose
    private String Carrier;

    /**
    * 航班号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlightNumber")
    @Expose
    private String FlightNumber;

    /**
    * 座位等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeatLevel")
    @Expose
    private String SeatLevel;

    /**
    * 承运日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlightDate")
    @Expose
    private String FlightDate;

    /**
    * 起飞时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartureTime")
    @Expose
    private String DepartureTime;

    /**
    * 客票级别/客票类别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FareBasis")
    @Expose
    private String FareBasis;

    /**
     * Get 航段序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlightSegment 航段序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlightSegment() {
        return this.FlightSegment;
    }

    /**
     * Set 航段序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlightSegment 航段序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlightSegment(String FlightSegment) {
        this.FlightSegment = FlightSegment;
    }

    /**
     * Get 始发站
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOn 始发站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set 始发站
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOn 始发站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get 目的站
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOff 目的站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set 目的站
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOff 目的站
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
    }

    /**
     * Get 承运人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Carrier 承运人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCarrier() {
        return this.Carrier;
    }

    /**
     * Set 承运人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Carrier 承运人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * Get 航班号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlightNumber 航班号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlightNumber() {
        return this.FlightNumber;
    }

    /**
     * Set 航班号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlightNumber 航班号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     * Get 座位等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeatLevel 座位等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeatLevel() {
        return this.SeatLevel;
    }

    /**
     * Set 座位等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeatLevel 座位等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeatLevel(String SeatLevel) {
        this.SeatLevel = SeatLevel;
    }

    /**
     * Get 承运日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlightDate 承运日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlightDate() {
        return this.FlightDate;
    }

    /**
     * Set 承运日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlightDate 承运日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlightDate(String FlightDate) {
        this.FlightDate = FlightDate;
    }

    /**
     * Get 起飞时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartureTime 起飞时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartureTime() {
        return this.DepartureTime;
    }

    /**
     * Set 起飞时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartureTime 起飞时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    /**
     * Get 客票级别/客票类别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FareBasis 客票级别/客票类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFareBasis() {
        return this.FareBasis;
    }

    /**
     * Set 客票级别/客票类别
注意：此字段可能返回 null，表示取不到有效值。
     * @param FareBasis 客票级别/客票类别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFareBasis(String FareBasis) {
        this.FareBasis = FareBasis;
    }

    public ElectronicAirTransportDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElectronicAirTransportDetail(ElectronicAirTransportDetail source) {
        if (source.FlightSegment != null) {
            this.FlightSegment = new String(source.FlightSegment);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Carrier != null) {
            this.Carrier = new String(source.Carrier);
        }
        if (source.FlightNumber != null) {
            this.FlightNumber = new String(source.FlightNumber);
        }
        if (source.SeatLevel != null) {
            this.SeatLevel = new String(source.SeatLevel);
        }
        if (source.FlightDate != null) {
            this.FlightDate = new String(source.FlightDate);
        }
        if (source.DepartureTime != null) {
            this.DepartureTime = new String(source.DepartureTime);
        }
        if (source.FareBasis != null) {
            this.FareBasis = new String(source.FareBasis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlightSegment", this.FlightSegment);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Carrier", this.Carrier);
        this.setParamSimple(map, prefix + "FlightNumber", this.FlightNumber);
        this.setParamSimple(map, prefix + "SeatLevel", this.SeatLevel);
        this.setParamSimple(map, prefix + "FlightDate", this.FlightDate);
        this.setParamSimple(map, prefix + "DepartureTime", this.DepartureTime);
        this.setParamSimple(map, prefix + "FareBasis", this.FareBasis);

    }
}

