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

public class MultiDevicesInfo extends AbstractModel{

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 对称加密密钥，base64 编码，采用对称加密时返回该参数
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * 设备证书，采用非对称加密时返回该参数
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * 设备私钥，采用非对称加密时返回该参数，腾讯云为用户缓存起来，其生命周期与任务生命周期一致
    */
    @SerializedName("DevicePrivateKey")
    @Expose
    private String DevicePrivateKey;

    /**
    * 错误码
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 对称加密密钥，base64 编码，采用对称加密时返回该参数 
     * @return DevicePsk 对称加密密钥，base64 编码，采用对称加密时返回该参数
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set 对称加密密钥，base64 编码，采用对称加密时返回该参数
     * @param DevicePsk 对称加密密钥，base64 编码，采用对称加密时返回该参数
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * Get 设备证书，采用非对称加密时返回该参数 
     * @return DeviceCert 设备证书，采用非对称加密时返回该参数
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * Set 设备证书，采用非对称加密时返回该参数
     * @param DeviceCert 设备证书，采用非对称加密时返回该参数
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * Get 设备私钥，采用非对称加密时返回该参数，腾讯云为用户缓存起来，其生命周期与任务生命周期一致 
     * @return DevicePrivateKey 设备私钥，采用非对称加密时返回该参数，腾讯云为用户缓存起来，其生命周期与任务生命周期一致
     */
    public String getDevicePrivateKey() {
        return this.DevicePrivateKey;
    }

    /**
     * Set 设备私钥，采用非对称加密时返回该参数，腾讯云为用户缓存起来，其生命周期与任务生命周期一致
     * @param DevicePrivateKey 设备私钥，采用非对称加密时返回该参数，腾讯云为用户缓存起来，其生命周期与任务生命周期一致
     */
    public void setDevicePrivateKey(String DevicePrivateKey) {
        this.DevicePrivateKey = DevicePrivateKey;
    }

    /**
     * Get 错误码 
     * @return Result 错误码
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 错误码
     * @param Result 错误码
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 错误信息 
     * @return ErrMsg 错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误信息
     * @param ErrMsg 错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DevicePrivateKey", this.DevicePrivateKey);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

