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

public class BackupMethodStatisticsModel extends AbstractModel {

    /**
    * <p>自动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupSize")
    @Expose
    private Long AutoBackupSize;

    /**
    * <p>总备份每天平均大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageSizePerDay")
    @Expose
    private Long AverageSizePerDay;

    /**
    * <p>手动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackupSize")
    @Expose
    private Long ManualBackupSize;

    /**
    * <p>总备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get <p>自动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupSize <p>自动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoBackupSize() {
        return this.AutoBackupSize;
    }

    /**
     * Set <p>自动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupSize <p>自动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupSize(Long AutoBackupSize) {
        this.AutoBackupSize = AutoBackupSize;
    }

    /**
     * Get <p>总备份每天平均大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageSizePerDay <p>总备份每天平均大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAverageSizePerDay() {
        return this.AverageSizePerDay;
    }

    /**
     * Set <p>总备份每天平均大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageSizePerDay <p>总备份每天平均大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageSizePerDay(Long AverageSizePerDay) {
        this.AverageSizePerDay = AverageSizePerDay;
    }

    /**
     * Get <p>手动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackupSize <p>手动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getManualBackupSize() {
        return this.ManualBackupSize;
    }

    /**
     * Set <p>手动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackupSize <p>手动备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackupSize(Long ManualBackupSize) {
        this.ManualBackupSize = ManualBackupSize;
    }

    /**
     * Get <p>总备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize <p>总备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set <p>总备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize <p>总备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public BackupMethodStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupMethodStatisticsModel(BackupMethodStatisticsModel source) {
        if (source.AutoBackupSize != null) {
            this.AutoBackupSize = new Long(source.AutoBackupSize);
        }
        if (source.AverageSizePerDay != null) {
            this.AverageSizePerDay = new Long(source.AverageSizePerDay);
        }
        if (source.ManualBackupSize != null) {
            this.ManualBackupSize = new Long(source.ManualBackupSize);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoBackupSize", this.AutoBackupSize);
        this.setParamSimple(map, prefix + "AverageSizePerDay", this.AverageSizePerDay);
        this.setParamSimple(map, prefix + "ManualBackupSize", this.ManualBackupSize);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

