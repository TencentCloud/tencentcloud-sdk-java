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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel{

    /**
    * 目的IPv4网段
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 下一跳类型
NORMAL_CVM：普通云服务器；
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 下一跳地址
这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址
当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 路由策略唯一ID
    */
    @SerializedName("RouteItemId")
    @Expose
    private String RouteItemId;

    /**
    * 路由策略描述
    */
    @SerializedName("RouteDescription")
    @Expose
    private String RouteDescription;

    /**
    * 是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
     * Get 目的IPv4网段 
     * @return DestinationCidrBlock 目的IPv4网段
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 目的IPv4网段
     * @param DestinationCidrBlock 目的IPv4网段
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 下一跳类型
NORMAL_CVM：普通云服务器； 
     * @return GatewayType 下一跳类型
NORMAL_CVM：普通云服务器；
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 下一跳类型
NORMAL_CVM：普通云服务器；
     * @param GatewayType 下一跳类型
NORMAL_CVM：普通云服务器；
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 下一跳地址
这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址
当 GatewayType 为 EIP 时，GatewayId 固定值 '0' 
     * @return GatewayId 下一跳地址
这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址
当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 下一跳地址
这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址
当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     * @param GatewayId 下一跳地址
这里只需要指定不同下一跳类型的网关ID，系统会自动匹配到下一跳地址
当 GatewayType 为 EIP 时，GatewayId 固定值 '0'
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 路由策略唯一ID 
     * @return RouteItemId 路由策略唯一ID
     */
    public String getRouteItemId() {
        return this.RouteItemId;
    }

    /**
     * Set 路由策略唯一ID
     * @param RouteItemId 路由策略唯一ID
     */
    public void setRouteItemId(String RouteItemId) {
        this.RouteItemId = RouteItemId;
    }

    /**
     * Get 路由策略描述 
     * @return RouteDescription 路由策略描述
     */
    public String getRouteDescription() {
        return this.RouteDescription;
    }

    /**
     * Set 路由策略描述
     * @param RouteDescription 路由策略描述
     */
    public void setRouteDescription(String RouteDescription) {
        this.RouteDescription = RouteDescription;
    }

    /**
     * Get 是否启用 
     * @return Enabled 是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用
     * @param Enabled 是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。 
     * @return RouteType 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     * @param RouteType 路由类型，目前我们支持的类型有：
USER：用户路由；
NETD：网络探测路由，创建网络探测实例时，系统默认下发，不可编辑与删除；
CCN：云联网路由，系统默认下发，不可编辑与删除。
用户只能添加和操作 USER 类型的路由。
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略 
     * @return RouteId 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略
     * @param RouteId 路由策略ID。IPv4路由策略ID是有意义的值，IPv6路由策略是无意义的值0。后续建议完全使用字符串唯一ID `RouteItemId`操作路由策略
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    public Route() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Route(Route source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.RouteItemId != null) {
            this.RouteItemId = new String(source.RouteItemId);
        }
        if (source.RouteDescription != null) {
            this.RouteDescription = new String(source.RouteDescription);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteItemId", this.RouteItemId);
        this.setParamSimple(map, prefix + "RouteDescription", this.RouteDescription);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);

    }
}

