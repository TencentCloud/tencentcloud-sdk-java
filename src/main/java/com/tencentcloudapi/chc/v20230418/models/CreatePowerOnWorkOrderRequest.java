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

public class CreatePowerOnWorkOrderRequest extends AbstractModel {

    /**
    * 机房id
    */
    @SerializedName("IdcId")
    @Expose
    private Long IdcId;

    /**
    * 设备类型，server, netDevice
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 设备sn列表
    */
    @SerializedName("DeviceSnList")
    @Expose
    private String [] DeviceSnList;

    /**
     * Get 机房id 
     * @return IdcId 机房id
     */
    public Long getIdcId() {
        return this.IdcId;
    }

    /**
     * Set 机房id
     * @param IdcId 机房id
     */
    public void setIdcId(Long IdcId) {
        this.IdcId = IdcId;
    }

    /**
     * Get 设备类型，server, netDevice 
     * @return DeviceType 设备类型，server, netDevice
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，server, netDevice
     * @param DeviceType 设备类型，server, netDevice
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 设备sn列表 
     * @return DeviceSnList 设备sn列表
     */
    public String [] getDeviceSnList() {
        return this.DeviceSnList;
    }

    /**
     * Set 设备sn列表
     * @param DeviceSnList 设备sn列表
     */
    public void setDeviceSnList(String [] DeviceSnList) {
        this.DeviceSnList = DeviceSnList;
    }

    public CreatePowerOnWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePowerOnWorkOrderRequest(CreatePowerOnWorkOrderRequest source) {
        if (source.IdcId != null) {
            this.IdcId = new Long(source.IdcId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.DeviceSnList != null) {
            this.DeviceSnList = new String[source.DeviceSnList.length];
            for (int i = 0; i < source.DeviceSnList.length; i++) {
                this.DeviceSnList[i] = new String(source.DeviceSnList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdcId", this.IdcId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArraySimple(map, prefix + "DeviceSnList.", this.DeviceSnList);

    }
}

