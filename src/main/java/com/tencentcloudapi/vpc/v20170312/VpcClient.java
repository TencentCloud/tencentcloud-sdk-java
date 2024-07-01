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
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptAttachCcnInstances", AcceptAttachCcnInstancesResponse.class);
    }

    /**
     *本接口（AcceptVpcPeeringConnection）用于接受对等连接请求。
     * @param req AcceptVpcPeeringConnectionRequest
     * @return AcceptVpcPeeringConnectionResponse
     * @throws TencentCloudSDKException
     */
    public AcceptVpcPeeringConnectionResponse AcceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptVpcPeeringConnection", AcceptVpcPeeringConnectionResponse.class);
    }

    /**
     *接口用于添加带宽包资源，包括[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)和[负载均衡](https://cloud.tencent.com/document/product/214/517)等
     * @param req AddBandwidthPackageResourcesRequest
     * @return AddBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AddBandwidthPackageResourcesResponse AddBandwidthPackageResources(AddBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddBandwidthPackageResources", AddBandwidthPackageResourcesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddIp6Rules", AddIp6RulesResponse.class);
    }

    /**
     *增加模板对象中的IP地址、协议端口、IP地址组、协议端口组。
     * @param req AddTemplateMemberRequest
     * @return AddTemplateMemberResponse
     * @throws TencentCloudSDKException
     */
    public AddTemplateMemberResponse AddTemplateMember(AddTemplateMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTemplateMember", AddTemplateMemberResponse.class);
    }

    /**
     *本接口 (AdjustPublicAddress) 用于更换IP地址，支持更换CVM实例的普通公网IP和包月带宽的EIP。
     * @param req AdjustPublicAddressRequest
     * @return AdjustPublicAddressResponse
     * @throws TencentCloudSDKException
     */
    public AdjustPublicAddressResponse AdjustPublicAddress(AdjustPublicAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AdjustPublicAddress", AdjustPublicAddressResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateAddresses", AllocateAddressesResponse.class);
    }

    /**
     *该接口用于给IPv6地址初次分配公网带宽
     * @param req AllocateIp6AddressesBandwidthRequest
     * @return AllocateIp6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public AllocateIp6AddressesBandwidthResponse AllocateIp6AddressesBandwidth(AllocateIp6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateIp6AddressesBandwidth", AllocateIp6AddressesBandwidthResponse.class);
    }

    /**
     *本接口（AssignIpv6Addresses）用于弹性网卡申请`IPv6`地址。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 可以指定`IPv6`地址申请，地址类型不能为主`IP`，`IPv6`地址暂时只支持作为辅助`IP`。
* 地址必须要在弹性网卡所在子网内，而且不能被占用。
* 在弹性网卡上申请一个到多个辅助`IPv6`地址，接口会在弹性网卡所在子网段内返回指定数量的辅助`IPv6`地址。
     * @param req AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6AddressesResponse AssignIpv6Addresses(AssignIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6Addresses", AssignIpv6AddressesResponse.class);
    }

    /**
     *本接口（AssignIpv6CidrBlock）用于分配IPv6网段。
* 使用本接口前，您需要已有VPC实例，如果没有可通过接口<a href="https://cloud.tencent.com/document/api/215/15774" title="CreateVpc" target="_blank">CreateVpc</a>创建。
* 每个VPC只能申请一个IPv6网段。
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6CidrBlock", AssignIpv6CidrBlockResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6SubnetCidrBlock", AssignIpv6SubnetCidrBlockResponse.class);
    }

    /**
     *本接口（AssignPrivateIpAddresses）用于弹性网卡申请内网 IP。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 可以指定内网IP地址申请，内网IP地址类型不能为主IP，主IP已存在，不能修改，内网IP必须要弹性网卡所在子网内，而且不能被占用。
* 在弹性网卡上申请一个到多个辅助内网IP，接口会在弹性网卡所在子网网段内返回指定数量的辅助内网IP。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignPrivateIpAddressesResponse AssignPrivateIpAddresses(AssignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignPrivateIpAddresses", AssignPrivateIpAddressesResponse.class);
    }

    /**
     *本接口 (AssociateAddress) 用于将[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）绑定到实例或弹性网卡的指定内网 IP 上。
* 将 EIP 绑定到实例（CVM）上，其本质是将 EIP 绑定到实例上主网卡的主内网 IP 上。
* 将 EIP 绑定到主网卡的主内网IP上，绑定过程会把其上绑定的普通公网 IP 自动解绑并释放。
* 将 EIP 绑定到指定网卡的内网 IP上（非主网卡的主内网IP），则必须先解绑该 EIP，才能再绑定新的。
* 将 EIP 绑定到内网型CLB实例的功能处于内测阶段，如需使用，请提交内测申请。
* 将 EIP 绑定到NAT网关，请使用接口[AssociateNatGatewayAddress](https://cloud.tencent.com/document/product/215/36722)
* EIP 如果欠费或被封堵，则不能被绑定。
* 只有状态为 UNBIND 的 EIP 才能够被绑定。
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateAddress", AssociateAddressResponse.class);
    }

    /**
     *本接口（AssociateDhcpIpWithAddressIp）用于DhcpIp绑定弹性公网IP（EIP）。<br />
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req AssociateDhcpIpWithAddressIpRequest
     * @return AssociateDhcpIpWithAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDhcpIpWithAddressIpResponse AssociateDhcpIpWithAddressIp(AssociateDhcpIpWithAddressIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateDhcpIpWithAddressIp", AssociateDhcpIpWithAddressIpResponse.class);
    }

    /**
     *将专线网关与NAT网关绑定，专线网关默认路由指向NAT网关
     * @param req AssociateDirectConnectGatewayNatGatewayRequest
     * @return AssociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDirectConnectGatewayNatGatewayResponse AssociateDirectConnectGatewayNatGateway(AssociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateDirectConnectGatewayNatGateway", AssociateDirectConnectGatewayNatGatewayResponse.class);
    }

    /**
     *本接口(AssociateNatGatewayAddress)用于NAT网关绑定弹性IP（EIP）。
     * @param req AssociateNatGatewayAddressRequest
     * @return AssociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNatGatewayAddressResponse AssociateNatGatewayAddress(AssociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateNatGatewayAddress", AssociateNatGatewayAddressResponse.class);
    }

    /**
     *本接口（AssociateNetworkAclSubnets）用于网络ACL关联VPC下的子网。
     * @param req AssociateNetworkAclSubnetsRequest
     * @return AssociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkAclSubnetsResponse AssociateNetworkAclSubnets(AssociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateNetworkAclSubnets", AssociateNetworkAclSubnetsResponse.class);
    }

    /**
     *本接口（AssociateNetworkInterfaceSecurityGroups）用于弹性网卡绑定安全组（SecurityGroup）。
     * @param req AssociateNetworkInterfaceSecurityGroupsRequest
     * @return AssociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkInterfaceSecurityGroupsResponse AssociateNetworkInterfaceSecurityGroups(AssociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateNetworkInterfaceSecurityGroups", AssociateNetworkInterfaceSecurityGroupsResponse.class);
    }

    /**
     *本接口（AttachCcnInstances）用于将网络实例加载到云联网实例中，网络实例包括VPC和专线网关。<br />
每个云联网能够关联的网络实例个数是有限的，详情请参考产品文档。如果需要扩充请联系在线客服。
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachCcnInstances", AttachCcnInstancesResponse.class);
    }

    /**
     *本接口(AttachClassicLinkVpc)用于创建私有网络和基础网络设备互通。
* 私有网络和基础网络设备必须在同一个地域。
* 私有网络和基础网络的区别详见vpc产品文档-<a href="https://cloud.tencent.com/document/product/215/30720">私有网络与基础网络</a>。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public AttachClassicLinkVpcResponse AttachClassicLinkVpc(AttachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachClassicLinkVpc", AttachClassicLinkVpcResponse.class);
    }

    /**
     *本接口（AttachNetworkInterface）用于弹性网卡绑定云服务器。
* 一个弹性网卡请至少绑定一个安全组，如需绑定请参见<a href="https://cloud.tencent.com/document/product/215/43132">弹性网卡绑定安全组</a>。
* 一个云服务器可以绑定多个弹性网卡，但只能绑定一个主网卡。更多限制信息详见<a href="https://cloud.tencent.com/document/product/576/18527">弹性网卡使用限制</a>。
* 一个弹性网卡只能同时绑定一个云服务器。
* 只有运行中或者已关机状态的云服务器才能绑定弹性网卡，查看云服务器状态详见<a href="https://cloud.tencent.com/document/api/213/9452#InstanceStatus">腾讯云服务器信息</a>。
* 弹性网卡绑定的云服务器必须是私有网络的，而且云服务器所在可用区必须和弹性网卡子网的可用区相同。

本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachNetworkInterface", AttachNetworkInterfaceResponse.class);
    }

    /**
     *本接口（AttachSnapshotInstances）用于快照策略关联实例。
     * @param req AttachSnapshotInstancesRequest
     * @return AttachSnapshotInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachSnapshotInstancesResponse AttachSnapshotInstances(AttachSnapshotInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachSnapshotInstances", AttachSnapshotInstancesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AuditCrossBorderCompliance", AuditCrossBorderComplianceResponse.class);
    }

    /**
     *本接口（CheckAssistantCidr）用于检查辅助CIDR是否与存量路由、对等连接（对端VPC的CIDR）等资源存在冲突。如果存在重叠，则返回重叠的资源。
* 检测辅助CIDR是否与当前VPC的主CIDR和辅助CIDR存在重叠。
* 检测辅助CIDR是否与当前VPC的路由的目的端存在重叠。
* 检测辅助CIDR是否与当前VPC的对等连接，对端VPC下的主CIDR或辅助CIDR存在重叠。
     * @param req CheckAssistantCidrRequest
     * @return CheckAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CheckAssistantCidrResponse CheckAssistantCidr(CheckAssistantCidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckAssistantCidr", CheckAssistantCidrResponse.class);
    }

    /**
     *本接口（CheckDefaultSubnet）用于预判是否可建默认子网。
     * @param req CheckDefaultSubnetRequest
     * @return CheckDefaultSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CheckDefaultSubnetResponse CheckDefaultSubnet(CheckDefaultSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckDefaultSubnet", CheckDefaultSubnetResponse.class);
    }

    /**
     *本接口（CheckNetDetectState）用于验证网络探测。
     * @param req CheckNetDetectStateRequest
     * @return CheckNetDetectStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetDetectStateResponse CheckNetDetectState(CheckNetDetectStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckNetDetectState", CheckNetDetectStateResponse.class);
    }

    /**
     *本接口（CloneSecurityGroup）用于根据存量的安全组，克隆创建出同样规则配置的安全组。仅克隆安全组及其规则信息，不会克隆安全组标签信息。
     * @param req CloneSecurityGroupRequest
     * @return CloneSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CloneSecurityGroupResponse CloneSecurityGroup(CloneSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloneSecurityGroup", CloneSecurityGroupResponse.class);
    }

    /**
     *本接口（CreateAddressTemplate）用于创建IP地址模板。
     * @param req CreateAddressTemplateRequest
     * @return CreateAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateResponse CreateAddressTemplate(CreateAddressTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAddressTemplate", CreateAddressTemplateResponse.class);
    }

    /**
     *本接口（CreateAddressTemplateGroup）用于创建IP地址模板集合。
     * @param req CreateAddressTemplateGroupRequest
     * @return CreateAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateGroupResponse CreateAddressTemplateGroup(CreateAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAddressTemplateGroup", CreateAddressTemplateGroupResponse.class);
    }

    /**
     *本接口（CreateAndAttachNetworkInterface）用于创建弹性网卡并绑定云服务器。
* 创建弹性网卡时可以指定内网IP，并且可以指定一个主IP，指定的内网IP必须在弹性网卡所在子网内，而且不能被占用。
* 创建弹性网卡时可以指定需要申请的内网IP数量，系统会随机生成内网IP地址。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 创建弹性网卡同时可以绑定已有安全组。
* 创建弹性网卡同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req CreateAndAttachNetworkInterfaceRequest
     * @return CreateAndAttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndAttachNetworkInterfaceResponse CreateAndAttachNetworkInterface(CreateAndAttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndAttachNetworkInterface", CreateAndAttachNetworkInterfaceResponse.class);
    }

    /**
     *本接口（CreateAssistantCidr）用于批量创建辅助CIDR。
     * @param req CreateAssistantCidrRequest
     * @return CreateAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssistantCidrResponse CreateAssistantCidr(CreateAssistantCidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAssistantCidr", CreateAssistantCidrResponse.class);
    }

    /**
     *本接口 (CreateBandwidthPackage) 支持创建[设备带宽包](https://cloud.tencent.com/document/product/684/15245#bwptype)和[IP带宽包](https://cloud.tencent.com/document/product/684/15245#bwptype)。
     * @param req CreateBandwidthPackageRequest
     * @return CreateBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateBandwidthPackageResponse CreateBandwidthPackage(CreateBandwidthPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBandwidthPackage", CreateBandwidthPackageResponse.class);
    }

    /**
     *本接口（CreateCcn）用于创建云联网（CCN）。<br />
* 创建云联网同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
* 每个账号能创建的云联网实例个数是有限的，详请参考产品文档。如果需要扩充请联系在线客服。
     * @param req CreateCcnRequest
     * @return CreateCcnResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcnResponse CreateCcn(CreateCcnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCcn", CreateCcnResponse.class);
    }

    /**
     *本接口（CreateCustomerGateway）用于创建对端网关。
     * @param req CreateCustomerGatewayRequest
     * @return CreateCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomerGatewayResponse CreateCustomerGateway(CreateCustomerGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomerGateway", CreateCustomerGatewayResponse.class);
    }

    /**
     *本接口（CreateDefaultSecurityGroup）用于创建（如果项目下未存在默认安全组，则创建；已存在则获取。）默认安全组（SecurityGroup）。
* 每个账户下每个地域的每个项目的<a href="https://cloud.tencent.com/document/product/213/12453">安全组数量限制</a>。
* 默认安全组会放通所有IPv4规则，在创建后通常您需要再调用CreateSecurityGroupPolicies将安全组的规则设置为需要的规则。
* 创建安全组同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateDefaultSecurityGroupRequest
     * @return CreateDefaultSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultSecurityGroupResponse CreateDefaultSecurityGroup(CreateDefaultSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDefaultSecurityGroup", CreateDefaultSecurityGroupResponse.class);
    }

    /**
     *本接口（CreateDefaultVpc）用于创建默认私有网络(VPC）。

默认VPC适用于快速入门和启动公共实例，您可以像使用任何其他VPC一样使用默认VPC。如果您想创建标准VPC，即指定VPC名称、VPC网段、子网网段、子网可用区，请使用常规创建VPC接口（CreateVpc）

正常情况，本接口并不一定生产默认VPC，而是根据用户账号的网络属性（DescribeAccountAttributes）来决定的
* 支持基础网络、VPC，返回VpcId为0
* 只支持VPC，返回默认VPC信息

您也可以通过 Force 参数，强制返回默认VPC。
     * @param req CreateDefaultVpcRequest
     * @return CreateDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultVpcResponse CreateDefaultVpc(CreateDefaultVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDefaultVpc", CreateDefaultVpcResponse.class);
    }

    /**
     *本接口（CreateDhcpIp）用于创建DhcpIp。
     * @param req CreateDhcpIpRequest
     * @return CreateDhcpIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDhcpIpResponse CreateDhcpIp(CreateDhcpIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDhcpIp", CreateDhcpIpResponse.class);
    }

    /**
     *本接口（CreateDirectConnectGateway）用于创建专线网关。
     * @param req CreateDirectConnectGatewayRequest
     * @return CreateDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayResponse CreateDirectConnectGateway(CreateDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDirectConnectGateway", CreateDirectConnectGatewayResponse.class);
    }

    /**
     *本接口（CreateDirectConnectGatewayCcnRoutes）用于创建专线网关的云联网路由（IDC网段）
     * @param req CreateDirectConnectGatewayCcnRoutesRequest
     * @return CreateDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayCcnRoutesResponse CreateDirectConnectGatewayCcnRoutes(CreateDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDirectConnectGatewayCcnRoutes", CreateDirectConnectGatewayCcnRoutesResponse.class);
    }

    /**
     *本接口（CreateFlowLog）用于创建网络流日志。
     * @param req CreateFlowLogRequest
     * @return CreateFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowLogResponse CreateFlowLog(CreateFlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFlowLog", CreateFlowLogResponse.class);
    }

    /**
     *本接口（CreateHaVip）用于创建高可用虚拟IP（HAVIP）。
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHaVip", CreateHaVipResponse.class);
    }

    /**
     *1. 该接口用于创建IPV6转换IPV4实例，支持批量
2. 同一个账户在一个地域最多允许创建10个转换实例
     * @param req CreateIp6TranslatorsRequest
     * @return CreateIp6TranslatorsResponse
     * @throws TencentCloudSDKException
     */
    public CreateIp6TranslatorsResponse CreateIp6Translators(CreateIp6TranslatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIp6Translators", CreateIp6TranslatorsResponse.class);
    }

    /**
     *本接口（CreateLocalGateway）用于创建用于CDC的本地网关。
     * @param req CreateLocalGatewayRequest
     * @return CreateLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateLocalGatewayResponse CreateLocalGateway(CreateLocalGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLocalGateway", CreateLocalGatewayResponse.class);
    }

    /**
     *本接口(CreateNatGateway)用于创建NAT网关。
在对新建的NAT网关做其他操作前，需先确认此网关已被创建完成（DescribeNatGateway接口返回的实例State字段为AVAILABLE）。
     * @param req CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayResponse CreateNatGateway(CreateNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatGateway", CreateNatGatewayResponse.class);
    }

    /**
     *本接口(CreateNatGatewayDestinationIpPortTranslationNatRule)用于创建NAT网关端口转发规则。
     * @param req CreateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return CreateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayDestinationIpPortTranslationNatRuleResponse CreateNatGatewayDestinationIpPortTranslationNatRule(CreateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatGatewayDestinationIpPortTranslationNatRule", CreateNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
    }

    /**
     *本接口(CreateNatGatewaySourceIpTranslationNatRule)用于创建NAT网关SNAT规则
     * @param req CreateNatGatewaySourceIpTranslationNatRuleRequest
     * @return CreateNatGatewaySourceIpTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewaySourceIpTranslationNatRuleResponse CreateNatGatewaySourceIpTranslationNatRule(CreateNatGatewaySourceIpTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatGatewaySourceIpTranslationNatRule", CreateNatGatewaySourceIpTranslationNatRuleResponse.class);
    }

    /**
     *本接口（CreateNetDetect）用于创建网络探测。
     * @param req CreateNetDetectRequest
     * @return CreateNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetDetectResponse CreateNetDetect(CreateNetDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetDetect", CreateNetDetectResponse.class);
    }

    /**
     *本接口（CreateNetworkAcl）用于创建新的<a href="https://cloud.tencent.com/document/product/215/20088">网络ACL</a>。
* 新建的网络ACL的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用ModifyNetworkAclEntries将网络ACL的规则设置为需要的规则。
     * @param req CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclResponse CreateNetworkAcl(CreateNetworkAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkAcl", CreateNetworkAclResponse.class);
    }

    /**
     *本接口（CreateNetworkAclEntries）用于增量添加网络ACL三元组的入站规则和出站规则。
     * @param req CreateNetworkAclEntriesRequest
     * @return CreateNetworkAclEntriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclEntriesResponse CreateNetworkAclEntries(CreateNetworkAclEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkAclEntries", CreateNetworkAclEntriesResponse.class);
    }

    /**
     *本接口（CreateNetworkAclQuintupleEntries）用于增量网络ACL五元组的入站规则和出站规则。
     * @param req CreateNetworkAclQuintupleEntriesRequest
     * @return CreateNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclQuintupleEntriesResponse CreateNetworkAclQuintupleEntries(CreateNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkAclQuintupleEntries", CreateNetworkAclQuintupleEntriesResponse.class);
    }

    /**
     *本接口（CreateNetworkInterface）用于创建弹性网卡。
* 创建弹性网卡时可以指定内网IP，并且可以指定一个主IP，指定的内网IP必须在弹性网卡所在子网内，而且不能被占用。
* 创建弹性网卡时可以指定需要申请的内网IP数量，系统会随机生成内网IP地址。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 创建弹性网卡同时可以绑定已有安全组。
* 创建弹性网卡同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkInterface", CreateNetworkInterfaceResponse.class);
    }

    /**
     *本接口（CreatePrivateNatGateway）用于创建私网NAT网关。
     * @param req CreatePrivateNatGatewayRequest
     * @return CreatePrivateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateNatGatewayResponse CreatePrivateNatGateway(CreatePrivateNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateNatGateway", CreatePrivateNatGatewayResponse.class);
    }

    /**
     *本接口（CreatePrivateNatGatewayDestinationIpPortTranslationNatRule）用于创建私网NAT网关目的端口转换规则
     * @param req CreatePrivateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return CreatePrivateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateNatGatewayDestinationIpPortTranslationNatRuleResponse CreatePrivateNatGatewayDestinationIpPortTranslationNatRule(CreatePrivateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateNatGatewayDestinationIpPortTranslationNatRule", CreatePrivateNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
    }

    /**
     *本接口（ CreatePrivateNatGatewayTranslationAclRule）用于创建私网NAT网关源端转换访问控制规则
     * @param req CreatePrivateNatGatewayTranslationAclRuleRequest
     * @return CreatePrivateNatGatewayTranslationAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateNatGatewayTranslationAclRuleResponse CreatePrivateNatGatewayTranslationAclRule(CreatePrivateNatGatewayTranslationAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateNatGatewayTranslationAclRule", CreatePrivateNatGatewayTranslationAclRuleResponse.class);
    }

    /**
     *本接口（CreatePrivateNatGatewayTranslationNatRule）用于创建私网NAT网关源端转换规则。
     * @param req CreatePrivateNatGatewayTranslationNatRuleRequest
     * @return CreatePrivateNatGatewayTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateNatGatewayTranslationNatRuleResponse CreatePrivateNatGatewayTranslationNatRule(CreatePrivateNatGatewayTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateNatGatewayTranslationNatRule", CreatePrivateNatGatewayTranslationNatRuleResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRouteTable", CreateRouteTableResponse.class);
    }

    /**
     *本接口（CreateRoutes）用于创建路由策略。
* 向指定路由表批量新增路由策略。
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoutes", CreateRoutesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroup", CreateSecurityGroupResponse.class);
    }

    /**
     *本接口（CreateSecurityGroupPolicies）用于创建安全组规则（SecurityGroupPolicy）。

在 SecurityGroupPolicySet 参数中：
<ul>
<li>Version 安全组规则版本号，用户每次更新安全规则版本会自动加1，防止您更新的路由规则已过期，不填不考虑冲突。</li>
<li>在创建出站和入站规则（Egress 和 Ingress）时：<ul>
<li>Protocol 字段支持输入TCP, UDP, ICMP, ICMPV6, GRE, ALL。</li>
<li>CidrBlock 字段允许输入符合cidr格式标准的任意字符串。在基础网络中，如果 CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
<li>Ipv6CidrBlock 字段允许输入符合IPv6 cidr格式标准的任意字符串。在基础网络中，如果Ipv6CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IPv6，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
<li>SecurityGroupId 字段允许输入与待修改的安全组位于相同项目中的安全组 ID，包括这个安全组 ID 本身，代表安全组下所有云服务器的内网 IP。使用这个字段时，这条规则用来匹配网络报文的过程中会随着被使用的这个 ID 所关联的云服务器变化而变化，不需要重新修改。</li>
<li>Port 字段允许输入一个单独端口号，或者用减号分隔的两个端口号代表端口范围，例如80或8000-8010。只有当 Protocol 字段是 TCP 或 UDP 时，Port 字段才被接受，即 Protocol 字段不是 TCP 或 UDP 时，Protocol 和 Port 是排他关系，不允许同时输入，否则会接口报错。</li>
<li>Action 字段只允许输入 ACCEPT 或 DROP。</li>
<li>CidrBlock, Ipv6CidrBlock, SecurityGroupId, AddressTemplate 四者是排他关系，不允许同时输入，Protocol + Port 和 ServiceTemplate 二者是排他关系，不允许同时输入。IPv6CidrBlock和ICMP是排他关系，如需使用，请输入ICMPV6。</li>
<li>一次请求中只能创建单个方向的规则, 如果需要指定索引（PolicyIndex）参数, 多条规则的索引必须一致。如想在规则最前面插入一条，则填0即可，如果想在最后追加，该字段可不填。</li>
</ul></li></ul>
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupPolicies", CreateSecurityGroupPoliciesResponse.class);
    }

    /**
     *本接口（CreateSecurityGroupWithPolicies）用于创建新的安全组（SecurityGroup），并且可以同时添加安全组规则（SecurityGroupPolicy）。
* 每个账户下每个地域的每个项目的<a href="https://cloud.tencent.com/document/product/213/12453">安全组数量限制</a>。
* 新建的安全组的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用<a href="https://cloud.tencent.com/document/product/215/15807">CreateSecurityGroupPolicies</a>
将安全组的规则设置为需要的规则。

安全组规则说明：
* Version安全组规则版本号，用户每次更新安全规则版本会自动加1，防止您更新的路由规则已过期，不填不考虑冲突。
* Protocol字段支持输入TCP, UDP, ICMP, ICMPV6, GRE, ALL。
* CidrBlock字段允许输入符合cidr格式标准的任意字符串。(展开)在基础网络中，如果CidrBlock包含您的账户内的云服务器之外的设备在腾讯云的内网IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。
* Ipv6CidrBlock字段允许输入符合IPv6 cidr格式标准的任意字符串。(展开)在基础网络中，如果Ipv6CidrBlock包含您的账户内的云服务器之外的设备在腾讯云的内网IPv6，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。
* SecurityGroupId字段允许输入与待修改的安全组位于相同项目中的安全组ID，包括这个安全组ID本身，代表安全组下所有云服务器的内网IP。使用这个字段时，这条规则用来匹配网络报文的过程中会随着被使用的这个ID所关联的云服务器变化而变化，不需要重新修改。
* Port字段允许输入一个单独端口号，或者用减号分隔的两个端口号代表端口范围，例如80或8000-8010。只有当Protocol字段是TCP或UDP时，Port字段才被接受，即Protocol字段不是TCP或UDP时，Protocol和Port是排他关系，不允许同时输入，否则会接口报错。
* Action字段只允许输入ACCEPT或DROP。
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, AddressTemplate四者是排他关系，不允许同时输入，Protocol + Port和ServiceTemplate二者是排他关系，不允许同时输入。
* 一次请求中只能创建单个方向的规则, 如果需要指定索引（PolicyIndex）参数, 多条规则的索引必须一致。
     * @param req CreateSecurityGroupWithPoliciesRequest
     * @return CreateSecurityGroupWithPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupWithPoliciesResponse CreateSecurityGroupWithPolicies(CreateSecurityGroupWithPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupWithPolicies", CreateSecurityGroupWithPoliciesResponse.class);
    }

    /**
     *本接口（CreateServiceTemplate）用于创建协议端口模板。
     * @param req CreateServiceTemplateRequest
     * @return CreateServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateResponse CreateServiceTemplate(CreateServiceTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceTemplate", CreateServiceTemplateResponse.class);
    }

    /**
     *本接口（CreateServiceTemplateGroup）用于创建协议端口模板集合。
     * @param req CreateServiceTemplateGroupRequest
     * @return CreateServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateGroupResponse CreateServiceTemplateGroup(CreateServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServiceTemplateGroup", CreateServiceTemplateGroupResponse.class);
    }

    /**
     *本接口（CreateSnapshotPolicies）用于创建快照策略。
     * @param req CreateSnapshotPoliciesRequest
     * @return CreateSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotPoliciesResponse CreateSnapshotPolicies(CreateSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSnapshotPolicies", CreateSnapshotPoliciesResponse.class);
    }

    /**
     *本接口（CreateSubnet）用于创建子网。
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubnet", CreateSubnetResponse.class);
    }

    /**
     *本接口（CreateSubnets）用于批量创建子网。
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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubnets", CreateSubnetsResponse.class);
    }

    /**
     *本接口 (CreateTrafficPackages) 用于创建共享流量包。
     * @param req CreateTrafficPackagesRequest
     * @return CreateTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrafficPackagesResponse CreateTrafficPackages(CreateTrafficPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrafficPackages", CreateTrafficPackagesResponse.class);
    }

    /**
     *本接口（CreateVpc）用于创建私有网络（VPC）。
* 用户可以创建的最小网段子网掩码为28（有16个IP地址），10.0.0.0/12，172.16.0.0/12最大网段子网掩码为12（1,048,576个IP地址），192.168.0.0/16最大网段子网掩码为16（65,536个IP地址）如果需要规划VPC网段请参见[网络规划](https://cloud.tencent.com/document/product/215/30313)。
* 同一个地域能创建的VPC资源个数也是有限制的，详见 <a href="https://cloud.tencent.com/doc/product/215/537" title="VPC使用限制">VPC使用限制</a>，如果需要申请更多资源，请提交[工单申请](https://console.cloud.tencent.com/workorder/category)。
* 创建VPC同时可以绑定标签, 应答里的标签列表代表添加成功的标签。
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpc", CreateVpcResponse.class);
    }

    /**
     *本接口（CreateVpcEndPoint）用于创建终端节点。
     * @param req CreateVpcEndPointRequest
     * @return CreateVpcEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcEndPointResponse CreateVpcEndPoint(CreateVpcEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcEndPoint", CreateVpcEndPointResponse.class);
    }

    /**
     *本接口（CreateVpcEndPointService）用于创建终端节点服务。
     * @param req CreateVpcEndPointServiceRequest
     * @return CreateVpcEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcEndPointServiceResponse CreateVpcEndPointService(CreateVpcEndPointServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcEndPointService", CreateVpcEndPointServiceResponse.class);
    }

    /**
     *本接口（CreateVpcEndPointServiceWhiteList）创建终端服务白名单。
     * @param req CreateVpcEndPointServiceWhiteListRequest
     * @return CreateVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcEndPointServiceWhiteListResponse CreateVpcEndPointServiceWhiteList(CreateVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcEndPointServiceWhiteList", CreateVpcEndPointServiceWhiteListResponse.class);
    }

    /**
     *本接口（CreateVpcPeeringConnection）用于创建私有网络对等连接。
     * @param req CreateVpcPeeringConnectionRequest
     * @return CreateVpcPeeringConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcPeeringConnectionResponse CreateVpcPeeringConnection(CreateVpcPeeringConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcPeeringConnection", CreateVpcPeeringConnectionResponse.class);
    }

    /**
     *本接口（CreateVpnConnection）用于创建VPN通道。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req CreateVpnConnectionRequest
     * @return CreateVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpnConnection", CreateVpnConnectionResponse.class);
    }

    /**
     *本接口（CreateVpnGateway）用于创建VPN网关。
     * @param req CreateVpnGatewayRequest
     * @return CreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayResponse CreateVpnGateway(CreateVpnGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpnGateway", CreateVpnGatewayResponse.class);
    }

    /**
     *创建路由型VPN网关的目的路由
     * @param req CreateVpnGatewayRoutesRequest
     * @return CreateVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayRoutesResponse CreateVpnGatewayRoutes(CreateVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpnGatewayRoutes", CreateVpnGatewayRoutesResponse.class);
    }

    /**
     *创建SSL-VPN-CLIENT
     * @param req CreateVpnGatewaySslClientRequest
     * @return CreateVpnGatewaySslClientResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewaySslClientResponse CreateVpnGatewaySslClient(CreateVpnGatewaySslClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpnGatewaySslClient", CreateVpnGatewaySslClientResponse.class);
    }

    /**
     *本接口（CreateVpnGatewaySslServer）用于创建SSL-VPN Server端。
     * @param req CreateVpnGatewaySslServerRequest
     * @return CreateVpnGatewaySslServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewaySslServerResponse CreateVpnGatewaySslServer(CreateVpnGatewaySslServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpnGatewaySslServer", CreateVpnGatewaySslServerResponse.class);
    }

    /**
     *本接口（DeleteAddressTemplate）用于删除IP地址模板。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DeleteAddressTemplateRequest
     * @return DeleteAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateResponse DeleteAddressTemplate(DeleteAddressTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddressTemplate", DeleteAddressTemplateResponse.class);
    }

    /**
     *本接口（DeleteAddressTemplateGroup）用于删除IP地址模板集合。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DeleteAddressTemplateGroupRequest
     * @return DeleteAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateGroupResponse DeleteAddressTemplateGroup(DeleteAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddressTemplateGroup", DeleteAddressTemplateGroupResponse.class);
    }

    /**
     *本接口（DeleteAssistantCidr）用于删除辅助CIDR。
     * @param req DeleteAssistantCidrRequest
     * @return DeleteAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssistantCidrResponse DeleteAssistantCidr(DeleteAssistantCidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAssistantCidr", DeleteAssistantCidrResponse.class);
    }

    /**
     *接口支持删除共享带宽包，包括[设备带宽包](https://cloud.tencent.com/document/product/684/15246#.E8.AE.BE.E5.A4.87.E5.B8.A6.E5.AE.BD.E5.8C.85)和[IP带宽包](https://cloud.tencent.com/document/product/684/15246#ip-.E5.B8.A6.E5.AE.BD.E5.8C.85)
     * @param req DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBandwidthPackageResponse DeleteBandwidthPackage(DeleteBandwidthPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBandwidthPackage", DeleteBandwidthPackageResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCcn", DeleteCcnResponse.class);
    }

    /**
     *本接口（DeleteCustomerGateway）用于删除对端网关。
     * @param req DeleteCustomerGatewayRequest
     * @return DeleteCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomerGatewayResponse DeleteCustomerGateway(DeleteCustomerGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomerGateway", DeleteCustomerGatewayResponse.class);
    }

    /**
     *本接口（DeleteDhcpIp）用于删除DhcpIp。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DeleteDhcpIpRequest
     * @return DeleteDhcpIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDhcpIpResponse DeleteDhcpIp(DeleteDhcpIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDhcpIp", DeleteDhcpIpResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDirectConnectGateway", DeleteDirectConnectGatewayResponse.class);
    }

    /**
     *本接口（DeleteDirectConnectGatewayCcnRoutes）用于删除专线网关的云联网路由（IDC网段）
     * @param req DeleteDirectConnectGatewayCcnRoutesRequest
     * @return DeleteDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayCcnRoutesResponse DeleteDirectConnectGatewayCcnRoutes(DeleteDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDirectConnectGatewayCcnRoutes", DeleteDirectConnectGatewayCcnRoutesResponse.class);
    }

    /**
     *本接口（DeleteFlowLog）用于删除流日志。
     * @param req DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFlowLogResponse DeleteFlowLog(DeleteFlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFlowLog", DeleteFlowLogResponse.class);
    }

    /**
     *本接口（DeleteHaVip）用于删除高可用虚拟IP（HAVIP）。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHaVip", DeleteHaVipResponse.class);
    }

    /**
     *1. 该接口用于释放IPV6转换实例，支持批量。
2.  如果IPV6转换实例建立有转换规则，会一并删除。
     * @param req DeleteIp6TranslatorsRequest
     * @return DeleteIp6TranslatorsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIp6TranslatorsResponse DeleteIp6Translators(DeleteIp6TranslatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIp6Translators", DeleteIp6TranslatorsResponse.class);
    }

    /**
     *本接口（DeleteLocalGateway）用于删除CDC的本地网关。
     * @param req DeleteLocalGatewayRequest
     * @return DeleteLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLocalGatewayResponse DeleteLocalGateway(DeleteLocalGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLocalGateway", DeleteLocalGatewayResponse.class);
    }

    /**
     *本接口（DeleteNatGateway）用于删除NAT网关。
删除 NAT 网关后，系统会自动删除路由表中包含此 NAT 网关的路由项，同时也会解绑弹性公网IP（EIP）。
     * @param req DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayResponse DeleteNatGateway(DeleteNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNatGateway", DeleteNatGatewayResponse.class);
    }

    /**
     *本接口（DeleteNatGatewayDestinationIpPortTranslationNatRule）用于删除NAT网关端口转发规则。
     * @param req DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse DeleteNatGatewayDestinationIpPortTranslationNatRule(DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNatGatewayDestinationIpPortTranslationNatRule", DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
    }

    /**
     *本接口（DeleteNatGatewaySourceIpTranslationNatRule）用于删除NAT网关端口SNAT转发规则。
     * @param req DeleteNatGatewaySourceIpTranslationNatRuleRequest
     * @return DeleteNatGatewaySourceIpTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewaySourceIpTranslationNatRuleResponse DeleteNatGatewaySourceIpTranslationNatRule(DeleteNatGatewaySourceIpTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNatGatewaySourceIpTranslationNatRule", DeleteNatGatewaySourceIpTranslationNatRuleResponse.class);
    }

    /**
     *本接口（DeleteNetDetect）用于删除网络探测实例。
     * @param req DeleteNetDetectRequest
     * @return DeleteNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetDetectResponse DeleteNetDetect(DeleteNetDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetDetect", DeleteNetDetectResponse.class);
    }

    /**
     *本接口（DeleteNetworkAcl）用于删除网络ACL。
     * @param req DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclResponse DeleteNetworkAcl(DeleteNetworkAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkAcl", DeleteNetworkAclResponse.class);
    }

    /**
     *本接口（DeleteNetworkAclEntries）用于删除三元组网络ACL的入站规则和出站规则。在NetworkAclEntrySet参数中：
* 删除IPv4规则，需要传入NetworkAclIpv4EntryId。
* 删除IPv6规则，需要传入NetworkAclIpv6EntryId。
     * @param req DeleteNetworkAclEntriesRequest
     * @return DeleteNetworkAclEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclEntriesResponse DeleteNetworkAclEntries(DeleteNetworkAclEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkAclEntries", DeleteNetworkAclEntriesResponse.class);
    }

    /**
     *本接口（DeleteNetworkAclQuintupleEntries）用于删除网络ACL五元组指定的入站规则和出站规则（但不是全量删除该ACL下的所有条目）。在NetworkAclQuintupleEntrySet参数中：NetworkAclQuintupleEntry需要提供NetworkAclQuintupleEntryId。
     * @param req DeleteNetworkAclQuintupleEntriesRequest
     * @return DeleteNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclQuintupleEntriesResponse DeleteNetworkAclQuintupleEntries(DeleteNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkAclQuintupleEntries", DeleteNetworkAclQuintupleEntriesResponse.class);
    }

    /**
     *本接口（DeleteNetworkInterface）用于删除弹性网卡。
* 弹性网卡上绑定了云服务器时，不能被删除。
* 删除指定弹性网卡，弹性网卡必须先和子机解绑才能删除。删除之后弹性网卡上所有内网IP都将被退还。

本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkInterface", DeleteNetworkInterfaceResponse.class);
    }

    /**
     *本接口（DeletePrivateNatGateway）用于删除私网NAT网关。
     * @param req DeletePrivateNatGatewayRequest
     * @return DeletePrivateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateNatGatewayResponse DeletePrivateNatGateway(DeletePrivateNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateNatGateway", DeletePrivateNatGatewayResponse.class);
    }

    /**
     *本接口（DeletePrivateNatGatewayDestinationIpPortTranslationNatRule）用于删除私网NAT网关目的端口转换规则
     * @param req DeletePrivateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return DeletePrivateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateNatGatewayDestinationIpPortTranslationNatRuleResponse DeletePrivateNatGatewayDestinationIpPortTranslationNatRule(DeletePrivateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateNatGatewayDestinationIpPortTranslationNatRule", DeletePrivateNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
    }

    /**
     *本接口（DeletePrivateNatGatewayTranslationAclRule）用于删除私网NAT网关源端转换访问控制规则
     * @param req DeletePrivateNatGatewayTranslationAclRuleRequest
     * @return DeletePrivateNatGatewayTranslationAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateNatGatewayTranslationAclRuleResponse DeletePrivateNatGatewayTranslationAclRule(DeletePrivateNatGatewayTranslationAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateNatGatewayTranslationAclRule", DeletePrivateNatGatewayTranslationAclRuleResponse.class);
    }

    /**
     *本接口（DeletePrivateNatGatewayTranslationNatRule）用于删除私网NAT网关源端转换规则
     * @param req DeletePrivateNatGatewayTranslationNatRuleRequest
     * @return DeletePrivateNatGatewayTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateNatGatewayTranslationNatRuleResponse DeletePrivateNatGatewayTranslationNatRule(DeletePrivateNatGatewayTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateNatGatewayTranslationNatRule", DeletePrivateNatGatewayTranslationNatRuleResponse.class);
    }

    /**
     *本接口（DeleteRouteTable）用于删除路由表。
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRouteTable", DeleteRouteTableResponse.class);
    }

    /**
     *本接口(DeleteRoutes)用于对某个路由表批量删除路由策略（Route）。
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoutes", DeleteRoutesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroup", DeleteSecurityGroupResponse.class);
    }

    /**
     *本接口（DeleteSecurityGroupPolicies）用于用于删除安全组规则（SecurityGroupPolicy）。
* SecurityGroupPolicySet.Version 用于指定要操作的安全组的版本。传入 Version 版本号若不等于当前安全组的最新版本，将返回失败；若不传 Version 则直接删除指定PolicyIndex的规则。
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroupPolicies", DeleteSecurityGroupPoliciesResponse.class);
    }

    /**
     *本接口（DeleteServiceTemplate）用于删除协议端口模板。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DeleteServiceTemplateRequest
     * @return DeleteServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateResponse DeleteServiceTemplate(DeleteServiceTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceTemplate", DeleteServiceTemplateResponse.class);
    }

    /**
     *本接口（DeleteServiceTemplateGroup）用于删除协议端口模板集合。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DeleteServiceTemplateGroupRequest
     * @return DeleteServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateGroupResponse DeleteServiceTemplateGroup(DeleteServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteServiceTemplateGroup", DeleteServiceTemplateGroupResponse.class);
    }

    /**
     *本接口（DeleteSnapshotPolicies）用于删除快照策略。
     * @param req DeleteSnapshotPoliciesRequest
     * @return DeleteSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotPoliciesResponse DeleteSnapshotPolicies(DeleteSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshotPolicies", DeleteSnapshotPoliciesResponse.class);
    }

    /**
     *本接口（DeleteSubnet）用于删除子网（Subnet）。
* 删除子网前，请清理该子网下所有资源，包括云服务器、负载均衡、云数据、NoSQL、弹性网卡等资源。
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubnet", DeleteSubnetResponse.class);
    }

    /**
     *删除模板对象中的IP地址、协议端口、IP地址组、协议端口组。
     * @param req DeleteTemplateMemberRequest
     * @return DeleteTemplateMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTemplateMemberResponse DeleteTemplateMember(DeleteTemplateMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTemplateMember", DeleteTemplateMemberResponse.class);
    }

    /**
     *删除共享带宽包（仅非活动状态的流量包可删除）。
     * @param req DeleteTrafficPackagesRequest
     * @return DeleteTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrafficPackagesResponse DeleteTrafficPackages(DeleteTrafficPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrafficPackages", DeleteTrafficPackagesResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpc", DeleteVpcResponse.class);
    }

    /**
     *本接口（DeleteVpcEndPoint）用于删除终端节点。
     * @param req DeleteVpcEndPointRequest
     * @return DeleteVpcEndPointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcEndPointResponse DeleteVpcEndPoint(DeleteVpcEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpcEndPoint", DeleteVpcEndPointResponse.class);
    }

    /**
     *本接口（DeleteVpcEndPointService）用于删除终端节点服务。
     * @param req DeleteVpcEndPointServiceRequest
     * @return DeleteVpcEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcEndPointServiceResponse DeleteVpcEndPointService(DeleteVpcEndPointServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpcEndPointService", DeleteVpcEndPointServiceResponse.class);
    }

    /**
     *本接口（DeleteVpcEndPointServiceWhiteList）用于删除终端节点服务白名单。
     * @param req DeleteVpcEndPointServiceWhiteListRequest
     * @return DeleteVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcEndPointServiceWhiteListResponse DeleteVpcEndPointServiceWhiteList(DeleteVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpcEndPointServiceWhiteList", DeleteVpcEndPointServiceWhiteListResponse.class);
    }

    /**
     *本接口（DeleteVpcPeeringConnection）用于删除私有网络对等连接。
     * @param req DeleteVpcPeeringConnectionRequest
     * @return DeleteVpcPeeringConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcPeeringConnectionResponse DeleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpcPeeringConnection", DeleteVpcPeeringConnectionResponse.class);
    }

    /**
     *本接口（DeleteVpnConnection）用于删除VPN通道。
     * @param req DeleteVpnConnectionRequest
     * @return DeleteVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnConnectionResponse DeleteVpnConnection(DeleteVpnConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpnConnection", DeleteVpnConnectionResponse.class);
    }

    /**
     *本接口（DeleteVpnGateway）用于删除VPN网关。
     * @param req DeleteVpnGatewayRequest
     * @return DeleteVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayResponse DeleteVpnGateway(DeleteVpnGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpnGateway", DeleteVpnGatewayResponse.class);
    }

    /**
     *本接口（DeleteVpnGatewayRoutes）用于删除VPN网关路由
     * @param req DeleteVpnGatewayRoutesRequest
     * @return DeleteVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayRoutesResponse DeleteVpnGatewayRoutes(DeleteVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpnGatewayRoutes", DeleteVpnGatewayRoutesResponse.class);
    }

    /**
     *本接口（DeleteVpnGatewaySslClient）用于删除SSL-VPN-CLIENT。
     * @param req DeleteVpnGatewaySslClientRequest
     * @return DeleteVpnGatewaySslClientResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewaySslClientResponse DeleteVpnGatewaySslClient(DeleteVpnGatewaySslClientRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpnGatewaySslClient", DeleteVpnGatewaySslClientResponse.class);
    }

    /**
     *删除SSL-VPN-SERVER 实例
     * @param req DeleteVpnGatewaySslServerRequest
     * @return DeleteVpnGatewaySslServerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewaySslServerResponse DeleteVpnGatewaySslServer(DeleteVpnGatewaySslServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpnGatewaySslServer", DeleteVpnGatewaySslServerResponse.class);
    }

    /**
     *本接口（DescribeAccountAttributes）用于查询用户账号私有属性。
     * @param req DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountAttributesResponse DescribeAccountAttributes(DescribeAccountAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountAttributes", DescribeAccountAttributesResponse.class);
    }

    /**
     *本接口 (DescribeAddressQuota) 用于查询您账户的[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）在当前地域的配额信息。配额详情可参见 [EIP 产品简介](https://cloud.tencent.com/document/product/213/5733)。
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressQuota", DescribeAddressQuotaResponse.class);
    }

    /**
     *本接口（DescribeAddressTemplateGroups）用于查询IP地址模板集合。
     * @param req DescribeAddressTemplateGroupsRequest
     * @return DescribeAddressTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplateGroupsResponse DescribeAddressTemplateGroups(DescribeAddressTemplateGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressTemplateGroups", DescribeAddressTemplateGroupsResponse.class);
    }

    /**
     *本接口（DescribeAddressTemplates）用于查询IP地址模板。
     * @param req DescribeAddressTemplatesRequest
     * @return DescribeAddressTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplatesResponse DescribeAddressTemplates(DescribeAddressTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressTemplates", DescribeAddressTemplatesResponse.class);
    }

    /**
     *本接口 (DescribeAddresses) 用于查询一个或多个[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）的详细信息。
* 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的 EIP。
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddresses", DescribeAddressesResponse.class);
    }

    /**
     *本接口（DescribeAssistantCidr）用于查询辅助CIDR列表。
     * @param req DescribeAssistantCidrRequest
     * @return DescribeAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssistantCidrResponse DescribeAssistantCidr(DescribeAssistantCidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssistantCidr", DescribeAssistantCidrResponse.class);
    }

    /**
     *本接口 (DescribeBandwidthPackageBillUsage) 用于查询后付费共享带宽包当前的计费用量.
     * @param req DescribeBandwidthPackageBillUsageRequest
     * @return DescribeBandwidthPackageBillUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageBillUsageResponse DescribeBandwidthPackageBillUsage(DescribeBandwidthPackageBillUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBandwidthPackageBillUsage", DescribeBandwidthPackageBillUsageResponse.class);
    }

    /**
     *接口用于查询账户在当前地域的带宽包上限数量以及使用数量
     * @param req DescribeBandwidthPackageQuotaRequest
     * @return DescribeBandwidthPackageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageQuotaResponse DescribeBandwidthPackageQuota(DescribeBandwidthPackageQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBandwidthPackageQuota", DescribeBandwidthPackageQuotaResponse.class);
    }

    /**
     *本接口 (DescribeBandwidthPackageResources) 用于根据共享带宽包唯一ID查询共享带宽包内的资源列表，支持按条件过滤查询结果和分页查询。
     * @param req DescribeBandwidthPackageResourcesRequest
     * @return DescribeBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageResourcesResponse DescribeBandwidthPackageResources(DescribeBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBandwidthPackageResources", DescribeBandwidthPackageResourcesResponse.class);
    }

    /**
     *接口用于查询带宽包详细信息，包括带宽包唯一标识ID，类型，计费模式，名称，资源信息等
     * @param req DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackagesResponse DescribeBandwidthPackages(DescribeBandwidthPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBandwidthPackages", DescribeBandwidthPackagesResponse.class);
    }

    /**
     *本接口（DescribeCcnAttachedInstances）用于查询云联网实例下已关联的网络实例。
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcnAttachedInstances", DescribeCcnAttachedInstancesResponse.class);
    }

    /**
     *本接口（DescribeCcnRegionBandwidthLimits）用于查询云联网各地域出带宽上限，该接口只返回已关联网络实例包含的地域。
     * @param req DescribeCcnRegionBandwidthLimitsRequest
     * @return DescribeCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRegionBandwidthLimitsResponse DescribeCcnRegionBandwidthLimits(DescribeCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcnRegionBandwidthLimits", DescribeCcnRegionBandwidthLimitsResponse.class);
    }

    /**
     *本接口（DescribeCcnRoutes）用于查询已加入云联网（CCN）的路由。
     * @param req DescribeCcnRoutesRequest
     * @return DescribeCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRoutesResponse DescribeCcnRoutes(DescribeCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcnRoutes", DescribeCcnRoutesResponse.class);
    }

    /**
     *本接口（DescribeCcns）用于查询云联网（CCN）列表。
     * @param req DescribeCcnsRequest
     * @return DescribeCcnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnsResponse DescribeCcns(DescribeCcnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcns", DescribeCcnsResponse.class);
    }

    /**
     *本接口（DescribeClassicLinkInstances）用于查询私有网络和基础网络设备互通列表。
     * @param req DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicLinkInstancesResponse DescribeClassicLinkInstances(DescribeClassicLinkInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClassicLinkInstances", DescribeClassicLinkInstancesResponse.class);
    }

    /**
     *本接口（DescribeCrossBorderCcnRegionBandwidthLimits）用于获取要锁定的限速实例列表。
该接口一般用来封禁地域间限速的云联网实例下的限速实例, 目前联通内部运营系统通过云API调用, 如果是出口限速, 一般使用更粗的云联网实例粒度封禁（DescribeTenantCcns）
如有需要, 可以封禁任意限速实例, 可接入到内部运营系统
     * @param req DescribeCrossBorderCcnRegionBandwidthLimitsRequest
     * @return DescribeCrossBorderCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderCcnRegionBandwidthLimitsResponse DescribeCrossBorderCcnRegionBandwidthLimits(DescribeCrossBorderCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderCcnRegionBandwidthLimits", DescribeCrossBorderCcnRegionBandwidthLimitsResponse.class);
    }

    /**
     *本接口（DescribeCrossBorderCompliance）用于查询用户创建的合规化资质审批单。
服务商可以查询服务名下的任意 `APPID` 创建的审批单；非服务商，只能查询自己审批单。
     * @param req DescribeCrossBorderComplianceRequest
     * @return DescribeCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderComplianceResponse DescribeCrossBorderCompliance(DescribeCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderCompliance", DescribeCrossBorderComplianceResponse.class);
    }

    /**
     *本接口（DescribeCrossBorderFlowMonitor）用于查询跨境带宽监控数据，该接口目前只提供给服务商联通使用。
     * @param req DescribeCrossBorderFlowMonitorRequest
     * @return DescribeCrossBorderFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderFlowMonitorResponse DescribeCrossBorderFlowMonitor(DescribeCrossBorderFlowMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderFlowMonitor", DescribeCrossBorderFlowMonitorResponse.class);
    }

    /**
     *本接口（DescribeCustomerGatewayVendors）用于查询可支持的对端网关厂商信息。
     * @param req DescribeCustomerGatewayVendorsRequest
     * @return DescribeCustomerGatewayVendorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewayVendorsResponse DescribeCustomerGatewayVendors(DescribeCustomerGatewayVendorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerGatewayVendors", DescribeCustomerGatewayVendorsResponse.class);
    }

    /**
     *本接口（DescribeCustomerGateways）用于查询对端网关列表。
     * @param req DescribeCustomerGatewaysRequest
     * @return DescribeCustomerGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewaysResponse DescribeCustomerGateways(DescribeCustomerGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerGateways", DescribeCustomerGatewaysResponse.class);
    }

    /**
     *本接口（DescribeDhcpIps）用于查询DhcpIp列表
     * @param req DescribeDhcpIpsRequest
     * @return DescribeDhcpIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDhcpIpsResponse DescribeDhcpIps(DescribeDhcpIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDhcpIps", DescribeDhcpIpsResponse.class);
    }

    /**
     *本接口（DescribeDirectConnectGatewayCcnRoutes）用于查询专线网关的云联网路由（IDC网段）
     * @param req DescribeDirectConnectGatewayCcnRoutesRequest
     * @return DescribeDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewayCcnRoutesResponse DescribeDirectConnectGatewayCcnRoutes(DescribeDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnectGatewayCcnRoutes", DescribeDirectConnectGatewayCcnRoutesResponse.class);
    }

    /**
     *本接口（DescribeDirectConnectGateways）用于查询专线网关。
     * @param req DescribeDirectConnectGatewaysRequest
     * @return DescribeDirectConnectGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewaysResponse DescribeDirectConnectGateways(DescribeDirectConnectGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDirectConnectGateways", DescribeDirectConnectGatewaysResponse.class);
    }

    /**
     *本接口（DescribeFlowLog）用于查询流日志实例信息。
     * @param req DescribeFlowLogRequest
     * @return DescribeFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogResponse DescribeFlowLog(DescribeFlowLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowLog", DescribeFlowLogResponse.class);
    }

    /**
     *本接口（DescribeFlowLogs）用于查询获取流日志集合。
     * @param req DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogsResponse DescribeFlowLogs(DescribeFlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowLogs", DescribeFlowLogsResponse.class);
    }

    /**
     *本接口（DescribeGatewayFlowMonitorDetail）用于查询网关流量监控明细。
* 只支持单个网关实例查询。即入参 `VpnId`、 `DirectConnectGatewayId`、 `PeeringConnectionId`、 `NatId` 最多只支持传一个，且必须传一个。
* 如果网关有流量，但调用本接口没有返回数据，请在控制台对应网关详情页确认是否开启网关流量监控。
     * @param req DescribeGatewayFlowMonitorDetailRequest
     * @return DescribeGatewayFlowMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowMonitorDetailResponse DescribeGatewayFlowMonitorDetail(DescribeGatewayFlowMonitorDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayFlowMonitorDetail", DescribeGatewayFlowMonitorDetailResponse.class);
    }

    /**
     *本接口（DescribeGatewayFlowQos）用于查询网关来访IP流控带宽。
     * @param req DescribeGatewayFlowQosRequest
     * @return DescribeGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowQosResponse DescribeGatewayFlowQos(DescribeGatewayFlowQosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayFlowQos", DescribeGatewayFlowQosResponse.class);
    }

    /**
     *本接口（DescribeHaVips）用于查询高可用虚拟IP（HAVIP）列表。
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHaVips", DescribeHaVipsResponse.class);
    }

    /**
     *该接口用于查询IPV6地址信息
     * @param req DescribeIp6AddressesRequest
     * @return DescribeIp6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIp6AddressesResponse DescribeIp6Addresses(DescribeIp6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIp6Addresses", DescribeIp6AddressesResponse.class);
    }

    /**
     *查询账户在指定地域IPV6转换实例和规则的配额
     * @param req DescribeIp6TranslatorQuotaRequest
     * @return DescribeIp6TranslatorQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIp6TranslatorQuotaResponse DescribeIp6TranslatorQuota(DescribeIp6TranslatorQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIp6TranslatorQuota", DescribeIp6TranslatorQuotaResponse.class);
    }

    /**
     *1. 该接口用于查询账户下的IPV6转换实例及其绑定的转换规则信息
2. 支持过滤查询
     * @param req DescribeIp6TranslatorsRequest
     * @return DescribeIp6TranslatorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIp6TranslatorsResponse DescribeIp6Translators(DescribeIp6TranslatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIp6Translators", DescribeIp6TranslatorsResponse.class);
    }

    /**
     *本接口（DescribeIpGeolocationDatabaseUrl）用于获取IP地理位置库下载链接。
<font color="#FF0000">本接口即将下线，仅供存量用户使用，暂停新增用户。</font>
     * @param req DescribeIpGeolocationDatabaseUrlRequest
     * @return DescribeIpGeolocationDatabaseUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpGeolocationDatabaseUrlResponse DescribeIpGeolocationDatabaseUrl(DescribeIpGeolocationDatabaseUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpGeolocationDatabaseUrl", DescribeIpGeolocationDatabaseUrlResponse.class);
    }

    /**
     *本接口（DescribeIpGeolocationInfos）用于查询IP地址信息，包括地理位置信息和网络信息。
<font color="#FF0000">本接口即将下线，仅供存量客户使用，暂停新增用户。</font>
     * @param req DescribeIpGeolocationInfosRequest
     * @return DescribeIpGeolocationInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpGeolocationInfosResponse DescribeIpGeolocationInfos(DescribeIpGeolocationInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpGeolocationInfos", DescribeIpGeolocationInfosResponse.class);
    }

    /**
     *本接口（DescribeLocalGateway）用于查询CDC的本地网关。
     * @param req DescribeLocalGatewayRequest
     * @return DescribeLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalGatewayResponse DescribeLocalGateway(DescribeLocalGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLocalGateway", DescribeLocalGatewayResponse.class);
    }

    /**
     *本接口（DescribeNatGatewayDestinationIpPortTranslationNatRules）用于查询NAT网关端口转发规则对象数组。
     * @param req DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest
     * @return DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse DescribeNatGatewayDestinationIpPortTranslationNatRules(DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatGatewayDestinationIpPortTranslationNatRules", DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse.class);
    }

    /**
     *查询专线绑定NAT的路由
     * @param req DescribeNatGatewayDirectConnectGatewayRouteRequest
     * @return DescribeNatGatewayDirectConnectGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDirectConnectGatewayRouteResponse DescribeNatGatewayDirectConnectGatewayRoute(DescribeNatGatewayDirectConnectGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatGatewayDirectConnectGatewayRoute", DescribeNatGatewayDirectConnectGatewayRouteResponse.class);
    }

    /**
     *本接口（DescribeNatGatewaySourceIpTranslationNatRules）用于查询NAT网关SNAT转发规则对象数组。
     * @param req DescribeNatGatewaySourceIpTranslationNatRulesRequest
     * @return DescribeNatGatewaySourceIpTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaySourceIpTranslationNatRulesResponse DescribeNatGatewaySourceIpTranslationNatRules(DescribeNatGatewaySourceIpTranslationNatRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatGatewaySourceIpTranslationNatRules", DescribeNatGatewaySourceIpTranslationNatRulesResponse.class);
    }

    /**
     *本接口（DescribeNatGateways）用于查询 NAT 网关。
     * @param req DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaysResponse DescribeNatGateways(DescribeNatGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatGateways", DescribeNatGatewaysResponse.class);
    }

    /**
     *本接口(DescribeNetDetectStates)用于查询网络探测验证结果列表。
     * @param req DescribeNetDetectStatesRequest
     * @return DescribeNetDetectStatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectStatesResponse DescribeNetDetectStates(DescribeNetDetectStatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetDetectStates", DescribeNetDetectStatesResponse.class);
    }

    /**
     *本接口（DescribeNetDetects）用于查询网络探测列表。
     * @param req DescribeNetDetectsRequest
     * @return DescribeNetDetectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectsResponse DescribeNetDetects(DescribeNetDetectsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetDetects", DescribeNetDetectsResponse.class);
    }

    /**
     *判断用户在网络侧的用户类型，如标准（带宽上移），传统（非上移）。
     * @param req DescribeNetworkAccountTypeRequest
     * @return DescribeNetworkAccountTypeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAccountTypeResponse DescribeNetworkAccountType(DescribeNetworkAccountTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkAccountType", DescribeNetworkAccountTypeResponse.class);
    }

    /**
     *本接口（DescribeNetworkAclQuintupleEntries）查询入方向或出方向网络ACL五元组条目列表。
     * @param req DescribeNetworkAclQuintupleEntriesRequest
     * @return DescribeNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAclQuintupleEntriesResponse DescribeNetworkAclQuintupleEntries(DescribeNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkAclQuintupleEntries", DescribeNetworkAclQuintupleEntriesResponse.class);
    }

    /**
     *本接口（DescribeNetworkAcls）用于查询网络ACL列表。
     * @param req DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAclsResponse DescribeNetworkAcls(DescribeNetworkAclsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkAcls", DescribeNetworkAclsResponse.class);
    }

    /**
     *本接口（DescribeNetworkInterfaceLimit）根据CVM实例ID或弹性网卡ID查询弹性网卡配额，返回该CVM实例或弹性网卡能绑定的弹性网卡配额，以及弹性网卡可以分配的IP配额。
     * @param req DescribeNetworkInterfaceLimitRequest
     * @return DescribeNetworkInterfaceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfaceLimitResponse DescribeNetworkInterfaceLimit(DescribeNetworkInterfaceLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkInterfaceLimit", DescribeNetworkInterfaceLimitResponse.class);
    }

    /**
     *本接口（DescribeNetworkInterfaces）用于查询弹性网卡列表。
     * @param req DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkInterfaces", DescribeNetworkInterfacesResponse.class);
    }

    /**
     *本接口（DescribePrivateNatGatewayDestinationIpPortTranslationNatRules）用于查询私网NAT网关目的端口转换规则
     * @param req DescribePrivateNatGatewayDestinationIpPortTranslationNatRulesRequest
     * @return DescribePrivateNatGatewayDestinationIpPortTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNatGatewayDestinationIpPortTranslationNatRulesResponse DescribePrivateNatGatewayDestinationIpPortTranslationNatRules(DescribePrivateNatGatewayDestinationIpPortTranslationNatRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNatGatewayDestinationIpPortTranslationNatRules", DescribePrivateNatGatewayDestinationIpPortTranslationNatRulesResponse.class);
    }

    /**
     *本接口（DescribePrivateNatGatewayLimits）用于查询可创建的私网NAT网关配额数量
     * @param req DescribePrivateNatGatewayLimitsRequest
     * @return DescribePrivateNatGatewayLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNatGatewayLimitsResponse DescribePrivateNatGatewayLimits(DescribePrivateNatGatewayLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNatGatewayLimits", DescribePrivateNatGatewayLimitsResponse.class);
    }

    /**
     *本接口（DescribePrivateNatGatewayRegions）用于查询查询私网NAT网关可支持地域
     * @param req DescribePrivateNatGatewayRegionsRequest
     * @return DescribePrivateNatGatewayRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNatGatewayRegionsResponse DescribePrivateNatGatewayRegions(DescribePrivateNatGatewayRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNatGatewayRegions", DescribePrivateNatGatewayRegionsResponse.class);
    }

    /**
     *本接口（DescribePrivateNatGatewayTranslationAclRules）用于查询私网NAT网关源端转换访问控制规则
     * @param req DescribePrivateNatGatewayTranslationAclRulesRequest
     * @return DescribePrivateNatGatewayTranslationAclRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNatGatewayTranslationAclRulesResponse DescribePrivateNatGatewayTranslationAclRules(DescribePrivateNatGatewayTranslationAclRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNatGatewayTranslationAclRules", DescribePrivateNatGatewayTranslationAclRulesResponse.class);
    }

    /**
     *本接口（DescribePrivateNatGatewayTranslationNatRules）用于查询私网NAT网关源端转换规则
     * @param req DescribePrivateNatGatewayTranslationNatRulesRequest
     * @return DescribePrivateNatGatewayTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNatGatewayTranslationNatRulesResponse DescribePrivateNatGatewayTranslationNatRules(DescribePrivateNatGatewayTranslationNatRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNatGatewayTranslationNatRules", DescribePrivateNatGatewayTranslationNatRulesResponse.class);
    }

    /**
     *本接口（DescribePrivateNatGateways）用于查询私网NAT网关
     * @param req DescribePrivateNatGatewaysRequest
     * @return DescribePrivateNatGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNatGatewaysResponse DescribePrivateNatGateways(DescribePrivateNatGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNatGateways", DescribePrivateNatGatewaysResponse.class);
    }

    /**
     *本接口（DescribeProductQuota）用于查询网络产品的配额信息。
     * @param req DescribeProductQuotaRequest
     * @return DescribeProductQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductQuotaResponse DescribeProductQuota(DescribeProductQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductQuota", DescribeProductQuotaResponse.class);
    }

    /**
     *本接口（DescribeRouteConflicts）用于查询自定义路由策略与云联网路由策略冲突列表。
     * @param req DescribeRouteConflictsRequest
     * @return DescribeRouteConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteConflictsResponse DescribeRouteConflicts(DescribeRouteConflictsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteConflicts", DescribeRouteConflictsResponse.class);
    }

    /**
     *本接口（DescribeRouteTables）用于查询路由表。
     * @param req DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTablesResponse DescribeRouteTables(DescribeRouteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteTables", DescribeRouteTablesResponse.class);
    }

    /**
     *本接口（DescribeSecurityGroupAssociationStatistics）用于查询安全组关联的实例统计。
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics", DescribeSecurityGroupAssociationStatisticsResponse.class);
    }

    /**
     *本接口(DescribeSecurityGroupLimits)用于查询用户安全组配额。
     * @param req DescribeSecurityGroupLimitsRequest
     * @return DescribeSecurityGroupLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupLimitsResponse DescribeSecurityGroupLimits(DescribeSecurityGroupLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupLimits", DescribeSecurityGroupLimitsResponse.class);
    }

    /**
     *本接口（DescribeSecurityGroupPolicies）用于查询安全组规则。
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupPolicies", DescribeSecurityGroupPoliciesResponse.class);
    }

    /**
     *本接口（DescribeSecurityGroupReferences）用于查询安全组被引用信息。
     * @param req DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupReferencesResponse DescribeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupReferences", DescribeSecurityGroupReferencesResponse.class);
    }

    /**
     *本接口（DescribeSecurityGroups）用于查询安全组。
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroups", DescribeSecurityGroupsResponse.class);
    }

    /**
     *本接口（DescribeServiceTemplateGroups）用于查询协议端口模板集合。
     * @param req DescribeServiceTemplateGroupsRequest
     * @return DescribeServiceTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplateGroupsResponse DescribeServiceTemplateGroups(DescribeServiceTemplateGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceTemplateGroups", DescribeServiceTemplateGroupsResponse.class);
    }

    /**
     *本接口（DescribeServiceTemplates）用于查询协议端口模板。
     * @param req DescribeServiceTemplatesRequest
     * @return DescribeServiceTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplatesResponse DescribeServiceTemplates(DescribeServiceTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeServiceTemplates", DescribeServiceTemplatesResponse.class);
    }

    /**
     *本接口（DescribeSgSnapshotFileContent）用于查询安全组快照文件内容。
     * @param req DescribeSgSnapshotFileContentRequest
     * @return DescribeSgSnapshotFileContentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSgSnapshotFileContentResponse DescribeSgSnapshotFileContent(DescribeSgSnapshotFileContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSgSnapshotFileContent", DescribeSgSnapshotFileContentResponse.class);
    }

    /**
     *本接口（DescribeSnapshotAttachedInstances）用于查询快照策略关联实例列表。
     * @param req DescribeSnapshotAttachedInstancesRequest
     * @return DescribeSnapshotAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotAttachedInstancesResponse DescribeSnapshotAttachedInstances(DescribeSnapshotAttachedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotAttachedInstances", DescribeSnapshotAttachedInstancesResponse.class);
    }

    /**
     *本接口（DescribeSnapshotFiles）用于查询快照文件。
     * @param req DescribeSnapshotFilesRequest
     * @return DescribeSnapshotFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotFilesResponse DescribeSnapshotFiles(DescribeSnapshotFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotFiles", DescribeSnapshotFilesResponse.class);
    }

    /**
     *本接口（DescribeSnapshotPolicies）用于查询快照策略。
     * @param req DescribeSnapshotPoliciesRequest
     * @return DescribeSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotPoliciesResponse DescribeSnapshotPolicies(DescribeSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshotPolicies", DescribeSnapshotPoliciesResponse.class);
    }

    /**
     *本接口 (DescribeSpecificTrafficPackageUsedDetails) 用于查询指定 共享流量包 的用量明细。
     * @param req DescribeSpecificTrafficPackageUsedDetailsRequest
     * @return DescribeSpecificTrafficPackageUsedDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecificTrafficPackageUsedDetailsResponse DescribeSpecificTrafficPackageUsedDetails(DescribeSpecificTrafficPackageUsedDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecificTrafficPackageUsedDetails", DescribeSpecificTrafficPackageUsedDetailsResponse.class);
    }

    /**
     *本接口(DescribeSubnetResourceDashboard)用于查看Subnet资源信息。
     * @param req DescribeSubnetResourceDashboardRequest
     * @return DescribeSubnetResourceDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetResourceDashboardResponse DescribeSubnetResourceDashboard(DescribeSubnetResourceDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnetResourceDashboard", DescribeSubnetResourceDashboardResponse.class);
    }

    /**
     *本接口（DescribeSubnets）用于查询子网列表。
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnets", DescribeSubnetsResponse.class);
    }

    /**
     *查询EIP异步任务执行结果
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
    }

    /**
     *本接口（DescribeTemplateLimits）用于查询参数模板配额列表。
     * @param req DescribeTemplateLimitsRequest
     * @return DescribeTemplateLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateLimitsResponse DescribeTemplateLimits(DescribeTemplateLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateLimits", DescribeTemplateLimitsResponse.class);
    }

    /**
     *本接口（DescribeTenantCcns）用于获取要锁定的云联网实例列表。
该接口一般用来封禁出口限速的云联网实例, 目前联通内部运营系统通过云API调用, 因为出口限速无法按地域间封禁, 只能按更粗的云联网实例粒度封禁, 如果是地域间限速, 一般可以通过更细的限速实例粒度封禁（DescribeCrossBorderCcnRegionBandwidthLimits）
如有需要, 可以封禁任意云联网实例, 可接入到内部运营系统
     * @param req DescribeTenantCcnsRequest
     * @return DescribeTenantCcnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTenantCcnsResponse DescribeTenantCcns(DescribeTenantCcnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTenantCcns", DescribeTenantCcnsResponse.class);
    }

    /**
     *本接口 (DescribeTrafficPackages)  用于查询共享流量包详细信息，包括共享流量包唯一标识ID，名称，流量使用信息等
     * @param req DescribeTrafficPackagesRequest
     * @return DescribeTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficPackagesResponse DescribeTrafficPackages(DescribeTrafficPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrafficPackages", DescribeTrafficPackagesResponse.class);
    }

    /**
     *本接口(DescribeUsedIpAddress)用于查询Subnet或者Vpc内的ip的使用情况，
如ip被占用，返回占用ip的资源类别与id；如未被占用，返回空值
     * @param req DescribeUsedIpAddressRequest
     * @return DescribeUsedIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsedIpAddressResponse DescribeUsedIpAddress(DescribeUsedIpAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsedIpAddress", DescribeUsedIpAddressResponse.class);
    }

    /**
     *本接口（DescribeVpcEndPoint）用于查询终端节点列表。
     * @param req DescribeVpcEndPointRequest
     * @return DescribeVpcEndPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcEndPointResponse DescribeVpcEndPoint(DescribeVpcEndPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcEndPoint", DescribeVpcEndPointResponse.class);
    }

    /**
     *本接口（DescribeVpcEndPointService）用于查询终端节点服务列表。
     * @param req DescribeVpcEndPointServiceRequest
     * @return DescribeVpcEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcEndPointServiceResponse DescribeVpcEndPointService(DescribeVpcEndPointServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcEndPointService", DescribeVpcEndPointServiceResponse.class);
    }

    /**
     *本接口（DescribeVpcEndPointServiceWhiteList）用于查询终端节点服务的服务白名单列表。
     * @param req DescribeVpcEndPointServiceWhiteListRequest
     * @return DescribeVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcEndPointServiceWhiteListResponse DescribeVpcEndPointServiceWhiteList(DescribeVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcEndPointServiceWhiteList", DescribeVpcEndPointServiceWhiteListResponse.class);
    }

    /**
     *本接口（DescribeVpcInstances）用于查询VPC下的云主机实例列表。
     * @param req DescribeVpcInstancesRequest
     * @return DescribeVpcInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcInstancesResponse DescribeVpcInstances(DescribeVpcInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcInstances", DescribeVpcInstancesResponse.class);
    }

    /**
     *本接口（DescribeVpcIpv6Addresses）用于查询 `VPC` `IPv6` 信息。
只能查询已使用的`IPv6`信息，当查询未使用的IP时，本接口不会报错，但不会出现在返回结果里。
     * @param req DescribeVpcIpv6AddressesRequest
     * @return DescribeVpcIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcIpv6AddressesResponse DescribeVpcIpv6Addresses(DescribeVpcIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcIpv6Addresses", DescribeVpcIpv6AddressesResponse.class);
    }

    /**
     *本接口（DescribeVpcLimits）用于获取私有网络配额，部分私有网络的配额有地域属性。
LimitTypes取值范围：
* appid-max-vpcs （每个开发商每个地域可创建的VPC数）。
* vpc-max-subnets（每个VPC可创建的子网数）。
* vpc-max-route-tables（每个VPC可创建的路由表数）。
* route-table-max-policies（每个路由表可添加的策略数）。
* vpc-max-vpn-gateways（每个VPC可创建的VPN网关数）。
* appid-max-custom-gateways（每个开发商可创建的对端网关数）。
* appid-max-vpn-connections（每个开发商可创建的VPN通道数）。
* custom-gateway-max-vpn-connections（每个对端网关可创建的VPN通道数）。
* vpn-gateway-max-custom-gateways（每个VPNGW可以创建的通道数）。
* vpc-max-network-acls（每个VPC可创建的网络ACL数）。
* network-acl-max-inbound-policies（每个网络ACL可添加的入站规则数）。
* network-acl-max-outbound-policies（每个网络ACL可添加的出站规则数）。
* vpc-max-vpcpeers（每个VPC可创建的对等连接数）。
* vpc-max-available-vpcpeers（每个VPC可创建的有效对等连接数）。
* vpc-max-basic-network-interconnections（每个VPC可创建的基础网络云主机与VPC互通数）。
* direct-connection-max-snats（每个专线网关可创建的SNAT数）。
* direct-connection-max-dnats（每个专线网关可创建的DNAT数）。
* direct-connection-max-snapts（每个专线网关可创建的SNAPT数）。
* direct-connection-max-dnapts（每个专线网关可创建的DNAPT数）。
* vpc-max-nat-gateways（每个VPC可创建的NAT网关数）。
* nat-gateway-max-eips（每个NAT可以购买的外网IP数量）。
* vpc-max-enis（每个VPC可创建弹性网卡数）。
* vpc-max-havips（每个VPC可创建HAVIP数）。
* eni-max-private-ips（每个ENI可以绑定的内网IP数（ENI未绑定子机））。
* nat-gateway-max-dnapts（每个NAT网关可创建的DNAPT数）。
* vpc-max-ipv6s（每个VPC可分配的IPv6地址数）。
* eni-max-ipv6s（每个ENI可分配的IPv6地址数）。
* vpc-max-assistant_cidrs（每个VPC可分配的辅助CIDR数）。
* appid-max-end-point-services （每个开发商每个地域可创建的终端节点服务个数）。
* appid-max-end-point-service-white-lists （每个开发商每个地域可创建的终端节点服务白名单个数）。
     * @param req DescribeVpcLimitsRequest
     * @return DescribeVpcLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcLimitsResponse DescribeVpcLimits(DescribeVpcLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcLimits", DescribeVpcLimitsResponse.class);
    }

    /**
     *查询私有网络对等连接。
     * @param req DescribeVpcPeeringConnectionsRequest
     * @return DescribeVpcPeeringConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPeeringConnectionsResponse DescribeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcPeeringConnections", DescribeVpcPeeringConnectionsResponse.class);
    }

    /**
     *本接口（DescribeVpcPrivateIpAddresses）用于查询VPC内网IP信息。<br />
只能查询已使用的IP信息，当查询未使用的IP时，本接口不会报错，但不会出现在返回结果里。
     * @param req DescribeVpcPrivateIpAddressesRequest
     * @return DescribeVpcPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPrivateIpAddressesResponse DescribeVpcPrivateIpAddresses(DescribeVpcPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcPrivateIpAddresses", DescribeVpcPrivateIpAddressesResponse.class);
    }

    /**
     *本接口(DescribeVpcResourceDashboard)用于查看VPC资源信息。
     * @param req DescribeVpcResourceDashboardRequest
     * @return DescribeVpcResourceDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResourceDashboardResponse DescribeVpcResourceDashboard(DescribeVpcResourceDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcResourceDashboard", DescribeVpcResourceDashboardResponse.class);
    }

    /**
     *本接口（DescribeVpcTaskResult）用于查询VPC任务执行结果。
     * @param req DescribeVpcTaskResultRequest
     * @return DescribeVpcTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcTaskResultResponse DescribeVpcTaskResult(DescribeVpcTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcTaskResult", DescribeVpcTaskResultResponse.class);
    }

    /**
     *本接口（DescribeVpcs）用于查询私有网络列表。
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcs", DescribeVpcsResponse.class);
    }

    /**
     *本接口（DescribeVpnConnections）用于查询VPN通道列表。
     * @param req DescribeVpnConnectionsRequest
     * @return DescribeVpnConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnConnectionsResponse DescribeVpnConnections(DescribeVpnConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpnConnections", DescribeVpnConnectionsResponse.class);
    }

    /**
     *本接口（DescribeVpnGatewayCcnRoutes）用于查询VPN网关云联网路由。
     * @param req DescribeVpnGatewayCcnRoutesRequest
     * @return DescribeVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewayCcnRoutesResponse DescribeVpnGatewayCcnRoutes(DescribeVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpnGatewayCcnRoutes", DescribeVpnGatewayCcnRoutesResponse.class);
    }

    /**
     *本接口（DescribeVpnGatewayRoutes）用于查询VPN网关路由。
     * @param req DescribeVpnGatewayRoutesRequest
     * @return DescribeVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewayRoutesResponse DescribeVpnGatewayRoutes(DescribeVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpnGatewayRoutes", DescribeVpnGatewayRoutesResponse.class);
    }

    /**
     *本接口（DescribeVpnGatewaySslClients）用于查询SSL-VPN-CLIENT 列表。
     * @param req DescribeVpnGatewaySslClientsRequest
     * @return DescribeVpnGatewaySslClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaySslClientsResponse DescribeVpnGatewaySslClients(DescribeVpnGatewaySslClientsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpnGatewaySslClients", DescribeVpnGatewaySslClientsResponse.class);
    }

    /**
     *本接口（DescribeVpnGatewaySslServers）用于查询SSL-VPN SERVER 列表信息。
     * @param req DescribeVpnGatewaySslServersRequest
     * @return DescribeVpnGatewaySslServersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaySslServersResponse DescribeVpnGatewaySslServers(DescribeVpnGatewaySslServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpnGatewaySslServers", DescribeVpnGatewaySslServersResponse.class);
    }

    /**
     *本接口（DescribeVpnGateways）用于查询VPN网关列表。
     * @param req DescribeVpnGatewaysRequest
     * @return DescribeVpnGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaysResponse DescribeVpnGateways(DescribeVpnGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpnGateways", DescribeVpnGatewaysResponse.class);
    }

    /**
     *本接口（DetachCcnInstances）用于从云联网实例中解关联指定的网络实例。<br />
解关联网络实例后，相应的路由策略会一并删除。
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachCcnInstances", DetachCcnInstancesResponse.class);
    }

    /**
     *本接口(DetachClassicLinkVpc)用于删除私有网络和基础网络设备互通。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public DetachClassicLinkVpcResponse DetachClassicLinkVpc(DetachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachClassicLinkVpc", DetachClassicLinkVpcResponse.class);
    }

    /**
     *本接口（DetachNetworkInterface）用于弹性网卡解绑云服务器。
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachNetworkInterface", DetachNetworkInterfaceResponse.class);
    }

    /**
     *本接口（DetachSnapshotInstances）用于快照策略解关联实例。
     * @param req DetachSnapshotInstancesRequest
     * @return DetachSnapshotInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachSnapshotInstancesResponse DetachSnapshotInstances(DetachSnapshotInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachSnapshotInstances", DetachSnapshotInstancesResponse.class);
    }

    /**
     *本接口（DisableCcnRoutes）用于禁用已经启用的云联网（CCN）路由。
     * @param req DisableCcnRoutesRequest
     * @return DisableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCcnRoutesResponse DisableCcnRoutes(DisableCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableCcnRoutes", DisableCcnRoutesResponse.class);
    }

    /**
     *本接口（DisableFlowLogs）用于停止流日志。
     * @param req DisableFlowLogsRequest
     * @return DisableFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DisableFlowLogsResponse DisableFlowLogs(DisableFlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableFlowLogs", DisableFlowLogsResponse.class);
    }

    /**
     *本接口（DisableGatewayFlowMonitor）用于关闭网关流量监控。
     * @param req DisableGatewayFlowMonitorRequest
     * @return DisableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DisableGatewayFlowMonitorResponse DisableGatewayFlowMonitor(DisableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableGatewayFlowMonitor", DisableGatewayFlowMonitorResponse.class);
    }

    /**
     *本接口（DisableRoutes）用于禁用已启用的子网路由
     * @param req DisableRoutesRequest
     * @return DisableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableRoutesResponse DisableRoutes(DisableRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRoutes", DisableRoutesResponse.class);
    }

    /**
     *本接口（DisableSnapshotPolicies）用于停用快照策略。
     * @param req DisableSnapshotPoliciesRequest
     * @return DisableSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DisableSnapshotPoliciesResponse DisableSnapshotPolicies(DisableSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableSnapshotPolicies", DisableSnapshotPoliciesResponse.class);
    }

    /**
     *禁用SSL-VPN-CLIENT 证书
     * @param req DisableVpnGatewaySslClientCertRequest
     * @return DisableVpnGatewaySslClientCertResponse
     * @throws TencentCloudSDKException
     */
    public DisableVpnGatewaySslClientCertResponse DisableVpnGatewaySslClientCert(DisableVpnGatewaySslClientCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableVpnGatewaySslClientCert", DisableVpnGatewaySslClientCertResponse.class);
    }

    /**
     *本接口 (DisassociateAddress) 用于解绑[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 支持CVM实例，弹性网卡上的EIP解绑
* 不支持NAT上的EIP解绑。NAT上的EIP解绑请参考[DisassociateNatGatewayAddress](https://cloud.tencent.com/document/api/215/36716)
* 只有状态为 BIND 和 BIND_ENI 的 EIP 才能进行解绑定操作。
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateAddress", DisassociateAddressResponse.class);
    }

    /**
     *本接口（DisassociateDhcpIpWithAddressIp）用于将DhcpIp已绑定的弹性公网IP（EIP）解除绑定。<br />
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req DisassociateDhcpIpWithAddressIpRequest
     * @return DisassociateDhcpIpWithAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDhcpIpWithAddressIpResponse DisassociateDhcpIpWithAddressIp(DisassociateDhcpIpWithAddressIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateDhcpIpWithAddressIp", DisassociateDhcpIpWithAddressIpResponse.class);
    }

    /**
     *将专线网关与NAT网关解绑，解绑之后，专线网关将不能通过NAT网关访问公网
     * @param req DisassociateDirectConnectGatewayNatGatewayRequest
     * @return DisassociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDirectConnectGatewayNatGatewayResponse DisassociateDirectConnectGatewayNatGateway(DisassociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateDirectConnectGatewayNatGateway", DisassociateDirectConnectGatewayNatGatewayResponse.class);
    }

    /**
     *本接口（DisassociateNatGatewayAddress）用于NAT网关解绑弹性IP。
     * @param req DisassociateNatGatewayAddressRequest
     * @return DisassociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNatGatewayAddressResponse DisassociateNatGatewayAddress(DisassociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateNatGatewayAddress", DisassociateNatGatewayAddressResponse.class);
    }

    /**
     *本接口（DisassociateNetworkAclSubnets）用于网络ACL解关联VPC下的子网。
     * @param req DisassociateNetworkAclSubnetsRequest
     * @return DisassociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkAclSubnetsResponse DisassociateNetworkAclSubnets(DisassociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateNetworkAclSubnets", DisassociateNetworkAclSubnetsResponse.class);
    }

    /**
     *本接口（DisassociateNetworkInterfaceSecurityGroups）用于弹性网卡解绑安全组。支持弹性网卡完全解绑安全组。
     * @param req DisassociateNetworkInterfaceSecurityGroupsRequest
     * @return DisassociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkInterfaceSecurityGroupsResponse DisassociateNetworkInterfaceSecurityGroups(DisassociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateNetworkInterfaceSecurityGroups", DisassociateNetworkInterfaceSecurityGroupsResponse.class);
    }

    /**
     *本接口（DisassociateVpcEndPointSecurityGroups）用于终端节点解绑安全组。
     * @param req DisassociateVpcEndPointSecurityGroupsRequest
     * @return DisassociateVpcEndPointSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateVpcEndPointSecurityGroupsResponse DisassociateVpcEndPointSecurityGroups(DisassociateVpcEndPointSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateVpcEndPointSecurityGroups", DisassociateVpcEndPointSecurityGroupsResponse.class);
    }

    /**
     *本接口（DownloadCustomerGatewayConfiguration）用于下载VPN通道配置。
     * @param req DownloadCustomerGatewayConfigurationRequest
     * @return DownloadCustomerGatewayConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCustomerGatewayConfigurationResponse DownloadCustomerGatewayConfiguration(DownloadCustomerGatewayConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadCustomerGatewayConfiguration", DownloadCustomerGatewayConfigurationResponse.class);
    }

    /**
     *本接口（DownloadVpnGatewaySslClientCert）用于下载SSL-VPN-CLIENT 客户端证书。
     * @param req DownloadVpnGatewaySslClientCertRequest
     * @return DownloadVpnGatewaySslClientCertResponse
     * @throws TencentCloudSDKException
     */
    public DownloadVpnGatewaySslClientCertResponse DownloadVpnGatewaySslClientCert(DownloadVpnGatewaySslClientCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadVpnGatewaySslClientCert", DownloadVpnGatewaySslClientCertResponse.class);
    }

    /**
     *本接口（EnableCcnRoutes）用于启用已经加入云联网（CCN）的路由。<br />
本接口会校验启用后，是否与已有路由冲突，如果冲突，则无法启用，失败处理。路由冲突时，需要先禁用与之冲突的路由，才能启用该路由。
     * @param req EnableCcnRoutesRequest
     * @return EnableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCcnRoutesResponse EnableCcnRoutes(EnableCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableCcnRoutes", EnableCcnRoutesResponse.class);
    }

    /**
     *本接口（EnableFlowLogs）用于启动流日志。
     * @param req EnableFlowLogsRequest
     * @return EnableFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public EnableFlowLogsResponse EnableFlowLogs(EnableFlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableFlowLogs", EnableFlowLogsResponse.class);
    }

    /**
     *本接口（EnableGatewayFlowMonitor）用于开启网关流量监控。
     * @param req EnableGatewayFlowMonitorRequest
     * @return EnableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public EnableGatewayFlowMonitorResponse EnableGatewayFlowMonitor(EnableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableGatewayFlowMonitor", EnableGatewayFlowMonitorResponse.class);
    }

    /**
     *本接口（EnableRoutes）用于启用已禁用的子网路由。<br />
本接口会校验启用后，是否与已有路由冲突，如果冲突，则无法启用，失败处理。路由冲突时，需要先禁用与之冲突的路由，才能启用该路由。
     * @param req EnableRoutesRequest
     * @return EnableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableRoutesResponse EnableRoutes(EnableRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableRoutes", EnableRoutesResponse.class);
    }

    /**
     *本接口（EnableSnapshotPolicies）用于启用快照策略。
     * @param req EnableSnapshotPoliciesRequest
     * @return EnableSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public EnableSnapshotPoliciesResponse EnableSnapshotPolicies(EnableSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableSnapshotPolicies", EnableSnapshotPoliciesResponse.class);
    }

    /**
     *本接口（EnableVpcEndPointConnect）用于是否接受终端节点连接请求。
     * @param req EnableVpcEndPointConnectRequest
     * @return EnableVpcEndPointConnectResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpcEndPointConnectResponse EnableVpcEndPointConnect(EnableVpcEndPointConnectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableVpcEndPointConnect", EnableVpcEndPointConnectResponse.class);
    }

    /**
     *本接口（EnableVpnGatewaySslClientCert）用于启用SSL-VPN-CLIENT 证书。
     * @param req EnableVpnGatewaySslClientCertRequest
     * @return EnableVpnGatewaySslClientCertResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpnGatewaySslClientCertResponse EnableVpnGatewaySslClientCert(EnableVpnGatewaySslClientCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableVpnGatewaySslClientCert", EnableVpnGatewaySslClientCertResponse.class);
    }

    /**
     *本接口（GenerateVpnConnectionDefaultHealthCheckIp）用于获取一对VPN通道健康检查地址。
     * @param req GenerateVpnConnectionDefaultHealthCheckIpRequest
     * @return GenerateVpnConnectionDefaultHealthCheckIpResponse
     * @throws TencentCloudSDKException
     */
    public GenerateVpnConnectionDefaultHealthCheckIpResponse GenerateVpnConnectionDefaultHealthCheckIp(GenerateVpnConnectionDefaultHealthCheckIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateVpnConnectionDefaultHealthCheckIp", GenerateVpnConnectionDefaultHealthCheckIpResponse.class);
    }

    /**
     *本接口（GetCcnRegionBandwidthLimits）用于查询云联网相关地域带宽信息，其中预付费模式的云联网仅支持地域间限速，后付费模式的云联网支持地域间限速和地域出口限速。
     * @param req GetCcnRegionBandwidthLimitsRequest
     * @return GetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public GetCcnRegionBandwidthLimitsResponse GetCcnRegionBandwidthLimits(GetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCcnRegionBandwidthLimits", GetCcnRegionBandwidthLimitsResponse.class);
    }

    /**
     *本接口（HaVipAssociateAddressIp）用于高可用虚拟IP（HAVIP）绑定弹性公网IP（EIP）。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req HaVipAssociateAddressIpRequest
     * @return HaVipAssociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipAssociateAddressIpResponse HaVipAssociateAddressIp(HaVipAssociateAddressIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HaVipAssociateAddressIp", HaVipAssociateAddressIpResponse.class);
    }

    /**
     *本接口（HaVipDisassociateAddressIp）用于将高可用虚拟IP（HAVIP）已绑定的弹性公网IP（EIP）解除绑定。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req HaVipDisassociateAddressIpRequest
     * @return HaVipDisassociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipDisassociateAddressIpResponse HaVipDisassociateAddressIp(HaVipDisassociateAddressIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HaVipDisassociateAddressIp", HaVipDisassociateAddressIpResponse.class);
    }

    /**
     *本接口（DescribePriceCreateDirectConnectGateway）用于创建专线网关询价。
     * @param req InquirePriceCreateDirectConnectGatewayRequest
     * @return InquirePriceCreateDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDirectConnectGatewayResponse InquirePriceCreateDirectConnectGateway(InquirePriceCreateDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateDirectConnectGateway", InquirePriceCreateDirectConnectGatewayResponse.class);
    }

    /**
     *本接口（InquiryPriceCreateVpnGateway）用于创建VPN网关询价。
     * @param req InquiryPriceCreateVpnGatewayRequest
     * @return InquiryPriceCreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateVpnGatewayResponse InquiryPriceCreateVpnGateway(InquiryPriceCreateVpnGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceCreateVpnGateway", InquiryPriceCreateVpnGatewayResponse.class);
    }

    /**
     *本接口（InquiryPriceRenewVpnGateway）用于续费VPN网关询价。目前仅支持IPSEC类型网关的询价。
     * @param req InquiryPriceRenewVpnGatewayRequest
     * @return InquiryPriceRenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewVpnGatewayResponse InquiryPriceRenewVpnGateway(InquiryPriceRenewVpnGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceRenewVpnGateway", InquiryPriceRenewVpnGatewayResponse.class);
    }

    /**
     *本接口（InquiryPriceResetVpnGatewayInternetMaxBandwidth）用于调整VPN网关带宽上限询价。
     * @param req InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest
     * @return InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse InquiryPriceResetVpnGatewayInternetMaxBandwidth(InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquiryPriceResetVpnGatewayInternetMaxBandwidth", InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse.class);
    }

    /**
     *本接口（LockCcnBandwidths）用户锁定云联网限速实例。
该接口一般用来封禁地域间限速的云联网实例下的限速实例, 目前联通内部运营系统通过云API调用, 如果是出口限速, 一般使用更粗的云联网实例粒度封禁（LockCcns）。
如有需要, 可以封禁任意限速实例, 可接入到内部运营系统。
     * @param req LockCcnBandwidthsRequest
     * @return LockCcnBandwidthsResponse
     * @throws TencentCloudSDKException
     */
    public LockCcnBandwidthsResponse LockCcnBandwidths(LockCcnBandwidthsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LockCcnBandwidths", LockCcnBandwidthsResponse.class);
    }

    /**
     *本接口（LockCcns）用于锁定云联网实例

该接口一般用来封禁出口限速的云联网实例, 目前联通内部运营系统通过云API调用, 因为出口限速无法按地域间封禁, 只能按更粗的云联网实例粒度封禁, 如果是地域间限速, 一般可以通过更细的限速实例粒度封禁（LockCcnBandwidths）

如有需要, 可以封禁任意限速实例, 可接入到内部运营系统


     * @param req LockCcnsRequest
     * @return LockCcnsResponse
     * @throws TencentCloudSDKException
     */
    public LockCcnsResponse LockCcns(LockCcnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LockCcns", LockCcnsResponse.class);
    }

    /**
     *本接口（MigrateNetworkInterface）用于弹性网卡迁移。
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigrateNetworkInterface", MigrateNetworkInterfaceResponse.class);
    }

    /**
     *本接口（MigratePrivateIpAddress）用于弹性网卡内网IP迁移。
* 该接口用于将一个内网IP从一个弹性网卡上迁移到另外一个弹性网卡，主IP地址不支持迁移。
* 迁移前后的弹性网卡必须在同一个子网内。  

本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigratePrivateIpAddress", MigratePrivateIpAddressResponse.class);
    }

    /**
     *本接口 (ModifyAddressAttribute) 用于修改[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）的名称。
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressAttribute", ModifyAddressAttributeResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressInternetChargeType", ModifyAddressInternetChargeTypeResponse.class);
    }

    /**
     *本接口（ModifyAddressTemplateAttribute）用于修改IP地址模板。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req ModifyAddressTemplateAttributeRequest
     * @return ModifyAddressTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateAttributeResponse ModifyAddressTemplateAttribute(ModifyAddressTemplateAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressTemplateAttribute", ModifyAddressTemplateAttributeResponse.class);
    }

    /**
     *本接口（ModifyAddressTemplateGroupAttribute）用于修改IP地址模板集合。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req ModifyAddressTemplateGroupAttributeRequest
     * @return ModifyAddressTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateGroupAttributeResponse ModifyAddressTemplateGroupAttribute(ModifyAddressTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressTemplateGroupAttribute", ModifyAddressTemplateGroupAttributeResponse.class);
    }

    /**
     *本接口（ModifyAddressesBandwidth）用于调整[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)(简称EIP)带宽，支持后付费EIP, 预付费EIP和带宽包EIP
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressesBandwidth", ModifyAddressesBandwidthResponse.class);
    }

    /**
     *本接口（ModifyAssistantCidr）用于批量修改辅助CIDR，支持新增和删除。
     * @param req ModifyAssistantCidrRequest
     * @return ModifyAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssistantCidrResponse ModifyAssistantCidr(ModifyAssistantCidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssistantCidr", ModifyAssistantCidrResponse.class);
    }

    /**
     *接口用于修改带宽包属性，包括带宽包名字等
     * @param req ModifyBandwidthPackageAttributeRequest
     * @return ModifyBandwidthPackageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBandwidthPackageAttributeResponse ModifyBandwidthPackageAttribute(ModifyBandwidthPackageAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBandwidthPackageAttribute", ModifyBandwidthPackageAttributeResponse.class);
    }

    /**
     *修改CCN关联实例属性，目前仅修改备注description
     * @param req ModifyCcnAttachedInstancesAttributeRequest
     * @return ModifyCcnAttachedInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttachedInstancesAttributeResponse ModifyCcnAttachedInstancesAttribute(ModifyCcnAttachedInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCcnAttachedInstancesAttribute", ModifyCcnAttachedInstancesAttributeResponse.class);
    }

    /**
     *本接口（ModifyCcnAttribute）用于修改云联网（CCN）的相关属性。
     * @param req ModifyCcnAttributeRequest
     * @return ModifyCcnAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttributeResponse ModifyCcnAttribute(ModifyCcnAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCcnAttribute", ModifyCcnAttributeResponse.class);
    }

    /**
     *本接口（ModifyCcnRegionBandwidthLimitsType）用于修改后付费云联网实例修改带宽限速策略。
     * @param req ModifyCcnRegionBandwidthLimitsTypeRequest
     * @return ModifyCcnRegionBandwidthLimitsTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnRegionBandwidthLimitsTypeResponse ModifyCcnRegionBandwidthLimitsType(ModifyCcnRegionBandwidthLimitsTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCcnRegionBandwidthLimitsType", ModifyCcnRegionBandwidthLimitsTypeResponse.class);
    }

    /**
     *本接口（ModifyCustomerGatewayAttribute）用于修改对端网关信息。
     * @param req ModifyCustomerGatewayAttributeRequest
     * @return ModifyCustomerGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomerGatewayAttributeResponse ModifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomerGatewayAttribute", ModifyCustomerGatewayAttributeResponse.class);
    }

    /**
     *本接口（ModifyDhcpIpAttribute）用于修改DhcpIp属性
     * @param req ModifyDhcpIpAttributeRequest
     * @return ModifyDhcpIpAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDhcpIpAttributeResponse ModifyDhcpIpAttribute(ModifyDhcpIpAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDhcpIpAttribute", ModifyDhcpIpAttributeResponse.class);
    }

    /**
     *本接口（ModifyDirectConnectGatewayAttribute）用于修改专线网关属性
     * @param req ModifyDirectConnectGatewayAttributeRequest
     * @return ModifyDirectConnectGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectGatewayAttributeResponse ModifyDirectConnectGatewayAttribute(ModifyDirectConnectGatewayAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDirectConnectGatewayAttribute", ModifyDirectConnectGatewayAttributeResponse.class);
    }

    /**
     *本接口（ModifyFlowLogAttribute）用于修改流日志属性。
     * @param req ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFlowLogAttributeResponse ModifyFlowLogAttribute(ModifyFlowLogAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFlowLogAttribute", ModifyFlowLogAttributeResponse.class);
    }

    /**
     *本接口（ModifyGatewayFlowQos）用于调整网关流控带宽。
     * @param req ModifyGatewayFlowQosRequest
     * @return ModifyGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayFlowQosResponse ModifyGatewayFlowQos(ModifyGatewayFlowQosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGatewayFlowQos", ModifyGatewayFlowQosResponse.class);
    }

    /**
     *本接口（ModifyHaVipAttribute）用于修改高可用虚拟IP（HAVIP）属性。
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHaVipAttribute", ModifyHaVipAttributeResponse.class);
    }

    /**
     *该接口用于修改IPV6地址访问internet的带宽
     * @param req ModifyIp6AddressesBandwidthRequest
     * @return ModifyIp6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIp6AddressesBandwidthResponse ModifyIp6AddressesBandwidth(ModifyIp6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIp6AddressesBandwidth", ModifyIp6AddressesBandwidthResponse.class);
    }

    /**
     *该接口用于修改IPV6转换规则，当前仅支持修改转换规则名称，IPV4地址和IPV4端口号
     * @param req ModifyIp6RuleRequest
     * @return ModifyIp6RuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIp6RuleResponse ModifyIp6Rule(ModifyIp6RuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIp6Rule", ModifyIp6RuleResponse.class);
    }

    /**
     *该接口用于修改IP6转换实例属性，当前仅支持修改实例名称。
     * @param req ModifyIp6TranslatorRequest
     * @return ModifyIp6TranslatorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIp6TranslatorResponse ModifyIp6Translator(ModifyIp6TranslatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIp6Translator", ModifyIp6TranslatorResponse.class);
    }

    /**
     *本接口（ModifyIpv6AddressesAttribute）用于修改弹性网卡内网IPv6地址属性。
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpv6AddressesAttribute", ModifyIpv6AddressesAttributeResponse.class);
    }

    /**
     *本接口（ModifyLocalGateway）用于修改CDC的本地网关。
     * @param req ModifyLocalGatewayRequest
     * @return ModifyLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLocalGatewayResponse ModifyLocalGateway(ModifyLocalGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLocalGateway", ModifyLocalGatewayResponse.class);
    }

    /**
     *本接口（ModifyNatGatewayAttribute）用于修改NAT网关的属性。
     * @param req ModifyNatGatewayAttributeRequest
     * @return ModifyNatGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayAttributeResponse ModifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatGatewayAttribute", ModifyNatGatewayAttributeResponse.class);
    }

    /**
     *本接口（ModifyNatGatewayDestinationIpPortTranslationNatRule）用于修改NAT网关端口转发规则。
     * @param req ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse ModifyNatGatewayDestinationIpPortTranslationNatRule(ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatGatewayDestinationIpPortTranslationNatRule", ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
    }

    /**
     *本接口（ModifyNatGatewaySourceIpTranslationNatRule）用于修改NAT网关SNAT转发规则。
     * @param req ModifyNatGatewaySourceIpTranslationNatRuleRequest
     * @return ModifyNatGatewaySourceIpTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewaySourceIpTranslationNatRuleResponse ModifyNatGatewaySourceIpTranslationNatRule(ModifyNatGatewaySourceIpTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatGatewaySourceIpTranslationNatRule", ModifyNatGatewaySourceIpTranslationNatRuleResponse.class);
    }

    /**
     *本接口(ModifyNetDetect)用于修改网络探测参数。
     * @param req ModifyNetDetectRequest
     * @return ModifyNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetDetectResponse ModifyNetDetect(ModifyNetDetectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetDetect", ModifyNetDetectResponse.class);
    }

    /**
     *本接口（ModifyNetworkAclAttribute）用于修改网络ACL属性。
     * @param req ModifyNetworkAclAttributeRequest
     * @return ModifyNetworkAclAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclAttributeResponse ModifyNetworkAclAttribute(ModifyNetworkAclAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkAclAttribute", ModifyNetworkAclAttributeResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkAclEntries", ModifyNetworkAclEntriesResponse.class);
    }

    /**
     *本接口（ModifyNetworkAclQuintupleEntries）用于修改网络ACL五元组的入站规则和出站规则。在NetworkAclQuintupleEntrySet参数中：NetworkAclQuintupleEntry需要提供NetworkAclQuintupleEntryId。
     * @param req ModifyNetworkAclQuintupleEntriesRequest
     * @return ModifyNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclQuintupleEntriesResponse ModifyNetworkAclQuintupleEntries(ModifyNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkAclQuintupleEntries", ModifyNetworkAclQuintupleEntriesResponse.class);
    }

    /**
     *本接口（ModifyNetworkInterfaceAttribute）用于修改弹性网卡属性。
     * @param req ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkInterfaceAttributeResponse ModifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkInterfaceAttribute", ModifyNetworkInterfaceAttributeResponse.class);
    }

    /**
     *本接口（ModifyNetworkInterfaceQos）用于修改弹性网卡服务质量。
     * @param req ModifyNetworkInterfaceQosRequest
     * @return ModifyNetworkInterfaceQosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkInterfaceQosResponse ModifyNetworkInterfaceQos(ModifyNetworkInterfaceQosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNetworkInterfaceQos", ModifyNetworkInterfaceQosResponse.class);
    }

    /**
     *本接口（ModifyPrivateIpAddressesAttribute）用于修改弹性网卡内网IP属性。
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateIpAddressesAttribute", ModifyPrivateIpAddressesAttributeResponse.class);
    }

    /**
     *本接口（ModifyPrivateNatGatewayAttribute）用于修改私网NAT网关属性
     * @param req ModifyPrivateNatGatewayAttributeRequest
     * @return ModifyPrivateNatGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateNatGatewayAttributeResponse ModifyPrivateNatGatewayAttribute(ModifyPrivateNatGatewayAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateNatGatewayAttribute", ModifyPrivateNatGatewayAttributeResponse.class);
    }

    /**
     *本接口（ModifyPrivateNatGatewayDestinationIpPortTranslationNatRule）用于修改私网NAT网关目的端口转换规则
     * @param req ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleResponse ModifyPrivateNatGatewayDestinationIpPortTranslationNatRule(ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateNatGatewayDestinationIpPortTranslationNatRule", ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
    }

    /**
     *本接口（ModifyPrivateNatGatewayTranslationAclRule）用于修改私网NAT网关源端转换访问控制规则
     * @param req ModifyPrivateNatGatewayTranslationAclRuleRequest
     * @return ModifyPrivateNatGatewayTranslationAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateNatGatewayTranslationAclRuleResponse ModifyPrivateNatGatewayTranslationAclRule(ModifyPrivateNatGatewayTranslationAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateNatGatewayTranslationAclRule", ModifyPrivateNatGatewayTranslationAclRuleResponse.class);
    }

    /**
     *本接口（ModifyPrivateNatGatewayTranslationNatRule）用于修改私网NAT网关源端转换规则
     * @param req ModifyPrivateNatGatewayTranslationNatRuleRequest
     * @return ModifyPrivateNatGatewayTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateNatGatewayTranslationNatRuleResponse ModifyPrivateNatGatewayTranslationNatRule(ModifyPrivateNatGatewayTranslationNatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateNatGatewayTranslationNatRule", ModifyPrivateNatGatewayTranslationNatRuleResponse.class);
    }

    /**
     *本接口（ModifyRouteTableAttribute）用于修改路由表（RouteTable）属性。
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRouteTableAttribute", ModifyRouteTableAttributeResponse.class);
    }

    /**
     *本接口（ModifySecurityGroupAttribute）用于修改安全组（SecurityGroupPolicy）属性。
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupAttribute", ModifySecurityGroupAttributeResponse.class);
    }

    /**
     *本接口（ModifySecurityGroupPolicies）用于重置安全组出站和入站规则（SecurityGroupPolicy）。

<ul>
<li>该接口不支持自定义索引 PolicyIndex。</li>
<li>在 SecurityGroupPolicySet 参数中：<ul>
	<li> 如果指定 SecurityGroupPolicySet.Version 为0, 表示清空所有规则，并忽略 Egress 和 Ingress。</li>
	<li> 如果指定 SecurityGroupPolicySet.Version 不为0, 在添加出站和入站规则（Egress 和 Ingress）时：<ul>
		<li>Protocol 字段支持输入 TCP, UDP, ICMP, ICMPV6, GRE, ALL。</li>
		<li>CidrBlock 字段允许输入符合 cidr 格式标准的任意字符串。在基础网络中，如果 CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
		<li>Ipv6CidrBlock 字段允许输入符合 IPv6 cidr 格式标准的任意字符串。在基础网络中，如果Ipv6CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IPv6，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupPolicies", ModifySecurityGroupPoliciesResponse.class);
    }

    /**
     *本接口（ModifyServiceTemplateAttribute）用于修改协议端口模板。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req ModifyServiceTemplateAttributeRequest
     * @return ModifyServiceTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateAttributeResponse ModifyServiceTemplateAttribute(ModifyServiceTemplateAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceTemplateAttribute", ModifyServiceTemplateAttributeResponse.class);
    }

    /**
     *本接口（ModifyServiceTemplateGroupAttribute）用于修改协议端口模板集合。
>?本接口为异步接口，可调用 [DescribeVpcTaskResult](https://cloud.tencent.com/document/api/215/59037) 接口查询任务执行结果，待任务执行成功后再进行其他操作。
>
     * @param req ModifyServiceTemplateGroupAttributeRequest
     * @return ModifyServiceTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateGroupAttributeResponse ModifyServiceTemplateGroupAttribute(ModifyServiceTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceTemplateGroupAttribute", ModifyServiceTemplateGroupAttributeResponse.class);
    }

    /**
     *本接口（ModifySnapshotPolicies）用于修改快照策略。
     * @param req ModifySnapshotPoliciesRequest
     * @return ModifySnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotPoliciesResponse ModifySnapshotPolicies(ModifySnapshotPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySnapshotPolicies", ModifySnapshotPoliciesResponse.class);
    }

    /**
     *本接口（ModifySubnetAttribute）用于修改子网属性。
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubnetAttribute", ModifySubnetAttributeResponse.class);
    }

    /**
     *修改模板对象中的IP地址、协议端口、IP地址组、协议端口组。
     * @param req ModifyTemplateMemberRequest
     * @return ModifyTemplateMemberResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTemplateMemberResponse ModifyTemplateMember(ModifyTemplateMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTemplateMember", ModifyTemplateMemberResponse.class);
    }

    /**
     *本接口（ModifyVpcAttribute）用于修改私有网络（VPC）的相关属性。
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcAttribute", ModifyVpcAttributeResponse.class);
    }

    /**
     *本接口（ModifyVpcEndPointAttribute）用于修改终端节点属性。
     * @param req ModifyVpcEndPointAttributeRequest
     * @return ModifyVpcEndPointAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcEndPointAttributeResponse ModifyVpcEndPointAttribute(ModifyVpcEndPointAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcEndPointAttribute", ModifyVpcEndPointAttributeResponse.class);
    }

    /**
     *本接口（ModifyVpcEndPointServiceAttribute）用于修改终端节点服务属性。


     * @param req ModifyVpcEndPointServiceAttributeRequest
     * @return ModifyVpcEndPointServiceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcEndPointServiceAttributeResponse ModifyVpcEndPointServiceAttribute(ModifyVpcEndPointServiceAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcEndPointServiceAttribute", ModifyVpcEndPointServiceAttributeResponse.class);
    }

    /**
     *本接口（ModifyVpcEndPointServiceWhiteList）用于修改终端节点服务白名单属性。
     * @param req ModifyVpcEndPointServiceWhiteListRequest
     * @return ModifyVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcEndPointServiceWhiteListResponse ModifyVpcEndPointServiceWhiteList(ModifyVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcEndPointServiceWhiteList", ModifyVpcEndPointServiceWhiteListResponse.class);
    }

    /**
     *本接口（ModifyVpcPeeringConnection）用于修改私有网络对等连接属性。
     * @param req ModifyVpcPeeringConnectionRequest
     * @return ModifyVpcPeeringConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcPeeringConnectionResponse ModifyVpcPeeringConnection(ModifyVpcPeeringConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcPeeringConnection", ModifyVpcPeeringConnectionResponse.class);
    }

    /**
     *本接口（ModifyVpnConnectionAttribute）用于修改VPN通道。
     * @param req ModifyVpnConnectionAttributeRequest
     * @return ModifyVpnConnectionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnConnectionAttributeResponse ModifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpnConnectionAttribute", ModifyVpnConnectionAttributeResponse.class);
    }

    /**
     *本接口（ModifyVpnGatewayAttribute）用于修改VPN网关属性。
     * @param req ModifyVpnGatewayAttributeRequest
     * @return ModifyVpnGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayAttributeResponse ModifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpnGatewayAttribute", ModifyVpnGatewayAttributeResponse.class);
    }

    /**
     *本接口（ModifyVpnGatewayCcnRoutes）用于修改VPN网关云联网路由。
     * @param req ModifyVpnGatewayCcnRoutesRequest
     * @return ModifyVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayCcnRoutesResponse ModifyVpnGatewayCcnRoutes(ModifyVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpnGatewayCcnRoutes", ModifyVpnGatewayCcnRoutesResponse.class);
    }

    /**
     *本接口（ModifyVpnGatewayRoutes）用于修改VPN路由是否启用。
     * @param req ModifyVpnGatewayRoutesRequest
     * @return ModifyVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayRoutesResponse ModifyVpnGatewayRoutes(ModifyVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpnGatewayRoutes", ModifyVpnGatewayRoutesResponse.class);
    }

    /**
     *本接口用于修改 SSL-VPN 服务端属性
     * @param req ModifyVpnGatewaySslServerRequest
     * @return ModifyVpnGatewaySslServerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewaySslServerResponse ModifyVpnGatewaySslServer(ModifyVpnGatewaySslServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpnGatewaySslServer", ModifyVpnGatewaySslServerResponse.class);
    }

    /**
     *本接口（NotifyRoutes）用于路由表列表页操作增加“发布到云联网”，发布路由到云联网。
     * @param req NotifyRoutesRequest
     * @return NotifyRoutesResponse
     * @throws TencentCloudSDKException
     */
    public NotifyRoutesResponse NotifyRoutes(NotifyRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "NotifyRoutes", NotifyRoutesResponse.class);
    }

    /**
     *刷新专线直连nat路由，更新nat到专线的路由表
     * @param req RefreshDirectConnectGatewayRouteToNatGatewayRequest
     * @return RefreshDirectConnectGatewayRouteToNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public RefreshDirectConnectGatewayRouteToNatGatewayResponse RefreshDirectConnectGatewayRouteToNatGateway(RefreshDirectConnectGatewayRouteToNatGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshDirectConnectGatewayRouteToNatGateway", RefreshDirectConnectGatewayRouteToNatGatewayResponse.class);
    }

    /**
     *本接口（RejectAttachCcnInstances）用于跨账号关联实例时，云联网所有者拒绝关联操作。

     * @param req RejectAttachCcnInstancesRequest
     * @return RejectAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RejectAttachCcnInstancesResponse RejectAttachCcnInstances(RejectAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RejectAttachCcnInstances", RejectAttachCcnInstancesResponse.class);
    }

    /**
     *本接口（RejectVpcPeeringConnection）用于驳回对等连接请求。
     * @param req RejectVpcPeeringConnectionRequest
     * @return RejectVpcPeeringConnectionResponse
     * @throws TencentCloudSDKException
     */
    public RejectVpcPeeringConnectionResponse RejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RejectVpcPeeringConnection", RejectVpcPeeringConnectionResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseAddresses", ReleaseAddressesResponse.class);
    }

    /**
     *该接口用于给弹性公网IPv6地址释放带宽。
     * @param req ReleaseIp6AddressesBandwidthRequest
     * @return ReleaseIp6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIp6AddressesBandwidthResponse ReleaseIp6AddressesBandwidth(ReleaseIp6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseIp6AddressesBandwidth", ReleaseIp6AddressesBandwidthResponse.class);
    }

    /**
     *接口用于删除带宽包资源，包括[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)和[负载均衡](https://cloud.tencent.com/document/product/214/517)等
     * @param req RemoveBandwidthPackageResourcesRequest
     * @return RemoveBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBandwidthPackageResourcesResponse RemoveBandwidthPackageResources(RemoveBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveBandwidthPackageResources", RemoveBandwidthPackageResourcesResponse.class);
    }

    /**
     *1. 该接口用于删除IPV6转换规则
2. 支持批量删除同一个转换实例下的多个转换规则
     * @param req RemoveIp6RulesRequest
     * @return RemoveIp6RulesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveIp6RulesResponse RemoveIp6Rules(RemoveIp6RulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveIp6Rules", RemoveIp6RulesResponse.class);
    }

    /**
     *该接口用于续费包月带宽计费模式的弹性公网IP
     * @param req RenewAddressesRequest
     * @return RenewAddressesResponse
     * @throws TencentCloudSDKException
     */
    public RenewAddressesResponse RenewAddresses(RenewAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewAddresses", RenewAddressesResponse.class);
    }

    /**
     *本接口（RenewVpnGateway）用于预付费（包年包月）VPN网关续费。目前只支持IPSEC网关。
     * @param req RenewVpnGatewayRequest
     * @return RenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public RenewVpnGatewayResponse RenewVpnGateway(RenewVpnGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewVpnGateway", RenewVpnGatewayResponse.class);
    }

    /**
     *本接口（ReplaceDirectConnectGatewayCcnRoutes）根据路由ID（RouteId）修改指定的路由（Route），支持批量修改。
     * @param req ReplaceDirectConnectGatewayCcnRoutesRequest
     * @return ReplaceDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceDirectConnectGatewayCcnRoutesResponse ReplaceDirectConnectGatewayCcnRoutes(ReplaceDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceDirectConnectGatewayCcnRoutes", ReplaceDirectConnectGatewayCcnRoutesResponse.class);
    }

    /**
     *本接口（ReplaceRouteTableAssociation）用于修改子网（Subnet）关联的路由表（RouteTable）。
* 一个子网只能关联一个路由表。
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceRouteTableAssociation", ReplaceRouteTableAssociationResponse.class);
    }

    /**
     *本接口（ReplaceRoutes）根据路由策略ID（RouteId）修改指定的路由策略（Route），支持批量修改。
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceRoutes", ReplaceRoutesResponse.class);
    }

    /**
     *本接口（ReplaceSecurityGroupPolicies）用于批量修改安全组规则（SecurityGroupPolicy）。
单个请求中只能替换单个方向的一条或多条规则, 必须要指定索引（PolicyIndex）。
     * @param req ReplaceSecurityGroupPoliciesRequest
     * @return ReplaceSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPoliciesResponse ReplaceSecurityGroupPolicies(ReplaceSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceSecurityGroupPolicies", ReplaceSecurityGroupPoliciesResponse.class);
    }

    /**
     *本接口（ReplaceSecurityGroupPolicy）用于替换单条安全组规则（SecurityGroupPolicy）。
单个请求中只能替换单个方向的一条规则, 必须要指定索引（PolicyIndex）。
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceSecurityGroupPolicy", ReplaceSecurityGroupPolicyResponse.class);
    }

    /**
     *本接口（ResetAttachCcnInstances）用于跨账号关联实例申请过期时，重新申请关联操作。
     * @param req ResetAttachCcnInstancesRequest
     * @return ResetAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnInstancesResponse ResetAttachCcnInstances(ResetAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetAttachCcnInstances", ResetAttachCcnInstancesResponse.class);
    }

    /**
     *本接口（ResetNatGatewayConnection）用来NAT网关并发连接上限。
     * @param req ResetNatGatewayConnectionRequest
     * @return ResetNatGatewayConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetNatGatewayConnectionResponse ResetNatGatewayConnection(ResetNatGatewayConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetNatGatewayConnection", ResetNatGatewayConnectionResponse.class);
    }

    /**
     *本接口（ResetRoutes）用于对某个路由表名称和所有路由策略（Route）进行重新设置。<br />
注意: 调用本接口是先删除当前路由表中所有路由策略, 再保存新提交的路由策略内容, 会引起网络中断。
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRoutes", ResetRoutesResponse.class);
    }

    /**
     *本接口（ResetVpnConnection）用于重置VPN通道。
     * @param req ResetVpnConnectionRequest
     * @return ResetVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnConnectionResponse ResetVpnConnection(ResetVpnConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetVpnConnection", ResetVpnConnectionResponse.class);
    }

    /**
     *本接口（ResetVpnGatewayInternetMaxBandwidth）用于调整VPN网关带宽上限。VPN网关带宽目前仅支持部分带宽范围内升降配，如【5,100】Mbps和【200,1000】Mbps，在各自带宽范围内可提升配额，跨范围提升配额和降配暂不支持，如果是包年包月VPN网关需要在有效期内。
     * @param req ResetVpnGatewayInternetMaxBandwidthRequest
     * @return ResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnGatewayInternetMaxBandwidthResponse ResetVpnGatewayInternetMaxBandwidth(ResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetVpnGatewayInternetMaxBandwidth", ResetVpnGatewayInternetMaxBandwidthResponse.class);
    }

    /**
     *本接口（ResumeSnapshotInstance）用于根据备份内容恢复安全组策略。
     * @param req ResumeSnapshotInstanceRequest
     * @return ResumeSnapshotInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSnapshotInstanceResponse ResumeSnapshotInstance(ResumeSnapshotInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeSnapshotInstance", ResumeSnapshotInstanceResponse.class);
    }

    /**
     *本接口（ReturnNormalAddresses）用于解绑并释放普通公网IP。
为完善公网IP的访问管理功能，此接口于2022年12月15日升级优化鉴权功能，升级后子用户调用此接口需向主账号申请CAM策略授权，否则可能调用失败。您可以提前为子账号配置操作授权，详情见[授权指南](https://cloud.tencent.com/document/product/598/34545)。
     * @param req ReturnNormalAddressesRequest
     * @return ReturnNormalAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReturnNormalAddressesResponse ReturnNormalAddresses(ReturnNormalAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReturnNormalAddresses", ReturnNormalAddressesResponse.class);
    }

    /**
     *本接口（SetCcnRegionBandwidthLimits）用于设置云联网（CCN）各地域出带宽上限，或者地域间带宽上限。
     * @param req SetCcnRegionBandwidthLimitsRequest
     * @return SetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public SetCcnRegionBandwidthLimitsResponse SetCcnRegionBandwidthLimits(SetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetCcnRegionBandwidthLimits", SetCcnRegionBandwidthLimitsResponse.class);
    }

    /**
     *本接口（SetVpnGatewaysRenewFlag）用于设置VPNGW续费标记。
     * @param req SetVpnGatewaysRenewFlagRequest
     * @return SetVpnGatewaysRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetVpnGatewaysRenewFlagResponse SetVpnGatewaysRenewFlag(SetVpnGatewaysRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetVpnGatewaysRenewFlag", SetVpnGatewaysRenewFlagResponse.class);
    }

    /**
     *本接口 (TransformAddress) 用于将实例的普通公网 IP 转换为[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 平台对用户每地域每日解绑 EIP 重新分配普通公网 IP 次数有所限制（可参见 [EIP 产品简介](/document/product/213/1941)）。上述配额可通过 [DescribeAddressQuota](https://cloud.tencent.com/document/api/213/1378) 接口获取。
     * @param req TransformAddressRequest
     * @return TransformAddressResponse
     * @throws TencentCloudSDKException
     */
    public TransformAddressResponse TransformAddress(TransformAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransformAddress", TransformAddressResponse.class);
    }

    /**
     *本接口（UnassignIpv6Addresses）用于释放弹性网卡`IPv6`地址。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6AddressesResponse UnassignIpv6Addresses(UnassignIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnassignIpv6Addresses", UnassignIpv6AddressesResponse.class);
    }

    /**
     *本接口（UnassignIpv6CidrBlock）用于释放IPv6网段。<br />
网段如果还有IP占用且未回收，则网段无法释放。
     * @param req UnassignIpv6CidrBlockRequest
     * @return UnassignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6CidrBlockResponse UnassignIpv6CidrBlock(UnassignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnassignIpv6CidrBlock", UnassignIpv6CidrBlockResponse.class);
    }

    /**
     *本接口（UnassignIpv6SubnetCidrBlock）用于释放IPv6子网段。<br />
子网段如果还有IP占用且未回收，则子网段无法释放。
     * @param req UnassignIpv6SubnetCidrBlockRequest
     * @return UnassignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6SubnetCidrBlockResponse UnassignIpv6SubnetCidrBlock(UnassignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnassignIpv6SubnetCidrBlock", UnassignIpv6SubnetCidrBlockResponse.class);
    }

    /**
     *本接口（UnassignPrivateIpAddresses）用于弹性网卡退还内网 IP。
* 退还弹性网卡上的辅助内网IP，接口自动解关联弹性公网 IP。不能退还弹性网卡的主内网IP。

本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`DescribeVpcTaskResult`接口。
     * @param req UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignPrivateIpAddressesResponse UnassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnassignPrivateIpAddresses", UnassignPrivateIpAddressesResponse.class);
    }

    /**
     *本接口（UnlockCcnBandwidths）用户解锁云联网限速实例。
该接口一般用来封禁地域间限速的云联网实例下的限速实例, 目前联通内部运营系统通过云API调用, 如果是出口限速, 一般使用更粗的云联网实例粒度封禁（SecurityUnlockCcns）。
如有需要, 可以封禁任意限速实例, 可接入到内部运营系统。
     * @param req UnlockCcnBandwidthsRequest
     * @return UnlockCcnBandwidthsResponse
     * @throws TencentCloudSDKException
     */
    public UnlockCcnBandwidthsResponse UnlockCcnBandwidths(UnlockCcnBandwidthsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnlockCcnBandwidths", UnlockCcnBandwidthsResponse.class);
    }

    /**
     *本接口（UnlockCcns）用于解锁云联网实例

该接口一般用来解封禁出口限速的云联网实例, 目前联通内部运营系统通过云API调用, 因为出口限速无法按地域间解封禁, 只能按更粗的云联网实例粒度解封禁, 如果是地域间限速, 一般可以通过更细的限速实例粒度解封禁（UnlockCcnBandwidths）

如有需要, 可以封禁任意限速实例, 可接入到内部运营系统


     * @param req UnlockCcnsRequest
     * @return UnlockCcnsResponse
     * @throws TencentCloudSDKException
     */
    public UnlockCcnsResponse UnlockCcns(UnlockCcnsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnlockCcns", UnlockCcnsResponse.class);
    }

    /**
     *本接口（WithdrawNotifyRoutes）用于撤销已发布到云联网的路由。路由表列表页操作增加“从云联网撤销”。
     * @param req WithdrawNotifyRoutesRequest
     * @return WithdrawNotifyRoutesResponse
     * @throws TencentCloudSDKException
     */
    public WithdrawNotifyRoutesResponse WithdrawNotifyRoutes(WithdrawNotifyRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "WithdrawNotifyRoutes", WithdrawNotifyRoutesResponse.class);
    }

}
