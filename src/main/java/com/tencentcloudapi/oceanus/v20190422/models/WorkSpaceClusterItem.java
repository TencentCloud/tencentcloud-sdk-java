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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkSpaceClusterItem extends AbstractModel{

    /**
    * 集群 ID
    */
    @SerializedName("ClusterGroupId")
    @Expose
    private Long ClusterGroupId;

    /**
    * 集群 SerialId
    */
    @SerializedName("ClusterGroupSerialId")
    @Expose
    private String ClusterGroupSerialId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 工作空间名称
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
    * 绑定状态  2 绑定 1  解除绑定
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目ID string类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectIdStr")
    @Expose
    private String ProjectIdStr;

    /**
     * Get 集群 ID 
     * @return ClusterGroupId 集群 ID
     */
    public Long getClusterGroupId() {
        return this.ClusterGroupId;
    }

    /**
     * Set 集群 ID
     * @param ClusterGroupId 集群 ID
     */
    public void setClusterGroupId(Long ClusterGroupId) {
        this.ClusterGroupId = ClusterGroupId;
    }

    /**
     * Get 集群 SerialId 
     * @return ClusterGroupSerialId 集群 SerialId
     */
    public String getClusterGroupSerialId() {
        return this.ClusterGroupSerialId;
    }

    /**
     * Set 集群 SerialId
     * @param ClusterGroupSerialId 集群 SerialId
     */
    public void setClusterGroupSerialId(String ClusterGroupSerialId) {
        this.ClusterGroupSerialId = ClusterGroupSerialId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 工作空间名称 
     * @return WorkSpaceName 工作空间名称
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set 工作空间名称
     * @param WorkSpaceName 工作空间名称
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    /**
     * Get 绑定状态  2 绑定 1  解除绑定 
     * @return Status 绑定状态  2 绑定 1  解除绑定
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 绑定状态  2 绑定 1  解除绑定
     * @param Status 绑定状态  2 绑定 1  解除绑定
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目ID string类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectIdStr 项目ID string类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectIdStr() {
        return this.ProjectIdStr;
    }

    /**
     * Set 项目ID string类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectIdStr 项目ID string类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectIdStr(String ProjectIdStr) {
        this.ProjectIdStr = ProjectIdStr;
    }

    public WorkSpaceClusterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkSpaceClusterItem(WorkSpaceClusterItem source) {
        if (source.ClusterGroupId != null) {
            this.ClusterGroupId = new Long(source.ClusterGroupId);
        }
        if (source.ClusterGroupSerialId != null) {
            this.ClusterGroupSerialId = new String(source.ClusterGroupSerialId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.WorkSpaceName != null) {
            this.WorkSpaceName = new String(source.WorkSpaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectIdStr != null) {
            this.ProjectIdStr = new String(source.ProjectIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterGroupId", this.ClusterGroupId);
        this.setParamSimple(map, prefix + "ClusterGroupSerialId", this.ClusterGroupSerialId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdStr", this.ProjectIdStr);

    }
}

