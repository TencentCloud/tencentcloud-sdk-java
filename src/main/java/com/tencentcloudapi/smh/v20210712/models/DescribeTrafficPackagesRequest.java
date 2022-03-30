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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficPackagesRequest extends AbstractModel{

    /**
    * 按照一个或者多个资源 ID 查询，每次请求的上限为 100 个。
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 页码，整型，配合 PageSize 使用，默认值为 1。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 对指定列进行排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 来源类型筛选
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 按照一个或者多个资源 ID 查询，每次请求的上限为 100 个。 
     * @return ResourceIds 按照一个或者多个资源 ID 查询，每次请求的上限为 100 个。
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 按照一个或者多个资源 ID 查询，每次请求的上限为 100 个。
     * @param ResourceIds 按照一个或者多个资源 ID 查询，每次请求的上限为 100 个。
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 页码，整型，配合 PageSize 使用，默认值为 1。 
     * @return PageNumber 页码，整型，配合 PageSize 使用，默认值为 1。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，整型，配合 PageSize 使用，默认值为 1。
     * @param PageNumber 页码，整型，配合 PageSize 使用，默认值为 1。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。 
     * @return PageSize 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     * @param PageSize 每页数目，整型，配合 PageNumber 使用，默认值为 20，最大值为 100。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 对指定列进行排序 
     * @return OrderBy 对指定列进行排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 对指定列进行排序
     * @param OrderBy 对指定列进行排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式 
     * @return OrderByType 排序方式
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式
     * @param OrderByType 排序方式
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 来源类型筛选 
     * @return Type 来源类型筛选
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 来源类型筛选
     * @param Type 来源类型筛选
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficPackagesRequest(DescribeTrafficPackagesRequest source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

