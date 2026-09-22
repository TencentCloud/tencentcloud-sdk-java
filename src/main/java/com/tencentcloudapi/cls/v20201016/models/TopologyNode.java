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

public class TopologyNode extends AbstractModel {

    /**
    * <p>实体 ID</p>
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * <p>实体名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实体所属域</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>实体所在产品</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>实体类型</p>
    */
    @SerializedName("EntityClassName")
    @Expose
    private String EntityClassName;

    /**
    * <p>距离中心节点深度</p>
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

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
     * Get <p>实体名称</p> 
     * @return Name <p>实体名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实体名称</p>
     * @param Name <p>实体名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实体所属域</p> 
     * @return Domain <p>实体所属域</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>实体所属域</p>
     * @param Domain <p>实体所属域</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>实体所在产品</p> 
     * @return Product <p>实体所在产品</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>实体所在产品</p>
     * @param Product <p>实体所在产品</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>实体类型</p> 
     * @return EntityClassName <p>实体类型</p>
     */
    public String getEntityClassName() {
        return this.EntityClassName;
    }

    /**
     * Set <p>实体类型</p>
     * @param EntityClassName <p>实体类型</p>
     */
    public void setEntityClassName(String EntityClassName) {
        this.EntityClassName = EntityClassName;
    }

    /**
     * Get <p>距离中心节点深度</p> 
     * @return Depth <p>距离中心节点深度</p>
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set <p>距离中心节点深度</p>
     * @param Depth <p>距离中心节点深度</p>
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    public TopologyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopologyNode(TopologyNode source) {
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EntityClassName != null) {
            this.EntityClassName = new String(source.EntityClassName);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EntityClassName", this.EntityClassName);
        this.setParamSimple(map, prefix + "Depth", this.Depth);

    }
}

