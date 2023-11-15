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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceStatusInfo extends AbstractModel {

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 设备状态（online=normal+fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * 设备状态更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceStatusUpdateTime")
    @Expose
    private String DeviceStatusUpdateTime;

    /**
    * 设备业务状态（normal、fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 推流状态。推流中-true，未推流-false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAlive")
    @Expose
    private Boolean IsAlive;

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WID 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WID 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 设备状态（online=normal+fault、offline）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceStatus 设备状态（online=normal+fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 设备状态（online=normal+fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceStatus 设备状态（online=normal+fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get 设备状态更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceStatusUpdateTime 设备状态更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceStatusUpdateTime() {
        return this.DeviceStatusUpdateTime;
    }

    /**
     * Set 设备状态更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceStatusUpdateTime 设备状态更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceStatusUpdateTime(String DeviceStatusUpdateTime) {
        this.DeviceStatusUpdateTime = DeviceStatusUpdateTime;
    }

    /**
     * Get 设备业务状态（normal、fault、offline）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 设备业务状态（normal、fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设备业务状态（normal、fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 设备业务状态（normal、fault、offline）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 推流状态。推流中-true，未推流-false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAlive 推流状态。推流中-true，未推流-false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAlive() {
        return this.IsAlive;
    }

    /**
     * Set 推流状态。推流中-true，未推流-false
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAlive 推流状态。推流中-true，未推流-false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAlive(Boolean IsAlive) {
        this.IsAlive = IsAlive;
    }

    public DeviceStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceStatusInfo(DeviceStatusInfo source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
        if (source.DeviceStatusUpdateTime != null) {
            this.DeviceStatusUpdateTime = new String(source.DeviceStatusUpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsAlive != null) {
            this.IsAlive = new Boolean(source.IsAlive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "DeviceStatusUpdateTime", this.DeviceStatusUpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAlive", this.IsAlive);

    }
}

