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

public class Ports extends AbstractModel{

    /**
    * 服务端口
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * 端口协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get 服务端口 
     * @return TargetPort 服务端口
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set 服务端口
     * @param TargetPort 服务端口
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get 端口协议 
     * @return Protocol 端口协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 端口协议
     * @param Protocol 端口协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public Ports() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ports(Ports source) {
        if (source.TargetPort != null) {
            this.TargetPort = new Long(source.TargetPort);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

