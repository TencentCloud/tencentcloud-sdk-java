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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListApplicationAuthorizationsRequest extends AbstractModel{

    /**
    * 查询类型，包含用户（User）、用户组（UserGroup）、组织机构（OrgNode）。
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * 查询条件，支持多搜索条件组合、多数据范围匹配的搜索。同时支持查询信息内容全匹配、部分匹配、范围匹配等多种查询方式，具体查询方式为：双引号（""）表示全匹配、以星号（* ) 结尾表示字段部分匹配。如果该字段为空，则默认查全量表。
    */
    @SerializedName("SearchCondition")
    @Expose
    private AuthorizationInfoSearchCriteria SearchCondition;

    /**
    * 排序条件集合。可排序的属性支持：上次修改时间（lastModifiedDate）。如果该字段为空，则默认按照应用名称正向排序。
    */
    @SerializedName("Sort")
    @Expose
    private SortCondition Sort;

    /**
    * 分页偏移量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页读取数量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 查询类型，包含用户（User）、用户组（UserGroup）、组织机构（OrgNode）。 
     * @return EntityType 查询类型，包含用户（User）、用户组（UserGroup）、组织机构（OrgNode）。
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 查询类型，包含用户（User）、用户组（UserGroup）、组织机构（OrgNode）。
     * @param EntityType 查询类型，包含用户（User）、用户组（UserGroup）、组织机构（OrgNode）。
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get 查询条件，支持多搜索条件组合、多数据范围匹配的搜索。同时支持查询信息内容全匹配、部分匹配、范围匹配等多种查询方式，具体查询方式为：双引号（""）表示全匹配、以星号（* ) 结尾表示字段部分匹配。如果该字段为空，则默认查全量表。 
     * @return SearchCondition 查询条件，支持多搜索条件组合、多数据范围匹配的搜索。同时支持查询信息内容全匹配、部分匹配、范围匹配等多种查询方式，具体查询方式为：双引号（""）表示全匹配、以星号（* ) 结尾表示字段部分匹配。如果该字段为空，则默认查全量表。
     */
    public AuthorizationInfoSearchCriteria getSearchCondition() {
        return this.SearchCondition;
    }

    /**
     * Set 查询条件，支持多搜索条件组合、多数据范围匹配的搜索。同时支持查询信息内容全匹配、部分匹配、范围匹配等多种查询方式，具体查询方式为：双引号（""）表示全匹配、以星号（* ) 结尾表示字段部分匹配。如果该字段为空，则默认查全量表。
     * @param SearchCondition 查询条件，支持多搜索条件组合、多数据范围匹配的搜索。同时支持查询信息内容全匹配、部分匹配、范围匹配等多种查询方式，具体查询方式为：双引号（""）表示全匹配、以星号（* ) 结尾表示字段部分匹配。如果该字段为空，则默认查全量表。
     */
    public void setSearchCondition(AuthorizationInfoSearchCriteria SearchCondition) {
        this.SearchCondition = SearchCondition;
    }

    /**
     * Get 排序条件集合。可排序的属性支持：上次修改时间（lastModifiedDate）。如果该字段为空，则默认按照应用名称正向排序。 
     * @return Sort 排序条件集合。可排序的属性支持：上次修改时间（lastModifiedDate）。如果该字段为空，则默认按照应用名称正向排序。
     */
    public SortCondition getSort() {
        return this.Sort;
    }

    /**
     * Set 排序条件集合。可排序的属性支持：上次修改时间（lastModifiedDate）。如果该字段为空，则默认按照应用名称正向排序。
     * @param Sort 排序条件集合。可排序的属性支持：上次修改时间（lastModifiedDate）。如果该字段为空，则默认按照应用名称正向排序。
     */
    public void setSort(SortCondition Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 分页偏移量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。 
     * @return Offset 分页偏移量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
     * @param Offset 分页偏移量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页读取数量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。 
     * @return Limit 分页读取数量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页读取数量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
     * @param Limit 分页读取数量。Offset 和 Limit 两个字段需配合使用，即其中一个指定了，另一个必须指定。 如果不指定以上参数，则表示不进行分页查询。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListApplicationAuthorizationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListApplicationAuthorizationsRequest(ListApplicationAuthorizationsRequest source) {
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.SearchCondition != null) {
            this.SearchCondition = new AuthorizationInfoSearchCriteria(source.SearchCondition);
        }
        if (source.Sort != null) {
            this.Sort = new SortCondition(source.Sort);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamObj(map, prefix + "SearchCondition.", this.SearchCondition);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

