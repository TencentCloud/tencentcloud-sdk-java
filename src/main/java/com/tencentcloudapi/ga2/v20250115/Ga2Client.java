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
package com.tencentcloudapi.ga2.v20250115;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ga2.v20250115.models.*;

public class Ga2Client extends AbstractClient{
    private static String endpoint = "ga2.tencentcloudapi.com";
    private static String service = "ga2";
    private static String version = "2025-01-15";

    public Ga2Client(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public Ga2Client(Credential credential, String region, ClientProfile profile) {
        super(Ga2Client.endpoint, Ga2Client.version, credential, region, profile);
    }

    /**
     *创建加速地域
     * @param req CreateAccelerateAreasRequest
     * @return CreateAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerateAreasResponse CreateAccelerateAreas(CreateAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccelerateAreas", CreateAccelerateAreasResponse.class);
    }

    /**
     *创建终端节点组。
     * @param req CreateEndpointGroupRequest
     * @return CreateEndpointGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateEndpointGroupResponse CreateEndpointGroup(CreateEndpointGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEndpointGroup", CreateEndpointGroupResponse.class);
    }

    /**
     *创建七层转发规则
     * @param req CreateForwardingRuleRequest
     * @return CreateForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardingRuleResponse CreateForwardingRule(CreateForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateForwardingRule", CreateForwardingRuleResponse.class);
    }

    /**
     *创建全球加速实例
     * @param req CreateGlobalAcceleratorRequest
     * @return CreateGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public CreateGlobalAcceleratorResponse CreateGlobalAccelerator(CreateGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateGlobalAccelerator", CreateGlobalAcceleratorResponse.class);
    }

    /**
     *创建监听器
     * @param req CreateListenerRequest
     * @return CreateListenerResponse
     * @throws TencentCloudSDKException
     */
    public CreateListenerResponse CreateListener(CreateListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateListener", CreateListenerResponse.class);
    }

    /**
     *删除加速地域
     * @param req DeleteAccelerateAreasRequest
     * @return DeleteAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerateAreasResponse DeleteAccelerateAreas(DeleteAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccelerateAreas", DeleteAccelerateAreasResponse.class);
    }

    /**
     *删除终端节点组。
     * @param req DeleteEndpointGroupsRequest
     * @return DeleteEndpointGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEndpointGroupsResponse DeleteEndpointGroups(DeleteEndpointGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEndpointGroups", DeleteEndpointGroupsResponse.class);
    }

    /**
     *删除七层转发规则
     * @param req DeleteForwardingRuleRequest
     * @return DeleteForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteForwardingRuleResponse DeleteForwardingRule(DeleteForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteForwardingRule", DeleteForwardingRuleResponse.class);
    }

    /**
     *删除全球加速实例
     * @param req DeleteGlobalAcceleratorRequest
     * @return DeleteGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGlobalAcceleratorResponse DeleteGlobalAccelerator(DeleteGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGlobalAccelerator", DeleteGlobalAcceleratorResponse.class);
    }

    /**
     *删除监听器
     * @param req DeleteListenerRequest
     * @return DeleteListenerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteListenerResponse DeleteListener(DeleteListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteListener", DeleteListenerResponse.class);
    }

    /**
     *查询加速地域
     * @param req DescribeAccelerateAreasRequest
     * @return DescribeAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerateAreasResponse DescribeAccelerateAreas(DescribeAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerateAreas", DescribeAccelerateAreasResponse.class);
    }

    /**
     *查询可选加速区域
     * @param req DescribeAccelerateRegionsRequest
     * @return DescribeAccelerateRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerateRegionsResponse DescribeAccelerateRegions(DescribeAccelerateRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccelerateRegions", DescribeAccelerateRegionsResponse.class);
    }

    /**
     *查询跨境账单
     * @param req DescribeCrossBorderSettlementRequest
     * @return DescribeCrossBorderSettlementResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderSettlementResponse DescribeCrossBorderSettlement(DescribeCrossBorderSettlementRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCrossBorderSettlement", DescribeCrossBorderSettlementResponse.class);
    }

    /**
     *查询终端节点组。
     * @param req DescribeEndpointGroupsRequest
     * @return DescribeEndpointGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndpointGroupsResponse DescribeEndpointGroups(DescribeEndpointGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndpointGroups", DescribeEndpointGroupsResponse.class);
    }

    /**
     *查看七层转发规则
     * @param req DescribeForwardingRuleRequest
     * @return DescribeForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardingRuleResponse DescribeForwardingRule(DescribeForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardingRule", DescribeForwardingRuleResponse.class);
    }

    /**
     *修改全球加速实例
     * @param req DescribeGlobalAcceleratorsRequest
     * @return DescribeGlobalAcceleratorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGlobalAcceleratorsResponse DescribeGlobalAccelerators(DescribeGlobalAcceleratorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGlobalAccelerators", DescribeGlobalAcceleratorsResponse.class);
    }

    /**
     *查询监听器
     * @param req DescribeListenersRequest
     * @return DescribeListenersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenersResponse DescribeListeners(DescribeListenersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListeners", DescribeListenersResponse.class);
    }

    /**
     *修改加速地域
     * @param req ModifyAccelerateAreasRequest
     * @return ModifyAccelerateAreasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerateAreasResponse ModifyAccelerateAreas(ModifyAccelerateAreasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccelerateAreas", ModifyAccelerateAreasResponse.class);
    }

    /**
     *修改终端节点组。
     * @param req ModifyEndpointGroupRequest
     * @return ModifyEndpointGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEndpointGroupResponse ModifyEndpointGroup(ModifyEndpointGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEndpointGroup", ModifyEndpointGroupResponse.class);
    }

    /**
     *修改七层转发规则
     * @param req ModifyForwardingRuleRequest
     * @return ModifyForwardingRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyForwardingRuleResponse ModifyForwardingRule(ModifyForwardingRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyForwardingRule", ModifyForwardingRuleResponse.class);
    }

    /**
     *修改全球加速实例
     * @param req ModifyGlobalAcceleratorRequest
     * @return ModifyGlobalAcceleratorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGlobalAcceleratorResponse ModifyGlobalAccelerator(ModifyGlobalAcceleratorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGlobalAccelerator", ModifyGlobalAcceleratorResponse.class);
    }

    /**
     *修改监听器
     * @param req ModifyListenerRequest
     * @return ModifyListenerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyListenerResponse ModifyListener(ModifyListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyListener", ModifyListenerResponse.class);
    }

}
