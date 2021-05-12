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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Outbound extends AbstractModel{

    /**
    * 策略，ACCEPT 或者 DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 目的 IP 或 IP 段，例如172.16.0.0/12
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 端口或者端口范围
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 网络协议，支持 UDP、TCP等
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 规则限定的方向，进站规则为 OUTPUT
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * 规则描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 策略，ACCEPT 或者 DROP 
     * @return Action 策略，ACCEPT 或者 DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 策略，ACCEPT 或者 DROP
     * @param Action 策略，ACCEPT 或者 DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 目的 IP 或 IP 段，例如172.16.0.0/12 
     * @return CidrIp 目的 IP 或 IP 段，例如172.16.0.0/12
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set 目的 IP 或 IP 段，例如172.16.0.0/12
     * @param CidrIp 目的 IP 或 IP 段，例如172.16.0.0/12
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get 端口或者端口范围 
     * @return PortRange 端口或者端口范围
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 端口或者端口范围
     * @param PortRange 端口或者端口范围
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 网络协议，支持 UDP、TCP等 
     * @return IpProtocol 网络协议，支持 UDP、TCP等
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，支持 UDP、TCP等
     * @param IpProtocol 网络协议，支持 UDP、TCP等
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 规则限定的方向，进站规则为 OUTPUT 
     * @return Dir 规则限定的方向，进站规则为 OUTPUT
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set 规则限定的方向，进站规则为 OUTPUT
     * @param Dir 规则限定的方向，进站规则为 OUTPUT
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get 规则描述 
     * @return Desc 规则描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 规则描述
     * @param Desc 规则描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Outbound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Outbound(Outbound source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CidrIp != null) {
            this.CidrIp = new String(source.CidrIp);
        }
        if (source.PortRange != null) {
            this.PortRange = new String(source.PortRange);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

