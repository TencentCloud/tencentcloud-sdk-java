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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExampleEntity extends AbstractModel {

    /**
    * <p>ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>案例ID</p>
    */
    @SerializedName("ExampleId")
    @Expose
    private String ExampleId;

    /**
    * <p>标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>README</p>
    */
    @SerializedName("Readme")
    @Expose
    private String Readme;

    /**
    * <p>案例归档URL</p>
    */
    @SerializedName("CodeArchiveUrl")
    @Expose
    private String CodeArchiveUrl;

    /**
    * <p>图片URL</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>实验室镜像地址</p>
    */
    @SerializedName("LabImage")
    @Expose
    private String LabImage;

    /**
    * <p>资源配置</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>分类</p>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>案例热度</p>
    */
    @SerializedName("Popularity")
    @Expose
    private Long Popularity;

    /**
    * <p>难度</p>
    */
    @SerializedName("Difficulty")
    @Expose
    private String Difficulty;

    /**
    * <p>预估时间（分钟）</p>
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * <p>排序</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private Long SortOrder;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Boolean IsEnabled;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>是否删除</p>
    */
    @SerializedName("Deleted")
    @Expose
    private Long Deleted;

    /**
     * Get <p>ID</p> 
     * @return Id <p>ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>ID</p>
     * @param Id <p>ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>案例ID</p> 
     * @return ExampleId <p>案例ID</p>
     */
    public String getExampleId() {
        return this.ExampleId;
    }

    /**
     * Set <p>案例ID</p>
     * @param ExampleId <p>案例ID</p>
     */
    public void setExampleId(String ExampleId) {
        this.ExampleId = ExampleId;
    }

    /**
     * Get <p>标题</p> 
     * @return Title <p>标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>标题</p>
     * @param Title <p>标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>README</p> 
     * @return Readme <p>README</p>
     */
    public String getReadme() {
        return this.Readme;
    }

    /**
     * Set <p>README</p>
     * @param Readme <p>README</p>
     */
    public void setReadme(String Readme) {
        this.Readme = Readme;
    }

    /**
     * Get <p>案例归档URL</p> 
     * @return CodeArchiveUrl <p>案例归档URL</p>
     */
    public String getCodeArchiveUrl() {
        return this.CodeArchiveUrl;
    }

    /**
     * Set <p>案例归档URL</p>
     * @param CodeArchiveUrl <p>案例归档URL</p>
     */
    public void setCodeArchiveUrl(String CodeArchiveUrl) {
        this.CodeArchiveUrl = CodeArchiveUrl;
    }

    /**
     * Get <p>图片URL</p> 
     * @return Image <p>图片URL</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>图片URL</p>
     * @param Image <p>图片URL</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>实验室镜像地址</p> 
     * @return LabImage <p>实验室镜像地址</p>
     */
    public String getLabImage() {
        return this.LabImage;
    }

    /**
     * Set <p>实验室镜像地址</p>
     * @param LabImage <p>实验室镜像地址</p>
     */
    public void setLabImage(String LabImage) {
        this.LabImage = LabImage;
    }

    /**
     * Get <p>资源配置</p> 
     * @return ResourceConfig <p>资源配置</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置</p>
     * @param ResourceConfig <p>资源配置</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>分类</p> 
     * @return Category <p>分类</p>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>分类</p>
     * @param Category <p>分类</p>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>案例热度</p> 
     * @return Popularity <p>案例热度</p>
     */
    public Long getPopularity() {
        return this.Popularity;
    }

    /**
     * Set <p>案例热度</p>
     * @param Popularity <p>案例热度</p>
     */
    public void setPopularity(Long Popularity) {
        this.Popularity = Popularity;
    }

    /**
     * Get <p>难度</p> 
     * @return Difficulty <p>难度</p>
     */
    public String getDifficulty() {
        return this.Difficulty;
    }

    /**
     * Set <p>难度</p>
     * @param Difficulty <p>难度</p>
     */
    public void setDifficulty(String Difficulty) {
        this.Difficulty = Difficulty;
    }

    /**
     * Get <p>预估时间（分钟）</p> 
     * @return EstimatedTime <p>预估时间（分钟）</p>
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set <p>预估时间（分钟）</p>
     * @param EstimatedTime <p>预估时间（分钟）</p>
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
    }

    /**
     * Get <p>排序</p> 
     * @return SortOrder <p>排序</p>
     */
    public Long getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序</p>
     * @param SortOrder <p>排序</p>
     */
    public void setSortOrder(Long SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get <p>是否启用</p> 
     * @return IsEnabled <p>是否启用</p>
     */
    public Boolean getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param IsEnabled <p>是否启用</p>
     */
    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否删除</p> 
     * @return Deleted <p>是否删除</p>
     */
    public Long getDeleted() {
        return this.Deleted;
    }

    /**
     * Set <p>是否删除</p>
     * @param Deleted <p>是否删除</p>
     */
    public void setDeleted(Long Deleted) {
        this.Deleted = Deleted;
    }

    public ExampleEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExampleEntity(ExampleEntity source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ExampleId != null) {
            this.ExampleId = new String(source.ExampleId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Readme != null) {
            this.Readme = new String(source.Readme);
        }
        if (source.CodeArchiveUrl != null) {
            this.CodeArchiveUrl = new String(source.CodeArchiveUrl);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.LabImage != null) {
            this.LabImage = new String(source.LabImage);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Popularity != null) {
            this.Popularity = new Long(source.Popularity);
        }
        if (source.Difficulty != null) {
            this.Difficulty = new String(source.Difficulty);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new Long(source.SortOrder);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Boolean(source.IsEnabled);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Deleted != null) {
            this.Deleted = new Long(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ExampleId", this.ExampleId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Readme", this.Readme);
        this.setParamSimple(map, prefix + "CodeArchiveUrl", this.CodeArchiveUrl);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "LabImage", this.LabImage);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Popularity", this.Popularity);
        this.setParamSimple(map, prefix + "Difficulty", this.Difficulty);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

