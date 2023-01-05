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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotPolicy extends AbstractModel{

    /**
    * 快照策略名称。
    */
    @SerializedName("SnapshotPolicyName")
    @Expose
    private String SnapshotPolicyName;

    /**
    * 备份策略类型，operate-操作备份，time-定时备份。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 保留时间，支持1～365天。
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * 是否创建新的cos桶，默认为False。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateNewCos")
    @Expose
    private Boolean CreateNewCos;

    /**
    * cos桶所在地域。
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * cos桶。
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * 快照策略Id。
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * 时间备份策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupPolicies")
    @Expose
    private BackupPolicy [] BackupPolicies;

    /**
    * 启用状态，True-启用，False-停用，默认为True。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 快照策略名称。 
     * @return SnapshotPolicyName 快照策略名称。
     */
    public String getSnapshotPolicyName() {
        return this.SnapshotPolicyName;
    }

    /**
     * Set 快照策略名称。
     * @param SnapshotPolicyName 快照策略名称。
     */
    public void setSnapshotPolicyName(String SnapshotPolicyName) {
        this.SnapshotPolicyName = SnapshotPolicyName;
    }

    /**
     * Get 备份策略类型，operate-操作备份，time-定时备份。 
     * @return BackupType 备份策略类型，operate-操作备份，time-定时备份。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份策略类型，operate-操作备份，time-定时备份。
     * @param BackupType 备份策略类型，operate-操作备份，time-定时备份。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 保留时间，支持1～365天。 
     * @return KeepTime 保留时间，支持1～365天。
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set 保留时间，支持1～365天。
     * @param KeepTime 保留时间，支持1～365天。
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * Get 是否创建新的cos桶，默认为False。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateNewCos 是否创建新的cos桶，默认为False。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCreateNewCos() {
        return this.CreateNewCos;
    }

    /**
     * Set 是否创建新的cos桶，默认为False。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateNewCos 是否创建新的cos桶，默认为False。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateNewCos(Boolean CreateNewCos) {
        this.CreateNewCos = CreateNewCos;
    }

    /**
     * Get cos桶所在地域。 
     * @return CosRegion cos桶所在地域。
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set cos桶所在地域。
     * @param CosRegion cos桶所在地域。
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get cos桶。 
     * @return CosBucket cos桶。
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set cos桶。
     * @param CosBucket cos桶。
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get 快照策略Id。 
     * @return SnapshotPolicyId 快照策略Id。
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set 快照策略Id。
     * @param SnapshotPolicyId 快照策略Id。
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
    }

    /**
     * Get 时间备份策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupPolicies 时间备份策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupPolicy [] getBackupPolicies() {
        return this.BackupPolicies;
    }

    /**
     * Set 时间备份策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupPolicies 时间备份策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupPolicies(BackupPolicy [] BackupPolicies) {
        this.BackupPolicies = BackupPolicies;
    }

    /**
     * Get 启用状态，True-启用，False-停用，默认为True。 
     * @return Enable 启用状态，True-启用，False-停用，默认为True。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 启用状态，True-启用，False-停用，默认为True。
     * @param Enable 启用状态，True-启用，False-停用，默认为True。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public SnapshotPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotPolicy(SnapshotPolicy source) {
        if (source.SnapshotPolicyName != null) {
            this.SnapshotPolicyName = new String(source.SnapshotPolicyName);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
        if (source.CreateNewCos != null) {
            this.CreateNewCos = new Boolean(source.CreateNewCos);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.BackupPolicies != null) {
            this.BackupPolicies = new BackupPolicy[source.BackupPolicies.length];
            for (int i = 0; i < source.BackupPolicies.length; i++) {
                this.BackupPolicies[i] = new BackupPolicy(source.BackupPolicies[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotPolicyName", this.SnapshotPolicyName);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamSimple(map, prefix + "CreateNewCos", this.CreateNewCos);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamArrayObj(map, prefix + "BackupPolicies.", this.BackupPolicies);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

