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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstanceNetInfo extends AbstractModel{

    /**
    * DNS域名
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 连接Port地址
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 网络连接状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get DNS域名 
     * @return Address DNS域名
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set DNS域名
     * @param Address DNS域名
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 连接Port地址 
     * @return Port 连接Port地址
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 连接Port地址
     * @param Port 连接Port地址
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）； 
     * @return NetType 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
     * @param NetType 网络类型，1、inner（基础网络内网地址）；2、private（私有网络内网地址）；3、public（基础网络或私有网络的外网地址）；
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 网络连接状态 
     * @return Status 网络连接状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 网络连接状态
     * @param Status 网络连接状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

