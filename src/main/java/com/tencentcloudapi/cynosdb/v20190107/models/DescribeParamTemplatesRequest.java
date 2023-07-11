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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParamTemplatesRequest extends AbstractModel{

    /**
    * 数据库引擎版本号
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * 模板名称
    */
    @SerializedName("TemplateNames")
    @Expose
    private String [] TemplateNames;

    /**
    * 模板ID
    */
    @SerializedName("TemplateIds")
    @Expose
    private Long [] TemplateIds;

    /**
    * 数据库类型，可选值：NORMAL，SERVERLESS
    */
    @SerializedName("DbModes")
    @Expose
    private String [] DbModes;

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询的模板对应的产品类型
    */
    @SerializedName("Products")
    @Expose
    private String [] Products;

    /**
    * 模板类型
    */
    @SerializedName("TemplateTypes")
    @Expose
    private String [] TemplateTypes;

    /**
    * 版本类型
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * 返回结果的排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式（asc、desc）
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 数据库引擎版本号 
     * @return EngineVersions 数据库引擎版本号
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set 数据库引擎版本号
     * @param EngineVersions 数据库引擎版本号
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get 模板名称 
     * @return TemplateNames 模板名称
     */
    public String [] getTemplateNames() {
        return this.TemplateNames;
    }

    /**
     * Set 模板名称
     * @param TemplateNames 模板名称
     */
    public void setTemplateNames(String [] TemplateNames) {
        this.TemplateNames = TemplateNames;
    }

    /**
     * Get 模板ID 
     * @return TemplateIds 模板ID
     */
    public Long [] getTemplateIds() {
        return this.TemplateIds;
    }

    /**
     * Set 模板ID
     * @param TemplateIds 模板ID
     */
    public void setTemplateIds(Long [] TemplateIds) {
        this.TemplateIds = TemplateIds;
    }

    /**
     * Get 数据库类型，可选值：NORMAL，SERVERLESS 
     * @return DbModes 数据库类型，可选值：NORMAL，SERVERLESS
     */
    public String [] getDbModes() {
        return this.DbModes;
    }

    /**
     * Set 数据库类型，可选值：NORMAL，SERVERLESS
     * @param DbModes 数据库类型，可选值：NORMAL，SERVERLESS
     */
    public void setDbModes(String [] DbModes) {
        this.DbModes = DbModes;
    }

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询限制条数 
     * @return Limit 查询限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询限制条数
     * @param Limit 查询限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询的模板对应的产品类型 
     * @return Products 查询的模板对应的产品类型
     */
    public String [] getProducts() {
        return this.Products;
    }

    /**
     * Set 查询的模板对应的产品类型
     * @param Products 查询的模板对应的产品类型
     */
    public void setProducts(String [] Products) {
        this.Products = Products;
    }

    /**
     * Get 模板类型 
     * @return TemplateTypes 模板类型
     */
    public String [] getTemplateTypes() {
        return this.TemplateTypes;
    }

    /**
     * Set 模板类型
     * @param TemplateTypes 模板类型
     */
    public void setTemplateTypes(String [] TemplateTypes) {
        this.TemplateTypes = TemplateTypes;
    }

    /**
     * Get 版本类型 
     * @return EngineTypes 版本类型
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set 版本类型
     * @param EngineTypes 版本类型
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get 返回结果的排序字段 
     * @return OrderBy 返回结果的排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 返回结果的排序字段
     * @param OrderBy 返回结果的排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式（asc、desc） 
     * @return OrderDirection 排序方式（asc、desc）
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方式（asc、desc）
     * @param OrderDirection 排序方式（asc、desc）
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeParamTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParamTemplatesRequest(DescribeParamTemplatesRequest source) {
        if (source.EngineVersions != null) {
            this.EngineVersions = new String[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new String(source.EngineVersions[i]);
            }
        }
        if (source.TemplateNames != null) {
            this.TemplateNames = new String[source.TemplateNames.length];
            for (int i = 0; i < source.TemplateNames.length; i++) {
                this.TemplateNames[i] = new String(source.TemplateNames[i]);
            }
        }
        if (source.TemplateIds != null) {
            this.TemplateIds = new Long[source.TemplateIds.length];
            for (int i = 0; i < source.TemplateIds.length; i++) {
                this.TemplateIds[i] = new Long(source.TemplateIds[i]);
            }
        }
        if (source.DbModes != null) {
            this.DbModes = new String[source.DbModes.length];
            for (int i = 0; i < source.DbModes.length; i++) {
                this.DbModes[i] = new String(source.DbModes[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Products != null) {
            this.Products = new String[source.Products.length];
            for (int i = 0; i < source.Products.length; i++) {
                this.Products[i] = new String(source.Products[i]);
            }
        }
        if (source.TemplateTypes != null) {
            this.TemplateTypes = new String[source.TemplateTypes.length];
            for (int i = 0; i < source.TemplateTypes.length; i++) {
                this.TemplateTypes[i] = new String(source.TemplateTypes[i]);
            }
        }
        if (source.EngineTypes != null) {
            this.EngineTypes = new String[source.EngineTypes.length];
            for (int i = 0; i < source.EngineTypes.length; i++) {
                this.EngineTypes[i] = new String(source.EngineTypes[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EngineVersions.", this.EngineVersions);
        this.setParamArraySimple(map, prefix + "TemplateNames.", this.TemplateNames);
        this.setParamArraySimple(map, prefix + "TemplateIds.", this.TemplateIds);
        this.setParamArraySimple(map, prefix + "DbModes.", this.DbModes);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Products.", this.Products);
        this.setParamArraySimple(map, prefix + "TemplateTypes.", this.TemplateTypes);
        this.setParamArraySimple(map, prefix + "EngineTypes.", this.EngineTypes);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

