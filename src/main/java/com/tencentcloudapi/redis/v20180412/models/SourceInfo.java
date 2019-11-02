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

public class SourceInfo  extends AbstractModel{

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
    private Integer Conn;

    /**
    * 命令
    */
    @SerializedName("Cmd")
    @Expose
    private Integer Cmd;

    /**
     * 获取来源IP
     * @return Ip 来源IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置来源IP
     * @param Ip 来源IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取连接数
     * @return Conn 连接数
     */
    public Integer getConn() {
        return this.Conn;
    }

    /**
     * 设置连接数
     * @param Conn 连接数
     */
    public void setConn(Integer Conn) {
        this.Conn = Conn;
    }

    /**
     * 获取命令
     * @return Cmd 命令
     */
    public Integer getCmd() {
        return this.Cmd;
    }

    /**
     * 设置命令
     * @param Cmd 命令
     */
    public void setCmd(Integer Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Conn", this.Conn);
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);

    }
}

