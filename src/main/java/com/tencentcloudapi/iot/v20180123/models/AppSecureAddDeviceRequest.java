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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppSecureAddDeviceRequest extends AbstractModel{

    /**
    * 访问Token
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 设备签名
    */
    @SerializedName("DeviceSignature")
    @Expose
    private String DeviceSignature;

    /**
     * Get 访问Token 
     * @return AccessToken 访问Token
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set 访问Token
     * @param AccessToken 访问Token
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get 设备签名 
     * @return DeviceSignature 设备签名
     */
    public String getDeviceSignature() {
        return this.DeviceSignature;
    }

    /**
     * Set 设备签名
     * @param DeviceSignature 设备签名
     */
    public void setDeviceSignature(String DeviceSignature) {
        this.DeviceSignature = DeviceSignature;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "DeviceSignature", this.DeviceSignature);

    }
}

