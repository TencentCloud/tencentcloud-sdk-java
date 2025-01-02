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
package com.tencentcloudapi.scf.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.scf.v20180416.models.*;

public class ScfClient extends AbstractClient{
    private static String endpoint = "scf.tencentcloudapi.com";
    private static String service = "scf";
    private static String version = "2018-04-16";
    
    public ScfClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ScfClient(Credential credential, String region, ClientProfile profile) {
        super(ScfClient.endpoint, ScfClient.version, credential, region, profile);
    }

    /**
     *复制一个函数，您可以选择将复制出的新函数放置在特定的Region和Namespace。
注：本接口**不会**复制函数的以下对象或属性：
1. 函数的触发器
2. 除了$LATEST以外的其它版本
3. 函数配置的日志投递到的CLS目标。

如有需要，您可以在复制后手动配置新函数。
     * @param req CopyFunctionRequest
     * @return CopyFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CopyFunctionResponse CopyFunction(CopyFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CopyFunction", CopyFunctionResponse.class);
    }

    /**
     *为某个函数版本创建一个别名，您可以使用别名来标记特定的函数版本，如DEV/RELEASE版本，也可以随时修改别名指向的版本。
一个别名必须指向一个主版本，此外还可以同时指向一个附加版本。调用函数时指定特定的别名，则请求会被发送到别名指向的版本上，您可以配置请求发送到主版本和附加版本的比例。
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlias", CreateAliasResponse.class);
    }

    /**
     *创建自定义域名
     * @param req CreateCustomDomainRequest
     * @return CreateCustomDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomDomainResponse CreateCustomDomain(CreateCustomDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomDomain", CreateCustomDomainResponse.class);
    }

    /**
     *该接口根据传入参数创建新的函数。
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFunction", CreateFunctionResponse.class);
    }

    /**
     *该接口根据传入的参数创建命名空间。
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
    }

    /**
     *该接口根据参数输入设置新的触发方式。
     * @param req CreateTriggerRequest
     * @return CreateTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerResponse CreateTrigger(CreateTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrigger", CreateTriggerResponse.class);
    }

    /**
     *删除一个函数版本的别名
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlias", DeleteAliasResponse.class);
    }

    /**
     *删除自定义域名
     * @param req DeleteCustomDomainRequest
     * @return DeleteCustomDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomDomainResponse DeleteCustomDomain(DeleteCustomDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCustomDomain", DeleteCustomDomainResponse.class);
    }

    /**
     *该接口根据传入参数删除函数。
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunction", DeleteFunctionResponse.class);
    }

    /**
     *该接口根据传入参数删除函数的指定版本。
     * @param req DeleteFunctionVersionRequest
     * @return DeleteFunctionVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionVersionResponse DeleteFunctionVersion(DeleteFunctionVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFunctionVersion", DeleteFunctionVersionResponse.class);
    }

    /**
     *删除指定层的指定版本，被删除的版本无法再关联到函数上，但不会影响正在引用这个层的函数。
     * @param req DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLayerVersionResponse DeleteLayerVersion(DeleteLayerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLayerVersion", DeleteLayerVersionResponse.class);
    }

    /**
     *该接口根据传入的参数删除命名空间。
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNamespace", DeleteNamespaceResponse.class);
    }

    /**
     *删除函数版本的预置并发配置。
     * @param req DeleteProvisionedConcurrencyConfigRequest
     * @return DeleteProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProvisionedConcurrencyConfigResponse DeleteProvisionedConcurrencyConfig(DeleteProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProvisionedConcurrencyConfig", DeleteProvisionedConcurrencyConfigResponse.class);
    }

    /**
     *删除函数的最大独占配额配置。
     * @param req DeleteReservedConcurrencyConfigRequest
     * @return DeleteReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReservedConcurrencyConfigResponse DeleteReservedConcurrencyConfig(DeleteReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReservedConcurrencyConfig", DeleteReservedConcurrencyConfigResponse.class);
    }

    /**
     *该接口根据参数传入删除已有的触发方式。
     * @param req DeleteTriggerRequest
     * @return DeleteTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerResponse DeleteTrigger(DeleteTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrigger", DeleteTriggerResponse.class);
    }

    /**
     *获取账户信息
     * @param req GetAccountRequest
     * @return GetAccountResponse
     * @throws TencentCloudSDKException
     */
    public GetAccountResponse GetAccount(GetAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAccount", GetAccountResponse.class);
    }

    /**
     *获取别名的详细信息，包括名称、描述、版本、路由信息等。
     * @param req GetAliasRequest
     * @return GetAliasResponse
     * @throws TencentCloudSDKException
     */
    public GetAliasResponse GetAlias(GetAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlias", GetAliasResponse.class);
    }

    /**
     *获取函数异步执行事件状态，事件状态保留 3 * 24 小时（从事件完成开始计时）。
     * @param req GetAsyncEventStatusRequest
     * @return GetAsyncEventStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetAsyncEventStatusResponse GetAsyncEventStatus(GetAsyncEventStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAsyncEventStatus", GetAsyncEventStatusResponse.class);
    }

    /**
     *查看云函数自定义域名详情
     * @param req GetCustomDomainRequest
     * @return GetCustomDomainResponse
     * @throws TencentCloudSDKException
     */
    public GetCustomDomainResponse GetCustomDomain(GetCustomDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCustomDomain", GetCustomDomainResponse.class);
    }

    /**
     *该接口获取某个函数的详细信息，包括名称、代码、处理方法、关联触发器和超时时间等字段。
     * @param req GetFunctionRequest
     * @return GetFunctionResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionResponse GetFunction(GetFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunction", GetFunctionResponse.class);
    }

    /**
     *该接口用于获取函数代码包的下载地址。
     * @param req GetFunctionAddressRequest
     * @return GetFunctionAddressResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionAddressResponse GetFunctionAddress(GetFunctionAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunctionAddress", GetFunctionAddressResponse.class);
    }

    /**
     *获取函数异步重试配置，包括重试次数和消息保留时间
     * @param req GetFunctionEventInvokeConfigRequest
     * @return GetFunctionEventInvokeConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionEventInvokeConfigResponse GetFunctionEventInvokeConfig(GetFunctionEventInvokeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunctionEventInvokeConfig", GetFunctionEventInvokeConfigResponse.class);
    }

    /**
     *该接口根据指定的日志查询条件返回函数运行日志。该接口已下线，查询函数请求运行的返回信息，请使用 [GetRequestStatus](https://cloud.tencent.com/document/product/583/65348)。查询函数运行日志，请参考[日志检索教程](https://cloud.tencent.com/document/product/583/52637)。
     * @param req GetFunctionLogsRequest
     * @return GetFunctionLogsResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionLogsResponse GetFunctionLogs(GetFunctionLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFunctionLogs", GetFunctionLogsResponse.class);
    }

    /**
     *获取层版本详细信息，包括用于下载层中文件的链接。
     * @param req GetLayerVersionRequest
     * @return GetLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetLayerVersionResponse GetLayerVersion(GetLayerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLayerVersion", GetLayerVersionResponse.class);
    }

    /**
     *获取函数或函数某一版本的预置并发详情。
     * @param req GetProvisionedConcurrencyConfigRequest
     * @return GetProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetProvisionedConcurrencyConfigResponse GetProvisionedConcurrencyConfig(GetProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProvisionedConcurrencyConfig", GetProvisionedConcurrencyConfigResponse.class);
    }

    /**
     *该接口根据指定的查询条件返回函数单个请求运行状态。
     * @param req GetRequestStatusRequest
     * @return GetRequestStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetRequestStatusResponse GetRequestStatus(GetRequestStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRequestStatus", GetRequestStatusResponse.class);
    }

    /**
     *获取函数的最大独占配额详情。
     * @param req GetReservedConcurrencyConfigRequest
     * @return GetReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public GetReservedConcurrencyConfigResponse GetReservedConcurrencyConfig(GetReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetReservedConcurrencyConfig", GetReservedConcurrencyConfigResponse.class);
    }

    /**
     *该接口用于运行函数。
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse Invoke(InvokeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Invoke", InvokeResponse.class);
    }

    /**
     *SCF同步调用函数接口。
     * @param req InvokeFunctionRequest
     * @return InvokeFunctionResponse
     * @throws TencentCloudSDKException
     */
    public InvokeFunctionResponse InvokeFunction(InvokeFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeFunction", InvokeFunctionResponse.class);
    }

    /**
     *返回一个函数下的全部别名，可以根据特定函数版本过滤。
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAliases", ListAliasesResponse.class);
    }

    /**
     *拉取函数异步事件列表
     * @param req ListAsyncEventsRequest
     * @return ListAsyncEventsResponse
     * @throws TencentCloudSDKException
     */
    public ListAsyncEventsResponse ListAsyncEvents(ListAsyncEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAsyncEvents", ListAsyncEventsResponse.class);
    }

    /**
     *遍历域名列表信息
     * @param req ListCustomDomainsRequest
     * @return ListCustomDomainsResponse
     * @throws TencentCloudSDKException
     */
    public ListCustomDomainsResponse ListCustomDomains(ListCustomDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListCustomDomains", ListCustomDomainsResponse.class);
    }

    /**
     *该接口根据传入的查询参数返回相关函数信息。
     * @param req ListFunctionsRequest
     * @return ListFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public ListFunctionsResponse ListFunctions(ListFunctionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFunctions", ListFunctionsResponse.class);
    }

    /**
     *返回指定层的全部版本的信息
     * @param req ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListLayerVersionsResponse ListLayerVersions(ListLayerVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLayerVersions", ListLayerVersionsResponse.class);
    }

    /**
     *返回全部层的列表，其中包含了每个层最新版本的信息，可以通过适配运行时进行过滤。
     * @param req ListLayersRequest
     * @return ListLayersResponse
     * @throws TencentCloudSDKException
     */
    public ListLayersResponse ListLayers(ListLayersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLayers", ListLayersResponse.class);
    }

    /**
     *列出命名空间列表
     * @param req ListNamespacesRequest
     * @return ListNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public ListNamespacesResponse ListNamespaces(ListNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListNamespaces", ListNamespacesResponse.class);
    }

    /**
     *获取函数触发器列表
     * @param req ListTriggersRequest
     * @return ListTriggersResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggersResponse ListTriggers(ListTriggersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTriggers", ListTriggersResponse.class);
    }

    /**
     *该接口根据传入的参数查询函数的版本。
     * @param req ListVersionByFunctionRequest
     * @return ListVersionByFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ListVersionByFunctionResponse ListVersionByFunction(ListVersionByFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVersionByFunction", ListVersionByFunctionResponse.class);
    }

    /**
     *使用给定的zip文件或cos对象创建一个层的新版本，每次使用相同的层的名称调用本接口，都会生成一个新版本。
     * @param req PublishLayerVersionRequest
     * @return PublishLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishLayerVersionResponse PublishLayerVersion(PublishLayerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishLayerVersion", PublishLayerVersionResponse.class);
    }

    /**
     *该接口用于用户发布新版本函数。
     * @param req PublishVersionRequest
     * @return PublishVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishVersionResponse PublishVersion(PublishVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishVersion", PublishVersionResponse.class);
    }

    /**
     *设置函数某一非$LATEST版本的预置并发。
     * @param req PutProvisionedConcurrencyConfigRequest
     * @return PutProvisionedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutProvisionedConcurrencyConfigResponse PutProvisionedConcurrencyConfig(PutProvisionedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutProvisionedConcurrencyConfig", PutProvisionedConcurrencyConfigResponse.class);
    }

    /**
     *设置函数最大独占配额
     * @param req PutReservedConcurrencyConfigRequest
     * @return PutReservedConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutReservedConcurrencyConfigResponse PutReservedConcurrencyConfig(PutReservedConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutReservedConcurrencyConfig", PutReservedConcurrencyConfigResponse.class);
    }

    /**
     *修改账号并发限制配额
     * @param req PutTotalConcurrencyConfigRequest
     * @return PutTotalConcurrencyConfigResponse
     * @throws TencentCloudSDKException
     */
    public PutTotalConcurrencyConfigResponse PutTotalConcurrencyConfig(PutTotalConcurrencyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PutTotalConcurrencyConfig", PutTotalConcurrencyConfigResponse.class);
    }

    /**
     *终止正在运行中的函数异步事件
     * @param req TerminateAsyncEventRequest
     * @return TerminateAsyncEventResponse
     * @throws TencentCloudSDKException
     */
    public TerminateAsyncEventResponse TerminateAsyncEvent(TerminateAsyncEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateAsyncEvent", TerminateAsyncEventResponse.class);
    }

    /**
     *更新别名的配置
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlias", UpdateAliasResponse.class);
    }

    /**
     *更新自定义域名相关配置
     * @param req UpdateCustomDomainRequest
     * @return UpdateCustomDomainResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCustomDomainResponse UpdateCustomDomain(UpdateCustomDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCustomDomain", UpdateCustomDomainResponse.class);
    }

    /**
     *该接口根据传入参数更新函数代码。
     * @param req UpdateFunctionCodeRequest
     * @return UpdateFunctionCodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionCodeResponse UpdateFunctionCode(UpdateFunctionCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFunctionCode", UpdateFunctionCodeResponse.class);
    }

    /**
     *该接口根据传入参数更新函数配置。
     * @param req UpdateFunctionConfigurationRequest
     * @return UpdateFunctionConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionConfigurationResponse UpdateFunctionConfiguration(UpdateFunctionConfigurationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFunctionConfiguration", UpdateFunctionConfigurationResponse.class);
    }

    /**
     *更新函数的异步重试配置，包括重试次数和消息保留时间
     * @param req UpdateFunctionEventInvokeConfigRequest
     * @return UpdateFunctionEventInvokeConfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionEventInvokeConfigResponse UpdateFunctionEventInvokeConfig(UpdateFunctionEventInvokeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFunctionEventInvokeConfig", UpdateFunctionEventInvokeConfigResponse.class);
    }

    /**
     *更新命名空间
     * @param req UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNamespaceResponse UpdateNamespace(UpdateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateNamespace", UpdateNamespaceResponse.class);
    }

    /**
     *支持触发器配置更新。
默认接口请求频率限制：20次/秒

注意：目前只支持timer触发器和ckafka触发器更新！

timer触发器和ckafka触发器支持更新字段有：Enable、TriggerDesc、Description、CustomArgument。

timer触发器TriggerDesc支持5段式和7段式的更新。

ckafka触发器TriggerDesc支持Retry、MaxMsgNum、TimeOut参数更新，不传值表示原值不变，传值不能为空。

Enable 触发器开启或关闭，传参为OPEN为开启，CLOSE为关闭。不传值表示原值不变，传值不能为空。

Description 触发器描述，不传值保持原值不变，传值为空则为空。

CustomArgument 触发器用户附加信息（注意：只有timer触发器展示），不传值保持原值不变，传值为空则为空。
     * @param req UpdateTriggerRequest
     * @return UpdateTriggerResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerResponse UpdateTrigger(UpdateTriggerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTrigger", UpdateTriggerResponse.class);
    }

    /**
     *更新触发器状态的值
     * @param req UpdateTriggerStatusRequest
     * @return UpdateTriggerStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTriggerStatusResponse UpdateTriggerStatus(UpdateTriggerStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTriggerStatus", UpdateTriggerStatusResponse.class);
    }

}
