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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Duty extends AbstractModel {

    /**
    * 值班Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DutyScheduleId")
    @Expose
    private Long DutyScheduleId;

    /**
    * 值班开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 值班结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 值班人员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DutyPersons")
    @Expose
    private DutyPerson [] DutyPersons;

    /**
     * Get 值班Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DutyScheduleId 值班Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDutyScheduleId() {
        return this.DutyScheduleId;
    }

    /**
     * Set 值班Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DutyScheduleId 值班Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDutyScheduleId(Long DutyScheduleId) {
        this.DutyScheduleId = DutyScheduleId;
    }

    /**
     * Get 值班开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 值班开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 值班开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 值班开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 值班结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 值班结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 值班结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 值班结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 值班人员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DutyPersons 值班人员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DutyPerson [] getDutyPersons() {
        return this.DutyPersons;
    }

    /**
     * Set 值班人员
注意：此字段可能返回 null，表示取不到有效值。
     * @param DutyPersons 值班人员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDutyPersons(DutyPerson [] DutyPersons) {
        this.DutyPersons = DutyPersons;
    }

    public Duty() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Duty(Duty source) {
        if (source.DutyScheduleId != null) {
            this.DutyScheduleId = new Long(source.DutyScheduleId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DutyPersons != null) {
            this.DutyPersons = new DutyPerson[source.DutyPersons.length];
            for (int i = 0; i < source.DutyPersons.length; i++) {
                this.DutyPersons[i] = new DutyPerson(source.DutyPersons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DutyScheduleId", this.DutyScheduleId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "DutyPersons.", this.DutyPersons);

    }
}

