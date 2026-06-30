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
package com.tencentcloudapi.cngw.v20230418;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cngw.v20230418.models.*;

public class CngwClient extends AbstractClient{
    private static String endpoint = "cngw.tencentcloudapi.com";
    private static String service = "cngw";
    private static String version = "2023-04-18";

    public CngwClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CngwClient(Credential credential, String region, ClientProfile profile) {
        super(CngwClient.endpoint, CngwClient.version, credential, region, profile);
    }

    /**
     *为资源（模型 API / MCP Server）添加消费者组授权。
     * @param req AddCloudNativeAPIGatewayConsumerGroupAuthRequest
     * @return AddCloudNativeAPIGatewayConsumerGroupAuthResponse
     * @throws TencentCloudSDKException
     */
    public AddCloudNativeAPIGatewayConsumerGroupAuthResponse AddCloudNativeAPIGatewayConsumerGroupAuth(AddCloudNativeAPIGatewayConsumerGroupAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCloudNativeAPIGatewayConsumerGroupAuth", AddCloudNativeAPIGatewayConsumerGroupAuthResponse.class);
    }

    /**
     *将消费者添加到消费者组。
     * @param req AddCloudNativeAPIGatewayConsumerInGroupRequest
     * @return AddCloudNativeAPIGatewayConsumerInGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddCloudNativeAPIGatewayConsumerInGroupResponse AddCloudNativeAPIGatewayConsumerInGroup(AddCloudNativeAPIGatewayConsumerInGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddCloudNativeAPIGatewayConsumerInGroup", AddCloudNativeAPIGatewayConsumerInGroupResponse.class);
    }

    /**
     *添加密钥与资源的引用关系接口
     * @param req BindCloudNativeAPIGatewaySecretKeyRequest
     * @return BindCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudNativeAPIGatewaySecretKeyResponse BindCloudNativeAPIGatewaySecretKey(BindCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudNativeAPIGatewaySecretKey", BindCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *创建AI网关消费者。
     * @param req CreateCloudNativeAPIGatewayConsumerRequest
     * @return CreateCloudNativeAPIGatewayConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayConsumerResponse CreateCloudNativeAPIGatewayConsumer(CreateCloudNativeAPIGatewayConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayConsumer", CreateCloudNativeAPIGatewayConsumerResponse.class);
    }

    /**
     *创建AI 网关消费者组
     * @param req CreateCloudNativeAPIGatewayConsumerGroupRequest
     * @return CreateCloudNativeAPIGatewayConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayConsumerGroupResponse CreateCloudNativeAPIGatewayConsumerGroup(CreateCloudNativeAPIGatewayConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayConsumerGroup", CreateCloudNativeAPIGatewayConsumerGroupResponse.class);
    }

    /**
     *创建 LLM 模型 API。
     * @param req CreateCloudNativeAPIGatewayLLMModelAPIRequest
     * @return CreateCloudNativeAPIGatewayLLMModelAPIResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayLLMModelAPIResponse CreateCloudNativeAPIGatewayLLMModelAPI(CreateCloudNativeAPIGatewayLLMModelAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayLLMModelAPI", CreateCloudNativeAPIGatewayLLMModelAPIResponse.class);
    }

    /**
     *创建 LLM 模型服务。同一网关下 Name 唯一。
     * @param req CreateCloudNativeAPIGatewayLLMModelServiceRequest
     * @return CreateCloudNativeAPIGatewayLLMModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayLLMModelServiceResponse CreateCloudNativeAPIGatewayLLMModelService(CreateCloudNativeAPIGatewayLLMModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayLLMModelService", CreateCloudNativeAPIGatewayLLMModelServiceResponse.class);
    }

    /**
     *创建AI网关MCP Server
     * @param req CreateCloudNativeAPIGatewayMCPServerRequest
     * @return CreateCloudNativeAPIGatewayMCPServerResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayMCPServerResponse CreateCloudNativeAPIGatewayMCPServer(CreateCloudNativeAPIGatewayMCPServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayMCPServer", CreateCloudNativeAPIGatewayMCPServerResponse.class);
    }

    /**
     *创建AI网关MCP Tool
     * @param req CreateCloudNativeAPIGatewayMCPToolRequest
     * @return CreateCloudNativeAPIGatewayMCPToolResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayMCPToolResponse CreateCloudNativeAPIGatewayMCPTool(CreateCloudNativeAPIGatewayMCPToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayMCPTool", CreateCloudNativeAPIGatewayMCPToolResponse.class);
    }

    /**
     *创建消费者密钥。
     * @param req CreateCloudNativeAPIGatewaySecretKeyRequest
     * @return CreateCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewaySecretKeyResponse CreateCloudNativeAPIGatewaySecretKey(CreateCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewaySecretKey", CreateCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *删除AI 网关消费者（被绑定到消费者组/密钥时需先解绑）。
     * @param req DeleteCloudNativeAPIGatewayConsumerRequest
     * @return DeleteCloudNativeAPIGatewayConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayConsumerResponse DeleteCloudNativeAPIGatewayConsumer(DeleteCloudNativeAPIGatewayConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayConsumer", DeleteCloudNativeAPIGatewayConsumerResponse.class);
    }

    /**
     *删除AI网关消费者组
     * @param req DeleteCloudNativeAPIGatewayConsumerGroupRequest
     * @return DeleteCloudNativeAPIGatewayConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayConsumerGroupResponse DeleteCloudNativeAPIGatewayConsumerGroup(DeleteCloudNativeAPIGatewayConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayConsumerGroup", DeleteCloudNativeAPIGatewayConsumerGroupResponse.class);
    }

    /**
     *删除 LLM 模型 API。
     * @param req DeleteCloudNativeAPIGatewayLLMModelAPIRequest
     * @return DeleteCloudNativeAPIGatewayLLMModelAPIResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayLLMModelAPIResponse DeleteCloudNativeAPIGatewayLLMModelAPI(DeleteCloudNativeAPIGatewayLLMModelAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayLLMModelAPI", DeleteCloudNativeAPIGatewayLLMModelAPIResponse.class);
    }

    /**
     *删除 LLM 模型服务（被模型 API 绑定时需先解绑）。
     * @param req DeleteCloudNativeAPIGatewayLLMModelServiceRequest
     * @return DeleteCloudNativeAPIGatewayLLMModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayLLMModelServiceResponse DeleteCloudNativeAPIGatewayLLMModelService(DeleteCloudNativeAPIGatewayLLMModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayLLMModelService", DeleteCloudNativeAPIGatewayLLMModelServiceResponse.class);
    }

    /**
     *删除AI网关MCP服务
     * @param req DeleteCloudNativeAPIGatewayMCPServerRequest
     * @return DeleteCloudNativeAPIGatewayMCPServerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayMCPServerResponse DeleteCloudNativeAPIGatewayMCPServer(DeleteCloudNativeAPIGatewayMCPServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayMCPServer", DeleteCloudNativeAPIGatewayMCPServerResponse.class);
    }

    /**
     *删除AI网关MCP Tool
     * @param req DeleteCloudNativeAPIGatewayMCPToolRequest
     * @return DeleteCloudNativeAPIGatewayMCPToolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayMCPToolResponse DeleteCloudNativeAPIGatewayMCPTool(DeleteCloudNativeAPIGatewayMCPToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayMCPTool", DeleteCloudNativeAPIGatewayMCPToolResponse.class);
    }

    /**
     *删除消费者密钥（被绑定时需先解绑）。
     * @param req DeleteCloudNativeAPIGatewaySecretKeyRequest
     * @return DeleteCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewaySecretKeyResponse DeleteCloudNativeAPIGatewaySecretKey(DeleteCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewaySecretKey", DeleteCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *查询云原生消费者详情
     * @param req DescribeCloudNativeAPIGatewayConsumerRequest
     * @return DescribeCloudNativeAPIGatewayConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayConsumerResponse DescribeCloudNativeAPIGatewayConsumer(DescribeCloudNativeAPIGatewayConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayConsumer", DescribeCloudNativeAPIGatewayConsumerResponse.class);
    }

    /**
     *查询消费者组详情。
     * @param req DescribeCloudNativeAPIGatewayConsumerGroupRequest
     * @return DescribeCloudNativeAPIGatewayConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayConsumerGroupResponse DescribeCloudNativeAPIGatewayConsumerGroup(DescribeCloudNativeAPIGatewayConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayConsumerGroup", DescribeCloudNativeAPIGatewayConsumerGroupResponse.class);
    }

    /**
     *查询单个 LLM 模型 API 详情。
     * @param req DescribeCloudNativeAPIGatewayLLMModelAPIRequest
     * @return DescribeCloudNativeAPIGatewayLLMModelAPIResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMModelAPIResponse DescribeCloudNativeAPIGatewayLLMModelAPI(DescribeCloudNativeAPIGatewayLLMModelAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMModelAPI", DescribeCloudNativeAPIGatewayLLMModelAPIResponse.class);
    }

    /**
     *查询 LLM 模型 API 列表。
     * @param req DescribeCloudNativeAPIGatewayLLMModelAPIsRequest
     * @return DescribeCloudNativeAPIGatewayLLMModelAPIsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMModelAPIsResponse DescribeCloudNativeAPIGatewayLLMModelAPIs(DescribeCloudNativeAPIGatewayLLMModelAPIsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMModelAPIs", DescribeCloudNativeAPIGatewayLLMModelAPIsResponse.class);
    }

    /**
     *查询单个 LLM 模型服务详情。
     * @param req DescribeCloudNativeAPIGatewayLLMModelServiceRequest
     * @return DescribeCloudNativeAPIGatewayLLMModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMModelServiceResponse DescribeCloudNativeAPIGatewayLLMModelService(DescribeCloudNativeAPIGatewayLLMModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMModelService", DescribeCloudNativeAPIGatewayLLMModelServiceResponse.class);
    }

    /**
     *查询 LLM 模型服务列表。
     * @param req DescribeCloudNativeAPIGatewayLLMModelServicesRequest
     * @return DescribeCloudNativeAPIGatewayLLMModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMModelServicesResponse DescribeCloudNativeAPIGatewayLLMModelServices(DescribeCloudNativeAPIGatewayLLMModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMModelServices", DescribeCloudNativeAPIGatewayLLMModelServicesResponse.class);
    }

    /**
     *查询 AI 网关Token 消耗统计
     * @param req DescribeCloudNativeAPIGatewayLLMTokenUsageListRequest
     * @return DescribeCloudNativeAPIGatewayLLMTokenUsageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMTokenUsageListResponse DescribeCloudNativeAPIGatewayLLMTokenUsageList(DescribeCloudNativeAPIGatewayLLMTokenUsageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMTokenUsageList", DescribeCloudNativeAPIGatewayLLMTokenUsageListResponse.class);
    }

    /**
     *查询 AI 网关Token 消耗统计汇总
     * @param req DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsRequest
     * @return DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsResponse DescribeCloudNativeAPIGatewayLLMTokenUsageStatistics(DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMTokenUsageStatistics", DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsResponse.class);
    }

    /**
     *查询AI 网关MCP服务信息
     * @param req DescribeCloudNativeAPIGatewayMCPServerRequest
     * @return DescribeCloudNativeAPIGatewayMCPServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPServerResponse DescribeCloudNativeAPIGatewayMCPServer(DescribeCloudNativeAPIGatewayMCPServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPServer", DescribeCloudNativeAPIGatewayMCPServerResponse.class);
    }

    /**
     *查看 MCP Server ACL
     * @param req DescribeCloudNativeAPIGatewayMCPServerACLRequest
     * @return DescribeCloudNativeAPIGatewayMCPServerACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPServerACLResponse DescribeCloudNativeAPIGatewayMCPServerACL(DescribeCloudNativeAPIGatewayMCPServerACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPServerACL", DescribeCloudNativeAPIGatewayMCPServerACLResponse.class);
    }

    /**
     *查询 MCP Server 的认证配置
     * @param req DescribeCloudNativeAPIGatewayMCPServerAuthRequest
     * @return DescribeCloudNativeAPIGatewayMCPServerAuthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPServerAuthResponse DescribeCloudNativeAPIGatewayMCPServerAuth(DescribeCloudNativeAPIGatewayMCPServerAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPServerAuth", DescribeCloudNativeAPIGatewayMCPServerAuthResponse.class);
    }

    /**
     *AI网关查询MCP服务列表
     * @param req DescribeCloudNativeAPIGatewayMCPServerListRequest
     * @return DescribeCloudNativeAPIGatewayMCPServerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPServerListResponse DescribeCloudNativeAPIGatewayMCPServerList(DescribeCloudNativeAPIGatewayMCPServerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPServerList", DescribeCloudNativeAPIGatewayMCPServerListResponse.class);
    }

    /**
     *查看AI网关MCP Tool
     * @param req DescribeCloudNativeAPIGatewayMCPToolRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolResponse DescribeCloudNativeAPIGatewayMCPTool(DescribeCloudNativeAPIGatewayMCPToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPTool", DescribeCloudNativeAPIGatewayMCPToolResponse.class);
    }

    /**
     *查询云原生网关 MCP Server 下所有 Tool 的 ACL 状态一览（含 Server ACLType 回显）。
     * @param req DescribeCloudNativeAPIGatewayMCPToolACLListRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolACLListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolACLListResponse DescribeCloudNativeAPIGatewayMCPToolACLList(DescribeCloudNativeAPIGatewayMCPToolACLListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPToolACLList", DescribeCloudNativeAPIGatewayMCPToolACLListResponse.class);
    }

    /**
     *查询 AI 网关MCP Tool 列表
     * @param req DescribeCloudNativeAPIGatewayMCPToolListRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolListResponse DescribeCloudNativeAPIGatewayMCPToolList(DescribeCloudNativeAPIGatewayMCPToolListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPToolList", DescribeCloudNativeAPIGatewayMCPToolListResponse.class);
    }

    /**
     *查询密钥详情（SecretValue 字段会被掩码）。
     * @param req DescribeCloudNativeAPIGatewaySecretKeyRequest
     * @return DescribeCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaySecretKeyResponse DescribeCloudNativeAPIGatewaySecretKey(DescribeCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewaySecretKey", DescribeCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *查询密钥明文值（KMS 类型密钥不可获取）。
     * @param req DescribeCloudNativeAPIGatewaySecretKeyValueRequest
     * @return DescribeCloudNativeAPIGatewaySecretKeyValueResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaySecretKeyValueResponse DescribeCloudNativeAPIGatewaySecretKeyValue(DescribeCloudNativeAPIGatewaySecretKeyValueRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewaySecretKeyValue", DescribeCloudNativeAPIGatewaySecretKeyValueResponse.class);
    }

    /**
     *修改AI网关消费者
     * @param req ModifyCloudNativeAPIGatewayConsumerRequest
     * @return ModifyCloudNativeAPIGatewayConsumerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayConsumerResponse ModifyCloudNativeAPIGatewayConsumer(ModifyCloudNativeAPIGatewayConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayConsumer", ModifyCloudNativeAPIGatewayConsumerResponse.class);
    }

    /**
     *修改消费者组。
     * @param req ModifyCloudNativeAPIGatewayConsumerGroupRequest
     * @return ModifyCloudNativeAPIGatewayConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayConsumerGroupResponse ModifyCloudNativeAPIGatewayConsumerGroup(ModifyCloudNativeAPIGatewayConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayConsumerGroup", ModifyCloudNativeAPIGatewayConsumerGroupResponse.class);
    }

    /**
     *修改 LLM 模型 API。
     * @param req ModifyCloudNativeAPIGatewayLLMModelAPIRequest
     * @return ModifyCloudNativeAPIGatewayLLMModelAPIResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayLLMModelAPIResponse ModifyCloudNativeAPIGatewayLLMModelAPI(ModifyCloudNativeAPIGatewayLLMModelAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayLLMModelAPI", ModifyCloudNativeAPIGatewayLLMModelAPIResponse.class);
    }

    /**
     *修改 LLM 模型服务。
     * @param req ModifyCloudNativeAPIGatewayLLMModelServiceRequest
     * @return ModifyCloudNativeAPIGatewayLLMModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayLLMModelServiceResponse ModifyCloudNativeAPIGatewayLLMModelService(ModifyCloudNativeAPIGatewayLLMModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayLLMModelService", ModifyCloudNativeAPIGatewayLLMModelServiceResponse.class);
    }

    /**
     *修改MCP服务配置
     * @param req ModifyCloudNativeAPIGatewayMCPServerRequest
     * @return ModifyCloudNativeAPIGatewayMCPServerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPServerResponse ModifyCloudNativeAPIGatewayMCPServer(ModifyCloudNativeAPIGatewayMCPServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPServer", ModifyCloudNativeAPIGatewayMCPServerResponse.class);
    }

    /**
     *修改 MCP Server ACL
     * @param req ModifyCloudNativeAPIGatewayMCPServerACLRequest
     * @return ModifyCloudNativeAPIGatewayMCPServerACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPServerACLResponse ModifyCloudNativeAPIGatewayMCPServerACL(ModifyCloudNativeAPIGatewayMCPServerACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPServerACL", ModifyCloudNativeAPIGatewayMCPServerACLResponse.class);
    }

    /**
     *修改 MCP Server 的认证配置
     * @param req ModifyCloudNativeAPIGatewayMCPServerAuthRequest
     * @return ModifyCloudNativeAPIGatewayMCPServerAuthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPServerAuthResponse ModifyCloudNativeAPIGatewayMCPServerAuth(ModifyCloudNativeAPIGatewayMCPServerAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPServerAuth", ModifyCloudNativeAPIGatewayMCPServerAuthResponse.class);
    }

    /**
     *创建AI 网关MCP Server
     * @param req ModifyCloudNativeAPIGatewayMCPServerStatusRequest
     * @return ModifyCloudNativeAPIGatewayMCPServerStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPServerStatusResponse ModifyCloudNativeAPIGatewayMCPServerStatus(ModifyCloudNativeAPIGatewayMCPServerStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPServerStatus", ModifyCloudNativeAPIGatewayMCPServerStatusResponse.class);
    }

    /**
     *修改AI网关MCP Tool
     * @param req ModifyCloudNativeAPIGatewayMCPToolRequest
     * @return ModifyCloudNativeAPIGatewayMCPToolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPToolResponse ModifyCloudNativeAPIGatewayMCPTool(ModifyCloudNativeAPIGatewayMCPToolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPTool", ModifyCloudNativeAPIGatewayMCPToolResponse.class);
    }

    /**
     *修改 MCP Server Tool ACL
     * @param req ModifyCloudNativeAPIGatewayMCPToolACLRequest
     * @return ModifyCloudNativeAPIGatewayMCPToolACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPToolACLResponse ModifyCloudNativeAPIGatewayMCPToolACL(ModifyCloudNativeAPIGatewayMCPToolACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPToolACL", ModifyCloudNativeAPIGatewayMCPToolACLResponse.class);
    }

    /**
     *AI网关修改MCP Tool上下线状态
     * @param req ModifyCloudNativeAPIGatewayMCPToolStatusRequest
     * @return ModifyCloudNativeAPIGatewayMCPToolStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPToolStatusResponse ModifyCloudNativeAPIGatewayMCPToolStatus(ModifyCloudNativeAPIGatewayMCPToolStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPToolStatus", ModifyCloudNativeAPIGatewayMCPToolStatusResponse.class);
    }

    /**
     *修改AI网关密钥
     * @param req ModifyCloudNativeAPIGatewaySecretKeyRequest
     * @return ModifyCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewaySecretKeyResponse ModifyCloudNativeAPIGatewaySecretKey(ModifyCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewaySecretKey", ModifyCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *从资源（模型 API / MCP Server）移除消费者组授权。
     * @param req RemoveCloudNativeAPIGatewayConsumerGroupAuthRequest
     * @return RemoveCloudNativeAPIGatewayConsumerGroupAuthResponse
     * @throws TencentCloudSDKException
     */
    public RemoveCloudNativeAPIGatewayConsumerGroupAuthResponse RemoveCloudNativeAPIGatewayConsumerGroupAuth(RemoveCloudNativeAPIGatewayConsumerGroupAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveCloudNativeAPIGatewayConsumerGroupAuth", RemoveCloudNativeAPIGatewayConsumerGroupAuthResponse.class);
    }

    /**
     *将消费者从消费者组移除。
     * @param req RemoveCloudNativeAPIGatewayConsumerInGroupRequest
     * @return RemoveCloudNativeAPIGatewayConsumerInGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveCloudNativeAPIGatewayConsumerInGroupResponse RemoveCloudNativeAPIGatewayConsumerInGroup(RemoveCloudNativeAPIGatewayConsumerInGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveCloudNativeAPIGatewayConsumerInGroup", RemoveCloudNativeAPIGatewayConsumerInGroupResponse.class);
    }

    /**
     *解绑密钥
     * @param req UnbindCloudNativeAPIGatewaySecretKeyRequest
     * @return UnbindCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCloudNativeAPIGatewaySecretKeyResponse UnbindCloudNativeAPIGatewaySecretKey(UnbindCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCloudNativeAPIGatewaySecretKey", UnbindCloudNativeAPIGatewaySecretKeyResponse.class);
    }

}
