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
    * <p>备份组ID。</p>
    */
    @SerializedName("BackupGroupId")
    @Expose
    private String BackupGroupId;

    /**
    * <p>备份组创建进度。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>备份和云盘绑定关系</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupBindDisk")
    @Expose
    private ApplyDisk [] BackupBindDisk;

    /**
    * <p>备份组名称。</p>
    */
    @SerializedName("BackupGroupName")
    @Expose
    private String BackupGroupName;

    /**
    * <p>备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中</p>
    */
    @SerializedName("BackupGroupState")
    @Expose
    private String BackupGroupState;

    /**
    * <p>修改时间</p>
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
    * <p>用户AppId。</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>是否为永久备份组。</p>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * <p>备份组的到期时间。如果为永久备份组，则取值为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>创建备份组的实例ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>创建备份组时刻实例的详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceDetails")
    @Expose
    private String InstanceDetails;

    /**
    * <p>创建人名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * <p>创建备份的子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>创建当前备份的定期备份策略ID，为null则为手动创建的备份。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoBackupPolicyId")
    @Expose
    private String AutoBackupPolicyId;

    /**
    * <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>备份组ID。</p> 
     * @return BackupGroupId <p>备份组ID。</p>
     */
    public String getBackupGroupId() {
        return this.BackupGroupId;
    }

    /**
     * Set <p>备份组ID。</p>
     * @param BackupGroupId <p>备份组ID。</p>
     */
    public void setBackupGroupId(String BackupGroupId) {
        this.BackupGroupId = BackupGroupId;
    }

    /**
     * Get <p>备份组创建进度。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent <p>备份组创建进度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>备份组创建进度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent <p>备份组创建进度。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>备份和云盘绑定关系</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupBindDisk <p>备份和云盘绑定关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplyDisk [] getBackupBindDisk() {
        return this.BackupBindDisk;
    }

    /**
     * Set <p>备份和云盘绑定关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupBindDisk <p>备份和云盘绑定关系</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupBindDisk(ApplyDisk [] BackupBindDisk) {
        this.BackupBindDisk = BackupBindDisk;
    }

    /**
     * Get <p>备份组名称。</p> 
     * @return BackupGroupName <p>备份组名称。</p>
     */
    public String getBackupGroupName() {
        return this.BackupGroupName;
    }

    /**
     * Set <p>备份组名称。</p>
     * @param BackupGroupName <p>备份组名称。</p>
     */
    public void setBackupGroupName(String BackupGroupName) {
        this.BackupGroupName = BackupGroupName;
    }

    /**
     * Get <p>备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中</p> 
     * @return BackupGroupState <p>备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中</p>
     */
    public String getBackupGroupState() {
        return this.BackupGroupState;
    }

    /**
     * Set <p>备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中</p>
     * @param BackupGroupState <p>备份组状态。NORMAL: 正常；CREATING: 创建中；ROLLBACKING: 回滚中</p>
     */
    public void setBackupGroupState(String BackupGroupState) {
        this.BackupGroupState = BackupGroupState;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
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
     * Get <p>是否为永久备份组。</p> 
     * @return IsPermanent <p>是否为永久备份组。</p>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set <p>是否为永久备份组。</p>
     * @param IsPermanent <p>是否为永久备份组。</p>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get <p>备份组的到期时间。如果为永久备份组，则取值为null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineTime <p>备份组的到期时间。如果为永久备份组，则取值为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>备份组的到期时间。如果为永久备份组，则取值为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineTime <p>备份组的到期时间。如果为永久备份组，则取值为null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>创建备份组的实例ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>创建备份组的实例ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>创建备份组的实例ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>创建备份组的实例ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>创建备份组时刻实例的详情。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceDetails <p>创建备份组时刻实例的详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set <p>创建备份组时刻实例的详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceDetails <p>创建备份组时刻实例的详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceDetails(String InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
    }

    /**
     * Get <p>创建人名称。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName <p>创建人名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>创建人名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName <p>创建人名称。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin <p>主账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get <p>创建备份的子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin <p>创建备份的子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>创建备份的子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin <p>创建备份的子账号uin。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>创建当前备份的定期备份策略ID，为null则为手动创建的备份。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoBackupPolicyId <p>创建当前备份的定期备份策略ID，为null则为手动创建的备份。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoBackupPolicyId() {
        return this.AutoBackupPolicyId;
    }

    /**
     * Set <p>创建当前备份的定期备份策略ID，为null则为手动创建的备份。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoBackupPolicyId <p>创建当前备份的定期备份策略ID，为null则为手动创建的备份。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoBackupPolicyId(String AutoBackupPolicyId) {
        this.AutoBackupPolicyId = AutoBackupPolicyId;
    }

    /**
     * Get <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

