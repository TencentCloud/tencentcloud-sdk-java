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
package com.tencentcloudapi.vpc.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vpc.v20170312.models.*;

public class VpcClient extends AbstractClient{
    private static String endpoint = "vpc.tencentcloudapi.com";
    private static String service = "vpc";
    private static String version = "2017-03-12";

    public VpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VpcClient(Credential credential, String region, ClientProfile profile) {
        super(VpcClient.endpoint, VpcClient.version, credential, region, profile);
    }

    /**
     *本接口（AcceptAttachCcnInstances）用于跨账号关联实例时，云联网所有者接受并同意关联操作。
     * @param req AcceptAttachCcnInstancesRequest
     * @return AcceptAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AcceptAttachCcnInstancesResponse AcceptAttachCcnInstances(AcceptAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptAttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptAttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcceptAttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口用于添加带宽包资源，包括[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)和[负载均衡](https://cloud.tencent.com/document/product/214/517)等
     * @param req AddBandwidthPackageResourcesRequest
     * @return AddBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AddBandwidthPackageResourcesResponse AddBandwidthPackageResources(AddBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddBandwidthPackageResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddBandwidthPackageResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 该接口用于在转换实例下添加IPV6转换规则。
2. 支持在同一个转换实例下批量添加转换规则，一个账户在一个地域最多50个。
3. 一个完整的转换规则包括vip6:vport6:protocol:vip:vport，其中vip6:vport6:protocol必须是唯一。
     * @param req AddIp6RulesRequest
     * @return AddIp6RulesResponse
     * @throws TencentCloudSDKException
     */
    public AddIp6RulesResponse AddIp6Rules(AddIp6RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddIp6RulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddIp6RulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddIp6Rules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (AllocateAddresses) 用于申请一个或多个[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* EIP 是专为动态云计算设计的静态 IP 地址。借助 EIP，您可以快速将 EIP 重新映射到您的另一个实例上，从而屏蔽实例故障。
* 您的 EIP 与腾讯云账户相关联，而不是与某个实例相关联。在您选择显式释放该地址，或欠费超过24小时之前，它会一直与您的腾讯云账户保持关联。
* 一个腾讯云账户在每个地域能申请的 EIP 最大配额有所限制，可参见 [EIP 产品简介](https://cloud.tencent.com/document/product/213/5733)，上述配额可通过 DescribeAddressQuota 接口获取。
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于给IPv6地址初次分配公网带宽
     * @param req AllocateIp6AddressesBandwidthRequest
     * @return AllocateIp6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public AllocateIp6AddressesBandwidthResponse AllocateIp6AddressesBandwidth(AllocateIp6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateIp6AddressesBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateIp6AddressesBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AllocateIp6AddressesBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssignIpv6Addresses）用于弹性网卡申请`IPv6`地址。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 可以指定`IPv6`地址申请，地址类型不能为主`IP`，`IPv6`地址暂时只支持作为辅助`IP`。
* 地址必须要在弹性网卡所在子网内，而且不能被占用。
* 在弹性网卡上申请一个到多个辅助`IPv6`地址，接口会在弹性网卡所在子网段内返回指定数量的辅助`IPv6`地址。
     * @param req AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6AddressesResponse AssignIpv6Addresses(AssignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6AddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignIpv6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssignIpv6CidrBlock）用于分配IPv6网段。
* 使用本接口前，您需要已有VPC实例，如果没有可通过接口<a href="https://cloud.tencent.com/document/api/215/15774" title="CreateVpc" target="_blank">CreateVpc</a>创建。
* 每个VPC只能申请一个IPv6网段
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6CidrBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6CidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignIpv6CidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssignIpv6SubnetCidrBlock）用于分配IPv6子网段。
* 给子网分配 `IPv6` 网段，要求子网所属 `VPC` 已获得 `IPv6` 网段。如果尚未分配，请先通过接口 `AssignIpv6CidrBlock` 给子网所属 `VPC` 分配一个 `IPv6` 网段。否则无法分配 `IPv6` 子网段。
* 每个子网只能分配一个IPv6网段。
     * @param req AssignIpv6SubnetCidrBlockRequest
     * @return AssignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6SubnetCidrBlockResponse AssignIpv6SubnetCidrBlock(AssignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6SubnetCidrBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignIpv6SubnetCidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssignPrivateIpAddresses）用于弹性网卡申请内网 IP。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 可以指定内网IP地址申请，内网IP地址类型不能为主IP，主IP已存在，不能修改，内网IP必须要弹性网卡所在子网内，而且不能被占用。
* 在弹性网卡上申请一个到多个辅助内网IP，接口会在弹性网卡所在子网网段内返回指定数量的辅助内网IP。
     * @param req AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignPrivateIpAddressesResponse AssignPrivateIpAddresses(AssignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignPrivateIpAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssignPrivateIpAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssignPrivateIpAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (AssociateAddress) 用于将[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）绑定到实例或弹性网卡的指定内网 IP 上。
* 将 EIP 绑定到实例（CVM）上，其本质是将 EIP 绑定到实例上主网卡的主内网 IP 上。
* 将 EIP 绑定到主网卡的主内网IP上，绑定过程会把其上绑定的普通公网 IP 自动解绑并释放。
* 将 EIP 绑定到指定网卡的内网 IP上（非主网卡的主内网IP），则必须先解绑该 EIP，才能再绑定新的。
* 将 EIP 绑定到NAT网关，请使用接口[AssociateNatGatewayAddress](https://cloud.tencent.com/document/product/215/36722)
* EIP 如果欠费或被封堵，则不能被绑定。
* 只有状态为 UNBIND 的 EIP 才能够被绑定。
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssociateDhcpIpWithAddressIp）用于DhcpIp绑定弹性公网IP（EIP）。<br />
     * @param req AssociateDhcpIpWithAddressIpRequest
     * @return AssociateDhcpIpWithAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDhcpIpWithAddressIpResponse AssociateDhcpIpWithAddressIp(AssociateDhcpIpWithAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDhcpIpWithAddressIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDhcpIpWithAddressIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDhcpIpWithAddressIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将专线网关与NAT网关绑定，专线网关默认路由指向NAT网关
     * @param req AssociateDirectConnectGatewayNatGatewayRequest
     * @return AssociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDirectConnectGatewayNatGatewayResponse AssociateDirectConnectGatewayNatGateway(AssociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDirectConnectGatewayNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDirectConnectGatewayNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDirectConnectGatewayNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(AssociateNatGatewayAddress)用于NAT网关绑定弹性IP（EIP）。
     * @param req AssociateNatGatewayAddressRequest
     * @return AssociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNatGatewayAddressResponse AssociateNatGatewayAddress(AssociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNatGatewayAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNatGatewayAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateNatGatewayAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssociateNetworkAclSubnets）用于网络ACL关联vpc下的子网。
     * @param req AssociateNetworkAclSubnetsRequest
     * @return AssociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkAclSubnetsResponse AssociateNetworkAclSubnets(AssociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNetworkAclSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNetworkAclSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateNetworkAclSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssociateNetworkInterfaceSecurityGroups）用于弹性网卡绑定安全组（SecurityGroup）。
     * @param req AssociateNetworkInterfaceSecurityGroupsRequest
     * @return AssociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkInterfaceSecurityGroupsResponse AssociateNetworkInterfaceSecurityGroups(AssociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNetworkInterfaceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateNetworkInterfaceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateNetworkInterfaceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachCcnInstances）用于将网络实例加载到云联网实例中，网络实例包括VPC和专线网关。<br />
每个云联网能够关联的网络实例个数是有限的，详请参考产品文档。如果需要扩充请联系在线客服。
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(AttachClassicLinkVpc)用于创建私有网络和基础网络设备互通。
* 私有网络和基础网络设备必须在同一个地域。
* 私有网络和基础网络的区别详见vpc产品文档-<a href="https://cloud.tencent.com/document/product/215/30720">私有网络与基础网络</a>。
     * @param req AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public AttachClassicLinkVpcResponse AttachClassicLinkVpc(AttachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachClassicLinkVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachClassicLinkVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachClassicLinkVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachNetworkInterface）用于弹性网卡绑定云服务器。
* 一个云服务器可以绑定多个弹性网卡，但只能绑定一个主网卡。更多限制信息详见<a href="https://cloud.tencent.com/document/product/576/18527">弹性网卡使用限制</a>。
* 一个弹性网卡只能同时绑定一个云服务器。
* 只有运行中或者已关机状态的云服务器才能绑定弹性网卡，查看云服务器状态详见<a href="https://cloud.tencent.com/document/api/213/9452#InstanceStatus">腾讯云服务器信息</a>。
* 弹性网卡绑定的云服务器必须是私有网络的，而且云服务器所在可用区必须和弹性网卡子网的可用区相同。
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AuditCrossBorderCompliance）用于服务商操作合规化资质审批。
* 服务商只能操作提交到本服务商的审批单，后台会校验身份。即只授权给服务商的`APPID` 调用本接口。
* `APPROVED` 状态的审批单，可以再次操作为 `DENY`；`DENY` 状态的审批单，也可以再次操作为 `APPROVED`。
     * @param req AuditCrossBorderComplianceRequest
     * @return AuditCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public AuditCrossBorderComplianceResponse AuditCrossBorderCompliance(AuditCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuditCrossBorderComplianceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AuditCrossBorderComplianceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AuditCrossBorderCompliance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CheckAssistantCidr)用于检查辅助CIDR是否与存量路由、对等连接（对端VPC的CIDR）等资源存在冲突。如果存在重叠，则返回重叠的资源。（接口灰度中，如需使用请提工单。）
* 检测辅助CIDR是否与当前VPC的主CIDR和辅助CIDR存在重叠。
* 检测辅助CIDR是否与当前VPC的路由的目的端存在重叠。
* 检测辅助CIDR是否与当前VPC的对等连接，对端VPC下的主CIDR或辅助CIDR存在重叠。
     * @param req CheckAssistantCidrRequest
     * @return CheckAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CheckAssistantCidrResponse CheckAssistantCidr(CheckAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAssistantCidrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CheckDefaultSubnet）用于预判是否可建默认子网。
     * @param req CheckDefaultSubnetRequest
     * @return CheckDefaultSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CheckDefaultSubnetResponse CheckDefaultSubnet(CheckDefaultSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDefaultSubnetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDefaultSubnetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDefaultSubnet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CheckNetDetectState)用于验证网络探测。
     * @param req CheckNetDetectStateRequest
     * @return CheckNetDetectStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetDetectStateResponse CheckNetDetectState(CheckNetDetectStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckNetDetectStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckNetDetectStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckNetDetectState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAddressTemplate）用于创建IP地址模版
     * @param req CreateAddressTemplateRequest
     * @return CreateAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateResponse CreateAddressTemplate(CreateAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAddressTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAddressTemplateGroup）用于创建IP地址模版集合
     * @param req CreateAddressTemplateGroupRequest
     * @return CreateAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateGroupResponse CreateAddressTemplateGroup(CreateAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAddressTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAndAttachNetworkInterface）用于创建弹性网卡并绑定云服务器。
* 创建弹性网卡时可以指定内网IP，并且可以指定一个主IP，指定的内网IP必须在弹性网卡所在子网内，而且不能被占用。
* 创建弹性网卡时可以指定需要申请的内网IP数量，系统会随机生成内网IP地址。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 创建弹性网卡同时可以绑定已有安全组。
* 创建弹性网卡同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateAndAttachNetworkInterfaceRequest
     * @return CreateAndAttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndAttachNetworkInterfaceResponse CreateAndAttachNetworkInterface(CreateAndAttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAndAttachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAndAttachNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAndAttachNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateAssistantCidr)用于批量创建辅助CIDR。（接口灰度中，如需使用请提工单。）
     * @param req CreateAssistantCidrRequest
     * @return CreateAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssistantCidrResponse CreateAssistantCidr(CreateAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssistantCidrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口支持创建[设备带宽包](https://cloud.tencent.com/document/product/684/15246#.E8.AE.BE.E5.A4.87.E5.B8.A6.E5.AE.BD.E5.8C.85)和[IP带宽包](https://cloud.tencent.com/document/product/684/15246#ip-.E5.B8.A6.E5.AE.BD.E5.8C.85)
     * @param req CreateBandwidthPackageRequest
     * @return CreateBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateBandwidthPackageResponse CreateBandwidthPackage(CreateBandwidthPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBandwidthPackageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBandwidthPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBandwidthPackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCcn）用于创建云联网（CCN）。<br />
* 创建云联网同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
每个账号能创建的云联网实例个数是有限的，详请参考产品文档。如果需要扩充请联系在线客服。
     * @param req CreateCcnRequest
     * @return CreateCcnResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcnResponse CreateCcn(CreateCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCcnResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCustomerGateway）用于创建对端网关。
     * @param req CreateCustomerGatewayRequest
     * @return CreateCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomerGatewayResponse CreateCustomerGateway(CreateCustomerGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomerGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomerGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomerGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDefaultSecurityGroup）用于创建（如果项目下未存在默认安全组，则创建；已存在则获取。）默认安全组（SecurityGroup）。
* 每个账户下每个地域的每个项目的<a href="https://cloud.tencent.com/document/product/213/12453">安全组数量限制</a>。
* 新建的安全组的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用CreateSecurityGroupPolicies将安全组的规则设置为需要的规则。
* 创建安全组同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateDefaultSecurityGroupRequest
     * @return CreateDefaultSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultSecurityGroupResponse CreateDefaultSecurityGroup(CreateDefaultSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultSecurityGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDefaultSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDefaultVpc）用于创建默认私有网络(VPC）。

默认VPC适用于快速入门和启动公共实例，您可以像使用任何其他VPC一样使用默认VPC。如果您想创建标准VPC，即指定VPC名称、VPC网段、子网网段、子网可用区，请使用常规创建VPC接口（CreateVpc）

正常情况，本接口并不一定生产默认VPC，而是根据用户账号的网络属性（DescribeAccountAttributes）来决定的
* 支持基础网络、VPC，返回VpcId为0
* 只支持VPC，返回默认VPC信息

您也可以通过 Force 参数，强制返回默认VPC
     * @param req CreateDefaultVpcRequest
     * @return CreateDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultVpcResponse CreateDefaultVpc(CreateDefaultVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDefaultVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDhcpIp）用于创建DhcpIp
     * @param req CreateDhcpIpRequest
     * @return CreateDhcpIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDhcpIpResponse CreateDhcpIp(CreateDhcpIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDhcpIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDhcpIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDhcpIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDirectConnectGateway）用于创建专线网关。
     * @param req CreateDirectConnectGatewayRequest
     * @return CreateDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayResponse CreateDirectConnectGateway(CreateDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDirectConnectGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDirectConnectGatewayCcnRoutes）用于创建专线网关的云联网路由（IDC网段）
     * @param req CreateDirectConnectGatewayCcnRoutesRequest
     * @return CreateDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayCcnRoutesResponse CreateDirectConnectGatewayCcnRoutes(CreateDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateFlowLog）用于创建流日志
     * @param req CreateFlowLogRequest
     * @return CreateFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowLogResponse CreateFlowLog(CreateFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateHaVip）用于创建高可用虚拟IP（HAVIP）
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHaVipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHaVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHaVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 该接口用于创建IPV6转换IPV4实例，支持批量
2. 同一个账户在一个地域最多允许创建10个转换实例
     * @param req CreateIp6TranslatorsRequest
     * @return CreateIp6TranslatorsResponse
     * @throws TencentCloudSDKException
     */
    public CreateIp6TranslatorsResponse CreateIp6Translators(CreateIp6TranslatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIp6TranslatorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIp6TranslatorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIp6Translators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateNatGateway)用于创建NAT网关。
     * @param req CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayResponse CreateNatGateway(CreateNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateNatGatewayDestinationIpPortTranslationNatRule)用于创建NAT网关端口转发规则。
     * @param req CreateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return CreateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayDestinationIpPortTranslationNatRuleResponse CreateNatGatewayDestinationIpPortTranslationNatRule(CreateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatGatewayDestinationIpPortTranslationNatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateNetDetect)用于创建网络探测。
     * @param req CreateNetDetectRequest
     * @return CreateNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetDetectResponse CreateNetDetect(CreateNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetDetectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateNetworkAcl）用于创建新的<a href="https://cloud.tencent.com/document/product/215/20088">网络ACL</a>。
* 新建的网络ACL的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用ModifyNetworkAclEntries将网络ACL的规则设置为需要的规则。
     * @param req CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclResponse CreateNetworkAcl(CreateNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetworkAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateNetworkInterface）用于创建弹性网卡。
* 创建弹性网卡时可以指定内网IP，并且可以指定一个主IP，指定的内网IP必须在弹性网卡所在子网内，而且不能被占用。
* 创建弹性网卡时可以指定需要申请的内网IP数量，系统会随机生成内网IP地址。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 创建弹性网卡同时可以绑定已有安全组。
* 创建弹性网卡同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateRouteTable)用于创建路由表。
* 创建了VPC后，系统会创建一个默认路由表，所有新建的子网都会关联到默认路由表。默认情况下您可以直接使用默认路由表来管理您的路由策略。当您的路由策略较多时，您可以调用创建路由表接口创建更多路由表管理您的路由策略。
* 创建路由表同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateRouteTableRequest
     * @return CreateRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteTableResponse CreateRouteTable(CreateRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateRoutes)用于创建路由策略。
* 向指定路由表批量新增路由策略。
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSecurityGroup）用于创建新的安全组（SecurityGroup）。
* 每个账户下每个地域的每个项目的<a href="https://cloud.tencent.com/document/product/213/12453">安全组数量限制</a>。
* 新建的安全组的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用CreateSecurityGroupPolicies将安全组的规则设置为需要的规则。
* 创建安全组同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSecurityGroupPolicies）用于创建安全组规则（SecurityGroupPolicy）。

在 SecurityGroupPolicySet 参数中：
<ul>
<li>Version 安全组规则版本号，用户每次更新安全规则版本会自动加1，防止您更新的路由规则已过期，不填不考虑冲突。</li>
<li>在创建出站和入站规则（Egress 和 Ingress）时：<ul>
<li>Protocol 字段支持输入TCP, UDP, ICMP, ICMPV6, GRE, ALL。</li>
<li>CidrBlock 字段允许输入符合cidr格式标准的任意字符串。(展开)在基础网络中，如果 CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
<li>Ipv6CidrBlock 字段允许输入符合IPv6 cidr格式标准的任意字符串。(展开)在基础网络中，如果Ipv6CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IPv6，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
<li>SecurityGroupId 字段允许输入与待修改的安全组位于相同项目中的安全组 ID，包括这个安全组 ID 本身，代表安全组下所有云服务器的内网 IP。使用这个字段时，这条规则用来匹配网络报文的过程中会随着被使用的这个 ID 所关联的云服务器变化而变化，不需要重新修改。</li>
<li>Port 字段允许输入一个单独端口号，或者用减号分隔的两个端口号代表端口范围，例如80或8000-8010。只有当 Protocol 字段是 TCP 或 UDP 时，Port 字段才被接受，即 Protocol 字段不是 TCP 或 UDP 时，Protocol 和 Port 排他关系，不允许同时输入，否则会接口报错。</li>
<li>Action 字段只允许输入 ACCEPT 或 DROP。</li>
<li>CidrBlock, Ipv6CidrBlock, SecurityGroupId, AddressTemplate 四者是排他关系，不允许同时输入，Protocol + Port 和 ServiceTemplate 二者是排他关系，不允许同时输入。</li>
<li>一次请求中只能创建单个方向的规则, 如果需要指定索引（PolicyIndex）参数, 多条规则的索引必须一致。</li>
</ul></li></ul>
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSecurityGroupWithPolicies）用于创建新的安全组（SecurityGroup），并且可以同时添加安全组规则（SecurityGroupPolicy）。
* 每个账户下每个地域的每个项目的<a href="https://cloud.tencent.com/document/product/213/12453">安全组数量限制</a>。
* 新建的安全组的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用CreateSecurityGroupPolicies将安全组的规则设置为需要的规则。

安全组规则说明：
* Version安全组规则版本号，用户每次更新安全规则版本会自动加1，防止您更新的路由规则已过期，不填不考虑冲突。
* Protocol字段支持输入TCP, UDP, ICMP, ICMPV6, GRE, ALL。
* CidrBlock字段允许输入符合cidr格式标准的任意字符串。(展开)在基础网络中，如果CidrBlock包含您的账户内的云服务器之外的设备在腾讯云的内网IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。
* Ipv6CidrBlock字段允许输入符合IPv6 cidr格式标准的任意字符串。(展开)在基础网络中，如果Ipv6CidrBlock包含您的账户内的云服务器之外的设备在腾讯云的内网IPv6，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。
* SecurityGroupId字段允许输入与待修改的安全组位于相同项目中的安全组ID，包括这个安全组ID本身，代表安全组下所有云服务器的内网IP。使用这个字段时，这条规则用来匹配网络报文的过程中会随着被使用的这个ID所关联的云服务器变化而变化，不需要重新修改。
* Port字段允许输入一个单独端口号，或者用减号分隔的两个端口号代表端口范围，例如80或8000-8010。只有当Protocol字段是TCP或UDP时，Port字段才被接受，即Protocol字段不是TCP或UDP时，Protocol和Port排他关系，不允许同时输入，否则会接口报错。
* Action字段只允许输入ACCEPT或DROP。
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, AddressTemplate四者是排他关系，不允许同时输入，Protocol + Port和ServiceTemplate二者是排他关系，不允许同时输入。
* 一次请求中只能创建单个方向的规则, 如果需要指定索引（PolicyIndex）参数, 多条规则的索引必须一致。
     * @param req CreateSecurityGroupWithPoliciesRequest
     * @return CreateSecurityGroupWithPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupWithPoliciesResponse CreateSecurityGroupWithPolicies(CreateSecurityGroupWithPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupWithPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupWithPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupWithPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateServiceTemplate）用于创建协议端口模板
     * @param req CreateServiceTemplateRequest
     * @return CreateServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateResponse CreateServiceTemplate(CreateServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateServiceTemplateGroup）用于创建协议端口模板集合
     * @param req CreateServiceTemplateGroupRequest
     * @return CreateServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateGroupResponse CreateServiceTemplateGroup(CreateServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServiceTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateSubnet)用于创建子网。
* 创建子网前必须创建好 VPC。
* 子网创建成功后，子网网段不能修改。子网网段必须在VPC网段内，可以和VPC网段相同（VPC有且只有一个子网时），建议子网网段在VPC网段内，预留网段给其他子网使用。
* 您可以创建的最小网段子网掩码为28（有16个IP地址），最大网段子网掩码为16（65,536个IP地址）。
* 同一个VPC内，多个子网的网段不能重叠。
* 子网创建后会自动关联到默认路由表。
* 创建子网同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateSubnetRequest
     * @return CreateSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubnet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateSubnets)用于批量创建子网。
* 创建子网前必须创建好 VPC。
* 子网创建成功后，子网网段不能修改。子网网段必须在VPC网段内，可以和VPC网段相同（VPC有且只有一个子网时），建议子网网段在VPC网段内，预留网段给其他子网使用。
* 您可以创建的最小网段子网掩码为28（有16个IP地址），最大网段子网掩码为16（65,536个IP地址）。
* 同一个VPC内，多个子网的网段不能重叠。
* 子网创建后会自动关联到默认路由表。
* 创建子网同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateSubnetsRequest
     * @return CreateSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetsResponse CreateSubnets(CreateSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateVpc)用于创建私有网络(VPC)。
* 用户可以创建的最小网段子网掩码为28（有16个IP地址），最大网段子网掩码为16（65,536个IP地址）,如果规划VPC网段请参见VPC网段规划说明。
* 同一个地域能创建的VPC资源个数也是有限制的，详见 <a href="https://cloud.tencent.com/doc/product/215/537" title="VPC使用限制">VPC使用限制</a>,如果需要扩充请联系在线客服。
* 创建VPC同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateVpnConnection）用于创建VPN通道。
     * @param req CreateVpnConnectionRequest
     * @return CreateVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpnConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateVpnGateway）用于创建VPN网关。
     * @param req CreateVpnGatewayRequest
     * @return CreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayResponse CreateVpnGateway(CreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAddressTemplate）用于删除IP地址模板
     * @param req DeleteAddressTemplateRequest
     * @return DeleteAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateResponse DeleteAddressTemplate(DeleteAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAddressTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAddressTemplateGroup）用于删除IP地址模板集合
     * @param req DeleteAddressTemplateGroupRequest
     * @return DeleteAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateGroupResponse DeleteAddressTemplateGroup(DeleteAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAddressTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteAssistantCidr)用于删除辅助CIDR。（接口灰度中，如需使用请提工单。）
     * @param req DeleteAssistantCidrRequest
     * @return DeleteAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssistantCidrResponse DeleteAssistantCidr(DeleteAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAssistantCidrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口支持删除共享带宽包，包括[设备带宽包](https://cloud.tencent.com/document/product/684/15246#.E8.AE.BE.E5.A4.87.E5.B8.A6.E5.AE.BD.E5.8C.85)和[IP带宽包](https://cloud.tencent.com/document/product/684/15246#ip-.E5.B8.A6.E5.AE.BD.E5.8C.85)
     * @param req DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBandwidthPackageResponse DeleteBandwidthPackage(DeleteBandwidthPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBandwidthPackageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBandwidthPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBandwidthPackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCcn）用于删除云联网。
* 删除后，云联网关联的所有实例间路由将被删除，网络将会中断，请务必确认
* 删除云联网是不可逆的操作，请谨慎处理。

     * @param req DeleteCcnRequest
     * @return DeleteCcnResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcnResponse DeleteCcn(DeleteCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCcnResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCcnResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCcn");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCustomerGateway）用于删除对端网关。
     * @param req DeleteCustomerGatewayRequest
     * @return DeleteCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomerGatewayResponse DeleteCustomerGateway(DeleteCustomerGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomerGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomerGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomerGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDhcpIp）用于删除DhcpIp
     * @param req DeleteDhcpIpRequest
     * @return DeleteDhcpIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDhcpIpResponse DeleteDhcpIp(DeleteDhcpIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDhcpIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDhcpIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDhcpIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDirectConnectGateway）用于删除专线网关。
<li>如果是 NAT 网关，删除专线网关后，NAT 规则以及 ACL 策略都被清理了。</li>
<li>删除专线网关后，系统会删除路由表中跟该专线网关相关的路由策略。</li>
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req DeleteDirectConnectGatewayRequest
     * @return DeleteDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayResponse DeleteDirectConnectGateway(DeleteDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDirectConnectGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDirectConnectGatewayCcnRoutes）用于删除专线网关的云联网路由（IDC网段）
     * @param req DeleteDirectConnectGatewayCcnRoutesRequest
     * @return DeleteDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayCcnRoutesResponse DeleteDirectConnectGatewayCcnRoutes(DeleteDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteFlowLog）用于删除流日志
     * @param req DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFlowLogResponse DeleteFlowLog(DeleteFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteHaVip）用于删除高可用虚拟IP（HAVIP）<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHaVipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHaVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteHaVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 该接口用于释放IPV6转换实例，支持批量。
2.  如果IPV6转换实例建立有转换规则，会一并删除。
     * @param req DeleteIp6TranslatorsRequest
     * @return DeleteIp6TranslatorsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIp6TranslatorsResponse DeleteIp6Translators(DeleteIp6TranslatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIp6TranslatorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIp6TranslatorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIp6Translators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteNatGateway）用于删除NAT网关。
删除 NAT 网关后，系统会自动删除路由表中包含此 NAT 网关的路由项，同时也会解绑弹性公网IP（EIP）。
     * @param req DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayResponse DeleteNatGateway(DeleteNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteNatGatewayDestinationIpPortTranslationNatRule）用于删除NAT网关端口转发规则。
     * @param req DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse DeleteNatGatewayDestinationIpPortTranslationNatRule(DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNatGatewayDestinationIpPortTranslationNatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteNetDetect)用于删除网络探测实例。
     * @param req DeleteNetDetectRequest
     * @return DeleteNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetDetectResponse DeleteNetDetect(DeleteNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetDetectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteNetworkAcl）用于删除网络ACL。
     * @param req DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclResponse DeleteNetworkAcl(DeleteNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetworkAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteNetworkInterface）用于删除弹性网卡。
* 弹性网卡上绑定了云服务器时，不能被删除。
* 删除指定弹性网卡，弹性网卡必须先和子机解绑才能删除。删除之后弹性网卡上所有内网IP都将被退还。
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除路由表
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteRoutes)用于对某个路由表批量删除路由策略（Route）。
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSecurityGroup）用于删除安全组（SecurityGroup）。
* 只有当前账号下的安全组允许被删除。
* 安全组实例ID如果在其他安全组的规则中被引用，则无法直接删除。这种情况下，需要先进行规则修改，再删除安全组。
* 删除的安全组无法再找回，请谨慎调用。
     * @param req DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupResponse DeleteSecurityGroup(DeleteSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSecurityGroupPolicies）用于用于删除安全组规则（SecurityGroupPolicy）。
* SecurityGroupPolicySet.Version 用于指定要操作的安全组的版本。传入 Version 版本号若不等于当前安全组的最新版本，将返回失败；若不传 Version 则直接删除指定PolicyIndex的规则。
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteServiceTemplate）用于删除协议端口模板
     * @param req DeleteServiceTemplateRequest
     * @return DeleteServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateResponse DeleteServiceTemplate(DeleteServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteServiceTemplateGroup）用于删除协议端口模板集合
     * @param req DeleteServiceTemplateGroupRequest
     * @return DeleteServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateGroupResponse DeleteServiceTemplateGroup(DeleteServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteServiceTemplateGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSubnet）用于用于删除子网(Subnet)。
* 删除子网前，请清理该子网下所有资源，包括云服务器、负载均衡、云数据、noSql、弹性网卡等资源。
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubnetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSubnetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSubnet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteVpc）用于删除私有网络。
* 删除前请确保 VPC 内已经没有相关资源，例如云服务器、云数据库、NoSQL、VPN网关、专线网关、负载均衡、对等连接、与之互通的基础网络设备等。
* 删除私有网络是不可逆的操作，请谨慎处理。
     * @param req DeleteVpcRequest
     * @return DeleteVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcResponse DeleteVpc(DeleteVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteVpnConnection)用于删除VPN通道。
     * @param req DeleteVpnConnectionRequest
     * @return DeleteVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnConnectionResponse DeleteVpnConnection(DeleteVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpnConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteVpnGateway）用于删除VPN网关。目前只支持删除运行中的按量计费的IPSEC网关实例。
     * @param req DeleteVpnGatewayRequest
     * @return DeleteVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayResponse DeleteVpnGateway(DeleteVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccountAttributes）用于查询用户账号私有属性。
     * @param req DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountAttributesResponse DescribeAccountAttributes(DescribeAccountAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAddressQuota) 用于查询您账户的[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）在当前地域的配额信息。配额详情可参见 [EIP 产品简介](https://cloud.tencent.com/document/product/213/5733)。
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddressQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAddressTemplateGroups）用于查询IP地址模板集合
     * @param req DescribeAddressTemplateGroupsRequest
     * @return DescribeAddressTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplateGroupsResponse DescribeAddressTemplateGroups(DescribeAddressTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplateGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplateGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddressTemplateGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAddressTemplates）用于查询IP地址模板
     * @param req DescribeAddressTemplatesRequest
     * @return DescribeAddressTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplatesResponse DescribeAddressTemplates(DescribeAddressTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddressTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAddresses) 用于查询一个或多个[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）的详细信息。
* 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的 EIP。
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAssistantCidr）用于查询辅助CIDR列表。（接口灰度中，如需使用请提工单。）
     * @param req DescribeAssistantCidrRequest
     * @return DescribeAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssistantCidrResponse DescribeAssistantCidr(DescribeAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssistantCidrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeBandwidthPackageBillUsage) 用于查询后付费共享带宽包当前的计费用量.
     * @param req DescribeBandwidthPackageBillUsageRequest
     * @return DescribeBandwidthPackageBillUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageBillUsageResponse DescribeBandwidthPackageBillUsage(DescribeBandwidthPackageBillUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageBillUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBandwidthPackageBillUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBandwidthPackageBillUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口用于查询账户在当前地域的带宽包上限数量以及使用数量
     * @param req DescribeBandwidthPackageQuotaRequest
     * @return DescribeBandwidthPackageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageQuotaResponse DescribeBandwidthPackageQuota(DescribeBandwidthPackageQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBandwidthPackageQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBandwidthPackageQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeBandwidthPackageResources) 用于根据共享带宽包唯一ID查询共享带宽包内的资源列表，支持按条件过滤查询结果和分页查询。

     * @param req DescribeBandwidthPackageResourcesRequest
     * @return DescribeBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageResourcesResponse DescribeBandwidthPackageResources(DescribeBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBandwidthPackageResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBandwidthPackageResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口用于查询带宽包详细信息，包括带宽包唯一标识ID，类型，计费模式，名称，资源信息等
     * @param req DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackagesResponse DescribeBandwidthPackages(DescribeBandwidthPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBandwidthPackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBandwidthPackages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnAttachedInstances）用于查询云联网实例下已关联的网络实例。
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnAttachedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnAttachedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnAttachedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnRegionBandwidthLimits）用于查询云联网各地域出带宽上限，该接口只返回已关联网络实例包含的地域
     * @param req DescribeCcnRegionBandwidthLimitsRequest
     * @return DescribeCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRegionBandwidthLimitsResponse DescribeCcnRegionBandwidthLimits(DescribeCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnRegionBandwidthLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnRoutes）用于查询已加入云联网（CCN）的路由
     * @param req DescribeCcnRoutesRequest
     * @return DescribeCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRoutesResponse DescribeCcnRoutes(DescribeCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcns）用于查询云联网（CCN）列表。
     * @param req DescribeCcnsRequest
     * @return DescribeCcnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnsResponse DescribeCcns(DescribeCcnsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCcns");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeClassicLinkInstances)用于查询私有网络和基础网络设备互通列表。
     * @param req DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicLinkInstancesResponse DescribeClassicLinkInstances(DescribeClassicLinkInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicLinkInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicLinkInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClassicLinkInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCrossBorderCompliance）用于查询用户创建的合规化资质审批单。
服务商可以查询服务名下的任意 `APPID` 创建的审批单；非服务商，只能查询自己审批单。
     * @param req DescribeCrossBorderComplianceRequest
     * @return DescribeCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderComplianceResponse DescribeCrossBorderCompliance(DescribeCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCrossBorderComplianceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCrossBorderComplianceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCrossBorderCompliance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCustomerGatewayVendors）用于查询可支持的对端网关厂商信息。
     * @param req DescribeCustomerGatewayVendorsRequest
     * @return DescribeCustomerGatewayVendorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewayVendorsResponse DescribeCustomerGatewayVendors(DescribeCustomerGatewayVendorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerGatewayVendorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerGatewayVendorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomerGatewayVendors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCustomerGateways）用于查询对端网关列表。
     * @param req DescribeCustomerGatewaysRequest
     * @return DescribeCustomerGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewaysResponse DescribeCustomerGateways(DescribeCustomerGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomerGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomerGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDhcpIps）用于查询DhcpIp列表
     * @param req DescribeDhcpIpsRequest
     * @return DescribeDhcpIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDhcpIpsResponse DescribeDhcpIps(DescribeDhcpIpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDhcpIpsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDhcpIpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDhcpIps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDirectConnectGatewayCcnRoutes）用于查询专线网关的云联网路由（IDC网段）
     * @param req DescribeDirectConnectGatewayCcnRoutesRequest
     * @return DescribeDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewayCcnRoutesResponse DescribeDirectConnectGatewayCcnRoutes(DescribeDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDirectConnectGateways）用于查询专线网关。
     * @param req DescribeDirectConnectGatewaysRequest
     * @return DescribeDirectConnectGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewaysResponse DescribeDirectConnectGateways(DescribeDirectConnectGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDirectConnectGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFlowLog）用于查询流日志实例信息
     * @param req DescribeFlowLogRequest
     * @return DescribeFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogResponse DescribeFlowLog(DescribeFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeFlowLogs）用于查询获取流日志集合
     * @param req DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogsResponse DescribeFlowLogs(DescribeFlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGatewayFlowMonitorDetail）用于查询网关流量监控明细。
* 只支持单个网关实例查询。即入参 `VpnId` `DirectConnectGatewayId` `PeeringConnectionId` `NatId` 最多只支持传一个，且必须传一个。
* 如果网关有流量，但调用本接口没有返回数据，请在控制台对应网关详情页确认是否开启网关流量监控。
     * @param req DescribeGatewayFlowMonitorDetailRequest
     * @return DescribeGatewayFlowMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowMonitorDetailResponse DescribeGatewayFlowMonitorDetail(DescribeGatewayFlowMonitorDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayFlowMonitorDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGatewayFlowQos）用于查询网关来访IP流控带宽。
     * @param req DescribeGatewayFlowQosRequest
     * @return DescribeGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowQosResponse DescribeGatewayFlowQos(DescribeGatewayFlowQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayFlowQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeHaVips）用于查询高可用虚拟IP（HAVIP）列表。
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHaVipsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHaVipsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHaVips");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询IPV6地址信息
     * @param req DescribeIp6AddressesRequest
     * @return DescribeIp6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIp6AddressesResponse DescribeIp6Addresses(DescribeIp6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIp6AddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIp6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIp6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账户在指定地域IPV6转换实例和规则的配额
     * @param req DescribeIp6TranslatorQuotaRequest
     * @return DescribeIp6TranslatorQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIp6TranslatorQuotaResponse DescribeIp6TranslatorQuota(DescribeIp6TranslatorQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIp6TranslatorQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIp6TranslatorQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIp6TranslatorQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 该接口用于查询账户下的IPV6转换实例及其绑定的转换规则信息
2. 支持过滤查询
     * @param req DescribeIp6TranslatorsRequest
     * @return DescribeIp6TranslatorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIp6TranslatorsResponse DescribeIp6Translators(DescribeIp6TranslatorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIp6TranslatorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIp6TranslatorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIp6Translators");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNatGatewayDestinationIpPortTranslationNatRules）用于查询NAT网关端口转发规则对象数组。
     * @param req DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest
     * @return DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse DescribeNatGatewayDestinationIpPortTranslationNatRules(DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatGatewayDestinationIpPortTranslationNatRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNatGateways）用于查询 NAT 网关。
     * @param req DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaysResponse DescribeNatGateways(DescribeNatGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeNetDetectStates)用于查询网络探测验证结果列表。
     * @param req DescribeNetDetectStatesRequest
     * @return DescribeNetDetectStatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectStatesResponse DescribeNetDetectStates(DescribeNetDetectStatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectStatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectStatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetDetectStates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNetDetects）用于查询网络探测列表。
     * @param req DescribeNetDetectsRequest
     * @return DescribeNetDetectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectsResponse DescribeNetDetects(DescribeNetDetectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetDetects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNetworkAcls）用于查询网络ACL列表。
     * @param req DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAclsResponse DescribeNetworkAcls(DescribeNetworkAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkAclsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetworkAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNetworkInterfaceLimit）根据CVM实例ID或弹性网卡ID查询弹性网卡配额，返回该CVM实例或弹性网卡能绑定的弹性网卡配额，以及弹性网卡可以分配的IP配额
     * @param req DescribeNetworkInterfaceLimitRequest
     * @return DescribeNetworkInterfaceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfaceLimitResponse DescribeNetworkInterfaceLimit(DescribeNetworkInterfaceLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfaceLimitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfaceLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetworkInterfaceLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNetworkInterfaces）用于查询弹性网卡列表。
     * @param req DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNetworkInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询网络产品的配额信息
     * @param req DescribeProductQuotaRequest
     * @return DescribeProductQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductQuotaResponse DescribeProductQuota(DescribeProductQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProductQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProductQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProductQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRouteConflicts）用于查询自定义路由策略与云联网路由策略冲突列表
     * @param req DescribeRouteConflictsRequest
     * @return DescribeRouteConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteConflictsResponse DescribeRouteConflicts(DescribeRouteConflictsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteConflictsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteConflictsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRouteConflicts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口（DescribeRouteTables）用于查询路由表。
     * @param req DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTablesResponse DescribeRouteTables(DescribeRouteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRouteTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroupAssociationStatistics）用于查询安全组关联的实例统计。
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSecurityGroupLimits)用于查询用户安全组配额。
     * @param req DescribeSecurityGroupLimitsRequest
     * @return DescribeSecurityGroupLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupLimitsResponse DescribeSecurityGroupLimits(DescribeSecurityGroupLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroupPolicies）用于查询安全组规则。
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroupReferences）用于查询安全组被引用信息。
     * @param req DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupReferencesResponse DescribeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupReferencesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupReferencesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupReferences");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroups）用于查询安全组。
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceTemplateGroups）用于查询协议端口模板集合
     * @param req DescribeServiceTemplateGroupsRequest
     * @return DescribeServiceTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplateGroupsResponse DescribeServiceTemplateGroups(DescribeServiceTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplateGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplateGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceTemplateGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceTemplates）用于查询协议端口模板
     * @param req DescribeServiceTemplatesRequest
     * @return DescribeServiceTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplatesResponse DescribeServiceTemplates(DescribeServiceTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeServiceTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSubnets）用于查询子网列表。
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询EIP异步任务执行结果
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTemplateLimits）用于查询参数模板配额列表。
     * @param req DescribeTemplateLimitsRequest
     * @return DescribeTemplateLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateLimitsResponse DescribeTemplateLimits(DescribeTemplateLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplateLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口（DescribeVpcInstances）用于查询VPC下的云主机实例列表。
     * @param req DescribeVpcInstancesRequest
     * @return DescribeVpcInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcInstancesResponse DescribeVpcInstances(DescribeVpcInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcIpv6Addresses）用于查询 `VPC` `IPv6` 信息。
只能查询已使用的`IPv6`信息，当查询未使用的IP时，本接口不会报错，但不会出现在返回结果里。
     * @param req DescribeVpcIpv6AddressesRequest
     * @return DescribeVpcIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcIpv6AddressesResponse DescribeVpcIpv6Addresses(DescribeVpcIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcIpv6AddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcIpv6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcIpv6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取私有网络配额，部分私有网络的配额有地域属性。
LimitTypes取值范围：
* appid-max-vpcs （每个开发商每个地域可创建的VPC数）
* vpc-max-subnets（每个VPC可创建的子网数）
* vpc-max-route-tables（每个VPC可创建的路由表数）
* route-table-max-policies（每个路由表可添加的策略数）
* vpc-max-vpn-gateways（每个VPC可创建的VPN网关数）
* appid-max-custom-gateways（每个开发商可创建的对端网关数）
* appid-max-vpn-connections（每个开发商可创建的VPN通道数）
* custom-gateway-max-vpn-connections（每个对端网关可创建的VPN通道数）
* vpn-gateway-max-custom-gateways（每个VPNGW可以创建的通道数）
* vpc-max-network-acls（每个VPC可创建的网络ACL数）
* network-acl-max-inbound-policies（每个网络ACL可添加的入站规则数）
* network-acl-max-outbound-policies（每个网络ACL可添加的出站规则数）
* vpc-max-vpcpeers（每个VPC可创建的对等连接数）
* vpc-max-available-vpcpeers（每个VPC可创建的有效对等连接数）
* vpc-max-basic-network-interconnections（每个VPC可创建的基础网络云主机与VPC互通数）
* direct-connection-max-snats（每个专线网关可创建的SNAT数）
* direct-connection-max-dnats（每个专线网关可创建的DNAT数）
* direct-connection-max-snapts（每个专线网关可创建的SNAPT数）
* direct-connection-max-dnapts（每个专线网关可创建的DNAPT数）
* vpc-max-nat-gateways（每个VPC可创建的NAT网关数）
* nat-gateway-max-eips（每个NAT可以购买的外网IP数量）
* vpc-max-enis（每个VPC可创建弹性网卡数）
* vpc-max-havips（每个VPC可创建HAVIP数）
* eni-max-private-ips（每个ENI可以绑定的内网IP数（ENI未绑定子机））
* nat-gateway-max-dnapts（每个NAT网关可创建的DNAPT数）
* vpc-max-ipv6s（每个VPC可分配的IPv6地址数）
* eni-max-ipv6s（每个ENI可分配的IPv6地址数）
* vpc-max-assistant_cidrs（每个VPC可分配的辅助CIDR数）
     * @param req DescribeVpcLimitsRequest
     * @return DescribeVpcLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcLimitsResponse DescribeVpcLimits(DescribeVpcLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcPrivateIpAddresses）用于查询VPC内网IP信息。<br />
只能查询已使用的IP信息，当查询未使用的IP时，本接口不会报错，但不会出现在返回结果里。
     * @param req DescribeVpcPrivateIpAddressesRequest
     * @return DescribeVpcPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPrivateIpAddressesResponse DescribeVpcPrivateIpAddresses(DescribeVpcPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcPrivateIpAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcPrivateIpAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcPrivateIpAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeVpcResourceDashboard)用于查看VPC资源信息。
     * @param req DescribeVpcResourceDashboardRequest
     * @return DescribeVpcResourceDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResourceDashboardResponse DescribeVpcResourceDashboard(DescribeVpcResourceDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcResourceDashboardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcResourceDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcResourceDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcs）用于查询私有网络列表。
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口（DescribeVpnConnections）查询VPN通道列表。
     * @param req DescribeVpnConnectionsRequest
     * @return DescribeVpnConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnConnectionsResponse DescribeVpnConnections(DescribeVpnConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnConnectionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnConnectionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpnConnections");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpnGatewayCcnRoutes）用于查询VPN网关云联网路由
     * @param req DescribeVpnGatewayCcnRoutesRequest
     * @return DescribeVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewayCcnRoutesResponse DescribeVpnGatewayCcnRoutes(DescribeVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpnGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpnGateways）用于查询VPN网关列表。
     * @param req DescribeVpnGatewaysRequest
     * @return DescribeVpnGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaysResponse DescribeVpnGateways(DescribeVpnGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewaysResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpnGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachCcnInstances）用于从云联网实例中解关联指定的网络实例。<br />
解关联网络实例后，相应的路由策略会一并删除。
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DetachClassicLinkVpc)用于删除私有网络和基础网络设备互通。
     * @param req DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public DetachClassicLinkVpcResponse DetachClassicLinkVpc(DetachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachClassicLinkVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachClassicLinkVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachClassicLinkVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachNetworkInterface）用于弹性网卡解绑云服务器。
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableCcnRoutes）用于禁用已经启用的云联网（CCN）路由
     * @param req DisableCcnRoutesRequest
     * @return DisableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCcnRoutesResponse DisableCcnRoutes(DisableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableGatewayFlowMonitor）用于关闭网关流量监控。
     * @param req DisableGatewayFlowMonitorRequest
     * @return DisableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DisableGatewayFlowMonitorResponse DisableGatewayFlowMonitor(DisableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableGatewayFlowMonitorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableGatewayFlowMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableGatewayFlowMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableRoutes）用于禁用已启用的子网路由
     * @param req DisableRoutesRequest
     * @return DisableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableRoutesResponse DisableRoutes(DisableRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DisassociateAddress) 用于解绑[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 支持CVM实例，弹性网卡上的EIP解绑
* 不支持NAT上的EIP解绑。NAT上的EIP解绑请参考[DisassociateNatGatewayAddress](https://cloud.tencent.com/document/api/215/36716)
* 只有状态为 BIND 和 BIND_ENI 的 EIP 才能进行解绑定操作。
* EIP 如果被封堵，则不能进行解绑定操作。
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisassociateDhcpIpWithAddressIp）用于将DhcpIp已绑定的弹性公网IP（EIP）解除绑定。<br />
     * @param req DisassociateDhcpIpWithAddressIpRequest
     * @return DisassociateDhcpIpWithAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDhcpIpWithAddressIpResponse DisassociateDhcpIpWithAddressIp(DisassociateDhcpIpWithAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateDhcpIpWithAddressIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateDhcpIpWithAddressIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateDhcpIpWithAddressIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将专线网关与NAT网关解绑，解绑之后，专线网关将不能通过NAT网关访问公网
     * @param req DisassociateDirectConnectGatewayNatGatewayRequest
     * @return DisassociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDirectConnectGatewayNatGatewayResponse DisassociateDirectConnectGatewayNatGateway(DisassociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateDirectConnectGatewayNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateDirectConnectGatewayNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateDirectConnectGatewayNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisassociateNatGatewayAddress）用于NAT网关解绑弹性IP。
     * @param req DisassociateNatGatewayAddressRequest
     * @return DisassociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNatGatewayAddressResponse DisassociateNatGatewayAddress(DisassociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNatGatewayAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNatGatewayAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateNatGatewayAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisassociateNetworkAclSubnets）用于网络ACL解关联vpc下的子网。
     * @param req DisassociateNetworkAclSubnetsRequest
     * @return DisassociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkAclSubnetsResponse DisassociateNetworkAclSubnets(DisassociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNetworkAclSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNetworkAclSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateNetworkAclSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisassociateNetworkInterfaceSecurityGroups）用于弹性网卡解绑安全组。支持弹性网卡完全解绑安全组。
     * @param req DisassociateNetworkInterfaceSecurityGroupsRequest
     * @return DisassociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkInterfaceSecurityGroupsResponse DisassociateNetworkInterfaceSecurityGroups(DisassociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNetworkInterfaceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNetworkInterfaceSecurityGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateNetworkInterfaceSecurityGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DownloadCustomerGatewayConfiguration)用于下载VPN通道配置。
     * @param req DownloadCustomerGatewayConfigurationRequest
     * @return DownloadCustomerGatewayConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCustomerGatewayConfigurationResponse DownloadCustomerGatewayConfiguration(DownloadCustomerGatewayConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadCustomerGatewayConfigurationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCustomerGatewayConfigurationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadCustomerGatewayConfiguration");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableCcnRoutes）用于启用已经加入云联网（CCN）的路由。<br />
本接口会校验启用后，是否与已有路由冲突，如果冲突，则无法启用，失败处理。路由冲突时，需要先禁用与之冲突的路由，才能启用该路由。
     * @param req EnableCcnRoutesRequest
     * @return EnableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCcnRoutesResponse EnableCcnRoutes(EnableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableGatewayFlowMonitor）用于开启网关流量监控。
     * @param req EnableGatewayFlowMonitorRequest
     * @return EnableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public EnableGatewayFlowMonitorResponse EnableGatewayFlowMonitor(EnableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGatewayFlowMonitorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableGatewayFlowMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableGatewayFlowMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableRoutes）用于启用已禁用的子网路由。<br />
本接口会校验启用后，是否与已有路由冲突，如果冲突，则无法启用，失败处理。路由冲突时，需要先禁用与之冲突的路由，才能启用该路由。
     * @param req EnableRoutesRequest
     * @return EnableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableRoutesResponse EnableRoutes(EnableRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetCcnRegionBandwidthLimits）用于查询云联网相关地域带宽信息，其中预付费模式的云联网仅支持地域间限速，后付费模式的云联网支持地域间限速和地域出口限速。
     * @param req GetCcnRegionBandwidthLimitsRequest
     * @return GetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public GetCcnRegionBandwidthLimitsResponse GetCcnRegionBandwidthLimits(GetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCcnRegionBandwidthLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（HaVipAssociateAddressIp）用于高可用虚拟IP（HAVIP）绑定弹性公网IP（EIP）<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req HaVipAssociateAddressIpRequest
     * @return HaVipAssociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipAssociateAddressIpResponse HaVipAssociateAddressIp(HaVipAssociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipAssociateAddressIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipAssociateAddressIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HaVipAssociateAddressIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（HaVipDisassociateAddressIp）用于将高可用虚拟IP（HAVIP）已绑定的弹性公网IP（EIP）解除绑定<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req HaVipDisassociateAddressIpRequest
     * @return HaVipDisassociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipDisassociateAddressIpResponse HaVipDisassociateAddressIp(HaVipDisassociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipDisassociateAddressIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipDisassociateAddressIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HaVipDisassociateAddressIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceCreateVpnGateway）用于创建VPN网关询价。
     * @param req InquiryPriceCreateVpnGatewayRequest
     * @return InquiryPriceCreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateVpnGatewayResponse InquiryPriceCreateVpnGateway(InquiryPriceCreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateVpnGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceCreateVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceRenewVpnGateway）用于续费VPN网关询价。目前仅支持IPSEC类型网关的询价。
     * @param req InquiryPriceRenewVpnGatewayRequest
     * @return InquiryPriceRenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewVpnGatewayResponse InquiryPriceRenewVpnGateway(InquiryPriceRenewVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewVpnGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceRenewVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceRenewVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceResetVpnGatewayInternetMaxBandwidth）调整VPN网关带宽上限询价。
     * @param req InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest
     * @return InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse InquiryPriceResetVpnGatewayInternetMaxBandwidth(InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InquiryPriceResetVpnGatewayInternetMaxBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（MigrateNetworkInterface）用于弹性网卡迁移。
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigrateNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MigrateNetworkInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MigrateNetworkInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口（MigratePrivateIpAddress）用于弹性网卡内网IP迁移。

* 该接口用于将一个内网IP从一个弹性网卡上迁移到另外一个弹性网卡，主IP地址不支持迁移。
* 迁移前后的弹性网卡必须在同一个子网内。
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigratePrivateIpAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MigratePrivateIpAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MigratePrivateIpAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyAddressAttribute) 用于修改[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）的名称。
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于调整具有带宽属性弹性公网IP的网络计费模式
* 支持BANDWIDTH_PREPAID_BY_MONTH和TRAFFIC_POSTPAID_BY_HOUR两种网络计费模式之间的切换。
* 每个弹性公网IP支持调整两次，次数超出则无法调整。
     * @param req ModifyAddressInternetChargeTypeRequest
     * @return ModifyAddressInternetChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressInternetChargeTypeResponse ModifyAddressInternetChargeType(ModifyAddressInternetChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressInternetChargeTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressInternetChargeTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressInternetChargeType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAddressTemplateAttribute）用于修改IP地址模板
     * @param req ModifyAddressTemplateAttributeRequest
     * @return ModifyAddressTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateAttributeResponse ModifyAddressTemplateAttribute(ModifyAddressTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressTemplateAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAddressTemplateGroupAttribute）用于修改IP地址模板集合
     * @param req ModifyAddressTemplateGroupAttributeRequest
     * @return ModifyAddressTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateGroupAttributeResponse ModifyAddressTemplateGroupAttribute(ModifyAddressTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressTemplateGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAddressesBandwidth）用于调整[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)(简称EIP)带宽，支持后付费EIP, 预付费EIP和带宽包EIP
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressesBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressesBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAddressesBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyAssistantCidr)用于批量修改辅助CIDR，支持新增和删除。（接口灰度中，如需使用请提工单。）
     * @param req ModifyAssistantCidrRequest
     * @return ModifyAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssistantCidrResponse ModifyAssistantCidr(ModifyAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssistantCidrResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssistantCidrResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssistantCidr");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口用于修改带宽包属性，包括带宽包名字等
     * @param req ModifyBandwidthPackageAttributeRequest
     * @return ModifyBandwidthPackageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBandwidthPackageAttributeResponse ModifyBandwidthPackageAttribute(ModifyBandwidthPackageAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBandwidthPackageAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBandwidthPackageAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBandwidthPackageAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCcnAttribute）用于修改云联网（CCN）的相关属性。
     * @param req ModifyCcnAttributeRequest
     * @return ModifyCcnAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttributeResponse ModifyCcnAttribute(ModifyCcnAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCcnAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCcnRegionBandwidthLimitsType）用于修改后付费云联网实例修改带宽限速策略。
     * @param req ModifyCcnRegionBandwidthLimitsTypeRequest
     * @return ModifyCcnRegionBandwidthLimitsTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnRegionBandwidthLimitsTypeResponse ModifyCcnRegionBandwidthLimitsType(ModifyCcnRegionBandwidthLimitsTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnRegionBandwidthLimitsTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnRegionBandwidthLimitsTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCcnRegionBandwidthLimitsType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCustomerGatewayAttribute）用于修改对端网关信息。
     * @param req ModifyCustomerGatewayAttributeRequest
     * @return ModifyCustomerGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomerGatewayAttributeResponse ModifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomerGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomerGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomerGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDhcpIpAttribute）用于修改DhcpIp属性
     * @param req ModifyDhcpIpAttributeRequest
     * @return ModifyDhcpIpAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDhcpIpAttributeResponse ModifyDhcpIpAttribute(ModifyDhcpIpAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDhcpIpAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDhcpIpAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDhcpIpAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyDirectConnectGatewayAttribute）用于修改专线网关属性

     * @param req ModifyDirectConnectGatewayAttributeRequest
     * @return ModifyDirectConnectGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectGatewayAttributeResponse ModifyDirectConnectGatewayAttribute(ModifyDirectConnectGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDirectConnectGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDirectConnectGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDirectConnectGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyFlowLogAttribute）用于修改流日志属性
     * @param req ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFlowLogAttributeResponse ModifyFlowLogAttribute(ModifyFlowLogAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFlowLogAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFlowLogAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFlowLogAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyGatewayFlowQos）用于调整网关流控带宽。
     * @param req ModifyGatewayFlowQosRequest
     * @return ModifyGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayFlowQosResponse ModifyGatewayFlowQos(ModifyGatewayFlowQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGatewayFlowQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGatewayFlowQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyGatewayFlowQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyHaVipAttribute）用于修改高可用虚拟IP（HAVIP）属性
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHaVipAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHaVipAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHaVipAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改IPV6地址访问internet的带宽
     * @param req ModifyIp6AddressesBandwidthRequest
     * @return ModifyIp6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIp6AddressesBandwidthResponse ModifyIp6AddressesBandwidth(ModifyIp6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIp6AddressesBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIp6AddressesBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIp6AddressesBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改IPV6转换规则，当前仅支持修改转换规则名称，IPV4地址和IPV4端口号
     * @param req ModifyIp6RuleRequest
     * @return ModifyIp6RuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIp6RuleResponse ModifyIp6Rule(ModifyIp6RuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIp6RuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIp6RuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIp6Rule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改IP6转换实例属性，当前仅支持修改实例名称。
     * @param req ModifyIp6TranslatorRequest
     * @return ModifyIp6TranslatorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIp6TranslatorResponse ModifyIp6Translator(ModifyIp6TranslatorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIp6TranslatorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIp6TranslatorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIp6Translator");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyIpv6AddressesAttribute）用于修改弹性网卡内网IPv6地址属性。
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIpv6AddressesAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIpv6AddressesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIpv6AddressesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNatGatewayAttribute）用于修改NAT网关的属性。
     * @param req ModifyNatGatewayAttributeRequest
     * @return ModifyNatGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayAttributeResponse ModifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNatGatewayDestinationIpPortTranslationNatRule）用于修改NAT网关端口转发规则。
     * @param req ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse ModifyNatGatewayDestinationIpPortTranslationNatRule(ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatGatewayDestinationIpPortTranslationNatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyNetDetect)用于修改网络探测参数。
     * @param req ModifyNetDetectRequest
     * @return ModifyNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetDetectResponse ModifyNetDetect(ModifyNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetDetectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetDetectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetDetect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNetworkAclAttribute）用于修改网络ACL属性。
     * @param req ModifyNetworkAclAttributeRequest
     * @return ModifyNetworkAclAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclAttributeResponse ModifyNetworkAclAttribute(ModifyNetworkAclAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkAclAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetworkAclAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNetworkAclEntries）用于修改（包括添加和删除）网络ACL的入站规则和出站规则。在NetworkAclEntrySet参数中：
* 若同时传入入站规则和出站规则，则重置原有的入站规则和出站规则，并分别导入传入的规则。
* 若仅传入入站规则，则仅重置原有的入站规则，并导入传入的规则，不影响原有的出站规则（若仅传入出站规则，处理方式类似入站方向）。
     * @param req ModifyNetworkAclEntriesRequest
     * @return ModifyNetworkAclEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclEntriesResponse ModifyNetworkAclEntries(ModifyNetworkAclEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclEntriesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkAclEntriesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetworkAclEntries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNetworkInterfaceAttribute）用于修改弹性网卡属性。
     * @param req ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkInterfaceAttributeResponse ModifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkInterfaceAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkInterfaceAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNetworkInterfaceAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyPrivateIpAddressesAttribute）用于修改弹性网卡内网IP属性。
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrivateIpAddressesAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyRouteTableAttribute）用于修改路由表（RouteTable）属性。
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRouteTableAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRouteTableAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRouteTableAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySecurityGroupAttribute）用于修改安全组（SecurityGroupPolicy）属性。
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySecurityGroupPolicies）用于重置安全组出站和入站规则（SecurityGroupPolicy）。

<ul>
<li>接口是先删除当前所有的出入站规则，然后再添加 Egress 和 Ingress 规则，不支持自定义索引 PolicyIndex。</li>
<li>在 SecurityGroupPolicySet 参数中：<ul>
	<li> 如果指定 SecurityGroupPolicySet.Version 为0, 表示清空所有规则，并忽略 Egress 和 Ingress。</li>
	<li> 如果指定 SecurityGroupPolicySet.Version 不为0, 在添加出站和入站规则（Egress 和 Ingress）时：<ul>
		<li>Protocol 字段支持输入 TCP, UDP, ICMP, ICMPV6, GRE, ALL。</li>
		<li>CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。(展开)在基础网络中，如果 CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
		<li>Ipv6CidrBlock 字段允许输入符合 IPv6 cidr 格式标准的任意字符串。(展开)在基础网络中，如果Ipv6CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IPv6，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
		<li>SecurityGroupId 字段允许输入与待修改的安全组位于相同项目中的安全组 ID，包括这个安全组 ID 本身，代表安全组下所有云服务器的内网 IP。使用这个字段时，这条规则用来匹配网络报文的过程中会随着被使用的这个ID所关联的云服务器变化而变化，不需要重新修改。</li>
		<li>Port 字段允许输入一个单独端口号，或者用减号分隔的两个端口号代表端口范围，例如80或8000-8010。只有当 Protocol 字段是 TCP 或 UDP 时，Port 字段才被接受。</li>
		<li>Action 字段只允许输入 ACCEPT 或 DROP。</li>
		<li>CidrBlock, Ipv6CidrBlock, SecurityGroupId, AddressTemplate 四者是排他关系，不允许同时输入，Protocol + Port 和 ServiceTemplate 二者是排他关系，不允许同时输入。</li>
</ul></li></ul></li>
</ul>
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyServiceTemplateAttribute）用于修改协议端口模板
     * @param req ModifyServiceTemplateAttributeRequest
     * @return ModifyServiceTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateAttributeResponse ModifyServiceTemplateAttribute(ModifyServiceTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceTemplateAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyServiceTemplateGroupAttribute）用于修改协议端口模板集合。
     * @param req ModifyServiceTemplateGroupAttributeRequest
     * @return ModifyServiceTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateGroupAttributeResponse ModifyServiceTemplateGroupAttribute(ModifyServiceTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceTemplateGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySubnetAttribute）用于修改子网属性。
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubnetAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubnetAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubnetAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpcAttribute）用于修改私有网络（VPC）的相关属性。
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpcAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpcAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpnConnectionAttribute）用于修改VPN通道。
     * @param req ModifyVpnConnectionAttributeRequest
     * @return ModifyVpnConnectionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnConnectionAttributeResponse ModifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnConnectionAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnConnectionAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpnConnectionAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpnGatewayAttribute）用于修改VPN网关属性。
     * @param req ModifyVpnGatewayAttributeRequest
     * @return ModifyVpnGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayAttributeResponse ModifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpnGatewayAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpnGatewayCcnRoutes）用于修改VPN网关云联网路由
     * @param req ModifyVpnGatewayCcnRoutesRequest
     * @return ModifyVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayCcnRoutesResponse ModifyVpnGatewayCcnRoutes(ModifyVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpnGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RejectAttachCcnInstances）用于跨账号关联实例时，云联网所有者拒绝关联操作。

     * @param req RejectAttachCcnInstancesRequest
     * @return RejectAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RejectAttachCcnInstancesResponse RejectAttachCcnInstances(RejectAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectAttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RejectAttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RejectAttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ReleaseAddresses) 用于释放一个或多个[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 该操作不可逆，释放后 EIP 关联的 IP 地址将不再属于您的名下。
* 只有状态为 UNBIND 的 EIP 才能进行释放操作。
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于给弹性公网IPv6地址释放带宽。
     * @param req ReleaseIp6AddressesBandwidthRequest
     * @return ReleaseIp6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIp6AddressesBandwidthResponse ReleaseIp6AddressesBandwidth(ReleaseIp6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseIp6AddressesBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseIp6AddressesBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseIp6AddressesBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口用于删除带宽包资源，包括[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)和[负载均衡](https://cloud.tencent.com/document/product/214/517)等
     * @param req RemoveBandwidthPackageResourcesRequest
     * @return RemoveBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBandwidthPackageResourcesResponse RemoveBandwidthPackageResources(RemoveBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveBandwidthPackageResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveBandwidthPackageResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *1. 该接口用于删除IPV6转换规则
2. 支持批量删除同一个转换实例下的多个转换规则
     * @param req RemoveIp6RulesRequest
     * @return RemoveIp6RulesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveIp6RulesResponse RemoveIp6Rules(RemoveIp6RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveIp6RulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveIp6RulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveIp6Rules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于续费包月带宽计费模式的弹性公网IP
     * @param req RenewAddressesRequest
     * @return RenewAddressesResponse
     * @throws TencentCloudSDKException
     */
    public RenewAddressesResponse RenewAddresses(RenewAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RenewVpnGateway）用于预付费（包年包月）VPN网关续费。目前只支持IPSEC网关。
     * @param req RenewVpnGatewayRequest
     * @return RenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public RenewVpnGatewayResponse RenewVpnGateway(RenewVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewVpnGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RenewVpnGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RenewVpnGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceDirectConnectGatewayCcnRoutes）根据路由ID（RouteId）修改指定的路由（Route），支持批量修改。
     * @param req ReplaceDirectConnectGatewayCcnRoutesRequest
     * @return ReplaceDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceDirectConnectGatewayCcnRoutesResponse ReplaceDirectConnectGatewayCcnRoutes(ReplaceDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceDirectConnectGatewayCcnRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceRouteTableAssociation)用于修改子网（Subnet）关联的路由表（RouteTable）。
* 一个子网只能关联一个路由表。
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRouteTableAssociationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRouteTableAssociationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceRouteTableAssociation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceRoutes）根据路由策略ID（RouteId）修改指定的路由策略（Route），支持批量修改。
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceSecurityGroupPolicy）用于替换单条安全组规则（SecurityGroupPolicy）。
单个请求中只能替换单个方向的一条规则, 必须要指定索引（PolicyIndex）。
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceSecurityGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceSecurityGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceSecurityGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetAttachCcnInstances）用于跨账号关联实例申请过期时，重新申请关联操作。
     * @param req ResetAttachCcnInstancesRequest
     * @return ResetAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnInstancesResponse ResetAttachCcnInstances(ResetAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAttachCcnInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetAttachCcnInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetNatGatewayConnection）用来NAT网关并发连接上限。
     * @param req ResetNatGatewayConnectionRequest
     * @return ResetNatGatewayConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetNatGatewayConnectionResponse ResetNatGatewayConnection(ResetNatGatewayConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetNatGatewayConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetNatGatewayConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetNatGatewayConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetRoutes）用于对某个路由表名称和所有路由策略（Route）进行重新设置。<br />
注意: 调用本接口是先删除当前路由表中所有路由策略, 再保存新提交的路由策略内容, 会引起网络中断。
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ResetVpnConnection)用于重置VPN通道。
     * @param req ResetVpnConnectionRequest
     * @return ResetVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnConnectionResponse ResetVpnConnection(ResetVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetVpnConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetVpnGatewayInternetMaxBandwidth）调整VPN网关带宽上限。目前支持升级配置，如果是包年包月VPN网关需要在有效期内。
     * @param req ResetVpnGatewayInternetMaxBandwidthRequest
     * @return ResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnGatewayInternetMaxBandwidthResponse ResetVpnGatewayInternetMaxBandwidth(ResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetVpnGatewayInternetMaxBandwidth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetCcnRegionBandwidthLimits）用于设置云联网（CCN）各地域出带宽上限，或者地域间带宽上限。
     * @param req SetCcnRegionBandwidthLimitsRequest
     * @return SetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public SetCcnRegionBandwidthLimitsResponse SetCcnRegionBandwidthLimits(SetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetCcnRegionBandwidthLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (TransformAddress) 用于将实例的普通公网 IP 转换为[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 平台对用户每地域每日解绑 EIP 重新分配普通公网 IP 次数有所限制（可参见 [EIP 产品简介](/document/product/213/1941)）。上述配额可通过 [DescribeAddressQuota](https://cloud.tencent.com/document/api/213/1378) 接口获取。
     * @param req TransformAddressRequest
     * @return TransformAddressResponse
     * @throws TencentCloudSDKException
     */
    public TransformAddressResponse TransformAddress(TransformAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransformAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransformAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransformAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignIpv6Addresses）用于释放弹性网卡`IPv6`地址。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口。
     * @param req UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6AddressesResponse UnassignIpv6Addresses(UnassignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6AddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6AddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignIpv6Addresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignIpv6CidrBlock）用于释放IPv6网段。<br />
网段如果还有IP占用且未回收，则网段无法释放。
     * @param req UnassignIpv6CidrBlockRequest
     * @return UnassignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6CidrBlockResponse UnassignIpv6CidrBlock(UnassignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6CidrBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6CidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignIpv6CidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignIpv6SubnetCidrBlock）用于释放IPv6子网段。<br />
子网段如果还有IP占用且未回收，则子网段无法释放。
     * @param req UnassignIpv6SubnetCidrBlockRequest
     * @return UnassignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6SubnetCidrBlockResponse UnassignIpv6SubnetCidrBlock(UnassignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignIpv6SubnetCidrBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignPrivateIpAddresses）用于弹性网卡退还内网 IP。
* 退还弹性网卡上的辅助内网IP，接口自动解关联弹性公网 IP。不能退还弹性网卡的主内网IP。
     * @param req UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignPrivateIpAddressesResponse UnassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignPrivateIpAddressesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignPrivateIpAddressesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnassignPrivateIpAddresses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
