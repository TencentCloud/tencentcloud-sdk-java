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

public class BackupGroup extends AbstractModel {

    /**
    * 备份组ID。
    */
    @SerializedName("BackupGroupId")
    @Expose
    private String BackupGroupId;

    /**
    * 备份组创建进度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 备份和云盘绑定关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupBindDisk")
    @Expose
    private ApplyDisk [] BackupBindDisk;

    /**
    * 备份组名称。
    */
    @SerializedName("BackupGroupName")
    @Expose
    private String BackupGroupName;

    /**
    * 备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中
    */
    @SerializedName("BackupGroupState")
    @Expose
    private String BackupGroupState;

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
    * 用户AppId。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 是否为永久备份组。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 备份组的到期时间。如果为永久备份组，则取值为null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 创建备份组的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建备份组时刻实例的详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceDetails")
    @Expose
    private String InstanceDetails;

    /**
    * 创建人名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 创建备份的子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 创建当前备份的定期备份策略ID，为null则为手动创建的备份。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupPolicyId")
    @Expose
    private String AutoBackupPolicyId;

    /**
     * Get 备份组ID。 
     * @return BackupGroupId 备份组ID。
     */
    public String getBackupGroupId() {
        return this.BackupGroupId;
    }

    /**
     * Set 备份组ID。
     * @param BackupGroupId 备份组ID。
     */
    public void setBackupGroupId(String BackupGroupId) {
        this.BackupGroupId = BackupGroupId;
    }

    /**
     * Get 备份组创建进度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 备份组创建进度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 备份组创建进度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 备份组创建进度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
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

    /**
     * Get 备份组名称。 
     * @return BackupGroupName 备份组名称。
     */
    public String getBackupGroupName() {
        return this.BackupGroupName;
    }

    /**
     * Set 备份组名称。
     * @param BackupGroupName 备份组名称。
     */
    public void setBackupGroupName(String BackupGroupName) {
        this.BackupGroupName = BackupGroupName;
    }

    /**
     * Get 备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中 
     * @return BackupGroupState 备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中
     */
    public String getBackupGroupState() {
        return this.BackupGroupState;
    }

    /**
     * Set 备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中
     * @param BackupGroupState 备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中
     */
    public void setBackupGroupState(String BackupGroupState) {
        this.BackupGroupState = BackupGroupState;
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
     * Get 是否为永久备份组。 
     * @return IsPermanent 是否为永久备份组。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 是否为永久备份组。
     * @param IsPermanent 是否为永久备份组。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 备份组的到期时间。如果为永久备份组，则取值为null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineTime 备份组的到期时间。如果为永久备份组，则取值为null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 备份组的到期时间。如果为永久备份组，则取值为null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineTime 备份组的到期时间。如果为永久备份组，则取值为null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 创建备份组的实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 创建备份组的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 创建备份组的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 创建备份组的实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 创建备份组时刻实例的详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceDetails 创建备份组时刻实例的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set 创建备份组时刻实例的详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceDetails 创建备份组时刻实例的详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceDetails(String InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    /**
     * Get 创建人名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 创建人名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 创建人名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 创建人名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 主账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 创建备份的子账号uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建备份的子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建备份的子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建备份的子账号uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 创建当前备份的定期备份策略ID，为null则为手动创建的备份。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupPolicyId 创建当前备份的定期备份策略ID，为null则为手动创建的备份。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoBackupPolicyId() {
        return this.AutoBackupPolicyId;
    }

    /**
     * Set 创建当前备份的定期备份策略ID，为null则为手动创建的备份。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupPolicyId 创建当前备份的定期备份策略ID，为null则为手动创建的备份。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupPolicyId(String AutoBackupPolicyId) {
        this.AutoBackupPolicyId = AutoBackupPolicyId;
    }

    public BackupGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupGroup(BackupGroup source) {
        if (source.BackupGroupId != null) {
            this.BackupGroupId = new String(source.BackupGroupId);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.BackupBindDisk != null) {
            this.BackupBindDisk = new ApplyDisk[source.BackupBindDisk.length];
            for (int i = 0; i < source.BackupBindDisk.length; i++) {
                this.BackupBindDisk[i] = new ApplyDisk(source.BackupBindDisk[i]);
            }
        }
        if (source.BackupGroupName != null) {
            this.BackupGroupName = new String(source.BackupGroupName);
        }
        if (source.BackupGroupState != null) {
            this.BackupGroupState = new String(source.BackupGroupState);
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
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceDetails != null) {
            this.InstanceDetails = new String(source.InstanceDetails);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.AutoBackupPolicyId != null) {
            this.AutoBackupPolicyId = new String(source.AutoBackupPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupGroupId", this.BackupGroupId);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamArrayObj(map, prefix + "BackupBindDisk.", this.BackupBindDisk);
        this.setParamSimple(map, prefix + "BackupGroupName", this.BackupGroupName);
        this.setParamSimple(map, prefix + "BackupGroupState", this.BackupGroupState);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceDetails", this.InstanceDetails);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "AutoBackupPolicyId", this.AutoBackupPolicyId);

    }
}

