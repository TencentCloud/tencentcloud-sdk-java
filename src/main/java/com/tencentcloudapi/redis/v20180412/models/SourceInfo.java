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

public class SourceInfo extends AbstractModel {

    /**
    * 来源 IP 地址。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 客户端连接数量。
    */
    @SerializedName("Conn")
    @Expose
    private Long Conn;

    /**
    * 命令
    */
    @SerializedName("Cmd")
    @Expose
    private Long Cmd;

    /**
     * Get 来源 IP 地址。 
     * @return Ip 来源 IP 地址。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 来源 IP 地址。
     * @param Ip 来源 IP 地址。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 客户端连接数量。 
     * @return Conn 客户端连接数量。
     */
    public Long getConn() {
        return this.Conn;
    }

    /**
     * Set 客户端连接数量。
     * @param Conn 客户端连接数量。
     */
    public void setConn(Long Conn) {
        this.Conn = Conn;
    }

    /**
     * Get 命令 
     * @return Cmd 命令
     */
    public Long getCmd() {
        return this.Cmd;
    }

    /**
     * Set 命令
     * @param Cmd 命令
     */
    public void setCmd(Long Cmd) {
        this.Cmd = Cmd;
    }

    public SourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInfo(SourceInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Conn != null) {
            this.Conn = new Long(source.Conn);
        }
        if (source.Cmd != null) {
            this.Cmd = new Long(source.Cmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Conn", this.Conn);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);

    }
}

