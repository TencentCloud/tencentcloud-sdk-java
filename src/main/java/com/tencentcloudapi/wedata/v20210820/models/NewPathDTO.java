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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewPathDTO extends AbstractModel {

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 资源 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

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
    * 文件扩展名类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * 文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * MD5值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MD5Value")
    @Expose
    private String MD5Value;

    /**
    * 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 更新用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * 更新用户 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 创建日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cos 地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 子节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private NewPathDTO [] Children;

    /**
    * cos 全路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLeaf 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLeaf 是否为叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 资源 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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
     * Get 文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get MD5值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MD5Value MD5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMD5Value() {
        return this.MD5Value;
    }

    /**
     * Set MD5值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MD5Value MD5值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMD5Value(String MD5Value) {
        this.MD5Value = MD5Value;
    }

    /**
     * Get 所有者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 所有者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 更新用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUser 更新用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set 更新用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUser 更新用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get 更新用户 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 更新用户 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 更新用户 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 更新用户 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get 创建日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get cos 桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket cos 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cos 地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region cos 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos 地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region cos 地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 子节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 子节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NewPathDTO [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 子节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(NewPathDTO [] Children) {
        this.Children = Children;
    }

    /**
     * Get cos 全路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullPath cos 全路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set cos 全路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullPath cos 全路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    public NewPathDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewPathDTO(NewPathDTO source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
            this.Size = new Long(source.Size);
        }
        if (source.MD5Value != null) {
            this.MD5Value = new String(source.MD5Value);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.Children != null) {
            this.Children = new NewPathDTO[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new NewPathDTO(source.Children[i]);
            }
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "MD5Value", this.MD5Value);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);

    }
}

