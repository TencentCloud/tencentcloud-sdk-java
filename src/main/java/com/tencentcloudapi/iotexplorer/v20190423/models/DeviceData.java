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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceData extends AbstractModel {

    /**
    * 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数。
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * 设备名称。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数。
    */
    @SerializedName("DevicePrivateKey")
    @Expose
    private String DevicePrivateKey;

    /**
    * 对称加密密钥，base64编码。采用对称加密时返回该参数。
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
     * Get 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数。 
     * @return DeviceCert 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数。
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * Set 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数。
     * @param DeviceCert 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数。
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * Get 设备名称。 
     * @return DeviceName 设备名称。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称。
     * @param DeviceName 设备名称。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数。 
     * @return DevicePrivateKey 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数。
     */
    public String getDevicePrivateKey() {
        return this.DevicePrivateKey;
    }

    /**
     * Set 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数。
     * @param DevicePrivateKey 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数。
     */
    public void setDevicePrivateKey(String DevicePrivateKey) {
        this.DevicePrivateKey = DevicePrivateKey;
    }

    /**
     * Get 对称加密密钥，base64编码。采用对称加密时返回该参数。 
     * @return DevicePsk 对称加密密钥，base64编码。采用对称加密时返回该参数。
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set 对称加密密钥，base64编码。采用对称加密时返回该参数。
     * @param DevicePsk 对称加密密钥，base64编码。采用对称加密时返回该参数。
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    public DeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceData(DeviceData source) {
        if (source.DeviceCert != null) {
            this.DeviceCert = new String(source.DeviceCert);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DevicePrivateKey != null) {
            this.DevicePrivateKey = new String(source.DevicePrivateKey);
        }
        if (source.DevicePsk != null) {
            this.DevicePsk = new String(source.DevicePsk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DevicePrivateKey", this.DevicePrivateKey);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);

    }
}

