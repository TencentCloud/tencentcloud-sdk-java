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
    private static String service = "iot";
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
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateRule", ActivateRuleResponse.class);
    }

    /**
     *提供在指定的产品Id下创建一个设备的能力，生成设备名称与设备秘钥。
     * @param req AddDeviceRequest
     * @return AddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceResponse AddDevice(AddDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDevice", AddDeviceResponse.class);
    }

    /**
     *本接口(AddProduct)用于创建、定义某款硬件产品。
     * @param req AddProductRequest
     * @return AddProductResponse
     * @throws TencentCloudSDKException
     */
    public AddProductResponse AddProduct(AddProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddProduct", AddProductResponse.class);
    }

    /**
     *新增规则
     * @param req AddRuleRequest
     * @return AddRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddRuleResponse AddRule(AddRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRule", AddRuleResponse.class);
    }

    /**
     *新增Topic，用于设备或应用发布消息至该Topic或订阅该Topic的消息。
     * @param req AddTopicRequest
     * @return AddTopicResponse
     * @throws TencentCloudSDKException
     */
    public AddTopicResponse AddTopic(AddTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddTopic", AddTopicResponse.class);
    }

    /**
     *为APP提供用户注册功能
     * @param req AppAddUserRequest
     * @return AppAddUserResponse
     * @throws TencentCloudSDKException
     */
    public AppAddUserResponse AppAddUser(AppAddUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppAddUser", AppAddUserResponse.class);
    }

    /**
     *用户解除与设备的关联关系，解除后APP用户无法控制设备，获取设备数据
     * @param req AppDeleteDeviceRequest
     * @return AppDeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppDeleteDeviceResponse AppDeleteDevice(AppDeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppDeleteDevice", AppDeleteDeviceResponse.class);
    }

    /**
     *获取绑定设备的基本信息与数据模板定义
     * @param req AppGetDeviceRequest
     * @return AppGetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDeviceResponse AppGetDevice(AppGetDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppGetDevice", AppGetDeviceResponse.class);
    }

    /**
     *获取绑定设备数据，用于实时展示设备的最新数据
     * @param req AppGetDeviceDataRequest
     * @return AppGetDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDeviceDataResponse AppGetDeviceData(AppGetDeviceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppGetDeviceData", AppGetDeviceDataResponse.class);
    }

    /**
     *获取绑定设备的上下线状态
     * @param req AppGetDeviceStatusesRequest
     * @return AppGetDeviceStatusesResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDeviceStatusesResponse AppGetDeviceStatuses(AppGetDeviceStatusesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppGetDeviceStatuses", AppGetDeviceStatusesResponse.class);
    }

    /**
     *获取用户的绑定设备列表
     * @param req AppGetDevicesRequest
     * @return AppGetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public AppGetDevicesResponse AppGetDevices(AppGetDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppGetDevices", AppGetDevicesResponse.class);
    }

    /**
     *获取用户token
     * @param req AppGetTokenRequest
     * @return AppGetTokenResponse
     * @throws TencentCloudSDKException
     */
    public AppGetTokenResponse AppGetToken(AppGetTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppGetToken", AppGetTokenResponse.class);
    }

    /**
     *获取用户信息
     * @param req AppGetUserRequest
     * @return AppGetUserResponse
     * @throws TencentCloudSDKException
     */
    public AppGetUserResponse AppGetUser(AppGetUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppGetUser", AppGetUserResponse.class);
    }

    /**
     *用户通过APP控制设备
     * @param req AppIssueDeviceControlRequest
     * @return AppIssueDeviceControlResponse
     * @throws TencentCloudSDKException
     */
    public AppIssueDeviceControlResponse AppIssueDeviceControl(AppIssueDeviceControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppIssueDeviceControl", AppIssueDeviceControlResponse.class);
    }

    /**
     *重置APP用户密码
     * @param req AppResetPasswordRequest
     * @return AppResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public AppResetPasswordResponse AppResetPassword(AppResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppResetPassword", AppResetPasswordResponse.class);
    }

    /**
     *用户绑定设备，绑定后可以在APP端进行控制。绑定设备前需调用“获取设备绑定签名”接口
     * @param req AppSecureAddDeviceRequest
     * @return AppSecureAddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppSecureAddDeviceResponse AppSecureAddDevice(AppSecureAddDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppSecureAddDevice", AppSecureAddDeviceResponse.class);
    }

    /**
     *修改设备别名，便于用户个性化定义设备的名称
     * @param req AppUpdateDeviceRequest
     * @return AppUpdateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AppUpdateDeviceResponse AppUpdateDevice(AppUpdateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppUpdateDevice", AppUpdateDeviceResponse.class);
    }

    /**
     *修改用户信息
     * @param req AppUpdateUserRequest
     * @return AppUpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public AppUpdateUserResponse AppUpdateUser(AppUpdateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AppUpdateUser", AppUpdateUserResponse.class);
    }

    /**
     *关联子设备产品和网关产品
     * @param req AssociateSubDeviceToGatewayProductRequest
     * @return AssociateSubDeviceToGatewayProductResponse
     * @throws TencentCloudSDKException
     */
    public AssociateSubDeviceToGatewayProductResponse AssociateSubDeviceToGatewayProduct(AssociateSubDeviceToGatewayProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateSubDeviceToGatewayProduct", AssociateSubDeviceToGatewayProductResponse.class);
    }

    /**
     *禁用规则
     * @param req DeactivateRuleRequest
     * @return DeactivateRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateRuleResponse DeactivateRule(DeactivateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeactivateRule", DeactivateRuleResponse.class);
    }

    /**
     *提供在指定的产品Id下删除一个设备的能力。
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *删除用户指定的产品Id对应的信息。
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProduct", DeleteProductResponse.class);
    }

    /**
     *删除规则
     * @param req DeleteRuleRequest
     * @return DeleteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuleResponse DeleteRule(DeleteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRule", DeleteRuleResponse.class);
    }

    /**
     *删除Topic
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *批量获取设备某一段时间范围的设备上报数据。该接口适用于使用高级版类型的产品
     * @param req GetDataHistoryRequest
     * @return GetDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public GetDataHistoryResponse GetDataHistory(GetDataHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDataHistory", GetDataHistoryResponse.class);
    }

    /**
     *获取设备的调试日志，用于定位问题
     * @param req GetDebugLogRequest
     * @return GetDebugLogResponse
     * @throws TencentCloudSDKException
     */
    public GetDebugLogResponse GetDebugLog(GetDebugLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDebugLog", GetDebugLogResponse.class);
    }

    /**
     *提供查询某个设备详细信息的能力。
     * @param req GetDeviceRequest
     * @return GetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceResponse GetDevice(GetDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevice", GetDeviceResponse.class);
    }

    /**
     *获取某个设备当前上报到云端的数据，该接口适用于使用数据模板协议的产品。
     * @param req GetDeviceDataRequest
     * @return GetDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceDataResponse GetDeviceData(GetDeviceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceData", GetDeviceDataResponse.class);
    }

    /**
     *批量获取设备与云端的详细通信日志，该接口适用于使用高级版类型的产品。
     * @param req GetDeviceLogRequest
     * @return GetDeviceLogResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceLogResponse GetDeviceLog(GetDeviceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceLog", GetDeviceLogResponse.class);
    }

    /**
     *获取设备绑定签名，用于用户绑定某个设备的应用场景
     * @param req GetDeviceSignaturesRequest
     * @return GetDeviceSignaturesResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceSignaturesResponse GetDeviceSignatures(GetDeviceSignaturesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceSignatures", GetDeviceSignaturesResponse.class);
    }

    /**
     *查询某段时间范围内产品的在线、激活设备数
     * @param req GetDeviceStatisticsRequest
     * @return GetDeviceStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceStatisticsResponse GetDeviceStatistics(GetDeviceStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceStatistics", GetDeviceStatisticsResponse.class);
    }

    /**
     *批量获取设备的当前状态，状态包括在线、离线或未激活状态。
     * @param req GetDeviceStatusesRequest
     * @return GetDeviceStatusesResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceStatusesResponse GetDeviceStatuses(GetDeviceStatusesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceStatuses", GetDeviceStatusesResponse.class);
    }

    /**
     *提供分页查询某个产品Id下设备信息的能力。
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevices", GetDevicesResponse.class);
    }

    /**
     *获取产品定义的详细信息，包括产品名称、产品描述，鉴权模式等信息。
     * @param req GetProductRequest
     * @return GetProductResponse
     * @throws TencentCloudSDKException
     */
    public GetProductResponse GetProduct(GetProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProduct", GetProductResponse.class);
    }

    /**
     *获取用户在物联网套件所创建的所有产品信息。
     * @param req GetProductsRequest
     * @return GetProductsResponse
     * @throws TencentCloudSDKException
     */
    public GetProductsResponse GetProducts(GetProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProducts", GetProductsResponse.class);
    }

    /**
     *获取转发规则信息
     * @param req GetRuleRequest
     * @return GetRuleResponse
     * @throws TencentCloudSDKException
     */
    public GetRuleResponse GetRule(GetRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRule", GetRuleResponse.class);
    }

    /**
     *获取转发规则列表
     * @param req GetRulesRequest
     * @return GetRulesResponse
     * @throws TencentCloudSDKException
     */
    public GetRulesResponse GetRules(GetRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetRules", GetRulesResponse.class);
    }

    /**
     *获取Topic信息
     * @param req GetTopicRequest
     * @return GetTopicResponse
     * @throws TencentCloudSDKException
     */
    public GetTopicResponse GetTopic(GetTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTopic", GetTopicResponse.class);
    }

    /**
     *获取Topic列表
     * @param req GetTopicsRequest
     * @return GetTopicsResponse
     * @throws TencentCloudSDKException
     */
    public GetTopicsResponse GetTopics(GetTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTopics", GetTopicsResponse.class);
    }

    /**
     *提供下发控制指令到指定设备的能力，该接口适用于使用高级版类型的产品。
     * @param req IssueDeviceControlRequest
     * @return IssueDeviceControlResponse
     * @throws TencentCloudSDKException
     */
    public IssueDeviceControlResponse IssueDeviceControl(IssueDeviceControlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IssueDeviceControl", IssueDeviceControlResponse.class);
    }

    /**
     *提供向指定的Topic发布消息的能力，常用于向设备下发控制指令。该接口只适用于产品版本为“基础版”类型的产品，使用高级版的产品需使用“下发设备控制指令”接口
     * @param req PublishMsgRequest
     * @return PublishMsgResponse
     * @throws TencentCloudSDKException
     */
    public PublishMsgResponse PublishMsg(PublishMsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishMsg", PublishMsgResponse.class);
    }

    /**
     *重置设备操作，将会为设备生成新的证书及清空最新数据，需谨慎操作。
     * @param req ResetDeviceRequest
     * @return ResetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ResetDeviceResponse ResetDevice(ResetDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDevice", ResetDeviceResponse.class);
    }

    /**
     *业务无客户使用，下线接口。

取消子设备产品与网关设备产品的关联
     * @param req UnassociateSubDeviceFromGatewayProductRequest
     * @return UnassociateSubDeviceFromGatewayProductResponse
     * @throws TencentCloudSDKException
     */
    public UnassociateSubDeviceFromGatewayProductResponse UnassociateSubDeviceFromGatewayProduct(UnassociateSubDeviceFromGatewayProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnassociateSubDeviceFromGatewayProduct", UnassociateSubDeviceFromGatewayProductResponse.class);
    }

    /**
     *提供修改产品信息及数据模板的能力。
     * @param req UpdateProductRequest
     * @return UpdateProductResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProductResponse UpdateProduct(UpdateProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateProduct", UpdateProductResponse.class);
    }

    /**
     *更新规则
     * @param req UpdateRuleRequest
     * @return UpdateRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRuleResponse UpdateRule(UpdateRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRule", UpdateRuleResponse.class);
    }

}
