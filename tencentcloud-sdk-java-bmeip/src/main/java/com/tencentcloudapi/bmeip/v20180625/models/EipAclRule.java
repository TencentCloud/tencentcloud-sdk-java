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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipAclRule extends AbstractModel{

    /**
    * 源 IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 目标端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议(TCP/UDP/ICMP/ANY)
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 策略（accept/drop）
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 源 IP 
     * @return Ip 源 IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 源 IP
     * @param Ip 源 IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 目标端口 
     * @return Port 目标端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 目标端口
     * @param Port 目标端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议(TCP/UDP/ICMP/ANY) 
     * @return Protocol 协议(TCP/UDP/ICMP/ANY)
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议(TCP/UDP/ICMP/ANY)
     * @param Protocol 协议(TCP/UDP/ICMP/ANY)
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 策略（accept/drop） 
     * @return Action 策略（accept/drop）
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 策略（accept/drop）
     * @param Action 策略（accept/drop）
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

