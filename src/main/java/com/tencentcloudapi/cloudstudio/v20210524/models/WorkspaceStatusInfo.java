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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceStatusInfo extends AbstractModel{

    /**
    * 空间ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属人
    */
    @SerializedName("Owner")
    @Expose
    private UserInfoRsp Owner;

    /**
    * 空间标识
    */
    @SerializedName("SpaceKey")
    @Expose
    private String SpaceKey;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 最后操作时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOpsDate")
    @Expose
    private String LastOpsDate;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 共享状态
    */
    @SerializedName("Share")
    @Expose
    private WorkspaceShareInfo Share;

    /**
    * 空间类型
    */
    @SerializedName("WorkspaceType")
    @Expose
    private String WorkspaceType;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 空间版本
    */
    @SerializedName("WorkspaceVersion")
    @Expose
    private Long WorkspaceVersion;

    /**
    * 图标地址
    */
    @SerializedName("ImageIcon")
    @Expose
    private String ImageIcon;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 版本控制地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlUrl")
    @Expose
    private String VersionControlUrl;

    /**
    * 版本控制描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlDesc")
    @Expose
    private String VersionControlDesc;

    /**
    * 版本控制引用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlRef")
    @Expose
    private String VersionControlRef;

    /**
    * 版本控制引用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlRefType")
    @Expose
    private String VersionControlRefType;

    /**
    * 版本控制类型
    */
    @SerializedName("VersionControlType")
    @Expose
    private String VersionControlType;

    /**
    * 模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 快照ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotUid")
    @Expose
    private String SnapshotUid;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecDesc")
    @Expose
    private String SpecDesc;

    /**
    * CPU数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
     * Get 空间ID 
     * @return Id 空间ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 空间ID
     * @param Id 空间ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 空间名称 
     * @return Name 空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 空间名称
     * @param Name 空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属人 
     * @return Owner 所属人
     */
    public UserInfoRsp getOwner() {
        return this.Owner;
    }

    /**
     * Set 所属人
     * @param Owner 所属人
     */
    public void setOwner(UserInfoRsp Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 空间标识 
     * @return SpaceKey 空间标识
     */
    public String getSpaceKey() {
        return this.SpaceKey;
    }

    /**
     * Set 空间标识
     * @param SpaceKey 空间标识
     */
    public void setSpaceKey(String SpaceKey) {
        this.SpaceKey = SpaceKey;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 共享状态 
     * @return Share 共享状态
     */
    public WorkspaceShareInfo getShare() {
        return this.Share;
    }

    /**
     * Set 共享状态
     * @param Share 共享状态
     */
    public void setShare(WorkspaceShareInfo Share) {
        this.Share = Share;
    }

    /**
     * Get 空间类型 
     * @return WorkspaceType 空间类型
     */
    public String getWorkspaceType() {
        return this.WorkspaceType;
    }

    /**
     * Set 空间类型
     * @param WorkspaceType 空间类型
     */
    public void setWorkspaceType(String WorkspaceType) {
        this.WorkspaceType = WorkspaceType;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 空间版本 
     * @return WorkspaceVersion 空间版本
     */
    public Long getWorkspaceVersion() {
        return this.WorkspaceVersion;
    }

    /**
     * Set 空间版本
     * @param WorkspaceVersion 空间版本
     */
    public void setWorkspaceVersion(Long WorkspaceVersion) {
        this.WorkspaceVersion = WorkspaceVersion;
    }

    /**
     * Get 图标地址 
     * @return ImageIcon 图标地址
     */
    public String getImageIcon() {
        return this.ImageIcon;
    }

    /**
     * Set 图标地址
     * @param ImageIcon 图标地址
     */
    public void setImageIcon(String ImageIcon) {
        this.ImageIcon = ImageIcon;
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

    /**
     * Get 版本控制地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlUrl 版本控制地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlUrl() {
        return this.VersionControlUrl;
    }

    /**
     * Set 版本控制地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlUrl 版本控制地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlUrl(String VersionControlUrl) {
        this.VersionControlUrl = VersionControlUrl;
    }

    /**
     * Get 版本控制描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlDesc 版本控制描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlDesc() {
        return this.VersionControlDesc;
    }

    /**
     * Set 版本控制描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlDesc 版本控制描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlDesc(String VersionControlDesc) {
        this.VersionControlDesc = VersionControlDesc;
    }

    /**
     * Get 版本控制引用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlRef 版本控制引用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlRef() {
        return this.VersionControlRef;
    }

    /**
     * Set 版本控制引用
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlRef 版本控制引用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlRef(String VersionControlRef) {
        this.VersionControlRef = VersionControlRef;
    }

    /**
     * Get 版本控制引用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlRefType 版本控制引用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlRefType() {
        return this.VersionControlRefType;
    }

    /**
     * Set 版本控制引用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlRefType 版本控制引用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlRefType(String VersionControlRefType) {
        this.VersionControlRefType = VersionControlRefType;
    }

    /**
     * Get 版本控制类型 
     * @return VersionControlType 版本控制类型
     */
    public String getVersionControlType() {
        return this.VersionControlType;
    }

    /**
     * Set 版本控制类型
     * @param VersionControlType 版本控制类型
     */
    public void setVersionControlType(String VersionControlType) {
        this.VersionControlType = VersionControlType;
    }

    /**
     * Get 模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 快照ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotUid 快照ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotUid() {
        return this.SnapshotUid;
    }

    /**
     * Set 快照ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotUid 快照ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotUid(String SnapshotUid) {
        this.SnapshotUid = SnapshotUid;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecDesc 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecDesc() {
        return this.SpecDesc;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecDesc 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecDesc(String SpecDesc) {
        this.SpecDesc = SpecDesc;
    }

    /**
     * Get CPU数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu CPU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu CPU数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
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
        if (source.Owner != null) {
            this.Owner = new UserInfoRsp(source.Owner);
        }
        if (source.SpaceKey != null) {
            this.SpaceKey = new String(source.SpaceKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastOpsDate != null) {
            this.LastOpsDate = new String(source.LastOpsDate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Share != null) {
            this.Share = new WorkspaceShareInfo(source.Share);
        }
        if (source.WorkspaceType != null) {
            this.WorkspaceType = new String(source.WorkspaceType);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.WorkspaceVersion != null) {
            this.WorkspaceVersion = new Long(source.WorkspaceVersion);
        }
        if (source.ImageIcon != null) {
            this.ImageIcon = new String(source.ImageIcon);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.VersionControlUrl != null) {
            this.VersionControlUrl = new String(source.VersionControlUrl);
        }
        if (source.VersionControlDesc != null) {
            this.VersionControlDesc = new String(source.VersionControlDesc);
        }
        if (source.VersionControlRef != null) {
            this.VersionControlRef = new String(source.VersionControlRef);
        }
        if (source.VersionControlRefType != null) {
            this.VersionControlRefType = new String(source.VersionControlRefType);
        }
        if (source.VersionControlType != null) {
            this.VersionControlType = new String(source.VersionControlType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.SnapshotUid != null) {
            this.SnapshotUid = new String(source.SnapshotUid);
        }
        if (source.SpecDesc != null) {
            this.SpecDesc = new String(source.SpecDesc);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "SpaceKey", this.SpaceKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastOpsDate", this.LastOpsDate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Share.", this.Share);
        this.setParamSimple(map, prefix + "WorkspaceType", this.WorkspaceType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "WorkspaceVersion", this.WorkspaceVersion);
        this.setParamSimple(map, prefix + "ImageIcon", this.ImageIcon);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "VersionControlUrl", this.VersionControlUrl);
        this.setParamSimple(map, prefix + "VersionControlDesc", this.VersionControlDesc);
        this.setParamSimple(map, prefix + "VersionControlRef", this.VersionControlRef);
        this.setParamSimple(map, prefix + "VersionControlRefType", this.VersionControlRefType);
        this.setParamSimple(map, prefix + "VersionControlType", this.VersionControlType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "SnapshotUid", this.SnapshotUid);
        this.setParamSimple(map, prefix + "SpecDesc", this.SpecDesc);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

