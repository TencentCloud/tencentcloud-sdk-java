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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDetail extends AbstractModel {

    /**
    * 备份组ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 备份策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupPolicyId")
    @Expose
    private String AutoBackupPolicyId;

    /**
    * 备份和云盘绑定关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupBindDisk")
    @Expose
    private ApplyDisk [] BackupBindDisk;

    /**
     * Get 备份组ID 
     * @return BackupId 备份组ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份组ID
     * @param BackupId 备份组ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 备份策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupPolicyId 备份策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoBackupPolicyId() {
        return this.AutoBackupPolicyId;
    }

    /**
     * Set 备份策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupPolicyId 备份策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupPolicyId(String AutoBackupPolicyId) {
        this.AutoBackupPolicyId = AutoBackupPolicyId;
    }

    /**
     * Get 备份和云盘绑定关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupBindDisk 备份和云盘绑定关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplyDisk [] getBackupBindDisk() {
        return this.BackupBindDisk;
    }

    /**
     * Set 备份和云盘绑定关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupBindDisk 备份和云盘绑定关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupBindDisk(ApplyDisk [] BackupBindDisk) {
        this.BackupBindDisk = BackupBindDisk;
    }

    public BackupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupDetail(BackupDetail source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AutoBackupPolicyId != null) {
            this.AutoBackupPolicyId = new String(source.AutoBackupPolicyId);
        }
        if (source.BackupBindDisk != null) {
            this.BackupBindDisk = new ApplyDisk[source.BackupBindDisk.length];
            for (int i = 0; i < source.BackupBindDisk.length; i++) {
                this.BackupBindDisk[i] = new ApplyDisk(source.BackupBindDisk[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AutoBackupPolicyId", this.AutoBackupPolicyId);
        this.setParamArrayObj(map, prefix + "BackupBindDisk.", this.BackupBindDisk);

    }
}

