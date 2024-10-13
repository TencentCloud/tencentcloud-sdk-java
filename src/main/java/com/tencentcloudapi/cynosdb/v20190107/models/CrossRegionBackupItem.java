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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossRegionBackupItem extends AbstractModel {

    /**
    * 备份的目标地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * 目标地域的备份任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 目标地域的备份状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStatus")
    @Expose
    private String BackupStatus;

    /**
     * Get 备份的目标地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossRegion 备份的目标地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set 备份的目标地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossRegion 备份的目标地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get 目标地域的备份任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupId 目标地域的备份任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 目标地域的备份任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupId 目标地域的备份任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 目标地域的备份状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStatus 目标地域的备份状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set 目标地域的备份状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStatus 目标地域的备份状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStatus(String BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    public CrossRegionBackupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossRegionBackupItem(CrossRegionBackupItem source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new String(source.BackupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);

    }
}

