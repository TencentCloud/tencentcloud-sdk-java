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

public class SubscribeInfo extends AbstractModel{

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
    * 数据订阅实例绑定的通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 数据订阅绑定实例对应的产品名称
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
    * 数据订阅实例绑定的数据库实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * 上次修改时间
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
    * 隔离时间
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 到期时间
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
    * 数据订阅实例的Vip
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
    * 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中，offline - 已下线
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
     * Get 数据订阅实例绑定的通道ID 
     * @return ChannelId 数据订阅实例绑定的通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 数据订阅实例绑定的通道ID
     * @param ChannelId 数据订阅实例绑定的通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 数据订阅绑定实例对应的产品名称 
     * @return Product 数据订阅绑定实例对应的产品名称
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据订阅绑定实例对应的产品名称
     * @param Product 数据订阅绑定实例对应的产品名称
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
     * Get 数据订阅实例绑定的数据库实例状态 
     * @return InstanceStatus 数据订阅实例绑定的数据库实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 数据订阅实例绑定的数据库实例状态
     * @param InstanceStatus 数据订阅实例绑定的数据库实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置 
     * @return SubsStatus 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
     * @param SubsStatus 数据订阅实例的配置状态，unconfigure - 未配置， configuring - 配置中，configured - 已配置
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get 上次修改时间 
     * @return ModifyTime 上次修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 上次修改时间
     * @param ModifyTime 上次修改时间
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
     * Get 隔离时间 
     * @return IsolateTime 隔离时间
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 隔离时间
     * @param IsolateTime 隔离时间
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 到期时间 
     * @return ExpireTime 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
     * @param ExpireTime 到期时间
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
     * Get 数据订阅实例的Vip 
     * @return Vip 数据订阅实例的Vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 数据订阅实例的Vip
     * @param Vip 数据订阅实例的Vip
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
     * Get 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中，offline - 已下线 
     * @return Status 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中，offline - 已下线
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中，offline - 已下线
     * @param Status 数据订阅实例的状态，creating - 创建中，normal - 正常运行，isolating - 隔离中，isolated - 已隔离，offlining - 下线中，offline - 已下线
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SdkConsumedTime", this.SdkConsumedTime);

    }
}

