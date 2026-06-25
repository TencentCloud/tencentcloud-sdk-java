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

public class BudgetInfo extends AbstractModel {

    /**
    * <p>关联的key数量</p>
    */
    @SerializedName("AssociationKeyCount")
    @Expose
    private Long AssociationKeyCount;

    /**
    * <p>关联的模型路由数量</p>
    */
    @SerializedName("AssociationModelRouterCount")
    @Expose
    private Long AssociationModelRouterCount;

    /**
    * <p>关联的用户组数量</p>
    */
    @SerializedName("AssociationUserGroupCount")
    @Expose
    private Long AssociationUserGroupCount;

    /**
    * <p>Budget预算配置数组。</p><p>最多返回3个元素，每种刷新周期（1d/7d/30d）各一个。</p>
    */
    @SerializedName("BudgetConfigs")
    @Expose
    private BudgetConfig [] BudgetConfigs;

    /**
    * <p>Budget ID。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>Budget名称。</p>
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>修改时间。</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>Budget限速信息。</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForBudget RateLimitConfig;

    /**
    * <p>Budget状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：运行中</li><li>Configuring：变配中</li><li>Deleting：删除中</li><li>ProvisionFailed：创建失败</li><li>ConfigureFailed：变配失败</li><li>DeletionFailed：删除失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>关联的key数量</p> 
     * @return AssociationKeyCount <p>关联的key数量</p>
     */
    public Long getAssociationKeyCount() {
        return this.AssociationKeyCount;
    }

    /**
     * Set <p>关联的key数量</p>
     * @param AssociationKeyCount <p>关联的key数量</p>
     */
    public void setAssociationKeyCount(Long AssociationKeyCount) {
        this.AssociationKeyCount = AssociationKeyCount;
    }

    /**
     * Get <p>关联的模型路由数量</p> 
     * @return AssociationModelRouterCount <p>关联的模型路由数量</p>
     */
    public Long getAssociationModelRouterCount() {
        return this.AssociationModelRouterCount;
    }

    /**
     * Set <p>关联的模型路由数量</p>
     * @param AssociationModelRouterCount <p>关联的模型路由数量</p>
     */
    public void setAssociationModelRouterCount(Long AssociationModelRouterCount) {
        this.AssociationModelRouterCount = AssociationModelRouterCount;
    }

    /**
     * Get <p>关联的用户组数量</p> 
     * @return AssociationUserGroupCount <p>关联的用户组数量</p>
     */
    public Long getAssociationUserGroupCount() {
        return this.AssociationUserGroupCount;
    }

    /**
     * Set <p>关联的用户组数量</p>
     * @param AssociationUserGroupCount <p>关联的用户组数量</p>
     */
    public void setAssociationUserGroupCount(Long AssociationUserGroupCount) {
        this.AssociationUserGroupCount = AssociationUserGroupCount;
    }

    /**
     * Get <p>Budget预算配置数组。</p><p>最多返回3个元素，每种刷新周期（1d/7d/30d）各一个。</p> 
     * @return BudgetConfigs <p>Budget预算配置数组。</p><p>最多返回3个元素，每种刷新周期（1d/7d/30d）各一个。</p>
     */
    public BudgetConfig [] getBudgetConfigs() {
        return this.BudgetConfigs;
    }

    /**
     * Set <p>Budget预算配置数组。</p><p>最多返回3个元素，每种刷新周期（1d/7d/30d）各一个。</p>
     * @param BudgetConfigs <p>Budget预算配置数组。</p><p>最多返回3个元素，每种刷新周期（1d/7d/30d）各一个。</p>
     */
    public void setBudgetConfigs(BudgetConfig [] BudgetConfigs) {
        this.BudgetConfigs = BudgetConfigs;
    }

    /**
     * Get <p>Budget ID。</p> 
     * @return BudgetId <p>Budget ID。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>Budget ID。</p>
     * @param BudgetId <p>Budget ID。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>Budget名称。</p> 
     * @return BudgetName <p>Budget名称。</p>
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set <p>Budget名称。</p>
     * @param BudgetName <p>Budget名称。</p>
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedTime <p>创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedTime <p>创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>修改时间。</p> 
     * @return ModifiedTime <p>修改时间。</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>修改时间。</p>
     * @param ModifiedTime <p>修改时间。</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>Budget限速信息。</p> 
     * @return RateLimitConfig <p>Budget限速信息。</p>
     */
    public RateLimitConfigForBudget getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>Budget限速信息。</p>
     * @param RateLimitConfig <p>Budget限速信息。</p>
     */
    public void setRateLimitConfig(RateLimitConfigForBudget RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>Budget状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：运行中</li><li>Configuring：变配中</li><li>Deleting：删除中</li><li>ProvisionFailed：创建失败</li><li>ConfigureFailed：变配失败</li><li>DeletionFailed：删除失败</li></ul> 
     * @return Status <p>Budget状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：运行中</li><li>Configuring：变配中</li><li>Deleting：删除中</li><li>ProvisionFailed：创建失败</li><li>ConfigureFailed：变配失败</li><li>DeletionFailed：删除失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Budget状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：运行中</li><li>Configuring：变配中</li><li>Deleting：删除中</li><li>ProvisionFailed：创建失败</li><li>ConfigureFailed：变配失败</li><li>DeletionFailed：删除失败</li></ul>
     * @param Status <p>Budget状态。</p><p>枚举值：</p><ul><li>Provisioning：创建中</li><li>Active：运行中</li><li>Configuring：变配中</li><li>Deleting：删除中</li><li>ProvisionFailed：创建失败</li><li>ConfigureFailed：变配失败</li><li>DeletionFailed：删除失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BudgetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetInfo(BudgetInfo source) {
        if (source.AssociationKeyCount != null) {
            this.AssociationKeyCount = new Long(source.AssociationKeyCount);
        }
        if (source.AssociationModelRouterCount != null) {
            this.AssociationModelRouterCount = new Long(source.AssociationModelRouterCount);
        }
        if (source.AssociationUserGroupCount != null) {
            this.AssociationUserGroupCount = new Long(source.AssociationUserGroupCount);
        }
        if (source.BudgetConfigs != null) {
            this.BudgetConfigs = new BudgetConfig[source.BudgetConfigs.length];
            for (int i = 0; i < source.BudgetConfigs.length; i++) {
                this.BudgetConfigs[i] = new BudgetConfig(source.BudgetConfigs[i]);
            }
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForBudget(source.RateLimitConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssociationKeyCount", this.AssociationKeyCount);
        this.setParamSimple(map, prefix + "AssociationModelRouterCount", this.AssociationModelRouterCount);
        this.setParamSimple(map, prefix + "AssociationUserGroupCount", this.AssociationUserGroupCount);
        this.setParamArrayObj(map, prefix + "BudgetConfigs.", this.BudgetConfigs);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

