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
package com.tencentcloudapi.trro.v20220325;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trro.v20220325.models.*;

public class TrroClient extends AbstractClient{
    private static String endpoint = "trro.tencentcloudapi.com";
    private static String service = "trro";
    private static String version = "2022-03-25";

    public TrroClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrroClient(Credential credential, String region, ClientProfile profile) {
        super(TrroClient.endpoint, TrroClient.version, credential, region, profile);
    }

    /**
     *用于批量删除设备
     * @param req BatchDeleteDevicesRequest
     * @return BatchDeleteDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteDevicesResponse BatchDeleteDevices(BatchDeleteDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于批量删除修改权限配置
     * @param req BatchDeletePolicyRequest
     * @return BatchDeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeletePolicyResponse BatchDeletePolicy(BatchDeletePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeletePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeletePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeletePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建设备
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取指定设备信息
     * @param req DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceInfoResponse DescribeDeviceInfo(DescribeDeviceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取设备信息列表
     * @param req DescribeDeviceListRequest
     * @return DescribeDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceListResponse DescribeDeviceList(DescribeDeviceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备会话数据详单
     * @param req DescribeDeviceSessionDetailsRequest
     * @return DescribeDeviceSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceSessionDetailsResponse DescribeDeviceSessionDetails(DescribeDeviceSessionDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceSessionDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceSessionDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceSessionDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备会话列表
     * @param req DescribeDeviceSessionListRequest
     * @return DescribeDeviceSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceSessionListResponse DescribeDeviceSessionList(DescribeDeviceSessionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceSessionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceSessionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceSessionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看权限配置
     * @param req DescribePolicyRequest
     * @return DescribePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyResponse DescribePolicy(DescribePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取项目信息
     * @param req DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectInfoResponse DescribeProjectInfo(DescribeProjectInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取项目列表
     * @param req DescribeProjectListRequest
     * @return DescribeProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectListResponse DescribeProjectList(DescribeProjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProjectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取会话统计值
     * @param req DescribeSessionStatisticsRequest
     * @return DescribeSessionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionStatisticsResponse DescribeSessionStatistics(DescribeSessionStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSessionStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSessionStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSessionStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取各时间段的会话统计值
     * @param req DescribeSessionStatisticsByIntervalRequest
     * @return DescribeSessionStatisticsByIntervalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionStatisticsByIntervalResponse DescribeSessionStatisticsByInterval(DescribeSessionStatisticsByIntervalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSessionStatisticsByIntervalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSessionStatisticsByIntervalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSessionStatisticsByInterval");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改设备信息
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改权限配置
     * @param req ModifyPolicyRequest
     * @return ModifyPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyResponse ModifyPolicy(ModifyPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改项目信息
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
