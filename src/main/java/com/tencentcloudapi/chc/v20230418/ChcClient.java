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
package com.tencentcloudapi.chc.v20230418;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.chc.v20230418.models.*;

public class ChcClient extends AbstractClient{
    private static String endpoint = "chc.tencentcloudapi.com";
    private static String service = "chc";
    private static String version = "2023-04-18";
    
    public ChcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ChcClient(Credential credential, String region, ClientProfile profile) {
        super(ChcClient.endpoint, ChcClient.version, credential, region, profile);
    }

    /**
     *确认通用服务工单
     * @param req ConfirmCommonServiceWorkOrderRequest
     * @return ConfirmCommonServiceWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public ConfirmCommonServiceWorkOrderResponse ConfirmCommonServiceWorkOrder(ConfirmCommonServiceWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ConfirmCommonServiceWorkOrder", ConfirmCommonServiceWorkOrderResponse.class);
    }

    /**
     *创建通用工单
     * @param req CreateCommonServiceWorkOrderRequest
     * @return CreateCommonServiceWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommonServiceWorkOrderResponse CreateCommonServiceWorkOrder(CreateCommonServiceWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCommonServiceWorkOrder", CreateCommonServiceWorkOrderResponse.class);
    }

    /**
     *创建设备型号评估工单
     * @param req CreateModelEvaluationWorkOrderRequest
     * @return CreateModelEvaluationWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelEvaluationWorkOrderResponse CreateModelEvaluationWorkOrder(CreateModelEvaluationWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModelEvaluationWorkOrder", CreateModelEvaluationWorkOrderResponse.class);
    }

    /**
     *创建设备搬迁工单
     * @param req CreateMovingWorkOrderRequest
     * @return CreateMovingWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateMovingWorkOrderResponse CreateMovingWorkOrder(CreateMovingWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMovingWorkOrder", CreateMovingWorkOrderResponse.class);
    }

    /**
     *创建新的网络设备型号
     * @param req CreateNetDeviceModelRequest
     * @return CreateNetDeviceModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetDeviceModelResponse CreateNetDeviceModel(CreateNetDeviceModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNetDeviceModel", CreateNetDeviceModelResponse.class);
    }

    /**
     *创建人员到访工单
     * @param req CreatePersonnelVisitWorkOrderRequest
     * @return CreatePersonnelVisitWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonnelVisitWorkOrderResponse CreatePersonnelVisitWorkOrder(CreatePersonnelVisitWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePersonnelVisitWorkOrder", CreatePersonnelVisitWorkOrderResponse.class);
    }

    /**
     *创建设备关电工单
     * @param req CreatePowerOffWorkOrderRequest
     * @return CreatePowerOffWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreatePowerOffWorkOrderResponse CreatePowerOffWorkOrder(CreatePowerOffWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePowerOffWorkOrder", CreatePowerOffWorkOrderResponse.class);
    }

    /**
     *创建设备开电工单
     * @param req CreatePowerOnWorkOrderRequest
     * @return CreatePowerOnWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreatePowerOnWorkOrderResponse CreatePowerOnWorkOrder(CreatePowerOnWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePowerOnWorkOrder", CreatePowerOnWorkOrderResponse.class);
    }

    /**
     *创建设备退出工单
     * @param req CreateQuitWorkOrderRequest
     * @return CreateQuitWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateQuitWorkOrderResponse CreateQuitWorkOrder(CreateQuitWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateQuitWorkOrder", CreateQuitWorkOrderResponse.class);
    }

    /**
     *创建设备下架工单
     * @param req CreateRackOffWorkOrderRequest
     * @return CreateRackOffWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateRackOffWorkOrderResponse CreateRackOffWorkOrder(CreateRackOffWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRackOffWorkOrder", CreateRackOffWorkOrderResponse.class);
    }

    /**
     *创建设备上架工单
     * @param req CreateRackOnWorkOrderRequest
     * @return CreateRackOnWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateRackOnWorkOrderResponse CreateRackOnWorkOrder(CreateRackOnWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRackOnWorkOrder", CreateRackOnWorkOrderResponse.class);
    }

    /**
     *创建设备收货工单
     * @param req CreateReceivingWorkOrderRequest
     * @return CreateReceivingWorkOrderResponse
     * @throws TencentCloudSDKException
     */
    public CreateReceivingWorkOrderResponse CreateReceivingWorkOrder(CreateReceivingWorkOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReceivingWorkOrder", CreateReceivingWorkOrderResponse.class);
    }

    /**
     *新增服务器设备型号
     * @param req CreateServerModelRequest
     * @return CreateServerModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerModelResponse CreateServerModel(CreateServerModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServerModel", CreateServerModelResponse.class);
    }

    /**
     *获取机房内可用的型号列表
     * @param req DescribeAvailableModelListRequest
     * @return DescribeAvailableModelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableModelListResponse DescribeAvailableModelList(DescribeAvailableModelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableModelList", DescribeAvailableModelListResponse.class);
    }

    /**
     *获取用户可操作的园区列表
     * @param req DescribeCampusListRequest
     * @return DescribeCampusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCampusListResponse DescribeCampusList(DescribeCampusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCampusList", DescribeCampusListResponse.class);
    }

    /**
     *查询通用服务工单详情
     * @param req DescribeCommonServiceWorkOrderDetailRequest
     * @return DescribeCommonServiceWorkOrderDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommonServiceWorkOrderDetailResponse DescribeCommonServiceWorkOrderDetail(DescribeCommonServiceWorkOrderDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCommonServiceWorkOrderDetail", DescribeCommonServiceWorkOrderDetailResponse.class);
    }

    /**
     *查询客户信息
     * @param req DescribeCustomerInfoRequest
     * @return DescribeCustomerInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerInfoResponse DescribeCustomerInfo(DescribeCustomerInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomerInfo", DescribeCustomerInfoResponse.class);
    }

    /**
     *获取设备列表
     * @param req DescribeDeviceListRequest
     * @return DescribeDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceListResponse DescribeDeviceList(DescribeDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceList", DescribeDeviceListResponse.class);
    }

    /**
     *用于查询设备类工单的工单详情，如：'receiving', 'rackOn', 'powerOn', 'powerOff', 'rackOff', 'quit'
     * @param req DescribeDeviceWorkOrderDetailRequest
     * @return DescribeDeviceWorkOrderDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceWorkOrderDetailResponse DescribeDeviceWorkOrderDetail(DescribeDeviceWorkOrderDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceWorkOrderDetail", DescribeDeviceWorkOrderDetailResponse.class);
    }

    /**
     *查询机房管理单元资产详情
     * @param req DescribeIdcUnitAssetDetailRequest
     * @return DescribeIdcUnitAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdcUnitAssetDetailResponse DescribeIdcUnitAssetDetail(DescribeIdcUnitAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdcUnitAssetDetail", DescribeIdcUnitAssetDetailResponse.class);
    }

    /**
     *查询机房管理单元详情
     * @param req DescribeIdcUnitDetailRequest
     * @return DescribeIdcUnitDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdcUnitDetailResponse DescribeIdcUnitDetail(DescribeIdcUnitDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdcUnitDetail", DescribeIdcUnitDetailResponse.class);
    }

    /**
     *获取机房和机房管理单元信息
     * @param req DescribeIdcsRequest
     * @return DescribeIdcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdcsResponse DescribeIdcs(DescribeIdcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdcs", DescribeIdcsResponse.class);
    }

    /**
     *查询设备型号详情
     * @param req DescribeModelRequest
     * @return DescribeModelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelResponse DescribeModel(DescribeModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModel", DescribeModelResponse.class);
    }

    /**
     *查询设备型号评估工单详情
     * @param req DescribeModelEvaluationWorkOrderDetailRequest
     * @return DescribeModelEvaluationWorkOrderDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelEvaluationWorkOrderDetailResponse DescribeModelEvaluationWorkOrderDetail(DescribeModelEvaluationWorkOrderDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelEvaluationWorkOrderDetail", DescribeModelEvaluationWorkOrderDetailResponse.class);
    }

    /**
     *获取型号的填写模板
     * @param req DescribeModelTemplateRequest
     * @return DescribeModelTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelTemplateResponse DescribeModelTemplate(DescribeModelTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelTemplate", DescribeModelTemplateResponse.class);
    }

    /**
     *获取用户的型号和对应的版本数量
     * @param req DescribeModelVersionListRequest
     * @return DescribeModelVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelVersionListResponse DescribeModelVersionList(DescribeModelVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelVersionList", DescribeModelVersionListResponse.class);
    }

    /**
     *查询人员到访工单详情
     * @param req DescribePersonnelVisitWorkOrderDetailRequest
     * @return DescribePersonnelVisitWorkOrderDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonnelVisitWorkOrderDetailResponse DescribePersonnelVisitWorkOrderDetail(DescribePersonnelVisitWorkOrderDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePersonnelVisitWorkOrderDetail", DescribePersonnelVisitWorkOrderDetailResponse.class);
    }

    /**
     *获取机架总数及各状态对应的数量汇总
     * @param req DescribePositionStatusSummaryRequest
     * @return DescribePositionStatusSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePositionStatusSummaryResponse DescribePositionStatusSummary(DescribePositionStatusSummaryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePositionStatusSummary", DescribePositionStatusSummaryResponse.class);
    }

    /**
     *获取机位列表
     * @param req DescribePositionsRequest
     * @return DescribePositionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePositionsResponse DescribePositions(DescribePositionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePositions", DescribePositionsResponse.class);
    }

    /**
     *获取机架列表
     * @param req DescribeRacksRequest
     * @return DescribeRacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRacksResponse DescribeRacks(DescribeRacksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRacks", DescribeRacksResponse.class);
    }

    /**
     *获取机房管理单元的机位分布
     * @param req DescribeRacksDistributionRequest
     * @return DescribeRacksDistributionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRacksDistributionResponse DescribeRacksDistribution(DescribeRacksDistributionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRacksDistribution", DescribeRacksDistributionResponse.class);
    }

    /**
     *查询资源汇总
     * @param req DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageResponse DescribeResourceUsage(DescribeResourceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceUsage", DescribeResourceUsageResponse.class);
    }

    /**
     *查询工单列表
     * @param req DescribeWorkOrderListRequest
     * @return DescribeWorkOrderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkOrderListResponse DescribeWorkOrderList(DescribeWorkOrderListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkOrderList", DescribeWorkOrderListResponse.class);
    }

    /**
     *工单统计数据查询
     * @param req DescribeWorkOrderStatisticsRequest
     * @return DescribeWorkOrderStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkOrderStatisticsResponse DescribeWorkOrderStatistics(DescribeWorkOrderStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkOrderStatistics", DescribeWorkOrderStatisticsResponse.class);
    }

    /**
     *获取用户可用的工单类型
     * @param req DescribeWorkOrderTypesRequest
     * @return DescribeWorkOrderTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkOrderTypesResponse DescribeWorkOrderTypes(DescribeWorkOrderTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkOrderTypes", DescribeWorkOrderTypesResponse.class);
    }

    /**
     *如果当前该工单类型是收藏状态，调用接口后变成未收藏状态，如果是未收藏状态，调用该接口变为收藏状态
     * @param req ModifyWorkOrderTypeCollectFlagRequest
     * @return ModifyWorkOrderTypeCollectFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkOrderTypeCollectFlagResponse ModifyWorkOrderTypeCollectFlag(ModifyWorkOrderTypeCollectFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkOrderTypeCollectFlag", ModifyWorkOrderTypeCollectFlagResponse.class);
    }

}
