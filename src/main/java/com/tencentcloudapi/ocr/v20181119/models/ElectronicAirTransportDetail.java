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

public class ElectronicAirTransportDetail extends AbstractModel {

    /**
    * <p>航段序号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlightSegment")
    @Expose
    private String FlightSegment;

    /**
    * <p>始发站</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * <p>目的站</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * <p>承运人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Carrier")
    @Expose
    private String Carrier;

    /**
    * <p>航班号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlightNumber")
    @Expose
    private String FlightNumber;

    /**
    * <p>座位等级</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeatLevel")
    @Expose
    private String SeatLevel;

    /**
    * <p>承运日期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlightDate")
    @Expose
    private String FlightDate;

    /**
    * <p>起飞时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartureTime")
    @Expose
    private String DepartureTime;

    /**
    * <p>客票级别/客票类别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FareBasis")
    @Expose
    private String FareBasis;

    /**
     * Get <p>航段序号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlightSegment <p>航段序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlightSegment() {
        return this.FlightSegment;
    }

    /**
     * Set <p>航段序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlightSegment <p>航段序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlightSegment(String FlightSegment) {
        this.FlightSegment = FlightSegment;
    }

    /**
     * Get <p>始发站</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOn <p>始发站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set <p>始发站</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOn <p>始发站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get <p>目的站</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StationGetOff <p>目的站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set <p>目的站</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StationGetOff <p>目的站</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
    }

    /**
     * Get <p>承运人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Carrier <p>承运人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCarrier() {
        return this.Carrier;
    }

    /**
     * Set <p>承运人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Carrier <p>承运人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * Get <p>航班号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlightNumber <p>航班号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlightNumber() {
        return this.FlightNumber;
    }

    /**
     * Set <p>航班号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlightNumber <p>航班号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     * Get <p>座位等级</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeatLevel <p>座位等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeatLevel() {
        return this.SeatLevel;
    }

    /**
     * Set <p>座位等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeatLevel <p>座位等级</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeatLevel(String SeatLevel) {
        this.SeatLevel = SeatLevel;
    }

    /**
     * Get <p>承运日期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlightDate <p>承运日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlightDate() {
        return this.FlightDate;
    }

    /**
     * Set <p>承运日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlightDate <p>承运日期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlightDate(String FlightDate) {
        this.FlightDate = FlightDate;
    }

    /**
     * Get <p>起飞时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartureTime <p>起飞时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartureTime() {
        return this.DepartureTime;
    }

    /**
     * Set <p>起飞时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartureTime <p>起飞时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    /**
     * Get <p>客票级别/客票类别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FareBasis <p>客票级别/客票类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFareBasis() {
        return this.FareBasis;
    }

    /**
     * Set <p>客票级别/客票类别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FareBasis <p>客票级别/客票类别</p>
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

