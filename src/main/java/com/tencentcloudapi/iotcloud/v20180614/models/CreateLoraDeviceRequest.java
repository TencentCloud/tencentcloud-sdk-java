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

public class CreateLoraDeviceRequest extends AbstractModel{

    /**
    * 产品 ID ，创建产品时腾讯云为用户分配全局唯一的 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备类型 ，目前支持A、B、C三种
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * LoRa应用UUID
    */
    @SerializedName("AppEui")
    @Expose
    private String AppEui;

    /**
    * LoRa设备UUID
    */
    @SerializedName("DeviceEui")
    @Expose
    private String DeviceEui;

    /**
    * LoRa应用密钥
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * LoRa设备验证密钥
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * 设备备注
    */
    @SerializedName("Memo")
    @Expose
    private String Memo;

    /**
     * Get 产品 ID ，创建产品时腾讯云为用户分配全局唯一的 ID 
     * @return ProductId 产品 ID ，创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID ，创建产品时腾讯云为用户分配全局唯一的 ID
     * @param ProductId 产品 ID ，创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备类型 ，目前支持A、B、C三种 
     * @return DeviceType 设备类型 ，目前支持A、B、C三种
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型 ，目前支持A、B、C三种
     * @param DeviceType 设备类型 ，目前支持A、B、C三种
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get LoRa应用UUID 
     * @return AppEui LoRa应用UUID
     */
    public String getAppEui() {
        return this.AppEui;
    }

    /**
     * Set LoRa应用UUID
     * @param AppEui LoRa应用UUID
     */
    public void setAppEui(String AppEui) {
        this.AppEui = AppEui;
    }

    /**
     * Get LoRa设备UUID 
     * @return DeviceEui LoRa设备UUID
     */
    public String getDeviceEui() {
        return this.DeviceEui;
    }

    /**
     * Set LoRa设备UUID
     * @param DeviceEui LoRa设备UUID
     */
    public void setDeviceEui(String DeviceEui) {
        this.DeviceEui = DeviceEui;
    }

    /**
     * Get LoRa应用密钥 
     * @return AppKey LoRa应用密钥
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set LoRa应用密钥
     * @param AppKey LoRa应用密钥
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get LoRa设备验证密钥 
     * @return AuthKey LoRa设备验证密钥
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set LoRa设备验证密钥
     * @param AuthKey LoRa设备验证密钥
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get 设备备注 
     * @return Memo 设备备注
     */
    public String getMemo() {
        return this.Memo;
    }

    /**
     * Set 设备备注
     * @param Memo 设备备注
     */
    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "AppEui", this.AppEui);
        this.setParamSimple(map, prefix + "DeviceEui", this.DeviceEui);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);
        this.setParamSimple(map, prefix + "Memo", this.Memo);

    }
}

