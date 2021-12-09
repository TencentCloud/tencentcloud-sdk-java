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
package com.tencentcloudapi.tat.v20201028;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tat.v20201028.models.*;

public class TatClient extends AbstractClient{
    private static String endpoint = "tat.tencentcloudapi.com";
    private static String service = "tat";
    private static String version = "2020-10-28";

    public TatClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TatClient(Credential credential, String region, ClientProfile profile) {
        super(TatClient.endpoint, TatClient.version, credential, region, profile);
    }

    /**
     *取消一台或多台CVM实例执行的命令

* 如果命令还未下发到agent，任务状态处于处于PENDING、DELIVERING、DELIVER_DELAYED，取消后任务状态是CANCELLED
* 如果命令已下发到agent，任务状态处于RUNNING， 取消后任务状态是TERMINATED
     * @param req CancelInvocationRequest
     * @return CancelInvocationResponse
     * @throws TencentCloudSDKException
     */
    public CancelInvocationResponse CancelInvocation(CancelInvocationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelInvocationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelInvocationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelInvocation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于创建命令。
     * @param req CreateCommandRequest
     * @return CreateCommandResponse
     * @throws TencentCloudSDKException
     */
    public CreateCommandResponse CreateCommand(CreateCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于创建执行器。
     * @param req CreateInvokerRequest
     * @return CreateInvokerResponse
     * @throws TencentCloudSDKException
     */
    public CreateInvokerResponse CreateInvoker(CreateInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInvokerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于删除命令。
如果命令与执行器关联，则无法被删除。
     * @param req DeleteCommandRequest
     * @return DeleteCommandResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCommandResponse DeleteCommand(DeleteCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于删除执行器。
     * @param req DeleteInvokerRequest
     * @return DeleteInvokerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInvokerResponse DeleteInvoker(DeleteInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInvokerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询自动化助手客户端的状态。
     * @param req DescribeAutomationAgentStatusRequest
     * @return DescribeAutomationAgentStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutomationAgentStatusResponse DescribeAutomationAgentStatus(DescribeAutomationAgentStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutomationAgentStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutomationAgentStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutomationAgentStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询命令详情。
     * @param req DescribeCommandsRequest
     * @return DescribeCommandsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCommandsResponse DescribeCommands(DescribeCommandsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCommandsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCommandsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCommands");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询执行任务详情。
     * @param req DescribeInvocationTasksRequest
     * @return DescribeInvocationTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationTasksResponse DescribeInvocationTasks(DescribeInvocationTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询执行活动详情。
     * @param req DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationsResponse DescribeInvocations(DescribeInvocationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询执行器的执行记录。
     * @param req DescribeInvokerRecordsRequest
     * @return DescribeInvokerRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvokerRecordsResponse DescribeInvokerRecords(DescribeInvokerRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvokerRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvokerRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvokerRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询执行器信息。
     * @param req DescribeInvokersRequest
     * @return DescribeInvokersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvokersResponse DescribeInvokers(DescribeInvokersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvokersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvokersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvokers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于查询 TAT 产品后台地域列表。
RegionState 为 AVAILABLE，代表该地域的 TAT 后台服务已经可用；未返回，代表该地域的 TAT 后台服务尚不可用。
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
     *此接口用于停止执行器。
     * @param req DisableInvokerRequest
     * @return DisableInvokerResponse
     * @throws TencentCloudSDKException
     */
    public DisableInvokerResponse DisableInvoker(DisableInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableInvokerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于启用执行器。
     * @param req EnableInvokerRequest
     * @return EnableInvokerResponse
     * @throws TencentCloudSDKException
     */
    public EnableInvokerResponse EnableInvoker(EnableInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableInvokerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在指定的实例上触发命令，调用成功返回执行活动ID（inv-xxxxxxxx），每个执行活动内部有一个或多个执行任务（invt-xxxxxxxx），每个执行任务代表命令在一台 CVM 或一台 Lighthouse 上的执行记录。

* 如果指定实例未安装 agent，或 agent 不在线，返回失败
* 如果命令类型与 agent 运行环境不符，返回失败
* 指定的实例需要处于 VPC 网络
* 指定的实例需要处于 RUNNING 状态
* 不可同时指定 CVM 和 Lighthouse
     * @param req InvokeCommandRequest
     * @return InvokeCommandResponse
     * @throws TencentCloudSDKException
     */
    public InvokeCommandResponse InvokeCommand(InvokeCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InvokeCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于修改命令。
     * @param req ModifyCommandRequest
     * @return ModifyCommandResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCommandResponse ModifyCommand(ModifyCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于修改执行器。
     * @param req ModifyInvokerRequest
     * @return ModifyInvokerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInvokerResponse ModifyInvoker(ModifyInvokerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInvokerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInvokerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInvoker");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于预览自定义参数替换后的命令内容。不会触发真实执行。
     * @param req PreviewReplacedCommandContentRequest
     * @return PreviewReplacedCommandContentResponse
     * @throws TencentCloudSDKException
     */
    public PreviewReplacedCommandContentResponse PreviewReplacedCommandContent(PreviewReplacedCommandContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PreviewReplacedCommandContentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PreviewReplacedCommandContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PreviewReplacedCommandContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *执行命令，调用成功返回执行活动ID（inv-xxxxxxxx），每个执行活动内部有一个或多个执行任务（invt-xxxxxxxx），每个执行任务代表命令在一台 CVM 或一台 Lighthouse 上的执行记录。

* 如果指定实例未安装 agent，或 agent 不在线，返回失败
* 如果命令类型与 agent 运行环境不符，返回失败
* 指定的实例需要处于 VPC 网络
* 指定的实例需要处于 `RUNNING` 状态
* 不可同时指定 CVM 和 Lighthouse
     * @param req RunCommandRequest
     * @return RunCommandResponse
     * @throws TencentCloudSDKException
     */
    public RunCommandResponse RunCommand(RunCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RunCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
