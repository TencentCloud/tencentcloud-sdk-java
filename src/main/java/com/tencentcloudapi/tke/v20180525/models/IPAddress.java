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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPAddress extends AbstractModel{

    /**
    * Ip 地址的类型。可为 advertise, public 等
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Ip 地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 网络端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get Ip 地址的类型。可为 advertise, public 等 
     * @return Type Ip 地址的类型。可为 advertise, public 等
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Ip 地址的类型。可为 advertise, public 等
     * @param Type Ip 地址的类型。可为 advertise, public 等
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Ip 地址 
     * @return Ip Ip 地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip 地址
     * @param Ip Ip 地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 网络端口 
     * @return Port 网络端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 网络端口
     * @param Port 网络端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public IPAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPAddress(IPAddress source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

