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

public class BackupStrategy extends AbstractModel {

    /**
    * 全量备份开始时间。周期性的全量备份将在当天该时间开始。
    */
    @SerializedName("BackupStartTime")
    @Expose
    private String BackupStartTime;

    /**
    * 存储策略。
    */
    @SerializedName("StorageStrategy")
    @Expose
    private StorageStrategy StorageStrategy;

    /**
    * 备份周期。
    */
    @SerializedName("BackupPeriod")
    @Expose
    private BackupPeriod BackupPeriod;

    /**
    * 备份方法。目前仅支持 "logical" - 逻辑备份。
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
    */
    @SerializedName("EnableIncrement")
    @Expose
    private Boolean EnableIncrement;

    /**
     * Get 全量备份开始时间。周期性的全量备份将在当天该时间开始。 
     * @return BackupStartTime 全量备份开始时间。周期性的全量备份将在当天该时间开始。
     */
    public String getBackupStartTime() {
        return this.BackupStartTime;
    }

    /**
     * Set 全量备份开始时间。周期性的全量备份将在当天该时间开始。
     * @param BackupStartTime 全量备份开始时间。周期性的全量备份将在当天该时间开始。
     */
    public void setBackupStartTime(String BackupStartTime) {
        this.BackupStartTime = BackupStartTime;
    }

    /**
     * Get 存储策略。 
     * @return StorageStrategy 存储策略。
     */
    public StorageStrategy getStorageStrategy() {
        return this.StorageStrategy;
    }

    /**
     * Set 存储策略。
     * @param StorageStrategy 存储策略。
     */
    public void setStorageStrategy(StorageStrategy StorageStrategy) {
        this.StorageStrategy = StorageStrategy;
    }

    /**
     * Get 备份周期。 
     * @return BackupPeriod 备份周期。
     */
    public BackupPeriod getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set 备份周期。
     * @param BackupPeriod 备份周期。
     */
    public void setBackupPeriod(BackupPeriod BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get 备份方法。目前仅支持 "logical" - 逻辑备份。 
     * @return BackupMethod 备份方法。目前仅支持 "logical" - 逻辑备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方法。目前仅支持 "logical" - 逻辑备份。
     * @param BackupMethod 备份方法。目前仅支持 "logical" - 逻辑备份。
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
     * @return EnableIncrement 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
     */
    public Boolean getEnableIncrement() {
        return this.EnableIncrement;
    }

    /**
     * Set 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
     * @param EnableIncrement 是否开启增量备份。可能的取值为["true", "false"]。默认值为"true"。
     */
    public void setEnableIncrement(Boolean EnableIncrement) {
        this.EnableIncrement = EnableIncrement;
    }

    public BackupStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStrategy(BackupStrategy source) {
        if (source.BackupStartTime != null) {
            this.BackupStartTime = new String(source.BackupStartTime);
        }
        if (source.StorageStrategy != null) {
            this.StorageStrategy = new StorageStrategy(source.StorageStrategy);
        }
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new BackupPeriod(source.BackupPeriod);
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

