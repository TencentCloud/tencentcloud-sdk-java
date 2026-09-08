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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGraphDetailInfo extends AbstractModel {

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <p>工作区名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>工作区描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>工作区状态</p><p>枚举值：</p><ul><li>0： 初始化中</li><li>1： 成功</li><li>2： 失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>已接入产品数量</p>
    */
    @SerializedName("AccessCount")
    @Expose
    private Long AccessCount;

    /**
    * <p>接入的产品列表</p>
    */
    @SerializedName("Products")
    @Expose
    private String [] Products;

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
    * <p>关联的日志集</p>
    */
    @SerializedName("RelationLogset")
    @Expose
    private RelationLogset RelationLogset;

    /**
    * <p>关联的topic</p>
    */
    @SerializedName("RelationTopics")
    @Expose
    private RelationTopic [] RelationTopics;

    /**
    * <p>工作区绑定的标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>资源图谱id</p> 
     * @return ResourceGraphId <p>资源图谱id</p>
     */
    public String getResourceGraphId() {
        return this.ResourceGraphId;
    }

    /**
     * Set <p>资源图谱id</p>
     * @param ResourceGraphId <p>资源图谱id</p>
     */
    public void setResourceGraphId(String ResourceGraphId) {
        this.ResourceGraphId = ResourceGraphId;
    }

    /**
     * Get <p>工作区名称</p> 
     * @return Name <p>工作区名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>工作区名称</p>
     * @param Name <p>工作区名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>工作区描述</p> 
     * @return Description <p>工作区描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工作区描述</p>
     * @param Description <p>工作区描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>工作区状态</p><p>枚举值：</p><ul><li>0： 初始化中</li><li>1： 成功</li><li>2： 失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul> 
     * @return Status <p>工作区状态</p><p>枚举值：</p><ul><li>0： 初始化中</li><li>1： 成功</li><li>2： 失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>工作区状态</p><p>枚举值：</p><ul><li>0： 初始化中</li><li>1： 成功</li><li>2： 失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
     * @param Status <p>工作区状态</p><p>枚举值：</p><ul><li>0： 初始化中</li><li>1： 成功</li><li>2： 失败</li><li>3： 删除中</li><li>4： 已删除</li><li>5： 删除失败</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>已接入产品数量</p> 
     * @return AccessCount <p>已接入产品数量</p>
     */
    public Long getAccessCount() {
        return this.AccessCount;
    }

    /**
     * Set <p>已接入产品数量</p>
     * @param AccessCount <p>已接入产品数量</p>
     */
    public void setAccessCount(Long AccessCount) {
        this.AccessCount = AccessCount;
    }

    /**
     * Get <p>接入的产品列表</p> 
     * @return Products <p>接入的产品列表</p>
     */
    public String [] getProducts() {
        return this.Products;
    }

    /**
     * Set <p>接入的产品列表</p>
     * @param Products <p>接入的产品列表</p>
     */
    public void setProducts(String [] Products) {
        this.Products = Products;
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
     * Get <p>关联的日志集</p> 
     * @return RelationLogset <p>关联的日志集</p>
     */
    public RelationLogset getRelationLogset() {
        return this.RelationLogset;
    }

    /**
     * Set <p>关联的日志集</p>
     * @param RelationLogset <p>关联的日志集</p>
     */
    public void setRelationLogset(RelationLogset RelationLogset) {
        this.RelationLogset = RelationLogset;
    }

    /**
     * Get <p>关联的topic</p> 
     * @return RelationTopics <p>关联的topic</p>
     */
    public RelationTopic [] getRelationTopics() {
        return this.RelationTopics;
    }

    /**
     * Set <p>关联的topic</p>
     * @param RelationTopics <p>关联的topic</p>
     */
    public void setRelationTopics(RelationTopic [] RelationTopics) {
        this.RelationTopics = RelationTopics;
    }

    /**
     * Get <p>工作区绑定的标签信息</p> 
     * @return Tags <p>工作区绑定的标签信息</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>工作区绑定的标签信息</p>
     * @param Tags <p>工作区绑定的标签信息</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ResourceGraphDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGraphDetailInfo(ResourceGraphDetailInfo source) {
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AccessCount != null) {
            this.AccessCount = new Long(source.AccessCount);
        }
        if (source.Products != null) {
            this.Products = new String[source.Products.length];
            for (int i = 0; i < source.Products.length; i++) {
                this.Products[i] = new String(source.Products[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.RelationLogset != null) {
            this.RelationLogset = new RelationLogset(source.RelationLogset);
        }
        if (source.RelationTopics != null) {
            this.RelationTopics = new RelationTopic[source.RelationTopics.length];
            for (int i = 0; i < source.RelationTopics.length; i++) {
                this.RelationTopics[i] = new RelationTopic(source.RelationTopics[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AccessCount", this.AccessCount);
        this.setParamArraySimple(map, prefix + "Products.", this.Products);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "RelationLogset.", this.RelationLogset);
        this.setParamArrayObj(map, prefix + "RelationTopics.", this.RelationTopics);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

