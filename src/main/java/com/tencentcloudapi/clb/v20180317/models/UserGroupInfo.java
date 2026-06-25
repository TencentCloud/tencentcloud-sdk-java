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

public class UserGroupInfo extends AbstractModel {

    /**
    * <p>用户组ID。「未分组」虚拟分组固定为 ugrp-ungrouped。</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * <p>用户组名称。「未分组」虚拟分组固定为 ungrouped。</p>
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * <p>所属模型路由实例ID。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>用户组状态。</p><p>枚举值：</p><ul><li>Creating：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>Deleting：删除中</li></ul><p>「未分组」虚拟分组（ugrp-ungrouped）恒为 Active。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>用户组真实模型白名单。「未分组」虚拟分组为空数组。</p>
    */
    @SerializedName("Models")
    @Expose
    private String [] Models;

    /**
    * <p>用户组意图路由白名单（ir-xxx）。「未分组」虚拟分组为空数组。</p>
    */
    @SerializedName("IntentRouters")
    @Expose
    private String [] IntentRouters;

    /**
    * <p>关联的Budget ID。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>关联的Budget名称。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * <p>用户组多刷新周期 Credit 使用情况。</p><p>无多周期预算时为空数组。</p>
    */
    @SerializedName("CreditUsageSet")
    @Expose
    private CreditUsage [] CreditUsageSet;

    /**
    * <p>用户组当前包含的 Key 数量。「未分组」虚拟分组（ugrp-ungrouped）返回该模型路由实例下未归属任何用户组的 Key 数量。</p>
    */
    @SerializedName("KeyCount")
    @Expose
    private Long KeyCount;

    /**
    * <p>标签列表。「未分组」虚拟分组为空数组。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>创建时间。「未分组」虚拟分组不返回此字段。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>修改时间。「未分组」虚拟分组不返回此字段。</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get <p>用户组ID。「未分组」虚拟分组固定为 ugrp-ungrouped。</p> 
     * @return UserGroupId <p>用户组ID。「未分组」虚拟分组固定为 ugrp-ungrouped。</p>
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>用户组ID。「未分组」虚拟分组固定为 ugrp-ungrouped。</p>
     * @param UserGroupId <p>用户组ID。「未分组」虚拟分组固定为 ugrp-ungrouped。</p>
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get <p>用户组名称。「未分组」虚拟分组固定为 ungrouped。</p> 
     * @return UserGroupName <p>用户组名称。「未分组」虚拟分组固定为 ungrouped。</p>
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set <p>用户组名称。「未分组」虚拟分组固定为 ungrouped。</p>
     * @param UserGroupName <p>用户组名称。「未分组」虚拟分组固定为 ungrouped。</p>
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get <p>所属模型路由实例ID。</p> 
     * @return ModelRouterId <p>所属模型路由实例ID。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>所属模型路由实例ID。</p>
     * @param ModelRouterId <p>所属模型路由实例ID。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>用户组状态。</p><p>枚举值：</p><ul><li>Creating：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>Deleting：删除中</li></ul><p>「未分组」虚拟分组（ugrp-ungrouped）恒为 Active。</p> 
     * @return Status <p>用户组状态。</p><p>枚举值：</p><ul><li>Creating：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>Deleting：删除中</li></ul><p>「未分组」虚拟分组（ugrp-ungrouped）恒为 Active。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>用户组状态。</p><p>枚举值：</p><ul><li>Creating：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>Deleting：删除中</li></ul><p>「未分组」虚拟分组（ugrp-ungrouped）恒为 Active。</p>
     * @param Status <p>用户组状态。</p><p>枚举值：</p><ul><li>Creating：创建中</li><li>Active：正常</li><li>Configuring：配置中</li><li>Deleting：删除中</li></ul><p>「未分组」虚拟分组（ugrp-ungrouped）恒为 Active。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>用户组真实模型白名单。「未分组」虚拟分组为空数组。</p> 
     * @return Models <p>用户组真实模型白名单。「未分组」虚拟分组为空数组。</p>
     */
    public String [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>用户组真实模型白名单。「未分组」虚拟分组为空数组。</p>
     * @param Models <p>用户组真实模型白名单。「未分组」虚拟分组为空数组。</p>
     */
    public void setModels(String [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>用户组意图路由白名单（ir-xxx）。「未分组」虚拟分组为空数组。</p> 
     * @return IntentRouters <p>用户组意图路由白名单（ir-xxx）。「未分组」虚拟分组为空数组。</p>
     */
    public String [] getIntentRouters() {
        return this.IntentRouters;
    }

    /**
     * Set <p>用户组意图路由白名单（ir-xxx）。「未分组」虚拟分组为空数组。</p>
     * @param IntentRouters <p>用户组意图路由白名单（ir-xxx）。「未分组」虚拟分组为空数组。</p>
     */
    public void setIntentRouters(String [] IntentRouters) {
        this.IntentRouters = IntentRouters;
    }

    /**
     * Get <p>关联的Budget ID。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetId <p>关联的Budget ID。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>关联的Budget ID。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetId <p>关联的Budget ID。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>关联的Budget名称。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetName <p>关联的Budget名称。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set <p>关联的Budget名称。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetName <p>关联的Budget名称。</p><p>未关联时为空；「未分组」虚拟分组恒为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get <p>用户组多刷新周期 Credit 使用情况。</p><p>无多周期预算时为空数组。</p> 
     * @return CreditUsageSet <p>用户组多刷新周期 Credit 使用情况。</p><p>无多周期预算时为空数组。</p>
     */
    public CreditUsage [] getCreditUsageSet() {
        return this.CreditUsageSet;
    }

    /**
     * Set <p>用户组多刷新周期 Credit 使用情况。</p><p>无多周期预算时为空数组。</p>
     * @param CreditUsageSet <p>用户组多刷新周期 Credit 使用情况。</p><p>无多周期预算时为空数组。</p>
     */
    public void setCreditUsageSet(CreditUsage [] CreditUsageSet) {
        this.CreditUsageSet = CreditUsageSet;
    }

    /**
     * Get <p>用户组当前包含的 Key 数量。「未分组」虚拟分组（ugrp-ungrouped）返回该模型路由实例下未归属任何用户组的 Key 数量。</p> 
     * @return KeyCount <p>用户组当前包含的 Key 数量。「未分组」虚拟分组（ugrp-ungrouped）返回该模型路由实例下未归属任何用户组的 Key 数量。</p>
     */
    public Long getKeyCount() {
        return this.KeyCount;
    }

    /**
     * Set <p>用户组当前包含的 Key 数量。「未分组」虚拟分组（ugrp-ungrouped）返回该模型路由实例下未归属任何用户组的 Key 数量。</p>
     * @param KeyCount <p>用户组当前包含的 Key 数量。「未分组」虚拟分组（ugrp-ungrouped）返回该模型路由实例下未归属任何用户组的 Key 数量。</p>
     */
    public void setKeyCount(Long KeyCount) {
        this.KeyCount = KeyCount;
    }

    /**
     * Get <p>标签列表。「未分组」虚拟分组为空数组。</p> 
     * @return Tags <p>标签列表。「未分组」虚拟分组为空数组。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表。「未分组」虚拟分组为空数组。</p>
     * @param Tags <p>标签列表。「未分组」虚拟分组为空数组。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>创建时间。「未分组」虚拟分组不返回此字段。</p> 
     * @return CreatedTime <p>创建时间。「未分组」虚拟分组不返回此字段。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间。「未分组」虚拟分组不返回此字段。</p>
     * @param CreatedTime <p>创建时间。「未分组」虚拟分组不返回此字段。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>修改时间。「未分组」虚拟分组不返回此字段。</p> 
     * @return ModifiedTime <p>修改时间。「未分组」虚拟分组不返回此字段。</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>修改时间。「未分组」虚拟分组不返回此字段。</p>
     * @param ModifiedTime <p>修改时间。「未分组」虚拟分组不返回此字段。</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public UserGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupInfo(UserGroupInfo source) {
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Models != null) {
            this.Models = new String[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new String(source.Models[i]);
            }
        }
        if (source.IntentRouters != null) {
            this.IntentRouters = new String[source.IntentRouters.length];
            for (int i = 0; i < source.IntentRouters.length; i++) {
                this.IntentRouters[i] = new String(source.IntentRouters[i]);
            }
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.CreditUsageSet != null) {
            this.CreditUsageSet = new CreditUsage[source.CreditUsageSet.length];
            for (int i = 0; i < source.CreditUsageSet.length; i++) {
                this.CreditUsageSet[i] = new CreditUsage(source.CreditUsageSet[i]);
            }
        }
        if (source.KeyCount != null) {
            this.KeyCount = new Long(source.KeyCount);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Models.", this.Models);
        this.setParamArraySimple(map, prefix + "IntentRouters.", this.IntentRouters);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamArrayObj(map, prefix + "CreditUsageSet.", this.CreditUsageSet);
        this.setParamSimple(map, prefix + "KeyCount", this.KeyCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

