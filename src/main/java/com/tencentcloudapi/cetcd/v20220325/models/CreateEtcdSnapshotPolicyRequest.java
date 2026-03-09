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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEtcdSnapshotPolicyRequest extends AbstractModel {

    /**
    * etcd实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 快照策略名
    */
    @SerializedName("SnapshotPolicyName")
    @Expose
    private String SnapshotPolicyName;

    /**
    * 备份参数设置
    */
    @SerializedName("BackupSettings")
    @Expose
    private EtcdBackupSettings BackupSettings;

    /**
     * Get etcd实例Id 
     * @return InstanceId etcd实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set etcd实例Id
     * @param InstanceId etcd实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 快照策略名 
     * @return SnapshotPolicyName 快照策略名
     */
    public String getSnapshotPolicyName() {
        return this.SnapshotPolicyName;
    }

    /**
     * Set 快照策略名
     * @param SnapshotPolicyName 快照策略名
     */
    public void setSnapshotPolicyName(String SnapshotPolicyName) {
        this.SnapshotPolicyName = SnapshotPolicyName;
    }

    /**
     * Get 备份参数设置 
     * @return BackupSettings 备份参数设置
     */
    public EtcdBackupSettings getBackupSettings() {
        return this.BackupSettings;
    }

    /**
     * Set 备份参数设置
     * @param BackupSettings 备份参数设置
     */
    public void setBackupSettings(EtcdBackupSettings BackupSettings) {
        this.BackupSettings = BackupSettings;
    }

    public CreateEtcdSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEtcdSnapshotPolicyRequest(CreateEtcdSnapshotPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotPolicyName != null) {
            this.SnapshotPolicyName = new String(source.SnapshotPolicyName);
        }
        if (source.BackupSettings != null) {
            this.BackupSettings = new EtcdBackupSettings(source.BackupSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotPolicyName", this.SnapshotPolicyName);
        this.setParamObj(map, prefix + "BackupSettings.", this.BackupSettings);

    }
}

