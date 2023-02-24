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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowDetails extends AbstractModel{

    /**
    * 流量数据点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetDetails")
    @Expose
    private NetDetails [] NetDetails;

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 流量最大值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * 流量平均值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvgValue")
    @Expose
    private Float AvgValue;

    /**
    * 流量总值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalValue")
    @Expose
    private Float TotalValue;

    /**
     * Get 流量数据点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetDetails 流量数据点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetDetails [] getNetDetails() {
        return this.NetDetails;
    }

    /**
     * Set 流量数据点
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetDetails 流量数据点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetDetails(NetDetails [] NetDetails) {
        this.NetDetails = NetDetails;
    }

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 流量最大值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxValue 流量最大值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set 流量最大值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxValue 流量最大值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get 流量平均值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvgValue 流量平均值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAvgValue() {
        return this.AvgValue;
    }

    /**
     * Set 流量平均值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvgValue 流量平均值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvgValue(Float AvgValue) {
        this.AvgValue = AvgValue;
    }

    /**
     * Get 流量总值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalValue 流量总值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalValue() {
        return this.TotalValue;
    }

    /**
     * Set 流量总值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalValue 流量总值（单位：bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalValue(Float TotalValue) {
        this.TotalValue = TotalValue;
    }

    public FlowDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowDetails(FlowDetails source) {
        if (source.NetDetails != null) {
            this.NetDetails = new NetDetails[source.NetDetails.length];
            for (int i = 0; i < source.NetDetails.length; i++) {
                this.NetDetails[i] = new NetDetails(source.NetDetails[i]);
            }
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.AvgValue != null) {
            this.AvgValue = new Float(source.AvgValue);
        }
        if (source.TotalValue != null) {
            this.TotalValue = new Float(source.TotalValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NetDetails.", this.NetDetails);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "AvgValue", this.AvgValue);
        this.setParamSimple(map, prefix + "TotalValue", this.TotalValue);

    }
}

