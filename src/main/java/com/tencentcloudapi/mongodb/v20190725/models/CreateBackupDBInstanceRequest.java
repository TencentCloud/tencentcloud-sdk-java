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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupDBInstanceRequest extends AbstractModel {

    /**
    * 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 设置备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 备份备注信息。
    */
    @SerializedName("BackupRemark")
    @Expose
    private String BackupRemark;

    /**
     * Get 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 实例 ID。例如：cmgo-p8vn****。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 设置备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。 
     * @return BackupMethod 设置备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 设置备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
     * @param BackupMethod 设置备份方式。
- 0：逻辑备份。
- 1：物理备份。
- 3：快照备份。
**说明**:
1. 通用版实例支持逻辑备份与物理备份。云盘版实例支持物理备份与快照备份，暂不支持逻辑备份。
2. 实例开通存储加密，则备份方式不能为物理备份。
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 备份备注信息。 
     * @return BackupRemark 备份备注信息。
     */
    public String getBackupRemark() {
        return this.BackupRemark;
    }

    /**
     * Set 备份备注信息。
     * @param BackupRemark 备份备注信息。
     */
    public void setBackupRemark(String BackupRemark) {
        this.BackupRemark = BackupRemark;
    }

    public CreateBackupDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupDBInstanceRequest(CreateBackupDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupRemark != null) {
            this.BackupRemark = new String(source.BackupRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupRemark", this.BackupRemark);

    }
}

