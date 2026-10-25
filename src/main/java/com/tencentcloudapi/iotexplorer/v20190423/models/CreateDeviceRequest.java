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

public class CreateDeviceRequest extends AbstractModel {

    /**
    * <p>产品ID。</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>LoRaWAN 设备地址</p>
    */
    @SerializedName("DevAddr")
    @Expose
    private String DevAddr;

    /**
    * <p>LoRaWAN 应用密钥</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>LoRaWAN 设备唯一标识</p>
    */
    @SerializedName("DevEUI")
    @Expose
    private String DevEUI;

    /**
    * <p>LoRaWAN 应用会话密钥</p>
    */
    @SerializedName("AppSKey")
    @Expose
    private String AppSKey;

    /**
    * <p>LoRaWAN 网络会话密钥</p>
    */
    @SerializedName("NwkSKey")
    @Expose
    private String NwkSKey;

    /**
    * <p>手动指定设备的PSK密钥</p>
    */
    @SerializedName("DefinedPsk")
    @Expose
    private String DefinedPsk;

    /**
    * <p>设备证书。第三方CA证书认证的产品下必填；腾讯云CA证书产品传入会报错；非证书认证产品传入会被忽略</p>
    */
    @SerializedName("TlsCrt")
    @Expose
    private String TlsCrt;

    /**
     * Get <p>产品ID。</p> 
     * @return ProductId <p>产品ID。</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID。</p>
     * @param ProductId <p>产品ID。</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。</p> 
     * @return DeviceName <p>设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。</p>
     * @param DeviceName <p>设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>LoRaWAN 设备地址</p> 
     * @return DevAddr <p>LoRaWAN 设备地址</p>
     */
    public String getDevAddr() {
        return this.DevAddr;
    }

    /**
     * Set <p>LoRaWAN 设备地址</p>
     * @param DevAddr <p>LoRaWAN 设备地址</p>
     */
    public void setDevAddr(String DevAddr) {
        this.DevAddr = DevAddr;
    }

    /**
     * Get <p>LoRaWAN 应用密钥</p> 
     * @return AppKey <p>LoRaWAN 应用密钥</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>LoRaWAN 应用密钥</p>
     * @param AppKey <p>LoRaWAN 应用密钥</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>LoRaWAN 设备唯一标识</p> 
     * @return DevEUI <p>LoRaWAN 设备唯一标识</p>
     */
    public String getDevEUI() {
        return this.DevEUI;
    }

    /**
     * Set <p>LoRaWAN 设备唯一标识</p>
     * @param DevEUI <p>LoRaWAN 设备唯一标识</p>
     */
    public void setDevEUI(String DevEUI) {
        this.DevEUI = DevEUI;
    }

    /**
     * Get <p>LoRaWAN 应用会话密钥</p> 
     * @return AppSKey <p>LoRaWAN 应用会话密钥</p>
     */
    public String getAppSKey() {
        return this.AppSKey;
    }

    /**
     * Set <p>LoRaWAN 应用会话密钥</p>
     * @param AppSKey <p>LoRaWAN 应用会话密钥</p>
     */
    public void setAppSKey(String AppSKey) {
        this.AppSKey = AppSKey;
    }

    /**
     * Get <p>LoRaWAN 网络会话密钥</p> 
     * @return NwkSKey <p>LoRaWAN 网络会话密钥</p>
     */
    public String getNwkSKey() {
        return this.NwkSKey;
    }

    /**
     * Set <p>LoRaWAN 网络会话密钥</p>
     * @param NwkSKey <p>LoRaWAN 网络会话密钥</p>
     */
    public void setNwkSKey(String NwkSKey) {
        this.NwkSKey = NwkSKey;
    }

    /**
     * Get <p>手动指定设备的PSK密钥</p> 
     * @return DefinedPsk <p>手动指定设备的PSK密钥</p>
     */
    public String getDefinedPsk() {
        return this.DefinedPsk;
    }

    /**
     * Set <p>手动指定设备的PSK密钥</p>
     * @param DefinedPsk <p>手动指定设备的PSK密钥</p>
     */
    public void setDefinedPsk(String DefinedPsk) {
        this.DefinedPsk = DefinedPsk;
    }

    /**
     * Get <p>设备证书。第三方CA证书认证的产品下必填；腾讯云CA证书产品传入会报错；非证书认证产品传入会被忽略</p> 
     * @return TlsCrt <p>设备证书。第三方CA证书认证的产品下必填；腾讯云CA证书产品传入会报错；非证书认证产品传入会被忽略</p>
     */
    public String getTlsCrt() {
        return this.TlsCrt;
    }

    /**
     * Set <p>设备证书。第三方CA证书认证的产品下必填；腾讯云CA证书产品传入会报错；非证书认证产品传入会被忽略</p>
     * @param TlsCrt <p>设备证书。第三方CA证书认证的产品下必填；腾讯云CA证书产品传入会报错；非证书认证产品传入会被忽略</p>
     */
    public void setTlsCrt(String TlsCrt) {
        this.TlsCrt = TlsCrt;
    }

    public CreateDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceRequest(CreateDeviceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DevAddr != null) {
            this.DevAddr = new String(source.DevAddr);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.DevEUI != null) {
            this.DevEUI = new String(source.DevEUI);
        }
        if (source.AppSKey != null) {
            this.AppSKey = new String(source.AppSKey);
        }
        if (source.NwkSKey != null) {
            this.NwkSKey = new String(source.NwkSKey);
        }
        if (source.DefinedPsk != null) {
            this.DefinedPsk = new String(source.DefinedPsk);
        }
        if (source.TlsCrt != null) {
            this.TlsCrt = new String(source.TlsCrt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DevAddr", this.DevAddr);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "DevEUI", this.DevEUI);
        this.setParamSimple(map, prefix + "AppSKey", this.AppSKey);
        this.setParamSimple(map, prefix + "NwkSKey", this.NwkSKey);
        this.setParamSimple(map, prefix + "DefinedPsk", this.DefinedPsk);
        this.setParamSimple(map, prefix + "TlsCrt", this.TlsCrt);

    }
}

