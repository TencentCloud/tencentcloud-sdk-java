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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTaskFromTemplate", CreateTaskFromTemplateResponse.class);
    }

    /**
     *删除任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *查询任务
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *获取演练过程中的所有日志
     * @param req DescribeTaskExecuteLogsRequest
     * @return DescribeTaskExecuteLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskExecuteLogsResponse DescribeTaskExecuteLogs(DescribeTaskExecuteLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskExecuteLogs", DescribeTaskExecuteLogsResponse.class);
    }

    /**
     *查询任务列表
     * @param req DescribeTaskListRequest
     * @return DescribeTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskListResponse DescribeTaskList(DescribeTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskList", DescribeTaskListResponse.class);
    }

    /**
     *查询经验库
     * @param req DescribeTemplateRequest
     * @return DescribeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateResponse DescribeTemplate(DescribeTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplate", DescribeTemplateResponse.class);
    }

    /**
     *查询经验库列表
     * @param req DescribeTemplateListRequest
     * @return DescribeTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplateListResponse DescribeTemplateList(DescribeTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplateList", DescribeTemplateListResponse.class);
    }

    /**
     *执行任务
     * @param req ExecuteTaskRequest
     * @return ExecuteTaskResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskResponse ExecuteTask(ExecuteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteTask", ExecuteTaskResponse.class);
    }

    /**
     *触发混沌演练任务的动作，对于实例进行演练操作
     * @param req ExecuteTaskInstanceRequest
     * @return ExecuteTaskInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteTaskInstanceResponse ExecuteTaskInstance(ExecuteTaskInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExecuteTaskInstance", ExecuteTaskInstanceResponse.class);
    }

    /**
     *修改任务运行状态
     * @param req ModifyTaskRunStatusRequest
     * @return ModifyTaskRunStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskRunStatusResponse ModifyTaskRunStatus(ModifyTaskRunStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTaskRunStatus", ModifyTaskRunStatusResponse.class);
    }

}
