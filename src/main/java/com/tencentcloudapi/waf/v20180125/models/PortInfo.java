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

public class PortInfo extends AbstractModel{

    /**
    * Nginx的服务器id
    */
    @SerializedName("NginxServerId")
    @Expose
    private Long NginxServerId;

    /**
    * 监听端口配置
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 与端口对应的协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 回源端口
    */
    @SerializedName("UpstreamPort")
    @Expose
    private String UpstreamPort;

    /**
    * 回源协议
    */
    @SerializedName("UpstreamProtocol")
    @Expose
    private String UpstreamProtocol;

    /**
     * Get Nginx的服务器id 
     * @return NginxServerId Nginx的服务器id
     */
    public Long getNginxServerId() {
        return this.NginxServerId;
    }

    /**
     * Set Nginx的服务器id
     * @param NginxServerId Nginx的服务器id
     */
    public void setNginxServerId(Long NginxServerId) {
        this.NginxServerId = NginxServerId;
    }

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
     * Get 与端口对应的协议 
     * @return Protocol 与端口对应的协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 与端口对应的协议
     * @param Protocol 与端口对应的协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 回源端口 
     * @return UpstreamPort 回源端口
     */
    public String getUpstreamPort() {
        return this.UpstreamPort;
    }

    /**
     * Set 回源端口
     * @param UpstreamPort 回源端口
     */
    public void setUpstreamPort(String UpstreamPort) {
        this.UpstreamPort = UpstreamPort;
    }

    /**
     * Get 回源协议 
     * @return UpstreamProtocol 回源协议
     */
    public String getUpstreamProtocol() {
        return this.UpstreamProtocol;
    }

    /**
     * Set 回源协议
     * @param UpstreamProtocol 回源协议
     */
    public void setUpstreamProtocol(String UpstreamProtocol) {
        this.UpstreamProtocol = UpstreamProtocol;
    }

    public PortInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortInfo(PortInfo source) {
        if (source.NginxServerId != null) {
            this.NginxServerId = new Long(source.NginxServerId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NginxServerId", this.NginxServerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "UpstreamPort", this.UpstreamPort);
        this.setParamSimple(map, prefix + "UpstreamProtocol", this.UpstreamProtocol);

    }
}

