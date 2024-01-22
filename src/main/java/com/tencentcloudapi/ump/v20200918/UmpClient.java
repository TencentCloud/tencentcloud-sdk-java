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
package com.tencentcloudapi.ump.v20200918;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ump.v20200918.models.*;

public class UmpClient extends AbstractClient{
    private static String endpoint = "ump.tencentcloudapi.com";
    private static String service = "ump";
    private static String version = "2020-09-18";
    
    public UmpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public UmpClient(Credential credential, String region, ClientProfile profile) {
        super(UmpClient.endpoint, UmpClient.version, credential, region, profile);
    }

    /**
     *上报相机移动、遮挡等告警信息


     * @param req CreateCameraAlertsRequest
     * @return CreateCameraAlertsResponse
     * @throws TencentCloudSDKException
     */
    public CreateCameraAlertsResponse CreateCameraAlerts(CreateCameraAlertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCameraAlerts", CreateCameraAlertsResponse.class);
    }

    /**
     *上报当前场内所有相机的当前状态
     * @param req CreateCameraStateRequest
     * @return CreateCameraStateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCameraStateResponse CreateCameraState(CreateCameraStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCameraState", CreateCameraStateResponse.class);
    }

    /**
     *优mall产品下线

场内抓拍上报接口
     * @param req CreateCaptureRequest
     * @return CreateCaptureResponse
     * @throws TencentCloudSDKException
     */
    public CreateCaptureResponse CreateCapture(CreateCaptureRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCapture", CreateCaptureResponse.class);
    }

    /**
     *集团广场的多经点位告警
     * @param req CreateMultiBizAlertRequest
     * @return CreateMultiBizAlertResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiBizAlertResponse CreateMultiBizAlert(CreateMultiBizAlertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMultiBizAlert", CreateMultiBizAlertResponse.class);
    }

    /**
     *上报所有进程监控信息
     * @param req CreateProgramStateRequest
     * @return CreateProgramStateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProgramStateResponse CreateProgramState(CreateProgramStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProgramState", CreateProgramStateResponse.class);
    }

    /**
     *上报所有服务器硬件监控信息
     * @param req CreateServerStateRequest
     * @return CreateServerStateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerStateResponse CreateServerState(CreateServerStateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateServerState", CreateServerStateResponse.class);
    }

    /**
     *集团广场的多经点位消警
     * @param req DeleteMultiBizAlertRequest
     * @return DeleteMultiBizAlertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMultiBizAlertResponse DeleteMultiBizAlert(DeleteMultiBizAlertRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMultiBizAlert", DeleteMultiBizAlertResponse.class);
    }

    /**
     *删除集团广场对应的任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *获取集团广场对应的摄像头列表
     * @param req DescribeCamerasRequest
     * @return DescribeCamerasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCamerasResponse DescribeCameras(DescribeCamerasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCameras", DescribeCamerasResponse.class);
    }

    /**
     *获取摄像头配置信息
mac不为空返回指定相机配置
mac为空返回对应GroupCode和MallId全量配置
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfig", DescribeConfigResponse.class);
    }

    /**
     *实时获取底图接口
     * @param req DescribeImageRequest
     * @return DescribeImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageResponse DescribeImage(DescribeImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImage", DescribeImageResponse.class);
    }

    /**
     *获取多经点位底图
     * @param req DescribeMultiBizBaseImageRequest
     * @return DescribeMultiBizBaseImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiBizBaseImageResponse DescribeMultiBizBaseImage(DescribeMultiBizBaseImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMultiBizBaseImage", DescribeMultiBizBaseImageResponse.class);
    }

    /**
     *查询集团广场对应的任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTasks", DescribeTasksResponse.class);
    }

    /**
     *获取集团广场的点位列表
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZones", DescribeZonesResponse.class);
    }

    /**
     *集团广场的多经点位配置更新
     * @param req ModifyMultiBizConfigRequest
     * @return ModifyMultiBizConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMultiBizConfigResponse ModifyMultiBizConfig(ModifyMultiBizConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMultiBizConfig", ModifyMultiBizConfigResponse.class);
    }

    /**
     *上报服务注册自身的服务地址作为回调地址, 用于信息回传。
     * @param req ReportServiceRegisterRequest
     * @return ReportServiceRegisterResponse
     * @throws TencentCloudSDKException
     */
    public ReportServiceRegisterResponse ReportServiceRegister(ReportServiceRegisterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportServiceRegister", ReportServiceRegisterResponse.class);
    }

    /**
     *以图搜图
     * @param req SearchImageRequest
     * @return SearchImageResponse
     * @throws TencentCloudSDKException
     */
    public SearchImageResponse SearchImage(SearchImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchImage", SearchImageResponse.class);
    }

}
