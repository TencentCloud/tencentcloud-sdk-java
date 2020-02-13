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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBBackupTimeConfig extends AbstractModel{

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
    */
    @SerializedName("StartBackupTime")
    @Expose
    private String StartBackupTime;

    /**
    * 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
    */
    @SerializedName("EndBackupTime")
    @Expose
    private String EndBackupTime;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00 
     * @return StartBackupTime 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     */
    public String getStartBackupTime() {
        return this.StartBackupTime;
    }

    /**
     * Set 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     * @param StartBackupTime 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     */
    public void setStartBackupTime(String StartBackupTime) {
        this.StartBackupTime = StartBackupTime;
    }

    /**
     * Get 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00 
     * @return EndBackupTime 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     */
    public String getEndBackupTime() {
        return this.EndBackupTime;
    }

    /**
     * Set 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     * @param EndBackupTime 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     */
    public void setEndBackupTime(String EndBackupTime) {
        this.EndBackupTime = EndBackupTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartBackupTime", this.StartBackupTime);
        this.setParamSimple(map, prefix + "EndBackupTime", this.EndBackupTime);

    }
}

