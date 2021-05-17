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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo extends AbstractModel{

    /**
    * 运营商
1：移动 
2：电信
3：联通
4：广电
99：其他
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * 设备操作系统：
1：Android
2： IOS
99：其他
    */
    @SerializedName("OS")
    @Expose
    private Long OS;

    /**
    * 设备唯一标识
IOS 填写 IDFV
Android 填写 IMEI
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 用户手机号码
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 无线信息
1：4G
2：5G
3：WIFI
99：其他
    */
    @SerializedName("Wireless")
    @Expose
    private Long Wireless;

    /**
     * Get 运营商
1：移动 
2：电信
3：联通
4：广电
99：其他 
     * @return Vendor 运营商
1：移动 
2：电信
3：联通
4：广电
99：其他
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set 运营商
1：移动 
2：电信
3：联通
4：广电
99：其他
     * @param Vendor 运营商
1：移动 
2：电信
3：联通
4：广电
99：其他
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get 设备操作系统：
1：Android
2： IOS
99：其他 
     * @return OS 设备操作系统：
1：Android
2： IOS
99：其他
     */
    public Long getOS() {
        return this.OS;
    }

    /**
     * Set 设备操作系统：
1：Android
2： IOS
99：其他
     * @param OS 设备操作系统：
1：Android
2： IOS
99：其他
     */
    public void setOS(Long OS) {
        this.OS = OS;
    }

    /**
     * Get 设备唯一标识
IOS 填写 IDFV
Android 填写 IMEI 
     * @return DeviceId 设备唯一标识
IOS 填写 IDFV
Android 填写 IMEI
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
IOS 填写 IDFV
Android 填写 IMEI
     * @param DeviceId 设备唯一标识
IOS 填写 IDFV
Android 填写 IMEI
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 用户手机号码 
     * @return PhoneNum 用户手机号码
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 用户手机号码
     * @param PhoneNum 用户手机号码
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 无线信息
1：4G
2：5G
3：WIFI
99：其他 
     * @return Wireless 无线信息
1：4G
2：5G
3：WIFI
99：其他
     */
    public Long getWireless() {
        return this.Wireless;
    }

    /**
     * Set 无线信息
1：4G
2：5G
3：WIFI
99：其他
     * @param Wireless 无线信息
1：4G
2：5G
3：WIFI
99：其他
     */
    public void setWireless(Long Wireless) {
        this.Wireless = Wireless;
    }

    public DeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceInfo(DeviceInfo source) {
        if (source.Vendor != null) {
            this.Vendor = new Long(source.Vendor);
        }
        if (source.OS != null) {
            this.OS = new Long(source.OS);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Wireless != null) {
            this.Wireless = new Long(source.Wireless);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Wireless", this.Wireless);

    }
}

