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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBackupRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 备份文件ID，旧版本使用的字段，不推荐使用
    */
    @SerializedName("SnapshotIdList")
    @Expose
    private Long [] SnapshotIdList;

    /**
    * 备份文件ID，推荐使用
    */
    @SerializedName("BackupIds")
    @Expose
    private Long [] BackupIds;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 备份文件ID，旧版本使用的字段，不推荐使用 
     * @return SnapshotIdList 备份文件ID，旧版本使用的字段，不推荐使用
     */
    public Long [] getSnapshotIdList() {
        return this.SnapshotIdList;
    }

    /**
     * Set 备份文件ID，旧版本使用的字段，不推荐使用
     * @param SnapshotIdList 备份文件ID，旧版本使用的字段，不推荐使用
     */
    public void setSnapshotIdList(Long [] SnapshotIdList) {
        this.SnapshotIdList = SnapshotIdList;
    }

    /**
     * Get 备份文件ID，推荐使用 
     * @return BackupIds 备份文件ID，推荐使用
     */
    public Long [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set 备份文件ID，推荐使用
     * @param BackupIds 备份文件ID，推荐使用
     */
    public void setBackupIds(Long [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    public DeleteBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupRequest(DeleteBackupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SnapshotIdList != null) {
            this.SnapshotIdList = new Long[source.SnapshotIdList.length];
            for (int i = 0; i < source.SnapshotIdList.length; i++) {
                this.SnapshotIdList[i] = new Long(source.SnapshotIdList[i]);
            }
        }
        if (source.BackupIds != null) {
            this.BackupIds = new Long[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new Long(source.BackupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SnapshotIdList.", this.SnapshotIdList);
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);

    }
}

