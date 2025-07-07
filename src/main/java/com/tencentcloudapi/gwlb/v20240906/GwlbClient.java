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
package com.tencentcloudapi.gwlb.v20240906;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gwlb.v20240906.models.*;

public class GwlbClient extends AbstractClient{
    private static String endpoint = "gwlb.tencentcloudapi.com";
    private static String service = "gwlb";
    private static String version = "2024-09-06";

    public GwlbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GwlbClient(Credential credential, String region, ClientProfile profile) {
        super(GwlbClient.endpoint, GwlbClient.version, credential, region, profile);
    }

    /**
     *本接口(AssociateTargetGroups)用来将目标组绑定到负载均衡。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 [DescribeTaskStatus](https://cloud.tencent.com/document/product/214/30683) 接口查询本次任务是否成功。
     * @param req AssociateTargetGroupsRequest
     * @return AssociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateTargetGroupsResponse AssociateTargetGroups(AssociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateTargetGroups", AssociateTargetGroupsResponse.class);
    }

    /**
     *本接口(CreateGatewayLoadBalancer)用来创建网关负载均衡实例。为了使用网关负载均衡服务，您必须购买一个或多个网关负载均衡实例。成功调用该接口后，会返回网关负载均衡实例的唯一 ID。
注意：单个账号在每个地域的默认购买配额为：10个。
本接口为异步接口，接口成功返回后，可使用 [DescribeTaskStatus](https://cloud.tencent.com/document/api/1782/111700) 接口查询负载均衡实例的状态。
     * @param req CreateGatewayLoadBalancerRequest
     * @return CreateGatewayLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public CreateGatewayLoadBalancerResponse CreateGatewayLoadBalancer(CreateGatewayLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGatewayLoadBalancer", CreateGatewayLoadBalancerResponse.class);
    }

    /**
     *创建目标组。
     * @param req CreateTargetGroupRequest
     * @return CreateTargetGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetGroupResponse CreateTargetGroup(CreateTargetGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTargetGroup", CreateTargetGroupResponse.class);
    }

    /**
     *DeleteGatewayLoadBalancer 接口用以删除指定的一个或多个网关负载均衡实例。成功删除后，会把网关负载均衡实例与后端服务解绑。
本接口为异步接口，接口返回成功后，需以返回的 RequestId 为入参，调用 [DescribeTaskStatus](https://cloud.tencent.com/document/api/1782/111700) 接口查询本次任务是否成功。
     * @param req DeleteGatewayLoadBalancerRequest
     * @return DeleteGatewayLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatewayLoadBalancerResponse DeleteGatewayLoadBalancer(DeleteGatewayLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGatewayLoadBalancer", DeleteGatewayLoadBalancerResponse.class);
    }

    /**
     *删除目标组
     * @param req DeleteTargetGroupsRequest
     * @return DeleteTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetGroupsResponse DeleteTargetGroups(DeleteTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTargetGroups", DeleteTargetGroupsResponse.class);
    }

    /**
     *从目标组中解绑服务器。
     * @param req DeregisterTargetGroupInstancesRequest
     * @return DeregisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterTargetGroupInstancesResponse DeregisterTargetGroupInstances(DeregisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeregisterTargetGroupInstances", DeregisterTargetGroupInstancesResponse.class);
    }

    /**
     *查询一个地域的网关负载均衡实例列表。
     * @param req DescribeGatewayLoadBalancersRequest
     * @return DescribeGatewayLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayLoadBalancersResponse DescribeGatewayLoadBalancers(DescribeGatewayLoadBalancersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayLoadBalancers", DescribeGatewayLoadBalancersResponse.class);
    }

    /**
     *查询目标组后端服务状态。目前仅支持网关负载均衡类型的目标组支持查询后端服务状态。
     * @param req DescribeTargetGroupInstanceStatusRequest
     * @return DescribeTargetGroupInstanceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstanceStatusResponse DescribeTargetGroupInstanceStatus(DescribeTargetGroupInstanceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupInstanceStatus", DescribeTargetGroupInstanceStatusResponse.class);
    }

    /**
     *获取目标组绑定的服务器信息。
     * @param req DescribeTargetGroupInstancesRequest
     * @return DescribeTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupInstancesResponse DescribeTargetGroupInstances(DescribeTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupInstances", DescribeTargetGroupInstancesResponse.class);
    }

    /**
     *获取目标组列表
     * @param req DescribeTargetGroupListRequest
     * @return DescribeTargetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupListResponse DescribeTargetGroupList(DescribeTargetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroupList", DescribeTargetGroupListResponse.class);
    }

    /**
     *查询目标组信息
     * @param req DescribeTargetGroupsRequest
     * @return DescribeTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTargetGroupsResponse DescribeTargetGroups(DescribeTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTargetGroups", DescribeTargetGroupsResponse.class);
    }

    /**
     *本接口用于查询异步任务的执行状态，对于非查询类的接口（创建/删除负载均衡实例等），在接口调用成功后，都需要使用本接口查询任务最终是否执行成功。
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *解除负载均衡和目标组的关联关系。
本接口为异步接口，本接口返回成功后需以返回的 RequestID 为入参，调用 [DescribeTaskStatus](https://cloud.tencent.com/document/product/214/30683) 接口查询本次任务是否成功。
     * @param req DisassociateTargetGroupsRequest
     * @return DisassociateTargetGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateTargetGroupsResponse DisassociateTargetGroups(DisassociateTargetGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateTargetGroups", DisassociateTargetGroupsResponse.class);
    }

    /**
     *InquirePriceCreateGatewayLoadBalancer接口查询创建网关负载均衡的价格。
     * @param req InquirePriceCreateGatewayLoadBalancerRequest
     * @return InquirePriceCreateGatewayLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateGatewayLoadBalancerResponse InquirePriceCreateGatewayLoadBalancer(InquirePriceCreateGatewayLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateGatewayLoadBalancer", InquirePriceCreateGatewayLoadBalancerResponse.class);
    }

    /**
     *ModifyGatewayLoadBalancerAttribute 接口用于修改负载均衡实例的属性。支持修改负载均衡实例的名称、带宽上限。
     * @param req ModifyGatewayLoadBalancerAttributeRequest
     * @return ModifyGatewayLoadBalancerAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayLoadBalancerAttributeResponse ModifyGatewayLoadBalancerAttribute(ModifyGatewayLoadBalancerAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGatewayLoadBalancerAttribute", ModifyGatewayLoadBalancerAttributeResponse.class);
    }

    /**
     *修改目标组的名称、健康探测等属性。
     * @param req ModifyTargetGroupAttributeRequest
     * @return ModifyTargetGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupAttributeResponse ModifyTargetGroupAttribute(ModifyTargetGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupAttribute", ModifyTargetGroupAttributeResponse.class);
    }

    /**
     *修改目标组的服务器权重。
     * @param req ModifyTargetGroupInstancesWeightRequest
     * @return ModifyTargetGroupInstancesWeightResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTargetGroupInstancesWeightResponse ModifyTargetGroupInstancesWeight(ModifyTargetGroupInstancesWeightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTargetGroupInstancesWeight", ModifyTargetGroupInstancesWeightResponse.class);
    }

    /**
     *注册服务器到目标组。
     * @param req RegisterTargetGroupInstancesRequest
     * @return RegisterTargetGroupInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RegisterTargetGroupInstancesResponse RegisterTargetGroupInstances(RegisterTargetGroupInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterTargetGroupInstances", RegisterTargetGroupInstancesResponse.class);
    }

}
