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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRequest extends AbstractModel{

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 分页数据
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * 查询条件，根据propertycode和propertykey
    */
    @SerializedName("Filters")
    @Expose
    private QueryUserFilter [] Filters;

    /**
    * 是否返回明文
    */
    @SerializedName("Original")
    @Expose
    private Boolean Original;

    /**
    * 排序设置
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get 用户目录ID 
     * @return UserStoreId 用户目录ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录ID
     * @param UserStoreId 用户目录ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 分页数据 
     * @return Pageable 分页数据
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set 分页数据
     * @param Pageable 分页数据
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get 查询条件，根据propertycode和propertykey 
     * @return Filters 查询条件，根据propertycode和propertykey
     */
    public QueryUserFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件，根据propertycode和propertykey
     * @param Filters 查询条件，根据propertycode和propertykey
     */
    public void setFilters(QueryUserFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否返回明文 
     * @return Original 是否返回明文
     */
    public Boolean getOriginal() {
        return this.Original;
    }

    /**
     * Set 是否返回明文
     * @param Original 是否返回明文
     */
    public void setOriginal(Boolean Original) {
        this.Original = Original;
    }

    /**
     * Get 排序设置 
     * @return Sort 排序设置
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set 排序设置
     * @param Sort 排序设置
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    public DescribeUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRequest(DescribeUserRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
        }
        if (source.Filters != null) {
            this.Filters = new QueryUserFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryUserFilter(source.Filters[i]);
            }
        }
        if (source.Original != null) {
            this.Original = new Boolean(source.Original);
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Original", this.Original);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

