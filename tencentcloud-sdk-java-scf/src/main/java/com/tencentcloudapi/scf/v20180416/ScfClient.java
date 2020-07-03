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
        JsonResponseModel<CopyFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CopyFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CopyFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为某个函数版本创建一个别名，您可以使用别名来标记特定的函数版本，如DEV/RELEASE版本，也可以随时修改别名指向的版本。
一个别名必须指向一个主版本，此外还可以同时指向一个附加版本。调用函数时指定特定的别名，则请求会被发送到别名指向的版本上，您可以配置请求发送到主版本和附加版本的比例。
     * @param req CreateAliasRequest
     * @return CreateAliasResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasResponse CreateAlias(CreateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入参数创建新的函数。
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入的参数创建命名空间。
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据参数输入设置新的触发方式。
     * @param req CreateTriggerRequest
     * @return CreateTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerResponse CreateTrigger(CreateTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个函数版本的别名
     * @param req DeleteAliasRequest
     * @return DeleteAliasResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasResponse DeleteAlias(DeleteAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入参数删除函数。
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定层的指定版本，被删除的版本无法再关联到函数上，但不会影响正在引用这个层的函数。
     * @param req DeleteLayerVersionRequest
     * @return DeleteLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLayerVersionResponse DeleteLayerVersion(DeleteLayerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLayerVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLayerVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLayerVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入的参数创建命名空间。
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据参数传入删除已有的触发方式。
     * @param req DeleteTriggerRequest
     * @return DeleteTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerResponse DeleteTrigger(DeleteTriggerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTriggerResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTriggerResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTrigger"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取别名的详细信息，包括名称、描述、版本、路由信息等。
     * @param req GetAliasRequest
     * @return GetAliasResponse
     * @throws TencentCloudSDKException
     */
    public GetAliasResponse GetAlias(GetAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口获取某个函数的详细信息，包括名称、代码、处理方法、关联触发器和超时时间等字段。
     * @param req GetFunctionRequest
     * @return GetFunctionResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionResponse GetFunction(GetFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于获取函数代码包的下载地址。
     * @param req GetFunctionAddressRequest
     * @return GetFunctionAddressResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionAddressResponse GetFunctionAddress(GetFunctionAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetFunctionAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据指定的日志查询条件返回函数运行日志。
     * @param req GetFunctionLogsRequest
     * @return GetFunctionLogsResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionLogsResponse GetFunctionLogs(GetFunctionLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFunctionLogsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetFunctionLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetFunctionLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取层版本详细信息，包括用于下载层中文件的链接。
     * @param req GetLayerVersionRequest
     * @return GetLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetLayerVersionResponse GetLayerVersion(GetLayerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLayerVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetLayerVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetLayerVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于运行函数。
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse Invoke(InvokeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Invoke"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回一个函数下的全部别名，可以根据特定函数版本过滤。
     * @param req ListAliasesRequest
     * @return ListAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ListAliasesResponse ListAliases(ListAliasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAliasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListAliasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListAliases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入的查询参数返回相关函数信息。
     * @param req ListFunctionsRequest
     * @return ListFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public ListFunctionsResponse ListFunctions(ListFunctionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFunctionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListFunctionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListFunctions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回指定层的全部版本的信息
     * @param req ListLayerVersionsRequest
     * @return ListLayerVersionsResponse
     * @throws TencentCloudSDKException
     */
    public ListLayerVersionsResponse ListLayerVersions(ListLayerVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLayerVersionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListLayerVersionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListLayerVersions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回全部层的列表，其中包含了每个层最新版本的信息，可以通过适配运行时进行过滤。
     * @param req ListLayersRequest
     * @return ListLayersResponse
     * @throws TencentCloudSDKException
     */
    public ListLayersResponse ListLayers(ListLayersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLayersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListLayersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListLayers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列出命名空间列表
     * @param req ListNamespacesRequest
     * @return ListNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public ListNamespacesResponse ListNamespaces(ListNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListNamespacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListNamespacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListNamespaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取函数触发器列表
     * @param req ListTriggersRequest
     * @return ListTriggersResponse
     * @throws TencentCloudSDKException
     */
    public ListTriggersResponse ListTriggers(ListTriggersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListTriggersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListTriggersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListTriggers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入的参数查询函数的版本。
     * @param req ListVersionByFunctionRequest
     * @return ListVersionByFunctionResponse
     * @throws TencentCloudSDKException
     */
    public ListVersionByFunctionResponse ListVersionByFunction(ListVersionByFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListVersionByFunctionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListVersionByFunctionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListVersionByFunction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用给定的zip文件或cos对象创建一个层的新版本，每次使用相同的层的名称调用本接口，都会生成一个新版本。
     * @param req PublishLayerVersionRequest
     * @return PublishLayerVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishLayerVersionResponse PublishLayerVersion(PublishLayerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishLayerVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PublishLayerVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishLayerVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于用户发布新版本函数。
     * @param req PublishVersionRequest
     * @return PublishVersionResponse
     * @throws TencentCloudSDKException
     */
    public PublishVersionResponse PublishVersion(PublishVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishVersionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PublishVersionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishVersion"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新别名的配置
     * @param req UpdateAliasRequest
     * @return UpdateAliasResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAliasResponse UpdateAlias(UpdateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAliasResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入参数更新函数代码。
     * @param req UpdateFunctionCodeRequest
     * @return UpdateFunctionCodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionCodeResponse UpdateFunctionCode(UpdateFunctionCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFunctionCodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionCodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateFunctionCode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口根据传入参数更新函数配置。
     * @param req UpdateFunctionConfigurationRequest
     * @return UpdateFunctionConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionConfigurationResponse UpdateFunctionConfiguration(UpdateFunctionConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFunctionConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFunctionConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateFunctionConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新命名空间
     * @param req UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateNamespaceResponse UpdateNamespace(UpdateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateNamespaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateNamespaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateNamespace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
