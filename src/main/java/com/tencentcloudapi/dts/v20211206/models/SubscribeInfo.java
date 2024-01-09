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

public class SubscribeInfo extends AbstractModel {

    /**
    * 数据订阅的实例ID
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
    * 订阅实例发送数据的kafka topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * 上次修改时间，时间格式如：Y-m-d h:m:s
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
    * 计费方式，0 - 包年包月，1 - 按量计费
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
    * 数据订阅实例所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 数据库节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoints")
    @Expose
    private EndpointItem [] Endpoints;

    /**
    * 数据订阅版本, 当前只支持 kafka 版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 任务报错信息，如果有的话。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Errors")
    @Expose
    private SubsErr [] Errors;

    /**
     * Get 数据订阅的实例ID 
     * @return SubscribeId 数据订阅的实例ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅的实例ID
     * @param SubscribeId 数据订阅的实例ID
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
     * Get 订阅实例发送数据的kafka topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Topic 订阅实例发送数据的kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 订阅实例发送数据的kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param Topic 订阅实例发送数据的kafka topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql) 
     * @return Product 订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
     * @param Product 订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 订阅的数据库实例ID（如果订阅的是云数据库）如果实例不是腾讯云上的，此值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng 
     * @return Status 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng
     * @param Status 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error 
     * @return SubsStatus 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
     * @param SubsStatus 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get 上次修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 上次修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 上次修改时间，时间格式如：Y-m-d h:m:s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 上次修改时间，时间格式如：Y-m-d h:m:s
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
     * Get 计费方式，0 - 包年包月，1 - 按量计费 
     * @return PayType 计费方式，0 - 包年包月，1 - 按量计费
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 计费方式，0 - 包年包月，1 - 按量计费
     * @param PayType 计费方式，0 - 包年包月，1 - 按量计费
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
     * Get 数据订阅实例所属地域 
     * @return Region 数据订阅实例所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 数据订阅实例所属地域
     * @param Region 数据订阅实例所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 接入方式。枚举值：extranet(公网) vpncloud(vpn接入) dcg(专线接入) ccn(云联网) cdb(云数据库) cvm(云主机自建) intranet(自研上云) vpc(私有网络vpc)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 数据库节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoints 数据库节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndpointItem [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set 数据库节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoints 数据库节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoints(EndpointItem [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    /**
     * Get 数据订阅版本, 当前只支持 kafka 版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscribeVersion 数据订阅版本, 当前只支持 kafka 版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set 数据订阅版本, 当前只支持 kafka 版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscribeVersion 数据订阅版本, 当前只支持 kafka 版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
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
     * Get 任务报错信息，如果有的话。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Errors 任务报错信息，如果有的话。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubsErr [] getErrors() {
        return this.Errors;
    }

    /**
     * Set 任务报错信息，如果有的话。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Errors 任务报错信息，如果有的话。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrors(SubsErr [] Errors) {
        this.Errors = Errors;
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

    }
}

