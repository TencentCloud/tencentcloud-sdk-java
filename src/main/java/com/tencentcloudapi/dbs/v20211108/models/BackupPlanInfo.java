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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPlanInfo extends AbstractModel {

    /**
    * 地域信息。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备份计划 ID。
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * 备份计划名称。
    */
    @SerializedName("BackupPlanName")
    @Expose
    private String BackupPlanName;

    /**
    * 备份计划状态。可能的取值为：
"notStarted" - 未启动;
"checking" - 校验中;
"checkPass" - 校验通过;
"checkNotPass" - 校验未通过;
"running" - 运行中;
"fullBacking" - 全量备份中;
"isolating" - 隔离中;
"isolated" - 已隔离;
"offlining" - 下线中;
"offlined" - 已下线;
"paused" - 已暂停。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据库类型。
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 访问类型。可能的取值为：
"extranet" - 外网;
"cvm" - cvm 自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网。
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 源实例信息。
    */
    @SerializedName("SourceInfo")
    @Expose
    private String [] SourceInfo;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 到期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 下线时间。
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * 实例规格类型。可能的取值为：["micro", "small", "medium", "large", "xlarge"]。
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 备份方式。可能的取值为：
"logical" - 逻辑备份;
"physical" - 物理备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * 标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 自动续费标记。可能的取值为：
0 - 未开启自动续费;
1 - 已开启自动续费;
2 - 已关闭自动续费。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 是否开启增量备份标记。
    */
    @SerializedName("EnableIncrement")
    @Expose
    private Boolean EnableIncrement;

    /**
    * 付费类型。可能的取值为：
"prePay" - 预付费类型;
"postPay" - 后付费类型。
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 源端信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetSourceInfo")
    @Expose
    private String [] SetSourceInfo;

    /**
     * Get 地域信息。 
     * @return Region 地域信息。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息。
     * @param Region 地域信息。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备份计划 ID。 
     * @return BackupPlanId 备份计划 ID。
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set 备份计划 ID。
     * @param BackupPlanId 备份计划 ID。
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get 备份计划名称。 
     * @return BackupPlanName 备份计划名称。
     */
    public String getBackupPlanName() {
        return this.BackupPlanName;
    }

    /**
     * Set 备份计划名称。
     * @param BackupPlanName 备份计划名称。
     */
    public void setBackupPlanName(String BackupPlanName) {
        this.BackupPlanName = BackupPlanName;
    }

    /**
     * Get 备份计划状态。可能的取值为：
"notStarted" - 未启动;
"checking" - 校验中;
"checkPass" - 校验通过;
"checkNotPass" - 校验未通过;
"running" - 运行中;
"fullBacking" - 全量备份中;
"isolating" - 隔离中;
"isolated" - 已隔离;
"offlining" - 下线中;
"offlined" - 已下线;
"paused" - 已暂停。 
     * @return Status 备份计划状态。可能的取值为：
"notStarted" - 未启动;
"checking" - 校验中;
"checkPass" - 校验通过;
"checkNotPass" - 校验未通过;
"running" - 运行中;
"fullBacking" - 全量备份中;
"isolating" - 隔离中;
"isolated" - 已隔离;
"offlining" - 下线中;
"offlined" - 已下线;
"paused" - 已暂停。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 备份计划状态。可能的取值为：
"notStarted" - 未启动;
"checking" - 校验中;
"checkPass" - 校验通过;
"checkNotPass" - 校验未通过;
"running" - 运行中;
"fullBacking" - 全量备份中;
"isolating" - 隔离中;
"isolated" - 已隔离;
"offlining" - 下线中;
"offlined" - 已下线;
"paused" - 已暂停。
     * @param Status 备份计划状态。可能的取值为：
"notStarted" - 未启动;
"checking" - 校验中;
"checkPass" - 校验通过;
"checkNotPass" - 校验未通过;
"running" - 运行中;
"fullBacking" - 全量备份中;
"isolating" - 隔离中;
"isolated" - 已隔离;
"offlining" - 下线中;
"offlined" - 已下线;
"paused" - 已暂停。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据库类型。 
     * @return DatabaseType 数据库类型。
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 数据库类型。
     * @param DatabaseType 数据库类型。
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 访问类型。可能的取值为：
"extranet" - 外网;
"cvm" - cvm 自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网。 
     * @return AccessType 访问类型。可能的取值为：
"extranet" - 外网;
"cvm" - cvm 自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网。
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 访问类型。可能的取值为：
"extranet" - 外网;
"cvm" - cvm 自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网。
     * @param AccessType 访问类型。可能的取值为：
"extranet" - 外网;
"cvm" - cvm 自建实例;
"dcg" - 专线接入;
"vpncloud" - 云vpn接入;
"cdb" - 腾讯云数据库实例;
"ccn" - 云联网。
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 源实例信息。 
     * @return SourceInfo 源实例信息。
     */
    public String [] getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 源实例信息。
     * @param SourceInfo 源实例信息。
     */
    public void setSourceInfo(String [] SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 到期时间。 
     * @return ExpireTime 到期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间。
     * @param ExpireTime 到期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 下线时间。 
     * @return OfflineTime 下线时间。
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set 下线时间。
     * @param OfflineTime 下线时间。
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get 实例规格类型。可能的取值为：["micro", "small", "medium", "large", "xlarge"]。 
     * @return InstanceClass 实例规格类型。可能的取值为：["micro", "small", "medium", "large", "xlarge"]。
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 实例规格类型。可能的取值为：["micro", "small", "medium", "large", "xlarge"]。
     * @param InstanceClass 实例规格类型。可能的取值为：["micro", "small", "medium", "large", "xlarge"]。
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 备份方式。可能的取值为：
"logical" - 逻辑备份;
"physical" - 物理备份。 
     * @return BackupMethod 备份方式。可能的取值为：
"logical" - 逻辑备份;
"physical" - 物理备份。
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式。可能的取值为：
"logical" - 逻辑备份;
"physical" - 物理备份。
     * @param BackupMethod 备份方式。可能的取值为：
"logical" - 逻辑备份;
"physical" - 物理备份。
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 标签信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 自动续费标记。可能的取值为：
0 - 未开启自动续费;
1 - 已开启自动续费;
2 - 已关闭自动续费。 
     * @return AutoRenewFlag 自动续费标记。可能的取值为：
0 - 未开启自动续费;
1 - 已开启自动续费;
2 - 已关闭自动续费。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记。可能的取值为：
0 - 未开启自动续费;
1 - 已开启自动续费;
2 - 已关闭自动续费。
     * @param AutoRenewFlag 自动续费标记。可能的取值为：
0 - 未开启自动续费;
1 - 已开启自动续费;
2 - 已关闭自动续费。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 是否开启增量备份标记。 
     * @return EnableIncrement 是否开启增量备份标记。
     */
    public Boolean getEnableIncrement() {
        return this.EnableIncrement;
    }

    /**
     * Set 是否开启增量备份标记。
     * @param EnableIncrement 是否开启增量备份标记。
     */
    public void setEnableIncrement(Boolean EnableIncrement) {
        this.EnableIncrement = EnableIncrement;
    }

    /**
     * Get 付费类型。可能的取值为：
"prePay" - 预付费类型;
"postPay" - 后付费类型。 
     * @return PayType 付费类型。可能的取值为：
"prePay" - 预付费类型;
"postPay" - 后付费类型。
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费类型。可能的取值为：
"prePay" - 预付费类型;
"postPay" - 后付费类型。
     * @param PayType 付费类型。可能的取值为：
"prePay" - 预付费类型;
"postPay" - 后付费类型。
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 源端信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetSourceInfo 源端信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSetSourceInfo() {
        return this.SetSourceInfo;
    }

    /**
     * Set 源端信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetSourceInfo 源端信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetSourceInfo(String [] SetSourceInfo) {
        this.SetSourceInfo = SetSourceInfo;
    }

    public BackupPlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPlanInfo(BackupPlanInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.BackupPlanName != null) {
            this.BackupPlanName = new String(source.BackupPlanName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new String[source.SourceInfo.length];
            for (int i = 0; i < source.SourceInfo.length; i++) {
                this.SourceInfo[i] = new String(source.SourceInfo[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.EnableIncrement != null) {
            this.EnableIncrement = new Boolean(source.EnableIncrement);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.SetSourceInfo != null) {
            this.SetSourceInfo = new String[source.SetSourceInfo.length];
            for (int i = 0; i < source.SetSourceInfo.length; i++) {
                this.SetSourceInfo[i] = new String(source.SetSourceInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BackupPlanId", this.BackupPlanId);
        this.setParamSimple(map, prefix + "BackupPlanName", this.BackupPlanName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArraySimple(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "EnableIncrement", this.EnableIncrement);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamArraySimple(map, prefix + "SetSourceInfo.", this.SetSourceInfo);

    }
}

