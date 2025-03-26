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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageDeviceRiskInput extends AbstractModel {

    /**
    * 设备操作平台  1：android
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 设备类型  6: oaid_md5(32位小写)
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 根据 DeviceType 填写设备标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 用户ip，只支持ipv4
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
     * Get 设备操作平台  1：android 
     * @return OsType 设备操作平台  1：android
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 设备操作平台  1：android
     * @param OsType 设备操作平台  1：android
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 设备类型  6: oaid_md5(32位小写) 
     * @return DeviceType 设备类型  6: oaid_md5(32位小写)
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型  6: oaid_md5(32位小写)
     * @param DeviceType 设备类型  6: oaid_md5(32位小写)
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 根据 DeviceType 填写设备标识 
     * @return DeviceId 根据 DeviceType 填写设备标识
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 根据 DeviceType 填写设备标识
     * @param DeviceId 根据 DeviceType 填写设备标识
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 用户ip，只支持ipv4 
     * @return ClientIp 用户ip，只支持ipv4
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 用户ip，只支持ipv4
     * @param ClientIp 用户ip，只支持ipv4
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    public ManageDeviceRiskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageDeviceRiskInput(ManageDeviceRiskInput source) {
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);

    }
}

