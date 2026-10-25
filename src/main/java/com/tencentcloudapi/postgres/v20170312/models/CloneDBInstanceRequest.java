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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneDBInstanceRequest extends AbstractModel {

    /**
    * <p>克隆的源实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>实例磁盘容量大小，设置步长限制为10。单位：GB。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>购买时长，单位：月。</p><ul><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>续费标记。仅当计费模式为预付费时生效。<br>枚举值：</p><ul><li>0：手动续费</li><li>1：自动续费</li></ul><p>默认值：0</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>私有网络ID，形如vpc-xxxxxxxx。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如subnet-xxxxxxxx。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>新购的实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;源实例名-Copy&quot;。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例计费类型，目前支持：</p><ul><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li></ul><p>默认值：PREPAID</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例所属安全组。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a>的返回值中的SecurityGroupId字段来获取。若不指定该参数，则绑定默认安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>项目ID。默认值为0，表示所属默认项目。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>实例节点部署信息，必须填写主备节点可用区。支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * <p>是否自动使用代金券：</p><ul><li>0：否</li><li>1：是</li></ul><p>默认值：0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID列表。</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String VoucherIds;

    /**
    * <p>活动ID。</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * <p>基础备份集ID。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * <p>恢复时间点。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
    */
    @SerializedName("RecoveryTargetTime")
    @Expose
    private String RecoveryTargetTime;

    /**
    * <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get <p>克隆的源实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>克隆的源实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>克隆的源实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>克隆的源实例ID。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p> 
     * @return SpecCode <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     * @param SpecCode <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>实例磁盘容量大小，设置步长限制为10。单位：GB。</p> 
     * @return Storage <p>实例磁盘容量大小，设置步长限制为10。单位：GB。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例磁盘容量大小，设置步长限制为10。单位：GB。</p>
     * @param Storage <p>实例磁盘容量大小，设置步长限制为10。单位：GB。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>购买时长，单位：月。</p><ul><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li></ul> 
     * @return Period <p>购买时长，单位：月。</p><ul><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，单位：月。</p><ul><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li></ul>
     * @param Period <p>购买时长，单位：月。</p><ul><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>续费标记。仅当计费模式为预付费时生效。<br>枚举值：</p><ul><li>0：手动续费</li><li>1：自动续费</li></ul><p>默认值：0</p> 
     * @return AutoRenewFlag <p>续费标记。仅当计费模式为预付费时生效。<br>枚举值：</p><ul><li>0：手动续费</li><li>1：自动续费</li></ul><p>默认值：0</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>续费标记。仅当计费模式为预付费时生效。<br>枚举值：</p><ul><li>0：手动续费</li><li>1：自动续费</li></ul><p>默认值：0</p>
     * @param AutoRenewFlag <p>续费标记。仅当计费模式为预付费时生效。<br>枚举值：</p><ul><li>0：手动续费</li><li>1：自动续费</li></ul><p>默认值：0</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>私有网络ID，形如vpc-xxxxxxxx。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p> 
     * @return VpcId <p>私有网络ID，形如vpc-xxxxxxxx。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如vpc-xxxxxxxx。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     * @param VpcId <p>私有网络ID，形如vpc-xxxxxxxx。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如subnet-xxxxxxxx。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p> 
     * @return SubnetId <p>私有网络子网ID，形如subnet-xxxxxxxx。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如subnet-xxxxxxxx。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     * @param SubnetId <p>私有网络子网ID，形如subnet-xxxxxxxx。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>新购的实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;源实例名-Copy&quot;。</p> 
     * @return Name <p>新购的实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;源实例名-Copy&quot;。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>新购的实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;源实例名-Copy&quot;。</p>
     * @param Name <p>新购的实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;源实例名-Copy&quot;。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例计费类型，目前支持：</p><ul><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li></ul><p>默认值：PREPAID</p> 
     * @return InstanceChargeType <p>实例计费类型，目前支持：</p><ul><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li></ul><p>默认值：PREPAID</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型，目前支持：</p><ul><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li></ul><p>默认值：PREPAID</p>
     * @param InstanceChargeType <p>实例计费类型，目前支持：</p><ul><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li></ul><p>默认值：PREPAID</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例所属安全组。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a>的返回值中的SecurityGroupId字段来获取。若不指定该参数，则绑定默认安全组。</p> 
     * @return SecurityGroupIds <p>实例所属安全组。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a>的返回值中的SecurityGroupId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a>的返回值中的SecurityGroupId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     * @param SecurityGroupIds <p>实例所属安全组。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a>的返回值中的SecurityGroupId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>项目ID。默认值为0，表示所属默认项目。</p> 
     * @return ProjectId <p>项目ID。默认值为0，表示所属默认项目。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID。默认值为0，表示所属默认项目。</p>
     * @param ProjectId <p>项目ID。默认值为0，表示所属默认项目。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p> 
     * @return TagList <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     * @param TagList <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>实例节点部署信息，必须填写主备节点可用区。支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p> 
     * @return DBNodeSet <p>实例节点部署信息，必须填写主备节点可用区。支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set <p>实例节点部署信息，必须填写主备节点可用区。支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     * @param DBNodeSet <p>实例节点部署信息，必须填写主备节点可用区。支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get <p>是否自动使用代金券：</p><ul><li>0：否</li><li>1：是</li></ul><p>默认值：0</p> 
     * @return AutoVoucher <p>是否自动使用代金券：</p><ul><li>0：否</li><li>1：是</li></ul><p>默认值：0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券：</p><ul><li>0：否</li><li>1：是</li></ul><p>默认值：0</p>
     * @param AutoVoucher <p>是否自动使用代金券：</p><ul><li>0：否</li><li>1：是</li></ul><p>默认值：0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID列表。</p> 
     * @return VoucherIds <p>代金券ID列表。</p>
     */
    public String getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID列表。</p>
     * @param VoucherIds <p>代金券ID列表。</p>
     */
    public void setVoucherIds(String VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>活动ID。</p> 
     * @return ActivityId <p>活动ID。</p>
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>活动ID。</p>
     * @param ActivityId <p>活动ID。</p>
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>基础备份集ID。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p> 
     * @return BackupSetId <p>基础备份集ID。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set <p>基础备份集ID。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
     * @param BackupSetId <p>基础备份集ID。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get <p>恢复时间点。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p> 
     * @return RecoveryTargetTime <p>恢复时间点。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
     */
    public String getRecoveryTargetTime() {
        return this.RecoveryTargetTime;
    }

    /**
     * Set <p>恢复时间点。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
     * @param RecoveryTargetTime <p>恢复时间点。参数BackupSetId、RecoveryTargetTime两者必须填写一项，且不能同时填写。</p>
     */
    public void setRecoveryTargetTime(String RecoveryTargetTime) {
        this.RecoveryTargetTime = RecoveryTargetTime;
    }

    /**
     * Get <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async 
     * @return SyncMode <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
     * @param SyncMode <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p> 
     * @return DeletionProtection <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     * @param DeletionProtection <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
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
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
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
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

