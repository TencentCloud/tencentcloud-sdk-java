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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostsCertificateRequest extends AbstractModel{

    /**
    * Zone ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页查询偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认为 100，最大可设置为 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询条件过滤器
    */
    @SerializedName("Filters")
    @Expose
    private CertFilter [] Filters;

    /**
    * 排序方式
    */
    @SerializedName("Sort")
    @Expose
    private CertSort Sort;

    /**
     * Get Zone ID 
     * @return ZoneId Zone ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID
     * @param ZoneId Zone ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页查询偏移量，默认为 0 
     * @return Offset 分页查询偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0
     * @param Offset 分页查询偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认为 100，最大可设置为 1000 
     * @return Limit 分页查询限制数目，默认为 100，最大可设置为 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认为 100，最大可设置为 1000
     * @param Limit 分页查询限制数目，默认为 100，最大可设置为 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询条件过滤器 
     * @return Filters 查询条件过滤器
     */
    public CertFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件过滤器
     * @param Filters 查询条件过滤器
     */
    public void setFilters(CertFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式 
     * @return Sort 排序方式
     */
    public CertSort getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式
     * @param Sort 排序方式
     */
    public void setSort(CertSort Sort) {
        this.Sort = Sort;
    }

    public DescribeHostsCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostsCertificateRequest(DescribeHostsCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new CertFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CertFilter(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new CertSort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

