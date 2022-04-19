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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortItem extends AbstractModel{

    /**
    * 监听端口配置
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 与Port一一对应，表示端口对应的协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 与Port一一对应,  表示回源端口
    */
    @SerializedName("UpstreamPort")
    @Expose
    private String UpstreamPort;

    /**
    * 与Port一一对应,  表示回源协议
    */
    @SerializedName("UpstreamProtocol")
    @Expose
    private String UpstreamProtocol;

    /**
    * Nginx的服务器ID
    */
    @SerializedName("NginxServerId")
    @Expose
    private String NginxServerId;

    /**
     * Get 监听端口配置 
     * @return Port 监听端口配置
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 监听端口配置
     * @param Port 监听端口配置
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 与Port一一对应，表示端口对应的协议 
     * @return Protocol 与Port一一对应，表示端口对应的协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 与Port一一对应，表示端口对应的协议
     * @param Protocol 与Port一一对应，表示端口对应的协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 与Port一一对应,  表示回源端口 
     * @return UpstreamPort 与Port一一对应,  表示回源端口
     */
    public String getUpstreamPort() {
        return this.UpstreamPort;
    }

    /**
     * Set 与Port一一对应,  表示回源端口
     * @param UpstreamPort 与Port一一对应,  表示回源端口
     */
    public void setUpstreamPort(String UpstreamPort) {
        this.UpstreamPort = UpstreamPort;
    }

    /**
     * Get 与Port一一对应,  表示回源协议 
     * @return UpstreamProtocol 与Port一一对应,  表示回源协议
     */
    public String getUpstreamProtocol() {
        return this.UpstreamProtocol;
    }

    /**
     * Set 与Port一一对应,  表示回源协议
     * @param UpstreamProtocol 与Port一一对应,  表示回源协议
     */
    public void setUpstreamProtocol(String UpstreamProtocol) {
        this.UpstreamProtocol = UpstreamProtocol;
    }

    /**
     * Get Nginx的服务器ID 
     * @return NginxServerId Nginx的服务器ID
     */
    public String getNginxServerId() {
        return this.NginxServerId;
    }

    /**
     * Set Nginx的服务器ID
     * @param NginxServerId Nginx的服务器ID
     */
    public void setNginxServerId(String NginxServerId) {
        this.NginxServerId = NginxServerId;
    }

    public PortItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortItem(PortItem source) {
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.UpstreamPort != null) {
            this.UpstreamPort = new String(source.UpstreamPort);
        }
        if (source.UpstreamProtocol != null) {
            this.UpstreamProtocol = new String(source.UpstreamProtocol);
        }
        if (source.NginxServerId != null) {
            this.NginxServerId = new String(source.NginxServerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "UpstreamPort", this.UpstreamPort);
        this.setParamSimple(map, prefix + "UpstreamProtocol", this.UpstreamProtocol);
        this.setParamSimple(map, prefix + "NginxServerId", this.NginxServerId);

    }
}

