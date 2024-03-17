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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigFile extends AbstractModel {

    /**
    * 配置文件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 配置文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 配置文件命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 配置文件组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 配置文件内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 配置文件格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 配置文件注释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 配置文件状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 配置文件标签数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ConfigFileTag [] Tags;

    /**
    * 配置文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 配置文件创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 配置文件修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 配置文件修改者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
    * 配置文件发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * 配置文件发布者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseBy")
    @Expose
    private String ReleaseBy;

    /**
     * Get 配置文件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 配置文件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置文件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 配置文件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 配置文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 配置文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 配置文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 配置文件命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 配置文件命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 配置文件命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 配置文件命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 配置文件组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Group 配置文件组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 配置文件组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Group 配置文件组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 配置文件内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 配置文件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 配置文件内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 配置文件内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 配置文件格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 配置文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 配置文件格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 配置文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 配置文件注释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 配置文件注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 配置文件注释
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 配置文件注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 配置文件状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 配置文件状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 配置文件状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 配置文件状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 配置文件标签数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 配置文件标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConfigFileTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 配置文件标签数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 配置文件标签数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ConfigFileTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 配置文件创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 配置文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 配置文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 配置文件创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 配置文件创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateBy 配置文件创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 配置文件创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateBy 配置文件创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 配置文件修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 配置文件修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 配置文件修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 配置文件修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 配置文件修改者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyBy 配置文件修改者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set 配置文件修改者
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyBy 配置文件修改者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyBy(String ModifyBy) {
        this.ModifyBy = ModifyBy;
    }

    /**
     * Get 配置文件发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseTime 配置文件发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set 配置文件发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseTime 配置文件发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get 配置文件发布者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseBy 配置文件发布者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseBy() {
        return this.ReleaseBy;
    }

    /**
     * Set 配置文件发布者
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseBy 配置文件发布者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseBy(String ReleaseBy) {
        this.ReleaseBy = ReleaseBy;
    }

    public ConfigFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFile(ConfigFile source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new ConfigFileTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ConfigFileTag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ModifyBy != null) {
            this.ModifyBy = new String(source.ModifyBy);
        }
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.ReleaseBy != null) {
            this.ReleaseBy = new String(source.ReleaseBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "ReleaseBy", this.ReleaseBy);

    }
}

