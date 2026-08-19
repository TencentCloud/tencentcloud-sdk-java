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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeDetailResponse extends AbstractModel {

    /**
    * <p>数据订阅的ID，形如subs-b6x64o31tm</p>
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * <p>数据订阅实例的名称</p>
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>订阅的云数据库实例ID，只有订阅云数据库该值才有意义</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error</p>
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * <p>修改时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>包年包月任务的到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>付费方式，可能值为：0-包年包月，1-按量计费</p>
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * <p>自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>任务所在地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Kafka topic</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>Kafka服务Broker地址</p>
    */
    @SerializedName("Broker")
    @Expose
    private String Broker;

    /**
    * <p>数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
    */
    @SerializedName("SubscribeMode")
    @Expose
    private String SubscribeMode;

    /**
    * <p>订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>订阅的数据库表信息</p>
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * <p>kafka配置信息</p>
    */
    @SerializedName("KafkaConfig")
    @Expose
    private SubscribeKafkaConfig KafkaConfig;

    /**
    * <p>订阅内置kafka的版本信息</p>
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>接入类型信息</p>
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * <p>mongo输出聚合设置</p>
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>订阅任务报错信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private SubsErr [] Errors;

    /**
    * <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。</p>
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * <p>数据订阅版本, 当前支持kafka和kafkaPro（专业版）</p>
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
    * <p>消费端地址所在vpc</p>
    */
    @SerializedName("ConsumerVpcId")
    @Expose
    private String ConsumerVpcId;

    /**
    * <p>消费端地址所在子网</p>
    */
    @SerializedName("ConsumerSubnetId")
    @Expose
    private String ConsumerSubnetId;

    /**
    * <p>订阅实例规格</p>
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>数据订阅的ID，形如subs-b6x64o31tm</p> 
     * @return SubscribeId <p>数据订阅的ID，形如subs-b6x64o31tm</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>数据订阅的ID，形如subs-b6x64o31tm</p>
     * @param SubscribeId <p>数据订阅的ID，形如subs-b6x64o31tm</p>
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get <p>数据订阅实例的名称</p> 
     * @return SubscribeName <p>数据订阅实例的名称</p>
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set <p>数据订阅实例的名称</p>
     * @param SubscribeName <p>数据订阅实例的名称</p>
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p> 
     * @return Product <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
     * @param Product <p>订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>订阅的云数据库实例ID，只有订阅云数据库该值才有意义</p> 
     * @return InstanceId <p>订阅的云数据库实例ID，只有订阅云数据库该值才有意义</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>订阅的云数据库实例ID，只有订阅云数据库该值才有意义</p>
     * @param InstanceId <p>订阅的云数据库实例ID，只有订阅云数据库该值才有意义</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline</p> 
     * @return InstanceStatus <p>订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline</p>
     * @param InstanceStatus <p>订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng</p> 
     * @return Status <p>订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng</p>
     * @param Status <p>订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error</p> 
     * @return SubsStatus <p>订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error</p>
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set <p>订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error</p>
     * @param SubsStatus <p>订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error</p>
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get <p>修改时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p> 
     * @return ModifyTime <p>修改时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     * @param ModifyTime <p>修改时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p> 
     * @return CreateTime <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     * @param CreateTime <p>创建时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p> 
     * @return IsolateTime <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     * @param IsolateTime <p>隔离时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>包年包月任务的到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p> 
     * @return ExpireTime <p>包年包月任务的到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>包年包月任务的到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     * @param ExpireTime <p>包年包月任务的到期时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p> 
     * @return OfflineTime <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     * @param OfflineTime <p>下线时间。当 <code>DateTimeISOFormat=true</code> 时返回 RFC 3339 格式（如 <code>2026-04-23T20:21:35+08:00</code>），否则返回 <code>Y-m-d h:m:s</code>（北京时间）。</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>付费方式，可能值为：0-包年包月，1-按量计费</p> 
     * @return PayType <p>付费方式，可能值为：0-包年包月，1-按量计费</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>付费方式，可能值为：0-包年包月，1-按量计费</p>
     * @param PayType <p>付费方式，可能值为：0-包年包月，1-按量计费</p>
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费</p> 
     * @return AutoRenewFlag <p>自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费</p>
     * @param AutoRenewFlag <p>自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>任务所在地域</p> 
     * @return Region <p>任务所在地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>任务所在地域</p>
     * @param Region <p>任务所在地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Kafka topic</p> 
     * @return Topic <p>Kafka topic</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>Kafka topic</p>
     * @param Topic <p>Kafka topic</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>Kafka服务Broker地址</p> 
     * @return Broker <p>Kafka服务Broker地址</p>
     */
    public String getBroker() {
        return this.Broker;
    }

    /**
     * Set <p>Kafka服务Broker地址</p>
     * @param Broker <p>Kafka服务Broker地址</p>
     */
    public void setBroker(String Broker) {
        this.Broker = Broker;
    }

    /**
     * Get <p>数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p> 
     * @return SubscribeMode <p>数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
     */
    public String getSubscribeMode() {
        return this.SubscribeMode;
    }

    /**
     * Set <p>数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
     * @param SubscribeMode <p>数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合</p>
     */
    public void setSubscribeMode(String SubscribeMode) {
        this.SubscribeMode = SubscribeMode;
    }

    /**
     * Get <p>订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档</p> 
     * @return Protocol <p>订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档</p>
     * @param Protocol <p>订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>订阅的数据库表信息</p> 
     * @return SubscribeObjects <p>订阅的数据库表信息</p>
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set <p>订阅的数据库表信息</p>
     * @param SubscribeObjects <p>订阅的数据库表信息</p>
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get <p>kafka配置信息</p> 
     * @return KafkaConfig <p>kafka配置信息</p>
     */
    public SubscribeKafkaConfig getKafkaConfig() {
        return this.KafkaConfig;
    }

    /**
     * Set <p>kafka配置信息</p>
     * @param KafkaConfig <p>kafka配置信息</p>
     */
    public void setKafkaConfig(SubscribeKafkaConfig KafkaConfig) {
        this.KafkaConfig = KafkaConfig;
    }

    /**
     * Get <p>订阅内置kafka的版本信息</p> 
     * @return KafkaVersion <p>订阅内置kafka的版本信息</p>
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>订阅内置kafka的版本信息</p>
     * @param KafkaVersion <p>订阅内置kafka的版本信息</p>
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p> 
     * @return AccessType <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
     * @param AccessType <p>源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>接入类型信息</p> 
     * @return Endpoints <p>接入类型信息</p>
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>接入类型信息</p>
     * @param Endpoints <p>接入类型信息</p>
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get <p>mongo输出聚合设置</p> 
     * @return PipelineInfo <p>mongo输出聚合设置</p>
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set <p>mongo输出聚合设置</p>
     * @param PipelineInfo <p>mongo输出聚合设置</p>
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>订阅任务报错信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors <p>订阅任务报错信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubsErr [] getErrors() {
        return this.Errors;
    }

    /**
     * Set <p>订阅任务报错信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors <p>订阅任务报错信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(SubsErr [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。</p> 
     * @return ExtraAttr <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。</p>
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。</p>
     * @param ExtraAttr <p>为业务添加的额外信息。参数名作key，参数值作value。<br>mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。<br>mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。</p>
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    /**
     * Get <p>数据订阅版本, 当前支持kafka和kafkaPro（专业版）</p> 
     * @return SubscribeVersion <p>数据订阅版本, 当前支持kafka和kafkaPro（专业版）</p>
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set <p>数据订阅版本, 当前支持kafka和kafkaPro（专业版）</p>
     * @param SubscribeVersion <p>数据订阅版本, 当前支持kafka和kafkaPro（专业版）</p>
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
    }

    /**
     * Get <p>消费端地址所在vpc</p> 
     * @return ConsumerVpcId <p>消费端地址所在vpc</p>
     */
    public String getConsumerVpcId() {
        return this.ConsumerVpcId;
    }

    /**
     * Set <p>消费端地址所在vpc</p>
     * @param ConsumerVpcId <p>消费端地址所在vpc</p>
     */
    public void setConsumerVpcId(String ConsumerVpcId) {
        this.ConsumerVpcId = ConsumerVpcId;
    }

    /**
     * Get <p>消费端地址所在子网</p> 
     * @return ConsumerSubnetId <p>消费端地址所在子网</p>
     */
    public String getConsumerSubnetId() {
        return this.ConsumerSubnetId;
    }

    /**
     * Set <p>消费端地址所在子网</p>
     * @param ConsumerSubnetId <p>消费端地址所在子网</p>
     */
    public void setConsumerSubnetId(String ConsumerSubnetId) {
        this.ConsumerSubnetId = ConsumerSubnetId;
    }

    /**
     * Get <p>订阅实例规格</p> 
     * @return InstanceClass <p>订阅实例规格</p>
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set <p>订阅实例规格</p>
     * @param InstanceClass <p>订阅实例规格</p>
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
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

    public DescribeSubscribeDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeDetailResponse(DescribeSubscribeDetailResponse source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubsStatus != null) {
            this.SubsStatus = new String(source.SubsStatus);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Broker != null) {
            this.Broker = new String(source.Broker);
        }
        if (source.SubscribeMode != null) {
            this.SubscribeMode = new String(source.SubscribeMode);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SubscribeObjects != null) {
            this.SubscribeObjects = new SubscribeObject[source.SubscribeObjects.length];
            for (int i = 0; i < source.SubscribeObjects.length; i++) {
                this.SubscribeObjects[i] = new SubscribeObject(source.SubscribeObjects[i]);
            }
        }
        if (source.KafkaConfig != null) {
            this.KafkaConfig = new SubscribeKafkaConfig(source.KafkaConfig);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointItem[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointItem(source.Endpoints[i]);
            }
        }
        if (source.PipelineInfo != null) {
            this.PipelineInfo = new PipelineInfo[source.PipelineInfo.length];
            for (int i = 0; i < source.PipelineInfo.length; i++) {
                this.PipelineInfo[i] = new PipelineInfo(source.PipelineInfo[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.Errors != null) {
            this.Errors = new SubsErr[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SubsErr(source.Errors[i]);
            }
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
        }
        if (source.ConsumerVpcId != null) {
            this.ConsumerVpcId = new String(source.ConsumerVpcId);
        }
        if (source.ConsumerSubnetId != null) {
            this.ConsumerSubnetId = new String(source.ConsumerSubnetId);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubsStatus", this.SubsStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Broker", this.Broker);
        this.setParamSimple(map, prefix + "SubscribeMode", this.SubscribeMode);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "SubscribeObjects.", this.SubscribeObjects);
        this.setParamObj(map, prefix + "KafkaConfig.", this.KafkaConfig);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);
        this.setParamSimple(map, prefix + "ConsumerVpcId", this.ConsumerVpcId);
        this.setParamSimple(map, prefix + "ConsumerSubnetId", this.ConsumerSubnetId);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

