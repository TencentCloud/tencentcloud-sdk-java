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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupStrategyRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份类型，当前只支持按天备份，取值为daily
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份时间点，取值为0-23的整数
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
    */
    @SerializedName("BackupDay")
    @Expose
    private Long BackupDay;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份类型，当前只支持按天备份，取值为daily 
     * @return BackupType 备份类型，当前只支持按天备份，取值为daily
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型，当前只支持按天备份，取值为daily
     * @param BackupType 备份类型，当前只支持按天备份，取值为daily
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份时间点，取值为0-23的整数 
     * @return BackupTime 备份时间点，取值为0-23的整数
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间点，取值为0-23的整数
     * @param BackupTime 备份时间点，取值为0-23的整数
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get BackupType取值为daily时，表示备份间隔天数。当前取值只能为1 
     * @return BackupDay BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
     */
    public Long getBackupDay() {
        return this.BackupDay;
    }

    /**
     * Set BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
     * @param BackupDay BackupType取值为daily时，表示备份间隔天数。当前取值只能为1
     */
    public void setBackupDay(Long BackupDay) {
        this.BackupDay = BackupDay;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupDay", this.BackupDay);

    }
}

