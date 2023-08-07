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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRolesRequest extends AbstractModel{

    /**
    * 列举的数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 列举的偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按照arn模糊列举
    */
    @SerializedName("Fuzzy")
    @Expose
    private String Fuzzy;

    /**
    * 返回结果按照该字段排序
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 正序或者倒序，例如：desc
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
     * Get 列举的数量限制 
     * @return Limit 列举的数量限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 列举的数量限制
     * @param Limit 列举的数量限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 列举的偏移位置 
     * @return Offset 列举的偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 列举的偏移位置
     * @param Offset 列举的偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按照arn模糊列举 
     * @return Fuzzy 按照arn模糊列举
     */
    public String getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set 按照arn模糊列举
     * @param Fuzzy 按照arn模糊列举
     */
    public void setFuzzy(String Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    /**
     * Get 返回结果按照该字段排序 
     * @return SortBy 返回结果按照该字段排序
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 返回结果按照该字段排序
     * @param SortBy 返回结果按照该字段排序
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 正序或者倒序，例如：desc 
     * @return Sorting 正序或者倒序，例如：desc
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set 正序或者倒序，例如：desc
     * @param Sorting 正序或者倒序，例如：desc
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    public DescribeUserRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRolesRequest(DescribeUserRolesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new String(source.Fuzzy);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);

    }
}

