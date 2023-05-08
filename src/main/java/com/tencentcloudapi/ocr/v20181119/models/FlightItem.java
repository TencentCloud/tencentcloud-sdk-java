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

public class FlightItem extends AbstractModel{

    /**
    * 出发航站楼
    */
    @SerializedName("TerminalGetOn")
    @Expose
    private String TerminalGetOn;

    /**
    * 到达航站楼
    */
    @SerializedName("TerminalGetOff")
    @Expose
    private String TerminalGetOff;

    /**
    * 承运人
    */
    @SerializedName("Carrier")
    @Expose
    private String Carrier;

    /**
    * 航班号
    */
    @SerializedName("FlightNumber")
    @Expose
    private String FlightNumber;

    /**
    * 座位等级
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * 乘机日期
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * 乘机时间
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * 出发站
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
    * 免费行李
    */
    @SerializedName("Allow")
    @Expose
    private String Allow;

    /**
    * 客票级别/客票类别
    */
    @SerializedName("FareBasis")
    @Expose
    private String FareBasis;

    /**
     * Get 出发航站楼 
     * @return TerminalGetOn 出发航站楼
     */
    public String getTerminalGetOn() {
        return this.TerminalGetOn;
    }

    /**
     * Set 出发航站楼
     * @param TerminalGetOn 出发航站楼
     */
    public void setTerminalGetOn(String TerminalGetOn) {
        this.TerminalGetOn = TerminalGetOn;
    }

    /**
     * Get 到达航站楼 
     * @return TerminalGetOff 到达航站楼
     */
    public String getTerminalGetOff() {
        return this.TerminalGetOff;
    }

    /**
     * Set 到达航站楼
     * @param TerminalGetOff 到达航站楼
     */
    public void setTerminalGetOff(String TerminalGetOff) {
        this.TerminalGetOff = TerminalGetOff;
    }

    /**
     * Get 承运人 
     * @return Carrier 承运人
     */
    public String getCarrier() {
        return this.Carrier;
    }

    /**
     * Set 承运人
     * @param Carrier 承运人
     */
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * Get 航班号 
     * @return FlightNumber 航班号
     */
    public String getFlightNumber() {
        return this.FlightNumber;
    }

    /**
     * Set 航班号
     * @param FlightNumber 航班号
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     * Get 座位等级 
     * @return Seat 座位等级
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set 座位等级
     * @param Seat 座位等级
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get 乘机日期 
     * @return DateGetOn 乘机日期
     */
    public String getDateGetOn() {
        return this.DateGetOn;
    }

    /**
     * Set 乘机日期
     * @param DateGetOn 乘机日期
     */
    public void setDateGetOn(String DateGetOn) {
        this.DateGetOn = DateGetOn;
    }

    /**
     * Get 乘机时间 
     * @return TimeGetOn 乘机时间
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set 乘机时间
     * @param TimeGetOn 乘机时间
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get 出发站 
     * @return StationGetOn 出发站
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set 出发站
     * @param StationGetOn 出发站
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
     * Get 免费行李 
     * @return Allow 免费行李
     */
    public String getAllow() {
        return this.Allow;
    }

    /**
     * Set 免费行李
     * @param Allow 免费行李
     */
    public void setAllow(String Allow) {
        this.Allow = Allow;
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

    public FlightItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlightItem(FlightItem source) {
        if (source.TerminalGetOn != null) {
            this.TerminalGetOn = new String(source.TerminalGetOn);
        }
        if (source.TerminalGetOff != null) {
            this.TerminalGetOff = new String(source.TerminalGetOff);
        }
        if (source.Carrier != null) {
            this.Carrier = new String(source.Carrier);
        }
        if (source.FlightNumber != null) {
            this.FlightNumber = new String(source.FlightNumber);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Allow != null) {
            this.Allow = new String(source.Allow);
        }
        if (source.FareBasis != null) {
            this.FareBasis = new String(source.FareBasis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TerminalGetOn", this.TerminalGetOn);
        this.setParamSimple(map, prefix + "TerminalGetOff", this.TerminalGetOff);
        this.setParamSimple(map, prefix + "Carrier", this.Carrier);
        this.setParamSimple(map, prefix + "FlightNumber", this.FlightNumber);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Allow", this.Allow);
        this.setParamSimple(map, prefix + "FareBasis", this.FareBasis);

    }
}

