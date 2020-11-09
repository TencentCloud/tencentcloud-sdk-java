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
package com.tencentcloudapi.bmvpc.v20180625;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bmvpc.v20180625.models.*;

public class BmvpcClient extends AbstractClient{
    private static String endpoint = "bmvpc.tencentcloudapi.com";
    private static String service = "bmvpc";
    private static String version = "2018-06-25";

    public BmvpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmvpcClient(Credential credential, String region, ClientProfile profile) {
        super(BmvpcClient.endpoint, BmvpcClient.version, credential, region, profile);
    }

    /**
     *接受黑石对等连接
     * @param req AcceptVpcPeerConnectionRequest
     * @return AcceptVpcPeerConnectionResponse
     * @throws TencentCloudSDKException
     */
    public AcceptVpcPeerConnectionResponse AcceptVpcPeerConnection(AcceptVpcPeerConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptVpcPeerConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptVpcPeerConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcceptVpcPeerConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量注册虚拟IP，异步接口。通过接口来查询任务进度。每次请求最多注册256个IP
     * @param req AsyncRegisterIpsRequest
     * @return AsyncRegisterIpsResponse
     * @throws TencentCloudSDKException
     */
    public AsyncRegisterIpsResponse AsyncRegisterIps(AsyncRegisterIpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AsyncRegisterIpsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AsyncRegisterIpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AsyncRegisterIps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *NAT网关绑定EIP接口，可将EIP绑定到NAT网关，该EIP作为访问外网的源IP地址，将流量发送到Internet
     * @param req BindEipsToNatGatewayRequest
     * @return BindEipsToNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public BindEipsToNatGatewayResponse BindEipsToNatGateway(BindEipsToNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEipsToNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindEipsToNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindEipsToNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可用于将子网的部分IP绑定到NAT网关
     * @param req BindIpsToNatGatewayRequest
     * @return BindIpsToNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public BindIpsToNatGatewayResponse BindIpsToNatGateway(BindIpsToNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindIpsToNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindIpsToNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindIpsToNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *NAT网关绑定子网后，该子网内全部IP可出公网
     * @param req BindSubnetsToNatGatewayRequest
     * @return BindSubnetsToNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public BindSubnetsToNatGatewayResponse BindSubnetsToNatGateway(BindSubnetsToNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindSubnetsToNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindSubnetsToNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindSubnetsToNatGateway");
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
     *创建黑石Docker子网， 如果不指定VlanId，将会分配2000--2999范围的VlanId; 子网会关闭分布式网关
     * @param req CreateDockerSubnetWithVlanRequest
     * @return CreateDockerSubnetWithVlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateDockerSubnetWithVlanResponse CreateDockerSubnetWithVlan(CreateDockerSubnetWithVlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDockerSubnetWithVlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDockerSubnetWithVlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDockerSubnetWithVlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateHostedInterface）用于黑石托管机器加入带VLANID不为5的子网。

1) 不能加入vlanId 为5的子网，只能加入VLANID范围为2000-2999的子网。
2) 每台托管机器最多可以加入20个子网。
3) 每次调用最多能支持传入10台托管机器。
     * @param req CreateHostedInterfaceRequest
     * @return CreateHostedInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostedInterfaceResponse CreateHostedInterface(CreateHostedInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHostedInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHostedInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHostedInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *物理机加入子网
     * @param req CreateInterfacesRequest
     * @return CreateInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInterfacesResponse CreateInterfaces(CreateInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInterfacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建NAT网关接口，可针对网段方式、子网全部IP、子网部分IP这三种方式创建NAT网关
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
     *创建黑石路由表的路由规则
     * @param req CreateRoutePoliciesRequest
     * @return CreateRoutePoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutePoliciesResponse CreateRoutePolicies(CreateRoutePoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoutePoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoutePoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRoutePolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石私有网络的子网
访问管理: 用户可以对VpcId进行授权操作。例如设置资源为["qcs::bmvpc:::unVpc/vpc-xxxxx"]
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
     *创建黑石虚拟子网， 虚拟子网用于在黑石上创建虚拟网络，与黑石子网要做好规划。虚拟子网会分配2000-2999的VlanId。
     * @param req CreateVirtualSubnetWithVlanRequest
     * @return CreateVirtualSubnetWithVlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateVirtualSubnetWithVlanResponse CreateVirtualSubnetWithVlan(CreateVirtualSubnetWithVlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVirtualSubnetWithVlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVirtualSubnetWithVlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVirtualSubnetWithVlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石私有网络
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
     *创建对等连接
     * @param req CreateVpcPeerConnectionRequest
     * @return CreateVpcPeerConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcPeerConnectionResponse CreateVpcPeerConnection(CreateVpcPeerConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcPeerConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpcPeerConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVpcPeerConnection");
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
     *本接口用于托管机器从VLANID不为5的子网中移除。
1) 不能从vlanId 为5的子网中移除。
2) 每次调用最多能支持传入10台物理机。
     * @param req DeleteHostedInterfaceRequest
     * @return DeleteHostedInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHostedInterfaceResponse DeleteHostedInterface(DeleteHostedInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHostedInterfaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHostedInterfaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteHostedInterface");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *托管机器移除子网批量接口，传入一台托管机器和多个子网，批量移除这些子网。异步接口，接口返回TaskId。
     * @param req DeleteHostedInterfacesRequest
     * @return DeleteHostedInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHostedInterfacesResponse DeleteHostedInterfaces(DeleteHostedInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHostedInterfacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHostedInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteHostedInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *物理机移除子网批量接口，传入一台物理机和多个子网，批量移除这些子网。异步接口，接口返回TaskId。
     * @param req DeleteInterfacesRequest
     * @return DeleteInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInterfacesResponse DeleteInterfaces(DeleteInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInterfacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除NAT网关
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
     *删除黑石路由表路由规则
     * @param req DeleteRoutePolicyRequest
     * @return DeleteRoutePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutePolicyResponse DeleteRoutePolicy(DeleteRoutePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoutePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoutePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoutePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSubnet）用于删除黑石私有网络子网。
删除子网前，请清理该子网下所有资源，包括物理机、负载均衡、黑石数据库、弹性IP、NAT网关等资源
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
     *退还虚拟IP。此接口只能退还虚拟IP，物理机IP不能退还。
     * @param req DeleteVirtualIpRequest
     * @return DeleteVirtualIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVirtualIpResponse DeleteVirtualIp(DeleteVirtualIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVirtualIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVirtualIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVirtualIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteVpc)用于删除黑石私有网络(VPC)。

删除私有网络前，请清理该私有网络下所有资源，包括子网、负载均衡、弹性 IP、对等连接、NAT 网关、专线通道、SSLVPN 等资源。
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
     *删除黑石对等连接
     * @param req DeleteVpcPeerConnectionRequest
     * @return DeleteVpcPeerConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcPeerConnectionResponse DeleteVpcPeerConnection(DeleteVpcPeerConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcPeerConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcPeerConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpcPeerConnection");
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
     *本接口（DeleteVpnGateway）用于删除VPN网关。
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
     *注销私有网络IP为空闲
     * @param req DeregisterIpsRequest
     * @return DeregisterIpsResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterIpsResponse DeregisterIps(DeregisterIpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeregisterIpsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeregisterIpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeregisterIps");
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
     *获取NAT网关信息，包括NAT网关 ID、网关名称、私有网络、网关并发连接上限、绑定EIP列表等
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
     *可获取NAT网关绑定的子网信息
     * @param req DescribeNatSubnetsRequest
     * @return DescribeNatSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatSubnetsResponse DescribeNatSubnets(DescribeNatSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRoutePolicies）用于查询路由表条目。
     * @param req DescribeRoutePoliciesRequest
     * @return DescribeRoutePoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoutePoliciesResponse DescribeRoutePolicies(DescribeRoutePoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoutePoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoutePoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoutePolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeRouteTables）用于查询路由表。
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
     *获取子网内可用IP列表
     * @param req DescribeSubnetAvailableIpsRequest
     * @return DescribeSubnetAvailableIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetAvailableIpsResponse DescribeSubnetAvailableIps(DescribeSubnetAvailableIpsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetAvailableIpsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetAvailableIpsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnetAvailableIps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *物理机可以加入物理机子网，虚拟子网，DOCKER子网，通过此接口可以查询物理机加入的子网。
     * @param req DescribeSubnetByDeviceRequest
     * @return DescribeSubnetByDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetByDeviceResponse DescribeSubnetByDevice(DescribeSubnetByDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetByDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetByDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnetByDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *托管可以加入物理机子网，虚拟子网，DOCKER子网，通过此接口可以查询托管加入的子网。
     * @param req DescribeSubnetByHostedDeviceRequest
     * @return DescribeSubnetByHostedDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetByHostedDeviceResponse DescribeSubnetByHostedDevice(DescribeSubnetByHostedDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetByHostedDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetByHostedDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnetByHostedDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSubnets）用于查询黑石子网列表。
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
     *根据任务ID，获取任务的执行状态
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取对等连接列表
     * @param req DescribeVpcPeerConnectionsRequest
     * @return DescribeVpcPeerConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPeerConnectionsResponse DescribeVpcPeerConnections(DescribeVpcPeerConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcPeerConnectionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcPeerConnectionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcPeerConnections");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcQuota）用于查询用户VPC相关配额限制。
     * @param req DescribeVpcQuotaRequest
     * @return DescribeVpcQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcQuotaResponse DescribeVpcQuota(DescribeVpcQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询黑石私有网络关联资源
     * @param req DescribeVpcResourceRequest
     * @return DescribeVpcResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResourceResponse DescribeVpcResource(DescribeVpcResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcView）用于查询VPC网络拓扑视图。
     * @param req DescribeVpcViewRequest
     * @return DescribeVpcViewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcViewResponse DescribeVpcView(DescribeVpcViewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcViewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcViewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcView");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcs）用于查询私有网络列表。
本接口不传参数时，返回默认排序下的前20条VPC信息。
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
     *修改自定义路由
     * @param req ModifyRoutePolicyRequest
     * @return ModifyRoutePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoutePolicyResponse ModifyRoutePolicy(ModifyRoutePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoutePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoutePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRoutePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改路由表
     * @param req ModifyRouteTableRequest
     * @return ModifyRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableResponse ModifyRouteTable(ModifyRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改子网属性
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
     *修改子网DHCP Relay属性
     * @param req ModifySubnetDHCPRelayRequest
     * @return ModifySubnetDHCPRelayResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetDHCPRelayResponse ModifySubnetDHCPRelay(ModifySubnetDHCPRelayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubnetDHCPRelayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubnetDHCPRelayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubnetDHCPRelay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpcAttribute）用于修改VPC的标识名称和控制VPC的监控起停。
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
     *修改黑石对等连接
     * @param req ModifyVpcPeerConnectionRequest
     * @return ModifyVpcPeerConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcPeerConnectionResponse ModifyVpcPeerConnection(ModifyVpcPeerConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcPeerConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpcPeerConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVpcPeerConnection");
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
     *拒绝黑石对等连接申请
     * @param req RejectVpcPeerConnectionRequest
     * @return RejectVpcPeerConnectionResponse
     * @throws TencentCloudSDKException
     */
    public RejectVpcPeerConnectionResponse RejectVpcPeerConnection(RejectVpcPeerConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectVpcPeerConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RejectVpcPeerConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RejectVpcPeerConnection");
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
     *NAT网关解绑该EIP后，NAT网关将不会使用该EIP作为访问外网的源IP地址

     * @param req UnbindEipsFromNatGatewayRequest
     * @return UnbindEipsFromNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UnbindEipsFromNatGatewayResponse UnbindEipsFromNatGateway(UnbindEipsFromNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindEipsFromNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindEipsFromNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindEipsFromNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *NAT网关解绑IP接口，可将子网的部分IP从NAT网关中解绑
     * @param req UnbindIpsFromNatGatewayRequest
     * @return UnbindIpsFromNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UnbindIpsFromNatGatewayResponse UnbindIpsFromNatGateway(UnbindIpsFromNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindIpsFromNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindIpsFromNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindIpsFromNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *NAT网关解绑子网接口，可将子网解绑NAT网关
     * @param req UnbindSubnetsFromNatGatewayRequest
     * @return UnbindSubnetsFromNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UnbindSubnetsFromNatGatewayResponse UnbindSubnetsFromNatGateway(UnbindSubnetsFromNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindSubnetsFromNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindSubnetsFromNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindSubnetsFromNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级NAT网关接口，可NAT网关修改为小型NAT网关、中型NAT网关、以及大型NAT网关

     * @param req UpgradeNatGatewayRequest
     * @return UpgradeNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeNatGatewayResponse UpgradeNatGateway(UpgradeNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeNatGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeNatGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeNatGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
