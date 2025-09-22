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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceFile extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源文件ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源文件名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源文件路径
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * 资源对象COS存储路径
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 资源文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * 资源大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 创建用户ID
    */
    @SerializedName("CreatorUserUin")
    @Expose
    private String CreatorUserUin;

    /**
    * 创建用户名称
    */
    @SerializedName("CreatorUserName")
    @Expose
    private String CreatorUserName;

    /**
    * 最后更新用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserName")
    @Expose
    private String UpdateUserName;

    /**
    * 最后更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * COS 桶
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * COS 地域
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 资源来源模式
    */
    @SerializedName("ResourceSourceMode")
    @Expose
    private String ResourceSourceMode;

    /**
    * 本地工程ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 本地工程信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源文件ID 
     * @return ResourceId 资源文件ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源文件ID
     * @param ResourceId 资源文件ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源文件名称 
     * @return ResourceName 资源文件名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源文件名称
     * @param ResourceName 资源文件名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源文件路径 
     * @return LocalPath 资源文件路径
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 资源文件路径
     * @param LocalPath 资源文件路径
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get 资源对象COS存储路径 
     * @return RemotePath 资源对象COS存储路径
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 资源对象COS存储路径
     * @param RemotePath 资源对象COS存储路径
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 资源文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileExtensionType 资源文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set 资源文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExtensionType 资源文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get 资源大小 
     * @return Size 资源大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 资源大小
     * @param Size 资源大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 创建用户ID 
     * @return CreatorUserUin 创建用户ID
     */
    public String getCreatorUserUin() {
        return this.CreatorUserUin;
    }

    /**
     * Set 创建用户ID
     * @param CreatorUserUin 创建用户ID
     */
    public void setCreatorUserUin(String CreatorUserUin) {
        this.CreatorUserUin = CreatorUserUin;
    }

    /**
     * Get 创建用户名称 
     * @return CreatorUserName 创建用户名称
     */
    public String getCreatorUserName() {
        return this.CreatorUserName;
    }

    /**
     * Set 创建用户名称
     * @param CreatorUserName 创建用户名称
     */
    public void setCreatorUserName(String CreatorUserName) {
        this.CreatorUserName = CreatorUserName;
    }

    /**
     * Get 最后更新用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserName 最后更新用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserName() {
        return this.UpdateUserName;
    }

    /**
     * Set 最后更新用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserName 最后更新用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserName(String UpdateUserName) {
        this.UpdateUserName = UpdateUserName;
    }

    /**
     * Get 最后更新用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserUin 最后更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set 最后更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserUin 最后更新用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get COS 桶 
     * @return BucketName COS 桶
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set COS 桶
     * @param BucketName COS 桶
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get COS 地域 
     * @return CosRegion COS 地域
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS 地域
     * @param CosRegion COS 地域
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 资源来源模式 
     * @return ResourceSourceMode 资源来源模式
     */
    public String getResourceSourceMode() {
        return this.ResourceSourceMode;
    }

    /**
     * Set 资源来源模式
     * @param ResourceSourceMode 资源来源模式
     */
    public void setResourceSourceMode(String ResourceSourceMode) {
        this.ResourceSourceMode = ResourceSourceMode;
    }

    /**
     * Get 本地工程ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId 本地工程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 本地工程ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId 本地工程ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 本地工程信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo 本地工程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set 本地工程信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo 本地工程信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public ResourceFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFile(ResourceFile source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.CreatorUserUin != null) {
            this.CreatorUserUin = new String(source.CreatorUserUin);
        }
        if (source.CreatorUserName != null) {
            this.CreatorUserName = new String(source.CreatorUserName);
        }
        if (source.UpdateUserName != null) {
            this.UpdateUserName = new String(source.UpdateUserName);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.ResourceSourceMode != null) {
            this.ResourceSourceMode = new String(source.ResourceSourceMode);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CreatorUserUin", this.CreatorUserUin);
        this.setParamSimple(map, prefix + "CreatorUserName", this.CreatorUserName);
        this.setParamSimple(map, prefix + "UpdateUserName", this.UpdateUserName);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "ResourceSourceMode", this.ResourceSourceMode);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

