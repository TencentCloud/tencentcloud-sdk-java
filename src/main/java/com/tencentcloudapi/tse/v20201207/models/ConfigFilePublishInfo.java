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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigFilePublishInfo extends AbstractModel {

    /**
    * 发布名称
    */
    @SerializedName("ReleaseName")
    @Expose
    private String ReleaseName;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 发布组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 创建者
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * 修改者
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private ConfigFileTag [] Tags;

    /**
     * Get 发布名称 
     * @return ReleaseName 发布名称
     */
    public String getReleaseName() {
        return this.ReleaseName;
    }

    /**
     * Set 发布名称
     * @param ReleaseName 发布名称
     */
    public void setReleaseName(String ReleaseName) {
        this.ReleaseName = ReleaseName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 发布组 
     * @return Group 发布组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 发布组
     * @param Group 发布组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 内容 
     * @return Content 内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
     * @param Content 内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 描述 
     * @return Comment 描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 描述
     * @param Comment 描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 格式 
     * @return Format 格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 格式
     * @param Format 格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 创建者 
     * @return CreateBy 创建者
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set 创建者
     * @param CreateBy 创建者
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get 修改者 
     * @return ModifyBy 修改者
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set 修改者
     * @param ModifyBy 修改者
     */
    public void setModifyBy(String ModifyBy) {
        this.ModifyBy = ModifyBy;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public ConfigFileTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(ConfigFileTag [] Tags) {
        this.Tags = Tags;
    }

    public ConfigFilePublishInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFilePublishInfo(ConfigFilePublishInfo source) {
        if (source.ReleaseName != null) {
            this.ReleaseName = new String(source.ReleaseName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.ModifyBy != null) {
            this.ModifyBy = new String(source.ModifyBy);
        }
        if (source.Tags != null) {
            this.Tags = new ConfigFileTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ConfigFileTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseName", this.ReleaseName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

