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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGatewayLoadBalancerRequest extends AbstractModel {

    /**
    * <p>网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>网关负载均衡后端目标设备所属的私有网络的子网ID。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。不填写时默认自动生成。</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。</p>
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * <p>购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。</p>
    */
    @SerializedName("LBChargeType")
    @Expose
    private String LBChargeType;

    /**
     * Get <p>网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。</p> 
     * @return VpcId <p>网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。</p>
     * @param VpcId <p>网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 <a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>  接口获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>网关负载均衡后端目标设备所属的私有网络的子网ID。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p> 
     * @return SubnetId <p>网关负载均衡后端目标设备所属的私有网络的子网ID。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>网关负载均衡后端目标设备所属的私有网络的子网ID。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
     * @param SubnetId <p>网关负载均衡后端目标设备所属的私有网络的子网ID。可通过<a href="https://cloud.tencent.com/document/product/215/15784">DescribeSubnets</a>接口获取。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。不填写时默认自动生成。</p> 
     * @return LoadBalancerName <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。不填写时默认自动生成。</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。不填写时默认自动生成。</p>
     * @param LoadBalancerName <p>网关负载均衡实例名称。命名规则：1-80 个英文字母、汉字等国际通用语言字符，数字，连接线“-”、下划线“_”等常见字符（禁止Unicode补充字符，如emoji表情、生僻汉字等）。不填写时默认自动生成。</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。</p> 
     * @return Number <p>创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。</p>
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set <p>创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。</p>
     * @param Number <p>创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。</p>
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get <p>购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p> 
     * @return Tags <p>购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
     * @param Tags <p>购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。</p> 
     * @return LBChargeType <p>网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。</p>
     */
    public String getLBChargeType() {
        return this.LBChargeType;
    }

    /**
     * Set <p>网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。</p>
     * @param LBChargeType <p>网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。</p>
     */
    public void setLBChargeType(String LBChargeType) {
        this.LBChargeType = LBChargeType;
    }

    public CreateGatewayLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGatewayLoadBalancerRequest(CreateGatewayLoadBalancerRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.LBChargeType != null) {
            this.LBChargeType = new String(source.LBChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LBChargeType", this.LBChargeType);

    }
}

