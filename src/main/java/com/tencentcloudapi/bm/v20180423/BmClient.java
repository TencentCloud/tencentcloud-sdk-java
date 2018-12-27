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
    private static String version = "2018-04-23";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public BmClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public BmClient(Credential credential, String region, ClientProfile profile) {
        super(BmClient.endpoint, BmClient.version, credential, region, profile);
    }

    /**
     *为预授权规则绑定标签
     * @param req BindPsaTagRequest
     * @return BindPsaTagResponse
     * @throws TencentCloudSDKException
     */
    public BindPsaTagResponse  BindPsaTag(BindPsaTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindPsaTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BindPsaTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BindPsaTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建预授权规则
     * @param req CreatePsaRegulationRequest
     * @return CreatePsaRegulationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePsaRegulationResponse  CreatePsaRegulation(CreatePsaRegulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePsaRegulationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePsaRegulationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePsaRegulation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建黑石竞价实例
     * @param req CreateSpotDeviceRequest
     * @return CreateSpotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateSpotDeviceResponse  CreateSpotDevice(CreateSpotDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSpotDeviceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSpotDeviceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSpotDevice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义脚本
     * @param req CreateUserCmdRequest
     * @return CreateUserCmdResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserCmdResponse  CreateUserCmd(CreateUserCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserCmdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserCmdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUserCmd"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除预授权规则
     * @param req DeletePsaRegulationRequest
     * @return DeletePsaRegulationResponse
     * @throws TencentCloudSDKException
     */
    public DeletePsaRegulationResponse  DeletePsaRegulation(DeletePsaRegulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePsaRegulationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePsaRegulationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePsaRegulation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义脚本
     * @param req DeleteUserCmdsRequest
     * @return DeleteUserCmdsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserCmdsResponse  DeleteUserCmds(DeleteUserCmdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserCmdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserCmdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteUserCmds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取获取设备类型
     * @param req DescribeDeviceClassRequest
     * @return DescribeDeviceClassResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceClassResponse  DescribeDeviceClass(DescribeDeviceClassRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceClassResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceClassResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceClass"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备库存
     * @param req DescribeDeviceInventoryRequest
     * @return DescribeDeviceInventoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceInventoryResponse  DescribeDeviceInventory(DescribeDeviceInventoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceInventoryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceInventoryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceInventory"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备操作日志， 如设备重启，重装，设置密码等操作
     * @param req DescribeDeviceOperationLogRequest
     * @return DescribeDeviceOperationLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceOperationLogResponse  DescribeDeviceOperationLog(DescribeDeviceOperationLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceOperationLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceOperationLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDeviceOperationLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务器所在的位置，如机架，上联交换机等信息
     * @param req DescribeDevicePositionRequest
     * @return DescribeDevicePositionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePositionResponse  DescribeDevicePosition(DescribeDevicePositionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePositionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePositionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevicePosition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务器价格信息，支持设备的批量查找，支持标准机型和弹性机型的混合查找
     * @param req DescribeDevicePriceInfoRequest
     * @return DescribeDevicePriceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePriceInfoResponse  DescribeDevicePriceInfo(DescribeDevicePriceInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePriceInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePriceInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevicePriceInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询物理服务器，可以按照实例，业务IP等过滤
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse  DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定机型所支持的操作系统
     * @param req DescribeOsInfoRequest
     * @return DescribeOsInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOsInfoResponse  DescribeOsInfo(DescribeOsInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOsInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOsInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeOsInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取预授权规则列表
     * @param req DescribePsaRegulationsRequest
     * @return DescribePsaRegulationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePsaRegulationsResponse  DescribePsaRegulations(DescribePsaRegulationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePsaRegulationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePsaRegulationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePsaRegulations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *维修任务配置获取
     * @param req DescribeRepairTaskConstantRequest
     * @return DescribeRepairTaskConstantResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepairTaskConstantResponse  DescribeRepairTaskConstant(DescribeRepairTaskConstantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRepairTaskConstantResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRepairTaskConstantResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRepairTaskConstant"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
    public DescribeTaskInfoResponse  DescribeTaskInfo(DescribeTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取维修任务操作日志
     * @param req DescribeTaskOperationLogRequest
     * @return DescribeTaskOperationLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskOperationLogResponse  DescribeTaskOperationLog(DescribeTaskOperationLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskOperationLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskOperationLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskOperationLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义脚本任务详细信息
     * @param req DescribeUserCmdTaskInfoRequest
     * @return DescribeUserCmdTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCmdTaskInfoResponse  DescribeUserCmdTaskInfo(DescribeUserCmdTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCmdTaskInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCmdTaskInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserCmdTaskInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义脚本任务列表
     * @param req DescribeUserCmdTasksRequest
     * @return DescribeUserCmdTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCmdTasksResponse  DescribeUserCmdTasks(DescribeUserCmdTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCmdTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCmdTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserCmdTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取自定义脚本信息列表
     * @param req DescribeUserCmdsRequest
     * @return DescribeUserCmdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCmdsResponse  DescribeUserCmds(DescribeUserCmdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCmdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCmdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUserCmds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改服务器名称
     * @param req ModifyDeviceAliasesRequest
     * @return ModifyDeviceAliasesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceAliasesResponse  ModifyDeviceAliases(ModifyDeviceAliasesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceAliasesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceAliasesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDeviceAliases"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改物理机服务器自动续费标志
     * @param req ModifyDeviceAutoRenewFlagRequest
     * @return ModifyDeviceAutoRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceAutoRenewFlagResponse  ModifyDeviceAutoRenewFlag(ModifyDeviceAutoRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceAutoRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceAutoRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDeviceAutoRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将设备的预付费模式修改为后付费计费模式，支持批量转换。（前提是客户要加入黑石物理机后付费计费的白名单，申请黑石物理机后付费可以联系腾讯云客服）
     * @param req ModifyPayModePre2PostRequest
     * @return ModifyPayModePre2PostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPayModePre2PostResponse  ModifyPayModePre2Post(ModifyPayModePre2PostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPayModePre2PostResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPayModePre2PostResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPayModePre2Post"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *允许修改规则信息及关联故障类型
     * @param req ModifyPsaRegulationRequest
     * @return ModifyPsaRegulationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPsaRegulationResponse  ModifyPsaRegulation(ModifyPsaRegulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPsaRegulationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPsaRegulationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPsaRegulation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改自定义脚本
     * @param req ModifyUserCmdRequest
     * @return ModifyUserCmdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserCmdResponse  ModifyUserCmd(ModifyUserCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserCmdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserCmdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyUserCmd"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于销毁可退还的服务器
     * @param req OfflineDevicesRequest
     * @return OfflineDevicesResponse
     * @throws TencentCloudSDKException
     */
    public OfflineDevicesResponse  OfflineDevices(OfflineDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OfflineDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启机器
     * @param req RebootDevicesRequest
     * @return RebootDevicesResponse
     * @throws TencentCloudSDKException
     */
    public RebootDevicesResponse  RebootDevices(RebootDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RebootDevicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RebootDevicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RebootDevices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
ConfirmUnRecovered（维修完成后，确认故障未恢复）<br>
<br>
操作约束（当前任务状态(TaskStatus)->对应可执行的操作）：<br>
未授权(1)->授权维修；暂不处理<br>
暂不处理(4)->授权维修<br>
待确认(3)->确认故障恢复；确认故障未恢复<br>
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
    public RepairTaskControlResponse  RepairTaskControl(RepairTaskControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RepairTaskControlResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RepairTaskControlResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RepairTaskControl"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置服务器密码
     * @param req ResetDevicePasswordRequest
     * @return ResetDevicePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDevicePasswordResponse  ResetDevicePassword(ResetDevicePasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetDevicePasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetDevicePasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetDevicePassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行自定义脚本
     * @param req RunUserCmdRequest
     * @return RunUserCmdResponse
     * @throws TencentCloudSDKException
     */
    public RunUserCmdResponse  RunUserCmd(RunUserCmdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunUserCmdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RunUserCmdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RunUserCmd"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置带外VPN认证用户密码
     * @param req SetOutBandVpnAuthPasswordRequest
     * @return SetOutBandVpnAuthPasswordResponse
     * @throws TencentCloudSDKException
     */
    public SetOutBandVpnAuthPasswordResponse  SetOutBandVpnAuthPassword(SetOutBandVpnAuthPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetOutBandVpnAuthPasswordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetOutBandVpnAuthPasswordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetOutBandVpnAuthPassword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除标签与预授权规则的绑定
     * @param req UnbindPsaTagRequest
     * @return UnbindPsaTagResponse
     * @throws TencentCloudSDKException
     */
    public UnbindPsaTagResponse  UnbindPsaTag(UnbindPsaTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindPsaTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindPsaTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnbindPsaTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
