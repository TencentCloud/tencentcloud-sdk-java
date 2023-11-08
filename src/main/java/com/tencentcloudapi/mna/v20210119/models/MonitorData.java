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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorData extends AbstractModel {

    /**
    * 时间点：s
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 业务指标（bps/ms/%）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessMetrics")
    @Expose
    private Float BusinessMetrics;

    /**
    * 网卡状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotNetInfo")
    @Expose
    private SlotNetInfo [] SlotNetInfo;

    /**
     * Get 时间点：s 
     * @return Time 时间点：s
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点：s
     * @param Time 时间点：s
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 业务指标（bps/ms/%）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessMetrics 业务指标（bps/ms/%）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getBusinessMetrics() {
        return this.BusinessMetrics;
    }

    /**
     * Set 业务指标（bps/ms/%）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessMetrics 业务指标（bps/ms/%）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessMetrics(Float BusinessMetrics) {
        this.BusinessMetrics = BusinessMetrics;
    }

    /**
     * Get 网卡状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotNetInfo 网卡状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlotNetInfo [] getSlotNetInfo() {
        return this.SlotNetInfo;
    }

    /**
     * Set 网卡状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotNetInfo 网卡状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotNetInfo(SlotNetInfo [] SlotNetInfo) {
        this.SlotNetInfo = SlotNetInfo;
    }

    public MonitorData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorData(MonitorData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.BusinessMetrics != null) {
            this.BusinessMetrics = new Float(source.BusinessMetrics);
        }
        if (source.SlotNetInfo != null) {
            this.SlotNetInfo = new SlotNetInfo[source.SlotNetInfo.length];
            for (int i = 0; i < source.SlotNetInfo.length; i++) {
                this.SlotNetInfo[i] = new SlotNetInfo(source.SlotNetInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "BusinessMetrics", this.BusinessMetrics);
        this.setParamArrayObj(map, prefix + "SlotNetInfo.", this.SlotNetInfo);

    }
}

