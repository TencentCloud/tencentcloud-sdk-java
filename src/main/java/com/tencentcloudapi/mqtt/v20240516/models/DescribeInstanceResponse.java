/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceResponse extends AbstractModel {

    /**
    * 实例类型
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 主题数量
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 实例最大主题数量
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * TPS限流值
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * 创建时间，秒为单位
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例规格
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * 单客户端最大订阅数
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * 授权规则条数
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * 客户端数量上限
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * 客户端证书注册方式：
JITP：自动注册
API：通过API手动注册
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * 自动注册设备证书时是否自动激活
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * 是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 计费模式， POSTPAID，按量计费 PREPAID，包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 到期时间，毫秒级时间戳
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * 预销毁时间，毫秒级时间戳
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * TLS,单向认证    mTLS,双向认证    BYOC;一机一证
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * 最大Ca配额
    */
    @SerializedName("MaxCaNum")
    @Expose
    private Long MaxCaNum;

    /**
    * 证书注册码
    */
    @SerializedName("RegistrationCode")
    @Expose
    private String RegistrationCode;

    /**
    * 集群最大订阅数
    */
    @SerializedName("MaxSubscription")
    @Expose
    private Long MaxSubscription;

    /**
    * 授权策略开关
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * 共享订阅组数最大限制
    */
    @SerializedName("SharedSubscriptionGroupLimit")
    @Expose
    private Long SharedSubscriptionGroupLimit;

    /**
    * 单个共享订阅组TopicFilter数限制
    */
    @SerializedName("MaxTopicFilterPerSharedSubscriptionGroup")
    @Expose
    private Long MaxTopicFilterPerSharedSubscriptionGroup;

    /**
    * 自动订阅规则条数限制
    */
    @SerializedName("AutoSubscriptionPolicyLimit")
    @Expose
    private Long AutoSubscriptionPolicyLimit;

    /**
    * 单条自动订阅规则TopicFilter数限制
    */
    @SerializedName("MaxTopicFilterPerAutoSubscriptionPolicy")
    @Expose
    private Long MaxTopicFilterPerAutoSubscriptionPolicy;

    /**
    * 是否使用默认的服务端证书
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * 服务端CA最大数量
    */
    @SerializedName("TrustedCaLimit")
    @Expose
    private Long TrustedCaLimit;

    /**
    * 服务端证书最大数量
    */
    @SerializedName("ServerCertLimit")
    @Expose
    private Long ServerCertLimit;

    /**
    * topic前缀最大层级
    */
    @SerializedName("TopicPrefixSlashLimit")
    @Expose
    private Long TopicPrefixSlashLimit;

    /**
    * 单客户端发送消息限速，单位 条/秒
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

    /**
    * 服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1
    */
    @SerializedName("TransportLayerSecurity")
    @Expose
    private String TransportLayerSecurity;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例类型
BASIC 基础版
PRO  专业版
PLATINUM 铂金版 
     * @return InstanceType 实例类型
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     * @param InstanceType 实例类型
BASIC 基础版
PRO  专业版
PLATINUM 铂金版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 主题数量 
     * @return TopicNum 主题数量
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set 主题数量
     * @param TopicNum 主题数量
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 实例最大主题数量 
     * @return TopicNumLimit 实例最大主题数量
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set 实例最大主题数量
     * @param TopicNumLimit 实例最大主题数量
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get TPS限流值 
     * @return TpsLimit TPS限流值
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS限流值
     * @param TpsLimit TPS限流值
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get 创建时间，秒为单位 
     * @return CreatedTime 创建时间，秒为单位
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，秒为单位
     * @param CreatedTime 创建时间，秒为单位
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 备注信息 
     * @return Remark 备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息
     * @param Remark 备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中 
     * @return InstanceStatus 实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中
     * @param InstanceStatus 实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例规格 
     * @return SkuCode 实例规格
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set 实例规格
     * @param SkuCode 实例规格
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get 单客户端最大订阅数 
     * @return MaxSubscriptionPerClient 单客户端最大订阅数
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set 单客户端最大订阅数
     * @param MaxSubscriptionPerClient 单客户端最大订阅数
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get 授权规则条数 
     * @return AuthorizationPolicyLimit 授权规则条数
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set 授权规则条数
     * @param AuthorizationPolicyLimit 授权规则条数
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get 客户端数量上限 
     * @return ClientNumLimit 客户端数量上限
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set 客户端数量上限
     * @param ClientNumLimit 客户端数量上限
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get 客户端证书注册方式：
JITP：自动注册
API：通过API手动注册 
     * @return DeviceCertificateProvisionType 客户端证书注册方式：
JITP：自动注册
API：通过API手动注册
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set 客户端证书注册方式：
JITP：自动注册
API：通过API手动注册
     * @param DeviceCertificateProvisionType 客户端证书注册方式：
JITP：自动注册
API：通过API手动注册
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get 自动注册设备证书时是否自动激活 
     * @return AutomaticActivation 自动注册设备证书时是否自动激活
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set 自动注册设备证书时是否自动激活
     * @param AutomaticActivation 自动注册设备证书时是否自动激活
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get 是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费 
     * @return RenewFlag 是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费
     * @param RenewFlag 是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 计费模式， POSTPAID，按量计费 PREPAID，包年包月 
     * @return PayMode 计费模式， POSTPAID，按量计费 PREPAID，包年包月
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式， POSTPAID，按量计费 PREPAID，包年包月
     * @param PayMode 计费模式， POSTPAID，按量计费 PREPAID，包年包月
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 到期时间，毫秒级时间戳 
     * @return ExpiryTime 到期时间，毫秒级时间戳
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set 到期时间，毫秒级时间戳
     * @param ExpiryTime 到期时间，毫秒级时间戳
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get 预销毁时间，毫秒级时间戳 
     * @return DestroyTime 预销毁时间，毫秒级时间戳
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 预销毁时间，毫秒级时间戳
     * @param DestroyTime 预销毁时间，毫秒级时间戳
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get TLS,单向认证    mTLS,双向认证    BYOC;一机一证 
     * @return X509Mode TLS,单向认证    mTLS,双向认证    BYOC;一机一证
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set TLS,单向认证    mTLS,双向认证    BYOC;一机一证
     * @param X509Mode TLS,单向认证    mTLS,双向认证    BYOC;一机一证
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get 最大Ca配额 
     * @return MaxCaNum 最大Ca配额
     */
    public Long getMaxCaNum() {
        return this.MaxCaNum;
    }

    /**
     * Set 最大Ca配额
     * @param MaxCaNum 最大Ca配额
     */
    public void setMaxCaNum(Long MaxCaNum) {
        this.MaxCaNum = MaxCaNum;
    }

    /**
     * Get 证书注册码 
     * @return RegistrationCode 证书注册码
     */
    public String getRegistrationCode() {
        return this.RegistrationCode;
    }

    /**
     * Set 证书注册码
     * @param RegistrationCode 证书注册码
     */
    public void setRegistrationCode(String RegistrationCode) {
        this.RegistrationCode = RegistrationCode;
    }

    /**
     * Get 集群最大订阅数 
     * @return MaxSubscription 集群最大订阅数
     */
    public Long getMaxSubscription() {
        return this.MaxSubscription;
    }

    /**
     * Set 集群最大订阅数
     * @param MaxSubscription 集群最大订阅数
     */
    public void setMaxSubscription(Long MaxSubscription) {
        this.MaxSubscription = MaxSubscription;
    }

    /**
     * Get 授权策略开关 
     * @return AuthorizationPolicy 授权策略开关
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set 授权策略开关
     * @param AuthorizationPolicy 授权策略开关
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get 共享订阅组数最大限制 
     * @return SharedSubscriptionGroupLimit 共享订阅组数最大限制
     */
    public Long getSharedSubscriptionGroupLimit() {
        return this.SharedSubscriptionGroupLimit;
    }

    /**
     * Set 共享订阅组数最大限制
     * @param SharedSubscriptionGroupLimit 共享订阅组数最大限制
     */
    public void setSharedSubscriptionGroupLimit(Long SharedSubscriptionGroupLimit) {
        this.SharedSubscriptionGroupLimit = SharedSubscriptionGroupLimit;
    }

    /**
     * Get 单个共享订阅组TopicFilter数限制 
     * @return MaxTopicFilterPerSharedSubscriptionGroup 单个共享订阅组TopicFilter数限制
     */
    public Long getMaxTopicFilterPerSharedSubscriptionGroup() {
        return this.MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Set 单个共享订阅组TopicFilter数限制
     * @param MaxTopicFilterPerSharedSubscriptionGroup 单个共享订阅组TopicFilter数限制
     */
    public void setMaxTopicFilterPerSharedSubscriptionGroup(Long MaxTopicFilterPerSharedSubscriptionGroup) {
        this.MaxTopicFilterPerSharedSubscriptionGroup = MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Get 自动订阅规则条数限制 
     * @return AutoSubscriptionPolicyLimit 自动订阅规则条数限制
     */
    public Long getAutoSubscriptionPolicyLimit() {
        return this.AutoSubscriptionPolicyLimit;
    }

    /**
     * Set 自动订阅规则条数限制
     * @param AutoSubscriptionPolicyLimit 自动订阅规则条数限制
     */
    public void setAutoSubscriptionPolicyLimit(Long AutoSubscriptionPolicyLimit) {
        this.AutoSubscriptionPolicyLimit = AutoSubscriptionPolicyLimit;
    }

    /**
     * Get 单条自动订阅规则TopicFilter数限制 
     * @return MaxTopicFilterPerAutoSubscriptionPolicy 单条自动订阅规则TopicFilter数限制
     */
    public Long getMaxTopicFilterPerAutoSubscriptionPolicy() {
        return this.MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Set 单条自动订阅规则TopicFilter数限制
     * @param MaxTopicFilterPerAutoSubscriptionPolicy 单条自动订阅规则TopicFilter数限制
     */
    public void setMaxTopicFilterPerAutoSubscriptionPolicy(Long MaxTopicFilterPerAutoSubscriptionPolicy) {
        this.MaxTopicFilterPerAutoSubscriptionPolicy = MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Get 是否使用默认的服务端证书 
     * @return UseDefaultServerCert 是否使用默认的服务端证书
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set 是否使用默认的服务端证书
     * @param UseDefaultServerCert 是否使用默认的服务端证书
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get 服务端CA最大数量 
     * @return TrustedCaLimit 服务端CA最大数量
     */
    public Long getTrustedCaLimit() {
        return this.TrustedCaLimit;
    }

    /**
     * Set 服务端CA最大数量
     * @param TrustedCaLimit 服务端CA最大数量
     */
    public void setTrustedCaLimit(Long TrustedCaLimit) {
        this.TrustedCaLimit = TrustedCaLimit;
    }

    /**
     * Get 服务端证书最大数量 
     * @return ServerCertLimit 服务端证书最大数量
     */
    public Long getServerCertLimit() {
        return this.ServerCertLimit;
    }

    /**
     * Set 服务端证书最大数量
     * @param ServerCertLimit 服务端证书最大数量
     */
    public void setServerCertLimit(Long ServerCertLimit) {
        this.ServerCertLimit = ServerCertLimit;
    }

    /**
     * Get topic前缀最大层级 
     * @return TopicPrefixSlashLimit topic前缀最大层级
     */
    public Long getTopicPrefixSlashLimit() {
        return this.TopicPrefixSlashLimit;
    }

    /**
     * Set topic前缀最大层级
     * @param TopicPrefixSlashLimit topic前缀最大层级
     */
    public void setTopicPrefixSlashLimit(Long TopicPrefixSlashLimit) {
        this.TopicPrefixSlashLimit = TopicPrefixSlashLimit;
    }

    /**
     * Get 单客户端发送消息限速，单位 条/秒 
     * @return MessageRate 单客户端发送消息限速，单位 条/秒
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set 单客户端发送消息限速，单位 条/秒
     * @param MessageRate 单客户端发送消息限速，单位 条/秒
     */
    public void setMessageRate(Long MessageRate) {
        this.MessageRate = MessageRate;
    }

    /**
     * Get 服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1 
     * @return TransportLayerSecurity 服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1
     */
    public String getTransportLayerSecurity() {
        return this.TransportLayerSecurity;
    }

    /**
     * Set 服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1
     * @param TransportLayerSecurity 服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1
     */
    public void setTransportLayerSecurity(String TransportLayerSecurity) {
        this.TransportLayerSecurity = TransportLayerSecurity;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceResponse(DescribeInstanceResponse source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.MaxSubscriptionPerClient != null) {
            this.MaxSubscriptionPerClient = new Long(source.MaxSubscriptionPerClient);
        }
        if (source.AuthorizationPolicyLimit != null) {
            this.AuthorizationPolicyLimit = new Long(source.AuthorizationPolicyLimit);
        }
        if (source.ClientNumLimit != null) {
            this.ClientNumLimit = new Long(source.ClientNumLimit);
        }
        if (source.DeviceCertificateProvisionType != null) {
            this.DeviceCertificateProvisionType = new String(source.DeviceCertificateProvisionType);
        }
        if (source.AutomaticActivation != null) {
            this.AutomaticActivation = new Boolean(source.AutomaticActivation);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new Long(source.DestroyTime);
        }
        if (source.X509Mode != null) {
            this.X509Mode = new String(source.X509Mode);
        }
        if (source.MaxCaNum != null) {
            this.MaxCaNum = new Long(source.MaxCaNum);
        }
        if (source.RegistrationCode != null) {
            this.RegistrationCode = new String(source.RegistrationCode);
        }
        if (source.MaxSubscription != null) {
            this.MaxSubscription = new Long(source.MaxSubscription);
        }
        if (source.AuthorizationPolicy != null) {
            this.AuthorizationPolicy = new Boolean(source.AuthorizationPolicy);
        }
        if (source.SharedSubscriptionGroupLimit != null) {
            this.SharedSubscriptionGroupLimit = new Long(source.SharedSubscriptionGroupLimit);
        }
        if (source.MaxTopicFilterPerSharedSubscriptionGroup != null) {
            this.MaxTopicFilterPerSharedSubscriptionGroup = new Long(source.MaxTopicFilterPerSharedSubscriptionGroup);
        }
        if (source.AutoSubscriptionPolicyLimit != null) {
            this.AutoSubscriptionPolicyLimit = new Long(source.AutoSubscriptionPolicyLimit);
        }
        if (source.MaxTopicFilterPerAutoSubscriptionPolicy != null) {
            this.MaxTopicFilterPerAutoSubscriptionPolicy = new Long(source.MaxTopicFilterPerAutoSubscriptionPolicy);
        }
        if (source.UseDefaultServerCert != null) {
            this.UseDefaultServerCert = new Boolean(source.UseDefaultServerCert);
        }
        if (source.TrustedCaLimit != null) {
            this.TrustedCaLimit = new Long(source.TrustedCaLimit);
        }
        if (source.ServerCertLimit != null) {
            this.ServerCertLimit = new Long(source.ServerCertLimit);
        }
        if (source.TopicPrefixSlashLimit != null) {
            this.TopicPrefixSlashLimit = new Long(source.TopicPrefixSlashLimit);
        }
        if (source.MessageRate != null) {
            this.MessageRate = new Long(source.MessageRate);
        }
        if (source.TransportLayerSecurity != null) {
            this.TransportLayerSecurity = new String(source.TransportLayerSecurity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "MaxSubscriptionPerClient", this.MaxSubscriptionPerClient);
        this.setParamSimple(map, prefix + "AuthorizationPolicyLimit", this.AuthorizationPolicyLimit);
        this.setParamSimple(map, prefix + "ClientNumLimit", this.ClientNumLimit);
        this.setParamSimple(map, prefix + "DeviceCertificateProvisionType", this.DeviceCertificateProvisionType);
        this.setParamSimple(map, prefix + "AutomaticActivation", this.AutomaticActivation);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "X509Mode", this.X509Mode);
        this.setParamSimple(map, prefix + "MaxCaNum", this.MaxCaNum);
        this.setParamSimple(map, prefix + "RegistrationCode", this.RegistrationCode);
        this.setParamSimple(map, prefix + "MaxSubscription", this.MaxSubscription);
        this.setParamSimple(map, prefix + "AuthorizationPolicy", this.AuthorizationPolicy);
        this.setParamSimple(map, prefix + "SharedSubscriptionGroupLimit", this.SharedSubscriptionGroupLimit);
        this.setParamSimple(map, prefix + "MaxTopicFilterPerSharedSubscriptionGroup", this.MaxTopicFilterPerSharedSubscriptionGroup);
        this.setParamSimple(map, prefix + "AutoSubscriptionPolicyLimit", this.AutoSubscriptionPolicyLimit);
        this.setParamSimple(map, prefix + "MaxTopicFilterPerAutoSubscriptionPolicy", this.MaxTopicFilterPerAutoSubscriptionPolicy);
        this.setParamSimple(map, prefix + "UseDefaultServerCert", this.UseDefaultServerCert);
        this.setParamSimple(map, prefix + "TrustedCaLimit", this.TrustedCaLimit);
        this.setParamSimple(map, prefix + "ServerCertLimit", this.ServerCertLimit);
        this.setParamSimple(map, prefix + "TopicPrefixSlashLimit", this.TopicPrefixSlashLimit);
        this.setParamSimple(map, prefix + "MessageRate", this.MessageRate);
        this.setParamSimple(map, prefix + "TransportLayerSecurity", this.TransportLayerSecurity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

