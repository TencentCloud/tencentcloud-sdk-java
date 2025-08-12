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

public class FileConfigRelease extends AbstractModel {

    /**
    * 配置项发布ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigReleaseId")
    @Expose
    private String ConfigReleaseId;

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
    * 发布描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
    * 发布时间。格式为 YYYY-MM-DD hh:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

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
    * 配置中心发布详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigCenters")
    @Expose
    private TsfConfigCenter [] ConfigCenters;

    /**
     * Get 配置项发布ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigReleaseId 配置项发布ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigReleaseId() {
        return this.ConfigReleaseId;
    }

    /**
     * Set 配置项发布ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigReleaseId 配置项发布ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigReleaseId(String ConfigReleaseId) {
        this.ConfigReleaseId = ConfigReleaseId;
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
     * Get 发布时间。格式为 YYYY-MM-DD hh:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 发布时间。格式为 YYYY-MM-DD hh:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 发布时间。格式为 YYYY-MM-DD hh:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 发布时间。格式为 YYYY-MM-DD hh:mm:ss。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
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
     * Get 配置中心发布详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigCenters 配置中心发布详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TsfConfigCenter [] getConfigCenters() {
        return this.ConfigCenters;
    }

    /**
     * Set 配置中心发布详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigCenters 配置中心发布详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigCenters(TsfConfigCenter [] ConfigCenters) {
        this.ConfigCenters = ConfigCenters;
    }

    public FileConfigRelease() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileConfigRelease(FileConfigRelease source) {
        if (source.ConfigReleaseId != null) {
            this.ConfigReleaseId = new String(source.ConfigReleaseId);
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
        if (source.ReleaseDesc != null) {
            this.ReleaseDesc = new String(source.ReleaseDesc);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
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
        if (source.ConfigCenters != null) {
            this.ConfigCenters = new TsfConfigCenter[source.ConfigCenters.length];
            for (int i = 0; i < source.ConfigCenters.length; i++) {
                this.ConfigCenters[i] = new TsfConfigCenter(source.ConfigCenters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigReleaseId", this.ConfigReleaseId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamArrayObj(map, prefix + "ConfigCenters.", this.ConfigCenters);

    }
}

