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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtocolPort  extends AbstractModel{

    /**
    * TCP UDP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 服务端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 容器端口
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
     * 获取TCP UDP
     * @return Protocol TCP UDP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置TCP UDP
     * @param Protocol TCP UDP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取服务端口
     * @return Port 服务端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * 设置服务端口
     * @param Port 服务端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * 获取容器端口
     * @return TargetPort 容器端口
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * 设置容器端口
     * @param TargetPort 容器端口
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);

    }
}

