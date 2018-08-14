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

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public ScfClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public ScfClient(Credential credential, String region, ClientProfile profile) {
        super(ScfClient.endpoint, ScfClient.version, credential, region, profile);
    }

    /**
     *该接口根据传入参数创建新的函数。
     * @param req CreateFunctionRequest
     * @return CreateFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateFunctionResponse  CreateFunction(CreateFunctionRequest req) throws TencentCloudSDKException{
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
     *该接口根据参数输入设置新的触发方式。
     * @param req CreateTriggerRequest
     * @return CreateTriggerResponse
     * @throws TencentCloudSDKException
     */
    public CreateTriggerResponse  CreateTrigger(CreateTriggerRequest req) throws TencentCloudSDKException{
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
     *该接口根据传入参数删除函数。
     * @param req DeleteFunctionRequest
     * @return DeleteFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFunctionResponse  DeleteFunction(DeleteFunctionRequest req) throws TencentCloudSDKException{
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
     *该接口根据参数传入删除已有的触发方式。
     * @param req DeleteTriggerRequest
     * @return DeleteTriggerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTriggerResponse  DeleteTrigger(DeleteTriggerRequest req) throws TencentCloudSDKException{
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
     *该接口获取某个函数的详细信息，包括名称、代码、处理方法、关联触发器和超时时间等字段。
     * @param req GetFunctionRequest
     * @return GetFunctionResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionResponse  GetFunction(GetFunctionRequest req) throws TencentCloudSDKException{
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
     *该接口根据设置的日志查询条件返回函数日志。
     * @param req GetFunctionLogsRequest
     * @return GetFunctionLogsResponse
     * @throws TencentCloudSDKException
     */
    public GetFunctionLogsResponse  GetFunctionLogs(GetFunctionLogsRequest req) throws TencentCloudSDKException{
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
     *该接口用于运行函数。
     * @param req InvokeRequest
     * @return InvokeResponse
     * @throws TencentCloudSDKException
     */
    public InvokeResponse  Invoke(InvokeRequest req) throws TencentCloudSDKException{
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
     *该接口根据传入的查询参数返回相关函数信息。
     * @param req ListFunctionsRequest
     * @return ListFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public ListFunctionsResponse  ListFunctions(ListFunctionsRequest req) throws TencentCloudSDKException{
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
     *该接口根据传入参数更新函数代码。
     * @param req UpdateFunctionCodeRequest
     * @return UpdateFunctionCodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFunctionCodeResponse  UpdateFunctionCode(UpdateFunctionCodeRequest req) throws TencentCloudSDKException{
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
    public UpdateFunctionConfigurationResponse  UpdateFunctionConfiguration(UpdateFunctionConfigurationRequest req) throws TencentCloudSDKException{
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

}
