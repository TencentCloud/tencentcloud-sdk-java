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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFleetRequest extends AbstractModel{

    /**
    * 生成包 Id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 描述，最小长度0，最大长度100
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 网络配置
    */
    @SerializedName("InboundPermissions")
    @Expose
    private InboundPermission [] InboundPermissions;

    /**
    * 服务器类型，参数根据[获取服务器实例类型列表](https://cloud.tencent.com/document/product/1165/48732)接口获取。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 服务器舰队类型，目前只支持ON_DEMAND类型
    */
    @SerializedName("FleetType")
    @Expose
    private String FleetType;

    /**
    * 服务器舰队名称，最小长度1，最大长度50
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
    */
    @SerializedName("NewGameServerSessionProtectionPolicy")
    @Expose
    private String NewGameServerSessionProtectionPolicy;

    /**
    * VPC 网络 Id，对等连接已不再使用
    */
    @SerializedName("PeerVpcId")
    @Expose
    private String PeerVpcId;

    /**
    * 资源创建限制策略
    */
    @SerializedName("ResourceCreationLimitPolicy")
    @Expose
    private ResourceCreationLimitPolicy ResourceCreationLimitPolicy;

    /**
    * 进程配置
    */
    @SerializedName("RuntimeConfiguration")
    @Expose
    private RuntimeConfiguration RuntimeConfiguration;

    /**
    * VPC 子网，对等连接已不再使用
    */
    @SerializedName("SubNetId")
    @Expose
    private String SubNetId;

    /**
    * 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
    */
    @SerializedName("GameServerSessionProtectionTimeLimit")
    @Expose
    private Long GameServerSessionProtectionTimeLimit;

    /**
     * Get 生成包 Id 
     * @return AssetId 生成包 Id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 生成包 Id
     * @param AssetId 生成包 Id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 描述，最小长度0，最大长度100 
     * @return Description 描述，最小长度0，最大长度100
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述，最小长度0，最大长度100
     * @param Description 描述，最小长度0，最大长度100
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 网络配置 
     * @return InboundPermissions 网络配置
     */
    public InboundPermission [] getInboundPermissions() {
        return this.InboundPermissions;
    }

    /**
     * Set 网络配置
     * @param InboundPermissions 网络配置
     */
    public void setInboundPermissions(InboundPermission [] InboundPermissions) {
        this.InboundPermissions = InboundPermissions;
    }

    /**
     * Get 服务器类型，参数根据[获取服务器实例类型列表](https://cloud.tencent.com/document/product/1165/48732)接口获取。 
     * @return InstanceType 服务器类型，参数根据[获取服务器实例类型列表](https://cloud.tencent.com/document/product/1165/48732)接口获取。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 服务器类型，参数根据[获取服务器实例类型列表](https://cloud.tencent.com/document/product/1165/48732)接口获取。
     * @param InstanceType 服务器类型，参数根据[获取服务器实例类型列表](https://cloud.tencent.com/document/product/1165/48732)接口获取。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 服务器舰队类型，目前只支持ON_DEMAND类型 
     * @return FleetType 服务器舰队类型，目前只支持ON_DEMAND类型
     */
    public String getFleetType() {
        return this.FleetType;
    }

    /**
     * Set 服务器舰队类型，目前只支持ON_DEMAND类型
     * @param FleetType 服务器舰队类型，目前只支持ON_DEMAND类型
     */
    public void setFleetType(String FleetType) {
        this.FleetType = FleetType;
    }

    /**
     * Get 服务器舰队名称，最小长度1，最大长度50 
     * @return Name 服务器舰队名称，最小长度1，最大长度50
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务器舰队名称，最小长度1，最大长度50
     * @param Name 服务器舰队名称，最小长度1，最大长度50
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection 
     * @return NewGameServerSessionProtectionPolicy 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
     */
    public String getNewGameServerSessionProtectionPolicy() {
        return this.NewGameServerSessionProtectionPolicy;
    }

    /**
     * Set 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
     * @param NewGameServerSessionProtectionPolicy 保护策略：不保护NoProtection、完全保护FullProtection、时限保护TimeLimitProtection
     */
    public void setNewGameServerSessionProtectionPolicy(String NewGameServerSessionProtectionPolicy) {
        this.NewGameServerSessionProtectionPolicy = NewGameServerSessionProtectionPolicy;
    }

    /**
     * Get VPC 网络 Id，对等连接已不再使用 
     * @return PeerVpcId VPC 网络 Id，对等连接已不再使用
     */
    public String getPeerVpcId() {
        return this.PeerVpcId;
    }

    /**
     * Set VPC 网络 Id，对等连接已不再使用
     * @param PeerVpcId VPC 网络 Id，对等连接已不再使用
     */
    public void setPeerVpcId(String PeerVpcId) {
        this.PeerVpcId = PeerVpcId;
    }

    /**
     * Get 资源创建限制策略 
     * @return ResourceCreationLimitPolicy 资源创建限制策略
     */
    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.ResourceCreationLimitPolicy;
    }

    /**
     * Set 资源创建限制策略
     * @param ResourceCreationLimitPolicy 资源创建限制策略
     */
    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy ResourceCreationLimitPolicy) {
        this.ResourceCreationLimitPolicy = ResourceCreationLimitPolicy;
    }

    /**
     * Get 进程配置 
     * @return RuntimeConfiguration 进程配置
     */
    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.RuntimeConfiguration;
    }

    /**
     * Set 进程配置
     * @param RuntimeConfiguration 进程配置
     */
    public void setRuntimeConfiguration(RuntimeConfiguration RuntimeConfiguration) {
        this.RuntimeConfiguration = RuntimeConfiguration;
    }

    /**
     * Get VPC 子网，对等连接已不再使用 
     * @return SubNetId VPC 子网，对等连接已不再使用
     */
    public String getSubNetId() {
        return this.SubNetId;
    }

    /**
     * Set VPC 子网，对等连接已不再使用
     * @param SubNetId VPC 子网，对等连接已不再使用
     */
    public void setSubNetId(String SubNetId) {
        this.SubNetId = SubNetId;
    }

    /**
     * Get 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效 
     * @return GameServerSessionProtectionTimeLimit 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
     */
    public Long getGameServerSessionProtectionTimeLimit() {
        return this.GameServerSessionProtectionTimeLimit;
    }

    /**
     * Set 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
     * @param GameServerSessionProtectionTimeLimit 时限保护超时时间，默认60分钟，最小值5，最大值1440；当NewGameSessionProtectionPolicy为TimeLimitProtection时参数有效
     */
    public void setGameServerSessionProtectionTimeLimit(Long GameServerSessionProtectionTimeLimit) {
        this.GameServerSessionProtectionTimeLimit = GameServerSessionProtectionTimeLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "InboundPermissions.", this.InboundPermissions);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "FleetType", this.FleetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NewGameServerSessionProtectionPolicy", this.NewGameServerSessionProtectionPolicy);
        this.setParamSimple(map, prefix + "PeerVpcId", this.PeerVpcId);
        this.setParamObj(map, prefix + "ResourceCreationLimitPolicy.", this.ResourceCreationLimitPolicy);
        this.setParamObj(map, prefix + "RuntimeConfiguration.", this.RuntimeConfiguration);
        this.setParamSimple(map, prefix + "SubNetId", this.SubNetId);
        this.setParamSimple(map, prefix + "GameServerSessionProtectionTimeLimit", this.GameServerSessionProtectionTimeLimit);

    }
}

