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

public class SpliceInsertInfo extends AbstractModel {

    /**
    * EventID。
    */
    @SerializedName("EventID")
    @Expose
    private String EventID;

    /**
    * AvailNum。
    */
    @SerializedName("AvailNum")
    @Expose
    private String AvailNum;

    /**
    * AvailExpected。
    */
    @SerializedName("AvailExpected")
    @Expose
    private String AvailExpected;

    /**
    * ProgramID。
    */
    @SerializedName("ProgramID")
    @Expose
    private String ProgramID;

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
     * Get AvailNum。 
     * @return AvailNum AvailNum。
     */
    public String getAvailNum() {
        return this.AvailNum;
    }

    /**
     * Set AvailNum。
     * @param AvailNum AvailNum。
     */
    public void setAvailNum(String AvailNum) {
        this.AvailNum = AvailNum;
    }

    /**
     * Get AvailExpected。 
     * @return AvailExpected AvailExpected。
     */
    public String getAvailExpected() {
        return this.AvailExpected;
    }

    /**
     * Set AvailExpected。
     * @param AvailExpected AvailExpected。
     */
    public void setAvailExpected(String AvailExpected) {
        this.AvailExpected = AvailExpected;
    }

    /**
     * Get ProgramID。 
     * @return ProgramID ProgramID。
     */
    public String getProgramID() {
        return this.ProgramID;
    }

    /**
     * Set ProgramID。
     * @param ProgramID ProgramID。
     */
    public void setProgramID(String ProgramID) {
        this.ProgramID = ProgramID;
    }

    public SpliceInsertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpliceInsertInfo(SpliceInsertInfo source) {
        if (source.EventID != null) {
            this.EventID = new String(source.EventID);
        }
        if (source.AvailNum != null) {
            this.AvailNum = new String(source.AvailNum);
        }
        if (source.AvailExpected != null) {
            this.AvailExpected = new String(source.AvailExpected);
        }
        if (source.ProgramID != null) {
            this.ProgramID = new String(source.ProgramID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "AvailNum", this.AvailNum);
        this.setParamSimple(map, prefix + "AvailExpected", this.AvailExpected);
        this.setParamSimple(map, prefix + "ProgramID", this.ProgramID);

    }
}

