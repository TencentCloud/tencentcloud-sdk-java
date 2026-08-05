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

public class SubscribeInfo extends AbstractModel {

    /**
    * <p>数据订阅的实例ID</p>
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
    * <p>订阅实例发送数据的kafka topic</p>
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * <p>订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * <p>上次修改时间，时间格式如：Y-m-d h:m:s</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>创建时间，时间格式如：Y-m-d h:m:s</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>计费方式，0 - 包年包月，1 - 按量计费</p>
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
    * <p>数据订阅实例所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)</p>
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * <p>数据库节点信息</p>
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * <p>数据订阅版本, 当前支持kafka和kafkaPro（专业版）</p>
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * <p>任务报错信息，如果有的话。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private SubsErr [] Errors;

    /**
    * <p>订阅实例规格</p>
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * <p>新版订阅消费端路由阶段</p>
    */
    @SerializedName("ConsumerRoutePhase")
    @Expose
    private String ConsumerRoutePhase;

    /**
     * Get <p>数据订阅的实例ID</p> 
     * @return SubscribeId <p>数据订阅的实例ID</p>
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set <p>数据订阅的实例ID</p>
     * @param SubscribeId <p>数据订阅的实例ID</p>
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
     * Get <p>订阅实例发送数据的kafka topic</p> 
     * @return Topic <p>订阅实例发送数据的kafka topic</p>
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set <p>订阅实例发送数据的kafka topic</p>
     * @param Topic <p>订阅实例发送数据的kafka topic</p>
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get <p>订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p> 
     * @return Product <p>订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
     * @param Product <p>订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。</p> 
     * @return InstanceId <p>订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。</p>
     * @param InstanceId <p>订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空</p> 
     * @return InstanceStatus <p>云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空</p>
     * @param InstanceStatus <p>云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng</p> 
     * @return Status <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng</p>
     * @param Status <p>数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p> 
     * @return SubsStatus <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
     * @param SubsStatus <p>数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error</p>
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get <p>上次修改时间，时间格式如：Y-m-d h:m:s</p> 
     * @return ModifyTime <p>上次修改时间，时间格式如：Y-m-d h:m:s</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>上次修改时间，时间格式如：Y-m-d h:m:s</p>
     * @param ModifyTime <p>上次修改时间，时间格式如：Y-m-d h:m:s</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间，时间格式如：Y-m-d h:m:s</p> 
     * @return CreateTime <p>创建时间，时间格式如：Y-m-d h:m:s</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，时间格式如：Y-m-d h:m:s</p>
     * @param CreateTime <p>创建时间，时间格式如：Y-m-d h:m:s</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p> 
     * @return IsolateTime <p>隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     * @param IsolateTime <p>隔离时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p> 
     * @return ExpireTime <p>包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     * @param ExpireTime <p>包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p> 
     * @return OfflineTime <p>下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     * @param OfflineTime <p>下线时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>计费方式，0 - 包年包月，1 - 按量计费</p> 
     * @return PayType <p>计费方式，0 - 包年包月，1 - 按量计费</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>计费方式，0 - 包年包月，1 - 按量计费</p>
     * @param PayType <p>计费方式，0 - 包年包月，1 - 按量计费</p>
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
     * Get <p>数据订阅实例所属地域</p> 
     * @return Region <p>数据订阅实例所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>数据订阅实例所属地域</p>
     * @param Region <p>数据订阅实例所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)</p> 
     * @return AccessType <p>接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)</p>
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)</p>
     * @param AccessType <p>接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)</p>
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>数据库节点信息</p> 
     * @return Endpoints <p>数据库节点信息</p>
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>数据库节点信息</p>
     * @param Endpoints <p>数据库节点信息</p>
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
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
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>任务报错信息，如果有的话。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors <p>任务报错信息，如果有的话。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubsErr [] getErrors() {
        return this.Errors;
    }

    /**
     * Set <p>任务报错信息，如果有的话。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors <p>任务报错信息，如果有的话。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(SubsErr [] Errors) {
        this.Errors = Errors;
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
     * Get <p>新版订阅消费端路由阶段</p> 
     * @return ConsumerRoutePhase <p>新版订阅消费端路由阶段</p>
     */
    public String getConsumerRoutePhase() {
        return this.ConsumerRoutePhase;
    }

    /**
     * Set <p>新版订阅消费端路由阶段</p>
     * @param ConsumerRoutePhase <p>新版订阅消费端路由阶段</p>
     */
    public void setConsumerRoutePhase(String ConsumerRoutePhase) {
        this.ConsumerRoutePhase = ConsumerRoutePhase;
    }

    public SubscribeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscribeInfo(SubscribeInfo source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
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
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EndpointItem[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EndpointItem(source.Endpoints[i]);
            }
        }
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
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
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.ConsumerRoutePhase != null) {
            this.ConsumerRoutePhase = new String(source.ConsumerRoutePhase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
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
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "ConsumerRoutePhase", this.ConsumerRoutePhase);

    }
}

