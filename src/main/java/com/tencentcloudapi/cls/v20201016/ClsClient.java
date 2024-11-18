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
     *用于添加机器组信息
     * @param req AddMachineGroupInfoRequest
     * @return AddMachineGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddMachineGroupInfoResponse AddMachineGroupInfo(AddMachineGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddMachineGroupInfo", AddMachineGroupInfoResponse.class);
    }

    /**
     *应用采集配置到指定机器组
     * @param req ApplyConfigToMachineGroupRequest
     * @return ApplyConfigToMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConfigToMachineGroupResponse ApplyConfigToMachineGroup(ApplyConfigToMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyConfigToMachineGroup", ApplyConfigToMachineGroupResponse.class);
    }

    /**
     *本接口用于数据加工DSL函数的语法校验。
     * @param req CheckFunctionRequest
     * @return CheckFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CheckFunctionResponse CheckFunction(CheckFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFunction", CheckFunctionResponse.class);
    }

    /**
     *本接口用于校验Kafka服务集群是否可以正常访问
     * @param req CheckRechargeKafkaServerRequest
     * @return CheckRechargeKafkaServerResponse
     * @throws TencentCloudSDKException
     */
    public CheckRechargeKafkaServerResponse CheckRechargeKafkaServer(CheckRechargeKafkaServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckRechargeKafkaServer", CheckRechargeKafkaServerResponse.class);
    }

    /**
     *关闭Kafka协议消费
     * @param req CloseKafkaConsumerRequest
     * @return CloseKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CloseKafkaConsumerResponse CloseKafkaConsumer(CloseKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CloseKafkaConsumer", CloseKafkaConsumerResponse.class);
    }

    /**
     *本接口用于创建告警策略。
     * @param req CreateAlarmRequest
     * @return CreateAlarmResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmResponse CreateAlarm(CreateAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarm", CreateAlarmResponse.class);
    }

    /**
     *该接口用于创建通知渠道组，提供两种配置模式，二选一：
1，简易模式，提供最基本的通知渠道功能。需填写如下参数：
- Type
- NoticeReceivers
- WebCallbacks

2，高级模式，在简易模式基础上，支持设定规则，为不同类型的告警分别设定通知渠道，并支持告警升级功能。需填写如下参数：
- NoticeRules
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmNotice", CreateAlarmNoticeResponse.class);
    }

    /**
     *该接口用于创建告警屏蔽规则。
     * @param req CreateAlarmShieldRequest
     * @return CreateAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmShieldResponse CreateAlarmShield(CreateAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlarmShield", CreateAlarmShieldResponse.class);
    }

    /**
     *内部云产品接入使用相关接口
     * @param req CreateCloudProductLogTaskRequest
     * @return CreateCloudProductLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudProductLogTaskResponse CreateCloudProductLogTask(CreateCloudProductLogTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudProductLogTask", CreateCloudProductLogTaskResponse.class);
    }

    /**
     *创建采集规则配置
     * @param req CreateConfigRequest
     * @return CreateConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigResponse CreateConfig(CreateConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfig", CreateConfigResponse.class);
    }

    /**
     *本接口用于创建特殊采集配置任务，特殊采集配置应用于自建K8S环境的采集Agent
     * @param req CreateConfigExtraRequest
     * @return CreateConfigExtraResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigExtraResponse CreateConfigExtra(CreateConfigExtraRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigExtra", CreateConfigExtraResponse.class);
    }

    /**
     *创建控制台分享
     * @param req CreateConsoleSharingRequest
     * @return CreateConsoleSharingResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleSharingResponse CreateConsoleSharing(CreateConsoleSharingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsoleSharing", CreateConsoleSharingResponse.class);
    }

    /**
     *本接口用于创建投递CKafka任务
     * @param req CreateConsumerRequest
     * @return CreateConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerResponse CreateConsumer(CreateConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumer", CreateConsumerResponse.class);
    }

    /**
     *本接口用于创建cos导入任务
     * @param req CreateCosRechargeRequest
     * @return CreateCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosRechargeResponse CreateCosRecharge(CreateCosRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCosRecharge", CreateCosRechargeResponse.class);
    }

    /**
     *此接口用于创建仪表盘订阅
     * @param req CreateDashboardSubscribeRequest
     * @return CreateDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public CreateDashboardSubscribeResponse CreateDashboardSubscribe(CreateDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDashboardSubscribe", CreateDashboardSubscribeResponse.class);
    }

    /**
     *本接口用于创建数据加工任务。
     * @param req CreateDataTransformRequest
     * @return CreateDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataTransformResponse CreateDataTransform(CreateDataTransformRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataTransform", CreateDataTransformResponse.class);
    }

    /**
     *本接口用于创建投递SCF任务
     * @param req CreateDeliverCloudFunctionRequest
     * @return CreateDeliverCloudFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeliverCloudFunctionResponse CreateDeliverCloudFunction(CreateDeliverCloudFunctionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDeliverCloudFunction", CreateDeliverCloudFunctionResponse.class);
    }

    /**
     *本接口仅创建下载任务，任务返回的下载地址，请用户调用DescribeExports查看任务列表。其中有下载地址CosPath参数。参考文档https://cloud.tencent.com/document/product/614/56449
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExport", CreateExportResponse.class);
    }

    /**
     *本接口用于创建索引
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIndex", CreateIndexResponse.class);
    }

    /**
     *本接口用于创建Kafka数据订阅任务
     * @param req CreateKafkaRechargeRequest
     * @return CreateKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateKafkaRechargeResponse CreateKafkaRecharge(CreateKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateKafkaRecharge", CreateKafkaRechargeResponse.class);
    }

    /**
     *本接口用于创建日志集，返回新创建的日志集的 ID。
     * @param req CreateLogsetRequest
     * @return CreateLogsetResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogsetResponse CreateLogset(CreateLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLogset", CreateLogsetResponse.class);
    }

    /**
     *创建机器组
     * @param req CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateMachineGroupResponse CreateMachineGroup(CreateMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMachineGroup", CreateMachineGroupResponse.class);
    }

    /**
     *该接口用于创建通知内容。
     * @param req CreateNoticeContentRequest
     * @return CreateNoticeContentResponse
     * @throws TencentCloudSDKException
     */
    public CreateNoticeContentResponse CreateNoticeContent(CreateNoticeContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNoticeContent", CreateNoticeContentResponse.class);
    }

    /**
     *本接口用于创建定时SQL分析任务
     * @param req CreateScheduledSqlRequest
     * @return CreateScheduledSqlResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledSqlResponse CreateScheduledSql(CreateScheduledSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateScheduledSql", CreateScheduledSqlResponse.class);
    }

    /**
     *新建投递到COS的任务，【！！！注意】使用此接口，需要检查是否配置了投递COS的角色和权限。如果没有配置，请参考文档投递权限查看和配置https://cloud.tencent.com/document/product/614/71623。
     * @param req CreateShipperRequest
     * @return CreateShipperResponse
     * @throws TencentCloudSDKException
     */
    public CreateShipperResponse CreateShipper(CreateShipperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateShipper", CreateShipperResponse.class);
    }

    /**
     *本接口用于创建日志主题。
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *本接口用于删除告警策略。
     * @param req DeleteAlarmRequest
     * @return DeleteAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmResponse DeleteAlarm(DeleteAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarm", DeleteAlarmResponse.class);
    }

    /**
     *该接口用于删除通知渠道组
     * @param req DeleteAlarmNoticeRequest
     * @return DeleteAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticeResponse DeleteAlarmNotice(DeleteAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmNotice", DeleteAlarmNoticeResponse.class);
    }

    /**
     *该接口用于删除告警屏蔽规则。
     * @param req DeleteAlarmShieldRequest
     * @return DeleteAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmShieldResponse DeleteAlarmShield(DeleteAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAlarmShield", DeleteAlarmShieldResponse.class);
    }

    /**
     *内部云产品接入使用相关接口
     * @param req DeleteCloudProductLogTaskRequest
     * @return DeleteCloudProductLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudProductLogTaskResponse DeleteCloudProductLogTask(DeleteCloudProductLogTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudProductLogTask", DeleteCloudProductLogTaskResponse.class);
    }

    /**
     *删除采集规则配置
     * @param req DeleteConfigRequest
     * @return DeleteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigResponse DeleteConfig(DeleteConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfig", DeleteConfigResponse.class);
    }

    /**
     *本接口用于删除特殊采集规则配置，特殊采集配置应用于自建K8S环境的采集Agent
     * @param req DeleteConfigExtraRequest
     * @return DeleteConfigExtraResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigExtraResponse DeleteConfigExtra(DeleteConfigExtraRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigExtra", DeleteConfigExtraResponse.class);
    }

    /**
     *删除应用到机器组的采集配置
     * @param req DeleteConfigFromMachineGroupRequest
     * @return DeleteConfigFromMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFromMachineGroupResponse DeleteConfigFromMachineGroup(DeleteConfigFromMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigFromMachineGroup", DeleteConfigFromMachineGroupResponse.class);
    }

    /**
     *删除控制台分享
     * @param req DeleteConsoleSharingRequest
     * @return DeleteConsoleSharingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsoleSharingResponse DeleteConsoleSharing(DeleteConsoleSharingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsoleSharing", DeleteConsoleSharingResponse.class);
    }

    /**
     *本接口用于删除投递配置
     * @param req DeleteConsumerRequest
     * @return DeleteConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerResponse DeleteConsumer(DeleteConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumer", DeleteConsumerResponse.class);
    }

    /**
     *此接口用于删除仪表盘订阅
     * @param req DeleteDashboardSubscribeRequest
     * @return DeleteDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDashboardSubscribeResponse DeleteDashboardSubscribe(DeleteDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDashboardSubscribe", DeleteDashboardSubscribeResponse.class);
    }

    /**
     *本接口用于删除数据加工任务
     * @param req DeleteDataTransformRequest
     * @return DeleteDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataTransformResponse DeleteDataTransform(DeleteDataTransformRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataTransform", DeleteDataTransformResponse.class);
    }

    /**
     *本接口用于删除日志下载任务
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExport", DeleteExportResponse.class);
    }

    /**
     *本接口用于删除日志主题的索引配置，删除索引配置后将无法检索和查询采集到的日志。
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIndex", DeleteIndexResponse.class);
    }

    /**
     *本接口用于删除Kafka数据订阅任务
     * @param req DeleteKafkaRechargeRequest
     * @return DeleteKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKafkaRechargeResponse DeleteKafkaRecharge(DeleteKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteKafkaRecharge", DeleteKafkaRechargeResponse.class);
    }

    /**
     *本接口用于删除日志集。
     * @param req DeleteLogsetRequest
     * @return DeleteLogsetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogsetResponse DeleteLogset(DeleteLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLogset", DeleteLogsetResponse.class);
    }

    /**
     *删除机器组
     * @param req DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupResponse DeleteMachineGroup(DeleteMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineGroup", DeleteMachineGroupResponse.class);
    }

    /**
     *用于删除机器组信息
     * @param req DeleteMachineGroupInfoRequest
     * @return DeleteMachineGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupInfoResponse DeleteMachineGroupInfo(DeleteMachineGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMachineGroupInfo", DeleteMachineGroupInfoResponse.class);
    }

    /**
     *该接口用于删除通知内容配置
     * @param req DeleteNoticeContentRequest
     * @return DeleteNoticeContentResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNoticeContentResponse DeleteNoticeContent(DeleteNoticeContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNoticeContent", DeleteNoticeContentResponse.class);
    }

    /**
     *本接口用于删除定时SQL分析任务
     * @param req DeleteScheduledSqlRequest
     * @return DeleteScheduledSqlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledSqlResponse DeleteScheduledSql(DeleteScheduledSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteScheduledSql", DeleteScheduledSqlResponse.class);
    }

    /**
     *删除投递COS任务
     * @param req DeleteShipperRequest
     * @return DeleteShipperResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShipperResponse DeleteShipper(DeleteShipperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteShipper", DeleteShipperResponse.class);
    }

    /**
     *本接口用于删除日志主题。
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *该接口用于获取通知渠道组列表
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmNotices", DescribeAlarmNoticesResponse.class);
    }

    /**
     *获取告警屏蔽配置规则
     * @param req DescribeAlarmShieldsRequest
     * @return DescribeAlarmShieldsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmShieldsResponse DescribeAlarmShields(DescribeAlarmShieldsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmShields", DescribeAlarmShieldsResponse.class);
    }

    /**
     *本接口用于获取告警策略列表。
     * @param req DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsResponse DescribeAlarms(DescribeAlarmsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarms", DescribeAlarmsResponse.class);
    }

    /**
     *获取告警历史，例如今天未恢复的告警
     * @param req DescribeAlertRecordHistoryRequest
     * @return DescribeAlertRecordHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRecordHistoryResponse DescribeAlertRecordHistory(DescribeAlertRecordHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertRecordHistory", DescribeAlertRecordHistoryResponse.class);
    }

    /**
     *云产品接入使用相关接口
     * @param req DescribeCloudProductLogTasksRequest
     * @return DescribeCloudProductLogTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudProductLogTasksResponse DescribeCloudProductLogTasks(DescribeCloudProductLogTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudProductLogTasks", DescribeCloudProductLogTasksResponse.class);
    }

    /**
     *本接口用于获取特殊采集配置，特殊采集配置应用于自建K8S环境的采集Agent
     * @param req DescribeConfigExtrasRequest
     * @return DescribeConfigExtrasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigExtrasResponse DescribeConfigExtras(DescribeConfigExtrasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigExtras", DescribeConfigExtrasResponse.class);
    }

    /**
     *获取采集规则配置所绑定的机器组
     * @param req DescribeConfigMachineGroupsRequest
     * @return DescribeConfigMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMachineGroupsResponse DescribeConfigMachineGroups(DescribeConfigMachineGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigMachineGroups", DescribeConfigMachineGroupsResponse.class);
    }

    /**
     *获取采集规则配置
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigs", DescribeConfigsResponse.class);
    }

    /**
     *批量查询控制台分享列表
     * @param req DescribeConsoleSharingListRequest
     * @return DescribeConsoleSharingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsoleSharingListResponse DescribeConsoleSharingList(DescribeConsoleSharingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsoleSharingList", DescribeConsoleSharingListResponse.class);
    }

    /**
     *本接口用于获取投递配置
     * @param req DescribeConsumerRequest
     * @return DescribeConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerResponse DescribeConsumer(DescribeConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumer", DescribeConsumerResponse.class);
    }

    /**
     *本接口用于获取cos导入配置
     * @param req DescribeCosRechargesRequest
     * @return DescribeCosRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRechargesResponse DescribeCosRecharges(DescribeCosRechargesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCosRecharges", DescribeCosRechargesResponse.class);
    }

    /**
     *本接口用于获取仪表盘订阅列表，支持分页
     * @param req DescribeDashboardSubscribesRequest
     * @return DescribeDashboardSubscribesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardSubscribesResponse DescribeDashboardSubscribes(DescribeDashboardSubscribesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDashboardSubscribes", DescribeDashboardSubscribesResponse.class);
    }

    /**
     *本接口用于获取仪表盘
     * @param req DescribeDashboardsRequest
     * @return DescribeDashboardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDashboardsResponse DescribeDashboards(DescribeDashboardsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDashboards", DescribeDashboardsResponse.class);
    }

    /**
     *本接口用于获取数据加工任务列表基本信息
     * @param req DescribeDataTransformInfoRequest
     * @return DescribeDataTransformInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataTransformInfoResponse DescribeDataTransformInfo(DescribeDataTransformInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataTransformInfo", DescribeDataTransformInfoResponse.class);
    }

    /**
     *本接口用于获取日志下载任务列表
     * @param req DescribeExportsRequest
     * @return DescribeExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportsResponse DescribeExports(DescribeExportsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExports", DescribeExportsResponse.class);
    }

    /**
     *本接口用于获取索引配置信息
     * @param req DescribeIndexRequest
     * @return DescribeIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexResponse DescribeIndex(DescribeIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIndex", DescribeIndexResponse.class);
    }

    /**
     *获取Kafka协议消费信息
     * @param req DescribeKafkaConsumerRequest
     * @return DescribeKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaConsumerResponse DescribeKafkaConsumer(DescribeKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaConsumer", DescribeKafkaConsumerResponse.class);
    }

    /**
     *本接口用于获取Kafka数据订阅任务
     * @param req DescribeKafkaRechargesRequest
     * @return DescribeKafkaRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaRechargesResponse DescribeKafkaRecharges(DescribeKafkaRechargesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeKafkaRecharges", DescribeKafkaRechargesResponse.class);
    }

    /**
     *本接口用于搜索日志上下文附近的内容，详情参考[上下文检索](https://cloud.tencent.com/document/product/614/53248)。
API返回数据包最大49MB，建议启用 gzip 压缩（HTTP Request Header Accept-Encoding:gzip）。
     * @param req DescribeLogContextRequest
     * @return DescribeLogContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogContextResponse DescribeLogContext(DescribeLogContextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogContext", DescribeLogContextResponse.class);
    }

    /**
     *本接口用于构建日志数量直方图
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogHistogram", DescribeLogHistogramResponse.class);
    }

    /**
     *本接口用于获取日志集信息列表。
     * @param req DescribeLogsetsRequest
     * @return DescribeLogsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsetsResponse DescribeLogsets(DescribeLogsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogsets", DescribeLogsetsResponse.class);
    }

    /**
     *获取机器组绑定的采集规则配置
     * @param req DescribeMachineGroupConfigsRequest
     * @return DescribeMachineGroupConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupConfigsResponse DescribeMachineGroupConfigs(DescribeMachineGroupConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineGroupConfigs", DescribeMachineGroupConfigsResponse.class);
    }

    /**
     *获取机器组信息列表
     * @param req DescribeMachineGroupsRequest
     * @return DescribeMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupsResponse DescribeMachineGroups(DescribeMachineGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachineGroups", DescribeMachineGroupsResponse.class);
    }

    /**
     *获取指定机器组下的机器状态
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMachines", DescribeMachinesResponse.class);
    }

    /**
     *获取通知内容列表
     * @param req DescribeNoticeContentsRequest
     * @return DescribeNoticeContentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNoticeContentsResponse DescribeNoticeContents(DescribeNoticeContentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNoticeContents", DescribeNoticeContentsResponse.class);
    }

    /**
     *该接口已废弃，如需获取分区数量，请使用DescribeTopics接口。
     * @param req DescribePartitionsRequest
     * @return DescribePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePartitionsResponse DescribePartitions(DescribePartitionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePartitions", DescribePartitionsResponse.class);
    }

    /**
     *本接口用于获取定时SQL分析任务列表
     * @param req DescribeScheduledSqlInfoRequest
     * @return DescribeScheduledSqlInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledSqlInfoResponse DescribeScheduledSqlInfo(DescribeScheduledSqlInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScheduledSqlInfo", DescribeScheduledSqlInfoResponse.class);
    }

    /**
     *获取投递任务列表
     * @param req DescribeShipperTasksRequest
     * @return DescribeShipperTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShipperTasksResponse DescribeShipperTasks(DescribeShipperTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShipperTasks", DescribeShipperTasksResponse.class);
    }

    /**
     *获取投递到COS的任务配置信息
     * @param req DescribeShippersRequest
     * @return DescribeShippersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShippersResponse DescribeShippers(DescribeShippersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeShippers", DescribeShippersResponse.class);
    }

    /**
     *本接口用于获取日志主题列表，支持分页
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
    }

    /**
     *本接口用于获取告警策略执行详情
     * @param req GetAlarmLogRequest
     * @return GetAlarmLogResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmLogResponse GetAlarmLog(GetAlarmLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAlarmLog", GetAlarmLogResponse.class);
    }

    /**
     *该接口已废弃，如需修改分区数量，请使用ModifyTopic接口。
     * @param req MergePartitionRequest
     * @return MergePartitionResponse
     * @throws TencentCloudSDKException
     */
    public MergePartitionResponse MergePartition(MergePartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MergePartition", MergePartitionResponse.class);
    }

    /**
     *本接口用于修改告警策略。需要至少修改一项有效内容。
     * @param req ModifyAlarmRequest
     * @return ModifyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmResponse ModifyAlarm(ModifyAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarm", ModifyAlarmResponse.class);
    }

    /**
     *该接口用于修改通知渠道组
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmNotice", ModifyAlarmNoticeResponse.class);
    }

    /**
     *该接口用于修改告警屏蔽规则。
     * @param req ModifyAlarmShieldRequest
     * @return ModifyAlarmShieldResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmShieldResponse ModifyAlarmShield(ModifyAlarmShieldRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAlarmShield", ModifyAlarmShieldResponse.class);
    }

    /**
     *内部云产品接入使用相关接口
     * @param req ModifyCloudProductLogTaskRequest
     * @return ModifyCloudProductLogTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudProductLogTaskResponse ModifyCloudProductLogTask(ModifyCloudProductLogTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudProductLogTask", ModifyCloudProductLogTaskResponse.class);
    }

    /**
     *修改采集规则配置
     * @param req ModifyConfigRequest
     * @return ModifyConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigResponse ModifyConfig(ModifyConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfig", ModifyConfigResponse.class);
    }

    /**
     *本接口用于修改特殊采集配置任务，特殊采集配置应用于自建K8S环境的采集Agent
     * @param req ModifyConfigExtraRequest
     * @return ModifyConfigExtraResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigExtraResponse ModifyConfigExtra(ModifyConfigExtraRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfigExtra", ModifyConfigExtraResponse.class);
    }

    /**
     *修改控制台分享，目前仅允许修改有效期
     * @param req ModifyConsoleSharingRequest
     * @return ModifyConsoleSharingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsoleSharingResponse ModifyConsoleSharing(ModifyConsoleSharingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsoleSharing", ModifyConsoleSharingResponse.class);
    }

    /**
     *本接口用于修改投递Ckafka任务
     * @param req ModifyConsumerRequest
     * @return ModifyConsumerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerResponse ModifyConsumer(ModifyConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumer", ModifyConsumerResponse.class);
    }

    /**
     *本接口用于修改cos导入任务
     * @param req ModifyCosRechargeRequest
     * @return ModifyCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosRechargeResponse ModifyCosRecharge(ModifyCosRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCosRecharge", ModifyCosRechargeResponse.class);
    }

    /**
     *此接口用于修改仪表盘订阅
     * @param req ModifyDashboardSubscribeRequest
     * @return ModifyDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDashboardSubscribeResponse ModifyDashboardSubscribe(ModifyDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDashboardSubscribe", ModifyDashboardSubscribeResponse.class);
    }

    /**
     *本接口用于修改数据加工任务
     * @param req ModifyDataTransformRequest
     * @return ModifyDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataTransformResponse ModifyDataTransform(ModifyDataTransformRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDataTransform", ModifyDataTransformResponse.class);
    }

    /**
     *本接口用于修改索引配置，该接口除受默认接口请求频率限制外，针对单个日志主题，并发数不能超过1，即同一时间同一个日志主题只能有一个正在执行的索引配置修改操作。
     * @param req ModifyIndexRequest
     * @return ModifyIndexResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIndexResponse ModifyIndex(ModifyIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIndex", ModifyIndexResponse.class);
    }

    /**
     *修改Kafka协议消费信息
     * @param req ModifyKafkaConsumerRequest
     * @return ModifyKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKafkaConsumerResponse ModifyKafkaConsumer(ModifyKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKafkaConsumer", ModifyKafkaConsumerResponse.class);
    }

    /**
     *本接口用于修改Kafka数据订阅任务
     * @param req ModifyKafkaRechargeRequest
     * @return ModifyKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKafkaRechargeResponse ModifyKafkaRecharge(ModifyKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyKafkaRecharge", ModifyKafkaRechargeResponse.class);
    }

    /**
     *本接口用于修改日志集信息
     * @param req ModifyLogsetRequest
     * @return ModifyLogsetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogsetResponse ModifyLogset(ModifyLogsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLogset", ModifyLogsetResponse.class);
    }

    /**
     *修改机器组
     * @param req ModifyMachineGroupRequest
     * @return ModifyMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineGroupResponse ModifyMachineGroup(ModifyMachineGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMachineGroup", ModifyMachineGroupResponse.class);
    }

    /**
     *该接口用于修改通知内容配置
     * @param req ModifyNoticeContentRequest
     * @return ModifyNoticeContentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNoticeContentResponse ModifyNoticeContent(ModifyNoticeContentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNoticeContent", ModifyNoticeContentResponse.class);
    }

    /**
     *本接口用于修改定时SQL分析任务
     * @param req ModifyScheduledSqlRequest
     * @return ModifyScheduledSqlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledSqlResponse ModifyScheduledSql(ModifyScheduledSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyScheduledSql", ModifyScheduledSqlResponse.class);
    }

    /**
     *修改现有的投递规则，客户如果使用此接口，需要自行处理CLS对指定bucket的写权限。
     * @param req ModifyShipperRequest
     * @return ModifyShipperResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShipperResponse ModifyShipper(ModifyShipperRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyShipper", ModifyShipperResponse.class);
    }

    /**
     *本接口用于修改日志主题。
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

    /**
     *打开Kafka协议消费功能
     * @param req OpenKafkaConsumerRequest
     * @return OpenKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public OpenKafkaConsumerResponse OpenKafkaConsumer(OpenKafkaConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OpenKafkaConsumer", OpenKafkaConsumerResponse.class);
    }

    /**
     *本接口用于预览Kafka数据订阅任务客户日志信息
     * @param req PreviewKafkaRechargeRequest
     * @return PreviewKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public PreviewKafkaRechargeResponse PreviewKafkaRecharge(PreviewKafkaRechargeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PreviewKafkaRecharge", PreviewKafkaRechargeResponse.class);
    }

    /**
     *查询指定时刻指标的最新值。
如果该时刻向前推5分钟内均无指标数据，则无相应的查询结果。
     * @param req QueryMetricRequest
     * @return QueryMetricResponse
     * @throws TencentCloudSDKException
     */
    public QueryMetricResponse QueryMetric(QueryMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryMetric", QueryMetricResponse.class);
    }

    /**
     *查询指定时间范围内指标的变化趋势
     * @param req QueryRangeMetricRequest
     * @return QueryRangeMetricResponse
     * @throws TencentCloudSDKException
     */
    public QueryRangeMetricResponse QueryRangeMetric(QueryRangeMetricRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryRangeMetric", QueryRangeMetricResponse.class);
    }

    /**
     *重试失败的投递任务
     * @param req RetryShipperTaskRequest
     * @return RetryShipperTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryShipperTaskResponse RetryShipperTask(RetryShipperTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RetryShipperTask", RetryShipperTaskResponse.class);
    }

    /**
     *本接口用于预览cos导入信息
     * @param req SearchCosRechargeInfoRequest
     * @return SearchCosRechargeInfoResponse
     * @throws TencentCloudSDKException
     */
    public SearchCosRechargeInfoResponse SearchCosRechargeInfo(SearchCosRechargeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchCosRechargeInfo", SearchCosRechargeInfoResponse.class);
    }

    /**
     *此接口用于预览仪表盘订阅
     * @param req SearchDashboardSubscribeRequest
     * @return SearchDashboardSubscribeResponse
     * @throws TencentCloudSDKException
     */
    public SearchDashboardSubscribeResponse SearchDashboardSubscribe(SearchDashboardSubscribeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchDashboardSubscribe", SearchDashboardSubscribeResponse.class);
    }

    /**
     *本接口用于检索分析日志，使用该接口时请注意如下事项：
1. 该接口除受默认接口请求频率限制外，针对单个日志主题，查询并发数不能超过15。
2. 检索语法建议使用CQL语法规则，请使用SyntaxRule参数，将值设置为1。
3. API返回数据包最大49MB，建议启用 gzip 压缩（HTTP Request Header Accept-Encoding:gzip）。
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
    }

    /**
     *该接口已废弃，如需修改分区数量，请使用ModifyTopic接口。
     * @param req SplitPartitionRequest
     * @return SplitPartitionResponse
     * @throws TencentCloudSDKException
     */
    public SplitPartitionResponse SplitPartition(SplitPartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SplitPartition", SplitPartitionResponse.class);
    }

    /**
     *## 提示
为了保障您日志数据的可靠性以及更高效地使用日志服务，建议您使用CLS优化后的接口[上传结构化日志](https://cloud.tencent.com/document/product/614/16873)。

同时我们给此接口专门优化定制了多个语言版本的SDK供您选择，SDK提供统一的异步发送、资源控制、自动重试、优雅关闭、感知上报等功能，使上报日志功能更完善，详情请参考[SDK采集](https://cloud.tencent.com/document/product/614/67157)。

同时云API上传日志接口也支持同步上传日志数据，如果您选择继续使用此接口请参考下文。

## 功能描述

本接口用于将日志写入到指定的日志主题。

#### 输入参数(pb二进制流，位于body中)

| 字段名       | 类型    | 位置 | 必须 | 含义                                                         |
| ------------ | ------- | ---- | ---- | ------------------------------------------------------------ |
| logGroupList | message | pb   | 是   | logGroup 列表，封装好的日志组列表内容，建议 logGroup 数量不要超过5个 |

LogGroup 说明：

| 字段名      | 是否必选 | 含义                                                         |
| ----------- | -------- | ------------------------------------------------------------ |
| logs        | 是       | 日志数组，表示有多个 Log 组成的集合，一个 Log 表示一条日志，一个 LogGroup 中 Log 个数不能超过10000 |
| contextFlow | 否       | LogGroup 的唯一ID，需要使用上下文功能时传入。格式："{上下文ID}-{LogGroupID}"。<br>上下文ID：唯一标识一个上下文（连续滚动的一系列日志文件，或者是需要保序的一系列日志），16进制64位整型字符串。<br>LogGroupID：连续递增的一串整型，16进制64位整型字符串。样例："102700A66102516A-59F59"。                        |
| filename    | 否       | 日志文件名                                                   |
| source      | 否       | 日志来源，一般使用机器 IP 作为标识                           |
| logTags     | 否       | 日志的标签列表                                               |

Log 说明：

| 字段名   | 是否必选 | 含义                                                         |
| -------- | -------- | ------------------------------------------------------------ |
| time     | 是       | 日志时间（Unix 格式时间戳），支持秒、毫秒，建议采用毫秒      |
| contents | 否       | key-value 格式的日志内容，表示一条日志里的多个 key-value 组合 |

Content 说明：

| 字段名 | 是否必选 | 含义                                                         |
| ------ | -------- | ------------------------------------------------------------ |
| key    | 是       | 单条日志里某个字段组的 key 值，不能以`_`开头                 |
| value  | 是       | 单条日志某个字段组的 value 值，单条日志 value 不能超过1MB，LogGroup 中所有 value 总和不能超过5MB |

LogTag 说明：

| 字段名 | 是否必选 | 含义                             |
| ------ | -------- | -------------------------------- |
| key    | 是       | 自定义的标签 key                 |
| value  | 是       | 自定义的标签 key 对应的 value 值 |

## PB 编译示例

本示例将说明如何使用官方 protoc 编译工具将 PB 描述文件 编译生成为 C++ 语言可调用的上传日志接口。

> ?目前 protoc 官方支持 Java、C++、Python 等语言的编译，详情请参见 [protoc](https://github.com/protocolbuffers/protobuf)。

#### 1. 安装 Protocol Buffer

下载 [Protocol Buffer](https://main.qcloudimg.com/raw/d7810aaf8b3073fbbc9d4049c21532aa/protobuf-2.6.1.tar.gz) ，解压并安装。示例版本为 protobuf 2.6.1，环境为 Centos 7.3 系统。 解压`protobuf-2.6.1.tar.gz`压缩包至`/usr/local`目录并进入该目录，执行命令如下：

```
tar -zxvf protobuf-2.6.1.tar.gz -C /usr/local/ && cd /usr/local/protobuf-2.6.1
```

开始编译和安装，配置环境变量，执行命令如下：

```
[root@VM_0_8_centos protobuf-2.6.1]# ./configure 
[root@VM_0_8_centos protobuf-2.6.1]# make && make install
[root@VM_0_8_centos protobuf-2.6.1]# export PATH=$PATH:/usr/local/protobuf-2.6.1/bin
```

编译成功后，您可以使用以下命令查看版本：

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --version
liprotoc 2.6.1
```

#### 2. 创建 PB 描述文件

PB 描述文件是通信双方约定的数据交换格式，上传日志时须将规定的协议格式编译成对应语言版本的调用接口，然后添加到工程代码里，详情请参见 [protoc](https://github.com/protocolbuffers/protobuf) 。

以日志服务所规定的 PB 数据格式内容为准， 在本地创建 PB 消息描述文件 cls.proto。

> !PB 描述文件内容不可更改，且文件名须以`.proto`结尾。

cls.proto 内容（PB 描述文件）如下：

```
package cls;

message Log
{
    message Content
    {
        required string key   = 1; // 每组字段的 key
        required string value = 2; // 每组字段的 value
    }
    required int64   time     = 1; // 时间戳，UNIX时间格式
    repeated Content contents = 2; // 一条日志里的多个kv组合
}

message LogTag
{
    required string key       = 1;
    required string value     = 2;
}

message LogGroup
{
    repeated Log    logs        = 1; // 多条日志合成的日志数组
    optional string contextFlow = 2; // 目前暂无效用
    optional string filename    = 3; // 日志文件名
    optional string source      = 4; // 日志来源，一般使用机器IP
    repeated LogTag logTags     = 5;
}

message LogGroupList
{
    repeated LogGroup logGroupList = 1; // 日志组列表
}
```

#### 3. 编译生成

此例中，使用 proto 编译器生成 C++ 语言的文件，在 cls.proto 文件的同一目录下，执行如下编译命令：

```
protoc --cpp_out=./ ./cls.proto 
```

> ?`--cpp_out=./`表示编译成 cpp 格式并输出当前目录下，`./cls.proto`表示位于当前目录下的 cls.proto 描述文件。

编译成功后，会输出对应语言的代码文件。此例会生成 cls.pb.h 头文件和 [cls.pb.cc](http://cls.pb.cc) 代码实现文件，如下所示：

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --cpp_out=./ ./cls.proto
[root@VM_0_8_centos protobuf-2.6.1]# ls
cls.pb.cc cls.pb.h cls.proto
```

#### 4. 调用

将生成的 cls.pb.h 头文件引入代码中，调用接口进行数据格式封装。
     * @param req UploadLogRequest
     * @return UploadLogResponse
     * @throws TencentCloudSDKException
     */
    public UploadLogResponse UploadLog(UploadLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadLog", UploadLogResponse.class);
    }

}
