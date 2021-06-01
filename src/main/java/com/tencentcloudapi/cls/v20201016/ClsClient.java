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
package com.tencentcloudapi.cls.v20201016;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cls.v20201016.models.*;

public class ClsClient extends AbstractClient{
    private static String endpoint = "cls.tencentcloudapi.com";
    private static String service = "cls";
    private static String version = "2020-10-16";

    public ClsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClsClient(Credential credential, String region, ClientProfile profile) {
        super(ClsClient.endpoint, ClsClient.version, credential, region, profile);
    }

    /**
     *本接口用于创建告警策略。
     * @param req CreateAlarmRequest
     * @return CreateAlarmResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmResponse CreateAlarm(CreateAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用户创建告警通知模板。
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建日志导出
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建索引
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建机器组
     * @param req CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateMachineGroupResponse CreateMachineGroup(CreateMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建日志主题。
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除告警策略。
     * @param req DeleteAlarmRequest
     * @return DeleteAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmResponse DeleteAlarm(DeleteAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于删除告警通知模板
     * @param req DeleteAlarmNoticeRequest
     * @return DeleteAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticeResponse DeleteAlarmNotice(DeleteAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除日志导出
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteExportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于日志主题的索引配置
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除机器组
     * @param req DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupResponse DeleteMachineGroup(DeleteMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除日志主题。
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于获取告警通知模板列表
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmNoticesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarmNotices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取告警策略。
     * @param req DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsResponse DescribeAlarms(DescribeAlarmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAlarmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAlarms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取日志导出列表
     * @param req DescribeExportsRequest
     * @return DescribeExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportsResponse DescribeExports(DescribeExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取索引配置信息
     * @param req DescribeIndexRequest
     * @return DescribeIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexResponse DescribeIndex(DescribeIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于搜索日志上下文附近的内容
     * @param req DescribeLogContextRequest
     * @return DescribeLogContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogContextResponse DescribeLogContext(DescribeLogContextRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogContextResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogContextResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogContext");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取机器组信息列表
     * @param req DescribeMachineGroupsRequest
     * @return DescribeMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupsResponse DescribeMachineGroups(DescribeMachineGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取制定机器组下的机器状态
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取主题分区列表。
     * @param req DescribePartitionsRequest
     * @return DescribePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePartitionsResponse DescribePartitions(DescribePartitionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePartitionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePartitionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePartitions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口用于获取日志主题列表，支持分页
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取告警任务历史
     * @param req GetAlarmLogRequest
     * @return GetAlarmLogResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmLogResponse GetAlarmLog(GetAlarmLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAlarmLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAlarmLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAlarmLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于合并一个读写态的主题分区，合并时指定一个主题分区 ID，日志服务会自动合并范围右相邻的分区。
     * @param req MergePartitionRequest
     * @return MergePartitionResponse
     * @throws TencentCloudSDKException
     */
    public MergePartitionResponse MergePartition(MergePartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MergePartitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MergePartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MergePartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于修改告警策略。需要至少修改一项有效内容。
     * @param req ModifyAlarmRequest
     * @return ModifyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmResponse ModifyAlarm(ModifyAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarm");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于修改告警通知模板。
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmNoticeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmNotice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于修改索引配置

     * @param req ModifyIndexRequest
     * @return ModifyIndexResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIndexResponse ModifyIndex(ModifyIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIndexResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改机器组
     * @param req ModifyMachineGroupRequest
     * @return ModifyMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineGroupResponse ModifyMachineGroup(ModifyMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMachineGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMachineGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMachineGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于修改日志主题。
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTopic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于搜索日志
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于分裂主题分区
     * @param req SplitPartitionRequest
     * @return SplitPartitionResponse
     * @throws TencentCloudSDKException
     */
    public SplitPartitionResponse SplitPartition(SplitPartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SplitPartitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SplitPartitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SplitPartition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
