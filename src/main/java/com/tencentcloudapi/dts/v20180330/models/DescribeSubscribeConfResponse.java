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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeConfResponse extends AbstractModel{

    /**
    * 订阅实例ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 订阅实例名称
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * 订阅通道
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 订阅数据库类型
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 被订阅的实例
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 被订阅的实例的状态，可能的值有running,offline,isolate
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 订阅实例状态，可能的值有unconfigure-未配置，configuring-配置中，configured-已配置
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * 订阅实例生命周期状态，可能的值有：normal-正常，isolating-隔离中，isolated-已隔离，offlining-下线中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 订阅实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 订阅实例被隔离时间
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 订阅实例到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 订阅实例下线时间
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 订阅实例消费时间起点。
    */
    @SerializedName("ConsumeStartTime")
    @Expose
    private String ConsumeStartTime;

    /**
    * 订阅实例计费类型，1-小时计费，0-包年包月
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 订阅通道Vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 订阅通道Port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 订阅通道所在VpcId
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 订阅通道所在SubnetId
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 当前SDK消费时间位点
    */
    @SerializedName("SdkConsumedTime")
    @Expose
    private String SdkConsumedTime;

    /**
    * 订阅SDK IP地址
    */
    @SerializedName("SdkHost")
    @Expose
    private String SdkHost;

    /**
    * 订阅对象类型0-全实例订阅，1-DDL数据订阅，2-DML结构订阅，3-DDL数据订阅+DML结构订阅
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * 订阅对象，当SubscribeObjectType 为0时，此字段为空数组
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 订阅实例ID 
     * @return SubscribeId 订阅实例ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 订阅实例ID
     * @param SubscribeId 订阅实例ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 订阅实例名称 
     * @return SubscribeName 订阅实例名称
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set 订阅实例名称
     * @param SubscribeName 订阅实例名称
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get 订阅通道 
     * @return ChannelId 订阅通道
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 订阅通道
     * @param ChannelId 订阅通道
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 订阅数据库类型 
     * @return Product 订阅数据库类型
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 订阅数据库类型
     * @param Product 订阅数据库类型
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 被订阅的实例 
     * @return InstanceId 被订阅的实例
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 被订阅的实例
     * @param InstanceId 被订阅的实例
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 被订阅的实例的状态，可能的值有running,offline,isolate 
     * @return InstanceStatus 被订阅的实例的状态，可能的值有running,offline,isolate
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 被订阅的实例的状态，可能的值有running,offline,isolate
     * @param InstanceStatus 被订阅的实例的状态，可能的值有running,offline,isolate
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 订阅实例状态，可能的值有unconfigure-未配置，configuring-配置中，configured-已配置 
     * @return SubsStatus 订阅实例状态，可能的值有unconfigure-未配置，configuring-配置中，configured-已配置
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set 订阅实例状态，可能的值有unconfigure-未配置，configuring-配置中，configured-已配置
     * @param SubsStatus 订阅实例状态，可能的值有unconfigure-未配置，configuring-配置中，configured-已配置
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get 订阅实例生命周期状态，可能的值有：normal-正常，isolating-隔离中，isolated-已隔离，offlining-下线中 
     * @return Status 订阅实例生命周期状态，可能的值有：normal-正常，isolating-隔离中，isolated-已隔离，offlining-下线中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订阅实例生命周期状态，可能的值有：normal-正常，isolating-隔离中，isolated-已隔离，offlining-下线中
     * @param Status 订阅实例生命周期状态，可能的值有：normal-正常，isolating-隔离中，isolated-已隔离，offlining-下线中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 订阅实例创建时间 
     * @return CreateTime 订阅实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 订阅实例创建时间
     * @param CreateTime 订阅实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 订阅实例被隔离时间 
     * @return IsolateTime 订阅实例被隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 订阅实例被隔离时间
     * @param IsolateTime 订阅实例被隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 订阅实例到期时间 
     * @return ExpireTime 订阅实例到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 订阅实例到期时间
     * @param ExpireTime 订阅实例到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 订阅实例下线时间 
     * @return OfflineTime 订阅实例下线时间
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 订阅实例下线时间
     * @param OfflineTime 订阅实例下线时间
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 订阅实例消费时间起点。 
     * @return ConsumeStartTime 订阅实例消费时间起点。
     */
    public String getConsumeStartTime() {
        return this.ConsumeStartTime;
    }

    /**
     * Set 订阅实例消费时间起点。
     * @param ConsumeStartTime 订阅实例消费时间起点。
     */
    public void setConsumeStartTime(String ConsumeStartTime) {
        this.ConsumeStartTime = ConsumeStartTime;
    }

    /**
     * Get 订阅实例计费类型，1-小时计费，0-包年包月 
     * @return PayType 订阅实例计费类型，1-小时计费，0-包年包月
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 订阅实例计费类型，1-小时计费，0-包年包月
     * @param PayType 订阅实例计费类型，1-小时计费，0-包年包月
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 订阅通道Vip 
     * @return Vip 订阅通道Vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 订阅通道Vip
     * @param Vip 订阅通道Vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 订阅通道Port 
     * @return Vport 订阅通道Port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 订阅通道Port
     * @param Vport 订阅通道Port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 订阅通道所在VpcId 
     * @return UniqVpcId 订阅通道所在VpcId
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 订阅通道所在VpcId
     * @param UniqVpcId 订阅通道所在VpcId
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 订阅通道所在SubnetId 
     * @return UniqSubnetId 订阅通道所在SubnetId
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 订阅通道所在SubnetId
     * @param UniqSubnetId 订阅通道所在SubnetId
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 当前SDK消费时间位点 
     * @return SdkConsumedTime 当前SDK消费时间位点
     */
    public String getSdkConsumedTime() {
        return this.SdkConsumedTime;
    }

    /**
     * Set 当前SDK消费时间位点
     * @param SdkConsumedTime 当前SDK消费时间位点
     */
    public void setSdkConsumedTime(String SdkConsumedTime) {
        this.SdkConsumedTime = SdkConsumedTime;
    }

    /**
     * Get 订阅SDK IP地址 
     * @return SdkHost 订阅SDK IP地址
     */
    public String getSdkHost() {
        return this.SdkHost;
    }

    /**
     * Set 订阅SDK IP地址
     * @param SdkHost 订阅SDK IP地址
     */
    public void setSdkHost(String SdkHost) {
        this.SdkHost = SdkHost;
    }

    /**
     * Get 订阅对象类型0-全实例订阅，1-DDL数据订阅，2-DML结构订阅，3-DDL数据订阅+DML结构订阅 
     * @return SubscribeObjectType 订阅对象类型0-全实例订阅，1-DDL数据订阅，2-DML结构订阅，3-DDL数据订阅+DML结构订阅
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set 订阅对象类型0-全实例订阅，1-DDL数据订阅，2-DML结构订阅，3-DDL数据订阅+DML结构订阅
     * @param SubscribeObjectType 订阅对象类型0-全实例订阅，1-DDL数据订阅，2-DML结构订阅，3-DDL数据订阅+DML结构订阅
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get 订阅对象，当SubscribeObjectType 为0时，此字段为空数组 
     * @return SubscribeObjects 订阅对象，当SubscribeObjectType 为0时，此字段为空数组
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set 订阅对象，当SubscribeObjectType 为0时，此字段为空数组
     * @param SubscribeObjects 订阅对象，当SubscribeObjectType 为0时，此字段为空数组
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "ConsumeStartTime", this.ConsumeStartTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "SdkConsumedTime", this.SdkConsumedTime);
        this.setParamSimple(map, prefix + "SdkHost", this.SdkHost);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamArrayObj(map, prefix + "SubscribeObjects.", this.SubscribeObjects);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

