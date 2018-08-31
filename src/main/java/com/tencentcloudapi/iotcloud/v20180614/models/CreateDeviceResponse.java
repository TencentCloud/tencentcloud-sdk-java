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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceResponse  extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 对称加密密钥，base64编码。采用对称加密时返回该参数
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数
    */
    @SerializedName("DevicePrivateKey")
    @Expose
    private String DevicePrivateKey;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取对称加密密钥，base64编码。采用对称加密时返回该参数
     * @return DevicePsk 对称加密密钥，base64编码。采用对称加密时返回该参数
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * 设置对称加密密钥，base64编码。采用对称加密时返回该参数
     * @param DevicePsk 对称加密密钥，base64编码。采用对称加密时返回该参数
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * 获取设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数
     * @return DeviceCert 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * 设置设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数
     * @param DeviceCert 设备证书，用于 TLS 建立链接时校验客户端身份。采用非对称加密时返回该参数
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * 获取设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数
     * @return DevicePrivateKey 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数
     */
    public String getDevicePrivateKey() {
        return this.DevicePrivateKey;
    }

    /**
     * 设置设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数
     * @param DevicePrivateKey 设备私钥，用于 TLS 建立链接时校验客户端身份，腾讯云后台不保存，请妥善保管。采用非对称加密时返回该参数
     */
    public void setDevicePrivateKey(String DevicePrivateKey) {
        this.DevicePrivateKey = DevicePrivateKey;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DevicePrivateKey", this.DevicePrivateKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

