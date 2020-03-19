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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceAccess extends AbstractModel{

    /**
    * 访问实例所需要的凭据
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * 服务部署Id
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例公网IP
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * 操作系统
    */
    @SerializedName("OperatingSystem")
    @Expose
    private String OperatingSystem;

    /**
     * Get 访问实例所需要的凭据 
     * @return Credentials 访问实例所需要的凭据
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 访问实例所需要的凭据
     * @param Credentials 访问实例所需要的凭据
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get 服务部署Id 
     * @return FleetId 服务部署Id
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务部署Id
     * @param FleetId 服务部署Id
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

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
     * Get 实例公网IP 
     * @return IpAddress 实例公网IP
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 实例公网IP
     * @param IpAddress 实例公网IP
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get 操作系统 
     * @return OperatingSystem 操作系统
     */
    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    /**
     * Set 操作系统
     * @param OperatingSystem 操作系统
     */
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "OperatingSystem", this.OperatingSystem);

    }
}

