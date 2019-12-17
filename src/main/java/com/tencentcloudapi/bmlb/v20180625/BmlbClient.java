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
        JsonResponseModel<BindL4BackendsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindL4BackendsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindL4Backends"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定黑石物理服务器或半托管服务器到七层转发路径。
     * @param req BindL7BackendsRequest
     * @return BindL7BackendsResponse
     * @throws TencentCloudSDKException
     */
    public BindL7BackendsResponse BindL7Backends(BindL7BackendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindL7BackendsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindL7BackendsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindL7Backends"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定黑石服务器七层监听器到流量镜像实例。
     * @param req BindTrafficMirrorListenersRequest
     * @return BindTrafficMirrorListenersResponse
     * @throws TencentCloudSDKException
     */
    public BindTrafficMirrorListenersResponse BindTrafficMirrorListeners(BindTrafficMirrorListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindTrafficMirrorListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindTrafficMirrorListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindTrafficMirrorListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定黑石物理服务器成为流量镜像接收机。
     * @param req BindTrafficMirrorReceiversRequest
     * @return BindTrafficMirrorReceiversResponse
     * @throws TencentCloudSDKException
     */
    public BindTrafficMirrorReceiversResponse BindTrafficMirrorReceivers(BindTrafficMirrorReceiversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindTrafficMirrorReceiversResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindTrafficMirrorReceiversResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindTrafficMirrorReceivers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石四层负载均衡监听器功能。黑石负载均衡四层监听器提供了转发用户请求的具体规则，包括端口、协议、会话保持、健康检查等参数。
     * @param req CreateL4ListenersRequest
     * @return CreateL4ListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4ListenersResponse CreateL4Listeners(CreateL4ListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4ListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL4ListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL4Listeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石负载均衡七层监听器功能。负载均衡七层监听器提供了转发用户请求的具体规则，包括端口、协议等参数。
     * @param req CreateL7ListenersRequest
     * @return CreateL7ListenersResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7ListenersResponse CreateL7Listeners(CreateL7ListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7ListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7ListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7Listeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石负载均衡七层转发规则。
     * @param req CreateL7RulesRequest
     * @return CreateL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesResponse CreateL7Rules(CreateL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用来创建黑石负载均衡。为了使用黑石负载均衡服务，您必须要创建一个或者多个负载均衡实例。通过成功调用该接口，会返回负载均衡实例的唯一ID。用户可以购买的黑石负载均衡实例类型分为：公网类型、内网类型。公网类型负载均衡对应一个BGP VIP，可用于快速访问公网负载均衡绑定的物理服务器；内网类型负载均衡对应一个腾讯云内部的VIP，不能通过Internet访问，可快速访问内网负载均衡绑定的物理服务器。
     * @param req CreateLoadBalancersRequest
     * @return CreateLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancersResponse CreateLoadBalancers(CreateLoadBalancersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLoadBalancersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoadBalancersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLoadBalancers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建流量镜像实例。
     * @param req CreateTrafficMirrorRequest
     * @return CreateTrafficMirrorResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrafficMirrorResponse CreateTrafficMirror(CreateTrafficMirrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTrafficMirrorResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTrafficMirrorResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTrafficMirror"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除黑石负载均衡七层转发域名。
     * @param req DeleteL7DomainsRequest
     * @return DeleteL7DomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7DomainsResponse DeleteL7Domains(DeleteL7DomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL7DomainsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteL7DomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteL7Domains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除黑石负载均衡七层转发规则。
     * @param req DeleteL7RulesRequest
     * @return DeleteL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7RulesResponse DeleteL7Rules(DeleteL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除黑石负载均衡监听器。
     * @param req DeleteListenersRequest
     * @return DeleteListenersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenersResponse DeleteListeners(DeleteListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户指定的黑石负载均衡实例。
     * @param req DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancerResponse DeleteLoadBalancer(DeleteLoadBalancerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoadBalancerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoadBalancerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLoadBalancer"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除已创建的黑石流量镜像实例，删除过程是异步执行的，因此需要使用查询任务接口获取删除的结果。
     * @param req DeleteTrafficMirrorRequest
     * @return DeleteTrafficMirrorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrafficMirrorResponse DeleteTrafficMirror(DeleteTrafficMirrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTrafficMirrorResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTrafficMirrorResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTrafficMirror"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡证书详情。
     * @param req DescribeCertDetailRequest
     * @return DescribeCertDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertDetailResponse DescribeCertDetail(DescribeCertDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询黑石物理机和虚机以及托管服务器绑定的黑石负载均衡详情。
     * @param req DescribeDevicesBindInfoRequest
     * @return DescribeDevicesBindInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesBindInfoResponse DescribeDevicesBindInfo(DescribeDevicesBindInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicesBindInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesBindInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevicesBindInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡四层监听器绑定的主机列表。
     * @param req DescribeL4BackendsRequest
     * @return DescribeL4BackendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4BackendsResponse DescribeL4Backends(DescribeL4BackendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4BackendsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4BackendsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4Backends"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查找绑定了某主机或者指定监听器名称的黑石负载均衡四层监听器。
     * @param req DescribeL4ListenerInfoRequest
     * @return DescribeL4ListenerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ListenerInfoResponse DescribeL4ListenerInfo(DescribeL4ListenerInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4ListenerInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4ListenerInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4ListenerInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡四层监听器。
     * @param req DescribeL4ListenersRequest
     * @return DescribeL4ListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4ListenersResponse DescribeL4Listeners(DescribeL4ListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4ListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4ListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4Listeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡七层监听器绑定的主机列表
     * @param req DescribeL7BackendsRequest
     * @return DescribeL7BackendsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7BackendsResponse DescribeL7Backends(DescribeL7BackendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7BackendsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7BackendsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7Backends"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查找绑定了某主机或者有某转发域名黑石负载均衡七层监听器。
     * @param req DescribeL7ListenerInfoRequest
     * @return DescribeL7ListenerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7ListenerInfoResponse DescribeL7ListenerInfo(DescribeL7ListenerInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7ListenerInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7ListenerInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7ListenerInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡七层监听器列表信息。
     * @param req DescribeL7ListenersRequest
     * @return DescribeL7ListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7ListenersResponse DescribeL7Listeners(DescribeL7ListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7ListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7ListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7Listeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定VPC下的7层监听器(支持模糊匹配)。
     * @param req DescribeL7ListenersExRequest
     * @return DescribeL7ListenersExResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7ListenersExResponse DescribeL7ListenersEx(DescribeL7ListenersExRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7ListenersExResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7ListenersExResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7ListenersEx"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡七层转发规则。
     * @param req DescribeL7RulesRequest
     * @return DescribeL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7RulesResponse DescribeL7Rules(DescribeL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡端口相关信息。
     * @param req DescribeLoadBalancerPortInfoRequest
     * @return DescribeLoadBalancerPortInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerPortInfoResponse DescribeLoadBalancerPortInfo(DescribeLoadBalancerPortInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancerPortInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancerPortInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoadBalancerPortInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询负载均衡实例异步任务的执行情况。
     * @param req DescribeLoadBalancerTaskResultRequest
     * @return DescribeLoadBalancerTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancerTaskResultResponse DescribeLoadBalancerTaskResult(DescribeLoadBalancerTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancerTaskResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancerTaskResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoadBalancerTaskResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑石负载均衡实例列表
     * @param req DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancersResponse DescribeLoadBalancers(DescribeLoadBalancersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLoadBalancers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取流量镜像的监听器列表信息。
     * @param req DescribeTrafficMirrorListenersRequest
     * @return DescribeTrafficMirrorListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorListenersResponse DescribeTrafficMirrorListeners(DescribeTrafficMirrorListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficMirrorListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficMirrorListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrafficMirrorListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取流量镜像接收机健康状态。
     * @param req DescribeTrafficMirrorReceiverHealthStatusRequest
     * @return DescribeTrafficMirrorReceiverHealthStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorReceiverHealthStatusResponse DescribeTrafficMirrorReceiverHealthStatus(DescribeTrafficMirrorReceiverHealthStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficMirrorReceiverHealthStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficMirrorReceiverHealthStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrafficMirrorReceiverHealthStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定流量镜像实例的接收机信息。
     * @param req DescribeTrafficMirrorReceiversRequest
     * @return DescribeTrafficMirrorReceiversResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorReceiversResponse DescribeTrafficMirrorReceivers(DescribeTrafficMirrorReceiversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficMirrorReceiversResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficMirrorReceiversResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrafficMirrorReceivers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取流量镜像实例的列表信息。
     * @param req DescribeTrafficMirrorsRequest
     * @return DescribeTrafficMirrorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficMirrorsResponse DescribeTrafficMirrors(DescribeTrafficMirrorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficMirrorsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrafficMirrorsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTrafficMirrors"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡四层监听器后端实例端口。
     * @param req ModifyL4BackendPortRequest
     * @return ModifyL4BackendPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4BackendPortResponse ModifyL4BackendPort(ModifyL4BackendPortRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4BackendPortResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4BackendPortResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4BackendPort"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡四层监听器后端探测端口。
     * @param req ModifyL4BackendProbePortRequest
     * @return ModifyL4BackendProbePortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4BackendProbePortResponse ModifyL4BackendProbePort(ModifyL4BackendProbePortRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4BackendProbePortResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4BackendProbePortResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4BackendProbePort"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡四层监听器后端实例权重功能。
     * @param req ModifyL4BackendWeightRequest
     * @return ModifyL4BackendWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4BackendWeightResponse ModifyL4BackendWeight(ModifyL4BackendWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4BackendWeightResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4BackendWeightResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4BackendWeight"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡四层监听器。
     * @param req ModifyL4ListenerRequest
     * @return ModifyL4ListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4ListenerResponse ModifyL4Listener(ModifyL4ListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4ListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4ListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4Listener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡七层转发路径后端实例端口。
     * @param req ModifyL7BackendPortRequest
     * @return ModifyL7BackendPortResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7BackendPortResponse ModifyL7BackendPort(ModifyL7BackendPortRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7BackendPortResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7BackendPortResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL7BackendPort"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡七层转发路径后端实例权重。
     * @param req ModifyL7BackendWeightRequest
     * @return ModifyL7BackendWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7BackendWeightResponse ModifyL7BackendWeight(ModifyL7BackendWeightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7BackendWeightResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7BackendWeightResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL7BackendWeight"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡七层监听器。
     * @param req ModifyL7ListenerRequest
     * @return ModifyL7ListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7ListenerResponse ModifyL7Listener(ModifyL7ListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7ListenerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7ListenerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL7Listener"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改黑石负载均衡七层转发路径。
     * @param req ModifyL7LocationsRequest
     * @return ModifyL7LocationsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7LocationsResponse ModifyL7Locations(ModifyL7LocationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7LocationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7LocationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL7Locations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据输入参数来修改黑石负载均衡实例的基本配置信息。可能的信息包括负载均衡实例的名称，域名前缀。
     * @param req ModifyLoadBalancerRequest
     * @return ModifyLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerResponse ModifyLoadBalancer(ModifyLoadBalancerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoadBalancerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLoadBalancer"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改黑石负载均衡的计费方式
     * @param req ModifyLoadBalancerChargeModeRequest
     * @return ModifyLoadBalancerChargeModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancerChargeModeResponse ModifyLoadBalancerChargeMode(ModifyLoadBalancerChargeModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoadBalancerChargeModeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancerChargeModeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLoadBalancerChargeMode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新黑石负载均衡证书。
     * @param req ReplaceCertRequest
     * @return ReplaceCertResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertResponse ReplaceCert(ReplaceCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置流量镜像的别名。
     * @param req SetTrafficMirrorAliasRequest
     * @return SetTrafficMirrorAliasResponse
     * @throws TencentCloudSDKException
     */
    public SetTrafficMirrorAliasResponse SetTrafficMirrorAlias(SetTrafficMirrorAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTrafficMirrorAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetTrafficMirrorAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetTrafficMirrorAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置流量镜像的健康检查参数。
     * @param req SetTrafficMirrorHealthSwitchRequest
     * @return SetTrafficMirrorHealthSwitchResponse
     * @throws TencentCloudSDKException
     */
    public SetTrafficMirrorHealthSwitchResponse SetTrafficMirrorHealthSwitch(SetTrafficMirrorHealthSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTrafficMirrorHealthSwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetTrafficMirrorHealthSwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetTrafficMirrorHealthSwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑黑石负载均衡四层监听器物理服务器。
     * @param req UnbindL4BackendsRequest
     * @return UnbindL4BackendsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindL4BackendsResponse UnbindL4Backends(UnbindL4BackendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindL4BackendsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindL4BackendsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindL4Backends"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑黑石物理服务器或者托管服务器到七层转发路径功能。
     * @param req UnbindL7BackendsRequest
     * @return UnbindL7BackendsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindL7BackendsResponse UnbindL7Backends(UnbindL7BackendsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindL7BackendsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindL7BackendsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindL7Backends"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑流量镜像监听器。
     * @param req UnbindTrafficMirrorListenersRequest
     * @return UnbindTrafficMirrorListenersResponse
     * @throws TencentCloudSDKException
     */
    public UnbindTrafficMirrorListenersResponse UnbindTrafficMirrorListeners(UnbindTrafficMirrorListenersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindTrafficMirrorListenersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindTrafficMirrorListenersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindTrafficMirrorListeners"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从流量镜像实例上解绑流量镜像接收机。
     * @param req UnbindTrafficMirrorReceiversRequest
     * @return UnbindTrafficMirrorReceiversResponse
     * @throws TencentCloudSDKException
     */
    public UnbindTrafficMirrorReceiversResponse UnbindTrafficMirrorReceivers(UnbindTrafficMirrorReceiversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindTrafficMirrorReceiversResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindTrafficMirrorReceiversResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindTrafficMirrorReceivers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石负载均衡证书。
     * @param req UploadCertRequest
     * @return UploadCertResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertResponse UploadCert(UploadCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
