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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolPort extends AbstractModel{

    /**
    * 协议（tcp；udp）
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 协议（tcp；udp） 
     * @return Protocol 协议（tcp；udp）
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议（tcp；udp）
     * @param Protocol 协议（tcp；udp）
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

