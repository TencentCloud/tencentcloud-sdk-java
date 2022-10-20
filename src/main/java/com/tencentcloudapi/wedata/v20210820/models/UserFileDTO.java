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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserFileDTO extends AbstractModel{

    /**
    * 资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型，如 jar zip 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * 文件上传类型，资源管理为 resource
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileUploadType")
    @Expose
    private String FileUploadType;

    /**
    * 文件MD5值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5Value")
    @Expose
    private String Md5Value;

    /**
    * 创建时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 本地路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * 本地临时路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalTmpPath")
    @Expose
    private String LocalTmpPath;

    /**
    * 远程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 文件拥有者名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 文件拥有者uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 文件深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathDepth")
    @Expose
    private String PathDepth;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 附加信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 本地临时压缩文件绝对路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZipPath")
    @Expose
    private String ZipPath;

    /**
    * 文件所属存储桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 文件所属存储桶的地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型，如 jar zip 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileExtensionType 文件类型，如 jar zip 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set 文件类型，如 jar zip 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExtensionType 文件类型，如 jar zip 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get 文件上传类型，资源管理为 resource
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileUploadType 文件上传类型，资源管理为 resource
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileUploadType() {
        return this.FileUploadType;
    }

    /**
     * Set 文件上传类型，资源管理为 resource
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileUploadType 文件上传类型，资源管理为 resource
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileUploadType(String FileUploadType) {
        this.FileUploadType = FileUploadType;
    }

    /**
     * Get 文件MD5值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5Value 文件MD5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5Value() {
        return this.Md5Value;
    }

    /**
     * Set 文件MD5值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5Value 文件MD5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5Value(String Md5Value) {
        this.Md5Value = Md5Value;
    }

    /**
     * Get 创建时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间，秒级别的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 本地路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalPath 本地路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 本地路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalPath 本地路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get 本地临时路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalTmpPath 本地临时路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalTmpPath() {
        return this.LocalTmpPath;
    }

    /**
     * Set 本地临时路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalTmpPath 本地临时路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalTmpPath(String LocalTmpPath) {
        this.LocalTmpPath = LocalTmpPath;
    }

    /**
     * Get 远程路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemotePath 远程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 远程路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemotePath 远程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 文件拥有者名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 文件拥有者名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 文件拥有者名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 文件拥有者名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 文件拥有者uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 文件拥有者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 文件拥有者uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 文件拥有者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 文件深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathDepth 文件深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathDepth() {
        return this.PathDepth;
    }

    /**
     * Set 文件深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathDepth 文件深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathDepth(String PathDepth) {
        this.PathDepth = PathDepth;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 附加信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 附加信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 附加信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 本地临时压缩文件绝对路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZipPath 本地临时压缩文件绝对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZipPath() {
        return this.ZipPath;
    }

    /**
     * Set 本地临时压缩文件绝对路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZipPath 本地临时压缩文件绝对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZipPath(String ZipPath) {
        this.ZipPath = ZipPath;
    }

    /**
     * Get 文件所属存储桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket 文件所属存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 文件所属存储桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket 文件所属存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 文件所属存储桶的地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 文件所属存储桶的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 文件所属存储桶的地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 文件所属存储桶的地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public UserFileDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserFileDTO(UserFileDTO source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.FileUploadType != null) {
            this.FileUploadType = new String(source.FileUploadType);
        }
        if (source.Md5Value != null) {
            this.Md5Value = new String(source.Md5Value);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
        if (source.LocalTmpPath != null) {
            this.LocalTmpPath = new String(source.LocalTmpPath);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.PathDepth != null) {
            this.PathDepth = new String(source.PathDepth);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.ZipPath != null) {
            this.ZipPath = new String(source.ZipPath);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "FileUploadType", this.FileUploadType);
        this.setParamSimple(map, prefix + "Md5Value", this.Md5Value);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "LocalTmpPath", this.LocalTmpPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "PathDepth", this.PathDepth);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ZipPath", this.ZipPath);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

