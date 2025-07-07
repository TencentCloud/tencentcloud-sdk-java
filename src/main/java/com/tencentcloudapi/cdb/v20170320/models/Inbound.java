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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Inbound extends AbstractModel {

    /**
    * 策略，ACCEPT 或者 DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 来源 IP 或 IP 段，例如192.168.0.0/16
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 端口
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 网络协议，支持 UDP、TCP 等
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 规则限定的方向，进站规则为 INPUT
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * 地址模块
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * 规则ID，嵌套安全组的规则ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
     * Get 来源 IP 或 IP 段，例如192.168.0.0/16 
     * @return CidrIp 来源 IP 或 IP 段，例如192.168.0.0/16
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set 来源 IP 或 IP 段，例如192.168.0.0/16
     * @param CidrIp 来源 IP 或 IP 段，例如192.168.0.0/16
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get 端口 
     * @return PortRange 端口
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 端口
     * @param PortRange 端口
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 网络协议，支持 UDP、TCP 等 
     * @return IpProtocol 网络协议，支持 UDP、TCP 等
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，支持 UDP、TCP 等
     * @param IpProtocol 网络协议，支持 UDP、TCP 等
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 规则限定的方向，进站规则为 INPUT 
     * @return Dir 规则限定的方向，进站规则为 INPUT
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set 规则限定的方向，进站规则为 INPUT
     * @param Dir 规则限定的方向，进站规则为 INPUT
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get 地址模块 
     * @return AddressModule 地址模块
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set 地址模块
     * @param AddressModule 地址模块
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get 规则ID，嵌套安全组的规则ID 
     * @return Id 规则ID，嵌套安全组的规则ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 规则ID，嵌套安全组的规则ID
     * @param Id 规则ID，嵌套安全组的规则ID
     */
    public void setId(String Id) {
        this.Id = Id;
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

    public Inbound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Inbound(Inbound source) {
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
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

