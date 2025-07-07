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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeviceDataRequest extends AbstractModel {

    /**
    * 设备唯一标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
     * Get 设备唯一标识 
     * @return DeviceId 设备唯一标识
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
     * @param DeviceId 设备唯一标识
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称 
     * @return NickName 设备名称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 设备名称
     * @param NickName 设备名称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    public ModifyDeviceDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeviceDataRequest(ModifyDeviceDataRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);

    }
}

