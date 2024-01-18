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
package com.tencentcloudapi.trocket.v20230308;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trocket.v20230308.models.*;

public class TrocketClient extends AbstractClient{
    private static String endpoint = "trocket.tencentcloudapi.com";
    private static String service = "trocket";
    private static String version = "2023-03-08";
    
    public TrocketClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrocketClient(Credential credential, String region, ClientProfile profile) {
        super(TrocketClient.endpoint, TrocketClient.version, credential, region, profile);
    }

    /**
     *创建消费组
     * @param req CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerGroupResponse CreateConsumerGroup(CreateConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsumerGroup", CreateConsumerGroupResponse.class);
    }

    /**
     *购买新实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
    }

    /**
     *购买新的MQTT实例
     * @param req CreateMQTTInstanceRequest
     * @return CreateMQTTInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateMQTTInstanceResponse CreateMQTTInstance(CreateMQTTInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMQTTInstance", CreateMQTTInstanceResponse.class);
    }

    /**
     *添加角色
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *创建主题
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
    }

    /**
     *删除消费组
     * @param req DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerGroupResponse DeleteConsumerGroup(DeleteConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsumerGroup", DeleteConsumerGroupResponse.class);
    }

    /**
     *删除实例
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
    }

    /**
     *删除角色
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
    }

    /**
     *删除主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *查询消费组详情
     * @param req DescribeConsumerGroupRequest
     * @return DescribeConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupResponse DescribeConsumerGroup(DescribeConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroup", DescribeConsumerGroupResponse.class);
    }

    /**
     *获取消费组列表，Filter参数使用说明如下：

1. ConsumerGroupName，名称模糊查询
2. ConsumeMessageOrderly，投递顺序性。"true":顺序投递；"false":并发投递
     * @param req DescribeConsumerGroupListRequest
     * @return DescribeConsumerGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerGroupListResponse DescribeConsumerGroupList(DescribeConsumerGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConsumerGroupList", DescribeConsumerGroupListResponse.class);
    }

    /**
     *查询实例信息
     * @param req DescribeInstanceRequest
     * @return DescribeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceResponse DescribeInstance(DescribeInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstance", DescribeInstanceResponse.class);
    }

    /**
     *获取实例列表，Filters参数使用说明如下：
1. InstanceName, 名称模糊查询
2. InstanceId，实例ID查询
3. InstanceType, 实例类型查询，支持多选
3. InstanceStatus，实例状态查询，支持多选

当使用TagFilters查询时，Filters参数失效。
     * @param req DescribeInstanceListRequest
     * @return DescribeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceListResponse DescribeInstanceList(DescribeInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceList", DescribeInstanceListResponse.class);
    }

    /**
     *获取实例列表，Filters参数使用说明如下：
1. InstanceName, 名称模糊查询
2. InstanceId，实例ID查询
3. InstanceType, 实例类型查询，支持多选
3. InstanceStatus，实例状态查询，支持多选

当使用TagFilters查询时，Filters参数失效。
     * @param req DescribeMQTTInstanceListRequest
     * @return DescribeMQTTInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTInstanceListResponse DescribeMQTTInstanceList(DescribeMQTTInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTInstanceList", DescribeMQTTInstanceListResponse.class);
    }

    /**
     *非对外接口，获取产品售卖规格
     * @param req DescribeMQTTProductSKUListRequest
     * @return DescribeMQTTProductSKUListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMQTTProductSKUListResponse DescribeMQTTProductSKUList(DescribeMQTTProductSKUListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMQTTProductSKUList", DescribeMQTTProductSKUListResponse.class);
    }

    /**
     *查询角色列表，Filter参数使用说明如下：

1. RoleName，角色名称模糊搜索
     * @param req DescribeRoleListRequest
     * @return DescribeRoleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleListResponse DescribeRoleList(DescribeRoleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleList", DescribeRoleListResponse.class);
    }

    /**
     *查询主题详情，Offset和Limit参数是指订阅该主题的消费组查询分页参数，Filter参数使用说明如下：

ConsumerGroup，消费组名称过滤
     * @param req DescribeTopicRequest
     * @return DescribeTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicResponse DescribeTopic(DescribeTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopic", DescribeTopicResponse.class);
    }

    /**
     *获取主题列表，Filter参数使用说明如下：

1. TopicName，主题名称模糊搜索
2. TopicType，主题类型查询，支持多选，可选值：Normal,Order,Transaction,DelayScheduled
     * @param req DescribeTopicListRequest
     * @return DescribeTopicListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicListResponse DescribeTopicList(DescribeTopicListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicList", DescribeTopicListResponse.class);
    }

    /**
     *运营端查询topicStata
     * @param req DescribeTopicStatsOpRequest
     * @return DescribeTopicStatsOpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicStatsOpResponse DescribeTopicStatsOp(DescribeTopicStatsOpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopicStatsOp", DescribeTopicStatsOpResponse.class);
    }

    /**
     *导入消费者组列表
     * @param req ImportSourceClusterConsumerGroupsRequest
     * @return ImportSourceClusterConsumerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSourceClusterConsumerGroupsResponse ImportSourceClusterConsumerGroups(ImportSourceClusterConsumerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportSourceClusterConsumerGroups", ImportSourceClusterConsumerGroupsResponse.class);
    }

    /**
     *导入topic列表
     * @param req ImportSourceClusterTopicsRequest
     * @return ImportSourceClusterTopicsResponse
     * @throws TencentCloudSDKException
     */
    public ImportSourceClusterTopicsResponse ImportSourceClusterTopics(ImportSourceClusterTopicsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImportSourceClusterTopics", ImportSourceClusterTopicsResponse.class);
    }

    /**
     *修改消费组属性
     * @param req ModifyConsumerGroupRequest
     * @return ModifyConsumerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerGroupResponse ModifyConsumerGroup(ModifyConsumerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConsumerGroup", ModifyConsumerGroupResponse.class);
    }

    /**
     *修改实例属性
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *修改角色
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
    }

    /**
     *修改主题属性
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
    }

}
