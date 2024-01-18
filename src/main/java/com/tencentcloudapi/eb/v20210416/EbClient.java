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
package com.tencentcloudapi.eb.v20210416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eb.v20210416.models.*;

public class EbClient extends AbstractClient{
    private static String endpoint = "eb.tencentcloudapi.com";
    private static String service = "eb";
    private static String version = "2021-04-16";
    
    public EbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EbClient(Credential credential, String region, ClientProfile profile) {
        super(EbClient.endpoint, EbClient.version, credential, region, profile);
    }

    /**
     *检验规则
     * @param req CheckRuleRequest
     * @return CheckRuleResponse
     * @throws TencentCloudSDKException
     */
    public CheckRuleResponse CheckRule(CheckRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRule", CheckRuleResponse.class);
    }

    /**
     *用于在ETL配置页面, 测试规则和数据.
     * @param req CheckTransformationRequest
     * @return CheckTransformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckTransformationResponse CheckTransformation(CheckTransformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckTransformation", CheckTransformationResponse.class);
    }

    /**
     *创建事件连接器
     * @param req CreateConnectionRequest
     * @return CreateConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateConnectionResponse CreateConnection(CreateConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConnection", CreateConnectionResponse.class);
    }

    /**
     *用于创建事件集
     * @param req CreateEventBusRequest
     * @return CreateEventBusResponse
     * @throws TencentCloudSDKException
     */
    public CreateEventBusResponse CreateEventBus(CreateEventBusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEventBus", CreateEventBusResponse.class);
    }

    /**
     *创建事件规则
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRule", CreateRuleResponse.class);
    }

    /**
     *创建事件目标
     * @param req CreateTargetRequest
     * @return CreateTargetResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetResponse CreateTarget(CreateTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTarget", CreateTargetResponse.class);
    }

    /**
     *用于创建转换器
     * @param req CreateTransformationRequest
     * @return CreateTransformationResponse
     * @throws TencentCloudSDKException
     */
    public CreateTransformationResponse CreateTransformation(CreateTransformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTransformation", CreateTransformationResponse.class);
    }

    /**
     *删除事件连接器
     * @param req DeleteConnectionRequest
     * @return DeleteConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConnectionResponse DeleteConnection(DeleteConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConnection", DeleteConnectionResponse.class);
    }

    /**
     *删除事件集
     * @param req DeleteEventBusRequest
     * @return DeleteEventBusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEventBusResponse DeleteEventBus(DeleteEventBusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEventBus", DeleteEventBusResponse.class);
    }

    /**
     *删除事件规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *删除事件目标
     * @param req DeleteTargetRequest
     * @return DeleteTargetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetResponse DeleteTarget(DeleteTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTarget", DeleteTargetResponse.class);
    }

    /**
     *用于删除转换器
     * @param req DeleteTransformationRequest
     * @return DeleteTransformationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTransformationResponse DeleteTransformation(DeleteTransformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTransformation", DeleteTransformationResponse.class);
    }

    /**
     *前置条件：需开启事件存储；事件查询维度值
     * @param req DescribeLogTagValueRequest
     * @return DescribeLogTagValueResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTagValueResponse DescribeLogTagValue(DescribeLogTagValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogTagValue", DescribeLogTagValueResponse.class);
    }

    /**
     *获取事件集详情
     * @param req GetEventBusRequest
     * @return GetEventBusResponse
     * @throws TencentCloudSDKException
     */
    public GetEventBusResponse GetEventBus(GetEventBusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetEventBus", GetEventBusResponse.class);
    }

    /**
     *获取平台产品事件模板
     * @param req GetPlatformEventTemplateRequest
     * @return GetPlatformEventTemplateResponse
     * @throws TencentCloudSDKException
     */
    public GetPlatformEventTemplateResponse GetPlatformEventTemplate(GetPlatformEventTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPlatformEventTemplate", GetPlatformEventTemplateResponse.class);
    }

    /**
     *获取事件规则详情
     * @param req GetRuleRequest
     * @return GetRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetRuleResponse GetRule(GetRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRule", GetRuleResponse.class);
    }

    /**
     *用于获取转换器详情
     * @param req GetTransformationRequest
     * @return GetTransformationResponse
     * @throws TencentCloudSDKException
     */
    public GetTransformationResponse GetTransformation(GetTransformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTransformation", GetTransformationResponse.class);
    }

    /**
     *获取事件连接器列表
     * @param req ListConnectionsRequest
     * @return ListConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public ListConnectionsResponse ListConnections(ListConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConnections", ListConnectionsResponse.class);
    }

    /**
     *获取事件集列表
     * @param req ListEventBusesRequest
     * @return ListEventBusesResponse
     * @throws TencentCloudSDKException
     */
    public ListEventBusesResponse ListEventBuses(ListEventBusesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEventBuses", ListEventBusesResponse.class);
    }

    /**
     *获取平台产品事件名称
     * @param req ListPlatformEventNamesRequest
     * @return ListPlatformEventNamesResponse
     * @throws TencentCloudSDKException
     */
    public ListPlatformEventNamesResponse ListPlatformEventNames(ListPlatformEventNamesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPlatformEventNames", ListPlatformEventNamesResponse.class);
    }

    /**
     *获取平台产品事件匹配规则
     * @param req ListPlatformEventPatternsRequest
     * @return ListPlatformEventPatternsResponse
     * @throws TencentCloudSDKException
     */
    public ListPlatformEventPatternsResponse ListPlatformEventPatterns(ListPlatformEventPatternsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPlatformEventPatterns", ListPlatformEventPatternsResponse.class);
    }

    /**
     *获取平台产品列表
     * @param req ListPlatformProductsRequest
     * @return ListPlatformProductsResponse
     * @throws TencentCloudSDKException
     */
    public ListPlatformProductsResponse ListPlatformProducts(ListPlatformProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListPlatformProducts", ListPlatformProductsResponse.class);
    }

    /**
     *获取事件规则列表
     * @param req ListRulesRequest
     * @return ListRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListRulesResponse ListRules(ListRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRules", ListRulesResponse.class);
    }

    /**
     *获取事件目标列表
     * @param req ListTargetsRequest
     * @return ListTargetsResponse
     * @throws TencentCloudSDKException
     */
    public ListTargetsResponse ListTargets(ListTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTargets", ListTargetsResponse.class);
    }

    /**
     *（已废弃）用于Event事件投递
     * @param req PublishEventRequest
     * @return PublishEventResponse
     * @throws TencentCloudSDKException
     */
    public PublishEventResponse PublishEvent(PublishEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishEvent", PublishEventResponse.class);
    }

    /**
     *用于Event事件投递
     * @param req PutEventsRequest
     * @return PutEventsResponse
     * @throws TencentCloudSDKException
     */
    public PutEventsResponse PutEvents(PutEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutEvents", PutEventsResponse.class);
    }

    /**
     *前置条件：开启事件存储；查询历史推送事件
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
    }

    /**
     *更新事件连接器
     * @param req UpdateConnectionRequest
     * @return UpdateConnectionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConnectionResponse UpdateConnection(UpdateConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConnection", UpdateConnectionResponse.class);
    }

    /**
     *更新事件集
     * @param req UpdateEventBusRequest
     * @return UpdateEventBusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEventBusResponse UpdateEventBus(UpdateEventBusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEventBus", UpdateEventBusResponse.class);
    }

    /**
     *更新事件规则
     * @param req UpdateRuleRequest
     * @return UpdateRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuleResponse UpdateRule(UpdateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRule", UpdateRuleResponse.class);
    }

    /**
     *更新事件目标
     * @param req UpdateTargetRequest
     * @return UpdateTargetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTargetResponse UpdateTarget(UpdateTargetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTarget", UpdateTargetResponse.class);
    }

    /**
     *用于更新转换器
     * @param req UpdateTransformationRequest
     * @return UpdateTransformationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTransformationResponse UpdateTransformation(UpdateTransformationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTransformation", UpdateTransformationResponse.class);
    }

}
