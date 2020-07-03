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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosBackup extends AbstractModel{

    /**
    * 是否开启cos自动备份
    */
    @SerializedName("IsAutoBackup")
    @Expose
    private Boolean IsAutoBackup;

    /**
    * 自动备份执行时间（精确到小时）, e.g. "22:00"
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
     * Get 是否开启cos自动备份 
     * @return IsAutoBackup 是否开启cos自动备份
     */
    public Boolean getIsAutoBackup() {
        return this.IsAutoBackup;
    }

    /**
     * Set 是否开启cos自动备份
     * @param IsAutoBackup 是否开启cos自动备份
     */
    public void setIsAutoBackup(Boolean IsAutoBackup) {
        this.IsAutoBackup = IsAutoBackup;
    }

    /**
     * Get 自动备份执行时间（精确到小时）, e.g. "22:00" 
     * @return BackupTime 自动备份执行时间（精确到小时）, e.g. "22:00"
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 自动备份执行时间（精确到小时）, e.g. "22:00"
     * @param BackupTime 自动备份执行时间（精确到小时）, e.g. "22:00"
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAutoBackup", this.IsAutoBackup);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);

    }
}

