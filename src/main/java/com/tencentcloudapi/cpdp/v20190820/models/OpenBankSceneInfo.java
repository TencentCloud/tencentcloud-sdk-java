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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankSceneInfo extends AbstractModel {

    /**
    * 用户端实际 ip。汇付渠道必填。
    */
    @SerializedName("PayerClientIp")
    @Expose
    private String PayerClientIp;

    /**
    * 浏览器 User-Agent。
    */
    @SerializedName("PayerUa")
    @Expose
    private String PayerUa;

    /**
    * 用户下单时间。若不上送，服务端默认当前时间。
    */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
    * 终端设备号（门店号或收银设备 ID），示例值：POS1:1。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 终端设备类型。MOBILE_BROWSER:手机浏览器，MOBILE_APP:手机应用程序，TABLET:平板；WATCH:手表，PC:电脑PC，OTHER:其他。
汇付渠道必填。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 用户端实际 ip。汇付渠道必填。 
     * @return PayerClientIp 用户端实际 ip。汇付渠道必填。
     */
    public String getPayerClientIp() {
        return this.PayerClientIp;
    }

    /**
     * Set 用户端实际 ip。汇付渠道必填。
     * @param PayerClientIp 用户端实际 ip。汇付渠道必填。
     */
    public void setPayerClientIp(String PayerClientIp) {
        this.PayerClientIp = PayerClientIp;
    }

    /**
     * Get 浏览器 User-Agent。 
     * @return PayerUa 浏览器 User-Agent。
     */
    public String getPayerUa() {
        return this.PayerUa;
    }

    /**
     * Set 浏览器 User-Agent。
     * @param PayerUa 浏览器 User-Agent。
     */
    public void setPayerUa(String PayerUa) {
        this.PayerUa = PayerUa;
    }

    /**
     * Get 用户下单时间。若不上送，服务端默认当前时间。 
     * @return OrderTime 用户下单时间。若不上送，服务端默认当前时间。
     */
    public String getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 用户下单时间。若不上送，服务端默认当前时间。
     * @param OrderTime 用户下单时间。若不上送，服务端默认当前时间。
     */
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 终端设备号（门店号或收银设备 ID），示例值：POS1:1。 
     * @return DeviceId 终端设备号（门店号或收银设备 ID），示例值：POS1:1。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 终端设备号（门店号或收银设备 ID），示例值：POS1:1。
     * @param DeviceId 终端设备号（门店号或收银设备 ID），示例值：POS1:1。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 终端设备类型。MOBILE_BROWSER:手机浏览器，MOBILE_APP:手机应用程序，TABLET:平板；WATCH:手表，PC:电脑PC，OTHER:其他。
汇付渠道必填。 
     * @return DeviceType 终端设备类型。MOBILE_BROWSER:手机浏览器，MOBILE_APP:手机应用程序，TABLET:平板；WATCH:手表，PC:电脑PC，OTHER:其他。
汇付渠道必填。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 终端设备类型。MOBILE_BROWSER:手机浏览器，MOBILE_APP:手机应用程序，TABLET:平板；WATCH:手表，PC:电脑PC，OTHER:其他。
汇付渠道必填。
     * @param DeviceType 终端设备类型。MOBILE_BROWSER:手机浏览器，MOBILE_APP:手机应用程序，TABLET:平板；WATCH:手表，PC:电脑PC，OTHER:其他。
汇付渠道必填。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
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
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
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
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

