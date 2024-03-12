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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeDetailResponse extends AbstractModel {

    /**
    * 数据订阅的ID，形如subs-b6x64o31tm
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 数据订阅实例的名称
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 订阅的云数据库实例ID，只有订阅云数据库该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * 修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 付费方式，可能值为：0-包年包月，1-按量计费
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 任务所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Kafka服务Broker地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Broker")
    @Expose
    private String Broker;

    /**
    * 数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscribeMode")
    @Expose
    private String SubscribeMode;

    /**
    * 订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 订阅的数据库表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * kafka配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KafkaConfig")
    @Expose
    private SubscribeKafkaConfig KafkaConfig;

    /**
    * 源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 接入类型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * mongo输出聚合设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PipelineInfo")
    @Expose
    private PipelineInfo [] PipelineInfo;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 订阅任务报错信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private SubsErr [] Errors;

    /**
    * 为业务添加的额外信息。参数名作key，参数值作value。
mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。
mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据订阅的ID，形如subs-b6x64o31tm 
     * @return SubscribeId 数据订阅的ID，形如subs-b6x64o31tm
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅的ID，形如subs-b6x64o31tm
     * @param SubscribeId 数据订阅的ID，形如subs-b6x64o31tm
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 数据订阅实例的名称 
     * @return SubscribeName 数据订阅实例的名称
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set 数据订阅实例的名称
     * @param SubscribeName 数据订阅实例的名称
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版) 
     * @return Product 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
     * @param Product 订阅的数据库类型，目前支持 cynosdbmysql(tdsql-c mysql版),mariadb,mongodb,mysql,percona,tdpg(tdsql postgresql版),tdsqlpercona(tdsql mysql版)
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 订阅的云数据库实例ID，只有订阅云数据库该值才有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 订阅的云数据库实例ID，只有订阅云数据库该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 订阅的云数据库实例ID，只有订阅云数据库该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 订阅的云数据库实例ID，只有订阅云数据库该值才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 订阅的云数据库实例状态，只有订阅云数据库该值才有意义。可能值为：running, isolated, offline
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng 
     * @return Status 订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng
     * @param Status 订阅任务计费状态，可能值为：正常normal, 隔离中isolating, 已隔离isolated, 下线中offlining, 按量转包年包月中 post2PrePayIng
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error 
     * @return SubsStatus 订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set 订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error
     * @param SubsStatus 订阅任务状态，可能值为：未启动notStarted, 校验中checking, 校验不通过checkNotPass, 校验通过checkPass, 启动中starting, 运行中running, 异常出错error
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get 修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineTime 下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineTime 下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 付费方式，可能值为：0-包年包月，1-按量计费 
     * @return PayType 付费方式，可能值为：0-包年包月，1-按量计费
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费方式，可能值为：0-包年包月，1-按量计费
     * @param PayType 付费方式，可能值为：0-包年包月，1-按量计费
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费 
     * @return AutoRenewFlag 自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费
     * @param AutoRenewFlag 自动续费标识。只有当 PayType=0，该值才有意义。枚举值：0-不自动续费，1-自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 任务所在地域 
     * @return Region 任务所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 任务所在地域
     * @param Region 任务所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Kafka topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic Kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Kafka服务Broker地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Broker Kafka服务Broker地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBroker() {
        return this.Broker;
    }

    /**
     * Set Kafka服务Broker地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Broker Kafka服务Broker地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBroker(String Broker) {
        this.Broker = Broker;
    }

    /**
     * Get 数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscribeMode 数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscribeMode() {
        return this.SubscribeMode;
    }

    /**
     * Set 数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscribeMode 数据订阅的类型，当 Product 不为 mongodb 时，可能值为：all-全实例更新；dml-数据更新；ddl-结构更新；dmlAndDdl-数据更新+结构更新。当 Product 为 mongodb 时，可能值为 all-全实例更新；database-订阅单库；collection-订阅单集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscribeMode(String SubscribeMode) {
        this.SubscribeMode = SubscribeMode;
    }

    /**
     * Get 订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 订阅数据格式。如果为空则用的默认格式: mysql\cynosdbmysql\mariadb\percona\tdsqlpercona\tdpg是protobuf，mongo是json。当 DatabaseType 为 mysql和cynosdbmysql 时有三种可选协议：protobuf\avro\json。数据格式详情参考官网的消费demo文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 订阅的数据库表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscribeObjects 订阅的数据库表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set 订阅的数据库表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscribeObjects 订阅的数据库表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get kafka配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KafkaConfig kafka配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubscribeKafkaConfig getKafkaConfig() {
        return this.KafkaConfig;
    }

    /**
     * Set kafka配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KafkaConfig kafka配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKafkaConfig(SubscribeKafkaConfig KafkaConfig) {
        this.KafkaConfig = KafkaConfig;
    }

    /**
     * Get 源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 源数据库接入类型，如：extranet(公网)、vpncloud(vpn接入)、dcg(专线接入)、ccn(云联网)、cdb(云数据库)、cvm(云服务器自建)、intranet(自研上云)、vpc(私有网络vpc)。注意具体可选值依赖当前链路支持能力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 接入类型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoints 接入类型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set 接入类型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoints 接入类型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get mongo输出聚合设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PipelineInfo mongo输出聚合设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PipelineInfo [] getPipelineInfo() {
        return this.PipelineInfo;
    }

    /**
     * Set mongo输出聚合设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PipelineInfo mongo输出聚合设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPipelineInfo(PipelineInfo [] PipelineInfo) {
        this.PipelineInfo = PipelineInfo;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 订阅任务报错信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors 订阅任务报错信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubsErr [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 订阅任务报错信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors 订阅任务报错信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(SubsErr [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get 为业务添加的额外信息。参数名作key，参数值作value。
mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。
mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraAttr 为业务添加的额外信息。参数名作key，参数值作value。
mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。
mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set 为业务添加的额外信息。参数名作key，参数值作value。
mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。
mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraAttr 为业务添加的额外信息。参数名作key，参数值作value。
mysql选填参数：ProcessXA-是否处理XA事务，为true处理，其他不处理。
mongo选填参数：SubscribeType-订阅类型，目前只支持changeStream。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
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
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamArrayObj(map, prefix + "PipelineInfo.", this.PipelineInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

