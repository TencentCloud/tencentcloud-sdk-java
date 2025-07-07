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

public class CreateVpcEndPointServiceRequest extends AbstractModel {

    /**
    * VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 终端节点服务名称。
    */
    @SerializedName("EndPointServiceName")
    @Expose
    private String EndPointServiceName;

    /**
    * 是否自动接受。
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * 后端服务ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；CDB可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取。

    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * ~~是否是PassService类型。该字段已废弃，请不要使用该字段。~~
    */
    @SerializedName("IsPassService")
    @Expose
    private Boolean IsPassService;

    /**
    * 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。不填默认挂载为CLB。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
    */
    @SerializedName("IpAddressType")
    @Expose
    private String IpAddressType;

    /**
     * Get VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。 
     * @return VpcId VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
     * @param VpcId VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 终端节点服务名称。 
     * @return EndPointServiceName 终端节点服务名称。
     */
    public String getEndPointServiceName() {
        return this.EndPointServiceName;
    }

    /**
     * Set 终端节点服务名称。
     * @param EndPointServiceName 终端节点服务名称。
     */
    public void setEndPointServiceName(String EndPointServiceName) {
        this.EndPointServiceName = EndPointServiceName;
    }

    /**
     * Get 是否自动接受。 
     * @return AutoAcceptFlag 是否自动接受。
     */
    public Boolean getAutoAcceptFlag() {
        return this.AutoAcceptFlag;
    }

    /**
     * Set 是否自动接受。
     * @param AutoAcceptFlag 是否自动接受。
     */
    public void setAutoAcceptFlag(Boolean AutoAcceptFlag) {
        this.AutoAcceptFlag = AutoAcceptFlag;
    }

    /**
     * Get 后端服务ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；CDB可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取。
 
     * @return ServiceInstanceId 后端服务ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；CDB可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取。

     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set 后端服务ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；CDB可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取。

     * @param ServiceInstanceId 后端服务ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；CDB可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取。

     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get ~~是否是PassService类型。该字段已废弃，请不要使用该字段。~~ 
     * @return IsPassService ~~是否是PassService类型。该字段已废弃，请不要使用该字段。~~
     */
    public Boolean getIsPassService() {
        return this.IsPassService;
    }

    /**
     * Set ~~是否是PassService类型。该字段已废弃，请不要使用该字段。~~
     * @param IsPassService ~~是否是PassService类型。该字段已废弃，请不要使用该字段。~~
     */
    public void setIsPassService(Boolean IsPassService) {
        this.IsPassService = IsPassService;
    }

    /**
     * Get 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。不填默认挂载为CLB。 
     * @return ServiceType 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。不填默认挂载为CLB。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。不填默认挂载为CLB。
     * @param ServiceType 挂载的PAAS服务类型，CLB（负载均衡），CDB（云数据库 MySQL），CRS（云数据库 Redis），GWLB（网关负载均衡）。不填默认挂载为CLB。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。 
     * @return IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public String getIpAddressType() {
        return this.IpAddressType;
    }

    /**
     * Set 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     * @param IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public void setIpAddressType(String IpAddressType) {
        this.IpAddressType = IpAddressType;
    }

    public CreateVpcEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcEndPointServiceRequest(CreateVpcEndPointServiceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.EndPointServiceName != null) {
            this.EndPointServiceName = new String(source.EndPointServiceName);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.IsPassService != null) {
            this.IsPassService = new Boolean(source.IsPassService);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IpAddressType != null) {
            this.IpAddressType = new String(source.IpAddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EndPointServiceName", this.EndPointServiceName);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "IsPassService", this.IsPassService);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IpAddressType", this.IpAddressType);

    }
}

