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
    * 定期备份的执行策略。
    */
    @SerializedName("Policy")
    @Expose
    private Policy [] Policy;

    /**
    * 通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 定期备份策略的名称。
    */
    @SerializedName("AutoBackupPolicyName")
    @Expose
    private String AutoBackupPolicyName;

    /**
    * 是否激活定期备份策略。
    */
    @SerializedName("IsActivated")
    @Expose
    private Boolean IsActivated;

    /**
    * 通过定期备份策略创建出的备份保留时间。
    */
    @SerializedName("RetentionDays")
    @Expose
    private Long RetentionDays;

    /**
    * 该定期备份策略创建的备份可以保留的月数，该参数不可与IsPermanent/RetentionDays参数冲突。
    */
    @SerializedName("RetentionMonths")
    @Expose
    private Long RetentionMonths;

    /**
    * 通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份，该参数不可与IsPermanent参数冲突。
    */
    @SerializedName("RetentionAmount")
    @Expose
    private Long RetentionAmount;

    /**
    * 备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 定期备份高级保留策略，该参数不可与IsPermanent参数冲突。
    */
    @SerializedName("AdvancedRetentionPolicy")
    @Expose
    private AdvancedRetentionPolicy AdvancedRetentionPolicy;

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
     * Get 通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。 
     * @return IsPermanent 通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。
     * @param IsPermanent 通过该定期备份策略创建的备份是否永久保留。false表示非永久保留，true表示永久保留，默认为false。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 定期备份策略的名称。 
     * @return AutoBackupPolicyName 定期备份策略的名称。
     */
    public String getAutoBackupPolicyName() {
        return this.AutoBackupPolicyName;
    }

    /**
     * Set 定期备份策略的名称。
     * @param AutoBackupPolicyName 定期备份策略的名称。
     */
    public void setAutoBackupPolicyName(String AutoBackupPolicyName) {
        this.AutoBackupPolicyName = AutoBackupPolicyName;
    }

    /**
     * Get 是否激活定期备份策略。 
     * @return IsActivated 是否激活定期备份策略。
     */
    public Boolean getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set 是否激活定期备份策略。
     * @param IsActivated 是否激活定期备份策略。
     */
    public void setIsActivated(Boolean IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get 通过定期备份策略创建出的备份保留时间。 
     * @return RetentionDays 通过定期备份策略创建出的备份保留时间。
     */
    public Long getRetentionDays() {
        return this.RetentionDays;
    }

    /**
     * Set 通过定期备份策略创建出的备份保留时间。
     * @param RetentionDays 通过定期备份策略创建出的备份保留时间。
     */
    public void setRetentionDays(Long RetentionDays) {
        this.RetentionDays = RetentionDays;
    }

    /**
     * Get 该定期备份策略创建的备份可以保留的月数，该参数不可与IsPermanent/RetentionDays参数冲突。 
     * @return RetentionMonths 该定期备份策略创建的备份可以保留的月数，该参数不可与IsPermanent/RetentionDays参数冲突。
     */
    public Long getRetentionMonths() {
        return this.RetentionMonths;
    }

    /**
     * Set 该定期备份策略创建的备份可以保留的月数，该参数不可与IsPermanent/RetentionDays参数冲突。
     * @param RetentionMonths 该定期备份策略创建的备份可以保留的月数，该参数不可与IsPermanent/RetentionDays参数冲突。
     */
    public void setRetentionMonths(Long RetentionMonths) {
        this.RetentionMonths = RetentionMonths;
    }

    /**
     * Get 通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份，该参数不可与IsPermanent参数冲突。 
     * @return RetentionAmount 通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份，该参数不可与IsPermanent参数冲突。
     */
    public Long getRetentionAmount() {
        return this.RetentionAmount;
    }

    /**
     * Set 通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份，该参数不可与IsPermanent参数冲突。
     * @param RetentionAmount 通过该定期备份策略最多保留的备份个数，超过该个数限制后自动删除最先创建的备份，该参数不可与IsPermanent参数冲突。
     */
    public void setRetentionAmount(Long RetentionAmount) {
        this.RetentionAmount = RetentionAmount;
    }

    /**
     * Get 备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON 
     * @return StorageType 备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON
     * @param StorageType 备份存储类型。COMMON表示走普通模式（不需要备份库），VAULT表示走备份库（必须关联一个备份库）。默认为COMMON
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。 
     * @return VaultId 备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。
     * @param VaultId 备份库ID，创建agent备份策略时必须指定。当StorageType为VAULT时必传。
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 定期备份高级保留策略，该参数不可与IsPermanent参数冲突。 
     * @return AdvancedRetentionPolicy 定期备份高级保留策略，该参数不可与IsPermanent参数冲突。
     */
    public AdvancedRetentionPolicy getAdvancedRetentionPolicy() {
        return this.AdvancedRetentionPolicy;
    }

    /**
     * Set 定期备份高级保留策略，该参数不可与IsPermanent参数冲突。
     * @param AdvancedRetentionPolicy 定期备份高级保留策略，该参数不可与IsPermanent参数冲突。
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

