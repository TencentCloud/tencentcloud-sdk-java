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

public class DescribeSecondLevelBackupInfoRequest extends AbstractModel {

    /**
    * 指定实例 ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 秒级备份时间戳。
- 设置范围：支持7天内任意秒级时间点。
-  时间戳格式：Unix 时间戳。
    */
    @SerializedName("BackupTimestamp")
    @Expose
    private Long BackupTimestamp;

    /**
     * Get 指定实例 ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。请登录 [Redis 控制台](https://console.cloud.tencent.com/redis/instance/list)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 秒级备份时间戳。
- 设置范围：支持7天内任意秒级时间点。
-  时间戳格式：Unix 时间戳。 
     * @return BackupTimestamp 秒级备份时间戳。
- 设置范围：支持7天内任意秒级时间点。
-  时间戳格式：Unix 时间戳。
     */
    public Long getBackupTimestamp() {
        return this.BackupTimestamp;
    }

    /**
     * Set 秒级备份时间戳。
- 设置范围：支持7天内任意秒级时间点。
-  时间戳格式：Unix 时间戳。
     * @param BackupTimestamp 秒级备份时间戳。
- 设置范围：支持7天内任意秒级时间点。
-  时间戳格式：Unix 时间戳。
     */
    public void setBackupTimestamp(Long BackupTimestamp) {
        this.BackupTimestamp = BackupTimestamp;
    }

    public DescribeSecondLevelBackupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecondLevelBackupInfoRequest(DescribeSecondLevelBackupInfoRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupTimestamp != null) {
            this.BackupTimestamp = new Long(source.BackupTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupTimestamp", this.BackupTimestamp);

    }
}

