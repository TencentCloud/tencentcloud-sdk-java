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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceRequest extends AbstractModel{

    /**
    * 产品ID。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * LoRaWAN 设备地址
    */
    @SerializedName("DevAddr")
    @Expose
    private String DevAddr;

    /**
    * LoRaWAN 应用密钥
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * LoRaWAN 设备唯一标识
    */
    @SerializedName("DevEUI")
    @Expose
    private String DevEUI;

    /**
    * LoRaWAN 应用会话密钥
    */
    @SerializedName("AppSKey")
    @Expose
    private String AppSKey;

    /**
    * LoRaWAN 网络会话密钥
    */
    @SerializedName("NwkSKey")
    @Expose
    private String NwkSKey;

    /**
     * Get 产品ID。 
     * @return ProductId 产品ID。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID。
     * @param ProductId 产品ID。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。 
     * @return DeviceName 设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。
     * @param DeviceName 设备名称。命名规则：[a-zA-Z0-9:_-]{1,48}。
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get LoRaWAN 设备地址 
     * @return DevAddr LoRaWAN 设备地址
     */
    public String getDevAddr() {
        return this.DevAddr;
    }

    /**
     * Set LoRaWAN 设备地址
     * @param DevAddr LoRaWAN 设备地址
     */
    public void setDevAddr(String DevAddr) {
        this.DevAddr = DevAddr;
    }

    /**
     * Get LoRaWAN 应用密钥 
     * @return AppKey LoRaWAN 应用密钥
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set LoRaWAN 应用密钥
     * @param AppKey LoRaWAN 应用密钥
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get LoRaWAN 设备唯一标识 
     * @return DevEUI LoRaWAN 设备唯一标识
     */
    public String getDevEUI() {
        return this.DevEUI;
    }

    /**
     * Set LoRaWAN 设备唯一标识
     * @param DevEUI LoRaWAN 设备唯一标识
     */
    public void setDevEUI(String DevEUI) {
        this.DevEUI = DevEUI;
    }

    /**
     * Get LoRaWAN 应用会话密钥 
     * @return AppSKey LoRaWAN 应用会话密钥
     */
    public String getAppSKey() {
        return this.AppSKey;
    }

    /**
     * Set LoRaWAN 应用会话密钥
     * @param AppSKey LoRaWAN 应用会话密钥
     */
    public void setAppSKey(String AppSKey) {
        this.AppSKey = AppSKey;
    }

    /**
     * Get LoRaWAN 网络会话密钥 
     * @return NwkSKey LoRaWAN 网络会话密钥
     */
    public String getNwkSKey() {
        return this.NwkSKey;
    }

    /**
     * Set LoRaWAN 网络会话密钥
     * @param NwkSKey LoRaWAN 网络会话密钥
     */
    public void setNwkSKey(String NwkSKey) {
        this.NwkSKey = NwkSKey;
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

    }
}

