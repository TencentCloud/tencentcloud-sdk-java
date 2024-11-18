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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBackupRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份任务 ID。您可通过 [查询数据备份文件列表](https://cloud.tencent.com/document/api/236/15842)  来获取目标备份任务 ID。
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份任务 ID。您可通过 [查询数据备份文件列表](https://cloud.tencent.com/document/api/236/15842)  来获取目标备份任务 ID。 
     * @return BackupId 备份任务 ID。您可通过 [查询数据备份文件列表](https://cloud.tencent.com/document/api/236/15842)  来获取目标备份任务 ID。
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份任务 ID。您可通过 [查询数据备份文件列表](https://cloud.tencent.com/document/api/236/15842)  来获取目标备份任务 ID。
     * @param BackupId 备份任务 ID。您可通过 [查询数据备份文件列表](https://cloud.tencent.com/document/api/236/15842)  来获取目标备份任务 ID。
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    public DeleteBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupRequest(DeleteBackupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

