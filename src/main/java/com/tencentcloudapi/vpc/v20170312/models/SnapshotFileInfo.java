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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotFileInfo extends AbstractModel{

    /**
    * 快照策略Id。
    */
    @SerializedName("SnapshotPolicyId")
    @Expose
    private String SnapshotPolicyId;

    /**
    * 实例Id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 快照文件Id。
    */
    @SerializedName("SnapshotFileId")
    @Expose
    private String SnapshotFileId;

    /**
    * 备份时间。
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * 操作者Uin。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 快照策略Id。 
     * @return SnapshotPolicyId 快照策略Id。
     */
    public String getSnapshotPolicyId() {
        return this.SnapshotPolicyId;
    }

    /**
     * Set 快照策略Id。
     * @param SnapshotPolicyId 快照策略Id。
     */
    public void setSnapshotPolicyId(String SnapshotPolicyId) {
        this.SnapshotPolicyId = SnapshotPolicyId;
    }

    /**
     * Get 实例Id。 
     * @return InstanceId 实例Id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id。
     * @param InstanceId 实例Id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 快照文件Id。 
     * @return SnapshotFileId 快照文件Id。
     */
    public String getSnapshotFileId() {
        return this.SnapshotFileId;
    }

    /**
     * Set 快照文件Id。
     * @param SnapshotFileId 快照文件Id。
     */
    public void setSnapshotFileId(String SnapshotFileId) {
        this.SnapshotFileId = SnapshotFileId;
    }

    /**
     * Get 备份时间。 
     * @return BackupTime 备份时间。
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set 备份时间。
     * @param BackupTime 备份时间。
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get 操作者Uin。 
     * @return Operator 操作者Uin。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者Uin。
     * @param Operator 操作者Uin。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public SnapshotFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotFileInfo(SnapshotFileInfo source) {
        if (source.SnapshotPolicyId != null) {
            this.SnapshotPolicyId = new String(source.SnapshotPolicyId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SnapshotFileId != null) {
            this.SnapshotFileId = new String(source.SnapshotFileId);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotPolicyId", this.SnapshotPolicyId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotFileId", this.SnapshotFileId);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

