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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBackupRecordsRequest extends AbstractModel{

    /**
    * 待删除备份记录的所在集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 待删除备份记录的详情
    */
    @SerializedName("BackupRecords")
    @Expose
    private BackupRecords [] BackupRecords;

    /**
     * Get 待删除备份记录的所在集群ID 
     * @return ClusterId 待删除备份记录的所在集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 待删除备份记录的所在集群ID
     * @param ClusterId 待删除备份记录的所在集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 待删除备份记录的详情 
     * @return BackupRecords 待删除备份记录的详情
     */
    public BackupRecords [] getBackupRecords() {
        return this.BackupRecords;
    }

    /**
     * Set 待删除备份记录的详情
     * @param BackupRecords 待删除备份记录的详情
     */
    public void setBackupRecords(BackupRecords [] BackupRecords) {
        this.BackupRecords = BackupRecords;
    }

    public DeleteBackupRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBackupRecordsRequest(DeleteBackupRecordsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupRecords != null) {
            this.BackupRecords = new BackupRecords[source.BackupRecords.length];
            for (int i = 0; i < source.BackupRecords.length; i++) {
                this.BackupRecords[i] = new BackupRecords(source.BackupRecords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "BackupRecords.", this.BackupRecords);

    }
}

