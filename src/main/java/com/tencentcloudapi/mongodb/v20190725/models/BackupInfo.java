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

public class BackupInfo extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份方式，0-自动备份，1-手动备份
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 备份名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 备份备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * 备份文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份状态，1-备份中，2-备份成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备份方法，0-逻辑备份，1-物理备份
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

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
     * Get 备份方式，0-自动备份，1-手动备份 
     * @return BackupType 备份方式，0-自动备份，1-手动备份
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份方式，0-自动备份，1-手动备份
     * @param BackupType 备份方式，0-自动备份，1-手动备份
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 备份名称 
     * @return BackupName 备份名称
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份名称
     * @param BackupName 备份名称
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 备份备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupDesc 备份备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set 备份备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupDesc 备份备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get 备份文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupSize 备份文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 备份文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupSize 备份文件大小，单位KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 备份开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 备份结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份状态，1-备份中，2-备份成功 
     * @return Status 备份状态，1-备份中，2-备份成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份状态，1-备份中，2-备份成功
     * @param Status 备份状态，1-备份中，2-备份成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备份方法，0-逻辑备份，1-物理备份 
     * @return BackupMethod 备份方法，0-逻辑备份，1-物理备份
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方法，0-逻辑备份，1-物理备份
     * @param BackupMethod 备份方法，0-逻辑备份，1-物理备份
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupDesc", this.BackupDesc);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);

    }
}

