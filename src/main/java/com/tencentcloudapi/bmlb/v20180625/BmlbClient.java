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
package com.tencentcloudapi.bmlb.v20180625;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bmlb.v20180625.models.*;

public class BmlbClient extends AbstractClient{
    private static String endpoint = "bmlb.tencentcloudapi.com";
    private static String service = "bmlb";
    private static String version = "2018-06-25";

    public BmlbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmlbClient(Credential credential, String region, ClientProfile profile) {
        super(BmlbClient.endpoint, BmlbClient.version, credential, region, profile);
    }

    /**
     *绑定黑石服务器到四层监听器。服务器包括物理服务器、虚拟机以及半托管机器。
     * @param req BindL4BackendsRequest
     * @return BindL4BackendsResponse
     * @throws TencentCloudSDKException
     */
    public BindL4BackendsResponse BindL4Backends(BindL4BackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindL4Backends", BindL4BackendsResponse.class);
    }

    /**
     *绑定黑石物理服务器或半托管服务器到七层转发路径。
     * @param req BindL7BackendsRequest
     * @return BindL7BackendsResponse
     * @throws TencentCloudSDKException
     */
    public BindL7BackendsResponse BindL7Backends(BindL7BackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindL7Backends", BindL7BackendsResponse.class);
    }

    /**
     *绑定黑石服务器七层监听器到流量镜像实例。
     * @param req BindTrafficMirrorListenersRequest
     * @return BindTrafficMirrorListenersResponse
     * @throws TencentCloudSDKException
     */
    public BindTrafficMirrorListenersResponse BindTrafficMirrorListeners(BindTrafficMirrorListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindTrafficMirrorListeners", BindTrafficMirrorListenersResponse.class);
    }

    /**
     *绑定黑石物理服务器成为流量镜像接收机。
     * @param req BindTrafficMirrorReceiversRequest
     * @return BindTrafficMirrorReceiversResponse
     * @throws TencentCloudSDKException
     */
    public BindTrafficMirrorReceiversResponse BindTrafficMirrorReceivers(BindTrafficMirrorReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindTrafficMirrorReceivers", BindTrafficMirrorReceiversResponse.class);
    }

    /**
     *创建黑石四层负载均衡监听器功能。黑石负载均衡四层监听器提供了转发用户请求的具体规则，包括端口、协议、会话保持、健康检查等参数。
     * @param req CreateL4ListenersRequest
     * @return CreateL4ListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ListenersResponse CreateL4Listeners(CreateL4ListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL4Listeners", CreateL4ListenersResponse.class);
    }

    /**
     *创建黑石负载均衡七层监听器功能。负载均衡七层监听器提供了转发用户请求的具体规则，包括端口、协议等参数。
     * @param req CreateL7ListenersRequest
     * @return CreateL7ListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7ListenersResponse CreateL7Listeners(CreateL7ListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL7Listeners", CreateL7ListenersResponse.class);
    }

    /**
     *创建黑石负载均衡七层转发规则。
     * @param req CreateL7RulesRequest
     * @return CreateL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesResponse CreateL7Rules(CreateL7RulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL7Rules", CreateL7RulesResponse.class);
    }

    /**
     *用来创建黑石负载均衡。为了使用黑石负载均衡服务，您必须要创建一个或者多个负载均衡实例。通过成功调用该接口，会返回负载均衡实例的唯一ID。用户可以购买的黑石负载均衡实例类型分为：公网类型、内网类型。公网类型负载均衡对应一个BGP VIP，可用于快速访问公网负载均衡绑定的物理服务器；内网类型负载均衡对应一个腾讯云内部的VIP，不能通过Internet访问，可快速访问内网负载均衡绑定的物理服务器。
     * @param req CreateLoadBalancersRequest
     * @return CreateLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancersResponse CreateLoadBalancers(CreateLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoadBalancers", CreateLoadBalancersResponse.class);
    }

    /**
     *创建流量镜像实例。
     * @param req CreateTrafficMirrorRequest
     * @return CreateTrafficMirrorResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrafficMirrorResponse CreateTrafficMirror(CreateTrafficMirrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrafficMirror", CreateTrafficMirrorResponse.class);
    }

    /**
     *删除黑石负载均衡七层转发域名。
     * @param req DeleteL7DomainsRequest
     * @return DeleteL7DomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7DomainsResponse DeleteL7Domains(DeleteL7DomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL7Domains", DeleteL7DomainsResponse.class);
    }

    /**
     *删除黑石负载均衡七层转发规则。
     * @param req DeleteL7RulesRequest
     * @return DeleteL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7RulesResponse DeleteL7Rules(DeleteL7RulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL7Rules", DeleteL7RulesResponse.class);
    }

    /**
     *删除黑石负载均衡监听器。
     * @param req DeleteListenersRequest
     * @return DeleteListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenersResponse DeleteListeners(DeleteListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListeners", DeleteListenersResponse.class);
    }

    /**
     *删除用户指定的黑石负载均衡实例。
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoadBalancer", DeleteLoadBalancerResponse.class);
    }

    /**
     *删除已创建的黑石流量镜像实例，删除过程是异步执行的，因此需要使用查询任务接口获取删除的结果。
     * @param req DeleteTrafficMirrorRequest
     * @return DeleteTrafficMirrorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrafficMirrorResponse DeleteTrafficMirror(DeleteTrafficMirrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrafficMirror", DeleteTrafficMirrorResponse.class);
    }

    /**
     *获取黑石负载均衡证书详情。
     * @param req DescribeCertDetailRequest
     * @return DescribeCertDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertDetailResponse DescribeCertDetail(DescribeCertDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCertDetail", DescribeCertDetailResponse.class);
    }

    /**
     *查询黑石物理机和虚机以及托管服务器绑定的黑石负载均衡详情。
     * @param req DescribeDevicesBindInfoRequest
     * @return DescribeDevicesBindInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesBindInfoResponse DescribeDevicesBindInfo(DescribeDevicesBindInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevicesBindInfo", DescribeDevicesBindInfoResponse.class);
    }

    /**
     *获取黑石负载均衡四层监听器绑定的主机列表。
     * @param req DescribeL4BackendsRequest
     * @return DescribeL4BackendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4BackendsResponse DescribeL4Backends(DescribeL4BackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4Backends", DescribeL4BackendsResponse.class);
    }

    /**
     *查找绑定了某主机或者指定监听器名称的黑石负载均衡四层监听器。
     * @param req DescribeL4ListenerInfoRequest
     * @return DescribeL4ListenerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ListenerInfoResponse DescribeL4ListenerInfo(DescribeL4ListenerInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4ListenerInfo", DescribeL4ListenerInfoResponse.class);
    }

    /**
     *获取黑石负载均衡四层监听器。
     * @param req DescribeL4ListenersRequest
     * @return DescribeL4ListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ListenersResponse DescribeL4Listeners(DescribeL4ListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL4Listeners", DescribeL4ListenersResponse.class);
    }

    /**
     *获取黑石负载均衡七层监听器绑定的主机列表
     * @param req DescribeL7BackendsRequest
     * @return DescribeL7BackendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7BackendsResponse DescribeL7Backends(DescribeL7BackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7Backends", DescribeL7BackendsResponse.class);
    }

    /**
     *查找绑定了某主机或者有某转发域名黑石负载均衡七层监听器。
     * @param req DescribeL7ListenerInfoRequest
     * @return DescribeL7ListenerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7ListenerInfoResponse DescribeL7ListenerInfo(DescribeL7ListenerInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7ListenerInfo", DescribeL7ListenerInfoResponse.class);
    }

    /**
     *获取黑石负载均衡七层监听器列表信息。
     * @param req DescribeL7ListenersRequest
     * @return DescribeL7ListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7ListenersResponse DescribeL7Listeners(DescribeL7ListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7Listeners", DescribeL7ListenersResponse.class);
    }

    /**
     *获取指定VPC下的7层监听器(支持模糊匹配)。
     * @param req DescribeL7ListenersExRequest
     * @return DescribeL7ListenersExResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7ListenersExResponse DescribeL7ListenersEx(DescribeL7ListenersExRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7ListenersEx", DescribeL7ListenersExResponse.class);
    }

    /**
     *获取黑石负载均衡七层转发规则。
     * @param req DescribeL7RulesRequest
     * @return DescribeL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7RulesResponse DescribeL7Rules(DescribeL7RulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7Rules", DescribeL7RulesResponse.class);
    }

    /**
     *获取黑石负载均衡端口相关信息。
     * @param req DescribeLoadBalancerPortInfoRequest
     * @return DescribeLoadBalancerPortInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerPortInfoResponse DescribeLoadBalancerPortInfo(DescribeLoadBalancerPortInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerPortInfo", DescribeLoadBalancerPortInfoResponse.class);
    }

    /**
     *查询负载均衡实例异步任务的执行情况。
     * @param req DescribeLoadBalancerTaskResultRequest
     * @return DescribeLoadBalancerTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerTaskResultResponse DescribeLoadBalancerTaskResult(DescribeLoadBalancerTaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancerTaskResult", DescribeLoadBalancerTaskResultResponse.class);
    }

    /**
     *获取黑石负载均衡实例列表
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoadBalancers", DescribeLoadBalancersResponse.class);
    }

    /**
     *获取流量镜像的监听器列表信息。
     * @param req DescribeTrafficMirrorListenersRequest
     * @return DescribeTrafficMirrorListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorListenersResponse DescribeTrafficMirrorListeners(DescribeTrafficMirrorListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrafficMirrorListeners", DescribeTrafficMirrorListenersResponse.class);
    }

    /**
     *获取流量镜像接收机健康状态。
     * @param req DescribeTrafficMirrorReceiverHealthStatusRequest
     * @return DescribeTrafficMirrorReceiverHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorReceiverHealthStatusResponse DescribeTrafficMirrorReceiverHealthStatus(DescribeTrafficMirrorReceiverHealthStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrafficMirrorReceiverHealthStatus", DescribeTrafficMirrorReceiverHealthStatusResponse.class);
    }

    /**
     *获取指定流量镜像实例的接收机信息。
     * @param req DescribeTrafficMirrorReceiversRequest
     * @return DescribeTrafficMirrorReceiversResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorReceiversResponse DescribeTrafficMirrorReceivers(DescribeTrafficMirrorReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrafficMirrorReceivers", DescribeTrafficMirrorReceiversResponse.class);
    }

    /**
     *获取流量镜像实例的列表信息。
     * @param req DescribeTrafficMirrorsRequest
     * @return DescribeTrafficMirrorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorsResponse DescribeTrafficMirrors(DescribeTrafficMirrorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrafficMirrors", DescribeTrafficMirrorsResponse.class);
    }

    /**
     *修改黑石负载均衡四层监听器后端实例端口。
     * @param req ModifyL4BackendPortRequest
     * @return ModifyL4BackendPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4BackendPortResponse ModifyL4BackendPort(ModifyL4BackendPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4BackendPort", ModifyL4BackendPortResponse.class);
    }

    /**
     *修改黑石负载均衡四层监听器后端探测端口。
     * @param req ModifyL4BackendProbePortRequest
     * @return ModifyL4BackendProbePortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4BackendProbePortResponse ModifyL4BackendProbePort(ModifyL4BackendProbePortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4BackendProbePort", ModifyL4BackendProbePortResponse.class);
    }

    /**
     *修改黑石负载均衡四层监听器后端实例权重功能。
     * @param req ModifyL4BackendWeightRequest
     * @return ModifyL4BackendWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4BackendWeightResponse ModifyL4BackendWeight(ModifyL4BackendWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4BackendWeight", ModifyL4BackendWeightResponse.class);
    }

    /**
     *修改黑石负载均衡四层监听器。
     * @param req ModifyL4ListenerRequest
     * @return ModifyL4ListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ListenerResponse ModifyL4Listener(ModifyL4ListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL4Listener", ModifyL4ListenerResponse.class);
    }

    /**
     *修改黑石负载均衡七层转发路径后端实例端口。
     * @param req ModifyL7BackendPortRequest
     * @return ModifyL7BackendPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7BackendPortResponse ModifyL7BackendPort(ModifyL7BackendPortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7BackendPort", ModifyL7BackendPortResponse.class);
    }

    /**
     *修改黑石负载均衡七层转发路径后端实例权重。
     * @param req ModifyL7BackendWeightRequest
     * @return ModifyL7BackendWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7BackendWeightResponse ModifyL7BackendWeight(ModifyL7BackendWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7BackendWeight", ModifyL7BackendWeightResponse.class);
    }

    /**
     *修改黑石负载均衡七层监听器。
     * @param req ModifyL7ListenerRequest
     * @return ModifyL7ListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7ListenerResponse ModifyL7Listener(ModifyL7ListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7Listener", ModifyL7ListenerResponse.class);
    }

    /**
     *修改黑石负载均衡七层转发路径。
     * @param req ModifyL7LocationsRequest
     * @return ModifyL7LocationsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7LocationsResponse ModifyL7Locations(ModifyL7LocationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyL7Locations", ModifyL7LocationsResponse.class);
    }

    /**
     *根据输入参数来修改黑石负载均衡实例的基本配置信息。可能的信息包括负载均衡实例的名称，域名前缀。
     * @param req ModifyLoadBalancerRequest
     * @return ModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerResponse ModifyLoadBalancer(ModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancer", ModifyLoadBalancerResponse.class);
    }

    /**
     *更改黑石负载均衡的计费方式
     * @param req ModifyLoadBalancerChargeModeRequest
     * @return ModifyLoadBalancerChargeModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerChargeModeResponse ModifyLoadBalancerChargeMode(ModifyLoadBalancerChargeModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoadBalancerChargeMode", ModifyLoadBalancerChargeModeResponse.class);
    }

    /**
     *更新黑石负载均衡证书。
     * @param req ReplaceCertRequest
     * @return ReplaceCertResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertResponse ReplaceCert(ReplaceCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceCert", ReplaceCertResponse.class);
    }

    /**
     *设置流量镜像的别名。
     * @param req SetTrafficMirrorAliasRequest
     * @return SetTrafficMirrorAliasResponse
     * @throws TencentCloudSDKException
     */
    public SetTrafficMirrorAliasResponse SetTrafficMirrorAlias(SetTrafficMirrorAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTrafficMirrorAlias", SetTrafficMirrorAliasResponse.class);
    }

    /**
     *设置流量镜像的健康检查参数。
     * @param req SetTrafficMirrorHealthSwitchRequest
     * @return SetTrafficMirrorHealthSwitchResponse
     * @throws TencentCloudSDKException
     */
    public SetTrafficMirrorHealthSwitchResponse SetTrafficMirrorHealthSwitch(SetTrafficMirrorHealthSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetTrafficMirrorHealthSwitch", SetTrafficMirrorHealthSwitchResponse.class);
    }

    /**
     *解绑黑石负载均衡四层监听器物理服务器。
     * @param req UnbindL4BackendsRequest
     * @return UnbindL4BackendsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindL4BackendsResponse UnbindL4Backends(UnbindL4BackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindL4Backends", UnbindL4BackendsResponse.class);
    }

    /**
     *解绑黑石物理服务器或者托管服务器到七层转发路径功能。
     * @param req UnbindL7BackendsRequest
     * @return UnbindL7BackendsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindL7BackendsResponse UnbindL7Backends(UnbindL7BackendsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindL7Backends", UnbindL7BackendsResponse.class);
    }

    /**
     *解绑流量镜像监听器。
     * @param req UnbindTrafficMirrorListenersRequest
     * @return UnbindTrafficMirrorListenersResponse
     * @throws TencentCloudSDKException
     */
    public UnbindTrafficMirrorListenersResponse UnbindTrafficMirrorListeners(UnbindTrafficMirrorListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindTrafficMirrorListeners", UnbindTrafficMirrorListenersResponse.class);
    }

    /**
     *从流量镜像实例上解绑流量镜像接收机。
     * @param req UnbindTrafficMirrorReceiversRequest
     * @return UnbindTrafficMirrorReceiversResponse
     * @throws TencentCloudSDKException
     */
    public UnbindTrafficMirrorReceiversResponse UnbindTrafficMirrorReceivers(UnbindTrafficMirrorReceiversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindTrafficMirrorReceivers", UnbindTrafficMirrorReceiversResponse.class);
    }

    /**
     *创建黑石负载均衡证书。
     * @param req UploadCertRequest
     * @return UploadCertResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertResponse UploadCert(UploadCertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadCert", UploadCertResponse.class);
    }

}
