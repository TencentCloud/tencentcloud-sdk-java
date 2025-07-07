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
package com.tencentcloudapi.ecm.v20190719;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ecm.v20190719.models.*;

public class EcmClient extends AbstractClient{
    private static String endpoint = "ecm.tencentcloudapi.com";
    private static String service = "ecm";
    private static String version = "2019-07-19";

    public EcmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EcmClient(Credential credential, String region, ClientProfile profile) {
        super(EcmClient.endpoint, EcmClient.version, credential, region, profile);
    }

    /**
     *申请一个或多个弹性公网IP（简称 EIP）
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateAddresses", AllocateAddressesResponse.class);
    }

    /**
     *本接口用于给IPv6地址分配公网带宽
     * @param req AllocateIpv6AddressesBandwidthRequest
     * @return AllocateIpv6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public AllocateIpv6AddressesBandwidthResponse AllocateIpv6AddressesBandwidth(AllocateIpv6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AllocateIpv6AddressesBandwidth", AllocateIpv6AddressesBandwidthResponse.class);
    }

    /**
     *本接口（AssignIpv6Addresses）用于弹性网卡申请IPv6地址。
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

使用本接口前，您需要已有VPC实例，如果没有可通过接口CreateVpc创建。
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6CidrBlock", AssignIpv6CidrBlockResponse.class);
    }

    /**
     *本接口（AssignIpv6CidrBlocks）用于分配IPv6网段。

使用本接口前，您需要已有VPC实例，如果没有可通过接口CreateVpc创建。
每个VPC 可以同时支持运营商网络('CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调)。本接口可以同时申请不同类型的IPv6网段
     * @param req AssignIpv6CidrBlocksRequest
     * @return AssignIpv6CidrBlocksResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlocksResponse AssignIpv6CidrBlocks(AssignIpv6CidrBlocksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6CidrBlocks", AssignIpv6CidrBlocksResponse.class);
    }

    /**
     *本接口（AssignIpv6SubnetCidrBlock）用于分配IPv6子网段。

给子网分配 IPv6 网段，要求子网所属 VPC 已获得 IPv6 网段。如果尚未分配，请先通过接口 AssignIpv6CidrBlock 给子网所属 VPC 分配一个 IPv6 网段。否则无法分配 IPv6 子网段。
每个子网只能分配一个IPv6网段。
     * @param req AssignIpv6SubnetCidrBlockRequest
     * @return AssignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6SubnetCidrBlockResponse AssignIpv6SubnetCidrBlock(AssignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignIpv6SubnetCidrBlock", AssignIpv6SubnetCidrBlockResponse.class);
    }

    /**
     *弹性网卡申请内网 IP
     * @param req AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignPrivateIpAddressesResponse AssignPrivateIpAddresses(AssignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignPrivateIpAddresses", AssignPrivateIpAddressesResponse.class);
    }

    /**
     *将弹性公网IP（简称 EIP）绑定到实例或弹性网卡的指定内网 IP 上。
将 EIP 绑定到实例（ECM）上，其本质是将 EIP 绑定到实例上主网卡的主内网 IP 上。
将 EIP 绑定到指定网卡的内网 IP上，内网IP已经绑定了EIP或普通公网IP，则反馈失败。必须先解绑该 EIP，才能再绑定新的。
只有状态为 UNBIND 的 EIP 才能够绑定内网IP。
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateAddress", AssociateAddressResponse.class);
    }

    /**
     *绑定安全组
     * @param req AssociateSecurityGroupsRequest
     * @return AssociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSecurityGroupsResponse AssociateSecurityGroups(AssociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSecurityGroups", AssociateSecurityGroupsResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（AttachDisks）用于挂载云硬盘。
 
* 支持批量操作，将多块云盘挂载到同一云主机。如果多个云盘中存在不允许挂载的云盘，则操作不执行，返回特定的错误码。
* 本接口为异步接口，当挂载云盘的请求成功返回时，表示后台已发起挂载云盘的操作，可通过接口[DescribeDisks](/document/product/362/16315)来查询对应云盘的状态，如果云盘的状态由“ATTACHING”变为“ATTACHED”，则为挂载成功。
     * @param req AttachDisksRequest
     * @return AttachDisksResponse
     * @throws TencentCloudSDKException
     */
    public AttachDisksResponse AttachDisks(AttachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachDisks", AttachDisksResponse.class);
    }

    /**
     *弹性网卡绑定云主机
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AttachNetworkInterface", AttachNetworkInterfaceResponse.class);
    }

    /**
     *批量解绑后端服务。
     * @param req BatchDeregisterTargetsRequest
     * @return BatchDeregisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeregisterTargetsResponse BatchDeregisterTargets(BatchDeregisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeregisterTargets", BatchDeregisterTargetsResponse.class);
    }

    /**
     *批量修改监听器绑定的后端机器的转发权重。
     * @param req BatchModifyTargetWeightRequest
     * @return BatchModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTargetWeightResponse BatchModifyTargetWeight(BatchModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTargetWeight", BatchModifyTargetWeightResponse.class);
    }

    /**
     *批量绑定后端目标。
     * @param req BatchRegisterTargetsRequest
     * @return BatchRegisterTargetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchRegisterTargetsResponse BatchRegisterTargets(BatchRegisterTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchRegisterTargets", BatchRegisterTargetsResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（CreateDisks）用于创建云硬盘。

* 预付费云盘的购买会预先扣除本次云盘购买所需金额，在调用本接口前请确保账户余额充足。
* 本接口支持传入数据盘快照来创建云盘，实现将快照数据复制到新购云盘上。
* 本接口为异步接口，当创建请求下发成功后会返回一个新建的云盘ID列表，此时云盘的创建并未立即完成。可以通过调用[DescribeDisks](/document/product/362/16315)接口根据DiskId查询对应云盘，如果能查到云盘，且状态为'UNATTACHED'或'ATTACHED'，则表示创建成功。
     * @param req CreateDisksRequest
     * @return CreateDisksResponse
     * @throws TencentCloudSDKException
     */
    public CreateDisksResponse CreateDisks(CreateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDisks", CreateDisksResponse.class);
    }

    /**
     *本接口（CreateHaVip）用于创建高可用虚拟IP（HAVIP）
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHaVip", CreateHaVipResponse.class);
    }

    /**
     *本接口(CreateImage)用于将实例的系统盘制作为新镜像，创建后的镜像可以用于创建实例。
     * @param req CreateImageRequest
     * @return CreateImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageResponse CreateImage(CreateImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImage", CreateImageResponse.class);
    }

    /**
     *用于创建一个 OpenSSH RSA 密钥对，可以用于登录 Linux 实例。
     * @param req CreateKeyPairRequest
     * @return CreateKeyPairResponse
     * @throws TencentCloudSDKException
     */
    public CreateKeyPairResponse CreateKeyPair(CreateKeyPairRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKeyPair", CreateKeyPairResponse.class);
    }

    /**
     *创建负载均衡监听器。
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     *购买负载均衡实例。
     * @param req CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancerResponse CreateLoadBalancer(CreateLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancer", CreateLoadBalancerResponse.class);
    }

    /**
     *创建模块
     * @param req CreateModuleRequest
     * @return CreateModuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateModuleResponse CreateModule(CreateModuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModule", CreateModuleResponse.class);
    }

    /**
     *创建弹性网卡
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetworkInterface", CreateNetworkInterfaceResponse.class);
    }

    /**
     *创建了VPC后，系统会创建一个默认路由表，所有新建的子网都会关联到默认路由表。默认情况下您可以直接使用默认路由表来管理您的路由策略。当您的路由策略较多时，您可以调用创建路由表接口创建更多路由表管理您的路由策略。
     * @param req CreateRouteTableRequest
     * @return CreateRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteTableResponse CreateRouteTable(CreateRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRouteTable", CreateRouteTableResponse.class);
    }

    /**
     *创建路由策略
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoutes", CreateRoutesResponse.class);
    }

    /**
     *创建安全组
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroup", CreateSecurityGroupResponse.class);
    }

    /**
     *<p>本接口（CreateSecurityGroupPolicies）用于创建安全组规则（SecurityGroupPolicy）。</p>
<p>在 SecurityGroupPolicySet 参数中：</p>
<ul>
<li>Version 安全组规则版本号，用户每次更新安全规则版本会自动加1，防止您更新的路由规则已过期，不填不考虑冲突。</li>
<li>在创建出站和入站规则（Egress 和 Ingress）时：<ul>
<li>Protocol 字段支持输入TCP, UDP, ICMP, GRE, ALL。</li>
<li>CidrBlock 字段允许输入符合cidr格式标准的任意字符串。在基础网络中，如果 CidrBlock 包含您的账户内的云服务器之外的设备在腾讯云的内网 IP，并不代表此规则允许您访问这些设备，租户之间网络隔离规则优先于安全组中的内网规则。</li>
<li>SecurityGroupId 字段允许输入与待修改的安全组位于相同项目中的安全组 ID，包括这个安全组 ID 本身，代表安全组下所有云服务器的内网 IP。使用这个字段时，这条规则用来匹配网络报文的过程中会随着被使用的这个 ID 所关联的云服务器变化而变化，不需要重新修改。</li>
<li>Port 字段允许输入一个单独端口号，或者用减号分隔的两个端口号代表端口范围，例如80或8000-8010。只有当 Protocol 字段是 TCP 或 UDP 时，Port 字段才被接受，即 Protocol 字段不是 TCP 或 UDP 时，Protocol 和 Port 排他关系，不允许同时输入，否则会接口报错。</li>
<li>Action 字段只允许输入 ACCEPT 或 DROP。</li>
<li>CidrBlock, SecurityGroupId, AddressTemplate 是排他关系，不允许同时输入，Protocol + Port 和 ServiceTemplate 二者是排他关系，不允许同时输入。</li>
<li>一次请求中只能创建单个方向的规则, 如果需要指定索引（PolicyIndex）参数, 多条规则的索引必须一致。</li>
</ul></li></ul>
<p>默认接口请求频率限制：20次/秒。</p>
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupPolicies", CreateSecurityGroupPoliciesResponse.class);
    }

    /**
     *创建子网，若创建成功，则此子网会成为此可用区的默认子网。
     * @param req CreateSubnetRequest
     * @return CreateSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubnet", CreateSubnetResponse.class);
    }

    /**
     *创建私有网络
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpc", CreateVpcResponse.class);
    }

    /**
     *用于删除高可用虚拟IP（HAVIP）
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHaVip", DeleteHaVipResponse.class);
    }

    /**
     *删除镜像
     * @param req DeleteImageRequest
     * @return DeleteImageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageResponse DeleteImage(DeleteImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImage", DeleteImageResponse.class);
    }

    /**
     *删除负载均衡监听器。
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *删除负载均衡实例。
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *删除负载均衡多个监听器
     * @param req DeleteLoadBalancerListenersRequest
     * @return DeleteLoadBalancerListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerListenersResponse DeleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancerListeners", DeleteLoadBalancerListenersResponse.class);
    }

    /**
     *删除业务模块
     * @param req DeleteModuleRequest
     * @return DeleteModuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModuleResponse DeleteModule(DeleteModuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModule", DeleteModuleResponse.class);
    }

    /**
     *删除弹性网卡
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNetworkInterface", DeleteNetworkInterfaceResponse.class);
    }

    /**
     *删除路由表
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRouteTable", DeleteRouteTableResponse.class);
    }

    /**
     *对某个路由表批量删除路由策略
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoutes", DeleteRoutesResponse.class);
    }

    /**
     *只有当前账号下的安全组允许被删除。
安全组实例ID如果在其他安全组的规则中被引用，则无法直接删除。这种情况下，需要先进行规则修改，再删除安全组。
删除的安全组无法再找回，请谨慎调用。
     * @param req DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupResponse DeleteSecurityGroup(DeleteSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroup", DeleteSecurityGroupResponse.class);
    }

    /**
     *SecurityGroupPolicySet.Version 用于指定要操作的安全组的版本。传入 Version 版本号若不等于当前安全组的最新版本，将返回失败；若不传 Version 则直接删除指定PolicyIndex的规则。
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroupPolicies", DeleteSecurityGroupPoliciesResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（DeleteSnapshots）用于删除快照。

* 快照必须处于NORMAL状态，快照状态可以通过[DescribeSnapshots](/document/product/362/15647)接口查询，见输出参数中SnapshotState字段解释。
* 支持批量操作。如果多个快照存在无法删除的快照，则操作不执行，以返回特定的错误码返回。
     * @param req DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotsResponse DeleteSnapshots(DeleteSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSnapshots", DeleteSnapshotsResponse.class);
    }

    /**
     *删除子网，若子网为可用区下的默认子网，则默认子网会回退到系统自动创建的默认子网，非用户最新创建的子网。若默认子网不满足需求，可调用设置默认子网接口设置。
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubnet", DeleteSubnetResponse.class);
    }

    /**
     *删除私有网络
     * @param req DeleteVpcRequest
     * @return DeleteVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcResponse DeleteVpc(DeleteVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpc", DeleteVpcResponse.class);
    }

    /**
     *查询您账户的弹性公网IP（简称 EIP）在当前地域的配额信息
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressQuota", DescribeAddressQuotaResponse.class);
    }

    /**
     *查询弹性公网IP列表
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddresses", DescribeAddressesResponse.class);
    }

    /**
     *获取概览页统计的基本数据
     * @param req DescribeBaseOverviewRequest
     * @return DescribeBaseOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaseOverviewResponse DescribeBaseOverview(DescribeBaseOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaseOverview", DescribeBaseOverviewResponse.class);
    }

    /**
     *获取带宽硬盘等数据的限制
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfig", DescribeConfigResponse.class);
    }

    /**
     *查询导入镜像任务
     * @param req DescribeCustomImageTaskRequest
     * @return DescribeCustomImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomImageTaskResponse DescribeCustomImageTask(DescribeCustomImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomImageTask", DescribeCustomImageTaskResponse.class);
    }

    /**
     *查询可用区的默认子网
     * @param req DescribeDefaultSubnetRequest
     * @return DescribeDefaultSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultSubnetResponse DescribeDefaultSubnet(DescribeDefaultSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultSubnet", DescribeDefaultSubnetResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（DescribeDisks）用于查询云硬盘列表。

* 可以根据云硬盘ID、云硬盘类型或者云硬盘状态等信息来查询云硬盘的详细信息，不同条件之间为与(AND)的关系，过滤信息详细请见过滤器`Filter`。
* 如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的云硬盘列表。
     * @param req DescribeDisksRequest
     * @return DescribeDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDisksResponse DescribeDisks(DescribeDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDisks", DescribeDisksResponse.class);
    }

    /**
     *用于查询高可用虚拟IP（HAVIP）列表。
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHaVips", DescribeHaVipsResponse.class);
    }

    /**
     *展示镜像列表
     * @param req DescribeImageRequest
     * @return DescribeImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageResponse DescribeImage(DescribeImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImage", DescribeImageResponse.class);
    }

    /**
     *查询外部导入镜像支持的OS列表
     * @param req DescribeImportImageOsRequest
     * @return DescribeImportImageOsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImportImageOsResponse DescribeImportImageOs(DescribeImportImageOsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImportImageOs", DescribeImportImageOsResponse.class);
    }

    /**
     *获取机型配置列表
     * @param req DescribeInstanceTypeConfigRequest
     * @return DescribeInstanceTypeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypeConfigResponse DescribeInstanceTypeConfig(DescribeInstanceTypeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTypeConfig", DescribeInstanceTypeConfigResponse.class);
    }

    /**
     *查询实例管理终端地址
     * @param req DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceVncUrlResponse DescribeInstanceVncUrl(DescribeInstanceVncUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceVncUrl", DescribeInstanceVncUrlResponse.class);
    }

    /**
     *获取实例的相关信息。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *通过实例id获取当前禁止的操作
     * @param req DescribeInstancesDeniedActionsRequest
     * @return DescribeInstancesDeniedActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDeniedActionsResponse DescribeInstancesDeniedActions(DescribeInstancesDeniedActionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDeniedActions", DescribeInstancesDeniedActionsResponse.class);
    }

    /**
     *查询负载均衡的监听器列表。
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *查询负载均衡相关的任务状态
     * @param req DescribeLoadBalanceTaskStatusRequest
     * @return DescribeLoadBalanceTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalanceTaskStatusResponse DescribeLoadBalanceTaskStatus(DescribeLoadBalanceTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalanceTaskStatus", DescribeLoadBalanceTaskStatusResponse.class);
    }

    /**
     *查询负载均衡实例列表。
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *获取模块列表
     * @param req DescribeModuleRequest
     * @return DescribeModuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleResponse DescribeModule(DescribeModuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModule", DescribeModuleResponse.class);
    }

    /**
     *展示模块详细信息
     * @param req DescribeModuleDetailRequest
     * @return DescribeModuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModuleDetailResponse DescribeModuleDetail(DescribeModuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModuleDetail", DescribeModuleDetailResponse.class);
    }

    /**
     *获取客户节点上的出入带宽月峰和计费带宽信息
     * @param req DescribeMonthPeakNetworkRequest
     * @return DescribeMonthPeakNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonthPeakNetworkResponse DescribeMonthPeakNetwork(DescribeMonthPeakNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonthPeakNetwork", DescribeMonthPeakNetworkResponse.class);
    }

    /**
     *查询弹性网卡列表
     * @param req DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetworkInterfaces", DescribeNetworkInterfacesResponse.class);
    }

    /**
     *获取节点列表
     * @param req DescribeNodeRequest
     * @return DescribeNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeResponse DescribeNode(DescribeNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNode", DescribeNodeResponse.class);
    }

    /**
     *使用本接口获取某种机型在某些区域的装箱配额（当使用虚拟机型时，返回的是一组相互关联的装箱配额）。
     * @param req DescribePackingQuotaGroupRequest
     * @return DescribePackingQuotaGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackingQuotaGroupResponse DescribePackingQuotaGroup(DescribePackingQuotaGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackingQuotaGroup", DescribePackingQuotaGroupResponse.class);
    }

    /**
     *CPU 内存 硬盘等基础信息峰值数据
     * @param req DescribePeakBaseOverviewRequest
     * @return DescribePeakBaseOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakBaseOverviewResponse DescribePeakBaseOverview(DescribePeakBaseOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakBaseOverview", DescribePeakBaseOverviewResponse.class);
    }

    /**
     *获取网络峰值数据
     * @param req DescribePeakNetworkOverviewRequest
     * @return DescribePeakNetworkOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakNetworkOverviewResponse DescribePeakNetworkOverview(DescribePeakNetworkOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePeakNetworkOverview", DescribePeakNetworkOverviewResponse.class);
    }

    /**
     *查询实例价格
     * @param req DescribePriceRunInstanceRequest
     * @return DescribePriceRunInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePriceRunInstanceResponse DescribePriceRunInstance(DescribePriceRunInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePriceRunInstance", DescribePriceRunInstanceResponse.class);
    }

    /**
     *该接口（DescribeRegionIpv6Addresses）用于查询ECM地域之下的IPV6地址信息。
     * @param req DescribeRegionIpv6AddressesRequest
     * @return DescribeRegionIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionIpv6AddressesResponse DescribeRegionIpv6Addresses(DescribeRegionIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegionIpv6Addresses", DescribeRegionIpv6AddressesResponse.class);
    }

    /**
     *查询自定义路由策略与云联网路由策略冲突列表
     * @param req DescribeRouteConflictsRequest
     * @return DescribeRouteConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteConflictsResponse DescribeRouteConflicts(DescribeRouteConflictsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteConflicts", DescribeRouteConflictsResponse.class);
    }

    /**
     *查询路由表对象列表
     * @param req DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTablesResponse DescribeRouteTables(DescribeRouteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteTables", DescribeRouteTablesResponse.class);
    }

    /**
     *查询安全组关联实例统计
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics", DescribeSecurityGroupAssociationStatisticsResponse.class);
    }

    /**
     *查询用户安全组配额
     * @param req DescribeSecurityGroupLimitsRequest
     * @return DescribeSecurityGroupLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupLimitsResponse DescribeSecurityGroupLimits(DescribeSecurityGroupLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupLimits", DescribeSecurityGroupLimitsResponse.class);
    }

    /**
     *查询安全组规则
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupPolicies", DescribeSecurityGroupPoliciesResponse.class);
    }

    /**
     *查看安全组
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroups", DescribeSecurityGroupsResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（DescribeSnapshots）用于查询快照的详细信息。

* 根据快照ID、创建快照的云硬盘ID、创建快照的云硬盘类型等对结果进行过滤，不同条件之间为与(AND)的关系，过滤信息详细请见过滤器`Filter`。
*  如果参数为空，返回当前用户一定数量（`Limit`所指定的数量，默认为20）的快照列表。
     * @param req DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotsResponse DescribeSnapshots(DescribeSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSnapshots", DescribeSnapshotsResponse.class);
    }

    /**
     *查询子网列表
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnets", DescribeSubnetsResponse.class);
    }

    /**
     *获取负载均衡后端服务的健康检查状态。
     * @param req DescribeTargetHealthRequest
     * @return DescribeTargetHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetHealthResponse DescribeTargetHealth(DescribeTargetHealthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetHealth", DescribeTargetHealthResponse.class);
    }

    /**
     *查询负载均衡绑定的后端服务列表。
     * @param req DescribeTargetsRequest
     * @return DescribeTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetsResponse DescribeTargets(DescribeTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargets", DescribeTargetsResponse.class);
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
     *本接口(DescribeTaskStatus)用于获取异步任务状态
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *查询私有网络列表
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcs", DescribeVpcsResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（DetachDisks）用于卸载云硬盘。

* 支持批量操作，卸载挂载在同一主机上的多块云盘。如果多块云盘中存在不允许卸载的云盘，则操作不执行，返回特定的错误码。
* 本接口为异步接口，当请求成功返回时，云盘并未立即从主机卸载，可通过接口[DescribeDisks](/document/product/362/16315)来查询对应云盘的状态，如果云盘的状态由“ATTACHED”变为“UNATTACHED”，则为卸载成功。
     * @param req DetachDisksRequest
     * @return DetachDisksResponse
     * @throws TencentCloudSDKException
     */
    public DetachDisksResponse DetachDisks(DetachDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachDisks", DetachDisksResponse.class);
    }

    /**
     *弹性网卡解绑云主机
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetachNetworkInterface", DetachNetworkInterfaceResponse.class);
    }

    /**
     *禁用已启用的子网路由
     * @param req DisableRoutesRequest
     * @return DisableRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableRoutesResponse DisableRoutes(DisableRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableRoutes", DisableRoutesResponse.class);
    }

    /**
     *解绑弹性公网IP（简称 EIP）
只有状态为 BIND 和 BIND_ENI 的 EIP 才能进行解绑定操作。
EIP 如果被封堵，则不能进行解绑定操作。
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateAddress", DisassociateAddressResponse.class);
    }

    /**
     *用于解除实例的密钥绑定关系。
     * @param req DisassociateInstancesKeyPairsRequest
     * @return DisassociateInstancesKeyPairsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateInstancesKeyPairsResponse DisassociateInstancesKeyPairs(DisassociateInstancesKeyPairsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateInstancesKeyPairs", DisassociateInstancesKeyPairsResponse.class);
    }

    /**
     *解绑安全组
     * @param req DisassociateSecurityGroupsRequest
     * @return DisassociateSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateSecurityGroupsResponse DisassociateSecurityGroups(DisassociateSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateSecurityGroups", DisassociateSecurityGroupsResponse.class);
    }

    /**
     *启用已禁用的子网路由。
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
     *导入自定义镜像，支持 RAW、VHD、QCOW2、VMDK 镜像格式
     * @param req ImportCustomImageRequest
     * @return ImportCustomImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportCustomImageResponse ImportCustomImage(ImportCustomImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportCustomImage", ImportCustomImageResponse.class);
    }

    /**
     *从CVM产品导入镜像到ECM
     * @param req ImportImageRequest
     * @return ImportImageResponse
     * @throws TencentCloudSDKException
     */
    public ImportImageResponse ImportImage(ImportImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportImage", ImportImageResponse.class);
    }

    /**
     *弹性网卡迁移
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigrateNetworkInterface", MigrateNetworkInterfaceResponse.class);
    }

    /**
     *弹性网卡内网IP迁移。
该接口用于将一个内网IP从一个弹性网卡上迁移到另外一个弹性网卡，主IP地址不支持迁移。
迁移前后的弹性网卡必须在同一个子网内。
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MigratePrivateIpAddress", MigratePrivateIpAddressResponse.class);
    }

    /**
     *修改弹性公网IP属性
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressAttribute", ModifyAddressAttributeResponse.class);
    }

    /**
     *调整弹性公网IP带宽
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressesBandwidth", ModifyAddressesBandwidthResponse.class);
    }

    /**
     *修改在一个可用区下创建实例时使用的默认子网（创建实例时，未填写VPC参数时使用的sunbetId）
     * @param req ModifyDefaultSubnetRequest
     * @return ModifyDefaultSubnetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultSubnetResponse ModifyDefaultSubnet(ModifyDefaultSubnetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDefaultSubnet", ModifyDefaultSubnetResponse.class);
    }

    /**
     *用于修改高可用虚拟IP（HAVIP）属性
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHaVipAttribute", ModifyHaVipAttributeResponse.class);
    }

    /**
     *本接口（ModifyImageAttribute）用于修改镜像属性。
     * @param req ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageAttributeResponse ModifyImageAttribute(ModifyImageAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyImageAttribute", ModifyImageAttributeResponse.class);
    }

    /**
     *修改实例的属性。
     * @param req ModifyInstancesAttributeRequest
     * @return ModifyInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancesAttributeResponse ModifyInstancesAttribute(ModifyInstancesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancesAttribute", ModifyInstancesAttributeResponse.class);
    }

    /**
     *本接口（ModifyIpv6AddressesAttribute）用于修改弹性网卡IPv6地址属性。
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpv6AddressesAttribute", ModifyIpv6AddressesAttributeResponse.class);
    }

    /**
     *该接口(ModifyIpv6AddressesBandwidth)用于修改IPV6地址访问internet的带宽
     * @param req ModifyIpv6AddressesBandwidthRequest
     * @return ModifyIpv6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesBandwidthResponse ModifyIpv6AddressesBandwidth(ModifyIpv6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpv6AddressesBandwidth", ModifyIpv6AddressesBandwidthResponse.class);
    }

    /**
     *修改负载均衡监听器属性。
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListener", ModifyListenerResponse.class);
    }

    /**
     *修改负载均衡实例的属性。
     * @param req ModifyLoadBalancerAttributesRequest
     * @return ModifyLoadBalancerAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerAttributes", ModifyLoadBalancerAttributesResponse.class);
    }

    /**
     *修改模块配置，已关联实例的模块不支持调整配置。
     * @param req ModifyModuleConfigRequest
     * @return ModifyModuleConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleConfigResponse ModifyModuleConfig(ModifyModuleConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleConfig", ModifyModuleConfigResponse.class);
    }

    /**
     *修改模块是否禁止分配外网ip的属性。
     * @param req ModifyModuleDisableWanIpRequest
     * @return ModifyModuleDisableWanIpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleDisableWanIpResponse ModifyModuleDisableWanIp(ModifyModuleDisableWanIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleDisableWanIp", ModifyModuleDisableWanIpResponse.class);
    }

    /**
     *修改模块的默认镜像
     * @param req ModifyModuleImageRequest
     * @return ModifyModuleImageResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleImageResponse ModifyModuleImage(ModifyModuleImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleImage", ModifyModuleImageResponse.class);
    }

    /**
     *修改模块IP直通。
     * @param req ModifyModuleIpDirectRequest
     * @return ModifyModuleIpDirectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleIpDirectResponse ModifyModuleIpDirect(ModifyModuleIpDirectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleIpDirect", ModifyModuleIpDirectResponse.class);
    }

    /**
     *修改模块名称
     * @param req ModifyModuleNameRequest
     * @return ModifyModuleNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleNameResponse ModifyModuleName(ModifyModuleNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleName", ModifyModuleNameResponse.class);
    }

    /**
     *修改模块默认带宽上限
     * @param req ModifyModuleNetworkRequest
     * @return ModifyModuleNetworkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleNetworkResponse ModifyModuleNetwork(ModifyModuleNetworkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleNetwork", ModifyModuleNetworkResponse.class);
    }

    /**
     *修改模块默认安全组
     * @param req ModifyModuleSecurityGroupsRequest
     * @return ModifyModuleSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleSecurityGroupsResponse ModifyModuleSecurityGroups(ModifyModuleSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModuleSecurityGroups", ModifyModuleSecurityGroupsResponse.class);
    }

    /**
     *用于修改弹性网卡内网IP属性。
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateIpAddressesAttribute", ModifyPrivateIpAddressesAttributeResponse.class);
    }

    /**
     *修改路由表属性
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRouteTableAttribute", ModifyRouteTableAttributeResponse.class);
    }

    /**
     *修改安全组属性
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupAttribute", ModifySecurityGroupAttributeResponse.class);
    }

    /**
     *修改安全组出站和入站规则
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupPolicies", ModifySecurityGroupPoliciesResponse.class);
    }

    /**
     *修改子网属性
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySubnetAttribute", ModifySubnetAttributeResponse.class);
    }

    /**
     *修改监听器绑定的后端机器的端口。
     * @param req ModifyTargetPortRequest
     * @return ModifyTargetPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetPortResponse ModifyTargetPort(ModifyTargetPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetPort", ModifyTargetPortResponse.class);
    }

    /**
     *修改监听器绑定的后端机器的转发权重。
     * @param req ModifyTargetWeightRequest
     * @return ModifyTargetWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetWeightResponse ModifyTargetWeight(ModifyTargetWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetWeight", ModifyTargetWeightResponse.class);
    }

    /**
     *修改私有网络（VPC）的相关属性
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcAttribute", ModifyVpcAttributeResponse.class);
    }

    /**
     *查询私有网络下Vpc、子网、havip等异步任务请求结果
     * @param req QueryVpcTaskResultRequest
     * @return QueryVpcTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public QueryVpcTaskResultResponse QueryVpcTaskResult(QueryVpcTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryVpcTaskResult", QueryVpcTaskResultResponse.class);
    }

    /**
     *只有状态为RUNNING的实例才可以进行此操作；接口调用成功时，实例会进入REBOOTING状态；重启实例成功时，实例会进入RUNNING状态；支持强制重启，强制重启的效果等同于关闭物理计算机的电源开关再重新启动。强制重启可能会导致数据丢失或文件系统损坏，请仅在服务器不能正常重启时使用。
     * @param req RebootInstancesRequest
     * @return RebootInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RebootInstancesResponse RebootInstances(RebootInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RebootInstances", RebootInstancesResponse.class);
    }

    /**
     *释放一个或多个弹性公网IP（简称 EIP）。
该操作不可逆，释放后 EIP 关联的 IP 地址将不再属于您的名下。
只有状态为 UNBIND 的 EIP 才能进行释放操作。
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseAddresses", ReleaseAddressesResponse.class);
    }

    /**
     *本接口（UnassignIpv6Addresses）用于释放弹性网卡IPv6地址。
     * @param req ReleaseIpv6AddressesRequest
     * @return ReleaseIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIpv6AddressesResponse ReleaseIpv6Addresses(ReleaseIpv6AddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseIpv6Addresses", ReleaseIpv6AddressesResponse.class);
    }

    /**
     *该接口用于给弹性公网IPv6地址释放带宽。
     * @param req ReleaseIpv6AddressesBandwidthRequest
     * @return ReleaseIpv6AddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseIpv6AddressesBandwidthResponse ReleaseIpv6AddressesBandwidth(ReleaseIpv6AddressesBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseIpv6AddressesBandwidth", ReleaseIpv6AddressesBandwidthResponse.class);
    }

    /**
     *弹性网卡退还内网 IP。
退还弹性网卡上的辅助内网IP，接口自动解关联弹性公网 IP。不能退还弹性网卡的主内网IP。
     * @param req RemovePrivateIpAddressesRequest
     * @return RemovePrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public RemovePrivateIpAddressesResponse RemovePrivateIpAddresses(RemovePrivateIpAddressesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemovePrivateIpAddresses", RemovePrivateIpAddressesResponse.class);
    }

    /**
     *修改子网关联的路由表，一个子网只能关联一个路由表。
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceRouteTableAssociation", ReplaceRouteTableAssociationResponse.class);
    }

    /**
     *替换路由策略
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceRoutes", ReplaceRoutesResponse.class);
    }

    /**
     *替换单条安全组路由规则, 单个请求中只能替换单个方向的一条规则, 必须要指定索引（PolicyIndex）。
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceSecurityGroupPolicy", ReplaceSecurityGroupPolicyResponse.class);
    }

    /**
     *重装实例，若指定了ImageId参数，则使用指定的镜像重装；否则按照当前实例使用的镜像进行重装；若未指定密码，则密码通过站内信形式随后发送。
     * @param req ResetInstancesRequest
     * @return ResetInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesResponse ResetInstances(ResetInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstances", ResetInstancesResponse.class);
    }

    /**
     *重置实例的最大带宽上限。
     * @param req ResetInstancesMaxBandwidthRequest
     * @return ResetInstancesMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesMaxBandwidthResponse ResetInstancesMaxBandwidth(ResetInstancesMaxBandwidthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesMaxBandwidth", ResetInstancesMaxBandwidthResponse.class);
    }

    /**
     *重置处于运行中状态的实例的密码，需要显式指定强制关机参数ForceStop。如果没有显式指定强制关机参数，则只有处于关机状态的实例才允许执行重置密码操作。
     * @param req ResetInstancesPasswordRequest
     * @return ResetInstancesPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetInstancesPasswordResponse ResetInstancesPassword(ResetInstancesPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetInstancesPassword", ResetInstancesPasswordResponse.class);
    }

    /**
     *对某个路由表名称和所有路由策略（Route）进行重新设置
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetRoutes", ResetRoutesResponse.class);
    }

    /**
     *创建ECM实例。
     * @param req RunInstancesRequest
     * @return RunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RunInstancesResponse RunInstances(RunInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunInstances", RunInstancesResponse.class);
    }

    /**
     *设置负载均衡实例的安全组。
     * @param req SetLoadBalancerSecurityGroupsRequest
     * @return SetLoadBalancerSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public SetLoadBalancerSecurityGroupsResponse SetLoadBalancerSecurityGroups(SetLoadBalancerSecurityGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetLoadBalancerSecurityGroups", SetLoadBalancerSecurityGroupsResponse.class);
    }

    /**
     *绑定或解绑一个安全组到多个负载均衡实例。
     * @param req SetSecurityGroupForLoadbalancersRequest
     * @return SetSecurityGroupForLoadbalancersResponse
     * @throws TencentCloudSDKException
     */
    public SetSecurityGroupForLoadbalancersResponse SetSecurityGroupForLoadbalancers(SetSecurityGroupForLoadbalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetSecurityGroupForLoadbalancers", SetSecurityGroupForLoadbalancersResponse.class);
    }

    /**
     *只有状态为STOPPED的实例才可以进行此操作；接口调用成功时，实例会进入STARTING状态；启动实例成功时，实例会进入RUNNING状态。
     * @param req StartInstancesRequest
     * @return StartInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StartInstancesResponse StartInstances(StartInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartInstances", StartInstancesResponse.class);
    }

    /**
     *只有处于"RUNNING"状态的实例才能够进行关机操作；
调用成功时，实例会进入STOPPING状态；关闭实例成功时，实例会进入STOPPED状态；
支持强制关闭，强制关机的效果等同于关闭物理计算机的电源开关，强制关机可能会导致数据丢失或文件系统损坏，请仅在服务器不能正常关机时使用。
     * @param req StopInstancesRequest
     * @return StopInstancesResponse
     * @throws TencentCloudSDKException
     */
    public StopInstancesResponse StopInstances(StopInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopInstances", StopInstancesResponse.class);
    }

    /**
     *CBS在ECM早已下线

本接口（TerminateDisks）用于退还云硬盘。

* 不再使用的云盘，可通过本接口主动退还。
* 本接口支持退还预付费云盘和按小时后付费云盘。按小时后付费云盘可直接退还，预付费云盘需符合退还规则。
* 支持批量操作，每次请求批量云硬盘的上限为50。如果批量云盘存在不允许操作的，请求会以特定错误码返回。
     * @param req TerminateDisksRequest
     * @return TerminateDisksResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDisksResponse TerminateDisks(TerminateDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDisks", TerminateDisksResponse.class);
    }

    /**
     *销毁实例
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

    /**
     *本接口（UnassignIpv6SubnetCidrBlock）用于释放IPv6子网段。
子网段如果还有IP占用且未回收，则子网段无法释放。
     * @param req UnassignIpv6SubnetCidrBlockRequest
     * @return UnassignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6SubnetCidrBlockResponse UnassignIpv6SubnetCidrBlock(UnassignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnassignIpv6SubnetCidrBlock", UnassignIpv6SubnetCidrBlockResponse.class);
    }

}
