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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPACategoriesRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 数据分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分类名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件（Id:分类id,Name:分类名称）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 数据分类ID 
     * @return CategoryId 数据分类ID
     * @deprecated
     */
    @Deprecated
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 数据分类ID
     * @param CategoryId 数据分类ID
     * @deprecated
     */
    @Deprecated
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分类名称 
     * @return Name 敏感数据分类名称
     * @deprecated
     */
    @Deprecated
    public String getName() {
        return this.Name;
    }

    /**
     * Set 敏感数据分类名称
     * @param Name 敏感数据分类名称
     * @deprecated
     */
    @Deprecated
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 偏移量，默认值为0 
     * @return Offset 偏移量，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0
     * @param Offset 偏移量，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据 
     * @return Limit 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
     * @param Limit 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件（Id:分类id,Name:分类名称） 
     * @return Filters 过滤条件（Id:分类id,Name:分类名称）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件（Id:分类id,Name:分类名称）
     * @param Filters 过滤条件（Id:分类id,Name:分类名称）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 关键字 
     * @return Keyword 关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字
     * @param Keyword 关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeDSPACategoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPACategoriesRequest(DescribeDSPACategoriesRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

