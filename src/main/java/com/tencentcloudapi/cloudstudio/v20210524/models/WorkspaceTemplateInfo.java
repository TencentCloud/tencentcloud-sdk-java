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

public class WorkspaceTemplateInfo extends AbstractModel{

    /**
    * 模板ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 模板分类
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 中文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptionEN")
    @Expose
    private String DescriptionEN;

    /**
    * 模板标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 默认仓库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlType")
    @Expose
    private String VersionControlType;

    /**
    * 默认仓库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlUrl")
    @Expose
    private String VersionControlUrl;

    /**
    * 默认仓库描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlDesc")
    @Expose
    private String VersionControlDesc;

    /**
    * 默认仓库所属人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlOwner")
    @Expose
    private String VersionControlOwner;

    /**
    * 默认仓库引用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlRef")
    @Expose
    private String VersionControlRef;

    /**
    * 默认仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionControlRefType")
    @Expose
    private String VersionControlRefType;

    /**
    * 用户自定义仓库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVersionControlUrl")
    @Expose
    private String UserVersionControlUrl;

    /**
    * 用户自定义仓库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVersionControlType")
    @Expose
    private String UserVersionControlType;

    /**
    * 用户自定义仓库引用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVersionControlRef")
    @Expose
    private String UserVersionControlRef;

    /**
    * 用户自定义仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserVersionControlRefType")
    @Expose
    private String UserVersionControlRefType;

    /**
    * xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevFile")
    @Expose
    private String DevFile;

    /**
    * xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginFile")
    @Expose
    private String PluginFile;

    /**
    * xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrebuildFile")
    @Expose
    private String PrebuildFile;

    /**
    * 是否标记
    */
    @SerializedName("Marked")
    @Expose
    private Boolean Marked;

    /**
    * 标记状态
    */
    @SerializedName("MarkAt")
    @Expose
    private Long MarkAt;

    /**
    * 创建时间
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModified")
    @Expose
    private String LastModified;

    /**
    * 编号
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotUid")
    @Expose
    private String SnapshotUid;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 是否属于当前用户
    */
    @SerializedName("Me")
    @Expose
    private Boolean Me;

    /**
    * xxx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorAvatar")
    @Expose
    private String AuthorAvatar;

    /**
     * Get 模板ID 
     * @return Id 模板ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 模板ID
     * @param Id 模板ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 模板分类 
     * @return Category 模板分类
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 模板分类
     * @param Category 模板分类
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 中文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptionEN 中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescriptionEN() {
        return this.DescriptionEN;
    }

    /**
     * Set 中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptionEN 中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptionEN(String DescriptionEN) {
        this.DescriptionEN = DescriptionEN;
    }

    /**
     * Get 模板标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 模板标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 模板标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 模板标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Icon 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Icon 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 默认仓库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlType 默认仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlType() {
        return this.VersionControlType;
    }

    /**
     * Set 默认仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlType 默认仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlType(String VersionControlType) {
        this.VersionControlType = VersionControlType;
    }

    /**
     * Get 默认仓库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlUrl 默认仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlUrl() {
        return this.VersionControlUrl;
    }

    /**
     * Set 默认仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlUrl 默认仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlUrl(String VersionControlUrl) {
        this.VersionControlUrl = VersionControlUrl;
    }

    /**
     * Get 默认仓库描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlDesc 默认仓库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlDesc() {
        return this.VersionControlDesc;
    }

    /**
     * Set 默认仓库描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlDesc 默认仓库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlDesc(String VersionControlDesc) {
        this.VersionControlDesc = VersionControlDesc;
    }

    /**
     * Get 默认仓库所属人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlOwner 默认仓库所属人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlOwner() {
        return this.VersionControlOwner;
    }

    /**
     * Set 默认仓库所属人
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlOwner 默认仓库所属人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlOwner(String VersionControlOwner) {
        this.VersionControlOwner = VersionControlOwner;
    }

    /**
     * Get 默认仓库引用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlRef 默认仓库引用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlRef() {
        return this.VersionControlRef;
    }

    /**
     * Set 默认仓库引用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlRef 默认仓库引用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlRef(String VersionControlRef) {
        this.VersionControlRef = VersionControlRef;
    }

    /**
     * Get 默认仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionControlRefType 默认仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionControlRefType() {
        return this.VersionControlRefType;
    }

    /**
     * Set 默认仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionControlRefType 默认仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionControlRefType(String VersionControlRefType) {
        this.VersionControlRefType = VersionControlRefType;
    }

    /**
     * Get 用户自定义仓库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVersionControlUrl 用户自定义仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVersionControlUrl() {
        return this.UserVersionControlUrl;
    }

    /**
     * Set 用户自定义仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVersionControlUrl 用户自定义仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVersionControlUrl(String UserVersionControlUrl) {
        this.UserVersionControlUrl = UserVersionControlUrl;
    }

    /**
     * Get 用户自定义仓库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVersionControlType 用户自定义仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVersionControlType() {
        return this.UserVersionControlType;
    }

    /**
     * Set 用户自定义仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVersionControlType 用户自定义仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVersionControlType(String UserVersionControlType) {
        this.UserVersionControlType = UserVersionControlType;
    }

    /**
     * Get 用户自定义仓库引用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVersionControlRef 用户自定义仓库引用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVersionControlRef() {
        return this.UserVersionControlRef;
    }

    /**
     * Set 用户自定义仓库引用
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVersionControlRef 用户自定义仓库引用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVersionControlRef(String UserVersionControlRef) {
        this.UserVersionControlRef = UserVersionControlRef;
    }

    /**
     * Get 用户自定义仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserVersionControlRefType 用户自定义仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserVersionControlRefType() {
        return this.UserVersionControlRefType;
    }

    /**
     * Set 用户自定义仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserVersionControlRefType 用户自定义仓库引用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserVersionControlRefType(String UserVersionControlRefType) {
        this.UserVersionControlRefType = UserVersionControlRefType;
    }

    /**
     * Get xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevFile xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevFile() {
        return this.DevFile;
    }

    /**
     * Set xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevFile xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevFile(String DevFile) {
        this.DevFile = DevFile;
    }

    /**
     * Get xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginFile xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPluginFile() {
        return this.PluginFile;
    }

    /**
     * Set xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginFile xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginFile(String PluginFile) {
        this.PluginFile = PluginFile;
    }

    /**
     * Get xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrebuildFile xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrebuildFile() {
        return this.PrebuildFile;
    }

    /**
     * Set xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrebuildFile xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrebuildFile(String PrebuildFile) {
        this.PrebuildFile = PrebuildFile;
    }

    /**
     * Get 是否标记 
     * @return Marked 是否标记
     */
    public Boolean getMarked() {
        return this.Marked;
    }

    /**
     * Set 是否标记
     * @param Marked 是否标记
     */
    public void setMarked(Boolean Marked) {
        this.Marked = Marked;
    }

    /**
     * Get 标记状态 
     * @return MarkAt 标记状态
     */
    public Long getMarkAt() {
        return this.MarkAt;
    }

    /**
     * Set 标记状态
     * @param MarkAt 标记状态
     */
    public void setMarkAt(Long MarkAt) {
        this.MarkAt = MarkAt;
    }

    /**
     * Get 创建时间 
     * @return CreateDate 创建时间
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间
     * @param CreateDate 创建时间
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModified 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModified() {
        return this.LastModified;
    }

    /**
     * Set 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModified 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    /**
     * Get 编号 
     * @return Sort 编号
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 编号
     * @param Sort 编号
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotUid xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotUid() {
        return this.SnapshotUid;
    }

    /**
     * Set xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotUid xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotUid(String SnapshotUid) {
        this.SnapshotUid = SnapshotUid;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Author 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Author 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 是否属于当前用户 
     * @return Me 是否属于当前用户
     */
    public Boolean getMe() {
        return this.Me;
    }

    /**
     * Set 是否属于当前用户
     * @param Me 是否属于当前用户
     */
    public void setMe(Boolean Me) {
        this.Me = Me;
    }

    /**
     * Get xxx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorAvatar xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorAvatar() {
        return this.AuthorAvatar;
    }

    /**
     * Set xxx
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorAvatar xxx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorAvatar(String AuthorAvatar) {
        this.AuthorAvatar = AuthorAvatar;
    }

    public WorkspaceTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceTemplateInfo(WorkspaceTemplateInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DescriptionEN != null) {
            this.DescriptionEN = new String(source.DescriptionEN);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.VersionControlType != null) {
            this.VersionControlType = new String(source.VersionControlType);
        }
        if (source.VersionControlUrl != null) {
            this.VersionControlUrl = new String(source.VersionControlUrl);
        }
        if (source.VersionControlDesc != null) {
            this.VersionControlDesc = new String(source.VersionControlDesc);
        }
        if (source.VersionControlOwner != null) {
            this.VersionControlOwner = new String(source.VersionControlOwner);
        }
        if (source.VersionControlRef != null) {
            this.VersionControlRef = new String(source.VersionControlRef);
        }
        if (source.VersionControlRefType != null) {
            this.VersionControlRefType = new String(source.VersionControlRefType);
        }
        if (source.UserVersionControlUrl != null) {
            this.UserVersionControlUrl = new String(source.UserVersionControlUrl);
        }
        if (source.UserVersionControlType != null) {
            this.UserVersionControlType = new String(source.UserVersionControlType);
        }
        if (source.UserVersionControlRef != null) {
            this.UserVersionControlRef = new String(source.UserVersionControlRef);
        }
        if (source.UserVersionControlRefType != null) {
            this.UserVersionControlRefType = new String(source.UserVersionControlRefType);
        }
        if (source.DevFile != null) {
            this.DevFile = new String(source.DevFile);
        }
        if (source.PluginFile != null) {
            this.PluginFile = new String(source.PluginFile);
        }
        if (source.PrebuildFile != null) {
            this.PrebuildFile = new String(source.PrebuildFile);
        }
        if (source.Marked != null) {
            this.Marked = new Boolean(source.Marked);
        }
        if (source.MarkAt != null) {
            this.MarkAt = new Long(source.MarkAt);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.LastModified != null) {
            this.LastModified = new String(source.LastModified);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.SnapshotUid != null) {
            this.SnapshotUid = new String(source.SnapshotUid);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.Me != null) {
            this.Me = new Boolean(source.Me);
        }
        if (source.AuthorAvatar != null) {
            this.AuthorAvatar = new String(source.AuthorAvatar);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DescriptionEN", this.DescriptionEN);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "VersionControlType", this.VersionControlType);
        this.setParamSimple(map, prefix + "VersionControlUrl", this.VersionControlUrl);
        this.setParamSimple(map, prefix + "VersionControlDesc", this.VersionControlDesc);
        this.setParamSimple(map, prefix + "VersionControlOwner", this.VersionControlOwner);
        this.setParamSimple(map, prefix + "VersionControlRef", this.VersionControlRef);
        this.setParamSimple(map, prefix + "VersionControlRefType", this.VersionControlRefType);
        this.setParamSimple(map, prefix + "UserVersionControlUrl", this.UserVersionControlUrl);
        this.setParamSimple(map, prefix + "UserVersionControlType", this.UserVersionControlType);
        this.setParamSimple(map, prefix + "UserVersionControlRef", this.UserVersionControlRef);
        this.setParamSimple(map, prefix + "UserVersionControlRefType", this.UserVersionControlRefType);
        this.setParamSimple(map, prefix + "DevFile", this.DevFile);
        this.setParamSimple(map, prefix + "PluginFile", this.PluginFile);
        this.setParamSimple(map, prefix + "PrebuildFile", this.PrebuildFile);
        this.setParamSimple(map, prefix + "Marked", this.Marked);
        this.setParamSimple(map, prefix + "MarkAt", this.MarkAt);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "LastModified", this.LastModified);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SnapshotUid", this.SnapshotUid);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Me", this.Me);
        this.setParamSimple(map, prefix + "AuthorAvatar", this.AuthorAvatar);

    }
}

