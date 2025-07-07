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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescNatDnatRule extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 网络协议，可选值：TCP、UDP。
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 弹性IP。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * 公网端口。
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * 内网地址。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 内网端口。
    */
    @SerializedName("PrivatePort")
    @Expose
    private Long PrivatePort;

    /**
    * NAT防火墙转发规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否被关联引用，如被远程运维使用
    */
    @SerializedName("IsReferenced")
    @Expose
    private Long IsReferenced;

    /**
    * 所属防火墙实例id
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
    * 关联的nat网关Id
    */
    @SerializedName("NatGwId")
    @Expose
    private String NatGwId;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 网络协议，可选值：TCP、UDP。 
     * @return IpProtocol 网络协议，可选值：TCP、UDP。
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，可选值：TCP、UDP。
     * @param IpProtocol 网络协议，可选值：TCP、UDP。
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 弹性IP。 
     * @return PublicIpAddress 弹性IP。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 弹性IP。
     * @param PublicIpAddress 弹性IP。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get 公网端口。 
     * @return PublicPort 公网端口。
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set 公网端口。
     * @param PublicPort 公网端口。
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get 内网地址。 
     * @return PrivateIpAddress 内网地址。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 内网地址。
     * @param PrivateIpAddress 内网地址。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 内网端口。 
     * @return PrivatePort 内网端口。
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set 内网端口。
     * @param PrivatePort 内网端口。
     */
    public void setPrivatePort(Long PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * Get NAT防火墙转发规则描述。 
     * @return Description NAT防火墙转发规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set NAT防火墙转发规则描述。
     * @param Description NAT防火墙转发规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否被关联引用，如被远程运维使用 
     * @return IsReferenced 是否被关联引用，如被远程运维使用
     */
    public Long getIsReferenced() {
        return this.IsReferenced;
    }

    /**
     * Set 是否被关联引用，如被远程运维使用
     * @param IsReferenced 是否被关联引用，如被远程运维使用
     */
    public void setIsReferenced(Long IsReferenced) {
        this.IsReferenced = IsReferenced;
    }

    /**
     * Get 所属防火墙实例id 
     * @return FwInsId 所属防火墙实例id
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set 所属防火墙实例id
     * @param FwInsId 所属防火墙实例id
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    /**
     * Get 关联的nat网关Id 
     * @return NatGwId 关联的nat网关Id
     */
    public String getNatGwId() {
        return this.NatGwId;
    }

    /**
     * Set 关联的nat网关Id
     * @param NatGwId 关联的nat网关Id
     */
    public void setNatGwId(String NatGwId) {
        this.NatGwId = NatGwId;
    }

    public DescNatDnatRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescNatDnatRule(DescNatDnatRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PrivatePort != null) {
            this.PrivatePort = new Long(source.PrivatePort);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsReferenced != null) {
            this.IsReferenced = new Long(source.IsReferenced);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
        if (source.NatGwId != null) {
            this.NatGwId = new String(source.NatGwId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsReferenced", this.IsReferenced);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);
        this.setParamSimple(map, prefix + "NatGwId", this.NatGwId);

    }
}

