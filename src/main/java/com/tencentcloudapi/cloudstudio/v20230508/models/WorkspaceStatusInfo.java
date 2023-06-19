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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceStatusInfo extends AbstractModel{

    /**
    * 工作空间 ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 工作空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 工作空间标识
    */
    @SerializedName("SpaceKey")
    @Expose
    private String SpaceKey;

    /**
    * 工作空间状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CPU数量
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 工作空间图标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 工作空间状态, 异常原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * 工作空间描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作空间类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceType")
    @Expose
    private String WorkspaceType;

    /**
    * Git 仓库 HTTPS 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlUrl")
    @Expose
    private String VersionControlUrl;

    /**
    * Git 仓库引用。指定分支使用 /refs/heads/{分支名}, 指定 Tag 用 /refs/tags/{Tag名}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlRef")
    @Expose
    private String VersionControlRef;

    /**
    * 最后操作时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOpsDate")
    @Expose
    private String LastOpsDate;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
     * Get 工作空间 ID 
     * @return Id 工作空间 ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 工作空间 ID
     * @param Id 工作空间 ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 工作空间名称 
     * @return Name 工作空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作空间名称
     * @param Name 工作空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 工作空间标识 
     * @return SpaceKey 工作空间标识
     */
    public String getSpaceKey() {
        return this.SpaceKey;
    }

    /**
     * Set 工作空间标识
     * @param SpaceKey 工作空间标识
     */
    public void setSpaceKey(String SpaceKey) {
        this.SpaceKey = SpaceKey;
    }

    /**
     * Get 工作空间状态 
     * @return Status 工作空间状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 工作空间状态
     * @param Status 工作空间状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CPU数量 
     * @return Cpu CPU数量
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU数量
     * @param Cpu CPU数量
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 工作空间图标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Icon 工作空间图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 工作空间图标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Icon 工作空间图标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 工作空间状态, 异常原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusReason 工作空间状态, 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set 工作空间状态, 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusReason 工作空间状态, 异常原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get 工作空间描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 工作空间描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 工作空间描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作空间类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceType 工作空间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceType() {
        return this.WorkspaceType;
    }

    /**
     * Set 工作空间类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceType 工作空间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceType(String WorkspaceType) {
        this.WorkspaceType = WorkspaceType;
    }

    /**
     * Get Git 仓库 HTTPS 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlUrl Git 仓库 HTTPS 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlUrl() {
        return this.VersionControlUrl;
    }

    /**
     * Set Git 仓库 HTTPS 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlUrl Git 仓库 HTTPS 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlUrl(String VersionControlUrl) {
        this.VersionControlUrl = VersionControlUrl;
    }

    /**
     * Get Git 仓库引用。指定分支使用 /refs/heads/{分支名}, 指定 Tag 用 /refs/tags/{Tag名}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlRef Git 仓库引用。指定分支使用 /refs/heads/{分支名}, 指定 Tag 用 /refs/tags/{Tag名}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlRef() {
        return this.VersionControlRef;
    }

    /**
     * Set Git 仓库引用。指定分支使用 /refs/heads/{分支名}, 指定 Tag 用 /refs/tags/{Tag名}
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlRef Git 仓库引用。指定分支使用 /refs/heads/{分支名}, 指定 Tag 用 /refs/tags/{Tag名}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlRef(String VersionControlRef) {
        this.VersionControlRef = VersionControlRef;
    }

    /**
     * Get 最后操作时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOpsDate 最后操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOpsDate() {
        return this.LastOpsDate;
    }

    /**
     * Set 最后操作时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOpsDate 最后操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOpsDate(String LastOpsDate) {
        this.LastOpsDate = LastOpsDate;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public WorkspaceStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceStatusInfo(WorkspaceStatusInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SpaceKey != null) {
            this.SpaceKey = new String(source.SpaceKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WorkspaceType != null) {
            this.WorkspaceType = new String(source.WorkspaceType);
        }
        if (source.VersionControlUrl != null) {
            this.VersionControlUrl = new String(source.VersionControlUrl);
        }
        if (source.VersionControlRef != null) {
            this.VersionControlRef = new String(source.VersionControlRef);
        }
        if (source.LastOpsDate != null) {
            this.LastOpsDate = new String(source.LastOpsDate);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SpaceKey", this.SpaceKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WorkspaceType", this.WorkspaceType);
        this.setParamSimple(map, prefix + "VersionControlUrl", this.VersionControlUrl);
        this.setParamSimple(map, prefix + "VersionControlRef", this.VersionControlRef);
        this.setParamSimple(map, prefix + "LastOpsDate", this.LastOpsDate);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);

    }
}

