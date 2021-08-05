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
package com.tencentcloudapi.bm.v20180423;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bm.v20180423.models.*;

public class BmClient extends AbstractClient{
    private static String endpoint = "bm.tencentcloudapi.com";
    private static String service = "bm";
    private static String version = "2018-04-23";

    public BmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmClient(Credential credential, String region, ClientProfile profile) {
        super(BmClient.endpoint, BmClient.version, credential, region, profile);
    }

    /**
     *服务器绑定CAM角色，该角色授权访问黑石物理服务器服务，为黑石物理服务器提供了访问资源的权限，如请求服务器的临时证书
     * @param req AttachCamRoleRequest
     * @return AttachCamRoleResponse
     * @throws TencentCloudSDKException
     */
    public AttachCamRoleResponse AttachCamRole(AttachCamRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCamRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCamRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AttachCamRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为预授权规则绑定标签
     * @param req BindPsaTagRequest
     * @return BindPsaTagResponse
     * @throws TencentCloudSDKException
     */
    public BindPsaTagResponse BindPsaTag(BindPsaTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindPsaTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindPsaTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindPsaTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *购买黑石物理机
     * @param req BuyDevicesRequest
     * @return BuyDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BuyDevicesResponse BuyDevices(BuyDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BuyDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BuyDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BuyDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义镜像<br>
每个AppId在每个可用区最多保留20个自定义镜像
     * @param req CreateCustomImageRequest
     * @return CreateCustomImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomImageResponse CreateCustomImage(CreateCustomImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomImageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomImageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomImage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建预授权规则
     * @param req CreatePsaRegulationRequest
     * @return CreatePsaRegulationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePsaRegulationResponse CreatePsaRegulation(CreatePsaRegulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePsaRegulationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePsaRegulationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePsaRegulation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石竞价实例
     * @param req CreateSpotDeviceRequest
     * @return CreateSpotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSpotDeviceResponse CreateSpotDevice(CreateSpotDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSpotDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSpotDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSpotDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义脚本
     * @param req CreateUserCmdRequest
     * @return CreateUserCmdResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserCmdResponse CreateUserCmd(CreateUserCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserCmdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserCmdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserCmd");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义镜像<br>
正用于部署或重装中的镜像被删除后，镜像文件将保留一段时间，直到部署或重装结束
     * @param req DeleteCustomImagesRequest
     * @return DeleteCustomImagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomImagesResponse DeleteCustomImages(DeleteCustomImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除预授权规则
     * @param req DeletePsaRegulationRequest
     * @return DeletePsaRegulationResponse
     * @throws TencentCloudSDKException
     */
    public DeletePsaRegulationResponse DeletePsaRegulation(DeletePsaRegulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePsaRegulationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePsaRegulationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePsaRegulation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义脚本
     * @param req DeleteUserCmdsRequest
     * @return DeleteUserCmdsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserCmdsResponse DeleteUserCmds(DeleteUserCmdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserCmdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserCmdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserCmds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询自定义镜像制作进度
     * @param req DescribeCustomImageProcessRequest
     * @return DescribeCustomImageProcessResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomImageProcessResponse DescribeCustomImageProcess(DescribeCustomImageProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomImageProcessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomImageProcessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomImageProcess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看自定义镜像列表
     * @param req DescribeCustomImagesRequest
     * @return DescribeCustomImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomImagesResponse DescribeCustomImages(DescribeCustomImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备类型
     * @param req DescribeDeviceClassRequest
     * @return DescribeDeviceClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceClassResponse DescribeDeviceClass(DescribeDeviceClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceClassResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceClassResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceClass");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询机型支持的RAID方式， 并返回系统盘的分区和逻辑盘的列表
     * @param req DescribeDeviceClassPartitionRequest
     * @return DescribeDeviceClassPartitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceClassPartitionResponse DescribeDeviceClassPartition(DescribeDeviceClassPartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceClassPartitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceClassPartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceClassPartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备硬件配置信息，如 CPU 型号，内存大小，磁盘大小和数量
     * @param req DescribeDeviceHardwareInfoRequest
     * @return DescribeDeviceHardwareInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceHardwareInfoResponse DescribeDeviceHardwareInfo(DescribeDeviceHardwareInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceHardwareInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceHardwareInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceHardwareInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备库存
     * @param req DescribeDeviceInventoryRequest
     * @return DescribeDeviceInventoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceInventoryResponse DescribeDeviceInventory(DescribeDeviceInventoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceInventoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceInventoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceInventory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备操作日志， 如设备重启，重装，设置密码等操作
     * @param req DescribeDeviceOperationLogRequest
     * @return DescribeDeviceOperationLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceOperationLogResponse DescribeDeviceOperationLog(DescribeDeviceOperationLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceOperationLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceOperationLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceOperationLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取物理机的分区格式
     * @param req DescribeDevicePartitionRequest
     * @return DescribeDevicePartitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePartitionResponse DescribeDevicePartition(DescribeDevicePartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePartitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevicePartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务器所在的位置，如机架，上联交换机等信息
     * @param req DescribeDevicePositionRequest
     * @return DescribeDevicePositionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePositionResponse DescribeDevicePosition(DescribeDevicePositionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePositionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePositionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevicePosition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务器价格信息，支持设备的批量查找，支持标准机型和弹性机型的混合查找
     * @param req DescribeDevicePriceInfoRequest
     * @return DescribeDevicePriceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePriceInfoResponse DescribeDevicePriceInfo(DescribeDevicePriceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePriceInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePriceInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevicePriceInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询物理服务器，可以按照实例，业务IP等过滤
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询自定义机型部件信息，包括CpuId对应的型号，DiskTypeId对应的磁盘类型
     * @param req DescribeHardwareSpecificationRequest
     * @return DescribeHardwareSpecificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHardwareSpecificationResponse DescribeHardwareSpecification(DescribeHardwareSpecificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHardwareSpecificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHardwareSpecificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHardwareSpecification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询托管设备带外信息
     * @param req DescribeHostedDeviceOutBandInfoRequest
     * @return DescribeHostedDeviceOutBandInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostedDeviceOutBandInfoResponse DescribeHostedDeviceOutBandInfo(DescribeHostedDeviceOutBandInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostedDeviceOutBandInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostedDeviceOutBandInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostedDeviceOutBandInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取异步操作状态的完成状态
     * @param req DescribeOperationResultRequest
     * @return DescribeOperationResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOperationResultResponse DescribeOperationResult(DescribeOperationResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOperationResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOperationResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOperationResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定机型所支持的操作系统
     * @param req DescribeOsInfoRequest
     * @return DescribeOsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOsInfoResponse DescribeOsInfo(DescribeOsInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOsInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOsInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOsInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取预授权规则列表
     * @param req DescribePsaRegulationsRequest
     * @return DescribePsaRegulationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePsaRegulationsResponse DescribePsaRegulations(DescribePsaRegulationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePsaRegulationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePsaRegulationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePsaRegulations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询地域以及可用区
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *维修任务配置获取
     * @param req DescribeRepairTaskConstantRequest
     * @return DescribeRepairTaskConstantResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepairTaskConstantResponse DescribeRepairTaskConstant(DescribeRepairTaskConstantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepairTaskConstantResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepairTaskConstantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRepairTaskConstant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户维修任务列表及详细信息<br>
<br>
TaskStatus（任务状态ID）与状态中文名的对应关系如下：<br>
1：未授权<br>
2：处理中<br>
3：待确认<br>
4：未授权-暂不处理<br>
5：已恢复<br>
6：待确认-未恢复<br>
     * @param req DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInfoResponse DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取维修任务操作日志
     * @param req DescribeTaskOperationLogRequest
     * @return DescribeTaskOperationLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskOperationLogResponse DescribeTaskOperationLog(DescribeTaskOperationLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskOperationLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskOperationLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskOperationLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义脚本任务详细信息
     * @param req DescribeUserCmdTaskInfoRequest
     * @return DescribeUserCmdTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCmdTaskInfoResponse DescribeUserCmdTaskInfo(DescribeUserCmdTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCmdTaskInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCmdTaskInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserCmdTaskInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义脚本任务列表
     * @param req DescribeUserCmdTasksRequest
     * @return DescribeUserCmdTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCmdTasksResponse DescribeUserCmdTasks(DescribeUserCmdTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCmdTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCmdTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserCmdTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义脚本信息列表
     * @param req DescribeUserCmdsRequest
     * @return DescribeUserCmdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCmdsResponse DescribeUserCmds(DescribeUserCmdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCmdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCmdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserCmds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *服务器绑定CAM角色
     * @param req DetachCamRoleRequest
     * @return DetachCamRoleResponse
     * @throws TencentCloudSDKException
     */
    public DetachCamRoleResponse DetachCamRole(DetachCamRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCamRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCamRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetachCamRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改自定义镜像名或描述
     * @param req ModifyCustomImageAttributeRequest
     * @return ModifyCustomImageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomImageAttributeResponse ModifyCustomImageAttribute(ModifyCustomImageAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomImageAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomImageAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomImageAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改服务器名称
     * @param req ModifyDeviceAliasesRequest
     * @return ModifyDeviceAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceAliasesResponse ModifyDeviceAliases(ModifyDeviceAliasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceAliasesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceAliasesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDeviceAliases");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改物理机服务器自动续费标志
     * @param req ModifyDeviceAutoRenewFlagRequest
     * @return ModifyDeviceAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceAutoRenewFlagResponse ModifyDeviceAutoRenewFlag(ModifyDeviceAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceAutoRenewFlagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceAutoRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDeviceAutoRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改物理机内网IP（不重装系统）
     * @param req ModifyLanIpRequest
     * @return ModifyLanIpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLanIpResponse ModifyLanIp(ModifyLanIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLanIpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLanIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLanIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将设备的预付费模式修改为后付费计费模式，支持批量转换。（前提是客户要加入黑石物理机后付费计费的白名单，申请黑石物理机后付费可以联系腾讯云客服）
     * @param req ModifyPayModePre2PostRequest
     * @return ModifyPayModePre2PostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPayModePre2PostResponse ModifyPayModePre2Post(ModifyPayModePre2PostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPayModePre2PostResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPayModePre2PostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPayModePre2Post");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *允许修改规则信息及关联故障类型
     * @param req ModifyPsaRegulationRequest
     * @return ModifyPsaRegulationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPsaRegulationResponse ModifyPsaRegulation(ModifyPsaRegulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPsaRegulationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPsaRegulationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPsaRegulation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改自定义脚本
     * @param req ModifyUserCmdRequest
     * @return ModifyUserCmdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserCmdResponse ModifyUserCmd(ModifyUserCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserCmdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserCmdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserCmd");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁黑石物理机实例：可以销毁物理机列表中的竞价实例，或回收站列表中所有计费模式的实例
     * @param req OfflineDevicesRequest
     * @return OfflineDevicesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineDevicesResponse OfflineDevices(OfflineDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "OfflineDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启机器
     * @param req RebootDevicesRequest
     * @return RebootDevicesResponse
     * @throws TencentCloudSDKException
     */
    public RebootDevicesResponse RebootDevices(RebootDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RebootDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RebootDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复回收站中的物理机（仅限后付费的物理机）
     * @param req RecoverDevicesRequest
     * @return RecoverDevicesResponse
     * @throws TencentCloudSDKException
     */
    public RecoverDevicesResponse RecoverDevices(RecoverDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecoverDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RecoverDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RecoverDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重装操作系统
     * @param req ReloadDeviceOsRequest
     * @return ReloadDeviceOsResponse
     * @throws TencentCloudSDKException
     */
    public ReloadDeviceOsResponse ReloadDeviceOs(ReloadDeviceOsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReloadDeviceOsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReloadDeviceOsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReloadDeviceOs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于操作维修任务<br>
入参TaskId为维修任务ID<br>
入参Operate表示对维修任务的操作，支持如下取值：<br>
AuthorizeRepair（授权维修）<br>
Ignore（暂不提醒）<br>
ConfirmRecovered（维修完成后，确认故障恢复）<br>
ConfirmUnRecovered（维修完成后，确认故障未恢复，该操作已不推荐用）<br>
NeedRepairAgain（维修完成后，故障未恢复，需要重新维修，推荐用此操作打回）<br>
入参OperateRemark仅在Operate为NeedRepairAgain时有效，表示打回重修原因，建议给出打回的具体原因。<br>
<br>
操作约束（当前任务状态(TaskStatus)->对应可执行的操作）：<br>
未授权(1)->授权维修；暂不处理<br>
暂不处理(4)->授权维修<br>
待确认(3)->确认故障恢复；确认故障未恢复；需要重新维修<br>
未恢复(6)->确认故障恢复<br>
<br>
对于Ping不可达故障的任务，还允许：<br>
未授权->确认故障恢复<br>
暂不处理->确认故障恢复<br>
<br>
处理中与已恢复状态的任务不允许进行操作。<br>
<br>
详细信息请访问：https://cloud.tencent.com/document/product/386/18190
     * @param req RepairTaskControlRequest
     * @return RepairTaskControlResponse
     * @throws TencentCloudSDKException
     */
    public RepairTaskControlResponse RepairTaskControl(RepairTaskControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RepairTaskControlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RepairTaskControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RepairTaskControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置服务器密码
     * @param req ResetDevicePasswordRequest
     * @return ResetDevicePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDevicePasswordResponse ResetDevicePassword(ResetDevicePasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetDevicePasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetDevicePasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetDevicePassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *退回物理机至回收站，支持批量退还不同计费模式的物理机（包括预付费、后付费、预付费转后付费）
     * @param req ReturnDevicesRequest
     * @return ReturnDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ReturnDevicesResponse ReturnDevices(ReturnDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReturnDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReturnDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReturnDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行自定义脚本
     * @param req RunUserCmdRequest
     * @return RunUserCmdResponse
     * @throws TencentCloudSDKException
     */
    public RunUserCmdResponse RunUserCmd(RunUserCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunUserCmdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RunUserCmdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunUserCmd");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置带外VPN认证用户密码
     * @param req SetOutBandVpnAuthPasswordRequest
     * @return SetOutBandVpnAuthPasswordResponse
     * @throws TencentCloudSDKException
     */
    public SetOutBandVpnAuthPasswordResponse SetOutBandVpnAuthPassword(SetOutBandVpnAuthPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOutBandVpnAuthPasswordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetOutBandVpnAuthPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetOutBandVpnAuthPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭服务器
     * @param req ShutdownDevicesRequest
     * @return ShutdownDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ShutdownDevicesResponse ShutdownDevices(ShutdownDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ShutdownDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ShutdownDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ShutdownDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启服务器
     * @param req StartDevicesRequest
     * @return StartDevicesResponse
     * @throws TencentCloudSDKException
     */
    public StartDevicesResponse StartDevices(StartDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除标签与预授权规则的绑定
     * @param req UnbindPsaTagRequest
     * @return UnbindPsaTagResponse
     * @throws TencentCloudSDKException
     */
    public UnbindPsaTagResponse UnbindPsaTag(UnbindPsaTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindPsaTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindPsaTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindPsaTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
