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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualBackupData extends AbstractModel {

    /**
    * 备份类型。snapshot-快照备份
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份方式。auto-自动备份，manual-手动
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 备份时间
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * 跨地域备份项详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossRegionBackupInfos")
    @Expose
    private CrossRegionBackupItem [] CrossRegionBackupInfos;

    /**
     * Get 备份类型。snapshot-快照备份 
     * @return BackupType 备份类型。snapshot-快照备份
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型。snapshot-快照备份
     * @param BackupType 备份类型。snapshot-快照备份
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份方式。auto-自动备份，manual-手动 
     * @return BackupMethod 备份方式。auto-自动备份，manual-手动
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。auto-自动备份，manual-手动
     * @param BackupMethod 备份方式。auto-自动备份，manual-手动
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份时间 
     * @return SnapshotTime 备份时间
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set 备份时间
     * @param SnapshotTime 备份时间
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get 跨地域备份项详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossRegionBackupInfos 跨地域备份项详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CrossRegionBackupItem [] getCrossRegionBackupInfos() {
        return this.CrossRegionBackupInfos;
    }

    /**
     * Set 跨地域备份项详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossRegionBackupInfos 跨地域备份项详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossRegionBackupInfos(CrossRegionBackupItem [] CrossRegionBackupInfos) {
        this.CrossRegionBackupInfos = CrossRegionBackupInfos;
    }

    public ManualBackupData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualBackupData(ManualBackupData source) {
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
        if (source.CrossRegionBackupInfos != null) {
            this.CrossRegionBackupInfos = new CrossRegionBackupItem[source.CrossRegionBackupInfos.length];
            for (int i = 0; i < source.CrossRegionBackupInfos.length; i++) {
                this.CrossRegionBackupInfos[i] = new CrossRegionBackupItem(source.CrossRegionBackupInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamArrayObj(map, prefix + "CrossRegionBackupInfos.", this.CrossRegionBackupInfos);

    }
}

