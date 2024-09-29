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
package com.tencentcloudapi.mqtt.v20240516;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mqtt.v20240516.models.*;

public class MqttClient extends AbstractClient{
    private static String endpoint = "mqtt.tencentcloudapi.com";
    private static String service = "mqtt";
    private static String version = "2024-05-16";
    
    public MqttClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MqttClient(Credential credential, String region, ClientProfile profile) {
        super(MqttClient.endpoint, MqttClient.version, credential, region, profile);
    }

    /**
     *创建MQTT实例的性能测试任务
     * @param req CreateAuthorizationPolicyRequest
     * @return CreateAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuthorizationPolicyResponse CreateAuthorizationPolicy(CreateAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuthorizationPolicy", CreateAuthorizationPolicyResponse.class);
    }

    /**
     *创建一个jwks的认证
     * @param req CreateJWKSAuthenticatorRequest
     * @return CreateJWKSAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public CreateJWKSAuthenticatorResponse CreateJWKSAuthenticator(CreateJWKSAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJWKSAuthenticator", CreateJWKSAuthenticatorResponse.class);
    }

    /**
     *创建一个jwks的认证
     * @param req CreateJWTAuthenticatorRequest
     * @return CreateJWTAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public CreateJWTAuthenticatorResponse CreateJWTAuthenticator(CreateJWTAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJWTAuthenticator", CreateJWTAuthenticatorResponse.class);
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
     *根据认证器类型删除一个MQTT认证器
     * @param req DeleteAuthenticatorRequest
     * @return DeleteAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuthenticatorResponse DeleteAuthenticator(DeleteAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuthenticator", DeleteAuthenticatorResponse.class);
    }

    /**
     *删除策略规则
     * @param req DeleteAuthorizationPolicyRequest
     * @return DeleteAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuthorizationPolicyResponse DeleteAuthorizationPolicy(DeleteAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuthorizationPolicy", DeleteAuthorizationPolicyResponse.class);
    }

    /**
     *删除MQTT主题
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
    }

    /**
     *查询MQTT认证器
     * @param req DescribeAuthenticatorRequest
     * @return DescribeAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthenticatorResponse DescribeAuthenticator(DescribeAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthenticator", DescribeAuthenticatorResponse.class);
    }

    /**
     *查询授权规则
     * @param req DescribeAuthorizationPoliciesRequest
     * @return DescribeAuthorizationPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthorizationPoliciesResponse DescribeAuthorizationPolicies(DescribeAuthorizationPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthorizationPolicies", DescribeAuthorizationPoliciesResponse.class);
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
     *查询mqtt主题详情
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
     *修改策略规则
     * @param req ModifyAuthorizationPolicyRequest
     * @return ModifyAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuthorizationPolicyResponse ModifyAuthorizationPolicy(ModifyAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuthorizationPolicy", ModifyAuthorizationPolicyResponse.class);
    }

    /**
     *修改MQTT JWKS 认证器
     * @param req ModifyJWKSAuthenticatorRequest
     * @return ModifyJWKSAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJWKSAuthenticatorResponse ModifyJWKSAuthenticator(ModifyJWKSAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJWKSAuthenticator", ModifyJWKSAuthenticatorResponse.class);
    }

    /**
     *修改MQTT JWKS 认证器
     * @param req ModifyJWTAuthenticatorRequest
     * @return ModifyJWTAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyJWTAuthenticatorResponse ModifyJWTAuthenticator(ModifyJWTAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyJWTAuthenticator", ModifyJWTAuthenticatorResponse.class);
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

    /**
     *注册设备证书
     * @param req RegisterDeviceCertificateRequest
     * @return RegisterDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RegisterDeviceCertificateResponse RegisterDeviceCertificate(RegisterDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterDeviceCertificate", RegisterDeviceCertificateResponse.class);
    }

    /**
     *修改策略规则优先级
     * @param req UpdateAuthorizationPolicyPriorityRequest
     * @return UpdateAuthorizationPolicyPriorityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAuthorizationPolicyPriorityResponse UpdateAuthorizationPolicyPriority(UpdateAuthorizationPolicyPriorityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAuthorizationPolicyPriority", UpdateAuthorizationPolicyPriorityResponse.class);
    }

}
