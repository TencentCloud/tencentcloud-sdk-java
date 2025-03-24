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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceRackOn extends AbstractModel {

    /**
    * 设备sn
    */
    @SerializedName("DeviceSn")
    @Expose
    private String DeviceSn;

    /**
    * 目标机架
    */
    @SerializedName("DstRackName")
    @Expose
    private String DstRackName;

    /**
    * 目标机位,服务器必传,网络设备不用传
    */
    @SerializedName("DstPositionCode")
    @Expose
    private String DstPositionCode;

    /**
    * 设备ip
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
     * Get 设备sn 
     * @return DeviceSn 设备sn
     */
    public String getDeviceSn() {
        return this.DeviceSn;
    }

    /**
     * Set 设备sn
     * @param DeviceSn 设备sn
     */
    public void setDeviceSn(String DeviceSn) {
        this.DeviceSn = DeviceSn;
    }

    /**
     * Get 目标机架 
     * @return DstRackName 目标机架
     */
    public String getDstRackName() {
        return this.DstRackName;
    }

    /**
     * Set 目标机架
     * @param DstRackName 目标机架
     */
    public void setDstRackName(String DstRackName) {
        this.DstRackName = DstRackName;
    }

    /**
     * Get 目标机位,服务器必传,网络设备不用传 
     * @return DstPositionCode 目标机位,服务器必传,网络设备不用传
     */
    public String getDstPositionCode() {
        return this.DstPositionCode;
    }

    /**
     * Set 目标机位,服务器必传,网络设备不用传
     * @param DstPositionCode 目标机位,服务器必传,网络设备不用传
     */
    public void setDstPositionCode(String DstPositionCode) {
        this.DstPositionCode = DstPositionCode;
    }

    /**
     * Get 设备ip 
     * @return DstIp 设备ip
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 设备ip
     * @param DstIp 设备ip
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    public DeviceRackOn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceRackOn(DeviceRackOn source) {
        if (source.DeviceSn != null) {
            this.DeviceSn = new String(source.DeviceSn);
        }
        if (source.DstRackName != null) {
            this.DstRackName = new String(source.DstRackName);
        }
        if (source.DstPositionCode != null) {
            this.DstPositionCode = new String(source.DstPositionCode);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceSn", this.DeviceSn);
        this.setParamSimple(map, prefix + "DstRackName", this.DstRackName);
        this.setParamSimple(map, prefix + "DstPositionCode", this.DstPositionCode);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);

    }
}

