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
【消费者批量自动分配 API Key｜修改：内部并发/配额逻辑，字段不变】ResourceType=Consumer 时与批量预留共用实例写锁，单消费者绑定配额使用当前锁定读。仍按原 SecretKeyId、ResourceIds 绑定；消费者目标最多一个，单密钥不能同时绑定多个消费者，成功仍返回 Result=true。此入口不新增 OperationDenied.BatchKeyPending；该错误属于下述四个变更入口的保护逻辑。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
     * @param req BindCloudNativeAPIGatewaySecretKeyRequest
     * @return BindCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudNativeAPIGatewaySecretKeyResponse BindCloudNativeAPIGatewaySecretKey(BindCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudNativeAPIGatewaySecretKey", BindCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *上传插件前置操作，获取COS相关信息
     * @param req CheckCloudNativeAPIGatewayMCPRouteMatchRequest
     * @return CheckCloudNativeAPIGatewayMCPRouteMatchResponse
     * @throws TencentCloudSDKException
     */
    public CheckCloudNativeAPIGatewayMCPRouteMatchResponse CheckCloudNativeAPIGatewayMCPRouteMatch(CheckCloudNativeAPIGatewayMCPRouteMatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCloudNativeAPIGatewayMCPRouteMatch", CheckCloudNativeAPIGatewayMCPRouteMatchResponse.class);
    }

    /**
     *修改云原生智能网关MCP Tool
     * @param req CheckCloudNativeAPIGatewayMCPToolVersionExistRequest
     * @return CheckCloudNativeAPIGatewayMCPToolVersionExistResponse
     * @throws TencentCloudSDKException
     */
    public CheckCloudNativeAPIGatewayMCPToolVersionExistResponse CheckCloudNativeAPIGatewayMCPToolVersionExist(CheckCloudNativeAPIGatewayMCPToolVersionExistRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCloudNativeAPIGatewayMCPToolVersionExist", CheckCloudNativeAPIGatewayMCPToolVersionExistResponse.class);
    }

    /**
     *修改云原生智能网关MCP Tool
     * @param req CompareCloudNativeAPIGatewayMCPToolVersionRequest
     * @return CompareCloudNativeAPIGatewayMCPToolVersionResponse
     * @throws TencentCloudSDKException
     */
    public CompareCloudNativeAPIGatewayMCPToolVersionResponse CompareCloudNativeAPIGatewayMCPToolVersion(CompareCloudNativeAPIGatewayMCPToolVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CompareCloudNativeAPIGatewayMCPToolVersion", CompareCloudNativeAPIGatewayMCPToolVersionResponse.class);
    }

    /**
     *创建云原生网关AI服务来源
     * @param req CreateCloudNativeAPIGatewayAIServiceSourceRequest
     * @return CreateCloudNativeAPIGatewayAIServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayAIServiceSourceResponse CreateCloudNativeAPIGatewayAIServiceSource(CreateCloudNativeAPIGatewayAIServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayAIServiceSource", CreateCloudNativeAPIGatewayAIServiceSourceResponse.class);
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
     *上传插件前置操作，获取COS相关信息
     * @param req CreateCloudNativeAPIGatewayMCPRouteRequest
     * @return CreateCloudNativeAPIGatewayMCPRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayMCPRouteResponse CreateCloudNativeAPIGatewayMCPRoute(CreateCloudNativeAPIGatewayMCPRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayMCPRoute", CreateCloudNativeAPIGatewayMCPRouteResponse.class);
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
【消费者批量自动分配 API Key｜修改：内部并发/配额逻辑，字段不变】消费者密钥单条创建在事务中使用与批量预留相同的实例写锁，配额检查使用当前锁定读，避免单条与批量并发绕过配额。仍是单条创建；原 GenerateType、请求字段、既有配额错误语义及 Result.Success/ID 不变，不增加 ConsumerIds/ClientToken。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
     * @param req CreateCloudNativeAPIGatewaySecretKeyRequest
     * @return CreateCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewaySecretKeyResponse CreateCloudNativeAPIGatewaySecretKey(CreateCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewaySecretKey", CreateCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *删除云原生网关AI服务来源
     * @param req DeleteCloudNativeAPIGatewayAIServiceSourceRequest
     * @return DeleteCloudNativeAPIGatewayAIServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayAIServiceSourceResponse DeleteCloudNativeAPIGatewayAIServiceSource(DeleteCloudNativeAPIGatewayAIServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayAIServiceSource", DeleteCloudNativeAPIGatewayAIServiceSourceResponse.class);
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

同步组仅在 soft_deleted 状态且全部依赖已清理后允许手动硬删除；ConsumerGroupId 使用组织 UUID。存在配额规则时须先删除规则，单纯停用不能解除依赖。硬删除时重新校验，依赖变化可能导致删除失败。
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
     *上传插件前置操作，获取COS相关信息
     * @param req DeleteCloudNativeAPIGatewayMCPRouteRequest
     * @return DeleteCloudNativeAPIGatewayMCPRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayMCPRouteResponse DeleteCloudNativeAPIGatewayMCPRoute(DeleteCloudNativeAPIGatewayMCPRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayMCPRoute", DeleteCloudNativeAPIGatewayMCPRouteResponse.class);
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
     *修改云原生智能网关MCP Tool
     * @param req DeleteCloudNativeAPIGatewayMCPToolVersionRequest
     * @return DeleteCloudNativeAPIGatewayMCPToolVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayMCPToolVersionResponse DeleteCloudNativeAPIGatewayMCPToolVersion(DeleteCloudNativeAPIGatewayMCPToolVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayMCPToolVersion", DeleteCloudNativeAPIGatewayMCPToolVersionResponse.class);
    }

    /**
     *删除消费者密钥（被绑定时需先解绑）。
【消费者批量自动分配 API Key｜修改：新增未完成批次保护，字段不变】目标密钥属于批次且对应项处于 Pending/Running/Reconciling 时，删除返回 OperationDenied.BatchKeyPending。完成后仍执行原绑定/依赖删除检查；原 GatewayId/SecretKeyId 不变，成功不新增业务 Result。删除已生成密钥不改写批次历史成功，后续批次明文读取返回逐项 ResourceNotFound.SecretKey。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
     * @param req DeleteCloudNativeAPIGatewaySecretKeyRequest
     * @return DeleteCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewaySecretKeyResponse DeleteCloudNativeAPIGatewaySecretKey(DeleteCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewaySecretKey", DeleteCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *查询云原生网关服务和路由列表
     * @param req DescribeCNGWServicesWithRoutesRequest
     * @return DescribeCNGWServicesWithRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCNGWServicesWithRoutesResponse DescribeCNGWServicesWithRoutes(DescribeCNGWServicesWithRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCNGWServicesWithRoutes", DescribeCNGWServicesWithRoutesResponse.class);
    }

    /**
     *查询AI网关配额

支持 ConsumerGroup 配额，返回 ConsumerGroupPath、ConsumerGroupActive 及实际用量；失效组的规则仍可查询。
     * @param req DescribeCloudNativeAPIGatewayAIQuotaRequest
     * @return DescribeCloudNativeAPIGatewayAIQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayAIQuotaResponse DescribeCloudNativeAPIGatewayAIQuota(DescribeCloudNativeAPIGatewayAIQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayAIQuota", DescribeCloudNativeAPIGatewayAIQuotaResponse.class);
    }

    /**
     *查询AI配额配置列表

支持按 ConsumerGroup 查询组自身配额，默认仍只查询 Consumer；返回组路径、有效状态及实际用量。上下级关联配额请使用 DescribeAIGWConsumerGroupAIQuotaList。
     * @param req DescribeCloudNativeAPIGatewayAIQuotaListRequest
     * @return DescribeCloudNativeAPIGatewayAIQuotaListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayAIQuotaListResponse DescribeCloudNativeAPIGatewayAIQuotaList(DescribeCloudNativeAPIGatewayAIQuotaListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayAIQuotaList", DescribeCloudNativeAPIGatewayAIQuotaListResponse.class);
    }

    /**
     *查询云原生网关AI服务来源
     * @param req DescribeCloudNativeAPIGatewayAIServiceSourceListRequest
     * @return DescribeCloudNativeAPIGatewayAIServiceSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayAIServiceSourceListResponse DescribeCloudNativeAPIGatewayAIServiceSourceList(DescribeCloudNativeAPIGatewayAIServiceSourceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayAIServiceSourceList", DescribeCloudNativeAPIGatewayAIServiceSourceListResponse.class);
    }

    /**
     *查询云原生消费者详情

组织架构扩展：保留原消费者详情与完整字段，ConsumerGroups 补齐对应组织成员关系；同步成员保持目录归属隔离。
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

组织架构扩展：ConsumerGroupId 同时支持原 cg-* 和组织部门 UUID；保留状态、数量、时间和描述逻辑。原普通组状态为 Enable/Disable，目录部门状态为 active/disabled/soft_deleted。
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
     *查询指定网关实例下的所有 LLM 模型 API 列表。支持按名称关键词模糊搜索、按过滤器筛选，以及分页查询。用于绑定场景时，可通过 ConsumerGroupId 和 UseToBind 参数筛选可绑定的模型 API。
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
     *查询 AI 网关Token 消耗统计（消费者消费金额数据）
     * @param req DescribeCloudNativeAPIGatewayLLMTokenUsageListRequest
     * @return DescribeCloudNativeAPIGatewayLLMTokenUsageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMTokenUsageListResponse DescribeCloudNativeAPIGatewayLLMTokenUsageList(DescribeCloudNativeAPIGatewayLLMTokenUsageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMTokenUsageList", DescribeCloudNativeAPIGatewayLLMTokenUsageListResponse.class);
    }

    /**
     *查询 AI 网关Token 消耗统计汇总含（消费者消费金额数据）
     * @param req DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsRequest
     * @return DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsResponse DescribeCloudNativeAPIGatewayLLMTokenUsageStatistics(DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayLLMTokenUsageStatistics", DescribeCloudNativeAPIGatewayLLMTokenUsageStatisticsResponse.class);
    }

    /**
     *上传插件前置操作，获取COS相关信息
     * @param req DescribeCloudNativeAPIGatewayMCPRouteListRequest
     * @return DescribeCloudNativeAPIGatewayMCPRouteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPRouteListResponse DescribeCloudNativeAPIGatewayMCPRouteList(DescribeCloudNativeAPIGatewayMCPRouteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPRouteList", DescribeCloudNativeAPIGatewayMCPRouteListResponse.class);
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
     *查询批量导入MCP Tools的任务进度
     * @param req DescribeCloudNativeAPIGatewayMCPToolImportTaskRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolImportTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolImportTaskResponse DescribeCloudNativeAPIGatewayMCPToolImportTask(DescribeCloudNativeAPIGatewayMCPToolImportTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPToolImportTask", DescribeCloudNativeAPIGatewayMCPToolImportTaskResponse.class);
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
     *修改云原生智能网关MCP Tool
     * @param req DescribeCloudNativeAPIGatewayMCPToolVersionRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolVersionResponse DescribeCloudNativeAPIGatewayMCPToolVersion(DescribeCloudNativeAPIGatewayMCPToolVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPToolVersion", DescribeCloudNativeAPIGatewayMCPToolVersionResponse.class);
    }

    /**
     *修改云原生智能网关MCP Tool
     * @param req DescribeCloudNativeAPIGatewayMCPToolVersionListRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolVersionListResponse DescribeCloudNativeAPIGatewayMCPToolVersionList(DescribeCloudNativeAPIGatewayMCPToolVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPToolVersionList", DescribeCloudNativeAPIGatewayMCPToolVersionListResponse.class);
    }

    /**
     *从OpenAPI文件中解析出可导入的MCP tools
     * @param req DescribeCloudNativeAPIGatewayMCPToolsFromFileRequest
     * @return DescribeCloudNativeAPIGatewayMCPToolsFromFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayMCPToolsFromFileResponse DescribeCloudNativeAPIGatewayMCPToolsFromFile(DescribeCloudNativeAPIGatewayMCPToolsFromFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayMCPToolsFromFile", DescribeCloudNativeAPIGatewayMCPToolsFromFileResponse.class);
    }

    /**
     *查询密钥详情（SecretValue 字段会被掩码）。
普通版批量新建密钥的生成来源扩展：新页面按需 IncludeCreationInfo=true，省略/false 保持原响应字段。原 GenerateType 不新增 Batch；批量记录仍为 System。协议：https://iwiki.woa.com/p/4042678235。
【消费者批量自动分配 API Key｜修改：可选参数及可选出参】增加可选 IncludeCreationInfo（默认 false）。仅 true 且 ResourceType=Consumer 时在原 Result 增加 CredentialGenerateType、CreationSource、BatchId 三个非必返字段；省略/false 保持旧响应。原字段、SecretValue 脱敏和单条详情结构不变。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
     * @param req DescribeCloudNativeAPIGatewaySecretKeyRequest
     * @return DescribeCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaySecretKeyResponse DescribeCloudNativeAPIGatewaySecretKey(DescribeCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewaySecretKey", DescribeCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *查询密钥列表。
普通版批量新建密钥的生成来源扩展：新页面按需 IncludeCreationInfo=true，省略/false 保持原响应字段。原 GenerateType 不新增 Batch；批量记录仍为 System。协议：https://iwiki.woa.com/p/4042678235。
【消费者批量自动分配 API Key｜修改：可选参数、可选出参及筛选】增加可选 IncludeCreationInfo（默认 false）。仅 true 且 ResourceType=Consumer 时在原 Result.SecretKeys[] 增加 CredentialGenerateType、CreationSource、BatchId 三个非必返字段；Result.TotalCount/SecretKeys 结构不变。Filters 新增 CredentialGenerateType、CreationSource，先过滤后计数分页，与是否返回来源字段独立；保留原 GenerateType 枚举和原分页上限。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
     * @param req DescribeCloudNativeAPIGatewaySecretKeyListRequest
     * @return DescribeCloudNativeAPIGatewaySecretKeyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaySecretKeyListResponse DescribeCloudNativeAPIGatewaySecretKeyList(DescribeCloudNativeAPIGatewaySecretKeyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewaySecretKeyList", DescribeCloudNativeAPIGatewaySecretKeyListResponse.class);
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
     *修改云原生网关AI服务来源
     * @param req ModifyCloudNativeAPIGatewayAIServiceSourceRequest
     * @return ModifyCloudNativeAPIGatewayAIServiceSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayAIServiceSourceResponse ModifyCloudNativeAPIGatewayAIServiceSource(ModifyCloudNativeAPIGatewayAIServiceSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayAIServiceSource", ModifyCloudNativeAPIGatewayAIServiceSourceResponse.class);
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
     *上传插件前置操作，获取COS相关信息
     * @param req ModifyCloudNativeAPIGatewayMCPRouteRequest
     * @return ModifyCloudNativeAPIGatewayMCPRouteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPRouteResponse ModifyCloudNativeAPIGatewayMCPRoute(ModifyCloudNativeAPIGatewayMCPRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPRoute", ModifyCloudNativeAPIGatewayMCPRouteResponse.class);
    }

    /**
     *上传插件前置操作，获取COS相关信息
     * @param req ModifyCloudNativeAPIGatewayMCPRouteStatusRequest
     * @return ModifyCloudNativeAPIGatewayMCPRouteStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayMCPRouteStatusResponse ModifyCloudNativeAPIGatewayMCPRouteStatus(ModifyCloudNativeAPIGatewayMCPRouteStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayMCPRouteStatus", ModifyCloudNativeAPIGatewayMCPRouteStatusResponse.class);
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
【消费者批量自动分配 API Key｜修改：新增未完成批次保护，字段不变】目标密钥属于批次且对应项处于 Pending/Running/Reconciling 时，编辑返回 OperationDenied.BatchKeyPending，提示等待批次完成。其他情况继续原编辑校验和行为；原 GatewayId/SecretKeyId/Name/Description 不变，成功不新增业务 Result。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
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
     *修改云原生智能网关MCP Tool
     * @param req RollbackCloudNativeAPIGatewayMCPToolVersionRequest
     * @return RollbackCloudNativeAPIGatewayMCPToolVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollbackCloudNativeAPIGatewayMCPToolVersionResponse RollbackCloudNativeAPIGatewayMCPToolVersion(RollbackCloudNativeAPIGatewayMCPToolVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackCloudNativeAPIGatewayMCPToolVersion", RollbackCloudNativeAPIGatewayMCPToolVersionResponse.class);
    }

    /**
     *解绑密钥
【消费者批量自动分配 API Key｜修改：新增未完成批次保护，字段不变】目标密钥属于批次且对应项处于 Pending/Running/Reconciling 时，解绑返回 OperationDenied.BatchKeyPending。完成后继续原解绑；原 GatewayId/SecretKeyId/ResourceType/ResourceIds 不变，成功不新增业务 Result。解绑不改写批次历史成功，后续批次明文读取返回逐项 OperationDenied.BindingChanged。 完整接口清单与逐项说明：https://iwiki.woa.com/p/4042678235（第 2、2.4 节）。
     * @param req UnbindCloudNativeAPIGatewaySecretKeyRequest
     * @return UnbindCloudNativeAPIGatewaySecretKeyResponse
     * @throws TencentCloudSDKException
     */
    public UnbindCloudNativeAPIGatewaySecretKeyResponse UnbindCloudNativeAPIGatewaySecretKey(UnbindCloudNativeAPIGatewaySecretKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindCloudNativeAPIGatewaySecretKey", UnbindCloudNativeAPIGatewaySecretKeyResponse.class);
    }

    /**
     *批量导入从OpenAPI文件中解析的MCP Tools
     * @param req UpdateCloudNativeAPIGatewayMCPToolsRequest
     * @return UpdateCloudNativeAPIGatewayMCPToolsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewayMCPToolsResponse UpdateCloudNativeAPIGatewayMCPTools(UpdateCloudNativeAPIGatewayMCPToolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewayMCPTools", UpdateCloudNativeAPIGatewayMCPToolsResponse.class);
    }

}
