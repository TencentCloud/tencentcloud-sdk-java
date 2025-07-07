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

public class DeviceModifyInfo extends AbstractModel {

    /**
    * 设备id
    */
    @SerializedName("WID")
    @Expose
    private String WID;

    /**
    * 修改后的设备名字
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
     * Get 设备id 
     * @return WID 设备id
     */
    public String getWID() {
        return this.WID;
    }

    /**
     * Set 设备id
     * @param WID 设备id
     */
    public void setWID(String WID) {
        this.WID = WID;
    }

    /**
     * Get 修改后的设备名字 
     * @return DeviceName 修改后的设备名字
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 修改后的设备名字
     * @param DeviceName 修改后的设备名字
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public DeviceModifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceModifyInfo(DeviceModifyInfo source) {
        if (source.WID != null) {
            this.WID = new String(source.WID);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WID", this.WID);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

