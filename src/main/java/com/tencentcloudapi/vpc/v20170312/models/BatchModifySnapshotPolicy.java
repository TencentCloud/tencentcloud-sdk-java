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

public class BatchModifySnapshotPolicy extends AbstractModel{

    /**
    * 快照策略Id。
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * 快照策略名称。
    */
    @SerializedName("SnapshotPolicyName")
    @Expose
    private String SnapshotPolicyName;

    /**
    * 备份策略。
    */
    @SerializedName("BackupPolicies")
    @Expose
    private BackupPolicy [] BackupPolicies;

    /**
    * 快照保留时间，支持1～365天。
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

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
     * Get 备份策略。 
     * @return BackupPolicies 备份策略。
     */
    public BackupPolicy [] getBackupPolicies() {
        return this.BackupPolicies;
    }

    /**
     * Set 备份策略。
     * @param BackupPolicies 备份策略。
     */
    public void setBackupPolicies(BackupPolicy [] BackupPolicies) {
        this.BackupPolicies = BackupPolicies;
    }

    /**
     * Get 快照保留时间，支持1～365天。 
     * @return KeepTime 快照保留时间，支持1～365天。
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * Set 快照保留时间，支持1～365天。
     * @param KeepTime 快照保留时间，支持1～365天。
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    public BatchModifySnapshotPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifySnapshotPolicy(BatchModifySnapshotPolicy source) {
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.SnapshotPolicyName != null) {
            this.SnapshotPolicyName = new String(source.SnapshotPolicyName);
        }
        if (source.BackupPolicies != null) {
            this.BackupPolicies = new BackupPolicy[source.BackupPolicies.length];
            for (int i = 0; i < source.BackupPolicies.length; i++) {
                this.BackupPolicies[i] = new BackupPolicy(source.BackupPolicies[i]);
            }
        }
        if (source.KeepTime != null) {
            this.KeepTime = new Long(source.KeepTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "SnapshotPolicyName", this.SnapshotPolicyName);
        this.setParamArrayObj(map, prefix + "BackupPolicies.", this.BackupPolicies);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);

    }
}

