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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeSignalInfo extends AbstractModel {

    /**
    * EventID。
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * UPIDType。
    */
    @SerializedName("UPIDType")
    @Expose
    private String UPIDType;

    /**
    * UPID。
    */
    @SerializedName("UPID")
    @Expose
    private String UPID;

    /**
    * TypeID。
    */
    @SerializedName("TypeID")
    @Expose
    private String TypeID;

    /**
    * Num。
    */
    @SerializedName("Num")
    @Expose
    private String Num;

    /**
    * Expected。
    */
    @SerializedName("Expected")
    @Expose
    private String Expected;

    /**
    * SubsegmentNum。
    */
    @SerializedName("SubsegmentNum")
    @Expose
    private String SubsegmentNum;

    /**
    * SubsegmentsExpected。
    */
    @SerializedName("SubsegmentsExpected")
    @Expose
    private String SubsegmentsExpected;

    /**
     * Get EventID。 
     * @return EventID EventID。
     */
    public String getEventID() {
        return this.EventID;
    }

    /**
     * Set EventID。
     * @param EventID EventID。
     */
    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    /**
     * Get UPIDType。 
     * @return UPIDType UPIDType。
     */
    public String getUPIDType() {
        return this.UPIDType;
    }

    /**
     * Set UPIDType。
     * @param UPIDType UPIDType。
     */
    public void setUPIDType(String UPIDType) {
        this.UPIDType = UPIDType;
    }

    /**
     * Get UPID。 
     * @return UPID UPID。
     */
    public String getUPID() {
        return this.UPID;
    }

    /**
     * Set UPID。
     * @param UPID UPID。
     */
    public void setUPID(String UPID) {
        this.UPID = UPID;
    }

    /**
     * Get TypeID。 
     * @return TypeID TypeID。
     */
    public String getTypeID() {
        return this.TypeID;
    }

    /**
     * Set TypeID。
     * @param TypeID TypeID。
     */
    public void setTypeID(String TypeID) {
        this.TypeID = TypeID;
    }

    /**
     * Get Num。 
     * @return Num Num。
     */
    public String getNum() {
        return this.Num;
    }

    /**
     * Set Num。
     * @param Num Num。
     */
    public void setNum(String Num) {
        this.Num = Num;
    }

    /**
     * Get Expected。 
     * @return Expected Expected。
     */
    public String getExpected() {
        return this.Expected;
    }

    /**
     * Set Expected。
     * @param Expected Expected。
     */
    public void setExpected(String Expected) {
        this.Expected = Expected;
    }

    /**
     * Get SubsegmentNum。 
     * @return SubsegmentNum SubsegmentNum。
     */
    public String getSubsegmentNum() {
        return this.SubsegmentNum;
    }

    /**
     * Set SubsegmentNum。
     * @param SubsegmentNum SubsegmentNum。
     */
    public void setSubsegmentNum(String SubsegmentNum) {
        this.SubsegmentNum = SubsegmentNum;
    }

    /**
     * Get SubsegmentsExpected。 
     * @return SubsegmentsExpected SubsegmentsExpected。
     */
    public String getSubsegmentsExpected() {
        return this.SubsegmentsExpected;
    }

    /**
     * Set SubsegmentsExpected。
     * @param SubsegmentsExpected SubsegmentsExpected。
     */
    public void setSubsegmentsExpected(String SubsegmentsExpected) {
        this.SubsegmentsExpected = SubsegmentsExpected;
    }

    public TimeSignalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeSignalInfo(TimeSignalInfo source) {
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.UPIDType != null) {
            this.UPIDType = new String(source.UPIDType);
        }
        if (source.UPID != null) {
            this.UPID = new String(source.UPID);
        }
        if (source.TypeID != null) {
            this.TypeID = new String(source.TypeID);
        }
        if (source.Num != null) {
            this.Num = new String(source.Num);
        }
        if (source.Expected != null) {
            this.Expected = new String(source.Expected);
        }
        if (source.SubsegmentNum != null) {
            this.SubsegmentNum = new String(source.SubsegmentNum);
        }
        if (source.SubsegmentsExpected != null) {
            this.SubsegmentsExpected = new String(source.SubsegmentsExpected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "UPIDType", this.UPIDType);
        this.setParamSimple(map, prefix + "UPID", this.UPID);
        this.setParamSimple(map, prefix + "TypeID", this.TypeID);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Expected", this.Expected);
        this.setParamSimple(map, prefix + "SubsegmentNum", this.SubsegmentNum);
        this.setParamSimple(map, prefix + "SubsegmentsExpected", this.SubsegmentsExpected);

    }
}

