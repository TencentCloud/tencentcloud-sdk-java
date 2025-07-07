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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupsInboundAndOutbound extends AbstractModel {

    /**
    * 标识出入数据库的IP与端口是否被允许。
- ACCEPT：允许。
- DROP：不允许。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 出入数据库的IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口号。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议类型。
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
     * Get 标识出入数据库的IP与端口是否被允许。
- ACCEPT：允许。
- DROP：不允许。 
     * @return Action 标识出入数据库的IP与端口是否被允许。
- ACCEPT：允许。
- DROP：不允许。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 标识出入数据库的IP与端口是否被允许。
- ACCEPT：允许。
- DROP：不允许。
     * @param Action 标识出入数据库的IP与端口是否被允许。
- ACCEPT：允许。
- DROP：不允许。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 出入数据库的IP地址 
     * @return Ip 出入数据库的IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 出入数据库的IP地址
     * @param Ip 出入数据库的IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口号。 
     * @return Port 端口号。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口号。
     * @param Port 端口号。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议类型。 
     * @return Proto 协议类型。
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 协议类型。
     * @param Proto 协议类型。
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public SecurityGroupsInboundAndOutbound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupsInboundAndOutbound(SecurityGroupsInboundAndOutbound source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);

    }
}

