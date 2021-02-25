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
        JsonResponseModel<CreateCameraAlertsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCameraAlertsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCameraAlerts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报当前场内所有相机的当前状态
     * @param req CreateCameraStateRequest
     * @return CreateCameraStateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCameraStateResponse CreateCameraState(CreateCameraStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCameraStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCameraStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCameraState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *场内抓拍上报接口
     * @param req CreateCaptureRequest
     * @return CreateCaptureResponse
     * @throws TencentCloudSDKException
     */
    public CreateCaptureResponse CreateCapture(CreateCaptureRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCaptureResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCaptureResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCapture");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集团广场的多经点位告警
     * @param req CreateMultiBizAlertRequest
     * @return CreateMultiBizAlertResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiBizAlertResponse CreateMultiBizAlert(CreateMultiBizAlertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultiBizAlertResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultiBizAlertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMultiBizAlert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报所有进程监控信息
     * @param req CreateProgramStateRequest
     * @return CreateProgramStateResponse
     * @throws TencentCloudSDKException
     */
    public CreateProgramStateResponse CreateProgramState(CreateProgramStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProgramStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProgramStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProgramState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报所有服务器硬件监控信息
     * @param req CreateServerStateRequest
     * @return CreateServerStateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerStateResponse CreateServerState(CreateServerStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServerStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServerStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServerState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集团广场的多经点位消警
     * @param req DeleteMultiBizAlertRequest
     * @return DeleteMultiBizAlertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMultiBizAlertResponse DeleteMultiBizAlert(DeleteMultiBizAlertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMultiBizAlertResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMultiBizAlertResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMultiBizAlert");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集团广场对应的任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集团广场对应的摄像头列表
     * @param req DescribeCamerasRequest
     * @return DescribeCamerasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCamerasResponse DescribeCameras(DescribeCamerasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCamerasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCamerasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCameras");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
        JsonResponseModel<DescribeConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *实时获取底图接口
     * @param req DescribeImageRequest
     * @return DescribeImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageResponse DescribeImage(DescribeImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取多经点位底图
     * @param req DescribeMultiBizBaseImageRequest
     * @return DescribeMultiBizBaseImageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMultiBizBaseImageResponse DescribeMultiBizBaseImage(DescribeMultiBizBaseImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMultiBizBaseImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMultiBizBaseImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMultiBizBaseImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集团广场对应的任务列表
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集团广场的点位列表
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集团广场的多经点位配置更新
     * @param req ModifyMultiBizConfigRequest
     * @return ModifyMultiBizConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMultiBizConfigResponse ModifyMultiBizConfig(ModifyMultiBizConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMultiBizConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMultiBizConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMultiBizConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报服务注册自身的服务地址作为回调地址, 用于信息回传。
     * @param req ReportServiceRegisterRequest
     * @return ReportServiceRegisterResponse
     * @throws TencentCloudSDKException
     */
    public ReportServiceRegisterResponse ReportServiceRegister(ReportServiceRegisterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReportServiceRegisterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReportServiceRegisterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReportServiceRegister");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以图搜图
     * @param req SearchImageRequest
     * @return SearchImageResponse
     * @throws TencentCloudSDKException
     */
    public SearchImageResponse SearchImage(SearchImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
