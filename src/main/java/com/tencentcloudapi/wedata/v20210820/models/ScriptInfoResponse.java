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

public class ScriptInfoResponse extends AbstractModel{

    /**
    * 资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件扩展名类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * md5值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5Value")
    @Expose
    private String Md5Value;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * 本地路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * 远程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 路径深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathDepth")
    @Expose
    private Long PathDepth;

    /**
    * 项目id
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
    * 本地临时文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalTempPath")
    @Expose
    private String LocalTempPath;

    /**
    * 本地压缩文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZipPath")
    @Expose
    private String ZipPath;

    /**
    * cos桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cos地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 脚本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件扩展名类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileExtensionType 文件扩展名类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set 文件扩展名类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExtensionType 文件扩展名类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get md5值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5Value md5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5Value() {
        return this.Md5Value;
    }

    /**
     * Set md5值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5Value md5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5Value(String Md5Value) {
        this.Md5Value = Md5Value;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Float Size) {
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
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 路径深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathDepth 路径深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPathDepth() {
        return this.PathDepth;
    }

    /**
     * Set 路径深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathDepth 路径深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathDepth(Long PathDepth) {
        this.PathDepth = PathDepth;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
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
     * Get 本地临时文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalTempPath 本地临时文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalTempPath() {
        return this.LocalTempPath;
    }

    /**
     * Set 本地临时文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalTempPath 本地临时文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalTempPath(String LocalTempPath) {
        this.LocalTempPath = LocalTempPath;
    }

    /**
     * Get 本地压缩文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZipPath 本地压缩文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZipPath() {
        return this.ZipPath;
    }

    /**
     * Set 本地压缩文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZipPath 本地压缩文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZipPath(String ZipPath) {
        this.ZipPath = ZipPath;
    }

    /**
     * Get cos桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket cos桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket cos桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cos地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region cos地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region cos地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public ScriptInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptInfoResponse(ScriptInfoResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Md5Value != null) {
            this.Md5Value = new String(source.Md5Value);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
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
            this.PathDepth = new Long(source.PathDepth);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.LocalTempPath != null) {
            this.LocalTempPath = new String(source.LocalTempPath);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Md5Value", this.Md5Value);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "PathDepth", this.PathDepth);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "LocalTempPath", this.LocalTempPath);
        this.setParamSimple(map, prefix + "ZipPath", this.ZipPath);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

