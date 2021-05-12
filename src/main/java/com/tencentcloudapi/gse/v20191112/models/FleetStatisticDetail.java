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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetStatisticDetail extends AbstractModel{

    /**
    * 舰队ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceIP")
    @Expose
    private String InstanceIP;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedTimeSeconds")
    @Expose
    private String TotalUsedTimeSeconds;

    /**
    * 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalUsedFlowMegaBytes")
    @Expose
    private Float TotalUsedFlowMegaBytes;

    /**
     * Get 舰队ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 舰队ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 舰队ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 舰队ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceIP 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceIP() {
        return this.InstanceIP;
    }

    /**
     * Set 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceIP 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceIP(String InstanceIP) {
        this.InstanceIP = InstanceIP;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedTimeSeconds 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalUsedTimeSeconds() {
        return this.TotalUsedTimeSeconds;
    }

    /**
     * Set 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedTimeSeconds 总时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedTimeSeconds(String TotalUsedTimeSeconds) {
        this.TotalUsedTimeSeconds = TotalUsedTimeSeconds;
    }

    /**
     * Get 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalUsedFlowMegaBytes 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalUsedFlowMegaBytes() {
        return this.TotalUsedFlowMegaBytes;
    }

    /**
     * Set 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalUsedFlowMegaBytes 总流量，单位MB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalUsedFlowMegaBytes(Float TotalUsedFlowMegaBytes) {
        this.TotalUsedFlowMegaBytes = TotalUsedFlowMegaBytes;
    }

    public FleetStatisticDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FleetStatisticDetail(FleetStatisticDetail source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceIP != null) {
            this.InstanceIP = new String(source.InstanceIP);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TotalUsedTimeSeconds != null) {
            this.TotalUsedTimeSeconds = new String(source.TotalUsedTimeSeconds);
        }
        if (source.TotalUsedFlowMegaBytes != null) {
            this.TotalUsedFlowMegaBytes = new Float(source.TotalUsedFlowMegaBytes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceIP", this.InstanceIP);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TotalUsedTimeSeconds", this.TotalUsedTimeSeconds);
        this.setParamSimple(map, prefix + "TotalUsedFlowMegaBytes", this.TotalUsedFlowMegaBytes);

    }
}

