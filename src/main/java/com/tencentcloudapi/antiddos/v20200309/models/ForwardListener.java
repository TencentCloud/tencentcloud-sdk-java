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

public class ForwardListener extends AbstractModel{

    /**
    * 转发监听端口下限，取值1~65535
    */
    @SerializedName("FrontendPort")
    @Expose
    private Long FrontendPort;

    /**
    * 转发协议，取值[
TCP
UDP
]
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 转发监听端口上限，取值1~65535
    */
    @SerializedName("FrontendPortEnd")
    @Expose
    private Long FrontendPortEnd;

    /**
     * Get 转发监听端口下限，取值1~65535 
     * @return FrontendPort 转发监听端口下限，取值1~65535
     */
    public Long getFrontendPort() {
        return this.FrontendPort;
    }

    /**
     * Set 转发监听端口下限，取值1~65535
     * @param FrontendPort 转发监听端口下限，取值1~65535
     */
    public void setFrontendPort(Long FrontendPort) {
        this.FrontendPort = FrontendPort;
    }

    /**
     * Get 转发协议，取值[
TCP
UDP
] 
     * @return ForwardProtocol 转发协议，取值[
TCP
UDP
]
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set 转发协议，取值[
TCP
UDP
]
     * @param ForwardProtocol 转发协议，取值[
TCP
UDP
]
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get 转发监听端口上限，取值1~65535 
     * @return FrontendPortEnd 转发监听端口上限，取值1~65535
     */
    public Long getFrontendPortEnd() {
        return this.FrontendPortEnd;
    }

    /**
     * Set 转发监听端口上限，取值1~65535
     * @param FrontendPortEnd 转发监听端口上限，取值1~65535
     */
    public void setFrontendPortEnd(Long FrontendPortEnd) {
        this.FrontendPortEnd = FrontendPortEnd;
    }

    public ForwardListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForwardListener(ForwardListener source) {
        if (source.FrontendPort != null) {
            this.FrontendPort = new Long(source.FrontendPort);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.FrontendPortEnd != null) {
            this.FrontendPortEnd = new Long(source.FrontendPortEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FrontendPort", this.FrontendPort);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "FrontendPortEnd", this.FrontendPortEnd);

    }
}

