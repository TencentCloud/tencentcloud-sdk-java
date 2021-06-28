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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRuntimeDeployedInstancesMCRequest extends AbstractModel{

    /**
    * 运行时id
    */
    @SerializedName("RuntimeId")
    @Expose
    private Long RuntimeId;

    /**
    * 最大请求数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 请求偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序类型：1:创建时间排序, 2:更新时间排序（默认）
    */
    @SerializedName("SortType")
    @Expose
    private Long SortType;

    /**
    * 排序方式：asc，desc（默认）
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 运行时地域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 运行时id 
     * @return RuntimeId 运行时id
     */
    public Long getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 运行时id
     * @param RuntimeId 运行时id
     */
    public void setRuntimeId(Long RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get 最大请求数量 
     * @return Limit 最大请求数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大请求数量
     * @param Limit 最大请求数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 请求偏移量 
     * @return Offset 请求偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 请求偏移量
     * @param Offset 请求偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序类型：1:创建时间排序, 2:更新时间排序（默认） 
     * @return SortType 排序类型：1:创建时间排序, 2:更新时间排序（默认）
     */
    public Long getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序类型：1:创建时间排序, 2:更新时间排序（默认）
     * @param SortType 排序类型：1:创建时间排序, 2:更新时间排序（默认）
     */
    public void setSortType(Long SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 排序方式：asc，desc（默认） 
     * @return Sort 排序方式：asc，desc（默认）
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式：asc，desc（默认）
     * @param Sort 排序方式：asc，desc（默认）
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 运行时地域 
     * @return Zone 运行时地域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 运行时地域
     * @param Zone 运行时地域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public ListRuntimeDeployedInstancesMCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRuntimeDeployedInstancesMCRequest(ListRuntimeDeployedInstancesMCRequest source) {
        if (source.RuntimeId != null) {
            this.RuntimeId = new Long(source.RuntimeId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortType != null) {
            this.SortType = new Long(source.SortType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeId", this.RuntimeId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

