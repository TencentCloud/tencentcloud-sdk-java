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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivateDeviceInfo extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 设备激活信息
    */
    @SerializedName("DeviceActivationDetails")
    @Expose
    private DeviceActivationDetail DeviceActivationDetails;

    /**
    * 已注册设备类型信息
    */
    @SerializedName("RegisteredDeviceType")
    @Expose
    private RegisteredDeviceTypeInfo RegisteredDeviceType;

    /**
    * 已注册设备通信类型信息
    */
    @SerializedName("RegisteredDeviceNetType")
    @Expose
    private RegisteredDeviceNetTypeInfo RegisteredDeviceNetType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 设备激活信息 
     * @return DeviceActivationDetails 设备激活信息
     */
    public DeviceActivationDetail getDeviceActivationDetails() {
        return this.DeviceActivationDetails;
    }

    /**
     * Set 设备激活信息
     * @param DeviceActivationDetails 设备激活信息
     */
    public void setDeviceActivationDetails(DeviceActivationDetail DeviceActivationDetails) {
        this.DeviceActivationDetails = DeviceActivationDetails;
    }

    /**
     * Get 已注册设备类型信息 
     * @return RegisteredDeviceType 已注册设备类型信息
     */
    public RegisteredDeviceTypeInfo getRegisteredDeviceType() {
        return this.RegisteredDeviceType;
    }

    /**
     * Set 已注册设备类型信息
     * @param RegisteredDeviceType 已注册设备类型信息
     */
    public void setRegisteredDeviceType(RegisteredDeviceTypeInfo RegisteredDeviceType) {
        this.RegisteredDeviceType = RegisteredDeviceType;
    }

    /**
     * Get 已注册设备通信类型信息 
     * @return RegisteredDeviceNetType 已注册设备通信类型信息
     */
    public RegisteredDeviceNetTypeInfo getRegisteredDeviceNetType() {
        return this.RegisteredDeviceNetType;
    }

    /**
     * Set 已注册设备通信类型信息
     * @param RegisteredDeviceNetType 已注册设备通信类型信息
     */
    public void setRegisteredDeviceNetType(RegisteredDeviceNetTypeInfo RegisteredDeviceNetType) {
        this.RegisteredDeviceNetType = RegisteredDeviceNetType;
    }

    public ActivateDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateDeviceInfo(ActivateDeviceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.DeviceActivationDetails != null) {
            this.DeviceActivationDetails = new DeviceActivationDetail(source.DeviceActivationDetails);
        }
        if (source.RegisteredDeviceType != null) {
            this.RegisteredDeviceType = new RegisteredDeviceTypeInfo(source.RegisteredDeviceType);
        }
        if (source.RegisteredDeviceNetType != null) {
            this.RegisteredDeviceNetType = new RegisteredDeviceNetTypeInfo(source.RegisteredDeviceNetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "DeviceActivationDetails.", this.DeviceActivationDetails);
        this.setParamObj(map, prefix + "RegisteredDeviceType.", this.RegisteredDeviceType);
        this.setParamObj(map, prefix + "RegisteredDeviceNetType.", this.RegisteredDeviceNetType);

    }
}

