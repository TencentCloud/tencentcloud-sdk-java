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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAclEntry extends AbstractModel{

    /**
    * 修改时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 协议, 取值: TCP,UDP, ICMP, ALL。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 网段或IP(互斥)。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 网段或IPv6(互斥)。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * ACCEPT 或 DROP。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则描述，最大长度100。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 修改时间。 
     * @return ModifyTime 修改时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间。
     * @param ModifyTime 修改时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 协议, 取值: TCP,UDP, ICMP, ALL。 
     * @return Protocol 协议, 取值: TCP,UDP, ICMP, ALL。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议, 取值: TCP,UDP, ICMP, ALL。
     * @param Protocol 协议, 取值: TCP,UDP, ICMP, ALL。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。 
     * @return Port 端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     * @param Port 端口(all, 单个port,  range)。当Protocol为ALL或ICMP时，不能指定Port。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 网段或IP(互斥)。 
     * @return CidrBlock 网段或IP(互斥)。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 网段或IP(互斥)。
     * @param CidrBlock 网段或IP(互斥)。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 网段或IPv6(互斥)。 
     * @return Ipv6CidrBlock 网段或IPv6(互斥)。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set 网段或IPv6(互斥)。
     * @param Ipv6CidrBlock 网段或IPv6(互斥)。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get ACCEPT 或 DROP。 
     * @return Action ACCEPT 或 DROP。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set ACCEPT 或 DROP。
     * @param Action ACCEPT 或 DROP。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则描述，最大长度100。 
     * @return Description 规则描述，最大长度100。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述，最大长度100。
     * @param Description 规则描述，最大长度100。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

