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

public class SecurityGroupsInboundAndOutbound extends AbstractModel{

    /**
    * 执行动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口号
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议类型
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
     * Get 执行动作 
     * @return Action 执行动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作
     * @param Action 执行动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get IP地址 
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口号 
     * @return Port 端口号
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口号
     * @param Port 端口号
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议类型 
     * @return Proto 协议类型
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 协议类型
     * @param Proto 协议类型
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
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

