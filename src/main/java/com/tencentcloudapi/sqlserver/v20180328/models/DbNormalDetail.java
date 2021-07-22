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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbNormalDetail extends AbstractModel{

    /**
    * 是否已订阅 0：否 1：是
    */
    @SerializedName("IsSubscribed")
    @Expose
    private String IsSubscribed;

    /**
    * 数据库排序规则
    */
    @SerializedName("CollationName")
    @Expose
    private String CollationName;

    /**
    * 开启CT之后是否自动清理 0：否 1：是
    */
    @SerializedName("IsAutoCleanupOn")
    @Expose
    private String IsAutoCleanupOn;

    /**
    * 是否已启用代理  0：否 1：是
    */
    @SerializedName("IsBrokerEnabled")
    @Expose
    private String IsBrokerEnabled;

    /**
    * 是否已开启/关闭CDC 0：关闭 1：开启
    */
    @SerializedName("IsCdcEnabled")
    @Expose
    private String IsCdcEnabled;

    /**
    * 是否已启用/ 禁用CT 0：禁用 1：启用
    */
    @SerializedName("IsDbChainingOn")
    @Expose
    private String IsDbChainingOn;

    /**
    * 是否加密 0：否 1：是
    */
    @SerializedName("IsEncrypted")
    @Expose
    private String IsEncrypted;

    /**
    * 是否全文启用 0：否 1：是
    */
    @SerializedName("IsFulltextEnabled")
    @Expose
    private String IsFulltextEnabled;

    /**
    * 是否是镜像 0：否 1：是
    */
    @SerializedName("IsMirroring")
    @Expose
    private String IsMirroring;

    /**
    * 是否已发布 0：否 1：是
    */
    @SerializedName("IsPublished")
    @Expose
    private String IsPublished;

    /**
    * 是否开启快照 0：否 1：是
    */
    @SerializedName("IsReadCommittedSnapshotOn")
    @Expose
    private String IsReadCommittedSnapshotOn;

    /**
    * 是否可信任 0：否 1：是
    */
    @SerializedName("IsTrustworthyOn")
    @Expose
    private String IsTrustworthyOn;

    /**
    * 镜像状态
    */
    @SerializedName("MirroringState")
    @Expose
    private String MirroringState;

    /**
    * 数据库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 恢复模式
    */
    @SerializedName("RecoveryModelDesc")
    @Expose
    private String RecoveryModelDesc;

    /**
    * 保留天数
    */
    @SerializedName("RetentionPeriod")
    @Expose
    private String RetentionPeriod;

    /**
    * 数据库状态
    */
    @SerializedName("StateDesc")
    @Expose
    private String StateDesc;

    /**
    * 用户类型
    */
    @SerializedName("UserAccessDesc")
    @Expose
    private String UserAccessDesc;

    /**
     * Get 是否已订阅 0：否 1：是 
     * @return IsSubscribed 是否已订阅 0：否 1：是
     */
    public String getIsSubscribed() {
        return this.IsSubscribed;
    }

    /**
     * Set 是否已订阅 0：否 1：是
     * @param IsSubscribed 是否已订阅 0：否 1：是
     */
    public void setIsSubscribed(String IsSubscribed) {
        this.IsSubscribed = IsSubscribed;
    }

    /**
     * Get 数据库排序规则 
     * @return CollationName 数据库排序规则
     */
    public String getCollationName() {
        return this.CollationName;
    }

    /**
     * Set 数据库排序规则
     * @param CollationName 数据库排序规则
     */
    public void setCollationName(String CollationName) {
        this.CollationName = CollationName;
    }

    /**
     * Get 开启CT之后是否自动清理 0：否 1：是 
     * @return IsAutoCleanupOn 开启CT之后是否自动清理 0：否 1：是
     */
    public String getIsAutoCleanupOn() {
        return this.IsAutoCleanupOn;
    }

    /**
     * Set 开启CT之后是否自动清理 0：否 1：是
     * @param IsAutoCleanupOn 开启CT之后是否自动清理 0：否 1：是
     */
    public void setIsAutoCleanupOn(String IsAutoCleanupOn) {
        this.IsAutoCleanupOn = IsAutoCleanupOn;
    }

    /**
     * Get 是否已启用代理  0：否 1：是 
     * @return IsBrokerEnabled 是否已启用代理  0：否 1：是
     */
    public String getIsBrokerEnabled() {
        return this.IsBrokerEnabled;
    }

    /**
     * Set 是否已启用代理  0：否 1：是
     * @param IsBrokerEnabled 是否已启用代理  0：否 1：是
     */
    public void setIsBrokerEnabled(String IsBrokerEnabled) {
        this.IsBrokerEnabled = IsBrokerEnabled;
    }

    /**
     * Get 是否已开启/关闭CDC 0：关闭 1：开启 
     * @return IsCdcEnabled 是否已开启/关闭CDC 0：关闭 1：开启
     */
    public String getIsCdcEnabled() {
        return this.IsCdcEnabled;
    }

    /**
     * Set 是否已开启/关闭CDC 0：关闭 1：开启
     * @param IsCdcEnabled 是否已开启/关闭CDC 0：关闭 1：开启
     */
    public void setIsCdcEnabled(String IsCdcEnabled) {
        this.IsCdcEnabled = IsCdcEnabled;
    }

    /**
     * Get 是否已启用/ 禁用CT 0：禁用 1：启用 
     * @return IsDbChainingOn 是否已启用/ 禁用CT 0：禁用 1：启用
     */
    public String getIsDbChainingOn() {
        return this.IsDbChainingOn;
    }

    /**
     * Set 是否已启用/ 禁用CT 0：禁用 1：启用
     * @param IsDbChainingOn 是否已启用/ 禁用CT 0：禁用 1：启用
     */
    public void setIsDbChainingOn(String IsDbChainingOn) {
        this.IsDbChainingOn = IsDbChainingOn;
    }

    /**
     * Get 是否加密 0：否 1：是 
     * @return IsEncrypted 是否加密 0：否 1：是
     */
    public String getIsEncrypted() {
        return this.IsEncrypted;
    }

    /**
     * Set 是否加密 0：否 1：是
     * @param IsEncrypted 是否加密 0：否 1：是
     */
    public void setIsEncrypted(String IsEncrypted) {
        this.IsEncrypted = IsEncrypted;
    }

    /**
     * Get 是否全文启用 0：否 1：是 
     * @return IsFulltextEnabled 是否全文启用 0：否 1：是
     */
    public String getIsFulltextEnabled() {
        return this.IsFulltextEnabled;
    }

    /**
     * Set 是否全文启用 0：否 1：是
     * @param IsFulltextEnabled 是否全文启用 0：否 1：是
     */
    public void setIsFulltextEnabled(String IsFulltextEnabled) {
        this.IsFulltextEnabled = IsFulltextEnabled;
    }

    /**
     * Get 是否是镜像 0：否 1：是 
     * @return IsMirroring 是否是镜像 0：否 1：是
     */
    public String getIsMirroring() {
        return this.IsMirroring;
    }

    /**
     * Set 是否是镜像 0：否 1：是
     * @param IsMirroring 是否是镜像 0：否 1：是
     */
    public void setIsMirroring(String IsMirroring) {
        this.IsMirroring = IsMirroring;
    }

    /**
     * Get 是否已发布 0：否 1：是 
     * @return IsPublished 是否已发布 0：否 1：是
     */
    public String getIsPublished() {
        return this.IsPublished;
    }

    /**
     * Set 是否已发布 0：否 1：是
     * @param IsPublished 是否已发布 0：否 1：是
     */
    public void setIsPublished(String IsPublished) {
        this.IsPublished = IsPublished;
    }

    /**
     * Get 是否开启快照 0：否 1：是 
     * @return IsReadCommittedSnapshotOn 是否开启快照 0：否 1：是
     */
    public String getIsReadCommittedSnapshotOn() {
        return this.IsReadCommittedSnapshotOn;
    }

    /**
     * Set 是否开启快照 0：否 1：是
     * @param IsReadCommittedSnapshotOn 是否开启快照 0：否 1：是
     */
    public void setIsReadCommittedSnapshotOn(String IsReadCommittedSnapshotOn) {
        this.IsReadCommittedSnapshotOn = IsReadCommittedSnapshotOn;
    }

    /**
     * Get 是否可信任 0：否 1：是 
     * @return IsTrustworthyOn 是否可信任 0：否 1：是
     */
    public String getIsTrustworthyOn() {
        return this.IsTrustworthyOn;
    }

    /**
     * Set 是否可信任 0：否 1：是
     * @param IsTrustworthyOn 是否可信任 0：否 1：是
     */
    public void setIsTrustworthyOn(String IsTrustworthyOn) {
        this.IsTrustworthyOn = IsTrustworthyOn;
    }

    /**
     * Get 镜像状态 
     * @return MirroringState 镜像状态
     */
    public String getMirroringState() {
        return this.MirroringState;
    }

    /**
     * Set 镜像状态
     * @param MirroringState 镜像状态
     */
    public void setMirroringState(String MirroringState) {
        this.MirroringState = MirroringState;
    }

    /**
     * Get 数据库名称 
     * @return Name 数据库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名称
     * @param Name 数据库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 恢复模式 
     * @return RecoveryModelDesc 恢复模式
     */
    public String getRecoveryModelDesc() {
        return this.RecoveryModelDesc;
    }

    /**
     * Set 恢复模式
     * @param RecoveryModelDesc 恢复模式
     */
    public void setRecoveryModelDesc(String RecoveryModelDesc) {
        this.RecoveryModelDesc = RecoveryModelDesc;
    }

    /**
     * Get 保留天数 
     * @return RetentionPeriod 保留天数
     */
    public String getRetentionPeriod() {
        return this.RetentionPeriod;
    }

    /**
     * Set 保留天数
     * @param RetentionPeriod 保留天数
     */
    public void setRetentionPeriod(String RetentionPeriod) {
        this.RetentionPeriod = RetentionPeriod;
    }

    /**
     * Get 数据库状态 
     * @return StateDesc 数据库状态
     */
    public String getStateDesc() {
        return this.StateDesc;
    }

    /**
     * Set 数据库状态
     * @param StateDesc 数据库状态
     */
    public void setStateDesc(String StateDesc) {
        this.StateDesc = StateDesc;
    }

    /**
     * Get 用户类型 
     * @return UserAccessDesc 用户类型
     */
    public String getUserAccessDesc() {
        return this.UserAccessDesc;
    }

    /**
     * Set 用户类型
     * @param UserAccessDesc 用户类型
     */
    public void setUserAccessDesc(String UserAccessDesc) {
        this.UserAccessDesc = UserAccessDesc;
    }

    public DbNormalDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DbNormalDetail(DbNormalDetail source) {
        if (source.IsSubscribed != null) {
            this.IsSubscribed = new String(source.IsSubscribed);
        }
        if (source.CollationName != null) {
            this.CollationName = new String(source.CollationName);
        }
        if (source.IsAutoCleanupOn != null) {
            this.IsAutoCleanupOn = new String(source.IsAutoCleanupOn);
        }
        if (source.IsBrokerEnabled != null) {
            this.IsBrokerEnabled = new String(source.IsBrokerEnabled);
        }
        if (source.IsCdcEnabled != null) {
            this.IsCdcEnabled = new String(source.IsCdcEnabled);
        }
        if (source.IsDbChainingOn != null) {
            this.IsDbChainingOn = new String(source.IsDbChainingOn);
        }
        if (source.IsEncrypted != null) {
            this.IsEncrypted = new String(source.IsEncrypted);
        }
        if (source.IsFulltextEnabled != null) {
            this.IsFulltextEnabled = new String(source.IsFulltextEnabled);
        }
        if (source.IsMirroring != null) {
            this.IsMirroring = new String(source.IsMirroring);
        }
        if (source.IsPublished != null) {
            this.IsPublished = new String(source.IsPublished);
        }
        if (source.IsReadCommittedSnapshotOn != null) {
            this.IsReadCommittedSnapshotOn = new String(source.IsReadCommittedSnapshotOn);
        }
        if (source.IsTrustworthyOn != null) {
            this.IsTrustworthyOn = new String(source.IsTrustworthyOn);
        }
        if (source.MirroringState != null) {
            this.MirroringState = new String(source.MirroringState);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RecoveryModelDesc != null) {
            this.RecoveryModelDesc = new String(source.RecoveryModelDesc);
        }
        if (source.RetentionPeriod != null) {
            this.RetentionPeriod = new String(source.RetentionPeriod);
        }
        if (source.StateDesc != null) {
            this.StateDesc = new String(source.StateDesc);
        }
        if (source.UserAccessDesc != null) {
            this.UserAccessDesc = new String(source.UserAccessDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSubscribed", this.IsSubscribed);
        this.setParamSimple(map, prefix + "CollationName", this.CollationName);
        this.setParamSimple(map, prefix + "IsAutoCleanupOn", this.IsAutoCleanupOn);
        this.setParamSimple(map, prefix + "IsBrokerEnabled", this.IsBrokerEnabled);
        this.setParamSimple(map, prefix + "IsCdcEnabled", this.IsCdcEnabled);
        this.setParamSimple(map, prefix + "IsDbChainingOn", this.IsDbChainingOn);
        this.setParamSimple(map, prefix + "IsEncrypted", this.IsEncrypted);
        this.setParamSimple(map, prefix + "IsFulltextEnabled", this.IsFulltextEnabled);
        this.setParamSimple(map, prefix + "IsMirroring", this.IsMirroring);
        this.setParamSimple(map, prefix + "IsPublished", this.IsPublished);
        this.setParamSimple(map, prefix + "IsReadCommittedSnapshotOn", this.IsReadCommittedSnapshotOn);
        this.setParamSimple(map, prefix + "IsTrustworthyOn", this.IsTrustworthyOn);
        this.setParamSimple(map, prefix + "MirroringState", this.MirroringState);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RecoveryModelDesc", this.RecoveryModelDesc);
        this.setParamSimple(map, prefix + "RetentionPeriod", this.RetentionPeriod);
        this.setParamSimple(map, prefix + "StateDesc", this.StateDesc);
        this.setParamSimple(map, prefix + "UserAccessDesc", this.UserAccessDesc);

    }
}

