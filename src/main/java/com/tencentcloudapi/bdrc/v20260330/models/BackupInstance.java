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
    * <p>实例绑定的定期备份策略列表。</p>
    */
    @SerializedName("AutoBackupPolicyIdSet")
    @Expose
    private String [] AutoBackupPolicyIdSet;

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户AppId。</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>实例最新备份时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestBackupTime")
    @Expose
    private String LatestBackupTime;

    /**
    * <p>实例的备份组ID列表。</p>
    */
    @SerializedName("BackupGroupIdSet")
    @Expose
    private String [] BackupGroupIdSet;

    /**
    * <p>修改时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>备份数据量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupSizeMb")
    @Expose
    private Long BackupSizeMb;

    /**
     * Get <p>实例绑定的定期备份策略列表。</p> 
     * @return AutoBackupPolicyIdSet <p>实例绑定的定期备份策略列表。</p>
     */
    public String [] getAutoBackupPolicyIdSet() {
        return this.AutoBackupPolicyIdSet;
    }

    /**
     * Set <p>实例绑定的定期备份策略列表。</p>
     * @param AutoBackupPolicyIdSet <p>实例绑定的定期备份策略列表。</p>
     */
    public void setAutoBackupPolicyIdSet(String [] AutoBackupPolicyIdSet) {
        this.AutoBackupPolicyIdSet = AutoBackupPolicyIdSet;
    }

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户AppId。</p> 
     * @return AppId <p>用户AppId。</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppId。</p>
     * @param AppId <p>用户AppId。</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>实例最新备份时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestBackupTime <p>实例最新备份时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestBackupTime() {
        return this.LatestBackupTime;
    }

    /**
     * Set <p>实例最新备份时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestBackupTime <p>实例最新备份时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestBackupTime(String LatestBackupTime) {
        this.LatestBackupTime = LatestBackupTime;
    }

    /**
     * Get <p>实例的备份组ID列表。</p> 
     * @return BackupGroupIdSet <p>实例的备份组ID列表。</p>
     */
    public String [] getBackupGroupIdSet() {
        return this.BackupGroupIdSet;
    }

    /**
     * Set <p>实例的备份组ID列表。</p>
     * @param BackupGroupIdSet <p>实例的备份组ID列表。</p>
     */
    public void setBackupGroupIdSet(String [] BackupGroupIdSet) {
        this.BackupGroupIdSet = BackupGroupIdSet;
    }

    /**
     * Get <p>修改时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime <p>修改时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime <p>修改时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>备份数据量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupSizeMb <p>备份数据量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupSizeMb() {
        return this.BackupSizeMb;
    }

    /**
     * Set <p>备份数据量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupSizeMb <p>备份数据量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupSizeMb(Long BackupSizeMb) {
        this.BackupSizeMb = BackupSizeMb;
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
        if (source.BackupSizeMb != null) {
            this.BackupSizeMb = new Long(source.BackupSizeMb);
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
        this.setParamSimple(map, prefix + "BackupSizeMb", this.BackupSizeMb);

    }
}

