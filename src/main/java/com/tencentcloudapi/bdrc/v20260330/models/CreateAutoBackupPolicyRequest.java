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

public class CreateAutoBackupPolicyRequest extends AbstractModel {

    /**
    * <p>定期备份的执行策略。</p>
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * <p>通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。</p>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * <p>定期备份策略的名称。</p>
    */
    @SerializedName("AutoBackupPolicyName")
    @Expose
    private String AutoBackupPolicyName;

    /**
    * <p>是否激活定期备份策略。</p>
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * <p>通过定期备份策略创建出的备份保留时间。本参数与 RetentionMonths、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * <p>该定期备份策略创建的备份可以保留的月数。本参数与 RetentionDays、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
    */
    @SerializedName("RetentionMonths")
    @Expose
    private Long RetentionMonths;

    /**
    * <p>通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份。本参数与 RetentionDays、RetentionMonths互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
    */
    @SerializedName("RetentionAmount")
    @Expose
    private Long RetentionAmount;

    /**
    * <p>备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。</p>
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * <p>定期备份高级保留策略，该参数不可与 IsPermanent 参数冲突。当 IsPermanent 为 false 或不传、且未传入 RetentionDays / RetentionMonths / RetentionAmount 时，必须传入本参数。</p>
    */
    @SerializedName("AdvancedRetentionPolicy")
    @Expose
    private AdvancedRetentionPolicy AdvancedRetentionPolicy;

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
     * Get <p>通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。</p> 
     * @return IsPermanent <p>通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。</p>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set <p>通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。</p>
     * @param IsPermanent <p>通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。</p>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get <p>定期备份策略的名称。</p> 
     * @return AutoBackupPolicyName <p>定期备份策略的名称。</p>
     */
    public String getAutoBackupPolicyName() {
        return this.AutoBackupPolicyName;
    }

    /**
     * Set <p>定期备份策略的名称。</p>
     * @param AutoBackupPolicyName <p>定期备份策略的名称。</p>
     */
    public void setAutoBackupPolicyName(String AutoBackupPolicyName) {
        this.AutoBackupPolicyName = AutoBackupPolicyName;
    }

    /**
     * Get <p>是否激活定期备份策略。</p> 
     * @return IsActivated <p>是否激活定期备份策略。</p>
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set <p>是否激活定期备份策略。</p>
     * @param IsActivated <p>是否激活定期备份策略。</p>
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get <p>通过定期备份策略创建出的备份保留时间。本参数与 RetentionMonths、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p> 
     * @return RetentionDays <p>通过定期备份策略创建出的备份保留时间。本参数与 RetentionMonths、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set <p>通过定期备份策略创建出的备份保留时间。本参数与 RetentionMonths、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     * @param RetentionDays <p>通过定期备份策略创建出的备份保留时间。本参数与 RetentionMonths、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get <p>该定期备份策略创建的备份可以保留的月数。本参数与 RetentionDays、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p> 
     * @return RetentionMonths <p>该定期备份策略创建的备份可以保留的月数。本参数与 RetentionDays、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     */
    public Long getRetentionMonths() {
        return this.RetentionMonths;
    }

    /**
     * Set <p>该定期备份策略创建的备份可以保留的月数。本参数与 RetentionDays、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     * @param RetentionMonths <p>该定期备份策略创建的备份可以保留的月数。本参数与 RetentionDays、RetentionAmount 互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     */
    public void setRetentionMonths(Long RetentionMonths) {
        this.RetentionMonths = RetentionMonths;
    }

    /**
     * Get <p>通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份。本参数与 RetentionDays、RetentionMonths互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p> 
     * @return RetentionAmount <p>通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份。本参数与 RetentionDays、RetentionMonths互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     */
    public Long getRetentionAmount() {
        return this.RetentionAmount;
    }

    /**
     * Set <p>通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份。本参数与 RetentionDays、RetentionMonths互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     * @param RetentionAmount <p>通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份。本参数与 RetentionDays、RetentionMonths互斥，不可同时传入。当 IsPermanent 为 false 或不传时，RetentionDays / RetentionMonths / RetentionAmount / AdvancedRetentionPolicy 必须传入至少一项有效值。</p>
     */
    public void setRetentionAmount(Long RetentionAmount) {
        this.RetentionAmount = RetentionAmount;
    }

    /**
     * Get <p>备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON</p> 
     * @return StorageType <p>备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON</p>
     * @param StorageType <p>备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。</p> 
     * @return VaultId <p>备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。</p>
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set <p>备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。</p>
     * @param VaultId <p>备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。</p>
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get <p>定期备份高级保留策略，该参数不可与 IsPermanent 参数冲突。当 IsPermanent 为 false 或不传、且未传入 RetentionDays / RetentionMonths / RetentionAmount 时，必须传入本参数。</p> 
     * @return AdvancedRetentionPolicy <p>定期备份高级保留策略，该参数不可与 IsPermanent 参数冲突。当 IsPermanent 为 false 或不传、且未传入 RetentionDays / RetentionMonths / RetentionAmount 时，必须传入本参数。</p>
     */
    public AdvancedRetentionPolicy getAdvancedRetentionPolicy() {
        return this.AdvancedRetentionPolicy;
    }

    /**
     * Set <p>定期备份高级保留策略，该参数不可与 IsPermanent 参数冲突。当 IsPermanent 为 false 或不传、且未传入 RetentionDays / RetentionMonths / RetentionAmount 时，必须传入本参数。</p>
     * @param AdvancedRetentionPolicy <p>定期备份高级保留策略，该参数不可与 IsPermanent 参数冲突。当 IsPermanent 为 false 或不传、且未传入 RetentionDays / RetentionMonths / RetentionAmount 时，必须传入本参数。</p>
     */
    public void setAdvancedRetentionPolicy(AdvancedRetentionPolicy AdvancedRetentionPolicy) {
        this.AdvancedRetentionPolicy = AdvancedRetentionPolicy;
    }

    public CreateAutoBackupPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoBackupPolicyRequest(CreateAutoBackupPolicyRequest source) {
        if (source.Policy != null) {
            this.Policy = new Policy[source.Policy.length];
            for (int i = 0; i < source.Policy.length; i++) {
                this.Policy[i] = new Policy(source.Policy[i]);
            }
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.AutoBackupPolicyName != null) {
            this.AutoBackupPolicyName = new String(source.AutoBackupPolicyName);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Boolean(source.IsActivated);
        }
        if (source.RetentionDays != null) {
            this.RetentionDays = new Long(source.RetentionDays);
        }
        if (source.RetentionMonths != null) {
            this.RetentionMonths = new Long(source.RetentionMonths);
        }
        if (source.RetentionAmount != null) {
            this.RetentionAmount = new Long(source.RetentionAmount);
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
        this.setParamArrayObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "AutoBackupPolicyName", this.AutoBackupPolicyName);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "RetentionDays", this.RetentionDays);
        this.setParamSimple(map, prefix + "RetentionMonths", this.RetentionMonths);
        this.setParamSimple(map, prefix + "RetentionAmount", this.RetentionAmount);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamObj(map, prefix + "AdvancedRetentionPolicy.", this.AdvancedRetentionPolicy);

    }
}

