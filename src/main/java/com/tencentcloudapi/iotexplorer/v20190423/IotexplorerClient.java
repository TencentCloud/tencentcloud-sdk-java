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
package com.tencentcloudapi.iotexplorer.v20190423;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotexplorer.v20190423.models.*;

public class IotexplorerClient extends AbstractClient{
    private static String endpoint = "iotexplorer.tencentcloudapi.com";
    private static String version = "2019-04-23";

    public IotexplorerClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotexplorerClient(Credential credential, String region, ClientProfile profile) {
        super(IotexplorerClient.endpoint, IotexplorerClient.version, credential, region, profile);
    }

    /**
     *提供给用户异步调用设备动作的能力
     * @param req CallDeviceActionAsyncRequest
     * @return CallDeviceActionAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionAsyncResponse CallDeviceActionAsync(CallDeviceActionAsyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallDeviceActionAsyncResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CallDeviceActionAsyncResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CallDeviceActionAsync"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供同步调用设备动作的能力。
     * @param req CallDeviceActionSyncRequest
     * @return CallDeviceActionSyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionSyncResponse CallDeviceActionSync(CallDeviceActionSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallDeviceActionSyncResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CallDeviceActionSyncResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CallDeviceActionSync"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据设备产品ID、设备名称，设置控制设备的属性数据。
     * @param req ControlDeviceDataRequest
     * @return ControlDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceDataResponse ControlDeviceData(ControlDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDeviceDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ControlDeviceDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ControlDeviceData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建设备
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供新建项目的能力，用于集中管理产品和应用。
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供新建产品的能力，用于管理用户的设备
     * @param req CreateStudioProductRequest
     * @return CreateStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateStudioProductResponse CreateStudioProduct(CreateStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStudioProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStudioProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateStudioProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除设备
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供删除某个项目的能力
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供删除某个项目下产品的能力
     * @param req DeleteStudioProductRequest
     * @return DeleteStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStudioProductResponse DeleteStudioProduct(DeleteStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStudioProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteStudioProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteStudioProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看某个设备的详细信息
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据设备产品ID、设备名称，获取设备上报的属性数据。
     * @param req DescribeDeviceDataRequest
     * @return DescribeDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataResponse DescribeDeviceData(DescribeDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备在指定时间范围内上报的历史数据。
     * @param req DescribeDeviceDataHistoryRequest
     * @return DescribeDeviceDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataHistoryResponse DescribeDeviceDataHistory(DescribeDeviceDataHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceDataHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询产品配置的数据模板信息
     * @param req DescribeModelDefinitionRequest
     * @return DescribeModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelDefinitionResponse DescribeModelDefinition(DescribeModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelDefinitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelDefinitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeModelDefinition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询项目详情
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查看茶品详细信息的能力，包括产品的ID、数据协议、认证类型等重要参数
     * @param req DescribeStudioProductRequest
     * @return DescribeStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStudioProductResponse DescribeStudioProduct(DescribeStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStudioProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStudioProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeStudioProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询某个产品下的设备列表
     * @param req GetDeviceListRequest
     * @return GetDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceListResponse GetDeviceList(GetDeviceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDeviceList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查询用户所创建的项目列表查询功能。
     * @param req GetProjectListRequest
     * @return GetProjectListResponse
     * @throws TencentCloudSDKException
     */
    public GetProjectListResponse GetProjectList(GetProjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProjectListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetProjectListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetProjectList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查询某个项目下所有产品信息的能力。
     * @param req GetStudioProductListRequest
     * @return GetStudioProductListResponse
     * @throws TencentCloudSDKException
     */
    public GetStudioProductListResponse GetStudioProductList(GetStudioProductListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetStudioProductListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetStudioProductListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetStudioProductList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备的历史事件
     * @param req ListEventHistoryRequest
     * @return ListEventHistoryResponse
     * @throws TencentCloudSDKException
     */
    public ListEventHistoryResponse ListEventHistory(ListEventHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEventHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListEventHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListEventHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供修改产品的数据模板的能力
     * @param req ModifyModelDefinitionRequest
     * @return ModifyModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelDefinitionResponse ModifyModelDefinition(ModifyModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModelDefinitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModelDefinitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyModelDefinition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改项目
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供修改产品的名称和描述等信息的能力，对于已发布产品不允许进行修改。
     * @param req ModifyStudioProductRequest
     * @return ModifyStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStudioProductResponse ModifyStudioProduct(ModifyStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStudioProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyStudioProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyStudioProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *产品开发完成并测试通过后，通过发布产品将产品设置为发布状态
     * @param req ReleaseStudioProductRequest
     * @return ReleaseStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseStudioProductResponse ReleaseStudioProduct(ReleaseStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseStudioProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseStudioProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseStudioProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供根据产品名称查找产品的能力
     * @param req SearchStudioProductRequest
     * @return SearchStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public SearchStudioProductResponse SearchStudioProduct(SearchStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchStudioProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchStudioProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchStudioProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
