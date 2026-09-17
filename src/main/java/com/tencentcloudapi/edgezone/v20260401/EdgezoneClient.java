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
package com.tencentcloudapi.edgezone.v20260401;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.edgezone.v20260401.models.*;

public class EdgezoneClient extends AbstractClient{
    private static String endpoint = "edgezone.tencentcloudapi.com";
    private static String service = "edgezone";
    private static String version = "2026-04-01";

    public EdgezoneClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EdgezoneClient(Credential credential, String region, ClientProfile profile) {
        super(EdgezoneClient.endpoint, EdgezoneClient.version, credential, region, profile);
    }

    /**
     *从静态 IP 池为指定公网实例批量申请多个 Ip 地址（随机分配）。申请前需检查用户配额。
此接口仅适用于 `RouteMode=static` 的公网实例。BGP/OSPF 实例调用此接口将返回错误。
     * @param req ApplyPublicIpsRequest
     * @return ApplyPublicIpsResponse
     * @throws TencentCloudSDKException
     */
    public ApplyPublicIpsResponse ApplyPublicIps(ApplyPublicIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyPublicIps", ApplyPublicIpsResponse.class);
    }

    /**
     *开通边缘节点计费服务。
     * @param req CreateEdgeNodeServiceRequest
     * @return CreateEdgeNodeServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeServiceResponse CreateEdgeNodeService(CreateEdgeNodeServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeNodeService", CreateEdgeNodeServiceResponse.class);
    }

    /**
     *创建物理机实例，系统自动分配物理机资源并完成装机。如果用户未在当前可用区开通计费，系统自动开通。支持并发分配物理机资源，异步执行网络分配和装机任务。
     * @param req CreateInstancesRequest
     * @return CreateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancesResponse CreateInstances(CreateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstances", CreateInstancesResponse.class);
    }

    /**
     *创建私网实例，一个用户在一个可用区仅支持创建一个私网实例，网络地址由 Network（网络号）和 Mask（掩码位数）两个参数共同决定子网范围。Network 必须是三个 RFC 1918 私有地址段之一的合法网络地址：10.0.0.0/8、172.16.0.0/12 或 192.168.0.0/16，且 host 位必须全为 0（即Network 与 Mask 组合后不能有主机位被置位，例如 10.0.0.1/24 是非法的，应填 10.0.0.0/24）。Mask 的上限统一为 28，下限由所属地址段决定：10.x.x.x 段允许 8～28，172.16.x.x 段允许 12～28，192.168.x.x 段允许 16～28。
     * @param req CreatePrivateNetworkInstanceRequest
     * @return CreatePrivateNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrivateNetworkInstanceResponse CreatePrivateNetworkInstance(CreatePrivateNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrivateNetworkInstance", CreatePrivateNetworkInstanceResponse.class);
    }

    /**
     *用户输入可用区ID、公网实例名称、网络线路、路由模式以创建公网实例，一个用户在一个可用区仅支持创建一个公网实例
路由模式为 **静态** 的公网实例需要用户主动申请和释放公网IP
路由模式为 **OSPF、BGP** 的公网实例在创建时自动分配公网IP段，销毁时自动释放公网IP段
     * @param req CreatePublicNetworkInstanceRequest
     * @return CreatePublicNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePublicNetworkInstanceResponse CreatePublicNetworkInstance(CreatePublicNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePublicNetworkInstance", CreatePublicNetworkInstanceResponse.class);
    }

    /**
     *删除私网实例
     * @param req DeletePrivateNetworkInstanceRequest
     * @return DeletePrivateNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrivateNetworkInstanceResponse DeletePrivateNetworkInstance(DeletePrivateNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrivateNetworkInstance", DeletePrivateNetworkInstanceResponse.class);
    }

    /**
     *修改公网实例信息
     * @param req DeletePublicNetworkInstanceRequest
     * @return DeletePublicNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeletePublicNetworkInstanceResponse DeletePublicNetworkInstance(DeletePublicNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePublicNetworkInstance", DeletePublicNetworkInstanceResponse.class);
    }

    /**
     *根据 AppId 查询账号下可用区维度的机型配额列表；若传入 Zone，则仅返回指定可用区下的机型配额；若不传，则返回账号下所有可用区的机型配额。
     * @param req DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceTypesResponse DescribeInstanceTypes(DescribeInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceTypes", DescribeInstanceTypesResponse.class);
    }

    /**
     *查询物理机实例列表，支持按实例ID、实例名称、可用区、实例状态等条件筛选，并支持分页查询。
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *查询私网实例，支持通过私网实例ID、私网实例名称、可用区ID等参数进行查询
     * @param req DescribePrivateNetworkInstancesRequest
     * @return DescribePrivateNetworkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrivateNetworkInstancesResponse DescribePrivateNetworkInstances(DescribePrivateNetworkInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrivateNetworkInstances", DescribePrivateNetworkInstancesResponse.class);
    }

    /**
     *查询用户的公网Ip信息，对于路由模式为Static的公网实例，会返回所有已申请的公网Ip信息，对于路由模式为Ospf和Bgp的公网实例，会直接返回网段信息
     * @param req DescribePublicIpsRequest
     * @return DescribePublicIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpsResponse DescribePublicIps(DescribePublicIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicIps", DescribePublicIpsResponse.class);
    }

    /**
     *查询公网实例列表，支持按实例ID、实例名称、可用区等条件筛选，并支持分页查询。
     * @param req DescribePublicNetworkInstancesRequest
     * @return DescribePublicNetworkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicNetworkInstancesResponse DescribePublicNetworkInstances(DescribePublicNetworkInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicNetworkInstances", DescribePublicNetworkInstancesResponse.class);
    }

    /**
     *按指标名，查询统计数据。数据按1分钟间隔统计
     * @param req DescribeZoneDataRequest
     * @return DescribeZoneDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneDataResponse DescribeZoneData(DescribeZoneDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZoneData", DescribeZoneDataResponse.class);
    }

    /**
     *跨地域聚合查询所有已配置 region 下的可用区列表。支持通过 FilterByAppId 参数控制是否按账号过滤：默认仅返回账号关联的可用区，设为 False 时返回所有可用区。本地域直查数据库，远程地域并发 HTTP 请求后合并返回。
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *修改物理机实例的属性，支持修改实例名称、变更公网IP（IPv4/IPv6）。InstanceName 和 NewPublicIp 至少传入一个。
     * @param req ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttributeResponse ModifyInstanceAttribute(ModifyInstanceAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAttribute", ModifyInstanceAttributeResponse.class);
    }

    /**
     *修改私网实例信息
     * @param req ModifyPrivateNetworkInstanceRequest
     * @return ModifyPrivateNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateNetworkInstanceResponse ModifyPrivateNetworkInstance(ModifyPrivateNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrivateNetworkInstance", ModifyPrivateNetworkInstanceResponse.class);
    }

    /**
     *修改公网实例信息
     * @param req ModifyPublicNetworkInstanceRequest
     * @return ModifyPublicNetworkInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublicNetworkInstanceResponse ModifyPublicNetworkInstance(ModifyPublicNetworkInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPublicNetworkInstance", ModifyPublicNetworkInstanceResponse.class);
    }

    /**
     *批量释放已分配给 STATIC 公网实例但**未绑定物理服务器**的 IPv4 地址
此接口仅适用于 STATIC 模式实例。BGP/OSPF 实例的 CIDR 在实例删除时自动归还，无需手动释放单个 IP。
     * @param req ReleasePublicIpRequest
     * @return ReleasePublicIpResponse
     * @throws TencentCloudSDKException
     */
    public ReleasePublicIpResponse ReleasePublicIp(ReleasePublicIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleasePublicIp", ReleasePublicIpResponse.class);
    }

    /**
     *销毁物理机实例，释放资源。接口同步释放网络资源（IP回收）并更新状态为 terminating，后台异步执行磁盘清理。支持部分成功。
     * @param req TerminateInstancesRequest
     * @return TerminateInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateInstancesResponse TerminateInstances(TerminateInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateInstances", TerminateInstancesResponse.class);
    }

}
