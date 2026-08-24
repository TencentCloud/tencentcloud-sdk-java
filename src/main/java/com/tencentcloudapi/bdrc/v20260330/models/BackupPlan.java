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

public class BackupPlan extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份策略ID
    */
    @SerializedName("AutoBackupPolicyId")
    @Expose
    private String AutoBackupPolicyId;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * APP ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 备份数量
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
    * 上次执行错误信息，如果为空表示上次执行成功。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerError")
    @Expose
    private String LastTriggerError;

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
     * Get 备份策略ID 
     * @return AutoBackupPolicyId 备份策略ID
     */
    public String getAutoBackupPolicyId() {
        return this.AutoBackupPolicyId;
    }

    /**
     * Set 备份策略ID
     * @param AutoBackupPolicyId 备份策略ID
     */
    public void setAutoBackupPolicyId(String AutoBackupPolicyId) {
        this.AutoBackupPolicyId = AutoBackupPolicyId;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get APP ID 
     * @return AppId APP ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
     * @param AppId APP ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 备份数量 
     * @return BackupCount 备份数量
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 备份数量
     * @param BackupCount 备份数量
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerTime 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerTime 上次执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Get 上次执行错误信息，如果为空表示上次执行成功。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerError 上次执行错误信息，如果为空表示上次执行成功。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTriggerError() {
        return this.LastTriggerError;
    }

    /**
     * Set 上次执行错误信息，如果为空表示上次执行成功。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerError 上次执行错误信息，如果为空表示上次执行成功。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerError(String LastTriggerError) {
        this.LastTriggerError = LastTriggerError;
    }

    public BackupPlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPlan(BackupPlan source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AutoBackupPolicyId != null) {
            this.AutoBackupPolicyId = new String(source.AutoBackupPolicyId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.LastTriggerTime != null) {
            this.LastTriggerTime = new String(source.LastTriggerTime);
        }
        if (source.LastTriggerError != null) {
            this.LastTriggerError = new String(source.LastTriggerError);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AutoBackupPolicyId", this.AutoBackupPolicyId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);
        this.setParamSimple(map, prefix + "LastTriggerError", this.LastTriggerError);

    }
}

