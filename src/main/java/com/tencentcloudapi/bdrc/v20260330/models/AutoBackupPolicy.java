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
    * <p>定期备份策略是否激活。</p>
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * <p>NORMAL</p>
    */
    @SerializedName("AutoBackupPolicyState")
    @Expose
    private String AutoBackupPolicyState;

    /**
    * <p>备份策略的名称。</p>
    */
    @SerializedName("AutoBackupPolicyName")
    @Expose
    private String AutoBackupPolicyName;

    /**
    * <p>定期备份的执行策略。</p>
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * <p>备份策略ID。</p>
    */
    @SerializedName("AutoBackupPolicyId")
    @Expose
    private String AutoBackupPolicyId;

    /**
    * <p>备份策略的创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>使用该定期备份策略创建出来的备份保留天数。</p>
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * <p>用户AppId。</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>定期备份策略绑定的实例ID列表。</p>
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * <p>使用该定期备份策略创建的备份最大保留月数</p>
    */
    @SerializedName("RetentionMonths")
    @Expose
    private Long RetentionMonths;

    /**
    * <p>使用该定期备份策略创建的备份最大保留数量</p>
    */
    @SerializedName("RetentionAmount")
    @Expose
    private Long RetentionAmount;

    /**
    * <p>创建人。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * <p>子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>策略存储类型</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>备份库ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * <p>高级保留策略</p>
    */
    @SerializedName("AdvancedRetentionPolicy")
    @Expose
    private AdvancedRetentionPolicy AdvancedRetentionPolicy;

    /**
    * <p>备份资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupResourceInfos")
    @Expose
    private BackupResourceInfo [] BackupResourceInfos;

    /**
     * Get <p>定期备份策略是否激活。</p> 
     * @return IsActivated <p>定期备份策略是否激活。</p>
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set <p>定期备份策略是否激活。</p>
     * @param IsActivated <p>定期备份策略是否激活。</p>
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPermanent <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPermanent <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get <p>使用该定期备份策略创建出来的备份是否永久保留。</p> 
     * @return NextTriggerTime <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
     */
    public String getNextTriggerTime() {
        return this.NextTriggerTime;
    }

    /**
     * Set <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
     * @param NextTriggerTime <p>使用该定期备份策略创建出来的备份是否永久保留。</p>
     */
    public void setNextTriggerTime(String NextTriggerTime) {
        this.NextTriggerTime = NextTriggerTime;
    }

    /**
     * Get <p>NORMAL</p> 
     * @return AutoBackupPolicyState <p>NORMAL</p>
     */
    public String getAutoBackupPolicyState() {
        return this.AutoBackupPolicyState;
    }

    /**
     * Set <p>NORMAL</p>
     * @param AutoBackupPolicyState <p>NORMAL</p>
     */
    public void setAutoBackupPolicyState(String AutoBackupPolicyState) {
        this.AutoBackupPolicyState = AutoBackupPolicyState;
    }

    /**
     * Get <p>备份策略的名称。</p> 
     * @return AutoBackupPolicyName <p>备份策略的名称。</p>
     */
    public String getAutoBackupPolicyName() {
        return this.AutoBackupPolicyName;
    }

    /**
     * Set <p>备份策略的名称。</p>
     * @param AutoBackupPolicyName <p>备份策略的名称。</p>
     */
    public void setAutoBackupPolicyName(String AutoBackupPolicyName) {
        this.AutoBackupPolicyName = AutoBackupPolicyName;
    }

    /**
     * Get <p>定期备份的执行策略。</p> 
     * @return Policy <p>定期备份的执行策略。</p>
     */
    public Policy [] getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>定期备份的执行策略。</p>
     * @param Policy <p>定期备份的执行策略。</p>
     */
    public void setPolicy(Policy [] Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>备份策略ID。</p> 
     * @return AutoBackupPolicyId <p>备份策略ID。</p>
     */
    public String getAutoBackupPolicyId() {
        return this.AutoBackupPolicyId;
    }

    /**
     * Set <p>备份策略ID。</p>
     * @param AutoBackupPolicyId <p>备份策略ID。</p>
     */
    public void setAutoBackupPolicyId(String AutoBackupPolicyId) {
        this.AutoBackupPolicyId = AutoBackupPolicyId;
    }

    /**
     * Get <p>备份策略的创建时间。</p> 
     * @return CreateTime <p>备份策略的创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>备份策略的创建时间。</p>
     * @param CreateTime <p>备份策略的创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>使用该定期备份策略创建出来的备份保留天数。</p> 
     * @return RetentionDays <p>使用该定期备份策略创建出来的备份保留天数。</p>
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set <p>使用该定期备份策略创建出来的备份保留天数。</p>
     * @param RetentionDays <p>使用该定期备份策略创建出来的备份保留天数。</p>
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get <p>用户AppId。</p> 
     * @return AppId <p>用户AppId。</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppId。</p>
     * @param AppId <p>用户AppId。</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>定期备份策略绑定的实例ID列表。</p> 
     * @return InstanceIdSet <p>定期备份策略绑定的实例ID列表。</p>
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set <p>定期备份策略绑定的实例ID列表。</p>
     * @param InstanceIdSet <p>定期备份策略绑定的实例ID列表。</p>
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get <p>使用该定期备份策略创建的备份最大保留月数</p> 
     * @return RetentionMonths <p>使用该定期备份策略创建的备份最大保留月数</p>
     */
    public Long getRetentionMonths() {
        return this.RetentionMonths;
    }

    /**
     * Set <p>使用该定期备份策略创建的备份最大保留月数</p>
     * @param RetentionMonths <p>使用该定期备份策略创建的备份最大保留月数</p>
     */
    public void setRetentionMonths(Long RetentionMonths) {
        this.RetentionMonths = RetentionMonths;
    }

    /**
     * Get <p>使用该定期备份策略创建的备份最大保留数量</p> 
     * @return RetentionAmount <p>使用该定期备份策略创建的备份最大保留数量</p>
     */
    public Long getRetentionAmount() {
        return this.RetentionAmount;
    }

    /**
     * Set <p>使用该定期备份策略创建的备份最大保留数量</p>
     * @param RetentionAmount <p>使用该定期备份策略创建的备份最大保留数量</p>
     */
    public void setRetentionAmount(Long RetentionAmount) {
        this.RetentionAmount = RetentionAmount;
    }

    /**
     * Get <p>创建人。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName <p>创建人。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>创建人。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName <p>创建人。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get <p>子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin <p>子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin <p>子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>策略存储类型</p> 
     * @return StorageType <p>策略存储类型</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>策略存储类型</p>
     * @param StorageType <p>策略存储类型</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>备份库ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VaultId <p>备份库ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set <p>备份库ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VaultId <p>备份库ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get <p>高级保留策略</p> 
     * @return AdvancedRetentionPolicy <p>高级保留策略</p>
     */
    public AdvancedRetentionPolicy getAdvancedRetentionPolicy() {
        return this.AdvancedRetentionPolicy;
    }

    /**
     * Set <p>高级保留策略</p>
     * @param AdvancedRetentionPolicy <p>高级保留策略</p>
     */
    public void setAdvancedRetentionPolicy(AdvancedRetentionPolicy AdvancedRetentionPolicy) {
        this.AdvancedRetentionPolicy = AdvancedRetentionPolicy;
    }

    /**
     * Get <p>备份资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupResourceInfos <p>备份资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupResourceInfo [] getBackupResourceInfos() {
        return this.BackupResourceInfos;
    }

    /**
     * Set <p>备份资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupResourceInfos <p>备份资源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupResourceInfos(BackupResourceInfo [] BackupResourceInfos) {
        this.BackupResourceInfos = BackupResourceInfos;
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
        if (source.BackupResourceInfos != null) {
            this.BackupResourceInfos = new BackupResourceInfo[source.BackupResourceInfos.length];
            for (int i = 0; i < source.BackupResourceInfos.length; i++) {
                this.BackupResourceInfos[i] = new BackupResourceInfo(source.BackupResourceInfos[i]);
            }
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
        this.setParamArrayObj(map, prefix + "BackupResourceInfos.", this.BackupResourceInfos);

    }
}

