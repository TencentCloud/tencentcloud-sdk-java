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

public class LogBackupStatisticsModel extends AbstractModel {

    /**
    * <p>平均每个日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageSizePerBackup")
    @Expose
    private Long AverageSizePerBackup;

    /**
    * <p>平均每天日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageSizePerDay")
    @Expose
    private Long AverageSizePerDay;

    /**
    * <p>日志备份个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get <p>平均每个日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageSizePerBackup <p>平均每个日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAverageSizePerBackup() {
        return this.AverageSizePerBackup;
    }

    /**
     * Set <p>平均每个日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageSizePerBackup <p>平均每个日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageSizePerBackup(Long AverageSizePerBackup) {
        this.AverageSizePerBackup = AverageSizePerBackup;
    }

    /**
     * Get <p>平均每天日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageSizePerDay <p>平均每天日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAverageSizePerDay() {
        return this.AverageSizePerDay;
    }

    /**
     * Set <p>平均每天日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageSizePerDay <p>平均每天日志备份大小,单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageSizePerDay(Long AverageSizePerDay) {
        this.AverageSizePerDay = AverageSizePerDay;
    }

    /**
     * Get <p>日志备份个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount <p>日志备份个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>日志备份个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount <p>日志备份个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize <p>日志备份大小，单位Byte</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public LogBackupStatisticsModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogBackupStatisticsModel(LogBackupStatisticsModel source) {
        if (source.AverageSizePerBackup != null) {
            this.AverageSizePerBackup = new Long(source.AverageSizePerBackup);
        }
        if (source.AverageSizePerDay != null) {
            this.AverageSizePerDay = new Long(source.AverageSizePerDay);
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
        this.setParamSimple(map, prefix + "AverageSizePerBackup", this.AverageSizePerBackup);
        this.setParamSimple(map, prefix + "AverageSizePerDay", this.AverageSizePerDay);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

