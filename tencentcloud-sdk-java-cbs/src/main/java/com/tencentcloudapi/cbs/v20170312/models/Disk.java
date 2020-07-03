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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel{

    /**
    * 云硬盘ID。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
    */
    @SerializedName("Portable")
    @Expose
    private Boolean Portable;

    /**
    * 云硬盘所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
    */
    @SerializedName("SnapshotAbility")
    @Expose
    private Boolean SnapshotAbility;

    /**
    * 云硬盘名称。
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 云硬盘大小，单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中<br><li>TORECYCLE：待回收<br><li>DUMPING：拷贝硬盘中。
    */
    @SerializedName("DiskState")
    @Expose
    private String DiskState;

    /**
    * 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
    */
    @SerializedName("Attached")
    @Expose
    private Boolean Attached;

    /**
    * 云硬盘挂载的云主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云硬盘的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 云硬盘的到期时间。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
    */
    @SerializedName("Rollbacking")
    @Expose
    private Boolean Rollbacking;

    /**
    * 云盘快照回滚的进度。
    */
    @SerializedName("RollbackPercent")
    @Expose
    private Long RollbackPercent;

    /**
    * 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlagError")
    @Expose
    private Boolean AutoRenewFlagError;

    /**
    * 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineError")
    @Expose
    private Boolean DeadlineError;

    /**
    * 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;

    /**
    * 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Long ReturnFailCode;

    /**
    * 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * 与云盘绑定的标签，云盘未绑定标签则取值为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 云盘是否与挂载的实例一起销毁。<br><li>true:销毁实例时会同时销毁云盘，只支持按小时后付费云盘。<br><li>false：销毁实例时不销毁云盘。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 当前时间距离盘到期的天数（仅对预付费盘有意义）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DifferDaysOfDeadline")
    @Expose
    private Long DifferDaysOfDeadline;

    /**
    * 云盘是否处于类型变更中。取值范围：<br><li>false:表示云盘不处于类型变更中<br><li>true:表示云盘已发起类型变更，正处于迁移中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Migrating")
    @Expose
    private Boolean Migrating;

    /**
    * 云盘类型变更的迁移进度，取值0到100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigratePercent")
    @Expose
    private Long MigratePercent;

    /**
    * 云盘是否为共享型云盘。
    */
    @SerializedName("Shareable")
    @Expose
    private Boolean Shareable;

    /**
    * 对于非共享型云盘，该参数为空数组。对于共享型云盘，则表示该云盘当前被挂载到的CVM实例InstanceId
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * 云盘拥有的快照总数。
    */
    @SerializedName("SnapshotCount")
    @Expose
    private Long SnapshotCount;

    /**
    * 云盘拥有的快照总容量，单位为MB。
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
    * 云盘因欠费销毁或者期销毁时， 是否使用快照备份数据的标识。True， 销毁时创建快照进行数据备份。False 表示直接销毁，不进行数据备份。
    */
    @SerializedName("BackupDisk")
    @Expose
    private Boolean BackupDisk;

    /**
     * Get 云硬盘ID。 
     * @return DiskId 云硬盘ID。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云硬盘ID。
     * @param DiskId 云硬盘ID。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。 
     * @return DiskUsage 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     * @param DiskUsage 云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。 
     * @return DiskChargeType 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     * @param DiskChargeType 付费模式。取值范围：<br><li>PREPAID：预付费，即包年包月<br><li>POSTPAID_BY_HOUR：后付费，即按量计费。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。 
     * @return Portable 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     */
    public Boolean getPortable() {
        return this.Portable;
    }

    /**
     * Set 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     * @param Portable 是否为弹性云盘，false表示非弹性云盘，true表示弹性云盘。
     */
    public void setPortable(Boolean Portable) {
        this.Portable = Portable;
    }

    /**
     * Get 云硬盘所在的位置。 
     * @return Placement 云硬盘所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 云硬盘所在的位置。
     * @param Placement 云硬盘所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。 
     * @return SnapshotAbility 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     */
    public Boolean getSnapshotAbility() {
        return this.SnapshotAbility;
    }

    /**
     * Set 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     * @param SnapshotAbility 云盘是否具备创建快照的能力。取值范围：<br><li>false表示不具备<br><li>true表示具备。
     */
    public void setSnapshotAbility(Boolean SnapshotAbility) {
        this.SnapshotAbility = SnapshotAbility;
    }

    /**
     * Get 云硬盘名称。 
     * @return DiskName 云硬盘名称。
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 云硬盘名称。
     * @param DiskName 云硬盘名称。
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get 云硬盘大小，单位GB。 
     * @return DiskSize 云硬盘大小，单位GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云硬盘大小，单位GB。
     * @param DiskSize 云硬盘大小，单位GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中<br><li>TORECYCLE：待回收<br><li>DUMPING：拷贝硬盘中。 
     * @return DiskState 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中<br><li>TORECYCLE：待回收<br><li>DUMPING：拷贝硬盘中。
     */
    public String getDiskState() {
        return this.DiskState;
    }

    /**
     * Set 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中<br><li>TORECYCLE：待回收<br><li>DUMPING：拷贝硬盘中。
     * @param DiskState 云盘状态。取值范围：<br><li>UNATTACHED：未挂载<br><li>ATTACHING：挂载中<br><li>ATTACHED：已挂载<br><li>DETACHING：解挂中<br><li>EXPANDING：扩容中<br><li>ROLLBACKING：回滚中<br><li>TORECYCLE：待回收<br><li>DUMPING：拷贝硬盘中。
     */
    public void setDiskState(String DiskState) {
        this.DiskState = DiskState;
    }

    /**
     * Get 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。 
     * @return DiskType 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     * @param DiskType 云盘介质类型。取值范围：<br><li>CLOUD_BASIC：表示普通云硬盘<br><li>CLOUD_PREMIUM：表示高性能云硬盘<br><li>CLOUD_SSD：SSD表示SSD云硬盘。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。 
     * @return Attached 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     */
    public Boolean getAttached() {
        return this.Attached;
    }

    /**
     * Set 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     * @param Attached 云盘是否挂载到云主机上。取值范围：<br><li>false:表示未挂载<br><li>true:表示已挂载。
     */
    public void setAttached(Boolean Attached) {
        this.Attached = Attached;
    }

    /**
     * Get 云硬盘挂载的云主机ID。 
     * @return InstanceId 云硬盘挂载的云主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 云硬盘挂载的云主机ID。
     * @param InstanceId 云硬盘挂载的云主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云硬盘的创建时间。 
     * @return CreateTime 云硬盘的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 云硬盘的创建时间。
     * @param CreateTime 云硬盘的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 云硬盘的到期时间。 
     * @return DeadlineTime 云硬盘的到期时间。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 云硬盘的到期时间。
     * @param DeadlineTime 云硬盘的到期时间。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。 
     * @return Rollbacking 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     */
    public Boolean getRollbacking() {
        return this.Rollbacking;
    }

    /**
     * Set 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     * @param Rollbacking 云盘是否处于快照回滚状态。取值范围：<br><li>false:表示不处于快照回滚状态<br><li>true:表示处于快照回滚状态。
     */
    public void setRollbacking(Boolean Rollbacking) {
        this.Rollbacking = Rollbacking;
    }

    /**
     * Get 云盘快照回滚的进度。 
     * @return RollbackPercent 云盘快照回滚的进度。
     */
    public Long getRollbackPercent() {
        return this.RollbackPercent;
    }

    /**
     * Set 云盘快照回滚的进度。
     * @param RollbackPercent 云盘快照回滚的进度。
     */
    public void setRollbackPercent(Long RollbackPercent) {
        this.RollbackPercent = RollbackPercent;
    }

    /**
     * Get 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。 
     * @return Encrypt 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     * @param Encrypt 云盘是否为加密盘。取值范围：<br><li>false:表示非加密盘<br><li>true:表示加密盘。
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlagError 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoRenewFlagError() {
        return this.AutoRenewFlagError;
    }

    /**
     * Set 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlagError 云盘已挂载到子机，且子机与云盘都是包年包月。<br><li>true：子机设置了自动续费标识，但云盘未设置<br><li>false：云盘自动续费标识正常。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlagError(Boolean AutoRenewFlagError) {
        this.AutoRenewFlagError = AutoRenewFlagError;
    }

    /**
     * Get 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 自动续费标识。取值范围：<br><li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费<br><li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineError 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeadlineError() {
        return this.DeadlineError;
    }

    /**
     * Set 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineError 在云盘已挂载到实例，且实例与云盘都是包年包月的条件下，此字段才有意义。<br><li>true:云盘到期时间早于实例。<br><li>false：云盘到期时间晚于实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineError(Boolean DeadlineError) {
        this.DeadlineError = DeadlineError;
    }

    /**
     * Get 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsReturnable 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * Set 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsReturnable 判断预付费的云盘是否支持主动退还。<br><li>true:支持主动退还<br><li>false:不支持主动退还。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsReturnable(Boolean IsReturnable) {
        this.IsReturnable = IsReturnable;
    }

    /**
     * Get 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnFailCode 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * Set 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnFailCode 预付费云盘在不支持主动退还的情况下，该参数表明不支持主动退还的具体原因。取值范围：<br><li>1：云硬盘已经退还<br><li>2：云硬盘已过期<br><li>3：云盘不支持退还<br><li>8：超过可退还数量的限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnFailCode(Long ReturnFailCode) {
        this.ReturnFailCode = ReturnFailCode;
    }

    /**
     * Get 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSnapshotPolicyIds 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSnapshotPolicyIds 云盘关联的定期快照ID。只有在调用DescribeDisks接口时，入参ReturnBindAutoSnapshotPolicy取值为TRUE才会返回该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * Get 与云盘绑定的标签，云盘未绑定标签则取值为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 与云盘绑定的标签，云盘未绑定标签则取值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 与云盘绑定的标签，云盘未绑定标签则取值为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 与云盘绑定的标签，云盘未绑定标签则取值为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 云盘是否与挂载的实例一起销毁。<br><li>true:销毁实例时会同时销毁云盘，只支持按小时后付费云盘。<br><li>false：销毁实例时不销毁云盘。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteWithInstance 云盘是否与挂载的实例一起销毁。<br><li>true:销毁实例时会同时销毁云盘，只支持按小时后付费云盘。<br><li>false：销毁实例时不销毁云盘。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 云盘是否与挂载的实例一起销毁。<br><li>true:销毁实例时会同时销毁云盘，只支持按小时后付费云盘。<br><li>false：销毁实例时不销毁云盘。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteWithInstance 云盘是否与挂载的实例一起销毁。<br><li>true:销毁实例时会同时销毁云盘，只支持按小时后付费云盘。<br><li>false：销毁实例时不销毁云盘。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 当前时间距离盘到期的天数（仅对预付费盘有意义）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DifferDaysOfDeadline 当前时间距离盘到期的天数（仅对预付费盘有意义）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDifferDaysOfDeadline() {
        return this.DifferDaysOfDeadline;
    }

    /**
     * Set 当前时间距离盘到期的天数（仅对预付费盘有意义）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DifferDaysOfDeadline 当前时间距离盘到期的天数（仅对预付费盘有意义）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDifferDaysOfDeadline(Long DifferDaysOfDeadline) {
        this.DifferDaysOfDeadline = DifferDaysOfDeadline;
    }

    /**
     * Get 云盘是否处于类型变更中。取值范围：<br><li>false:表示云盘不处于类型变更中<br><li>true:表示云盘已发起类型变更，正处于迁移中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Migrating 云盘是否处于类型变更中。取值范围：<br><li>false:表示云盘不处于类型变更中<br><li>true:表示云盘已发起类型变更，正处于迁移中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMigrating() {
        return this.Migrating;
    }

    /**
     * Set 云盘是否处于类型变更中。取值范围：<br><li>false:表示云盘不处于类型变更中<br><li>true:表示云盘已发起类型变更，正处于迁移中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Migrating 云盘是否处于类型变更中。取值范围：<br><li>false:表示云盘不处于类型变更中<br><li>true:表示云盘已发起类型变更，正处于迁移中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrating(Boolean Migrating) {
        this.Migrating = Migrating;
    }

    /**
     * Get 云盘类型变更的迁移进度，取值0到100。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigratePercent 云盘类型变更的迁移进度，取值0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMigratePercent() {
        return this.MigratePercent;
    }

    /**
     * Set 云盘类型变更的迁移进度，取值0到100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigratePercent 云盘类型变更的迁移进度，取值0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigratePercent(Long MigratePercent) {
        this.MigratePercent = MigratePercent;
    }

    /**
     * Get 云盘是否为共享型云盘。 
     * @return Shareable 云盘是否为共享型云盘。
     */
    public Boolean getShareable() {
        return this.Shareable;
    }

    /**
     * Set 云盘是否为共享型云盘。
     * @param Shareable 云盘是否为共享型云盘。
     */
    public void setShareable(Boolean Shareable) {
        this.Shareable = Shareable;
    }

    /**
     * Get 对于非共享型云盘，该参数为空数组。对于共享型云盘，则表示该云盘当前被挂载到的CVM实例InstanceId 
     * @return InstanceIdList 对于非共享型云盘，该参数为空数组。对于共享型云盘，则表示该云盘当前被挂载到的CVM实例InstanceId
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set 对于非共享型云盘，该参数为空数组。对于共享型云盘，则表示该云盘当前被挂载到的CVM实例InstanceId
     * @param InstanceIdList 对于非共享型云盘，该参数为空数组。对于共享型云盘，则表示该云盘当前被挂载到的CVM实例InstanceId
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get 云盘拥有的快照总数。 
     * @return SnapshotCount 云盘拥有的快照总数。
     */
    public Long getSnapshotCount() {
        return this.SnapshotCount;
    }

    /**
     * Set 云盘拥有的快照总数。
     * @param SnapshotCount 云盘拥有的快照总数。
     */
    public void setSnapshotCount(Long SnapshotCount) {
        this.SnapshotCount = SnapshotCount;
    }

    /**
     * Get 云盘拥有的快照总容量，单位为MB。 
     * @return SnapshotSize 云盘拥有的快照总容量，单位为MB。
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set 云盘拥有的快照总容量，单位为MB。
     * @param SnapshotSize 云盘拥有的快照总容量，单位为MB。
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * Get 云盘因欠费销毁或者期销毁时， 是否使用快照备份数据的标识。True， 销毁时创建快照进行数据备份。False 表示直接销毁，不进行数据备份。 
     * @return BackupDisk 云盘因欠费销毁或者期销毁时， 是否使用快照备份数据的标识。True， 销毁时创建快照进行数据备份。False 表示直接销毁，不进行数据备份。
     */
    public Boolean getBackupDisk() {
        return this.BackupDisk;
    }

    /**
     * Set 云盘因欠费销毁或者期销毁时， 是否使用快照备份数据的标识。True， 销毁时创建快照进行数据备份。False 表示直接销毁，不进行数据备份。
     * @param BackupDisk 云盘因欠费销毁或者期销毁时， 是否使用快照备份数据的标识。True， 销毁时创建快照进行数据备份。False 表示直接销毁，不进行数据备份。
     */
    public void setBackupDisk(Boolean BackupDisk) {
        this.BackupDisk = BackupDisk;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "Portable", this.Portable);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "SnapshotAbility", this.SnapshotAbility);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskState", this.DiskState);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Attached", this.Attached);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Rollbacking", this.Rollbacking);
        this.setParamSimple(map, prefix + "RollbackPercent", this.RollbackPercent);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "AutoRenewFlagError", this.AutoRenewFlagError);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "DeadlineError", this.DeadlineError);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "DifferDaysOfDeadline", this.DifferDaysOfDeadline);
        this.setParamSimple(map, prefix + "Migrating", this.Migrating);
        this.setParamSimple(map, prefix + "MigratePercent", this.MigratePercent);
        this.setParamSimple(map, prefix + "Shareable", this.Shareable);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamSimple(map, prefix + "SnapshotCount", this.SnapshotCount);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "BackupDisk", this.BackupDisk);

    }
}

