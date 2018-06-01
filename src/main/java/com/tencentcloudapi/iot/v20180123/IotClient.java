/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public IotClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public IotClient(Credential credential, String region, ClientProfile profile) {
        super(IotClient.endpoint, IotClient.version, credential, region, profile);
    }

    /**
     *启用规则
     * @param req ActivateRuleRequest
     * @return ActivateRuleResponse
     * @throws TencentCloudSDKException
     */
    public ActivateRuleResponse  ActivateRule(ActivateRuleRequest req) throws TencentCloudSDKException{
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
    public AddDeviceResponse  AddDevice(AddDeviceRequest req) throws TencentCloudSDKException{
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
    public AddProductResponse  AddProduct(AddProductRequest req) throws TencentCloudSDKException{
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
    public AddRuleResponse  AddRule(AddRuleRequest req) throws TencentCloudSDKException{
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
    public AddTopicResponse  AddTopic(AddTopicRequest req) throws TencentCloudSDKException{
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
     *注册用户
     * @param req AddUserRequest
     * @return AddUserResponse
     * @throws TencentCloudSDKException
     */
    public AddUserResponse  AddUser(AddUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注册应用用户
     * @param req AppAddUserRequest
     * @return AppAddUserResponse
     * @throws TencentCloudSDKException
     */
    public AppAddUserResponse  AppAddUser(AppAddUserRequest req) throws TencentCloudSDKException{
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
     *禁用规则
     * @param req DeactivateRuleRequest
     * @return DeactivateRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateRuleResponse  DeactivateRule(DeactivateRuleRequest req) throws TencentCloudSDKException{
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
    public DeleteDeviceResponse  DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
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
    public DeleteProductResponse  DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
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
    public DeleteRuleResponse  DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
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
    public DeleteTopicResponse  DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
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
     *批量获取设备某一段时间范围的设备上报数据。该接口只允许使用数据模板类型的产品通过REST API方式同步设备上报数据至用户的应用系统。
     * @param req GetDataHistoryRequest
     * @return GetDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public GetDataHistoryResponse  GetDataHistory(GetDataHistoryRequest req) throws TencentCloudSDKException{
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
     *提供查询某个设备详细信息的能力。
     * @param req GetDeviceRequest
     * @return GetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceResponse  GetDevice(GetDeviceRequest req) throws TencentCloudSDKException{
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
    public GetDeviceDataResponse  GetDeviceData(GetDeviceDataRequest req) throws TencentCloudSDKException{
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
     *批量获取设备与云端的详细通信日志，该接口适用于使用数据模板类型的产品。
     * @param req GetDeviceLogRequest
     * @return GetDeviceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceLogResponse  GetDeviceLog(GetDeviceLogRequest req) throws TencentCloudSDKException{
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
     *批量获取设备的当前状态，状态包括在线、离线或未激活状态。
     * @param req GetDeviceStatusesRequest
     * @return GetDeviceStatusesResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceStatusesResponse  GetDeviceStatuses(GetDeviceStatusesRequest req) throws TencentCloudSDKException{
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
    public GetDevicesResponse  GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
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
    public GetProductResponse  GetProduct(GetProductRequest req) throws TencentCloudSDKException{
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
    public GetProductsResponse  GetProducts(GetProductsRequest req) throws TencentCloudSDKException{
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
    public GetRuleResponse  GetRule(GetRuleRequest req) throws TencentCloudSDKException{
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
    public GetRulesResponse  GetRules(GetRulesRequest req) throws TencentCloudSDKException{
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
    public GetTopicResponse  GetTopic(GetTopicRequest req) throws TencentCloudSDKException{
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
    public GetTopicsResponse  GetTopics(GetTopicsRequest req) throws TencentCloudSDKException{
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
     *获取用户信息
     * @param req GetUserRequest
     * @return GetUserResponse
     * @throws TencentCloudSDKException
     */
    public GetUserResponse  GetUser(GetUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供下发控制指令到指定设备的能力，该接口适用于使用数据模板类型的产品。
     * @param req IssueDeviceControlRequest
     * @return IssueDeviceControlResponse
     * @throws TencentCloudSDKException
     */
    public IssueDeviceControlResponse  IssueDeviceControl(IssueDeviceControlRequest req) throws TencentCloudSDKException{
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
     *提供向指定的Topic发布消息的能力，常用于向设备下发控制指令；该接口只适用于数据协议为“自定义”类型的产品，使用数据模板类型的产品需使用IssueDeviceControl接口
     * @param req PublishMsgRequest
     * @return PublishMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishMsgResponse  PublishMsg(PublishMsgRequest req) throws TencentCloudSDKException{
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
    public ResetDeviceResponse  ResetDevice(ResetDeviceRequest req) throws TencentCloudSDKException{
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
     *提供修改产品信息及数据模板的能力。
     * @param req UpdateProductRequest
     * @return UpdateProductResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductResponse  UpdateProduct(UpdateProductRequest req) throws TencentCloudSDKException{
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
    public UpdateRuleResponse  UpdateRule(UpdateRuleRequest req) throws TencentCloudSDKException{
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
