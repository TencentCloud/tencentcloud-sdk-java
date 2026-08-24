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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoBackupPolicy extends AbstractModel {

    /**
    * 定期备份策略是否激活。
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * 使用该定期备份策略创建出来的备份是否永久保留。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 使用该定期备份策略创建出来的备份是否永久保留。
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * NORMAL
    */
    @SerializedName("AutoBackupPolicyState")
    @Expose
    private String AutoBackupPolicyState;

    /**
    * 备份策略的名称。
    */
    @SerializedName("AutoBackupPolicyName")
    @Expose
    private String AutoBackupPolicyName;

    /**
    * 定期备份的执行策略。
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * 备份策略ID。
    */
    @SerializedName("AutoBackupPolicyId")
    @Expose
    private String AutoBackupPolicyId;

    /**
    * 备份策略的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 使用该定期备份策略创建出来的备份保留天数。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * 用户AppId。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 定期备份策略绑定的实例ID列表。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 该定期快照创建的快照最大保留月数
    */
    @SerializedName("RetentionMonths")
    @Expose
    private Long RetentionMonths;

    /**
    * 该定期快照创建的快照最大保留数量
    */
    @SerializedName("RetentionAmount")
    @Expose
    private Long RetentionAmount;

    /**
    * 创建人。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 策略存储类型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 备份库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 高级保留策略
    */
    @SerializedName("AdvancedRetentionPolicy")
    @Expose
    private AdvancedRetentionPolicy AdvancedRetentionPolicy;

    /**
     * Get 定期备份策略是否激活。 
     * @return IsActivated 定期备份策略是否激活。
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 定期备份策略是否激活。
     * @param IsActivated 定期备份策略是否激活。
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 使用该定期备份策略创建出来的备份是否永久保留。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPermanent 使用该定期备份策略创建出来的备份是否永久保留。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 使用该定期备份策略创建出来的备份是否永久保留。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPermanent 使用该定期备份策略创建出来的备份是否永久保留。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 使用该定期备份策略创建出来的备份是否永久保留。 
     * @return NextTriggerTime 使用该定期备份策略创建出来的备份是否永久保留。
     */
    public String getNextTriggerTime() {
        return this.NextTriggerTime;
    }

    /**
     * Set 使用该定期备份策略创建出来的备份是否永久保留。
     * @param NextTriggerTime 使用该定期备份策略创建出来的备份是否永久保留。
     */
    public void setNextTriggerTime(String NextTriggerTime) {
        this.NextTriggerTime = NextTriggerTime;
    }

    /**
     * Get NORMAL 
     * @return AutoBackupPolicyState NORMAL
     */
    public String getAutoBackupPolicyState() {
        return this.AutoBackupPolicyState;
    }

    /**
     * Set NORMAL
     * @param AutoBackupPolicyState NORMAL
     */
    public void setAutoBackupPolicyState(String AutoBackupPolicyState) {
        this.AutoBackupPolicyState = AutoBackupPolicyState;
    }

    /**
     * Get 备份策略的名称。 
     * @return AutoBackupPolicyName 备份策略的名称。
     */
    public String getAutoBackupPolicyName() {
        return this.AutoBackupPolicyName;
    }

    /**
     * Set 备份策略的名称。
     * @param AutoBackupPolicyName 备份策略的名称。
     */
    public void setAutoBackupPolicyName(String AutoBackupPolicyName) {
        this.AutoBackupPolicyName = AutoBackupPolicyName;
    }

    /**
     * Get 定期备份的执行策略。 
     * @return Policy 定期备份的执行策略。
     */
    public Policy [] getPolicy() {
        return this.Policy;
    }

    /**
     * Set 定期备份的执行策略。
     * @param Policy 定期备份的执行策略。
     */
    public void setPolicy(Policy [] Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 备份策略ID。 
     * @return AutoBackupPolicyId 备份策略ID。
     */
    public String getAutoBackupPolicyId() {
        return this.AutoBackupPolicyId;
    }

    /**
     * Set 备份策略ID。
     * @param AutoBackupPolicyId 备份策略ID。
     */
    public void setAutoBackupPolicyId(String AutoBackupPolicyId) {
        this.AutoBackupPolicyId = AutoBackupPolicyId;
    }

    /**
     * Get 备份策略的创建时间。 
     * @return CreateTime 备份策略的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 备份策略的创建时间。
     * @param CreateTime 备份策略的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 使用该定期备份策略创建出来的备份保留天数。 
     * @return RetentionDays 使用该定期备份策略创建出来的备份保留天数。
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set 使用该定期备份策略创建出来的备份保留天数。
     * @param RetentionDays 使用该定期备份策略创建出来的备份保留天数。
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get 用户AppId。 
     * @return AppId 用户AppId。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId。
     * @param AppId 用户AppId。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 定期备份策略绑定的实例ID列表。 
     * @return InstanceIdSet 定期备份策略绑定的实例ID列表。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 定期备份策略绑定的实例ID列表。
     * @param InstanceIdSet 定期备份策略绑定的实例ID列表。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 该定期快照创建的快照最大保留月数 
     * @return RetentionMonths 该定期快照创建的快照最大保留月数
     */
    public Long getRetentionMonths() {
        return this.RetentionMonths;
    }

    /**
     * Set 该定期快照创建的快照最大保留月数
     * @param RetentionMonths 该定期快照创建的快照最大保留月数
     */
    public void setRetentionMonths(Long RetentionMonths) {
        this.RetentionMonths = RetentionMonths;
    }

    /**
     * Get 该定期快照创建的快照最大保留数量 
     * @return RetentionAmount 该定期快照创建的快照最大保留数量
     */
    public Long getRetentionAmount() {
        return this.RetentionAmount;
    }

    /**
     * Set 该定期快照创建的快照最大保留数量
     * @param RetentionAmount 该定期快照创建的快照最大保留数量
     */
    public void setRetentionAmount(Long RetentionAmount) {
        this.RetentionAmount = RetentionAmount;
    }

    /**
     * Get 创建人。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 创建人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 创建人。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 创建人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 子账号uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 策略存储类型 
     * @return StorageType 策略存储类型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 策略存储类型
     * @param StorageType 策略存储类型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 备份库ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VaultId 备份库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 备份库ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VaultId 备份库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 高级保留策略 
     * @return AdvancedRetentionPolicy 高级保留策略
     */
    public AdvancedRetentionPolicy getAdvancedRetentionPolicy() {
        return this.AdvancedRetentionPolicy;
    }

    /**
     * Set 高级保留策略
     * @param AdvancedRetentionPolicy 高级保留策略
     */
    public void setAdvancedRetentionPolicy(AdvancedRetentionPolicy AdvancedRetentionPolicy) {
        this.AdvancedRetentionPolicy = AdvancedRetentionPolicy;
    }

    public AutoBackupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoBackupPolicy(AutoBackupPolicy source) {
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.NextTriggerTime != null) {
            this.NextTriggerTime = new String(source.NextTriggerTime);
        }
        if (source.AutoBackupPolicyState != null) {
            this.AutoBackupPolicyState = new String(source.AutoBackupPolicyState);
        }
        if (source.AutoBackupPolicyName != null) {
            this.AutoBackupPolicyName = new String(source.AutoBackupPolicyName);
        }
        if (source.Policy != null) {
            this.Policy = new Policy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new Policy(source.Policy[i]);
            }
        }
        if (source.AutoBackupPolicyId != null) {
            this.AutoBackupPolicyId = new String(source.AutoBackupPolicyId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.RetentionMonths != null) {
            this.RetentionMonths = new Long(source.RetentionMonths);
        }
        if (source.RetentionAmount != null) {
            this.RetentionAmount = new Long(source.RetentionAmount);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.AdvancedRetentionPolicy != null) {
            this.AdvancedRetentionPolicy = new AdvancedRetentionPolicy(source.AdvancedRetentionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "NextTriggerTime", this.NextTriggerTime);
        this.setParamSimple(map, prefix + "AutoBackupPolicyState", this.AutoBackupPolicyState);
        this.setParamSimple(map, prefix + "AutoBackupPolicyName", this.AutoBackupPolicyName);
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "AutoBackupPolicyId", this.AutoBackupPolicyId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "RetentionMonths", this.RetentionMonths);
        this.setParamSimple(map, prefix + "RetentionAmount", this.RetentionAmount);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamObj(map, prefix + "AdvancedRetentionPolicy.", this.AdvancedRetentionPolicy);

    }
}

