/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SRTAddressDestination extends AbstractModel {

    /**
    * 目标地址的IP。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 目标地址的端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get 目标地址的IP。 
     * @return Ip 目标地址的IP。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 目标地址的IP。
     * @param Ip 目标地址的IP。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 目标地址的端口。 
     * @return Port 目标地址的端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标地址的端口。
     * @param Port 目标地址的端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public SRTAddressDestination() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SRTAddressDestination(SRTAddressDestination source) {
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
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

