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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupSetsReqFilter extends AbstractModel {

    /**
    * <p>备份方式,多个值用逗号隔开</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>snapshot： 快照备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>备份状态，多个值用逗号隔开，含义说明：等待调度pending， 运行中 running, 成功success,失败 failed</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
    * <p>备份类型，多个值用逗号隔开，含义说明：全量备份 full</p><p>枚举值：</p><ul><li>full： 全量备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>备份触发方式</p><p>枚举值：</p><ul><li>0： 自动备份</li><li>1： 手工备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackup")
    @Expose
    private String ManualBackup;

    /**
     * Get <p>备份方式,多个值用逗号隔开</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>snapshot： 快照备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupMethod <p>备份方式,多个值用逗号隔开</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>snapshot： 快照备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>备份方式,多个值用逗号隔开</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>snapshot： 快照备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupMethod <p>备份方式,多个值用逗号隔开</p><p>枚举值：</p><ul><li>physical： 物理备份</li><li>snapshot： 快照备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>备份状态，多个值用逗号隔开，含义说明：等待调度pending， 运行中 running, 成功success,失败 failed</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStatus <p>备份状态，多个值用逗号隔开，含义说明：等待调度pending， 运行中 running, 成功success,失败 failed</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set <p>备份状态，多个值用逗号隔开，含义说明：等待调度pending， 运行中 running, 成功success,失败 failed</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStatus <p>备份状态，多个值用逗号隔开，含义说明：等待调度pending， 运行中 running, 成功success,失败 failed</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get <p>备份类型，多个值用逗号隔开，含义说明：全量备份 full</p><p>枚举值：</p><ul><li>full： 全量备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupType <p>备份类型，多个值用逗号隔开，含义说明：全量备份 full</p><p>枚举值：</p><ul><li>full： 全量备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>备份类型，多个值用逗号隔开，含义说明：全量备份 full</p><p>枚举值：</p><ul><li>full： 全量备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupType <p>备份类型，多个值用逗号隔开，含义说明：全量备份 full</p><p>枚举值：</p><ul><li>full： 全量备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>备份触发方式</p><p>枚举值：</p><ul><li>0： 自动备份</li><li>1： 手工备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackup <p>备份触发方式</p><p>枚举值：</p><ul><li>0： 自动备份</li><li>1： 手工备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManualBackup() {
        return this.ManualBackup;
    }

    /**
     * Set <p>备份触发方式</p><p>枚举值：</p><ul><li>0： 自动备份</li><li>1： 手工备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackup <p>备份触发方式</p><p>枚举值：</p><ul><li>0： 自动备份</li><li>1： 手工备份</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackup(String ManualBackup) {
        this.ManualBackup = ManualBackup;
    }

    public BackupSetsReqFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupSetsReqFilter(BackupSetsReqFilter source) {
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.ManualBackup != null) {
            this.ManualBackup = new String(source.ManualBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "ManualBackup", this.ManualBackup);

    }
}

