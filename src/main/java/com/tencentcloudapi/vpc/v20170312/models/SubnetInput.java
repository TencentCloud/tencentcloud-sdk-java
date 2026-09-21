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

public class SubnetInput extends AbstractModel {

    /**
    * <p>子网名称。</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>可用区。形如：<code>ap-guangzhou-2</code>。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
    */
    @SerializedName("StackType")
    @Expose
    private String StackType;

    /**
    * <p>子网的<code>CIDR</code>。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>指定关联路由表，形如：<code>rtb-3ryrwzuu</code>。</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
     * Get <p>子网名称。</p> 
     * @return SubnetName <p>子网名称。</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称。</p>
     * @param SubnetName <p>子网名称。</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>可用区。形如：<code>ap-guangzhou-2</code>。</p> 
     * @return Zone <p>可用区。形如：<code>ap-guangzhou-2</code>。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区。形如：<code>ap-guangzhou-2</code>。</p>
     * @param Zone <p>可用区。形如：<code>ap-guangzhou-2</code>。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul> 
     * @return StackType <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
     */
    public String getStackType() {
        return this.StackType;
    }

    /**
     * Set <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
     * @param StackType <p>协议栈类型</p><p>枚举值：</p><ul><li>DualStack： IPv4和IPv6双栈</li><li>IPv6Only： IPv6单栈</li></ul>
     */
    public void setStackType(String StackType) {
        this.StackType = StackType;
    }

    /**
     * Get <p>子网的<code>CIDR</code>。</p> 
     * @return CidrBlock <p>子网的<code>CIDR</code>。</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>子网的<code>CIDR</code>。</p>
     * @param CidrBlock <p>子网的<code>CIDR</code>。</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p> 
     * @return Ipv6CidrBlock <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
     * @param Ipv6CidrBlock <p>子网的 <code>IPv6</code> <code>CIDR</code>。</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>指定关联路由表，形如：<code>rtb-3ryrwzuu</code>。</p> 
     * @return RouteTableId <p>指定关联路由表，形如：<code>rtb-3ryrwzuu</code>。</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>指定关联路由表，形如：<code>rtb-3ryrwzuu</code>。</p>
     * @param RouteTableId <p>指定关联路由表，形如：<code>rtb-3ryrwzuu</code>。</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    public SubnetInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetInput(SubnetInput source) {
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StackType != null) {
            this.StackType = new String(source.StackType);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StackType", this.StackType);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);

    }
}

