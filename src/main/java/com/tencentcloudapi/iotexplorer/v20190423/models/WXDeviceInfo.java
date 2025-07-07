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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WXDeviceInfo extends AbstractModel {

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备信息
    */
    @SerializedName("WXIoTDeviceInfo")
    @Expose
    private WXIoTDeviceInfo WXIoTDeviceInfo;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备信息 
     * @return WXIoTDeviceInfo 设备信息
     */
    public WXIoTDeviceInfo getWXIoTDeviceInfo() {
        return this.WXIoTDeviceInfo;
    }

    /**
     * Set 设备信息
     * @param WXIoTDeviceInfo 设备信息
     */
    public void setWXIoTDeviceInfo(WXIoTDeviceInfo WXIoTDeviceInfo) {
        this.WXIoTDeviceInfo = WXIoTDeviceInfo;
    }

    public WXDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WXDeviceInfo(WXDeviceInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.WXIoTDeviceInfo != null) {
            this.WXIoTDeviceInfo = new WXIoTDeviceInfo(source.WXIoTDeviceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamObj(map, prefix + "WXIoTDeviceInfo.", this.WXIoTDeviceInfo);

    }
}

