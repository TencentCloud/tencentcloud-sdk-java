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

public class BackupInstance extends AbstractModel {

    /**
    * 实例绑定的定期备份策略列表。
    */
    @SerializedName("AutoBackupPolicyIdSet")
    @Expose
    private String [] AutoBackupPolicyIdSet;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户AppId。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例最新备份时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestBackupTime")
    @Expose
    private String LatestBackupTime;

    /**
    * 实例的备份组ID列表。
    */
    @SerializedName("BackupGroupIdSet")
    @Expose
    private String [] BackupGroupIdSet;

    /**
    * 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
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
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 实例绑定的定期备份策略列表。 
     * @return AutoBackupPolicyIdSet 实例绑定的定期备份策略列表。
     */
    public String [] getAutoBackupPolicyIdSet() {
        return this.AutoBackupPolicyIdSet;
    }

    /**
     * Set 实例绑定的定期备份策略列表。
     * @param AutoBackupPolicyIdSet 实例绑定的定期备份策略列表。
     */
    public void setAutoBackupPolicyIdSet(String [] AutoBackupPolicyIdSet) {
        this.AutoBackupPolicyIdSet = AutoBackupPolicyIdSet;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户AppId。 
     * @return AppId 用户AppId。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId。
     * @param AppId 用户AppId。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例最新备份时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestBackupTime 实例最新备份时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestBackupTime() {
        return this.LatestBackupTime;
    }

    /**
     * Set 实例最新备份时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestBackupTime 实例最新备份时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestBackupTime(String LatestBackupTime) {
        this.LatestBackupTime = LatestBackupTime;
    }

    /**
     * Get 实例的备份组ID列表。 
     * @return BackupGroupIdSet 实例的备份组ID列表。
     */
    public String [] getBackupGroupIdSet() {
        return this.BackupGroupIdSet;
    }

    /**
     * Set 实例的备份组ID列表。
     * @param BackupGroupIdSet 实例的备份组ID列表。
     */
    public void setBackupGroupIdSet(String [] BackupGroupIdSet) {
        this.BackupGroupIdSet = BackupGroupIdSet;
    }

    /**
     * Get 修改时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间。
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public BackupInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInstance(BackupInstance source) {
        if (source.AutoBackupPolicyIdSet != null) {
            this.AutoBackupPolicyIdSet = new String[source.AutoBackupPolicyIdSet.length];
            for (int i = 0; i < source.AutoBackupPolicyIdSet.length; i++) {
                this.AutoBackupPolicyIdSet[i] = new String(source.AutoBackupPolicyIdSet[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.LatestBackupTime != null) {
            this.LatestBackupTime = new String(source.LatestBackupTime);
        }
        if (source.BackupGroupIdSet != null) {
            this.BackupGroupIdSet = new String[source.BackupGroupIdSet.length];
            for (int i = 0; i < source.BackupGroupIdSet.length; i++) {
                this.BackupGroupIdSet[i] = new String(source.BackupGroupIdSet[i]);
            }
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoBackupPolicyIdSet.", this.AutoBackupPolicyIdSet);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "LatestBackupTime", this.LatestBackupTime);
        this.setParamArraySimple(map, prefix + "BackupGroupIdSet.", this.BackupGroupIdSet);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

