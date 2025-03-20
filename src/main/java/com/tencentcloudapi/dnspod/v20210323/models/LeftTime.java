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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LeftTime extends AbstractModel {

    /**
    * 剩余天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Days")
    @Expose
    private Long Days;

    /**
    * 剩余小时数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hours")
    @Expose
    private Long Hours;

    /**
    * 剩余分钟数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mins")
    @Expose
    private Long Mins;

    /**
     * Get 剩余天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Days 剩余天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDays() {
        return this.Days;
    }

    /**
     * Set 剩余天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Days 剩余天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDays(Long Days) {
        this.Days = Days;
    }

    /**
     * Get 剩余小时数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hours 剩余小时数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHours() {
        return this.Hours;
    }

    /**
     * Set 剩余小时数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hours 剩余小时数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHours(Long Hours) {
        this.Hours = Hours;
    }

    /**
     * Get 剩余分钟数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mins 剩余分钟数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMins() {
        return this.Mins;
    }

    /**
     * Set 剩余分钟数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mins 剩余分钟数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMins(Long Mins) {
        this.Mins = Mins;
    }

    public LeftTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LeftTime(LeftTime source) {
        if (source.Days != null) {
            this.Days = new Long(source.Days);
        }
        if (source.Hours != null) {
            this.Hours = new Long(source.Hours);
        }
        if (source.Mins != null) {
            this.Mins = new Long(source.Mins);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Days", this.Days);
        this.setParamSimple(map, prefix + "Hours", this.Hours);
        this.setParamSimple(map, prefix + "Mins", this.Mins);

    }
}

