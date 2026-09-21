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

public class CreateSubnetRequest extends AbstractModel {

    /**
    * <p>待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网名称，最大长度不能超过60个字节。</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。</p>
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
    * <p>子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>IPv6网段</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>CDC实例ID。</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get <p>待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。</p> 
     * @return VpcId <p>待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。</p>
     * @param VpcId <p>待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网名称，最大长度不能超过60个字节。</p> 
     * @return SubnetName <p>子网名称，最大长度不能超过60个字节。</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称，最大长度不能超过60个字节。</p>
     * @param SubnetName <p>子网名称，最大长度不能超过60个字节。</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。</p> 
     * @return Zone <p>子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。</p>
     * @param Zone <p>子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。</p>
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
     * Get <p>子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。</p> 
     * @return CidrBlock <p>子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。</p>
     * @param CidrBlock <p>子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>IPv6网段</p> 
     * @return Ipv6CidrBlock <p>IPv6网段</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>IPv6网段</p>
     * @param Ipv6CidrBlock <p>IPv6网段</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p> 
     * @return Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     * @param Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>CDC实例ID。</p> 
     * @return CdcId <p>CDC实例ID。</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>CDC实例ID。</p>
     * @param CdcId <p>CDC实例ID。</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public CreateSubnetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubnetRequest(CreateSubnetRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StackType", this.StackType);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

