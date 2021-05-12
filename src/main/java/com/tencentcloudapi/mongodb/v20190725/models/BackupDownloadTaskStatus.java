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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDownloadTaskStatus extends AbstractModel{

    /**
    * 分片名
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * 任务当前状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 分片名 
     * @return ReplicaSetId 分片名
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set 分片名
     * @param ReplicaSetId 分片名
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * Get 任务当前状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试 
     * @return Status 任务当前状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务当前状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
     * @param Status 任务当前状态。0-等待执行，1-正在下载，2-下载完成，3-下载失败，4-等待重试
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BackupDownloadTaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupDownloadTaskStatus(BackupDownloadTaskStatus source) {
        if (source.ReplicaSetId != null) {
            this.ReplicaSetId = new String(source.ReplicaSetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

