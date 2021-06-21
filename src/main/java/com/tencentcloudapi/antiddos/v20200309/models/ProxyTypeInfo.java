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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyTypeInfo extends AbstractModel{

    /**
    * 转发监听端口列表，端口取值1~65535
    */
    @SerializedName("ProxyPorts")
    @Expose
    private Long [] ProxyPorts;

    /**
    * 转发协议，取值[
http(HTTP协议)
https(HTTPS协议)
]
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
     * Get 转发监听端口列表，端口取值1~65535 
     * @return ProxyPorts 转发监听端口列表，端口取值1~65535
     */
    public Long [] getProxyPorts() {
        return this.ProxyPorts;
    }

    /**
     * Set 转发监听端口列表，端口取值1~65535
     * @param ProxyPorts 转发监听端口列表，端口取值1~65535
     */
    public void setProxyPorts(Long [] ProxyPorts) {
        this.ProxyPorts = ProxyPorts;
    }

    /**
     * Get 转发协议，取值[
http(HTTP协议)
https(HTTPS协议)
] 
     * @return ProxyType 转发协议，取值[
http(HTTP协议)
https(HTTPS协议)
]
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 转发协议，取值[
http(HTTP协议)
https(HTTPS协议)
]
     * @param ProxyType 转发协议，取值[
http(HTTP协议)
https(HTTPS协议)
]
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    public ProxyTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyTypeInfo(ProxyTypeInfo source) {
        if (source.ProxyPorts != null) {
            this.ProxyPorts = new Long[source.ProxyPorts.length];
            for (int i = 0; i < source.ProxyPorts.length; i++) {
                this.ProxyPorts[i] = new Long(source.ProxyPorts[i]);
            }
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProxyPorts.", this.ProxyPorts);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);

    }
}

