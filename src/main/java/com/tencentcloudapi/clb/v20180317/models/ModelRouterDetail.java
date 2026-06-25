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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelRouterDetail extends AbstractModel {

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>模型路由实例域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>模型路由ID</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>模型路由名称</p><p>默认值：-</p>
    */
    @SerializedName("ModelRouterName")
    @Expose
    private String ModelRouterName;

    /**
    * <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
    */
    @SerializedName("ModelRouterType")
    @Expose
    private String ModelRouterType;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>模型路由实例网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>模型路由限速信息</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForModelRouter RateLimitConfig;

    /**
    * <p>模型路由的路由配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RouterSetting")
    @Expose
    private RouterSettingWithFallBack RouterSetting;

    /**
    * <p>模型路由实例的安全状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Banned： 已封禁</li><li>Frozen： 已冻结</li></ul>
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * <p>模型路由网络配置列表</p>
    */
    @SerializedName("ServiceEndPoints")
    @Expose
    private ServiceEndPoints [] ServiceEndPoints;

    /**
    * <p>模型路由实例状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>模型路由实例所属子网的ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>模型路由实例的计费状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Isolated： 已隔离</li></ul>
    */
    @SerializedName("TradeStatus")
    @Expose
    private String TradeStatus;

    /**
    * <p>模型路由实例VIP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>模型路由实例所属VPC的ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>模型路由实例关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>模型路由实例关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * <p>模型路由实例的Credit使用情况。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreditUsage")
    @Expose
    private CreditUsage CreditUsage;

    /**
    * <p>模型路由实例按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
    */
    @SerializedName("CreditUsageSet")
    @Expose
    private CreditUsage [] CreditUsageSet;

    /**
    * <p>安全组ID列表</p>
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * <p>集群信息</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo ClusterInfo;

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>模型路由实例域名</p> 
     * @return Domain <p>模型路由实例域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>模型路由实例域名</p>
     * @param Domain <p>模型路由实例域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>模型路由ID</p> 
     * @return ModelRouterId <p>模型路由ID</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由ID</p>
     * @param ModelRouterId <p>模型路由ID</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>模型路由名称</p><p>默认值：-</p> 
     * @return ModelRouterName <p>模型路由名称</p><p>默认值：-</p>
     */
    public String getModelRouterName() {
        return this.ModelRouterName;
    }

    /**
     * Set <p>模型路由名称</p><p>默认值：-</p>
     * @param ModelRouterName <p>模型路由名称</p><p>默认值：-</p>
     */
    public void setModelRouterName(String ModelRouterName) {
        this.ModelRouterName = ModelRouterName;
    }

    /**
     * Get <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul> 
     * @return ModelRouterType <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
     */
    public String getModelRouterType() {
        return this.ModelRouterType;
    }

    /**
     * Set <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
     * @param ModelRouterType <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
     */
    public void setModelRouterType(String ModelRouterType) {
        this.ModelRouterType = ModelRouterType;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifiedTime <p>修改时间</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifiedTime <p>修改时间</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>模型路由实例网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul> 
     * @return NetworkType <p>模型路由实例网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>模型路由实例网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
     * @param NetworkType <p>模型路由实例网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>模型路由限速信息</p> 
     * @return RateLimitConfig <p>模型路由限速信息</p>
     */
    public RateLimitConfigForModelRouter getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>模型路由限速信息</p>
     * @param RateLimitConfig <p>模型路由限速信息</p>
     */
    public void setRateLimitConfig(RateLimitConfigForModelRouter RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>模型路由的路由配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RouterSetting <p>模型路由的路由配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RouterSettingWithFallBack getRouterSetting() {
        return this.RouterSetting;
    }

    /**
     * Set <p>模型路由的路由配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RouterSetting <p>模型路由的路由配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRouterSetting(RouterSettingWithFallBack RouterSetting) {
        this.RouterSetting = RouterSetting;
    }

    /**
     * Get <p>模型路由实例的安全状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Banned： 已封禁</li><li>Frozen： 已冻结</li></ul> 
     * @return SecurityStatus <p>模型路由实例的安全状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Banned： 已封禁</li><li>Frozen： 已冻结</li></ul>
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set <p>模型路由实例的安全状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Banned： 已封禁</li><li>Frozen： 已冻结</li></ul>
     * @param SecurityStatus <p>模型路由实例的安全状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Banned： 已封禁</li><li>Frozen： 已冻结</li></ul>
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get <p>模型路由网络配置列表</p> 
     * @return ServiceEndPoints <p>模型路由网络配置列表</p>
     */
    public ServiceEndPoints [] getServiceEndPoints() {
        return this.ServiceEndPoints;
    }

    /**
     * Set <p>模型路由网络配置列表</p>
     * @param ServiceEndPoints <p>模型路由网络配置列表</p>
     */
    public void setServiceEndPoints(ServiceEndPoints [] ServiceEndPoints) {
        this.ServiceEndPoints = ServiceEndPoints;
    }

    /**
     * Get <p>模型路由实例状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li></ul> 
     * @return Status <p>模型路由实例状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>模型路由实例状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li></ul>
     * @param Status <p>模型路由实例状态</p><p>枚举值：</p><ul><li>Active： 运行中</li><li>Provisioning： 创建中</li><li>Configuring： 变配中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>模型路由实例所属子网的ID</p> 
     * @return SubnetId <p>模型路由实例所属子网的ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>模型路由实例所属子网的ID</p>
     * @param SubnetId <p>模型路由实例所属子网的ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>模型路由实例的计费状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Isolated： 已隔离</li></ul> 
     * @return TradeStatus <p>模型路由实例的计费状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Isolated： 已隔离</li></ul>
     */
    public String getTradeStatus() {
        return this.TradeStatus;
    }

    /**
     * Set <p>模型路由实例的计费状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Isolated： 已隔离</li></ul>
     * @param TradeStatus <p>模型路由实例的计费状态</p><p>枚举值：</p><ul><li>Normal： 正常</li><li>Isolated： 已隔离</li></ul>
     */
    public void setTradeStatus(String TradeStatus) {
        this.TradeStatus = TradeStatus;
    }

    /**
     * Get <p>模型路由实例VIP</p> 
     * @return Vip <p>模型路由实例VIP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>模型路由实例VIP</p>
     * @param Vip <p>模型路由实例VIP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>模型路由实例所属VPC的ID</p> 
     * @return VpcId <p>模型路由实例所属VPC的ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>模型路由实例所属VPC的ID</p>
     * @param VpcId <p>模型路由实例所属VPC的ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>模型路由实例关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetId <p>模型路由实例关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>模型路由实例关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetId <p>模型路由实例关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>模型路由实例关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetName <p>模型路由实例关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set <p>模型路由实例关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetName <p>模型路由实例关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get <p>模型路由实例的Credit使用情况。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreditUsage <p>模型路由实例的Credit使用情况。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreditUsage getCreditUsage() {
        return this.CreditUsage;
    }

    /**
     * Set <p>模型路由实例的Credit使用情况。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreditUsage <p>模型路由实例的Credit使用情况。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreditUsage(CreditUsage CreditUsage) {
        this.CreditUsage = CreditUsage;
    }

    /**
     * Get <p>模型路由实例按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p> 
     * @return CreditUsageSet <p>模型路由实例按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
     */
    public CreditUsage [] getCreditUsageSet() {
        return this.CreditUsageSet;
    }

    /**
     * Set <p>模型路由实例按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
     * @param CreditUsageSet <p>模型路由实例按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
     */
    public void setCreditUsageSet(CreditUsage [] CreditUsageSet) {
        this.CreditUsageSet = CreditUsageSet;
    }

    /**
     * Get <p>安全组ID列表</p> 
     * @return SecurityGroups <p>安全组ID列表</p>
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set <p>安全组ID列表</p>
     * @param SecurityGroups <p>安全组ID列表</p>
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get <p>集群信息</p> 
     * @return ClusterInfo <p>集群信息</p>
     */
    public ClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>集群信息</p>
     * @param ClusterInfo <p>集群信息</p>
     */
    public void setClusterInfo(ClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    public ModelRouterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterDetail(ModelRouterDetail source) {
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.ModelRouterName != null) {
            this.ModelRouterName = new String(source.ModelRouterName);
        }
        if (source.ModelRouterType != null) {
            this.ModelRouterType = new String(source.ModelRouterType);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForModelRouter(source.RateLimitConfig);
        }
        if (source.RouterSetting != null) {
            this.RouterSetting = new RouterSettingWithFallBack(source.RouterSetting);
        }
        if (source.SecurityStatus != null) {
            this.SecurityStatus = new String(source.SecurityStatus);
        }
        if (source.ServiceEndPoints != null) {
            this.ServiceEndPoints = new ServiceEndPoints[source.ServiceEndPoints.length];
            for (int i = 0; i < source.ServiceEndPoints.length; i++) {
                this.ServiceEndPoints[i] = new ServiceEndPoints(source.ServiceEndPoints[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TradeStatus != null) {
            this.TradeStatus = new String(source.TradeStatus);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.CreditUsage != null) {
            this.CreditUsage = new CreditUsage(source.CreditUsage);
        }
        if (source.CreditUsageSet != null) {
            this.CreditUsageSet = new CreditUsage[source.CreditUsageSet.length];
            for (int i = 0; i < source.CreditUsageSet.length; i++) {
                this.CreditUsageSet[i] = new CreditUsage(source.CreditUsageSet[i]);
            }
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new ClusterInfo(source.ClusterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "ModelRouterName", this.ModelRouterName);
        this.setParamSimple(map, prefix + "ModelRouterType", this.ModelRouterType);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "RouterSetting.", this.RouterSetting);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);
        this.setParamArrayObj(map, prefix + "ServiceEndPoints.", this.ServiceEndPoints);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TradeStatus", this.TradeStatus);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamObj(map, prefix + "CreditUsage.", this.CreditUsage);
        this.setParamArrayObj(map, prefix + "CreditUsageSet.", this.CreditUsageSet);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);

    }
}

