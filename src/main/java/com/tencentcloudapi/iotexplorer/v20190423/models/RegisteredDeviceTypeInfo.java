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

public class RegisteredDeviceTypeInfo extends AbstractModel {

    /**
    * 已注册设备数
    */
    @SerializedName("NormalDeviceNum")
    @Expose
    private Long NormalDeviceNum;

    /**
    * 已注册网关数
    */
    @SerializedName("GatewayDeviceNum")
    @Expose
    private Long GatewayDeviceNum;

    /**
    * 已注册子设备数
    */
    @SerializedName("SubDeviceNum")
    @Expose
    private Long SubDeviceNum;

    /**
     * Get 已注册设备数 
     * @return NormalDeviceNum 已注册设备数
     */
    public Long getNormalDeviceNum() {
        return this.NormalDeviceNum;
    }

    /**
     * Set 已注册设备数
     * @param NormalDeviceNum 已注册设备数
     */
    public void setNormalDeviceNum(Long NormalDeviceNum) {
        this.NormalDeviceNum = NormalDeviceNum;
    }

    /**
     * Get 已注册网关数 
     * @return GatewayDeviceNum 已注册网关数
     */
    public Long getGatewayDeviceNum() {
        return this.GatewayDeviceNum;
    }

    /**
     * Set 已注册网关数
     * @param GatewayDeviceNum 已注册网关数
     */
    public void setGatewayDeviceNum(Long GatewayDeviceNum) {
        this.GatewayDeviceNum = GatewayDeviceNum;
    }

    /**
     * Get 已注册子设备数 
     * @return SubDeviceNum 已注册子设备数
     */
    public Long getSubDeviceNum() {
        return this.SubDeviceNum;
    }

    /**
     * Set 已注册子设备数
     * @param SubDeviceNum 已注册子设备数
     */
    public void setSubDeviceNum(Long SubDeviceNum) {
        this.SubDeviceNum = SubDeviceNum;
    }

    public RegisteredDeviceTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisteredDeviceTypeInfo(RegisteredDeviceTypeInfo source) {
        if (source.NormalDeviceNum != null) {
            this.NormalDeviceNum = new Long(source.NormalDeviceNum);
        }
        if (source.GatewayDeviceNum != null) {
            this.GatewayDeviceNum = new Long(source.GatewayDeviceNum);
        }
        if (source.SubDeviceNum != null) {
            this.SubDeviceNum = new Long(source.SubDeviceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NormalDeviceNum", this.NormalDeviceNum);
        this.setParamSimple(map, prefix + "GatewayDeviceNum", this.GatewayDeviceNum);
        this.setParamSimple(map, prefix + "SubDeviceNum", this.SubDeviceNum);

    }
}

