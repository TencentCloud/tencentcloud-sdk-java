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

public class KeyInfo extends AbstractModel {

    /**
    * <p>是否禁用Key</p>
    */
    @SerializedName("Blocked")
    @Expose
    private Boolean Blocked;

    /**
    * <p>Key关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>Key关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Key按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
    */
    @SerializedName("CreditUsageSet")
    @Expose
    private CreditUsage [] CreditUsageSet;

    /**
    * <p>Key的值</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Key的ID</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>Key名称</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>限速信息</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForKey RateLimitConfig;

    /**
    * <p>Key状态</p><p>枚举值：</p><ul><li>Active： 正常</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>所属的用户组ID</p>
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * <p>所属的用户组名称</p>
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
     * Get <p>是否禁用Key</p> 
     * @return Blocked <p>是否禁用Key</p>
     */
    public Boolean getBlocked() {
        return this.Blocked;
    }

    /**
     * Set <p>是否禁用Key</p>
     * @param Blocked <p>是否禁用Key</p>
     */
    public void setBlocked(Boolean Blocked) {
        this.Blocked = Blocked;
    }

    /**
     * Get <p>Key关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetId <p>Key关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>Key关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetId <p>Key关联的Budget ID。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>Key关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetName <p>Key关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set <p>Key关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetName <p>Key关联的Budget名称。</p><p>未关联Budget时返回空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

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
     * Get <p>Key按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p> 
     * @return CreditUsageSet <p>Key按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
     */
    public CreditUsage [] getCreditUsageSet() {
        return this.CreditUsageSet;
    }

    /**
     * Set <p>Key按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
     * @param CreditUsageSet <p>Key按Budget刷新周期划分的Credit使用情况。</p><p>当关联Budget配置多个刷新周期时，按1d、7d、30d顺序返回各周期用量；未关联Budget时返回空数组。</p>
     */
    public void setCreditUsageSet(CreditUsage [] CreditUsageSet) {
        this.CreditUsageSet = CreditUsageSet;
    }

    /**
     * Get <p>Key的值</p> 
     * @return Key <p>Key的值</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Key的值</p>
     * @param Key <p>Key的值</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Key的ID</p> 
     * @return KeyId <p>Key的ID</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>Key的ID</p>
     * @param KeyId <p>Key的ID</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>Key名称</p> 
     * @return KeyName <p>Key名称</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>Key名称</p>
     * @param KeyName <p>Key名称</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
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
     * Get <p>限速信息</p> 
     * @return RateLimitConfig <p>限速信息</p>
     */
    public RateLimitConfigForKey getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>限速信息</p>
     * @param RateLimitConfig <p>限速信息</p>
     */
    public void setRateLimitConfig(RateLimitConfigForKey RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>Key状态</p><p>枚举值：</p><ul><li>Active： 正常</li></ul> 
     * @return Status <p>Key状态</p><p>枚举值：</p><ul><li>Active： 正常</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Key状态</p><p>枚举值：</p><ul><li>Active： 正常</li></ul>
     * @param Status <p>Key状态</p><p>枚举值：</p><ul><li>Active： 正常</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>所属的用户组ID</p> 
     * @return UserGroupId <p>所属的用户组ID</p>
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set <p>所属的用户组ID</p>
     * @param UserGroupId <p>所属的用户组ID</p>
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get <p>所属的用户组名称</p> 
     * @return UserGroupName <p>所属的用户组名称</p>
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set <p>所属的用户组名称</p>
     * @param UserGroupName <p>所属的用户组名称</p>
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    public KeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyInfo(KeyInfo source) {
        if (source.Blocked != null) {
            this.Blocked = new Boolean(source.Blocked);
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
        if (source.CreditUsageSet != null) {
            this.CreditUsageSet = new CreditUsage[source.CreditUsageSet.length];
            for (int i = 0; i < source.CreditUsageSet.length; i++) {
                this.CreditUsageSet[i] = new CreditUsage(source.CreditUsageSet[i]);
            }
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForKey(source.RateLimitConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Blocked", this.Blocked);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "CreditUsageSet.", this.CreditUsageSet);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);

    }
}

