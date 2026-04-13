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
    * <p>实例类型<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>主题数量</p>
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * <p>实例最大主题数量</p>
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * <p>TPS限流值</p>
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * <p>创建时间，秒为单位</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>实例规格</p>
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * <p>单客户端最大订阅数</p>
    */
    @SerializedName("MaxSubscriptionPerClient")
    @Expose
    private Long MaxSubscriptionPerClient;

    /**
    * <p>授权规则条数</p>
    */
    @SerializedName("AuthorizationPolicyLimit")
    @Expose
    private Long AuthorizationPolicyLimit;

    /**
    * <p>客户端数量上限</p>
    */
    @SerializedName("ClientNumLimit")
    @Expose
    private Long ClientNumLimit;

    /**
    * <p>客户端证书注册方式：<br>JITP：自动注册<br>API：通过API手动注册</p>
    */
    @SerializedName("DeviceCertificateProvisionType")
    @Expose
    private String DeviceCertificateProvisionType;

    /**
    * <p>自动注册设备证书时是否自动激活</p>
    */
    @SerializedName("AutomaticActivation")
    @Expose
    private Boolean AutomaticActivation;

    /**
    * <p>是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>计费模式， POSTPAID，按量计费 PREPAID，包年包月</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>到期时间，毫秒级时间戳</p>
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * <p>预销毁时间，毫秒级时间戳</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private Long DestroyTime;

    /**
    * <p>TLS,单向认证    mTLS,双向认证    BYOC;一机一证</p>
    */
    @SerializedName("X509Mode")
    @Expose
    private String X509Mode;

    /**
    * <p>最大Ca配额</p>
    */
    @SerializedName("MaxCaNum")
    @Expose
    private Long MaxCaNum;

    /**
    * <p>证书注册码</p>
    */
    @SerializedName("RegistrationCode")
    @Expose
    private String RegistrationCode;

    /**
    * <p>集群最大订阅数</p>
    */
    @SerializedName("MaxSubscription")
    @Expose
    private Long MaxSubscription;

    /**
    * <p>授权策略开关</p>
    */
    @SerializedName("AuthorizationPolicy")
    @Expose
    private Boolean AuthorizationPolicy;

    /**
    * <p>共享订阅组数最大限制</p>
    */
    @SerializedName("SharedSubscriptionGroupLimit")
    @Expose
    private Long SharedSubscriptionGroupLimit;

    /**
    * <p>单个共享订阅组TopicFilter数限制</p>
    */
    @SerializedName("MaxTopicFilterPerSharedSubscriptionGroup")
    @Expose
    private Long MaxTopicFilterPerSharedSubscriptionGroup;

    /**
    * <p>自动订阅规则条数限制</p>
    */
    @SerializedName("AutoSubscriptionPolicyLimit")
    @Expose
    private Long AutoSubscriptionPolicyLimit;

    /**
    * <p>单条自动订阅规则TopicFilter数限制</p>
    */
    @SerializedName("MaxTopicFilterPerAutoSubscriptionPolicy")
    @Expose
    private Long MaxTopicFilterPerAutoSubscriptionPolicy;

    /**
    * <p>是否使用默认的服务端证书</p>
    */
    @SerializedName("UseDefaultServerCert")
    @Expose
    private Boolean UseDefaultServerCert;

    /**
    * <p>服务端CA最大数量</p>
    */
    @SerializedName("TrustedCaLimit")
    @Expose
    private Long TrustedCaLimit;

    /**
    * <p>服务端证书最大数量</p>
    */
    @SerializedName("ServerCertLimit")
    @Expose
    private Long ServerCertLimit;

    /**
    * <p>topic前缀最大层级</p>
    */
    @SerializedName("TopicPrefixSlashLimit")
    @Expose
    private Long TopicPrefixSlashLimit;

    /**
    * <p>单客户端发送消息限速，单位 条/秒</p>
    */
    @SerializedName("MessageRate")
    @Expose
    private Long MessageRate;

    /**
    * <p>服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
    */
    @SerializedName("TransportLayerSecurity")
    @Expose
    private String TransportLayerSecurity;

    /**
    * <p>消息属性增强规则配额</p>
    */
    @SerializedName("MessageEnrichmentRuleLimit")
    @Expose
    private Long MessageEnrichmentRuleLimit;

    /**
    * <p>封禁规则最大数量</p>
    */
    @SerializedName("BlockRuleLimit")
    @Expose
    private Long BlockRuleLimit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例类型<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p> 
     * @return InstanceType <p>实例类型<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
     * @param InstanceType <p>实例类型<br>BASIC 基础版<br>PRO  专业版<br>PLATINUM 铂金版</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>主题数量</p> 
     * @return TopicNum <p>主题数量</p>
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set <p>主题数量</p>
     * @param TopicNum <p>主题数量</p>
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get <p>实例最大主题数量</p> 
     * @return TopicNumLimit <p>实例最大主题数量</p>
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set <p>实例最大主题数量</p>
     * @param TopicNumLimit <p>实例最大主题数量</p>
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get <p>TPS限流值</p> 
     * @return TpsLimit <p>TPS限流值</p>
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set <p>TPS限流值</p>
     * @param TpsLimit <p>TPS限流值</p>
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get <p>创建时间，秒为单位</p> 
     * @return CreatedTime <p>创建时间，秒为单位</p>
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间，秒为单位</p>
     * @param CreatedTime <p>创建时间，秒为单位</p>
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中</p> 
     * @return InstanceStatus <p>实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中</p>
     * @param InstanceStatus <p>实例状态， RUNNING, 运行中 MAINTAINING，维护中 ABNORMAL，异常 OVERDUE，欠费 DESTROYED，已删除 CREATING，创建中 MODIFYING，变配中 CREATE_FAILURE，创建失败 MODIFY_FAILURE，变配失败 DELETING，删除中</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>实例规格</p> 
     * @return SkuCode <p>实例规格</p>
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set <p>实例规格</p>
     * @param SkuCode <p>实例规格</p>
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get <p>单客户端最大订阅数</p> 
     * @return MaxSubscriptionPerClient <p>单客户端最大订阅数</p>
     */
    public Long getMaxSubscriptionPerClient() {
        return this.MaxSubscriptionPerClient;
    }

    /**
     * Set <p>单客户端最大订阅数</p>
     * @param MaxSubscriptionPerClient <p>单客户端最大订阅数</p>
     */
    public void setMaxSubscriptionPerClient(Long MaxSubscriptionPerClient) {
        this.MaxSubscriptionPerClient = MaxSubscriptionPerClient;
    }

    /**
     * Get <p>授权规则条数</p> 
     * @return AuthorizationPolicyLimit <p>授权规则条数</p>
     */
    public Long getAuthorizationPolicyLimit() {
        return this.AuthorizationPolicyLimit;
    }

    /**
     * Set <p>授权规则条数</p>
     * @param AuthorizationPolicyLimit <p>授权规则条数</p>
     */
    public void setAuthorizationPolicyLimit(Long AuthorizationPolicyLimit) {
        this.AuthorizationPolicyLimit = AuthorizationPolicyLimit;
    }

    /**
     * Get <p>客户端数量上限</p> 
     * @return ClientNumLimit <p>客户端数量上限</p>
     */
    public Long getClientNumLimit() {
        return this.ClientNumLimit;
    }

    /**
     * Set <p>客户端数量上限</p>
     * @param ClientNumLimit <p>客户端数量上限</p>
     */
    public void setClientNumLimit(Long ClientNumLimit) {
        this.ClientNumLimit = ClientNumLimit;
    }

    /**
     * Get <p>客户端证书注册方式：<br>JITP：自动注册<br>API：通过API手动注册</p> 
     * @return DeviceCertificateProvisionType <p>客户端证书注册方式：<br>JITP：自动注册<br>API：通过API手动注册</p>
     */
    public String getDeviceCertificateProvisionType() {
        return this.DeviceCertificateProvisionType;
    }

    /**
     * Set <p>客户端证书注册方式：<br>JITP：自动注册<br>API：通过API手动注册</p>
     * @param DeviceCertificateProvisionType <p>客户端证书注册方式：<br>JITP：自动注册<br>API：通过API手动注册</p>
     */
    public void setDeviceCertificateProvisionType(String DeviceCertificateProvisionType) {
        this.DeviceCertificateProvisionType = DeviceCertificateProvisionType;
    }

    /**
     * Get <p>自动注册设备证书时是否自动激活</p> 
     * @return AutomaticActivation <p>自动注册设备证书时是否自动激活</p>
     */
    public Boolean getAutomaticActivation() {
        return this.AutomaticActivation;
    }

    /**
     * Set <p>自动注册设备证书时是否自动激活</p>
     * @param AutomaticActivation <p>自动注册设备证书时是否自动激活</p>
     */
    public void setAutomaticActivation(Boolean AutomaticActivation) {
        this.AutomaticActivation = AutomaticActivation;
    }

    /**
     * Get <p>是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费</p> 
     * @return RenewFlag <p>是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费</p>
     * @param RenewFlag <p>是否自动续费。仅包年包月集群生效。 1:自动续费 0:非自动续费</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>计费模式， POSTPAID，按量计费 PREPAID，包年包月</p> 
     * @return PayMode <p>计费模式， POSTPAID，按量计费 PREPAID，包年包月</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式， POSTPAID，按量计费 PREPAID，包年包月</p>
     * @param PayMode <p>计费模式， POSTPAID，按量计费 PREPAID，包年包月</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>到期时间，毫秒级时间戳</p> 
     * @return ExpiryTime <p>到期时间，毫秒级时间戳</p>
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set <p>到期时间，毫秒级时间戳</p>
     * @param ExpiryTime <p>到期时间，毫秒级时间戳</p>
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get <p>预销毁时间，毫秒级时间戳</p> 
     * @return DestroyTime <p>预销毁时间，毫秒级时间戳</p>
     */
    public Long getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set <p>预销毁时间，毫秒级时间戳</p>
     * @param DestroyTime <p>预销毁时间，毫秒级时间戳</p>
     */
    public void setDestroyTime(Long DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get <p>TLS,单向认证    mTLS,双向认证    BYOC;一机一证</p> 
     * @return X509Mode <p>TLS,单向认证    mTLS,双向认证    BYOC;一机一证</p>
     */
    public String getX509Mode() {
        return this.X509Mode;
    }

    /**
     * Set <p>TLS,单向认证    mTLS,双向认证    BYOC;一机一证</p>
     * @param X509Mode <p>TLS,单向认证    mTLS,双向认证    BYOC;一机一证</p>
     */
    public void setX509Mode(String X509Mode) {
        this.X509Mode = X509Mode;
    }

    /**
     * Get <p>最大Ca配额</p> 
     * @return MaxCaNum <p>最大Ca配额</p>
     */
    public Long getMaxCaNum() {
        return this.MaxCaNum;
    }

    /**
     * Set <p>最大Ca配额</p>
     * @param MaxCaNum <p>最大Ca配额</p>
     */
    public void setMaxCaNum(Long MaxCaNum) {
        this.MaxCaNum = MaxCaNum;
    }

    /**
     * Get <p>证书注册码</p> 
     * @return RegistrationCode <p>证书注册码</p>
     */
    public String getRegistrationCode() {
        return this.RegistrationCode;
    }

    /**
     * Set <p>证书注册码</p>
     * @param RegistrationCode <p>证书注册码</p>
     */
    public void setRegistrationCode(String RegistrationCode) {
        this.RegistrationCode = RegistrationCode;
    }

    /**
     * Get <p>集群最大订阅数</p> 
     * @return MaxSubscription <p>集群最大订阅数</p>
     */
    public Long getMaxSubscription() {
        return this.MaxSubscription;
    }

    /**
     * Set <p>集群最大订阅数</p>
     * @param MaxSubscription <p>集群最大订阅数</p>
     */
    public void setMaxSubscription(Long MaxSubscription) {
        this.MaxSubscription = MaxSubscription;
    }

    /**
     * Get <p>授权策略开关</p> 
     * @return AuthorizationPolicy <p>授权策略开关</p>
     */
    public Boolean getAuthorizationPolicy() {
        return this.AuthorizationPolicy;
    }

    /**
     * Set <p>授权策略开关</p>
     * @param AuthorizationPolicy <p>授权策略开关</p>
     */
    public void setAuthorizationPolicy(Boolean AuthorizationPolicy) {
        this.AuthorizationPolicy = AuthorizationPolicy;
    }

    /**
     * Get <p>共享订阅组数最大限制</p> 
     * @return SharedSubscriptionGroupLimit <p>共享订阅组数最大限制</p>
     */
    public Long getSharedSubscriptionGroupLimit() {
        return this.SharedSubscriptionGroupLimit;
    }

    /**
     * Set <p>共享订阅组数最大限制</p>
     * @param SharedSubscriptionGroupLimit <p>共享订阅组数最大限制</p>
     */
    public void setSharedSubscriptionGroupLimit(Long SharedSubscriptionGroupLimit) {
        this.SharedSubscriptionGroupLimit = SharedSubscriptionGroupLimit;
    }

    /**
     * Get <p>单个共享订阅组TopicFilter数限制</p> 
     * @return MaxTopicFilterPerSharedSubscriptionGroup <p>单个共享订阅组TopicFilter数限制</p>
     * @deprecated
     */
    @Deprecated
    public Long getMaxTopicFilterPerSharedSubscriptionGroup() {
        return this.MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Set <p>单个共享订阅组TopicFilter数限制</p>
     * @param MaxTopicFilterPerSharedSubscriptionGroup <p>单个共享订阅组TopicFilter数限制</p>
     * @deprecated
     */
    @Deprecated
    public void setMaxTopicFilterPerSharedSubscriptionGroup(Long MaxTopicFilterPerSharedSubscriptionGroup) {
        this.MaxTopicFilterPerSharedSubscriptionGroup = MaxTopicFilterPerSharedSubscriptionGroup;
    }

    /**
     * Get <p>自动订阅规则条数限制</p> 
     * @return AutoSubscriptionPolicyLimit <p>自动订阅规则条数限制</p>
     */
    public Long getAutoSubscriptionPolicyLimit() {
        return this.AutoSubscriptionPolicyLimit;
    }

    /**
     * Set <p>自动订阅规则条数限制</p>
     * @param AutoSubscriptionPolicyLimit <p>自动订阅规则条数限制</p>
     */
    public void setAutoSubscriptionPolicyLimit(Long AutoSubscriptionPolicyLimit) {
        this.AutoSubscriptionPolicyLimit = AutoSubscriptionPolicyLimit;
    }

    /**
     * Get <p>单条自动订阅规则TopicFilter数限制</p> 
     * @return MaxTopicFilterPerAutoSubscriptionPolicy <p>单条自动订阅规则TopicFilter数限制</p>
     */
    public Long getMaxTopicFilterPerAutoSubscriptionPolicy() {
        return this.MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Set <p>单条自动订阅规则TopicFilter数限制</p>
     * @param MaxTopicFilterPerAutoSubscriptionPolicy <p>单条自动订阅规则TopicFilter数限制</p>
     */
    public void setMaxTopicFilterPerAutoSubscriptionPolicy(Long MaxTopicFilterPerAutoSubscriptionPolicy) {
        this.MaxTopicFilterPerAutoSubscriptionPolicy = MaxTopicFilterPerAutoSubscriptionPolicy;
    }

    /**
     * Get <p>是否使用默认的服务端证书</p> 
     * @return UseDefaultServerCert <p>是否使用默认的服务端证书</p>
     */
    public Boolean getUseDefaultServerCert() {
        return this.UseDefaultServerCert;
    }

    /**
     * Set <p>是否使用默认的服务端证书</p>
     * @param UseDefaultServerCert <p>是否使用默认的服务端证书</p>
     */
    public void setUseDefaultServerCert(Boolean UseDefaultServerCert) {
        this.UseDefaultServerCert = UseDefaultServerCert;
    }

    /**
     * Get <p>服务端CA最大数量</p> 
     * @return TrustedCaLimit <p>服务端CA最大数量</p>
     */
    public Long getTrustedCaLimit() {
        return this.TrustedCaLimit;
    }

    /**
     * Set <p>服务端CA最大数量</p>
     * @param TrustedCaLimit <p>服务端CA最大数量</p>
     */
    public void setTrustedCaLimit(Long TrustedCaLimit) {
        this.TrustedCaLimit = TrustedCaLimit;
    }

    /**
     * Get <p>服务端证书最大数量</p> 
     * @return ServerCertLimit <p>服务端证书最大数量</p>
     */
    public Long getServerCertLimit() {
        return this.ServerCertLimit;
    }

    /**
     * Set <p>服务端证书最大数量</p>
     * @param ServerCertLimit <p>服务端证书最大数量</p>
     */
    public void setServerCertLimit(Long ServerCertLimit) {
        this.ServerCertLimit = ServerCertLimit;
    }

    /**
     * Get <p>topic前缀最大层级</p> 
     * @return TopicPrefixSlashLimit <p>topic前缀最大层级</p>
     */
    public Long getTopicPrefixSlashLimit() {
        return this.TopicPrefixSlashLimit;
    }

    /**
     * Set <p>topic前缀最大层级</p>
     * @param TopicPrefixSlashLimit <p>topic前缀最大层级</p>
     */
    public void setTopicPrefixSlashLimit(Long TopicPrefixSlashLimit) {
        this.TopicPrefixSlashLimit = TopicPrefixSlashLimit;
    }

    /**
     * Get <p>单客户端发送消息限速，单位 条/秒</p> 
     * @return MessageRate <p>单客户端发送消息限速，单位 条/秒</p>
     */
    public Long getMessageRate() {
        return this.MessageRate;
    }

    /**
     * Set <p>单客户端发送消息限速，单位 条/秒</p>
     * @param MessageRate <p>单客户端发送消息限速，单位 条/秒</p>
     */
    public void setMessageRate(Long MessageRate) {
        this.MessageRate = MessageRate;
    }

    /**
     * Get <p>服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p> 
     * @return TransportLayerSecurity <p>服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
     */
    public String getTransportLayerSecurity() {
        return this.TransportLayerSecurity;
    }

    /**
     * Set <p>服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
     * @param TransportLayerSecurity <p>服务端tls支持的协议，使用“,”分割。例如：TLSv1.3,TLSv1.2,TLSv1.1,TLSv1</p>
     */
    public void setTransportLayerSecurity(String TransportLayerSecurity) {
        this.TransportLayerSecurity = TransportLayerSecurity;
    }

    /**
     * Get <p>消息属性增强规则配额</p> 
     * @return MessageEnrichmentRuleLimit <p>消息属性增强规则配额</p>
     */
    public Long getMessageEnrichmentRuleLimit() {
        return this.MessageEnrichmentRuleLimit;
    }

    /**
     * Set <p>消息属性增强规则配额</p>
     * @param MessageEnrichmentRuleLimit <p>消息属性增强规则配额</p>
     */
    public void setMessageEnrichmentRuleLimit(Long MessageEnrichmentRuleLimit) {
        this.MessageEnrichmentRuleLimit = MessageEnrichmentRuleLimit;
    }

    /**
     * Get <p>封禁规则最大数量</p> 
     * @return BlockRuleLimit <p>封禁规则最大数量</p>
     */
    public Long getBlockRuleLimit() {
        return this.BlockRuleLimit;
    }

    /**
     * Set <p>封禁规则最大数量</p>
     * @param BlockRuleLimit <p>封禁规则最大数量</p>
     */
    public void setBlockRuleLimit(Long BlockRuleLimit) {
        this.BlockRuleLimit = BlockRuleLimit;
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
        if (source.MessageEnrichmentRuleLimit != null) {
            this.MessageEnrichmentRuleLimit = new Long(source.MessageEnrichmentRuleLimit);
        }
        if (source.BlockRuleLimit != null) {
            this.BlockRuleLimit = new Long(source.BlockRuleLimit);
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
        this.setParamSimple(map, prefix + "MessageEnrichmentRuleLimit", this.MessageEnrichmentRuleLimit);
        this.setParamSimple(map, prefix + "BlockRuleLimit", this.BlockRuleLimit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

