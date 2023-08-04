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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserDeviceRequest extends AbstractModel{

    /**
    * 设备ID（从获取设备列表接口ListDevices中获取）
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备名称（仅支持中文、英文、数字、_、-，长度不超过32个字符）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * 设备密码（仅国标，网关设备支持）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 设备描述（仅支持中文、英文、数字、_、-，长度不超过128位）
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备接入Ip（仅网关接入支持）
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 设备Port（仅网关接入支持）
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 设备用户名（仅网关接入支持）
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get 设备ID（从获取设备列表接口ListDevices中获取） 
     * @return DeviceId 设备ID（从获取设备列表接口ListDevices中获取）
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID（从获取设备列表接口ListDevices中获取）
     * @param DeviceId 设备ID（从获取设备列表接口ListDevices中获取）
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备名称（仅支持中文、英文、数字、_、-，长度不超过32个字符） 
     * @return Name 设备名称（仅支持中文、英文、数字、_、-，长度不超过32个字符）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称（仅支持中文、英文、数字、_、-，长度不超过32个字符）
     * @param Name 设备名称（仅支持中文、英文、数字、_、-，长度不超过32个字符）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP） 
     * @return TransportProtocol 设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set 设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）
     * @param TransportProtocol 设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get 设备密码（仅国标，网关设备支持） 
     * @return Password 设备密码（仅国标，网关设备支持）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设备密码（仅国标，网关设备支持）
     * @param Password 设备密码（仅国标，网关设备支持）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 设备描述（仅支持中文、英文、数字、_、-，长度不超过128位） 
     * @return Description 设备描述（仅支持中文、英文、数字、_、-，长度不超过128位）
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备描述（仅支持中文、英文、数字、_、-，长度不超过128位）
     * @param Description 设备描述（仅支持中文、英文、数字、_、-，长度不超过128位）
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备接入Ip（仅网关接入支持） 
     * @return Ip 设备接入Ip（仅网关接入支持）
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备接入Ip（仅网关接入支持）
     * @param Ip 设备接入Ip（仅网关接入支持）
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 设备Port（仅网关接入支持） 
     * @return Port 设备Port（仅网关接入支持）
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 设备Port（仅网关接入支持）
     * @param Port 设备Port（仅网关接入支持）
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 设备用户名（仅网关接入支持） 
     * @return Username 设备用户名（仅网关接入支持）
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 设备用户名（仅网关接入支持）
     * @param Username 设备用户名（仅网关接入支持）
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public UpdateUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserDeviceRequest(UpdateUserDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TransportProtocol != null) {
            this.TransportProtocol = new Long(source.TransportProtocol);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

