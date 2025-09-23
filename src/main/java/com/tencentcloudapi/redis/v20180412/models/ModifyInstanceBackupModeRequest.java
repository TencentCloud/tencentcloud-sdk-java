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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceBackupModeRequest extends AbstractModel {

    /**
    * 实例的ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份模式：
- SecondLevelBackup   秒级备份。
- NormalLevelBackup    普通备份。
    */
    @SerializedName("BackupMode")
    @Expose
    private String BackupMode;

    /**
     * Get 实例的ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 实例的ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例的ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 实例的ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份模式：
- SecondLevelBackup   秒级备份。
- NormalLevelBackup    普通备份。 
     * @return BackupMode 备份模式：
- SecondLevelBackup   秒级备份。
- NormalLevelBackup    普通备份。
     */
    public String getBackupMode() {
        return this.BackupMode;
    }

    /**
     * Set 备份模式：
- SecondLevelBackup   秒级备份。
- NormalLevelBackup    普通备份。
     * @param BackupMode 备份模式：
- SecondLevelBackup   秒级备份。
- NormalLevelBackup    普通备份。
     */
    public void setBackupMode(String BackupMode) {
        this.BackupMode = BackupMode;
    }

    public ModifyInstanceBackupModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceBackupModeRequest(ModifyInstanceBackupModeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMode != null) {
            this.BackupMode = new String(source.BackupMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMode", this.BackupMode);

    }
}

