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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel{

    /**
    * 环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 环境描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 环境地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 环境类型，取值范围：
- KUBERNETES：Kubernetes容器集群
- HPC：HPC高性能计算集群
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 环境状态，取值范围：
- INITIALIZING：创建中
- INITIALIZATION_ERROR：创建失败
- RUNNING：运行中
- ERROR：异常
- DELETING：正在删除
- DELETE_ERROR：删除失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 环境是否可用。环境需要可用才能投递计算任务。
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 环境信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 云资源ID。
    */
    @SerializedName("ResourceIds")
    @Expose
    private ResourceIds ResourceIds;

    /**
    * 上个工作流UUID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastWorkflowUuid")
    @Expose
    private String LastWorkflowUuid;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
     * Get 环境ID。 
     * @return EnvironmentId 环境ID。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID。
     * @param EnvironmentId 环境ID。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 环境名称。 
     * @return Name 环境名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 环境名称。
     * @param Name 环境名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 环境描述信息。 
     * @return Description 环境描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 环境描述信息。
     * @param Description 环境描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 环境地域。 
     * @return Region 环境地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 环境地域。
     * @param Region 环境地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 环境类型，取值范围：
- KUBERNETES：Kubernetes容器集群
- HPC：HPC高性能计算集群 
     * @return Type 环境类型，取值范围：
- KUBERNETES：Kubernetes容器集群
- HPC：HPC高性能计算集群
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 环境类型，取值范围：
- KUBERNETES：Kubernetes容器集群
- HPC：HPC高性能计算集群
     * @param Type 环境类型，取值范围：
- KUBERNETES：Kubernetes容器集群
- HPC：HPC高性能计算集群
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 环境状态，取值范围：
- INITIALIZING：创建中
- INITIALIZATION_ERROR：创建失败
- RUNNING：运行中
- ERROR：异常
- DELETING：正在删除
- DELETE_ERROR：删除失败 
     * @return Status 环境状态，取值范围：
- INITIALIZING：创建中
- INITIALIZATION_ERROR：创建失败
- RUNNING：运行中
- ERROR：异常
- DELETING：正在删除
- DELETE_ERROR：删除失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 环境状态，取值范围：
- INITIALIZING：创建中
- INITIALIZATION_ERROR：创建失败
- RUNNING：运行中
- ERROR：异常
- DELETING：正在删除
- DELETE_ERROR：删除失败
     * @param Status 环境状态，取值范围：
- INITIALIZING：创建中
- INITIALIZATION_ERROR：创建失败
- RUNNING：运行中
- ERROR：异常
- DELETING：正在删除
- DELETE_ERROR：删除失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 环境是否可用。环境需要可用才能投递计算任务。 
     * @return Available 环境是否可用。环境需要可用才能投递计算任务。
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set 环境是否可用。环境需要可用才能投递计算任务。
     * @param Available 环境是否可用。环境需要可用才能投递计算任务。
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get 环境信息。 
     * @return Message 环境信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 环境信息。
     * @param Message 环境信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 云资源ID。 
     * @return ResourceIds 云资源ID。
     */
    public ResourceIds getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 云资源ID。
     * @param ResourceIds 云资源ID。
     */
    public void setResourceIds(ResourceIds ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 上个工作流UUID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastWorkflowUuid 上个工作流UUID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastWorkflowUuid() {
        return this.LastWorkflowUuid;
    }

    /**
     * Set 上个工作流UUID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastWorkflowUuid 上个工作流UUID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastWorkflowUuid(String LastWorkflowUuid) {
        this.LastWorkflowUuid = LastWorkflowUuid;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new ResourceIds(source.ResourceIds);
        }
        if (source.LastWorkflowUuid != null) {
            this.LastWorkflowUuid = new String(source.LastWorkflowUuid);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "LastWorkflowUuid", this.LastWorkflowUuid);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);

    }
}

