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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGatewayLoadBalancerRequest extends AbstractModel {

    /**
    * 网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 [DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)  接口获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网关负载均衡后端目标设备所属的私有网络的子网ID。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 网关负载均衡实例名称。可支持输入1-60个字符。不填写时默认自动生成。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。
    */
    @SerializedName("LBChargeType")
    @Expose
    private String LBChargeType;

    /**
     * Get 网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 [DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)  接口获取。 
     * @return VpcId 网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 [DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)  接口获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 [DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)  接口获取。
     * @param VpcId 网关负载均衡后端目标设备所属的私有网络 ID，如vpc-azd4dt1c，可以通过 [DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)  接口获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网关负载均衡后端目标设备所属的私有网络的子网ID。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。 
     * @return SubnetId 网关负载均衡后端目标设备所属的私有网络的子网ID。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 网关负载均衡后端目标设备所属的私有网络的子网ID。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
     * @param SubnetId 网关负载均衡后端目标设备所属的私有网络的子网ID。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 网关负载均衡实例名称。可支持输入1-60个字符。不填写时默认自动生成。 
     * @return LoadBalancerName 网关负载均衡实例名称。可支持输入1-60个字符。不填写时默认自动生成。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 网关负载均衡实例名称。可支持输入1-60个字符。不填写时默认自动生成。
     * @param LoadBalancerName 网关负载均衡实例名称。可支持输入1-60个字符。不填写时默认自动生成。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。 
     * @return Number 创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。
     * @param Number 创建网关负载均衡的个数，默认值为 1。批量创建数量最大支持10个。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。 
     * @return Tags 购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。
     * @param Tags 购买网关负载均衡的同时，给负载均衡打上标签，最大支持20个标签键值对。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。 
     * @return LBChargeType 网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。
     */
    public String getLBChargeType() {
        return this.LBChargeType;
    }

    /**
     * Set 网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。
     * @param LBChargeType 网关负载均衡实例计费类型，当前只支持传POSTPAID_BY_HOUR（按量计费），默认是POSTPAID_BY_HOUR。
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

