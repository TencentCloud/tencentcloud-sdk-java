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
    private static String service = "iotexplorer";
    private static String version = "2019-04-23";
    
    public IotexplorerClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotexplorerClient(Credential credential, String region, ClientProfile profile) {
        super(IotexplorerClient.endpoint, IotexplorerClient.version, credential, region, profile);
    }

    /**
     *激活
     * @param req ActivateTWeCallLicenseRequest
     * @return ActivateTWeCallLicenseResponse
     * @throws TencentCloudSDKException
     */
    public ActivateTWeCallLicenseResponse ActivateTWeCallLicense(ActivateTWeCallLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateTWeCallLicense", ActivateTWeCallLicenseResponse.class);
    }

    /**
     *绑定云存用户
     * @param req BindCloudStorageUserRequest
     * @return BindCloudStorageUserResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudStorageUserResponse BindCloudStorageUser(BindCloudStorageUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudStorageUser", BindCloudStorageUserResponse.class);
    }

    /**
     *批量绑定子设备
     * @param req BindDevicesRequest
     * @return BindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BindDevicesResponse BindDevices(BindDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindDevices", BindDevicesResponse.class);
    }

    /**
     *批量绑定子产品
     * @param req BindProductsRequest
     * @return BindProductsResponse
     * @throws TencentCloudSDKException
     */
    public BindProductsResponse BindProducts(BindProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindProducts", BindProductsResponse.class);
    }

    /**
     *提供给用户异步调用设备行为的能力
     * @param req CallDeviceActionAsyncRequest
     * @return CallDeviceActionAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionAsyncResponse CallDeviceActionAsync(CallDeviceActionAsyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallDeviceActionAsync", CallDeviceActionAsyncResponse.class);
    }

    /**
     *为用户提供同步调用设备行为的能力。
     * @param req CallDeviceActionSyncRequest
     * @return CallDeviceActionSyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionSyncResponse CallDeviceActionSync(CallDeviceActionSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallDeviceActionSync", CallDeviceActionSyncResponse.class);
    }

    /**
     *取消分配
     * @param req CancelAssignTWeCallLicenseRequest
     * @return CancelAssignTWeCallLicenseResponse
     * @throws TencentCloudSDKException
     */
    public CancelAssignTWeCallLicenseResponse CancelAssignTWeCallLicense(CancelAssignTWeCallLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAssignTWeCallLicense", CancelAssignTWeCallLicenseResponse.class);
    }

    /**
     *p2p路线切换（此接口目前处于内测接口，可以联系申请加白 ）
     * @param req ChangeP2PRouteRequest
     * @return ChangeP2PRouteResponse
     * @throws TencentCloudSDKException
     */
    public ChangeP2PRouteResponse ChangeP2PRoute(ChangeP2PRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChangeP2PRoute", ChangeP2PRouteResponse.class);
    }

    /**
     *本接口（CheckFirmwareUpdate）用于查询设备可升级固件版本
     * @param req CheckFirmwareUpdateRequest
     * @return CheckFirmwareUpdateResponse
     * @throws TencentCloudSDKException
     */
    public CheckFirmwareUpdateResponse CheckFirmwareUpdate(CheckFirmwareUpdateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFirmwareUpdate", CheckFirmwareUpdateResponse.class);
    }

    /**
     *根据设备产品ID、设备名称，设置控制设备的属性数据。
     * @param req ControlDeviceDataRequest
     * @return ControlDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceDataResponse ControlDeviceData(ControlDeviceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDeviceData", ControlDeviceDataResponse.class);
    }

    /**
     *用于新建批量生产设备
     * @param req CreateBatchProductionRequest
     * @return CreateBatchProductionResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchProductionResponse CreateBatchProduction(CreateBatchProductionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBatchProduction", CreateBatchProductionResponse.class);
    }

    /**
     *开通设备云存AI分析服务
     * @param req CreateCloudStorageAIServiceRequest
     * @return CreateCloudStorageAIServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudStorageAIServiceResponse CreateCloudStorageAIService(CreateCloudStorageAIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudStorageAIService", CreateCloudStorageAIServiceResponse.class);
    }

    /**
     *创建设备云存 AI 分析任务
     * @param req CreateCloudStorageAIServiceTaskRequest
     * @return CreateCloudStorageAIServiceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudStorageAIServiceTaskResponse CreateCloudStorageAIServiceTask(CreateCloudStorageAIServiceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudStorageAIServiceTask", CreateCloudStorageAIServiceTaskResponse.class);
    }

    /**
     *创建设备
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevice", CreateDeviceResponse.class);
    }

    /**
     *创建设备通道
     * @param req CreateDeviceChannelRequest
     * @return CreateDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceChannelResponse CreateDeviceChannel(CreateDeviceChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeviceChannel", CreateDeviceChannelResponse.class);
    }

    /**
     *创建外部视频 AI 分析任务
     * @param req CreateExternalSourceAIServiceTaskRequest
     * @return CreateExternalSourceAIServiceTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateExternalSourceAIServiceTaskResponse CreateExternalSourceAIServiceTask(CreateExternalSourceAIServiceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExternalSourceAIServiceTask", CreateExternalSourceAIServiceTaskResponse.class);
    }

    /**
     *创建围栏绑定信息
     * @param req CreateFenceBindRequest
     * @return CreateFenceBindResponse
     * @throws TencentCloudSDKException
     */
    public CreateFenceBindResponse CreateFenceBind(CreateFenceBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFenceBind", CreateFenceBindResponse.class);
    }

    /**
     *开通免费云存服务
     * @param req CreateFreeCloudStorageRequest
     * @return CreateFreeCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateFreeCloudStorageResponse CreateFreeCloudStorage(CreateFreeCloudStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFreeCloudStorage", CreateFreeCloudStorageResponse.class);
    }

    /**
     *开通云存服务
     * @param req CreateIotVideoCloudStorageRequest
     * @return CreateIotVideoCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateIotVideoCloudStorageResponse CreateIotVideoCloudStorage(CreateIotVideoCloudStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIotVideoCloudStorage", CreateIotVideoCloudStorageResponse.class);
    }

    /**
     *创建 LoRa 自定义频点
     * @param req CreateLoRaFrequencyRequest
     * @return CreateLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoRaFrequencyResponse CreateLoRaFrequency(CreateLoRaFrequencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoRaFrequency", CreateLoRaFrequencyResponse.class);
    }

    /**
     *创建新 LoRa 网关设备接口
     * @param req CreateLoRaGatewayRequest
     * @return CreateLoRaGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoRaGatewayResponse CreateLoRaGateway(CreateLoRaGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLoRaGateway", CreateLoRaGatewayResponse.class);
    }

    /**
     *创建围栏
     * @param req CreatePositionFenceRequest
     * @return CreatePositionFenceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePositionFenceResponse CreatePositionFence(CreatePositionFenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePositionFence", CreatePositionFenceResponse.class);
    }

    /**
     *创建位置空间。
     * @param req CreatePositionSpaceRequest
     * @return CreatePositionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePositionSpaceResponse CreatePositionSpace(CreatePositionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePositionSpace", CreatePositionSpaceResponse.class);
    }

    /**
     *为用户提供新建项目的能力，用于集中管理产品和应用。
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *为用户提供新建产品的能力，用于管理用户的设备
     * @param req CreateStudioProductRequest
     * @return CreateStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateStudioProductResponse CreateStudioProduct(CreateStudioProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStudioProduct", CreateStudioProductResponse.class);
    }

    /**
     *创建TRTC通话参数
     * @param req CreateTRTCSignaturesWithRoomIdRequest
     * @return CreateTRTCSignaturesWithRoomIdResponse
     * @throws TencentCloudSDKException
     */
    public CreateTRTCSignaturesWithRoomIdResponse CreateTRTCSignaturesWithRoomId(CreateTRTCSignaturesWithRoomIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTRTCSignaturesWithRoomId", CreateTRTCSignaturesWithRoomIdResponse.class);
    }

    /**
     *创建 TWeSee 语义理解任务
     * @param req CreateTWeSeeRecognitionTaskRequest
     * @return CreateTWeSeeRecognitionTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTWeSeeRecognitionTaskResponse CreateTWeSeeRecognitionTask(CreateTWeSeeRecognitionTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTWeSeeRecognitionTask", CreateTWeSeeRecognitionTaskResponse.class);
    }

    /**
     *本接口（CreateTopicPolicy）用于创建一个Topic
     * @param req CreateTopicPolicyRequest
     * @return CreateTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicPolicyResponse CreateTopicPolicy(CreateTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopicPolicy", CreateTopicPolicyResponse.class);
    }

    /**
     *创建规则
     * @param req CreateTopicRuleRequest
     * @return CreateTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicRuleResponse CreateTopicRule(CreateTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopicRule", CreateTopicRuleResponse.class);
    }

    /**
     *删除云存事件
     * @param req DeleteCloudStorageEventRequest
     * @return DeleteCloudStorageEventResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudStorageEventResponse DeleteCloudStorageEvent(DeleteCloudStorageEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudStorageEvent", DeleteCloudStorageEventResponse.class);
    }

    /**
     *删除设备
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *批量删除设备
     * @param req DeleteDevicesRequest
     * @return DeleteDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDevicesResponse DeleteDevices(DeleteDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevices", DeleteDevicesResponse.class);
    }

    /**
     *删除围栏绑定信息
     * @param req DeleteFenceBindRequest
     * @return DeleteFenceBindResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFenceBindResponse DeleteFenceBind(DeleteFenceBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFenceBind", DeleteFenceBindResponse.class);
    }

    /**
     *提供删除LoRa自定义频点的能力
     * @param req DeleteLoRaFrequencyRequest
     * @return DeleteLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoRaFrequencyResponse DeleteLoRaFrequency(DeleteLoRaFrequencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoRaFrequency", DeleteLoRaFrequencyResponse.class);
    }

    /**
     *删除  LoRa 网关的接口
     * @param req DeleteLoRaGatewayRequest
     * @return DeleteLoRaGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoRaGatewayResponse DeleteLoRaGateway(DeleteLoRaGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLoRaGateway", DeleteLoRaGatewayResponse.class);
    }

    /**
     *删除围栏
     * @param req DeletePositionFenceRequest
     * @return DeletePositionFenceResponse
     * @throws TencentCloudSDKException
     */
    public DeletePositionFenceResponse DeletePositionFence(DeletePositionFenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePositionFence", DeletePositionFenceResponse.class);
    }

    /**
     *删除位置空间
     * @param req DeletePositionSpaceRequest
     * @return DeletePositionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public DeletePositionSpaceResponse DeletePositionSpace(DeletePositionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePositionSpace", DeletePositionSpaceResponse.class);
    }

    /**
     *提供删除某个项目的能力
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *提供删除某个项目下产品的能力
     * @param req DeleteStudioProductRequest
     * @return DeleteStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStudioProductResponse DeleteStudioProduct(DeleteStudioProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStudioProduct", DeleteStudioProductResponse.class);
    }

    /**
     *本接口（DeleteTopicPolicy）用于删除Topic
     * @param req DeleteTopicPolicyRequest
     * @return DeleteTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicPolicyResponse DeleteTopicPolicy(DeleteTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopicPolicy", DeleteTopicPolicyResponse.class);
    }

    /**
     *删除规则
     * @param req DeleteTopicRuleRequest
     * @return DeleteTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicRuleResponse DeleteTopicRule(DeleteTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopicRule", DeleteTopicRuleResponse.class);
    }

    /**
     *获取设备激活详情
     * @param req DescribeActivateDeviceRequest
     * @return DescribeActivateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActivateDeviceResponse DescribeActivateDevice(DescribeActivateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActivateDevice", DescribeActivateDeviceResponse.class);
    }

    /**
     *获取增值服务激活码详情
     * @param req DescribeActivateLicenseServiceRequest
     * @return DescribeActivateLicenseServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActivateLicenseServiceResponse DescribeActivateLicenseService(DescribeActivateLicenseServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActivateLicenseService", DescribeActivateLicenseServiceResponse.class);
    }

    /**
     *获取量产详情信息。
     * @param req DescribeBatchProductionRequest
     * @return DescribeBatchProductionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchProductionResponse DescribeBatchProduction(DescribeBatchProductionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchProduction", DescribeBatchProductionResponse.class);
    }

    /**
     *获取网关产品已经绑定的子产品
     * @param req DescribeBindedProductsRequest
     * @return DescribeBindedProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindedProductsResponse DescribeBindedProducts(DescribeBindedProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBindedProducts", DescribeBindedProductsResponse.class);
    }

    /**
     *获取设备云存服务详情
     * @param req DescribeCloudStorageRequest
     * @return DescribeCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageResponse DescribeCloudStorage(DescribeCloudStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorage", DescribeCloudStorageResponse.class);
    }

    /**
     *查询指定设备的云存 AI 服务开通状态与参数配置
     * @param req DescribeCloudStorageAIServiceRequest
     * @return DescribeCloudStorageAIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageAIServiceResponse DescribeCloudStorageAIService(DescribeCloudStorageAIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageAIService", DescribeCloudStorageAIServiceResponse.class);
    }

    /**
     *查询云存AI分析回调配置
     * @param req DescribeCloudStorageAIServiceCallbackRequest
     * @return DescribeCloudStorageAIServiceCallbackResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageAIServiceCallbackResponse DescribeCloudStorageAIServiceCallback(DescribeCloudStorageAIServiceCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageAIServiceCallback", DescribeCloudStorageAIServiceCallbackResponse.class);
    }

    /**
     *查询指定的云存 AI 分析任务
     * @param req DescribeCloudStorageAIServiceTaskRequest
     * @return DescribeCloudStorageAIServiceTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageAIServiceTaskResponse DescribeCloudStorageAIServiceTask(DescribeCloudStorageAIServiceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageAIServiceTask", DescribeCloudStorageAIServiceTaskResponse.class);
    }

    /**
     *查询指定设备的云存 AI 分析任务列表
     * @param req DescribeCloudStorageAIServiceTasksRequest
     * @return DescribeCloudStorageAIServiceTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageAIServiceTasksResponse DescribeCloudStorageAIServiceTasks(DescribeCloudStorageAIServiceTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageAIServiceTasks", DescribeCloudStorageAIServiceTasksResponse.class);
    }

    /**
     *获取具有云存的日期
     * @param req DescribeCloudStorageDateRequest
     * @return DescribeCloudStorageDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageDateResponse DescribeCloudStorageDate(DescribeCloudStorageDateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageDate", DescribeCloudStorageDateResponse.class);
    }

    /**
     *拉取云存事件列表
     * @param req DescribeCloudStorageEventsRequest
     * @return DescribeCloudStorageEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageEventsResponse DescribeCloudStorageEvents(DescribeCloudStorageEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageEvents", DescribeCloudStorageEventsResponse.class);
    }

    /**
     *拉取云存事件列表
     * @param req DescribeCloudStorageEventsWithAITasksRequest
     * @return DescribeCloudStorageEventsWithAITasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageEventsWithAITasksResponse DescribeCloudStorageEventsWithAITasks(DescribeCloudStorageEventsWithAITasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageEventsWithAITasks", DescribeCloudStorageEventsWithAITasksResponse.class);
    }

    /**
     *拉取多个云存事件缩略图
     * @param req DescribeCloudStorageMultiThumbnailRequest
     * @return DescribeCloudStorageMultiThumbnailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageMultiThumbnailResponse DescribeCloudStorageMultiThumbnail(DescribeCloudStorageMultiThumbnailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageMultiThumbnail", DescribeCloudStorageMultiThumbnailResponse.class);
    }

    /**
     *查询云存服务详情
     * @param req DescribeCloudStorageOrderRequest
     * @return DescribeCloudStorageOrderResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageOrderResponse DescribeCloudStorageOrder(DescribeCloudStorageOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageOrder", DescribeCloudStorageOrderResponse.class);
    }

    /**
     *获取云存套餐包消耗详细记录
     * @param req DescribeCloudStoragePackageConsumeDetailsRequest
     * @return DescribeCloudStoragePackageConsumeDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStoragePackageConsumeDetailsResponse DescribeCloudStoragePackageConsumeDetails(DescribeCloudStoragePackageConsumeDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStoragePackageConsumeDetails", DescribeCloudStoragePackageConsumeDetailsResponse.class);
    }

    /**
     *获取云存套餐包消耗统计
     * @param req DescribeCloudStoragePackageConsumeStatsRequest
     * @return DescribeCloudStoragePackageConsumeStatsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStoragePackageConsumeStatsResponse DescribeCloudStoragePackageConsumeStats(DescribeCloudStoragePackageConsumeStatsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStoragePackageConsumeStats", DescribeCloudStoragePackageConsumeStatsResponse.class);
    }

    /**
     *获取设备图片流数据
     * @param req DescribeCloudStorageStreamDataRequest
     * @return DescribeCloudStorageStreamDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageStreamDataResponse DescribeCloudStorageStreamData(DescribeCloudStorageStreamDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageStreamData", DescribeCloudStorageStreamDataResponse.class);
    }

    /**
     *拉取云存事件缩略图
     * @param req DescribeCloudStorageThumbnailRequest
     * @return DescribeCloudStorageThumbnailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageThumbnailResponse DescribeCloudStorageThumbnail(DescribeCloudStorageThumbnailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageThumbnail", DescribeCloudStorageThumbnailResponse.class);
    }

    /**
     *批量拉取云存事件缩略图
     * @param req DescribeCloudStorageThumbnailListRequest
     * @return DescribeCloudStorageThumbnailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageThumbnailListResponse DescribeCloudStorageThumbnailList(DescribeCloudStorageThumbnailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageThumbnailList", DescribeCloudStorageThumbnailListResponse.class);
    }

    /**
     *获取某一天云存时间轴
     * @param req DescribeCloudStorageTimeRequest
     * @return DescribeCloudStorageTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageTimeResponse DescribeCloudStorageTime(DescribeCloudStorageTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageTime", DescribeCloudStorageTimeResponse.class);
    }

    /**
     *拉取云存用户列表
     * @param req DescribeCloudStorageUsersRequest
     * @return DescribeCloudStorageUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudStorageUsersResponse DescribeCloudStorageUsers(DescribeCloudStorageUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudStorageUsers", DescribeCloudStorageUsersResponse.class);
    }

    /**
     *获取云存上报统计信息
     * @param req DescribeCsReportCountDataInfoRequest
     * @return DescribeCsReportCountDataInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCsReportCountDataInfoResponse DescribeCsReportCountDataInfo(DescribeCsReportCountDataInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCsReportCountDataInfo", DescribeCsReportCountDataInfoResponse.class);
    }

    /**
     *用于查看某个设备的详细信息
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevice", DescribeDeviceResponse.class);
    }

    /**
     *查询设备绑定的网关设备
     * @param req DescribeDeviceBindGatewayRequest
     * @return DescribeDeviceBindGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceBindGatewayResponse DescribeDeviceBindGateway(DescribeDeviceBindGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceBindGateway", DescribeDeviceBindGatewayResponse.class);
    }

    /**
     *根据设备产品ID、设备名称，获取设备上报的属性数据。
     * @param req DescribeDeviceDataRequest
     * @return DescribeDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataResponse DescribeDeviceData(DescribeDeviceDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceData", DescribeDeviceDataResponse.class);
    }

    /**
     *获取设备在指定时间范围内上报的历史数据。
     * @param req DescribeDeviceDataHistoryRequest
     * @return DescribeDeviceDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataHistoryResponse DescribeDeviceDataHistory(DescribeDeviceDataHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceDataHistory", DescribeDeviceDataHistoryResponse.class);
    }

    /**
     *获取设备固件信息
     * @param req DescribeDeviceFirmWareRequest
     * @return DescribeDeviceFirmWareResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceFirmWareResponse DescribeDeviceFirmWare(DescribeDeviceFirmWareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceFirmWare", DescribeDeviceFirmWareResponse.class);
    }

    /**
     *获取设备当前固件信息
     * @param req DescribeDeviceFirmwaresRequest
     * @return DescribeDeviceFirmwaresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceFirmwaresResponse DescribeDeviceFirmwares(DescribeDeviceFirmwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceFirmwares", DescribeDeviceFirmwaresResponse.class);
    }

    /**
     *获取实时位置解析
     * @param req DescribeDeviceLocationSolveRequest
     * @return DescribeDeviceLocationSolveResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceLocationSolveResponse DescribeDeviceLocationSolve(DescribeDeviceLocationSolveRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceLocationSolve", DescribeDeviceLocationSolveResponse.class);
    }

    /**
     *根据设备信息拉取有效套餐列表
     * @param req DescribeDevicePackagesRequest
     * @return DescribeDevicePackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePackagesResponse DescribeDevicePackages(DescribeDevicePackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevicePackages", DescribeDevicePackagesResponse.class);
    }

    /**
     *获取设备位置列表
     * @param req DescribeDevicePositionListRequest
     * @return DescribeDevicePositionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePositionListResponse DescribeDevicePositionList(DescribeDevicePositionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevicePositionList", DescribeDevicePositionListResponse.class);
    }

    /**
     *获取围栏绑定信息列表
     * @param req DescribeFenceBindListRequest
     * @return DescribeFenceBindListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFenceBindListResponse DescribeFenceBindList(DescribeFenceBindListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFenceBindList", DescribeFenceBindListResponse.class);
    }

    /**
     *获取围栏告警事件列表
     * @param req DescribeFenceEventListRequest
     * @return DescribeFenceEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFenceEventListResponse DescribeFenceEventList(DescribeFenceEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFenceEventList", DescribeFenceEventListResponse.class);
    }

    /**
     *查询固件信息
     * @param req DescribeFirmwareRequest
     * @return DescribeFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareResponse DescribeFirmware(DescribeFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmware", DescribeFirmwareResponse.class);
    }

    /**
     *查询固件升级任务列表
     * @param req DescribeFirmwareTaskRequest
     * @return DescribeFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskResponse DescribeFirmwareTask(DescribeFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTask", DescribeFirmwareTaskResponse.class);
    }

    /**
     *本接口（DescribeFirmwareUpdateStatus）用于查询设备固件升级状态及进度。
     * @param req DescribeFirmwareUpdateStatusRequest
     * @return DescribeFirmwareUpdateStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareUpdateStatusResponse DescribeFirmwareUpdateStatus(DescribeFirmwareUpdateStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareUpdateStatus", DescribeFirmwareUpdateStatusResponse.class);
    }

    /**
     *查询云存卡套餐信息
     * @param req DescribeFreeCloudStorageNumRequest
     * @return DescribeFreeCloudStorageNumResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFreeCloudStorageNumResponse DescribeFreeCloudStorageNum(DescribeFreeCloudStorageNumRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFreeCloudStorageNum", DescribeFreeCloudStorageNumResponse.class);
    }

    /**
     *获取网关绑定的子设备列表
     * @param req DescribeGatewayBindDevicesRequest
     * @return DescribeGatewayBindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayBindDevicesResponse DescribeGatewayBindDevices(DescribeGatewayBindDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayBindDevices", DescribeGatewayBindDevicesResponse.class);
    }

    /**
     *查询绑定到家庭的网关设备的子设备列表
     * @param req DescribeGatewaySubDeviceListRequest
     * @return DescribeGatewaySubDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewaySubDeviceListResponse DescribeGatewaySubDeviceList(DescribeGatewaySubDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewaySubDeviceList", DescribeGatewaySubDeviceListResponse.class);
    }

    /**
     *用于获取网关可绑定或解绑的子产品
     * @param req DescribeGatewaySubProductsRequest
     * @return DescribeGatewaySubProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewaySubProductsResponse DescribeGatewaySubProducts(DescribeGatewaySubProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewaySubProducts", DescribeGatewaySubProductsResponse.class);
    }

    /**
     *公共实例过期时间 0001-01-01T00:00:00Z，公共实例是永久有效
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *提供查询LoRa自定义频点详情的能力
     * @param req DescribeLoRaFrequencyRequest
     * @return DescribeLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoRaFrequencyResponse DescribeLoRaFrequency(DescribeLoRaFrequencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLoRaFrequency", DescribeLoRaFrequencyResponse.class);
    }

    /**
     *查询产品配置的数据模板信息
     * @param req DescribeModelDefinitionRequest
     * @return DescribeModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelDefinitionResponse DescribeModelDefinition(DescribeModelDefinitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelDefinition", DescribeModelDefinitionResponse.class);
    }

    /**
     *当前p2p线路
     * @param req DescribeP2PRouteRequest
     * @return DescribeP2PRouteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeP2PRouteResponse DescribeP2PRoute(DescribeP2PRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeP2PRoute", DescribeP2PRouteResponse.class);
    }

    /**
     *查询套餐消耗记录详情
     * @param req DescribePackageConsumeTaskRequest
     * @return DescribePackageConsumeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackageConsumeTaskResponse DescribePackageConsumeTask(DescribePackageConsumeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackageConsumeTask", DescribePackageConsumeTaskResponse.class);
    }

    /**
     *查询套餐消耗记录列表
     * @param req DescribePackageConsumeTasksRequest
     * @return DescribePackageConsumeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackageConsumeTasksResponse DescribePackageConsumeTasks(DescribePackageConsumeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePackageConsumeTasks", DescribePackageConsumeTasksResponse.class);
    }

    /**
     *获取围栏列表
     * @param req DescribePositionFenceListRequest
     * @return DescribePositionFenceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePositionFenceListResponse DescribePositionFenceList(DescribePositionFenceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePositionFenceList", DescribePositionFenceListResponse.class);
    }

    /**
     *查询指定产品的云存 AI 服务开通状态
     * @param req DescribeProductCloudStorageAIServiceRequest
     * @return DescribeProductCloudStorageAIServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductCloudStorageAIServiceResponse DescribeProductCloudStorageAIService(DescribeProductCloudStorageAIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductCloudStorageAIService", DescribeProductCloudStorageAIServiceResponse.class);
    }

    /**
     *查询项目详情
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProject", DescribeProjectResponse.class);
    }

    /**
     *获取位置空间中围栏告警事件列表
     * @param req DescribeSpaceFenceEventListRequest
     * @return DescribeSpaceFenceEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpaceFenceEventListResponse DescribeSpaceFenceEventList(DescribeSpaceFenceEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpaceFenceEventList", DescribeSpaceFenceEventListResponse.class);
    }

    /**
     *提供查看产品详细信息的能力，包括产品的ID、数据协议、认证类型等重要参数
     * @param req DescribeStudioProductRequest
     * @return DescribeStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStudioProductResponse DescribeStudioProduct(DescribeStudioProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStudioProduct", DescribeStudioProductResponse.class);
    }

    /**
     *拉取 TWeSee 配置
     * @param req DescribeTWeSeeConfigRequest
     * @return DescribeTWeSeeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTWeSeeConfigResponse DescribeTWeSeeConfig(DescribeTWeSeeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTWeSeeConfig", DescribeTWeSeeConfigResponse.class);
    }

    /**
     *本接口（DescribeTopicPolicy）用于查看Topic详细信息
     * @param req DescribeTopicPolicyRequest
     * @return DescribeTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicPolicyResponse DescribeTopicPolicy(DescribeTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicPolicy", DescribeTopicPolicyResponse.class);
    }

    /**
     *获取规则信息
     * @param req DescribeTopicRuleRequest
     * @return DescribeTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicRuleResponse DescribeTopicRule(DescribeTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicRule", DescribeTopicRuleResponse.class);
    }

    /**
     *获取未绑定的设备列表
     * @param req DescribeUnbindedDevicesRequest
     * @return DescribeUnbindedDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnbindedDevicesResponse DescribeUnbindedDevices(DescribeUnbindedDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnbindedDevices", DescribeUnbindedDevicesResponse.class);
    }

    /**
     *用于查询视频激活码统计概览
     * @param req DescribeVideoLicenseRequest
     * @return DescribeVideoLicenseResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoLicenseResponse DescribeVideoLicense(DescribeVideoLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoLicense", DescribeVideoLicenseResponse.class);
    }

    /**
     *直接绑定设备和家庭
     * @param req DirectBindDeviceInFamilyRequest
     * @return DirectBindDeviceInFamilyResponse
     * @throws TencentCloudSDKException
     */
    public DirectBindDeviceInFamilyResponse DirectBindDeviceInFamily(DirectBindDeviceInFamilyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DirectBindDeviceInFamily", DirectBindDeviceInFamilyResponse.class);
    }

    /**
     *禁用规则
     * @param req DisableTopicRuleRequest
     * @return DisableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableTopicRuleResponse DisableTopicRule(DisableTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableTopicRule", DisableTopicRuleResponse.class);
    }

    /**
     *解散TRTC房间
     * @param req DismissRoomByStrRoomIdFromTRTCRequest
     * @return DismissRoomByStrRoomIdFromTRTCResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomByStrRoomIdFromTRTCResponse DismissRoomByStrRoomIdFromTRTC(DismissRoomByStrRoomIdFromTRTCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DismissRoomByStrRoomIdFromTRTC", DismissRoomByStrRoomIdFromTRTCResponse.class);
    }

    /**
     *启用规则
     * @param req EnableTopicRuleRequest
     * @return EnableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableTopicRuleResponse EnableTopicRule(EnableTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTopicRule", EnableTopicRuleResponse.class);
    }

    /**
     *无
     * @param req GenSingleDeviceSignatureOfPublicRequest
     * @return GenSingleDeviceSignatureOfPublicResponse
     * @throws TencentCloudSDKException
     */
    public GenSingleDeviceSignatureOfPublicResponse GenSingleDeviceSignatureOfPublic(GenSingleDeviceSignatureOfPublicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenSingleDeviceSignatureOfPublic", GenSingleDeviceSignatureOfPublicResponse.class);
    }

    /**
     *获取云存 AI 分析任务输出文件的下载地址
     * @param req GenerateCloudStorageAIServiceTaskFileURLRequest
     * @return GenerateCloudStorageAIServiceTaskFileURLResponse
     * @throws TencentCloudSDKException
     */
    public GenerateCloudStorageAIServiceTaskFileURLResponse GenerateCloudStorageAIServiceTaskFileURL(GenerateCloudStorageAIServiceTaskFileURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateCloudStorageAIServiceTaskFileURL", GenerateCloudStorageAIServiceTaskFileURLResponse.class);
    }

    /**
     *获取视频防盗链播放URL
     * @param req GenerateSignedVideoURLRequest
     * @return GenerateSignedVideoURLResponse
     * @throws TencentCloudSDKException
     */
    public GenerateSignedVideoURLResponse GenerateSignedVideoURL(GenerateSignedVideoURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GenerateSignedVideoURL", GenerateSignedVideoURLResponse.class);
    }

    /**
     *查询小程序列表
     * @param req GetAuthMiniProgramAppListRequest
     * @return GetAuthMiniProgramAppListResponse
     * @throws TencentCloudSDKException
     */
    public GetAuthMiniProgramAppListResponse GetAuthMiniProgramAppList(GetAuthMiniProgramAppListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAuthMiniProgramAppList", GetAuthMiniProgramAppListResponse.class);
    }

    /**
     *列出量产数据列表信息。
     * @param req GetBatchProductionsListRequest
     * @return GetBatchProductionsListResponse
     * @throws TencentCloudSDKException
     */
    public GetBatchProductionsListResponse GetBatchProductionsList(GetBatchProductionsListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetBatchProductionsList", GetBatchProductionsListResponse.class);
    }

    /**
     *本接口（GetCOSURL）用于获取固件COS存储的上传请求URL地址
     * @param req GetCOSURLRequest
     * @return GetCOSURLResponse
     * @throws TencentCloudSDKException
     */
    public GetCOSURLResponse GetCOSURL(GetCOSURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetCOSURL", GetCOSURLResponse.class);
    }

    /**
     *用于查询某个产品下的设备列表
     * @param req GetDeviceListRequest
     * @return GetDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceListResponse GetDeviceList(GetDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceList", GetDeviceListResponse.class);
    }

    /**
     *获取设备历史位置
     * @param req GetDeviceLocationHistoryRequest
     * @return GetDeviceLocationHistoryResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceLocationHistoryResponse GetDeviceLocationHistory(GetDeviceLocationHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceLocationHistory", GetDeviceLocationHistoryResponse.class);
    }

    /**
     *拉取设备统计汇总数据
     * @param req GetDeviceSumStatisticsRequest
     * @return GetDeviceSumStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceSumStatisticsResponse GetDeviceSumStatistics(GetDeviceSumStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceSumStatistics", GetDeviceSumStatisticsResponse.class);
    }

    /**
     *用于获取设备绑定的用户列表
     * @param req GetFamilyDeviceUserListRequest
     * @return GetFamilyDeviceUserListResponse
     * @throws TencentCloudSDKException
     */
    public GetFamilyDeviceUserListResponse GetFamilyDeviceUserList(GetFamilyDeviceUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFamilyDeviceUserList", GetFamilyDeviceUserListResponse.class);
    }

    /**
     *获取指定网关设备的子设备列表
     * @param req GetGatewaySubDeviceListRequest
     * @return GetGatewaySubDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public GetGatewaySubDeviceListResponse GetGatewaySubDeviceList(GetGatewaySubDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGatewaySubDeviceList", GetGatewaySubDeviceListResponse.class);
    }

    /**
     *获取 LoRa 网关列表接口
     * @param req GetLoRaGatewayListRequest
     * @return GetLoRaGatewayListResponse
     * @throws TencentCloudSDKException
     */
    public GetLoRaGatewayListResponse GetLoRaGatewayList(GetLoRaGatewayListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLoRaGatewayList", GetLoRaGatewayListResponse.class);
    }

    /**
     *获取位置空间列表
     * @param req GetPositionSpaceListRequest
     * @return GetPositionSpaceListResponse
     * @throws TencentCloudSDKException
     */
    public GetPositionSpaceListResponse GetPositionSpaceList(GetPositionSpaceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPositionSpaceList", GetPositionSpaceListResponse.class);
    }

    /**
     *提供查询用户所创建的项目列表查询功能。
     * @param req GetProjectListRequest
     * @return GetProjectListResponse
     * @throws TencentCloudSDKException
     */
    public GetProjectListResponse GetProjectList(GetProjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetProjectList", GetProjectListResponse.class);
    }

    /**
     *提供查询某个项目下所有产品信息的能力。
     * @param req GetStudioProductListRequest
     * @return GetStudioProductListResponse
     * @throws TencentCloudSDKException
     */
    public GetStudioProductListResponse GetStudioProductList(GetStudioProductListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetStudioProductList", GetStudioProductListResponse.class);
    }

    /**
     *查询激活状态
     * @param req GetTWeCallActiveStatusRequest
     * @return GetTWeCallActiveStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetTWeCallActiveStatusResponse GetTWeCallActiveStatus(GetTWeCallActiveStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTWeCallActiveStatus", GetTWeCallActiveStatusResponse.class);
    }

    /**
     *获取规则列表
     * @param req GetTopicRuleListRequest
     * @return GetTopicRuleListResponse
     * @throws TencentCloudSDKException
     */
    public GetTopicRuleListResponse GetTopicRuleList(GetTopicRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTopicRuleList", GetTopicRuleListResponse.class);
    }

    /**
     *查询微信设备授权票据
     * @param req GetWechatDeviceTicketRequest
     * @return GetWechatDeviceTicketResponse
     * @throws TencentCloudSDKException
     */
    public GetWechatDeviceTicketResponse GetWechatDeviceTicket(GetWechatDeviceTicketRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWechatDeviceTicket", GetWechatDeviceTicketResponse.class);
    }

    /**
     *继承云存用户
     * @param req InheritCloudStorageUserRequest
     * @return InheritCloudStorageUserResponse
     * @throws TencentCloudSDKException
     */
    public InheritCloudStorageUserResponse InheritCloudStorageUser(InheritCloudStorageUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InheritCloudStorageUser", InheritCloudStorageUserResponse.class);
    }

    /**
     *视频语义搜索
     * @param req InvokeAISearchServiceRequest
     * @return InvokeAISearchServiceResponse
     * @throws TencentCloudSDKException
     */
    public InvokeAISearchServiceResponse InvokeAISearchService(InvokeAISearchServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeAISearchService", InvokeAISearchServiceResponse.class);
    }

    /**
     *同步执行设备云存 AI 分析任务
     * @param req InvokeCloudStorageAIServiceTaskRequest
     * @return InvokeCloudStorageAIServiceTaskResponse
     * @throws TencentCloudSDKException
     */
    public InvokeCloudStorageAIServiceTaskResponse InvokeCloudStorageAIServiceTask(InvokeCloudStorageAIServiceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeCloudStorageAIServiceTask", InvokeCloudStorageAIServiceTaskResponse.class);
    }

    /**
     *创建外部视频 AI 分析任务
     * @param req InvokeExternalSourceAIServiceTaskRequest
     * @return InvokeExternalSourceAIServiceTaskResponse
     * @throws TencentCloudSDKException
     */
    public InvokeExternalSourceAIServiceTaskResponse InvokeExternalSourceAIServiceTask(InvokeExternalSourceAIServiceTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeExternalSourceAIServiceTask", InvokeExternalSourceAIServiceTaskResponse.class);
    }

    /**
     *同步执行 TWeSee 语义理解任务
     * @param req InvokeTWeSeeRecognitionTaskRequest
     * @return InvokeTWeSeeRecognitionTaskResponse
     * @throws TencentCloudSDKException
     */
    public InvokeTWeSeeRecognitionTaskResponse InvokeTWeSeeRecognitionTask(InvokeTWeSeeRecognitionTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InvokeTWeSeeRecognitionTask", InvokeTWeSeeRecognitionTaskResponse.class);
    }

    /**
     *获取设备的历史事件
     * @param req ListEventHistoryRequest
     * @return ListEventHistoryResponse
     * @throws TencentCloudSDKException
     */
    public ListEventHistoryResponse ListEventHistory(ListEventHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListEventHistory", ListEventHistoryResponse.class);
    }

    /**
     *本接口（ListFirmwares）用于获取固件列表
     * @param req ListFirmwaresRequest
     * @return ListFirmwaresResponse
     * @throws TencentCloudSDKException
     */
    public ListFirmwaresResponse ListFirmwares(ListFirmwaresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFirmwares", ListFirmwaresResponse.class);
    }

    /**
     *本接口（ListTopicPolicy）用于获取Topic列表
     * @param req ListTopicPolicyRequest
     * @return ListTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ListTopicPolicyResponse ListTopicPolicy(ListTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTopicPolicy", ListTopicPolicyResponse.class);
    }

    /**
     *更新应用信息
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplication", ModifyApplicationResponse.class);
    }

    /**
     *修改指定设备的云存 AI 服务参数配置
     * @param req ModifyCloudStorageAIServiceRequest
     * @return ModifyCloudStorageAIServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudStorageAIServiceResponse ModifyCloudStorageAIService(ModifyCloudStorageAIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudStorageAIService", ModifyCloudStorageAIServiceResponse.class);
    }

    /**
     *修改云存AI分析回调配置
     * @param req ModifyCloudStorageAIServiceCallbackRequest
     * @return ModifyCloudStorageAIServiceCallbackResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudStorageAIServiceCallbackResponse ModifyCloudStorageAIServiceCallback(ModifyCloudStorageAIServiceCallbackRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudStorageAIServiceCallback", ModifyCloudStorageAIServiceCallbackResponse.class);
    }

    /**
     *更新围栏绑定信息
     * @param req ModifyFenceBindRequest
     * @return ModifyFenceBindResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFenceBindResponse ModifyFenceBind(ModifyFenceBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFenceBind", ModifyFenceBindResponse.class);
    }

    /**
     *修改LoRa自定义频点
     * @param req ModifyLoRaFrequencyRequest
     * @return ModifyLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoRaFrequencyResponse ModifyLoRaFrequency(ModifyLoRaFrequencyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoRaFrequency", ModifyLoRaFrequencyResponse.class);
    }

    /**
     *修改 LoRa 网关信息
     * @param req ModifyLoRaGatewayRequest
     * @return ModifyLoRaGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoRaGatewayResponse ModifyLoRaGateway(ModifyLoRaGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLoRaGateway", ModifyLoRaGatewayResponse.class);
    }

    /**
     *提供修改产品的数据模板的能力
     * @param req ModifyModelDefinitionRequest
     * @return ModifyModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelDefinitionResponse ModifyModelDefinition(ModifyModelDefinitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelDefinition", ModifyModelDefinitionResponse.class);
    }

    /**
     *更新围栏
     * @param req ModifyPositionFenceRequest
     * @return ModifyPositionFenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPositionFenceResponse ModifyPositionFence(ModifyPositionFenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPositionFence", ModifyPositionFenceResponse.class);
    }

    /**
     *更新位置空间
     * @param req ModifyPositionSpaceRequest
     * @return ModifyPositionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPositionSpaceResponse ModifyPositionSpace(ModifyPositionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPositionSpace", ModifyPositionSpaceResponse.class);
    }

    /**
     *修改指定产品的云存 AI 服务开通状态
     * @param req ModifyProductCloudStorageAIServiceRequest
     * @return ModifyProductCloudStorageAIServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductCloudStorageAIServiceResponse ModifyProductCloudStorageAIService(ModifyProductCloudStorageAIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProductCloudStorageAIService", ModifyProductCloudStorageAIServiceResponse.class);
    }

    /**
     *修改项目
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *更新位置空间产品属性
     * @param req ModifySpacePropertyRequest
     * @return ModifySpacePropertyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpacePropertyResponse ModifySpaceProperty(ModifySpacePropertyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySpaceProperty", ModifySpacePropertyResponse.class);
    }

    /**
     *提供修改产品的名称和描述等信息的能力，对于已发布产品不允许进行修改。
     * @param req ModifyStudioProductRequest
     * @return ModifyStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStudioProductResponse ModifyStudioProduct(ModifyStudioProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStudioProduct", ModifyStudioProductResponse.class);
    }

    /**
     *修改 TWeSee 配置
     * @param req ModifyTWeSeeConfigRequest
     * @return ModifyTWeSeeConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTWeSeeConfigResponse ModifyTWeSeeConfig(ModifyTWeSeeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTWeSeeConfig", ModifyTWeSeeConfigResponse.class);
    }

    /**
     *本接口（UpdateTopicPolicy）用于更新Topic信息
     * @param req ModifyTopicPolicyRequest
     * @return ModifyTopicPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicPolicyResponse ModifyTopicPolicy(ModifyTopicPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopicPolicy", ModifyTopicPolicyResponse.class);
    }

    /**
     *修改规则
     * @param req ModifyTopicRuleRequest
     * @return ModifyTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicRuleResponse ModifyTopicRule(ModifyTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopicRule", ModifyTopicRuleResponse.class);
    }

    /**
     *暂停设备
     * @param req PauseTWeCallDeviceRequest
     * @return PauseTWeCallDeviceResponse
     * @throws TencentCloudSDKException
     */
    public PauseTWeCallDeviceResponse PauseTWeCallDevice(PauseTWeCallDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PauseTWeCallDevice", PauseTWeCallDeviceResponse.class);
    }

    /**
     *发布广播消息、发布RRPC消息属于早期服务，目前已停止维护，需要从官网下线。

发布广播消息
     * @param req PublishBroadcastMessageRequest
     * @return PublishBroadcastMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishBroadcastMessageResponse PublishBroadcastMessage(PublishBroadcastMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishBroadcastMessage", PublishBroadcastMessageResponse.class);
    }

    /**
     *本接口（PublishFirmwareUpdateMessage）用于用户确认升级后，云端向设备发起固件升级请求。
     * @param req PublishFirmwareUpdateMessageRequest
     * @return PublishFirmwareUpdateMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishFirmwareUpdateMessageResponse PublishFirmwareUpdateMessage(PublishFirmwareUpdateMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishFirmwareUpdateMessage", PublishFirmwareUpdateMessageResponse.class);
    }

    /**
     *本接口（PublishMessage）用于使用自定义透传协议进行设备远控
     * @param req PublishMessageRequest
     * @return PublishMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishMessageResponse PublishMessage(PublishMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishMessage", PublishMessageResponse.class);
    }

    /**
     *发布广播消息、发布RRPC消息属于早期服务，目前已停止维护，需要从官网下线。

下发RRPC消息
     * @param req PublishRRPCMessageRequest
     * @return PublishRRPCMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishRRPCMessageResponse PublishRRPCMessage(PublishRRPCMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishRRPCMessage", PublishRRPCMessageResponse.class);
    }

    /**
     *产品开发完成并测试通过后，通过发布产品将产品设置为发布状态
     * @param req ReleaseStudioProductRequest
     * @return ReleaseStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseStudioProductResponse ReleaseStudioProduct(ReleaseStudioProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReleaseStudioProduct", ReleaseStudioProductResponse.class);
    }

    /**
     *TRTC操作，将用户从房间移出
     * @param req RemoveUserByRoomIdFromTRTCRequest
     * @return RemoveUserByRoomIdFromTRTCResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserByRoomIdFromTRTCResponse RemoveUserByRoomIdFromTRTC(RemoveUserByRoomIdFromTRTCRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveUserByRoomIdFromTRTC", RemoveUserByRoomIdFromTRTCResponse.class);
    }

    /**
     *重置云存服务
     * @param req ResetCloudStorageRequest
     * @return ResetCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public ResetCloudStorageResponse ResetCloudStorage(ResetCloudStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetCloudStorage", ResetCloudStorageResponse.class);
    }

    /**
     *重置指定设备的云存 AI 服务
     * @param req ResetCloudStorageAIServiceRequest
     * @return ResetCloudStorageAIServiceResponse
     * @throws TencentCloudSDKException
     */
    public ResetCloudStorageAIServiceResponse ResetCloudStorageAIService(ResetCloudStorageAIServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetCloudStorageAIService", ResetCloudStorageAIServiceResponse.class);
    }

    /**
     *重置云存事件
     * @param req ResetCloudStorageEventRequest
     * @return ResetCloudStorageEventResponse
     * @throws TencentCloudSDKException
     */
    public ResetCloudStorageEventResponse ResetCloudStorageEvent(ResetCloudStorageEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetCloudStorageEvent", ResetCloudStorageEventResponse.class);
    }

    /**
     *重置设备
     * @param req ResetTWeCallDeviceRequest
     * @return ResetTWeCallDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ResetTWeCallDeviceResponse ResetTWeCallDevice(ResetTWeCallDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetTWeCallDevice", ResetTWeCallDeviceResponse.class);
    }

    /**
     *恢复设备
     * @param req ResumeWeCallDeviceRequest
     * @return ResumeWeCallDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeWeCallDeviceResponse ResumeWeCallDevice(ResumeWeCallDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResumeWeCallDevice", ResumeWeCallDeviceResponse.class);
    }

    /**
     *搜索位置空间
     * @param req SearchPositionSpaceRequest
     * @return SearchPositionSpaceResponse
     * @throws TencentCloudSDKException
     */
    public SearchPositionSpaceResponse SearchPositionSpace(SearchPositionSpaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchPositionSpace", SearchPositionSpaceResponse.class);
    }

    /**
     *提供根据产品名称查找产品的能力
     * @param req SearchStudioProductRequest
     * @return SearchStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public SearchStudioProductResponse SearchStudioProduct(SearchStudioProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchStudioProduct", SearchStudioProductResponse.class);
    }

    /**
     *搜索规则
     * @param req SearchTopicRuleRequest
     * @return SearchTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public SearchTopicRuleResponse SearchTopicRule(SearchTopicRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchTopicRule", SearchTopicRuleResponse.class);
    }

    /**
     *转移云存服务
     * @param req TransferCloudStorageRequest
     * @return TransferCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public TransferCloudStorageResponse TransferCloudStorage(TransferCloudStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferCloudStorage", TransferCloudStorageResponse.class);
    }

    /**
     *转移设备
     * @param req TransferTWeCallDeviceRequest
     * @return TransferTWeCallDeviceResponse
     * @throws TencentCloudSDKException
     */
    public TransferTWeCallDeviceResponse TransferTWeCallDevice(TransferTWeCallDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransferTWeCallDevice", TransferTWeCallDeviceResponse.class);
    }

    /**
     *批量解绑子设备
     * @param req UnbindDevicesRequest
     * @return UnbindDevicesResponse
     * @throws TencentCloudSDKException
     */
    public UnbindDevicesResponse UnbindDevices(UnbindDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindDevices", UnbindDevicesResponse.class);
    }

    /**
     *批量解绑子产品
     * @param req UnbindProductsRequest
     * @return UnbindProductsResponse
     * @throws TencentCloudSDKException
     */
    public UnbindProductsResponse UnbindProducts(UnbindProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindProducts", UnbindProductsResponse.class);
    }

    /**
     *更新用户对设备的TweCall授权状态
     * @param req UpdateDeviceTWeCallAuthorizeStatusRequest
     * @return UpdateDeviceTWeCallAuthorizeStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceTWeCallAuthorizeStatusResponse UpdateDeviceTWeCallAuthorizeStatus(UpdateDeviceTWeCallAuthorizeStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceTWeCallAuthorizeStatus", UpdateDeviceTWeCallAuthorizeStatusResponse.class);
    }

    /**
     *批量禁用启用设备
     * @param req UpdateDevicesEnableStateRequest
     * @return UpdateDevicesEnableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicesEnableStateResponse UpdateDevicesEnableState(UpdateDevicesEnableStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDevicesEnableState", UpdateDevicesEnableStateResponse.class);
    }

    /**
     *本接口（UpdateFirmware）用于对指定设备发起固件升级请求
     * @param req UpdateFirmwareRequest
     * @return UpdateFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFirmwareResponse UpdateFirmware(UpdateFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFirmware", UpdateFirmwareResponse.class);
    }

    /**
     *本接口（UploadFirmware）用于创建设备固件版本信息，在平台用于固件版本升级、固件资源下发等。
     * @param req UploadFirmwareRequest
     * @return UploadFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UploadFirmwareResponse UploadFirmware(UploadFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFirmware", UploadFirmwareResponse.class);
    }

}
