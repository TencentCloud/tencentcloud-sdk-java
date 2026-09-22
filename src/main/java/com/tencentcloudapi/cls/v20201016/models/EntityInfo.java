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

public class EntityInfo extends AbstractModel {

    /**
    * <p>实体 ID</p>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>实体所属域</p><p>默认值：实体所在域，如TC，App</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>实体所属产品</p><p>参数格式：实体归属的产品，如CDB, Application</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>实体名称</p>
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * <p>实体类名称</p><p>参数格式：TC.CDB.Instance</p>
    */
    @SerializedName("EntityClassName")
    @Expose
    private String EntityClassName;

    /**
    * <p>动态属性（base 在前 + 字典序）</p>
    */
    @SerializedName("Attributes")
    @Expose
    private EntityAttribute [] Attributes;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>关联日志主题</p>
    */
    @SerializedName("RelatedLogTopics")
    @Expose
    private RelatedTopicItem [] RelatedLogTopics;

    /**
    * <p> 实体资源ID </p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>实体 ID</p> 
     * @return EntityId <p>实体 ID</p>
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set <p>实体 ID</p>
     * @param EntityId <p>实体 ID</p>
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get <p>实体所属域</p><p>默认值：实体所在域，如TC，App</p> 
     * @return Domain <p>实体所属域</p><p>默认值：实体所在域，如TC，App</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>实体所属域</p><p>默认值：实体所在域，如TC，App</p>
     * @param Domain <p>实体所属域</p><p>默认值：实体所在域，如TC，App</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>实体所属产品</p><p>参数格式：实体归属的产品，如CDB, Application</p> 
     * @return Product <p>实体所属产品</p><p>参数格式：实体归属的产品，如CDB, Application</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>实体所属产品</p><p>参数格式：实体归属的产品，如CDB, Application</p>
     * @param Product <p>实体所属产品</p><p>参数格式：实体归属的产品，如CDB, Application</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>实体名称</p> 
     * @return EntityName <p>实体名称</p>
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set <p>实体名称</p>
     * @param EntityName <p>实体名称</p>
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get <p>实体类名称</p><p>参数格式：TC.CDB.Instance</p> 
     * @return EntityClassName <p>实体类名称</p><p>参数格式：TC.CDB.Instance</p>
     */
    public String getEntityClassName() {
        return this.EntityClassName;
    }

    /**
     * Set <p>实体类名称</p><p>参数格式：TC.CDB.Instance</p>
     * @param EntityClassName <p>实体类名称</p><p>参数格式：TC.CDB.Instance</p>
     */
    public void setEntityClassName(String EntityClassName) {
        this.EntityClassName = EntityClassName;
    }

    /**
     * Get <p>动态属性（base 在前 + 字典序）</p> 
     * @return Attributes <p>动态属性（base 在前 + 字典序）</p>
     */
    public EntityAttribute [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set <p>动态属性（base 在前 + 字典序）</p>
     * @param Attributes <p>动态属性（base 在前 + 字典序）</p>
     */
    public void setAttributes(EntityAttribute [] Attributes) {
        this.Attributes = Attributes;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>关联日志主题</p> 
     * @return RelatedLogTopics <p>关联日志主题</p>
     */
    public RelatedTopicItem [] getRelatedLogTopics() {
        return this.RelatedLogTopics;
    }

    /**
     * Set <p>关联日志主题</p>
     * @param RelatedLogTopics <p>关联日志主题</p>
     */
    public void setRelatedLogTopics(RelatedTopicItem [] RelatedLogTopics) {
        this.RelatedLogTopics = RelatedLogTopics;
    }

    /**
     * Get <p> 实体资源ID </p> 
     * @return ResourceId <p> 实体资源ID </p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p> 实体资源ID </p>
     * @param ResourceId <p> 实体资源ID </p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public EntityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EntityInfo(EntityInfo source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.EntityClassName != null) {
            this.EntityClassName = new String(source.EntityClassName);
        }
        if (source.Attributes != null) {
            this.Attributes = new EntityAttribute[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new EntityAttribute(source.Attributes[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RelatedLogTopics != null) {
            this.RelatedLogTopics = new RelatedTopicItem[source.RelatedLogTopics.length];
            for (int i = 0; i < source.RelatedLogTopics.length; i++) {
                this.RelatedLogTopics[i] = new RelatedTopicItem(source.RelatedLogTopics[i]);
            }
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamSimple(map, prefix + "EntityClassName", this.EntityClassName);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "RelatedLogTopics.", this.RelatedLogTopics);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

