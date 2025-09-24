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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkBasicInfoRequest extends AbstractModel {

    /**
    * 云原生API网关实例ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 分组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 网络类型：
- Open 公网ipv4
- Open-IPv6 公网ipv6
- Internal 内网
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * ip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 公网出流量带宽[1,2048]Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 负载均衡描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 负载均衡的规格类型，支持：
- 不传为共享型。
- clb.c2.medium：标准型规格
- clb.c3.small：高阶型1规格
- clb.c3.medium：高阶型2规格
- clb.c4.small：超强型1规格
- clb.c4.medium：超强型2规格
- clb.c4.large：超强型3规格
- clb.c4.xlarge：超强型4规格
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
     * Get 云原生API网关实例ID。 
     * @return GatewayId 云原生API网关实例ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关实例ID。
     * @param GatewayId 云原生API网关实例ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 分组id 
     * @return GroupId 分组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组id
     * @param GroupId 分组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 网络类型：
- Open 公网ipv4
- Open-IPv6 公网ipv6
- Internal 内网 
     * @return NetworkType 网络类型：
- Open 公网ipv4
- Open-IPv6 公网ipv6
- Internal 内网
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型：
- Open 公网ipv4
- Open-IPv6 公网ipv6
- Internal 内网
     * @param NetworkType 网络类型：
- Open 公网ipv4
- Open-IPv6 公网ipv6
- Internal 内网
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get ip地址 
     * @return Vip ip地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set ip地址
     * @param Vip ip地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 公网出流量带宽[1,2048]Mbps 
     * @return InternetMaxBandwidthOut 公网出流量带宽[1,2048]Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网出流量带宽[1,2048]Mbps
     * @param InternetMaxBandwidthOut 公网出流量带宽[1,2048]Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 负载均衡描述 
     * @return Description 负载均衡描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 负载均衡描述
     * @param Description 负载均衡描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 负载均衡的规格类型，支持：
- 不传为共享型。
- clb.c2.medium：标准型规格
- clb.c3.small：高阶型1规格
- clb.c3.medium：高阶型2规格
- clb.c4.small：超强型1规格
- clb.c4.medium：超强型2规格
- clb.c4.large：超强型3规格
- clb.c4.xlarge：超强型4规格 
     * @return SlaType 负载均衡的规格类型，支持：
- 不传为共享型。
- clb.c2.medium：标准型规格
- clb.c3.small：高阶型1规格
- clb.c3.medium：高阶型2规格
- clb.c4.small：超强型1规格
- clb.c4.medium：超强型2规格
- clb.c4.large：超强型3规格
- clb.c4.xlarge：超强型4规格
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set 负载均衡的规格类型，支持：
- 不传为共享型。
- clb.c2.medium：标准型规格
- clb.c3.small：高阶型1规格
- clb.c3.medium：高阶型2规格
- clb.c4.small：超强型1规格
- clb.c4.medium：超强型2规格
- clb.c4.large：超强型3规格
- clb.c4.xlarge：超强型4规格
     * @param SlaType 负载均衡的规格类型，支持：
- 不传为共享型。
- clb.c2.medium：标准型规格
- clb.c3.small：高阶型1规格
- clb.c3.medium：高阶型2规格
- clb.c4.small：超强型1规格
- clb.c4.medium：超强型2规格
- clb.c4.large：超强型3规格
- clb.c4.xlarge：超强型4规格
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    public ModifyNetworkBasicInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkBasicInfoRequest(ModifyNetworkBasicInfoRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);

    }
}

