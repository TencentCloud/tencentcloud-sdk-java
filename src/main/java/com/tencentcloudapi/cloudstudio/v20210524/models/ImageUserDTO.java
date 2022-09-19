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

public class ImageUserDTO extends AbstractModel{

    /**
    * 镜像模板ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 镜像模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Tag时间
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 中文描述
    */
    @SerializedName("DescriptionCN")
    @Expose
    private String DescriptionCN;

    /**
    * 图标地址
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 创建人
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 访问状态
    */
    @SerializedName("Visible")
    @Expose
    private String Visible;

    /**
    * 版本
    */
    @SerializedName("WorkspaceVersion")
    @Expose
    private Long WorkspaceVersion;

    /**
    * 分类
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
     * Get 镜像模板ID 
     * @return Id 镜像模板ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 镜像模板ID
     * @param Id 镜像模板ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 镜像模板名称 
     * @return Name 镜像模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 镜像模板名称
     * @param Name 镜像模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Tag时间 
     * @return Tag Tag时间
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag时间
     * @param Tag Tag时间
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
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
     * Get 中文描述 
     * @return DescriptionCN 中文描述
     */
    public String getDescriptionCN() {
        return this.DescriptionCN;
    }

    /**
     * Set 中文描述
     * @param DescriptionCN 中文描述
     */
    public void setDescriptionCN(String DescriptionCN) {
        this.DescriptionCN = DescriptionCN;
    }

    /**
     * Get 图标地址 
     * @return IconUrl 图标地址
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 图标地址
     * @param IconUrl 图标地址
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 创建人 
     * @return Author 创建人
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 创建人
     * @param Author 创建人
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 访问状态 
     * @return Visible 访问状态
     */
    public String getVisible() {
        return this.Visible;
    }

    /**
     * Set 访问状态
     * @param Visible 访问状态
     */
    public void setVisible(String Visible) {
        this.Visible = Visible;
    }

    /**
     * Get 版本 
     * @return WorkspaceVersion 版本
     */
    public Long getWorkspaceVersion() {
        return this.WorkspaceVersion;
    }

    /**
     * Set 版本
     * @param WorkspaceVersion 版本
     */
    public void setWorkspaceVersion(Long WorkspaceVersion) {
        this.WorkspaceVersion = WorkspaceVersion;
    }

    /**
     * Get 分类 
     * @return Sort 分类
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 分类
     * @param Sort 分类
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    public ImageUserDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageUserDTO(ImageUserDTO source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DescriptionCN != null) {
            this.DescriptionCN = new String(source.DescriptionCN);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.Visible != null) {
            this.Visible = new String(source.Visible);
        }
        if (source.WorkspaceVersion != null) {
            this.WorkspaceVersion = new Long(source.WorkspaceVersion);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DescriptionCN", this.DescriptionCN);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Visible", this.Visible);
        this.setParamSimple(map, prefix + "WorkspaceVersion", this.WorkspaceVersion);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

