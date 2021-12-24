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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationStatusInfo extends AbstractModel{

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 应用状态(1:待部署 2:部署中 3:运行中 4:待更新 5:更新中 6:待删除 7:删除中 8:已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 管理地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManageUrl")
    @Expose
    private String ManageUrl;

    /**
    * 负载类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
    * 应用部署模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMode")
    @Expose
    private ApplicationDeployMode DeployMode;

    /**
    * 期望Pod数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 运行Pod数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableReplicas")
    @Expose
    private Long AvailableReplicas;

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 应用版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 应用版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 应用版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 应用状态(1:待部署 2:部署中 3:运行中 4:待更新 5:更新中 6:待删除 7:删除中 8:已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 应用状态(1:待部署 2:部署中 3:运行中 4:待更新 5:更新中 6:待删除 7:删除中 8:已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 应用状态(1:待部署 2:部署中 3:运行中 4:待更新 5:更新中 6:待删除 7:删除中 8:已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 应用状态(1:待部署 2:部署中 3:运行中 4:待更新 5:更新中 6:待删除 7:删除中 8:已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 管理地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManageUrl 管理地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManageUrl() {
        return this.ManageUrl;
    }

    /**
     * Set 管理地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManageUrl 管理地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManageUrl(String ManageUrl) {
        this.ManageUrl = ManageUrl;
    }

    /**
     * Get 负载类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadKind 负载类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set 负载类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadKind 负载类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    /**
     * Get 应用部署模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMode 应用部署模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicationDeployMode getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 应用部署模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMode 应用部署模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMode(ApplicationDeployMode DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 期望Pod数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas 期望Pod数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 期望Pod数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 期望Pod数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 运行Pod数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableReplicas 运行Pod数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableReplicas() {
        return this.AvailableReplicas;
    }

    /**
     * Set 运行Pod数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableReplicas 运行Pod数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableReplicas(Long AvailableReplicas) {
        this.AvailableReplicas = AvailableReplicas;
    }

    public ApplicationStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationStatusInfo(ApplicationStatusInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ManageUrl != null) {
            this.ManageUrl = new String(source.ManageUrl);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new ApplicationDeployMode(source.DeployMode);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.AvailableReplicas != null) {
            this.AvailableReplicas = new Long(source.AvailableReplicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ManageUrl", this.ManageUrl);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);
        this.setParamObj(map, prefix + "DeployMode.", this.DeployMode);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "AvailableReplicas", this.AvailableReplicas);

    }
}

