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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterAttributeResponse extends AbstractModel{

    /**
    * 集群所属项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * 自动变配集群等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private AutoUpgradeClusterLevel AutoUpgradeClusterLevel;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群所属项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 集群所属项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 集群所属项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 集群所属项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 集群描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterDesc 集群描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 集群描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDesc 集群描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 集群等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterLevel 集群等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set 集群等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterLevel 集群等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get 自动变配集群等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoUpgradeClusterLevel 自动变配集群等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoUpgradeClusterLevel getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set 自动变配集群等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoUpgradeClusterLevel 自动变配集群等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoUpgradeClusterLevel(AutoUpgradeClusterLevel AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyClusterAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterAttributeResponse(ModifyClusterAttributeResponse source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new AutoUpgradeClusterLevel(source.AutoUpgradeClusterLevel);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamObj(map, prefix + "AutoUpgradeClusterLevel.", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

