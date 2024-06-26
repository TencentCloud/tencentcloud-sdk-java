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
package com.tencentcloudapi.ckafka.v20190819;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ckafka.v20190819.models.*;

public class CkafkaClient extends AbstractClient{
    private static String endpoint = "ckafka.tencentcloudapi.com";
    private static String service = "ckafka";
    private static String version = "2019-08-19";
    
    public CkafkaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CkafkaClient(Credential credential, String region, ClientProfile profile) {
        super(CkafkaClient.endpoint, CkafkaClient.version, credential, region, profile);
    }

    /**
     *给实例授权token
     * @param req AuthorizeTokenRequest
     * @return AuthorizeTokenResponse
     * @throws TencentCloudSDKException
     */
    public AuthorizeTokenResponse AuthorizeToken(AuthorizeTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AuthorizeToken", AuthorizeTokenResponse.class);
    }

    /**
     *批量添加ACL策略
     * @param req BatchCreateAclRequest
     * @return BatchCreateAclResponse
     * @throws TencentCloudSDKException
     */
    public BatchCreateAclResponse BatchCreateAcl(BatchCreateAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchCreateAcl", BatchCreateAclResponse.class);
    }

    /**
     *批量修改消费组offset
     * @param req BatchModifyGroupOffsetsRequest
     * @return BatchModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyGroupOffsetsResponse BatchModifyGroupOffsets(BatchModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyGroupOffsets", BatchModifyGroupOffsetsResponse.class);
    }

    /**
     *批量设置主题属性
     * @param req BatchModifyTopicAttributesRequest
     * @return BatchModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyTopicAttributesResponse BatchModifyTopicAttributes(BatchModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchModifyTopicAttributes", BatchModifyTopicAttributesResponse.class);
    }

    /**
     *取消授权token
     * @param req CancelAuthorizationTokenRequest
     * @return CancelAuthorizationTokenResponse
     * @throws TencentCloudSDKException
     */
    public CancelAuthorizationTokenResponse CancelAuthorizationToken(CancelAuthorizationTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelAuthorizationToken", CancelAuthorizationTokenResponse.class);
    }

    /**
     *用于查询cdc-ckafka任务状态
     * @param req CheckCdcClusterRequest
     * @return CheckCdcClusterResponse
     * @throws TencentCloudSDKException
     */
    public CheckCdcClusterResponse CheckCdcCluster(CheckCdcClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckCdcCluster", CheckCdcClusterResponse.class);
    }

    /**
     *添加 ACL 策略
     * @param req CreateAclRequest
     * @return CreateAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclResponse CreateAcl(CreateAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAcl", CreateAclResponse.class);
    }

    /**
     *添加 ACL 规则
     * @param req CreateAclRuleRequest
     * @return CreateAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclRuleResponse CreateAclRule(CreateAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAclRule", CreateAclRuleResponse.class);
    }

    /**
     *用于cdc的专用ckafka集群
     * @param req CreateCdcClusterRequest
     * @return CreateCdcClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateCdcClusterResponse CreateCdcCluster(CreateCdcClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCdcCluster", CreateCdcClusterResponse.class);
    }

    /**
     *创建Datahub连接源
     * @param req CreateConnectResourceRequest
     * @return CreateConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateConnectResourceResponse CreateConnectResource(CreateConnectResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConnectResource", CreateConnectResourceResponse.class);
    }

    /**
     *创建消费者组
     * @param req CreateConsumerRequest
     * @return CreateConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerResponse CreateConsumer(CreateConsumerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumer", CreateConsumerResponse.class);
    }

    /**
     *创建DIP转储任务
     * @param req CreateDatahubTaskRequest
     * @return CreateDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatahubTaskResponse CreateDatahubTask(CreateDatahubTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatahubTask", CreateDatahubTaskResponse.class);
    }

    /**
     *创建DIP主题
     * @param req CreateDatahubTopicRequest
     * @return CreateDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatahubTopicResponse CreateDatahubTopic(CreateDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatahubTopic", CreateDatahubTopicResponse.class);
    }

    /**
     *由于出参需要更新，当前接口将会在未来版本中废弃，建议用户迁移使用 CreatePostPaidInstance 接口。创建按量计费实例。通常用于 SDK 或云 API 控制台调用接口，创建后付费 CKafka 实例。调用接口与在 CKafka 控制台购买按量付费实例效果相同。
     * @param req CreateInstancePostRequest
     * @return CreateInstancePostResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancePostResponse CreateInstancePost(CreateInstancePostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstancePost", CreateInstancePostResponse.class);
    }

    /**
     *创建实例(预付费包年包月),  仅支持创建专业版实例
     * @param req CreateInstancePreRequest
     * @return CreateInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstancePreResponse CreateInstancePre(CreateInstancePreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstancePre", CreateInstancePreResponse.class);
    }

    /**
     *本接口用于增加主题中的分区
     * @param req CreatePartitionRequest
     * @return CreatePartitionResponse
     * @throws TencentCloudSDKException
     */
    public CreatePartitionResponse CreatePartition(CreatePartitionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePartition", CreatePartitionResponse.class);
    }

    /**
     *当前接口用来替代 CreateInstancePost 接口。创建按量计费实例。通常用于 SDK 或云 API 控制台调用接口，创建后付费 CKafka 实例。调用接口与在 CKafka 控制台购买按量付费实例效果相同。
     * @param req CreatePostPaidInstanceRequest
     * @return CreatePostPaidInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostPaidInstanceResponse CreatePostPaidInstance(CreatePostPaidInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePostPaidInstance", CreatePostPaidInstanceResponse.class);
    }

    /**
     *添加普罗米修斯监控1
     * @param req CreatePrometheusRequest
     * @return CreatePrometheusResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusResponse CreatePrometheus(CreatePrometheusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheus", CreatePrometheusResponse.class);
    }

    /**
     *添加实例路由
     * @param req CreateRouteRequest
     * @return CreateRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteResponse CreateRoute(CreateRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRoute", CreateRouteResponse.class);
    }

    /**
     *创建最高权限的token
     * @param req CreateTokenRequest
     * @return CreateTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateTokenResponse CreateToken(CreateTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateToken", CreateTokenResponse.class);
    }

    /**
     *创建ckafka主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *创建主题ip白名单
     * @param req CreateTopicIpWhiteListRequest
     * @return CreateTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicIpWhiteListResponse CreateTopicIpWhiteList(CreateTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopicIpWhiteList", CreateTopicIpWhiteListResponse.class);
    }

    /**
     *添加用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *删除ACL
     * @param req DeleteAclRequest
     * @return DeleteAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclResponse DeleteAcl(DeleteAclRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAcl", DeleteAclResponse.class);
    }

    /**
     *删除ACL规则
     * @param req DeleteAclRuleRequest
     * @return DeleteAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclRuleResponse DeleteAclRule(DeleteAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAclRule", DeleteAclRuleResponse.class);
    }

    /**
     *删除Datahub连接源
     * @param req DeleteConnectResourceRequest
     * @return DeleteConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConnectResourceResponse DeleteConnectResource(DeleteConnectResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConnectResource", DeleteConnectResourceResponse.class);
    }

    /**
     *删除Dip任务
     * @param req DeleteDatahubTaskRequest
     * @return DeleteDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatahubTaskResponse DeleteDatahubTask(DeleteDatahubTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDatahubTask", DeleteDatahubTaskResponse.class);
    }

    /**
     *删除Datahub主题
     * @param req DeleteDatahubTopicRequest
     * @return DeleteDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatahubTopicResponse DeleteDatahubTopic(DeleteDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDatahubTopic", DeleteDatahubTopicResponse.class);
    }

    /**
     *删除消费组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *删除后付费实例
     * @param req DeleteInstancePostRequest
     * @return DeleteInstancePostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstancePostResponse DeleteInstancePost(DeleteInstancePostRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstancePost", DeleteInstancePostResponse.class);
    }

    /**
     *删除预付费实例
     * @param req DeleteInstancePreRequest
     * @return DeleteInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstancePreResponse DeleteInstancePre(DeleteInstancePreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstancePre", DeleteInstancePreResponse.class);
    }

    /**
     *删除路由
     * @param req DeleteRouteRequest
     * @return DeleteRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteResponse DeleteRoute(DeleteRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRoute", DeleteRouteResponse.class);
    }

    /**
     *修改删除路由延迟触发时间
     * @param req DeleteRouteTriggerTimeRequest
     * @return DeleteRouteTriggerTimeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTriggerTimeResponse DeleteRouteTriggerTime(DeleteRouteTriggerTimeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRouteTriggerTime", DeleteRouteTriggerTimeResponse.class);
    }

    /**
     *删除ckafka主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *删除主题IP白名单
     * @param req DeleteTopicIpWhiteListRequest
     * @return DeleteTopicIpWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicIpWhiteListResponse DeleteTopicIpWhiteList(DeleteTopicIpWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopicIpWhiteList", DeleteTopicIpWhiteListResponse.class);
    }

    /**
     *删除用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
    }

    /**
     *枚举ACL
     * @param req DescribeACLRequest
     * @return DescribeACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeACLResponse DescribeACL(DescribeACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeACL", DescribeACLResponse.class);
    }

    /**
     *查询ACL规则列表
     * @param req DescribeAclRuleRequest
     * @return DescribeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAclRuleResponse DescribeAclRule(DescribeAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAclRule", DescribeAclRuleResponse.class);
    }

    /**
     *查询用户列表
     * @param req DescribeAppInfoRequest
     * @return DescribeAppInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppInfoResponse DescribeAppInfo(DescribeAppInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAppInfo", DescribeAppInfoResponse.class);
    }

    /**
     *用于查看ckafka的可用区列表
     * @param req DescribeCkafkaZoneRequest
     * @return DescribeCkafkaZoneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCkafkaZoneResponse DescribeCkafkaZone(DescribeCkafkaZoneRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCkafkaZone", DescribeCkafkaZoneResponse.class);
    }

    /**
     *查询Datahub连接源
     * @param req DescribeConnectResourceRequest
     * @return DescribeConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectResourceResponse DescribeConnectResource(DescribeConnectResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConnectResource", DescribeConnectResourceResponse.class);
    }

    /**
     *查询Datahub连接源列表
     * @param req DescribeConnectResourcesRequest
     * @return DescribeConnectResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConnectResourcesResponse DescribeConnectResources(DescribeConnectResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConnectResources", DescribeConnectResourcesResponse.class);
    }

    /**
     *查询消费分组信息
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroup", DescribeConsumerGroupResponse.class);
    }

    /**
     *获取Datahub消费分组offset
     * @param req DescribeDatahubGroupOffsetsRequest
     * @return DescribeDatahubGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubGroupOffsetsResponse DescribeDatahubGroupOffsets(DescribeDatahubGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubGroupOffsets", DescribeDatahubGroupOffsetsResponse.class);
    }

    /**
     *查询Datahub任务信息
     * @param req DescribeDatahubTaskRequest
     * @return DescribeDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTaskResponse DescribeDatahubTask(DescribeDatahubTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubTask", DescribeDatahubTaskResponse.class);
    }

    /**
     *查询Datahub任务列表 
     * @param req DescribeDatahubTasksRequest
     * @return DescribeDatahubTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTasksResponse DescribeDatahubTasks(DescribeDatahubTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubTasks", DescribeDatahubTasksResponse.class);
    }

    /**
     *获取DIP主题属性
     * @param req DescribeDatahubTopicRequest
     * @return DescribeDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTopicResponse DescribeDatahubTopic(DescribeDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubTopic", DescribeDatahubTopicResponse.class);
    }

    /**
     *查询DIP主题列表
     * @param req DescribeDatahubTopicsRequest
     * @return DescribeDatahubTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatahubTopicsResponse DescribeDatahubTopics(DescribeDatahubTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatahubTopics", DescribeDatahubTopicsResponse.class);
    }

    /**
     *枚举消费分组(精简版)
     * @param req DescribeGroupRequest
     * @return DescribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupResponse DescribeGroup(DescribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroup", DescribeGroupResponse.class);
    }

    /**
     *获取消费分组信息
     * @param req DescribeGroupInfoRequest
     * @return DescribeGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupInfoResponse DescribeGroupInfo(DescribeGroupInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupInfo", DescribeGroupInfoResponse.class);
    }

    /**
     *获取消费分组offset
     * @param req DescribeGroupOffsetsRequest
     * @return DescribeGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupOffsetsResponse DescribeGroupOffsets(DescribeGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGroupOffsets", DescribeGroupOffsetsResponse.class);
    }

    /**
     *获取实例属性
     * @param req DescribeInstanceAttributesRequest
     * @return DescribeInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceAttributesResponse DescribeInstanceAttributes(DescribeInstanceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceAttributes", DescribeInstanceAttributesResponse.class);
    }

    /**
     *本接口（DescribeInstance）用于在用户账户下获取消息队列 CKafka 实例列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstances", DescribeInstancesResponse.class);
    }

    /**
     *用户账户下获取实例列表详情
     * @param req DescribeInstancesDetailRequest
     * @return DescribeInstancesDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesDetailResponse DescribeInstancesDetail(DescribeInstancesDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstancesDetail", DescribeInstancesDetailResponse.class);
    }

    /**
     *获取实例Prometheus信息
     * @param req DescribePrometheusRequest
     * @return DescribePrometheusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusResponse DescribePrometheus(DescribePrometheusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheus", DescribePrometheusResponse.class);
    }

    /**
     *枚举地域,只支持广州地域
     * @param req DescribeRegionRequest
     * @return DescribeRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionResponse DescribeRegion(DescribeRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegion", DescribeRegionResponse.class);
    }

    /**
     *查看路由信息
     * @param req DescribeRouteRequest
     * @return DescribeRouteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteResponse DescribeRoute(DescribeRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoute", DescribeRouteResponse.class);
    }

    /**
     *查询任务状态
     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskStatus", DescribeTaskStatusResponse.class);
    }

    /**
     *接口请求域名：https://ckafka.tencentcloudapi.com
本接口（DescribeTopic）用于在用户获取消息队列 CKafka 实例的主题列表
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopic", DescribeTopicResponse.class);
    }

    /**
     *获取主题属性
     * @param req DescribeTopicAttributesRequest
     * @return DescribeTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicAttributesResponse DescribeTopicAttributes(DescribeTopicAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicAttributes", DescribeTopicAttributesResponse.class);
    }

    /**
     *获取主题列表详情（仅控制台调用）
     * @param req DescribeTopicDetailRequest
     * @return DescribeTopicDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicDetailResponse DescribeTopicDetail(DescribeTopicDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicDetail", DescribeTopicDetailResponse.class);
    }

    /**
     *获取Topic流量排行，消费者流量排行
     * @param req DescribeTopicFlowRankingRequest
     * @return DescribeTopicFlowRankingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicFlowRankingResponse DescribeTopicFlowRanking(DescribeTopicFlowRankingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicFlowRanking", DescribeTopicFlowRankingResponse.class);
    }

    /**
     *查询topic 生产端连接信息
     * @param req DescribeTopicProduceConnectionRequest
     * @return DescribeTopicProduceConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicProduceConnectionResponse DescribeTopicProduceConnection(DescribeTopicProduceConnectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicProduceConnection", DescribeTopicProduceConnectionResponse.class);
    }

    /**
     *查询订阅某主题消息分组信息
     * @param req DescribeTopicSubscribeGroupRequest
     * @return DescribeTopicSubscribeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicSubscribeGroupResponse DescribeTopicSubscribeGroup(DescribeTopicSubscribeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicSubscribeGroup", DescribeTopicSubscribeGroupResponse.class);
    }

    /**
     *获取Topic 副本详情信息
     * @param req DescribeTopicSyncReplicaRequest
     * @return DescribeTopicSyncReplicaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicSyncReplicaResponse DescribeTopicSyncReplica(DescribeTopicSyncReplicaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicSyncReplica", DescribeTopicSyncReplicaResponse.class);
    }

    /**
     *查询用户信息
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUser", DescribeUserResponse.class);
    }

    /**
     *根据指定offset位置的消息
     * @param req FetchDatahubMessageByOffsetRequest
     * @return FetchDatahubMessageByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchDatahubMessageByOffsetResponse FetchDatahubMessageByOffset(FetchDatahubMessageByOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchDatahubMessageByOffset", FetchDatahubMessageByOffsetResponse.class);
    }

    /**
     *查询最新消息列表
     * @param req FetchLatestDatahubMessageListRequest
     * @return FetchLatestDatahubMessageListResponse
     * @throws TencentCloudSDKException
     */
    public FetchLatestDatahubMessageListResponse FetchLatestDatahubMessageList(FetchLatestDatahubMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchLatestDatahubMessageList", FetchLatestDatahubMessageListResponse.class);
    }

    /**
     *根据指定offset位置的消息
     * @param req FetchMessageByOffsetRequest
     * @return FetchMessageByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchMessageByOffsetResponse FetchMessageByOffset(FetchMessageByOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchMessageByOffset", FetchMessageByOffsetResponse.class);
    }

    /**
     *根据位点查询消息列表
     * @param req FetchMessageListByOffsetRequest
     * @return FetchMessageListByOffsetResponse
     * @throws TencentCloudSDKException
     */
    public FetchMessageListByOffsetResponse FetchMessageListByOffset(FetchMessageListByOffsetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FetchMessageListByOffset", FetchMessageListByOffsetResponse.class);
    }

    /**
     *Ckafka实例购买/续费询价
     * @param req InquireCkafkaPriceRequest
     * @return InquireCkafkaPriceResponse
     * @throws TencentCloudSDKException
     */
    public InquireCkafkaPriceResponse InquireCkafkaPrice(InquireCkafkaPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquireCkafkaPrice", InquireCkafkaPriceResponse.class);
    }

    /**
     *按量实例缩容
     * @param req InstanceScalingDownRequest
     * @return InstanceScalingDownResponse
     * @throws TencentCloudSDKException
     */
    public InstanceScalingDownResponse InstanceScalingDown(InstanceScalingDownRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstanceScalingDown", InstanceScalingDownResponse.class);
    }

    /**
     *修改ACL策略，目前只支持预设规则的是否应用到新增topic这一项的修改
     * @param req ModifyAclRuleRequest
     * @return ModifyAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAclRuleResponse ModifyAclRule(ModifyAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAclRule", ModifyAclRuleResponse.class);
    }

    /**
     *编辑Datahub连接源
     * @param req ModifyConnectResourceRequest
     * @return ModifyConnectResourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConnectResourceResponse ModifyConnectResource(ModifyConnectResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConnectResource", ModifyConnectResourceResponse.class);
    }

    /**
     *修改Datahub任务
     * @param req ModifyDatahubTaskRequest
     * @return ModifyDatahubTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatahubTaskResponse ModifyDatahubTask(ModifyDatahubTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatahubTask", ModifyDatahubTaskResponse.class);
    }

    /**
     *修改DIP主题属性
     * @param req ModifyDatahubTopicRequest
     * @return ModifyDatahubTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatahubTopicResponse ModifyDatahubTopic(ModifyDatahubTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatahubTopic", ModifyDatahubTopicResponse.class);
    }

    /**
     *设置Groups 消费分组offset
     * @param req ModifyGroupOffsetsRequest
     * @return ModifyGroupOffsetsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupOffsetsResponse ModifyGroupOffsets(ModifyGroupOffsetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGroupOffsets", ModifyGroupOffsetsResponse.class);
    }

    /**
     *设置实例属性
     * @param req ModifyInstanceAttributesRequest
     * @return ModifyInstanceAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceAttributesResponse ModifyInstanceAttributes(ModifyInstanceAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceAttributes", ModifyInstanceAttributesResponse.class);
    }

    /**
     *预付费实例变配接口，调整磁盘，带宽
     * @param req ModifyInstancePreRequest
     * @return ModifyInstancePreResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstancePreResponse ModifyInstancePre(ModifyInstancePreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstancePre", ModifyInstancePreResponse.class);
    }

    /**
     *修改密码
     * @param req ModifyPasswordRequest
     * @return ModifyPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPasswordResponse ModifyPassword(ModifyPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPassword", ModifyPasswordResponse.class);
    }

    /**
     *本接口用于修改主题属性。
     * @param req ModifyTopicAttributesRequest
     * @return ModifyTopicAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicAttributesResponse ModifyTopicAttributes(ModifyTopicAttributesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopicAttributes", ModifyTopicAttributesResponse.class);
    }

    /**
     *续费Ckafka实例, 目前只支持国内站包年包月实例续费
     * @param req RenewCkafkaInstanceRequest
     * @return RenewCkafkaInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenewCkafkaInstanceResponse RenewCkafkaInstance(RenewCkafkaInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewCkafkaInstance", RenewCkafkaInstanceResponse.class);
    }

    /**
     *通过HTTP接入层发送消息
     * @param req SendMessageRequest
     * @return SendMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendMessageResponse SendMessage(SendMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendMessage", SendMessageResponse.class);
    }

}
