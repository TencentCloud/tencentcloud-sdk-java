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
package com.tencentcloudapi.dts.v20180330.models;

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
    * 数据订阅实例绑定的通道ID。kafka版订阅就是kafka topic
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 订阅实例的类型，目前支持 cynosdbmysql,mariadb,mongodb,mysql,percona,tdpg,tdsqlpercona(tdsqlmysql)
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 数据订阅实例绑定的数据库实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 数据订阅状态，可能的值为：未启动 notStarted, 校验中 checking, 校验不通过 checkNotPass, 校验通过 checkPass, 启动中 starting, 运行中 running, 异常出错 error
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * 上次修改时间，时间格式如：Y-m-d h:m:s
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 隔离时间，时间格式如：Y-m-d h:m:s
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 下线时间
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 最近一次修改的消费时间起点，如果从未修改则为零值
    */
    @SerializedName("ConsumeStartTime")
    @Expose
    private String ConsumeStartTime;

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
    * 计费方式，0 - 包年包月，1 - 按量计费
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 旧版订阅通道的vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 数据订阅实例的Vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 数据订阅实例Vip所在VPC的唯一ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 数据订阅实例Vip所在子网的唯一ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 数据订阅生命周期状态，可能的值为：正常 normal, 隔离中 isolating, 已隔离 isolated, 下线中 offlining, 按量转包年包月中 post2PrePayIng
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * SDK最后一条确认消息的时间戳，如果SDK一直消费，也可以作为SDK当前消费时间点
    */
    @SerializedName("SdkConsumedTime")
    @Expose
    private String SdkConsumedTime;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 订阅实例版本；txdts-旧版数据订阅,kafka-kafka版本数据订阅
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

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
     * Get 数据订阅实例绑定的通道ID。kafka版订阅就是kafka topic 
     * @return ChannelId 数据订阅实例绑定的通道ID。kafka版订阅就是kafka topic
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 数据订阅实例绑定的通道ID。kafka版订阅就是kafka topic
     * @param ChannelId 数据订阅实例绑定的通道ID。kafka版订阅就是kafka topic
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
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
     * Get 数据订阅实例绑定的数据库实例ID 
     * @return InstanceId 数据订阅实例绑定的数据库实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据订阅实例绑定的数据库实例ID
     * @param InstanceId 数据订阅实例绑定的数据库实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空 
     * @return InstanceStatus 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
     * @param InstanceStatus 云数据库状态：running 运行中，isolated 已隔离，offline 已下线。如果不是云上，此值为空
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
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
     * @return ModifyTime 上次修改时间，时间格式如：Y-m-d h:m:s
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 上次修改时间，时间格式如：Y-m-d h:m:s
     * @param ModifyTime 上次修改时间，时间格式如：Y-m-d h:m:s
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 隔离时间，时间格式如：Y-m-d h:m:s 
     * @return IsolateTime 隔离时间，时间格式如：Y-m-d h:m:s
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间，时间格式如：Y-m-d h:m:s
     * @param IsolateTime 隔离时间，时间格式如：Y-m-d h:m:s
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00 
     * @return ExpireTime 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
     * @param ExpireTime 包年包月任务的到期时间，时间格式如：Y-m-d h:m:s。默认：0000-00-00 00:00:00
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 下线时间 
     * @return OfflineTime 下线时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 下线时间
     * @param OfflineTime 下线时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 最近一次修改的消费时间起点，如果从未修改则为零值 
     * @return ConsumeStartTime 最近一次修改的消费时间起点，如果从未修改则为零值
     */
    public String getConsumeStartTime() {
        return this.ConsumeStartTime;
    }

    /**
     * Set 最近一次修改的消费时间起点，如果从未修改则为零值
     * @param ConsumeStartTime 最近一次修改的消费时间起点，如果从未修改则为零值
     */
    public void setConsumeStartTime(String ConsumeStartTime) {
        this.ConsumeStartTime = ConsumeStartTime;
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
     * Get 旧版订阅通道的vip 
     * @return Vip 旧版订阅通道的vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 旧版订阅通道的vip
     * @param Vip 旧版订阅通道的vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 数据订阅实例的Vport 
     * @return Vport 数据订阅实例的Vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 数据订阅实例的Vport
     * @param Vport 数据订阅实例的Vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 数据订阅实例Vip所在VPC的唯一ID 
     * @return UniqVpcId 数据订阅实例Vip所在VPC的唯一ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 数据订阅实例Vip所在VPC的唯一ID
     * @param UniqVpcId 数据订阅实例Vip所在VPC的唯一ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 数据订阅实例Vip所在子网的唯一ID 
     * @return UniqSubnetId 数据订阅实例Vip所在子网的唯一ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 数据订阅实例Vip所在子网的唯一ID
     * @param UniqSubnetId 数据订阅实例Vip所在子网的唯一ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
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
     * Get SDK最后一条确认消息的时间戳，如果SDK一直消费，也可以作为SDK当前消费时间点 
     * @return SdkConsumedTime SDK最后一条确认消息的时间戳，如果SDK一直消费，也可以作为SDK当前消费时间点
     */
    public String getSdkConsumedTime() {
        return this.SdkConsumedTime;
    }

    /**
     * Set SDK最后一条确认消息的时间戳，如果SDK一直消费，也可以作为SDK当前消费时间点
     * @param SdkConsumedTime SDK最后一条确认消息的时间戳，如果SDK一直消费，也可以作为SDK当前消费时间点
     */
    public void setSdkConsumedTime(String SdkConsumedTime) {
        this.SdkConsumedTime = SdkConsumedTime;
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
     * Get 订阅实例版本；txdts-旧版数据订阅,kafka-kafka版本数据订阅 
     * @return SubscribeVersion 订阅实例版本；txdts-旧版数据订阅,kafka-kafka版本数据订阅
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set 订阅实例版本；txdts-旧版数据订阅,kafka-kafka版本数据订阅
     * @param SubscribeVersion 订阅实例版本；txdts-旧版数据订阅,kafka-kafka版本数据订阅
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
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
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
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
        if (source.ConsumeStartTime != null) {
            this.ConsumeStartTime = new String(source.ConsumeStartTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SdkConsumedTime != null) {
            this.SdkConsumedTime = new String(source.SdkConsumedTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SubsStatus", this.SubsStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "ConsumeStartTime", this.ConsumeStartTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SdkConsumedTime", this.SdkConsumedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);

    }
}

