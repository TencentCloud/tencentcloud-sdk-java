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

}
