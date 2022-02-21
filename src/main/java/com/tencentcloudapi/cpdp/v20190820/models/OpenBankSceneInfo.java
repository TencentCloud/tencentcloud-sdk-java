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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankSceneInfo extends AbstractModel{

    /**
    * 用户端实际 ip，示例值：14.17.22.32
    */
    @SerializedName("PayerClientIp")
    @Expose
    private String PayerClientIp;

    /**
    * 浏览器 User-Agent
    */
    @SerializedName("PayerUa")
    @Expose
    private String PayerUa;

    /**
    * 用户下单时间，若不上送，服务端默认当前时间
    */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
    * 终端设备号（门店号或收银设备 ID），示例值：POS1:1
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 用户端实际 ip，示例值：14.17.22.32 
     * @return PayerClientIp 用户端实际 ip，示例值：14.17.22.32
     */
    public String getPayerClientIp() {
        return this.PayerClientIp;
    }

    /**
     * Set 用户端实际 ip，示例值：14.17.22.32
     * @param PayerClientIp 用户端实际 ip，示例值：14.17.22.32
     */
    public void setPayerClientIp(String PayerClientIp) {
        this.PayerClientIp = PayerClientIp;
    }

    /**
     * Get 浏览器 User-Agent 
     * @return PayerUa 浏览器 User-Agent
     */
    public String getPayerUa() {
        return this.PayerUa;
    }

    /**
     * Set 浏览器 User-Agent
     * @param PayerUa 浏览器 User-Agent
     */
    public void setPayerUa(String PayerUa) {
        this.PayerUa = PayerUa;
    }

    /**
     * Get 用户下单时间，若不上送，服务端默认当前时间 
     * @return OrderTime 用户下单时间，若不上送，服务端默认当前时间
     */
    public String getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 用户下单时间，若不上送，服务端默认当前时间
     * @param OrderTime 用户下单时间，若不上送，服务端默认当前时间
     */
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 终端设备号（门店号或收银设备 ID），示例值：POS1:1 
     * @return DeviceId 终端设备号（门店号或收银设备 ID），示例值：POS1:1
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 终端设备号（门店号或收银设备 ID），示例值：POS1:1
     * @param DeviceId 终端设备号（门店号或收银设备 ID），示例值：POS1:1
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public OpenBankSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankSceneInfo(OpenBankSceneInfo source) {
        if (source.PayerClientIp != null) {
            this.PayerClientIp = new String(source.PayerClientIp);
        }
        if (source.PayerUa != null) {
            this.PayerUa = new String(source.PayerUa);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new String(source.OrderTime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerClientIp", this.PayerClientIp);
        this.setParamSimple(map, prefix + "PayerUa", this.PayerUa);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

