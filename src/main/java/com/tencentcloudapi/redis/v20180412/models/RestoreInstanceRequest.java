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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreInstanceRequest extends AbstractModel{

    /**
    * 待操作的实例ID，可通过 DescribeRedis 接口返回值中的 redisId 获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份ID，可通过 GetRedisBackupList 接口返回值中的 backupId 获取
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 实例密码，恢复实例时，需要校验实例密码（免密实例不需要传密码）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 待操作的实例ID，可通过 DescribeRedis 接口返回值中的 redisId 获取。 
     * @return InstanceId 待操作的实例ID，可通过 DescribeRedis 接口返回值中的 redisId 获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待操作的实例ID，可通过 DescribeRedis 接口返回值中的 redisId 获取。
     * @param InstanceId 待操作的实例ID，可通过 DescribeRedis 接口返回值中的 redisId 获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份ID，可通过 GetRedisBackupList 接口返回值中的 backupId 获取 
     * @return BackupId 备份ID，可通过 GetRedisBackupList 接口返回值中的 backupId 获取
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID，可通过 GetRedisBackupList 接口返回值中的 backupId 获取
     * @param BackupId 备份ID，可通过 GetRedisBackupList 接口返回值中的 backupId 获取
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 实例密码，恢复实例时，需要校验实例密码（免密实例不需要传密码） 
     * @return Password 实例密码，恢复实例时，需要校验实例密码（免密实例不需要传密码）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例密码，恢复实例时，需要校验实例密码（免密实例不需要传密码）
     * @param Password 实例密码，恢复实例时，需要校验实例密码（免密实例不需要传密码）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

