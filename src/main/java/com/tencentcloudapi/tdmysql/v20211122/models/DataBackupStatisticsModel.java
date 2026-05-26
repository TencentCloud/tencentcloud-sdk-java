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

public class DataBackupStatisticsModel extends AbstractModel {

    /**
    * 自动备份个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupCount")
    @Expose
    private Long AutoBackupCount;

    /**
    * 自动备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupSize")
    @Expose
    private Long AutoBackupSize;

    /**
    * 平均每个备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageSizePerBackup")
    @Expose
    private Long AverageSizePerBackup;

    /**
    * 平均每天备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageSizePerDay")
    @Expose
    private Long AverageSizePerDay;

    /**
    * 手工备份个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackupCount")
    @Expose
    private Long ManualBackupCount;

    /**
    * 手工备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManualBackupSize")
    @Expose
    private Long ManualBackupSize;

    /**
    * 数据备份个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get 自动备份个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupCount 自动备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoBackupCount() {
        return this.AutoBackupCount;
    }

    /**
     * Set 自动备份个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupCount 自动备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupCount(Long AutoBackupCount) {
        this.AutoBackupCount = AutoBackupCount;
    }

    /**
     * Get 自动备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupSize 自动备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoBackupSize() {
        return this.AutoBackupSize;
    }

    /**
     * Set 自动备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupSize 自动备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupSize(Long AutoBackupSize) {
        this.AutoBackupSize = AutoBackupSize;
    }

    /**
     * Get 平均每个备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageSizePerBackup 平均每个备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAverageSizePerBackup() {
        return this.AverageSizePerBackup;
    }

    /**
     * Set 平均每个备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageSizePerBackup 平均每个备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageSizePerBackup(Long AverageSizePerBackup) {
        this.AverageSizePerBackup = AverageSizePerBackup;
    }

    /**
     * Get 平均每天备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageSizePerDay 平均每天备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAverageSizePerDay() {
        return this.AverageSizePerDay;
    }

    /**
     * Set 平均每天备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageSizePerDay 平均每天备份大小,单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageSizePerDay(Long AverageSizePerDay) {
        this.AverageSizePerDay = AverageSizePerDay;
    }

    /**
     * Get 手工备份个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackupCount 手工备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getManualBackupCount() {
        return this.ManualBackupCount;
    }

    /**
     * Set 手工备份个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackupCount 手工备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackupCount(Long ManualBackupCount) {
        this.ManualBackupCount = ManualBackupCount;
    }

    /**
     * Get 手工备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManualBackupSize 手工备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getManualBackupSize() {
        return this.ManualBackupSize;
    }

    /**
     * Set 手工备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManualBackupSize 手工备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManualBackupSize(Long ManualBackupSize) {
        this.ManualBackupSize = ManualBackupSize;
    }

    /**
     * Get 数据备份个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 数据备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数据备份个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 数据备份个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 数据备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize 数据备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 数据备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize 数据备份大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public DataBackupStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBackupStatisticsModel(DataBackupStatisticsModel source) {
        if (source.AutoBackupCount != null) {
            this.AutoBackupCount = new Long(source.AutoBackupCount);
        }
        if (source.AutoBackupSize != null) {
            this.AutoBackupSize = new Long(source.AutoBackupSize);
        }
        if (source.AverageSizePerBackup != null) {
            this.AverageSizePerBackup = new Long(source.AverageSizePerBackup);
        }
        if (source.AverageSizePerDay != null) {
            this.AverageSizePerDay = new Long(source.AverageSizePerDay);
        }
        if (source.ManualBackupCount != null) {
            this.ManualBackupCount = new Long(source.ManualBackupCount);
        }
        if (source.ManualBackupSize != null) {
            this.ManualBackupSize = new Long(source.ManualBackupSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoBackupCount", this.AutoBackupCount);
        this.setParamSimple(map, prefix + "AutoBackupSize", this.AutoBackupSize);
        this.setParamSimple(map, prefix + "AverageSizePerBackup", this.AverageSizePerBackup);
        this.setParamSimple(map, prefix + "AverageSizePerDay", this.AverageSizePerDay);
        this.setParamSimple(map, prefix + "ManualBackupCount", this.ManualBackupCount);
        this.setParamSimple(map, prefix + "ManualBackupSize", this.ManualBackupSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

