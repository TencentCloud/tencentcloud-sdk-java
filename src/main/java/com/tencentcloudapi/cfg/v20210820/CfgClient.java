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
package com.tencentcloudapi.cfg.v20210820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfg.v20210820.models.*;

public class CfgClient extends AbstractClient{
    private static String endpoint = "cfg.tencentcloudapi.com";
    private static String service = "cfg";
    private static String version = "2021-08-20";

    public CfgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfgClient(Credential credential, String region, ClientProfile profile) {
        super(CfgClient.endpoint, CfgClient.version, credential, region, profile);
    }

    /**
     *从经验库创建演练
     * @param req CreateTaskFromTemplateRequest
     * @return CreateTaskFromTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskFromTemplateResponse CreateTaskFromTemplate(CreateTaskFromTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskFromTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskFromTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTaskFromTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务
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
     *查询任务
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取演练过程中的所有日志
     * @param req DescribeTaskExecuteLogsRequest
     * @return DescribeTaskExecuteLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskExecuteLogsResponse DescribeTaskExecuteLogs(DescribeTaskExecuteLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskExecuteLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskExecuteLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskExecuteLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务列表
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询经验库
     * @param req DescribeTemplateRequest
     * @return DescribeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateResponse DescribeTemplate(DescribeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询经验库列表
     * @param req DescribeTemplateListRequest
     * @return DescribeTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateListResponse DescribeTemplateList(DescribeTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *执行任务
     * @param req ExecuteTaskRequest
     * @return ExecuteTaskResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskResponse ExecuteTask(ExecuteTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *触发混沌演练任务的动作，对于实例进行演练操作
     * @param req ExecuteTaskInstanceRequest
     * @return ExecuteTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskInstanceResponse ExecuteTaskInstance(ExecuteTaskInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteTaskInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteTaskInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExecuteTaskInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改任务运行状态
     * @param req ModifyTaskRunStatusRequest
     * @return ModifyTaskRunStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskRunStatusResponse ModifyTaskRunStatus(ModifyTaskRunStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskRunStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskRunStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskRunStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
