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
     *激活Ca证书
     * @param req ActivateCaCertificateRequest
     * @return ActivateCaCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ActivateCaCertificateResponse ActivateCaCertificate(ActivateCaCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateCaCertificate", ActivateCaCertificateResponse.class);
    }

    /**
     *生效设备证书
     * @param req ActivateDeviceCertificateRequest
     * @return ActivateDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ActivateDeviceCertificateResponse ActivateDeviceCertificate(ActivateDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateDeviceCertificate", ActivateDeviceCertificateResponse.class);
    }

    /**
     *申请ca注册码
     * @param req ApplyRegistrationCodeRequest
     * @return ApplyRegistrationCodeResponse
     * @throws TencentCloudSDKException
     */
    public ApplyRegistrationCodeResponse ApplyRegistrationCode(ApplyRegistrationCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyRegistrationCode", ApplyRegistrationCodeResponse.class);
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
     *创建一个HTTP的认证器
     * @param req CreateHttpAuthenticatorRequest
     * @return CreateHttpAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public CreateHttpAuthenticatorResponse CreateHttpAuthenticator(CreateHttpAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHttpAuthenticator", CreateHttpAuthenticatorResponse.class);
    }

    /**
     *为MQTT实例创建公网接入点，未开启公网的集群可调用。
     * @param req CreateInsPublicEndpointRequest
     * @return CreateInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateInsPublicEndpointResponse CreateInsPublicEndpoint(CreateInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInsPublicEndpoint", CreateInsPublicEndpointResponse.class);
    }

    /**
     *购买新的MQTT实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateInstance", CreateInstanceResponse.class);
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
     *添加mqtt角色
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *失效Ca证书
     * @param req DeactivateCaCertificateRequest
     * @return DeactivateCaCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateCaCertificateResponse DeactivateCaCertificate(DeactivateCaCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeactivateCaCertificate", DeactivateCaCertificateResponse.class);
    }

    /**
     *失效Ca证书
     * @param req DeactivateDeviceCertificateRequest
     * @return DeactivateDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeactivateDeviceCertificateResponse DeactivateDeviceCertificate(DeactivateDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeactivateDeviceCertificate", DeactivateDeviceCertificateResponse.class);
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
     *删除Ca证书
     * @param req DeleteCaCertificateRequest
     * @return DeleteCaCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCaCertificateResponse DeleteCaCertificate(DeleteCaCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCaCertificate", DeleteCaCertificateResponse.class);
    }

    /**
     *删除设备证书
     * @param req DeleteDeviceCertificateRequest
     * @return DeleteDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceCertificateResponse DeleteDeviceCertificate(DeleteDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDeviceCertificate", DeleteDeviceCertificateResponse.class);
    }

    /**
     *删除MQTT实例的公网接入点
     * @param req DeleteInsPublicEndpointRequest
     * @return DeleteInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInsPublicEndpointResponse DeleteInsPublicEndpoint(DeleteInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInsPublicEndpoint", DeleteInsPublicEndpointResponse.class);
    }

    /**
     *删除MQTT实例
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteInstance", DeleteInstanceResponse.class);
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
     *删除MQTT访问用户
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUser", DeleteUserResponse.class);
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
     *查询Ca证书详情接口
     * @param req DescribeCaCertificateRequest
     * @return DescribeCaCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaCertificateResponse DescribeCaCertificate(DescribeCaCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCaCertificate", DescribeCaCertificateResponse.class);
    }

    /**
     *查询集群下的ca证书信息
     * @param req DescribeCaCertificatesRequest
     * @return DescribeCaCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaCertificatesResponse DescribeCaCertificates(DescribeCaCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCaCertificates", DescribeCaCertificatesResponse.class);
    }

    /**
     *查询 MQTT 客户端详情
     * @param req DescribeClientListRequest
     * @return DescribeClientListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientListResponse DescribeClientList(DescribeClientListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientList", DescribeClientListResponse.class);
    }

    /**
     *查询设备证书详情接口
     * @param req DescribeDeviceCertificateRequest
     * @return DescribeDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceCertificateResponse DescribeDeviceCertificate(DescribeDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceCertificate", DescribeDeviceCertificateResponse.class);
    }

    /**
     *分页查询设备证书
     * @param req DescribeDeviceCertificatesRequest
     * @return DescribeDeviceCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceCertificatesResponse DescribeDeviceCertificates(DescribeDeviceCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceCertificates", DescribeDeviceCertificatesResponse.class);
    }

    /**
     *查询MQTT实例公网接入点
     * @param req DescribeInsPublicEndpointsRequest
     * @return DescribeInsPublicEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsPublicEndpointsResponse DescribeInsPublicEndpoints(DescribeInsPublicEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInsPublicEndpoints", DescribeInsPublicEndpointsResponse.class);
    }

    /**
     *查询MQTT实例公网接入点
     * @param req DescribeInsVPCEndpointsRequest
     * @return DescribeInsVPCEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsVPCEndpointsResponse DescribeInsVPCEndpoints(DescribeInsVPCEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInsVPCEndpoints", DescribeInsVPCEndpointsResponse.class);
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
     *根据订阅查询消息
     * @param req DescribeMessageByTopicRequest
     * @return DescribeMessageByTopicResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageByTopicResponse DescribeMessageByTopic(DescribeMessageByTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageByTopic", DescribeMessageByTopicResponse.class);
    }

    /**
     *查询MQTT消息详情
     * @param req DescribeMessageDetailsRequest
     * @return DescribeMessageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageDetailsResponse DescribeMessageDetails(DescribeMessageDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageDetails", DescribeMessageDetailsResponse.class);
    }

    /**
     *根据一级Topic查询消息列表
     * @param req DescribeMessageListRequest
     * @return DescribeMessageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageListResponse DescribeMessageList(DescribeMessageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageList", DescribeMessageListResponse.class);
    }

    /**
     *获取产品售卖规格
     * @param req DescribeProductSKUListRequest
     * @return DescribeProductSKUListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProductSKUListResponse DescribeProductSKUList(DescribeProductSKUListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProductSKUList", DescribeProductSKUListResponse.class);
    }

    /**
     *查询共享订阅消息堆积量
     * @param req DescribeSharedSubscriptionLagRequest
     * @return DescribeSharedSubscriptionLagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSharedSubscriptionLagResponse DescribeSharedSubscriptionLag(DescribeSharedSubscriptionLagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSharedSubscriptionLag", DescribeSharedSubscriptionLagResponse.class);
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
     *查询用户列表，Filter参数使用说明如下：

1. Username，用户名称模糊搜索
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserList", DescribeUserListResponse.class);
    }

    /**
     *修改策略规则，可参考 [数据面授权策略说明](https://cloud.tencent.com/document/product/1778/109715)
     * @param req ModifyAuthorizationPolicyRequest
     * @return ModifyAuthorizationPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAuthorizationPolicyResponse ModifyAuthorizationPolicy(ModifyAuthorizationPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAuthorizationPolicy", ModifyAuthorizationPolicyResponse.class);
    }

    /**
     *修改MQTT HTTP 认证器
     * @param req ModifyHttpAuthenticatorRequest
     * @return ModifyHttpAuthenticatorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHttpAuthenticatorResponse ModifyHttpAuthenticator(ModifyHttpAuthenticatorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyHttpAuthenticator", ModifyHttpAuthenticatorResponse.class);
    }

    /**
     *更新MQTT实例公网接入点
     * @param req ModifyInsPublicEndpointRequest
     * @return ModifyInsPublicEndpointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInsPublicEndpointResponse ModifyInsPublicEndpoint(ModifyInsPublicEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInsPublicEndpoint", ModifyInsPublicEndpointResponse.class);
    }

    /**
     *修改实例属性，只有运行中的集群可以调用该接口进行变更配置。
     * @param req ModifyInstanceRequest
     * @return ModifyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceResponse ModifyInstance(ModifyInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstance", ModifyInstanceResponse.class);
    }

    /**
     *更新MQTT集群绑定证书
参数传空，则为删除证书
     * @param req ModifyInstanceCertBindingRequest
     * @return ModifyInstanceCertBindingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceCertBindingResponse ModifyInstanceCertBinding(ModifyInstanceCertBindingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyInstanceCertBinding", ModifyInstanceCertBindingResponse.class);
    }

    /**
     *修改MQTT JWKS 认证器，全量配置修改，需要提交完整的修改后配置。
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
     *修改MQTT角色
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
    }

    /**
     *发布 MQTT 消息到消息主题或客户端
     * @param req PublishMessageRequest
     * @return PublishMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishMessageResponse PublishMessage(PublishMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PublishMessage", PublishMessageResponse.class);
    }

    /**
     *注册CA证书（仅一机一证场景支持），可参考 [自定义 X.509 证书实现 “一机一证”](https://cloud.tencent.com/document/product/1778/114817)
     * @param req RegisterCaCertificateRequest
     * @return RegisterCaCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RegisterCaCertificateResponse RegisterCaCertificate(RegisterCaCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterCaCertificate", RegisterCaCertificateResponse.class);
    }

    /**
     *注册设备证书（仅一机一证场景生效），可参考 [自定义 X.509 证书实现 “一机一证”](https://cloud.tencent.com/document/product/1778/114817#6cb39d46-efad-4220-8f11-2e7fab207bc8)
     * @param req RegisterDeviceCertificateRequest
     * @return RegisterDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RegisterDeviceCertificateResponse RegisterDeviceCertificate(RegisterDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RegisterDeviceCertificate", RegisterDeviceCertificateResponse.class);
    }

    /**
     *吊销设备证书
     * @param req RevokedDeviceCertificateRequest
     * @return RevokedDeviceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RevokedDeviceCertificateResponse RevokedDeviceCertificate(RevokedDeviceCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RevokedDeviceCertificate", RevokedDeviceCertificateResponse.class);
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
