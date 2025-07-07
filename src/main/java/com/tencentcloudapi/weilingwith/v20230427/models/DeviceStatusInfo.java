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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceStatusInfo extends AbstractModel {

    /**
    * 设备ID
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 设备状态（online=normal+fault、offline）
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
    * 设备状态更新时间
    */
    @SerializedName("DeviceStatusUpdateTime")
    @Expose
    private String DeviceStatusUpdateTime;

    /**
    * 设备业务状态（normal、fault、offline）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 推流状态。推流中-true，未推流-false
    */
    @SerializedName("IsAlive")
    @Expose
    private Boolean IsAlive;

    /**
     * Get 设备ID 
     * @return WID 设备ID
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备ID
     * @param WID 设备ID
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 设备状态（online=normal+fault、offline） 
     * @return DeviceStatus 设备状态（online=normal+fault、offline）
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 设备状态（online=normal+fault、offline）
     * @param DeviceStatus 设备状态（online=normal+fault、offline）
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * Get 设备状态更新时间 
     * @return DeviceStatusUpdateTime 设备状态更新时间
     */
    public String getDeviceStatusUpdateTime() {
        return this.DeviceStatusUpdateTime;
    }

    /**
     * Set 设备状态更新时间
     * @param DeviceStatusUpdateTime 设备状态更新时间
     */
    public void setDeviceStatusUpdateTime(String DeviceStatusUpdateTime) {
        this.DeviceStatusUpdateTime = DeviceStatusUpdateTime;
    }

    /**
     * Get 设备业务状态（normal、fault、offline） 
     * @return Status 设备业务状态（normal、fault、offline）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设备业务状态（normal、fault、offline）
     * @param Status 设备业务状态（normal、fault、offline）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 推流状态。推流中-true，未推流-false 
     * @return IsAlive 推流状态。推流中-true，未推流-false
     */
    public Boolean getIsAlive() {
        return this.IsAlive;
    }

    /**
     * Set 推流状态。推流中-true，未推流-false
     * @param IsAlive 推流状态。推流中-true，未推流-false
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

