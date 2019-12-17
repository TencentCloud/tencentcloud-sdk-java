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
package com.tencentcloudapi.iot.v20180123;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iot.v20180123.models.*;

public class IotClient extends AbstractClient{
    private static String endpoint = "iot.tencentcloudapi.com";
    private static String version = "2018-01-23";

    public IotClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotClient(Credential credential, String region, ClientProfile profile) {
        super(IotClient.endpoint, IotClient.version, credential, region, profile);
    }

    /**
     *启用规则
     * @param req ActivateRuleRequest
     * @return ActivateRuleResponse
     * @throws TencentCloudSDKException
     */
    public ActivateRuleResponse ActivateRule(ActivateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ActivateRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ActivateRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ActivateRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供在指定的产品Id下创建一个设备的能力，生成设备名称与设备秘钥。
     * @param req AddDeviceRequest
     * @return AddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceResponse AddDevice(AddDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(AddProduct)用于创建、定义某款硬件产品。
     * @param req AddProductRequest
     * @return AddProductResponse
     * @throws TencentCloudSDKException
     */
    public AddProductResponse AddProduct(AddProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增规则
     * @param req AddRuleRequest
     * @return AddRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddRuleResponse AddRule(AddRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增Topic，用于设备或应用发布消息至该Topic或订阅该Topic的消息。
     * @param req AddTopicRequest
     * @return AddTopicResponse
     * @throws TencentCloudSDKException
     */
    public AddTopicResponse AddTopic(AddTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为APP提供用户注册功能
     * @param req AppAddUserRequest
     * @return AppAddUserResponse
     * @throws TencentCloudSDKException
     */
    public AppAddUserResponse AppAddUser(AppAddUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppAddUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppAddUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppAddUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户解除与设备的关联关系，解除后APP用户无法控制设备，获取设备数据
     * @param req AppDeleteDeviceRequest
     * @return AppDeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppDeleteDeviceResponse AppDeleteDevice(AppDeleteDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppDeleteDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppDeleteDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppDeleteDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取绑定设备的基本信息与数据模板定义
     * @param req AppGetDeviceRequest
     * @return AppGetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDeviceResponse AppGetDevice(AppGetDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppGetDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppGetDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppGetDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取绑定设备数据，用于实时展示设备的最新数据
     * @param req AppGetDeviceDataRequest
     * @return AppGetDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDeviceDataResponse AppGetDeviceData(AppGetDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppGetDeviceDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppGetDeviceDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppGetDeviceData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取绑定设备的上下线状态
     * @param req AppGetDeviceStatusesRequest
     * @return AppGetDeviceStatusesResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDeviceStatusesResponse AppGetDeviceStatuses(AppGetDeviceStatusesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppGetDeviceStatusesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppGetDeviceStatusesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppGetDeviceStatuses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户的绑定设备列表
     * @param req AppGetDevicesRequest
     * @return AppGetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDevicesResponse AppGetDevices(AppGetDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppGetDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppGetDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppGetDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户token
     * @param req AppGetTokenRequest
     * @return AppGetTokenResponse
     * @throws TencentCloudSDKException
     */
    public AppGetTokenResponse AppGetToken(AppGetTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppGetTokenResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppGetTokenResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppGetToken"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户信息
     * @param req AppGetUserRequest
     * @return AppGetUserResponse
     * @throws TencentCloudSDKException
     */
    public AppGetUserResponse AppGetUser(AppGetUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppGetUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppGetUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppGetUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过APP控制设备
     * @param req AppIssueDeviceControlRequest
     * @return AppIssueDeviceControlResponse
     * @throws TencentCloudSDKException
     */
    public AppIssueDeviceControlResponse AppIssueDeviceControl(AppIssueDeviceControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppIssueDeviceControlResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppIssueDeviceControlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppIssueDeviceControl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置APP用户密码
     * @param req AppResetPasswordRequest
     * @return AppResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public AppResetPasswordResponse AppResetPassword(AppResetPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppResetPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppResetPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppResetPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户绑定设备，绑定后可以在APP端进行控制。绑定设备前需调用“获取设备绑定签名”接口
     * @param req AppSecureAddDeviceRequest
     * @return AppSecureAddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppSecureAddDeviceResponse AppSecureAddDevice(AppSecureAddDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppSecureAddDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppSecureAddDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppSecureAddDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改设备别名，便于用户个性化定义设备的名称
     * @param req AppUpdateDeviceRequest
     * @return AppUpdateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppUpdateDeviceResponse AppUpdateDevice(AppUpdateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppUpdateDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppUpdateDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppUpdateDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户信息
     * @param req AppUpdateUserRequest
     * @return AppUpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public AppUpdateUserResponse AppUpdateUser(AppUpdateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AppUpdateUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AppUpdateUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AppUpdateUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关联子设备产品和网关产品
     * @param req AssociateSubDeviceToGatewayProductRequest
     * @return AssociateSubDeviceToGatewayProductResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSubDeviceToGatewayProductResponse AssociateSubDeviceToGatewayProduct(AssociateSubDeviceToGatewayProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateSubDeviceToGatewayProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateSubDeviceToGatewayProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateSubDeviceToGatewayProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用规则
     * @param req DeactivateRuleRequest
     * @return DeactivateRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateRuleResponse DeactivateRule(DeactivateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeactivateRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeactivateRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeactivateRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供在指定的产品Id下删除一个设备的能力。
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
     *删除用户指定的产品Id对应的信息。
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Topic
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量获取设备某一段时间范围的设备上报数据。该接口适用于使用高级版类型的产品
     * @param req GetDataHistoryRequest
     * @return GetDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public GetDataHistoryResponse GetDataHistory(GetDataHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDataHistoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDataHistoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDataHistory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备的调试日志，用于定位问题
     * @param req GetDebugLogRequest
     * @return GetDebugLogResponse
     * @throws TencentCloudSDKException
     */
    public GetDebugLogResponse GetDebugLog(GetDebugLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDebugLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDebugLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDebugLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查询某个设备详细信息的能力。
     * @param req GetDeviceRequest
     * @return GetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceResponse GetDevice(GetDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个设备当前上报到云端的数据，该接口适用于使用数据模板协议的产品。
     * @param req GetDeviceDataRequest
     * @return GetDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceDataResponse GetDeviceData(GetDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDeviceData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量获取设备与云端的详细通信日志，该接口适用于使用高级版类型的产品。
     * @param req GetDeviceLogRequest
     * @return GetDeviceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceLogResponse GetDeviceLog(GetDeviceLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDeviceLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备绑定签名，用于用户绑定某个设备的应用场景
     * @param req GetDeviceSignaturesRequest
     * @return GetDeviceSignaturesResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceSignaturesResponse GetDeviceSignatures(GetDeviceSignaturesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceSignaturesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceSignaturesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDeviceSignatures"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询某段时间范围内产品的在线、激活设备数
     * @param req GetDeviceStatisticsRequest
     * @return GetDeviceStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceStatisticsResponse GetDeviceStatistics(GetDeviceStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDeviceStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量获取设备的当前状态，状态包括在线、离线或未激活状态。
     * @param req GetDeviceStatusesRequest
     * @return GetDeviceStatusesResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceStatusesResponse GetDeviceStatuses(GetDeviceStatusesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceStatusesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceStatusesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDeviceStatuses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供分页查询某个产品Id下设备信息的能力。
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取产品定义的详细信息，包括产品名称、产品描述，鉴权模式等信息。
     * @param req GetProductRequest
     * @return GetProductResponse
     * @throws TencentCloudSDKException
     */
    public GetProductResponse GetProduct(GetProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户在物联网套件所创建的所有产品信息。
     * @param req GetProductsRequest
     * @return GetProductsResponse
     * @throws TencentCloudSDKException
     */
    public GetProductsResponse GetProducts(GetProductsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProductsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetProductsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetProducts"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取转发规则信息
     * @param req GetRuleRequest
     * @return GetRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetRuleResponse GetRule(GetRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取转发规则列表
     * @param req GetRulesRequest
     * @return GetRulesResponse
     * @throws TencentCloudSDKException
     */
    public GetRulesResponse GetRules(GetRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Topic信息
     * @param req GetTopicRequest
     * @return GetTopicResponse
     * @throws TencentCloudSDKException
     */
    public GetTopicResponse GetTopic(GetTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTopicResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetTopicResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetTopic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Topic列表
     * @param req GetTopicsRequest
     * @return GetTopicsResponse
     * @throws TencentCloudSDKException
     */
    public GetTopicsResponse GetTopics(GetTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTopicsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetTopicsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetTopics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供下发控制指令到指定设备的能力，该接口适用于使用高级版类型的产品。
     * @param req IssueDeviceControlRequest
     * @return IssueDeviceControlResponse
     * @throws TencentCloudSDKException
     */
    public IssueDeviceControlResponse IssueDeviceControl(IssueDeviceControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IssueDeviceControlResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IssueDeviceControlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IssueDeviceControl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供向指定的Topic发布消息的能力，常用于向设备下发控制指令。该接口只适用于产品版本为“基础版”类型的产品，使用高级版的产品需使用“下发设备控制指令”接口
     * @param req PublishMsgRequest
     * @return PublishMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishMsgResponse PublishMsg(PublishMsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishMsgResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PublishMsgResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PublishMsg"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置设备操作，将会为设备生成新的证书及清空最新数据，需谨慎操作。
     * @param req ResetDeviceRequest
     * @return ResetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ResetDeviceResponse ResetDevice(ResetDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消子设备产品与网关设备产品的关联
     * @param req UnassociateSubDeviceFromGatewayProductRequest
     * @return UnassociateSubDeviceFromGatewayProductResponse
     * @throws TencentCloudSDKException
     */
    public UnassociateSubDeviceFromGatewayProductResponse UnassociateSubDeviceFromGatewayProduct(UnassociateSubDeviceFromGatewayProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassociateSubDeviceFromGatewayProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassociateSubDeviceFromGatewayProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassociateSubDeviceFromGatewayProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供修改产品信息及数据模板的能力。
     * @param req UpdateProductRequest
     * @return UpdateProductResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductResponse UpdateProduct(UpdateProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新规则
     * @param req UpdateRuleRequest
     * @return UpdateRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuleResponse UpdateRule(UpdateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
