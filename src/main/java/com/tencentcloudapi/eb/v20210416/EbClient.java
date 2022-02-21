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
        JsonResponseModel<CheckRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于在ETL配置页面, 测试规则和数据.
     * @param req CheckTransformationRequest
     * @return CheckTransformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckTransformationResponse CheckTransformation(CheckTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckTransformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckTransformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckTransformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建事件连接器
     * @param req CreateConnectionRequest
     * @return CreateConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateConnectionResponse CreateConnection(CreateConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建事件集
     * @param req CreateEventBusRequest
     * @return CreateEventBusResponse
     * @throws TencentCloudSDKException
     */
    public CreateEventBusResponse CreateEventBus(CreateEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEventBusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEventBusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEventBus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建事件规则
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建事件目标
     * @param req CreateTargetRequest
     * @return CreateTargetResponse
     * @throws TencentCloudSDKException
     */
    public CreateTargetResponse CreateTarget(CreateTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTargetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTargetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTarget");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建转换器
     * @param req CreateTransformationRequest
     * @return CreateTransformationResponse
     * @throws TencentCloudSDKException
     */
    public CreateTransformationResponse CreateTransformation(CreateTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTransformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTransformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTransformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除事件连接器
     * @param req DeleteConnectionRequest
     * @return DeleteConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConnectionResponse DeleteConnection(DeleteConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除事件集
     * @param req DeleteEventBusRequest
     * @return DeleteEventBusResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEventBusResponse DeleteEventBus(DeleteEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEventBusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEventBusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEventBus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除事件规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除事件目标
     * @param req DeleteTargetRequest
     * @return DeleteTargetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTargetResponse DeleteTarget(DeleteTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTargetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTargetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTarget");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除转换器
     * @param req DeleteTransformationRequest
     * @return DeleteTransformationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTransformationResponse DeleteTransformation(DeleteTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTransformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTransformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTransformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取事件集详情
     * @param req GetEventBusRequest
     * @return GetEventBusResponse
     * @throws TencentCloudSDKException
     */
    public GetEventBusResponse GetEventBus(GetEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetEventBusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetEventBusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetEventBus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取事件规则详情
     * @param req GetRuleRequest
     * @return GetRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetRuleResponse GetRule(GetRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取转换器详情
     * @param req GetTransformationRequest
     * @return GetTransformationResponse
     * @throws TencentCloudSDKException
     */
    public GetTransformationResponse GetTransformation(GetTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTransformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTransformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTransformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取事件连接器列表
     * @param req ListConnectionsRequest
     * @return ListConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public ListConnectionsResponse ListConnections(ListConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListConnectionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListConnectionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListConnections");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取事件集列表
     * @param req ListEventBusesRequest
     * @return ListEventBusesResponse
     * @throws TencentCloudSDKException
     */
    public ListEventBusesResponse ListEventBuses(ListEventBusesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEventBusesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEventBusesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEventBuses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取事件规则列表
     * @param req ListRulesRequest
     * @return ListRulesResponse
     * @throws TencentCloudSDKException
     */
    public ListRulesResponse ListRules(ListRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取事件目标列表
     * @param req ListTargetsRequest
     * @return ListTargetsResponse
     * @throws TencentCloudSDKException
     */
    public ListTargetsResponse ListTargets(ListTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTargetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListTargetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListTargets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *（已废弃）用于Event事件投递
     * @param req PublishEventRequest
     * @return PublishEventResponse
     * @throws TencentCloudSDKException
     */
    public PublishEventResponse PublishEvent(PublishEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于Event事件投递
     * @param req PutEventsRequest
     * @return PutEventsResponse
     * @throws TencentCloudSDKException
     */
    public PutEventsResponse PutEvents(PutEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PutEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PutEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PutEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新事件连接器
     * @param req UpdateConnectionRequest
     * @return UpdateConnectionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConnectionResponse UpdateConnection(UpdateConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateConnectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateConnectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateConnection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新事件集
     * @param req UpdateEventBusRequest
     * @return UpdateEventBusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEventBusResponse UpdateEventBus(UpdateEventBusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEventBusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEventBusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEventBus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新事件规则
     * @param req UpdateRuleRequest
     * @return UpdateRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuleResponse UpdateRule(UpdateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新事件目标
     * @param req UpdateTargetRequest
     * @return UpdateTargetResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTargetResponse UpdateTarget(UpdateTargetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTargetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateTargetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateTarget");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于更新转换器
     * @param req UpdateTransformationRequest
     * @return UpdateTransformationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTransformationResponse UpdateTransformation(UpdateTransformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTransformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateTransformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateTransformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
