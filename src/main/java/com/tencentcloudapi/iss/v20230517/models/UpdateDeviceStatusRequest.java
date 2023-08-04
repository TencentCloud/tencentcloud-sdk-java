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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDeviceStatusRequest extends AbstractModel{

    /**
    * 设备 ID（从获取设备列表接口ListDevices中获取）
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 禁用启用状态码（2：启用，3:禁用）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 设备 ID（从获取设备列表接口ListDevices中获取） 
     * @return DeviceId 设备 ID（从获取设备列表接口ListDevices中获取）
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备 ID（从获取设备列表接口ListDevices中获取）
     * @param DeviceId 设备 ID（从获取设备列表接口ListDevices中获取）
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 禁用启用状态码（2：启用，3:禁用） 
     * @return Status 禁用启用状态码（2：启用，3:禁用）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 禁用启用状态码（2：启用，3:禁用）
     * @param Status 禁用启用状态码（2：启用，3:禁用）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdateDeviceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceStatusRequest(UpdateDeviceStatusRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

