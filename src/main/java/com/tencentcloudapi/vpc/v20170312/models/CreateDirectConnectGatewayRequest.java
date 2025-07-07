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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDirectConnectGatewayRequest extends AbstractModel {

    /**
    * 专线网关名称
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 CCN 时，这里传值为云联网实例ID</li>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 云联网路由发布模式，可选值：`standard`（标准模式）、`exquisite`（精细模式）。只有云联网类型专线网关才支持`ModeType`。
    */
    @SerializedName("ModeType")
    @Expose
    private String ModeType;

    /**
    * 专线网关自定义ASN，范围：45090，64512-65534 和4200000000-4294967294
    */
    @SerializedName("GatewayAsn")
    @Expose
    private Long GatewayAsn;

    /**
    * 专线网关可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 专线网关高可用区容灾组ID
    */
    @SerializedName("HaZoneGroupId")
    @Expose
    private String HaZoneGroupId;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 专线网关名称 
     * @return DirectConnectGatewayName 专线网关名称
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set 专线网关名称
     * @param DirectConnectGatewayName 专线网关名称
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li> 
     * @return NetworkType 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     * @param NetworkType 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 CCN 时，这里传值为云联网实例ID</li> 
     * @return NetworkInstanceId <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 CCN 时，这里传值为云联网实例ID</li>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 CCN 时，这里传值为云联网实例ID</li>
     * @param NetworkInstanceId <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 CCN 时，这里传值为云联网实例ID</li>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关 
     * @return GatewayType 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     * @param GatewayType 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 云联网路由发布模式，可选值：`standard`（标准模式）、`exquisite`（精细模式）。只有云联网类型专线网关才支持`ModeType`。 
     * @return ModeType 云联网路由发布模式，可选值：`standard`（标准模式）、`exquisite`（精细模式）。只有云联网类型专线网关才支持`ModeType`。
     */
    public String getModeType() {
        return this.ModeType;
    }

    /**
     * Set 云联网路由发布模式，可选值：`standard`（标准模式）、`exquisite`（精细模式）。只有云联网类型专线网关才支持`ModeType`。
     * @param ModeType 云联网路由发布模式，可选值：`standard`（标准模式）、`exquisite`（精细模式）。只有云联网类型专线网关才支持`ModeType`。
     */
    public void setModeType(String ModeType) {
        this.ModeType = ModeType;
    }

    /**
     * Get 专线网关自定义ASN，范围：45090，64512-65534 和4200000000-4294967294 
     * @return GatewayAsn 专线网关自定义ASN，范围：45090，64512-65534 和4200000000-4294967294
     */
    public Long getGatewayAsn() {
        return this.GatewayAsn;
    }

    /**
     * Set 专线网关自定义ASN，范围：45090，64512-65534 和4200000000-4294967294
     * @param GatewayAsn 专线网关自定义ASN，范围：45090，64512-65534 和4200000000-4294967294
     */
    public void setGatewayAsn(Long GatewayAsn) {
        this.GatewayAsn = GatewayAsn;
    }

    /**
     * Get 专线网关可用区 
     * @return Zone 专线网关可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 专线网关可用区
     * @param Zone 专线网关可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 专线网关高可用区容灾组ID 
     * @return HaZoneGroupId 专线网关高可用区容灾组ID
     */
    public String getHaZoneGroupId() {
        return this.HaZoneGroupId;
    }

    /**
     * Set 专线网关高可用区容灾组ID
     * @param HaZoneGroupId 专线网关高可用区容灾组ID
     */
    public void setHaZoneGroupId(String HaZoneGroupId) {
        this.HaZoneGroupId = HaZoneGroupId;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDirectConnectGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDirectConnectGatewayRequest(CreateDirectConnectGatewayRequest source) {
        if (source.DirectConnectGatewayName != null) {
            this.DirectConnectGatewayName = new String(source.DirectConnectGatewayName);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.ModeType != null) {
            this.ModeType = new String(source.ModeType);
        }
        if (source.GatewayAsn != null) {
            this.GatewayAsn = new Long(source.GatewayAsn);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.HaZoneGroupId != null) {
            this.HaZoneGroupId = new String(source.HaZoneGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "ModeType", this.ModeType);
        this.setParamSimple(map, prefix + "GatewayAsn", this.GatewayAsn);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "HaZoneGroupId", this.HaZoneGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

