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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserDeviceRequest extends AbstractModel {

    /**
    * 设备ID（从获取设备列表接口ListDevices中获取）
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 设备ID（从获取设备列表接口ListDevices中获取） 
     * @return DeviceId 设备ID（从获取设备列表接口ListDevices中获取）
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID（从获取设备列表接口ListDevices中获取）
     * @param DeviceId 设备ID（从获取设备列表接口ListDevices中获取）
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public DescribeUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserDeviceRequest(DescribeUserDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

