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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigReleaseLog extends AbstractModel {

    /**
    * 配置项发布日志ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigReleaseLogId")
    @Expose
    private String ConfigReleaseLogId;

    /**
    * 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 发布描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
    * 发布状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private String ReleaseStatus;

    /**
    * 上次发布的配置项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastConfigId")
    @Expose
    private String LastConfigId;

    /**
    * 上次发布的配置项名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastConfigName")
    @Expose
    private String LastConfigName;

    /**
    * 上次发布的配置项版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastConfigVersion")
    @Expose
    private String LastConfigVersion;

    /**
    * 回滚标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollbackFlag")
    @Expose
    private Boolean RollbackFlag;

    /**
    * 发布成功的配置中心
 ALL/EXCLUSIVE/SHARE/NONE

全部发布成功，独占发布成功，共享发布成功，全部发布失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleasedConfigCenter")
    @Expose
    private String ReleasedConfigCenter;

    /**
     * Get 配置项发布日志ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigReleaseLogId 配置项发布日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigReleaseLogId() {
        return this.ConfigReleaseLogId;
    }

    /**
     * Set 配置项发布日志ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigReleaseLogId 配置项发布日志ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigReleaseLogId(String ConfigReleaseLogId) {
        this.ConfigReleaseLogId = ConfigReleaseLogId;
    }

    /**
     * Get 配置项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 配置项名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置项版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigVersion 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * Set 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigVersion 配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    /**
     * Get 部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 发布描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseDesc 发布描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseDesc() {
        return this.ReleaseDesc;
    }

    /**
     * Set 发布描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseDesc 发布描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseDesc(String ReleaseDesc) {
        this.ReleaseDesc = ReleaseDesc;
    }

    /**
     * Get 发布状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseStatus 发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseStatus 发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseStatus(String ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get 上次发布的配置项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastConfigId 上次发布的配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastConfigId() {
        return this.LastConfigId;
    }

    /**
     * Set 上次发布的配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastConfigId 上次发布的配置项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastConfigId(String LastConfigId) {
        this.LastConfigId = LastConfigId;
    }

    /**
     * Get 上次发布的配置项名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastConfigName 上次发布的配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastConfigName() {
        return this.LastConfigName;
    }

    /**
     * Set 上次发布的配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastConfigName 上次发布的配置项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastConfigName(String LastConfigName) {
        this.LastConfigName = LastConfigName;
    }

    /**
     * Get 上次发布的配置项版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastConfigVersion 上次发布的配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastConfigVersion() {
        return this.LastConfigVersion;
    }

    /**
     * Set 上次发布的配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastConfigVersion 上次发布的配置项版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastConfigVersion(String LastConfigVersion) {
        this.LastConfigVersion = LastConfigVersion;
    }

    /**
     * Get 回滚标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollbackFlag 回滚标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRollbackFlag() {
        return this.RollbackFlag;
    }

    /**
     * Set 回滚标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollbackFlag 回滚标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbackFlag(Boolean RollbackFlag) {
        this.RollbackFlag = RollbackFlag;
    }

    /**
     * Get 发布成功的配置中心
 ALL/EXCLUSIVE/SHARE/NONE

全部发布成功，独占发布成功，共享发布成功，全部发布失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleasedConfigCenter 发布成功的配置中心
 ALL/EXCLUSIVE/SHARE/NONE

全部发布成功，独占发布成功，共享发布成功，全部发布失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleasedConfigCenter() {
        return this.ReleasedConfigCenter;
    }

    /**
     * Set 发布成功的配置中心
 ALL/EXCLUSIVE/SHARE/NONE

全部发布成功，独占发布成功，共享发布成功，全部发布失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleasedConfigCenter 发布成功的配置中心
 ALL/EXCLUSIVE/SHARE/NONE

全部发布成功，独占发布成功，共享发布成功，全部发布失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleasedConfigCenter(String ReleasedConfigCenter) {
        this.ReleasedConfigCenter = ReleasedConfigCenter;
    }

    public ConfigReleaseLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigReleaseLog(ConfigReleaseLog source) {
        if (source.ConfigReleaseLogId != null) {
            this.ConfigReleaseLogId = new String(source.ConfigReleaseLogId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigVersion != null) {
            this.ConfigVersion = new String(source.ConfigVersion);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.ReleaseDesc != null) {
            this.ReleaseDesc = new String(source.ReleaseDesc);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new String(source.ReleaseStatus);
        }
        if (source.LastConfigId != null) {
            this.LastConfigId = new String(source.LastConfigId);
        }
        if (source.LastConfigName != null) {
            this.LastConfigName = new String(source.LastConfigName);
        }
        if (source.LastConfigVersion != null) {
            this.LastConfigVersion = new String(source.LastConfigVersion);
        }
        if (source.RollbackFlag != null) {
            this.RollbackFlag = new Boolean(source.RollbackFlag);
        }
        if (source.ReleasedConfigCenter != null) {
            this.ReleasedConfigCenter = new String(source.ReleasedConfigCenter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigReleaseLogId", this.ConfigReleaseLogId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "LastConfigId", this.LastConfigId);
        this.setParamSimple(map, prefix + "LastConfigName", this.LastConfigName);
        this.setParamSimple(map, prefix + "LastConfigVersion", this.LastConfigVersion);
        this.setParamSimple(map, prefix + "RollbackFlag", this.RollbackFlag);
        this.setParamSimple(map, prefix + "ReleasedConfigCenter", this.ReleasedConfigCenter);

    }
}

