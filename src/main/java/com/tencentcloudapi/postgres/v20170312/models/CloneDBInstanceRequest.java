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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneDBInstanceRequest extends AbstractModel{

    /**
    * 克隆的源实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * 实例容量大小，单位：GB。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 续费标记：0-正常续费（默认）；1-自动续费。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 已配置的私有网络中的子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 新购实例的实例名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 安全组ID。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例需要绑定的Tag信息，默认为空。
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * 购买多可用区实例时填写。
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * 是否自动使用代金券。1（是），0（否），默认不使用。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 代金券ID列表。
    */
    @SerializedName("VoucherIds")
    @Expose
    private String VoucherIds;

    /**
    * 活动ID。
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 基础备份集ID。
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * 恢复时间点。
    */
    @SerializedName("RecoveryTargetTime")
    @Expose
    private String RecoveryTargetTime;

    /**
     * Get 克隆的源实例ID。 
     * @return DBInstanceId 克隆的源实例ID。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 克隆的源实例ID。
     * @param DBInstanceId 克隆的源实例ID。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。 
     * @return SpecCode 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     * @param SpecCode 售卖规格ID。该参数可以通过调用DescribeProductConfig的返回值中的SpecCode字段来获取。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get 实例容量大小，单位：GB。 
     * @return Storage 实例容量大小，单位：GB。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例容量大小，单位：GB。
     * @param Storage 实例容量大小，单位：GB。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。 
     * @return Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
     * @param Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值，按量计费模式下该参数传1。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 续费标记：0-正常续费（默认）；1-自动续费。 
     * @return AutoRenewFlag 续费标记：0-正常续费（默认）；1-自动续费。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 续费标记：0-正常续费（默认）；1-自动续费。
     * @param AutoRenewFlag 续费标记：0-正常续费（默认）；1-自动续费。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 私有网络ID。 
     * @return VpcId 私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID。
     * @param VpcId 私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 已配置的私有网络中的子网ID。 
     * @return SubnetId 已配置的私有网络中的子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 已配置的私有网络中的子网ID。
     * @param SubnetId 已配置的私有网络中的子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 新购实例的实例名称。 
     * @return Name 新购实例的实例名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 新购实例的实例名称。
     * @param Name 新购实例的实例名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。 
     * @return InstanceChargeType 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
     * @param InstanceChargeType 实例计费类型。目前支持：PREPAID（预付费，即包年包月），POSTPAID_BY_HOUR（后付费，即按量计费）。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 安全组ID。 
     * @return SecurityGroupIds 安全组ID。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID。
     * @param SecurityGroupIds 安全组ID。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例需要绑定的Tag信息，默认为空。 
     * @return TagList 实例需要绑定的Tag信息，默认为空。
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 实例需要绑定的Tag信息，默认为空。
     * @param TagList 实例需要绑定的Tag信息，默认为空。
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 购买多可用区实例时填写。 
     * @return DBNodeSet 购买多可用区实例时填写。
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set 购买多可用区实例时填写。
     * @param DBNodeSet 购买多可用区实例时填写。
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get 是否自动使用代金券。1（是），0（否），默认不使用。 
     * @return AutoVoucher 是否自动使用代金券。1（是），0（否），默认不使用。
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动使用代金券。1（是），0（否），默认不使用。
     * @param AutoVoucher 是否自动使用代金券。1（是），0（否），默认不使用。
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券ID列表。 
     * @return VoucherIds 代金券ID列表。
     */
    public String getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券ID列表。
     * @param VoucherIds 代金券ID列表。
     */
    public void setVoucherIds(String VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get 活动ID。 
     * @return ActivityId 活动ID。
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID。
     * @param ActivityId 活动ID。
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 基础备份集ID。 
     * @return BackupSetId 基础备份集ID。
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set 基础备份集ID。
     * @param BackupSetId 基础备份集ID。
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get 恢复时间点。 
     * @return RecoveryTargetTime 恢复时间点。
     */
    public String getRecoveryTargetTime() {
        return this.RecoveryTargetTime;
    }

    /**
     * Set 恢复时间点。
     * @param RecoveryTargetTime 恢复时间点。
     */
    public void setRecoveryTargetTime(String RecoveryTargetTime) {
        this.RecoveryTargetTime = RecoveryTargetTime;
    }

    public CloneDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneDBInstanceRequest(CloneDBInstanceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String(source.VoucherIds);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.RecoveryTargetTime != null) {
            this.RecoveryTargetTime = new String(source.RecoveryTargetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "VoucherIds", this.VoucherIds);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "RecoveryTargetTime", this.RecoveryTargetTime);

    }
}

