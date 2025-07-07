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
package com.tencentcloudapi.iotvideo.v20201215;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotvideo.v20201215.models.*;

public class IotvideoClient extends AbstractClient{
    private static String endpoint = "iotvideo.tencentcloudapi.com";
    private static String service = "iotvideo";
    private static String version = "2020-12-15";

    public IotvideoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotvideoClient(Credential credential, String region, ClientProfile profile) {
        super(IotvideoClient.endpoint, IotvideoClient.version, credential, region, profile);
    }

    /**
     *申请AI模型
     * @param req ApplyAIModelRequest
     * @return ApplyAIModelResponse
     * @throws TencentCloudSDKException
     */
    public ApplyAIModelResponse ApplyAIModel(ApplyAIModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyAIModel", ApplyAIModelResponse.class);
    }

    /**
     *本接口（BatchUpdateFirmware）用于批量更新设备固件
     * @param req BatchUpdateFirmwareRequest
     * @return BatchUpdateFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public BatchUpdateFirmwareResponse BatchUpdateFirmware(BatchUpdateFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchUpdateFirmware", BatchUpdateFirmwareResponse.class);
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
     *取消AI模型申请
     * @param req CancelAIModelApplicationRequest
     * @return CancelAIModelApplicationResponse
     * @throws TencentCloudSDKException
     */
    public CancelAIModelApplicationResponse CancelAIModelApplication(CancelAIModelApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAIModelApplication", CancelAIModelApplicationResponse.class);
    }

    /**
     *本接口用于取消设备升级任务
     * @param req CancelDeviceFirmwareTaskRequest
     * @return CancelDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelDeviceFirmwareTaskResponse CancelDeviceFirmwareTask(CancelDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelDeviceFirmwareTask", CancelDeviceFirmwareTaskResponse.class);
    }

    /**
     *判断是否开启转发的权限
     * @param req CheckForwardAuthRequest
     * @return CheckForwardAuthResponse
     * @throws TencentCloudSDKException
     */
    public CheckForwardAuthResponse CheckForwardAuth(CheckForwardAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckForwardAuth", CheckForwardAuthResponse.class);
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
     *发起AI推理请求
     * @param req CreateAIDetectionRequest
     * @return CreateAIDetectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateAIDetectionResponse CreateAIDetection(CreateAIDetectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAIDetection", CreateAIDetectionResponse.class);
    }

    /**
     *创建批次
     * @param req CreateBatchRequest
     * @return CreateBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchResponse CreateBatch(CreateBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBatch", CreateBatchResponse.class);
    }

    /**
     *创建COS上传密钥
     * @param req CreateCOSCredentialsRequest
     * @return CreateCOSCredentialsResponse
     * @throws TencentCloudSDKException
     */
    public CreateCOSCredentialsResponse CreateCOSCredentials(CreateCOSCredentialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCOSCredentials", CreateCOSCredentialsResponse.class);
    }

    /**
     *开通云存服务
     * @param req CreateCloudStorageRequest
     * @return CreateCloudStorageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudStorageResponse CreateCloudStorage(CreateCloudStorageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudStorage", CreateCloudStorageResponse.class);
    }

    /**
     *创建数据转发
     * @param req CreateDataForwardRequest
     * @return CreateDataForwardResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataForwardResponse CreateDataForward(CreateDataForwardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataForward", CreateDataForwardResponse.class);
    }

    /**
     *创建转发规则
     * @param req CreateForwardRuleRequest
     * @return CreateForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateForwardRuleResponse CreateForwardRule(CreateForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateForwardRule", CreateForwardRuleResponse.class);
    }

    /**
     *创建产品
     * @param req CreateProductRequest
     * @return CreateProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateProductResponse CreateProduct(CreateProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProduct", CreateProductResponse.class);
    }

    /**
     *本接口（CreateTaskFileUrl）用于获取产品级任务文件上传链接
     * @param req CreateTaskFileUrlRequest
     * @return CreateTaskFileUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFileUrlResponse CreateTaskFileUrl(CreateTaskFileUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFileUrl", CreateTaskFileUrlResponse.class);
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
     *本接口（DeleteFirmware）用于删除固件
     * @param req DeleteFirmwareRequest
     * @return DeleteFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFirmwareResponse DeleteFirmware(DeleteFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFirmware", DeleteFirmwareResponse.class);
    }

    /**
     *删除转发规则
     * @param req DeleteForwardRuleRequest
     * @return DeleteForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteForwardRuleResponse DeleteForwardRule(DeleteForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteForwardRule", DeleteForwardRuleResponse.class);
    }

    /**
     *删除产品
     * @param req DeleteProductRequest
     * @return DeleteProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProductResponse DeleteProduct(DeleteProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProduct", DeleteProductResponse.class);
    }

    /**
     *用户AI模型申请记录
     * @param req DescribeAIModelApplicationsRequest
     * @return DescribeAIModelApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIModelApplicationsResponse DescribeAIModelApplications(DescribeAIModelApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIModelApplications", DescribeAIModelApplicationsResponse.class);
    }

    /**
     *查看AI推理结果推送配置
     * @param req DescribeAIModelChannelRequest
     * @return DescribeAIModelChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIModelChannelResponse DescribeAIModelChannel(DescribeAIModelChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIModelChannel", DescribeAIModelChannelResponse.class);
    }

    /**
     *查看AI模型资源包
     * @param req DescribeAIModelUsageRequest
     * @return DescribeAIModelUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIModelUsageResponse DescribeAIModelUsage(DescribeAIModelUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIModelUsage", DescribeAIModelUsageResponse.class);
    }

    /**
     *拉取AI模型列表
     * @param req DescribeAIModelsRequest
     * @return DescribeAIModelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAIModelsResponse DescribeAIModels(DescribeAIModelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAIModels", DescribeAIModelsResponse.class);
    }

    /**
     *查询账户余额
     * @param req DescribeBalanceRequest
     * @return DescribeBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBalanceResponse DescribeBalance(DescribeBalanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBalance", DescribeBalanceResponse.class);
    }

    /**
     *拉取账户流水
     * @param req DescribeBalanceTransactionsRequest
     * @return DescribeBalanceTransactionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBalanceTransactionsResponse DescribeBalanceTransactions(DescribeBalanceTransactionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBalanceTransactions", DescribeBalanceTransactionsResponse.class);
    }

    /**
     *获取批次详情
     * @param req DescribeBatchRequest
     * @return DescribeBatchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchResponse DescribeBatch(DescribeBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatch", DescribeBatchResponse.class);
    }

    /**
     *获取批次列表
     * @param req DescribeBatchsRequest
     * @return DescribeBatchsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchsResponse DescribeBatchs(DescribeBatchsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchs", DescribeBatchsResponse.class);
    }

    /**
     *获取Category详情
     * @param req DescribeCategoryRequest
     * @return DescribeCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCategoryResponse DescribeCategory(DescribeCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCategory", DescribeCategoryResponse.class);
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
     *获取数据转发列表
     * @param req DescribeDataForwardListRequest
     * @return DescribeDataForwardListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataForwardListResponse DescribeDataForwardList(DescribeDataForwardListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataForwardList", DescribeDataForwardListResponse.class);
    }

    /**
     *查看设备详情
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevice", DescribeDeviceResponse.class);
    }

    /**
     *为用户提供获取动作历史的能力。
     * @param req DescribeDeviceActionHistoryRequest
     * @return DescribeDeviceActionHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceActionHistoryResponse DescribeDeviceActionHistory(DescribeDeviceActionHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceActionHistory", DescribeDeviceActionHistoryResponse.class);
    }

    /**
     *获取设备在指定时间范围内的通讯日志
     * @param req DescribeDeviceCommLogRequest
     * @return DescribeDeviceCommLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceCommLogResponse DescribeDeviceCommLog(DescribeDeviceCommLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceCommLog", DescribeDeviceCommLogResponse.class);
    }

    /**
     *获取设备属性数据
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
     *获取设备的历史事件
     * @param req DescribeDeviceEventHistoryRequest
     * @return DescribeDeviceEventHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceEventHistoryResponse DescribeDeviceEventHistory(DescribeDeviceEventHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceEventHistory", DescribeDeviceEventHistoryResponse.class);
    }

    /**
     *获取设备上下线日志
     * @param req DescribeDeviceStatusLogRequest
     * @return DescribeDeviceStatusLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceStatusLogResponse DescribeDeviceStatusLog(DescribeDeviceStatusLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceStatusLog", DescribeDeviceStatusLogResponse.class);
    }

    /**
     *获取设备列表
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevices", DescribeDevicesResponse.class);
    }

    /**
     *本接口（DescribeFirmware）用于查询固件信息
     * @param req DescribeFirmwareRequest
     * @return DescribeFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareResponse DescribeFirmware(DescribeFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmware", DescribeFirmwareResponse.class);
    }

    /**
     *此接口查询固件升级任务详情
     * @param req DescribeFirmwareTaskRequest
     * @return DescribeFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskResponse DescribeFirmwareTask(DescribeFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTask", DescribeFirmwareTaskResponse.class);
    }

    /**
     *本接口用于查询固件升级任务的设备列表
     * @param req DescribeFirmwareTaskDevicesRequest
     * @return DescribeFirmwareTaskDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDevicesResponse DescribeFirmwareTaskDevices(DescribeFirmwareTaskDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTaskDevices", DescribeFirmwareTaskDevicesResponse.class);
    }

    /**
     *本接口用于查询固件升级任务状态分布
     * @param req DescribeFirmwareTaskDistributionRequest
     * @return DescribeFirmwareTaskDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskDistributionResponse DescribeFirmwareTaskDistribution(DescribeFirmwareTaskDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTaskDistribution", DescribeFirmwareTaskDistributionResponse.class);
    }

    /**
     *本接口用于查询固件升级任务统计信息
     * @param req DescribeFirmwareTaskStatisticsRequest
     * @return DescribeFirmwareTaskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskStatisticsResponse DescribeFirmwareTaskStatistics(DescribeFirmwareTaskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTaskStatistics", DescribeFirmwareTaskStatisticsResponse.class);
    }

    /**
     *本接口用于查询固件升级任务列表
     * @param req DescribeFirmwareTasksRequest
     * @return DescribeFirmwareTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTasksResponse DescribeFirmwareTasks(DescribeFirmwareTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFirmwareTasks", DescribeFirmwareTasksResponse.class);
    }

    /**
     *获取产品转发规则
     * @param req DescribeForwardRuleRequest
     * @return DescribeForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeForwardRuleResponse DescribeForwardRule(DescribeForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeForwardRule", DescribeForwardRuleResponse.class);
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
     *获取产品详情
     * @param req DescribeProductRequest
     * @return DescribeProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductResponse DescribeProduct(DescribeProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProduct", DescribeProductResponse.class);
    }

    /**
     *获取产品动态注册详情
     * @param req DescribeProductDynamicRegisterRequest
     * @return DescribeProductDynamicRegisterResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductDynamicRegisterResponse DescribeProductDynamicRegister(DescribeProductDynamicRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductDynamicRegister", DescribeProductDynamicRegisterResponse.class);
    }

    /**
     *获取产品列表
     * @param req DescribeProductsRequest
     * @return DescribeProductsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductsResponse DescribeProducts(DescribeProductsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProducts", DescribeProductsResponse.class);
    }

    /**
     *获取设备sdk日志
     * @param req DescribeSDKLogRequest
     * @return DescribeSDKLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSDKLogResponse DescribeSDKLog(DescribeSDKLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSDKLog", DescribeSDKLogResponse.class);
    }

    /**
     *本接口用于编辑固件信息
     * @param req EditFirmwareRequest
     * @return EditFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public EditFirmwareResponse EditFirmware(EditFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditFirmware", EditFirmwareResponse.class);
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
     *本接口（GetAllFirmwareVersion）用于获取所有的版本列表
     * @param req GetAllFirmwareVersionRequest
     * @return GetAllFirmwareVersionResponse
     * @throws TencentCloudSDKException
     */
    public GetAllFirmwareVersionResponse GetAllFirmwareVersion(GetAllFirmwareVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAllFirmwareVersion", GetAllFirmwareVersionResponse.class);
    }

    /**
     *本接口（GetFirmwareURL）用于获取固件存储的URL
     * @param req GetFirmwareURLRequest
     * @return GetFirmwareURLResponse
     * @throws TencentCloudSDKException
     */
    public GetFirmwareURLResponse GetFirmwareURL(GetFirmwareURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFirmwareURL", GetFirmwareURLResponse.class);
    }

    /**
     *导入其它产品的数据模板，覆盖现有数据模板的物模型和产品分类信息
     * @param req ImportModelDefinitionRequest
     * @return ImportModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public ImportModelDefinitionResponse ImportModelDefinition(ImportModelDefinitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportModelDefinition", ImportModelDefinitionResponse.class);
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
     *修改数据转发
     * @param req ModifyDataForwardRequest
     * @return ModifyDataForwardResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataForwardResponse ModifyDataForward(ModifyDataForwardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataForward", ModifyDataForwardResponse.class);
    }

    /**
     *设置数据转发状态
     * @param req ModifyDataForwardStatusRequest
     * @return ModifyDataForwardStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataForwardStatusResponse ModifyDataForwardStatus(ModifyDataForwardStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataForwardStatus", ModifyDataForwardStatusResponse.class);
    }

    /**
     *修改设备信息
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDevice", ModifyDeviceResponse.class);
    }

    /**
     *更新设备日志级别
     * @param req ModifyDeviceLogLevelRequest
     * @return ModifyDeviceLogLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceLogLevelResponse ModifyDeviceLogLevel(ModifyDeviceLogLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceLogLevel", ModifyDeviceLogLevelResponse.class);
    }

    /**
     *修改转发规则
     * @param req ModifyForwardRuleRequest
     * @return ModifyForwardRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyForwardRuleResponse ModifyForwardRule(ModifyForwardRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyForwardRule", ModifyForwardRuleResponse.class);
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
     *修改产品信息
     * @param req ModifyProductRequest
     * @return ModifyProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductResponse ModifyProduct(ModifyProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProduct", ModifyProductResponse.class);
    }

    /**
     *修改产品动态注册
     * @param req ModifyProductDynamicRegisterRequest
     * @return ModifyProductDynamicRegisterResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProductDynamicRegisterResponse ModifyProductDynamicRegister(ModifyProductDynamicRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProductDynamicRegister", ModifyProductDynamicRegisterResponse.class);
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
     *上报活跃设备
     * @param req ReportAliveDeviceRequest
     * @return ReportAliveDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ReportAliveDeviceResponse ReportAliveDevice(ReportAliveDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportAliveDevice", ReportAliveDeviceResponse.class);
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
     *本接口用于重试设备升级任务
     * @param req RetryDeviceFirmwareTaskRequest
     * @return RetryDeviceFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryDeviceFirmwareTaskResponse RetryDeviceFirmwareTask(RetryDeviceFirmwareTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryDeviceFirmwareTask", RetryDeviceFirmwareTaskResponse.class);
    }

    /**
     *设置转发权限
     * @param req SetForwardAuthRequest
     * @return SetForwardAuthResponse
     * @throws TencentCloudSDKException
     */
    public SetForwardAuthResponse SetForwardAuth(SetForwardAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetForwardAuth", SetForwardAuthResponse.class);
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
     *更新AI推理结果推送配置
     * @param req UpdateAIModelChannelRequest
     * @return UpdateAIModelChannelResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAIModelChannelResponse UpdateAIModelChannel(UpdateAIModelChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAIModelChannel", UpdateAIModelChannelResponse.class);
    }

    /**
     *本接口（UploadFirmware）用于上传设备固件信息
     * @param req UploadFirmwareRequest
     * @return UploadFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UploadFirmwareResponse UploadFirmware(UploadFirmwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFirmware", UploadFirmwareResponse.class);
    }

    /**
     *设备唤醒
     * @param req WakeUpDeviceRequest
     * @return WakeUpDeviceResponse
     * @throws TencentCloudSDKException
     */
    public WakeUpDeviceResponse WakeUpDevice(WakeUpDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "WakeUpDevice", WakeUpDeviceResponse.class);
    }

}
