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

public class CreateDeviceRequest extends AbstractModel{

    /**
    * 产品 ID 。创建产品时腾讯云为用户分配全局唯一的 ID
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
    * 设备属性
    */
    @SerializedName("Attribute")
    @Expose
    private Attribute Attribute;

    /**
    * 是否使用自定义PSK，默认不使用
    */
    @SerializedName("DefinedPsk")
    @Expose
    private String DefinedPsk;

    /**
    * 运营商类型，当产品是NB-IoT产品时，此字段必填。1表示中国电信，2表示中国移动，3表示中国联通
    */
    @SerializedName("Isp")
    @Expose
    private Long Isp;

    /**
    * IMEI，当产品是NB-IoT产品时，此字段必填
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * LoRa设备的DevEui，当创建LoRa时，此字段必填
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
    * LoRa设备的MoteType
    */
    @SerializedName("LoraMoteType")
    @Expose
    private Long LoraMoteType;

    /**
    * 创建LoRa设备需要skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
    * LoRa设备的AppKey
    */
    @SerializedName("LoraAppKey")
    @Expose
    private String LoraAppKey;

    /**
     * Get 产品 ID 。创建产品时腾讯云为用户分配全局唯一的 ID 
     * @return ProductId 产品 ID 。创建产品时腾讯云为用户分配全局唯一的 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID 。创建产品时腾讯云为用户分配全局唯一的 ID
     * @param ProductId 产品 ID 。创建产品时腾讯云为用户分配全局唯一的 ID
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
     * Get 设备属性 
     * @return Attribute 设备属性
     */
    public Attribute getAttribute() {
        return this.Attribute;
    }

    /**
     * Set 设备属性
     * @param Attribute 设备属性
     */
    public void setAttribute(Attribute Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get 是否使用自定义PSK，默认不使用 
     * @return DefinedPsk 是否使用自定义PSK，默认不使用
     */
    public String getDefinedPsk() {
        return this.DefinedPsk;
    }

    /**
     * Set 是否使用自定义PSK，默认不使用
     * @param DefinedPsk 是否使用自定义PSK，默认不使用
     */
    public void setDefinedPsk(String DefinedPsk) {
        this.DefinedPsk = DefinedPsk;
    }

    /**
     * Get 运营商类型，当产品是NB-IoT产品时，此字段必填。1表示中国电信，2表示中国移动，3表示中国联通 
     * @return Isp 运营商类型，当产品是NB-IoT产品时，此字段必填。1表示中国电信，2表示中国移动，3表示中国联通
     */
    public Long getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商类型，当产品是NB-IoT产品时，此字段必填。1表示中国电信，2表示中国移动，3表示中国联通
     * @param Isp 运营商类型，当产品是NB-IoT产品时，此字段必填。1表示中国电信，2表示中国移动，3表示中国联通
     */
    public void setIsp(Long Isp) {
        this.Isp = Isp;
    }

    /**
     * Get IMEI，当产品是NB-IoT产品时，此字段必填 
     * @return Imei IMEI，当产品是NB-IoT产品时，此字段必填
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set IMEI，当产品是NB-IoT产品时，此字段必填
     * @param Imei IMEI，当产品是NB-IoT产品时，此字段必填
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get LoRa设备的DevEui，当创建LoRa时，此字段必填 
     * @return LoraDevEui LoRa设备的DevEui，当创建LoRa时，此字段必填
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * Set LoRa设备的DevEui，当创建LoRa时，此字段必填
     * @param LoraDevEui LoRa设备的DevEui，当创建LoRa时，此字段必填
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * Get LoRa设备的MoteType 
     * @return LoraMoteType LoRa设备的MoteType
     */
    public Long getLoraMoteType() {
        return this.LoraMoteType;
    }

    /**
     * Set LoRa设备的MoteType
     * @param LoraMoteType LoRa设备的MoteType
     */
    public void setLoraMoteType(Long LoraMoteType) {
        this.LoraMoteType = LoraMoteType;
    }

    /**
     * Get 创建LoRa设备需要skey 
     * @return Skey 创建LoRa设备需要skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 创建LoRa设备需要skey
     * @param Skey 创建LoRa设备需要skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Get LoRa设备的AppKey 
     * @return LoraAppKey LoRa设备的AppKey
     */
    public String getLoraAppKey() {
        return this.LoraAppKey;
    }

    /**
     * Set LoRa设备的AppKey
     * @param LoraAppKey LoRa设备的AppKey
     */
    public void setLoraAppKey(String LoraAppKey) {
        this.LoraAppKey = LoraAppKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamObj(map, prefix + "Attribute.", this.Attribute);
        this.setParamSimple(map, prefix + "DefinedPsk", this.DefinedPsk);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);
        this.setParamSimple(map, prefix + "LoraMoteType", this.LoraMoteType);
        this.setParamSimple(map, prefix + "Skey", this.Skey);
        this.setParamSimple(map, prefix + "LoraAppKey", this.LoraAppKey);

    }
}

