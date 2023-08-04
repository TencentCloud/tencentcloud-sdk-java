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

public class ListDeviceInfo extends AbstractModel{

    /**
    * 设备 ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备国标编码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 设备状态。0:未注册，1:在线，2:离线，3:禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备流传输协议。1:UDP,2:TCP
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * 设备名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备类型。1:IPC,2:NVR
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备接入服务节点 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 服务节点名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 接入协议。1:RTMP,2:GB,3:GW
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * 设备所属组织 ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 通道数量
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
     * Get 设备 ID 
     * @return DeviceId 设备 ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备 ID
     * @param DeviceId 设备 ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备国标编码 
     * @return Code 设备国标编码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 设备国标编码
     * @param Code 设备国标编码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 设备状态。0:未注册，1:在线，2:离线，3:禁用 
     * @return Status 设备状态。0:未注册，1:在线，2:离线，3:禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态。0:未注册，1:在线，2:离线，3:禁用
     * @param Status 设备状态。0:未注册，1:在线，2:离线，3:禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备流传输协议。1:UDP,2:TCP 
     * @return TransportProtocol 设备流传输协议。1:UDP,2:TCP
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set 设备流传输协议。1:UDP,2:TCP
     * @param TransportProtocol 设备流传输协议。1:UDP,2:TCP
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get 设备名称 
     * @return Name 设备名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称
     * @param Name 设备名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备类型。1:IPC,2:NVR 
     * @return Type 设备类型。1:IPC,2:NVR
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型。1:IPC,2:NVR
     * @param Type 设备类型。1:IPC,2:NVR
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备密码 
     * @return Password 设备密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设备密码
     * @param Password 设备密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备接入服务节点 ID 
     * @return ClusterId 设备接入服务节点 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 设备接入服务节点 ID
     * @param ClusterId 设备接入服务节点 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 服务节点名称 
     * @return ClusterName 服务节点名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 服务节点名称
     * @param ClusterName 服务节点名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 接入协议。1:RTMP,2:GB,3:GW 
     * @return AccessProtocol 接入协议。1:RTMP,2:GB,3:GW
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set 接入协议。1:RTMP,2:GB,3:GW
     * @param AccessProtocol 接入协议。1:RTMP,2:GB,3:GW
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get 设备所属组织 ID 
     * @return OrganizationId 设备所属组织 ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 设备所属组织 ID
     * @param OrganizationId 设备所属组织 ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 通道数量 
     * @return ChannelNum 通道数量
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * Set 通道数量
     * @param ChannelNum 通道数量
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    public ListDeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDeviceInfo(ListDeviceInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TransportProtocol != null) {
            this.TransportProtocol = new Long(source.TransportProtocol);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AccessProtocol != null) {
            this.AccessProtocol = new Long(source.AccessProtocol);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.ChannelNum != null) {
            this.ChannelNum = new Long(source.ChannelNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AccessProtocol", this.AccessProtocol);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);

    }
}

