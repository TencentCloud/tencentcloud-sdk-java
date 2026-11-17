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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStrategyItem extends AbstractModel {

    /**
    * 全量备份开始时间。周期性的全量备份将在当天该时间开始，格式：HH:mm（24 小时制），如 02:00。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStartTime")
    @Expose
    private String BackupStartTime;

    /**
    * 存储策略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageStrategy")
    @Expose
    private StorageStrategyItem StorageStrategy;

    /**
    * 备份周期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupPeriod")
    @Expose
    private BackupPeriodItem BackupPeriod;

    /**
    * 备份方法。目前仅支持 "logical" - 逻辑备份。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 备份周期。支持的值包括：
"period" - 周期性备份；
"single" - 单次备份。
默认值为"period"。
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableIncrement")
    @Expose
    private Boolean EnableIncrement;

    /**
     * Get 全量备份开始时间。周期性的全量备份将在当天该时间开始，格式：HH:mm（24 小时制），如 02:00。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStartTime 全量备份开始时间。周期性的全量备份将在当天该时间开始，格式：HH:mm（24 小时制），如 02:00。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupStartTime() {
        return this.BackupStartTime;
    }

    /**
     * Set 全量备份开始时间。周期性的全量备份将在当天该时间开始，格式：HH:mm（24 小时制），如 02:00。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStartTime 全量备份开始时间。周期性的全量备份将在当天该时间开始，格式：HH:mm（24 小时制），如 02:00。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStartTime(String BackupStartTime) {
        this.BackupStartTime = BackupStartTime;
    }

    /**
     * Get 存储策略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageStrategy 存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageStrategyItem getStorageStrategy() {
        return this.StorageStrategy;
    }

    /**
     * Set 存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageStrategy 存储策略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageStrategy(StorageStrategyItem StorageStrategy) {
        this.StorageStrategy = StorageStrategy;
    }

    /**
     * Get 备份周期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupPeriod 备份周期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupPeriodItem getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set 备份周期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupPeriod 备份周期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupPeriod(BackupPeriodItem BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get 备份方法。目前仅支持 "logical" - 逻辑备份。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupMethod 备份方法。目前仅支持 "logical" - 逻辑备份。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方法。目前仅支持 "logical" - 逻辑备份。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupMethod 备份方法。目前仅支持 "logical" - 逻辑备份。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份周期。支持的值包括：
"period" - 周期性备份；
"single" - 单次备份。
默认值为"period"。 
     * @return StrategyType 备份周期。支持的值包括：
"period" - 周期性备份；
"single" - 单次备份。
默认值为"period"。
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 备份周期。支持的值包括：
"period" - 周期性备份；
"single" - 单次备份。
默认值为"period"。
     * @param StrategyType 备份周期。支持的值包括：
"period" - 周期性备份；
"single" - 单次备份。
默认值为"period"。
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableIncrement 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableIncrement() {
        return this.EnableIncrement;
    }

    /**
     * Set 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableIncrement 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableIncrement(Boolean EnableIncrement) {
        this.EnableIncrement = EnableIncrement;
    }

    public BackupStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStrategyItem(BackupStrategyItem source) {
        if (source.BackupStartTime != null) {
            this.BackupStartTime = new String(source.BackupStartTime);
        }
        if (source.StorageStrategy != null) {
            this.StorageStrategy = new StorageStrategyItem(source.StorageStrategy);
        }
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new BackupPeriodItem(source.BackupPeriod);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.EnableIncrement != null) {
            this.EnableIncrement = new Boolean(source.EnableIncrement);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupStartTime", this.BackupStartTime);
        this.setParamObj(map, prefix + "StorageStrategy.", this.StorageStrategy);
        this.setParamObj(map, prefix + "BackupPeriod.", this.BackupPeriod);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "EnableIncrement", this.EnableIncrement);

    }
}

