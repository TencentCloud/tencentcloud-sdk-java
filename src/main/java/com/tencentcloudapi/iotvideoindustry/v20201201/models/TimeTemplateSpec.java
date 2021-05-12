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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeTemplateSpec extends AbstractModel{

    /**
    * 一周中的周几
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayofWeek")
    @Expose
    private Long DayofWeek;

    /**
    * 时间片段的开始时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 时间片段的结束时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 一周中的周几
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayofWeek 一周中的周几
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayofWeek() {
        return this.DayofWeek;
    }

    /**
     * Set 一周中的周几
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayofWeek 一周中的周几
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayofWeek(Long DayofWeek) {
        this.DayofWeek = DayofWeek;
    }

    /**
     * Get 时间片段的开始时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 时间片段的开始时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 时间片段的开始时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 时间片段的开始时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 时间片段的结束时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 时间片段的结束时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 时间片段的结束时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 时间片段的结束时分。格式【HH:MM】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public TimeTemplateSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeTemplateSpec(TimeTemplateSpec source) {
        if (source.DayofWeek != null) {
            this.DayofWeek = new Long(source.DayofWeek);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayofWeek", this.DayofWeek);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

