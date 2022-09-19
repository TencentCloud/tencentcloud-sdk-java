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

public class WorkspaceDTO extends AbstractModel{

    /**
    * 工作空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 代码来源类型
    */
    @SerializedName("VersionControlType")
    @Expose
    private String VersionControlType;

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private Long ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作空间版本
    */
    @SerializedName("WorkspaceVersion")
    @Expose
    private Long WorkspaceVersion;

    /**
    * 工作空间资源结构
    */
    @SerializedName("WorkspaceResourceDTO")
    @Expose
    private WorkspaceResourceDTO WorkspaceResourceDTO;

    /**
    * 代码仓库地址
    */
    @SerializedName("VersionControlUrl")
    @Expose
    private String VersionControlUrl;

    /**
    * 代码Ref是分支还是标签
    */
    @SerializedName("VersionControlRef")
    @Expose
    private String VersionControlRef;

    /**
    * 代码Ref地址
    */
    @SerializedName("VersionControlRefType")
    @Expose
    private String VersionControlRefType;

    /**
    * 快照Uid
    */
    @SerializedName("SnapshotUid")
    @Expose
    private String SnapshotUid;

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 价格id
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * 初始化状态
    */
    @SerializedName("InitializeStatus")
    @Expose
    private Long InitializeStatus;

    /**
    * 描述
    */
    @SerializedName("VersionControlDesc")
    @Expose
    private String VersionControlDesc;

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
     * Get 代码来源类型 
     * @return VersionControlType 代码来源类型
     */
    public String getVersionControlType() {
        return this.VersionControlType;
    }

    /**
     * Set 代码来源类型
     * @param VersionControlType 代码来源类型
     */
    public void setVersionControlType(String VersionControlType) {
        this.VersionControlType = VersionControlType;
    }

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public Long getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(Long ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作空间版本 
     * @return WorkspaceVersion 工作空间版本
     */
    public Long getWorkspaceVersion() {
        return this.WorkspaceVersion;
    }

    /**
     * Set 工作空间版本
     * @param WorkspaceVersion 工作空间版本
     */
    public void setWorkspaceVersion(Long WorkspaceVersion) {
        this.WorkspaceVersion = WorkspaceVersion;
    }

    /**
     * Get 工作空间资源结构 
     * @return WorkspaceResourceDTO 工作空间资源结构
     */
    public WorkspaceResourceDTO getWorkspaceResourceDTO() {
        return this.WorkspaceResourceDTO;
    }

    /**
     * Set 工作空间资源结构
     * @param WorkspaceResourceDTO 工作空间资源结构
     */
    public void setWorkspaceResourceDTO(WorkspaceResourceDTO WorkspaceResourceDTO) {
        this.WorkspaceResourceDTO = WorkspaceResourceDTO;
    }

    /**
     * Get 代码仓库地址 
     * @return VersionControlUrl 代码仓库地址
     */
    public String getVersionControlUrl() {
        return this.VersionControlUrl;
    }

    /**
     * Set 代码仓库地址
     * @param VersionControlUrl 代码仓库地址
     */
    public void setVersionControlUrl(String VersionControlUrl) {
        this.VersionControlUrl = VersionControlUrl;
    }

    /**
     * Get 代码Ref是分支还是标签 
     * @return VersionControlRef 代码Ref是分支还是标签
     */
    public String getVersionControlRef() {
        return this.VersionControlRef;
    }

    /**
     * Set 代码Ref是分支还是标签
     * @param VersionControlRef 代码Ref是分支还是标签
     */
    public void setVersionControlRef(String VersionControlRef) {
        this.VersionControlRef = VersionControlRef;
    }

    /**
     * Get 代码Ref地址 
     * @return VersionControlRefType 代码Ref地址
     */
    public String getVersionControlRefType() {
        return this.VersionControlRefType;
    }

    /**
     * Set 代码Ref地址
     * @param VersionControlRefType 代码Ref地址
     */
    public void setVersionControlRefType(String VersionControlRefType) {
        this.VersionControlRefType = VersionControlRefType;
    }

    /**
     * Get 快照Uid 
     * @return SnapshotUid 快照Uid
     */
    public String getSnapshotUid() {
        return this.SnapshotUid;
    }

    /**
     * Set 快照Uid
     * @param SnapshotUid 快照Uid
     */
    public void setSnapshotUid(String SnapshotUid) {
        this.SnapshotUid = SnapshotUid;
    }

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 价格id 
     * @return PriceId 价格id
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set 价格id
     * @param PriceId 价格id
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get 初始化状态 
     * @return InitializeStatus 初始化状态
     */
    public Long getInitializeStatus() {
        return this.InitializeStatus;
    }

    /**
     * Set 初始化状态
     * @param InitializeStatus 初始化状态
     */
    public void setInitializeStatus(Long InitializeStatus) {
        this.InitializeStatus = InitializeStatus;
    }

    /**
     * Get 描述 
     * @return VersionControlDesc 描述
     */
    public String getVersionControlDesc() {
        return this.VersionControlDesc;
    }

    /**
     * Set 描述
     * @param VersionControlDesc 描述
     */
    public void setVersionControlDesc(String VersionControlDesc) {
        this.VersionControlDesc = VersionControlDesc;
    }

    public WorkspaceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceDTO(WorkspaceDTO source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VersionControlType != null) {
            this.VersionControlType = new String(source.VersionControlType);
        }
        if (source.ImageId != null) {
            this.ImageId = new Long(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WorkspaceVersion != null) {
            this.WorkspaceVersion = new Long(source.WorkspaceVersion);
        }
        if (source.WorkspaceResourceDTO != null) {
            this.WorkspaceResourceDTO = new WorkspaceResourceDTO(source.WorkspaceResourceDTO);
        }
        if (source.VersionControlUrl != null) {
            this.VersionControlUrl = new String(source.VersionControlUrl);
        }
        if (source.VersionControlRef != null) {
            this.VersionControlRef = new String(source.VersionControlRef);
        }
        if (source.VersionControlRefType != null) {
            this.VersionControlRefType = new String(source.VersionControlRefType);
        }
        if (source.SnapshotUid != null) {
            this.SnapshotUid = new String(source.SnapshotUid);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.PriceId != null) {
            this.PriceId = new Long(source.PriceId);
        }
        if (source.InitializeStatus != null) {
            this.InitializeStatus = new Long(source.InitializeStatus);
        }
        if (source.VersionControlDesc != null) {
            this.VersionControlDesc = new String(source.VersionControlDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VersionControlType", this.VersionControlType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WorkspaceVersion", this.WorkspaceVersion);
        this.setParamObj(map, prefix + "WorkspaceResourceDTO.", this.WorkspaceResourceDTO);
        this.setParamSimple(map, prefix + "VersionControlUrl", this.VersionControlUrl);
        this.setParamSimple(map, prefix + "VersionControlRef", this.VersionControlRef);
        this.setParamSimple(map, prefix + "VersionControlRefType", this.VersionControlRefType);
        this.setParamSimple(map, prefix + "SnapshotUid", this.SnapshotUid);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);
        this.setParamSimple(map, prefix + "InitializeStatus", this.InitializeStatus);
        this.setParamSimple(map, prefix + "VersionControlDesc", this.VersionControlDesc);

    }
}

