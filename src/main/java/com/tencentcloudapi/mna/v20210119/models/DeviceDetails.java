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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDetails extends AbstractModel {

    /**
    * 设备基本信息
    */
    @SerializedName("DeviceBaseInfo")
    @Expose
    private DeviceBaseInfo DeviceBaseInfo;

    /**
    * 设备网络信息
    */
    @SerializedName("DeviceNetInfo")
    @Expose
    private DeviceNetInfo [] DeviceNetInfo;

    /**
    * 聚合服务器地址
    */
    @SerializedName("GatewaySite")
    @Expose
    private String GatewaySite;

    /**
    * 业务下行速率
    */
    @SerializedName("BusinessDownRate")
    @Expose
    private Float BusinessDownRate;

    /**
    * 业务上行速率
    */
    @SerializedName("BusinessUpRate")
    @Expose
    private Float BusinessUpRate;

    /**
     * Get 设备基本信息 
     * @return DeviceBaseInfo 设备基本信息
     */
    public DeviceBaseInfo getDeviceBaseInfo() {
        return this.DeviceBaseInfo;
    }

    /**
     * Set 设备基本信息
     * @param DeviceBaseInfo 设备基本信息
     */
    public void setDeviceBaseInfo(DeviceBaseInfo DeviceBaseInfo) {
        this.DeviceBaseInfo = DeviceBaseInfo;
    }

    /**
     * Get 设备网络信息 
     * @return DeviceNetInfo 设备网络信息
     */
    public DeviceNetInfo [] getDeviceNetInfo() {
        return this.DeviceNetInfo;
    }

    /**
     * Set 设备网络信息
     * @param DeviceNetInfo 设备网络信息
     */
    public void setDeviceNetInfo(DeviceNetInfo [] DeviceNetInfo) {
        this.DeviceNetInfo = DeviceNetInfo;
    }

    /**
     * Get 聚合服务器地址 
     * @return GatewaySite 聚合服务器地址
     */
    public String getGatewaySite() {
        return this.GatewaySite;
    }

    /**
     * Set 聚合服务器地址
     * @param GatewaySite 聚合服务器地址
     */
    public void setGatewaySite(String GatewaySite) {
        this.GatewaySite = GatewaySite;
    }

    /**
     * Get 业务下行速率 
     * @return BusinessDownRate 业务下行速率
     */
    public Float getBusinessDownRate() {
        return this.BusinessDownRate;
    }

    /**
     * Set 业务下行速率
     * @param BusinessDownRate 业务下行速率
     */
    public void setBusinessDownRate(Float BusinessDownRate) {
        this.BusinessDownRate = BusinessDownRate;
    }

    /**
     * Get 业务上行速率 
     * @return BusinessUpRate 业务上行速率
     */
    public Float getBusinessUpRate() {
        return this.BusinessUpRate;
    }

    /**
     * Set 业务上行速率
     * @param BusinessUpRate 业务上行速率
     */
    public void setBusinessUpRate(Float BusinessUpRate) {
        this.BusinessUpRate = BusinessUpRate;
    }

    public DeviceDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDetails(DeviceDetails source) {
        if (source.DeviceBaseInfo != null) {
            this.DeviceBaseInfo = new DeviceBaseInfo(source.DeviceBaseInfo);
        }
        if (source.DeviceNetInfo != null) {
            this.DeviceNetInfo = new DeviceNetInfo[source.DeviceNetInfo.length];
            for (int i = 0; i < source.DeviceNetInfo.length; i++) {
                this.DeviceNetInfo[i] = new DeviceNetInfo(source.DeviceNetInfo[i]);
            }
        }
        if (source.GatewaySite != null) {
            this.GatewaySite = new String(source.GatewaySite);
        }
        if (source.BusinessDownRate != null) {
            this.BusinessDownRate = new Float(source.BusinessDownRate);
        }
        if (source.BusinessUpRate != null) {
            this.BusinessUpRate = new Float(source.BusinessUpRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DeviceBaseInfo.", this.DeviceBaseInfo);
        this.setParamArrayObj(map, prefix + "DeviceNetInfo.", this.DeviceNetInfo);
        this.setParamSimple(map, prefix + "GatewaySite", this.GatewaySite);
        this.setParamSimple(map, prefix + "BusinessDownRate", this.BusinessDownRate);
        this.setParamSimple(map, prefix + "BusinessUpRate", this.BusinessUpRate);

    }
}

