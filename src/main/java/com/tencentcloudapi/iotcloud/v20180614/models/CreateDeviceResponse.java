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
    * LoRa设备的DevEui，当设备是LoRa设备时，会返回该字段
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
    * LoRa设备的MoteType，当设备是LoRa设备时，会返回该字段
    */
    @SerializedName("LoraMoteType")
    @Expose
    private Integer LoraMoteType;

    /**
    * LoRa设备的AppKey，当设备是LoRa设备时，会返回该字段
    */
    @SerializedName("LoraAppKey")
    @Expose
    private String LoraAppKey;

    /**
    * LoRa设备的NwkKey，当设备是LoRa设备时，会返回该字段
    */
    @SerializedName("LoraNwkKey")
    @Expose
    private String LoraNwkKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
     * 获取LoRa设备的DevEui，当设备是LoRa设备时，会返回该字段
     * @return LoraDevEui LoRa设备的DevEui，当设备是LoRa设备时，会返回该字段
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * 设置LoRa设备的DevEui，当设备是LoRa设备时，会返回该字段
     * @param LoraDevEui LoRa设备的DevEui，当设备是LoRa设备时，会返回该字段
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * 获取LoRa设备的MoteType，当设备是LoRa设备时，会返回该字段
     * @return LoraMoteType LoRa设备的MoteType，当设备是LoRa设备时，会返回该字段
     */
    public Integer getLoraMoteType() {
        return this.LoraMoteType;
    }

    /**
     * 设置LoRa设备的MoteType，当设备是LoRa设备时，会返回该字段
     * @param LoraMoteType LoRa设备的MoteType，当设备是LoRa设备时，会返回该字段
     */
    public void setLoraMoteType(Integer LoraMoteType) {
        this.LoraMoteType = LoraMoteType;
    }

    /**
     * 获取LoRa设备的AppKey，当设备是LoRa设备时，会返回该字段
     * @return LoraAppKey LoRa设备的AppKey，当设备是LoRa设备时，会返回该字段
     */
    public String getLoraAppKey() {
        return this.LoraAppKey;
    }

    /**
     * 设置LoRa设备的AppKey，当设备是LoRa设备时，会返回该字段
     * @param LoraAppKey LoRa设备的AppKey，当设备是LoRa设备时，会返回该字段
     */
    public void setLoraAppKey(String LoraAppKey) {
        this.LoraAppKey = LoraAppKey;
    }

    /**
     * 获取LoRa设备的NwkKey，当设备是LoRa设备时，会返回该字段
     * @return LoraNwkKey LoRa设备的NwkKey，当设备是LoRa设备时，会返回该字段
     */
    public String getLoraNwkKey() {
        return this.LoraNwkKey;
    }

    /**
     * 设置LoRa设备的NwkKey，当设备是LoRa设备时，会返回该字段
     * @param LoraNwkKey LoRa设备的NwkKey，当设备是LoRa设备时，会返回该字段
     */
    public void setLoraNwkKey(String LoraNwkKey) {
        this.LoraNwkKey = LoraNwkKey;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);
        this.setParamSimple(map, prefix + "LoraMoteType", this.LoraMoteType);
        this.setParamSimple(map, prefix + "LoraAppKey", this.LoraAppKey);
        this.setParamSimple(map, prefix + "LoraNwkKey", this.LoraNwkKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

