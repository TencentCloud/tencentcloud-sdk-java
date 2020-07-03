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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInfo extends AbstractModel{

    /**
    * 来源IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 连接数
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
     * Get 来源IP 
     * @return Ip 来源IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 来源IP
     * @param Ip 来源IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 连接数 
     * @return Conn 连接数
     */
    public Long getConn() {
        return this.Conn;
    }

    /**
     * Set 连接数
     * @param Conn 连接数
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Conn", this.Conn);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);

    }
}

